package org.openapitools.server.api.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.SamlConfigurationInfo;

import java.util.List;
import java.util.Map;

public class ConsoleApiVerticle extends AbstractVerticle {
    final static Logger LOGGER = LoggerFactory.getLogger(ConsoleApiVerticle.class); 
    
    final static String GETAEMPRODUCTINFO_SERVICE_ID = "getAemProductInfo";
    final static String GETCONFIGMGR_SERVICE_ID = "getConfigMgr";
    final static String POSTBUNDLE_SERVICE_ID = "postBundle";
    final static String POSTJMXREPOSITORY_SERVICE_ID = "postJmxRepository";
    final static String POSTSAMLCONFIGURATION_SERVICE_ID = "postSamlConfiguration";
    
    final ConsoleApi service;

    public ConsoleApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.ConsoleApiImpl");
            service = (ConsoleApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("ConsoleApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for getAemProductInfo
        vertx.eventBus().<JsonObject> consumer(GETAEMPRODUCTINFO_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getAemProductInfo";
                service.getAemProductInfo(result -> {
                    if (result.succeeded())
                        message.reply(new JsonArray(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getAemProductInfo");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getAemProductInfo", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getConfigMgr
        vertx.eventBus().<JsonObject> consumer(GETCONFIGMGR_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getConfigMgr";
                service.getConfigMgr(result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getConfigMgr");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getConfigMgr", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for postBundle
        vertx.eventBus().<JsonObject> consumer(POSTBUNDLE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "postBundle";
                String nameParam = message.body().getString("name");
                if(nameParam == null) {
                    manageError(message, new MainApiException(400, "name is required"), serviceId);
                    return;
                }
                String name = nameParam;
                String actionParam = message.body().getString("action");
                if(actionParam == null) {
                    manageError(message, new MainApiException(400, "action is required"), serviceId);
                    return;
                }
                String action = actionParam;
                service.postBundle(name, action, result -> {
                    if (result.succeeded())
                        message.reply(null);
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "postBundle");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("postBundle", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for postJmxRepository
        vertx.eventBus().<JsonObject> consumer(POSTJMXREPOSITORY_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "postJmxRepository";
                String actionParam = message.body().getString("action");
                if(actionParam == null) {
                    manageError(message, new MainApiException(400, "action is required"), serviceId);
                    return;
                }
                String action = actionParam;
                service.postJmxRepository(action, result -> {
                    if (result.succeeded())
                        message.reply(null);
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "postJmxRepository");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("postJmxRepository", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for postSamlConfiguration
        vertx.eventBus().<JsonObject> consumer(POSTSAMLCONFIGURATION_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "postSamlConfiguration";
                String postParam = message.body().getString("post");
                Boolean post = (postParam == null) ? null : Json.mapper.readValue(postParam, Boolean.class);
                String applyParam = message.body().getString("apply");
                Boolean apply = (applyParam == null) ? null : Json.mapper.readValue(applyParam, Boolean.class);
                String deleteParam = message.body().getString("delete");
                Boolean delete = (deleteParam == null) ? null : Json.mapper.readValue(deleteParam, Boolean.class);
                String actionParam = message.body().getString("action");
                String action = (actionParam == null) ? null : actionParam;
                String $locationParam = message.body().getString("$location");
                String $location = ($locationParam == null) ? null : $locationParam;
                JsonArray pathParam = message.body().getJsonArray("path");
                List<String> path = (pathParam == null) ? null : Json.mapper.readValue(pathParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, String.class));
                String serviceRankingParam = message.body().getString("service.ranking");
                Integer serviceRanking = (serviceRankingParam == null) ? null : Json.mapper.readValue(serviceRankingParam, Integer.class);
                String idpUrlParam = message.body().getString("idpUrl");
                String idpUrl = (idpUrlParam == null) ? null : idpUrlParam;
                String idpCertAliasParam = message.body().getString("idpCertAlias");
                String idpCertAlias = (idpCertAliasParam == null) ? null : idpCertAliasParam;
                String idpHttpRedirectParam = message.body().getString("idpHttpRedirect");
                Boolean idpHttpRedirect = (idpHttpRedirectParam == null) ? null : Json.mapper.readValue(idpHttpRedirectParam, Boolean.class);
                String serviceProviderEntityIdParam = message.body().getString("serviceProviderEntityId");
                String serviceProviderEntityId = (serviceProviderEntityIdParam == null) ? null : serviceProviderEntityIdParam;
                String assertionConsumerServiceURLParam = message.body().getString("assertionConsumerServiceURL");
                String assertionConsumerServiceURL = (assertionConsumerServiceURLParam == null) ? null : assertionConsumerServiceURLParam;
                String spPrivateKeyAliasParam = message.body().getString("spPrivateKeyAlias");
                String spPrivateKeyAlias = (spPrivateKeyAliasParam == null) ? null : spPrivateKeyAliasParam;
                String keyStorePasswordParam = message.body().getString("keyStorePassword");
                String keyStorePassword = (keyStorePasswordParam == null) ? null : keyStorePasswordParam;
                String defaultRedirectUrlParam = message.body().getString("defaultRedirectUrl");
                String defaultRedirectUrl = (defaultRedirectUrlParam == null) ? null : defaultRedirectUrlParam;
                String userIDAttributeParam = message.body().getString("userIDAttribute");
                String userIDAttribute = (userIDAttributeParam == null) ? null : userIDAttributeParam;
                String useEncryptionParam = message.body().getString("useEncryption");
                Boolean useEncryption = (useEncryptionParam == null) ? null : Json.mapper.readValue(useEncryptionParam, Boolean.class);
                String createUserParam = message.body().getString("createUser");
                Boolean createUser = (createUserParam == null) ? null : Json.mapper.readValue(createUserParam, Boolean.class);
                String addGroupMembershipsParam = message.body().getString("addGroupMemberships");
                Boolean addGroupMemberships = (addGroupMembershipsParam == null) ? null : Json.mapper.readValue(addGroupMembershipsParam, Boolean.class);
                String groupMembershipAttributeParam = message.body().getString("groupMembershipAttribute");
                String groupMembershipAttribute = (groupMembershipAttributeParam == null) ? null : groupMembershipAttributeParam;
                JsonArray defaultGroupsParam = message.body().getJsonArray("defaultGroups");
                List<String> defaultGroups = (defaultGroupsParam == null) ? null : Json.mapper.readValue(defaultGroupsParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, String.class));
                String nameIdFormatParam = message.body().getString("nameIdFormat");
                String nameIdFormat = (nameIdFormatParam == null) ? null : nameIdFormatParam;
                JsonArray synchronizeAttributesParam = message.body().getJsonArray("synchronizeAttributes");
                List<String> synchronizeAttributes = (synchronizeAttributesParam == null) ? null : Json.mapper.readValue(synchronizeAttributesParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, String.class));
                String handleLogoutParam = message.body().getString("handleLogout");
                Boolean handleLogout = (handleLogoutParam == null) ? null : Json.mapper.readValue(handleLogoutParam, Boolean.class);
                String logoutUrlParam = message.body().getString("logoutUrl");
                String logoutUrl = (logoutUrlParam == null) ? null : logoutUrlParam;
                String clockToleranceParam = message.body().getString("clockTolerance");
                Integer clockTolerance = (clockToleranceParam == null) ? null : Json.mapper.readValue(clockToleranceParam, Integer.class);
                String digestMethodParam = message.body().getString("digestMethod");
                String digestMethod = (digestMethodParam == null) ? null : digestMethodParam;
                String signatureMethodParam = message.body().getString("signatureMethod");
                String signatureMethod = (signatureMethodParam == null) ? null : signatureMethodParam;
                String userIntermediatePathParam = message.body().getString("userIntermediatePath");
                String userIntermediatePath = (userIntermediatePathParam == null) ? null : userIntermediatePathParam;
                JsonArray propertylistParam = message.body().getJsonArray("propertylist");
                List<String> propertylist = (propertylistParam == null) ? null : Json.mapper.readValue(propertylistParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, String.class));
                service.postSamlConfiguration(post, apply, delete, action, $location, path, serviceRanking, idpUrl, idpCertAlias, idpHttpRedirect, serviceProviderEntityId, assertionConsumerServiceURL, spPrivateKeyAlias, keyStorePassword, defaultRedirectUrl, userIDAttribute, useEncryption, createUser, addGroupMemberships, groupMembershipAttribute, defaultGroups, nameIdFormat, synchronizeAttributes, handleLogout, logoutUrl, clockTolerance, digestMethod, signatureMethod, userIntermediatePath, propertylist, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "postSamlConfiguration");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("postSamlConfiguration", e);
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
