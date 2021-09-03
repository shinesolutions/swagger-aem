package org.openapitools.api;

import org.openapitools.api.ApiUtils
import java.math.BigDecimal
import org.openapitools.model.KeystoreInfo
import org.openapitools.model.TruststoreInfo

class SlingApi {
    String basePath = "http://localhost"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def deleteAgent ( String runmode, String name, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/etc/replication/agents.${runmode}/${name}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (runmode == null) {
            throw new RuntimeException("missing required params runmode")
        }
        // verify required params are set
        if (name == null) {
            throw new RuntimeException("missing required params name")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "DELETE", "",
                    null )

    }

    def deleteNode ( String path, String name, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/${path}/${name}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (path == null) {
            throw new RuntimeException("missing required params path")
        }
        // verify required params are set
        if (name == null) {
            throw new RuntimeException("missing required params name")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "DELETE", "",
                    null )

    }

    def getAgent ( String runmode, String name, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/etc/replication/agents.${runmode}/${name}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (runmode == null) {
            throw new RuntimeException("missing required params runmode")
        }
        // verify required params are set
        if (name == null) {
            throw new RuntimeException("missing required params name")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def getAgents ( String runmode, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/etc/replication/agents.${runmode}.-1.json"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (runmode == null) {
            throw new RuntimeException("missing required params runmode")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    String.class )

    }

    def getAuthorizableKeystore ( String intermediatePath, String authorizableId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/${intermediatePath}/${authorizableId}.ks.json"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (intermediatePath == null) {
            throw new RuntimeException("missing required params intermediatePath")
        }
        // verify required params are set
        if (authorizableId == null) {
            throw new RuntimeException("missing required params authorizableId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    KeystoreInfo.class )

    }

    def getKeystore ( String intermediatePath, String authorizableId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/${intermediatePath}/${authorizableId}/keystore/store.p12"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (intermediatePath == null) {
            throw new RuntimeException("missing required params intermediatePath")
        }
        // verify required params are set
        if (authorizableId == null) {
            throw new RuntimeException("missing required params authorizableId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    File.class )

    }

    def getNode ( String path, String name, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/${path}/${name}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (path == null) {
            throw new RuntimeException("missing required params path")
        }
        // verify required params are set
        if (name == null) {
            throw new RuntimeException("missing required params name")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def getPackage ( String group, String name, String version, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/etc/packages/${group}/${name}-${version}.zip"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (group == null) {
            throw new RuntimeException("missing required params group")
        }
        // verify required params are set
        if (name == null) {
            throw new RuntimeException("missing required params name")
        }
        // verify required params are set
        if (version == null) {
            throw new RuntimeException("missing required params version")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    File.class )

    }

    def getPackageFilter ( String group, String name, String version, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/etc/packages/${group}/${name}-${version}.zip/jcr:content/vlt:definition/filter.tidy.2.json"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (group == null) {
            throw new RuntimeException("missing required params group")
        }
        // verify required params are set
        if (name == null) {
            throw new RuntimeException("missing required params name")
        }
        // verify required params are set
        if (version == null) {
            throw new RuntimeException("missing required params version")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    String.class )

    }

    def getQuery ( String path, BigDecimal pLimit, String _1property, String _1propertyValue, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/bin/querybuilder.json"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (path == null) {
            throw new RuntimeException("missing required params path")
        }
        // verify required params are set
        if (pLimit == null) {
            throw new RuntimeException("missing required params pLimit")
        }
        // verify required params are set
        if (_1property == null) {
            throw new RuntimeException("missing required params _1property")
        }
        // verify required params are set
        if (_1propertyValue == null) {
            throw new RuntimeException("missing required params _1propertyValue")
        }

        if (path != null) {
            queryParams.put("path", path)
        }
        if (pLimit != null) {
            queryParams.put("p.limit", pLimit)
        }
        if (_1property != null) {
            queryParams.put("1_property", _1property)
        }
        if (_1propertyValue != null) {
            queryParams.put("1_property.value", _1propertyValue)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    String.class )

    }

    def getTruststore ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/etc/truststore/truststore.p12"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType






        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    File.class )

    }

