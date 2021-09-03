using System;
using Nancy;
using Nancy.ModelBinding;
using System.Collections.Generic;
using Sharpility.Base;
using Org.OpenAPITools._.Models;
using Org.OpenAPITools._.Utils;
using NodaTime;

namespace Org.OpenAPITools._.Modules
{ 

    /// <summary>
    /// Module processing requests of Sling domain.
    /// </summary>
    public sealed class SlingModule : NancyModule
    {
        /// <summary>
        /// Sets up HTTP methods mappings.
        /// </summary>
        /// <param name="service">Service handling requests</param>
        public SlingModule(SlingService service) : base("/")
        { 
            Delete["/etc/replication/agents.{runmode}/{name}"] = parameters =>
            {
                var runmode = Parameters.ValueOf<string>(parameters, Context.Request, "runmode", ParameterType.Path);
                var name = Parameters.ValueOf<string>(parameters, Context.Request, "name", ParameterType.Path);
                Preconditions.IsNotNull(runmode, "Required parameter: 'runmode' is missing at 'DeleteAgent'");
                
                Preconditions.IsNotNull(name, "Required parameter: 'name' is missing at 'DeleteAgent'");
                
                service.DeleteAgent(Context, runmode, name);
                return new Response { ContentType = ""};
            };

            Delete["/{path}/{name}"] = parameters =>
            {
                var path = Parameters.ValueOf<string>(parameters, Context.Request, "path", ParameterType.Path);
                var name = Parameters.ValueOf<string>(parameters, Context.Request, "name", ParameterType.Path);
                Preconditions.IsNotNull(path, "Required parameter: 'path' is missing at 'DeleteNode'");
                
                Preconditions.IsNotNull(name, "Required parameter: 'name' is missing at 'DeleteNode'");
                
                service.DeleteNode(Context, path, name);
                return new Response { ContentType = ""};
            };

            Get["/etc/replication/agents.{runmode}/{name}"] = parameters =>
            {
                var runmode = Parameters.ValueOf<string>(parameters, Context.Request, "runmode", ParameterType.Path);
                var name = Parameters.ValueOf<string>(parameters, Context.Request, "name", ParameterType.Path);
                Preconditions.IsNotNull(runmode, "Required parameter: 'runmode' is missing at 'GetAgent'");
                
                Preconditions.IsNotNull(name, "Required parameter: 'name' is missing at 'GetAgent'");
                
                service.GetAgent(Context, runmode, name);
                return new Response { ContentType = ""};
            };

            Get["/etc/replication/agents.{runmode}.-1.json"] = parameters =>
            {
                var runmode = Parameters.ValueOf<string>(parameters, Context.Request, "runmode", ParameterType.Path);
                Preconditions.IsNotNull(runmode, "Required parameter: 'runmode' is missing at 'GetAgents'");
                
                return service.GetAgents(Context, runmode);
            };

            Get["/{intermediatePath}/{authorizableId}.ks.json"] = parameters =>
            {
                var intermediatePath = Parameters.ValueOf<string>(parameters, Context.Request, "intermediatePath", ParameterType.Path);
                var authorizableId = Parameters.ValueOf<string>(parameters, Context.Request, "authorizableId", ParameterType.Path);
                Preconditions.IsNotNull(intermediatePath, "Required parameter: 'intermediatePath' is missing at 'GetAuthorizableKeystore'");
                
                Preconditions.IsNotNull(authorizableId, "Required parameter: 'authorizableId' is missing at 'GetAuthorizableKeystore'");
                
                return service.GetAuthorizableKeystore(Context, intermediatePath, authorizableId);
            };

            Get["/{intermediatePath}/{authorizableId}/keystore/store.p12"] = parameters =>
            {
                var intermediatePath = Parameters.ValueOf<string>(parameters, Context.Request, "intermediatePath", ParameterType.Path);
                var authorizableId = Parameters.ValueOf<string>(parameters, Context.Request, "authorizableId", ParameterType.Path);
                Preconditions.IsNotNull(intermediatePath, "Required parameter: 'intermediatePath' is missing at 'GetKeystore'");
                
                Preconditions.IsNotNull(authorizableId, "Required parameter: 'authorizableId' is missing at 'GetKeystore'");
                
                return service.GetKeystore(Context, intermediatePath, authorizableId);
            };

            Get["/{path}/{name}"] = parameters =>
            {
                var path = Parameters.ValueOf<string>(parameters, Context.Request, "path", ParameterType.Path);
                var name = Parameters.ValueOf<string>(parameters, Context.Request, "name", ParameterType.Path);
                Preconditions.IsNotNull(path, "Required parameter: 'path' is missing at 'GetNode'");
                
                Preconditions.IsNotNull(name, "Required parameter: 'name' is missing at 'GetNode'");
                
                service.GetNode(Context, path, name);
                return new Response { ContentType = ""};
            };

            Get["/etc/packages/{group}/{name}-{version}.zip"] = parameters =>
            {
                var group = Parameters.ValueOf<string>(parameters, Context.Request, "group", ParameterType.Path);
                var name = Parameters.ValueOf<string>(parameters, Context.Request, "name", ParameterType.Path);
                var version = Parameters.ValueOf<string>(parameters, Context.Request, "version", ParameterType.Path);
                Preconditions.IsNotNull(group, "Required parameter: 'group' is missing at 'GetPackage'");
                
                Preconditions.IsNotNull(name, "Required parameter: 'name' is missing at 'GetPackage'");
                
                Preconditions.IsNotNull(version, "Required parameter: 'version' is missing at 'GetPackage'");
                
                return service.GetPackage(Context, group, name, version);
            };

            Get["/etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json"] = parameters =>
            {
                var group = Parameters.ValueOf<string>(parameters, Context.Request, "group", ParameterType.Path);
                var name = Parameters.ValueOf<string>(parameters, Context.Request, "name", ParameterType.Path);
                var version = Parameters.ValueOf<string>(parameters, Context.Request, "version", ParameterType.Path);
                Preconditions.IsNotNull(group, "Required parameter: 'group' is missing at 'GetPackageFilter'");
                
                Preconditions.IsNotNull(name, "Required parameter: 'name' is missing at 'GetPackageFilter'");
                
                Preconditions.IsNotNull(version, "Required parameter: 'version' is missing at 'GetPackageFilter'");
                
                return service.GetPackageFilter(Context, group, name, version);
            };

            Get["/bin/querybuilder.json"] = parameters =>
            {
                var path = Parameters.ValueOf<string>(parameters, Context.Request, "path", ParameterType.Query);
                var pLimit = Parameters.ValueOf<decimal?>(parameters, Context.Request, "pLimit", ParameterType.Query);
                var _1property = Parameters.ValueOf<string>(parameters, Context.Request, "_1property", ParameterType.Query);
                var _1propertyValue = Parameters.ValueOf<string>(parameters, Context.Request, "_1propertyValue", ParameterType.Query);
                Preconditions.IsNotNull(path, "Required parameter: 'path' is missing at 'GetQuery'");
                
                Preconditions.IsNotNull(pLimit, "Required parameter: 'pLimit' is missing at 'GetQuery'");
                
                Preconditions.IsNotNull(_1property, "Required parameter: '_1property' is missing at 'GetQuery'");
                
                Preconditions.IsNotNull(_1propertyValue, "Required parameter: '_1propertyValue' is missing at 'GetQuery'");
                
                return service.GetQuery(Context, path, pLimit, _1property, _1propertyValue);
            };

            Get["/etc/truststore/truststore.p12"] = parameters =>
            {
                
                return service.GetTruststore(Context);
            };

            Get["/libs/granite/security/truststore.json"] = parameters =>
            {
                
                return service.GetTruststoreInfo(Context);
            };

            Post["/etc/replication/agents.{runmode}/{name}"] = parameters =>
            {
                var runmode = Parameters.ValueOf<string>(parameters, Context.Request, "runmode", ParameterType.Path);
                var name = Parameters.ValueOf<string>(parameters, Context.Request, "name", ParameterType.Path);
                var jcrcontentCqdistribute = Parameters.ValueOf<bool?>(parameters, Context.Request, "jcrcontentCqdistribute", ParameterType.Query);
                var jcrcontentCqdistributeTypeHint = Parameters.ValueOf<string>(parameters, Context.Request, "jcrcontentCqdistributeTypeHint", ParameterType.Query);
                var jcrcontentCqname = Parameters.ValueOf<string>(parameters, Context.Request, "jcrcontentCqname", ParameterType.Query);
                var jcrcontentCqtemplate = Parameters.ValueOf<string>(parameters, Context.Request, "jcrcontentCqtemplate", ParameterType.Query);
                var jcrcontentEnabled = Parameters.ValueOf<bool?>(parameters, Context.Request, "jcrcontentEnabled", ParameterType.Query);
                var jcrcontentJcrdescription = Parameters.ValueOf<string>(parameters, Context.Request, "jcrcontentJcrdescription", ParameterType.Query);
                var jcrcontentJcrlastModified = Parameters.ValueOf<string>(parameters, Context.Request, "jcrcontentJcrlastModified", ParameterType.Query);
                var jcrcontentJcrlastModifiedBy = Parameters.ValueOf<string>(parameters, Context.Request, "jcrcontentJcrlastModifiedBy", ParameterType.Query);
                var jcrcontentJcrmixinTypes = Parameters.ValueOf<string>(parameters, Context.Request, "jcrcontentJcrmixinTypes", ParameterType.Query);
                var jcrcontentJcrtitle = Parameters.ValueOf<string>(parameters, Context.Request, "jcrcontentJcrtitle", ParameterType.Query);
                var jcrcontentLogLevel = Parameters.ValueOf<string>(parameters, Context.Request, "jcrcontentLogLevel", ParameterType.Query);
                var jcrcontentNoStatusUpdate = Parameters.ValueOf<bool?>(parameters, Context.Request, "jcrcontentNoStatusUpdate", ParameterType.Query);
                var jcrcontentNoVersioning = Parameters.ValueOf<bool?>(parameters, Context.Request, "jcrcontentNoVersioning", ParameterType.Query);
                var jcrcontentProtocolConnectTimeout = Parameters.ValueOf<decimal?>(parameters, Context.Request, "jcrcontentProtocolConnectTimeout", ParameterType.Query);
                var jcrcontentProtocolHTTPConnectionClosed = Parameters.ValueOf<bool?>(parameters, Context.Request, "jcrcontentProtocolHTTPConnectionClosed", ParameterType.Query);
                var jcrcontentProtocolHTTPExpired = Parameters.ValueOf<string>(parameters, Context.Request, "jcrcontentProtocolHTTPExpired", ParameterType.Query);
                var jcrcontentProtocolHTTPHeaders = Parameters.ValueOf<List<string>>(parameters, Context.Request, "jcrcontentProtocolHTTPHeaders", ParameterType.Query);
                var jcrcontentProtocolHTTPHeadersTypeHint = Parameters.ValueOf<string>(parameters, Context.Request, "jcrcontentProtocolHTTPHeadersTypeHint", ParameterType.Query);
                var jcrcontentProtocolHTTPMethod = Parameters.ValueOf<string>(parameters, Context.Request, "jcrcontentProtocolHTTPMethod", ParameterType.Query);
                var jcrcontentProtocolHTTPSRelaxed = Parameters.ValueOf<bool?>(parameters, Context.Request, "jcrcontentProtocolHTTPSRelaxed", ParameterType.Query);
                var jcrcontentProtocolInterface = Parameters.ValueOf<string>(parameters, Context.Request, "jcrcontentProtocolInterface", ParameterType.Query);
                var jcrcontentProtocolSocketTimeout = Parameters.ValueOf<decimal?>(parameters, Context.Request, "jcrcontentProtocolSocketTimeout", ParameterType.Query);
                var jcrcontentProtocolVersion = Parameters.ValueOf<string>(parameters, Context.Request, "jcrcontentProtocolVersion", ParameterType.Query);
                var jcrcontentProxyNTLMDomain = Parameters.ValueOf<string>(parameters, Context.Request, "jcrcontentProxyNTLMDomain", ParameterType.Query);
                var jcrcontentProxyNTLMHost = Parameters.ValueOf<string>(parameters, Context.Request, "jcrcontentProxyNTLMHost", ParameterType.Query);
                var jcrcontentProxyHost = Parameters.ValueOf<string>(parameters, Context.Request, "jcrcontentProxyHost", ParameterType.Query);
                var jcrcontentProxyPassword = Parameters.ValueOf<string>(parameters, Context.Request, "jcrcontentProxyPassword", ParameterType.Query);
                var jcrcontentProxyPort = Parameters.ValueOf<decimal?>(parameters, Context.Request, "jcrcontentProxyPort", ParameterType.Query);
                var jcrcontentProxyUser = Parameters.ValueOf<string>(parameters, Context.Request, "jcrcontentProxyUser", ParameterType.Query);
                var jcrcontentQueueBatchMaxSize = Parameters.ValueOf<decimal?>(parameters, Context.Request, "jcrcontentQueueBatchMaxSize", ParameterType.Query);
                var jcrcontentQueueBatchMode = Parameters.ValueOf<string>(parameters, Context.Request, "jcrcontentQueueBatchMode", ParameterType.Query);
                var jcrcontentQueueBatchWaitTime = Parameters.ValueOf<decimal?>(parameters, Context.Request, "jcrcontentQueueBatchWaitTime", ParameterType.Query);
                var jcrcontentRetryDelay = Parameters.ValueOf<string>(parameters, Context.Request, "jcrcontentRetryDelay", ParameterType.Query);
                var jcrcontentReverseReplication = Parameters.ValueOf<bool?>(parameters, Context.Request, "jcrcontentReverseReplication", ParameterType.Query);
                var jcrcontentSerializationType = Parameters.ValueOf<string>(parameters, Context.Request, "jcrcontentSerializationType", ParameterType.Query);
                var jcrcontentSlingresourceType = Parameters.ValueOf<string>(parameters, Context.Request, "jcrcontentSlingresourceType", ParameterType.Query);
                var jcrcontentSsl = Parameters.ValueOf<string>(parameters, Context.Request, "jcrcontentSsl", ParameterType.Query);
                var jcrcontentTransportNTLMDomain = Parameters.ValueOf<string>(parameters, Context.Request, "jcrcontentTransportNTLMDomain", ParameterType.Query);
                var jcrcontentTransportNTLMHost = Parameters.ValueOf<string>(parameters, Context.Request, "jcrcontentTransportNTLMHost", ParameterType.Query);
                var jcrcontentTransportPassword = Parameters.ValueOf<string>(parameters, Context.Request, "jcrcontentTransportPassword", ParameterType.Query);
                var jcrcontentTransportUri = Parameters.ValueOf<string>(parameters, Context.Request, "jcrcontentTransportUri", ParameterType.Query);
                var jcrcontentTransportUser = Parameters.ValueOf<string>(parameters, Context.Request, "jcrcontentTransportUser", ParameterType.Query);
                var jcrcontentTriggerDistribute = Parameters.ValueOf<bool?>(parameters, Context.Request, "jcrcontentTriggerDistribute", ParameterType.Query);
                var jcrcontentTriggerModified = Parameters.ValueOf<bool?>(parameters, Context.Request, "jcrcontentTriggerModified", ParameterType.Query);
                var jcrcontentTriggerOnOffTime = Parameters.ValueOf<bool?>(parameters, Context.Request, "jcrcontentTriggerOnOffTime", ParameterType.Query);
                var jcrcontentTriggerReceive = Parameters.ValueOf<bool?>(parameters, Context.Request, "jcrcontentTriggerReceive", ParameterType.Query);
                var jcrcontentTriggerSpecific = Parameters.ValueOf<bool?>(parameters, Context.Request, "jcrcontentTriggerSpecific", ParameterType.Query);
                var jcrcontentUserId = Parameters.ValueOf<string>(parameters, Context.Request, "jcrcontentUserId", ParameterType.Query);
                var jcrprimaryType = Parameters.ValueOf<string>(parameters, Context.Request, "jcrprimaryType", ParameterType.Query);
                var operation = Parameters.ValueOf<string>(parameters, Context.Request, "operation", ParameterType.Query);
                Preconditions.IsNotNull(runmode, "Required parameter: 'runmode' is missing at 'PostAgent'");
                
                Preconditions.IsNotNull(name, "Required parameter: 'name' is missing at 'PostAgent'");
                
                service.PostAgent(Context, runmode, name, jcrcontentCqdistribute, jcrcontentCqdistributeTypeHint, jcrcontentCqname, jcrcontentCqtemplate, jcrcontentEnabled, jcrcontentJcrdescription, jcrcontentJcrlastModified, jcrcontentJcrlastModifiedBy, jcrcontentJcrmixinTypes, jcrcontentJcrtitle, jcrcontentLogLevel, jcrcontentNoStatusUpdate, jcrcontentNoVersioning, jcrcontentProtocolConnectTimeout, jcrcontentProtocolHTTPConnectionClosed, jcrcontentProtocolHTTPExpired, jcrcontentProtocolHTTPHeaders, jcrcontentProtocolHTTPHeadersTypeHint, jcrcontentProtocolHTTPMethod, jcrcontentProtocolHTTPSRelaxed, jcrcontentProtocolInterface, jcrcontentProtocolSocketTimeout, jcrcontentProtocolVersion, jcrcontentProxyNTLMDomain, jcrcontentProxyNTLMHost, jcrcontentProxyHost, jcrcontentProxyPassword, jcrcontentProxyPort, jcrcontentProxyUser, jcrcontentQueueBatchMaxSize, jcrcontentQueueBatchMode, jcrcontentQueueBatchWaitTime, jcrcontentRetryDelay, jcrcontentReverseReplication, jcrcontentSerializationType, jcrcontentSlingresourceType, jcrcontentSsl, jcrcontentTransportNTLMDomain, jcrcontentTransportNTLMHost, jcrcontentTransportPassword, jcrcontentTransportUri, jcrcontentTransportUser, jcrcontentTriggerDistribute, jcrcontentTriggerModified, jcrcontentTriggerOnOffTime, jcrcontentTriggerReceive, jcrcontentTriggerSpecific, jcrcontentUserId, jcrprimaryType, operation);
                return new Response { ContentType = ""};
            };

            Post["/{intermediatePath}/{authorizableId}.ks.html"] = parameters =>
            {
                var intermediatePath = Parameters.ValueOf<string>(parameters, Context.Request, "intermediatePath", ParameterType.Path);
                var authorizableId = Parameters.ValueOf<string>(parameters, Context.Request, "authorizableId", ParameterType.Path);
                var operation = Parameters.ValueOf<string>(parameters, Context.Request, "operation", ParameterType.Query);
                var currentPassword = Parameters.ValueOf<string>(parameters, Context.Request, "currentPassword", ParameterType.Query);
                var newPassword = Parameters.ValueOf<string>(parameters, Context.Request, "newPassword", ParameterType.Query);
                var rePassword = Parameters.ValueOf<string>(parameters, Context.Request, "rePassword", ParameterType.Query);
                var keyPassword = Parameters.ValueOf<string>(parameters, Context.Request, "keyPassword", ParameterType.Query);
                var keyStorePass = Parameters.ValueOf<string>(parameters, Context.Request, "keyStorePass", ParameterType.Query);
                var alias = Parameters.ValueOf<string>(parameters, Context.Request, "alias", ParameterType.Query);
                var newAlias = Parameters.ValueOf<string>(parameters, Context.Request, "newAlias", ParameterType.Query);
                var removeAlias = Parameters.ValueOf<string>(parameters, Context.Request, "removeAlias", ParameterType.Query);
                var certChain = Parameters.ValueOf<System.IO.Stream>(parameters, Context.Request, "certChain", ParameterType.Undefined);
                var pk = Parameters.ValueOf<System.IO.Stream>(parameters, Context.Request, "pk", ParameterType.Undefined);
                var keyStore = Parameters.ValueOf<System.IO.Stream>(parameters, Context.Request, "keyStore", ParameterType.Undefined);
                Preconditions.IsNotNull(intermediatePath, "Required parameter: 'intermediatePath' is missing at 'PostAuthorizableKeystore'");
                
                Preconditions.IsNotNull(authorizableId, "Required parameter: 'authorizableId' is missing at 'PostAuthorizableKeystore'");
                
                return service.PostAuthorizableKeystore(Context, intermediatePath, authorizableId, operation, currentPassword, newPassword, rePassword, keyPassword, keyStorePass, alias, newAlias, removeAlias, certChain, pk, keyStore);
            };

            Post["/libs/granite/security/post/authorizables"] = parameters =>
            {
                var authorizableId = Parameters.ValueOf<string>(parameters, Context.Request, "authorizableId", ParameterType.Query);
                var intermediatePath = Parameters.ValueOf<string>(parameters, Context.Request, "intermediatePath", ParameterType.Query);
                var createUser = Parameters.ValueOf<string>(parameters, Context.Request, "createUser", ParameterType.Query);
                var createGroup = Parameters.ValueOf<string>(parameters, Context.Request, "createGroup", ParameterType.Query);
                var reppassword = Parameters.ValueOf<string>(parameters, Context.Request, "reppassword", ParameterType.Query);
                var profileGivenName = Parameters.ValueOf<string>(parameters, Context.Request, "profileGivenName", ParameterType.Query);
                Preconditions.IsNotNull(authorizableId, "Required parameter: 'authorizableId' is missing at 'PostAuthorizables'");
                
                Preconditions.IsNotNull(intermediatePath, "Required parameter: 'intermediatePath' is missing at 'PostAuthorizables'");
                
                return service.PostAuthorizables(Context, authorizableId, intermediatePath, createUser, createGroup, reppassword, profileGivenName);
            };

            Post["/apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config"] = parameters =>
            {
                var keyStorePassword = Parameters.ValueOf<string>(parameters, Context.Request, "keyStorePassword", ParameterType.Query);
                var keyStorePasswordTypeHint = Parameters.ValueOf<string>(parameters, Context.Request, "keyStorePasswordTypeHint", ParameterType.Query);
                var serviceRanking = Parameters.ValueOf<int?>(parameters, Context.Request, "serviceRanking", ParameterType.Query);
                var serviceRankingTypeHint = Parameters.ValueOf<string>(parameters, Context.Request, "serviceRankingTypeHint", ParameterType.Query);
                var idpHttpRedirect = Parameters.ValueOf<bool?>(parameters, Context.Request, "idpHttpRedirect", ParameterType.Query);
                var idpHttpRedirectTypeHint = Parameters.ValueOf<string>(parameters, Context.Request, "idpHttpRedirectTypeHint", ParameterType.Query);
                var createUser = Parameters.ValueOf<bool?>(parameters, Context.Request, "createUser", ParameterType.Query);
                var createUserTypeHint = Parameters.ValueOf<string>(parameters, Context.Request, "createUserTypeHint", ParameterType.Query);
                var defaultRedirectUrl = Parameters.ValueOf<string>(parameters, Context.Request, "defaultRedirectUrl", ParameterType.Query);
                var defaultRedirectUrlTypeHint = Parameters.ValueOf<string>(parameters, Context.Request, "defaultRedirectUrlTypeHint", ParameterType.Query);
                var userIDAttribute = Parameters.ValueOf<string>(parameters, Context.Request, "userIDAttribute", ParameterType.Query);
                var userIDAttributeTypeHint = Parameters.ValueOf<string>(parameters, Context.Request, "userIDAttributeTypeHint", ParameterType.Query);
                var defaultGroups = Parameters.ValueOf<List<string>>(parameters, Context.Request, "defaultGroups", ParameterType.Query);
                var defaultGroupsTypeHint = Parameters.ValueOf<string>(parameters, Context.Request, "defaultGroupsTypeHint", ParameterType.Query);
                var idpCertAlias = Parameters.ValueOf<string>(parameters, Context.Request, "idpCertAlias", ParameterType.Query);
                var idpCertAliasTypeHint = Parameters.ValueOf<string>(parameters, Context.Request, "idpCertAliasTypeHint", ParameterType.Query);
                var addGroupMemberships = Parameters.ValueOf<bool?>(parameters, Context.Request, "addGroupMemberships", ParameterType.Query);
                var addGroupMembershipsTypeHint = Parameters.ValueOf<string>(parameters, Context.Request, "addGroupMembershipsTypeHint", ParameterType.Query);
                var path = Parameters.ValueOf<List<string>>(parameters, Context.Request, "path", ParameterType.Query);
                var pathTypeHint = Parameters.ValueOf<string>(parameters, Context.Request, "pathTypeHint", ParameterType.Query);
                var synchronizeAttributes = Parameters.ValueOf<List<string>>(parameters, Context.Request, "synchronizeAttributes", ParameterType.Query);
                var synchronizeAttributesTypeHint = Parameters.ValueOf<string>(parameters, Context.Request, "synchronizeAttributesTypeHint", ParameterType.Query);
                var clockTolerance = Parameters.ValueOf<int?>(parameters, Context.Request, "clockTolerance", ParameterType.Query);
                var clockToleranceTypeHint = Parameters.ValueOf<string>(parameters, Context.Request, "clockToleranceTypeHint", ParameterType.Query);
                var groupMembershipAttribute = Parameters.ValueOf<string>(parameters, Context.Request, "groupMembershipAttribute", ParameterType.Query);
                var groupMembershipAttributeTypeHint = Parameters.ValueOf<string>(parameters, Context.Request, "groupMembershipAttributeTypeHint", ParameterType.Query);
                var idpUrl = Parameters.ValueOf<string>(parameters, Context.Request, "idpUrl", ParameterType.Query);
                var idpUrlTypeHint = Parameters.ValueOf<string>(parameters, Context.Request, "idpUrlTypeHint", ParameterType.Query);
                var logoutUrl = Parameters.ValueOf<string>(parameters, Context.Request, "logoutUrl", ParameterType.Query);
                var logoutUrlTypeHint = Parameters.ValueOf<string>(parameters, Context.Request, "logoutUrlTypeHint", ParameterType.Query);
                var serviceProviderEntityId = Parameters.ValueOf<string>(parameters, Context.Request, "serviceProviderEntityId", ParameterType.Query);
                var serviceProviderEntityIdTypeHint = Parameters.ValueOf<string>(parameters, Context.Request, "serviceProviderEntityIdTypeHint", ParameterType.Query);
                var assertionConsumerServiceURL = Parameters.ValueOf<string>(parameters, Context.Request, "assertionConsumerServiceURL", ParameterType.Query);
                var assertionConsumerServiceURLTypeHint = Parameters.ValueOf<string>(parameters, Context.Request, "assertionConsumerServiceURLTypeHint", ParameterType.Query);
                var handleLogout = Parameters.ValueOf<bool?>(parameters, Context.Request, "handleLogout", ParameterType.Query);
                var handleLogoutTypeHint = Parameters.ValueOf<string>(parameters, Context.Request, "handleLogoutTypeHint", ParameterType.Query);
                var spPrivateKeyAlias = Parameters.ValueOf<string>(parameters, Context.Request, "spPrivateKeyAlias", ParameterType.Query);
                var spPrivateKeyAliasTypeHint = Parameters.ValueOf<string>(parameters, Context.Request, "spPrivateKeyAliasTypeHint", ParameterType.Query);
                var useEncryption = Parameters.ValueOf<bool?>(parameters, Context.Request, "useEncryption", ParameterType.Query);
                var useEncryptionTypeHint = Parameters.ValueOf<string>(parameters, Context.Request, "useEncryptionTypeHint", ParameterType.Query);
                var nameIdFormat = Parameters.ValueOf<string>(parameters, Context.Request, "nameIdFormat", ParameterType.Query);
                var nameIdFormatTypeHint = Parameters.ValueOf<string>(parameters, Context.Request, "nameIdFormatTypeHint", ParameterType.Query);
                var digestMethod = Parameters.ValueOf<string>(parameters, Context.Request, "digestMethod", ParameterType.Query);
                var digestMethodTypeHint = Parameters.ValueOf<string>(parameters, Context.Request, "digestMethodTypeHint", ParameterType.Query);
                var signatureMethod = Parameters.ValueOf<string>(parameters, Context.Request, "signatureMethod", ParameterType.Query);
                var signatureMethodTypeHint = Parameters.ValueOf<string>(parameters, Context.Request, "signatureMethodTypeHint", ParameterType.Query);
                var userIntermediatePath = Parameters.ValueOf<string>(parameters, Context.Request, "userIntermediatePath", ParameterType.Query);
                var userIntermediatePathTypeHint = Parameters.ValueOf<string>(parameters, Context.Request, "userIntermediatePathTypeHint", ParameterType.Query);
                service.PostConfigAdobeGraniteSamlAuthenticationHandler(Context, keyStorePassword, keyStorePasswordTypeHint, serviceRanking, serviceRankingTypeHint, idpHttpRedirect, idpHttpRedirectTypeHint, createUser, createUserTypeHint, defaultRedirectUrl, defaultRedirectUrlTypeHint, userIDAttribute, userIDAttributeTypeHint, defaultGroups, defaultGroupsTypeHint, idpCertAlias, idpCertAliasTypeHint, addGroupMemberships, addGroupMembershipsTypeHint, path, pathTypeHint, synchronizeAttributes, synchronizeAttributesTypeHint, clockTolerance, clockToleranceTypeHint, groupMembershipAttribute, groupMembershipAttributeTypeHint, idpUrl, idpUrlTypeHint, logoutUrl, logoutUrlTypeHint, serviceProviderEntityId, serviceProviderEntityIdTypeHint, assertionConsumerServiceURL, assertionConsumerServiceURLTypeHint, handleLogout, handleLogoutTypeHint, spPrivateKeyAlias, spPrivateKeyAliasTypeHint, useEncryption, useEncryptionTypeHint, nameIdFormat, nameIdFormatTypeHint, digestMethod, digestMethodTypeHint, signatureMethod, signatureMethodTypeHint, userIntermediatePath, userIntermediatePathTypeHint);
                return new Response { ContentType = ""};
            };

            Post["/apps/system/config/org.apache.felix.http"] = parameters =>
            {
                var orgApacheFelixHttpsNio = Parameters.ValueOf<bool?>(parameters, Context.Request, "orgApacheFelixHttpsNio", ParameterType.Query);
                var orgApacheFelixHttpsNioTypeHint = Parameters.ValueOf<string>(parameters, Context.Request, "orgApacheFelixHttpsNioTypeHint", ParameterType.Query);
                var orgApacheFelixHttpsKeystore = Parameters.ValueOf<string>(parameters, Context.Request, "orgApacheFelixHttpsKeystore", ParameterType.Query);
                var orgApacheFelixHttpsKeystoreTypeHint = Parameters.ValueOf<string>(parameters, Context.Request, "orgApacheFelixHttpsKeystoreTypeHint", ParameterType.Query);
                var orgApacheFelixHttpsKeystorePassword = Parameters.ValueOf<string>(parameters, Context.Request, "orgApacheFelixHttpsKeystorePassword", ParameterType.Query);
                var orgApacheFelixHttpsKeystorePasswordTypeHint = Parameters.ValueOf<string>(parameters, Context.Request, "orgApacheFelixHttpsKeystorePasswordTypeHint", ParameterType.Query);
                var orgApacheFelixHttpsKeystoreKey = Parameters.ValueOf<string>(parameters, Context.Request, "orgApacheFelixHttpsKeystoreKey", ParameterType.Query);
                var orgApacheFelixHttpsKeystoreKeyTypeHint = Parameters.ValueOf<string>(parameters, Context.Request, "orgApacheFelixHttpsKeystoreKeyTypeHint", ParameterType.Query);
                var orgApacheFelixHttpsKeystoreKeyPassword = Parameters.ValueOf<string>(parameters, Context.Request, "orgApacheFelixHttpsKeystoreKeyPassword", ParameterType.Query);
                var orgApacheFelixHttpsKeystoreKeyPasswordTypeHint = Parameters.ValueOf<string>(parameters, Context.Request, "orgApacheFelixHttpsKeystoreKeyPasswordTypeHint", ParameterType.Query);
                var orgApacheFelixHttpsTruststore = Parameters.ValueOf<string>(parameters, Context.Request, "orgApacheFelixHttpsTruststore", ParameterType.Query);
                var orgApacheFelixHttpsTruststoreTypeHint = Parameters.ValueOf<string>(parameters, Context.Request, "orgApacheFelixHttpsTruststoreTypeHint", ParameterType.Query);
                var orgApacheFelixHttpsTruststorePassword = Parameters.ValueOf<string>(parameters, Context.Request, "orgApacheFelixHttpsTruststorePassword", ParameterType.Query);
                var orgApacheFelixHttpsTruststorePasswordTypeHint = Parameters.ValueOf<string>(parameters, Context.Request, "orgApacheFelixHttpsTruststorePasswordTypeHint", ParameterType.Query);
                var orgApacheFelixHttpsClientcertificate = Parameters.ValueOf<string>(parameters, Context.Request, "orgApacheFelixHttpsClientcertificate", ParameterType.Query);
                var orgApacheFelixHttpsClientcertificateTypeHint = Parameters.ValueOf<string>(parameters, Context.Request, "orgApacheFelixHttpsClientcertificateTypeHint", ParameterType.Query);
                var orgApacheFelixHttpsEnable = Parameters.ValueOf<bool?>(parameters, Context.Request, "orgApacheFelixHttpsEnable", ParameterType.Query);
                var orgApacheFelixHttpsEnableTypeHint = Parameters.ValueOf<string>(parameters, Context.Request, "orgApacheFelixHttpsEnableTypeHint", ParameterType.Query);
                var orgOsgiServiceHttpPortSecure = Parameters.ValueOf<string>(parameters, Context.Request, "orgOsgiServiceHttpPortSecure", ParameterType.Query);
                var orgOsgiServiceHttpPortSecureTypeHint = Parameters.ValueOf<string>(parameters, Context.Request, "orgOsgiServiceHttpPortSecureTypeHint", ParameterType.Query);
                service.PostConfigApacheFelixJettyBasedHttpService(Context, orgApacheFelixHttpsNio, orgApacheFelixHttpsNioTypeHint, orgApacheFelixHttpsKeystore, orgApacheFelixHttpsKeystoreTypeHint, orgApacheFelixHttpsKeystorePassword, orgApacheFelixHttpsKeystorePasswordTypeHint, orgApacheFelixHttpsKeystoreKey, orgApacheFelixHttpsKeystoreKeyTypeHint, orgApacheFelixHttpsKeystoreKeyPassword, orgApacheFelixHttpsKeystoreKeyPasswordTypeHint, orgApacheFelixHttpsTruststore, orgApacheFelixHttpsTruststoreTypeHint, orgApacheFelixHttpsTruststorePassword, orgApacheFelixHttpsTruststorePasswordTypeHint, orgApacheFelixHttpsClientcertificate, orgApacheFelixHttpsClientcertificateTypeHint, orgApacheFelixHttpsEnable, orgApacheFelixHttpsEnableTypeHint, orgOsgiServiceHttpPortSecure, orgOsgiServiceHttpPortSecureTypeHint);
                return new Response { ContentType = ""};
            };

            Post["/apps/system/config/org.apache.http.proxyconfigurator.config"] = parameters =>
            {
                var proxyHost = Parameters.ValueOf<string>(parameters, Context.Request, "proxyHost", ParameterType.Query);
                var proxyHostTypeHint = Parameters.ValueOf<string>(parameters, Context.Request, "proxyHostTypeHint", ParameterType.Query);
                var proxyPort = Parameters.ValueOf<int?>(parameters, Context.Request, "proxyPort", ParameterType.Query);
                var proxyPortTypeHint = Parameters.ValueOf<string>(parameters, Context.Request, "proxyPortTypeHint", ParameterType.Query);
                var proxyExceptions = Parameters.ValueOf<List<string>>(parameters, Context.Request, "proxyExceptions", ParameterType.Query);
                var proxyExceptionsTypeHint = Parameters.ValueOf<string>(parameters, Context.Request, "proxyExceptionsTypeHint", ParameterType.Query);
                var proxyEnabled = Parameters.ValueOf<bool?>(parameters, Context.Request, "proxyEnabled", ParameterType.Query);
                var proxyEnabledTypeHint = Parameters.ValueOf<string>(parameters, Context.Request, "proxyEnabledTypeHint", ParameterType.Query);
                var proxyUser = Parameters.ValueOf<string>(parameters, Context.Request, "proxyUser", ParameterType.Query);
                var proxyUserTypeHint = Parameters.ValueOf<string>(parameters, Context.Request, "proxyUserTypeHint", ParameterType.Query);
                var proxyPassword = Parameters.ValueOf<string>(parameters, Context.Request, "proxyPassword", ParameterType.Query);
                var proxyPasswordTypeHint = Parameters.ValueOf<string>(parameters, Context.Request, "proxyPasswordTypeHint", ParameterType.Query);
                service.PostConfigApacheHttpComponentsProxyConfiguration(Context, proxyHost, proxyHostTypeHint, proxyPort, proxyPortTypeHint, proxyExceptions, proxyExceptionsTypeHint, proxyEnabled, proxyEnabledTypeHint, proxyUser, proxyUserTypeHint, proxyPassword, proxyPasswordTypeHint);
                return new Response { ContentType = ""};
            };

            Post["/apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet"] = parameters =>
            {
                var alias = Parameters.ValueOf<string>(parameters, Context.Request, "alias", ParameterType.Query);
                var aliasTypeHint = Parameters.ValueOf<string>(parameters, Context.Request, "aliasTypeHint", ParameterType.Query);
                var davCreateAbsoluteUri = Parameters.ValueOf<bool?>(parameters, Context.Request, "davCreateAbsoluteUri", ParameterType.Query);
                var davCreateAbsoluteUriTypeHint = Parameters.ValueOf<string>(parameters, Context.Request, "davCreateAbsoluteUriTypeHint", ParameterType.Query);
                service.PostConfigApacheSlingDavExServlet(Context, alias, aliasTypeHint, davCreateAbsoluteUri, davCreateAbsoluteUriTypeHint);
                return new Response { ContentType = ""};
            };

            Post["/apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet"] = parameters =>
            {
                var jsonMaximumresults = Parameters.ValueOf<string>(parameters, Context.Request, "jsonMaximumresults", ParameterType.Query);
                var jsonMaximumresultsTypeHint = Parameters.ValueOf<string>(parameters, Context.Request, "jsonMaximumresultsTypeHint", ParameterType.Query);
                var enableHtml = Parameters.ValueOf<bool?>(parameters, Context.Request, "enableHtml", ParameterType.Query);
                var enableHtmlTypeHint = Parameters.ValueOf<string>(parameters, Context.Request, "enableHtmlTypeHint", ParameterType.Query);
                var enableTxt = Parameters.ValueOf<bool?>(parameters, Context.Request, "enableTxt", ParameterType.Query);
                var enableTxtTypeHint = Parameters.ValueOf<string>(parameters, Context.Request, "enableTxtTypeHint", ParameterType.Query);
                var enableXml = Parameters.ValueOf<bool?>(parameters, Context.Request, "enableXml", ParameterType.Query);
                var enableXmlTypeHint = Parameters.ValueOf<string>(parameters, Context.Request, "enableXmlTypeHint", ParameterType.Query);
                service.PostConfigApacheSlingGetServlet(Context, jsonMaximumresults, jsonMaximumresultsTypeHint, enableHtml, enableHtmlTypeHint, enableTxt, enableTxtTypeHint, enableXml, enableXmlTypeHint);
                return new Response { ContentType = ""};
            };

            Post["/apps/system/config/org.apache.sling.security.impl.ReferrerFilter"] = parameters =>
            {
                var allowEmpty = Parameters.ValueOf<bool?>(parameters, Context.Request, "allowEmpty", ParameterType.Query);
                var allowEmptyTypeHint = Parameters.ValueOf<string>(parameters, Context.Request, "allowEmptyTypeHint", ParameterType.Query);
                var allowHosts = Parameters.ValueOf<string>(parameters, Context.Request, "allowHosts", ParameterType.Query);
                var allowHostsTypeHint = Parameters.ValueOf<string>(parameters, Context.Request, "allowHostsTypeHint", ParameterType.Query);
                var allowHostsRegexp = Parameters.ValueOf<string>(parameters, Context.Request, "allowHostsRegexp", ParameterType.Query);
                var allowHostsRegexpTypeHint = Parameters.ValueOf<string>(parameters, Context.Request, "allowHostsRegexpTypeHint", ParameterType.Query);
                var filterMethods = Parameters.ValueOf<string>(parameters, Context.Request, "filterMethods", ParameterType.Query);
                var filterMethodsTypeHint = Parameters.ValueOf<string>(parameters, Context.Request, "filterMethodsTypeHint", ParameterType.Query);
                service.PostConfigApacheSlingReferrerFilter(Context, allowEmpty, allowEmptyTypeHint, allowHosts, allowHostsTypeHint, allowHostsRegexp, allowHostsRegexpTypeHint, filterMethods, filterMethodsTypeHint);
                return new Response { ContentType = ""};
            };

            Post["/apps/system/config/{configNodeName}"] = parameters =>
            {
                var configNodeName = Parameters.ValueOf<string>(parameters, Context.Request, "configNodeName", ParameterType.Path);
                Preconditions.IsNotNull(configNodeName, "Required parameter: 'configNodeName' is missing at 'PostConfigProperty'");
                
                service.PostConfigProperty(Context, configNodeName);
                return new Response { ContentType = ""};
            };

            Post["/{path}/{name}"] = parameters =>
            {
                var path = Parameters.ValueOf<string>(parameters, Context.Request, "path", ParameterType.Path);
                var name = Parameters.ValueOf<string>(parameters, Context.Request, "name", ParameterType.Path);
                var operation = Parameters.ValueOf<string>(parameters, Context.Request, "operation", ParameterType.Query);
                var deleteAuthorizable = Parameters.ValueOf<string>(parameters, Context.Request, "deleteAuthorizable", ParameterType.Query);
                var file = Parameters.ValueOf<System.IO.Stream>(parameters, Context.Request, "file", ParameterType.Undefined);
                Preconditions.IsNotNull(path, "Required parameter: 'path' is missing at 'PostNode'");
                
                Preconditions.IsNotNull(name, "Required parameter: 'name' is missing at 'PostNode'");
                
                service.PostNode(Context, path, name, operation, deleteAuthorizable, file);
                return new Response { ContentType = ""};
            };

            Post["/{path}/{name}.rw.html"] = parameters =>
            {
                var path = Parameters.ValueOf<string>(parameters, Context.Request, "path", ParameterType.Path);
                var name = Parameters.ValueOf<string>(parameters, Context.Request, "name", ParameterType.Path);
                var addMembers = Parameters.ValueOf<string>(parameters, Context.Request, "addMembers", ParameterType.Query);
                Preconditions.IsNotNull(path, "Required parameter: 'path' is missing at 'PostNodeRw'");
                
                Preconditions.IsNotNull(name, "Required parameter: 'name' is missing at 'PostNodeRw'");
                
                service.PostNodeRw(Context, path, name, addMembers);
                return new Response { ContentType = ""};
            };

            Post["/{path}/"] = parameters =>
            {
                var path = Parameters.ValueOf<string>(parameters, Context.Request, "path", ParameterType.Path);
                var jcrprimaryType = Parameters.ValueOf<string>(parameters, Context.Request, "jcrprimaryType", ParameterType.Query);
                var name = Parameters.ValueOf<string>(parameters, Context.Request, "name", ParameterType.Query);
                Preconditions.IsNotNull(path, "Required parameter: 'path' is missing at 'PostPath'");
                
                Preconditions.IsNotNull(jcrprimaryType, "Required parameter: 'jcrprimaryType' is missing at 'PostPath'");
                
                Preconditions.IsNotNull(name, "Required parameter: 'name' is missing at 'PostPath'");
                
                service.PostPath(Context, path, jcrprimaryType, name);
                return new Response { ContentType = ""};
            };

            Post["/bin/querybuilder.json"] = parameters =>
            {
                var path = Parameters.ValueOf<string>(parameters, Context.Request, "path", ParameterType.Query);
                var pLimit = Parameters.ValueOf<decimal?>(parameters, Context.Request, "pLimit", ParameterType.Query);
                var _1property = Parameters.ValueOf<string>(parameters, Context.Request, "_1property", ParameterType.Query);
                var _1propertyValue = Parameters.ValueOf<string>(parameters, Context.Request, "_1propertyValue", ParameterType.Query);
                Preconditions.IsNotNull(path, "Required parameter: 'path' is missing at 'PostQuery'");
                
                Preconditions.IsNotNull(pLimit, "Required parameter: 'pLimit' is missing at 'PostQuery'");
                
                Preconditions.IsNotNull(_1property, "Required parameter: '_1property' is missing at 'PostQuery'");
                
                Preconditions.IsNotNull(_1propertyValue, "Required parameter: '_1propertyValue' is missing at 'PostQuery'");
                
                return service.PostQuery(Context, path, pLimit, _1property, _1propertyValue);
            };

            Post["/etc/replication/treeactivation.html"] = parameters =>
            {
                var ignoredeactivated = Parameters.ValueOf<bool?>(parameters, Context.Request, "ignoredeactivated", ParameterType.Query);
                var onlymodified = Parameters.ValueOf<bool?>(parameters, Context.Request, "onlymodified", ParameterType.Query);
                var path = Parameters.ValueOf<string>(parameters, Context.Request, "path", ParameterType.Query);
                Preconditions.IsNotNull(ignoredeactivated, "Required parameter: 'ignoredeactivated' is missing at 'PostTreeActivation'");
                
                Preconditions.IsNotNull(onlymodified, "Required parameter: 'onlymodified' is missing at 'PostTreeActivation'");
                
                Preconditions.IsNotNull(path, "Required parameter: 'path' is missing at 'PostTreeActivation'");
                
                service.PostTreeActivation(Context, ignoredeactivated, onlymodified, path);
                return new Response { ContentType = ""};
            };

            Post["/libs/granite/security/post/truststore"] = parameters =>
            {
                var operation = Parameters.ValueOf<string>(parameters, Context.Request, "operation", ParameterType.Query);
                var newPassword = Parameters.ValueOf<string>(parameters, Context.Request, "newPassword", ParameterType.Query);
                var rePassword = Parameters.ValueOf<string>(parameters, Context.Request, "rePassword", ParameterType.Query);
                var keyStoreType = Parameters.ValueOf<string>(parameters, Context.Request, "keyStoreType", ParameterType.Query);
                var removeAlias = Parameters.ValueOf<string>(parameters, Context.Request, "removeAlias", ParameterType.Query);
                var certificate = Parameters.ValueOf<System.IO.Stream>(parameters, Context.Request, "certificate", ParameterType.Undefined);
                return service.PostTruststore(Context, operation, newPassword, rePassword, keyStoreType, removeAlias, certificate);
            };

            Post["/etc/truststore"] = parameters =>
            {
                var truststoreP12 = Parameters.ValueOf<System.IO.Stream>(parameters, Context.Request, "truststoreP12", ParameterType.Undefined);
                return service.PostTruststorePKCS12(Context, truststoreP12);
            };
        }
    }

