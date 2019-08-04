part of openapi.api;



class CrxApi {
  final ApiClient apiClient;

  CrxApi([ApiClient apiClient]) : apiClient = apiClient ?? defaultApiClient;

  /// 
  ///
  /// 
  Future<String> getCrxdeStatus() async {
    Object postBody = null;

    // verify required params are set

    // create path and map variables
    String path = "/crx/server/crx.default/jcr:root/.1.json".replaceAll("{format}","json");

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
  Future<InstallStatus> getInstallStatus() async {
    Object postBody = null;

    // verify required params are set

    // create path and map variables
    String path = "/crx/packmgr/installstatus.jsp".replaceAll("{format}","json");

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
      return apiClient.deserialize(response.body, 'InstallStatus') as InstallStatus;
    } else {
      return null;
    }
  }
  /// 
  ///
  /// 
  Future getPackageManagerServlet() async {
    Object postBody = null;

    // verify required params are set

    // create path and map variables
    String path = "/crx/packmgr/service/script.html".replaceAll("{format}","json");

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
    } else {
      return;
    }
  }
  /// 
  ///
  /// 
  Future<String> postPackageService(String cmd) async {
    Object postBody = null;

    // verify required params are set
    if(cmd == null) {
     throw new ApiException(400, "Missing required param: cmd");
    }

    // create path and map variables
    String path = "/crx/packmgr/service.jsp".replaceAll("{format}","json");

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
      queryParams.addAll(_convertParametersForCollectionFormat("", "cmd", cmd));

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
      return apiClient.deserialize(response.body, 'String') as String;
    } else {
      return null;
    }
  }
  /// 
  ///
  /// 
  Future<String> postPackageServiceJson(String path, String cmd, { String groupName, String packageName, String packageVersion, String charset, bool force, bool recursive, MultipartFile package }) async {
    Object postBody = null;

    // verify required params are set
    if(path == null) {
     throw new ApiException(400, "Missing required param: path");
    }
    if(cmd == null) {
     throw new ApiException(400, "Missing required param: cmd");
    }

    // create path and map variables
    String path = "/crx/packmgr/service/.json/{path}".replaceAll("{format}","json").replaceAll("{" + "path" + "}", path.toString());

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
      queryParams.addAll(_convertParametersForCollectionFormat("", "cmd", cmd));
    if(groupName != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "groupName", groupName));
    }
    if(packageName != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "packageName", packageName));
    }
    if(packageVersion != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "packageVersion", packageVersion));
    }
    if(charset != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "_charset_", charset));
    }
    if(force != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "force", force));
    }
    if(recursive != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "recursive", recursive));
    }

    List<String> contentTypes = ["multipart/form-data"];

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";
    List<String> authNames = ["aemAuth"];

    if(contentType.startsWith("multipart/form-data")) {
      bool hasFields = false;
      MultipartRequest mp = new MultipartRequest(null, null);
      if (package != null) {
        hasFields = true;
        mp.fields['package'] = package.field;
        mp.files.add(package);
      }
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
      return apiClient.deserialize(response.body, 'String') as String;
    } else {
      return null;
    }
  }
  /// 
  ///
  /// 
  Future<String> postPackageUpdate(String groupName, String packageName, String version, String path, { String filter, String charset }) async {
    Object postBody = null;

    // verify required params are set
    if(groupName == null) {
     throw new ApiException(400, "Missing required param: groupName");
    }
    if(packageName == null) {
     throw new ApiException(400, "Missing required param: packageName");
    }
    if(version == null) {
     throw new ApiException(400, "Missing required param: version");
    }
    if(path == null) {
     throw new ApiException(400, "Missing required param: path");
    }

    // create path and map variables
    String path = "/crx/packmgr/update.jsp".replaceAll("{format}","json");

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
      queryParams.addAll(_convertParametersForCollectionFormat("", "groupName", groupName));
      queryParams.addAll(_convertParametersForCollectionFormat("", "packageName", packageName));
      queryParams.addAll(_convertParametersForCollectionFormat("", "version", version));
      queryParams.addAll(_convertParametersForCollectionFormat("", "path", path));
    if(filter != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "filter", filter));
    }
    if(charset != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "_charset_", charset));
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
      return apiClient.deserialize(response.body, 'String') as String;
    } else {
      return null;
    }
  }
  /// 
  ///
  /// 
  Future<String> postSetPassword(String old, String plain, String verify) async {
    Object postBody = null;

    // verify required params are set
    if(old == null) {
     throw new ApiException(400, "Missing required param: old");
    }
    if(plain == null) {
     throw new ApiException(400, "Missing required param: plain");
    }
    if(verify == null) {
     throw new ApiException(400, "Missing required param: verify");
    }

    // create path and map variables
    String path = "/crx/explorer/ui/setpassword.jsp".replaceAll("{format}","json");

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
      queryParams.addAll(_convertParametersForCollectionFormat("", "old", old));
      queryParams.addAll(_convertParametersForCollectionFormat("", "plain", plain));
      queryParams.addAll(_convertParametersForCollectionFormat("", "verify", verify));

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
      return apiClient.deserialize(response.body, 'String') as String;
    } else {
      return null;
    }
  }
}
