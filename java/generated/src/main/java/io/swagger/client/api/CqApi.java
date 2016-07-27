package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import com.shinesolutions.swaggeraem4j.ApiException;
import com.shinesolutions.swaggeraem4j.ApiClient;
import com.shinesolutions.swaggeraem4j.Configuration;
import com.shinesolutions.swaggeraem4j.Pair;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-28T01:11:33.794+10:00")
public class CqApi {
  private ApiClient apiClient;

  public CqApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CqApi(ApiClient apiClient) {
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
   * @param authorizableId  (required)
   * @param changelog  (required)
   * @throws ApiException if fails to make API call
   */
  public void postCqActions(String authorizableId, String changelog) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'authorizableId' is set
    if (authorizableId == null) {
      throw new ApiException(400, "Missing the required parameter 'authorizableId' when calling postCqActions");
    }
    
    // verify the required parameter 'changelog' is set
    if (changelog == null) {
      throw new ApiException(400, "Missing the required parameter 'changelog' when calling postCqActions");
    }
    
    // create path and map variables
    String localVarPath = ".cqactions.html".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "authorizableId", authorizableId));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "changelog", changelog));
    

    

    

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
