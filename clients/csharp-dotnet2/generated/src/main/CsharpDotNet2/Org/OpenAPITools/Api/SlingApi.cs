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
    public interface ISlingApi
    {
        /// <summary>
        ///  
        /// </summary>
        /// <param name="runmode"></param>
        /// <param name="name"></param>
        /// <returns></returns>
        void DeleteAgent (string runmode, string name);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="path"></param>
        /// <param name="name"></param>
        /// <returns></returns>
        void DeleteNode (string path, string name);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="runmode"></param>
        /// <param name="name"></param>
        /// <returns></returns>
        void GetAgent (string runmode, string name);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="runmode"></param>
        /// <returns>string</returns>
        string GetAgents (string runmode);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="intermediatePath"></param>
        /// <param name="authorizableId"></param>
        /// <returns>KeystoreInfo</returns>
        KeystoreInfo GetAuthorizableKeystore (string intermediatePath, string authorizableId);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="intermediatePath"></param>
        /// <param name="authorizableId"></param>
        /// <returns>System.IO.Stream</returns>
        System.IO.Stream GetKeystore (string intermediatePath, string authorizableId);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="path"></param>
        /// <param name="name"></param>
        /// <returns></returns>
        void GetNode (string path, string name);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="group"></param>
        /// <param name="name"></param>
        /// <param name="version"></param>
        /// <returns>System.IO.Stream</returns>
        System.IO.Stream GetPackage (string group, string name, string version);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="group"></param>
        /// <param name="name"></param>
        /// <param name="version"></param>
        /// <returns>string</returns>
        string GetPackageFilter (string group, string name, string version);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="path"></param>
        /// <param name="pLimit"></param>
        /// <param name="_1property"></param>
        /// <param name="_1propertyValue"></param>
        /// <returns>string</returns>
        string GetQuery (string path, decimal? pLimit, string _1property, string _1propertyValue);
        /// <summary>
        ///  
        /// </summary>
        /// <returns>System.IO.Stream</returns>
        System.IO.Stream GetTruststore ();
        /// <summary>
        ///  
        /// </summary>
        /// <returns>TruststoreInfo</returns>
        TruststoreInfo GetTruststoreInfo ();
        /// <summary>
        ///  
        /// </summary>
        /// <param name="runmode"></param>
        /// <param name="name"></param>
        /// <param name="jcrcontentcqdistribute"></param>
        /// <param name="jcrcontentcqdistributeTypeHint"></param>
        /// <param name="jcrcontentcqname"></param>
        /// <param name="jcrcontentcqtemplate"></param>
        /// <param name="jcrcontentenabled"></param>
        /// <param name="jcrcontentjcrdescription"></param>
        /// <param name="jcrcontentjcrlastModified"></param>
        /// <param name="jcrcontentjcrlastModifiedBy"></param>
        /// <param name="jcrcontentjcrmixinTypes"></param>
        /// <param name="jcrcontentjcrtitle"></param>
        /// <param name="jcrcontentlogLevel"></param>
        /// <param name="jcrcontentnoStatusUpdate"></param>
        /// <param name="jcrcontentnoVersioning"></param>
        /// <param name="jcrcontentprotocolConnectTimeout"></param>
        /// <param name="jcrcontentprotocolHTTPConnectionClosed"></param>
        /// <param name="jcrcontentprotocolHTTPExpired"></param>
        /// <param name="jcrcontentprotocolHTTPHeaders"></param>
        /// <param name="jcrcontentprotocolHTTPHeadersTypeHint"></param>
        /// <param name="jcrcontentprotocolHTTPMethod"></param>
        /// <param name="jcrcontentprotocolHTTPSRelaxed"></param>
        /// <param name="jcrcontentprotocolInterface"></param>
        /// <param name="jcrcontentprotocolSocketTimeout"></param>
        /// <param name="jcrcontentprotocolVersion"></param>
        /// <param name="jcrcontentproxyNTLMDomain"></param>
        /// <param name="jcrcontentproxyNTLMHost"></param>
        /// <param name="jcrcontentproxyHost"></param>
        /// <param name="jcrcontentproxyPassword"></param>
        /// <param name="jcrcontentproxyPort"></param>
        /// <param name="jcrcontentproxyUser"></param>
        /// <param name="jcrcontentqueueBatchMaxSize"></param>
        /// <param name="jcrcontentqueueBatchMode"></param>
        /// <param name="jcrcontentqueueBatchWaitTime"></param>
        /// <param name="jcrcontentretryDelay"></param>
        /// <param name="jcrcontentreverseReplication"></param>
        /// <param name="jcrcontentserializationType"></param>
        /// <param name="jcrcontentslingresourceType"></param>
        /// <param name="jcrcontentssl"></param>
        /// <param name="jcrcontenttransportNTLMDomain"></param>
        /// <param name="jcrcontenttransportNTLMHost"></param>
        /// <param name="jcrcontenttransportPassword"></param>
        /// <param name="jcrcontenttransportUri"></param>
        /// <param name="jcrcontenttransportUser"></param>
        /// <param name="jcrcontenttriggerDistribute"></param>
        /// <param name="jcrcontenttriggerModified"></param>
        /// <param name="jcrcontenttriggerOnOffTime"></param>
        /// <param name="jcrcontenttriggerReceive"></param>
        /// <param name="jcrcontenttriggerSpecific"></param>
        /// <param name="jcrcontentuserId"></param>
        /// <param name="jcrprimaryType"></param>
        /// <param name="operation"></param>
        /// <returns></returns>
        void PostAgent (string runmode, string name, bool? jcrcontentcqdistribute, string jcrcontentcqdistributeTypeHint, string jcrcontentcqname, string jcrcontentcqtemplate, bool? jcrcontentenabled, string jcrcontentjcrdescription, string jcrcontentjcrlastModified, string jcrcontentjcrlastModifiedBy, string jcrcontentjcrmixinTypes, string jcrcontentjcrtitle, string jcrcontentlogLevel, bool? jcrcontentnoStatusUpdate, bool? jcrcontentnoVersioning, decimal? jcrcontentprotocolConnectTimeout, bool? jcrcontentprotocolHTTPConnectionClosed, string jcrcontentprotocolHTTPExpired, List<string> jcrcontentprotocolHTTPHeaders, string jcrcontentprotocolHTTPHeadersTypeHint, string jcrcontentprotocolHTTPMethod, bool? jcrcontentprotocolHTTPSRelaxed, string jcrcontentprotocolInterface, decimal? jcrcontentprotocolSocketTimeout, string jcrcontentprotocolVersion, string jcrcontentproxyNTLMDomain, string jcrcontentproxyNTLMHost, string jcrcontentproxyHost, string jcrcontentproxyPassword, decimal? jcrcontentproxyPort, string jcrcontentproxyUser, decimal? jcrcontentqueueBatchMaxSize, string jcrcontentqueueBatchMode, decimal? jcrcontentqueueBatchWaitTime, string jcrcontentretryDelay, bool? jcrcontentreverseReplication, string jcrcontentserializationType, string jcrcontentslingresourceType, string jcrcontentssl, string jcrcontenttransportNTLMDomain, string jcrcontenttransportNTLMHost, string jcrcontenttransportPassword, string jcrcontenttransportUri, string jcrcontenttransportUser, bool? jcrcontenttriggerDistribute, bool? jcrcontenttriggerModified, bool? jcrcontenttriggerOnOffTime, bool? jcrcontenttriggerReceive, bool? jcrcontenttriggerSpecific, string jcrcontentuserId, string jcrprimaryType, string operation);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="intermediatePath"></param>
        /// <param name="authorizableId"></param>
        /// <param name="operation"></param>
        /// <param name="currentPassword"></param>
        /// <param name="newPassword"></param>
        /// <param name="rePassword"></param>
        /// <param name="keyPassword"></param>
        /// <param name="keyStorePass"></param>
        /// <param name="alias"></param>
        /// <param name="newAlias"></param>
        /// <param name="removeAlias"></param>
        /// <param name="certChain"></param>
        /// <param name="pk"></param>
        /// <param name="keyStore"></param>
        /// <returns>KeystoreInfo</returns>
        KeystoreInfo PostAuthorizableKeystore (string intermediatePath, string authorizableId, string operation, string currentPassword, string newPassword, string rePassword, string keyPassword, string keyStorePass, string alias, string newAlias, string removeAlias, System.IO.Stream certChain, System.IO.Stream pk, System.IO.Stream keyStore);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="authorizableId"></param>
        /// <param name="intermediatePath"></param>
        /// <param name="createUser"></param>
        /// <param name="createGroup"></param>
        /// <param name="reppassword"></param>
        /// <param name="profilegivenName"></param>
        /// <returns>string</returns>
        string PostAuthorizables (string authorizableId, string intermediatePath, string createUser, string createGroup, string reppassword, string profilegivenName);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="keyStorePassword"></param>
        /// <param name="keyStorePasswordTypeHint"></param>
        /// <param name="serviceRanking"></param>
        /// <param name="serviceRankingTypeHint"></param>
        /// <param name="idpHttpRedirect"></param>
        /// <param name="idpHttpRedirectTypeHint"></param>
        /// <param name="createUser"></param>
        /// <param name="createUserTypeHint"></param>
        /// <param name="defaultRedirectUrl"></param>
        /// <param name="defaultRedirectUrlTypeHint"></param>
        /// <param name="userIDAttribute"></param>
        /// <param name="userIDAttributeTypeHint"></param>
        /// <param name="defaultGroups"></param>
        /// <param name="defaultGroupsTypeHint"></param>
        /// <param name="idpCertAlias"></param>
        /// <param name="idpCertAliasTypeHint"></param>
        /// <param name="addGroupMemberships"></param>
        /// <param name="addGroupMembershipsTypeHint"></param>
        /// <param name="path"></param>
        /// <param name="pathTypeHint"></param>
        /// <param name="synchronizeAttributes"></param>
        /// <param name="synchronizeAttributesTypeHint"></param>
        /// <param name="clockTolerance"></param>
        /// <param name="clockToleranceTypeHint"></param>
        /// <param name="groupMembershipAttribute"></param>
        /// <param name="groupMembershipAttributeTypeHint"></param>
        /// <param name="idpUrl"></param>
        /// <param name="idpUrlTypeHint"></param>
        /// <param name="logoutUrl"></param>
        /// <param name="logoutUrlTypeHint"></param>
        /// <param name="serviceProviderEntityId"></param>
        /// <param name="serviceProviderEntityIdTypeHint"></param>
        /// <param name="assertionConsumerServiceURL"></param>
        /// <param name="assertionConsumerServiceURLTypeHint"></param>
        /// <param name="handleLogout"></param>
        /// <param name="handleLogoutTypeHint"></param>
        /// <param name="spPrivateKeyAlias"></param>
        /// <param name="spPrivateKeyAliasTypeHint"></param>
        /// <param name="useEncryption"></param>
        /// <param name="useEncryptionTypeHint"></param>
        /// <param name="nameIdFormat"></param>
        /// <param name="nameIdFormatTypeHint"></param>
        /// <param name="digestMethod"></param>
        /// <param name="digestMethodTypeHint"></param>
        /// <param name="signatureMethod"></param>
        /// <param name="signatureMethodTypeHint"></param>
        /// <param name="userIntermediatePath"></param>
        /// <param name="userIntermediatePathTypeHint"></param>
        /// <returns></returns>
        void PostConfigAdobeGraniteSamlAuthenticationHandler (string keyStorePassword, string keyStorePasswordTypeHint, int? serviceRanking, string serviceRankingTypeHint, bool? idpHttpRedirect, string idpHttpRedirectTypeHint, bool? createUser, string createUserTypeHint, string defaultRedirectUrl, string defaultRedirectUrlTypeHint, string userIDAttribute, string userIDAttributeTypeHint, List<string> defaultGroups, string defaultGroupsTypeHint, string idpCertAlias, string idpCertAliasTypeHint, bool? addGroupMemberships, string addGroupMembershipsTypeHint, List<string> path, string pathTypeHint, List<string> synchronizeAttributes, string synchronizeAttributesTypeHint, int? clockTolerance, string clockToleranceTypeHint, string groupMembershipAttribute, string groupMembershipAttributeTypeHint, string idpUrl, string idpUrlTypeHint, string logoutUrl, string logoutUrlTypeHint, string serviceProviderEntityId, string serviceProviderEntityIdTypeHint, string assertionConsumerServiceURL, string assertionConsumerServiceURLTypeHint, bool? handleLogout, string handleLogoutTypeHint, string spPrivateKeyAlias, string spPrivateKeyAliasTypeHint, bool? useEncryption, string useEncryptionTypeHint, string nameIdFormat, string nameIdFormatTypeHint, string digestMethod, string digestMethodTypeHint, string signatureMethod, string signatureMethodTypeHint, string userIntermediatePath, string userIntermediatePathTypeHint);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="orgApacheFelixHttpsNio"></param>
        /// <param name="orgApacheFelixHttpsNioTypeHint"></param>
        /// <param name="orgApacheFelixHttpsKeystore"></param>
        /// <param name="orgApacheFelixHttpsKeystoreTypeHint"></param>
        /// <param name="orgApacheFelixHttpsKeystorePassword"></param>
        /// <param name="orgApacheFelixHttpsKeystorePasswordTypeHint"></param>
        /// <param name="orgApacheFelixHttpsKeystoreKey"></param>
        /// <param name="orgApacheFelixHttpsKeystoreKeyTypeHint"></param>
        /// <param name="orgApacheFelixHttpsKeystoreKeyPassword"></param>
        /// <param name="orgApacheFelixHttpsKeystoreKeyPasswordTypeHint"></param>
        /// <param name="orgApacheFelixHttpsTruststore"></param>
        /// <param name="orgApacheFelixHttpsTruststoreTypeHint"></param>
        /// <param name="orgApacheFelixHttpsTruststorePassword"></param>
        /// <param name="orgApacheFelixHttpsTruststorePasswordTypeHint"></param>
        /// <param name="orgApacheFelixHttpsClientcertificate"></param>
        /// <param name="orgApacheFelixHttpsClientcertificateTypeHint"></param>
        /// <param name="orgApacheFelixHttpsEnable"></param>
        /// <param name="orgApacheFelixHttpsEnableTypeHint"></param>
        /// <param name="orgOsgiServiceHttpPortSecure"></param>
        /// <param name="orgOsgiServiceHttpPortSecureTypeHint"></param>
        /// <returns></returns>
        void PostConfigApacheFelixJettyBasedHttpService (bool? orgApacheFelixHttpsNio, string orgApacheFelixHttpsNioTypeHint, string orgApacheFelixHttpsKeystore, string orgApacheFelixHttpsKeystoreTypeHint, string orgApacheFelixHttpsKeystorePassword, string orgApacheFelixHttpsKeystorePasswordTypeHint, string orgApacheFelixHttpsKeystoreKey, string orgApacheFelixHttpsKeystoreKeyTypeHint, string orgApacheFelixHttpsKeystoreKeyPassword, string orgApacheFelixHttpsKeystoreKeyPasswordTypeHint, string orgApacheFelixHttpsTruststore, string orgApacheFelixHttpsTruststoreTypeHint, string orgApacheFelixHttpsTruststorePassword, string orgApacheFelixHttpsTruststorePasswordTypeHint, string orgApacheFelixHttpsClientcertificate, string orgApacheFelixHttpsClientcertificateTypeHint, bool? orgApacheFelixHttpsEnable, string orgApacheFelixHttpsEnableTypeHint, string orgOsgiServiceHttpPortSecure, string orgOsgiServiceHttpPortSecureTypeHint);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="proxyHost"></param>
        /// <param name="proxyHostTypeHint"></param>
        /// <param name="proxyPort"></param>
        /// <param name="proxyPortTypeHint"></param>
        /// <param name="proxyExceptions"></param>
        /// <param name="proxyExceptionsTypeHint"></param>
        /// <param name="proxyEnabled"></param>
        /// <param name="proxyEnabledTypeHint"></param>
        /// <param name="proxyUser"></param>
        /// <param name="proxyUserTypeHint"></param>
        /// <param name="proxyPassword"></param>
        /// <param name="proxyPasswordTypeHint"></param>
        /// <returns></returns>
        void PostConfigApacheHttpComponentsProxyConfiguration (string proxyHost, string proxyHostTypeHint, int? proxyPort, string proxyPortTypeHint, List<string> proxyExceptions, string proxyExceptionsTypeHint, bool? proxyEnabled, string proxyEnabledTypeHint, string proxyUser, string proxyUserTypeHint, string proxyPassword, string proxyPasswordTypeHint);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="alias"></param>
        /// <param name="aliasTypeHint"></param>
        /// <param name="davCreateAbsoluteUri"></param>
        /// <param name="davCreateAbsoluteUriTypeHint"></param>
        /// <returns></returns>
        void PostConfigApacheSlingDavExServlet (string alias, string aliasTypeHint, bool? davCreateAbsoluteUri, string davCreateAbsoluteUriTypeHint);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="jsonMaximumresults"></param>
        /// <param name="jsonMaximumresultsTypeHint"></param>
        /// <param name="enableHtml"></param>
        /// <param name="enableHtmlTypeHint"></param>
        /// <param name="enableTxt"></param>
        /// <param name="enableTxtTypeHint"></param>
        /// <param name="enableXml"></param>
        /// <param name="enableXmlTypeHint"></param>
        /// <returns></returns>
        void PostConfigApacheSlingGetServlet (string jsonMaximumresults, string jsonMaximumresultsTypeHint, bool? enableHtml, string enableHtmlTypeHint, bool? enableTxt, string enableTxtTypeHint, bool? enableXml, string enableXmlTypeHint);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="allowEmpty"></param>
        /// <param name="allowEmptyTypeHint"></param>
        /// <param name="allowHosts"></param>
        /// <param name="allowHostsTypeHint"></param>
        /// <param name="allowHostsRegexp"></param>
        /// <param name="allowHostsRegexpTypeHint"></param>
        /// <param name="filterMethods"></param>
        /// <param name="filterMethodsTypeHint"></param>
        /// <returns></returns>
        void PostConfigApacheSlingReferrerFilter (bool? allowEmpty, string allowEmptyTypeHint, string allowHosts, string allowHostsTypeHint, string allowHostsRegexp, string allowHostsRegexpTypeHint, string filterMethods, string filterMethodsTypeHint);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="path"></param>
        /// <param name="name"></param>
        /// <param name="operation"></param>
        /// <param name="deleteAuthorizable"></param>
        /// <param name="file"></param>
        /// <returns></returns>
        void PostNode (string path, string name, string operation, string deleteAuthorizable, System.IO.Stream file);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="path"></param>
        /// <param name="name"></param>
        /// <param name="addMembers"></param>
        /// <returns></returns>
        void PostNodeRw (string path, string name, string addMembers);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="path"></param>
        /// <param name="jcrprimaryType"></param>
        /// <param name="name"></param>
        /// <returns></returns>
        void PostPath (string path, string jcrprimaryType, string name);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="path"></param>
        /// <param name="pLimit"></param>
        /// <param name="_1property"></param>
        /// <param name="_1propertyValue"></param>
        /// <returns>string</returns>
        string PostQuery (string path, decimal? pLimit, string _1property, string _1propertyValue);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="ignoredeactivated"></param>
        /// <param name="onlymodified"></param>
        /// <param name="path"></param>
        /// <returns></returns>
        void PostTreeActivation (bool? ignoredeactivated, bool? onlymodified, string path);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="operation"></param>
        /// <param name="newPassword"></param>
        /// <param name="rePassword"></param>
        /// <param name="keyStoreType"></param>
        /// <param name="removeAlias"></param>
        /// <param name="certificate"></param>
        /// <returns>string</returns>
        string PostTruststore (string operation, string newPassword, string rePassword, string keyStoreType, string removeAlias, System.IO.Stream certificate);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="truststoreP12"></param>
        /// <returns>string</returns>
        string PostTruststorePKCS12 (System.IO.Stream truststoreP12);
    }
  
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class SlingApi : ISlingApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="SlingApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public SlingApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient; 
            else
                this.ApiClient = apiClient;
        }
    
        /// <summary>
        /// Initializes a new instance of the <see cref="SlingApi"/> class.
        /// </summary>
        /// <returns></returns>
        public SlingApi(String basePath)
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
        /// <param name="runmode"></param> 
        /// <param name="name"></param> 
        /// <returns></returns>            
        public void DeleteAgent (string runmode, string name)
        {
            
            // verify the required parameter 'runmode' is set
            if (runmode == null) throw new ApiException(400, "Missing required parameter 'runmode' when calling DeleteAgent");
            
            // verify the required parameter 'name' is set
            if (name == null) throw new ApiException(400, "Missing required parameter 'name' when calling DeleteAgent");
            
    
            var path = "/etc/replication/agents.{runmode}/{name}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "runmode" + "}", ApiClient.ParameterToString(runmode));
