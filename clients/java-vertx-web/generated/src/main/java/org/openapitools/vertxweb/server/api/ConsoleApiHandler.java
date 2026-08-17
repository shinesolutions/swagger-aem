package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.BundleInfo;
import org.openapitools.vertxweb.server.model.SamlConfigurationInfo;

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

public class ConsoleApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(ConsoleApiHandler.class);

    private final ConsoleApi api;

    public ConsoleApiHandler(ConsoleApi api) {
        this.api = api;
    }

    @Deprecated
    public ConsoleApiHandler() {
        this(new ConsoleApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("getAemProductInfo").handler(this::getAemProductInfo);
        builder.operation("getBundleInfo").handler(this::getBundleInfo);
        builder.operation("getConfigMgr").handler(this::getConfigMgr);
        builder.operation("postBundle").handler(this::postBundle);
        builder.operation("postJmxRepository").handler(this::postJmxRepository);
        builder.operation("postSamlConfiguration").handler(this::postSamlConfiguration);
    }

    private void getAemProductInfo(RoutingContext routingContext) {
        logger.info("getAemProductInfo()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);



        api.getAemProductInfo()
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

    private void getBundleInfo(RoutingContext routingContext) {
        logger.info("getBundleInfo()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String name = requestParameters.pathParameter("name") != null ? requestParameters.pathParameter("name").getString() : null;

        logger.debug("Parameter name is {}", name);

        api.getBundleInfo(name)
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

    private void getConfigMgr(RoutingContext routingContext) {
        logger.info("getConfigMgr()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);



        api.getConfigMgr()
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

    private void postBundle(RoutingContext routingContext) {
        logger.info("postBundle()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String name = requestParameters.pathParameter("name") != null ? requestParameters.pathParameter("name").getString() : null;
        String action = requestParameters.queryParameter("action") != null ? requestParameters.queryParameter("action").getString() : null;

        logger.debug("Parameter name is {}", name);
        logger.debug("Parameter action is {}", action);

        api.postBundle(name, action)
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

    private void postJmxRepository(RoutingContext routingContext) {
        logger.info("postJmxRepository()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String action = requestParameters.pathParameter("action") != null ? requestParameters.pathParameter("action").getString() : null;

        logger.debug("Parameter action is {}", action);

        api.postJmxRepository(action)
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

    private void postSamlConfiguration(RoutingContext routingContext) {
        logger.info("postSamlConfiguration()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Boolean post = requestParameters.queryParameter("post") != null ? requestParameters.queryParameter("post").getBoolean() : null;
        Boolean apply = requestParameters.queryParameter("apply") != null ? requestParameters.queryParameter("apply").getBoolean() : null;
        Boolean delete = requestParameters.queryParameter("delete") != null ? requestParameters.queryParameter("delete").getBoolean() : null;
        String action = requestParameters.queryParameter("action") != null ? requestParameters.queryParameter("action").getString() : null;
        String $location = requestParameters.queryParameter("$location") != null ? requestParameters.queryParameter("$location").getString() : null;
        List<String> path = requestParameters.queryParameter("path") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("path").get(), new TypeReference<List<String>>(){}) : null;
        Integer serviceRanking = requestParameters.queryParameter("service.ranking") != null ? requestParameters.queryParameter("service.ranking").getInteger() : null;
        String idpUrl = requestParameters.queryParameter("idpUrl") != null ? requestParameters.queryParameter("idpUrl").getString() : null;
        String idpCertAlias = requestParameters.queryParameter("idpCertAlias") != null ? requestParameters.queryParameter("idpCertAlias").getString() : null;
        Boolean idpHttpRedirect = requestParameters.queryParameter("idpHttpRedirect") != null ? requestParameters.queryParameter("idpHttpRedirect").getBoolean() : null;
        String serviceProviderEntityId = requestParameters.queryParameter("serviceProviderEntityId") != null ? requestParameters.queryParameter("serviceProviderEntityId").getString() : null;
        String assertionConsumerServiceURL = requestParameters.queryParameter("assertionConsumerServiceURL") != null ? requestParameters.queryParameter("assertionConsumerServiceURL").getString() : null;
        String spPrivateKeyAlias = requestParameters.queryParameter("spPrivateKeyAlias") != null ? requestParameters.queryParameter("spPrivateKeyAlias").getString() : null;
        String keyStorePassword = requestParameters.queryParameter("keyStorePassword") != null ? requestParameters.queryParameter("keyStorePassword").getString() : null;
        String defaultRedirectUrl = requestParameters.queryParameter("defaultRedirectUrl") != null ? requestParameters.queryParameter("defaultRedirectUrl").getString() : null;
        String userIDAttribute = requestParameters.queryParameter("userIDAttribute") != null ? requestParameters.queryParameter("userIDAttribute").getString() : null;
        Boolean useEncryption = requestParameters.queryParameter("useEncryption") != null ? requestParameters.queryParameter("useEncryption").getBoolean() : null;
        Boolean createUser = requestParameters.queryParameter("createUser") != null ? requestParameters.queryParameter("createUser").getBoolean() : null;
        Boolean addGroupMemberships = requestParameters.queryParameter("addGroupMemberships") != null ? requestParameters.queryParameter("addGroupMemberships").getBoolean() : null;
        String groupMembershipAttribute = requestParameters.queryParameter("groupMembershipAttribute") != null ? requestParameters.queryParameter("groupMembershipAttribute").getString() : null;
        List<String> defaultGroups = requestParameters.queryParameter("defaultGroups") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("defaultGroups").get(), new TypeReference<List<String>>(){}) : null;
        String nameIdFormat = requestParameters.queryParameter("nameIdFormat") != null ? requestParameters.queryParameter("nameIdFormat").getString() : null;
        List<String> synchronizeAttributes = requestParameters.queryParameter("synchronizeAttributes") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("synchronizeAttributes").get(), new TypeReference<List<String>>(){}) : null;
        Boolean handleLogout = requestParameters.queryParameter("handleLogout") != null ? requestParameters.queryParameter("handleLogout").getBoolean() : null;
        String logoutUrl = requestParameters.queryParameter("logoutUrl") != null ? requestParameters.queryParameter("logoutUrl").getString() : null;
        Integer clockTolerance = requestParameters.queryParameter("clockTolerance") != null ? requestParameters.queryParameter("clockTolerance").getInteger() : null;
        String digestMethod = requestParameters.queryParameter("digestMethod") != null ? requestParameters.queryParameter("digestMethod").getString() : null;
        String signatureMethod = requestParameters.queryParameter("signatureMethod") != null ? requestParameters.queryParameter("signatureMethod").getString() : null;
        String userIntermediatePath = requestParameters.queryParameter("userIntermediatePath") != null ? requestParameters.queryParameter("userIntermediatePath").getString() : null;
        List<String> propertylist = requestParameters.queryParameter("propertylist") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("propertylist").get(), new TypeReference<List<String>>(){}) : null;

        logger.debug("Parameter post is {}", post);
        logger.debug("Parameter apply is {}", apply);
        logger.debug("Parameter delete is {}", delete);
        logger.debug("Parameter action is {}", action);
        logger.debug("Parameter $location is {}", $location);
        logger.debug("Parameter path is {}", path);
        logger.debug("Parameter serviceRanking is {}", serviceRanking);
        logger.debug("Parameter idpUrl is {}", idpUrl);
        logger.debug("Parameter idpCertAlias is {}", idpCertAlias);
        logger.debug("Parameter idpHttpRedirect is {}", idpHttpRedirect);
        logger.debug("Parameter serviceProviderEntityId is {}", serviceProviderEntityId);
        logger.debug("Parameter assertionConsumerServiceURL is {}", assertionConsumerServiceURL);
        logger.debug("Parameter spPrivateKeyAlias is {}", spPrivateKeyAlias);
        logger.debug("Parameter keyStorePassword is {}", keyStorePassword);
        logger.debug("Parameter defaultRedirectUrl is {}", defaultRedirectUrl);
        logger.debug("Parameter userIDAttribute is {}", userIDAttribute);
        logger.debug("Parameter useEncryption is {}", useEncryption);
        logger.debug("Parameter createUser is {}", createUser);
        logger.debug("Parameter addGroupMemberships is {}", addGroupMemberships);
        logger.debug("Parameter groupMembershipAttribute is {}", groupMembershipAttribute);
        logger.debug("Parameter defaultGroups is {}", defaultGroups);
        logger.debug("Parameter nameIdFormat is {}", nameIdFormat);
        logger.debug("Parameter synchronizeAttributes is {}", synchronizeAttributes);
        logger.debug("Parameter handleLogout is {}", handleLogout);
        logger.debug("Parameter logoutUrl is {}", logoutUrl);
        logger.debug("Parameter clockTolerance is {}", clockTolerance);
        logger.debug("Parameter digestMethod is {}", digestMethod);
        logger.debug("Parameter signatureMethod is {}", signatureMethod);
        logger.debug("Parameter userIntermediatePath is {}", userIntermediatePath);
        logger.debug("Parameter propertylist is {}", propertylist);

        api.postSamlConfiguration(post, apply, delete, action, $location, path, serviceRanking, idpUrl, idpCertAlias, idpHttpRedirect, serviceProviderEntityId, assertionConsumerServiceURL, spPrivateKeyAlias, keyStorePassword, defaultRedirectUrl, userIDAttribute, useEncryption, createUser, addGroupMemberships, groupMembershipAttribute, defaultGroups, nameIdFormat, synchronizeAttributes, handleLogout, logoutUrl, clockTolerance, digestMethod, signatureMethod, userIntermediatePath, propertylist)
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
