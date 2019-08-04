using System;
using System.Collections.Generic;
using RestSharp;
using Org.OpenAPITools.Client;

namespace Org.OpenAPITools.Api
{
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface ICustomApi
    {
        /// <summary>
        ///  
        /// </summary>
        /// <param name="tags"></param>
        /// <param name="combineTagsOr"></param>
        /// <returns>string</returns>
        string GetAemHealthCheck (string tags, bool? combineTagsOr);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="bundlesIgnored"></param>
        /// <param name="bundlesIgnoredTypeHint"></param>
        /// <returns></returns>
        void PostConfigAemHealthCheckServlet (List<string> bundlesIgnored, string bundlesIgnoredTypeHint);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="pwdresetAuthorizables"></param>
        /// <param name="pwdresetAuthorizablesTypeHint"></param>
        /// <returns></returns>
        void PostConfigAemPasswordReset (List<string> pwdresetAuthorizables, string pwdresetAuthorizablesTypeHint);
    }
  
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class CustomApi : ICustomApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CustomApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public CustomApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient; 
            else
                this.ApiClient = apiClient;
        }
    
        /// <summary>
        /// Initializes a new instance of the <see cref="CustomApi"/> class.
        /// </summary>
        /// <returns></returns>
        public CustomApi(String basePath)
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
        /// <param name="tags"></param> 
        /// <param name="combineTagsOr"></param> 
        /// <returns>string</returns>            
        public string GetAemHealthCheck (string tags, bool? combineTagsOr)
        {
            
    
            var path = "/system/health";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (tags != null) queryParams.Add("tags", ApiClient.ParameterToString(tags)); // query parameter
 if (combineTagsOr != null) queryParams.Add("combineTagsOr", ApiClient.ParameterToString(combineTagsOr)); // query parameter
                                        
            // authentication setting, if any
            String[] authSettings = new String[] { "aemAuth" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling GetAemHealthCheck: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetAemHealthCheck: " + response.ErrorMessage, response.ErrorMessage);
    
            return (string) ApiClient.Deserialize(response.Content, typeof(string), response.Headers);
        }
    
        /// <summary>
        ///  
        /// </summary>
        /// <param name="bundlesIgnored"></param> 
        /// <param name="bundlesIgnoredTypeHint"></param> 
        /// <returns></returns>            
        public void PostConfigAemHealthCheckServlet (List<string> bundlesIgnored, string bundlesIgnoredTypeHint)
        {
            
    
            var path = "/apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (bundlesIgnored != null) queryParams.Add("bundles.ignored", ApiClient.ParameterToString(bundlesIgnored)); // query parameter
 if (bundlesIgnoredTypeHint != null) queryParams.Add("bundles.ignored@TypeHint", ApiClient.ParameterToString(bundlesIgnoredTypeHint)); // query parameter
                                        
            // authentication setting, if any
            String[] authSettings = new String[] { "aemAuth" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling PostConfigAemHealthCheckServlet: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling PostConfigAemHealthCheckServlet: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
        /// <summary>
        ///  
        /// </summary>
        /// <param name="pwdresetAuthorizables"></param> 
        /// <param name="pwdresetAuthorizablesTypeHint"></param> 
        /// <returns></returns>            
        public void PostConfigAemPasswordReset (List<string> pwdresetAuthorizables, string pwdresetAuthorizablesTypeHint)
        {
            
    
            var path = "/apps/system/config/com.shinesolutions.aem.passwordreset.Activator";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (pwdresetAuthorizables != null) queryParams.Add("pwdreset.authorizables", ApiClient.ParameterToString(pwdresetAuthorizables)); // query parameter
 if (pwdresetAuthorizablesTypeHint != null) queryParams.Add("pwdreset.authorizables@TypeHint", ApiClient.ParameterToString(pwdresetAuthorizablesTypeHint)); // query parameter
                                        
            // authentication setting, if any
            String[] authSettings = new String[] { "aemAuth" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling PostConfigAemPasswordReset: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling PostConfigAemPasswordReset: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
    }
}
