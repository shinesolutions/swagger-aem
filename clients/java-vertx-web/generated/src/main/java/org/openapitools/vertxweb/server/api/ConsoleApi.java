package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.BundleInfo;
import org.openapitools.vertxweb.server.model.SamlConfigurationInfo;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface ConsoleApi  {
    Future<ApiResponse<List<String>>> getAemProductInfo();
    Future<ApiResponse<BundleInfo>> getBundleInfo(String name);
    Future<ApiResponse<String>> getConfigMgr();
    Future<ApiResponse<Void>> postBundle(String name, String action);
    Future<ApiResponse<Void>> postJmxRepository(String action);
    Future<ApiResponse<SamlConfigurationInfo>> postSamlConfiguration(Boolean post, Boolean apply, Boolean delete, String action, String $location, List<String> path, Integer serviceRanking, String idpUrl, String idpCertAlias, Boolean idpHttpRedirect, String serviceProviderEntityId, String assertionConsumerServiceURL, String spPrivateKeyAlias, String keyStorePassword, String defaultRedirectUrl, String userIDAttribute, Boolean useEncryption, Boolean createUser, Boolean addGroupMemberships, String groupMembershipAttribute, List<String> defaultGroups, String nameIdFormat, List<String> synchronizeAttributes, Boolean handleLogout, String logoutUrl, Integer clockTolerance, String digestMethod, String signatureMethod, String userIntermediatePath, List<String> propertylist);
}
