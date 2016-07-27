package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import com.shinesolutions.swaggeraem4j.ApiException;
import com.shinesolutions.swaggeraem4j.ApiClient;
import com.shinesolutions.swaggeraem4j.Configuration;
import com.shinesolutions.swaggeraem4j.Pair;

import java.io.File;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-28T01:11:33.794+10:00")
public class CrxApi {
  private ApiClient apiClient;

  public CrxApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CrxApi(ApiClient apiClient) {
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
   * @param cmd  (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String postPackageService(String cmd) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'cmd' is set
    if (cmd == null) {
      throw new ApiException(400, "Missing the required parameter 'cmd' when calling postPackageService");
    }
    
    // create path and map variables
    String localVarPath = "/crx/packmgr/service.jsp".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "cmd", cmd));
    

    

    

    final String[] localVarAccepts = {
      "text/xml"
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
   * @param path  (required)
   * @param cmd  (required)
   * @param groupName  (optional)
   * @param packageName  (optional)
   * @param packageVersion  (optional)
   * @param charset_  (optional)
   * @param force  (optional)
   * @param _package  (optional)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String postPackageServiceJson(String path, String cmd, String groupName, String packageName, String packageVersion, String charset_, Boolean force, File _package) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'path' is set
    if (path == null) {
      throw new ApiException(400, "Missing the required parameter 'path' when calling postPackageServiceJson");
    }
    
    // verify the required parameter 'cmd' is set
    if (cmd == null) {
      throw new ApiException(400, "Missing the required parameter 'cmd' when calling postPackageServiceJson");
    }
    
    // create path and map variables
    String localVarPath = "/crx/packmgr/service/.json/{path}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "path" + "\\}", apiClient.escapeString(path.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "cmd", cmd));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "groupName", groupName));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "packageName", packageName));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "packageVersion", packageVersion));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_charset_", charset_));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "force", force));
    

    

    if (_package != null)
      localVarFormParams.put("package", _package);
    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "multipart/form-data"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "aemAuth" };

    
    GenericType<String> localVarReturnType = new GenericType<String>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * 
   * 
   * @param groupName  (required)
   * @param packageName  (required)
   * @param version  (required)
   * @param path  (required)
   * @param filter  (optional)
   * @param charset_  (optional)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String postPackageUpdate(String groupName, String packageName, String version, String path, String filter, String charset_) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'groupName' is set
    if (groupName == null) {
      throw new ApiException(400, "Missing the required parameter 'groupName' when calling postPackageUpdate");
    }
    
    // verify the required parameter 'packageName' is set
    if (packageName == null) {
      throw new ApiException(400, "Missing the required parameter 'packageName' when calling postPackageUpdate");
    }
    
    // verify the required parameter 'version' is set
    if (version == null) {
      throw new ApiException(400, "Missing the required parameter 'version' when calling postPackageUpdate");
    }
    
    // verify the required parameter 'path' is set
    if (path == null) {
      throw new ApiException(400, "Missing the required parameter 'path' when calling postPackageUpdate");
    }
    
    // create path and map variables
    String localVarPath = "/crx/packmgr/update.jsp".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "groupName", groupName));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "packageName", packageName));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "version", version));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "path", path));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_charset_", charset_));
    

    

    

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
   * @param old  (required)
   * @param plain  (required)
   * @param verify  (required)
   * @throws ApiException if fails to make API call
   */
  public void postSetPassword(String old, String plain, String verify) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'old' is set
    if (old == null) {
      throw new ApiException(400, "Missing the required parameter 'old' when calling postSetPassword");
    }
    
    // verify the required parameter 'plain' is set
    if (plain == null) {
      throw new ApiException(400, "Missing the required parameter 'plain' when calling postSetPassword");
    }
    
    // verify the required parameter 'verify' is set
    if (verify == null) {
      throw new ApiException(400, "Missing the required parameter 'verify' when calling postSetPassword");
    }
    
    // create path and map variables
    String localVarPath = "/crx/explorer/ui/setpassword.jsp".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "old", old));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "plain", plain));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "verify", verify));
    

    

    

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
