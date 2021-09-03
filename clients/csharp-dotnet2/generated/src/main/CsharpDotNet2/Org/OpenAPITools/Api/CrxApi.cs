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
    public interface ICrxApi
    {
        /// <summary>
        ///  
        /// </summary>
        /// <returns>string</returns>
        string GetCrxdeStatus ();
        /// <summary>
        ///  
        /// </summary>
        /// <returns>InstallStatus</returns>
        InstallStatus GetInstallStatus ();
        /// <summary>
        ///  
        /// </summary>
        /// <returns></returns>
        void GetPackageManagerServlet ();
        /// <summary>
        ///  
        /// </summary>
        /// <param name="cmd"></param>
        /// <returns>string</returns>
        string PostPackageService (string cmd);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="path"></param>
        /// <param name="cmd"></param>
        /// <param name="groupName"></param>
        /// <param name="packageName"></param>
        /// <param name="packageVersion"></param>
        /// <param name="charset"></param>
        /// <param name="force"></param>
        /// <param name="recursive"></param>
        /// <param name="package"></param>
        /// <returns>string</returns>
        string PostPackageServiceJson (string path, string cmd, string groupName, string packageName, string packageVersion, string charset, bool? force, bool? recursive, System.IO.Stream package);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="groupName"></param>
        /// <param name="packageName"></param>
        /// <param name="version"></param>
        /// <param name="path"></param>
        /// <param name="filter"></param>
        /// <param name="charset"></param>
        /// <returns>string</returns>
        string PostPackageUpdate (string groupName, string packageName, string version, string path, string filter, string charset);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="old"></param>
        /// <param name="plain"></param>
        /// <param name="verify"></param>
        /// <returns>string</returns>
        string PostSetPassword (string old, string plain, string verify);
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class CrxApi : ICrxApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CrxApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public CrxApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient;
            else
                this.ApiClient = apiClient;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="CrxApi"/> class.
        /// </summary>
        /// <returns></returns>
        public CrxApi(String basePath)
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
        public string GetCrxdeStatus ()
        {
            

            var path = "/crx/server/crx.default/jcr:root/.1.json";
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
                throw new ApiException ((int)response.StatusCode, "Error calling GetCrxdeStatus: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetCrxdeStatus: " + response.ErrorMessage, response.ErrorMessage);

            return (string) ApiClient.Deserialize(response.Content, typeof(string), response.Headers);
        }

        /// <summary>
        ///  
        /// </summary>
        /// <returns>InstallStatus</returns>
        public InstallStatus GetInstallStatus ()
        {
            

            var path = "/crx/packmgr/installstatus.jsp";
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
                throw new ApiException ((int)response.StatusCode, "Error calling GetInstallStatus: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetInstallStatus: " + response.ErrorMessage, response.ErrorMessage);

            return (InstallStatus) ApiClient.Deserialize(response.Content, typeof(InstallStatus), response.Headers);
        }

        /// <summary>
        ///  
        /// </summary>
        /// <returns></returns>
        public void GetPackageManagerServlet ()
        {
            

            var path = "/crx/packmgr/service/script.html";
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
                throw new ApiException ((int)response.StatusCode, "Error calling GetPackageManagerServlet: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetPackageManagerServlet: " + response.ErrorMessage, response.ErrorMessage);

            return;
        }

        /// <summary>
        ///  
        /// </summary>
        /// <param name="cmd"></param>
        /// <returns>string</returns>
        public string PostPackageService (string cmd)
        {
            
            // verify the required parameter 'cmd' is set
            if (cmd == null) throw new ApiException(400, "Missing required parameter 'cmd' when calling PostPackageService");
            

            var path = "/crx/packmgr/service.jsp";
            path = path.Replace("{format}", "json");
            
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

             if (cmd != null) queryParams.Add("cmd", ApiClient.ParameterToString(cmd)); // query parameter
                                    
            // authentication setting, if any
            String[] authSettings = new String[] { "aemAuth" };

            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);

            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling PostPackageService: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling PostPackageService: " + response.ErrorMessage, response.ErrorMessage);

            return (string) ApiClient.Deserialize(response.Content, typeof(string), response.Headers);
        }

        /// <summary>
        ///  
        /// </summary>
        /// <param name="path"></param>
        /// <param name="cmd"></param>
        /// <param name="groupName"></param>
        /// <param name="packageName"></param>
        /// <param name="packageVersion"></param>
        /// <param name="charset"></param>
        /// <param name="force"></param>
        /// <param name="recursive"></param>
        /// <param name="package"></param>
        /// <returns>string</returns>
        public string PostPackageServiceJson (string path, string cmd, string groupName, string packageName, string packageVersion, string charset, bool? force, bool? recursive, System.IO.Stream package)
        {
            
            // verify the required parameter 'path' is set
            if (path == null) throw new ApiException(400, "Missing required parameter 'path' when calling PostPackageServiceJson");
            
            // verify the required parameter 'cmd' is set
            if (cmd == null) throw new ApiException(400, "Missing required parameter 'cmd' when calling PostPackageServiceJson");
            

            var path = "/crx/packmgr/service/.json/{path}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "path" + "}", ApiClient.ParameterToString(path));

            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

             if (cmd != null) queryParams.Add("cmd", ApiClient.ParameterToString(cmd)); // query parameter
 if (groupName != null) queryParams.Add("groupName", ApiClient.ParameterToString(groupName)); // query parameter
 if (packageName != null) queryParams.Add("packageName", ApiClient.ParameterToString(packageName)); // query parameter
 if (packageVersion != null) queryParams.Add("packageVersion", ApiClient.ParameterToString(packageVersion)); // query parameter
 if (charset != null) queryParams.Add("_charset_", ApiClient.ParameterToString(charset)); // query parameter
 if (force != null) queryParams.Add("force", ApiClient.ParameterToString(force)); // query parameter
 if (recursive != null) queryParams.Add("recursive", ApiClient.ParameterToString(recursive)); // query parameter
                        if (package != null) fileParams.Add("package", ApiClient.ParameterToFile("package", package));
            
            // authentication setting, if any
            String[] authSettings = new String[] { "aemAuth" };

            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);

            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling PostPackageServiceJson: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling PostPackageServiceJson: " + response.ErrorMessage, response.ErrorMessage);

            return (string) ApiClient.Deserialize(response.Content, typeof(string), response.Headers);
        }

        /// <summary>
        ///  
        /// </summary>
        /// <param name="groupName"></param>
        /// <param name="packageName"></param>
        /// <param name="version"></param>
        /// <param name="path"></param>
        /// <param name="filter"></param>
        /// <param name="charset"></param>
        /// <returns>string</returns>
        public string PostPackageUpdate (string groupName, string packageName, string version, string path, string filter, string charset)
        {
            
            // verify the required parameter 'groupName' is set
            if (groupName == null) throw new ApiException(400, "Missing required parameter 'groupName' when calling PostPackageUpdate");
            
            // verify the required parameter 'packageName' is set
            if (packageName == null) throw new ApiException(400, "Missing required parameter 'packageName' when calling PostPackageUpdate");
            
            // verify the required parameter 'version' is set
            if (version == null) throw new ApiException(400, "Missing required parameter 'version' when calling PostPackageUpdate");
            
            // verify the required parameter 'path' is set
            if (path == null) throw new ApiException(400, "Missing required parameter 'path' when calling PostPackageUpdate");
            

            var path = "/crx/packmgr/update.jsp";
            path = path.Replace("{format}", "json");
            
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

             if (groupName != null) queryParams.Add("groupName", ApiClient.ParameterToString(groupName)); // query parameter
 if (packageName != null) queryParams.Add("packageName", ApiClient.ParameterToString(packageName)); // query parameter
 if (version != null) queryParams.Add("version", ApiClient.ParameterToString(version)); // query parameter
 if (path != null) queryParams.Add("path", ApiClient.ParameterToString(path)); // query parameter
 if (filter != null) queryParams.Add("filter", ApiClient.ParameterToString(filter)); // query parameter
 if (charset != null) queryParams.Add("_charset_", ApiClient.ParameterToString(charset)); // query parameter
                                    
            // authentication setting, if any
            String[] authSettings = new String[] { "aemAuth" };

            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);

            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling PostPackageUpdate: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling PostPackageUpdate: " + response.ErrorMessage, response.ErrorMessage);

            return (string) ApiClient.Deserialize(response.Content, typeof(string), response.Headers);
        }

        /// <summary>
        ///  
        /// </summary>
        /// <param name="old"></param>
        /// <param name="plain"></param>
        /// <param name="verify"></param>
        /// <returns>string</returns>
        public string PostSetPassword (string old, string plain, string verify)
        {
            
            // verify the required parameter 'old' is set
            if (old == null) throw new ApiException(400, "Missing required parameter 'old' when calling PostSetPassword");
            
            // verify the required parameter 'plain' is set
            if (plain == null) throw new ApiException(400, "Missing required parameter 'plain' when calling PostSetPassword");
            
            // verify the required parameter 'verify' is set
            if (verify == null) throw new ApiException(400, "Missing required parameter 'verify' when calling PostSetPassword");
            

            var path = "/crx/explorer/ui/setpassword.jsp";
            path = path.Replace("{format}", "json");
            
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

             if (old != null) queryParams.Add("old", ApiClient.ParameterToString(old)); // query parameter
 if (plain != null) queryParams.Add("plain", ApiClient.ParameterToString(plain)); // query parameter
 if (verify != null) queryParams.Add("verify", ApiClient.ParameterToString(verify)); // query parameter
                                    
            // authentication setting, if any
            String[] authSettings = new String[] { "aemAuth" };

            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);

            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling PostSetPassword: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling PostSetPassword: " + response.ErrorMessage, response.ErrorMessage);

            return (string) ApiClient.Deserialize(response.Content, typeof(string), response.Headers);
        }

    }
}