path = path.Replace("{" + "name" + "}", ApiClient.ParameterToString(name));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                                    
            // authentication setting, if any
            String[] authSettings = new String[] { "aemAuth" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.DELETE, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling DeleteAgent: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling DeleteAgent: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
        /// <summary>
        ///  
        /// </summary>
        /// <param name="path"></param> 
        /// <param name="name"></param> 
        /// <returns></returns>            
        public void DeleteNode (string path, string name)
        {
            
            // verify the required parameter 'path' is set
            if (path == null) throw new ApiException(400, "Missing required parameter 'path' when calling DeleteNode");
            
            // verify the required parameter 'name' is set
            if (name == null) throw new ApiException(400, "Missing required parameter 'name' when calling DeleteNode");
            
    
            var path = "/{path}/{name}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "path" + "}", ApiClient.ParameterToString(path));
path = path.Replace("{" + "name" + "}", ApiClient.ParameterToString(name));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                                    
            // authentication setting, if any
            String[] authSettings = new String[] { "aemAuth" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.DELETE, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling DeleteNode: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling DeleteNode: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
        /// <summary>
        ///  
        /// </summary>
        /// <param name="runmode"></param> 
        /// <param name="name"></param> 
        /// <returns></returns>            
        public void GetAgent (string runmode, string name)
        {
            
            // verify the required parameter 'runmode' is set
            if (runmode == null) throw new ApiException(400, "Missing required parameter 'runmode' when calling GetAgent");
            
            // verify the required parameter 'name' is set
            if (name == null) throw new ApiException(400, "Missing required parameter 'name' when calling GetAgent");
            
    
            var path = "/etc/replication/agents.{runmode}/{name}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "runmode" + "}", ApiClient.ParameterToString(runmode));
path = path.Replace("{" + "name" + "}", ApiClient.ParameterToString(name));
    
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
                throw new ApiException ((int)response.StatusCode, "Error calling GetAgent: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetAgent: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
        /// <summary>
        ///  
        /// </summary>
        /// <param name="runmode"></param> 
        /// <returns>string</returns>            
        public string GetAgents (string runmode)
        {
            
            // verify the required parameter 'runmode' is set
            if (runmode == null) throw new ApiException(400, "Missing required parameter 'runmode' when calling GetAgents");
            
    
            var path = "/etc/replication/agents.{runmode}.-1.json";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "runmode" + "}", ApiClient.ParameterToString(runmode));
    
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
                throw new ApiException ((int)response.StatusCode, "Error calling GetAgents: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetAgents: " + response.ErrorMessage, response.ErrorMessage);
    
            return (string) ApiClient.Deserialize(response.Content, typeof(string), response.Headers);
        }
    
        /// <summary>
        ///  
        /// </summary>
        /// <param name="intermediatePath"></param> 
        /// <param name="authorizableId"></param> 
        /// <returns>KeystoreInfo</returns>            
        public KeystoreInfo GetAuthorizableKeystore (string intermediatePath, string authorizableId)
        {
            
            // verify the required parameter 'intermediatePath' is set
            if (intermediatePath == null) throw new ApiException(400, "Missing required parameter 'intermediatePath' when calling GetAuthorizableKeystore");
            
            // verify the required parameter 'authorizableId' is set
            if (authorizableId == null) throw new ApiException(400, "Missing required parameter 'authorizableId' when calling GetAuthorizableKeystore");
            
    
            var path = "/{intermediatePath}/{authorizableId}.ks.json";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "intermediatePath" + "}", ApiClient.ParameterToString(intermediatePath));
path = path.Replace("{" + "authorizableId" + "}", ApiClient.ParameterToString(authorizableId));
    
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
                throw new ApiException ((int)response.StatusCode, "Error calling GetAuthorizableKeystore: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetAuthorizableKeystore: " + response.ErrorMessage, response.ErrorMessage);
    
            return (KeystoreInfo) ApiClient.Deserialize(response.Content, typeof(KeystoreInfo), response.Headers);
        }
    
        /// <summary>
        ///  
        /// </summary>
        /// <param name="intermediatePath"></param> 
        /// <param name="authorizableId"></param> 
        /// <returns>System.IO.Stream</returns>            
        public System.IO.Stream GetKeystore (string intermediatePath, string authorizableId)
        {
            
            // verify the required parameter 'intermediatePath' is set
            if (intermediatePath == null) throw new ApiException(400, "Missing required parameter 'intermediatePath' when calling GetKeystore");
            
            // verify the required parameter 'authorizableId' is set
            if (authorizableId == null) throw new ApiException(400, "Missing required parameter 'authorizableId' when calling GetKeystore");
            
    
            var path = "/{intermediatePath}/{authorizableId}/keystore/store.p12";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "intermediatePath" + "}", ApiClient.ParameterToString(intermediatePath));
path = path.Replace("{" + "authorizableId" + "}", ApiClient.ParameterToString(authorizableId));
    
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
                throw new ApiException ((int)response.StatusCode, "Error calling GetKeystore: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetKeystore: " + response.ErrorMessage, response.ErrorMessage);
    
            return (System.IO.Stream) ApiClient.Deserialize(response.Content, typeof(System.IO.Stream), response.Headers);
        }
    
        /// <summary>
        ///  
        /// </summary>
        /// <param name="path"></param> 
        /// <param name="name"></param> 
        /// <returns></returns>            
        public void GetNode (string path, string name)
        {
            
            // verify the required parameter 'path' is set
            if (path == null) throw new ApiException(400, "Missing required parameter 'path' when calling GetNode");
            
            // verify the required parameter 'name' is set
            if (name == null) throw new ApiException(400, "Missing required parameter 'name' when calling GetNode");
            
    
            var path = "/{path}/{name}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "path" + "}", ApiClient.ParameterToString(path));
