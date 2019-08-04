part of openapi.api;



class SlingApi {
  final ApiClient apiClient;

  SlingApi([ApiClient apiClient]) : apiClient = apiClient ?? defaultApiClient;

  /// 
  ///
  /// 
  Future deleteAgent(String runmode, String name) async {
    Object postBody = null;

    // verify required params are set
    if(runmode == null) {
     throw new ApiException(400, "Missing required param: runmode");
    }
    if(name == null) {
     throw new ApiException(400, "Missing required param: name");
    }

    // create path and map variables
    String path = "/etc/replication/agents.{runmode}/{name}".replaceAll("{format}","json").replaceAll("{" + "runmode" + "}", runmode.toString()).replaceAll("{" + "name" + "}", name.toString());

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
                                             'DELETE',
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
  Future deleteNode(String path, String name) async {
    Object postBody = null;

    // verify required params are set
    if(path == null) {
     throw new ApiException(400, "Missing required param: path");
    }
    if(name == null) {
     throw new ApiException(400, "Missing required param: name");
    }

    // create path and map variables
    String path = "/{path}/{name}".replaceAll("{format}","json").replaceAll("{" + "path" + "}", path.toString()).replaceAll("{" + "name" + "}", name.toString());

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
                                             'DELETE',
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
  Future getAgent(String runmode, String name) async {
    Object postBody = null;

    // verify required params are set
    if(runmode == null) {
     throw new ApiException(400, "Missing required param: runmode");
    }
    if(name == null) {
     throw new ApiException(400, "Missing required param: name");
    }

    // create path and map variables
    String path = "/etc/replication/agents.{runmode}/{name}".replaceAll("{format}","json").replaceAll("{" + "runmode" + "}", runmode.toString()).replaceAll("{" + "name" + "}", name.toString());

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
  Future<String> getAgents(String runmode) async {
    Object postBody = null;

    // verify required params are set
    if(runmode == null) {
     throw new ApiException(400, "Missing required param: runmode");
    }

    // create path and map variables
    String path = "/etc/replication/agents.{runmode}.-1.json".replaceAll("{format}","json").replaceAll("{" + "runmode" + "}", runmode.toString());

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
  Future<KeystoreInfo> getAuthorizableKeystore(String intermediatePath, String authorizableId) async {
    Object postBody = null;

    // verify required params are set
    if(intermediatePath == null) {
     throw new ApiException(400, "Missing required param: intermediatePath");
    }
    if(authorizableId == null) {
     throw new ApiException(400, "Missing required param: authorizableId");
    }

    // create path and map variables
    String path = "/{intermediatePath}/{authorizableId}.ks.json".replaceAll("{format}","json").replaceAll("{" + "intermediatePath" + "}", intermediatePath.toString()).replaceAll("{" + "authorizableId" + "}", authorizableId.toString());

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
      return apiClient.deserialize(response.body, 'KeystoreInfo') as KeystoreInfo;
    } else {
      return null;
    }
  }
  /// 
  ///
  /// 
  Future<MultipartFile> getKeystore(String intermediatePath, String authorizableId) async {
    Object postBody = null;

    // verify required params are set
    if(intermediatePath == null) {
     throw new ApiException(400, "Missing required param: intermediatePath");
    }
    if(authorizableId == null) {
     throw new ApiException(400, "Missing required param: authorizableId");
    }

    // create path and map variables
    String path = "/{intermediatePath}/{authorizableId}/keystore/store.p12".replaceAll("{format}","json").replaceAll("{" + "intermediatePath" + "}", intermediatePath.toString()).replaceAll("{" + "authorizableId" + "}", authorizableId.toString());

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
      return apiClient.deserialize(response.body, 'MultipartFile') as MultipartFile;
    } else {
      return null;
    }
  }
  /// 
  ///
  /// 
  Future getNode(String path, String name) async {
    Object postBody = null;

    // verify required params are set
    if(path == null) {
     throw new ApiException(400, "Missing required param: path");
    }
    if(name == null) {
     throw new ApiException(400, "Missing required param: name");
    }

    // create path and map variables
    String path = "/{path}/{name}".replaceAll("{format}","json").replaceAll("{" + "path" + "}", path.toString()).replaceAll("{" + "name" + "}", name.toString());

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
  Future<MultipartFile> getPackage(String group, String name, String version) async {
    Object postBody = null;

    // verify required params are set
    if(group == null) {
     throw new ApiException(400, "Missing required param: group");
    }
    if(name == null) {
     throw new ApiException(400, "Missing required param: name");
    }
    if(version == null) {
     throw new ApiException(400, "Missing required param: version");
    }

    // create path and map variables
    String path = "/etc/packages/{group}/{name}-{version}.zip".replaceAll("{format}","json").replaceAll("{" + "group" + "}", group.toString()).replaceAll("{" + "name" + "}", name.toString()).replaceAll("{" + "version" + "}", version.toString());

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
      return apiClient.deserialize(response.body, 'MultipartFile') as MultipartFile;
    } else {
      return null;
    }
  }
  /// 
  ///
  /// 
  Future<String> getPackageFilter(String group, String name, String version) async {
    Object postBody = null;

    // verify required params are set
    if(group == null) {
     throw new ApiException(400, "Missing required param: group");
    }
    if(name == null) {
     throw new ApiException(400, "Missing required param: name");
    }
    if(version == null) {
     throw new ApiException(400, "Missing required param: version");
    }

    // create path and map variables
    String path = "/etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json".replaceAll("{format}","json").replaceAll("{" + "group" + "}", group.toString()).replaceAll("{" + "name" + "}", name.toString()).replaceAll("{" + "version" + "}", version.toString());

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
  Future<String> getQuery(String path, num pLimit, String n1property, String n1propertyValue) async {
    Object postBody = null;

    // verify required params are set
    if(path == null) {
     throw new ApiException(400, "Missing required param: path");
    }
    if(pLimit == null) {
     throw new ApiException(400, "Missing required param: pLimit");
    }
    if(n1property == null) {
     throw new ApiException(400, "Missing required param: n1property");
    }
    if(n1propertyValue == null) {
     throw new ApiException(400, "Missing required param: n1propertyValue");
    }

    // create path and map variables
    String path = "/bin/querybuilder.json".replaceAll("{format}","json");

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
      queryParams.addAll(_convertParametersForCollectionFormat("", "path", path));
      queryParams.addAll(_convertParametersForCollectionFormat("", "p.limit", pLimit));
      queryParams.addAll(_convertParametersForCollectionFormat("", "1_property", n1property));
      queryParams.addAll(_convertParametersForCollectionFormat("", "1_property.value", n1propertyValue));

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
  Future<MultipartFile> getTruststore() async {
    Object postBody = null;

    // verify required params are set

    // create path and map variables
    String path = "/etc/truststore/truststore.p12".replaceAll("{format}","json");

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
      return apiClient.deserialize(response.body, 'MultipartFile') as MultipartFile;
    } else {
      return null;
    }
  }
  /// 
  ///
  /// 
  Future<TruststoreInfo> getTruststoreInfo() async {
    Object postBody = null;

    // verify required params are set

    // create path and map variables
    String path = "/libs/granite/security/truststore.json".replaceAll("{format}","json");

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
      return apiClient.deserialize(response.body, 'TruststoreInfo') as TruststoreInfo;
    } else {
      return null;
    }
  }
  /// 
  ///
  /// 
  Future postAgent(String runmode, String name, { bool jcr:contentCq:distribute, String jcr:contentCq:distribute@TypeHint, String jcr:contentCq:name, String jcr:contentCq:template, bool jcr:contentEnabled, String jcr:contentJcr:description, String jcr:contentJcr:lastModified, String jcr:contentJcr:lastModifiedBy, String jcr:contentJcr:mixinTypes, String jcr:contentJcr:title, String jcr:contentLogLevel, bool jcr:contentNoStatusUpdate, bool jcr:contentNoVersioning, num jcr:contentProtocolConnectTimeout, bool jcr:contentProtocolHTTPConnectionClosed, String jcr:contentProtocolHTTPExpired, List<String> jcr:contentProtocolHTTPHeaders, String jcr:contentProtocolHTTPHeaders@TypeHint, String jcr:contentProtocolHTTPMethod, bool jcr:contentProtocolHTTPSRelaxed, String jcr:contentProtocolInterface, num jcr:contentProtocolSocketTimeout, String jcr:contentProtocolVersion, String jcr:contentProxyNTLMDomain, String jcr:contentProxyNTLMHost, String jcr:contentProxyHost, String jcr:contentProxyPassword, num jcr:contentProxyPort, String jcr:contentProxyUser, num jcr:contentQueueBatchMaxSize, String jcr:contentQueueBatchMode, num jcr:contentQueueBatchWaitTime, String jcr:contentRetryDelay, bool jcr:contentReverseReplication, String jcr:contentSerializationType, String jcr:contentSling:resourceType, String jcr:contentSsl, String jcr:contentTransportNTLMDomain, String jcr:contentTransportNTLMHost, String jcr:contentTransportPassword, String jcr:contentTransportUri, String jcr:contentTransportUser, bool jcr:contentTriggerDistribute, bool jcr:contentTriggerModified, bool jcr:contentTriggerOnOffTime, bool jcr:contentTriggerReceive, bool jcr:contentTriggerSpecific, String jcr:contentUserId, String jcr:primaryType, String :operation }) async {
    Object postBody = null;

    // verify required params are set
    if(runmode == null) {
     throw new ApiException(400, "Missing required param: runmode");
    }
    if(name == null) {
     throw new ApiException(400, "Missing required param: name");
    }

    // create path and map variables
    String path = "/etc/replication/agents.{runmode}/{name}".replaceAll("{format}","json").replaceAll("{" + "runmode" + "}", runmode.toString()).replaceAll("{" + "name" + "}", name.toString());

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    if(jcr:contentCq:distribute != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "jcr:content/cq:distribute", jcr:contentCq:distribute));
    }
    if(jcr:contentCq:distribute@TypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "jcr:content/cq:distribute@TypeHint", jcr:contentCq:distribute@TypeHint));
    }
    if(jcr:contentCq:name != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "jcr:content/cq:name", jcr:contentCq:name));
    }
    if(jcr:contentCq:template != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "jcr:content/cq:template", jcr:contentCq:template));
    }
    if(jcr:contentEnabled != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "jcr:content/enabled", jcr:contentEnabled));
    }
    if(jcr:contentJcr:description != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "jcr:content/jcr:description", jcr:contentJcr:description));
    }
    if(jcr:contentJcr:lastModified != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "jcr:content/jcr:lastModified", jcr:contentJcr:lastModified));
    }
    if(jcr:contentJcr:lastModifiedBy != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "jcr:content/jcr:lastModifiedBy", jcr:contentJcr:lastModifiedBy));
    }
    if(jcr:contentJcr:mixinTypes != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "jcr:content/jcr:mixinTypes", jcr:contentJcr:mixinTypes));
    }
    if(jcr:contentJcr:title != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "jcr:content/jcr:title", jcr:contentJcr:title));
    }
    if(jcr:contentLogLevel != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "jcr:content/logLevel", jcr:contentLogLevel));
    }
    if(jcr:contentNoStatusUpdate != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "jcr:content/noStatusUpdate", jcr:contentNoStatusUpdate));
    }
    if(jcr:contentNoVersioning != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "jcr:content/noVersioning", jcr:contentNoVersioning));
    }
    if(jcr:contentProtocolConnectTimeout != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "jcr:content/protocolConnectTimeout", jcr:contentProtocolConnectTimeout));
    }
    if(jcr:contentProtocolHTTPConnectionClosed != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "jcr:content/protocolHTTPConnectionClosed", jcr:contentProtocolHTTPConnectionClosed));
    }
    if(jcr:contentProtocolHTTPExpired != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "jcr:content/protocolHTTPExpired", jcr:contentProtocolHTTPExpired));
    }
    if(jcr:contentProtocolHTTPHeaders != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("multi", "jcr:content/protocolHTTPHeaders", jcr:contentProtocolHTTPHeaders));
    }
    if(jcr:contentProtocolHTTPHeaders@TypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "jcr:content/protocolHTTPHeaders@TypeHint", jcr:contentProtocolHTTPHeaders@TypeHint));
    }
    if(jcr:contentProtocolHTTPMethod != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "jcr:content/protocolHTTPMethod", jcr:contentProtocolHTTPMethod));
    }
    if(jcr:contentProtocolHTTPSRelaxed != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "jcr:content/protocolHTTPSRelaxed", jcr:contentProtocolHTTPSRelaxed));
    }
    if(jcr:contentProtocolInterface != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "jcr:content/protocolInterface", jcr:contentProtocolInterface));
    }
    if(jcr:contentProtocolSocketTimeout != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "jcr:content/protocolSocketTimeout", jcr:contentProtocolSocketTimeout));
    }
    if(jcr:contentProtocolVersion != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "jcr:content/protocolVersion", jcr:contentProtocolVersion));
    }
    if(jcr:contentProxyNTLMDomain != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "jcr:content/proxyNTLMDomain", jcr:contentProxyNTLMDomain));
    }
    if(jcr:contentProxyNTLMHost != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "jcr:content/proxyNTLMHost", jcr:contentProxyNTLMHost));
    }
    if(jcr:contentProxyHost != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "jcr:content/proxyHost", jcr:contentProxyHost));
    }
    if(jcr:contentProxyPassword != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "jcr:content/proxyPassword", jcr:contentProxyPassword));
    }
    if(jcr:contentProxyPort != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "jcr:content/proxyPort", jcr:contentProxyPort));
    }
    if(jcr:contentProxyUser != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "jcr:content/proxyUser", jcr:contentProxyUser));
    }
    if(jcr:contentQueueBatchMaxSize != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "jcr:content/queueBatchMaxSize", jcr:contentQueueBatchMaxSize));
    }
    if(jcr:contentQueueBatchMode != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "jcr:content/queueBatchMode", jcr:contentQueueBatchMode));
    }
    if(jcr:contentQueueBatchWaitTime != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "jcr:content/queueBatchWaitTime", jcr:contentQueueBatchWaitTime));
    }
    if(jcr:contentRetryDelay != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "jcr:content/retryDelay", jcr:contentRetryDelay));
    }
    if(jcr:contentReverseReplication != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "jcr:content/reverseReplication", jcr:contentReverseReplication));
    }
    if(jcr:contentSerializationType != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "jcr:content/serializationType", jcr:contentSerializationType));
    }
    if(jcr:contentSling:resourceType != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "jcr:content/sling:resourceType", jcr:contentSling:resourceType));
    }
    if(jcr:contentSsl != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "jcr:content/ssl", jcr:contentSsl));
    }
    if(jcr:contentTransportNTLMDomain != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "jcr:content/transportNTLMDomain", jcr:contentTransportNTLMDomain));
    }
    if(jcr:contentTransportNTLMHost != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "jcr:content/transportNTLMHost", jcr:contentTransportNTLMHost));
    }
    if(jcr:contentTransportPassword != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "jcr:content/transportPassword", jcr:contentTransportPassword));
    }
    if(jcr:contentTransportUri != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "jcr:content/transportUri", jcr:contentTransportUri));
    }
    if(jcr:contentTransportUser != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "jcr:content/transportUser", jcr:contentTransportUser));
    }
    if(jcr:contentTriggerDistribute != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "jcr:content/triggerDistribute", jcr:contentTriggerDistribute));
    }
    if(jcr:contentTriggerModified != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "jcr:content/triggerModified", jcr:contentTriggerModified));
    }
    if(jcr:contentTriggerOnOffTime != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "jcr:content/triggerOnOffTime", jcr:contentTriggerOnOffTime));
    }
    if(jcr:contentTriggerReceive != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "jcr:content/triggerReceive", jcr:contentTriggerReceive));
    }
    if(jcr:contentTriggerSpecific != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "jcr:content/triggerSpecific", jcr:contentTriggerSpecific));
    }
    if(jcr:contentUserId != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "jcr:content/userId", jcr:contentUserId));
    }
    if(jcr:primaryType != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "jcr:primaryType", jcr:primaryType));
    }
    if(:operation != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", ":operation", :operation));
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
  Future<KeystoreInfo> postAuthorizableKeystore(String intermediatePath, String authorizableId, { String :operation, String currentPassword, String newPassword, String rePassword, String keyPassword, String keyStorePass, String alias, String newAlias, String removeAlias, MultipartFile certChain, MultipartFile pk, MultipartFile keyStore }) async {
    Object postBody = null;

    // verify required params are set
    if(intermediatePath == null) {
     throw new ApiException(400, "Missing required param: intermediatePath");
    }
    if(authorizableId == null) {
     throw new ApiException(400, "Missing required param: authorizableId");
    }

    // create path and map variables
    String path = "/{intermediatePath}/{authorizableId}.ks.html".replaceAll("{format}","json").replaceAll("{" + "intermediatePath" + "}", intermediatePath.toString()).replaceAll("{" + "authorizableId" + "}", authorizableId.toString());

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    if(:operation != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", ":operation", :operation));
    }
    if(currentPassword != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "currentPassword", currentPassword));
    }
    if(newPassword != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "newPassword", newPassword));
    }
    if(rePassword != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "rePassword", rePassword));
    }
    if(keyPassword != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "keyPassword", keyPassword));
    }
    if(keyStorePass != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "keyStorePass", keyStorePass));
    }
    if(alias != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "alias", alias));
    }
    if(newAlias != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "newAlias", newAlias));
    }
    if(removeAlias != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "removeAlias", removeAlias));
    }

    List<String> contentTypes = ["multipart/form-data"];

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";
    List<String> authNames = ["aemAuth"];

    if(contentType.startsWith("multipart/form-data")) {
      bool hasFields = false;
      MultipartRequest mp = new MultipartRequest(null, null);
      if (certChain != null) {
        hasFields = true;
        mp.fields['cert-chain'] = certChain.field;
        mp.files.add(certChain);
      }
      if (pk != null) {
        hasFields = true;
        mp.fields['pk'] = pk.field;
        mp.files.add(pk);
      }
      if (keyStore != null) {
        hasFields = true;
        mp.fields['keyStore'] = keyStore.field;
        mp.files.add(keyStore);
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
      return apiClient.deserialize(response.body, 'KeystoreInfo') as KeystoreInfo;
    } else {
      return null;
    }
  }
  /// 
  ///
  /// 
  Future<String> postAuthorizables(String authorizableId, String intermediatePath, { String createUser, String createGroup, String rep:password, String profileGivenName }) async {
    Object postBody = null;

    // verify required params are set
    if(authorizableId == null) {
     throw new ApiException(400, "Missing required param: authorizableId");
    }
    if(intermediatePath == null) {
     throw new ApiException(400, "Missing required param: intermediatePath");
    }

    // create path and map variables
    String path = "/libs/granite/security/post/authorizables".replaceAll("{format}","json");

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
      queryParams.addAll(_convertParametersForCollectionFormat("", "authorizableId", authorizableId));
      queryParams.addAll(_convertParametersForCollectionFormat("", "intermediatePath", intermediatePath));
    if(createUser != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "createUser", createUser));
    }
    if(createGroup != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "createGroup", createGroup));
    }
    if(rep:password != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "rep:password", rep:password));
    }
    if(profileGivenName != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "profile/givenName", profileGivenName));
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
  Future postConfigAdobeGraniteSamlAuthenticationHandler({ String keyStorePassword, String keyStorePassword@TypeHint, int serviceRanking, String serviceRanking@TypeHint, bool idpHttpRedirect, String idpHttpRedirect@TypeHint, bool createUser, String createUser@TypeHint, String defaultRedirectUrl, String defaultRedirectUrl@TypeHint, String userIDAttribute, String userIDAttribute@TypeHint, List<String> defaultGroups, String defaultGroups@TypeHint, String idpCertAlias, String idpCertAlias@TypeHint, bool addGroupMemberships, String addGroupMemberships@TypeHint, List<String> path, String path@TypeHint, List<String> synchronizeAttributes, String synchronizeAttributes@TypeHint, int clockTolerance, String clockTolerance@TypeHint, String groupMembershipAttribute, String groupMembershipAttribute@TypeHint, String idpUrl, String idpUrl@TypeHint, String logoutUrl, String logoutUrl@TypeHint, String serviceProviderEntityId, String serviceProviderEntityId@TypeHint, String assertionConsumerServiceURL, String assertionConsumerServiceURL@TypeHint, bool handleLogout, String handleLogout@TypeHint, String spPrivateKeyAlias, String spPrivateKeyAlias@TypeHint, bool useEncryption, String useEncryption@TypeHint, String nameIdFormat, String nameIdFormat@TypeHint, String digestMethod, String digestMethod@TypeHint, String signatureMethod, String signatureMethod@TypeHint, String userIntermediatePath, String userIntermediatePath@TypeHint }) async {
    Object postBody = null;

    // verify required params are set

    // create path and map variables
    String path = "/apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config".replaceAll("{format}","json");

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    if(keyStorePassword != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "keyStorePassword", keyStorePassword));
    }
    if(keyStorePassword@TypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "keyStorePassword@TypeHint", keyStorePassword@TypeHint));
    }
    if(serviceRanking != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "service.ranking", serviceRanking));
    }
    if(serviceRanking@TypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "service.ranking@TypeHint", serviceRanking@TypeHint));
    }
    if(idpHttpRedirect != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "idpHttpRedirect", idpHttpRedirect));
    }
    if(idpHttpRedirect@TypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "idpHttpRedirect@TypeHint", idpHttpRedirect@TypeHint));
    }
    if(createUser != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "createUser", createUser));
    }
    if(createUser@TypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "createUser@TypeHint", createUser@TypeHint));
    }
    if(defaultRedirectUrl != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "defaultRedirectUrl", defaultRedirectUrl));
    }
    if(defaultRedirectUrl@TypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "defaultRedirectUrl@TypeHint", defaultRedirectUrl@TypeHint));
    }
    if(userIDAttribute != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "userIDAttribute", userIDAttribute));
    }
    if(userIDAttribute@TypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "userIDAttribute@TypeHint", userIDAttribute@TypeHint));
    }
    if(defaultGroups != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("multi", "defaultGroups", defaultGroups));
    }
    if(defaultGroups@TypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "defaultGroups@TypeHint", defaultGroups@TypeHint));
    }
    if(idpCertAlias != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "idpCertAlias", idpCertAlias));
    }
    if(idpCertAlias@TypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "idpCertAlias@TypeHint", idpCertAlias@TypeHint));
    }
    if(addGroupMemberships != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "addGroupMemberships", addGroupMemberships));
    }
    if(addGroupMemberships@TypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "addGroupMemberships@TypeHint", addGroupMemberships@TypeHint));
    }
    if(path != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("multi", "path", path));
    }
    if(path@TypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "path@TypeHint", path@TypeHint));
    }
    if(synchronizeAttributes != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("multi", "synchronizeAttributes", synchronizeAttributes));
    }
    if(synchronizeAttributes@TypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "synchronizeAttributes@TypeHint", synchronizeAttributes@TypeHint));
    }
    if(clockTolerance != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "clockTolerance", clockTolerance));
    }
    if(clockTolerance@TypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "clockTolerance@TypeHint", clockTolerance@TypeHint));
    }
    if(groupMembershipAttribute != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "groupMembershipAttribute", groupMembershipAttribute));
    }
    if(groupMembershipAttribute@TypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "groupMembershipAttribute@TypeHint", groupMembershipAttribute@TypeHint));
    }
    if(idpUrl != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "idpUrl", idpUrl));
    }
    if(idpUrl@TypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "idpUrl@TypeHint", idpUrl@TypeHint));
    }
    if(logoutUrl != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "logoutUrl", logoutUrl));
    }
    if(logoutUrl@TypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "logoutUrl@TypeHint", logoutUrl@TypeHint));
    }
    if(serviceProviderEntityId != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "serviceProviderEntityId", serviceProviderEntityId));
    }
    if(serviceProviderEntityId@TypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "serviceProviderEntityId@TypeHint", serviceProviderEntityId@TypeHint));
    }
    if(assertionConsumerServiceURL != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "assertionConsumerServiceURL", assertionConsumerServiceURL));
    }
    if(assertionConsumerServiceURL@TypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "assertionConsumerServiceURL@TypeHint", assertionConsumerServiceURL@TypeHint));
    }
    if(handleLogout != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "handleLogout", handleLogout));
    }
    if(handleLogout@TypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "handleLogout@TypeHint", handleLogout@TypeHint));
    }
    if(spPrivateKeyAlias != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "spPrivateKeyAlias", spPrivateKeyAlias));
    }
    if(spPrivateKeyAlias@TypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "spPrivateKeyAlias@TypeHint", spPrivateKeyAlias@TypeHint));
    }
    if(useEncryption != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "useEncryption", useEncryption));
    }
    if(useEncryption@TypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "useEncryption@TypeHint", useEncryption@TypeHint));
    }
    if(nameIdFormat != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "nameIdFormat", nameIdFormat));
    }
    if(nameIdFormat@TypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "nameIdFormat@TypeHint", nameIdFormat@TypeHint));
    }
    if(digestMethod != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "digestMethod", digestMethod));
    }
    if(digestMethod@TypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "digestMethod@TypeHint", digestMethod@TypeHint));
    }
    if(signatureMethod != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "signatureMethod", signatureMethod));
    }
    if(signatureMethod@TypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "signatureMethod@TypeHint", signatureMethod@TypeHint));
    }
    if(userIntermediatePath != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "userIntermediatePath", userIntermediatePath));
    }
    if(userIntermediatePath@TypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "userIntermediatePath@TypeHint", userIntermediatePath@TypeHint));
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
  Future postConfigApacheFelixJettyBasedHttpService({ bool orgApacheFelixHttpsNio, String orgApacheFelixHttpsNio@TypeHint, String orgApacheFelixHttpsKeystore, String orgApacheFelixHttpsKeystore@TypeHint, String orgApacheFelixHttpsKeystorePassword, String orgApacheFelixHttpsKeystorePassword@TypeHint, String orgApacheFelixHttpsKeystoreKey, String orgApacheFelixHttpsKeystoreKey@TypeHint, String orgApacheFelixHttpsKeystoreKeyPassword, String orgApacheFelixHttpsKeystoreKeyPassword@TypeHint, String orgApacheFelixHttpsTruststore, String orgApacheFelixHttpsTruststore@TypeHint, String orgApacheFelixHttpsTruststorePassword, String orgApacheFelixHttpsTruststorePassword@TypeHint, String orgApacheFelixHttpsClientcertificate, String orgApacheFelixHttpsClientcertificate@TypeHint, bool orgApacheFelixHttpsEnable, String orgApacheFelixHttpsEnable@TypeHint, String orgOsgiServiceHttpPortSecure, String orgOsgiServiceHttpPortSecure@TypeHint }) async {
    Object postBody = null;

    // verify required params are set

    // create path and map variables
    String path = "/apps/system/config/org.apache.felix.http".replaceAll("{format}","json");

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    if(orgApacheFelixHttpsNio != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "org.apache.felix.https.nio", orgApacheFelixHttpsNio));
    }
    if(orgApacheFelixHttpsNio@TypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "org.apache.felix.https.nio@TypeHint", orgApacheFelixHttpsNio@TypeHint));
    }
    if(orgApacheFelixHttpsKeystore != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "org.apache.felix.https.keystore", orgApacheFelixHttpsKeystore));
    }
    if(orgApacheFelixHttpsKeystore@TypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "org.apache.felix.https.keystore@TypeHint", orgApacheFelixHttpsKeystore@TypeHint));
    }
    if(orgApacheFelixHttpsKeystorePassword != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "org.apache.felix.https.keystore.password", orgApacheFelixHttpsKeystorePassword));
    }
    if(orgApacheFelixHttpsKeystorePassword@TypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "org.apache.felix.https.keystore.password@TypeHint", orgApacheFelixHttpsKeystorePassword@TypeHint));
    }
    if(orgApacheFelixHttpsKeystoreKey != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "org.apache.felix.https.keystore.key", orgApacheFelixHttpsKeystoreKey));
    }
    if(orgApacheFelixHttpsKeystoreKey@TypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "org.apache.felix.https.keystore.key@TypeHint", orgApacheFelixHttpsKeystoreKey@TypeHint));
    }
    if(orgApacheFelixHttpsKeystoreKeyPassword != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "org.apache.felix.https.keystore.key.password", orgApacheFelixHttpsKeystoreKeyPassword));
    }
    if(orgApacheFelixHttpsKeystoreKeyPassword@TypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "org.apache.felix.https.keystore.key.password@TypeHint", orgApacheFelixHttpsKeystoreKeyPassword@TypeHint));
    }
    if(orgApacheFelixHttpsTruststore != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "org.apache.felix.https.truststore", orgApacheFelixHttpsTruststore));
    }
    if(orgApacheFelixHttpsTruststore@TypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "org.apache.felix.https.truststore@TypeHint", orgApacheFelixHttpsTruststore@TypeHint));
    }
    if(orgApacheFelixHttpsTruststorePassword != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "org.apache.felix.https.truststore.password", orgApacheFelixHttpsTruststorePassword));
    }
    if(orgApacheFelixHttpsTruststorePassword@TypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "org.apache.felix.https.truststore.password@TypeHint", orgApacheFelixHttpsTruststorePassword@TypeHint));
    }
    if(orgApacheFelixHttpsClientcertificate != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "org.apache.felix.https.clientcertificate", orgApacheFelixHttpsClientcertificate));
    }
    if(orgApacheFelixHttpsClientcertificate@TypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "org.apache.felix.https.clientcertificate@TypeHint", orgApacheFelixHttpsClientcertificate@TypeHint));
    }
    if(orgApacheFelixHttpsEnable != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "org.apache.felix.https.enable", orgApacheFelixHttpsEnable));
    }
    if(orgApacheFelixHttpsEnable@TypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "org.apache.felix.https.enable@TypeHint", orgApacheFelixHttpsEnable@TypeHint));
    }
    if(orgOsgiServiceHttpPortSecure != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "org.osgi.service.http.port.secure", orgOsgiServiceHttpPortSecure));
    }
    if(orgOsgiServiceHttpPortSecure@TypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "org.osgi.service.http.port.secure@TypeHint", orgOsgiServiceHttpPortSecure@TypeHint));
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
  Future postConfigApacheHttpComponentsProxyConfiguration({ String proxyHost, String proxyHost@TypeHint, int proxyPort, String proxyPort@TypeHint, List<String> proxyExceptions, String proxyExceptions@TypeHint, bool proxyEnabled, String proxyEnabled@TypeHint, String proxyUser, String proxyUser@TypeHint, String proxyPassword, String proxyPassword@TypeHint }) async {
    Object postBody = null;

    // verify required params are set

    // create path and map variables
    String path = "/apps/system/config/org.apache.http.proxyconfigurator.config".replaceAll("{format}","json");

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    if(proxyHost != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "proxy.host", proxyHost));
    }
    if(proxyHost@TypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "proxy.host@TypeHint", proxyHost@TypeHint));
    }
    if(proxyPort != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "proxy.port", proxyPort));
    }
    if(proxyPort@TypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "proxy.port@TypeHint", proxyPort@TypeHint));
    }
    if(proxyExceptions != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("multi", "proxy.exceptions", proxyExceptions));
    }
    if(proxyExceptions@TypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "proxy.exceptions@TypeHint", proxyExceptions@TypeHint));
    }
    if(proxyEnabled != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "proxy.enabled", proxyEnabled));
    }
    if(proxyEnabled@TypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "proxy.enabled@TypeHint", proxyEnabled@TypeHint));
    }
    if(proxyUser != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "proxy.user", proxyUser));
    }
    if(proxyUser@TypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "proxy.user@TypeHint", proxyUser@TypeHint));
    }
    if(proxyPassword != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "proxy.password", proxyPassword));
    }
    if(proxyPassword@TypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "proxy.password@TypeHint", proxyPassword@TypeHint));
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
  Future postConfigApacheSlingDavExServlet({ String alias, String alias@TypeHint, bool davCreateAbsoluteUri, String davCreateAbsoluteUri@TypeHint }) async {
    Object postBody = null;

    // verify required params are set

    // create path and map variables
    String path = "/apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet".replaceAll("{format}","json");

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    if(alias != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "alias", alias));
    }
    if(alias@TypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "alias@TypeHint", alias@TypeHint));
    }
    if(davCreateAbsoluteUri != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "dav.create-absolute-uri", davCreateAbsoluteUri));
    }
    if(davCreateAbsoluteUri@TypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "dav.create-absolute-uri@TypeHint", davCreateAbsoluteUri@TypeHint));
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
  Future postConfigApacheSlingGetServlet({ String jsonMaximumresults, String jsonMaximumresults@TypeHint, bool enableHtml, String enableHtml@TypeHint, bool enableTxt, String enableTxt@TypeHint, bool enableXml, String enableXml@TypeHint }) async {
    Object postBody = null;

    // verify required params are set

    // create path and map variables
    String path = "/apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet".replaceAll("{format}","json");

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    if(jsonMaximumresults != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "json.maximumresults", jsonMaximumresults));
    }
    if(jsonMaximumresults@TypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "json.maximumresults@TypeHint", jsonMaximumresults@TypeHint));
    }
    if(enableHtml != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "enable.html", enableHtml));
    }
    if(enableHtml@TypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "enable.html@TypeHint", enableHtml@TypeHint));
    }
    if(enableTxt != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "enable.txt", enableTxt));
    }
    if(enableTxt@TypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "enable.txt@TypeHint", enableTxt@TypeHint));
    }
    if(enableXml != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "enable.xml", enableXml));
    }
    if(enableXml@TypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "enable.xml@TypeHint", enableXml@TypeHint));
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
  Future postConfigApacheSlingReferrerFilter({ bool allowEmpty, String allowEmpty@TypeHint, String allowHosts, String allowHosts@TypeHint, String allowHostsRegexp, String allowHostsRegexp@TypeHint, String filterMethods, String filterMethods@TypeHint }) async {
    Object postBody = null;

    // verify required params are set

    // create path and map variables
    String path = "/apps/system/config/org.apache.sling.security.impl.ReferrerFilter".replaceAll("{format}","json");

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    if(allowEmpty != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "allow.empty", allowEmpty));
    }
    if(allowEmpty@TypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "allow.empty@TypeHint", allowEmpty@TypeHint));
    }
    if(allowHosts != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "allow.hosts", allowHosts));
    }
    if(allowHosts@TypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "allow.hosts@TypeHint", allowHosts@TypeHint));
    }
    if(allowHostsRegexp != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "allow.hosts.regexp", allowHostsRegexp));
    }
    if(allowHostsRegexp@TypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "allow.hosts.regexp@TypeHint", allowHostsRegexp@TypeHint));
    }
    if(filterMethods != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "filter.methods", filterMethods));
    }
    if(filterMethods@TypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "filter.methods@TypeHint", filterMethods@TypeHint));
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
  Future postNode(String path, String name, { String :operation, String deleteAuthorizable, MultipartFile file }) async {
    Object postBody = null;

    // verify required params are set
    if(path == null) {
     throw new ApiException(400, "Missing required param: path");
    }
    if(name == null) {
     throw new ApiException(400, "Missing required param: name");
    }

    // create path and map variables
    String path = "/{path}/{name}".replaceAll("{format}","json").replaceAll("{" + "path" + "}", path.toString()).replaceAll("{" + "name" + "}", name.toString());

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    if(:operation != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", ":operation", :operation));
    }
    if(deleteAuthorizable != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "deleteAuthorizable", deleteAuthorizable));
    }

    List<String> contentTypes = ["multipart/form-data"];

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";
    List<String> authNames = ["aemAuth"];

    if(contentType.startsWith("multipart/form-data")) {
      bool hasFields = false;
      MultipartRequest mp = new MultipartRequest(null, null);
      if (file != null) {
        hasFields = true;
        mp.fields['file'] = file.field;
        mp.files.add(file);
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
    } else {
      return;
    }
  }
  /// 
  ///
  /// 
  Future postNodeRw(String path, String name, { String addMembers }) async {
    Object postBody = null;

    // verify required params are set
    if(path == null) {
     throw new ApiException(400, "Missing required param: path");
    }
    if(name == null) {
     throw new ApiException(400, "Missing required param: name");
    }

    // create path and map variables
    String path = "/{path}/{name}.rw.html".replaceAll("{format}","json").replaceAll("{" + "path" + "}", path.toString()).replaceAll("{" + "name" + "}", name.toString());

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    if(addMembers != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "addMembers", addMembers));
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
  Future postPath(String path, String jcr:primaryType, String :name) async {
    Object postBody = null;

    // verify required params are set
    if(path == null) {
     throw new ApiException(400, "Missing required param: path");
    }
    if(jcr:primaryType == null) {
     throw new ApiException(400, "Missing required param: jcr:primaryType");
    }
    if(:name == null) {
     throw new ApiException(400, "Missing required param: :name");
    }

    // create path and map variables
    String path = "/{path}/".replaceAll("{format}","json").replaceAll("{" + "path" + "}", path.toString());

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
      queryParams.addAll(_convertParametersForCollectionFormat("", "jcr:primaryType", jcr:primaryType));
      queryParams.addAll(_convertParametersForCollectionFormat("", ":name", :name));

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
  Future<String> postQuery(String path, num pLimit, String n1property, String n1propertyValue) async {
    Object postBody = null;

    // verify required params are set
    if(path == null) {
     throw new ApiException(400, "Missing required param: path");
    }
    if(pLimit == null) {
     throw new ApiException(400, "Missing required param: pLimit");
    }
    if(n1property == null) {
     throw new ApiException(400, "Missing required param: n1property");
    }
    if(n1propertyValue == null) {
     throw new ApiException(400, "Missing required param: n1propertyValue");
    }

    // create path and map variables
    String path = "/bin/querybuilder.json".replaceAll("{format}","json");

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
      queryParams.addAll(_convertParametersForCollectionFormat("", "path", path));
      queryParams.addAll(_convertParametersForCollectionFormat("", "p.limit", pLimit));
      queryParams.addAll(_convertParametersForCollectionFormat("", "1_property", n1property));
      queryParams.addAll(_convertParametersForCollectionFormat("", "1_property.value", n1propertyValue));

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
  Future postTreeActivation(bool ignoredeactivated, bool onlymodified, String path) async {
    Object postBody = null;

    // verify required params are set
    if(ignoredeactivated == null) {
     throw new ApiException(400, "Missing required param: ignoredeactivated");
    }
    if(onlymodified == null) {
     throw new ApiException(400, "Missing required param: onlymodified");
    }
    if(path == null) {
     throw new ApiException(400, "Missing required param: path");
    }

    // create path and map variables
    String path = "/etc/replication/treeactivation.html".replaceAll("{format}","json");

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
      queryParams.addAll(_convertParametersForCollectionFormat("", "ignoredeactivated", ignoredeactivated));
      queryParams.addAll(_convertParametersForCollectionFormat("", "onlymodified", onlymodified));
      queryParams.addAll(_convertParametersForCollectionFormat("", "path", path));

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
  Future<String> postTruststore({ String :operation, String newPassword, String rePassword, String keyStoreType, String removeAlias, MultipartFile certificate }) async {
    Object postBody = null;

    // verify required params are set

    // create path and map variables
    String path = "/libs/granite/security/post/truststore".replaceAll("{format}","json");

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    if(:operation != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", ":operation", :operation));
    }
    if(newPassword != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "newPassword", newPassword));
    }
    if(rePassword != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "rePassword", rePassword));
    }
    if(keyStoreType != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "keyStoreType", keyStoreType));
    }
    if(removeAlias != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "removeAlias", removeAlias));
    }

    List<String> contentTypes = ["multipart/form-data"];

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";
    List<String> authNames = ["aemAuth"];

    if(contentType.startsWith("multipart/form-data")) {
      bool hasFields = false;
      MultipartRequest mp = new MultipartRequest(null, null);
      if (certificate != null) {
        hasFields = true;
        mp.fields['certificate'] = certificate.field;
        mp.files.add(certificate);
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
  Future<String> postTruststorePKCS12({ MultipartFile truststoreP12 }) async {
    Object postBody = null;

    // verify required params are set

    // create path and map variables
    String path = "/etc/truststore".replaceAll("{format}","json");

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};

    List<String> contentTypes = ["multipart/form-data"];

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";
    List<String> authNames = ["aemAuth"];

    if(contentType.startsWith("multipart/form-data")) {
      bool hasFields = false;
      MultipartRequest mp = new MultipartRequest(null, null);
      if (truststoreP12 != null) {
        hasFields = true;
        mp.fields['truststore.p12'] = truststoreP12.field;
        mp.files.add(truststoreP12);
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
}
