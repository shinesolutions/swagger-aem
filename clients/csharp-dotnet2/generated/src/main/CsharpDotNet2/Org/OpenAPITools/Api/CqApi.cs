using System;
using System.Collections.Generic;
using RestSharp;
using Org.OpenAPITools.Client;

namespace Org.OpenAPITools.Api
{
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface ICqApi
    {
        /// <summary>
        ///  
        /// </summary>
        /// <returns>string</returns>
        string GetLoginPage ();
        /// <summary>
        ///  
        /// </summary>
        /// <param name="authorizableId"></param>
        /// <param name="changelog"></param>
        /// <returns></returns>
        void PostCqActions (string authorizableId, string changelog);
    }
  
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class CqApi : ICqApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CqApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public CqApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient; 
            else
                this.ApiClient = apiClient;
        }
    
        /// <summary>
        /// Initializes a new instance of the <see cref="CqApi"/> class.
        /// </summary>
        /// <returns></returns>
        public CqApi(String basePath)
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
        /// <returns>string</returns>            
        public string GetLoginPage ()
        {
            
    
            var path = "/libs/granite/core/content/login.html";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                                    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling GetLoginPage: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetLoginPage: " + response.ErrorMessage, response.ErrorMessage);
    
            return (string) ApiClient.Deserialize(response.Content, typeof(string), response.Headers);
        }
    
        /// <summary>
        ///  
        /// </summary>
        /// <param name="authorizableId"></param> 
        /// <param name="changelog"></param> 
        /// <returns></returns>            
        public void PostCqActions (string authorizableId, string changelog)
        {
            
            // verify the required parameter 'authorizableId' is set
            if (authorizableId == null) throw new ApiException(400, "Missing required parameter 'authorizableId' when calling PostCqActions");
            
            // verify the required parameter 'changelog' is set
            if (changelog == null) throw new ApiException(400, "Missing required parameter 'changelog' when calling PostCqActions");
            
    
            var path = "/.cqactions.html";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (authorizableId != null) queryParams.Add("authorizableId", ApiClient.ParameterToString(authorizableId)); // query parameter
 if (changelog != null) queryParams.Add("changelog", ApiClient.ParameterToString(changelog)); // query parameter
                                        
            // authentication setting, if any
            String[] authSettings = new String[] { "aemAuth" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling PostCqActions: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling PostCqActions: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
    }
}