    /// <summary>
    /// Service handling Sling requests.
    /// </summary>
    public interface SlingService
    {
        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="runmode"></param>
        /// <param name="name"></param>
        /// <returns></returns>
        void DeleteAgent(NancyContext context, string runmode, string name);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="path"></param>
        /// <param name="name"></param>
        /// <returns></returns>
        void DeleteNode(NancyContext context, string path, string name);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="runmode"></param>
        /// <param name="name"></param>
        /// <returns></returns>
        void GetAgent(NancyContext context, string runmode, string name);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="runmode"></param>
        /// <returns>string</returns>
        string GetAgents(NancyContext context, string runmode);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="intermediatePath"></param>
        /// <param name="authorizableId"></param>
        /// <returns>KeystoreInfo</returns>
        KeystoreInfo GetAuthorizableKeystore(NancyContext context, string intermediatePath, string authorizableId);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="intermediatePath"></param>
        /// <param name="authorizableId"></param>
        /// <returns>System.IO.Stream</returns>
        System.IO.Stream GetKeystore(NancyContext context, string intermediatePath, string authorizableId);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="path"></param>
        /// <param name="name"></param>
        /// <returns></returns>
        void GetNode(NancyContext context, string path, string name);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="group"></param>
        /// <param name="name"></param>
        /// <param name="version"></param>
        /// <returns>System.IO.Stream</returns>
        System.IO.Stream GetPackage(NancyContext context, string group, string name, string version);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="group"></param>
        /// <param name="name"></param>
        /// <param name="version"></param>
        /// <returns>string</returns>
        string GetPackageFilter(NancyContext context, string group, string name, string version);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="path"></param>
        /// <param name="pLimit"></param>
        /// <param name="_1property"></param>
        /// <param name="_1propertyValue"></param>
        /// <returns>string</returns>
        string GetQuery(NancyContext context, string path, decimal? pLimit, string _1property, string _1propertyValue);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <returns>System.IO.Stream</returns>
        System.IO.Stream GetTruststore(NancyContext context);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <returns>TruststoreInfo</returns>
        TruststoreInfo GetTruststoreInfo(NancyContext context);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="runmode"></param>
        /// <param name="name"></param>
        /// <param name="jcrcontentCqdistribute"> (optional)</param>
        /// <param name="jcrcontentCqdistributeTypeHint"> (optional)</param>
        /// <param name="jcrcontentCqname"> (optional)</param>
        /// <param name="jcrcontentCqtemplate"> (optional)</param>
        /// <param name="jcrcontentEnabled"> (optional)</param>
        /// <param name="jcrcontentJcrdescription"> (optional)</param>
        /// <param name="jcrcontentJcrlastModified"> (optional)</param>
        /// <param name="jcrcontentJcrlastModifiedBy"> (optional)</param>
        /// <param name="jcrcontentJcrmixinTypes"> (optional)</param>
        /// <param name="jcrcontentJcrtitle"> (optional)</param>
        /// <param name="jcrcontentLogLevel"> (optional)</param>
        /// <param name="jcrcontentNoStatusUpdate"> (optional)</param>
        /// <param name="jcrcontentNoVersioning"> (optional)</param>
        /// <param name="jcrcontentProtocolConnectTimeout"> (optional)</param>
        /// <param name="jcrcontentProtocolHTTPConnectionClosed"> (optional)</param>
        /// <param name="jcrcontentProtocolHTTPExpired"> (optional)</param>
        /// <param name="jcrcontentProtocolHTTPHeaders"> (optional)</param>
        /// <param name="jcrcontentProtocolHTTPHeadersTypeHint"> (optional)</param>
        /// <param name="jcrcontentProtocolHTTPMethod"> (optional)</param>
        /// <param name="jcrcontentProtocolHTTPSRelaxed"> (optional)</param>
        /// <param name="jcrcontentProtocolInterface"> (optional)</param>
        /// <param name="jcrcontentProtocolSocketTimeout"> (optional)</param>
        /// <param name="jcrcontentProtocolVersion"> (optional)</param>
        /// <param name="jcrcontentProxyNTLMDomain"> (optional)</param>
        /// <param name="jcrcontentProxyNTLMHost"> (optional)</param>
        /// <param name="jcrcontentProxyHost"> (optional)</param>
        /// <param name="jcrcontentProxyPassword"> (optional)</param>
        /// <param name="jcrcontentProxyPort"> (optional)</param>
        /// <param name="jcrcontentProxyUser"> (optional)</param>
        /// <param name="jcrcontentQueueBatchMaxSize"> (optional)</param>
        /// <param name="jcrcontentQueueBatchMode"> (optional)</param>
        /// <param name="jcrcontentQueueBatchWaitTime"> (optional)</param>
        /// <param name="jcrcontentRetryDelay"> (optional)</param>
        /// <param name="jcrcontentReverseReplication"> (optional)</param>
        /// <param name="jcrcontentSerializationType"> (optional)</param>
        /// <param name="jcrcontentSlingresourceType"> (optional)</param>
        /// <param name="jcrcontentSsl"> (optional)</param>
        /// <param name="jcrcontentTransportNTLMDomain"> (optional)</param>
        /// <param name="jcrcontentTransportNTLMHost"> (optional)</param>
        /// <param name="jcrcontentTransportPassword"> (optional)</param>
        /// <param name="jcrcontentTransportUri"> (optional)</param>
        /// <param name="jcrcontentTransportUser"> (optional)</param>
        /// <param name="jcrcontentTriggerDistribute"> (optional)</param>
        /// <param name="jcrcontentTriggerModified"> (optional)</param>
        /// <param name="jcrcontentTriggerOnOffTime"> (optional)</param>
        /// <param name="jcrcontentTriggerReceive"> (optional)</param>
        /// <param name="jcrcontentTriggerSpecific"> (optional)</param>
        /// <param name="jcrcontentUserId"> (optional)</param>
        /// <param name="jcrprimaryType"> (optional)</param>
        /// <param name="operation"> (optional)</param>
        /// <returns></returns>
        void PostAgent(NancyContext context, string runmode, string name, bool? jcrcontentCqdistribute, string jcrcontentCqdistributeTypeHint, string jcrcontentCqname, string jcrcontentCqtemplate, bool? jcrcontentEnabled, string jcrcontentJcrdescription, string jcrcontentJcrlastModified, string jcrcontentJcrlastModifiedBy, string jcrcontentJcrmixinTypes, string jcrcontentJcrtitle, string jcrcontentLogLevel, bool? jcrcontentNoStatusUpdate, bool? jcrcontentNoVersioning, decimal? jcrcontentProtocolConnectTimeout, bool? jcrcontentProtocolHTTPConnectionClosed, string jcrcontentProtocolHTTPExpired, List<string> jcrcontentProtocolHTTPHeaders, string jcrcontentProtocolHTTPHeadersTypeHint, string jcrcontentProtocolHTTPMethod, bool? jcrcontentProtocolHTTPSRelaxed, string jcrcontentProtocolInterface, decimal? jcrcontentProtocolSocketTimeout, string jcrcontentProtocolVersion, string jcrcontentProxyNTLMDomain, string jcrcontentProxyNTLMHost, string jcrcontentProxyHost, string jcrcontentProxyPassword, decimal? jcrcontentProxyPort, string jcrcontentProxyUser, decimal? jcrcontentQueueBatchMaxSize, string jcrcontentQueueBatchMode, decimal? jcrcontentQueueBatchWaitTime, string jcrcontentRetryDelay, bool? jcrcontentReverseReplication, string jcrcontentSerializationType, string jcrcontentSlingresourceType, string jcrcontentSsl, string jcrcontentTransportNTLMDomain, string jcrcontentTransportNTLMHost, string jcrcontentTransportPassword, string jcrcontentTransportUri, string jcrcontentTransportUser, bool? jcrcontentTriggerDistribute, bool? jcrcontentTriggerModified, bool? jcrcontentTriggerOnOffTime, bool? jcrcontentTriggerReceive, bool? jcrcontentTriggerSpecific, string jcrcontentUserId, string jcrprimaryType, string operation);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="intermediatePath"></param>
        /// <param name="authorizableId"></param>
        /// <param name="operation"> (optional)</param>
        /// <param name="currentPassword"> (optional)</param>
        /// <param name="newPassword"> (optional)</param>
        /// <param name="rePassword"> (optional)</param>
        /// <param name="keyPassword"> (optional)</param>
        /// <param name="keyStorePass"> (optional)</param>
        /// <param name="alias"> (optional)</param>
        /// <param name="newAlias"> (optional)</param>
        /// <param name="removeAlias"> (optional)</param>
        /// <param name="certChain"> (optional)</param>
        /// <param name="pk"> (optional)</param>
        /// <param name="keyStore"> (optional)</param>
        /// <returns>KeystoreInfo</returns>
        KeystoreInfo PostAuthorizableKeystore(NancyContext context, string intermediatePath, string authorizableId, string operation, string currentPassword, string newPassword, string rePassword, string keyPassword, string keyStorePass, string alias, string newAlias, string removeAlias, System.IO.Stream certChain, System.IO.Stream pk, System.IO.Stream keyStore);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="authorizableId"></param>
        /// <param name="intermediatePath"></param>
        /// <param name="createUser"> (optional)</param>
        /// <param name="createGroup"> (optional)</param>
        /// <param name="reppassword"> (optional)</param>
        /// <param name="profileGivenName"> (optional)</param>
        /// <returns>string</returns>
        string PostAuthorizables(NancyContext context, string authorizableId, string intermediatePath, string createUser, string createGroup, string reppassword, string profileGivenName);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="keyStorePassword"> (optional)</param>
        /// <param name="keyStorePasswordTypeHint"> (optional)</param>
        /// <param name="serviceRanking"> (optional)</param>
        /// <param name="serviceRankingTypeHint"> (optional)</param>
        /// <param name="idpHttpRedirect"> (optional)</param>
        /// <param name="idpHttpRedirectTypeHint"> (optional)</param>
        /// <param name="createUser"> (optional)</param>
        /// <param name="createUserTypeHint"> (optional)</param>
        /// <param name="defaultRedirectUrl"> (optional)</param>
        /// <param name="defaultRedirectUrlTypeHint"> (optional)</param>
        /// <param name="userIDAttribute"> (optional)</param>
        /// <param name="userIDAttributeTypeHint"> (optional)</param>
        /// <param name="defaultGroups"> (optional)</param>
        /// <param name="defaultGroupsTypeHint"> (optional)</param>
        /// <param name="idpCertAlias"> (optional)</param>
        /// <param name="idpCertAliasTypeHint"> (optional)</param>
        /// <param name="addGroupMemberships"> (optional)</param>
        /// <param name="addGroupMembershipsTypeHint"> (optional)</param>
        /// <param name="path"> (optional)</param>
        /// <param name="pathTypeHint"> (optional)</param>
        /// <param name="synchronizeAttributes"> (optional)</param>
        /// <param name="synchronizeAttributesTypeHint"> (optional)</param>
        /// <param name="clockTolerance"> (optional)</param>
        /// <param name="clockToleranceTypeHint"> (optional)</param>
        /// <param name="groupMembershipAttribute"> (optional)</param>
        /// <param name="groupMembershipAttributeTypeHint"> (optional)</param>
        /// <param name="idpUrl"> (optional)</param>
        /// <param name="idpUrlTypeHint"> (optional)</param>
        /// <param name="logoutUrl"> (optional)</param>
        /// <param name="logoutUrlTypeHint"> (optional)</param>
        /// <param name="serviceProviderEntityId"> (optional)</param>
        /// <param name="serviceProviderEntityIdTypeHint"> (optional)</param>
        /// <param name="assertionConsumerServiceURL"> (optional)</param>
        /// <param name="assertionConsumerServiceURLTypeHint"> (optional)</param>
        /// <param name="handleLogout"> (optional)</param>
        /// <param name="handleLogoutTypeHint"> (optional)</param>
        /// <param name="spPrivateKeyAlias"> (optional)</param>
        /// <param name="spPrivateKeyAliasTypeHint"> (optional)</param>
        /// <param name="useEncryption"> (optional)</param>
        /// <param name="useEncryptionTypeHint"> (optional)</param>
        /// <param name="nameIdFormat"> (optional)</param>
        /// <param name="nameIdFormatTypeHint"> (optional)</param>
        /// <param name="digestMethod"> (optional)</param>
        /// <param name="digestMethodTypeHint"> (optional)</param>
        /// <param name="signatureMethod"> (optional)</param>
        /// <param name="signatureMethodTypeHint"> (optional)</param>
        /// <param name="userIntermediatePath"> (optional)</param>
        /// <param name="userIntermediatePathTypeHint"> (optional)</param>
        /// <returns></returns>
        void PostConfigAdobeGraniteSamlAuthenticationHandler(NancyContext context, string keyStorePassword, string keyStorePasswordTypeHint, int? serviceRanking, string serviceRankingTypeHint, bool? idpHttpRedirect, string idpHttpRedirectTypeHint, bool? createUser, string createUserTypeHint, string defaultRedirectUrl, string defaultRedirectUrlTypeHint, string userIDAttribute, string userIDAttributeTypeHint, List<string> defaultGroups, string defaultGroupsTypeHint, string idpCertAlias, string idpCertAliasTypeHint, bool? addGroupMemberships, string addGroupMembershipsTypeHint, List<string> path, string pathTypeHint, List<string> synchronizeAttributes, string synchronizeAttributesTypeHint, int? clockTolerance, string clockToleranceTypeHint, string groupMembershipAttribute, string groupMembershipAttributeTypeHint, string idpUrl, string idpUrlTypeHint, string logoutUrl, string logoutUrlTypeHint, string serviceProviderEntityId, string serviceProviderEntityIdTypeHint, string assertionConsumerServiceURL, string assertionConsumerServiceURLTypeHint, bool? handleLogout, string handleLogoutTypeHint, string spPrivateKeyAlias, string spPrivateKeyAliasTypeHint, bool? useEncryption, string useEncryptionTypeHint, string nameIdFormat, string nameIdFormatTypeHint, string digestMethod, string digestMethodTypeHint, string signatureMethod, string signatureMethodTypeHint, string userIntermediatePath, string userIntermediatePathTypeHint);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="orgApacheFelixHttpsNio"> (optional)</param>
        /// <param name="orgApacheFelixHttpsNioTypeHint"> (optional)</param>
        /// <param name="orgApacheFelixHttpsKeystore"> (optional)</param>
        /// <param name="orgApacheFelixHttpsKeystoreTypeHint"> (optional)</param>
        /// <param name="orgApacheFelixHttpsKeystorePassword"> (optional)</param>
        /// <param name="orgApacheFelixHttpsKeystorePasswordTypeHint"> (optional)</param>
        /// <param name="orgApacheFelixHttpsKeystoreKey"> (optional)</param>
        /// <param name="orgApacheFelixHttpsKeystoreKeyTypeHint"> (optional)</param>
        /// <param name="orgApacheFelixHttpsKeystoreKeyPassword"> (optional)</param>
        /// <param name="orgApacheFelixHttpsKeystoreKeyPasswordTypeHint"> (optional)</param>
        /// <param name="orgApacheFelixHttpsTruststore"> (optional)</param>
        /// <param name="orgApacheFelixHttpsTruststoreTypeHint"> (optional)</param>
        /// <param name="orgApacheFelixHttpsTruststorePassword"> (optional)</param>
        /// <param name="orgApacheFelixHttpsTruststorePasswordTypeHint"> (optional)</param>
        /// <param name="orgApacheFelixHttpsClientcertificate"> (optional)</param>
        /// <param name="orgApacheFelixHttpsClientcertificateTypeHint"> (optional)</param>
        /// <param name="orgApacheFelixHttpsEnable"> (optional)</param>
        /// <param name="orgApacheFelixHttpsEnableTypeHint"> (optional)</param>
        /// <param name="orgOsgiServiceHttpPortSecure"> (optional)</param>
        /// <param name="orgOsgiServiceHttpPortSecureTypeHint"> (optional)</param>
        /// <returns></returns>
        void PostConfigApacheFelixJettyBasedHttpService(NancyContext context, bool? orgApacheFelixHttpsNio, string orgApacheFelixHttpsNioTypeHint, string orgApacheFelixHttpsKeystore, string orgApacheFelixHttpsKeystoreTypeHint, string orgApacheFelixHttpsKeystorePassword, string orgApacheFelixHttpsKeystorePasswordTypeHint, string orgApacheFelixHttpsKeystoreKey, string orgApacheFelixHttpsKeystoreKeyTypeHint, string orgApacheFelixHttpsKeystoreKeyPassword, string orgApacheFelixHttpsKeystoreKeyPasswordTypeHint, string orgApacheFelixHttpsTruststore, string orgApacheFelixHttpsTruststoreTypeHint, string orgApacheFelixHttpsTruststorePassword, string orgApacheFelixHttpsTruststorePasswordTypeHint, string orgApacheFelixHttpsClientcertificate, string orgApacheFelixHttpsClientcertificateTypeHint, bool? orgApacheFelixHttpsEnable, string orgApacheFelixHttpsEnableTypeHint, string orgOsgiServiceHttpPortSecure, string orgOsgiServiceHttpPortSecureTypeHint);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="proxyHost"> (optional)</param>
        /// <param name="proxyHostTypeHint"> (optional)</param>
        /// <param name="proxyPort"> (optional)</param>
        /// <param name="proxyPortTypeHint"> (optional)</param>
        /// <param name="proxyExceptions"> (optional)</param>
        /// <param name="proxyExceptionsTypeHint"> (optional)</param>
        /// <param name="proxyEnabled"> (optional)</param>
        /// <param name="proxyEnabledTypeHint"> (optional)</param>
        /// <param name="proxyUser"> (optional)</param>
        /// <param name="proxyUserTypeHint"> (optional)</param>
        /// <param name="proxyPassword"> (optional)</param>
        /// <param name="proxyPasswordTypeHint"> (optional)</param>
        /// <returns></returns>
        void PostConfigApacheHttpComponentsProxyConfiguration(NancyContext context, string proxyHost, string proxyHostTypeHint, int? proxyPort, string proxyPortTypeHint, List<string> proxyExceptions, string proxyExceptionsTypeHint, bool? proxyEnabled, string proxyEnabledTypeHint, string proxyUser, string proxyUserTypeHint, string proxyPassword, string proxyPasswordTypeHint);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="alias"> (optional)</param>
        /// <param name="aliasTypeHint"> (optional)</param>
        /// <param name="davCreateAbsoluteUri"> (optional)</param>
        /// <param name="davCreateAbsoluteUriTypeHint"> (optional)</param>
        /// <returns></returns>
        void PostConfigApacheSlingDavExServlet(NancyContext context, string alias, string aliasTypeHint, bool? davCreateAbsoluteUri, string davCreateAbsoluteUriTypeHint);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="jsonMaximumresults"> (optional)</param>
        /// <param name="jsonMaximumresultsTypeHint"> (optional)</param>
        /// <param name="enableHtml"> (optional)</param>
        /// <param name="enableHtmlTypeHint"> (optional)</param>
        /// <param name="enableTxt"> (optional)</param>
        /// <param name="enableTxtTypeHint"> (optional)</param>
        /// <param name="enableXml"> (optional)</param>
        /// <param name="enableXmlTypeHint"> (optional)</param>
        /// <returns></returns>
        void PostConfigApacheSlingGetServlet(NancyContext context, string jsonMaximumresults, string jsonMaximumresultsTypeHint, bool? enableHtml, string enableHtmlTypeHint, bool? enableTxt, string enableTxtTypeHint, bool? enableXml, string enableXmlTypeHint);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="allowEmpty"> (optional)</param>
        /// <param name="allowEmptyTypeHint"> (optional)</param>
        /// <param name="allowHosts"> (optional)</param>
        /// <param name="allowHostsTypeHint"> (optional)</param>
        /// <param name="allowHostsRegexp"> (optional)</param>
        /// <param name="allowHostsRegexpTypeHint"> (optional)</param>
        /// <param name="filterMethods"> (optional)</param>
        /// <param name="filterMethodsTypeHint"> (optional)</param>
        /// <returns></returns>
        void PostConfigApacheSlingReferrerFilter(NancyContext context, bool? allowEmpty, string allowEmptyTypeHint, string allowHosts, string allowHostsTypeHint, string allowHostsRegexp, string allowHostsRegexpTypeHint, string filterMethods, string filterMethodsTypeHint);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="configNodeName"></param>
        /// <returns></returns>
        void PostConfigProperty(NancyContext context, string configNodeName);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="path"></param>
        /// <param name="name"></param>
        /// <param name="operation"> (optional)</param>
        /// <param name="deleteAuthorizable"> (optional)</param>
        /// <param name="file"> (optional)</param>
        /// <returns></returns>
        void PostNode(NancyContext context, string path, string name, string operation, string deleteAuthorizable, System.IO.Stream file);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="path"></param>
        /// <param name="name"></param>
        /// <param name="addMembers"> (optional)</param>
        /// <returns></returns>
        void PostNodeRw(NancyContext context, string path, string name, string addMembers);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="path"></param>
        /// <param name="jcrprimaryType"></param>
        /// <param name="name"></param>
        /// <returns></returns>
        void PostPath(NancyContext context, string path, string jcrprimaryType, string name);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="path"></param>
        /// <param name="pLimit"></param>
        /// <param name="_1property"></param>
        /// <param name="_1propertyValue"></param>
        /// <returns>string</returns>
        string PostQuery(NancyContext context, string path, decimal? pLimit, string _1property, string _1propertyValue);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="ignoredeactivated"></param>
        /// <param name="onlymodified"></param>
        /// <param name="path"></param>
        /// <returns></returns>
        void PostTreeActivation(NancyContext context, bool? ignoredeactivated, bool? onlymodified, string path);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="operation"> (optional)</param>
        /// <param name="newPassword"> (optional)</param>
        /// <param name="rePassword"> (optional)</param>
        /// <param name="keyStoreType"> (optional)</param>
        /// <param name="removeAlias"> (optional)</param>
        /// <param name="certificate"> (optional)</param>
        /// <returns>string</returns>
        string PostTruststore(NancyContext context, string operation, string newPassword, string rePassword, string keyStoreType, string removeAlias, System.IO.Stream certificate);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="truststoreP12"> (optional)</param>
        /// <returns>string</returns>
        string PostTruststorePKCS12(NancyContext context, System.IO.Stream truststoreP12);
    }

