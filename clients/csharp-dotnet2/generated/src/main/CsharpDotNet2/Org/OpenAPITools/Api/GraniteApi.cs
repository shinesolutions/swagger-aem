using System;
using System.Collections.Generic;
using RestSharp;
using Org.OpenAPITools.Client;

namespace Org.OpenAPITools.Api
{
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IGraniteApi
    {
        /// <summary>
        ///  
        /// </summary>
        /// <param name="keystorePassword"></param>
        /// <param name="keystorePasswordConfirm"></param>
        /// <param name="truststorePassword"></param>
        /// <param name="truststorePasswordConfirm"></param>
        /// <param name="httpsHostname"></param>
        /// <param name="httpsPort"></param>
        /// <param name="privatekeyFile"></param>
        /// <param name="certificateFile"></param>
        /// <returns>string</returns>
        string SslSetup (string keystorePassword, string keystorePasswordConfirm, string truststorePassword, string truststorePasswordConfirm, string httpsHostname, string httpsPort, System.IO.Stream privatekeyFile, System.IO.Stream certificateFile);
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class GraniteApi : IGraniteApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="GraniteApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public GraniteApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient;
            else
                this.ApiClient = apiClient;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="GraniteApi"/> class.
        /// </summary>
        /// <returns></returns>
        public GraniteApi(String basePath)
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
        /// <param name="keystorePassword"></param>
        /// <param name="keystorePasswordConfirm"></param>
        /// <param name="truststorePassword"></param>
        /// <param name="truststorePasswordConfirm"></param>
        /// <param name="httpsHostname"></param>
        /// <param name="httpsPort"></param>
        /// <param name="privatekeyFile"></param>
        /// <param name="certificateFile"></param>
        /// <returns>string</returns>
        public string SslSetup (string keystorePassword, string keystorePasswordConfirm, string truststorePassword, string truststorePasswordConfirm, string httpsHostname, string httpsPort, System.IO.Stream privatekeyFile, System.IO.Stream certificateFile)
        {
            
            // verify the required parameter 'keystorePassword' is set
            if (keystorePassword == null) throw new ApiException(400, "Missing required parameter 'keystorePassword' when calling SslSetup");
            
            // verify the required parameter 'keystorePasswordConfirm' is set
            if (keystorePasswordConfirm == null) throw new ApiException(400, "Missing required parameter 'keystorePasswordConfirm' when calling SslSetup");
            
            // verify the required parameter 'truststorePassword' is set
            if (truststorePassword == null) throw new ApiException(400, "Missing required parameter 'truststorePassword' when calling SslSetup");
            
            // verify the required parameter 'truststorePasswordConfirm' is set
            if (truststorePasswordConfirm == null) throw new ApiException(400, "Missing required parameter 'truststorePasswordConfirm' when calling SslSetup");
            
            // verify the required parameter 'httpsHostname' is set
            if (httpsHostname == null) throw new ApiException(400, "Missing required parameter 'httpsHostname' when calling SslSetup");
            
            // verify the required parameter 'httpsPort' is set
            if (httpsPort == null) throw new ApiException(400, "Missing required parameter 'httpsPort' when calling SslSetup");
            

            var path = "/libs/granite/security/post/sslSetup.html";
            path = path.Replace("{format}", "json");
            
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

             if (keystorePassword != null) queryParams.Add("keystorePassword", ApiClient.ParameterToString(keystorePassword)); // query parameter
 if (keystorePasswordConfirm != null) queryParams.Add("keystorePasswordConfirm", ApiClient.ParameterToString(keystorePasswordConfirm)); // query parameter
 if (truststorePassword != null) queryParams.Add("truststorePassword", ApiClient.ParameterToString(truststorePassword)); // query parameter
 if (truststorePasswordConfirm != null) queryParams.Add("truststorePasswordConfirm", ApiClient.ParameterToString(truststorePasswordConfirm)); // query parameter
 if (httpsHostname != null) queryParams.Add("httpsHostname", ApiClient.ParameterToString(httpsHostname)); // query parameter
 if (httpsPort != null) queryParams.Add("httpsPort", ApiClient.ParameterToString(httpsPort)); // query parameter
                        if (privatekeyFile != null) fileParams.Add("privatekeyFile", ApiClient.ParameterToFile("privatekeyFile", privatekeyFile));
if (certificateFile != null) fileParams.Add("certificateFile", ApiClient.ParameterToFile("certificateFile", certificateFile));
            
            // authentication setting, if any
            String[] authSettings = new String[] { "aemAuth" };

            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);

            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling SslSetup: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling SslSetup: " + response.ErrorMessage, response.ErrorMessage);

            return (string) ApiClient.Deserialize(response.Content, typeof(string), response.Headers);
        }

    }
}
