package org.openapitools.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import org.openapitools.api.ApiUtils

import org.openapitools.model.SamlConfigurationInfo

import java.util.*;

@Mixin(ApiUtils)
class ConsoleApi {
    String basePath = "http://localhost"
    String versionPath = "/api/v1"

    def getAemProductInfo ( Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/system/console/status-productinfo.json"

        // query params
        def queryParams = [:]
        def headerParams = [:]

        // TODO: form params, body param not yet support

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "array",
                    String.class )

    }

    def getConfigMgr ( Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/system/console/configMgr"

        // query params
        def queryParams = [:]
        def headerParams = [:]

        // TODO: form params, body param not yet support

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    String.class )

    }

    def postBundle ( String name, String action, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/system/console/bundles/{name}"

        // query params
        def queryParams = [:]
        def headerParams = [:]

        // verify required params are set
        if (name == null) {
            throw new RuntimeException("missing required params name")
        }

        // verify required params are set
        if (action == null) {
            throw new RuntimeException("missing required params action")
        }

        if (!"null".equals(String.valueOf(action)))
            queryParams.put("action", String.valueOf(action))

        // TODO: form params, body param not yet support

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    null )

    }

    def postJmxRepository ( String action, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/system/console/jmx/com.adobe.granite:type=Repository/op/{action}"

        // query params
        def queryParams = [:]
        def headerParams = [:]

        // verify required params are set
        if (action == null) {
            throw new RuntimeException("missing required params action")
        }

        // TODO: form params, body param not yet support

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    null )

    }

    def postSamlConfiguration ( Boolean post, Boolean apply, Boolean delete, String action, String $location, List<String> path, Integer serviceRanking, String idpUrl, String idpCertAlias, Boolean idpHttpRedirect, String serviceProviderEntityId, String assertionConsumerServiceURL, String spPrivateKeyAlias, String keyStorePassword, String defaultRedirectUrl, String userIDAttribute, Boolean useEncryption, Boolean createUser, Boolean addGroupMemberships, String groupMembershipAttribute, List<String> defaultGroups, String nameIdFormat, List<String> synchronizeAttributes, Boolean handleLogout, String logoutUrl, Integer clockTolerance, String digestMethod, String signatureMethod, String userIntermediatePath, List<String> propertylist, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler"

        // query params
        def queryParams = [:]
        def headerParams = [:]

        if (!"null".equals(String.valueOf(post)))
            queryParams.put("post", String.valueOf(post))

        if (!"null".equals(String.valueOf(apply)))
            queryParams.put("apply", String.valueOf(apply))

        if (!"null".equals(String.valueOf(delete)))
            queryParams.put("delete", String.valueOf(delete))

        if (!"null".equals(String.valueOf(action)))
            queryParams.put("action", String.valueOf(action))

        if (!"null".equals(String.valueOf($location)))
            queryParams.put("$location", String.valueOf($location))

        if (!"null".equals(String.valueOf(path)))
            queryParams.put("path", String.valueOf(path))

        if (!"null".equals(String.valueOf(serviceRanking)))
            queryParams.put("service.ranking", String.valueOf(serviceRanking))

        if (!"null".equals(String.valueOf(idpUrl)))
            queryParams.put("idpUrl", String.valueOf(idpUrl))

        if (!"null".equals(String.valueOf(idpCertAlias)))
            queryParams.put("idpCertAlias", String.valueOf(idpCertAlias))

        if (!"null".equals(String.valueOf(idpHttpRedirect)))
            queryParams.put("idpHttpRedirect", String.valueOf(idpHttpRedirect))

        if (!"null".equals(String.valueOf(serviceProviderEntityId)))
            queryParams.put("serviceProviderEntityId", String.valueOf(serviceProviderEntityId))

        if (!"null".equals(String.valueOf(assertionConsumerServiceURL)))
            queryParams.put("assertionConsumerServiceURL", String.valueOf(assertionConsumerServiceURL))

        if (!"null".equals(String.valueOf(spPrivateKeyAlias)))
            queryParams.put("spPrivateKeyAlias", String.valueOf(spPrivateKeyAlias))

        if (!"null".equals(String.valueOf(keyStorePassword)))
            queryParams.put("keyStorePassword", String.valueOf(keyStorePassword))

        if (!"null".equals(String.valueOf(defaultRedirectUrl)))
            queryParams.put("defaultRedirectUrl", String.valueOf(defaultRedirectUrl))

        if (!"null".equals(String.valueOf(userIDAttribute)))
            queryParams.put("userIDAttribute", String.valueOf(userIDAttribute))

        if (!"null".equals(String.valueOf(useEncryption)))
            queryParams.put("useEncryption", String.valueOf(useEncryption))

        if (!"null".equals(String.valueOf(createUser)))
            queryParams.put("createUser", String.valueOf(createUser))

        if (!"null".equals(String.valueOf(addGroupMemberships)))
            queryParams.put("addGroupMemberships", String.valueOf(addGroupMemberships))

        if (!"null".equals(String.valueOf(groupMembershipAttribute)))
            queryParams.put("groupMembershipAttribute", String.valueOf(groupMembershipAttribute))

        if (!"null".equals(String.valueOf(defaultGroups)))
            queryParams.put("defaultGroups", String.valueOf(defaultGroups))

        if (!"null".equals(String.valueOf(nameIdFormat)))
            queryParams.put("nameIdFormat", String.valueOf(nameIdFormat))

        if (!"null".equals(String.valueOf(synchronizeAttributes)))
            queryParams.put("synchronizeAttributes", String.valueOf(synchronizeAttributes))

        if (!"null".equals(String.valueOf(handleLogout)))
            queryParams.put("handleLogout", String.valueOf(handleLogout))

        if (!"null".equals(String.valueOf(logoutUrl)))
            queryParams.put("logoutUrl", String.valueOf(logoutUrl))

        if (!"null".equals(String.valueOf(clockTolerance)))
            queryParams.put("clockTolerance", String.valueOf(clockTolerance))

        if (!"null".equals(String.valueOf(digestMethod)))
            queryParams.put("digestMethod", String.valueOf(digestMethod))

        if (!"null".equals(String.valueOf(signatureMethod)))
            queryParams.put("signatureMethod", String.valueOf(signatureMethod))

        if (!"null".equals(String.valueOf(userIntermediatePath)))
            queryParams.put("userIntermediatePath", String.valueOf(userIntermediatePath))

        if (!"null".equals(String.valueOf(propertylist)))
            queryParams.put("propertylist", String.valueOf(propertylist))

        // TODO: form params, body param not yet support

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    SamlConfigurationInfo.class )

    }

}
