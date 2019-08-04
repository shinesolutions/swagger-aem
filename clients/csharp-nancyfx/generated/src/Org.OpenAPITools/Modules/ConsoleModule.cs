using System;
using Nancy;
using Nancy.ModelBinding;
using System.Collections.Generic;
using Sharpility.Base;
using Org.OpenAPITools..Models;
using Org.OpenAPITools..Utils;
using NodaTime;

namespace Org.OpenAPITools..Modules
{ 

    /// <summary>
    /// Module processing requests of Console domain.
    /// </summary>
    public sealed class ConsoleModule : NancyModule
    {
        /// <summary>
        /// Sets up HTTP methods mappings.
        /// </summary>
        /// <param name="service">Service handling requests</param>
        public ConsoleModule(ConsoleService service) : base("/")
        { 
            Get["/system/console/status-productinfo.json"] = parameters =>
            {
                
                return service.GetAemProductInfo(Context).ToArray();
            };

            Get["/system/console/configMgr"] = parameters =>
            {
                
                return service.GetConfigMgr(Context);
            };

            Post["/system/console/bundles/{name}"] = parameters =>
            {
                var name = Parameters.ValueOf<string>(parameters, Context.Request, "name", ParameterType.Path);
                var action = Parameters.ValueOf<string>(parameters, Context.Request, "action", ParameterType.Query);
                Preconditions.IsNotNull(name, "Required parameter: 'name' is missing at 'PostBundle'");
                
                Preconditions.IsNotNull(action, "Required parameter: 'action' is missing at 'PostBundle'");
                
                service.PostBundle(Context, name, action);
                return new Response { ContentType = ""};
            };

            Post["/system/console/jmx/com.adobe.granite:type=Repository/op/{action}"] = parameters =>
            {
                var action = Parameters.ValueOf<string>(parameters, Context.Request, "action", ParameterType.Path);
                Preconditions.IsNotNull(action, "Required parameter: 'action' is missing at 'PostJmxRepository'");
                
                service.PostJmxRepository(Context, action);
                return new Response { ContentType = ""};
            };

            Post["/system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler"] = parameters =>
            {
                var post = Parameters.ValueOf<bool?>(parameters, Context.Request, "post", ParameterType.Query);
                var apply = Parameters.ValueOf<bool?>(parameters, Context.Request, "apply", ParameterType.Query);
                var delete = Parameters.ValueOf<bool?>(parameters, Context.Request, "delete", ParameterType.Query);
                var action = Parameters.ValueOf<string>(parameters, Context.Request, "action", ParameterType.Query);
                var location = Parameters.ValueOf<string>(parameters, Context.Request, "location", ParameterType.Query);
                var path = Parameters.ValueOf<List<string>>(parameters, Context.Request, "path", ParameterType.Query);
                var serviceRanking = Parameters.ValueOf<int?>(parameters, Context.Request, "serviceRanking", ParameterType.Query);
                var idpUrl = Parameters.ValueOf<string>(parameters, Context.Request, "idpUrl", ParameterType.Query);
                var idpCertAlias = Parameters.ValueOf<string>(parameters, Context.Request, "idpCertAlias", ParameterType.Query);
                var idpHttpRedirect = Parameters.ValueOf<bool?>(parameters, Context.Request, "idpHttpRedirect", ParameterType.Query);
                var serviceProviderEntityId = Parameters.ValueOf<string>(parameters, Context.Request, "serviceProviderEntityId", ParameterType.Query);
                var assertionConsumerServiceURL = Parameters.ValueOf<string>(parameters, Context.Request, "assertionConsumerServiceURL", ParameterType.Query);
                var spPrivateKeyAlias = Parameters.ValueOf<string>(parameters, Context.Request, "spPrivateKeyAlias", ParameterType.Query);
                var keyStorePassword = Parameters.ValueOf<string>(parameters, Context.Request, "keyStorePassword", ParameterType.Query);
                var defaultRedirectUrl = Parameters.ValueOf<string>(parameters, Context.Request, "defaultRedirectUrl", ParameterType.Query);
                var userIDAttribute = Parameters.ValueOf<string>(parameters, Context.Request, "userIDAttribute", ParameterType.Query);
                var useEncryption = Parameters.ValueOf<bool?>(parameters, Context.Request, "useEncryption", ParameterType.Query);
                var createUser = Parameters.ValueOf<bool?>(parameters, Context.Request, "createUser", ParameterType.Query);
                var addGroupMemberships = Parameters.ValueOf<bool?>(parameters, Context.Request, "addGroupMemberships", ParameterType.Query);
                var groupMembershipAttribute = Parameters.ValueOf<string>(parameters, Context.Request, "groupMembershipAttribute", ParameterType.Query);
                var defaultGroups = Parameters.ValueOf<List<string>>(parameters, Context.Request, "defaultGroups", ParameterType.Query);
                var nameIdFormat = Parameters.ValueOf<string>(parameters, Context.Request, "nameIdFormat", ParameterType.Query);
                var synchronizeAttributes = Parameters.ValueOf<List<string>>(parameters, Context.Request, "synchronizeAttributes", ParameterType.Query);
                var handleLogout = Parameters.ValueOf<bool?>(parameters, Context.Request, "handleLogout", ParameterType.Query);
                var logoutUrl = Parameters.ValueOf<string>(parameters, Context.Request, "logoutUrl", ParameterType.Query);
                var clockTolerance = Parameters.ValueOf<int?>(parameters, Context.Request, "clockTolerance", ParameterType.Query);
                var digestMethod = Parameters.ValueOf<string>(parameters, Context.Request, "digestMethod", ParameterType.Query);
                var signatureMethod = Parameters.ValueOf<string>(parameters, Context.Request, "signatureMethod", ParameterType.Query);
                var userIntermediatePath = Parameters.ValueOf<string>(parameters, Context.Request, "userIntermediatePath", ParameterType.Query);
                var propertylist = Parameters.ValueOf<List<string>>(parameters, Context.Request, "propertylist", ParameterType.Query);
                return service.PostSamlConfiguration(Context, post, apply, delete, action, location, path, serviceRanking, idpUrl, idpCertAlias, idpHttpRedirect, serviceProviderEntityId, assertionConsumerServiceURL, spPrivateKeyAlias, keyStorePassword, defaultRedirectUrl, userIDAttribute, useEncryption, createUser, addGroupMemberships, groupMembershipAttribute, defaultGroups, nameIdFormat, synchronizeAttributes, handleLogout, logoutUrl, clockTolerance, digestMethod, signatureMethod, userIntermediatePath, propertylist);
            };
        }
    }

