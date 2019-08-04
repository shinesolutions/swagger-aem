using System;
using System.Collections.Generic;
using RestSharp;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Org.OpenAPITools.Api
{
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IConsoleApi
    {
        /// <summary>
        ///  
        /// </summary>
        /// <returns>List&lt;string&gt;</returns>
        List<string> GetAemProductInfo ();
        /// <summary>
        ///  
        /// </summary>
        /// <returns>string</returns>
        string GetConfigMgr ();
        /// <summary>
        ///  
        /// </summary>
        /// <param name="name"></param>
        /// <param name="action"></param>
        /// <returns></returns>
        void PostBundle (string name, string action);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="action"></param>
        /// <returns></returns>
        void PostJmxRepository (string action);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="post"></param>
        /// <param name="apply"></param>
        /// <param name="delete"></param>
        /// <param name="action"></param>
        /// <param name="location"></param>
        /// <param name="path"></param>
        /// <param name="serviceRanking"></param>
        /// <param name="idpUrl"></param>
        /// <param name="idpCertAlias"></param>
        /// <param name="idpHttpRedirect"></param>
        /// <param name="serviceProviderEntityId"></param>
        /// <param name="assertionConsumerServiceURL"></param>
        /// <param name="spPrivateKeyAlias"></param>
        /// <param name="keyStorePassword"></param>
        /// <param name="defaultRedirectUrl"></param>
        /// <param name="userIDAttribute"></param>
        /// <param name="useEncryption"></param>
        /// <param name="createUser"></param>
        /// <param name="addGroupMemberships"></param>
        /// <param name="groupMembershipAttribute"></param>
        /// <param name="defaultGroups"></param>
        /// <param name="nameIdFormat"></param>
        /// <param name="synchronizeAttributes"></param>
        /// <param name="handleLogout"></param>
        /// <param name="logoutUrl"></param>
        /// <param name="clockTolerance"></param>
        /// <param name="digestMethod"></param>
        /// <param name="signatureMethod"></param>
        /// <param name="userIntermediatePath"></param>
        /// <param name="propertylist"></param>
        /// <returns>SamlConfigurationInfo</returns>
        SamlConfigurationInfo PostSamlConfiguration (bool? post, bool? apply, bool? delete, string action, string location, List<string> path, int? serviceRanking, string idpUrl, string idpCertAlias, bool? idpHttpRedirect, string serviceProviderEntityId, string assertionConsumerServiceURL, string spPrivateKeyAlias, string keyStorePassword, string defaultRedirectUrl, string userIDAttribute, bool? useEncryption, bool? createUser, bool? addGroupMemberships, string groupMembershipAttribute, List<string> defaultGroups, string nameIdFormat, List<string> synchronizeAttributes, bool? handleLogout, string logoutUrl, int? clockTolerance, string digestMethod, string signatureMethod, string userIntermediatePath, List<string> propertylist);
    }
  
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class ConsoleApi : IConsoleApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ConsoleApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public ConsoleApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient; 
            else
                this.ApiClient = apiClient;
        }
    
        /// <summary>
        /// Initializes a new instance of the <see cref="ConsoleApi"/> class.
        /// </summary>
        /// <returns></returns>
        public ConsoleApi(String basePath)
        {
            this.ApiClient = new ApiClient(basePath);
        }
    
        /// <summary>
        /// Sets the base path of the API client.
        /// </summary>
        /// <param name="basePath">The base path</param>
        /// <value>The base path</value>
        public void SetBasePath(String basePath)
        {
            this.ApiClient.BasePath = basePath;
        }
    
        /// <summary>
        /// Gets the base path of the API client.
        /// </summary>
        /// <param name="basePath">The base path</param>
        /// <value>The base path</value>
        public String GetBasePath(String basePath)
        {
            return this.ApiClient.BasePath;
        }
    
        /// <summary>
        /// Gets or sets the API client.
        /// </summary>
        /// <value>An instance of the ApiClient</value>
        public ApiClient ApiClient {get; set;}
    
        /// <summary>
        ///  
        /// </summary>
        /// <returns>List&lt;string&gt;</returns>            
        public List<string> GetAemProductInfo ()
        {
            
    
            var path = "/system/console/status-productinfo.json";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                                    
            // authentication setting, if any
            String[] authSettings = new String[] { "aemAuth" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling GetAemProductInfo: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetAemProductInfo: " + response.ErrorMessage, response.ErrorMessage);
    
            return (List<string>) ApiClient.Deserialize(response.Content, typeof(List<string>), response.Headers);
        }
    
        /// <summary>
        ///  
        /// </summary>
        /// <returns>string</returns>            
        public string GetConfigMgr ()
        {
            
    
            var path = "/system/console/configMgr";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                                    
            // authentication setting, if any
            String[] authSettings = new String[] { "aemAuth" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling GetConfigMgr: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetConfigMgr: " + response.ErrorMessage, response.ErrorMessage);
    
            return (string) ApiClient.Deserialize(response.Content, typeof(string), response.Headers);
        }
    
        /// <summary>
        ///  
        /// </summary>
        /// <param name="name"></param> 
        /// <param name="action"></param> 
        /// <returns></returns>            
        public void PostBundle (string name, string action)
        {
            
            // verify the required parameter 'name' is set
            if (name == null) throw new ApiException(400, "Missing required parameter 'name' when calling PostBundle");
            
            // verify the required parameter 'action' is set
            if (action == null) throw new ApiException(400, "Missing required parameter 'action' when calling PostBundle");
            
    
            var path = "/system/console/bundles/{name}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "name" + "}", ApiClient.ParameterToString(name));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (action != null) queryParams.Add("action", ApiClient.ParameterToString(action)); // query parameter
                                        
            // authentication setting, if any
            String[] authSettings = new String[] { "aemAuth" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling PostBundle: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling PostBundle: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
        /// <summary>
        ///  
        /// </summary>
        /// <param name="action"></param> 
        /// <returns></returns>            
        public void PostJmxRepository (string action)
        {
            
            // verify the required parameter 'action' is set
            if (action == null) throw new ApiException(400, "Missing required parameter 'action' when calling PostJmxRepository");
            
    
            var path = "/system/console/jmx/com.adobe.granite:type=Repository/op/{action}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "action" + "}", ApiClient.ParameterToString(action));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                                    
            // authentication setting, if any
            String[] authSettings = new String[] { "aemAuth" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling PostJmxRepository: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling PostJmxRepository: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
        /// <summary>
        ///  
        /// </summary>
        /// <param name="post"></param> 
        /// <param name="apply"></param> 
        /// <param name="delete"></param> 
        /// <param name="action"></param> 
        /// <param name="location"></param> 
        /// <param name="path"></param> 
        /// <param name="serviceRanking"></param> 
        /// <param name="idpUrl"></param> 
        /// <param name="idpCertAlias"></param> 
        /// <param name="idpHttpRedirect"></param> 
        /// <param name="serviceProviderEntityId"></param> 
        /// <param name="assertionConsumerServiceURL"></param> 
        /// <param name="spPrivateKeyAlias"></param> 
        /// <param name="keyStorePassword"></param> 
        /// <param name="defaultRedirectUrl"></param> 
        /// <param name="userIDAttribute"></param> 
        /// <param name="useEncryption"></param> 
        /// <param name="createUser"></param> 
        /// <param name="addGroupMemberships"></param> 
        /// <param name="groupMembershipAttribute"></param> 
        /// <param name="defaultGroups"></param> 
        /// <param name="nameIdFormat"></param> 
        /// <param name="synchronizeAttributes"></param> 
        /// <param name="handleLogout"></param> 
        /// <param name="logoutUrl"></param> 
        /// <param name="clockTolerance"></param> 
        /// <param name="digestMethod"></param> 
        /// <param name="signatureMethod"></param> 
        /// <param name="userIntermediatePath"></param> 
        /// <param name="propertylist"></param> 
        /// <returns>SamlConfigurationInfo</returns>            
        public SamlConfigurationInfo PostSamlConfiguration (bool? post, bool? apply, bool? delete, string action, string location, List<string> path, int? serviceRanking, string idpUrl, string idpCertAlias, bool? idpHttpRedirect, string serviceProviderEntityId, string assertionConsumerServiceURL, string spPrivateKeyAlias, string keyStorePassword, string defaultRedirectUrl, string userIDAttribute, bool? useEncryption, bool? createUser, bool? addGroupMemberships, string groupMembershipAttribute, List<string> defaultGroups, string nameIdFormat, List<string> synchronizeAttributes, bool? handleLogout, string logoutUrl, int? clockTolerance, string digestMethod, string signatureMethod, string userIntermediatePath, List<string> propertylist)
        {
            
    
            var path = "/system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (post != null) queryParams.Add("post", ApiClient.ParameterToString(post)); // query parameter
 if (apply != null) queryParams.Add("apply", ApiClient.ParameterToString(apply)); // query parameter
 if (delete != null) queryParams.Add("delete", ApiClient.ParameterToString(delete)); // query parameter
 if (action != null) queryParams.Add("action", ApiClient.ParameterToString(action)); // query parameter
 if (location != null) queryParams.Add("$location", ApiClient.ParameterToString(location)); // query parameter
 if (path != null) queryParams.Add("path", ApiClient.ParameterToString(path)); // query parameter
 if (serviceRanking != null) queryParams.Add("service.ranking", ApiClient.ParameterToString(serviceRanking)); // query parameter
 if (idpUrl != null) queryParams.Add("idpUrl", ApiClient.ParameterToString(idpUrl)); // query parameter
 if (idpCertAlias != null) queryParams.Add("idpCertAlias", ApiClient.ParameterToString(idpCertAlias)); // query parameter
 if (idpHttpRedirect != null) queryParams.Add("idpHttpRedirect", ApiClient.ParameterToString(idpHttpRedirect)); // query parameter
 if (serviceProviderEntityId != null) queryParams.Add("serviceProviderEntityId", ApiClient.ParameterToString(serviceProviderEntityId)); // query parameter
 if (assertionConsumerServiceURL != null) queryParams.Add("assertionConsumerServiceURL", ApiClient.ParameterToString(assertionConsumerServiceURL)); // query parameter
 if (spPrivateKeyAlias != null) queryParams.Add("spPrivateKeyAlias", ApiClient.ParameterToString(spPrivateKeyAlias)); // query parameter
 if (keyStorePassword != null) queryParams.Add("keyStorePassword", ApiClient.ParameterToString(keyStorePassword)); // query parameter
 if (defaultRedirectUrl != null) queryParams.Add("defaultRedirectUrl", ApiClient.ParameterToString(defaultRedirectUrl)); // query parameter
 if (userIDAttribute != null) queryParams.Add("userIDAttribute", ApiClient.ParameterToString(userIDAttribute)); // query parameter
 if (useEncryption != null) queryParams.Add("useEncryption", ApiClient.ParameterToString(useEncryption)); // query parameter
 if (createUser != null) queryParams.Add("createUser", ApiClient.ParameterToString(createUser)); // query parameter
 if (addGroupMemberships != null) queryParams.Add("addGroupMemberships", ApiClient.ParameterToString(addGroupMemberships)); // query parameter
 if (groupMembershipAttribute != null) queryParams.Add("groupMembershipAttribute", ApiClient.ParameterToString(groupMembershipAttribute)); // query parameter
 if (defaultGroups != null) queryParams.Add("defaultGroups", ApiClient.ParameterToString(defaultGroups)); // query parameter
 if (nameIdFormat != null) queryParams.Add("nameIdFormat", ApiClient.ParameterToString(nameIdFormat)); // query parameter
 if (synchronizeAttributes != null) queryParams.Add("synchronizeAttributes", ApiClient.ParameterToString(synchronizeAttributes)); // query parameter
 if (handleLogout != null) queryParams.Add("handleLogout", ApiClient.ParameterToString(handleLogout)); // query parameter
 if (logoutUrl != null) queryParams.Add("logoutUrl", ApiClient.ParameterToString(logoutUrl)); // query parameter
 if (clockTolerance != null) queryParams.Add("clockTolerance", ApiClient.ParameterToString(clockTolerance)); // query parameter
 if (digestMethod != null) queryParams.Add("digestMethod", ApiClient.ParameterToString(digestMethod)); // query parameter
 if (signatureMethod != null) queryParams.Add("signatureMethod", ApiClient.ParameterToString(signatureMethod)); // query parameter
 if (userIntermediatePath != null) queryParams.Add("userIntermediatePath", ApiClient.ParameterToString(userIntermediatePath)); // query parameter
 if (propertylist != null) queryParams.Add("propertylist", ApiClient.ParameterToString(propertylist)); // query parameter
                                        
            // authentication setting, if any
            String[] authSettings = new String[] { "aemAuth" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling PostSamlConfiguration: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling PostSamlConfiguration: " + response.ErrorMessage, response.ErrorMessage);
    
            return (SamlConfigurationInfo) ApiClient.Deserialize(response.Content, typeof(SamlConfigurationInfo), response.Headers);
        }
    
    }
}
