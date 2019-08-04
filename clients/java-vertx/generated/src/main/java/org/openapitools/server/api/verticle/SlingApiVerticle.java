package org.openapitools.server.api.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import java.math.BigDecimal;
import java.io.File;
import org.openapitools.server.api.model.KeystoreInfo;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.TruststoreInfo;

import java.util.List;
import java.util.Map;

public class SlingApiVerticle extends AbstractVerticle {
    final static Logger LOGGER = LoggerFactory.getLogger(SlingApiVerticle.class); 
    
    final static String DELETEAGENT_SERVICE_ID = "deleteAgent";
    final static String DELETENODE_SERVICE_ID = "deleteNode";
    final static String GETAGENT_SERVICE_ID = "getAgent";
    final static String GETAGENTS_SERVICE_ID = "getAgents";
    final static String GETAUTHORIZABLEKEYSTORE_SERVICE_ID = "getAuthorizableKeystore";
    final static String GETKEYSTORE_SERVICE_ID = "getKeystore";
    final static String GETNODE_SERVICE_ID = "getNode";
    final static String GETPACKAGE_SERVICE_ID = "getPackage";
    final static String GETPACKAGEFILTER_SERVICE_ID = "getPackageFilter";
    final static String GETQUERY_SERVICE_ID = "getQuery";
    final static String GETTRUSTSTORE_SERVICE_ID = "getTruststore";
    final static String GETTRUSTSTOREINFO_SERVICE_ID = "getTruststoreInfo";
    final static String POSTAGENT_SERVICE_ID = "postAgent";
    final static String POSTAUTHORIZABLEKEYSTORE_SERVICE_ID = "postAuthorizableKeystore";
    final static String POSTAUTHORIZABLES_SERVICE_ID = "postAuthorizables";
    final static String POSTCONFIGADOBEGRANITESAMLAUTHENTICATIONHANDLER_SERVICE_ID = "postConfigAdobeGraniteSamlAuthenticationHandler";
    final static String POSTCONFIGAPACHEFELIXJETTYBASEDHTTPSERVICE_SERVICE_ID = "postConfigApacheFelixJettyBasedHttpService";
    final static String POSTCONFIGAPACHEHTTPCOMPONENTSPROXYCONFIGURATION_SERVICE_ID = "postConfigApacheHttpComponentsProxyConfiguration";
    final static String POSTCONFIGAPACHESLINGDAVEXSERVLET_SERVICE_ID = "postConfigApacheSlingDavExServlet";
    final static String POSTCONFIGAPACHESLINGGETSERVLET_SERVICE_ID = "postConfigApacheSlingGetServlet";
    final static String POSTCONFIGAPACHESLINGREFERRERFILTER_SERVICE_ID = "postConfigApacheSlingReferrerFilter";
    final static String POSTNODE_SERVICE_ID = "postNode";
    final static String POSTNODERW_SERVICE_ID = "postNodeRw";
    final static String POSTPATH_SERVICE_ID = "postPath";
    final static String POSTQUERY_SERVICE_ID = "postQuery";
    final static String POSTTREEACTIVATION_SERVICE_ID = "postTreeActivation";
    final static String POSTTRUSTSTORE_SERVICE_ID = "postTruststore";
    final static String POSTTRUSTSTOREPKCS12_SERVICE_ID = "postTruststorePKCS12";
    
    final SlingApi service;