    /// <summary>
    /// Abstraction of SlingService.
    /// </summary>
    public abstract class AbstractSlingService: SlingService
    {
        public virtual void DeleteAgent(NancyContext context, string runmode, string name)
        {
            DeleteAgent(runmode, name);
        }

        public virtual void DeleteNode(NancyContext context, string path, string name)
        {
            DeleteNode(path, name);
        }

        public virtual void GetAgent(NancyContext context, string runmode, string name)
        {
            GetAgent(runmode, name);
        }

        public virtual string GetAgents(NancyContext context, string runmode)
        {
            return GetAgents(runmode);
        }

        public virtual KeystoreInfo GetAuthorizableKeystore(NancyContext context, string intermediatePath, string authorizableId)
        {
            return GetAuthorizableKeystore(intermediatePath, authorizableId);
        }

        public virtual System.IO.Stream GetKeystore(NancyContext context, string intermediatePath, string authorizableId)
        {
            return GetKeystore(intermediatePath, authorizableId);
        }

        public virtual void GetNode(NancyContext context, string path, string name)
        {
            GetNode(path, name);
        }

        public virtual System.IO.Stream GetPackage(NancyContext context, string group, string name, string version)
        {
            return GetPackage(group, name, version);
        }

        public virtual string GetPackageFilter(NancyContext context, string group, string name, string version)
        {
            return GetPackageFilter(group, name, version);
        }