path = path.Replace("{" + "name" + "}", ApiClient.ParameterToString(name));
    
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
                throw new ApiException ((int)response.StatusCode, "Error calling GetNode: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetNode: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
        /// <summary>
        ///  
        /// </summary>
        /// <param name="group"></param> 
        /// <param name="name"></param> 
        /// <param name="version"></param> 
        /// <returns>System.IO.Stream</returns>            
        public System.IO.Stream GetPackage (string group, string name, string version)
        {
            
            // verify the required parameter 'group' is set
            if (group == null) throw new ApiException(400, "Missing required parameter 'group' when calling GetPackage");
            
            // verify the required parameter 'name' is set
            if (name == null) throw new ApiException(400, "Missing required parameter 'name' when calling GetPackage");
            
            // verify the required parameter 'version' is set
            if (version == null) throw new ApiException(400, "Missing required parameter 'version' when calling GetPackage");
            
    
            var path = "/etc/packages/{group}/{name}-{version}.zip";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "group" + "}", ApiClient.ParameterToString(group));
path = path.Replace("{" + "name" + "}", ApiClient.ParameterToString(name));
path = path.Replace("{" + "version" + "}", ApiClient.ParameterToString(version));
    
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
                throw new ApiException ((int)response.StatusCode, "Error calling GetPackage: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetPackage: " + response.ErrorMessage, response.ErrorMessage);
    
            return (System.IO.Stream) ApiClient.Deserialize(response.Content, typeof(System.IO.Stream), response.Headers);
        }
    
        /// <summary>
        ///  
        /// </summary>
        /// <param name="group"></param> 
        /// <param name="name"></param> 
        /// <param name="version"></param> 
        /// <returns>string</returns>            
        public string GetPackageFilter (string group, string name, string version)
        {
            
            // verify the required parameter 'group' is set
            if (group == null) throw new ApiException(400, "Missing required parameter 'group' when calling GetPackageFilter");
            
            // verify the required parameter 'name' is set
            if (name == null) throw new ApiException(400, "Missing required parameter 'name' when calling GetPackageFilter");
            
            // verify the required parameter 'version' is set
            if (version == null) throw new ApiException(400, "Missing required parameter 'version' when calling GetPackageFilter");
            
    
            var path = "/etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "group" + "}", ApiClient.ParameterToString(group));