    /// <summary>
    /// Service handling Console requests.
    /// </summary>
    public interface ConsoleService
    {
        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <returns>List&lt;string&gt;</returns>
        List<string> GetAemProductInfo(NancyContext context);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <returns>string</returns>
        string GetConfigMgr(NancyContext context);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="name"></param>
        /// <param name="action"></param>
        /// <returns></returns>
        void PostBundle(NancyContext context, string name, string action);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="action"></param>
        /// <returns></returns>
        void PostJmxRepository(NancyContext context, string action);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="post"> (optional)</param>
        /// <param name="apply"> (optional)</param>
        /// <param name="delete"> (optional)</param>
        /// <param name="action"> (optional)</param>
        /// <param name="location"> (optional)</param>
        /// <param name="path"> (optional)</param>
        /// <param name="serviceRanking"> (optional)</param>
        /// <param name="idpUrl"> (optional)</param>
        /// <param name="idpCertAlias"> (optional)</param>
        /// <param name="idpHttpRedirect"> (optional)</param>
        /// <param name="serviceProviderEntityId"> (optional)</param>
        /// <param name="assertionConsumerServiceURL"> (optional)</param>
        /// <param name="spPrivateKeyAlias"> (optional)</param>
        /// <param name="keyStorePassword"> (optional)</param>
        /// <param name="defaultRedirectUrl"> (optional)</param>
        /// <param name="userIDAttribute"> (optional)</param>
        /// <param name="useEncryption"> (optional)</param>
        /// <param name="createUser"> (optional)</param>
        /// <param name="addGroupMemberships"> (optional)</param>
        /// <param name="groupMembershipAttribute"> (optional)</param>
        /// <param name="defaultGroups"> (optional)</param>
        /// <param name="nameIdFormat"> (optional)</param>
        /// <param name="synchronizeAttributes"> (optional)</param>
        /// <param name="handleLogout"> (optional)</param>
        /// <param name="logoutUrl"> (optional)</param>
        /// <param name="clockTolerance"> (optional)</param>
        /// <param name="digestMethod"> (optional)</param>
        /// <param name="signatureMethod"> (optional)</param>
        /// <param name="userIntermediatePath"> (optional)</param>
        /// <param name="propertylist"> (optional)</param>
        /// <returns>SamlConfigurationInfo</returns>
        SamlConfigurationInfo PostSamlConfiguration(NancyContext context, bool? post, bool? apply, bool? delete, string action, string location, List<string> path, int? serviceRanking, string idpUrl, string idpCertAlias, bool? idpHttpRedirect, string serviceProviderEntityId, string assertionConsumerServiceURL, string spPrivateKeyAlias, string keyStorePassword, string defaultRedirectUrl, string userIDAttribute, bool? useEncryption, bool? createUser, bool? addGroupMemberships, string groupMembershipAttribute, List<string> defaultGroups, string nameIdFormat, List<string> synchronizeAttributes, bool? handleLogout, string logoutUrl, int? clockTolerance, string digestMethod, string signatureMethod, string userIntermediatePath, List<string> propertylist);
    }

