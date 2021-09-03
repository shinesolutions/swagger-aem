package controllers;

import apimodels.BundleInfo;
import apimodels.SamlConfigurationInfo;

import com.google.inject.Inject;
import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import play.mvc.Result;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import openapitools.OpenAPIUtils;
import static play.mvc.Results.ok;
import play.libs.Files.TemporaryFile;

import javax.validation.constraints.*;

@SuppressWarnings("RedundantThrows")
public abstract class ConsoleApiControllerImpInterface {
    @Inject private Config configuration;
    private ObjectMapper mapper = new ObjectMapper();

    public Result getAemProductInfoHttp(Http.Request request) throws Exception {
        List<String> obj = getAemProductInfo(request);
JsonNode result = mapper.valueToTree(obj);
return ok(result);

    }

    public abstract List<String> getAemProductInfo(Http.Request request) throws Exception;

    public Result getBundleInfoHttp(Http.Request request, String name) throws Exception {
        BundleInfo obj = getBundleInfo(request, name);
    if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
    }
JsonNode result = mapper.valueToTree(obj);
return ok(result);

    }

    public abstract BundleInfo getBundleInfo(Http.Request request, String name) throws Exception;

    public Result getConfigMgrHttp(Http.Request request) throws Exception {
        String obj = getConfigMgr(request);
JsonNode result = mapper.valueToTree(obj);
return ok(result);

    }

    public abstract String getConfigMgr(Http.Request request) throws Exception;

    public Result postBundleHttp(Http.Request request, String name, @NotNull String action) throws Exception {
        postBundle(request, name, action);
return ok();

    }

    public abstract void postBundle(Http.Request request, String name, @NotNull String action) throws Exception;

    public Result postJmxRepositoryHttp(Http.Request request, String action) throws Exception {
        postJmxRepository(request, action);
return ok();

    }

    public abstract void postJmxRepository(Http.Request request, String action) throws Exception;

    public Result postSamlConfigurationHttp(Http.Request request, Boolean post, Boolean apply, Boolean delete, String action, String $location, List<String> path, Integer serviceRanking, String idpUrl, String idpCertAlias, Boolean idpHttpRedirect, String serviceProviderEntityId, String assertionConsumerServiceURL, String spPrivateKeyAlias, String keyStorePassword, String defaultRedirectUrl, String userIDAttribute, Boolean useEncryption, Boolean createUser, Boolean addGroupMemberships, String groupMembershipAttribute, List<String> defaultGroups, String nameIdFormat, List<String> synchronizeAttributes, Boolean handleLogout, String logoutUrl, Integer clockTolerance, String digestMethod, String signatureMethod, String userIntermediatePath, List<String> propertylist) throws Exception {
        SamlConfigurationInfo obj = postSamlConfiguration(request, post, apply, delete, action, $location, path, serviceRanking, idpUrl, idpCertAlias, idpHttpRedirect, serviceProviderEntityId, assertionConsumerServiceURL, spPrivateKeyAlias, keyStorePassword, defaultRedirectUrl, userIDAttribute, useEncryption, createUser, addGroupMemberships, groupMembershipAttribute, defaultGroups, nameIdFormat, synchronizeAttributes, handleLogout, logoutUrl, clockTolerance, digestMethod, signatureMethod, userIntermediatePath, propertylist);
    if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
    }
JsonNode result = mapper.valueToTree(obj);
return ok(result);

    }

    public abstract SamlConfigurationInfo postSamlConfiguration(Http.Request request, Boolean post, Boolean apply, Boolean delete, String action, String $location, List<String> path, Integer serviceRanking, String idpUrl, String idpCertAlias, Boolean idpHttpRedirect, String serviceProviderEntityId, String assertionConsumerServiceURL, String spPrivateKeyAlias, String keyStorePassword, String defaultRedirectUrl, String userIDAttribute, Boolean useEncryption, Boolean createUser, Boolean addGroupMemberships, String groupMembershipAttribute, List<String> defaultGroups, String nameIdFormat, List<String> synchronizeAttributes, Boolean handleLogout, String logoutUrl, Integer clockTolerance, String digestMethod, String signatureMethod, String userIntermediatePath, List<String> propertylist) throws Exception;

}