        public virtual string GetQuery(NancyContext context, string path, decimal? pLimit, string _1property, string _1propertyValue)
        {
            return GetQuery(path, pLimit, _1property, _1propertyValue);
        }

        public virtual System.IO.Stream GetTruststore(NancyContext context)
        {
            return GetTruststore();
        }

        public virtual TruststoreInfo GetTruststoreInfo(NancyContext context)
        {
            return GetTruststoreInfo();
        }

        public virtual void PostAgent(NancyContext context, string runmode, string name, bool? jcrcontentCqdistribute, string jcrcontentCqdistributeTypeHint, string jcrcontentCqname, string jcrcontentCqtemplate, bool? jcrcontentEnabled, string jcrcontentJcrdescription, string jcrcontentJcrlastModified, string jcrcontentJcrlastModifiedBy, string jcrcontentJcrmixinTypes, string jcrcontentJcrtitle, string jcrcontentLogLevel, bool? jcrcontentNoStatusUpdate, bool? jcrcontentNoVersioning, decimal? jcrcontentProtocolConnectTimeout, bool? jcrcontentProtocolHTTPConnectionClosed, string jcrcontentProtocolHTTPExpired, List<string> jcrcontentProtocolHTTPHeaders, string jcrcontentProtocolHTTPHeadersTypeHint, string jcrcontentProtocolHTTPMethod, bool? jcrcontentProtocolHTTPSRelaxed, string jcrcontentProtocolInterface, decimal? jcrcontentProtocolSocketTimeout, string jcrcontentProtocolVersion, string jcrcontentProxyNTLMDomain, string jcrcontentProxyNTLMHost, string jcrcontentProxyHost, string jcrcontentProxyPassword, decimal? jcrcontentProxyPort, string jcrcontentProxyUser, decimal? jcrcontentQueueBatchMaxSize, string jcrcontentQueueBatchMode, decimal? jcrcontentQueueBatchWaitTime, string jcrcontentRetryDelay, bool? jcrcontentReverseReplication, string jcrcontentSerializationType, string jcrcontentSlingresourceType, string jcrcontentSsl, string jcrcontentTransportNTLMDomain, string jcrcontentTransportNTLMHost, string jcrcontentTransportPassword, string jcrcontentTransportUri, string jcrcontentTransportUser, bool? jcrcontentTriggerDistribute, bool? jcrcontentTriggerModified, bool? jcrcontentTriggerOnOffTime, bool? jcrcontentTriggerReceive, bool? jcrcontentTriggerSpecific, string jcrcontentUserId, string jcrprimaryType, string operation)
        {
            PostAgent(runmode, name, jcrcontentCqdistribute, jcrcontentCqdistributeTypeHint, jcrcontentCqname, jcrcontentCqtemplate, jcrcontentEnabled, jcrcontentJcrdescription, jcrcontentJcrlastModified, jcrcontentJcrlastModifiedBy, jcrcontentJcrmixinTypes, jcrcontentJcrtitle, jcrcontentLogLevel, jcrcontentNoStatusUpdate, jcrcontentNoVersioning, jcrcontentProtocolConnectTimeout, jcrcontentProtocolHTTPConnectionClosed, jcrcontentProtocolHTTPExpired, jcrcontentProtocolHTTPHeaders, jcrcontentProtocolHTTPHeadersTypeHint, jcrcontentProtocolHTTPMethod, jcrcontentProtocolHTTPSRelaxed, jcrcontentProtocolInterface, jcrcontentProtocolSocketTimeout, jcrcontentProtocolVersion, jcrcontentProxyNTLMDomain, jcrcontentProxyNTLMHost, jcrcontentProxyHost, jcrcontentProxyPassword, jcrcontentProxyPort, jcrcontentProxyUser, jcrcontentQueueBatchMaxSize, jcrcontentQueueBatchMode, jcrcontentQueueBatchWaitTime, jcrcontentRetryDelay, jcrcontentReverseReplication, jcrcontentSerializationType, jcrcontentSlingresourceType, jcrcontentSsl, jcrcontentTransportNTLMDomain, jcrcontentTransportNTLMHost, jcrcontentTransportPassword, jcrcontentTransportUri, jcrcontentTransportUser, jcrcontentTriggerDistribute, jcrcontentTriggerModified, jcrcontentTriggerOnOffTime, jcrcontentTriggerReceive, jcrcontentTriggerSpecific, jcrcontentUserId, jcrprimaryType, operation);
        }