    /// <summary>
    /// Abstraction of ConsoleService.
    /// </summary>
    public abstract class AbstractConsoleService: ConsoleService
    {
        public virtual List<string> GetAemProductInfo(NancyContext context)
        {
            return GetAemProductInfo();
        }

        public virtual string GetConfigMgr(NancyContext context)
        {
            return GetConfigMgr();
        }

        public virtual void PostBundle(NancyContext context, string name, string action)
        {
            PostBundle(name, action);
        }

        public virtual void PostJmxRepository(NancyContext context, string action)
        {
            PostJmxRepository(action);
        }

        public virtual SamlConfigurationInfo PostSamlConfiguration(NancyContext context, bool? post, bool? apply, bool? delete, string action, string location, List<string> path, int? serviceRanking, string idpUrl, string idpCertAlias, bool? idpHttpRedirect, string serviceProviderEntityId, string assertionConsumerServiceURL, string spPrivateKeyAlias, string keyStorePassword, string defaultRedirectUrl, string userIDAttribute, bool? useEncryption, bool? createUser, bool? addGroupMemberships, string groupMembershipAttribute, List<string> defaultGroups, string nameIdFormat, List<string> synchronizeAttributes, bool? handleLogout, string logoutUrl, int? clockTolerance, string digestMethod, string signatureMethod, string userIntermediatePath, List<string> propertylist)
        {
            return PostSamlConfiguration(post, apply, delete, action, location, path, serviceRanking, idpUrl, idpCertAlias, idpHttpRedirect, serviceProviderEntityId, assertionConsumerServiceURL, spPrivateKeyAlias, keyStorePassword, defaultRedirectUrl, userIDAttribute, useEncryption, createUser, addGroupMemberships, groupMembershipAttribute, defaultGroups, nameIdFormat, synchronizeAttributes, handleLogout, logoutUrl, clockTolerance, digestMethod, signatureMethod, userIntermediatePath, propertylist);
        }

        protected abstract List<string> GetAemProductInfo();

        protected abstract string GetConfigMgr();

        protected abstract void PostBundle(string name, string action);

        protected abstract void PostJmxRepository(string action);

        protected abstract SamlConfigurationInfo PostSamlConfiguration(bool? post, bool? apply, bool? delete, string action, string location, List<string> path, int? serviceRanking, string idpUrl, string idpCertAlias, bool? idpHttpRedirect, string serviceProviderEntityId, string assertionConsumerServiceURL, string spPrivateKeyAlias, string keyStorePassword, string defaultRedirectUrl, string userIDAttribute, bool? useEncryption, bool? createUser, bool? addGroupMemberships, string groupMembershipAttribute, List<string> defaultGroups, string nameIdFormat, List<string> synchronizeAttributes, bool? handleLogout, string logoutUrl, int? clockTolerance, string digestMethod, string signatureMethod, string userIntermediatePath, List<string> propertylist);
    }

}
