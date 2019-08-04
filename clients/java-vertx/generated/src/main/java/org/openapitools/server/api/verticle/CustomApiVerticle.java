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

public class CustomApiVerticle extends AbstractVerticle {
    final static Logger LOGGER = LoggerFactory.getLogger(CustomApiVerticle.class); 
    
    final static String GETAEMHEALTHCHECK_SERVICE_ID = "getAemHealthCheck";
    final static String POSTCONFIGAEMHEALTHCHECKSERVLET_SERVICE_ID = "postConfigAemHealthCheckServlet";
    final static String POSTCONFIGAEMPASSWORDRESET_SERVICE_ID = "postConfigAemPasswordReset";
    
    final CustomApi service;

    public CustomApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.CustomApiImpl");
            service = (CustomApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("CustomApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for getAemHealthCheck
        vertx.eventBus().<JsonObject> consumer(GETAEMHEALTHCHECK_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getAemHealthCheck";
                String tagsParam = message.body().getString("tags");
                String tags = (tagsParam == null) ? null : tagsParam;
                String combineTagsOrParam = message.body().getString("combineTagsOr");
                Boolean combineTagsOr = (combineTagsOrParam == null) ? null : Json.mapper.readValue(combineTagsOrParam, Boolean.class);
                service.getAemHealthCheck(tags, combineTagsOr, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getAemHealthCheck");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getAemHealthCheck", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for postConfigAemHealthCheckServlet
        vertx.eventBus().<JsonObject> consumer(POSTCONFIGAEMHEALTHCHECKSERVLET_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "postConfigAemHealthCheckServlet";
                JsonArray bundlesIgnoredParam = message.body().getJsonArray("bundles.ignored");
                List<String> bundlesIgnored = (bundlesIgnoredParam == null) ? null : Json.mapper.readValue(bundlesIgnoredParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, String.class));
                String bundlesIgnoredAtTypeHintParam = message.body().getString("bundles.ignored@TypeHint");
                String bundlesIgnoredAtTypeHint = (bundlesIgnoredAtTypeHintParam == null) ? null : bundlesIgnoredAtTypeHintParam;
                service.postConfigAemHealthCheckServlet(bundlesIgnored, bundlesIgnoredAtTypeHint, result -> {
                    if (result.succeeded())
                        message.reply(null);
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "postConfigAemHealthCheckServlet");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("postConfigAemHealthCheckServlet", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for postConfigAemPasswordReset
        vertx.eventBus().<JsonObject> consumer(POSTCONFIGAEMPASSWORDRESET_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "postConfigAemPasswordReset";
                JsonArray pwdresetAuthorizablesParam = message.body().getJsonArray("pwdreset.authorizables");
                List<String> pwdresetAuthorizables = (pwdresetAuthorizablesParam == null) ? null : Json.mapper.readValue(pwdresetAuthorizablesParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, String.class));
                String pwdresetAuthorizablesAtTypeHintParam = message.body().getString("pwdreset.authorizables@TypeHint");
                String pwdresetAuthorizablesAtTypeHint = (pwdresetAuthorizablesAtTypeHintParam == null) ? null : pwdresetAuthorizablesAtTypeHintParam;
                service.postConfigAemPasswordReset(pwdresetAuthorizables, pwdresetAuthorizablesAtTypeHint, result -> {
                    if (result.succeeded())
                        message.reply(null);
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "postConfigAemPasswordReset");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("postConfigAemPasswordReset", e);
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