path = path.Replace("{" + "name" + "}", ApiClient.ParameterToString(name));
path = path.Replace("{" + "version" + "}", ApiClient.ParameterToString(version));
    
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
                throw new ApiException ((int)response.StatusCode, "Error calling GetPackageFilter: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetPackageFilter: " + response.ErrorMessage, response.ErrorMessage);
    
            return (string) ApiClient.Deserialize(response.Content, typeof(string), response.Headers);
        }
    
        /// <summary>
        ///  
        /// </summary>
        /// <param name="path"></param> 
        /// <param name="pLimit"></param> 
        /// <param name="_1property"></param> 
        /// <param name="_1propertyValue"></param> 
        /// <returns>string</returns>            
        public string GetQuery (string path, decimal? pLimit, string _1property, string _1propertyValue)
        {
            
            // verify the required parameter 'path' is set
            if (path == null) throw new ApiException(400, "Missing required parameter 'path' when calling GetQuery");
            
            // verify the required parameter 'pLimit' is set
            if (pLimit == null) throw new ApiException(400, "Missing required parameter 'pLimit' when calling GetQuery");
            
            // verify the required parameter '_1property' is set
            if (_1property == null) throw new ApiException(400, "Missing required parameter '_1property' when calling GetQuery");
            
            // verify the required parameter '_1propertyValue' is set
            if (_1propertyValue == null) throw new ApiException(400, "Missing required parameter '_1propertyValue' when calling GetQuery");
            
    
            var path = "/bin/querybuilder.json";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (path != null) queryParams.Add("path", ApiClient.ParameterToString(path)); // query parameter
 if (pLimit != null) queryParams.Add("p.limit", ApiClient.ParameterToString(pLimit)); // query parameter
 if (_1property != null) queryParams.Add("1_property", ApiClient.ParameterToString(_1property)); // query parameter
 if (_1propertyValue != null) queryParams.Add("1_property.value", ApiClient.ParameterToString(_1propertyValue)); // query parameter
                                        
            // authentication setting, if any
            String[] authSettings = new String[] { "aemAuth" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling GetQuery: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetQuery: " + response.ErrorMessage, response.ErrorMessage);
    
            return (string) ApiClient.Deserialize(response.Content, typeof(string), response.Headers);
        }
    
        /// <summary>
        ///  
        /// </summary>
        /// <returns>System.IO.Stream</returns>            
        public System.IO.Stream GetTruststore ()
        {
            
    
            var path = "/etc/truststore/truststore.p12";
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
                throw new ApiException ((int)response.StatusCode, "Error calling GetTruststore: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetTruststore: " + response.ErrorMessage, response.ErrorMessage);
    
            return (System.IO.Stream) ApiClient.Deserialize(response.Content, typeof(System.IO.Stream), response.Headers);
        }
    
        /// <summary>
        ///  
        /// </summary>
        /// <returns>TruststoreInfo</returns>            
        public TruststoreInfo GetTruststoreInfo ()
        {
            
    
            var path = "/libs/granite/security/truststore.json";
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
                throw new ApiException ((int)response.StatusCode, "Error calling GetTruststoreInfo: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetTruststoreInfo: " + response.ErrorMessage, response.ErrorMessage);
    
            return (TruststoreInfo) ApiClient.Deserialize(response.Content, typeof(TruststoreInfo), response.Headers);
        }
    
        /// <summary>
        ///  
        /// </summary>
        /// <param name="runmode"></param> 
        /// <param name="name"></param> 
        /// <param name="jcrcontentcqdistribute"></param> 
        /// <param name="jcrcontentcqdistributeTypeHint"></param> 
        /// <param name="jcrcontentcqname"></param> 
        /// <param name="jcrcontentcqtemplate"></param> 
        /// <param name="jcrcontentenabled"></param> 
        /// <param name="jcrcontentjcrdescription"></param> 
        /// <param name="jcrcontentjcrlastModified"></param> 
        /// <param name="jcrcontentjcrlastModifiedBy"></param> 
        /// <param name="jcrcontentjcrmixinTypes"></param> 
        /// <param name="jcrcontentjcrtitle"></param> 
        /// <param name="jcrcontentlogLevel"></param> 
        /// <param name="jcrcontentnoStatusUpdate"></param> 
        /// <param name="jcrcontentnoVersioning"></param> 
        /// <param name="jcrcontentprotocolConnectTimeout"></param> 
        /// <param name="jcrcontentprotocolHTTPConnectionClosed"></param> 
        /// <param name="jcrcontentprotocolHTTPExpired"></param> 
        /// <param name="jcrcontentprotocolHTTPHeaders"></param> 
        /// <param name="jcrcontentprotocolHTTPHeadersTypeHint"></param> 
        /// <param name="jcrcontentprotocolHTTPMethod"></param> 
        /// <param name="jcrcontentprotocolHTTPSRelaxed"></param> 
        /// <param name="jcrcontentprotocolInterface"></param> 
        /// <param name="jcrcontentprotocolSocketTimeout"></param> 
        /// <param name="jcrcontentprotocolVersion"></param> 
        /// <param name="jcrcontentproxyNTLMDomain"></param> 
        /// <param name="jcrcontentproxyNTLMHost"></param> 
        /// <param name="jcrcontentproxyHost"></param> 
        /// <param name="jcrcontentproxyPassword"></param> 
        /// <param name="jcrcontentproxyPort"></param> 
        /// <param name="jcrcontentproxyUser"></param> 
        /// <param name="jcrcontentqueueBatchMaxSize"></param> 
        /// <param name="jcrcontentqueueBatchMode"></param> 
        /// <param name="jcrcontentqueueBatchWaitTime"></param> 
        /// <param name="jcrcontentretryDelay"></param> 
        /// <param name="jcrcontentreverseReplication"></param> 
        /// <param name="jcrcontentserializationType"></param> 
        /// <param name="jcrcontentslingresourceType"></param> 
        /// <param name="jcrcontentssl"></param> 
        /// <param name="jcrcontenttransportNTLMDomain"></param> 
        /// <param name="jcrcontenttransportNTLMHost"></param> 
        /// <param name="jcrcontenttransportPassword"></param> 
        /// <param name="jcrcontenttransportUri"></param> 
        /// <param name="jcrcontenttransportUser"></param> 
        /// <param name="jcrcontenttriggerDistribute"></param> 
        /// <param name="jcrcontenttriggerModified"></param> 
        /// <param name="jcrcontenttriggerOnOffTime"></param> 
        /// <param name="jcrcontenttriggerReceive"></param> 
        /// <param name="jcrcontenttriggerSpecific"></param> 
        /// <param name="jcrcontentuserId"></param> 
        /// <param name="jcrprimaryType"></param> 
        /// <param name="operation"></param> 
        /// <returns></returns>            
        public void PostAgent (string runmode, string name, bool? jcrcontentcqdistribute, string jcrcontentcqdistributeTypeHint, string jcrcontentcqname, string jcrcontentcqtemplate, bool? jcrcontentenabled, string jcrcontentjcrdescription, string jcrcontentjcrlastModified, string jcrcontentjcrlastModifiedBy, string jcrcontentjcrmixinTypes, string jcrcontentjcrtitle, string jcrcontentlogLevel, bool? jcrcontentnoStatusUpdate, bool? jcrcontentnoVersioning, decimal? jcrcontentprotocolConnectTimeout, bool? jcrcontentprotocolHTTPConnectionClosed, string jcrcontentprotocolHTTPExpired, List<string> jcrcontentprotocolHTTPHeaders, string jcrcontentprotocolHTTPHeadersTypeHint, string jcrcontentprotocolHTTPMethod, bool? jcrcontentprotocolHTTPSRelaxed, string jcrcontentprotocolInterface, decimal? jcrcontentprotocolSocketTimeout, string jcrcontentprotocolVersion, string jcrcontentproxyNTLMDomain, string jcrcontentproxyNTLMHost, string jcrcontentproxyHost, string jcrcontentproxyPassword, decimal? jcrcontentproxyPort, string jcrcontentproxyUser, decimal? jcrcontentqueueBatchMaxSize, string jcrcontentqueueBatchMode, decimal? jcrcontentqueueBatchWaitTime, string jcrcontentretryDelay, bool? jcrcontentreverseReplication, string jcrcontentserializationType, string jcrcontentslingresourceType, string jcrcontentssl, string jcrcontenttransportNTLMDomain, string jcrcontenttransportNTLMHost, string jcrcontenttransportPassword, string jcrcontenttransportUri, string jcrcontenttransportUser, bool? jcrcontenttriggerDistribute, bool? jcrcontenttriggerModified, bool? jcrcontenttriggerOnOffTime, bool? jcrcontenttriggerReceive, bool? jcrcontenttriggerSpecific, string jcrcontentuserId, string jcrprimaryType, string operation)
        {
            
            // verify the required parameter 'runmode' is set
            if (runmode == null) throw new ApiException(400, "Missing required parameter 'runmode' when calling PostAgent");
            
            // verify the required parameter 'name' is set
            if (name == null) throw new ApiException(400, "Missing required parameter 'name' when calling PostAgent");
            
    
            var path = "/etc/replication/agents.{runmode}/{name}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "runmode" + "}", ApiClient.ParameterToString(runmode));
path = path.Replace("{" + "name" + "}", ApiClient.ParameterToString(name));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (jcrcontentcqdistribute != null) queryParams.Add("jcr:content/cq:distribute", ApiClient.ParameterToString(jcrcontentcqdistribute)); // query parameter
 if (jcrcontentcqdistributeTypeHint != null) queryParams.Add("jcr:content/cq:distribute@TypeHint", ApiClient.ParameterToString(jcrcontentcqdistributeTypeHint)); // query parameter
 if (jcrcontentcqname != null) queryParams.Add("jcr:content/cq:name", ApiClient.ParameterToString(jcrcontentcqname)); // query parameter
 if (jcrcontentcqtemplate != null) queryParams.Add("jcr:content/cq:template", ApiClient.ParameterToString(jcrcontentcqtemplate)); // query parameter
 if (jcrcontentenabled != null) queryParams.Add("jcr:content/enabled", ApiClient.ParameterToString(jcrcontentenabled)); // query parameter
 if (jcrcontentjcrdescription != null) queryParams.Add("jcr:content/jcr:description", ApiClient.ParameterToString(jcrcontentjcrdescription)); // query parameter
 if (jcrcontentjcrlastModified != null) queryParams.Add("jcr:content/jcr:lastModified", ApiClient.ParameterToString(jcrcontentjcrlastModified)); // query parameter
 if (jcrcontentjcrlastModifiedBy != null) queryParams.Add("jcr:content/jcr:lastModifiedBy", ApiClient.ParameterToString(jcrcontentjcrlastModifiedBy)); // query parameter
 if (jcrcontentjcrmixinTypes != null) queryParams.Add("jcr:content/jcr:mixinTypes", ApiClient.ParameterToString(jcrcontentjcrmixinTypes)); // query parameter
 if (jcrcontentjcrtitle != null) queryParams.Add("jcr:content/jcr:title", ApiClient.ParameterToString(jcrcontentjcrtitle)); // query parameter
 if (jcrcontentlogLevel != null) queryParams.Add("jcr:content/logLevel", ApiClient.ParameterToString(jcrcontentlogLevel)); // query parameter
 if (jcrcontentnoStatusUpdate != null) queryParams.Add("jcr:content/noStatusUpdate", ApiClient.ParameterToString(jcrcontentnoStatusUpdate)); // query parameter
 if (jcrcontentnoVersioning != null) queryParams.Add("jcr:content/noVersioning", ApiClient.ParameterToString(jcrcontentnoVersioning)); // query parameter
 if (jcrcontentprotocolConnectTimeout != null) queryParams.Add("jcr:content/protocolConnectTimeout", ApiClient.ParameterToString(jcrcontentprotocolConnectTimeout)); // query parameter
 if (jcrcontentprotocolHTTPConnectionClosed != null) queryParams.Add("jcr:content/protocolHTTPConnectionClosed", ApiClient.ParameterToString(jcrcontentprotocolHTTPConnectionClosed)); // query parameter
 if (jcrcontentprotocolHTTPExpired != null) queryParams.Add("jcr:content/protocolHTTPExpired", ApiClient.ParameterToString(jcrcontentprotocolHTTPExpired)); // query parameter
 if (jcrcontentprotocolHTTPHeaders != null) queryParams.Add("jcr:content/protocolHTTPHeaders", ApiClient.ParameterToString(jcrcontentprotocolHTTPHeaders)); // query parameter
 if (jcrcontentprotocolHTTPHeadersTypeHint != null) queryParams.Add("jcr:content/protocolHTTPHeaders@TypeHint", ApiClient.ParameterToString(jcrcontentprotocolHTTPHeadersTypeHint)); // query parameter
 if (jcrcontentprotocolHTTPMethod != null) queryParams.Add("jcr:content/protocolHTTPMethod", ApiClient.ParameterToString(jcrcontentprotocolHTTPMethod)); // query parameter
 if (jcrcontentprotocolHTTPSRelaxed != null) queryParams.Add("jcr:content/protocolHTTPSRelaxed", ApiClient.ParameterToString(jcrcontentprotocolHTTPSRelaxed)); // query parameter
 if (jcrcontentprotocolInterface != null) queryParams.Add("jcr:content/protocolInterface", ApiClient.ParameterToString(jcrcontentprotocolInterface)); // query parameter
 if (jcrcontentprotocolSocketTimeout != null) queryParams.Add("jcr:content/protocolSocketTimeout", ApiClient.ParameterToString(jcrcontentprotocolSocketTimeout)); // query parameter
 if (jcrcontentprotocolVersion != null) queryParams.Add("jcr:content/protocolVersion", ApiClient.ParameterToString(jcrcontentprotocolVersion)); // query parameter
 if (jcrcontentproxyNTLMDomain != null) queryParams.Add("jcr:content/proxyNTLMDomain", ApiClient.ParameterToString(jcrcontentproxyNTLMDomain)); // query parameter
 if (jcrcontentproxyNTLMHost != null) queryParams.Add("jcr:content/proxyNTLMHost", ApiClient.ParameterToString(jcrcontentproxyNTLMHost)); // query parameter
 if (jcrcontentproxyHost != null) queryParams.Add("jcr:content/proxyHost", ApiClient.ParameterToString(jcrcontentproxyHost)); // query parameter
 if (jcrcontentproxyPassword != null) queryParams.Add("jcr:content/proxyPassword", ApiClient.ParameterToString(jcrcontentproxyPassword)); // query parameter
 if (jcrcontentproxyPort != null) queryParams.Add("jcr:content/proxyPort", ApiClient.ParameterToString(jcrcontentproxyPort)); // query parameter
 if (jcrcontentproxyUser != null) queryParams.Add("jcr:content/proxyUser", ApiClient.ParameterToString(jcrcontentproxyUser)); // query parameter
 if (jcrcontentqueueBatchMaxSize != null) queryParams.Add("jcr:content/queueBatchMaxSize", ApiClient.ParameterToString(jcrcontentqueueBatchMaxSize)); // query parameter
 if (jcrcontentqueueBatchMode != null) queryParams.Add("jcr:content/queueBatchMode", ApiClient.ParameterToString(jcrcontentqueueBatchMode)); // query parameter
 if (jcrcontentqueueBatchWaitTime != null) queryParams.Add("jcr:content/queueBatchWaitTime", ApiClient.ParameterToString(jcrcontentqueueBatchWaitTime)); // query parameter
 if (jcrcontentretryDelay != null) queryParams.Add("jcr:content/retryDelay", ApiClient.ParameterToString(jcrcontentretryDelay)); // query parameter
 if (jcrcontentreverseReplication != null) queryParams.Add("jcr:content/reverseReplication", ApiClient.ParameterToString(jcrcontentreverseReplication)); // query parameter
 if (jcrcontentserializationType != null) queryParams.Add("jcr:content/serializationType", ApiClient.ParameterToString(jcrcontentserializationType)); // query parameter
 if (jcrcontentslingresourceType != null) queryParams.Add("jcr:content/sling:resourceType", ApiClient.ParameterToString(jcrcontentslingresourceType)); // query parameter
 if (jcrcontentssl != null) queryParams.Add("jcr:content/ssl", ApiClient.ParameterToString(jcrcontentssl)); // query parameter
 if (jcrcontenttransportNTLMDomain != null) queryParams.Add("jcr:content/transportNTLMDomain", ApiClient.ParameterToString(jcrcontenttransportNTLMDomain)); // query parameter
 if (jcrcontenttransportNTLMHost != null) queryParams.Add("jcr:content/transportNTLMHost", ApiClient.ParameterToString(jcrcontenttransportNTLMHost)); // query parameter
 if (jcrcontenttransportPassword != null) queryParams.Add("jcr:content/transportPassword", ApiClient.ParameterToString(jcrcontenttransportPassword)); // query parameter
 if (jcrcontenttransportUri != null) queryParams.Add("jcr:content/transportUri", ApiClient.ParameterToString(jcrcontenttransportUri)); // query parameter
 if (jcrcontenttransportUser != null) queryParams.Add("jcr:content/transportUser", ApiClient.ParameterToString(jcrcontenttransportUser)); // query parameter
 if (jcrcontenttriggerDistribute != null) queryParams.Add("jcr:content/triggerDistribute", ApiClient.ParameterToString(jcrcontenttriggerDistribute)); // query parameter
 if (jcrcontenttriggerModified != null) queryParams.Add("jcr:content/triggerModified", ApiClient.ParameterToString(jcrcontenttriggerModified)); // query parameter
 if (jcrcontenttriggerOnOffTime != null) queryParams.Add("jcr:content/triggerOnOffTime", ApiClient.ParameterToString(jcrcontenttriggerOnOffTime)); // query parameter
 if (jcrcontenttriggerReceive != null) queryParams.Add("jcr:content/triggerReceive", ApiClient.ParameterToString(jcrcontenttriggerReceive)); // query parameter
 if (jcrcontenttriggerSpecific != null) queryParams.Add("jcr:content/triggerSpecific", ApiClient.ParameterToString(jcrcontenttriggerSpecific)); // query parameter
 if (jcrcontentuserId != null) queryParams.Add("jcr:content/userId", ApiClient.ParameterToString(jcrcontentuserId)); // query parameter
 if (jcrprimaryType != null) queryParams.Add("jcr:primaryType", ApiClient.ParameterToString(jcrprimaryType)); // query parameter
 if (operation != null) queryParams.Add(":operation", ApiClient.ParameterToString(operation)); // query parameter
                                        
            // authentication setting, if any
            String[] authSettings = new String[] { "aemAuth" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling PostAgent: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling PostAgent: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
        /// <summary>
        ///  
        /// </summary>
        /// <param name="intermediatePath"></param> 
        /// <param name="authorizableId"></param> 
        /// <param name="operation"></param> 
        /// <param name="currentPassword"></param> 
        /// <param name="newPassword"></param> 
        /// <param name="rePassword"></param> 
        /// <param name="keyPassword"></param> 
        /// <param name="keyStorePass"></param> 
        /// <param name="alias"></param> 
        /// <param name="newAlias"></param> 
        /// <param name="removeAlias"></param> 
        /// <param name="certChain"></param> 
        /// <param name="pk"></param> 
        /// <param name="keyStore"></param> 
        /// <returns>KeystoreInfo</returns>            
        public KeystoreInfo PostAuthorizableKeystore (string intermediatePath, string authorizableId, string operation, string currentPassword, string newPassword, string rePassword, string keyPassword, string keyStorePass, string alias, string newAlias, string removeAlias, System.IO.Stream certChain, System.IO.Stream pk, System.IO.Stream keyStore)
        {
            
            // verify the required parameter 'intermediatePath' is set
            if (intermediatePath == null) throw new ApiException(400, "Missing required parameter 'intermediatePath' when calling PostAuthorizableKeystore");
            
            // verify the required parameter 'authorizableId' is set
            if (authorizableId == null) throw new ApiException(400, "Missing required parameter 'authorizableId' when calling PostAuthorizableKeystore");
            
    
            var path = "/{intermediatePath}/{authorizableId}.ks.html";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "intermediatePath" + "}", ApiClient.ParameterToString(intermediatePath));
path = path.Replace("{" + "authorizableId" + "}", ApiClient.ParameterToString(authorizableId));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (operation != null) queryParams.Add(":operation", ApiClient.ParameterToString(operation)); // query parameter
 if (currentPassword != null) queryParams.Add("currentPassword", ApiClient.ParameterToString(currentPassword)); // query parameter
 if (newPassword != null) queryParams.Add("newPassword", ApiClient.ParameterToString(newPassword)); // query parameter
 if (rePassword != null) queryParams.Add("rePassword", ApiClient.ParameterToString(rePassword)); // query parameter
 if (keyPassword != null) queryParams.Add("keyPassword", ApiClient.ParameterToString(keyPassword)); // query parameter
 if (keyStorePass != null) queryParams.Add("keyStorePass", ApiClient.ParameterToString(keyStorePass)); // query parameter
 if (alias != null) queryParams.Add("alias", ApiClient.ParameterToString(alias)); // query parameter
 if (newAlias != null) queryParams.Add("newAlias", ApiClient.ParameterToString(newAlias)); // query parameter
 if (removeAlias != null) queryParams.Add("removeAlias", ApiClient.ParameterToString(removeAlias)); // query parameter
                        if (certChain != null) fileParams.Add("cert-chain", ApiClient.ParameterToFile("cert-chain", certChain));
if (pk != null) fileParams.Add("pk", ApiClient.ParameterToFile("pk", pk));
if (keyStore != null) fileParams.Add("keyStore", ApiClient.ParameterToFile("keyStore", keyStore));
                
            // authentication setting, if any
            String[] authSettings = new String[] { "aemAuth" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling PostAuthorizableKeystore: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling PostAuthorizableKeystore: " + response.ErrorMessage, response.ErrorMessage);
    
            return (KeystoreInfo) ApiClient.Deserialize(response.Content, typeof(KeystoreInfo), response.Headers);
        }
    
        /// <summary>
        ///  
        /// </summary>
        /// <param name="authorizableId"></param> 
        /// <param name="intermediatePath"></param> 
        /// <param name="createUser"></param> 
        /// <param name="createGroup"></param> 
        /// <param name="reppassword"></param> 
        /// <param name="profilegivenName"></param> 
        /// <returns>string</returns>            
        public string PostAuthorizables (string authorizableId, string intermediatePath, string createUser, string createGroup, string reppassword, string profilegivenName)
        {
            
            // verify the required parameter 'authorizableId' is set
            if (authorizableId == null) throw new ApiException(400, "Missing required parameter 'authorizableId' when calling PostAuthorizables");
            
            // verify the required parameter 'intermediatePath' is set
            if (intermediatePath == null) throw new ApiException(400, "Missing required parameter 'intermediatePath' when calling PostAuthorizables");
            
    
            var path = "/libs/granite/security/post/authorizables";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (authorizableId != null) queryParams.Add("authorizableId", ApiClient.ParameterToString(authorizableId)); // query parameter
 if (intermediatePath != null) queryParams.Add("intermediatePath", ApiClient.ParameterToString(intermediatePath)); // query parameter
 if (createUser != null) queryParams.Add("createUser", ApiClient.ParameterToString(createUser)); // query parameter
 if (createGroup != null) queryParams.Add("createGroup", ApiClient.ParameterToString(createGroup)); // query parameter
 if (reppassword != null) queryParams.Add("rep:password", ApiClient.ParameterToString(reppassword)); // query parameter
 if (profilegivenName != null) queryParams.Add("profile/givenName", ApiClient.ParameterToString(profilegivenName)); // query parameter
                                        
            // authentication setting, if any
            String[] authSettings = new String[] { "aemAuth" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling PostAuthorizables: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling PostAuthorizables: " + response.ErrorMessage, response.ErrorMessage);
    
            return (string) ApiClient.Deserialize(response.Content, typeof(string), response.Headers);
        }
    
        /// <summary>
        ///  
        /// </summary>
        /// <param name="keyStorePassword"></param> 
        /// <param name="keyStorePasswordTypeHint"></param> 
        /// <param name="serviceRanking"></param> 
        /// <param name="serviceRankingTypeHint"></param> 
        /// <param name="idpHttpRedirect"></param> 
        /// <param name="idpHttpRedirectTypeHint"></param> 
        /// <param name="createUser"></param> 
        /// <param name="createUserTypeHint"></param> 
        /// <param name="defaultRedirectUrl"></param> 
        /// <param name="defaultRedirectUrlTypeHint"></param> 
        /// <param name="userIDAttribute"></param> 
        /// <param name="userIDAttributeTypeHint"></param> 
        /// <param name="defaultGroups"></param> 
        /// <param name="defaultGroupsTypeHint"></param> 
        /// <param name="idpCertAlias"></param> 
        /// <param name="idpCertAliasTypeHint"></param> 
        /// <param name="addGroupMemberships"></param> 
        /// <param name="addGroupMembershipsTypeHint"></param> 
        /// <param name="path"></param> 
        /// <param name="pathTypeHint"></param> 
        /// <param name="synchronizeAttributes"></param> 
        /// <param name="synchronizeAttributesTypeHint"></param> 
        /// <param name="clockTolerance"></param> 
        /// <param name="clockToleranceTypeHint"></param> 
        /// <param name="groupMembershipAttribute"></param> 
        /// <param name="groupMembershipAttributeTypeHint"></param> 
        /// <param name="idpUrl"></param> 
        /// <param name="idpUrlTypeHint"></param> 
        /// <param name="logoutUrl"></param> 
        /// <param name="logoutUrlTypeHint"></param> 
        /// <param name="serviceProviderEntityId"></param> 
        /// <param name="serviceProviderEntityIdTypeHint"></param> 
        /// <param name="assertionConsumerServiceURL"></param> 
        /// <param name="assertionConsumerServiceURLTypeHint"></param> 
        /// <param name="handleLogout"></param> 
        /// <param name="handleLogoutTypeHint"></param> 
        /// <param name="spPrivateKeyAlias"></param> 
        /// <param name="spPrivateKeyAliasTypeHint"></param> 
        /// <param name="useEncryption"></param> 
        /// <param name="useEncryptionTypeHint"></param> 
        /// <param name="nameIdFormat"></param> 
        /// <param name="nameIdFormatTypeHint"></param> 
        /// <param name="digestMethod"></param> 
        /// <param name="digestMethodTypeHint"></param> 
        /// <param name="signatureMethod"></param> 
        /// <param name="signatureMethodTypeHint"></param> 
        /// <param name="userIntermediatePath"></param> 
        /// <param name="userIntermediatePathTypeHint"></param> 
        /// <returns></returns>            
        public void PostConfigAdobeGraniteSamlAuthenticationHandler (string keyStorePassword, string keyStorePasswordTypeHint, int? serviceRanking, string serviceRankingTypeHint, bool? idpHttpRedirect, string idpHttpRedirectTypeHint, bool? createUser, string createUserTypeHint, string defaultRedirectUrl, string defaultRedirectUrlTypeHint, string userIDAttribute, string userIDAttributeTypeHint, List<string> defaultGroups, string defaultGroupsTypeHint, string idpCertAlias, string idpCertAliasTypeHint, bool? addGroupMemberships, string addGroupMembershipsTypeHint, List<string> path, string pathTypeHint, List<string> synchronizeAttributes, string synchronizeAttributesTypeHint, int? clockTolerance, string clockToleranceTypeHint, string groupMembershipAttribute, string groupMembershipAttributeTypeHint, string idpUrl, string idpUrlTypeHint, string logoutUrl, string logoutUrlTypeHint, string serviceProviderEntityId, string serviceProviderEntityIdTypeHint, string assertionConsumerServiceURL, string assertionConsumerServiceURLTypeHint, bool? handleLogout, string handleLogoutTypeHint, string spPrivateKeyAlias, string spPrivateKeyAliasTypeHint, bool? useEncryption, string useEncryptionTypeHint, string nameIdFormat, string nameIdFormatTypeHint, string digestMethod, string digestMethodTypeHint, string signatureMethod, string signatureMethodTypeHint, string userIntermediatePath, string userIntermediatePathTypeHint)
        {
            
    
            var path = "/apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (keyStorePassword != null) queryParams.Add("keyStorePassword", ApiClient.ParameterToString(keyStorePassword)); // query parameter
 if (keyStorePasswordTypeHint != null) queryParams.Add("keyStorePassword@TypeHint", ApiClient.ParameterToString(keyStorePasswordTypeHint)); // query parameter
 if (serviceRanking != null) queryParams.Add("service.ranking", ApiClient.ParameterToString(serviceRanking)); // query parameter
 if (serviceRankingTypeHint != null) queryParams.Add("service.ranking@TypeHint", ApiClient.ParameterToString(serviceRankingTypeHint)); // query parameter
 if (idpHttpRedirect != null) queryParams.Add("idpHttpRedirect", ApiClient.ParameterToString(idpHttpRedirect)); // query parameter
 if (idpHttpRedirectTypeHint != null) queryParams.Add("idpHttpRedirect@TypeHint", ApiClient.ParameterToString(idpHttpRedirectTypeHint)); // query parameter
 if (createUser != null) queryParams.Add("createUser", ApiClient.ParameterToString(createUser)); // query parameter
 if (createUserTypeHint != null) queryParams.Add("createUser@TypeHint", ApiClient.ParameterToString(createUserTypeHint)); // query parameter
 if (defaultRedirectUrl != null) queryParams.Add("defaultRedirectUrl", ApiClient.ParameterToString(defaultRedirectUrl)); // query parameter
 if (defaultRedirectUrlTypeHint != null) queryParams.Add("defaultRedirectUrl@TypeHint", ApiClient.ParameterToString(defaultRedirectUrlTypeHint)); // query parameter
 if (userIDAttribute != null) queryParams.Add("userIDAttribute", ApiClient.ParameterToString(userIDAttribute)); // query parameter
 if (userIDAttributeTypeHint != null) queryParams.Add("userIDAttribute@TypeHint", ApiClient.ParameterToString(userIDAttributeTypeHint)); // query parameter
 if (defaultGroups != null) queryParams.Add("defaultGroups", ApiClient.ParameterToString(defaultGroups)); // query parameter
 if (defaultGroupsTypeHint != null) queryParams.Add("defaultGroups@TypeHint", ApiClient.ParameterToString(defaultGroupsTypeHint)); // query parameter
 if (idpCertAlias != null) queryParams.Add("idpCertAlias", ApiClient.ParameterToString(idpCertAlias)); // query parameter
 if (idpCertAliasTypeHint != null) queryParams.Add("idpCertAlias@TypeHint", ApiClient.ParameterToString(idpCertAliasTypeHint)); // query parameter
 if (addGroupMemberships != null) queryParams.Add("addGroupMemberships", ApiClient.ParameterToString(addGroupMemberships)); // query parameter
 if (addGroupMembershipsTypeHint != null) queryParams.Add("addGroupMemberships@TypeHint", ApiClient.ParameterToString(addGroupMembershipsTypeHint)); // query parameter
 if (path != null) queryParams.Add("path", ApiClient.ParameterToString(path)); // query parameter
 if (pathTypeHint != null) queryParams.Add("path@TypeHint", ApiClient.ParameterToString(pathTypeHint)); // query parameter
 if (synchronizeAttributes != null) queryParams.Add("synchronizeAttributes", ApiClient.ParameterToString(synchronizeAttributes)); // query parameter
 if (synchronizeAttributesTypeHint != null) queryParams.Add("synchronizeAttributes@TypeHint", ApiClient.ParameterToString(synchronizeAttributesTypeHint)); // query parameter
 if (clockTolerance != null) queryParams.Add("clockTolerance", ApiClient.ParameterToString(clockTolerance)); // query parameter
 if (clockToleranceTypeHint != null) queryParams.Add("clockTolerance@TypeHint", ApiClient.ParameterToString(clockToleranceTypeHint)); // query parameter
 if (groupMembershipAttribute != null) queryParams.Add("groupMembershipAttribute", ApiClient.ParameterToString(groupMembershipAttribute)); // query parameter
 if (groupMembershipAttributeTypeHint != null) queryParams.Add("groupMembershipAttribute@TypeHint", ApiClient.ParameterToString(groupMembershipAttributeTypeHint)); // query parameter
 if (idpUrl != null) queryParams.Add("idpUrl", ApiClient.ParameterToString(idpUrl)); // query parameter
 if (idpUrlTypeHint != null) queryParams.Add("idpUrl@TypeHint", ApiClient.ParameterToString(idpUrlTypeHint)); // query parameter
 if (logoutUrl != null) queryParams.Add("logoutUrl", ApiClient.ParameterToString(logoutUrl)); // query parameter
 if (logoutUrlTypeHint != null) queryParams.Add("logoutUrl@TypeHint", ApiClient.ParameterToString(logoutUrlTypeHint)); // query parameter
 if (serviceProviderEntityId != null) queryParams.Add("serviceProviderEntityId", ApiClient.ParameterToString(serviceProviderEntityId)); // query parameter
 if (serviceProviderEntityIdTypeHint != null) queryParams.Add("serviceProviderEntityId@TypeHint", ApiClient.ParameterToString(serviceProviderEntityIdTypeHint)); // query parameter
 if (assertionConsumerServiceURL != null) queryParams.Add("assertionConsumerServiceURL", ApiClient.ParameterToString(assertionConsumerServiceURL)); // query parameter
 if (assertionConsumerServiceURLTypeHint != null) queryParams.Add("assertionConsumerServiceURL@TypeHint", ApiClient.ParameterToString(assertionConsumerServiceURLTypeHint)); // query parameter
 if (handleLogout != null) queryParams.Add("handleLogout", ApiClient.ParameterToString(handleLogout)); // query parameter
 if (handleLogoutTypeHint != null) queryParams.Add("handleLogout@TypeHint", ApiClient.ParameterToString(handleLogoutTypeHint)); // query parameter
 if (spPrivateKeyAlias != null) queryParams.Add("spPrivateKeyAlias", ApiClient.ParameterToString(spPrivateKeyAlias)); // query parameter
 if (spPrivateKeyAliasTypeHint != null) queryParams.Add("spPrivateKeyAlias@TypeHint", ApiClient.ParameterToString(spPrivateKeyAliasTypeHint)); // query parameter
 if (useEncryption != null) queryParams.Add("useEncryption", ApiClient.ParameterToString(useEncryption)); // query parameter
 if (useEncryptionTypeHint != null) queryParams.Add("useEncryption@TypeHint", ApiClient.ParameterToString(useEncryptionTypeHint)); // query parameter
 if (nameIdFormat != null) queryParams.Add("nameIdFormat", ApiClient.ParameterToString(nameIdFormat)); // query parameter
 if (nameIdFormatTypeHint != null) queryParams.Add("nameIdFormat@TypeHint", ApiClient.ParameterToString(nameIdFormatTypeHint)); // query parameter
 if (digestMethod != null) queryParams.Add("digestMethod", ApiClient.ParameterToString(digestMethod)); // query parameter
 if (digestMethodTypeHint != null) queryParams.Add("digestMethod@TypeHint", ApiClient.ParameterToString(digestMethodTypeHint)); // query parameter
 if (signatureMethod != null) queryParams.Add("signatureMethod", ApiClient.ParameterToString(signatureMethod)); // query parameter
 if (signatureMethodTypeHint != null) queryParams.Add("signatureMethod@TypeHint", ApiClient.ParameterToString(signatureMethodTypeHint)); // query parameter
 if (userIntermediatePath != null) queryParams.Add("userIntermediatePath", ApiClient.ParameterToString(userIntermediatePath)); // query parameter
 if (userIntermediatePathTypeHint != null) queryParams.Add("userIntermediatePath@TypeHint", ApiClient.ParameterToString(userIntermediatePathTypeHint)); // query parameter
                                        
            // authentication setting, if any
            String[] authSettings = new String[] { "aemAuth" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling PostConfigAdobeGraniteSamlAuthenticationHandler: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling PostConfigAdobeGraniteSamlAuthenticationHandler: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
        /// <summary>
        ///  
        /// </summary>
        /// <param name="orgApacheFelixHttpsNio"></param> 
        /// <param name="orgApacheFelixHttpsNioTypeHint"></param> 
        /// <param name="orgApacheFelixHttpsKeystore"></param> 
        /// <param name="orgApacheFelixHttpsKeystoreTypeHint"></param> 
        /// <param name="orgApacheFelixHttpsKeystorePassword"></param> 
        /// <param name="orgApacheFelixHttpsKeystorePasswordTypeHint"></param> 
        /// <param name="orgApacheFelixHttpsKeystoreKey"></param> 
        /// <param name="orgApacheFelixHttpsKeystoreKeyTypeHint"></param> 
        /// <param name="orgApacheFelixHttpsKeystoreKeyPassword"></param> 
        /// <param name="orgApacheFelixHttpsKeystoreKeyPasswordTypeHint"></param> 
        /// <param name="orgApacheFelixHttpsTruststore"></param> 
        /// <param name="orgApacheFelixHttpsTruststoreTypeHint"></param> 
        /// <param name="orgApacheFelixHttpsTruststorePassword"></param> 
        /// <param name="orgApacheFelixHttpsTruststorePasswordTypeHint"></param> 
        /// <param name="orgApacheFelixHttpsClientcertificate"></param> 
        /// <param name="orgApacheFelixHttpsClientcertificateTypeHint"></param> 
        /// <param name="orgApacheFelixHttpsEnable"></param> 
        /// <param name="orgApacheFelixHttpsEnableTypeHint"></param> 
        /// <param name="orgOsgiServiceHttpPortSecure"></param> 
        /// <param name="orgOsgiServiceHttpPortSecureTypeHint"></param> 
        /// <returns></returns>            
        public void PostConfigApacheFelixJettyBasedHttpService (bool? orgApacheFelixHttpsNio, string orgApacheFelixHttpsNioTypeHint, string orgApacheFelixHttpsKeystore, string orgApacheFelixHttpsKeystoreTypeHint, string orgApacheFelixHttpsKeystorePassword, string orgApacheFelixHttpsKeystorePasswordTypeHint, string orgApacheFelixHttpsKeystoreKey, string orgApacheFelixHttpsKeystoreKeyTypeHint, string orgApacheFelixHttpsKeystoreKeyPassword, string orgApacheFelixHttpsKeystoreKeyPasswordTypeHint, string orgApacheFelixHttpsTruststore, string orgApacheFelixHttpsTruststoreTypeHint, string orgApacheFelixHttpsTruststorePassword, string orgApacheFelixHttpsTruststorePasswordTypeHint, string orgApacheFelixHttpsClientcertificate, string orgApacheFelixHttpsClientcertificateTypeHint, bool? orgApacheFelixHttpsEnable, string orgApacheFelixHttpsEnableTypeHint, string orgOsgiServiceHttpPortSecure, string orgOsgiServiceHttpPortSecureTypeHint)
        {
            
    
            var path = "/apps/system/config/org.apache.felix.http";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (orgApacheFelixHttpsNio != null) queryParams.Add("org.apache.felix.https.nio", ApiClient.ParameterToString(orgApacheFelixHttpsNio)); // query parameter
 if (orgApacheFelixHttpsNioTypeHint != null) queryParams.Add("org.apache.felix.https.nio@TypeHint", ApiClient.ParameterToString(orgApacheFelixHttpsNioTypeHint)); // query parameter
 if (orgApacheFelixHttpsKeystore != null) queryParams.Add("org.apache.felix.https.keystore", ApiClient.ParameterToString(orgApacheFelixHttpsKeystore)); // query parameter
 if (orgApacheFelixHttpsKeystoreTypeHint != null) queryParams.Add("org.apache.felix.https.keystore@TypeHint", ApiClient.ParameterToString(orgApacheFelixHttpsKeystoreTypeHint)); // query parameter
 if (orgApacheFelixHttpsKeystorePassword != null) queryParams.Add("org.apache.felix.https.keystore.password", ApiClient.ParameterToString(orgApacheFelixHttpsKeystorePassword)); // query parameter
 if (orgApacheFelixHttpsKeystorePasswordTypeHint != null) queryParams.Add("org.apache.felix.https.keystore.password@TypeHint", ApiClient.ParameterToString(orgApacheFelixHttpsKeystorePasswordTypeHint)); // query parameter
 if (orgApacheFelixHttpsKeystoreKey != null) queryParams.Add("org.apache.felix.https.keystore.key", ApiClient.ParameterToString(orgApacheFelixHttpsKeystoreKey)); // query parameter
 if (orgApacheFelixHttpsKeystoreKeyTypeHint != null) queryParams.Add("org.apache.felix.https.keystore.key@TypeHint", ApiClient.ParameterToString(orgApacheFelixHttpsKeystoreKeyTypeHint)); // query parameter
 if (orgApacheFelixHttpsKeystoreKeyPassword != null) queryParams.Add("org.apache.felix.https.keystore.key.password", ApiClient.ParameterToString(orgApacheFelixHttpsKeystoreKeyPassword)); // query parameter
 if (orgApacheFelixHttpsKeystoreKeyPasswordTypeHint != null) queryParams.Add("org.apache.felix.https.keystore.key.password@TypeHint", ApiClient.ParameterToString(orgApacheFelixHttpsKeystoreKeyPasswordTypeHint)); // query parameter
 if (orgApacheFelixHttpsTruststore != null) queryParams.Add("org.apache.felix.https.truststore", ApiClient.ParameterToString(orgApacheFelixHttpsTruststore)); // query parameter
 if (orgApacheFelixHttpsTruststoreTypeHint != null) queryParams.Add("org.apache.felix.https.truststore@TypeHint", ApiClient.ParameterToString(orgApacheFelixHttpsTruststoreTypeHint)); // query parameter
 if (orgApacheFelixHttpsTruststorePassword != null) queryParams.Add("org.apache.felix.https.truststore.password", ApiClient.ParameterToString(orgApacheFelixHttpsTruststorePassword)); // query parameter
 if (orgApacheFelixHttpsTruststorePasswordTypeHint != null) queryParams.Add("org.apache.felix.https.truststore.password@TypeHint", ApiClient.ParameterToString(orgApacheFelixHttpsTruststorePasswordTypeHint)); // query parameter
 if (orgApacheFelixHttpsClientcertificate != null) queryParams.Add("org.apache.felix.https.clientcertificate", ApiClient.ParameterToString(orgApacheFelixHttpsClientcertificate)); // query parameter
 if (orgApacheFelixHttpsClientcertificateTypeHint != null) queryParams.Add("org.apache.felix.https.clientcertificate@TypeHint", ApiClient.ParameterToString(orgApacheFelixHttpsClientcertificateTypeHint)); // query parameter
 if (orgApacheFelixHttpsEnable != null) queryParams.Add("org.apache.felix.https.enable", ApiClient.ParameterToString(orgApacheFelixHttpsEnable)); // query parameter
 if (orgApacheFelixHttpsEnableTypeHint != null) queryParams.Add("org.apache.felix.https.enable@TypeHint", ApiClient.ParameterToString(orgApacheFelixHttpsEnableTypeHint)); // query parameter
 if (orgOsgiServiceHttpPortSecure != null) queryParams.Add("org.osgi.service.http.port.secure", ApiClient.ParameterToString(orgOsgiServiceHttpPortSecure)); // query parameter
 if (orgOsgiServiceHttpPortSecureTypeHint != null) queryParams.Add("org.osgi.service.http.port.secure@TypeHint", ApiClient.ParameterToString(orgOsgiServiceHttpPortSecureTypeHint)); // query parameter
                                        
            // authentication setting, if any
            String[] authSettings = new String[] { "aemAuth" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling PostConfigApacheFelixJettyBasedHttpService: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling PostConfigApacheFelixJettyBasedHttpService: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
        /// <summary>
        ///  
        /// </summary>
        /// <param name="proxyHost"></param> 
        /// <param name="proxyHostTypeHint"></param> 
        /// <param name="proxyPort"></param> 
        /// <param name="proxyPortTypeHint"></param> 
        /// <param name="proxyExceptions"></param> 
        /// <param name="proxyExceptionsTypeHint"></param> 
        /// <param name="proxyEnabled"></param> 
        /// <param name="proxyEnabledTypeHint"></param> 
        /// <param name="proxyUser"></param> 
        /// <param name="proxyUserTypeHint"></param> 
        /// <param name="proxyPassword"></param> 
        /// <param name="proxyPasswordTypeHint"></param> 
        /// <returns></returns>            
        public void PostConfigApacheHttpComponentsProxyConfiguration (string proxyHost, string proxyHostTypeHint, int? proxyPort, string proxyPortTypeHint, List<string> proxyExceptions, string proxyExceptionsTypeHint, bool? proxyEnabled, string proxyEnabledTypeHint, string proxyUser, string proxyUserTypeHint, string proxyPassword, string proxyPasswordTypeHint)
        {
            
    
            var path = "/apps/system/config/org.apache.http.proxyconfigurator.config";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (proxyHost != null) queryParams.Add("proxy.host", ApiClient.ParameterToString(proxyHost)); // query parameter
 if (proxyHostTypeHint != null) queryParams.Add("proxy.host@TypeHint", ApiClient.ParameterToString(proxyHostTypeHint)); // query parameter
 if (proxyPort != null) queryParams.Add("proxy.port", ApiClient.ParameterToString(proxyPort)); // query parameter
 if (proxyPortTypeHint != null) queryParams.Add("proxy.port@TypeHint", ApiClient.ParameterToString(proxyPortTypeHint)); // query parameter
 if (proxyExceptions != null) queryParams.Add("proxy.exceptions", ApiClient.ParameterToString(proxyExceptions)); // query parameter
 if (proxyExceptionsTypeHint != null) queryParams.Add("proxy.exceptions@TypeHint", ApiClient.ParameterToString(proxyExceptionsTypeHint)); // query parameter
 if (proxyEnabled != null) queryParams.Add("proxy.enabled", ApiClient.ParameterToString(proxyEnabled)); // query parameter
 if (proxyEnabledTypeHint != null) queryParams.Add("proxy.enabled@TypeHint", ApiClient.ParameterToString(proxyEnabledTypeHint)); // query parameter
 if (proxyUser != null) queryParams.Add("proxy.user", ApiClient.ParameterToString(proxyUser)); // query parameter
 if (proxyUserTypeHint != null) queryParams.Add("proxy.user@TypeHint", ApiClient.ParameterToString(proxyUserTypeHint)); // query parameter
 if (proxyPassword != null) queryParams.Add("proxy.password", ApiClient.ParameterToString(proxyPassword)); // query parameter
 if (proxyPasswordTypeHint != null) queryParams.Add("proxy.password@TypeHint", ApiClient.ParameterToString(proxyPasswordTypeHint)); // query parameter
                                        
            // authentication setting, if any
            String[] authSettings = new String[] { "aemAuth" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling PostConfigApacheHttpComponentsProxyConfiguration: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling PostConfigApacheHttpComponentsProxyConfiguration: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
        /// <summary>
        ///  
        /// </summary>
        /// <param name="alias"></param> 
        /// <param name="aliasTypeHint"></param> 
        /// <param name="davCreateAbsoluteUri"></param> 
        /// <param name="davCreateAbsoluteUriTypeHint"></param> 
        /// <returns></returns>            
        public void PostConfigApacheSlingDavExServlet (string alias, string aliasTypeHint, bool? davCreateAbsoluteUri, string davCreateAbsoluteUriTypeHint)
        {
            
    
            var path = "/apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (alias != null) queryParams.Add("alias", ApiClient.ParameterToString(alias)); // query parameter
 if (aliasTypeHint != null) queryParams.Add("alias@TypeHint", ApiClient.ParameterToString(aliasTypeHint)); // query parameter
 if (davCreateAbsoluteUri != null) queryParams.Add("dav.create-absolute-uri", ApiClient.ParameterToString(davCreateAbsoluteUri)); // query parameter
 if (davCreateAbsoluteUriTypeHint != null) queryParams.Add("dav.create-absolute-uri@TypeHint", ApiClient.ParameterToString(davCreateAbsoluteUriTypeHint)); // query parameter
                                        
            // authentication setting, if any
            String[] authSettings = new String[] { "aemAuth" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling PostConfigApacheSlingDavExServlet: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling PostConfigApacheSlingDavExServlet: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
        /// <summary>
        ///  
        /// </summary>
        /// <param name="jsonMaximumresults"></param> 
        /// <param name="jsonMaximumresultsTypeHint"></param> 
        /// <param name="enableHtml"></param> 
        /// <param name="enableHtmlTypeHint"></param> 
        /// <param name="enableTxt"></param> 
        /// <param name="enableTxtTypeHint"></param> 
        /// <param name="enableXml"></param> 
        /// <param name="enableXmlTypeHint"></param> 
        /// <returns></returns>            
        public void PostConfigApacheSlingGetServlet (string jsonMaximumresults, string jsonMaximumresultsTypeHint, bool? enableHtml, string enableHtmlTypeHint, bool? enableTxt, string enableTxtTypeHint, bool? enableXml, string enableXmlTypeHint)
        {
            
    
            var path = "/apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (jsonMaximumresults != null) queryParams.Add("json.maximumresults", ApiClient.ParameterToString(jsonMaximumresults)); // query parameter
 if (jsonMaximumresultsTypeHint != null) queryParams.Add("json.maximumresults@TypeHint", ApiClient.ParameterToString(jsonMaximumresultsTypeHint)); // query parameter
 if (enableHtml != null) queryParams.Add("enable.html", ApiClient.ParameterToString(enableHtml)); // query parameter
 if (enableHtmlTypeHint != null) queryParams.Add("enable.html@TypeHint", ApiClient.ParameterToString(enableHtmlTypeHint)); // query parameter
 if (enableTxt != null) queryParams.Add("enable.txt", ApiClient.ParameterToString(enableTxt)); // query parameter
 if (enableTxtTypeHint != null) queryParams.Add("enable.txt@TypeHint", ApiClient.ParameterToString(enableTxtTypeHint)); // query parameter
 if (enableXml != null) queryParams.Add("enable.xml", ApiClient.ParameterToString(enableXml)); // query parameter
 if (enableXmlTypeHint != null) queryParams.Add("enable.xml@TypeHint", ApiClient.ParameterToString(enableXmlTypeHint)); // query parameter
                                        
            // authentication setting, if any
            String[] authSettings = new String[] { "aemAuth" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling PostConfigApacheSlingGetServlet: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling PostConfigApacheSlingGetServlet: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
        /// <summary>
        ///  
        /// </summary>
        /// <param name="allowEmpty"></param> 
        /// <param name="allowEmptyTypeHint"></param> 
        /// <param name="allowHosts"></param> 
        /// <param name="allowHostsTypeHint"></param> 
        /// <param name="allowHostsRegexp"></param> 
        /// <param name="allowHostsRegexpTypeHint"></param> 
        /// <param name="filterMethods"></param> 
        /// <param name="filterMethodsTypeHint"></param> 
        /// <returns></returns>            
        public void PostConfigApacheSlingReferrerFilter (bool? allowEmpty, string allowEmptyTypeHint, string allowHosts, string allowHostsTypeHint, string allowHostsRegexp, string allowHostsRegexpTypeHint, string filterMethods, string filterMethodsTypeHint)
        {
            
    
            var path = "/apps/system/config/org.apache.sling.security.impl.ReferrerFilter";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (allowEmpty != null) queryParams.Add("allow.empty", ApiClient.ParameterToString(allowEmpty)); // query parameter
 if (allowEmptyTypeHint != null) queryParams.Add("allow.empty@TypeHint", ApiClient.ParameterToString(allowEmptyTypeHint)); // query parameter
 if (allowHosts != null) queryParams.Add("allow.hosts", ApiClient.ParameterToString(allowHosts)); // query parameter
 if (allowHostsTypeHint != null) queryParams.Add("allow.hosts@TypeHint", ApiClient.ParameterToString(allowHostsTypeHint)); // query parameter
 if (allowHostsRegexp != null) queryParams.Add("allow.hosts.regexp", ApiClient.ParameterToString(allowHostsRegexp)); // query parameter
 if (allowHostsRegexpTypeHint != null) queryParams.Add("allow.hosts.regexp@TypeHint", ApiClient.ParameterToString(allowHostsRegexpTypeHint)); // query parameter
 if (filterMethods != null) queryParams.Add("filter.methods", ApiClient.ParameterToString(filterMethods)); // query parameter
 if (filterMethodsTypeHint != null) queryParams.Add("filter.methods@TypeHint", ApiClient.ParameterToString(filterMethodsTypeHint)); // query parameter
                                        
            // authentication setting, if any
            String[] authSettings = new String[] { "aemAuth" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling PostConfigApacheSlingReferrerFilter: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling PostConfigApacheSlingReferrerFilter: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
        /// <summary>
        ///  
        /// </summary>
        /// <param name="path"></param> 
        /// <param name="name"></param> 
        /// <param name="operation"></param> 
        /// <param name="deleteAuthorizable"></param> 
        /// <param name="file"></param> 
        /// <returns></returns>            
        public void PostNode (string path, string name, string operation, string deleteAuthorizable, System.IO.Stream file)
        {
            
            // verify the required parameter 'path' is set
            if (path == null) throw new ApiException(400, "Missing required parameter 'path' when calling PostNode");
            
            // verify the required parameter 'name' is set
            if (name == null) throw new ApiException(400, "Missing required parameter 'name' when calling PostNode");
            
    
            var path = "/{path}/{name}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "path" + "}", ApiClient.ParameterToString(path));
path = path.Replace("{" + "name" + "}", ApiClient.ParameterToString(name));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (operation != null) queryParams.Add(":operation", ApiClient.ParameterToString(operation)); // query parameter
 if (deleteAuthorizable != null) queryParams.Add("deleteAuthorizable", ApiClient.ParameterToString(deleteAuthorizable)); // query parameter
                        if (file != null) fileParams.Add("file", ApiClient.ParameterToFile("file", file));
                
            // authentication setting, if any
            String[] authSettings = new String[] { "aemAuth" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling PostNode: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling PostNode: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
        /// <summary>
        ///  
        /// </summary>
        /// <param name="path"></param> 
        /// <param name="name"></param> 
        /// <param name="addMembers"></param> 
        /// <returns></returns>            
        public void PostNodeRw (string path, string name, string addMembers)
        {
            
            // verify the required parameter 'path' is set
            if (path == null) throw new ApiException(400, "Missing required parameter 'path' when calling PostNodeRw");
            
            // verify the required parameter 'name' is set
            if (name == null) throw new ApiException(400, "Missing required parameter 'name' when calling PostNodeRw");
            
    
            var path = "/{path}/{name}.rw.html";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "path" + "}", ApiClient.ParameterToString(path));
path = path.Replace("{" + "name" + "}", ApiClient.ParameterToString(name));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (addMembers != null) queryParams.Add("addMembers", ApiClient.ParameterToString(addMembers)); // query parameter
                                        
            // authentication setting, if any
            String[] authSettings = new String[] { "aemAuth" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling PostNodeRw: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling PostNodeRw: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
        /// <summary>
        ///  
        /// </summary>
        /// <param name="path"></param> 
        /// <param name="jcrprimaryType"></param> 
        /// <param name="name"></param> 
        /// <returns></returns>            
        public void PostPath (string path, string jcrprimaryType, string name)
        {
            
            // verify the required parameter 'path' is set
            if (path == null) throw new ApiException(400, "Missing required parameter 'path' when calling PostPath");
            
            // verify the required parameter 'jcrprimaryType' is set
            if (jcrprimaryType == null) throw new ApiException(400, "Missing required parameter 'jcrprimaryType' when calling PostPath");
            
            // verify the required parameter 'name' is set
            if (name == null) throw new ApiException(400, "Missing required parameter 'name' when calling PostPath");
            
    
            var path = "/{path}/";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "path" + "}", ApiClient.ParameterToString(path));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (jcrprimaryType != null) queryParams.Add("jcr:primaryType", ApiClient.ParameterToString(jcrprimaryType)); // query parameter
 if (name != null) queryParams.Add(":name", ApiClient.ParameterToString(name)); // query parameter
                                        
            // authentication setting, if any
            String[] authSettings = new String[] { "aemAuth" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling PostPath: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling PostPath: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
        /// <summary>
        ///  
        /// </summary>
        /// <param name="path"></param> 
        /// <param name="pLimit"></param> 
        /// <param name="_1property"></param> 
        /// <param name="_1propertyValue"></param> 
        /// <returns>string</returns>            
        public string PostQuery (string path, decimal? pLimit, string _1property, string _1propertyValue)
        {
            
            // verify the required parameter 'path' is set
            if (path == null) throw new ApiException(400, "Missing required parameter 'path' when calling PostQuery");
            
            // verify the required parameter 'pLimit' is set
            if (pLimit == null) throw new ApiException(400, "Missing required parameter 'pLimit' when calling PostQuery");
            
            // verify the required parameter '_1property' is set
            if (_1property == null) throw new ApiException(400, "Missing required parameter '_1property' when calling PostQuery");
            
            // verify the required parameter '_1propertyValue' is set
            if (_1propertyValue == null) throw new ApiException(400, "Missing required parameter '_1propertyValue' when calling PostQuery");
            
    
            var path = "/bin/querybuilder.json";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (path != null) queryParams.Add("path", ApiClient.ParameterToString(path)); // query parameter
 if (pLimit != null) queryParams.Add("p.limit", ApiClient.ParameterToString(pLimit)); // query parameter
 if (_1property != null) queryParams.Add("1_property", ApiClient.ParameterToString(_1property)); // query parameter
 if (_1propertyValue != null) queryParams.Add("1_property.value", ApiClient.ParameterToString(_1propertyValue)); // query parameter
                                        
            // authentication setting, if any
            String[] authSettings = new String[] { "aemAuth" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling PostQuery: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling PostQuery: " + response.ErrorMessage, response.ErrorMessage);
    
            return (string) ApiClient.Deserialize(response.Content, typeof(string), response.Headers);
        }
    
        /// <summary>
        ///  
        /// </summary>
        /// <param name="ignoredeactivated"></param> 
        /// <param name="onlymodified"></param> 
        /// <param name="path"></param> 
        /// <returns></returns>            
        public void PostTreeActivation (bool? ignoredeactivated, bool? onlymodified, string path)
        {
            
            // verify the required parameter 'ignoredeactivated' is set
            if (ignoredeactivated == null) throw new ApiException(400, "Missing required parameter 'ignoredeactivated' when calling PostTreeActivation");
            
            // verify the required parameter 'onlymodified' is set
            if (onlymodified == null) throw new ApiException(400, "Missing required parameter 'onlymodified' when calling PostTreeActivation");
            
            // verify the required parameter 'path' is set
            if (path == null) throw new ApiException(400, "Missing required parameter 'path' when calling PostTreeActivation");
            
    
            var path = "/etc/replication/treeactivation.html";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (ignoredeactivated != null) queryParams.Add("ignoredeactivated", ApiClient.ParameterToString(ignoredeactivated)); // query parameter
 if (onlymodified != null) queryParams.Add("onlymodified", ApiClient.ParameterToString(onlymodified)); // query parameter
 if (path != null) queryParams.Add("path", ApiClient.ParameterToString(path)); // query parameter
                                        
            // authentication setting, if any
            String[] authSettings = new String[] { "aemAuth" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling PostTreeActivation: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling PostTreeActivation: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
        /// <summary>
        ///  
        /// </summary>
        /// <param name="operation"></param> 
        /// <param name="newPassword"></param> 
        /// <param name="rePassword"></param> 
        /// <param name="keyStoreType"></param> 
        /// <param name="removeAlias"></param> 
        /// <param name="certificate"></param> 
        /// <returns>string</returns>            
        public string PostTruststore (string operation, string newPassword, string rePassword, string keyStoreType, string removeAlias, System.IO.Stream certificate)
        {
            
    
            var path = "/libs/granite/security/post/truststore";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (operation != null) queryParams.Add(":operation", ApiClient.ParameterToString(operation)); // query parameter
 if (newPassword != null) queryParams.Add("newPassword", ApiClient.ParameterToString(newPassword)); // query parameter
 if (rePassword != null) queryParams.Add("rePassword", ApiClient.ParameterToString(rePassword)); // query parameter
 if (keyStoreType != null) queryParams.Add("keyStoreType", ApiClient.ParameterToString(keyStoreType)); // query parameter
 if (removeAlias != null) queryParams.Add("removeAlias", ApiClient.ParameterToString(removeAlias)); // query parameter
                        if (certificate != null) fileParams.Add("certificate", ApiClient.ParameterToFile("certificate", certificate));
                
            // authentication setting, if any
            String[] authSettings = new String[] { "aemAuth" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling PostTruststore: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling PostTruststore: " + response.ErrorMessage, response.ErrorMessage);
    
            return (string) ApiClient.Deserialize(response.Content, typeof(string), response.Headers);
        }
    
        /// <summary>
        ///  
        /// </summary>
        /// <param name="truststoreP12"></param> 
        /// <returns>string</returns>            
        public string PostTruststorePKCS12 (System.IO.Stream truststoreP12)
        {
            
    
            var path = "/etc/truststore";
            path = path.Replace("{format}", "json");
                
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                    if (truststoreP12 != null) fileParams.Add("truststore.p12", ApiClient.ParameterToFile("truststore.p12", truststoreP12));
                
            // authentication setting, if any
            String[] authSettings = new String[] { "aemAuth" };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling PostTruststorePKCS12: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling PostTruststorePKCS12: " + response.ErrorMessage, response.ErrorMessage);
    
            return (string) ApiClient.Deserialize(response.Content, typeof(string), response.Headers);
        }
    
    }
}