        public virtual KeystoreInfo PostAuthorizableKeystore(NancyContext context, string intermediatePath, string authorizableId, string operation, string currentPassword, string newPassword, string rePassword, string keyPassword, string keyStorePass, string alias, string newAlias, string removeAlias, System.IO.Stream certChain, System.IO.Stream pk, System.IO.Stream keyStore)
        {
            return PostAuthorizableKeystore(intermediatePath, authorizableId, operation, currentPassword, newPassword, rePassword, keyPassword, keyStorePass, alias, newAlias, removeAlias, certChain, pk, keyStore);
        }

        public virtual string PostAuthorizables(NancyContext context, string authorizableId, string intermediatePath, string createUser, string createGroup, string reppassword, string profileGivenName)
        {
            return PostAuthorizables(authorizableId, intermediatePath, createUser, createGroup, reppassword, profileGivenName);
        }

        public virtual void PostConfigAdobeGraniteSamlAuthenticationHandler(NancyContext context, string keyStorePassword, string keyStorePasswordTypeHint, int? serviceRanking, string serviceRankingTypeHint, bool? idpHttpRedirect, string idpHttpRedirectTypeHint, bool? createUser, string createUserTypeHint, string defaultRedirectUrl, string defaultRedirectUrlTypeHint, string userIDAttribute, string userIDAttributeTypeHint, List<string> defaultGroups, string defaultGroupsTypeHint, string idpCertAlias, string idpCertAliasTypeHint, bool? addGroupMemberships, string addGroupMembershipsTypeHint, List<string> path, string pathTypeHint, List<string> synchronizeAttributes, string synchronizeAttributesTypeHint, int? clockTolerance, string clockToleranceTypeHint, string groupMembershipAttribute, string groupMembershipAttributeTypeHint, string idpUrl, string idpUrlTypeHint, string logoutUrl, string logoutUrlTypeHint, string serviceProviderEntityId, string serviceProviderEntityIdTypeHint, string assertionConsumerServiceURL, string assertionConsumerServiceURLTypeHint, bool? handleLogout, string handleLogoutTypeHint, string spPrivateKeyAlias, string spPrivateKeyAliasTypeHint, bool? useEncryption, string useEncryptionTypeHint, string nameIdFormat, string nameIdFormatTypeHint, string digestMethod, string digestMethodTypeHint, string signatureMethod, string signatureMethodTypeHint, string userIntermediatePath, string userIntermediatePathTypeHint)
        {
            PostConfigAdobeGraniteSamlAuthenticationHandler(keyStorePassword, keyStorePasswordTypeHint, serviceRanking, serviceRankingTypeHint, idpHttpRedirect, idpHttpRedirectTypeHint, createUser, createUserTypeHint, defaultRedirectUrl, defaultRedirectUrlTypeHint, userIDAttribute, userIDAttributeTypeHint, defaultGroups, defaultGroupsTypeHint, idpCertAlias, idpCertAliasTypeHint, addGroupMemberships, addGroupMembershipsTypeHint, path, pathTypeHint, synchronizeAttributes, synchronizeAttributesTypeHint, clockTolerance, clockToleranceTypeHint, groupMembershipAttribute, groupMembershipAttributeTypeHint, idpUrl, idpUrlTypeHint, logoutUrl, logoutUrlTypeHint, serviceProviderEntityId, serviceProviderEntityIdTypeHint, assertionConsumerServiceURL, assertionConsumerServiceURLTypeHint, handleLogout, handleLogoutTypeHint, spPrivateKeyAlias, spPrivateKeyAliasTypeHint, useEncryption, useEncryptionTypeHint, nameIdFormat, nameIdFormatTypeHint, digestMethod, digestMethodTypeHint, signatureMethod, signatureMethodTypeHint, userIntermediatePath, userIntermediatePathTypeHint);
        }