    def getTruststoreInfo ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/libs/granite/security/truststore.json"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType






        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    TruststoreInfo.class )

    }

    def postAgent ( String runmode, String name, Boolean jcrColonContentCqColonDistribute, String jcrColonContentCqColonDistributeAtTypeHint, String jcrColonContentCqColonName, String jcrColonContentCqColonTemplate, Boolean jcrColonContentEnabled, String jcrColonContentJcrColonDescription, String jcrColonContentJcrColonLastModified, String jcrColonContentJcrColonLastModifiedBy, String jcrColonContentJcrColonMixinTypes, String jcrColonContentJcrColonTitle, String jcrColonContentLogLevel, Boolean jcrColonContentNoStatusUpdate, Boolean jcrColonContentNoVersioning, BigDecimal jcrColonContentProtocolConnectTimeout, Boolean jcrColonContentProtocolHTTPConnectionClosed, String jcrColonContentProtocolHTTPExpired, List<String> jcrColonContentProtocolHTTPHeaders, String jcrColonContentProtocolHTTPHeadersAtTypeHint, String jcrColonContentProtocolHTTPMethod, Boolean jcrColonContentProtocolHTTPSRelaxed, String jcrColonContentProtocolInterface, BigDecimal jcrColonContentProtocolSocketTimeout, String jcrColonContentProtocolVersion, String jcrColonContentProxyNTLMDomain, String jcrColonContentProxyNTLMHost, String jcrColonContentProxyHost, String jcrColonContentProxyPassword, BigDecimal jcrColonContentProxyPort, String jcrColonContentProxyUser, BigDecimal jcrColonContentQueueBatchMaxSize, String jcrColonContentQueueBatchMode, BigDecimal jcrColonContentQueueBatchWaitTime, String jcrColonContentRetryDelay, Boolean jcrColonContentReverseReplication, String jcrColonContentSerializationType, String jcrColonContentSlingColonResourceType, String jcrColonContentSsl, String jcrColonContentTransportNTLMDomain, String jcrColonContentTransportNTLMHost, String jcrColonContentTransportPassword, String jcrColonContentTransportUri, String jcrColonContentTransportUser, Boolean jcrColonContentTriggerDistribute, Boolean jcrColonContentTriggerModified, Boolean jcrColonContentTriggerOnOffTime, Boolean jcrColonContentTriggerReceive, Boolean jcrColonContentTriggerSpecific, String jcrColonContentUserId, String jcrColonPrimaryType, String colonOperation, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/etc/replication/agents.${runmode}/${name}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (runmode == null) {
            throw new RuntimeException("missing required params runmode")
        }
        // verify required params are set
        if (name == null) {
            throw new RuntimeException("missing required params name")
        }

        if (jcrColonContentCqColonDistribute != null) {
            queryParams.put("jcr:content/cq:distribute", jcrColonContentCqColonDistribute)
        }
        if (jcrColonContentCqColonDistributeAtTypeHint != null) {
            queryParams.put("jcr:content/cq:distribute@TypeHint", jcrColonContentCqColonDistributeAtTypeHint)
        }
        if (jcrColonContentCqColonName != null) {
            queryParams.put("jcr:content/cq:name", jcrColonContentCqColonName)
        }
        if (jcrColonContentCqColonTemplate != null) {
            queryParams.put("jcr:content/cq:template", jcrColonContentCqColonTemplate)
        }
        if (jcrColonContentEnabled != null) {
            queryParams.put("jcr:content/enabled", jcrColonContentEnabled)
        }
        if (jcrColonContentJcrColonDescription != null) {
            queryParams.put("jcr:content/jcr:description", jcrColonContentJcrColonDescription)
        }
        if (jcrColonContentJcrColonLastModified != null) {
            queryParams.put("jcr:content/jcr:lastModified", jcrColonContentJcrColonLastModified)
        }
        if (jcrColonContentJcrColonLastModifiedBy != null) {
            queryParams.put("jcr:content/jcr:lastModifiedBy", jcrColonContentJcrColonLastModifiedBy)
        }
        if (jcrColonContentJcrColonMixinTypes != null) {
            queryParams.put("jcr:content/jcr:mixinTypes", jcrColonContentJcrColonMixinTypes)
        }
        if (jcrColonContentJcrColonTitle != null) {
            queryParams.put("jcr:content/jcr:title", jcrColonContentJcrColonTitle)
        }
        if (jcrColonContentLogLevel != null) {
            queryParams.put("jcr:content/logLevel", jcrColonContentLogLevel)
        }
        if (jcrColonContentNoStatusUpdate != null) {
            queryParams.put("jcr:content/noStatusUpdate", jcrColonContentNoStatusUpdate)
        }
        if (jcrColonContentNoVersioning != null) {
            queryParams.put("jcr:content/noVersioning", jcrColonContentNoVersioning)
        }
        if (jcrColonContentProtocolConnectTimeout != null) {
            queryParams.put("jcr:content/protocolConnectTimeout", jcrColonContentProtocolConnectTimeout)
        }
        if (jcrColonContentProtocolHTTPConnectionClosed != null) {
            queryParams.put("jcr:content/protocolHTTPConnectionClosed", jcrColonContentProtocolHTTPConnectionClosed)
        }
        if (jcrColonContentProtocolHTTPExpired != null) {
            queryParams.put("jcr:content/protocolHTTPExpired", jcrColonContentProtocolHTTPExpired)
        }
        if (jcrColonContentProtocolHTTPHeaders != null) {
            queryParams.put("jcr:content/protocolHTTPHeaders", jcrColonContentProtocolHTTPHeaders)
        }
        if (jcrColonContentProtocolHTTPHeadersAtTypeHint != null) {
            queryParams.put("jcr:content/protocolHTTPHeaders@TypeHint", jcrColonContentProtocolHTTPHeadersAtTypeHint)
        }
        if (jcrColonContentProtocolHTTPMethod != null) {
            queryParams.put("jcr:content/protocolHTTPMethod", jcrColonContentProtocolHTTPMethod)
        }
        if (jcrColonContentProtocolHTTPSRelaxed != null) {
            queryParams.put("jcr:content/protocolHTTPSRelaxed", jcrColonContentProtocolHTTPSRelaxed)
        }
        if (jcrColonContentProtocolInterface != null) {
            queryParams.put("jcr:content/protocolInterface", jcrColonContentProtocolInterface)
        }
        if (jcrColonContentProtocolSocketTimeout != null) {
            queryParams.put("jcr:content/protocolSocketTimeout", jcrColonContentProtocolSocketTimeout)
        }
        if (jcrColonContentProtocolVersion != null) {
            queryParams.put("jcr:content/protocolVersion", jcrColonContentProtocolVersion)
        }
        if (jcrColonContentProxyNTLMDomain != null) {
            queryParams.put("jcr:content/proxyNTLMDomain", jcrColonContentProxyNTLMDomain)
        }
        if (jcrColonContentProxyNTLMHost != null) {
            queryParams.put("jcr:content/proxyNTLMHost", jcrColonContentProxyNTLMHost)
        }
        if (jcrColonContentProxyHost != null) {
            queryParams.put("jcr:content/proxyHost", jcrColonContentProxyHost)
        }
        if (jcrColonContentProxyPassword != null) {
            queryParams.put("jcr:content/proxyPassword", jcrColonContentProxyPassword)
        }
        if (jcrColonContentProxyPort != null) {
            queryParams.put("jcr:content/proxyPort", jcrColonContentProxyPort)
        }
        if (jcrColonContentProxyUser != null) {
            queryParams.put("jcr:content/proxyUser", jcrColonContentProxyUser)
        }
        if (jcrColonContentQueueBatchMaxSize != null) {
            queryParams.put("jcr:content/queueBatchMaxSize", jcrColonContentQueueBatchMaxSize)
        }
        if (jcrColonContentQueueBatchMode != null) {
            queryParams.put("jcr:content/queueBatchMode", jcrColonContentQueueBatchMode)
        }
        if (jcrColonContentQueueBatchWaitTime != null) {
            queryParams.put("jcr:content/queueBatchWaitTime", jcrColonContentQueueBatchWaitTime)
        }
        if (jcrColonContentRetryDelay != null) {
            queryParams.put("jcr:content/retryDelay", jcrColonContentRetryDelay)
        }
        if (jcrColonContentReverseReplication != null) {
            queryParams.put("jcr:content/reverseReplication", jcrColonContentReverseReplication)
        }
        if (jcrColonContentSerializationType != null) {
            queryParams.put("jcr:content/serializationType", jcrColonContentSerializationType)
        }
        if (jcrColonContentSlingColonResourceType != null) {
            queryParams.put("jcr:content/sling:resourceType", jcrColonContentSlingColonResourceType)
        }
        if (jcrColonContentSsl != null) {
            queryParams.put("jcr:content/ssl", jcrColonContentSsl)
        }
        if (jcrColonContentTransportNTLMDomain != null) {
            queryParams.put("jcr:content/transportNTLMDomain", jcrColonContentTransportNTLMDomain)
        }
        if (jcrColonContentTransportNTLMHost != null) {
            queryParams.put("jcr:content/transportNTLMHost", jcrColonContentTransportNTLMHost)
        }
        if (jcrColonContentTransportPassword != null) {
            queryParams.put("jcr:content/transportPassword", jcrColonContentTransportPassword)
        }
        if (jcrColonContentTransportUri != null) {
            queryParams.put("jcr:content/transportUri", jcrColonContentTransportUri)
        }
        if (jcrColonContentTransportUser != null) {
            queryParams.put("jcr:content/transportUser", jcrColonContentTransportUser)
        }
        if (jcrColonContentTriggerDistribute != null) {
            queryParams.put("jcr:content/triggerDistribute", jcrColonContentTriggerDistribute)
        }
        if (jcrColonContentTriggerModified != null) {
            queryParams.put("jcr:content/triggerModified", jcrColonContentTriggerModified)
        }
        if (jcrColonContentTriggerOnOffTime != null) {
            queryParams.put("jcr:content/triggerOnOffTime", jcrColonContentTriggerOnOffTime)
        }
        if (jcrColonContentTriggerReceive != null) {
            queryParams.put("jcr:content/triggerReceive", jcrColonContentTriggerReceive)
        }
        if (jcrColonContentTriggerSpecific != null) {
            queryParams.put("jcr:content/triggerSpecific", jcrColonContentTriggerSpecific)
        }
        if (jcrColonContentUserId != null) {
            queryParams.put("jcr:content/userId", jcrColonContentUserId)
        }
        if (jcrColonPrimaryType != null) {
            queryParams.put("jcr:primaryType", jcrColonPrimaryType)
        }
        if (colonOperation != null) {
            queryParams.put(":operation", colonOperation)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def postAuthorizableKeystore ( String intermediatePath, String authorizableId, String colonOperation, String currentPassword, String newPassword, String rePassword, String keyPassword, String keyStorePass, String alias, String newAlias, String removeAlias, File certChain, File pk, File keyStore, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/${intermediatePath}/${authorizableId}.ks.html"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (intermediatePath == null) {
            throw new RuntimeException("missing required params intermediatePath")
        }
        // verify required params are set
        if (authorizableId == null) {
            throw new RuntimeException("missing required params authorizableId")
        }

        if (colonOperation != null) {
            queryParams.put(":operation", colonOperation)
        }
        if (currentPassword != null) {
            queryParams.put("currentPassword", currentPassword)
        }
        if (newPassword != null) {
            queryParams.put("newPassword", newPassword)
        }
        if (rePassword != null) {
            queryParams.put("rePassword", rePassword)
        }
        if (keyPassword != null) {
            queryParams.put("keyPassword", keyPassword)
        }
        if (keyStorePass != null) {
            queryParams.put("keyStorePass", keyStorePass)
        }
        if (alias != null) {
            queryParams.put("alias", alias)
        }
        if (newAlias != null) {
            queryParams.put("newAlias", newAlias)
        }
        if (removeAlias != null) {
            queryParams.put("removeAlias", removeAlias)
        }



        contentType = 'multipart/form-data';
        bodyParams = [:]
        bodyParams.put("cert-chain", certChain)
        bodyParams.put("pk", pk)
        bodyParams.put("keyStore", keyStore)

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    KeystoreInfo.class )

    }

    def postAuthorizables ( String authorizableId, String intermediatePath, String createUser, String createGroup, String repColonPassword, String profileGivenName, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/libs/granite/security/post/authorizables"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (authorizableId == null) {
            throw new RuntimeException("missing required params authorizableId")
        }
        // verify required params are set
        if (intermediatePath == null) {
            throw new RuntimeException("missing required params intermediatePath")
        }

        if (authorizableId != null) {
            queryParams.put("authorizableId", authorizableId)
        }
        if (intermediatePath != null) {
            queryParams.put("intermediatePath", intermediatePath)
        }
        if (createUser != null) {
            queryParams.put("createUser", createUser)
        }
        if (createGroup != null) {
            queryParams.put("createGroup", createGroup)
        }
        if (repColonPassword != null) {
            queryParams.put("rep:password", repColonPassword)
        }
        if (profileGivenName != null) {
            queryParams.put("profile/givenName", profileGivenName)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    String.class )

    }

    def postConfigAdobeGraniteSamlAuthenticationHandler ( String keyStorePassword, String keyStorePasswordAtTypeHint, Integer serviceRanking, String serviceRankingAtTypeHint, Boolean idpHttpRedirect, String idpHttpRedirectAtTypeHint, Boolean createUser, String createUserAtTypeHint, String defaultRedirectUrl, String defaultRedirectUrlAtTypeHint, String userIDAttribute, String userIDAttributeAtTypeHint, List<String> defaultGroups, String defaultGroupsAtTypeHint, String idpCertAlias, String idpCertAliasAtTypeHint, Boolean addGroupMemberships, String addGroupMembershipsAtTypeHint, List<String> path, String pathAtTypeHint, List<String> synchronizeAttributes, String synchronizeAttributesAtTypeHint, Integer clockTolerance, String clockToleranceAtTypeHint, String groupMembershipAttribute, String groupMembershipAttributeAtTypeHint, String idpUrl, String idpUrlAtTypeHint, String logoutUrl, String logoutUrlAtTypeHint, String serviceProviderEntityId, String serviceProviderEntityIdAtTypeHint, String assertionConsumerServiceURL, String assertionConsumerServiceURLAtTypeHint, Boolean handleLogout, String handleLogoutAtTypeHint, String spPrivateKeyAlias, String spPrivateKeyAliasAtTypeHint, Boolean useEncryption, String useEncryptionAtTypeHint, String nameIdFormat, String nameIdFormatAtTypeHint, String digestMethod, String digestMethodAtTypeHint, String signatureMethod, String signatureMethodAtTypeHint, String userIntermediatePath, String userIntermediatePathAtTypeHint, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (keyStorePassword != null) {
            queryParams.put("keyStorePassword", keyStorePassword)
        }
        if (keyStorePasswordAtTypeHint != null) {
            queryParams.put("keyStorePassword@TypeHint", keyStorePasswordAtTypeHint)
        }
        if (serviceRanking != null) {
            queryParams.put("service.ranking", serviceRanking)
        }
        if (serviceRankingAtTypeHint != null) {
            queryParams.put("service.ranking@TypeHint", serviceRankingAtTypeHint)
        }
        if (idpHttpRedirect != null) {
            queryParams.put("idpHttpRedirect", idpHttpRedirect)
        }
        if (idpHttpRedirectAtTypeHint != null) {
            queryParams.put("idpHttpRedirect@TypeHint", idpHttpRedirectAtTypeHint)
        }
        if (createUser != null) {
            queryParams.put("createUser", createUser)
        }
        if (createUserAtTypeHint != null) {
            queryParams.put("createUser@TypeHint", createUserAtTypeHint)
        }
        if (defaultRedirectUrl != null) {
            queryParams.put("defaultRedirectUrl", defaultRedirectUrl)
        }
        if (defaultRedirectUrlAtTypeHint != null) {
            queryParams.put("defaultRedirectUrl@TypeHint", defaultRedirectUrlAtTypeHint)
        }
        if (userIDAttribute != null) {
            queryParams.put("userIDAttribute", userIDAttribute)
        }
        if (userIDAttributeAtTypeHint != null) {
            queryParams.put("userIDAttribute@TypeHint", userIDAttributeAtTypeHint)
        }
        if (defaultGroups != null) {
            queryParams.put("defaultGroups", defaultGroups)
        }
        if (defaultGroupsAtTypeHint != null) {
            queryParams.put("defaultGroups@TypeHint", defaultGroupsAtTypeHint)
        }
        if (idpCertAlias != null) {
            queryParams.put("idpCertAlias", idpCertAlias)
        }
        if (idpCertAliasAtTypeHint != null) {
            queryParams.put("idpCertAlias@TypeHint", idpCertAliasAtTypeHint)
        }
        if (addGroupMemberships != null) {
            queryParams.put("addGroupMemberships", addGroupMemberships)
        }
        if (addGroupMembershipsAtTypeHint != null) {
            queryParams.put("addGroupMemberships@TypeHint", addGroupMembershipsAtTypeHint)
        }
        if (path != null) {
            queryParams.put("path", path)
        }
        if (pathAtTypeHint != null) {
            queryParams.put("path@TypeHint", pathAtTypeHint)
        }
        if (synchronizeAttributes != null) {
            queryParams.put("synchronizeAttributes", synchronizeAttributes)
        }
        if (synchronizeAttributesAtTypeHint != null) {
            queryParams.put("synchronizeAttributes@TypeHint", synchronizeAttributesAtTypeHint)
        }
        if (clockTolerance != null) {
            queryParams.put("clockTolerance", clockTolerance)
        }
        if (clockToleranceAtTypeHint != null) {
            queryParams.put("clockTolerance@TypeHint", clockToleranceAtTypeHint)
        }
        if (groupMembershipAttribute != null) {
            queryParams.put("groupMembershipAttribute", groupMembershipAttribute)
        }
        if (groupMembershipAttributeAtTypeHint != null) {
            queryParams.put("groupMembershipAttribute@TypeHint", groupMembershipAttributeAtTypeHint)
        }
        if (idpUrl != null) {
            queryParams.put("idpUrl", idpUrl)
        }
        if (idpUrlAtTypeHint != null) {
            queryParams.put("idpUrl@TypeHint", idpUrlAtTypeHint)
        }
        if (logoutUrl != null) {
            queryParams.put("logoutUrl", logoutUrl)
        }
        if (logoutUrlAtTypeHint != null) {
            queryParams.put("logoutUrl@TypeHint", logoutUrlAtTypeHint)
        }
        if (serviceProviderEntityId != null) {
            queryParams.put("serviceProviderEntityId", serviceProviderEntityId)
        }
        if (serviceProviderEntityIdAtTypeHint != null) {
            queryParams.put("serviceProviderEntityId@TypeHint", serviceProviderEntityIdAtTypeHint)
        }
        if (assertionConsumerServiceURL != null) {
            queryParams.put("assertionConsumerServiceURL", assertionConsumerServiceURL)
        }
        if (assertionConsumerServiceURLAtTypeHint != null) {
            queryParams.put("assertionConsumerServiceURL@TypeHint", assertionConsumerServiceURLAtTypeHint)
        }
        if (handleLogout != null) {
            queryParams.put("handleLogout", handleLogout)
        }
        if (handleLogoutAtTypeHint != null) {
            queryParams.put("handleLogout@TypeHint", handleLogoutAtTypeHint)
        }
        if (spPrivateKeyAlias != null) {
            queryParams.put("spPrivateKeyAlias", spPrivateKeyAlias)
        }
        if (spPrivateKeyAliasAtTypeHint != null) {
            queryParams.put("spPrivateKeyAlias@TypeHint", spPrivateKeyAliasAtTypeHint)
        }
        if (useEncryption != null) {
            queryParams.put("useEncryption", useEncryption)
        }
        if (useEncryptionAtTypeHint != null) {
            queryParams.put("useEncryption@TypeHint", useEncryptionAtTypeHint)
        }
        if (nameIdFormat != null) {
            queryParams.put("nameIdFormat", nameIdFormat)
        }
        if (nameIdFormatAtTypeHint != null) {
            queryParams.put("nameIdFormat@TypeHint", nameIdFormatAtTypeHint)
        }
        if (digestMethod != null) {
            queryParams.put("digestMethod", digestMethod)
        }
        if (digestMethodAtTypeHint != null) {
            queryParams.put("digestMethod@TypeHint", digestMethodAtTypeHint)
        }
        if (signatureMethod != null) {
            queryParams.put("signatureMethod", signatureMethod)
        }
        if (signatureMethodAtTypeHint != null) {
            queryParams.put("signatureMethod@TypeHint", signatureMethodAtTypeHint)
        }
        if (userIntermediatePath != null) {
            queryParams.put("userIntermediatePath", userIntermediatePath)
        }
        if (userIntermediatePathAtTypeHint != null) {
            queryParams.put("userIntermediatePath@TypeHint", userIntermediatePathAtTypeHint)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def postConfigApacheFelixJettyBasedHttpService ( Boolean orgApacheFelixHttpsNio, String orgApacheFelixHttpsNioAtTypeHint, String orgApacheFelixHttpsKeystore, String orgApacheFelixHttpsKeystoreAtTypeHint, String orgApacheFelixHttpsKeystorePassword, String orgApacheFelixHttpsKeystorePasswordAtTypeHint, String orgApacheFelixHttpsKeystoreKey, String orgApacheFelixHttpsKeystoreKeyAtTypeHint, String orgApacheFelixHttpsKeystoreKeyPassword, String orgApacheFelixHttpsKeystoreKeyPasswordAtTypeHint, String orgApacheFelixHttpsTruststore, String orgApacheFelixHttpsTruststoreAtTypeHint, String orgApacheFelixHttpsTruststorePassword, String orgApacheFelixHttpsTruststorePasswordAtTypeHint, String orgApacheFelixHttpsClientcertificate, String orgApacheFelixHttpsClientcertificateAtTypeHint, Boolean orgApacheFelixHttpsEnable, String orgApacheFelixHttpsEnableAtTypeHint, String orgOsgiServiceHttpPortSecure, String orgOsgiServiceHttpPortSecureAtTypeHint, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/apps/system/config/org.apache.felix.http"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (orgApacheFelixHttpsNio != null) {
            queryParams.put("org.apache.felix.https.nio", orgApacheFelixHttpsNio)
        }
        if (orgApacheFelixHttpsNioAtTypeHint != null) {
            queryParams.put("org.apache.felix.https.nio@TypeHint", orgApacheFelixHttpsNioAtTypeHint)
        }
        if (orgApacheFelixHttpsKeystore != null) {
            queryParams.put("org.apache.felix.https.keystore", orgApacheFelixHttpsKeystore)
        }
        if (orgApacheFelixHttpsKeystoreAtTypeHint != null) {
            queryParams.put("org.apache.felix.https.keystore@TypeHint", orgApacheFelixHttpsKeystoreAtTypeHint)
        }
        if (orgApacheFelixHttpsKeystorePassword != null) {
            queryParams.put("org.apache.felix.https.keystore.password", orgApacheFelixHttpsKeystorePassword)
        }
        if (orgApacheFelixHttpsKeystorePasswordAtTypeHint != null) {
            queryParams.put("org.apache.felix.https.keystore.password@TypeHint", orgApacheFelixHttpsKeystorePasswordAtTypeHint)
        }
        if (orgApacheFelixHttpsKeystoreKey != null) {
            queryParams.put("org.apache.felix.https.keystore.key", orgApacheFelixHttpsKeystoreKey)
        }
        if (orgApacheFelixHttpsKeystoreKeyAtTypeHint != null) {
            queryParams.put("org.apache.felix.https.keystore.key@TypeHint", orgApacheFelixHttpsKeystoreKeyAtTypeHint)
        }
        if (orgApacheFelixHttpsKeystoreKeyPassword != null) {
            queryParams.put("org.apache.felix.https.keystore.key.password", orgApacheFelixHttpsKeystoreKeyPassword)
        }
        if (orgApacheFelixHttpsKeystoreKeyPasswordAtTypeHint != null) {
            queryParams.put("org.apache.felix.https.keystore.key.password@TypeHint", orgApacheFelixHttpsKeystoreKeyPasswordAtTypeHint)
        }
        if (orgApacheFelixHttpsTruststore != null) {
            queryParams.put("org.apache.felix.https.truststore", orgApacheFelixHttpsTruststore)
        }
        if (orgApacheFelixHttpsTruststoreAtTypeHint != null) {
            queryParams.put("org.apache.felix.https.truststore@TypeHint", orgApacheFelixHttpsTruststoreAtTypeHint)
        }
        if (orgApacheFelixHttpsTruststorePassword != null) {
            queryParams.put("org.apache.felix.https.truststore.password", orgApacheFelixHttpsTruststorePassword)
        }
        if (orgApacheFelixHttpsTruststorePasswordAtTypeHint != null) {
            queryParams.put("org.apache.felix.https.truststore.password@TypeHint", orgApacheFelixHttpsTruststorePasswordAtTypeHint)
        }
        if (orgApacheFelixHttpsClientcertificate != null) {
            queryParams.put("org.apache.felix.https.clientcertificate", orgApacheFelixHttpsClientcertificate)
        }
        if (orgApacheFelixHttpsClientcertificateAtTypeHint != null) {
            queryParams.put("org.apache.felix.https.clientcertificate@TypeHint", orgApacheFelixHttpsClientcertificateAtTypeHint)
        }
        if (orgApacheFelixHttpsEnable != null) {
            queryParams.put("org.apache.felix.https.enable", orgApacheFelixHttpsEnable)
        }
        if (orgApacheFelixHttpsEnableAtTypeHint != null) {
            queryParams.put("org.apache.felix.https.enable@TypeHint", orgApacheFelixHttpsEnableAtTypeHint)
        }
        if (orgOsgiServiceHttpPortSecure != null) {
            queryParams.put("org.osgi.service.http.port.secure", orgOsgiServiceHttpPortSecure)
        }
        if (orgOsgiServiceHttpPortSecureAtTypeHint != null) {
            queryParams.put("org.osgi.service.http.port.secure@TypeHint", orgOsgiServiceHttpPortSecureAtTypeHint)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def postConfigApacheHttpComponentsProxyConfiguration ( String proxyHost, String proxyHostAtTypeHint, Integer proxyPort, String proxyPortAtTypeHint, List<String> proxyExceptions, String proxyExceptionsAtTypeHint, Boolean proxyEnabled, String proxyEnabledAtTypeHint, String proxyUser, String proxyUserAtTypeHint, String proxyPassword, String proxyPasswordAtTypeHint, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/apps/system/config/org.apache.http.proxyconfigurator.config"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (proxyHost != null) {
            queryParams.put("proxy.host", proxyHost)
        }
        if (proxyHostAtTypeHint != null) {
            queryParams.put("proxy.host@TypeHint", proxyHostAtTypeHint)
        }
        if (proxyPort != null) {
            queryParams.put("proxy.port", proxyPort)
        }
        if (proxyPortAtTypeHint != null) {
            queryParams.put("proxy.port@TypeHint", proxyPortAtTypeHint)
        }
        if (proxyExceptions != null) {
            queryParams.put("proxy.exceptions", proxyExceptions)
        }
        if (proxyExceptionsAtTypeHint != null) {
            queryParams.put("proxy.exceptions@TypeHint", proxyExceptionsAtTypeHint)
        }
        if (proxyEnabled != null) {
            queryParams.put("proxy.enabled", proxyEnabled)
        }
        if (proxyEnabledAtTypeHint != null) {
            queryParams.put("proxy.enabled@TypeHint", proxyEnabledAtTypeHint)
        }
        if (proxyUser != null) {
            queryParams.put("proxy.user", proxyUser)
        }
        if (proxyUserAtTypeHint != null) {
            queryParams.put("proxy.user@TypeHint", proxyUserAtTypeHint)
        }
        if (proxyPassword != null) {
            queryParams.put("proxy.password", proxyPassword)
        }
        if (proxyPasswordAtTypeHint != null) {
            queryParams.put("proxy.password@TypeHint", proxyPasswordAtTypeHint)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def postConfigApacheSlingDavExServlet ( String alias, String aliasAtTypeHint, Boolean davCreateAbsoluteUri, String davCreateAbsoluteUriAtTypeHint, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (alias != null) {
            queryParams.put("alias", alias)
        }
        if (aliasAtTypeHint != null) {
            queryParams.put("alias@TypeHint", aliasAtTypeHint)
        }
        if (davCreateAbsoluteUri != null) {
            queryParams.put("dav.create-absolute-uri", davCreateAbsoluteUri)
        }
        if (davCreateAbsoluteUriAtTypeHint != null) {
            queryParams.put("dav.create-absolute-uri@TypeHint", davCreateAbsoluteUriAtTypeHint)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def postConfigApacheSlingGetServlet ( String jsonMaximumresults, String jsonMaximumresultsAtTypeHint, Boolean enableHtml, String enableHtmlAtTypeHint, Boolean enableTxt, String enableTxtAtTypeHint, Boolean enableXml, String enableXmlAtTypeHint, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (jsonMaximumresults != null) {
            queryParams.put("json.maximumresults", jsonMaximumresults)
        }
        if (jsonMaximumresultsAtTypeHint != null) {
            queryParams.put("json.maximumresults@TypeHint", jsonMaximumresultsAtTypeHint)
        }
        if (enableHtml != null) {
            queryParams.put("enable.html", enableHtml)
        }
        if (enableHtmlAtTypeHint != null) {
            queryParams.put("enable.html@TypeHint", enableHtmlAtTypeHint)
        }
        if (enableTxt != null) {
            queryParams.put("enable.txt", enableTxt)
        }
        if (enableTxtAtTypeHint != null) {
            queryParams.put("enable.txt@TypeHint", enableTxtAtTypeHint)
        }
        if (enableXml != null) {
            queryParams.put("enable.xml", enableXml)
        }
        if (enableXmlAtTypeHint != null) {
            queryParams.put("enable.xml@TypeHint", enableXmlAtTypeHint)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def postConfigApacheSlingReferrerFilter ( Boolean allowEmpty, String allowEmptyAtTypeHint, String allowHosts, String allowHostsAtTypeHint, String allowHostsRegexp, String allowHostsRegexpAtTypeHint, String filterMethods, String filterMethodsAtTypeHint, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/apps/system/config/org.apache.sling.security.impl.ReferrerFilter"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (allowEmpty != null) {
            queryParams.put("allow.empty", allowEmpty)
        }
        if (allowEmptyAtTypeHint != null) {
            queryParams.put("allow.empty@TypeHint", allowEmptyAtTypeHint)
        }
        if (allowHosts != null) {
            queryParams.put("allow.hosts", allowHosts)
        }
        if (allowHostsAtTypeHint != null) {
            queryParams.put("allow.hosts@TypeHint", allowHostsAtTypeHint)
        }
        if (allowHostsRegexp != null) {
            queryParams.put("allow.hosts.regexp", allowHostsRegexp)
        }
        if (allowHostsRegexpAtTypeHint != null) {
            queryParams.put("allow.hosts.regexp@TypeHint", allowHostsRegexpAtTypeHint)
        }
        if (filterMethods != null) {
            queryParams.put("filter.methods", filterMethods)
        }
        if (filterMethodsAtTypeHint != null) {
            queryParams.put("filter.methods@TypeHint", filterMethodsAtTypeHint)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def postConfigProperty ( String configNodeName, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/apps/system/config/${configNodeName}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (configNodeName == null) {
            throw new RuntimeException("missing required params configNodeName")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def postNode ( String path, String name, String colonOperation, String deleteAuthorizable, File file, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/${path}/${name}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (path == null) {
            throw new RuntimeException("missing required params path")
        }
        // verify required params are set
        if (name == null) {
            throw new RuntimeException("missing required params name")
        }

        if (colonOperation != null) {
            queryParams.put(":operation", colonOperation)
        }
        if (deleteAuthorizable != null) {
            queryParams.put("deleteAuthorizable", deleteAuthorizable)
        }



        contentType = 'multipart/form-data';
        bodyParams = file

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def postNodeRw ( String path, String name, String addMembers, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/${path}/${name}.rw.html"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (path == null) {
            throw new RuntimeException("missing required params path")
        }
        // verify required params are set
        if (name == null) {
            throw new RuntimeException("missing required params name")
        }

        if (addMembers != null) {
            queryParams.put("addMembers", addMembers)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def postPath ( String path, String jcrColonPrimaryType, String colonName, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/${path}/"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (path == null) {
            throw new RuntimeException("missing required params path")
        }
        // verify required params are set
        if (jcrColonPrimaryType == null) {
            throw new RuntimeException("missing required params jcrColonPrimaryType")
        }
        // verify required params are set
        if (colonName == null) {
            throw new RuntimeException("missing required params colonName")
        }

        if (jcrColonPrimaryType != null) {
            queryParams.put("jcr:primaryType", jcrColonPrimaryType)
        }
        if (colonName != null) {
            queryParams.put(":name", colonName)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def postQuery ( String path, BigDecimal pLimit, String _1property, String _1propertyValue, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/bin/querybuilder.json"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (path == null) {
            throw new RuntimeException("missing required params path")
        }
        // verify required params are set
        if (pLimit == null) {
            throw new RuntimeException("missing required params pLimit")
        }
        // verify required params are set
        if (_1property == null) {
            throw new RuntimeException("missing required params _1property")
        }
        // verify required params are set
        if (_1propertyValue == null) {
            throw new RuntimeException("missing required params _1propertyValue")
        }

        if (path != null) {
            queryParams.put("path", path)
        }
        if (pLimit != null) {
            queryParams.put("p.limit", pLimit)
        }
        if (_1property != null) {
            queryParams.put("1_property", _1property)
        }
        if (_1propertyValue != null) {
            queryParams.put("1_property.value", _1propertyValue)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    String.class )

    }

    def postTreeActivation ( Boolean ignoredeactivated, Boolean onlymodified, String path, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/etc/replication/treeactivation.html"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (ignoredeactivated == null) {
            throw new RuntimeException("missing required params ignoredeactivated")
        }
        // verify required params are set
        if (onlymodified == null) {
            throw new RuntimeException("missing required params onlymodified")
        }
        // verify required params are set
        if (path == null) {
            throw new RuntimeException("missing required params path")
        }

        if (ignoredeactivated != null) {
            queryParams.put("ignoredeactivated", ignoredeactivated)
        }
        if (onlymodified != null) {
            queryParams.put("onlymodified", onlymodified)
        }
        if (path != null) {
            queryParams.put("path", path)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def postTruststore ( String colonOperation, String newPassword, String rePassword, String keyStoreType, String removeAlias, File certificate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/libs/granite/security/post/truststore"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (colonOperation != null) {
            queryParams.put(":operation", colonOperation)
        }
        if (newPassword != null) {
            queryParams.put("newPassword", newPassword)
        }
        if (rePassword != null) {
            queryParams.put("rePassword", rePassword)
        }
        if (keyStoreType != null) {
            queryParams.put("keyStoreType", keyStoreType)
        }
        if (removeAlias != null) {
            queryParams.put("removeAlias", removeAlias)
        }



        contentType = 'multipart/form-data';
        bodyParams = certificate

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    String.class )

    }

    def postTruststorePKCS12 ( File truststoreP12, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/etc/truststore"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType





        contentType = 'multipart/form-data';
        bodyParams = truststoreP12

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    String.class )

    }

}
