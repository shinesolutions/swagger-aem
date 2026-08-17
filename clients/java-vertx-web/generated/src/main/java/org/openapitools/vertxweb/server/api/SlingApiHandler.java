package org.openapitools.vertxweb.server.api;

import java.math.BigDecimal;
import io.vertx.ext.web.FileUpload;
import org.openapitools.vertxweb.server.model.KeystoreInfo;
import org.openapitools.vertxweb.server.model.TruststoreInfo;

import com.fasterxml.jackson.core.type.TypeReference;
import io.vertx.core.json.jackson.DatabindCodec;
import io.vertx.ext.web.openapi.RouterBuilder;
import io.vertx.ext.web.validation.RequestParameters;
import io.vertx.ext.web.validation.RequestParameter;
import io.vertx.ext.web.validation.ValidationHandler;
import io.vertx.ext.web.RoutingContext;
import io.vertx.core.json.JsonObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;

public class SlingApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(SlingApiHandler.class);

    private final SlingApi api;

    public SlingApiHandler(SlingApi api) {
        this.api = api;
    }

    @Deprecated
    public SlingApiHandler() {
        this(new SlingApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("deleteAgent").handler(this::deleteAgent);
        builder.operation("deleteNode").handler(this::deleteNode);
        builder.operation("getAgent").handler(this::getAgent);
        builder.operation("getAgents").handler(this::getAgents);
        builder.operation("getAuthorizableKeystore").handler(this::getAuthorizableKeystore);
        builder.operation("getKeystore").handler(this::getKeystore);
        builder.operation("getNode").handler(this::getNode);
        builder.operation("getPackage").handler(this::getPackage);
        builder.operation("getPackageFilter").handler(this::getPackageFilter);
        builder.operation("getQuery").handler(this::getQuery);
        builder.operation("getTruststore").handler(this::getTruststore);
        builder.operation("getTruststoreInfo").handler(this::getTruststoreInfo);
        builder.operation("postAgent").handler(this::postAgent);
        builder.operation("postAuthorizableKeystore").handler(this::postAuthorizableKeystore);
        builder.operation("postAuthorizables").handler(this::postAuthorizables);
        builder.operation("postConfigAdobeGraniteSamlAuthenticationHandler").handler(this::postConfigAdobeGraniteSamlAuthenticationHandler);
        builder.operation("postConfigApacheFelixJettyBasedHttpService").handler(this::postConfigApacheFelixJettyBasedHttpService);
        builder.operation("postConfigApacheHttpComponentsProxyConfiguration").handler(this::postConfigApacheHttpComponentsProxyConfiguration);
        builder.operation("postConfigApacheSlingDavExServlet").handler(this::postConfigApacheSlingDavExServlet);
        builder.operation("postConfigApacheSlingGetServlet").handler(this::postConfigApacheSlingGetServlet);
        builder.operation("postConfigApacheSlingReferrerFilter").handler(this::postConfigApacheSlingReferrerFilter);
        builder.operation("postConfigProperty").handler(this::postConfigProperty);
        builder.operation("postNode").handler(this::postNode);
        builder.operation("postNodeRw").handler(this::postNodeRw);
        builder.operation("postPath").handler(this::postPath);
        builder.operation("postQuery").handler(this::postQuery);
        builder.operation("postTreeActivation").handler(this::postTreeActivation);
        builder.operation("postTruststore").handler(this::postTruststore);
        builder.operation("postTruststorePKCS12").handler(this::postTruststorePKCS12);
    }

    private void deleteAgent(RoutingContext routingContext) {
        logger.info("deleteAgent()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String runmode = requestParameters.pathParameter("runmode") != null ? requestParameters.pathParameter("runmode").getString() : null;
        String name = requestParameters.pathParameter("name") != null ? requestParameters.pathParameter("name").getString() : null;

        logger.debug("Parameter runmode is {}", runmode);
        logger.debug("Parameter name is {}", name);

        api.deleteAgent(runmode, name)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void deleteNode(RoutingContext routingContext) {
        logger.info("deleteNode()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String path = requestParameters.pathParameter("path") != null ? requestParameters.pathParameter("path").getString() : null;
        String name = requestParameters.pathParameter("name") != null ? requestParameters.pathParameter("name").getString() : null;

        logger.debug("Parameter path is {}", path);
        logger.debug("Parameter name is {}", name);

        api.deleteNode(path, name)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void getAgent(RoutingContext routingContext) {
        logger.info("getAgent()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String runmode = requestParameters.pathParameter("runmode") != null ? requestParameters.pathParameter("runmode").getString() : null;
        String name = requestParameters.pathParameter("name") != null ? requestParameters.pathParameter("name").getString() : null;

        logger.debug("Parameter runmode is {}", runmode);
        logger.debug("Parameter name is {}", name);

        api.getAgent(runmode, name)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void getAgents(RoutingContext routingContext) {
        logger.info("getAgents()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String runmode = requestParameters.pathParameter("runmode") != null ? requestParameters.pathParameter("runmode").getString() : null;

        logger.debug("Parameter runmode is {}", runmode);

        api.getAgents(runmode)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void getAuthorizableKeystore(RoutingContext routingContext) {
        logger.info("getAuthorizableKeystore()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String intermediatePath = requestParameters.pathParameter("intermediatePath") != null ? requestParameters.pathParameter("intermediatePath").getString() : null;
        String authorizableId = requestParameters.pathParameter("authorizableId") != null ? requestParameters.pathParameter("authorizableId").getString() : null;

        logger.debug("Parameter intermediatePath is {}", intermediatePath);
        logger.debug("Parameter authorizableId is {}", authorizableId);

        api.getAuthorizableKeystore(intermediatePath, authorizableId)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void getKeystore(RoutingContext routingContext) {
        logger.info("getKeystore()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String intermediatePath = requestParameters.pathParameter("intermediatePath") != null ? requestParameters.pathParameter("intermediatePath").getString() : null;
        String authorizableId = requestParameters.pathParameter("authorizableId") != null ? requestParameters.pathParameter("authorizableId").getString() : null;

        logger.debug("Parameter intermediatePath is {}", intermediatePath);
        logger.debug("Parameter authorizableId is {}", authorizableId);

        api.getKeystore(intermediatePath, authorizableId)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void getNode(RoutingContext routingContext) {
        logger.info("getNode()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String path = requestParameters.pathParameter("path") != null ? requestParameters.pathParameter("path").getString() : null;
        String name = requestParameters.pathParameter("name") != null ? requestParameters.pathParameter("name").getString() : null;

        logger.debug("Parameter path is {}", path);
        logger.debug("Parameter name is {}", name);

        api.getNode(path, name)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void getPackage(RoutingContext routingContext) {
        logger.info("getPackage()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String group = requestParameters.pathParameter("group") != null ? requestParameters.pathParameter("group").getString() : null;
        String name = requestParameters.pathParameter("name") != null ? requestParameters.pathParameter("name").getString() : null;
        String version = requestParameters.pathParameter("version") != null ? requestParameters.pathParameter("version").getString() : null;

        logger.debug("Parameter group is {}", group);
        logger.debug("Parameter name is {}", name);
        logger.debug("Parameter version is {}", version);

        api.getPackage(group, name, version)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void getPackageFilter(RoutingContext routingContext) {
        logger.info("getPackageFilter()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String group = requestParameters.pathParameter("group") != null ? requestParameters.pathParameter("group").getString() : null;
        String name = requestParameters.pathParameter("name") != null ? requestParameters.pathParameter("name").getString() : null;
        String version = requestParameters.pathParameter("version") != null ? requestParameters.pathParameter("version").getString() : null;

        logger.debug("Parameter group is {}", group);
        logger.debug("Parameter name is {}", name);
        logger.debug("Parameter version is {}", version);

        api.getPackageFilter(group, name, version)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void getQuery(RoutingContext routingContext) {
        logger.info("getQuery()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String path = requestParameters.queryParameter("path") != null ? requestParameters.queryParameter("path").getString() : null;
        BigDecimal pLimit = requestParameters.queryParameter("p.limit") != null ? requestParameters.queryParameter("p.limit").getBigDecimal() : null;
        String _1property = requestParameters.queryParameter("1_property") != null ? requestParameters.queryParameter("1_property").getString() : null;
        String _1propertyValue = requestParameters.queryParameter("1_property.value") != null ? requestParameters.queryParameter("1_property.value").getString() : null;

        logger.debug("Parameter path is {}", path);
        logger.debug("Parameter pLimit is {}", pLimit);
        logger.debug("Parameter _1property is {}", _1property);
        logger.debug("Parameter _1propertyValue is {}", _1propertyValue);

        api.getQuery(path, pLimit, _1property, _1propertyValue)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void getTruststore(RoutingContext routingContext) {
        logger.info("getTruststore()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);



        api.getTruststore()
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void getTruststoreInfo(RoutingContext routingContext) {
        logger.info("getTruststoreInfo()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);



        api.getTruststoreInfo()
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void postAgent(RoutingContext routingContext) {
        logger.info("postAgent()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String runmode = requestParameters.pathParameter("runmode") != null ? requestParameters.pathParameter("runmode").getString() : null;
        String name = requestParameters.pathParameter("name") != null ? requestParameters.pathParameter("name").getString() : null;
        Boolean jcrContentCqDistribute = requestParameters.queryParameter("jcr:content/cq:distribute") != null ? requestParameters.queryParameter("jcr:content/cq:distribute").getBoolean() : null;
        String jcrContentCqDistributeAtTypeHint = requestParameters.queryParameter("jcr:content/cq:distribute@TypeHint") != null ? requestParameters.queryParameter("jcr:content/cq:distribute@TypeHint").getString() : null;
        String jcrContentCqName = requestParameters.queryParameter("jcr:content/cq:name") != null ? requestParameters.queryParameter("jcr:content/cq:name").getString() : null;
        String jcrContentCqTemplate = requestParameters.queryParameter("jcr:content/cq:template") != null ? requestParameters.queryParameter("jcr:content/cq:template").getString() : null;
        Boolean jcrContentAliasUpdate = requestParameters.queryParameter("jcr:content/aliasUpdate") != null ? requestParameters.queryParameter("jcr:content/aliasUpdate").getBoolean() : null;
        Boolean jcrContentEnabled = requestParameters.queryParameter("jcr:content/enabled") != null ? requestParameters.queryParameter("jcr:content/enabled").getBoolean() : null;
        String jcrContentJcrDescription = requestParameters.queryParameter("jcr:content/jcr:description") != null ? requestParameters.queryParameter("jcr:content/jcr:description").getString() : null;
        String jcrContentJcrLastModified = requestParameters.queryParameter("jcr:content/jcr:lastModified") != null ? requestParameters.queryParameter("jcr:content/jcr:lastModified").getString() : null;
        String jcrContentJcrLastModifiedBy = requestParameters.queryParameter("jcr:content/jcr:lastModifiedBy") != null ? requestParameters.queryParameter("jcr:content/jcr:lastModifiedBy").getString() : null;
        String jcrContentJcrMixinTypes = requestParameters.queryParameter("jcr:content/jcr:mixinTypes") != null ? requestParameters.queryParameter("jcr:content/jcr:mixinTypes").getString() : null;
        String jcrContentJcrTitle = requestParameters.queryParameter("jcr:content/jcr:title") != null ? requestParameters.queryParameter("jcr:content/jcr:title").getString() : null;
        String jcrContentLogLevel = requestParameters.queryParameter("jcr:content/logLevel") != null ? requestParameters.queryParameter("jcr:content/logLevel").getString() : null;
        Boolean jcrContentNoStatusUpdate = requestParameters.queryParameter("jcr:content/noStatusUpdate") != null ? requestParameters.queryParameter("jcr:content/noStatusUpdate").getBoolean() : null;
        Boolean jcrContentNoVersioning = requestParameters.queryParameter("jcr:content/noVersioning") != null ? requestParameters.queryParameter("jcr:content/noVersioning").getBoolean() : null;
        BigDecimal jcrContentProtocolConnectTimeout = requestParameters.queryParameter("jcr:content/protocolConnectTimeout") != null ? requestParameters.queryParameter("jcr:content/protocolConnectTimeout").getBigDecimal() : null;
        Boolean jcrContentProtocolHTTPConnectionClosed = requestParameters.queryParameter("jcr:content/protocolHTTPConnectionClosed") != null ? requestParameters.queryParameter("jcr:content/protocolHTTPConnectionClosed").getBoolean() : null;
        String jcrContentProtocolHTTPExpired = requestParameters.queryParameter("jcr:content/protocolHTTPExpired") != null ? requestParameters.queryParameter("jcr:content/protocolHTTPExpired").getString() : null;
        List<String> jcrContentProtocolHTTPHeaders = requestParameters.queryParameter("jcr:content/protocolHTTPHeaders") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("jcr:content/protocolHTTPHeaders").get(), new TypeReference<List<String>>(){}) : null;
        String jcrContentProtocolHTTPHeadersAtTypeHint = requestParameters.queryParameter("jcr:content/protocolHTTPHeaders@TypeHint") != null ? requestParameters.queryParameter("jcr:content/protocolHTTPHeaders@TypeHint").getString() : null;
        String jcrContentProtocolHTTPMethod = requestParameters.queryParameter("jcr:content/protocolHTTPMethod") != null ? requestParameters.queryParameter("jcr:content/protocolHTTPMethod").getString() : null;
        Boolean jcrContentProtocolHTTPSRelaxed = requestParameters.queryParameter("jcr:content/protocolHTTPSRelaxed") != null ? requestParameters.queryParameter("jcr:content/protocolHTTPSRelaxed").getBoolean() : null;
        String jcrContentProtocolInterface = requestParameters.queryParameter("jcr:content/protocolInterface") != null ? requestParameters.queryParameter("jcr:content/protocolInterface").getString() : null;
        BigDecimal jcrContentProtocolSocketTimeout = requestParameters.queryParameter("jcr:content/protocolSocketTimeout") != null ? requestParameters.queryParameter("jcr:content/protocolSocketTimeout").getBigDecimal() : null;
        String jcrContentProtocolVersion = requestParameters.queryParameter("jcr:content/protocolVersion") != null ? requestParameters.queryParameter("jcr:content/protocolVersion").getString() : null;
        String jcrContentProxyNTLMDomain = requestParameters.queryParameter("jcr:content/proxyNTLMDomain") != null ? requestParameters.queryParameter("jcr:content/proxyNTLMDomain").getString() : null;
        String jcrContentProxyNTLMHost = requestParameters.queryParameter("jcr:content/proxyNTLMHost") != null ? requestParameters.queryParameter("jcr:content/proxyNTLMHost").getString() : null;
        String jcrContentProxyHost = requestParameters.queryParameter("jcr:content/proxyHost") != null ? requestParameters.queryParameter("jcr:content/proxyHost").getString() : null;
        String jcrContentProxyPassword = requestParameters.queryParameter("jcr:content/proxyPassword") != null ? requestParameters.queryParameter("jcr:content/proxyPassword").getString() : null;
        BigDecimal jcrContentProxyPort = requestParameters.queryParameter("jcr:content/proxyPort") != null ? requestParameters.queryParameter("jcr:content/proxyPort").getBigDecimal() : null;
        String jcrContentProxyUser = requestParameters.queryParameter("jcr:content/proxyUser") != null ? requestParameters.queryParameter("jcr:content/proxyUser").getString() : null;
        BigDecimal jcrContentQueueBatchMaxSize = requestParameters.queryParameter("jcr:content/queueBatchMaxSize") != null ? requestParameters.queryParameter("jcr:content/queueBatchMaxSize").getBigDecimal() : null;
        String jcrContentQueueBatchMode = requestParameters.queryParameter("jcr:content/queueBatchMode") != null ? requestParameters.queryParameter("jcr:content/queueBatchMode").getString() : null;
        BigDecimal jcrContentQueueBatchWaitTime = requestParameters.queryParameter("jcr:content/queueBatchWaitTime") != null ? requestParameters.queryParameter("jcr:content/queueBatchWaitTime").getBigDecimal() : null;
        String jcrContentRetryDelay = requestParameters.queryParameter("jcr:content/retryDelay") != null ? requestParameters.queryParameter("jcr:content/retryDelay").getString() : null;
        Boolean jcrContentReverseReplication = requestParameters.queryParameter("jcr:content/reverseReplication") != null ? requestParameters.queryParameter("jcr:content/reverseReplication").getBoolean() : null;
        String jcrContentSerializationType = requestParameters.queryParameter("jcr:content/serializationType") != null ? requestParameters.queryParameter("jcr:content/serializationType").getString() : null;
        String jcrContentSlingResourceType = requestParameters.queryParameter("jcr:content/sling:resourceType") != null ? requestParameters.queryParameter("jcr:content/sling:resourceType").getString() : null;
        String jcrContentSsl = requestParameters.queryParameter("jcr:content/ssl") != null ? requestParameters.queryParameter("jcr:content/ssl").getString() : null;
        String jcrContentTransportNTLMDomain = requestParameters.queryParameter("jcr:content/transportNTLMDomain") != null ? requestParameters.queryParameter("jcr:content/transportNTLMDomain").getString() : null;
        String jcrContentTransportNTLMHost = requestParameters.queryParameter("jcr:content/transportNTLMHost") != null ? requestParameters.queryParameter("jcr:content/transportNTLMHost").getString() : null;
        String jcrContentTransportPassword = requestParameters.queryParameter("jcr:content/transportPassword") != null ? requestParameters.queryParameter("jcr:content/transportPassword").getString() : null;
        String jcrContentTransportUri = requestParameters.queryParameter("jcr:content/transportUri") != null ? requestParameters.queryParameter("jcr:content/transportUri").getString() : null;
        String jcrContentTransportUser = requestParameters.queryParameter("jcr:content/transportUser") != null ? requestParameters.queryParameter("jcr:content/transportUser").getString() : null;
        Boolean jcrContentTriggerDistribute = requestParameters.queryParameter("jcr:content/triggerDistribute") != null ? requestParameters.queryParameter("jcr:content/triggerDistribute").getBoolean() : null;
        Boolean jcrContentTriggerModified = requestParameters.queryParameter("jcr:content/triggerModified") != null ? requestParameters.queryParameter("jcr:content/triggerModified").getBoolean() : null;
        Boolean jcrContentTriggerOnOffTime = requestParameters.queryParameter("jcr:content/triggerOnOffTime") != null ? requestParameters.queryParameter("jcr:content/triggerOnOffTime").getBoolean() : null;
        Boolean jcrContentTriggerReceive = requestParameters.queryParameter("jcr:content/triggerReceive") != null ? requestParameters.queryParameter("jcr:content/triggerReceive").getBoolean() : null;
        Boolean jcrContentTriggerSpecific = requestParameters.queryParameter("jcr:content/triggerSpecific") != null ? requestParameters.queryParameter("jcr:content/triggerSpecific").getBoolean() : null;
        String jcrContentUserId = requestParameters.queryParameter("jcr:content/userId") != null ? requestParameters.queryParameter("jcr:content/userId").getString() : null;
        String jcrPrimaryType = requestParameters.queryParameter("jcr:primaryType") != null ? requestParameters.queryParameter("jcr:primaryType").getString() : null;
        String operation = requestParameters.queryParameter(":operation") != null ? requestParameters.queryParameter(":operation").getString() : null;

        logger.debug("Parameter runmode is {}", runmode);
        logger.debug("Parameter name is {}", name);
        logger.debug("Parameter jcrContentCqDistribute is {}", jcrContentCqDistribute);
        logger.debug("Parameter jcrContentCqDistributeAtTypeHint is {}", jcrContentCqDistributeAtTypeHint);
        logger.debug("Parameter jcrContentCqName is {}", jcrContentCqName);
        logger.debug("Parameter jcrContentCqTemplate is {}", jcrContentCqTemplate);
        logger.debug("Parameter jcrContentAliasUpdate is {}", jcrContentAliasUpdate);
        logger.debug("Parameter jcrContentEnabled is {}", jcrContentEnabled);
        logger.debug("Parameter jcrContentJcrDescription is {}", jcrContentJcrDescription);
        logger.debug("Parameter jcrContentJcrLastModified is {}", jcrContentJcrLastModified);
        logger.debug("Parameter jcrContentJcrLastModifiedBy is {}", jcrContentJcrLastModifiedBy);
        logger.debug("Parameter jcrContentJcrMixinTypes is {}", jcrContentJcrMixinTypes);
        logger.debug("Parameter jcrContentJcrTitle is {}", jcrContentJcrTitle);
        logger.debug("Parameter jcrContentLogLevel is {}", jcrContentLogLevel);
        logger.debug("Parameter jcrContentNoStatusUpdate is {}", jcrContentNoStatusUpdate);
        logger.debug("Parameter jcrContentNoVersioning is {}", jcrContentNoVersioning);
        logger.debug("Parameter jcrContentProtocolConnectTimeout is {}", jcrContentProtocolConnectTimeout);
        logger.debug("Parameter jcrContentProtocolHTTPConnectionClosed is {}", jcrContentProtocolHTTPConnectionClosed);
        logger.debug("Parameter jcrContentProtocolHTTPExpired is {}", jcrContentProtocolHTTPExpired);
        logger.debug("Parameter jcrContentProtocolHTTPHeaders is {}", jcrContentProtocolHTTPHeaders);
        logger.debug("Parameter jcrContentProtocolHTTPHeadersAtTypeHint is {}", jcrContentProtocolHTTPHeadersAtTypeHint);
        logger.debug("Parameter jcrContentProtocolHTTPMethod is {}", jcrContentProtocolHTTPMethod);
        logger.debug("Parameter jcrContentProtocolHTTPSRelaxed is {}", jcrContentProtocolHTTPSRelaxed);
        logger.debug("Parameter jcrContentProtocolInterface is {}", jcrContentProtocolInterface);
        logger.debug("Parameter jcrContentProtocolSocketTimeout is {}", jcrContentProtocolSocketTimeout);
        logger.debug("Parameter jcrContentProtocolVersion is {}", jcrContentProtocolVersion);
        logger.debug("Parameter jcrContentProxyNTLMDomain is {}", jcrContentProxyNTLMDomain);
        logger.debug("Parameter jcrContentProxyNTLMHost is {}", jcrContentProxyNTLMHost);
        logger.debug("Parameter jcrContentProxyHost is {}", jcrContentProxyHost);
        logger.debug("Parameter jcrContentProxyPassword is {}", jcrContentProxyPassword);
        logger.debug("Parameter jcrContentProxyPort is {}", jcrContentProxyPort);
        logger.debug("Parameter jcrContentProxyUser is {}", jcrContentProxyUser);
        logger.debug("Parameter jcrContentQueueBatchMaxSize is {}", jcrContentQueueBatchMaxSize);
        logger.debug("Parameter jcrContentQueueBatchMode is {}", jcrContentQueueBatchMode);
        logger.debug("Parameter jcrContentQueueBatchWaitTime is {}", jcrContentQueueBatchWaitTime);
        logger.debug("Parameter jcrContentRetryDelay is {}", jcrContentRetryDelay);
        logger.debug("Parameter jcrContentReverseReplication is {}", jcrContentReverseReplication);
        logger.debug("Parameter jcrContentSerializationType is {}", jcrContentSerializationType);
        logger.debug("Parameter jcrContentSlingResourceType is {}", jcrContentSlingResourceType);
        logger.debug("Parameter jcrContentSsl is {}", jcrContentSsl);
        logger.debug("Parameter jcrContentTransportNTLMDomain is {}", jcrContentTransportNTLMDomain);
        logger.debug("Parameter jcrContentTransportNTLMHost is {}", jcrContentTransportNTLMHost);
        logger.debug("Parameter jcrContentTransportPassword is {}", jcrContentTransportPassword);
        logger.debug("Parameter jcrContentTransportUri is {}", jcrContentTransportUri);
        logger.debug("Parameter jcrContentTransportUser is {}", jcrContentTransportUser);
        logger.debug("Parameter jcrContentTriggerDistribute is {}", jcrContentTriggerDistribute);
        logger.debug("Parameter jcrContentTriggerModified is {}", jcrContentTriggerModified);
        logger.debug("Parameter jcrContentTriggerOnOffTime is {}", jcrContentTriggerOnOffTime);
        logger.debug("Parameter jcrContentTriggerReceive is {}", jcrContentTriggerReceive);
        logger.debug("Parameter jcrContentTriggerSpecific is {}", jcrContentTriggerSpecific);
        logger.debug("Parameter jcrContentUserId is {}", jcrContentUserId);
        logger.debug("Parameter jcrPrimaryType is {}", jcrPrimaryType);
        logger.debug("Parameter operation is {}", operation);

        api.postAgent(runmode, name, jcrContentCqDistribute, jcrContentCqDistributeAtTypeHint, jcrContentCqName, jcrContentCqTemplate, jcrContentAliasUpdate, jcrContentEnabled, jcrContentJcrDescription, jcrContentJcrLastModified, jcrContentJcrLastModifiedBy, jcrContentJcrMixinTypes, jcrContentJcrTitle, jcrContentLogLevel, jcrContentNoStatusUpdate, jcrContentNoVersioning, jcrContentProtocolConnectTimeout, jcrContentProtocolHTTPConnectionClosed, jcrContentProtocolHTTPExpired, jcrContentProtocolHTTPHeaders, jcrContentProtocolHTTPHeadersAtTypeHint, jcrContentProtocolHTTPMethod, jcrContentProtocolHTTPSRelaxed, jcrContentProtocolInterface, jcrContentProtocolSocketTimeout, jcrContentProtocolVersion, jcrContentProxyNTLMDomain, jcrContentProxyNTLMHost, jcrContentProxyHost, jcrContentProxyPassword, jcrContentProxyPort, jcrContentProxyUser, jcrContentQueueBatchMaxSize, jcrContentQueueBatchMode, jcrContentQueueBatchWaitTime, jcrContentRetryDelay, jcrContentReverseReplication, jcrContentSerializationType, jcrContentSlingResourceType, jcrContentSsl, jcrContentTransportNTLMDomain, jcrContentTransportNTLMHost, jcrContentTransportPassword, jcrContentTransportUri, jcrContentTransportUser, jcrContentTriggerDistribute, jcrContentTriggerModified, jcrContentTriggerOnOffTime, jcrContentTriggerReceive, jcrContentTriggerSpecific, jcrContentUserId, jcrPrimaryType, operation)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void postAuthorizableKeystore(RoutingContext routingContext) {
        logger.info("postAuthorizableKeystore()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String intermediatePath = requestParameters.pathParameter("intermediatePath") != null ? requestParameters.pathParameter("intermediatePath").getString() : null;
        String authorizableId = requestParameters.pathParameter("authorizableId") != null ? requestParameters.pathParameter("authorizableId").getString() : null;
        String operation = requestParameters.queryParameter(":operation") != null ? requestParameters.queryParameter(":operation").getString() : null;
        String currentPassword = requestParameters.queryParameter("currentPassword") != null ? requestParameters.queryParameter("currentPassword").getString() : null;
        String newPassword = requestParameters.queryParameter("newPassword") != null ? requestParameters.queryParameter("newPassword").getString() : null;
        String rePassword = requestParameters.queryParameter("rePassword") != null ? requestParameters.queryParameter("rePassword").getString() : null;
        String keyPassword = requestParameters.queryParameter("keyPassword") != null ? requestParameters.queryParameter("keyPassword").getString() : null;
        String keyStorePass = requestParameters.queryParameter("keyStorePass") != null ? requestParameters.queryParameter("keyStorePass").getString() : null;
        String alias = requestParameters.queryParameter("alias") != null ? requestParameters.queryParameter("alias").getString() : null;
        String newAlias = requestParameters.queryParameter("newAlias") != null ? requestParameters.queryParameter("newAlias").getString() : null;
        String removeAlias = requestParameters.queryParameter("removeAlias") != null ? requestParameters.queryParameter("removeAlias").getString() : null;
        FileUpload certChain = routingContext.fileUploads().iterator().next();
        FileUpload pk = routingContext.fileUploads().iterator().next();
        FileUpload keyStore = routingContext.fileUploads().iterator().next();

        logger.debug("Parameter intermediatePath is {}", intermediatePath);
        logger.debug("Parameter authorizableId is {}", authorizableId);
        logger.debug("Parameter operation is {}", operation);
        logger.debug("Parameter currentPassword is {}", currentPassword);
        logger.debug("Parameter newPassword is {}", newPassword);
        logger.debug("Parameter rePassword is {}", rePassword);
        logger.debug("Parameter keyPassword is {}", keyPassword);
        logger.debug("Parameter keyStorePass is {}", keyStorePass);
        logger.debug("Parameter alias is {}", alias);
        logger.debug("Parameter newAlias is {}", newAlias);
        logger.debug("Parameter removeAlias is {}", removeAlias);
        logger.debug("Parameter certChain is {}", certChain);
        logger.debug("Parameter pk is {}", pk);
        logger.debug("Parameter keyStore is {}", keyStore);

        api.postAuthorizableKeystore(intermediatePath, authorizableId, operation, currentPassword, newPassword, rePassword, keyPassword, keyStorePass, alias, newAlias, removeAlias, certChain, pk, keyStore)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void postAuthorizables(RoutingContext routingContext) {
        logger.info("postAuthorizables()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String authorizableId = requestParameters.queryParameter("authorizableId") != null ? requestParameters.queryParameter("authorizableId").getString() : null;
        String intermediatePath = requestParameters.queryParameter("intermediatePath") != null ? requestParameters.queryParameter("intermediatePath").getString() : null;
        String createUser = requestParameters.queryParameter("createUser") != null ? requestParameters.queryParameter("createUser").getString() : null;
        String createGroup = requestParameters.queryParameter("createGroup") != null ? requestParameters.queryParameter("createGroup").getString() : null;
        String repPassword = requestParameters.queryParameter("rep:password") != null ? requestParameters.queryParameter("rep:password").getString() : null;
        String profileGivenName = requestParameters.queryParameter("profile/givenName") != null ? requestParameters.queryParameter("profile/givenName").getString() : null;

        logger.debug("Parameter authorizableId is {}", authorizableId);
        logger.debug("Parameter intermediatePath is {}", intermediatePath);
        logger.debug("Parameter createUser is {}", createUser);
        logger.debug("Parameter createGroup is {}", createGroup);
        logger.debug("Parameter repPassword is {}", repPassword);
        logger.debug("Parameter profileGivenName is {}", profileGivenName);

        api.postAuthorizables(authorizableId, intermediatePath, createUser, createGroup, repPassword, profileGivenName)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void postConfigAdobeGraniteSamlAuthenticationHandler(RoutingContext routingContext) {
        logger.info("postConfigAdobeGraniteSamlAuthenticationHandler()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String keyStorePassword = requestParameters.queryParameter("keyStorePassword") != null ? requestParameters.queryParameter("keyStorePassword").getString() : null;
        String keyStorePasswordAtTypeHint = requestParameters.queryParameter("keyStorePassword@TypeHint") != null ? requestParameters.queryParameter("keyStorePassword@TypeHint").getString() : null;
        Integer serviceRanking = requestParameters.queryParameter("service.ranking") != null ? requestParameters.queryParameter("service.ranking").getInteger() : null;
        String serviceRankingAtTypeHint = requestParameters.queryParameter("service.ranking@TypeHint") != null ? requestParameters.queryParameter("service.ranking@TypeHint").getString() : null;
        Boolean idpHttpRedirect = requestParameters.queryParameter("idpHttpRedirect") != null ? requestParameters.queryParameter("idpHttpRedirect").getBoolean() : null;
        String idpHttpRedirectAtTypeHint = requestParameters.queryParameter("idpHttpRedirect@TypeHint") != null ? requestParameters.queryParameter("idpHttpRedirect@TypeHint").getString() : null;
        Boolean createUser = requestParameters.queryParameter("createUser") != null ? requestParameters.queryParameter("createUser").getBoolean() : null;
        String createUserAtTypeHint = requestParameters.queryParameter("createUser@TypeHint") != null ? requestParameters.queryParameter("createUser@TypeHint").getString() : null;
        String defaultRedirectUrl = requestParameters.queryParameter("defaultRedirectUrl") != null ? requestParameters.queryParameter("defaultRedirectUrl").getString() : null;
        String defaultRedirectUrlAtTypeHint = requestParameters.queryParameter("defaultRedirectUrl@TypeHint") != null ? requestParameters.queryParameter("defaultRedirectUrl@TypeHint").getString() : null;
        String userIDAttribute = requestParameters.queryParameter("userIDAttribute") != null ? requestParameters.queryParameter("userIDAttribute").getString() : null;
        String userIDAttributeAtTypeHint = requestParameters.queryParameter("userIDAttribute@TypeHint") != null ? requestParameters.queryParameter("userIDAttribute@TypeHint").getString() : null;
        List<String> defaultGroups = requestParameters.queryParameter("defaultGroups") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("defaultGroups").get(), new TypeReference<List<String>>(){}) : null;
        String defaultGroupsAtTypeHint = requestParameters.queryParameter("defaultGroups@TypeHint") != null ? requestParameters.queryParameter("defaultGroups@TypeHint").getString() : null;
        String idpCertAlias = requestParameters.queryParameter("idpCertAlias") != null ? requestParameters.queryParameter("idpCertAlias").getString() : null;
        String idpCertAliasAtTypeHint = requestParameters.queryParameter("idpCertAlias@TypeHint") != null ? requestParameters.queryParameter("idpCertAlias@TypeHint").getString() : null;
        Boolean addGroupMemberships = requestParameters.queryParameter("addGroupMemberships") != null ? requestParameters.queryParameter("addGroupMemberships").getBoolean() : null;
        String addGroupMembershipsAtTypeHint = requestParameters.queryParameter("addGroupMemberships@TypeHint") != null ? requestParameters.queryParameter("addGroupMemberships@TypeHint").getString() : null;
        List<String> path = requestParameters.queryParameter("path") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("path").get(), new TypeReference<List<String>>(){}) : null;
        String pathAtTypeHint = requestParameters.queryParameter("path@TypeHint") != null ? requestParameters.queryParameter("path@TypeHint").getString() : null;
        List<String> synchronizeAttributes = requestParameters.queryParameter("synchronizeAttributes") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("synchronizeAttributes").get(), new TypeReference<List<String>>(){}) : null;
        String synchronizeAttributesAtTypeHint = requestParameters.queryParameter("synchronizeAttributes@TypeHint") != null ? requestParameters.queryParameter("synchronizeAttributes@TypeHint").getString() : null;
        Integer clockTolerance = requestParameters.queryParameter("clockTolerance") != null ? requestParameters.queryParameter("clockTolerance").getInteger() : null;
        String clockToleranceAtTypeHint = requestParameters.queryParameter("clockTolerance@TypeHint") != null ? requestParameters.queryParameter("clockTolerance@TypeHint").getString() : null;
        String groupMembershipAttribute = requestParameters.queryParameter("groupMembershipAttribute") != null ? requestParameters.queryParameter("groupMembershipAttribute").getString() : null;
        String groupMembershipAttributeAtTypeHint = requestParameters.queryParameter("groupMembershipAttribute@TypeHint") != null ? requestParameters.queryParameter("groupMembershipAttribute@TypeHint").getString() : null;
        String idpUrl = requestParameters.queryParameter("idpUrl") != null ? requestParameters.queryParameter("idpUrl").getString() : null;
        String idpUrlAtTypeHint = requestParameters.queryParameter("idpUrl@TypeHint") != null ? requestParameters.queryParameter("idpUrl@TypeHint").getString() : null;
        String logoutUrl = requestParameters.queryParameter("logoutUrl") != null ? requestParameters.queryParameter("logoutUrl").getString() : null;
        String logoutUrlAtTypeHint = requestParameters.queryParameter("logoutUrl@TypeHint") != null ? requestParameters.queryParameter("logoutUrl@TypeHint").getString() : null;
        String serviceProviderEntityId = requestParameters.queryParameter("serviceProviderEntityId") != null ? requestParameters.queryParameter("serviceProviderEntityId").getString() : null;
        String serviceProviderEntityIdAtTypeHint = requestParameters.queryParameter("serviceProviderEntityId@TypeHint") != null ? requestParameters.queryParameter("serviceProviderEntityId@TypeHint").getString() : null;
        String assertionConsumerServiceURL = requestParameters.queryParameter("assertionConsumerServiceURL") != null ? requestParameters.queryParameter("assertionConsumerServiceURL").getString() : null;
        String assertionConsumerServiceURLAtTypeHint = requestParameters.queryParameter("assertionConsumerServiceURL@TypeHint") != null ? requestParameters.queryParameter("assertionConsumerServiceURL@TypeHint").getString() : null;
        Boolean handleLogout = requestParameters.queryParameter("handleLogout") != null ? requestParameters.queryParameter("handleLogout").getBoolean() : null;
        String handleLogoutAtTypeHint = requestParameters.queryParameter("handleLogout@TypeHint") != null ? requestParameters.queryParameter("handleLogout@TypeHint").getString() : null;
        String spPrivateKeyAlias = requestParameters.queryParameter("spPrivateKeyAlias") != null ? requestParameters.queryParameter("spPrivateKeyAlias").getString() : null;
        String spPrivateKeyAliasAtTypeHint = requestParameters.queryParameter("spPrivateKeyAlias@TypeHint") != null ? requestParameters.queryParameter("spPrivateKeyAlias@TypeHint").getString() : null;
        Boolean useEncryption = requestParameters.queryParameter("useEncryption") != null ? requestParameters.queryParameter("useEncryption").getBoolean() : null;
        String useEncryptionAtTypeHint = requestParameters.queryParameter("useEncryption@TypeHint") != null ? requestParameters.queryParameter("useEncryption@TypeHint").getString() : null;
        String nameIdFormat = requestParameters.queryParameter("nameIdFormat") != null ? requestParameters.queryParameter("nameIdFormat").getString() : null;
        String nameIdFormatAtTypeHint = requestParameters.queryParameter("nameIdFormat@TypeHint") != null ? requestParameters.queryParameter("nameIdFormat@TypeHint").getString() : null;
        String digestMethod = requestParameters.queryParameter("digestMethod") != null ? requestParameters.queryParameter("digestMethod").getString() : null;
        String digestMethodAtTypeHint = requestParameters.queryParameter("digestMethod@TypeHint") != null ? requestParameters.queryParameter("digestMethod@TypeHint").getString() : null;
        String signatureMethod = requestParameters.queryParameter("signatureMethod") != null ? requestParameters.queryParameter("signatureMethod").getString() : null;
        String signatureMethodAtTypeHint = requestParameters.queryParameter("signatureMethod@TypeHint") != null ? requestParameters.queryParameter("signatureMethod@TypeHint").getString() : null;
        String userIntermediatePath = requestParameters.queryParameter("userIntermediatePath") != null ? requestParameters.queryParameter("userIntermediatePath").getString() : null;
        String userIntermediatePathAtTypeHint = requestParameters.queryParameter("userIntermediatePath@TypeHint") != null ? requestParameters.queryParameter("userIntermediatePath@TypeHint").getString() : null;

        logger.debug("Parameter keyStorePassword is {}", keyStorePassword);
        logger.debug("Parameter keyStorePasswordAtTypeHint is {}", keyStorePasswordAtTypeHint);
        logger.debug("Parameter serviceRanking is {}", serviceRanking);
        logger.debug("Parameter serviceRankingAtTypeHint is {}", serviceRankingAtTypeHint);
        logger.debug("Parameter idpHttpRedirect is {}", idpHttpRedirect);
        logger.debug("Parameter idpHttpRedirectAtTypeHint is {}", idpHttpRedirectAtTypeHint);
        logger.debug("Parameter createUser is {}", createUser);
        logger.debug("Parameter createUserAtTypeHint is {}", createUserAtTypeHint);
        logger.debug("Parameter defaultRedirectUrl is {}", defaultRedirectUrl);
        logger.debug("Parameter defaultRedirectUrlAtTypeHint is {}", defaultRedirectUrlAtTypeHint);
        logger.debug("Parameter userIDAttribute is {}", userIDAttribute);
        logger.debug("Parameter userIDAttributeAtTypeHint is {}", userIDAttributeAtTypeHint);
        logger.debug("Parameter defaultGroups is {}", defaultGroups);
        logger.debug("Parameter defaultGroupsAtTypeHint is {}", defaultGroupsAtTypeHint);
        logger.debug("Parameter idpCertAlias is {}", idpCertAlias);
        logger.debug("Parameter idpCertAliasAtTypeHint is {}", idpCertAliasAtTypeHint);
        logger.debug("Parameter addGroupMemberships is {}", addGroupMemberships);
        logger.debug("Parameter addGroupMembershipsAtTypeHint is {}", addGroupMembershipsAtTypeHint);
        logger.debug("Parameter path is {}", path);
        logger.debug("Parameter pathAtTypeHint is {}", pathAtTypeHint);
        logger.debug("Parameter synchronizeAttributes is {}", synchronizeAttributes);
        logger.debug("Parameter synchronizeAttributesAtTypeHint is {}", synchronizeAttributesAtTypeHint);
        logger.debug("Parameter clockTolerance is {}", clockTolerance);
        logger.debug("Parameter clockToleranceAtTypeHint is {}", clockToleranceAtTypeHint);
        logger.debug("Parameter groupMembershipAttribute is {}", groupMembershipAttribute);
        logger.debug("Parameter groupMembershipAttributeAtTypeHint is {}", groupMembershipAttributeAtTypeHint);
        logger.debug("Parameter idpUrl is {}", idpUrl);
        logger.debug("Parameter idpUrlAtTypeHint is {}", idpUrlAtTypeHint);
        logger.debug("Parameter logoutUrl is {}", logoutUrl);
        logger.debug("Parameter logoutUrlAtTypeHint is {}", logoutUrlAtTypeHint);
        logger.debug("Parameter serviceProviderEntityId is {}", serviceProviderEntityId);
        logger.debug("Parameter serviceProviderEntityIdAtTypeHint is {}", serviceProviderEntityIdAtTypeHint);
        logger.debug("Parameter assertionConsumerServiceURL is {}", assertionConsumerServiceURL);
        logger.debug("Parameter assertionConsumerServiceURLAtTypeHint is {}", assertionConsumerServiceURLAtTypeHint);
        logger.debug("Parameter handleLogout is {}", handleLogout);
        logger.debug("Parameter handleLogoutAtTypeHint is {}", handleLogoutAtTypeHint);
        logger.debug("Parameter spPrivateKeyAlias is {}", spPrivateKeyAlias);
        logger.debug("Parameter spPrivateKeyAliasAtTypeHint is {}", spPrivateKeyAliasAtTypeHint);
        logger.debug("Parameter useEncryption is {}", useEncryption);
        logger.debug("Parameter useEncryptionAtTypeHint is {}", useEncryptionAtTypeHint);
        logger.debug("Parameter nameIdFormat is {}", nameIdFormat);
        logger.debug("Parameter nameIdFormatAtTypeHint is {}", nameIdFormatAtTypeHint);
        logger.debug("Parameter digestMethod is {}", digestMethod);
        logger.debug("Parameter digestMethodAtTypeHint is {}", digestMethodAtTypeHint);
        logger.debug("Parameter signatureMethod is {}", signatureMethod);
        logger.debug("Parameter signatureMethodAtTypeHint is {}", signatureMethodAtTypeHint);
        logger.debug("Parameter userIntermediatePath is {}", userIntermediatePath);
        logger.debug("Parameter userIntermediatePathAtTypeHint is {}", userIntermediatePathAtTypeHint);

        api.postConfigAdobeGraniteSamlAuthenticationHandler(keyStorePassword, keyStorePasswordAtTypeHint, serviceRanking, serviceRankingAtTypeHint, idpHttpRedirect, idpHttpRedirectAtTypeHint, createUser, createUserAtTypeHint, defaultRedirectUrl, defaultRedirectUrlAtTypeHint, userIDAttribute, userIDAttributeAtTypeHint, defaultGroups, defaultGroupsAtTypeHint, idpCertAlias, idpCertAliasAtTypeHint, addGroupMemberships, addGroupMembershipsAtTypeHint, path, pathAtTypeHint, synchronizeAttributes, synchronizeAttributesAtTypeHint, clockTolerance, clockToleranceAtTypeHint, groupMembershipAttribute, groupMembershipAttributeAtTypeHint, idpUrl, idpUrlAtTypeHint, logoutUrl, logoutUrlAtTypeHint, serviceProviderEntityId, serviceProviderEntityIdAtTypeHint, assertionConsumerServiceURL, assertionConsumerServiceURLAtTypeHint, handleLogout, handleLogoutAtTypeHint, spPrivateKeyAlias, spPrivateKeyAliasAtTypeHint, useEncryption, useEncryptionAtTypeHint, nameIdFormat, nameIdFormatAtTypeHint, digestMethod, digestMethodAtTypeHint, signatureMethod, signatureMethodAtTypeHint, userIntermediatePath, userIntermediatePathAtTypeHint)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void postConfigApacheFelixJettyBasedHttpService(RoutingContext routingContext) {
        logger.info("postConfigApacheFelixJettyBasedHttpService()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Boolean orgApacheFelixHttpsNio = requestParameters.queryParameter("org.apache.felix.https.nio") != null ? requestParameters.queryParameter("org.apache.felix.https.nio").getBoolean() : null;
        String orgApacheFelixHttpsNioAtTypeHint = requestParameters.queryParameter("org.apache.felix.https.nio@TypeHint") != null ? requestParameters.queryParameter("org.apache.felix.https.nio@TypeHint").getString() : null;
        String orgApacheFelixHttpsKeystore = requestParameters.queryParameter("org.apache.felix.https.keystore") != null ? requestParameters.queryParameter("org.apache.felix.https.keystore").getString() : null;
        String orgApacheFelixHttpsKeystoreAtTypeHint = requestParameters.queryParameter("org.apache.felix.https.keystore@TypeHint") != null ? requestParameters.queryParameter("org.apache.felix.https.keystore@TypeHint").getString() : null;
        String orgApacheFelixHttpsKeystorePassword = requestParameters.queryParameter("org.apache.felix.https.keystore.password") != null ? requestParameters.queryParameter("org.apache.felix.https.keystore.password").getString() : null;
        String orgApacheFelixHttpsKeystorePasswordAtTypeHint = requestParameters.queryParameter("org.apache.felix.https.keystore.password@TypeHint") != null ? requestParameters.queryParameter("org.apache.felix.https.keystore.password@TypeHint").getString() : null;
        String orgApacheFelixHttpsKeystoreKey = requestParameters.queryParameter("org.apache.felix.https.keystore.key") != null ? requestParameters.queryParameter("org.apache.felix.https.keystore.key").getString() : null;
        String orgApacheFelixHttpsKeystoreKeyAtTypeHint = requestParameters.queryParameter("org.apache.felix.https.keystore.key@TypeHint") != null ? requestParameters.queryParameter("org.apache.felix.https.keystore.key@TypeHint").getString() : null;
        String orgApacheFelixHttpsKeystoreKeyPassword = requestParameters.queryParameter("org.apache.felix.https.keystore.key.password") != null ? requestParameters.queryParameter("org.apache.felix.https.keystore.key.password").getString() : null;
        String orgApacheFelixHttpsKeystoreKeyPasswordAtTypeHint = requestParameters.queryParameter("org.apache.felix.https.keystore.key.password@TypeHint") != null ? requestParameters.queryParameter("org.apache.felix.https.keystore.key.password@TypeHint").getString() : null;
        String orgApacheFelixHttpsTruststore = requestParameters.queryParameter("org.apache.felix.https.truststore") != null ? requestParameters.queryParameter("org.apache.felix.https.truststore").getString() : null;
        String orgApacheFelixHttpsTruststoreAtTypeHint = requestParameters.queryParameter("org.apache.felix.https.truststore@TypeHint") != null ? requestParameters.queryParameter("org.apache.felix.https.truststore@TypeHint").getString() : null;
        String orgApacheFelixHttpsTruststorePassword = requestParameters.queryParameter("org.apache.felix.https.truststore.password") != null ? requestParameters.queryParameter("org.apache.felix.https.truststore.password").getString() : null;
        String orgApacheFelixHttpsTruststorePasswordAtTypeHint = requestParameters.queryParameter("org.apache.felix.https.truststore.password@TypeHint") != null ? requestParameters.queryParameter("org.apache.felix.https.truststore.password@TypeHint").getString() : null;
        String orgApacheFelixHttpsClientcertificate = requestParameters.queryParameter("org.apache.felix.https.clientcertificate") != null ? requestParameters.queryParameter("org.apache.felix.https.clientcertificate").getString() : null;
        String orgApacheFelixHttpsClientcertificateAtTypeHint = requestParameters.queryParameter("org.apache.felix.https.clientcertificate@TypeHint") != null ? requestParameters.queryParameter("org.apache.felix.https.clientcertificate@TypeHint").getString() : null;
        Boolean orgApacheFelixHttpsEnable = requestParameters.queryParameter("org.apache.felix.https.enable") != null ? requestParameters.queryParameter("org.apache.felix.https.enable").getBoolean() : null;
        String orgApacheFelixHttpsEnableAtTypeHint = requestParameters.queryParameter("org.apache.felix.https.enable@TypeHint") != null ? requestParameters.queryParameter("org.apache.felix.https.enable@TypeHint").getString() : null;
        String orgOsgiServiceHttpPortSecure = requestParameters.queryParameter("org.osgi.service.http.port.secure") != null ? requestParameters.queryParameter("org.osgi.service.http.port.secure").getString() : null;
        String orgOsgiServiceHttpPortSecureAtTypeHint = requestParameters.queryParameter("org.osgi.service.http.port.secure@TypeHint") != null ? requestParameters.queryParameter("org.osgi.service.http.port.secure@TypeHint").getString() : null;

        logger.debug("Parameter orgApacheFelixHttpsNio is {}", orgApacheFelixHttpsNio);
        logger.debug("Parameter orgApacheFelixHttpsNioAtTypeHint is {}", orgApacheFelixHttpsNioAtTypeHint);
        logger.debug("Parameter orgApacheFelixHttpsKeystore is {}", orgApacheFelixHttpsKeystore);
        logger.debug("Parameter orgApacheFelixHttpsKeystoreAtTypeHint is {}", orgApacheFelixHttpsKeystoreAtTypeHint);
        logger.debug("Parameter orgApacheFelixHttpsKeystorePassword is {}", orgApacheFelixHttpsKeystorePassword);
        logger.debug("Parameter orgApacheFelixHttpsKeystorePasswordAtTypeHint is {}", orgApacheFelixHttpsKeystorePasswordAtTypeHint);
        logger.debug("Parameter orgApacheFelixHttpsKeystoreKey is {}", orgApacheFelixHttpsKeystoreKey);
        logger.debug("Parameter orgApacheFelixHttpsKeystoreKeyAtTypeHint is {}", orgApacheFelixHttpsKeystoreKeyAtTypeHint);
        logger.debug("Parameter orgApacheFelixHttpsKeystoreKeyPassword is {}", orgApacheFelixHttpsKeystoreKeyPassword);
        logger.debug("Parameter orgApacheFelixHttpsKeystoreKeyPasswordAtTypeHint is {}", orgApacheFelixHttpsKeystoreKeyPasswordAtTypeHint);
        logger.debug("Parameter orgApacheFelixHttpsTruststore is {}", orgApacheFelixHttpsTruststore);
        logger.debug("Parameter orgApacheFelixHttpsTruststoreAtTypeHint is {}", orgApacheFelixHttpsTruststoreAtTypeHint);
        logger.debug("Parameter orgApacheFelixHttpsTruststorePassword is {}", orgApacheFelixHttpsTruststorePassword);
        logger.debug("Parameter orgApacheFelixHttpsTruststorePasswordAtTypeHint is {}", orgApacheFelixHttpsTruststorePasswordAtTypeHint);
        logger.debug("Parameter orgApacheFelixHttpsClientcertificate is {}", orgApacheFelixHttpsClientcertificate);
        logger.debug("Parameter orgApacheFelixHttpsClientcertificateAtTypeHint is {}", orgApacheFelixHttpsClientcertificateAtTypeHint);
        logger.debug("Parameter orgApacheFelixHttpsEnable is {}", orgApacheFelixHttpsEnable);
        logger.debug("Parameter orgApacheFelixHttpsEnableAtTypeHint is {}", orgApacheFelixHttpsEnableAtTypeHint);
        logger.debug("Parameter orgOsgiServiceHttpPortSecure is {}", orgOsgiServiceHttpPortSecure);
        logger.debug("Parameter orgOsgiServiceHttpPortSecureAtTypeHint is {}", orgOsgiServiceHttpPortSecureAtTypeHint);

        api.postConfigApacheFelixJettyBasedHttpService(orgApacheFelixHttpsNio, orgApacheFelixHttpsNioAtTypeHint, orgApacheFelixHttpsKeystore, orgApacheFelixHttpsKeystoreAtTypeHint, orgApacheFelixHttpsKeystorePassword, orgApacheFelixHttpsKeystorePasswordAtTypeHint, orgApacheFelixHttpsKeystoreKey, orgApacheFelixHttpsKeystoreKeyAtTypeHint, orgApacheFelixHttpsKeystoreKeyPassword, orgApacheFelixHttpsKeystoreKeyPasswordAtTypeHint, orgApacheFelixHttpsTruststore, orgApacheFelixHttpsTruststoreAtTypeHint, orgApacheFelixHttpsTruststorePassword, orgApacheFelixHttpsTruststorePasswordAtTypeHint, orgApacheFelixHttpsClientcertificate, orgApacheFelixHttpsClientcertificateAtTypeHint, orgApacheFelixHttpsEnable, orgApacheFelixHttpsEnableAtTypeHint, orgOsgiServiceHttpPortSecure, orgOsgiServiceHttpPortSecureAtTypeHint)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void postConfigApacheHttpComponentsProxyConfiguration(RoutingContext routingContext) {
        logger.info("postConfigApacheHttpComponentsProxyConfiguration()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String proxyHost = requestParameters.queryParameter("proxy.host") != null ? requestParameters.queryParameter("proxy.host").getString() : null;
        String proxyHostAtTypeHint = requestParameters.queryParameter("proxy.host@TypeHint") != null ? requestParameters.queryParameter("proxy.host@TypeHint").getString() : null;
        Integer proxyPort = requestParameters.queryParameter("proxy.port") != null ? requestParameters.queryParameter("proxy.port").getInteger() : null;
        String proxyPortAtTypeHint = requestParameters.queryParameter("proxy.port@TypeHint") != null ? requestParameters.queryParameter("proxy.port@TypeHint").getString() : null;
        List<String> proxyExceptions = requestParameters.queryParameter("proxy.exceptions") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("proxy.exceptions").get(), new TypeReference<List<String>>(){}) : null;
        String proxyExceptionsAtTypeHint = requestParameters.queryParameter("proxy.exceptions@TypeHint") != null ? requestParameters.queryParameter("proxy.exceptions@TypeHint").getString() : null;
        Boolean proxyEnabled = requestParameters.queryParameter("proxy.enabled") != null ? requestParameters.queryParameter("proxy.enabled").getBoolean() : null;
        String proxyEnabledAtTypeHint = requestParameters.queryParameter("proxy.enabled@TypeHint") != null ? requestParameters.queryParameter("proxy.enabled@TypeHint").getString() : null;
        String proxyUser = requestParameters.queryParameter("proxy.user") != null ? requestParameters.queryParameter("proxy.user").getString() : null;
        String proxyUserAtTypeHint = requestParameters.queryParameter("proxy.user@TypeHint") != null ? requestParameters.queryParameter("proxy.user@TypeHint").getString() : null;
        String proxyPassword = requestParameters.queryParameter("proxy.password") != null ? requestParameters.queryParameter("proxy.password").getString() : null;
        String proxyPasswordAtTypeHint = requestParameters.queryParameter("proxy.password@TypeHint") != null ? requestParameters.queryParameter("proxy.password@TypeHint").getString() : null;

        logger.debug("Parameter proxyHost is {}", proxyHost);
        logger.debug("Parameter proxyHostAtTypeHint is {}", proxyHostAtTypeHint);
        logger.debug("Parameter proxyPort is {}", proxyPort);
        logger.debug("Parameter proxyPortAtTypeHint is {}", proxyPortAtTypeHint);
        logger.debug("Parameter proxyExceptions is {}", proxyExceptions);
        logger.debug("Parameter proxyExceptionsAtTypeHint is {}", proxyExceptionsAtTypeHint);
        logger.debug("Parameter proxyEnabled is {}", proxyEnabled);
        logger.debug("Parameter proxyEnabledAtTypeHint is {}", proxyEnabledAtTypeHint);
        logger.debug("Parameter proxyUser is {}", proxyUser);
        logger.debug("Parameter proxyUserAtTypeHint is {}", proxyUserAtTypeHint);
        logger.debug("Parameter proxyPassword is {}", proxyPassword);
        logger.debug("Parameter proxyPasswordAtTypeHint is {}", proxyPasswordAtTypeHint);

        api.postConfigApacheHttpComponentsProxyConfiguration(proxyHost, proxyHostAtTypeHint, proxyPort, proxyPortAtTypeHint, proxyExceptions, proxyExceptionsAtTypeHint, proxyEnabled, proxyEnabledAtTypeHint, proxyUser, proxyUserAtTypeHint, proxyPassword, proxyPasswordAtTypeHint)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void postConfigApacheSlingDavExServlet(RoutingContext routingContext) {
        logger.info("postConfigApacheSlingDavExServlet()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String alias = requestParameters.queryParameter("alias") != null ? requestParameters.queryParameter("alias").getString() : null;
        String aliasAtTypeHint = requestParameters.queryParameter("alias@TypeHint") != null ? requestParameters.queryParameter("alias@TypeHint").getString() : null;
        Boolean davCreateAbsoluteUri = requestParameters.queryParameter("dav.create-absolute-uri") != null ? requestParameters.queryParameter("dav.create-absolute-uri").getBoolean() : null;
        String davCreateAbsoluteUriAtTypeHint = requestParameters.queryParameter("dav.create-absolute-uri@TypeHint") != null ? requestParameters.queryParameter("dav.create-absolute-uri@TypeHint").getString() : null;

        logger.debug("Parameter alias is {}", alias);
        logger.debug("Parameter aliasAtTypeHint is {}", aliasAtTypeHint);
        logger.debug("Parameter davCreateAbsoluteUri is {}", davCreateAbsoluteUri);
        logger.debug("Parameter davCreateAbsoluteUriAtTypeHint is {}", davCreateAbsoluteUriAtTypeHint);

        api.postConfigApacheSlingDavExServlet(alias, aliasAtTypeHint, davCreateAbsoluteUri, davCreateAbsoluteUriAtTypeHint)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void postConfigApacheSlingGetServlet(RoutingContext routingContext) {
        logger.info("postConfigApacheSlingGetServlet()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String jsonMaximumresults = requestParameters.queryParameter("json.maximumresults") != null ? requestParameters.queryParameter("json.maximumresults").getString() : null;
        String jsonMaximumresultsAtTypeHint = requestParameters.queryParameter("json.maximumresults@TypeHint") != null ? requestParameters.queryParameter("json.maximumresults@TypeHint").getString() : null;
        Boolean enableHtml = requestParameters.queryParameter("enable.html") != null ? requestParameters.queryParameter("enable.html").getBoolean() : null;
        String enableHtmlAtTypeHint = requestParameters.queryParameter("enable.html@TypeHint") != null ? requestParameters.queryParameter("enable.html@TypeHint").getString() : null;
        Boolean enableTxt = requestParameters.queryParameter("enable.txt") != null ? requestParameters.queryParameter("enable.txt").getBoolean() : null;
        String enableTxtAtTypeHint = requestParameters.queryParameter("enable.txt@TypeHint") != null ? requestParameters.queryParameter("enable.txt@TypeHint").getString() : null;
        Boolean enableXml = requestParameters.queryParameter("enable.xml") != null ? requestParameters.queryParameter("enable.xml").getBoolean() : null;
        String enableXmlAtTypeHint = requestParameters.queryParameter("enable.xml@TypeHint") != null ? requestParameters.queryParameter("enable.xml@TypeHint").getString() : null;

        logger.debug("Parameter jsonMaximumresults is {}", jsonMaximumresults);
        logger.debug("Parameter jsonMaximumresultsAtTypeHint is {}", jsonMaximumresultsAtTypeHint);
        logger.debug("Parameter enableHtml is {}", enableHtml);
        logger.debug("Parameter enableHtmlAtTypeHint is {}", enableHtmlAtTypeHint);
        logger.debug("Parameter enableTxt is {}", enableTxt);
        logger.debug("Parameter enableTxtAtTypeHint is {}", enableTxtAtTypeHint);
        logger.debug("Parameter enableXml is {}", enableXml);
        logger.debug("Parameter enableXmlAtTypeHint is {}", enableXmlAtTypeHint);

        api.postConfigApacheSlingGetServlet(jsonMaximumresults, jsonMaximumresultsAtTypeHint, enableHtml, enableHtmlAtTypeHint, enableTxt, enableTxtAtTypeHint, enableXml, enableXmlAtTypeHint)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void postConfigApacheSlingReferrerFilter(RoutingContext routingContext) {
        logger.info("postConfigApacheSlingReferrerFilter()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Boolean allowEmpty = requestParameters.queryParameter("allow.empty") != null ? requestParameters.queryParameter("allow.empty").getBoolean() : null;
        String allowEmptyAtTypeHint = requestParameters.queryParameter("allow.empty@TypeHint") != null ? requestParameters.queryParameter("allow.empty@TypeHint").getString() : null;
        String allowHosts = requestParameters.queryParameter("allow.hosts") != null ? requestParameters.queryParameter("allow.hosts").getString() : null;
        String allowHostsAtTypeHint = requestParameters.queryParameter("allow.hosts@TypeHint") != null ? requestParameters.queryParameter("allow.hosts@TypeHint").getString() : null;
        String allowHostsRegexp = requestParameters.queryParameter("allow.hosts.regexp") != null ? requestParameters.queryParameter("allow.hosts.regexp").getString() : null;
        String allowHostsRegexpAtTypeHint = requestParameters.queryParameter("allow.hosts.regexp@TypeHint") != null ? requestParameters.queryParameter("allow.hosts.regexp@TypeHint").getString() : null;
        String filterMethods = requestParameters.queryParameter("filter.methods") != null ? requestParameters.queryParameter("filter.methods").getString() : null;
        String filterMethodsAtTypeHint = requestParameters.queryParameter("filter.methods@TypeHint") != null ? requestParameters.queryParameter("filter.methods@TypeHint").getString() : null;

        logger.debug("Parameter allowEmpty is {}", allowEmpty);
        logger.debug("Parameter allowEmptyAtTypeHint is {}", allowEmptyAtTypeHint);
        logger.debug("Parameter allowHosts is {}", allowHosts);
        logger.debug("Parameter allowHostsAtTypeHint is {}", allowHostsAtTypeHint);
        logger.debug("Parameter allowHostsRegexp is {}", allowHostsRegexp);
        logger.debug("Parameter allowHostsRegexpAtTypeHint is {}", allowHostsRegexpAtTypeHint);
        logger.debug("Parameter filterMethods is {}", filterMethods);
        logger.debug("Parameter filterMethodsAtTypeHint is {}", filterMethodsAtTypeHint);

        api.postConfigApacheSlingReferrerFilter(allowEmpty, allowEmptyAtTypeHint, allowHosts, allowHostsAtTypeHint, allowHostsRegexp, allowHostsRegexpAtTypeHint, filterMethods, filterMethodsAtTypeHint)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void postConfigProperty(RoutingContext routingContext) {
        logger.info("postConfigProperty()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String configNodeName = requestParameters.pathParameter("configNodeName") != null ? requestParameters.pathParameter("configNodeName").getString() : null;

        logger.debug("Parameter configNodeName is {}", configNodeName);

        api.postConfigProperty(configNodeName)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void postNode(RoutingContext routingContext) {
        logger.info("postNode()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String path = requestParameters.pathParameter("path") != null ? requestParameters.pathParameter("path").getString() : null;
        String name = requestParameters.pathParameter("name") != null ? requestParameters.pathParameter("name").getString() : null;
        String operation = requestParameters.queryParameter(":operation") != null ? requestParameters.queryParameter(":operation").getString() : null;
        String deleteAuthorizable = requestParameters.queryParameter("deleteAuthorizable") != null ? requestParameters.queryParameter("deleteAuthorizable").getString() : null;
        FileUpload _file = routingContext.fileUploads().iterator().next();

        logger.debug("Parameter path is {}", path);
        logger.debug("Parameter name is {}", name);
        logger.debug("Parameter operation is {}", operation);
        logger.debug("Parameter deleteAuthorizable is {}", deleteAuthorizable);
        logger.debug("Parameter _file is {}", _file);

        api.postNode(path, name, operation, deleteAuthorizable, _file)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void postNodeRw(RoutingContext routingContext) {
        logger.info("postNodeRw()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String path = requestParameters.pathParameter("path") != null ? requestParameters.pathParameter("path").getString() : null;
        String name = requestParameters.pathParameter("name") != null ? requestParameters.pathParameter("name").getString() : null;
        String addMembers = requestParameters.queryParameter("addMembers") != null ? requestParameters.queryParameter("addMembers").getString() : null;

        logger.debug("Parameter path is {}", path);
        logger.debug("Parameter name is {}", name);
        logger.debug("Parameter addMembers is {}", addMembers);

        api.postNodeRw(path, name, addMembers)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void postPath(RoutingContext routingContext) {
        logger.info("postPath()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String path = requestParameters.pathParameter("path") != null ? requestParameters.pathParameter("path").getString() : null;
        String jcrPrimaryType = requestParameters.queryParameter("jcr:primaryType") != null ? requestParameters.queryParameter("jcr:primaryType").getString() : null;
        String name = requestParameters.queryParameter(":name") != null ? requestParameters.queryParameter(":name").getString() : null;

        logger.debug("Parameter path is {}", path);
        logger.debug("Parameter jcrPrimaryType is {}", jcrPrimaryType);
        logger.debug("Parameter name is {}", name);

        api.postPath(path, jcrPrimaryType, name)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void postQuery(RoutingContext routingContext) {
        logger.info("postQuery()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String path = requestParameters.queryParameter("path") != null ? requestParameters.queryParameter("path").getString() : null;
        BigDecimal pLimit = requestParameters.queryParameter("p.limit") != null ? requestParameters.queryParameter("p.limit").getBigDecimal() : null;
        String _1property = requestParameters.queryParameter("1_property") != null ? requestParameters.queryParameter("1_property").getString() : null;
        String _1propertyValue = requestParameters.queryParameter("1_property.value") != null ? requestParameters.queryParameter("1_property.value").getString() : null;

        logger.debug("Parameter path is {}", path);
        logger.debug("Parameter pLimit is {}", pLimit);
        logger.debug("Parameter _1property is {}", _1property);
        logger.debug("Parameter _1propertyValue is {}", _1propertyValue);

        api.postQuery(path, pLimit, _1property, _1propertyValue)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void postTreeActivation(RoutingContext routingContext) {
        logger.info("postTreeActivation()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Boolean ignoredeactivated = requestParameters.queryParameter("ignoredeactivated") != null ? requestParameters.queryParameter("ignoredeactivated").getBoolean() : null;
        Boolean onlymodified = requestParameters.queryParameter("onlymodified") != null ? requestParameters.queryParameter("onlymodified").getBoolean() : null;
        String path = requestParameters.queryParameter("path") != null ? requestParameters.queryParameter("path").getString() : null;
        String cmd = requestParameters.queryParameter("cmd") != null ? requestParameters.queryParameter("cmd").getString() : activate;

        logger.debug("Parameter ignoredeactivated is {}", ignoredeactivated);
        logger.debug("Parameter onlymodified is {}", onlymodified);
        logger.debug("Parameter path is {}", path);
        logger.debug("Parameter cmd is {}", cmd);

        api.postTreeActivation(ignoredeactivated, onlymodified, path, cmd)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void postTruststore(RoutingContext routingContext) {
        logger.info("postTruststore()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String operation = requestParameters.queryParameter(":operation") != null ? requestParameters.queryParameter(":operation").getString() : null;
        String newPassword = requestParameters.queryParameter("newPassword") != null ? requestParameters.queryParameter("newPassword").getString() : null;
        String rePassword = requestParameters.queryParameter("rePassword") != null ? requestParameters.queryParameter("rePassword").getString() : null;
        String keyStoreType = requestParameters.queryParameter("keyStoreType") != null ? requestParameters.queryParameter("keyStoreType").getString() : null;
        String removeAlias = requestParameters.queryParameter("removeAlias") != null ? requestParameters.queryParameter("removeAlias").getString() : null;
        FileUpload certificate = routingContext.fileUploads().iterator().next();

        logger.debug("Parameter operation is {}", operation);
        logger.debug("Parameter newPassword is {}", newPassword);
        logger.debug("Parameter rePassword is {}", rePassword);
        logger.debug("Parameter keyStoreType is {}", keyStoreType);
        logger.debug("Parameter removeAlias is {}", removeAlias);
        logger.debug("Parameter certificate is {}", certificate);

        api.postTruststore(operation, newPassword, rePassword, keyStoreType, removeAlias, certificate)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void postTruststorePKCS12(RoutingContext routingContext) {
        logger.info("postTruststorePKCS12()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        FileUpload truststoreP12 = routingContext.fileUploads().iterator().next();

        logger.debug("Parameter truststoreP12 is {}", truststoreP12);

        api.postTruststorePKCS12(truststoreP12)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

}
