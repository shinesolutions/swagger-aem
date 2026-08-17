package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.BundleInfo;
import org.openapitools.vertxweb.server.model.SamlConfigurationInfo;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class ConsoleApiImpl implements ConsoleApi {
    public Future<ApiResponse<List<String>>> getAemProductInfo() {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<BundleInfo>> getBundleInfo(String name) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<String>> getConfigMgr() {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<Void>> postBundle(String name, String action) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<Void>> postJmxRepository(String action) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<SamlConfigurationInfo>> postSamlConfiguration(Boolean post, Boolean apply, Boolean delete, String action, String $location, List<String> path, Integer serviceRanking, String idpUrl, String idpCertAlias, Boolean idpHttpRedirect, String serviceProviderEntityId, String assertionConsumerServiceURL, String spPrivateKeyAlias, String keyStorePassword, String defaultRedirectUrl, String userIDAttribute, Boolean useEncryption, Boolean createUser, Boolean addGroupMemberships, String groupMembershipAttribute, List<String> defaultGroups, String nameIdFormat, List<String> synchronizeAttributes, Boolean handleLogout, String logoutUrl, Integer clockTolerance, String digestMethod, String signatureMethod, String userIntermediatePath, List<String> propertylist) {
        return Future.failedFuture(new HttpException(501));
    }

}