        public virtual void PostConfigApacheFelixJettyBasedHttpService(NancyContext context, bool? orgApacheFelixHttpsNio, string orgApacheFelixHttpsNioTypeHint, string orgApacheFelixHttpsKeystore, string orgApacheFelixHttpsKeystoreTypeHint, string orgApacheFelixHttpsKeystorePassword, string orgApacheFelixHttpsKeystorePasswordTypeHint, string orgApacheFelixHttpsKeystoreKey, string orgApacheFelixHttpsKeystoreKeyTypeHint, string orgApacheFelixHttpsKeystoreKeyPassword, string orgApacheFelixHttpsKeystoreKeyPasswordTypeHint, string orgApacheFelixHttpsTruststore, string orgApacheFelixHttpsTruststoreTypeHint, string orgApacheFelixHttpsTruststorePassword, string orgApacheFelixHttpsTruststorePasswordTypeHint, string orgApacheFelixHttpsClientcertificate, string orgApacheFelixHttpsClientcertificateTypeHint, bool? orgApacheFelixHttpsEnable, string orgApacheFelixHttpsEnableTypeHint, string orgOsgiServiceHttpPortSecure, string orgOsgiServiceHttpPortSecureTypeHint)
        {
            PostConfigApacheFelixJettyBasedHttpService(orgApacheFelixHttpsNio, orgApacheFelixHttpsNioTypeHint, orgApacheFelixHttpsKeystore, orgApacheFelixHttpsKeystoreTypeHint, orgApacheFelixHttpsKeystorePassword, orgApacheFelixHttpsKeystorePasswordTypeHint, orgApacheFelixHttpsKeystoreKey, orgApacheFelixHttpsKeystoreKeyTypeHint, orgApacheFelixHttpsKeystoreKeyPassword, orgApacheFelixHttpsKeystoreKeyPasswordTypeHint, orgApacheFelixHttpsTruststore, orgApacheFelixHttpsTruststoreTypeHint, orgApacheFelixHttpsTruststorePassword, orgApacheFelixHttpsTruststorePasswordTypeHint, orgApacheFelixHttpsClientcertificate, orgApacheFelixHttpsClientcertificateTypeHint, orgApacheFelixHttpsEnable, orgApacheFelixHttpsEnableTypeHint, orgOsgiServiceHttpPortSecure, orgOsgiServiceHttpPortSecureTypeHint);
        }

