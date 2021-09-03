package org.openapitools.server.api.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import java.io.File;
import org.openapitools.server.api.model.InstallStatus;
import org.openapitools.server.api.MainApiException;

import java.util.List;
import java.util.Map;

public class CrxApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(CrxApiVerticle.class);
    
    static final String GETCRXDESTATUS_SERVICE_ID = "getCrxdeStatus";
    static final String GETINSTALLSTATUS_SERVICE_ID = "getInstallStatus";
    static final String GETPACKAGEMANAGERSERVLET_SERVICE_ID = "getPackageManagerServlet";
    static final String POSTPACKAGESERVICE_SERVICE_ID = "postPackageService";
    static final String POSTPACKAGESERVICEJSON_SERVICE_ID = "postPackageServiceJson";
    static final String POSTPACKAGEUPDATE_SERVICE_ID = "postPackageUpdate";
    static final String POSTSETPASSWORD_SERVICE_ID = "postSetPassword";
    
    final CrxApi service;

    public CrxApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.CrxApiImpl");
            service = (CrxApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("CrxApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for getCrxdeStatus
        vertx.eventBus().<JsonObject> consumer(GETCRXDESTATUS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getCrxdeStatus";
                service.getCrxdeStatus(result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getCrxdeStatus");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getCrxdeStatus", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getInstallStatus
        vertx.eventBus().<JsonObject> consumer(GETINSTALLSTATUS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getInstallStatus";
                service.getInstallStatus(result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getInstallStatus");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getInstallStatus", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getPackageManagerServlet
        vertx.eventBus().<JsonObject> consumer(GETPACKAGEMANAGERSERVLET_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getPackageManagerServlet";
                service.getPackageManagerServlet(result -> {
                    if (result.succeeded())
                        message.reply(null);
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getPackageManagerServlet");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getPackageManagerServlet", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for postPackageService
        vertx.eventBus().<JsonObject> consumer(POSTPACKAGESERVICE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "postPackageService";
                String cmdParam = message.body().getString("cmd");
                if(cmdParam == null) {
                    manageError(message, new MainApiException(400, "cmd is required"), serviceId);
                    return;
                }
                String cmd = cmdParam;
                service.postPackageService(cmd, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "postPackageService");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("postPackageService", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for postPackageServiceJson
        vertx.eventBus().<JsonObject> consumer(POSTPACKAGESERVICEJSON_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "postPackageServiceJson";
                String pathParam = message.body().getString("path");
                if(pathParam == null) {
                    manageError(message, new MainApiException(400, "path is required"), serviceId);
                    return;
                }
                String path = pathParam;
                String cmdParam = message.body().getString("cmd");
                if(cmdParam == null) {
                    manageError(message, new MainApiException(400, "cmd is required"), serviceId);
                    return;
                }
                String cmd = cmdParam;
                String groupNameParam = message.body().getString("groupName");
                String groupName = (groupNameParam == null) ? null : groupNameParam;
                String packageNameParam = message.body().getString("packageName");
                String packageName = (packageNameParam == null) ? null : packageNameParam;
                String packageVersionParam = message.body().getString("packageVersion");
                String packageVersion = (packageVersionParam == null) ? null : packageVersionParam;
                String charsetParam = message.body().getString("_charset_");
                String charset = (charsetParam == null) ? null : charsetParam;
                String forceParam = message.body().getString("force");
                Boolean force = (forceParam == null) ? null : Json.mapper.readValue(forceParam, Boolean.class);
                String recursiveParam = message.body().getString("recursive");
                Boolean recursive = (recursiveParam == null) ? null : Json.mapper.readValue(recursiveParam, Boolean.class);
                String _packageParam = message.body().getString("package");
                File _package = (_packageParam == null) ? null : Json.mapper.readValue(_packageParam, File.class);
                service.postPackageServiceJson(path, cmd, groupName, packageName, packageVersion, charset, force, recursive, _package, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "postPackageServiceJson");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("postPackageServiceJson", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for postPackageUpdate
        vertx.eventBus().<JsonObject> consumer(POSTPACKAGEUPDATE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "postPackageUpdate";
                String groupNameParam = message.body().getString("groupName");
                if(groupNameParam == null) {
                    manageError(message, new MainApiException(400, "groupName is required"), serviceId);
                    return;
                }
                String groupName = groupNameParam;
                String packageNameParam = message.body().getString("packageName");
                if(packageNameParam == null) {
                    manageError(message, new MainApiException(400, "packageName is required"), serviceId);
                    return;
                }
                String packageName = packageNameParam;
                String versionParam = message.body().getString("version");
                if(versionParam == null) {
                    manageError(message, new MainApiException(400, "version is required"), serviceId);
                    return;
                }
                String version = versionParam;
                String pathParam = message.body().getString("path");
                if(pathParam == null) {
                    manageError(message, new MainApiException(400, "path is required"), serviceId);
                    return;
                }
                String path = pathParam;
                String filterParam = message.body().getString("filter");
                String filter = (filterParam == null) ? null : filterParam;
                String charsetParam = message.body().getString("_charset_");
                String charset = (charsetParam == null) ? null : charsetParam;
                service.postPackageUpdate(groupName, packageName, version, path, filter, charset, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "postPackageUpdate");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("postPackageUpdate", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for postSetPassword
        vertx.eventBus().<JsonObject> consumer(POSTSETPASSWORD_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "postSetPassword";
                String oldParam = message.body().getString("old");
                if(oldParam == null) {
                    manageError(message, new MainApiException(400, "old is required"), serviceId);
                    return;
                }
                String old = oldParam;
                String plainParam = message.body().getString("plain");
                if(plainParam == null) {
                    manageError(message, new MainApiException(400, "plain is required"), serviceId);
                    return;
                }
                String plain = plainParam;
                String verifyParam = message.body().getString("verify");
                if(verifyParam == null) {
                    manageError(message, new MainApiException(400, "verify is required"), serviceId);
                    return;
                }
                String verify = verifyParam;
                service.postSetPassword(old, plain, verify, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "postSetPassword");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("postSetPassword", e);
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
