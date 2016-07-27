package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import com.shinesolutions.swaggeraem4j.ApiException;
import com.shinesolutions.swaggeraem4j.ApiClient;
import com.shinesolutions.swaggeraem4j.Configuration;
import com.shinesolutions.swaggeraem4j.Pair;

import java.io.File;
import java.math.BigDecimal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-28T01:11:33.794+10:00")
public class SlingApi {
  private ApiClient apiClient;

  public SlingApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SlingApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * 
   * 
   * @param runmode  (required)
   * @param name  (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteAgent(String runmode, String name) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'runmode' is set
    if (runmode == null) {
      throw new ApiException(400, "Missing the required parameter 'runmode' when calling deleteAgent");
    }
    
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling deleteAgent");
    }
    
    // create path and map variables
    String localVarPath = "/etc/replication/agents.{runmode}/{name}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "runmode" + "\\}", apiClient.escapeString(runmode.toString()))
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "text/plain"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "aemAuth" };

    
    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    
  }
  
  /**
   * 
   * 
   * @param path  (required)
   * @param name  (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteNode(String path, String name) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'path' is set
    if (path == null) {
      throw new ApiException(400, "Missing the required parameter 'path' when calling deleteNode");
    }
    
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling deleteNode");
    }
    
    // create path and map variables
    String localVarPath = "/{path}/{name}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "path" + "\\}", apiClient.escapeString(path.toString()))
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "text/plain"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "aemAuth" };

    
    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    
  }
  
  /**
   * 
   * 
   * @param runmode  (required)
   * @param name  (required)
   * @throws ApiException if fails to make API call
   */
  public void getAgent(String runmode, String name) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'runmode' is set
    if (runmode == null) {
      throw new ApiException(400, "Missing the required parameter 'runmode' when calling getAgent");
    }
    
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling getAgent");
    }
    
    // create path and map variables
    String localVarPath = "/etc/replication/agents.{runmode}/{name}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "runmode" + "\\}", apiClient.escapeString(runmode.toString()))
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "text/plain"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "aemAuth" };

    
    apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    
  }
  
  /**
   * 
   * 
   * @param path  (required)
   * @param name  (required)
   * @throws ApiException if fails to make API call
   */
  public void getNode(String path, String name) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'path' is set
    if (path == null) {
      throw new ApiException(400, "Missing the required parameter 'path' when calling getNode");
    }
    
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling getNode");
    }
    
    // create path and map variables
    String localVarPath = "/{path}/{name}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "path" + "\\}", apiClient.escapeString(path.toString()))
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "text/plain"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "aemAuth" };

    
    apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    
  }
  
  /**
   * 
   * 
   * @param group  (required)
   * @param name  (required)
   * @param version  (required)
   * @return File
   * @throws ApiException if fails to make API call
   */
  public File getPackage(String group, String name, String version) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'group' is set
    if (group == null) {
      throw new ApiException(400, "Missing the required parameter 'group' when calling getPackage");
    }
    
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling getPackage");
    }
    
    // verify the required parameter 'version' is set
    if (version == null) {
      throw new ApiException(400, "Missing the required parameter 'version' when calling getPackage");
    }
    
    // create path and map variables
    String localVarPath = "/etc/packages/{group}/{name}-{version}.zip".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "group" + "\\}", apiClient.escapeString(group.toString()))
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "version" + "\\}", apiClient.escapeString(version.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/octet-stream"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "aemAuth" };

    
    GenericType<File> localVarReturnType = new GenericType<File>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * 
   * 
   * @param group  (required)
   * @param name  (required)
   * @param version  (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String getPackageFilter(String group, String name, String version) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'group' is set
    if (group == null) {
      throw new ApiException(400, "Missing the required parameter 'group' when calling getPackageFilter");
    }
    
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling getPackageFilter");
    }
    
    // verify the required parameter 'version' is set
    if (version == null) {
      throw new ApiException(400, "Missing the required parameter 'version' when calling getPackageFilter");
    }
    
    // create path and map variables
    String localVarPath = "/etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "group" + "\\}", apiClient.escapeString(group.toString()))
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "version" + "\\}", apiClient.escapeString(version.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "aemAuth" };

    
    GenericType<String> localVarReturnType = new GenericType<String>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * 
   * 
   * @param runmode  (required)
   * @param name  (required)
   * @param jcrprimaryType  (optional)
   * @param jcrcontentcqname  (optional)
   * @param jcrcontentjcrtitle  (optional)
   * @param jcrcontentjcrdescription  (optional)
   * @param jcrcontentslingresourceType  (optional)
   * @param jcrcontenttransportUri  (optional)
   * @param jcrcontentlogLevel  (optional)
   * @param jcrcontentnoVersioning  (optional)
   * @param jcrcontentprotocolHTTPHeaders  (optional)
   * @param jcrcontentprotocolHTTPHeadersTypeHint  (optional)
   * @param jcrcontentprotocolHTTPMethod  (optional)
   * @param jcrcontentretryDelay  (optional)
   * @param jcrcontentserializationType  (optional)
   * @param jcrcontentjcrmixinTypes  (optional)
   * @param jcrcontenttriggerReceive  (optional)
   * @param jcrcontenttriggerSpecific  (optional)
   * @param jcrcontentcqtemplate  (optional)
   * @param jcrcontentenabled  (optional)
   * @throws ApiException if fails to make API call
   */
  public void postAgent(String runmode, String name, String jcrprimaryType, String jcrcontentcqname, String jcrcontentjcrtitle, String jcrcontentjcrdescription, String jcrcontentslingresourceType, String jcrcontenttransportUri, String jcrcontentlogLevel, Boolean jcrcontentnoVersioning, List<String> jcrcontentprotocolHTTPHeaders, String jcrcontentprotocolHTTPHeadersTypeHint, String jcrcontentprotocolHTTPMethod, String jcrcontentretryDelay, String jcrcontentserializationType, String jcrcontentjcrmixinTypes, Boolean jcrcontenttriggerReceive, Boolean jcrcontenttriggerSpecific, String jcrcontentcqtemplate, Boolean jcrcontentenabled) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'runmode' is set
    if (runmode == null) {
      throw new ApiException(400, "Missing the required parameter 'runmode' when calling postAgent");
    }
    
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling postAgent");
    }
    
    // create path and map variables
    String localVarPath = "/etc/replication/agents.{runmode}/{name}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "runmode" + "\\}", apiClient.escapeString(runmode.toString()))
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "jcr:primaryType", jcrprimaryType));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "jcr:content/cq:name", jcrcontentcqname));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "jcr:content/jcr:title", jcrcontentjcrtitle));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "jcr:content/jcr:description", jcrcontentjcrdescription));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "jcr:content/sling:resourceType", jcrcontentslingresourceType));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "jcr:content/transportUri", jcrcontenttransportUri));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "jcr:content/logLevel", jcrcontentlogLevel));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "jcr:content/noVersioning", jcrcontentnoVersioning));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "jcr:content/protocolHTTPHeaders", jcrcontentprotocolHTTPHeaders));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "jcr:content/protocolHTTPHeaders@TypeHint", jcrcontentprotocolHTTPHeadersTypeHint));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "jcr:content/protocolHTTPMethod", jcrcontentprotocolHTTPMethod));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "jcr:content/retryDelay", jcrcontentretryDelay));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "jcr:content/serializationType", jcrcontentserializationType));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "jcr:content/jcr:mixinTypes", jcrcontentjcrmixinTypes));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "jcr:content/triggerReceive", jcrcontenttriggerReceive));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "jcr:content/triggerSpecific", jcrcontenttriggerSpecific));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "jcr:content/cq:template", jcrcontentcqtemplate));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "jcr:content/enabled", jcrcontentenabled));
    

    

    

    final String[] localVarAccepts = {
      "text/plain"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "aemAuth" };

    
    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    
  }
  
  /**
   * 
   * 
   * @param authorizableId  (required)
   * @param intermediatePath  (required)
   * @param createUser  (optional)
   * @param createGroup  (optional)
   * @param reppassword  (optional)
   * @param profilegivenName  (optional)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String postAuthorizables(String authorizableId, String intermediatePath, String createUser, String createGroup, String reppassword, String profilegivenName) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'authorizableId' is set
    if (authorizableId == null) {
      throw new ApiException(400, "Missing the required parameter 'authorizableId' when calling postAuthorizables");
    }
    
    // verify the required parameter 'intermediatePath' is set
    if (intermediatePath == null) {
      throw new ApiException(400, "Missing the required parameter 'intermediatePath' when calling postAuthorizables");
    }
    
    // create path and map variables
    String localVarPath = "/libs/granite/security/post/authorizables".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "authorizableId", authorizableId));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "intermediatePath", intermediatePath));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "createUser", createUser));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "createGroup", createGroup));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "rep:password", reppassword));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "profile/givenName", profilegivenName));
    

    

    

    final String[] localVarAccepts = {
      "text/html"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "aemAuth" };

    
    GenericType<String> localVarReturnType = new GenericType<String>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * 
   * 
   * @param runmode  (required)
   * @param name  (required)
   * @param orgApacheFelixHttpsNio  (optional)
   * @param orgApacheFelixHttpsNioTypeHint  (optional)
   * @param orgApacheFelixHttpsKeystore  (optional)
   * @param orgApacheFelixHttpsKeystoreTypeHint  (optional)
   * @param orgApacheFelixHttpsKeystorePassword  (optional)
   * @param orgApacheFelixHttpsKeystorePasswordTypeHint  (optional)
   * @param orgApacheFelixHttpsKeystoreKey  (optional)
   * @param orgApacheFelixHttpsKeystoreKeyTypeHint  (optional)
   * @param orgApacheFelixHttpsKeystoreKeyPassword  (optional)
   * @param orgApacheFelixHttpsKeystoreKeyPasswordTypeHint  (optional)
   * @param orgApacheFelixHttpsTruststore  (optional)
   * @param orgApacheFelixHttpsTruststoreTypeHint  (optional)
   * @param orgApacheFelixHttpsTruststorePassword  (optional)
   * @param orgApacheFelixHttpsTruststorePasswordTypeHint  (optional)
   * @param orgApacheFelixHttpsClientcertificate  (optional)
   * @param orgApacheFelixHttpsClientcertificateTypeHint  (optional)
   * @param orgApacheFelixHttpsEnable  (optional)
   * @param orgApacheFelixHttpsEnableTypeHint  (optional)
   * @param orgOsgiServiceHttpPortSecure  (optional)
   * @param orgOsgiServiceHttpPortSecureTypeHint  (optional)
   * @throws ApiException if fails to make API call
   */
  public void postConfig(String runmode, String name, Boolean orgApacheFelixHttpsNio, String orgApacheFelixHttpsNioTypeHint, String orgApacheFelixHttpsKeystore, String orgApacheFelixHttpsKeystoreTypeHint, String orgApacheFelixHttpsKeystorePassword, String orgApacheFelixHttpsKeystorePasswordTypeHint, String orgApacheFelixHttpsKeystoreKey, String orgApacheFelixHttpsKeystoreKeyTypeHint, String orgApacheFelixHttpsKeystoreKeyPassword, String orgApacheFelixHttpsKeystoreKeyPasswordTypeHint, String orgApacheFelixHttpsTruststore, String orgApacheFelixHttpsTruststoreTypeHint, String orgApacheFelixHttpsTruststorePassword, String orgApacheFelixHttpsTruststorePasswordTypeHint, String orgApacheFelixHttpsClientcertificate, String orgApacheFelixHttpsClientcertificateTypeHint, String orgApacheFelixHttpsEnable, String orgApacheFelixHttpsEnableTypeHint, String orgOsgiServiceHttpPortSecure, String orgOsgiServiceHttpPortSecureTypeHint) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'runmode' is set
    if (runmode == null) {
      throw new ApiException(400, "Missing the required parameter 'runmode' when calling postConfig");
    }
    
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling postConfig");
    }
    
    // create path and map variables
    String localVarPath = "/apps/system/config.{runmode}/{name}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "runmode" + "\\}", apiClient.escapeString(runmode.toString()))
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "org.apache.felix.https.nio", orgApacheFelixHttpsNio));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "org.apache.felix.https.nio@TypeHint", orgApacheFelixHttpsNioTypeHint));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "org.apache.felix.https.keystore", orgApacheFelixHttpsKeystore));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "org.apache.felix.https.keystore@TypeHint", orgApacheFelixHttpsKeystoreTypeHint));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "org.apache.felix.https.keystore.password", orgApacheFelixHttpsKeystorePassword));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "org.apache.felix.https.keystore.password@TypeHint", orgApacheFelixHttpsKeystorePasswordTypeHint));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "org.apache.felix.https.keystore.key", orgApacheFelixHttpsKeystoreKey));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "org.apache.felix.https.keystore.key@TypeHint", orgApacheFelixHttpsKeystoreKeyTypeHint));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "org.apache.felix.https.keystore.key.password", orgApacheFelixHttpsKeystoreKeyPassword));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "org.apache.felix.https.keystore.key.password@TypeHint", orgApacheFelixHttpsKeystoreKeyPasswordTypeHint));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "org.apache.felix.https.truststore", orgApacheFelixHttpsTruststore));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "org.apache.felix.https.truststore@TypeHint", orgApacheFelixHttpsTruststoreTypeHint));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "org.apache.felix.https.truststore.password", orgApacheFelixHttpsTruststorePassword));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "org.apache.felix.https.truststore.password@TypeHint", orgApacheFelixHttpsTruststorePasswordTypeHint));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "org.apache.felix.https.clientcertificate", orgApacheFelixHttpsClientcertificate));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "org.apache.felix.https.clientcertificate@TypeHint", orgApacheFelixHttpsClientcertificateTypeHint));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "org.apache.felix.https.enable", orgApacheFelixHttpsEnable));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "org.apache.felix.https.enable@TypeHint", orgApacheFelixHttpsEnableTypeHint));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "org.osgi.service.http.port.secure", orgOsgiServiceHttpPortSecure));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "org.osgi.service.http.port.secure@TypeHint", orgOsgiServiceHttpPortSecureTypeHint));
    

    

    

    final String[] localVarAccepts = {
      "text/plain"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "aemAuth" };

    
    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    
  }
  
  /**
   * 
   * 
   * @param path  (required)
   * @param name  (required)
   * @param addMembers  (optional)
   * @throws ApiException if fails to make API call
   */
  public void postNodeRw(String path, String name, String addMembers) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'path' is set
    if (path == null) {
      throw new ApiException(400, "Missing the required parameter 'path' when calling postNodeRw");
    }
    
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling postNodeRw");
    }
    
    // create path and map variables
    String localVarPath = "/{path}/{name}.rw.html".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "path" + "\\}", apiClient.escapeString(path.toString()))
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "addMembers", addMembers));
    

    

    

    final String[] localVarAccepts = {
      "text/plain"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "aemAuth" };

    
    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    
  }
  
  /**
   * 
   * 
   * @param path  (required)
   * @param jcrprimaryType  (required)
   * @param name  (required)
   * @throws ApiException if fails to make API call
   */
  public void postPath(String path, String jcrprimaryType, String name) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'path' is set
    if (path == null) {
      throw new ApiException(400, "Missing the required parameter 'path' when calling postPath");
    }
    
    // verify the required parameter 'jcrprimaryType' is set
    if (jcrprimaryType == null) {
      throw new ApiException(400, "Missing the required parameter 'jcrprimaryType' when calling postPath");
    }
    
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling postPath");
    }
    
    // create path and map variables
    String localVarPath = "/{path}/".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "path" + "\\}", apiClient.escapeString(path.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "jcr:primaryType", jcrprimaryType));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", ":name", name));
    

    

    

    final String[] localVarAccepts = {
      "text/plain"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "aemAuth" };

    
    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    
  }
  
  /**
   * 
   * 
   * @param path  (required)
   * @param pLimit  (required)
   * @param _1Property  (required)
   * @param _1PropertyValue  (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String postQuery(String path, BigDecimal pLimit, String _1Property, String _1PropertyValue) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'path' is set
    if (path == null) {
      throw new ApiException(400, "Missing the required parameter 'path' when calling postQuery");
    }
    
    // verify the required parameter 'pLimit' is set
    if (pLimit == null) {
      throw new ApiException(400, "Missing the required parameter 'pLimit' when calling postQuery");
    }
    
    // verify the required parameter '_1Property' is set
    if (_1Property == null) {
      throw new ApiException(400, "Missing the required parameter '_1Property' when calling postQuery");
    }
    
    // verify the required parameter '_1PropertyValue' is set
    if (_1PropertyValue == null) {
      throw new ApiException(400, "Missing the required parameter '_1PropertyValue' when calling postQuery");
    }
    
    // create path and map variables
    String localVarPath = "/bin/querybuilder.json".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "path", path));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "p.limit", pLimit));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "1_property", _1Property));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "1_property.value", _1PropertyValue));
    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "aemAuth" };

    
    GenericType<String> localVarReturnType = new GenericType<String>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * 
   * 
   * @param ignoredeactivated  (required)
   * @param onlymodified  (required)
   * @param path  (required)
   * @throws ApiException if fails to make API call
   */
  public void postTreeActivation(Boolean ignoredeactivated, Boolean onlymodified, String path) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ignoredeactivated' is set
    if (ignoredeactivated == null) {
      throw new ApiException(400, "Missing the required parameter 'ignoredeactivated' when calling postTreeActivation");
    }
    
    // verify the required parameter 'onlymodified' is set
    if (onlymodified == null) {
      throw new ApiException(400, "Missing the required parameter 'onlymodified' when calling postTreeActivation");
    }
    
    // verify the required parameter 'path' is set
    if (path == null) {
      throw new ApiException(400, "Missing the required parameter 'path' when calling postTreeActivation");
    }
    
    // create path and map variables
    String localVarPath = "/etc/replication/treeactivation.html".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ignoredeactivated", ignoredeactivated));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "onlymodified", onlymodified));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "path", path));
    

    

    

    final String[] localVarAccepts = {
      "text/plain"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "aemAuth" };

    
    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    
  }
  
}