        public virtual void PostConfigApacheHttpComponentsProxyConfiguration(NancyContext context, string proxyHost, string proxyHostTypeHint, int? proxyPort, string proxyPortTypeHint, List<string> proxyExceptions, string proxyExceptionsTypeHint, bool? proxyEnabled, string proxyEnabledTypeHint, string proxyUser, string proxyUserTypeHint, string proxyPassword, string proxyPasswordTypeHint)
        {
            PostConfigApacheHttpComponentsProxyConfiguration(proxyHost, proxyHostTypeHint, proxyPort, proxyPortTypeHint, proxyExceptions, proxyExceptionsTypeHint, proxyEnabled, proxyEnabledTypeHint, proxyUser, proxyUserTypeHint, proxyPassword, proxyPasswordTypeHint);
        }

        public virtual void PostConfigApacheSlingDavExServlet(NancyContext context, string alias, string aliasTypeHint, bool? davCreateAbsoluteUri, string davCreateAbsoluteUriTypeHint)
        {
            PostConfigApacheSlingDavExServlet(alias, aliasTypeHint, davCreateAbsoluteUri, davCreateAbsoluteUriTypeHint);
        }

        public virtual void PostConfigApacheSlingGetServlet(NancyContext context, string jsonMaximumresults, string jsonMaximumresultsTypeHint, bool? enableHtml, string enableHtmlTypeHint, bool? enableTxt, string enableTxtTypeHint, bool? enableXml, string enableXmlTypeHint)
        {
            PostConfigApacheSlingGetServlet(jsonMaximumresults, jsonMaximumresultsTypeHint, enableHtml, enableHtmlTypeHint, enableTxt, enableTxtTypeHint, enableXml, enableXmlTypeHint);
        }

