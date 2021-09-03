package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.BundleInfo
import org.openapitools.model.SamlConfigurationInfo

class ConsoleApi {
    String basePath = "http://localhost"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def getAemProductInfo ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/system/console/status-productinfo.json"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType






        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "array",
                    String.class )

    }

    def getBundleInfo ( String name, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/system/console/bundles/${name}.json"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (name == null) {
            throw new RuntimeException("missing required params name")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    BundleInfo.class )

    }

    def getConfigMgr ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/system/console/configMgr"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType






        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    String.class )

    }

    def postBundle ( String name, String action, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/system/console/bundles/${name}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (name == null) {
            throw new RuntimeException("missing required params name")
        }
        // verify required params are set
        if (action == null) {
            throw new RuntimeException("missing required params action")
        }

        if (action != null) {
            queryParams.put("action", action)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def postJmxRepository ( String action, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/system/console/jmx/com.adobe.granite:type=Repository/op/${action}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (action == null) {
            throw new RuntimeException("missing required params action")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def postSamlConfiguration ( Boolean post, Boolean apply, Boolean delete, String action, String $location, List<String> path, Integer serviceRanking, String idpUrl, String idpCertAlias, Boolean idpHttpRedirect, String serviceProviderEntityId, String assertionConsumerServiceURL, String spPrivateKeyAlias, String keyStorePassword, String defaultRedirectUrl, String userIDAttribute, Boolean useEncryption, Boolean createUser, Boolean addGroupMemberships, String groupMembershipAttribute, List<String> defaultGroups, String nameIdFormat, List<String> synchronizeAttributes, Boolean handleLogout, String logoutUrl, Integer clockTolerance, String digestMethod, String signatureMethod, String userIntermediatePath, List<String> propertylist, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (post != null) {
            queryParams.put("post", post)
        }
        if (apply != null) {
            queryParams.put("apply", apply)
        }
        if (delete != null) {
            queryParams.put("delete", delete)
        }
        if (action != null) {
            queryParams.put("action", action)
        }
        if ($location != null) {
            queryParams.put("$location", $location)
        }
        if (path != null) {
            queryParams.put("path", path)
        }
        if (serviceRanking != null) {
            queryParams.put("service.ranking", serviceRanking)
        }
        if (idpUrl != null) {
            queryParams.put("idpUrl", idpUrl)
        }
        if (idpCertAlias != null) {
            queryParams.put("idpCertAlias", idpCertAlias)
        }
        if (idpHttpRedirect != null) {
            queryParams.put("idpHttpRedirect", idpHttpRedirect)
        }
        if (serviceProviderEntityId != null) {
            queryParams.put("serviceProviderEntityId", serviceProviderEntityId)
        }
        if (assertionConsumerServiceURL != null) {
            queryParams.put("assertionConsumerServiceURL", assertionConsumerServiceURL)
        }
        if (spPrivateKeyAlias != null) {
            queryParams.put("spPrivateKeyAlias", spPrivateKeyAlias)
        }
        if (keyStorePassword != null) {
            queryParams.put("keyStorePassword", keyStorePassword)
        }
        if (defaultRedirectUrl != null) {
            queryParams.put("defaultRedirectUrl", defaultRedirectUrl)
        }
        if (userIDAttribute != null) {
            queryParams.put("userIDAttribute", userIDAttribute)
        }
        if (useEncryption != null) {
            queryParams.put("useEncryption", useEncryption)
        }
        if (createUser != null) {
            queryParams.put("createUser", createUser)
        }
        if (addGroupMemberships != null) {
            queryParams.put("addGroupMemberships", addGroupMemberships)
        }
        if (groupMembershipAttribute != null) {
            queryParams.put("groupMembershipAttribute", groupMembershipAttribute)
        }
        if (defaultGroups != null) {
            queryParams.put("defaultGroups", defaultGroups)
        }
        if (nameIdFormat != null) {
            queryParams.put("nameIdFormat", nameIdFormat)
        }
        if (synchronizeAttributes != null) {
            queryParams.put("synchronizeAttributes", synchronizeAttributes)
        }
        if (handleLogout != null) {
            queryParams.put("handleLogout", handleLogout)
        }
        if (logoutUrl != null) {
            queryParams.put("logoutUrl", logoutUrl)
        }
        if (clockTolerance != null) {
            queryParams.put("clockTolerance", clockTolerance)
        }
        if (digestMethod != null) {
            queryParams.put("digestMethod", digestMethod)
        }
        if (signatureMethod != null) {
            queryParams.put("signatureMethod", signatureMethod)
        }
        if (userIntermediatePath != null) {
            queryParams.put("userIntermediatePath", userIntermediatePath)
        }
        if (propertylist != null) {
            queryParams.put("propertylist", propertylist)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    SamlConfigurationInfo.class )

    }

}