    public SlingApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.SlingApiImpl");
            service = (SlingApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("SlingApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for deleteAgent
        vertx.eventBus().<JsonObject> consumer(DELETEAGENT_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "deleteAgent";
                String runmodeParam = message.body().getString("runmode");
                if(runmodeParam == null) {
                    manageError(message, new MainApiException(400, "runmode is required"), serviceId);
                    return;
                }
                String runmode = runmodeParam;
                String nameParam = message.body().getString("name");
                if(nameParam == null) {
                    manageError(message, new MainApiException(400, "name is required"), serviceId);
                    return;
                }
                String name = nameParam;
                service.deleteAgent(runmode, name, result -> {
                    if (result.succeeded())
                        message.reply(null);
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "deleteAgent");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("deleteAgent", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for deleteNode
        vertx.eventBus().<JsonObject> consumer(DELETENODE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "deleteNode";
                String pathParam = message.body().getString("path");
                if(pathParam == null) {
                    manageError(message, new MainApiException(400, "path is required"), serviceId);
                    return;
                }
                String path = pathParam;
                String nameParam = message.body().getString("name");
                if(nameParam == null) {
                    manageError(message, new MainApiException(400, "name is required"), serviceId);
                    return;
                }
                String name = nameParam;
                service.deleteNode(path, name, result -> {
                    if (result.succeeded())
                        message.reply(null);
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "deleteNode");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("deleteNode", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getAgent
        vertx.eventBus().<JsonObject> consumer(GETAGENT_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getAgent";
                String runmodeParam = message.body().getString("runmode");
                if(runmodeParam == null) {
                    manageError(message, new MainApiException(400, "runmode is required"), serviceId);
                    return;
                }
                String runmode = runmodeParam;
                String nameParam = message.body().getString("name");
                if(nameParam == null) {
                    manageError(message, new MainApiException(400, "name is required"), serviceId);
                    return;
                }
                String name = nameParam;
                service.getAgent(runmode, name, result -> {
                    if (result.succeeded())
                        message.reply(null);
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getAgent");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getAgent", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getAgents
        vertx.eventBus().<JsonObject> consumer(GETAGENTS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getAgents";
                String runmodeParam = message.body().getString("runmode");
                if(runmodeParam == null) {
                    manageError(message, new MainApiException(400, "runmode is required"), serviceId);
                    return;
                }
                String runmode = runmodeParam;
                service.getAgents(runmode, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getAgents");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getAgents", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getAuthorizableKeystore
        vertx.eventBus().<JsonObject> consumer(GETAUTHORIZABLEKEYSTORE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getAuthorizableKeystore";
                String intermediatePathParam = message.body().getString("intermediatePath");
                if(intermediatePathParam == null) {
                    manageError(message, new MainApiException(400, "intermediatePath is required"), serviceId);
                    return;
                }
                String intermediatePath = intermediatePathParam;
                String authorizableIdParam = message.body().getString("authorizableId");
                if(authorizableIdParam == null) {
                    manageError(message, new MainApiException(400, "authorizableId is required"), serviceId);
                    return;
                }
                String authorizableId = authorizableIdParam;
                service.getAuthorizableKeystore(intermediatePath, authorizableId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getAuthorizableKeystore");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getAuthorizableKeystore", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getKeystore
        vertx.eventBus().<JsonObject> consumer(GETKEYSTORE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getKeystore";
                String intermediatePathParam = message.body().getString("intermediatePath");
                if(intermediatePathParam == null) {
                    manageError(message, new MainApiException(400, "intermediatePath is required"), serviceId);
                    return;
                }
                String intermediatePath = intermediatePathParam;
                String authorizableIdParam = message.body().getString("authorizableId");
                if(authorizableIdParam == null) {
                    manageError(message, new MainApiException(400, "authorizableId is required"), serviceId);
                    return;
                }
                String authorizableId = authorizableIdParam;
                service.getKeystore(intermediatePath, authorizableId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getKeystore");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getKeystore", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getNode
        vertx.eventBus().<JsonObject> consumer(GETNODE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getNode";
                String pathParam = message.body().getString("path");
                if(pathParam == null) {
                    manageError(message, new MainApiException(400, "path is required"), serviceId);
                    return;
                }
                String path = pathParam;
                String nameParam = message.body().getString("name");
                if(nameParam == null) {
                    manageError(message, new MainApiException(400, "name is required"), serviceId);
                    return;
                }
                String name = nameParam;
                service.getNode(path, name, result -> {
                    if (result.succeeded())
                        message.reply(null);
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getNode");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getNode", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getPackage
        vertx.eventBus().<JsonObject> consumer(GETPACKAGE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getPackage";
                String groupParam = message.body().getString("group");
                if(groupParam == null) {
                    manageError(message, new MainApiException(400, "group is required"), serviceId);
                    return;
                }
                String group = groupParam;
                String nameParam = message.body().getString("name");
                if(nameParam == null) {
                    manageError(message, new MainApiException(400, "name is required"), serviceId);
                    return;
                }
                String name = nameParam;
                String versionParam = message.body().getString("version");
                if(versionParam == null) {
                    manageError(message, new MainApiException(400, "version is required"), serviceId);
                    return;
                }
                String version = versionParam;
                service.getPackage(group, name, version, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getPackage");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getPackage", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getPackageFilter
        vertx.eventBus().<JsonObject> consumer(GETPACKAGEFILTER_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getPackageFilter";
                String groupParam = message.body().getString("group");
                if(groupParam == null) {
                    manageError(message, new MainApiException(400, "group is required"), serviceId);
                    return;
                }
                String group = groupParam;
                String nameParam = message.body().getString("name");
                if(nameParam == null) {
                    manageError(message, new MainApiException(400, "name is required"), serviceId);
                    return;
                }
                String name = nameParam;
                String versionParam = message.body().getString("version");
                if(versionParam == null) {
                    manageError(message, new MainApiException(400, "version is required"), serviceId);
                    return;
                }
                String version = versionParam;
                service.getPackageFilter(group, name, version, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getPackageFilter");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getPackageFilter", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getQuery
        vertx.eventBus().<JsonObject> consumer(GETQUERY_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getQuery";
                String pathParam = message.body().getString("path");
                if(pathParam == null) {
                    manageError(message, new MainApiException(400, "path is required"), serviceId);
                    return;
                }
                String path = pathParam;
                String pLimitParam = message.body().getString("p.limit");
                if(pLimitParam == null) {
                    manageError(message, new MainApiException(400, "p.limit is required"), serviceId);
                    return;
                }
                BigDecimal pLimit = Json.mapper.readValue(pLimitParam, BigDecimal.class);
                String _1propertyParam = message.body().getString("1_property");
                if(_1propertyParam == null) {
                    manageError(message, new MainApiException(400, "1_property is required"), serviceId);
                    return;
                }
                String _1property = _1propertyParam;
                String _1propertyValueParam = message.body().getString("1_property.value");
                if(_1propertyValueParam == null) {
                    manageError(message, new MainApiException(400, "1_property.value is required"), serviceId);
                    return;
                }
                String _1propertyValue = _1propertyValueParam;
                service.getQuery(path, pLimit, _1property, _1propertyValue, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getQuery");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getQuery", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getTruststore
        vertx.eventBus().<JsonObject> consumer(GETTRUSTSTORE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getTruststore";
                service.getTruststore(result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getTruststore");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getTruststore", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getTruststoreInfo
        vertx.eventBus().<JsonObject> consumer(GETTRUSTSTOREINFO_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getTruststoreInfo";
                service.getTruststoreInfo(result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getTruststoreInfo");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getTruststoreInfo", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for postAgent
        vertx.eventBus().<JsonObject> consumer(POSTAGENT_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "postAgent";
                String runmodeParam = message.body().getString("runmode");
                if(runmodeParam == null) {
                    manageError(message, new MainApiException(400, "runmode is required"), serviceId);
                    return;
                }
                String runmode = runmodeParam;
                String nameParam = message.body().getString("name");
                if(nameParam == null) {
                    manageError(message, new MainApiException(400, "name is required"), serviceId);
                    return;
                }
                String name = nameParam;
                String jcrColonContentSlashCqColonDistributeParam = message.body().getString("jcr:content/cq:distribute");
                Boolean jcrColonContentSlashCqColonDistribute = (jcrColonContentSlashCqColonDistributeParam == null) ? null : Json.mapper.readValue(jcrColonContentSlashCqColonDistributeParam, Boolean.class);
                String jcrColonContentSlashCqColonDistributeAtTypeHintParam = message.body().getString("jcr:content/cq:distribute@TypeHint");
                String jcrColonContentSlashCqColonDistributeAtTypeHint = (jcrColonContentSlashCqColonDistributeAtTypeHintParam == null) ? null : jcrColonContentSlashCqColonDistributeAtTypeHintParam;
                String jcrColonContentSlashCqColonNameParam = message.body().getString("jcr:content/cq:name");
                String jcrColonContentSlashCqColonName = (jcrColonContentSlashCqColonNameParam == null) ? null : jcrColonContentSlashCqColonNameParam;
                String jcrColonContentSlashCqColonTemplateParam = message.body().getString("jcr:content/cq:template");
                String jcrColonContentSlashCqColonTemplate = (jcrColonContentSlashCqColonTemplateParam == null) ? null : jcrColonContentSlashCqColonTemplateParam;
                String jcrColonContentSlashEnabledParam = message.body().getString("jcr:content/enabled");
                Boolean jcrColonContentSlashEnabled = (jcrColonContentSlashEnabledParam == null) ? null : Json.mapper.readValue(jcrColonContentSlashEnabledParam, Boolean.class);
                String jcrColonContentSlashJcrColonDescriptionParam = message.body().getString("jcr:content/jcr:description");
                String jcrColonContentSlashJcrColonDescription = (jcrColonContentSlashJcrColonDescriptionParam == null) ? null : jcrColonContentSlashJcrColonDescriptionParam;
                String jcrColonContentSlashJcrColonLastModifiedParam = message.body().getString("jcr:content/jcr:lastModified");
                String jcrColonContentSlashJcrColonLastModified = (jcrColonContentSlashJcrColonLastModifiedParam == null) ? null : jcrColonContentSlashJcrColonLastModifiedParam;
                String jcrColonContentSlashJcrColonLastModifiedByParam = message.body().getString("jcr:content/jcr:lastModifiedBy");
                String jcrColonContentSlashJcrColonLastModifiedBy = (jcrColonContentSlashJcrColonLastModifiedByParam == null) ? null : jcrColonContentSlashJcrColonLastModifiedByParam;
                String jcrColonContentSlashJcrColonMixinTypesParam = message.body().getString("jcr:content/jcr:mixinTypes");
                String jcrColonContentSlashJcrColonMixinTypes = (jcrColonContentSlashJcrColonMixinTypesParam == null) ? null : jcrColonContentSlashJcrColonMixinTypesParam;
                String jcrColonContentSlashJcrColonTitleParam = message.body().getString("jcr:content/jcr:title");
                String jcrColonContentSlashJcrColonTitle = (jcrColonContentSlashJcrColonTitleParam == null) ? null : jcrColonContentSlashJcrColonTitleParam;
                String jcrColonContentSlashLogLevelParam = message.body().getString("jcr:content/logLevel");
                String jcrColonContentSlashLogLevel = (jcrColonContentSlashLogLevelParam == null) ? null : jcrColonContentSlashLogLevelParam;
                String jcrColonContentSlashNoStatusUpdateParam = message.body().getString("jcr:content/noStatusUpdate");
                Boolean jcrColonContentSlashNoStatusUpdate = (jcrColonContentSlashNoStatusUpdateParam == null) ? null : Json.mapper.readValue(jcrColonContentSlashNoStatusUpdateParam, Boolean.class);
                String jcrColonContentSlashNoVersioningParam = message.body().getString("jcr:content/noVersioning");
                Boolean jcrColonContentSlashNoVersioning = (jcrColonContentSlashNoVersioningParam == null) ? null : Json.mapper.readValue(jcrColonContentSlashNoVersioningParam, Boolean.class);
                String jcrColonContentSlashProtocolConnectTimeoutParam = message.body().getString("jcr:content/protocolConnectTimeout");
                BigDecimal jcrColonContentSlashProtocolConnectTimeout = (jcrColonContentSlashProtocolConnectTimeoutParam == null) ? null : Json.mapper.readValue(jcrColonContentSlashProtocolConnectTimeoutParam, BigDecimal.class);
                String jcrColonContentSlashProtocolHTTPConnectionClosedParam = message.body().getString("jcr:content/protocolHTTPConnectionClosed");
                Boolean jcrColonContentSlashProtocolHTTPConnectionClosed = (jcrColonContentSlashProtocolHTTPConnectionClosedParam == null) ? null : Json.mapper.readValue(jcrColonContentSlashProtocolHTTPConnectionClosedParam, Boolean.class);
                String jcrColonContentSlashProtocolHTTPExpiredParam = message.body().getString("jcr:content/protocolHTTPExpired");
                String jcrColonContentSlashProtocolHTTPExpired = (jcrColonContentSlashProtocolHTTPExpiredParam == null) ? null : jcrColonContentSlashProtocolHTTPExpiredParam;
                JsonArray jcrColonContentSlashProtocolHTTPHeadersParam = message.body().getJsonArray("jcr:content/protocolHTTPHeaders");
                List<String> jcrColonContentSlashProtocolHTTPHeaders = (jcrColonContentSlashProtocolHTTPHeadersParam == null) ? null : Json.mapper.readValue(jcrColonContentSlashProtocolHTTPHeadersParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, String.class));
                String jcrColonContentSlashProtocolHTTPHeadersAtTypeHintParam = message.body().getString("jcr:content/protocolHTTPHeaders@TypeHint");
                String jcrColonContentSlashProtocolHTTPHeadersAtTypeHint = (jcrColonContentSlashProtocolHTTPHeadersAtTypeHintParam == null) ? null : jcrColonContentSlashProtocolHTTPHeadersAtTypeHintParam;
                String jcrColonContentSlashProtocolHTTPMethodParam = message.body().getString("jcr:content/protocolHTTPMethod");
                String jcrColonContentSlashProtocolHTTPMethod = (jcrColonContentSlashProtocolHTTPMethodParam == null) ? null : jcrColonContentSlashProtocolHTTPMethodParam;
                String jcrColonContentSlashProtocolHTTPSRelaxedParam = message.body().getString("jcr:content/protocolHTTPSRelaxed");
                Boolean jcrColonContentSlashProtocolHTTPSRelaxed = (jcrColonContentSlashProtocolHTTPSRelaxedParam == null) ? null : Json.mapper.readValue(jcrColonContentSlashProtocolHTTPSRelaxedParam, Boolean.class);
                String jcrColonContentSlashProtocolInterfaceParam = message.body().getString("jcr:content/protocolInterface");
                String jcrColonContentSlashProtocolInterface = (jcrColonContentSlashProtocolInterfaceParam == null) ? null : jcrColonContentSlashProtocolInterfaceParam;
                String jcrColonContentSlashProtocolSocketTimeoutParam = message.body().getString("jcr:content/protocolSocketTimeout");
                BigDecimal jcrColonContentSlashProtocolSocketTimeout = (jcrColonContentSlashProtocolSocketTimeoutParam == null) ? null : Json.mapper.readValue(jcrColonContentSlashProtocolSocketTimeoutParam, BigDecimal.class);
                String jcrColonContentSlashProtocolVersionParam = message.body().getString("jcr:content/protocolVersion");
                String jcrColonContentSlashProtocolVersion = (jcrColonContentSlashProtocolVersionParam == null) ? null : jcrColonContentSlashProtocolVersionParam;
                String jcrColonContentSlashProxyNTLMDomainParam = message.body().getString("jcr:content/proxyNTLMDomain");
                String jcrColonContentSlashProxyNTLMDomain = (jcrColonContentSlashProxyNTLMDomainParam == null) ? null : jcrColonContentSlashProxyNTLMDomainParam;
                String jcrColonContentSlashProxyNTLMHostParam = message.body().getString("jcr:content/proxyNTLMHost");
                String jcrColonContentSlashProxyNTLMHost = (jcrColonContentSlashProxyNTLMHostParam == null) ? null : jcrColonContentSlashProxyNTLMHostParam;
                String jcrColonContentSlashProxyHostParam = message.body().getString("jcr:content/proxyHost");
                String jcrColonContentSlashProxyHost = (jcrColonContentSlashProxyHostParam == null) ? null : jcrColonContentSlashProxyHostParam;
                String jcrColonContentSlashProxyPasswordParam = message.body().getString("jcr:content/proxyPassword");
                String jcrColonContentSlashProxyPassword = (jcrColonContentSlashProxyPasswordParam == null) ? null : jcrColonContentSlashProxyPasswordParam;
                String jcrColonContentSlashProxyPortParam = message.body().getString("jcr:content/proxyPort");
                BigDecimal jcrColonContentSlashProxyPort = (jcrColonContentSlashProxyPortParam == null) ? null : Json.mapper.readValue(jcrColonContentSlashProxyPortParam, BigDecimal.class);
                String jcrColonContentSlashProxyUserParam = message.body().getString("jcr:content/proxyUser");
                String jcrColonContentSlashProxyUser = (jcrColonContentSlashProxyUserParam == null) ? null : jcrColonContentSlashProxyUserParam;
                String jcrColonContentSlashQueueBatchMaxSizeParam = message.body().getString("jcr:content/queueBatchMaxSize");
                BigDecimal jcrColonContentSlashQueueBatchMaxSize = (jcrColonContentSlashQueueBatchMaxSizeParam == null) ? null : Json.mapper.readValue(jcrColonContentSlashQueueBatchMaxSizeParam, BigDecimal.class);
                String jcrColonContentSlashQueueBatchModeParam = message.body().getString("jcr:content/queueBatchMode");
                String jcrColonContentSlashQueueBatchMode = (jcrColonContentSlashQueueBatchModeParam == null) ? null : jcrColonContentSlashQueueBatchModeParam;
                String jcrColonContentSlashQueueBatchWaitTimeParam = message.body().getString("jcr:content/queueBatchWaitTime");
                BigDecimal jcrColonContentSlashQueueBatchWaitTime = (jcrColonContentSlashQueueBatchWaitTimeParam == null) ? null : Json.mapper.readValue(jcrColonContentSlashQueueBatchWaitTimeParam, BigDecimal.class);
                String jcrColonContentSlashRetryDelayParam = message.body().getString("jcr:content/retryDelay");
                String jcrColonContentSlashRetryDelay = (jcrColonContentSlashRetryDelayParam == null) ? null : jcrColonContentSlashRetryDelayParam;
                String jcrColonContentSlashReverseReplicationParam = message.body().getString("jcr:content/reverseReplication");
                Boolean jcrColonContentSlashReverseReplication = (jcrColonContentSlashReverseReplicationParam == null) ? null : Json.mapper.readValue(jcrColonContentSlashReverseReplicationParam, Boolean.class);
                String jcrColonContentSlashSerializationTypeParam = message.body().getString("jcr:content/serializationType");
                String jcrColonContentSlashSerializationType = (jcrColonContentSlashSerializationTypeParam == null) ? null : jcrColonContentSlashSerializationTypeParam;
                String jcrColonContentSlashSlingColonResourceTypeParam = message.body().getString("jcr:content/sling:resourceType");
                String jcrColonContentSlashSlingColonResourceType = (jcrColonContentSlashSlingColonResourceTypeParam == null) ? null : jcrColonContentSlashSlingColonResourceTypeParam;
                String jcrColonContentSlashSslParam = message.body().getString("jcr:content/ssl");
                String jcrColonContentSlashSsl = (jcrColonContentSlashSslParam == null) ? null : jcrColonContentSlashSslParam;
                String jcrColonContentSlashTransportNTLMDomainParam = message.body().getString("jcr:content/transportNTLMDomain");
                String jcrColonContentSlashTransportNTLMDomain = (jcrColonContentSlashTransportNTLMDomainParam == null) ? null : jcrColonContentSlashTransportNTLMDomainParam;
                String jcrColonContentSlashTransportNTLMHostParam = message.body().getString("jcr:content/transportNTLMHost");
                String jcrColonContentSlashTransportNTLMHost = (jcrColonContentSlashTransportNTLMHostParam == null) ? null : jcrColonContentSlashTransportNTLMHostParam;
                String jcrColonContentSlashTransportPasswordParam = message.body().getString("jcr:content/transportPassword");
                String jcrColonContentSlashTransportPassword = (jcrColonContentSlashTransportPasswordParam == null) ? null : jcrColonContentSlashTransportPasswordParam;
                String jcrColonContentSlashTransportUriParam = message.body().getString("jcr:content/transportUri");
                String jcrColonContentSlashTransportUri = (jcrColonContentSlashTransportUriParam == null) ? null : jcrColonContentSlashTransportUriParam;
                String jcrColonContentSlashTransportUserParam = message.body().getString("jcr:content/transportUser");
                String jcrColonContentSlashTransportUser = (jcrColonContentSlashTransportUserParam == null) ? null : jcrColonContentSlashTransportUserParam;
                String jcrColonContentSlashTriggerDistributeParam = message.body().getString("jcr:content/triggerDistribute");
                Boolean jcrColonContentSlashTriggerDistribute = (jcrColonContentSlashTriggerDistributeParam == null) ? null : Json.mapper.readValue(jcrColonContentSlashTriggerDistributeParam, Boolean.class);
                String jcrColonContentSlashTriggerModifiedParam = message.body().getString("jcr:content/triggerModified");
                Boolean jcrColonContentSlashTriggerModified = (jcrColonContentSlashTriggerModifiedParam == null) ? null : Json.mapper.readValue(jcrColonContentSlashTriggerModifiedParam, Boolean.class);
                String jcrColonContentSlashTriggerOnOffTimeParam = message.body().getString("jcr:content/triggerOnOffTime");
                Boolean jcrColonContentSlashTriggerOnOffTime = (jcrColonContentSlashTriggerOnOffTimeParam == null) ? null : Json.mapper.readValue(jcrColonContentSlashTriggerOnOffTimeParam, Boolean.class);
                String jcrColonContentSlashTriggerReceiveParam = message.body().getString("jcr:content/triggerReceive");
                Boolean jcrColonContentSlashTriggerReceive = (jcrColonContentSlashTriggerReceiveParam == null) ? null : Json.mapper.readValue(jcrColonContentSlashTriggerReceiveParam, Boolean.class);
                String jcrColonContentSlashTriggerSpecificParam = message.body().getString("jcr:content/triggerSpecific");
                Boolean jcrColonContentSlashTriggerSpecific = (jcrColonContentSlashTriggerSpecificParam == null) ? null : Json.mapper.readValue(jcrColonContentSlashTriggerSpecificParam, Boolean.class);
                String jcrColonContentSlashUserIdParam = message.body().getString("jcr:content/userId");
                String jcrColonContentSlashUserId = (jcrColonContentSlashUserIdParam == null) ? null : jcrColonContentSlashUserIdParam;
                String jcrColonPrimaryTypeParam = message.body().getString("jcr:primaryType");
                String jcrColonPrimaryType = (jcrColonPrimaryTypeParam == null) ? null : jcrColonPrimaryTypeParam;
                String colonOperationParam = message.body().getString(":operation");
                String colonOperation = (colonOperationParam == null) ? null : colonOperationParam;
                service.postAgent(runmode, name, jcrColonContentSlashCqColonDistribute, jcrColonContentSlashCqColonDistributeAtTypeHint, jcrColonContentSlashCqColonName, jcrColonContentSlashCqColonTemplate, jcrColonContentSlashEnabled, jcrColonContentSlashJcrColonDescription, jcrColonContentSlashJcrColonLastModified, jcrColonContentSlashJcrColonLastModifiedBy, jcrColonContentSlashJcrColonMixinTypes, jcrColonContentSlashJcrColonTitle, jcrColonContentSlashLogLevel, jcrColonContentSlashNoStatusUpdate, jcrColonContentSlashNoVersioning, jcrColonContentSlashProtocolConnectTimeout, jcrColonContentSlashProtocolHTTPConnectionClosed, jcrColonContentSlashProtocolHTTPExpired, jcrColonContentSlashProtocolHTTPHeaders, jcrColonContentSlashProtocolHTTPHeadersAtTypeHint, jcrColonContentSlashProtocolHTTPMethod, jcrColonContentSlashProtocolHTTPSRelaxed, jcrColonContentSlashProtocolInterface, jcrColonContentSlashProtocolSocketTimeout, jcrColonContentSlashProtocolVersion, jcrColonContentSlashProxyNTLMDomain, jcrColonContentSlashProxyNTLMHost, jcrColonContentSlashProxyHost, jcrColonContentSlashProxyPassword, jcrColonContentSlashProxyPort, jcrColonContentSlashProxyUser, jcrColonContentSlashQueueBatchMaxSize, jcrColonContentSlashQueueBatchMode, jcrColonContentSlashQueueBatchWaitTime, jcrColonContentSlashRetryDelay, jcrColonContentSlashReverseReplication, jcrColonContentSlashSerializationType, jcrColonContentSlashSlingColonResourceType, jcrColonContentSlashSsl, jcrColonContentSlashTransportNTLMDomain, jcrColonContentSlashTransportNTLMHost, jcrColonContentSlashTransportPassword, jcrColonContentSlashTransportUri, jcrColonContentSlashTransportUser, jcrColonContentSlashTriggerDistribute, jcrColonContentSlashTriggerModified, jcrColonContentSlashTriggerOnOffTime, jcrColonContentSlashTriggerReceive, jcrColonContentSlashTriggerSpecific, jcrColonContentSlashUserId, jcrColonPrimaryType, colonOperation, result -> {
                    if (result.succeeded())
                        message.reply(null);
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "postAgent");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("postAgent", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for postAuthorizableKeystore
        vertx.eventBus().<JsonObject> consumer(POSTAUTHORIZABLEKEYSTORE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "postAuthorizableKeystore";
                String intermediatePathParam = message.body().getString("intermediatePath");
                if(intermediatePathParam == null) {
                    manageError(message, new MainApiException(400, "intermediatePath is required"), serviceId);
                    return;
                }
                String intermediatePath = intermediatePathParam;
                String authorizableIdParam = message.body().getString("authorizableId");
                if(authorizableIdParam == null) {
                    manageError(message, new MainApiException(400, "authorizableId is required"), serviceId);
                    return;
                }
                String authorizableId = authorizableIdParam;
                String colonOperationParam = message.body().getString(":operation");
                String colonOperation = (colonOperationParam == null) ? null : colonOperationParam;
                String currentPasswordParam = message.body().getString("currentPassword");
                String currentPassword = (currentPasswordParam == null) ? null : currentPasswordParam;
                String newPasswordParam = message.body().getString("newPassword");
                String newPassword = (newPasswordParam == null) ? null : newPasswordParam;
                String rePasswordParam = message.body().getString("rePassword");
                String rePassword = (rePasswordParam == null) ? null : rePasswordParam;
                String keyPasswordParam = message.body().getString("keyPassword");
                String keyPassword = (keyPasswordParam == null) ? null : keyPasswordParam;
                String keyStorePassParam = message.body().getString("keyStorePass");
                String keyStorePass = (keyStorePassParam == null) ? null : keyStorePassParam;
                String aliasParam = message.body().getString("alias");
                String alias = (aliasParam == null) ? null : aliasParam;
                String newAliasParam = message.body().getString("newAlias");
                String newAlias = (newAliasParam == null) ? null : newAliasParam;
                String removeAliasParam = message.body().getString("removeAlias");
                String removeAlias = (removeAliasParam == null) ? null : removeAliasParam;
                String certChainParam = message.body().getString("cert-chain");
                File certChain = (certChainParam == null) ? null : Json.mapper.readValue(certChainParam, File.class);
                String pkParam = message.body().getString("pk");
                File pk = (pkParam == null) ? null : Json.mapper.readValue(pkParam, File.class);
                String keyStoreParam = message.body().getString("keyStore");
                File keyStore = (keyStoreParam == null) ? null : Json.mapper.readValue(keyStoreParam, File.class);
                service.postAuthorizableKeystore(intermediatePath, authorizableId, colonOperation, currentPassword, newPassword, rePassword, keyPassword, keyStorePass, alias, newAlias, removeAlias, certChain, pk, keyStore, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "postAuthorizableKeystore");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("postAuthorizableKeystore", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for postAuthorizables
        vertx.eventBus().<JsonObject> consumer(POSTAUTHORIZABLES_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "postAuthorizables";
                String authorizableIdParam = message.body().getString("authorizableId");
                if(authorizableIdParam == null) {
                    manageError(message, new MainApiException(400, "authorizableId is required"), serviceId);
                    return;
                }
                String authorizableId = authorizableIdParam;
                String intermediatePathParam = message.body().getString("intermediatePath");
                if(intermediatePathParam == null) {
                    manageError(message, new MainApiException(400, "intermediatePath is required"), serviceId);
                    return;
                }
                String intermediatePath = intermediatePathParam;
                String createUserParam = message.body().getString("createUser");
                String createUser = (createUserParam == null) ? null : createUserParam;
                String createGroupParam = message.body().getString("createGroup");
                String createGroup = (createGroupParam == null) ? null : createGroupParam;
                String repColonPasswordParam = message.body().getString("rep:password");
                String repColonPassword = (repColonPasswordParam == null) ? null : repColonPasswordParam;
                String profileSlashGivenNameParam = message.body().getString("profile/givenName");
                String profileSlashGivenName = (profileSlashGivenNameParam == null) ? null : profileSlashGivenNameParam;
                service.postAuthorizables(authorizableId, intermediatePath, createUser, createGroup, repColonPassword, profileSlashGivenName, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "postAuthorizables");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("postAuthorizables", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for postConfigAdobeGraniteSamlAuthenticationHandler
        vertx.eventBus().<JsonObject> consumer(POSTCONFIGADOBEGRANITESAMLAUTHENTICATIONHANDLER_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "postConfigAdobeGraniteSamlAuthenticationHandler";
                String keyStorePasswordParam = message.body().getString("keyStorePassword");
                String keyStorePassword = (keyStorePasswordParam == null) ? null : keyStorePasswordParam;
                String keyStorePasswordAtTypeHintParam = message.body().getString("keyStorePassword@TypeHint");
                String keyStorePasswordAtTypeHint = (keyStorePasswordAtTypeHintParam == null) ? null : keyStorePasswordAtTypeHintParam;
                String serviceRankingParam = message.body().getString("service.ranking");
                Integer serviceRanking = (serviceRankingParam == null) ? null : Json.mapper.readValue(serviceRankingParam, Integer.class);
                String serviceRankingAtTypeHintParam = message.body().getString("service.ranking@TypeHint");
                String serviceRankingAtTypeHint = (serviceRankingAtTypeHintParam == null) ? null : serviceRankingAtTypeHintParam;
                String idpHttpRedirectParam = message.body().getString("idpHttpRedirect");
                Boolean idpHttpRedirect = (idpHttpRedirectParam == null) ? null : Json.mapper.readValue(idpHttpRedirectParam, Boolean.class);
                String idpHttpRedirectAtTypeHintParam = message.body().getString("idpHttpRedirect@TypeHint");
                String idpHttpRedirectAtTypeHint = (idpHttpRedirectAtTypeHintParam == null) ? null : idpHttpRedirectAtTypeHintParam;
                String createUserParam = message.body().getString("createUser");
                Boolean createUser = (createUserParam == null) ? null : Json.mapper.readValue(createUserParam, Boolean.class);
                String createUserAtTypeHintParam = message.body().getString("createUser@TypeHint");
                String createUserAtTypeHint = (createUserAtTypeHintParam == null) ? null : createUserAtTypeHintParam;
                String defaultRedirectUrlParam = message.body().getString("defaultRedirectUrl");
                String defaultRedirectUrl = (defaultRedirectUrlParam == null) ? null : defaultRedirectUrlParam;
                String defaultRedirectUrlAtTypeHintParam = message.body().getString("defaultRedirectUrl@TypeHint");
                String defaultRedirectUrlAtTypeHint = (defaultRedirectUrlAtTypeHintParam == null) ? null : defaultRedirectUrlAtTypeHintParam;
                String userIDAttributeParam = message.body().getString("userIDAttribute");
                String userIDAttribute = (userIDAttributeParam == null) ? null : userIDAttributeParam;
                String userIDAttributeAtTypeHintParam = message.body().getString("userIDAttribute@TypeHint");
                String userIDAttributeAtTypeHint = (userIDAttributeAtTypeHintParam == null) ? null : userIDAttributeAtTypeHintParam;
                JsonArray defaultGroupsParam = message.body().getJsonArray("defaultGroups");
                List<String> defaultGroups = (defaultGroupsParam == null) ? null : Json.mapper.readValue(defaultGroupsParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, String.class));
                String defaultGroupsAtTypeHintParam = message.body().getString("defaultGroups@TypeHint");
                String defaultGroupsAtTypeHint = (defaultGroupsAtTypeHintParam == null) ? null : defaultGroupsAtTypeHintParam;
                String idpCertAliasParam = message.body().getString("idpCertAlias");
                String idpCertAlias = (idpCertAliasParam == null) ? null : idpCertAliasParam;
                String idpCertAliasAtTypeHintParam = message.body().getString("idpCertAlias@TypeHint");
                String idpCertAliasAtTypeHint = (idpCertAliasAtTypeHintParam == null) ? null : idpCertAliasAtTypeHintParam;
                String addGroupMembershipsParam = message.body().getString("addGroupMemberships");
                Boolean addGroupMemberships = (addGroupMembershipsParam == null) ? null : Json.mapper.readValue(addGroupMembershipsParam, Boolean.class);
                String addGroupMembershipsAtTypeHintParam = message.body().getString("addGroupMemberships@TypeHint");
                String addGroupMembershipsAtTypeHint = (addGroupMembershipsAtTypeHintParam == null) ? null : addGroupMembershipsAtTypeHintParam;
                JsonArray pathParam = message.body().getJsonArray("path");
                List<String> path = (pathParam == null) ? null : Json.mapper.readValue(pathParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, String.class));
                String pathAtTypeHintParam = message.body().getString("path@TypeHint");
                String pathAtTypeHint = (pathAtTypeHintParam == null) ? null : pathAtTypeHintParam;
                JsonArray synchronizeAttributesParam = message.body().getJsonArray("synchronizeAttributes");
                List<String> synchronizeAttributes = (synchronizeAttributesParam == null) ? null : Json.mapper.readValue(synchronizeAttributesParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, String.class));
                String synchronizeAttributesAtTypeHintParam = message.body().getString("synchronizeAttributes@TypeHint");
                String synchronizeAttributesAtTypeHint = (synchronizeAttributesAtTypeHintParam == null) ? null : synchronizeAttributesAtTypeHintParam;
                String clockToleranceParam = message.body().getString("clockTolerance");
                Integer clockTolerance = (clockToleranceParam == null) ? null : Json.mapper.readValue(clockToleranceParam, Integer.class);
                String clockToleranceAtTypeHintParam = message.body().getString("clockTolerance@TypeHint");
                String clockToleranceAtTypeHint = (clockToleranceAtTypeHintParam == null) ? null : clockToleranceAtTypeHintParam;
                String groupMembershipAttributeParam = message.body().getString("groupMembershipAttribute");
                String groupMembershipAttribute = (groupMembershipAttributeParam == null) ? null : groupMembershipAttributeParam;
                String groupMembershipAttributeAtTypeHintParam = message.body().getString("groupMembershipAttribute@TypeHint");
                String groupMembershipAttributeAtTypeHint = (groupMembershipAttributeAtTypeHintParam == null) ? null : groupMembershipAttributeAtTypeHintParam;
                String idpUrlParam = message.body().getString("idpUrl");
                String idpUrl = (idpUrlParam == null) ? null : idpUrlParam;
                String idpUrlAtTypeHintParam = message.body().getString("idpUrl@TypeHint");
                String idpUrlAtTypeHint = (idpUrlAtTypeHintParam == null) ? null : idpUrlAtTypeHintParam;
                String logoutUrlParam = message.body().getString("logoutUrl");
                String logoutUrl = (logoutUrlParam == null) ? null : logoutUrlParam;
                String logoutUrlAtTypeHintParam = message.body().getString("logoutUrl@TypeHint");
                String logoutUrlAtTypeHint = (logoutUrlAtTypeHintParam == null) ? null : logoutUrlAtTypeHintParam;
                String serviceProviderEntityIdParam = message.body().getString("serviceProviderEntityId");
                String serviceProviderEntityId = (serviceProviderEntityIdParam == null) ? null : serviceProviderEntityIdParam;
                String serviceProviderEntityIdAtTypeHintParam = message.body().getString("serviceProviderEntityId@TypeHint");
                String serviceProviderEntityIdAtTypeHint = (serviceProviderEntityIdAtTypeHintParam == null) ? null : serviceProviderEntityIdAtTypeHintParam;
                String assertionConsumerServiceURLParam = message.body().getString("assertionConsumerServiceURL");
                String assertionConsumerServiceURL = (assertionConsumerServiceURLParam == null) ? null : assertionConsumerServiceURLParam;
                String assertionConsumerServiceURLAtTypeHintParam = message.body().getString("assertionConsumerServiceURL@TypeHint");
                String assertionConsumerServiceURLAtTypeHint = (assertionConsumerServiceURLAtTypeHintParam == null) ? null : assertionConsumerServiceURLAtTypeHintParam;
                String handleLogoutParam = message.body().getString("handleLogout");
                Boolean handleLogout = (handleLogoutParam == null) ? null : Json.mapper.readValue(handleLogoutParam, Boolean.class);
                String handleLogoutAtTypeHintParam = message.body().getString("handleLogout@TypeHint");
                String handleLogoutAtTypeHint = (handleLogoutAtTypeHintParam == null) ? null : handleLogoutAtTypeHintParam;
                String spPrivateKeyAliasParam = message.body().getString("spPrivateKeyAlias");
                String spPrivateKeyAlias = (spPrivateKeyAliasParam == null) ? null : spPrivateKeyAliasParam;
                String spPrivateKeyAliasAtTypeHintParam = message.body().getString("spPrivateKeyAlias@TypeHint");
                String spPrivateKeyAliasAtTypeHint = (spPrivateKeyAliasAtTypeHintParam == null) ? null : spPrivateKeyAliasAtTypeHintParam;
                String useEncryptionParam = message.body().getString("useEncryption");
                Boolean useEncryption = (useEncryptionParam == null) ? null : Json.mapper.readValue(useEncryptionParam, Boolean.class);
                String useEncryptionAtTypeHintParam = message.body().getString("useEncryption@TypeHint");
                String useEncryptionAtTypeHint = (useEncryptionAtTypeHintParam == null) ? null : useEncryptionAtTypeHintParam;
                String nameIdFormatParam = message.body().getString("nameIdFormat");
                String nameIdFormat = (nameIdFormatParam == null) ? null : nameIdFormatParam;
                String nameIdFormatAtTypeHintParam = message.body().getString("nameIdFormat@TypeHint");
                String nameIdFormatAtTypeHint = (nameIdFormatAtTypeHintParam == null) ? null : nameIdFormatAtTypeHintParam;
                String digestMethodParam = message.body().getString("digestMethod");
                String digestMethod = (digestMethodParam == null) ? null : digestMethodParam;
                String digestMethodAtTypeHintParam = message.body().getString("digestMethod@TypeHint");
                String digestMethodAtTypeHint = (digestMethodAtTypeHintParam == null) ? null : digestMethodAtTypeHintParam;
                String signatureMethodParam = message.body().getString("signatureMethod");
                String signatureMethod = (signatureMethodParam == null) ? null : signatureMethodParam;
                String signatureMethodAtTypeHintParam = message.body().getString("signatureMethod@TypeHint");
                String signatureMethodAtTypeHint = (signatureMethodAtTypeHintParam == null) ? null : signatureMethodAtTypeHintParam;
                String userIntermediatePathParam = message.body().getString("userIntermediatePath");
                String userIntermediatePath = (userIntermediatePathParam == null) ? null : userIntermediatePathParam;
                String userIntermediatePathAtTypeHintParam = message.body().getString("userIntermediatePath@TypeHint");
                String userIntermediatePathAtTypeHint = (userIntermediatePathAtTypeHintParam == null) ? null : userIntermediatePathAtTypeHintParam;
                service.postConfigAdobeGraniteSamlAuthenticationHandler(keyStorePassword, keyStorePasswordAtTypeHint, serviceRanking, serviceRankingAtTypeHint, idpHttpRedirect, idpHttpRedirectAtTypeHint, createUser, createUserAtTypeHint, defaultRedirectUrl, defaultRedirectUrlAtTypeHint, userIDAttribute, userIDAttributeAtTypeHint, defaultGroups, defaultGroupsAtTypeHint, idpCertAlias, idpCertAliasAtTypeHint, addGroupMemberships, addGroupMembershipsAtTypeHint, path, pathAtTypeHint, synchronizeAttributes, synchronizeAttributesAtTypeHint, clockTolerance, clockToleranceAtTypeHint, groupMembershipAttribute, groupMembershipAttributeAtTypeHint, idpUrl, idpUrlAtTypeHint, logoutUrl, logoutUrlAtTypeHint, serviceProviderEntityId, serviceProviderEntityIdAtTypeHint, assertionConsumerServiceURL, assertionConsumerServiceURLAtTypeHint, handleLogout, handleLogoutAtTypeHint, spPrivateKeyAlias, spPrivateKeyAliasAtTypeHint, useEncryption, useEncryptionAtTypeHint, nameIdFormat, nameIdFormatAtTypeHint, digestMethod, digestMethodAtTypeHint, signatureMethod, signatureMethodAtTypeHint, userIntermediatePath, userIntermediatePathAtTypeHint, result -> {
                    if (result.succeeded())
                        message.reply(null);
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "postConfigAdobeGraniteSamlAuthenticationHandler");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("postConfigAdobeGraniteSamlAuthenticationHandler", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for postConfigApacheFelixJettyBasedHttpService
        vertx.eventBus().<JsonObject> consumer(POSTCONFIGAPACHEFELIXJETTYBASEDHTTPSERVICE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "postConfigApacheFelixJettyBasedHttpService";
                String orgApacheFelixHttpsNioParam = message.body().getString("org.apache.felix.https.nio");
                Boolean orgApacheFelixHttpsNio = (orgApacheFelixHttpsNioParam == null) ? null : Json.mapper.readValue(orgApacheFelixHttpsNioParam, Boolean.class);
                String orgApacheFelixHttpsNioAtTypeHintParam = message.body().getString("org.apache.felix.https.nio@TypeHint");
                String orgApacheFelixHttpsNioAtTypeHint = (orgApacheFelixHttpsNioAtTypeHintParam == null) ? null : orgApacheFelixHttpsNioAtTypeHintParam;
                String orgApacheFelixHttpsKeystoreParam = message.body().getString("org.apache.felix.https.keystore");
                String orgApacheFelixHttpsKeystore = (orgApacheFelixHttpsKeystoreParam == null) ? null : orgApacheFelixHttpsKeystoreParam;
                String orgApacheFelixHttpsKeystoreAtTypeHintParam = message.body().getString("org.apache.felix.https.keystore@TypeHint");
                String orgApacheFelixHttpsKeystoreAtTypeHint = (orgApacheFelixHttpsKeystoreAtTypeHintParam == null) ? null : orgApacheFelixHttpsKeystoreAtTypeHintParam;
                String orgApacheFelixHttpsKeystorePasswordParam = message.body().getString("org.apache.felix.https.keystore.password");
                String orgApacheFelixHttpsKeystorePassword = (orgApacheFelixHttpsKeystorePasswordParam == null) ? null : orgApacheFelixHttpsKeystorePasswordParam;
                String orgApacheFelixHttpsKeystorePasswordAtTypeHintParam = message.body().getString("org.apache.felix.https.keystore.password@TypeHint");
                String orgApacheFelixHttpsKeystorePasswordAtTypeHint = (orgApacheFelixHttpsKeystorePasswordAtTypeHintParam == null) ? null : orgApacheFelixHttpsKeystorePasswordAtTypeHintParam;
                String orgApacheFelixHttpsKeystoreKeyParam = message.body().getString("org.apache.felix.https.keystore.key");
                String orgApacheFelixHttpsKeystoreKey = (orgApacheFelixHttpsKeystoreKeyParam == null) ? null : orgApacheFelixHttpsKeystoreKeyParam;
                String orgApacheFelixHttpsKeystoreKeyAtTypeHintParam = message.body().getString("org.apache.felix.https.keystore.key@TypeHint");
                String orgApacheFelixHttpsKeystoreKeyAtTypeHint = (orgApacheFelixHttpsKeystoreKeyAtTypeHintParam == null) ? null : orgApacheFelixHttpsKeystoreKeyAtTypeHintParam;
                String orgApacheFelixHttpsKeystoreKeyPasswordParam = message.body().getString("org.apache.felix.https.keystore.key.password");
                String orgApacheFelixHttpsKeystoreKeyPassword = (orgApacheFelixHttpsKeystoreKeyPasswordParam == null) ? null : orgApacheFelixHttpsKeystoreKeyPasswordParam;
                String orgApacheFelixHttpsKeystoreKeyPasswordAtTypeHintParam = message.body().getString("org.apache.felix.https.keystore.key.password@TypeHint");
                String orgApacheFelixHttpsKeystoreKeyPasswordAtTypeHint = (orgApacheFelixHttpsKeystoreKeyPasswordAtTypeHintParam == null) ? null : orgApacheFelixHttpsKeystoreKeyPasswordAtTypeHintParam;
                String orgApacheFelixHttpsTruststoreParam = message.body().getString("org.apache.felix.https.truststore");
                String orgApacheFelixHttpsTruststore = (orgApacheFelixHttpsTruststoreParam == null) ? null : orgApacheFelixHttpsTruststoreParam;
                String orgApacheFelixHttpsTruststoreAtTypeHintParam = message.body().getString("org.apache.felix.https.truststore@TypeHint");
                String orgApacheFelixHttpsTruststoreAtTypeHint = (orgApacheFelixHttpsTruststoreAtTypeHintParam == null) ? null : orgApacheFelixHttpsTruststoreAtTypeHintParam;
                String orgApacheFelixHttpsTruststorePasswordParam = message.body().getString("org.apache.felix.https.truststore.password");
                String orgApacheFelixHttpsTruststorePassword = (orgApacheFelixHttpsTruststorePasswordParam == null) ? null : orgApacheFelixHttpsTruststorePasswordParam;
                String orgApacheFelixHttpsTruststorePasswordAtTypeHintParam = message.body().getString("org.apache.felix.https.truststore.password@TypeHint");
                String orgApacheFelixHttpsTruststorePasswordAtTypeHint = (orgApacheFelixHttpsTruststorePasswordAtTypeHintParam == null) ? null : orgApacheFelixHttpsTruststorePasswordAtTypeHintParam;
                String orgApacheFelixHttpsClientcertificateParam = message.body().getString("org.apache.felix.https.clientcertificate");
                String orgApacheFelixHttpsClientcertificate = (orgApacheFelixHttpsClientcertificateParam == null) ? null : orgApacheFelixHttpsClientcertificateParam;
                String orgApacheFelixHttpsClientcertificateAtTypeHintParam = message.body().getString("org.apache.felix.https.clientcertificate@TypeHint");
                String orgApacheFelixHttpsClientcertificateAtTypeHint = (orgApacheFelixHttpsClientcertificateAtTypeHintParam == null) ? null : orgApacheFelixHttpsClientcertificateAtTypeHintParam;
                String orgApacheFelixHttpsEnableParam = message.body().getString("org.apache.felix.https.enable");
                Boolean orgApacheFelixHttpsEnable = (orgApacheFelixHttpsEnableParam == null) ? null : Json.mapper.readValue(orgApacheFelixHttpsEnableParam, Boolean.class);
                String orgApacheFelixHttpsEnableAtTypeHintParam = message.body().getString("org.apache.felix.https.enable@TypeHint");
                String orgApacheFelixHttpsEnableAtTypeHint = (orgApacheFelixHttpsEnableAtTypeHintParam == null) ? null : orgApacheFelixHttpsEnableAtTypeHintParam;
                String orgOsgiServiceHttpPortSecureParam = message.body().getString("org.osgi.service.http.port.secure");
                String orgOsgiServiceHttpPortSecure = (orgOsgiServiceHttpPortSecureParam == null) ? null : orgOsgiServiceHttpPortSecureParam;
                String orgOsgiServiceHttpPortSecureAtTypeHintParam = message.body().getString("org.osgi.service.http.port.secure@TypeHint");
                String orgOsgiServiceHttpPortSecureAtTypeHint = (orgOsgiServiceHttpPortSecureAtTypeHintParam == null) ? null : orgOsgiServiceHttpPortSecureAtTypeHintParam;
                service.postConfigApacheFelixJettyBasedHttpService(orgApacheFelixHttpsNio, orgApacheFelixHttpsNioAtTypeHint, orgApacheFelixHttpsKeystore, orgApacheFelixHttpsKeystoreAtTypeHint, orgApacheFelixHttpsKeystorePassword, orgApacheFelixHttpsKeystorePasswordAtTypeHint, orgApacheFelixHttpsKeystoreKey, orgApacheFelixHttpsKeystoreKeyAtTypeHint, orgApacheFelixHttpsKeystoreKeyPassword, orgApacheFelixHttpsKeystoreKeyPasswordAtTypeHint, orgApacheFelixHttpsTruststore, orgApacheFelixHttpsTruststoreAtTypeHint, orgApacheFelixHttpsTruststorePassword, orgApacheFelixHttpsTruststorePasswordAtTypeHint, orgApacheFelixHttpsClientcertificate, orgApacheFelixHttpsClientcertificateAtTypeHint, orgApacheFelixHttpsEnable, orgApacheFelixHttpsEnableAtTypeHint, orgOsgiServiceHttpPortSecure, orgOsgiServiceHttpPortSecureAtTypeHint, result -> {
                    if (result.succeeded())
                        message.reply(null);
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "postConfigApacheFelixJettyBasedHttpService");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("postConfigApacheFelixJettyBasedHttpService", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for postConfigApacheHttpComponentsProxyConfiguration
        vertx.eventBus().<JsonObject> consumer(POSTCONFIGAPACHEHTTPCOMPONENTSPROXYCONFIGURATION_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "postConfigApacheHttpComponentsProxyConfiguration";
                String proxyHostParam = message.body().getString("proxy.host");
                String proxyHost = (proxyHostParam == null) ? null : proxyHostParam;
                String proxyHostAtTypeHintParam = message.body().getString("proxy.host@TypeHint");
                String proxyHostAtTypeHint = (proxyHostAtTypeHintParam == null) ? null : proxyHostAtTypeHintParam;
                String proxyPortParam = message.body().getString("proxy.port");
                Integer proxyPort = (proxyPortParam == null) ? null : Json.mapper.readValue(proxyPortParam, Integer.class);
                String proxyPortAtTypeHintParam = message.body().getString("proxy.port@TypeHint");
                String proxyPortAtTypeHint = (proxyPortAtTypeHintParam == null) ? null : proxyPortAtTypeHintParam;
                JsonArray proxyExceptionsParam = message.body().getJsonArray("proxy.exceptions");
                List<String> proxyExceptions = (proxyExceptionsParam == null) ? null : Json.mapper.readValue(proxyExceptionsParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, String.class));
                String proxyExceptionsAtTypeHintParam = message.body().getString("proxy.exceptions@TypeHint");
                String proxyExceptionsAtTypeHint = (proxyExceptionsAtTypeHintParam == null) ? null : proxyExceptionsAtTypeHintParam;
                String proxyEnabledParam = message.body().getString("proxy.enabled");
                Boolean proxyEnabled = (proxyEnabledParam == null) ? null : Json.mapper.readValue(proxyEnabledParam, Boolean.class);
                String proxyEnabledAtTypeHintParam = message.body().getString("proxy.enabled@TypeHint");
                String proxyEnabledAtTypeHint = (proxyEnabledAtTypeHintParam == null) ? null : proxyEnabledAtTypeHintParam;
                String proxyUserParam = message.body().getString("proxy.user");
                String proxyUser = (proxyUserParam == null) ? null : proxyUserParam;
                String proxyUserAtTypeHintParam = message.body().getString("proxy.user@TypeHint");
                String proxyUserAtTypeHint = (proxyUserAtTypeHintParam == null) ? null : proxyUserAtTypeHintParam;
                String proxyPasswordParam = message.body().getString("proxy.password");
                String proxyPassword = (proxyPasswordParam == null) ? null : proxyPasswordParam;
                String proxyPasswordAtTypeHintParam = message.body().getString("proxy.password@TypeHint");
                String proxyPasswordAtTypeHint = (proxyPasswordAtTypeHintParam == null) ? null : proxyPasswordAtTypeHintParam;
                service.postConfigApacheHttpComponentsProxyConfiguration(proxyHost, proxyHostAtTypeHint, proxyPort, proxyPortAtTypeHint, proxyExceptions, proxyExceptionsAtTypeHint, proxyEnabled, proxyEnabledAtTypeHint, proxyUser, proxyUserAtTypeHint, proxyPassword, proxyPasswordAtTypeHint, result -> {
                    if (result.succeeded())
                        message.reply(null);
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "postConfigApacheHttpComponentsProxyConfiguration");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("postConfigApacheHttpComponentsProxyConfiguration", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for postConfigApacheSlingDavExServlet
        vertx.eventBus().<JsonObject> consumer(POSTCONFIGAPACHESLINGDAVEXSERVLET_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "postConfigApacheSlingDavExServlet";
                String aliasParam = message.body().getString("alias");
                String alias = (aliasParam == null) ? null : aliasParam;
                String aliasAtTypeHintParam = message.body().getString("alias@TypeHint");
                String aliasAtTypeHint = (aliasAtTypeHintParam == null) ? null : aliasAtTypeHintParam;
                String davCreateAbsoluteUriParam = message.body().getString("dav.create-absolute-uri");
                Boolean davCreateAbsoluteUri = (davCreateAbsoluteUriParam == null) ? null : Json.mapper.readValue(davCreateAbsoluteUriParam, Boolean.class);
                String davCreateAbsoluteUriAtTypeHintParam = message.body().getString("dav.create-absolute-uri@TypeHint");
                String davCreateAbsoluteUriAtTypeHint = (davCreateAbsoluteUriAtTypeHintParam == null) ? null : davCreateAbsoluteUriAtTypeHintParam;
                service.postConfigApacheSlingDavExServlet(alias, aliasAtTypeHint, davCreateAbsoluteUri, davCreateAbsoluteUriAtTypeHint, result -> {
                    if (result.succeeded())
                        message.reply(null);
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "postConfigApacheSlingDavExServlet");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("postConfigApacheSlingDavExServlet", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for postConfigApacheSlingGetServlet
        vertx.eventBus().<JsonObject> consumer(POSTCONFIGAPACHESLINGGETSERVLET_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "postConfigApacheSlingGetServlet";
                String jsonMaximumresultsParam = message.body().getString("json.maximumresults");
                String jsonMaximumresults = (jsonMaximumresultsParam == null) ? null : jsonMaximumresultsParam;
                String jsonMaximumresultsAtTypeHintParam = message.body().getString("json.maximumresults@TypeHint");
                String jsonMaximumresultsAtTypeHint = (jsonMaximumresultsAtTypeHintParam == null) ? null : jsonMaximumresultsAtTypeHintParam;
                String enableHtmlParam = message.body().getString("enable.html");
                Boolean enableHtml = (enableHtmlParam == null) ? null : Json.mapper.readValue(enableHtmlParam, Boolean.class);
                String enableHtmlAtTypeHintParam = message.body().getString("enable.html@TypeHint");
                String enableHtmlAtTypeHint = (enableHtmlAtTypeHintParam == null) ? null : enableHtmlAtTypeHintParam;
                String enableTxtParam = message.body().getString("enable.txt");
                Boolean enableTxt = (enableTxtParam == null) ? null : Json.mapper.readValue(enableTxtParam, Boolean.class);
                String enableTxtAtTypeHintParam = message.body().getString("enable.txt@TypeHint");
                String enableTxtAtTypeHint = (enableTxtAtTypeHintParam == null) ? null : enableTxtAtTypeHintParam;
                String enableXmlParam = message.body().getString("enable.xml");
                Boolean enableXml = (enableXmlParam == null) ? null : Json.mapper.readValue(enableXmlParam, Boolean.class);
                String enableXmlAtTypeHintParam = message.body().getString("enable.xml@TypeHint");
                String enableXmlAtTypeHint = (enableXmlAtTypeHintParam == null) ? null : enableXmlAtTypeHintParam;
                service.postConfigApacheSlingGetServlet(jsonMaximumresults, jsonMaximumresultsAtTypeHint, enableHtml, enableHtmlAtTypeHint, enableTxt, enableTxtAtTypeHint, enableXml, enableXmlAtTypeHint, result -> {
                    if (result.succeeded())
                        message.reply(null);
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "postConfigApacheSlingGetServlet");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("postConfigApacheSlingGetServlet", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for postConfigApacheSlingReferrerFilter
        vertx.eventBus().<JsonObject> consumer(POSTCONFIGAPACHESLINGREFERRERFILTER_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "postConfigApacheSlingReferrerFilter";
                String allowEmptyParam = message.body().getString("allow.empty");
                Boolean allowEmpty = (allowEmptyParam == null) ? null : Json.mapper.readValue(allowEmptyParam, Boolean.class);
                String allowEmptyAtTypeHintParam = message.body().getString("allow.empty@TypeHint");
                String allowEmptyAtTypeHint = (allowEmptyAtTypeHintParam == null) ? null : allowEmptyAtTypeHintParam;
                String allowHostsParam = message.body().getString("allow.hosts");
                String allowHosts = (allowHostsParam == null) ? null : allowHostsParam;
                String allowHostsAtTypeHintParam = message.body().getString("allow.hosts@TypeHint");
                String allowHostsAtTypeHint = (allowHostsAtTypeHintParam == null) ? null : allowHostsAtTypeHintParam;
                String allowHostsRegexpParam = message.body().getString("allow.hosts.regexp");
                String allowHostsRegexp = (allowHostsRegexpParam == null) ? null : allowHostsRegexpParam;
                String allowHostsRegexpAtTypeHintParam = message.body().getString("allow.hosts.regexp@TypeHint");
                String allowHostsRegexpAtTypeHint = (allowHostsRegexpAtTypeHintParam == null) ? null : allowHostsRegexpAtTypeHintParam;
                String filterMethodsParam = message.body().getString("filter.methods");
                String filterMethods = (filterMethodsParam == null) ? null : filterMethodsParam;
                String filterMethodsAtTypeHintParam = message.body().getString("filter.methods@TypeHint");
                String filterMethodsAtTypeHint = (filterMethodsAtTypeHintParam == null) ? null : filterMethodsAtTypeHintParam;
                service.postConfigApacheSlingReferrerFilter(allowEmpty, allowEmptyAtTypeHint, allowHosts, allowHostsAtTypeHint, allowHostsRegexp, allowHostsRegexpAtTypeHint, filterMethods, filterMethodsAtTypeHint, result -> {
                    if (result.succeeded())
                        message.reply(null);
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "postConfigApacheSlingReferrerFilter");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("postConfigApacheSlingReferrerFilter", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for postNode
        vertx.eventBus().<JsonObject> consumer(POSTNODE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "postNode";
                String pathParam = message.body().getString("path");
                if(pathParam == null) {
                    manageError(message, new MainApiException(400, "path is required"), serviceId);
                    return;
                }
                String path = pathParam;
                String nameParam = message.body().getString("name");
                if(nameParam == null) {
                    manageError(message, new MainApiException(400, "name is required"), serviceId);
                    return;
                }
                String name = nameParam;
                String colonOperationParam = message.body().getString(":operation");
                String colonOperation = (colonOperationParam == null) ? null : colonOperationParam;
                String deleteAuthorizableParam = message.body().getString("deleteAuthorizable");
                String deleteAuthorizable = (deleteAuthorizableParam == null) ? null : deleteAuthorizableParam;
                String fileParam = message.body().getString("file");
                File file = (fileParam == null) ? null : Json.mapper.readValue(fileParam, File.class);
                service.postNode(path, name, colonOperation, deleteAuthorizable, file, result -> {
                    if (result.succeeded())
                        message.reply(null);
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "postNode");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("postNode", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for postNodeRw
        vertx.eventBus().<JsonObject> consumer(POSTNODERW_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "postNodeRw";
                String pathParam = message.body().getString("path");
                if(pathParam == null) {
                    manageError(message, new MainApiException(400, "path is required"), serviceId);
                    return;
                }
                String path = pathParam;
                String nameParam = message.body().getString("name");
                if(nameParam == null) {
                    manageError(message, new MainApiException(400, "name is required"), serviceId);
                    return;
                }
                String name = nameParam;
                String addMembersParam = message.body().getString("addMembers");
                String addMembers = (addMembersParam == null) ? null : addMembersParam;
                service.postNodeRw(path, name, addMembers, result -> {
                    if (result.succeeded())
                        message.reply(null);
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "postNodeRw");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("postNodeRw", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for postPath
        vertx.eventBus().<JsonObject> consumer(POSTPATH_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "postPath";
                String pathParam = message.body().getString("path");
                if(pathParam == null) {
                    manageError(message, new MainApiException(400, "path is required"), serviceId);
                    return;
                }
                String path = pathParam;
                String jcrColonPrimaryTypeParam = message.body().getString("jcr:primaryType");
                if(jcrColonPrimaryTypeParam == null) {
                    manageError(message, new MainApiException(400, "jcr:primaryType is required"), serviceId);
                    return;
                }
                String jcrColonPrimaryType = jcrColonPrimaryTypeParam;
                String colonNameParam = message.body().getString(":name");
                if(colonNameParam == null) {
                    manageError(message, new MainApiException(400, ":name is required"), serviceId);
                    return;
                }
                String colonName = colonNameParam;
                service.postPath(path, jcrColonPrimaryType, colonName, result -> {
                    if (result.succeeded())
                        message.reply(null);
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "postPath");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("postPath", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for postQuery
        vertx.eventBus().<JsonObject> consumer(POSTQUERY_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "postQuery";
                String pathParam = message.body().getString("path");
                if(pathParam == null) {
                    manageError(message, new MainApiException(400, "path is required"), serviceId);
                    return;
                }
                String path = pathParam;
                String pLimitParam = message.body().getString("p.limit");
                if(pLimitParam == null) {
                    manageError(message, new MainApiException(400, "p.limit is required"), serviceId);
                    return;
                }
                BigDecimal pLimit = Json.mapper.readValue(pLimitParam, BigDecimal.class);
                String _1propertyParam = message.body().getString("1_property");
                if(_1propertyParam == null) {
                    manageError(message, new MainApiException(400, "1_property is required"), serviceId);
                    return;
                }
                String _1property = _1propertyParam;
                String _1propertyValueParam = message.body().getString("1_property.value");
                if(_1propertyValueParam == null) {
                    manageError(message, new MainApiException(400, "1_property.value is required"), serviceId);
                    return;
                }
                String _1propertyValue = _1propertyValueParam;
                service.postQuery(path, pLimit, _1property, _1propertyValue, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "postQuery");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("postQuery", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for postTreeActivation
        vertx.eventBus().<JsonObject> consumer(POSTTREEACTIVATION_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "postTreeActivation";
                String ignoredeactivatedParam = message.body().getString("ignoredeactivated");
                if(ignoredeactivatedParam == null) {
                    manageError(message, new MainApiException(400, "ignoredeactivated is required"), serviceId);
                    return;
                }
                Boolean ignoredeactivated = Json.mapper.readValue(ignoredeactivatedParam, Boolean.class);
                String onlymodifiedParam = message.body().getString("onlymodified");
                if(onlymodifiedParam == null) {
                    manageError(message, new MainApiException(400, "onlymodified is required"), serviceId);
                    return;
                }
                Boolean onlymodified = Json.mapper.readValue(onlymodifiedParam, Boolean.class);
                String pathParam = message.body().getString("path");
                if(pathParam == null) {
                    manageError(message, new MainApiException(400, "path is required"), serviceId);
                    return;
                }
                String path = pathParam;
                service.postTreeActivation(ignoredeactivated, onlymodified, path, result -> {
                    if (result.succeeded())
                        message.reply(null);
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "postTreeActivation");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("postTreeActivation", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for postTruststore
        vertx.eventBus().<JsonObject> consumer(POSTTRUSTSTORE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "postTruststore";
                String colonOperationParam = message.body().getString(":operation");
                String colonOperation = (colonOperationParam == null) ? null : colonOperationParam;
                String newPasswordParam = message.body().getString("newPassword");
                String newPassword = (newPasswordParam == null) ? null : newPasswordParam;
                String rePasswordParam = message.body().getString("rePassword");
                String rePassword = (rePasswordParam == null) ? null : rePasswordParam;
                String keyStoreTypeParam = message.body().getString("keyStoreType");
                String keyStoreType = (keyStoreTypeParam == null) ? null : keyStoreTypeParam;
                String removeAliasParam = message.body().getString("removeAlias");
                String removeAlias = (removeAliasParam == null) ? null : removeAliasParam;
                String certificateParam = message.body().getString("certificate");
                File certificate = (certificateParam == null) ? null : Json.mapper.readValue(certificateParam, File.class);
                service.postTruststore(colonOperation, newPassword, rePassword, keyStoreType, removeAlias, certificate, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "postTruststore");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("postTruststore", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for postTruststorePKCS12
        vertx.eventBus().<JsonObject> consumer(POSTTRUSTSTOREPKCS12_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "postTruststorePKCS12";
                String truststoreP12Param = message.body().getString("truststore.p12");
                File truststoreP12 = (truststoreP12Param == null) ? null : Json.mapper.readValue(truststoreP12Param, File.class);
                service.postTruststorePKCS12(truststoreP12, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "postTruststorePKCS12");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("postTruststorePKCS12", e);
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
