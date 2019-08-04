package org.openapitools.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import org.openapitools.api.ApiUtils

import java.math.BigDecimal
import org.openapitools.model.KeystoreInfo
import org.openapitools.model.TruststoreInfo

import java.util.*;

@Mixin(ApiUtils)
class SlingApi {
    String basePath = "http://localhost"
    String versionPath = "/api/v1"

    def deleteAgent ( String runmode, String name, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/etc/replication/agents.{runmode}/{name}"

        // query params
        def queryParams = [:]
        def headerParams = [:]

        // verify required params are set
        if (runmode == null) {
            throw new RuntimeException("missing required params runmode")
        }

        // verify required params are set
        if (name == null) {
            throw new RuntimeException("missing required params name")
        }

        // TODO: form params, body param not yet support

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    null )

    }

    def deleteNode ( String path, String name, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/{path}/{name}"

        // query params
        def queryParams = [:]
        def headerParams = [:]

        // verify required params are set
        if (path == null) {
            throw new RuntimeException("missing required params path")
        }

        // verify required params are set
        if (name == null) {
            throw new RuntimeException("missing required params name")
        }

        // TODO: form params, body param not yet support

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    null )

    }

    def getAgent ( String runmode, String name, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/etc/replication/agents.{runmode}/{name}"

        // query params
        def queryParams = [:]
        def headerParams = [:]

        // verify required params are set
        if (runmode == null) {
            throw new RuntimeException("missing required params runmode")
        }

        // verify required params are set
        if (name == null) {
            throw new RuntimeException("missing required params name")
        }

        // TODO: form params, body param not yet support

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    null )

    }

    def getAgents ( String runmode, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/etc/replication/agents.{runmode}.-1.json"

        // query params
        def queryParams = [:]
        def headerParams = [:]

        // verify required params are set
        if (runmode == null) {
            throw new RuntimeException("missing required params runmode")
        }

        // TODO: form params, body param not yet support

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    String.class )

    }

    def getAuthorizableKeystore ( String intermediatePath, String authorizableId, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/{intermediatePath}/{authorizableId}.ks.json"

        // query params
        def queryParams = [:]
        def headerParams = [:]

        // verify required params are set
        if (intermediatePath == null) {
            throw new RuntimeException("missing required params intermediatePath")
        }

        // verify required params are set
        if (authorizableId == null) {
            throw new RuntimeException("missing required params authorizableId")
        }

        // TODO: form params, body param not yet support

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    KeystoreInfo.class )

    }

    def getKeystore ( String intermediatePath, String authorizableId, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/{intermediatePath}/{authorizableId}/keystore/store.p12"

        // query params
        def queryParams = [:]
        def headerParams = [:]

        // verify required params are set
        if (intermediatePath == null) {
            throw new RuntimeException("missing required params intermediatePath")
        }

        // verify required params are set
        if (authorizableId == null) {
            throw new RuntimeException("missing required params authorizableId")
        }

        // TODO: form params, body param not yet support

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    File.class )

    }

    def getNode ( String path, String name, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/{path}/{name}"

        // query params
        def queryParams = [:]
        def headerParams = [:]

        // verify required params are set
        if (path == null) {
            throw new RuntimeException("missing required params path")
        }

        // verify required params are set
        if (name == null) {
            throw new RuntimeException("missing required params name")
        }

        // TODO: form params, body param not yet support

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    null )

    }

    def getPackage ( String group, String name, String version, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/etc/packages/{group}/{name}-{version}.zip"

        // query params
        def queryParams = [:]
        def headerParams = [:]

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

        // TODO: form params, body param not yet support

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    File.class )

    }

    def getPackageFilter ( String group, String name, String version, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json"

        // query params
        def queryParams = [:]
        def headerParams = [:]

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

        // TODO: form params, body param not yet support

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    String.class )

    }

    def getQuery ( String path, BigDecimal pLimit, String _1property, String _1propertyValue, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/bin/querybuilder.json"

        // query params
        def queryParams = [:]
        def headerParams = [:]

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

        if (!"null".equals(String.valueOf(path)))
            queryParams.put("path", String.valueOf(path))

        if (!"null".equals(String.valueOf(pLimit)))
            queryParams.put("p.limit", String.valueOf(pLimit))

        if (!"null".equals(String.valueOf(_1property)))
            queryParams.put("1_property", String.valueOf(_1property))

        if (!"null".equals(String.valueOf(_1propertyValue)))
            queryParams.put("1_property.value", String.valueOf(_1propertyValue))

        // TODO: form params, body param not yet support

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    String.class )

    }

    def getTruststore ( Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/etc/truststore/truststore.p12"

        // query params
        def queryParams = [:]
        def headerParams = [:]

        // TODO: form params, body param not yet support

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    File.class )

    }

    def getTruststoreInfo ( Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/libs/granite/security/truststore.json"

        // query params
        def queryParams = [:]
        def headerParams = [:]

        // TODO: form params, body param not yet support

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    TruststoreInfo.class )

    }

    def postAgent ( String runmode, String name, Boolean jcrColonContentSlashCqColonDistribute, String jcrColonContentSlashCqColonDistributeAtTypeHint, String jcrColonContentSlashCqColonName, String jcrColonContentSlashCqColonTemplate, Boolean jcrColonContentSlashEnabled, String jcrColonContentSlashJcrColonDescription, String jcrColonContentSlashJcrColonLastModified, String jcrColonContentSlashJcrColonLastModifiedBy, String jcrColonContentSlashJcrColonMixinTypes, String jcrColonContentSlashJcrColonTitle, String jcrColonContentSlashLogLevel, Boolean jcrColonContentSlashNoStatusUpdate, Boolean jcrColonContentSlashNoVersioning, BigDecimal jcrColonContentSlashProtocolConnectTimeout, Boolean jcrColonContentSlashProtocolHTTPConnectionClosed, String jcrColonContentSlashProtocolHTTPExpired, List<String> jcrColonContentSlashProtocolHTTPHeaders, String jcrColonContentSlashProtocolHTTPHeadersAtTypeHint, String jcrColonContentSlashProtocolHTTPMethod, Boolean jcrColonContentSlashProtocolHTTPSRelaxed, String jcrColonContentSlashProtocolInterface, BigDecimal jcrColonContentSlashProtocolSocketTimeout, String jcrColonContentSlashProtocolVersion, String jcrColonContentSlashProxyNTLMDomain, String jcrColonContentSlashProxyNTLMHost, String jcrColonContentSlashProxyHost, String jcrColonContentSlashProxyPassword, BigDecimal jcrColonContentSlashProxyPort, String jcrColonContentSlashProxyUser, BigDecimal jcrColonContentSlashQueueBatchMaxSize, String jcrColonContentSlashQueueBatchMode, BigDecimal jcrColonContentSlashQueueBatchWaitTime, String jcrColonContentSlashRetryDelay, Boolean jcrColonContentSlashReverseReplication, String jcrColonContentSlashSerializationType, String jcrColonContentSlashSlingColonResourceType, String jcrColonContentSlashSsl, String jcrColonContentSlashTransportNTLMDomain, String jcrColonContentSlashTransportNTLMHost, String jcrColonContentSlashTransportPassword, String jcrColonContentSlashTransportUri, String jcrColonContentSlashTransportUser, Boolean jcrColonContentSlashTriggerDistribute, Boolean jcrColonContentSlashTriggerModified, Boolean jcrColonContentSlashTriggerOnOffTime, Boolean jcrColonContentSlashTriggerReceive, Boolean jcrColonContentSlashTriggerSpecific, String jcrColonContentSlashUserId, String jcrColonPrimaryType, String colonOperation, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/etc/replication/agents.{runmode}/{name}"

        // query params
        def queryParams = [:]
        def headerParams = [:]

        // verify required params are set
        if (runmode == null) {
            throw new RuntimeException("missing required params runmode")
        }

        // verify required params are set
        if (name == null) {
            throw new RuntimeException("missing required params name")
        }

        if (!"null".equals(String.valueOf(jcrColonContentSlashCqColonDistribute)))
            queryParams.put("jcr:content/cq:distribute", String.valueOf(jcrColonContentSlashCqColonDistribute))

        if (!"null".equals(String.valueOf(jcrColonContentSlashCqColonDistributeAtTypeHint)))
            queryParams.put("jcr:content/cq:distribute@TypeHint", String.valueOf(jcrColonContentSlashCqColonDistributeAtTypeHint))

        if (!"null".equals(String.valueOf(jcrColonContentSlashCqColonName)))
            queryParams.put("jcr:content/cq:name", String.valueOf(jcrColonContentSlashCqColonName))

        if (!"null".equals(String.valueOf(jcrColonContentSlashCqColonTemplate)))
            queryParams.put("jcr:content/cq:template", String.valueOf(jcrColonContentSlashCqColonTemplate))

        if (!"null".equals(String.valueOf(jcrColonContentSlashEnabled)))
            queryParams.put("jcr:content/enabled", String.valueOf(jcrColonContentSlashEnabled))

        if (!"null".equals(String.valueOf(jcrColonContentSlashJcrColonDescription)))
            queryParams.put("jcr:content/jcr:description", String.valueOf(jcrColonContentSlashJcrColonDescription))

        if (!"null".equals(String.valueOf(jcrColonContentSlashJcrColonLastModified)))
            queryParams.put("jcr:content/jcr:lastModified", String.valueOf(jcrColonContentSlashJcrColonLastModified))

        if (!"null".equals(String.valueOf(jcrColonContentSlashJcrColonLastModifiedBy)))
            queryParams.put("jcr:content/jcr:lastModifiedBy", String.valueOf(jcrColonContentSlashJcrColonLastModifiedBy))

        if (!"null".equals(String.valueOf(jcrColonContentSlashJcrColonMixinTypes)))
            queryParams.put("jcr:content/jcr:mixinTypes", String.valueOf(jcrColonContentSlashJcrColonMixinTypes))

        if (!"null".equals(String.valueOf(jcrColonContentSlashJcrColonTitle)))
            queryParams.put("jcr:content/jcr:title", String.valueOf(jcrColonContentSlashJcrColonTitle))

        if (!"null".equals(String.valueOf(jcrColonContentSlashLogLevel)))
            queryParams.put("jcr:content/logLevel", String.valueOf(jcrColonContentSlashLogLevel))

        if (!"null".equals(String.valueOf(jcrColonContentSlashNoStatusUpdate)))
            queryParams.put("jcr:content/noStatusUpdate", String.valueOf(jcrColonContentSlashNoStatusUpdate))

        if (!"null".equals(String.valueOf(jcrColonContentSlashNoVersioning)))
            queryParams.put("jcr:content/noVersioning", String.valueOf(jcrColonContentSlashNoVersioning))

        if (!"null".equals(String.valueOf(jcrColonContentSlashProtocolConnectTimeout)))
            queryParams.put("jcr:content/protocolConnectTimeout", String.valueOf(jcrColonContentSlashProtocolConnectTimeout))

        if (!"null".equals(String.valueOf(jcrColonContentSlashProtocolHTTPConnectionClosed)))
            queryParams.put("jcr:content/protocolHTTPConnectionClosed", String.valueOf(jcrColonContentSlashProtocolHTTPConnectionClosed))

        if (!"null".equals(String.valueOf(jcrColonContentSlashProtocolHTTPExpired)))
            queryParams.put("jcr:content/protocolHTTPExpired", String.valueOf(jcrColonContentSlashProtocolHTTPExpired))

        if (!"null".equals(String.valueOf(jcrColonContentSlashProtocolHTTPHeaders)))
            queryParams.put("jcr:content/protocolHTTPHeaders", String.valueOf(jcrColonContentSlashProtocolHTTPHeaders))

        if (!"null".equals(String.valueOf(jcrColonContentSlashProtocolHTTPHeadersAtTypeHint)))
            queryParams.put("jcr:content/protocolHTTPHeaders@TypeHint", String.valueOf(jcrColonContentSlashProtocolHTTPHeadersAtTypeHint))

        if (!"null".equals(String.valueOf(jcrColonContentSlashProtocolHTTPMethod)))
            queryParams.put("jcr:content/protocolHTTPMethod", String.valueOf(jcrColonContentSlashProtocolHTTPMethod))

        if (!"null".equals(String.valueOf(jcrColonContentSlashProtocolHTTPSRelaxed)))
            queryParams.put("jcr:content/protocolHTTPSRelaxed", String.valueOf(jcrColonContentSlashProtocolHTTPSRelaxed))

        if (!"null".equals(String.valueOf(jcrColonContentSlashProtocolInterface)))
            queryParams.put("jcr:content/protocolInterface", String.valueOf(jcrColonContentSlashProtocolInterface))

        if (!"null".equals(String.valueOf(jcrColonContentSlashProtocolSocketTimeout)))
            queryParams.put("jcr:content/protocolSocketTimeout", String.valueOf(jcrColonContentSlashProtocolSocketTimeout))

        if (!"null".equals(String.valueOf(jcrColonContentSlashProtocolVersion)))
            queryParams.put("jcr:content/protocolVersion", String.valueOf(jcrColonContentSlashProtocolVersion))

        if (!"null".equals(String.valueOf(jcrColonContentSlashProxyNTLMDomain)))
            queryParams.put("jcr:content/proxyNTLMDomain", String.valueOf(jcrColonContentSlashProxyNTLMDomain))

        if (!"null".equals(String.valueOf(jcrColonContentSlashProxyNTLMHost)))
            queryParams.put("jcr:content/proxyNTLMHost", String.valueOf(jcrColonContentSlashProxyNTLMHost))

        if (!"null".equals(String.valueOf(jcrColonContentSlashProxyHost)))
            queryParams.put("jcr:content/proxyHost", String.valueOf(jcrColonContentSlashProxyHost))

        if (!"null".equals(String.valueOf(jcrColonContentSlashProxyPassword)))
            queryParams.put("jcr:content/proxyPassword", String.valueOf(jcrColonContentSlashProxyPassword))

        if (!"null".equals(String.valueOf(jcrColonContentSlashProxyPort)))
            queryParams.put("jcr:content/proxyPort", String.valueOf(jcrColonContentSlashProxyPort))

        if (!"null".equals(String.valueOf(jcrColonContentSlashProxyUser)))
            queryParams.put("jcr:content/proxyUser", String.valueOf(jcrColonContentSlashProxyUser))

        if (!"null".equals(String.valueOf(jcrColonContentSlashQueueBatchMaxSize)))
            queryParams.put("jcr:content/queueBatchMaxSize", String.valueOf(jcrColonContentSlashQueueBatchMaxSize))

        if (!"null".equals(String.valueOf(jcrColonContentSlashQueueBatchMode)))
            queryParams.put("jcr:content/queueBatchMode", String.valueOf(jcrColonContentSlashQueueBatchMode))

        if (!"null".equals(String.valueOf(jcrColonContentSlashQueueBatchWaitTime)))
            queryParams.put("jcr:content/queueBatchWaitTime", String.valueOf(jcrColonContentSlashQueueBatchWaitTime))

        if (!"null".equals(String.valueOf(jcrColonContentSlashRetryDelay)))
            queryParams.put("jcr:content/retryDelay", String.valueOf(jcrColonContentSlashRetryDelay))

        if (!"null".equals(String.valueOf(jcrColonContentSlashReverseReplication)))
            queryParams.put("jcr:content/reverseReplication", String.valueOf(jcrColonContentSlashReverseReplication))

        if (!"null".equals(String.valueOf(jcrColonContentSlashSerializationType)))
            queryParams.put("jcr:content/serializationType", String.valueOf(jcrColonContentSlashSerializationType))

        if (!"null".equals(String.valueOf(jcrColonContentSlashSlingColonResourceType)))
            queryParams.put("jcr:content/sling:resourceType", String.valueOf(jcrColonContentSlashSlingColonResourceType))

        if (!"null".equals(String.valueOf(jcrColonContentSlashSsl)))
            queryParams.put("jcr:content/ssl", String.valueOf(jcrColonContentSlashSsl))

        if (!"null".equals(String.valueOf(jcrColonContentSlashTransportNTLMDomain)))
            queryParams.put("jcr:content/transportNTLMDomain", String.valueOf(jcrColonContentSlashTransportNTLMDomain))

        if (!"null".equals(String.valueOf(jcrColonContentSlashTransportNTLMHost)))
            queryParams.put("jcr:content/transportNTLMHost", String.valueOf(jcrColonContentSlashTransportNTLMHost))

        if (!"null".equals(String.valueOf(jcrColonContentSlashTransportPassword)))
            queryParams.put("jcr:content/transportPassword", String.valueOf(jcrColonContentSlashTransportPassword))

        if (!"null".equals(String.valueOf(jcrColonContentSlashTransportUri)))
            queryParams.put("jcr:content/transportUri", String.valueOf(jcrColonContentSlashTransportUri))

        if (!"null".equals(String.valueOf(jcrColonContentSlashTransportUser)))
            queryParams.put("jcr:content/transportUser", String.valueOf(jcrColonContentSlashTransportUser))

        if (!"null".equals(String.valueOf(jcrColonContentSlashTriggerDistribute)))
            queryParams.put("jcr:content/triggerDistribute", String.valueOf(jcrColonContentSlashTriggerDistribute))

        if (!"null".equals(String.valueOf(jcrColonContentSlashTriggerModified)))
            queryParams.put("jcr:content/triggerModified", String.valueOf(jcrColonContentSlashTriggerModified))

        if (!"null".equals(String.valueOf(jcrColonContentSlashTriggerOnOffTime)))
            queryParams.put("jcr:content/triggerOnOffTime", String.valueOf(jcrColonContentSlashTriggerOnOffTime))

        if (!"null".equals(String.valueOf(jcrColonContentSlashTriggerReceive)))
            queryParams.put("jcr:content/triggerReceive", String.valueOf(jcrColonContentSlashTriggerReceive))

        if (!"null".equals(String.valueOf(jcrColonContentSlashTriggerSpecific)))
            queryParams.put("jcr:content/triggerSpecific", String.valueOf(jcrColonContentSlashTriggerSpecific))

        if (!"null".equals(String.valueOf(jcrColonContentSlashUserId)))
            queryParams.put("jcr:content/userId", String.valueOf(jcrColonContentSlashUserId))

        if (!"null".equals(String.valueOf(jcrColonPrimaryType)))
            queryParams.put("jcr:primaryType", String.valueOf(jcrColonPrimaryType))

        if (!"null".equals(String.valueOf(colonOperation)))
            queryParams.put(":operation", String.valueOf(colonOperation))

        // TODO: form params, body param not yet support

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    null )

    }

    def postAuthorizableKeystore ( String intermediatePath, String authorizableId, String colonOperation, String currentPassword, String newPassword, String rePassword, String keyPassword, String keyStorePass, String alias, String newAlias, String removeAlias, File certChain, File pk, File keyStore, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/{intermediatePath}/{authorizableId}.ks.html"

        // query params
        def queryParams = [:]
        def headerParams = [:]

        // verify required params are set
        if (intermediatePath == null) {
            throw new RuntimeException("missing required params intermediatePath")
        }

        // verify required params are set
        if (authorizableId == null) {
            throw new RuntimeException("missing required params authorizableId")
        }

        if (!"null".equals(String.valueOf(colonOperation)))
            queryParams.put(":operation", String.valueOf(colonOperation))

        if (!"null".equals(String.valueOf(currentPassword)))
            queryParams.put("currentPassword", String.valueOf(currentPassword))

        if (!"null".equals(String.valueOf(newPassword)))
            queryParams.put("newPassword", String.valueOf(newPassword))

        if (!"null".equals(String.valueOf(rePassword)))
            queryParams.put("rePassword", String.valueOf(rePassword))

        if (!"null".equals(String.valueOf(keyPassword)))
            queryParams.put("keyPassword", String.valueOf(keyPassword))

        if (!"null".equals(String.valueOf(keyStorePass)))
            queryParams.put("keyStorePass", String.valueOf(keyStorePass))

        if (!"null".equals(String.valueOf(alias)))
            queryParams.put("alias", String.valueOf(alias))

        if (!"null".equals(String.valueOf(newAlias)))
            queryParams.put("newAlias", String.valueOf(newAlias))

        if (!"null".equals(String.valueOf(removeAlias)))
            queryParams.put("removeAlias", String.valueOf(removeAlias))

        // TODO: form params, body param not yet support

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    KeystoreInfo.class )

    }

    def postAuthorizables ( String authorizableId, String intermediatePath, String createUser, String createGroup, String repColonPassword, String profileSlashGivenName, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/libs/granite/security/post/authorizables"

        // query params
        def queryParams = [:]
        def headerParams = [:]

        // verify required params are set
        if (authorizableId == null) {
            throw new RuntimeException("missing required params authorizableId")
        }

        // verify required params are set
        if (intermediatePath == null) {
            throw new RuntimeException("missing required params intermediatePath")
        }

        if (!"null".equals(String.valueOf(authorizableId)))
            queryParams.put("authorizableId", String.valueOf(authorizableId))

        if (!"null".equals(String.valueOf(intermediatePath)))
            queryParams.put("intermediatePath", String.valueOf(intermediatePath))

        if (!"null".equals(String.valueOf(createUser)))
            queryParams.put("createUser", String.valueOf(createUser))

        if (!"null".equals(String.valueOf(createGroup)))
            queryParams.put("createGroup", String.valueOf(createGroup))

        if (!"null".equals(String.valueOf(repColonPassword)))
            queryParams.put("rep:password", String.valueOf(repColonPassword))

        if (!"null".equals(String.valueOf(profileSlashGivenName)))
            queryParams.put("profile/givenName", String.valueOf(profileSlashGivenName))

        // TODO: form params, body param not yet support

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    String.class )

    }

    def postConfigAdobeGraniteSamlAuthenticationHandler ( String keyStorePassword, String keyStorePasswordAtTypeHint, Integer serviceRanking, String serviceRankingAtTypeHint, Boolean idpHttpRedirect, String idpHttpRedirectAtTypeHint, Boolean createUser, String createUserAtTypeHint, String defaultRedirectUrl, String defaultRedirectUrlAtTypeHint, String userIDAttribute, String userIDAttributeAtTypeHint, List<String> defaultGroups, String defaultGroupsAtTypeHint, String idpCertAlias, String idpCertAliasAtTypeHint, Boolean addGroupMemberships, String addGroupMembershipsAtTypeHint, List<String> path, String pathAtTypeHint, List<String> synchronizeAttributes, String synchronizeAttributesAtTypeHint, Integer clockTolerance, String clockToleranceAtTypeHint, String groupMembershipAttribute, String groupMembershipAttributeAtTypeHint, String idpUrl, String idpUrlAtTypeHint, String logoutUrl, String logoutUrlAtTypeHint, String serviceProviderEntityId, String serviceProviderEntityIdAtTypeHint, String assertionConsumerServiceURL, String assertionConsumerServiceURLAtTypeHint, Boolean handleLogout, String handleLogoutAtTypeHint, String spPrivateKeyAlias, String spPrivateKeyAliasAtTypeHint, Boolean useEncryption, String useEncryptionAtTypeHint, String nameIdFormat, String nameIdFormatAtTypeHint, String digestMethod, String digestMethodAtTypeHint, String signatureMethod, String signatureMethodAtTypeHint, String userIntermediatePath, String userIntermediatePathAtTypeHint, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config"

        // query params
        def queryParams = [:]
        def headerParams = [:]

        if (!"null".equals(String.valueOf(keyStorePassword)))
            queryParams.put("keyStorePassword", String.valueOf(keyStorePassword))

        if (!"null".equals(String.valueOf(keyStorePasswordAtTypeHint)))
            queryParams.put("keyStorePassword@TypeHint", String.valueOf(keyStorePasswordAtTypeHint))

        if (!"null".equals(String.valueOf(serviceRanking)))
            queryParams.put("service.ranking", String.valueOf(serviceRanking))

        if (!"null".equals(String.valueOf(serviceRankingAtTypeHint)))
            queryParams.put("service.ranking@TypeHint", String.valueOf(serviceRankingAtTypeHint))

        if (!"null".equals(String.valueOf(idpHttpRedirect)))
            queryParams.put("idpHttpRedirect", String.valueOf(idpHttpRedirect))

        if (!"null".equals(String.valueOf(idpHttpRedirectAtTypeHint)))
            queryParams.put("idpHttpRedirect@TypeHint", String.valueOf(idpHttpRedirectAtTypeHint))

        if (!"null".equals(String.valueOf(createUser)))
            queryParams.put("createUser", String.valueOf(createUser))

        if (!"null".equals(String.valueOf(createUserAtTypeHint)))
            queryParams.put("createUser@TypeHint", String.valueOf(createUserAtTypeHint))

        if (!"null".equals(String.valueOf(defaultRedirectUrl)))
            queryParams.put("defaultRedirectUrl", String.valueOf(defaultRedirectUrl))

        if (!"null".equals(String.valueOf(defaultRedirectUrlAtTypeHint)))
            queryParams.put("defaultRedirectUrl@TypeHint", String.valueOf(defaultRedirectUrlAtTypeHint))

        if (!"null".equals(String.valueOf(userIDAttribute)))
            queryParams.put("userIDAttribute", String.valueOf(userIDAttribute))

        if (!"null".equals(String.valueOf(userIDAttributeAtTypeHint)))
            queryParams.put("userIDAttribute@TypeHint", String.valueOf(userIDAttributeAtTypeHint))

        if (!"null".equals(String.valueOf(defaultGroups)))
            queryParams.put("defaultGroups", String.valueOf(defaultGroups))

        if (!"null".equals(String.valueOf(defaultGroupsAtTypeHint)))
            queryParams.put("defaultGroups@TypeHint", String.valueOf(defaultGroupsAtTypeHint))

        if (!"null".equals(String.valueOf(idpCertAlias)))
            queryParams.put("idpCertAlias", String.valueOf(idpCertAlias))

        if (!"null".equals(String.valueOf(idpCertAliasAtTypeHint)))
            queryParams.put("idpCertAlias@TypeHint", String.valueOf(idpCertAliasAtTypeHint))

        if (!"null".equals(String.valueOf(addGroupMemberships)))
            queryParams.put("addGroupMemberships", String.valueOf(addGroupMemberships))

        if (!"null".equals(String.valueOf(addGroupMembershipsAtTypeHint)))
            queryParams.put("addGroupMemberships@TypeHint", String.valueOf(addGroupMembershipsAtTypeHint))

        if (!"null".equals(String.valueOf(path)))
            queryParams.put("path", String.valueOf(path))

        if (!"null".equals(String.valueOf(pathAtTypeHint)))
            queryParams.put("path@TypeHint", String.valueOf(pathAtTypeHint))

        if (!"null".equals(String.valueOf(synchronizeAttributes)))
            queryParams.put("synchronizeAttributes", String.valueOf(synchronizeAttributes))

        if (!"null".equals(String.valueOf(synchronizeAttributesAtTypeHint)))
            queryParams.put("synchronizeAttributes@TypeHint", String.valueOf(synchronizeAttributesAtTypeHint))

        if (!"null".equals(String.valueOf(clockTolerance)))
            queryParams.put("clockTolerance", String.valueOf(clockTolerance))

        if (!"null".equals(String.valueOf(clockToleranceAtTypeHint)))
            queryParams.put("clockTolerance@TypeHint", String.valueOf(clockToleranceAtTypeHint))

        if (!"null".equals(String.valueOf(groupMembershipAttribute)))
            queryParams.put("groupMembershipAttribute", String.valueOf(groupMembershipAttribute))

        if (!"null".equals(String.valueOf(groupMembershipAttributeAtTypeHint)))
            queryParams.put("groupMembershipAttribute@TypeHint", String.valueOf(groupMembershipAttributeAtTypeHint))

        if (!"null".equals(String.valueOf(idpUrl)))
            queryParams.put("idpUrl", String.valueOf(idpUrl))

        if (!"null".equals(String.valueOf(idpUrlAtTypeHint)))
            queryParams.put("idpUrl@TypeHint", String.valueOf(idpUrlAtTypeHint))

        if (!"null".equals(String.valueOf(logoutUrl)))
            queryParams.put("logoutUrl", String.valueOf(logoutUrl))

        if (!"null".equals(String.valueOf(logoutUrlAtTypeHint)))
            queryParams.put("logoutUrl@TypeHint", String.valueOf(logoutUrlAtTypeHint))

        if (!"null".equals(String.valueOf(serviceProviderEntityId)))
            queryParams.put("serviceProviderEntityId", String.valueOf(serviceProviderEntityId))

        if (!"null".equals(String.valueOf(serviceProviderEntityIdAtTypeHint)))
            queryParams.put("serviceProviderEntityId@TypeHint", String.valueOf(serviceProviderEntityIdAtTypeHint))

        if (!"null".equals(String.valueOf(assertionConsumerServiceURL)))
            queryParams.put("assertionConsumerServiceURL", String.valueOf(assertionConsumerServiceURL))

        if (!"null".equals(String.valueOf(assertionConsumerServiceURLAtTypeHint)))
            queryParams.put("assertionConsumerServiceURL@TypeHint", String.valueOf(assertionConsumerServiceURLAtTypeHint))

        if (!"null".equals(String.valueOf(handleLogout)))
            queryParams.put("handleLogout", String.valueOf(handleLogout))

        if (!"null".equals(String.valueOf(handleLogoutAtTypeHint)))
            queryParams.put("handleLogout@TypeHint", String.valueOf(handleLogoutAtTypeHint))

        if (!"null".equals(String.valueOf(spPrivateKeyAlias)))
            queryParams.put("spPrivateKeyAlias", String.valueOf(spPrivateKeyAlias))

        if (!"null".equals(String.valueOf(spPrivateKeyAliasAtTypeHint)))
            queryParams.put("spPrivateKeyAlias@TypeHint", String.valueOf(spPrivateKeyAliasAtTypeHint))

        if (!"null".equals(String.valueOf(useEncryption)))
            queryParams.put("useEncryption", String.valueOf(useEncryption))

        if (!"null".equals(String.valueOf(useEncryptionAtTypeHint)))
            queryParams.put("useEncryption@TypeHint", String.valueOf(useEncryptionAtTypeHint))

        if (!"null".equals(String.valueOf(nameIdFormat)))
            queryParams.put("nameIdFormat", String.valueOf(nameIdFormat))

        if (!"null".equals(String.valueOf(nameIdFormatAtTypeHint)))
            queryParams.put("nameIdFormat@TypeHint", String.valueOf(nameIdFormatAtTypeHint))

        if (!"null".equals(String.valueOf(digestMethod)))
            queryParams.put("digestMethod", String.valueOf(digestMethod))

        if (!"null".equals(String.valueOf(digestMethodAtTypeHint)))
            queryParams.put("digestMethod@TypeHint", String.valueOf(digestMethodAtTypeHint))

        if (!"null".equals(String.valueOf(signatureMethod)))
            queryParams.put("signatureMethod", String.valueOf(signatureMethod))

        if (!"null".equals(String.valueOf(signatureMethodAtTypeHint)))
            queryParams.put("signatureMethod@TypeHint", String.valueOf(signatureMethodAtTypeHint))

        if (!"null".equals(String.valueOf(userIntermediatePath)))
            queryParams.put("userIntermediatePath", String.valueOf(userIntermediatePath))

        if (!"null".equals(String.valueOf(userIntermediatePathAtTypeHint)))
            queryParams.put("userIntermediatePath@TypeHint", String.valueOf(userIntermediatePathAtTypeHint))

        // TODO: form params, body param not yet support

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    null )

    }

    def postConfigApacheFelixJettyBasedHttpService ( Boolean orgApacheFelixHttpsNio, String orgApacheFelixHttpsNioAtTypeHint, String orgApacheFelixHttpsKeystore, String orgApacheFelixHttpsKeystoreAtTypeHint, String orgApacheFelixHttpsKeystorePassword, String orgApacheFelixHttpsKeystorePasswordAtTypeHint, String orgApacheFelixHttpsKeystoreKey, String orgApacheFelixHttpsKeystoreKeyAtTypeHint, String orgApacheFelixHttpsKeystoreKeyPassword, String orgApacheFelixHttpsKeystoreKeyPasswordAtTypeHint, String orgApacheFelixHttpsTruststore, String orgApacheFelixHttpsTruststoreAtTypeHint, String orgApacheFelixHttpsTruststorePassword, String orgApacheFelixHttpsTruststorePasswordAtTypeHint, String orgApacheFelixHttpsClientcertificate, String orgApacheFelixHttpsClientcertificateAtTypeHint, Boolean orgApacheFelixHttpsEnable, String orgApacheFelixHttpsEnableAtTypeHint, String orgOsgiServiceHttpPortSecure, String orgOsgiServiceHttpPortSecureAtTypeHint, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/apps/system/config/org.apache.felix.http"

        // query params
        def queryParams = [:]
        def headerParams = [:]

        if (!"null".equals(String.valueOf(orgApacheFelixHttpsNio)))
            queryParams.put("org.apache.felix.https.nio", String.valueOf(orgApacheFelixHttpsNio))

        if (!"null".equals(String.valueOf(orgApacheFelixHttpsNioAtTypeHint)))
            queryParams.put("org.apache.felix.https.nio@TypeHint", String.valueOf(orgApacheFelixHttpsNioAtTypeHint))

        if (!"null".equals(String.valueOf(orgApacheFelixHttpsKeystore)))
            queryParams.put("org.apache.felix.https.keystore", String.valueOf(orgApacheFelixHttpsKeystore))

        if (!"null".equals(String.valueOf(orgApacheFelixHttpsKeystoreAtTypeHint)))
            queryParams.put("org.apache.felix.https.keystore@TypeHint", String.valueOf(orgApacheFelixHttpsKeystoreAtTypeHint))

        if (!"null".equals(String.valueOf(orgApacheFelixHttpsKeystorePassword)))
            queryParams.put("org.apache.felix.https.keystore.password", String.valueOf(orgApacheFelixHttpsKeystorePassword))

        if (!"null".equals(String.valueOf(orgApacheFelixHttpsKeystorePasswordAtTypeHint)))
            queryParams.put("org.apache.felix.https.keystore.password@TypeHint", String.valueOf(orgApacheFelixHttpsKeystorePasswordAtTypeHint))

        if (!"null".equals(String.valueOf(orgApacheFelixHttpsKeystoreKey)))
            queryParams.put("org.apache.felix.https.keystore.key", String.valueOf(orgApacheFelixHttpsKeystoreKey))

        if (!"null".equals(String.valueOf(orgApacheFelixHttpsKeystoreKeyAtTypeHint)))
            queryParams.put("org.apache.felix.https.keystore.key@TypeHint", String.valueOf(orgApacheFelixHttpsKeystoreKeyAtTypeHint))

        if (!"null".equals(String.valueOf(orgApacheFelixHttpsKeystoreKeyPassword)))
            queryParams.put("org.apache.felix.https.keystore.key.password", String.valueOf(orgApacheFelixHttpsKeystoreKeyPassword))

        if (!"null".equals(String.valueOf(orgApacheFelixHttpsKeystoreKeyPasswordAtTypeHint)))
            queryParams.put("org.apache.felix.https.keystore.key.password@TypeHint", String.valueOf(orgApacheFelixHttpsKeystoreKeyPasswordAtTypeHint))

        if (!"null".equals(String.valueOf(orgApacheFelixHttpsTruststore)))
            queryParams.put("org.apache.felix.https.truststore", String.valueOf(orgApacheFelixHttpsTruststore))

        if (!"null".equals(String.valueOf(orgApacheFelixHttpsTruststoreAtTypeHint)))
            queryParams.put("org.apache.felix.https.truststore@TypeHint", String.valueOf(orgApacheFelixHttpsTruststoreAtTypeHint))

        if (!"null".equals(String.valueOf(orgApacheFelixHttpsTruststorePassword)))
            queryParams.put("org.apache.felix.https.truststore.password", String.valueOf(orgApacheFelixHttpsTruststorePassword))

        if (!"null".equals(String.valueOf(orgApacheFelixHttpsTruststorePasswordAtTypeHint)))
            queryParams.put("org.apache.felix.https.truststore.password@TypeHint", String.valueOf(orgApacheFelixHttpsTruststorePasswordAtTypeHint))

        if (!"null".equals(String.valueOf(orgApacheFelixHttpsClientcertificate)))
            queryParams.put("org.apache.felix.https.clientcertificate", String.valueOf(orgApacheFelixHttpsClientcertificate))

        if (!"null".equals(String.valueOf(orgApacheFelixHttpsClientcertificateAtTypeHint)))
            queryParams.put("org.apache.felix.https.clientcertificate@TypeHint", String.valueOf(orgApacheFelixHttpsClientcertificateAtTypeHint))

        if (!"null".equals(String.valueOf(orgApacheFelixHttpsEnable)))
            queryParams.put("org.apache.felix.https.enable", String.valueOf(orgApacheFelixHttpsEnable))

        if (!"null".equals(String.valueOf(orgApacheFelixHttpsEnableAtTypeHint)))
            queryParams.put("org.apache.felix.https.enable@TypeHint", String.valueOf(orgApacheFelixHttpsEnableAtTypeHint))

        if (!"null".equals(String.valueOf(orgOsgiServiceHttpPortSecure)))
            queryParams.put("org.osgi.service.http.port.secure", String.valueOf(orgOsgiServiceHttpPortSecure))

        if (!"null".equals(String.valueOf(orgOsgiServiceHttpPortSecureAtTypeHint)))
            queryParams.put("org.osgi.service.http.port.secure@TypeHint", String.valueOf(orgOsgiServiceHttpPortSecureAtTypeHint))

        // TODO: form params, body param not yet support

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    null )

    }

    def postConfigApacheHttpComponentsProxyConfiguration ( String proxyHost, String proxyHostAtTypeHint, Integer proxyPort, String proxyPortAtTypeHint, List<String> proxyExceptions, String proxyExceptionsAtTypeHint, Boolean proxyEnabled, String proxyEnabledAtTypeHint, String proxyUser, String proxyUserAtTypeHint, String proxyPassword, String proxyPasswordAtTypeHint, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/apps/system/config/org.apache.http.proxyconfigurator.config"

        // query params
        def queryParams = [:]
        def headerParams = [:]

        if (!"null".equals(String.valueOf(proxyHost)))
            queryParams.put("proxy.host", String.valueOf(proxyHost))

        if (!"null".equals(String.valueOf(proxyHostAtTypeHint)))
            queryParams.put("proxy.host@TypeHint", String.valueOf(proxyHostAtTypeHint))

        if (!"null".equals(String.valueOf(proxyPort)))
            queryParams.put("proxy.port", String.valueOf(proxyPort))

        if (!"null".equals(String.valueOf(proxyPortAtTypeHint)))
            queryParams.put("proxy.port@TypeHint", String.valueOf(proxyPortAtTypeHint))

        if (!"null".equals(String.valueOf(proxyExceptions)))
            queryParams.put("proxy.exceptions", String.valueOf(proxyExceptions))

        if (!"null".equals(String.valueOf(proxyExceptionsAtTypeHint)))
            queryParams.put("proxy.exceptions@TypeHint", String.valueOf(proxyExceptionsAtTypeHint))

        if (!"null".equals(String.valueOf(proxyEnabled)))
            queryParams.put("proxy.enabled", String.valueOf(proxyEnabled))

        if (!"null".equals(String.valueOf(proxyEnabledAtTypeHint)))
            queryParams.put("proxy.enabled@TypeHint", String.valueOf(proxyEnabledAtTypeHint))

        if (!"null".equals(String.valueOf(proxyUser)))
            queryParams.put("proxy.user", String.valueOf(proxyUser))

        if (!"null".equals(String.valueOf(proxyUserAtTypeHint)))
            queryParams.put("proxy.user@TypeHint", String.valueOf(proxyUserAtTypeHint))

        if (!"null".equals(String.valueOf(proxyPassword)))
            queryParams.put("proxy.password", String.valueOf(proxyPassword))

        if (!"null".equals(String.valueOf(proxyPasswordAtTypeHint)))
            queryParams.put("proxy.password@TypeHint", String.valueOf(proxyPasswordAtTypeHint))

        // TODO: form params, body param not yet support

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    null )

    }

    def postConfigApacheSlingDavExServlet ( String alias, String aliasAtTypeHint, Boolean davCreateAbsoluteUri, String davCreateAbsoluteUriAtTypeHint, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet"

        // query params
        def queryParams = [:]
        def headerParams = [:]

        if (!"null".equals(String.valueOf(alias)))
            queryParams.put("alias", String.valueOf(alias))

        if (!"null".equals(String.valueOf(aliasAtTypeHint)))
            queryParams.put("alias@TypeHint", String.valueOf(aliasAtTypeHint))

        if (!"null".equals(String.valueOf(davCreateAbsoluteUri)))
            queryParams.put("dav.create-absolute-uri", String.valueOf(davCreateAbsoluteUri))

        if (!"null".equals(String.valueOf(davCreateAbsoluteUriAtTypeHint)))
            queryParams.put("dav.create-absolute-uri@TypeHint", String.valueOf(davCreateAbsoluteUriAtTypeHint))

        // TODO: form params, body param not yet support

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    null )

    }

    def postConfigApacheSlingGetServlet ( String jsonMaximumresults, String jsonMaximumresultsAtTypeHint, Boolean enableHtml, String enableHtmlAtTypeHint, Boolean enableTxt, String enableTxtAtTypeHint, Boolean enableXml, String enableXmlAtTypeHint, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet"

        // query params
        def queryParams = [:]
        def headerParams = [:]

        if (!"null".equals(String.valueOf(jsonMaximumresults)))
            queryParams.put("json.maximumresults", String.valueOf(jsonMaximumresults))

        if (!"null".equals(String.valueOf(jsonMaximumresultsAtTypeHint)))
            queryParams.put("json.maximumresults@TypeHint", String.valueOf(jsonMaximumresultsAtTypeHint))

        if (!"null".equals(String.valueOf(enableHtml)))
            queryParams.put("enable.html", String.valueOf(enableHtml))

        if (!"null".equals(String.valueOf(enableHtmlAtTypeHint)))
            queryParams.put("enable.html@TypeHint", String.valueOf(enableHtmlAtTypeHint))

        if (!"null".equals(String.valueOf(enableTxt)))
            queryParams.put("enable.txt", String.valueOf(enableTxt))

        if (!"null".equals(String.valueOf(enableTxtAtTypeHint)))
            queryParams.put("enable.txt@TypeHint", String.valueOf(enableTxtAtTypeHint))

        if (!"null".equals(String.valueOf(enableXml)))
            queryParams.put("enable.xml", String.valueOf(enableXml))

        if (!"null".equals(String.valueOf(enableXmlAtTypeHint)))
            queryParams.put("enable.xml@TypeHint", String.valueOf(enableXmlAtTypeHint))

        // TODO: form params, body param not yet support

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    null )

    }

    def postConfigApacheSlingReferrerFilter ( Boolean allowEmpty, String allowEmptyAtTypeHint, String allowHosts, String allowHostsAtTypeHint, String allowHostsRegexp, String allowHostsRegexpAtTypeHint, String filterMethods, String filterMethodsAtTypeHint, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/apps/system/config/org.apache.sling.security.impl.ReferrerFilter"

        // query params
        def queryParams = [:]
        def headerParams = [:]

        if (!"null".equals(String.valueOf(allowEmpty)))
            queryParams.put("allow.empty", String.valueOf(allowEmpty))

        if (!"null".equals(String.valueOf(allowEmptyAtTypeHint)))
            queryParams.put("allow.empty@TypeHint", String.valueOf(allowEmptyAtTypeHint))

        if (!"null".equals(String.valueOf(allowHosts)))
            queryParams.put("allow.hosts", String.valueOf(allowHosts))

        if (!"null".equals(String.valueOf(allowHostsAtTypeHint)))
            queryParams.put("allow.hosts@TypeHint", String.valueOf(allowHostsAtTypeHint))

        if (!"null".equals(String.valueOf(allowHostsRegexp)))
            queryParams.put("allow.hosts.regexp", String.valueOf(allowHostsRegexp))

        if (!"null".equals(String.valueOf(allowHostsRegexpAtTypeHint)))
            queryParams.put("allow.hosts.regexp@TypeHint", String.valueOf(allowHostsRegexpAtTypeHint))

        if (!"null".equals(String.valueOf(filterMethods)))
            queryParams.put("filter.methods", String.valueOf(filterMethods))

        if (!"null".equals(String.valueOf(filterMethodsAtTypeHint)))
            queryParams.put("filter.methods@TypeHint", String.valueOf(filterMethodsAtTypeHint))

        // TODO: form params, body param not yet support

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    null )

    }

    def postNode ( String path, String name, String colonOperation, String deleteAuthorizable, File file, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/{path}/{name}"

        // query params
        def queryParams = [:]
        def headerParams = [:]

        // verify required params are set
        if (path == null) {
            throw new RuntimeException("missing required params path")
        }

        // verify required params are set
        if (name == null) {
            throw new RuntimeException("missing required params name")
        }

        if (!"null".equals(String.valueOf(colonOperation)))
            queryParams.put(":operation", String.valueOf(colonOperation))

        if (!"null".equals(String.valueOf(deleteAuthorizable)))
            queryParams.put("deleteAuthorizable", String.valueOf(deleteAuthorizable))

        // TODO: form params, body param not yet support

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    null )

    }

    def postNodeRw ( String path, String name, String addMembers, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/{path}/{name}.rw.html"

        // query params
        def queryParams = [:]
        def headerParams = [:]

        // verify required params are set
        if (path == null) {
            throw new RuntimeException("missing required params path")
        }

        // verify required params are set
        if (name == null) {
            throw new RuntimeException("missing required params name")
        }

        if (!"null".equals(String.valueOf(addMembers)))
            queryParams.put("addMembers", String.valueOf(addMembers))

        // TODO: form params, body param not yet support

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    null )

    }

    def postPath ( String path, String jcrColonPrimaryType, String colonName, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/{path}/"

        // query params
        def queryParams = [:]
        def headerParams = [:]

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

        if (!"null".equals(String.valueOf(jcrColonPrimaryType)))
            queryParams.put("jcr:primaryType", String.valueOf(jcrColonPrimaryType))

        if (!"null".equals(String.valueOf(colonName)))
            queryParams.put(":name", String.valueOf(colonName))

        // TODO: form params, body param not yet support

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    null )

    }

    def postQuery ( String path, BigDecimal pLimit, String _1property, String _1propertyValue, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/bin/querybuilder.json"

        // query params
        def queryParams = [:]
        def headerParams = [:]

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

        if (!"null".equals(String.valueOf(path)))
            queryParams.put("path", String.valueOf(path))

        if (!"null".equals(String.valueOf(pLimit)))
            queryParams.put("p.limit", String.valueOf(pLimit))

        if (!"null".equals(String.valueOf(_1property)))
            queryParams.put("1_property", String.valueOf(_1property))

        if (!"null".equals(String.valueOf(_1propertyValue)))
            queryParams.put("1_property.value", String.valueOf(_1propertyValue))

        // TODO: form params, body param not yet support

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    String.class )

    }

    def postTreeActivation ( Boolean ignoredeactivated, Boolean onlymodified, String path, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/etc/replication/treeactivation.html"

        // query params
        def queryParams = [:]
        def headerParams = [:]

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

        if (!"null".equals(String.valueOf(ignoredeactivated)))
            queryParams.put("ignoredeactivated", String.valueOf(ignoredeactivated))

        if (!"null".equals(String.valueOf(onlymodified)))
            queryParams.put("onlymodified", String.valueOf(onlymodified))

        if (!"null".equals(String.valueOf(path)))
            queryParams.put("path", String.valueOf(path))

        // TODO: form params, body param not yet support

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    null )

    }

    def postTruststore ( String colonOperation, String newPassword, String rePassword, String keyStoreType, String removeAlias, File certificate, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/libs/granite/security/post/truststore"

        // query params
        def queryParams = [:]
        def headerParams = [:]

        if (!"null".equals(String.valueOf(colonOperation)))
            queryParams.put(":operation", String.valueOf(colonOperation))

        if (!"null".equals(String.valueOf(newPassword)))
            queryParams.put("newPassword", String.valueOf(newPassword))

        if (!"null".equals(String.valueOf(rePassword)))
            queryParams.put("rePassword", String.valueOf(rePassword))

        if (!"null".equals(String.valueOf(keyStoreType)))
            queryParams.put("keyStoreType", String.valueOf(keyStoreType))

        if (!"null".equals(String.valueOf(removeAlias)))
            queryParams.put("removeAlias", String.valueOf(removeAlias))

        // TODO: form params, body param not yet support

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    String.class )

    }

    def postTruststorePKCS12 ( File truststoreP12, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/etc/truststore"

        // query params
        def queryParams = [:]
        def headerParams = [:]

        // TODO: form params, body param not yet support

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    String.class )

    }

}