        public virtual void PostConfigApacheSlingReferrerFilter(NancyContext context, bool? allowEmpty, string allowEmptyTypeHint, string allowHosts, string allowHostsTypeHint, string allowHostsRegexp, string allowHostsRegexpTypeHint, string filterMethods, string filterMethodsTypeHint)
        {
            PostConfigApacheSlingReferrerFilter(allowEmpty, allowEmptyTypeHint, allowHosts, allowHostsTypeHint, allowHostsRegexp, allowHostsRegexpTypeHint, filterMethods, filterMethodsTypeHint);
        }

        public virtual void PostConfigProperty(NancyContext context, string configNodeName)
        {
            PostConfigProperty(configNodeName);
        }

        public virtual void PostNode(NancyContext context, string path, string name, string operation, string deleteAuthorizable, System.IO.Stream file)
        {
            PostNode(path, name, operation, deleteAuthorizable, file);
        }

        public virtual void PostNodeRw(NancyContext context, string path, string name, string addMembers)
        {
            PostNodeRw(path, name, addMembers);
        }

        public virtual void PostPath(NancyContext context, string path, string jcrprimaryType, string name)
        {
            PostPath(path, jcrprimaryType, name);
        }

        public virtual string PostQuery(NancyContext context, string path, decimal? pLimit, string _1property, string _1propertyValue)
        {
            return PostQuery(path, pLimit, _1property, _1propertyValue);
        }

        public virtual void PostTreeActivation(NancyContext context, bool? ignoredeactivated, bool? onlymodified, string path)
        {
            PostTreeActivation(ignoredeactivated, onlymodified, path);
        }

        public virtual string PostTruststore(NancyContext context, string operation, string newPassword, string rePassword, string keyStoreType, string removeAlias, System.IO.Stream certificate)
        {
            return PostTruststore(operation, newPassword, rePassword, keyStoreType, removeAlias, certificate);
        }

        public virtual string PostTruststorePKCS12(NancyContext context, System.IO.Stream truststoreP12)
        {
            return PostTruststorePKCS12(truststoreP12);
        }

        protected abstract void DeleteAgent(string runmode, string name);

        protected abstract void DeleteNode(string path, string name);

        protected abstract void GetAgent(string runmode, string name);

        protected abstract string GetAgents(string runmode);

        protected abstract KeystoreInfo GetAuthorizableKeystore(string intermediatePath, string authorizableId);

        protected abstract System.IO.Stream GetKeystore(string intermediatePath, string authorizableId);

        protected abstract void GetNode(string path, string name);

        protected abstract System.IO.Stream GetPackage(string group, string name, string version);

        protected abstract string GetPackageFilter(string group, string name, string version);

        protected abstract string GetQuery(string path, decimal? pLimit, string _1property, string _1propertyValue);

        protected abstract System.IO.Stream GetTruststore();

        protected abstract TruststoreInfo GetTruststoreInfo();

        protected abstract void PostAgent(string runmode, string name, bool? jcrcontentCqdistribute, string jcrcontentCqdistributeTypeHint, string jcrcontentCqname, string jcrcontentCqtemplate, bool? jcrcontentEnabled, string jcrcontentJcrdescription, string jcrcontentJcrlastModified, string jcrcontentJcrlastModifiedBy, string jcrcontentJcrmixinTypes, string jcrcontentJcrtitle, string jcrcontentLogLevel, bool? jcrcontentNoStatusUpdate, bool? jcrcontentNoVersioning, decimal? jcrcontentProtocolConnectTimeout, bool? jcrcontentProtocolHTTPConnectionClosed, string jcrcontentProtocolHTTPExpired, List<string> jcrcontentProtocolHTTPHeaders, string jcrcontentProtocolHTTPHeadersTypeHint, string jcrcontentProtocolHTTPMethod, bool? jcrcontentProtocolHTTPSRelaxed, string jcrcontentProtocolInterface, decimal? jcrcontentProtocolSocketTimeout, string jcrcontentProtocolVersion, string jcrcontentProxyNTLMDomain, string jcrcontentProxyNTLMHost, string jcrcontentProxyHost, string jcrcontentProxyPassword, decimal? jcrcontentProxyPort, string jcrcontentProxyUser, decimal? jcrcontentQueueBatchMaxSize, string jcrcontentQueueBatchMode, decimal? jcrcontentQueueBatchWaitTime, string jcrcontentRetryDelay, bool? jcrcontentReverseReplication, string jcrcontentSerializationType, string jcrcontentSlingresourceType, string jcrcontentSsl, string jcrcontentTransportNTLMDomain, string jcrcontentTransportNTLMHost, string jcrcontentTransportPassword, string jcrcontentTransportUri, string jcrcontentTransportUser, bool? jcrcontentTriggerDistribute, bool? jcrcontentTriggerModified, bool? jcrcontentTriggerOnOffTime, bool? jcrcontentTriggerReceive, bool? jcrcontentTriggerSpecific, string jcrcontentUserId, string jcrprimaryType, string operation);

        protected abstract KeystoreInfo PostAuthorizableKeystore(string intermediatePath, string authorizableId, string operation, string currentPassword, string newPassword, string rePassword, string keyPassword, string keyStorePass, string alias, string newAlias, string removeAlias, System.IO.Stream certChain, System.IO.Stream pk, System.IO.Stream keyStore);

        protected abstract string PostAuthorizables(string authorizableId, string intermediatePath, string createUser, string createGroup, string reppassword, string profileGivenName);

        protected abstract void PostConfigAdobeGraniteSamlAuthenticationHandler(string keyStorePassword, string keyStorePasswordTypeHint, int? serviceRanking, string serviceRankingTypeHint, bool? idpHttpRedirect, string idpHttpRedirectTypeHint, bool? createUser, string createUserTypeHint, string defaultRedirectUrl, string defaultRedirectUrlTypeHint, string userIDAttribute, string userIDAttributeTypeHint, List<string> defaultGroups, string defaultGroupsTypeHint, string idpCertAlias, string idpCertAliasTypeHint, bool? addGroupMemberships, string addGroupMembershipsTypeHint, List<string> path, string pathTypeHint, List<string> synchronizeAttributes, string synchronizeAttributesTypeHint, int? clockTolerance, string clockToleranceTypeHint, string groupMembershipAttribute, string groupMembershipAttributeTypeHint, string idpUrl, string idpUrlTypeHint, string logoutUrl, string logoutUrlTypeHint, string serviceProviderEntityId, string serviceProviderEntityIdTypeHint, string assertionConsumerServiceURL, string assertionConsumerServiceURLTypeHint, bool? handleLogout, string handleLogoutTypeHint, string spPrivateKeyAlias, string spPrivateKeyAliasTypeHint, bool? useEncryption, string useEncryptionTypeHint, string nameIdFormat, string nameIdFormatTypeHint, string digestMethod, string digestMethodTypeHint, string signatureMethod, string signatureMethodTypeHint, string userIntermediatePath, string userIntermediatePathTypeHint);

        protected abstract void PostConfigApacheFelixJettyBasedHttpService(bool? orgApacheFelixHttpsNio, string orgApacheFelixHttpsNioTypeHint, string orgApacheFelixHttpsKeystore, string orgApacheFelixHttpsKeystoreTypeHint, string orgApacheFelixHttpsKeystorePassword, string orgApacheFelixHttpsKeystorePasswordTypeHint, string orgApacheFelixHttpsKeystoreKey, string orgApacheFelixHttpsKeystoreKeyTypeHint, string orgApacheFelixHttpsKeystoreKeyPassword, string orgApacheFelixHttpsKeystoreKeyPasswordTypeHint, string orgApacheFelixHttpsTruststore, string orgApacheFelixHttpsTruststoreTypeHint, string orgApacheFelixHttpsTruststorePassword, string orgApacheFelixHttpsTruststorePasswordTypeHint, string orgApacheFelixHttpsClientcertificate, string orgApacheFelixHttpsClientcertificateTypeHint, bool? orgApacheFelixHttpsEnable, string orgApacheFelixHttpsEnableTypeHint, string orgOsgiServiceHttpPortSecure, string orgOsgiServiceHttpPortSecureTypeHint);

        protected abstract void PostConfigApacheHttpComponentsProxyConfiguration(string proxyHost, string proxyHostTypeHint, int? proxyPort, string proxyPortTypeHint, List<string> proxyExceptions, string proxyExceptionsTypeHint, bool? proxyEnabled, string proxyEnabledTypeHint, string proxyUser, string proxyUserTypeHint, string proxyPassword, string proxyPasswordTypeHint);

        protected abstract void PostConfigApacheSlingDavExServlet(string alias, string aliasTypeHint, bool? davCreateAbsoluteUri, string davCreateAbsoluteUriTypeHint);

        protected abstract void PostConfigApacheSlingGetServlet(string jsonMaximumresults, string jsonMaximumresultsTypeHint, bool? enableHtml, string enableHtmlTypeHint, bool? enableTxt, string enableTxtTypeHint, bool? enableXml, string enableXmlTypeHint);

        protected abstract void PostConfigApacheSlingReferrerFilter(bool? allowEmpty, string allowEmptyTypeHint, string allowHosts, string allowHostsTypeHint, string allowHostsRegexp, string allowHostsRegexpTypeHint, string filterMethods, string filterMethodsTypeHint);

        protected abstract void PostConfigProperty(string configNodeName);

        protected abstract void PostNode(string path, string name, string operation, string deleteAuthorizable, System.IO.Stream file);

        protected abstract void PostNodeRw(string path, string name, string addMembers);

        protected abstract void PostPath(string path, string jcrprimaryType, string name);

        protected abstract string PostQuery(string path, decimal? pLimit, string _1property, string _1propertyValue);

        protected abstract void PostTreeActivation(bool? ignoredeactivated, bool? onlymodified, string path);

        protected abstract string PostTruststore(string operation, string newPassword, string rePassword, string keyStoreType, string removeAlias, System.IO.Stream certificate);

        protected abstract string PostTruststorePKCS12(System.IO.Stream truststoreP12);
    }

}
