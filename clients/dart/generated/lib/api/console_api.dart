part of openapi.api;



class ConsoleApi {
  final ApiClient apiClient;

  ConsoleApi([ApiClient apiClient]) : apiClient = apiClient ?? defaultApiClient;

  /// 
  ///
  /// 
  Future<List<String>> getAemProductInfo() async {
    Object postBody = null;

    // verify required params are set

    // create path and map variables
    String path = "/system/console/status-productinfo.json".replaceAll("{format}","json");

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};

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
      return (apiClient.deserialize(response.body, 'List<String>') as List).map((item) => item as String).toList();
    } else {
      return null;
    }
  }
  /// 
  ///
  /// 
  Future<String> getConfigMgr() async {
    Object postBody = null;

    // verify required params are set

    // create path and map variables
    String path = "/system/console/configMgr".replaceAll("{format}","json");

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};

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
  Future postBundle(String name, String action) async {
    Object postBody = null;

    // verify required params are set
    if(name == null) {
     throw new ApiException(400, "Missing required param: name");
    }
    if(action == null) {
     throw new ApiException(400, "Missing required param: action");
    }

    // create path and map variables
    String path = "/system/console/bundles/{name}".replaceAll("{format}","json").replaceAll("{" + "name" + "}", name.toString());

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
      queryParams.addAll(_convertParametersForCollectionFormat("", "action", action));

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
  Future postJmxRepository(String action) async {
    Object postBody = null;

    // verify required params are set
    if(action == null) {
     throw new ApiException(400, "Missing required param: action");
    }

    // create path and map variables
    String path = "/system/console/jmx/com.adobe.granite:type=Repository/op/{action}".replaceAll("{format}","json").replaceAll("{" + "action" + "}", action.toString());

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};

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
  Future<SamlConfigurationInfo> postSamlConfiguration({ bool post, bool apply, bool delete, String action, String $location, List<String> path, int serviceRanking, String idpUrl, String idpCertAlias, bool idpHttpRedirect, String serviceProviderEntityId, String assertionConsumerServiceURL, String spPrivateKeyAlias, String keyStorePassword, String defaultRedirectUrl, String userIDAttribute, bool useEncryption, bool createUser, bool addGroupMemberships, String groupMembershipAttribute, List<String> defaultGroups, String nameIdFormat, List<String> synchronizeAttributes, bool handleLogout, String logoutUrl, int clockTolerance, String digestMethod, String signatureMethod, String userIntermediatePath, List<String> propertylist }) async {
    Object postBody = null;

    // verify required params are set

    // create path and map variables
    String path = "/system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler".replaceAll("{format}","json");

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    if(post != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "post", post));
    }
    if(apply != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "apply", apply));
    }
    if(delete != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "delete", delete));
    }
    if(action != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "action", action));
    }
    if($location != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "$location", $location));
    }
    if(path != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("multi", "path", path));
    }
    if(serviceRanking != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "service.ranking", serviceRanking));
    }
    if(idpUrl != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "idpUrl", idpUrl));
    }
    if(idpCertAlias != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "idpCertAlias", idpCertAlias));
    }
    if(idpHttpRedirect != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "idpHttpRedirect", idpHttpRedirect));
    }
    if(serviceProviderEntityId != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "serviceProviderEntityId", serviceProviderEntityId));
    }
    if(assertionConsumerServiceURL != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "assertionConsumerServiceURL", assertionConsumerServiceURL));
    }
    if(spPrivateKeyAlias != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "spPrivateKeyAlias", spPrivateKeyAlias));
    }
    if(keyStorePassword != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "keyStorePassword", keyStorePassword));
    }
    if(defaultRedirectUrl != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "defaultRedirectUrl", defaultRedirectUrl));
    }
    if(userIDAttribute != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "userIDAttribute", userIDAttribute));
    }
    if(useEncryption != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "useEncryption", useEncryption));
    }
    if(createUser != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "createUser", createUser));
    }
    if(addGroupMemberships != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "addGroupMemberships", addGroupMemberships));
    }
    if(groupMembershipAttribute != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "groupMembershipAttribute", groupMembershipAttribute));
    }
    if(defaultGroups != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("multi", "defaultGroups", defaultGroups));
    }
    if(nameIdFormat != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "nameIdFormat", nameIdFormat));
    }
    if(synchronizeAttributes != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("multi", "synchronizeAttributes", synchronizeAttributes));
    }
    if(handleLogout != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "handleLogout", handleLogout));
    }
    if(logoutUrl != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "logoutUrl", logoutUrl));
    }
    if(clockTolerance != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "clockTolerance", clockTolerance));
    }
    if(digestMethod != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "digestMethod", digestMethod));
    }
    if(signatureMethod != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "signatureMethod", signatureMethod));
    }
    if(userIntermediatePath != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "userIntermediatePath", userIntermediatePath));
    }
    if(propertylist != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("csv", "propertylist", propertylist));
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
      return apiClient.deserialize(response.body, 'SamlConfigurationInfo') as SamlConfigurationInfo;
    } else {
      return null;
    }
  }
}
