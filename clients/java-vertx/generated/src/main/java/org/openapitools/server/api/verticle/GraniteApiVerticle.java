package org.openapitools.server.api.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import java.io.File;
import org.openapitools.server.api.MainApiException;

import java.util.List;
import java.util.Map;

public class GraniteApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(GraniteApiVerticle.class);
    
    static final String SSLSETUP_SERVICE_ID = "sslSetup";
    
    final GraniteApi service;

    public GraniteApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.GraniteApiImpl");
            service = (GraniteApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("GraniteApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for sslSetup
        vertx.eventBus().<JsonObject> consumer(SSLSETUP_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "sslSetup";
                String keystorePasswordParam = message.body().getString("keystorePassword");
                if(keystorePasswordParam == null) {
                    manageError(message, new MainApiException(400, "keystorePassword is required"), serviceId);
                    return;
                }
                String keystorePassword = keystorePasswordParam;
                String keystorePasswordConfirmParam = message.body().getString("keystorePasswordConfirm");
                if(keystorePasswordConfirmParam == null) {
                    manageError(message, new MainApiException(400, "keystorePasswordConfirm is required"), serviceId);
                    return;
                }
                String keystorePasswordConfirm = keystorePasswordConfirmParam;
                String truststorePasswordParam = message.body().getString("truststorePassword");
                if(truststorePasswordParam == null) {
                    manageError(message, new MainApiException(400, "truststorePassword is required"), serviceId);
                    return;
                }
                String truststorePassword = truststorePasswordParam;
                String truststorePasswordConfirmParam = message.body().getString("truststorePasswordConfirm");
                if(truststorePasswordConfirmParam == null) {
                    manageError(message, new MainApiException(400, "truststorePasswordConfirm is required"), serviceId);
                    return;
                }
                String truststorePasswordConfirm = truststorePasswordConfirmParam;
                String httpsHostnameParam = message.body().getString("httpsHostname");
                if(httpsHostnameParam == null) {
                    manageError(message, new MainApiException(400, "httpsHostname is required"), serviceId);
                    return;
                }
                String httpsHostname = httpsHostnameParam;
                String httpsPortParam = message.body().getString("httpsPort");
                if(httpsPortParam == null) {
                    manageError(message, new MainApiException(400, "httpsPort is required"), serviceId);
                    return;
                }
                String httpsPort = httpsPortParam;
                String privatekeyFileParam = message.body().getString("privatekeyFile");
                File privatekeyFile = (privatekeyFileParam == null) ? null : Json.mapper.readValue(privatekeyFileParam, File.class);
                String certificateFileParam = message.body().getString("certificateFile");
                File certificateFile = (certificateFileParam == null) ? null : Json.mapper.readValue(certificateFileParam, File.class);
                service.sslSetup(keystorePassword, keystorePasswordConfirm, truststorePassword, truststorePasswordConfirm, httpsHostname, httpsPort, privatekeyFile, certificateFile, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "sslSetup");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("sslSetup", e);
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
