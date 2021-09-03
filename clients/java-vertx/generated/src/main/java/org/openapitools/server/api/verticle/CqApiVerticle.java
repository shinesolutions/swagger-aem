package org.openapitools.server.api.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import org.openapitools.server.api.MainApiException;

import java.util.List;
import java.util.Map;

public class CqApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(CqApiVerticle.class);
    
    static final String GETLOGINPAGE_SERVICE_ID = "getLoginPage";
    static final String POSTCQACTIONS_SERVICE_ID = "postCqActions";
    
    final CqApi service;

    public CqApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.CqApiImpl");
            service = (CqApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("CqApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for getLoginPage
        vertx.eventBus().<JsonObject> consumer(GETLOGINPAGE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getLoginPage";
                service.getLoginPage(result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getLoginPage");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getLoginPage", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for postCqActions
        vertx.eventBus().<JsonObject> consumer(POSTCQACTIONS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "postCqActions";
                String authorizableIdParam = message.body().getString("authorizableId");
                if(authorizableIdParam == null) {
                    manageError(message, new MainApiException(400, "authorizableId is required"), serviceId);
                    return;
                }
                String authorizableId = authorizableIdParam;
                String changelogParam = message.body().getString("changelog");
                if(changelogParam == null) {
                    manageError(message, new MainApiException(400, "changelog is required"), serviceId);
                    return;
                }
                String changelog = changelogParam;
                service.postCqActions(authorizableId, changelog, result -> {
                    if (result.succeeded())
                        message.reply(null);
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "postCqActions");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("postCqActions", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
    }
    
    private void manageError(Message<JsonObject> message, Throwable cause, String serviceName) {
        int code = MainApiException.INTERNAL_SERVER_ERROR.getStatusCode();
        String statusMessage = MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage();
        if (cause instanceof MainApiException) {
            code = ((MainApiException)cause).getStatusCode();
            statusMessage = ((MainApiException)cause).getStatusMessage();
        } else {
            logUnexpectedError(serviceName, cause); 
        }
            
        message.fail(code, statusMessage);
    }
    
    private void logUnexpectedError(String serviceName, Throwable cause) {
        LOGGER.error("Unexpected error in "+ serviceName, cause);
    }
}
