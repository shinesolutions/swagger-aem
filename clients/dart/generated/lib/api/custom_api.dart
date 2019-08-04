part of openapi.api;



class CustomApi {
  final ApiClient apiClient;

  CustomApi([ApiClient apiClient]) : apiClient = apiClient ?? defaultApiClient;

  /// 
  ///
  /// 
  Future<String> getAemHealthCheck({ String tags, bool combineTagsOr }) async {
    Object postBody = null;

    // verify required params are set

    // create path and map variables
    String path = "/system/health".replaceAll("{format}","json");

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    if(tags != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "tags", tags));
    }
    if(combineTagsOr != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "combineTagsOr", combineTagsOr));
    }

    List<String> contentTypes = [];

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";
    List<String> authNames = ["aemAuth"];

    if(contentType.startsWith("multipart/form-data")) {
      bool hasFields = false;
      MultipartRequest mp = new MultipartRequest(null, null);
      if(hasFields)
        postBody = mp;
    }
    else {
    }

    var response = await apiClient.invokeAPI(path,
                                             'GET',
                                             queryParams,
                                             postBody,
                                             headerParams,
                                             formParams,
                                             contentType,
                                             authNames);

    if(response.statusCode >= 400) {
      throw new ApiException(response.statusCode, response.body);
    } else if(response.body != null) {
      return apiClient.deserialize(response.body, 'String') as String;
    } else {
      return null;
    }
  }
  /// 
  ///
  /// 
  Future postConfigAemHealthCheckServlet({ List<String> bundlesIgnored, String bundlesIgnored@TypeHint }) async {
    Object postBody = null;

    // verify required params are set

    // create path and map variables
    String path = "/apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck".replaceAll("{format}","json");

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    if(bundlesIgnored != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("multi", "bundles.ignored", bundlesIgnored));
    }
    if(bundlesIgnored@TypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "bundles.ignored@TypeHint", bundlesIgnored@TypeHint));
    }

    List<String> contentTypes = [];

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";
    List<String> authNames = ["aemAuth"];

    if(contentType.startsWith("multipart/form-data")) {
      bool hasFields = false;
      MultipartRequest mp = new MultipartRequest(null, null);
      if(hasFields)
        postBody = mp;
    }
    else {
    }

    var response = await apiClient.invokeAPI(path,
                                             'POST',
                                             queryParams,
                                             postBody,
                                             headerParams,
                                             formParams,
                                             contentType,
                                             authNames);

    if(response.statusCode >= 400) {
      throw new ApiException(response.statusCode, response.body);
    } else if(response.body != null) {
    } else {
      return;
    }
  }
  /// 
  ///
  /// 
  Future postConfigAemPasswordReset({ List<String> pwdresetAuthorizables, String pwdresetAuthorizables@TypeHint }) async {
    Object postBody = null;

    // verify required params are set

    // create path and map variables
    String path = "/apps/system/config/com.shinesolutions.aem.passwordreset.Activator".replaceAll("{format}","json");

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    if(pwdresetAuthorizables != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("multi", "pwdreset.authorizables", pwdresetAuthorizables));
    }
    if(pwdresetAuthorizables@TypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "pwdreset.authorizables@TypeHint", pwdresetAuthorizables@TypeHint));
    }

    List<String> contentTypes = [];

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";
    List<String> authNames = ["aemAuth"];

    if(contentType.startsWith("multipart/form-data")) {
      bool hasFields = false;
      MultipartRequest mp = new MultipartRequest(null, null);
      if(hasFields)
        postBody = mp;
    }
    else {
    }

    var response = await apiClient.invokeAPI(path,
                                             'POST',
                                             queryParams,
                                             postBody,
                                             headerParams,
                                             formParams,
                                             contentType,
                                             authNames);

    if(response.statusCode >= 400) {
      throw new ApiException(response.statusCode, response.body);
    } else if(response.body != null) {
    } else {
      return;
    }
  }
}
