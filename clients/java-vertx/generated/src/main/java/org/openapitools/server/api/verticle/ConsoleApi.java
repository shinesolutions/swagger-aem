package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.BundleInfo;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.SamlConfigurationInfo;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface ConsoleApi  {
    //getAemProductInfo
    void getAemProductInfo(Handler<AsyncResult<List<String>>> handler);
    
    //getBundleInfo
    void getBundleInfo(String name, Handler<AsyncResult<BundleInfo>> handler);
    
    //getConfigMgr
    void getConfigMgr(Handler<AsyncResult<String>> handler);
    
    //postBundle
    void postBundle(String name, String action, Handler<AsyncResult<Void>> handler);
    
    //postJmxRepository
    void postJmxRepository(String action, Handler<AsyncResult<Void>> handler);
    
    //postSamlConfiguration
    void postSamlConfiguration(Boolean post, Boolean apply, Boolean delete, String action, String $location, List<String> path, Integer serviceRanking, String idpUrl, String idpCertAlias, Boolean idpHttpRedirect, String serviceProviderEntityId, String assertionConsumerServiceURL, String spPrivateKeyAlias, String keyStorePassword, String defaultRedirectUrl, String userIDAttribute, Boolean useEncryption, Boolean createUser, Boolean addGroupMemberships, String groupMembershipAttribute, List<String> defaultGroups, String nameIdFormat, List<String> synchronizeAttributes, Boolean handleLogout, String logoutUrl, Integer clockTolerance, String digestMethod, String signatureMethod, String userIntermediatePath, List<String> propertylist, Handler<AsyncResult<SamlConfigurationInfo>> handler);
    
}
