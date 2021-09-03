//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.0

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class SlingApi {
  SlingApi([ApiClient apiClient]) : apiClient = apiClient ?? defaultApiClient;

  final ApiClient apiClient;

  /// Performs an HTTP 'DELETE /etc/replication/agents.{runmode}/{name}' operation and returns the [Response].
  /// Parameters:
  ///
  /// * [String] runmode (required):
  ///
  /// * [String] name (required):
  Future<Response> deleteAgentWithHttpInfo(String runmode, String name) async {
    // Verify required params are set.
    if (runmode == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: runmode');
    }
    if (name == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: name');
    }

    final path = r'/etc/replication/agents.{runmode}/{name}'
      .replaceAll('{' + 'runmode' + '}', runmode.toString())
      .replaceAll('{' + 'name' + '}', name.toString());

    Object postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    final contentTypes = <String>[];
    final nullableContentType = contentTypes.isNotEmpty ? contentTypes[0] : null;
    final authNames = <String>['aemAuth'];


    return await apiClient.invokeAPI(
      path,
      'DELETE',
      queryParams,
      postBody,
      headerParams,
      formParams,
      nullableContentType,
      authNames,
    );
  }

  /// Parameters:
  ///
  /// * [String] runmode (required):
  ///
  /// * [String] name (required):
  Future<void> deleteAgent(String runmode, String name) async {
    final response = await deleteAgentWithHttpInfo(runmode, name);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
  }

  /// Performs an HTTP 'DELETE /{path}/{name}' operation and returns the [Response].
  /// Parameters:
  ///
  /// * [String] path (required):
  ///
  /// * [String] name (required):
  Future<Response> deleteNodeWithHttpInfo(String path, String name) async {
    // Verify required params are set.
    if (path == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: path');
    }
    if (name == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: name');
    }

    final path = r'/{path}/{name}'
      .replaceAll('{' + 'path' + '}', path.toString())
      .replaceAll('{' + 'name' + '}', name.toString());

    Object postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    final contentTypes = <String>[];
    final nullableContentType = contentTypes.isNotEmpty ? contentTypes[0] : null;
    final authNames = <String>['aemAuth'];


    return await apiClient.invokeAPI(
      path,
      'DELETE',
      queryParams,
      postBody,
      headerParams,
      formParams,
      nullableContentType,
      authNames,
    );
  }

  /// Parameters:
  ///
  /// * [String] path (required):
  ///
  /// * [String] name (required):
  Future<void> deleteNode(String path, String name) async {
    final response = await deleteNodeWithHttpInfo(path, name);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
  }

  /// Performs an HTTP 'GET /etc/replication/agents.{runmode}/{name}' operation and returns the [Response].
  /// Parameters:
  ///
  /// * [String] runmode (required):
  ///
  /// * [String] name (required):
  Future<Response> getAgentWithHttpInfo(String runmode, String name) async {
    // Verify required params are set.
    if (runmode == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: runmode');
    }
    if (name == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: name');
    }

    final path = r'/etc/replication/agents.{runmode}/{name}'
      .replaceAll('{' + 'runmode' + '}', runmode.toString())
      .replaceAll('{' + 'name' + '}', name.toString());

    Object postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    final contentTypes = <String>[];
    final nullableContentType = contentTypes.isNotEmpty ? contentTypes[0] : null;
    final authNames = <String>['aemAuth'];


    return await apiClient.invokeAPI(
      path,
      'GET',
      queryParams,
      postBody,
      headerParams,
      formParams,
      nullableContentType,
      authNames,
    );
  }

  /// Parameters:
  ///
  /// * [String] runmode (required):
  ///
  /// * [String] name (required):
  Future<void> getAgent(String runmode, String name) async {
    final response = await getAgentWithHttpInfo(runmode, name);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
  }

  /// Performs an HTTP 'GET /etc/replication/agents.{runmode}.-1.json' operation and returns the [Response].
  /// Parameters:
  ///
  /// * [String] runmode (required):
  Future<Response> getAgentsWithHttpInfo(String runmode) async {
    // Verify required params are set.
    if (runmode == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: runmode');
    }

    final path = r'/etc/replication/agents.{runmode}.-1.json'
      .replaceAll('{' + 'runmode' + '}', runmode.toString());

    Object postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    final contentTypes = <String>[];
    final nullableContentType = contentTypes.isNotEmpty ? contentTypes[0] : null;
    final authNames = <String>['aemAuth'];


    return await apiClient.invokeAPI(
      path,
      'GET',
      queryParams,
      postBody,
      headerParams,
      formParams,
      nullableContentType,
      authNames,
    );
  }

  /// Parameters:
  ///
  /// * [String] runmode (required):
  Future<String> getAgents(String runmode) async {
    final response = await getAgentsWithHttpInfo(runmode);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body != null && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'String',) as String;
        }
    return Future<String>.value(null);
  }

  /// Performs an HTTP 'GET /{intermediatePath}/{authorizableId}.ks.json' operation and returns the [Response].
  /// Parameters:
  ///
  /// * [String] intermediatePath (required):
  ///
  /// * [String] authorizableId (required):
  Future<Response> getAuthorizableKeystoreWithHttpInfo(String intermediatePath, String authorizableId) async {
    // Verify required params are set.
    if (intermediatePath == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: intermediatePath');
    }
    if (authorizableId == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: authorizableId');
    }

    final path = r'/{intermediatePath}/{authorizableId}.ks.json'
      .replaceAll('{' + 'intermediatePath' + '}', intermediatePath.toString())
      .replaceAll('{' + 'authorizableId' + '}', authorizableId.toString());

    Object postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    final contentTypes = <String>[];
    final nullableContentType = contentTypes.isNotEmpty ? contentTypes[0] : null;
    final authNames = <String>['aemAuth'];


    return await apiClient.invokeAPI(
      path,
      'GET',
      queryParams,
      postBody,
      headerParams,
      formParams,
      nullableContentType,
      authNames,
    );
  }

  /// Parameters:
  ///
  /// * [String] intermediatePath (required):
  ///
  /// * [String] authorizableId (required):
  Future<KeystoreInfo> getAuthorizableKeystore(String intermediatePath, String authorizableId) async {
    final response = await getAuthorizableKeystoreWithHttpInfo(intermediatePath, authorizableId);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body != null && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'KeystoreInfo',) as KeystoreInfo;
        }
    return Future<KeystoreInfo>.value(null);
  }

  /// Performs an HTTP 'GET /{intermediatePath}/{authorizableId}/keystore/store.p12' operation and returns the [Response].
  /// Parameters:
  ///
  /// * [String] intermediatePath (required):
  ///
  /// * [String] authorizableId (required):
  Future<Response> getKeystoreWithHttpInfo(String intermediatePath, String authorizableId) async {
    // Verify required params are set.
    if (intermediatePath == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: intermediatePath');
    }
    if (authorizableId == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: authorizableId');
    }

    final path = r'/{intermediatePath}/{authorizableId}/keystore/store.p12'
      .replaceAll('{' + 'intermediatePath' + '}', intermediatePath.toString())
      .replaceAll('{' + 'authorizableId' + '}', authorizableId.toString());

    Object postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    final contentTypes = <String>[];
    final nullableContentType = contentTypes.isNotEmpty ? contentTypes[0] : null;
    final authNames = <String>['aemAuth'];


    return await apiClient.invokeAPI(
      path,
      'GET',
      queryParams,
      postBody,
      headerParams,
      formParams,
      nullableContentType,
      authNames,
    );
  }

  /// Parameters:
  ///
  /// * [String] intermediatePath (required):
  ///
  /// * [String] authorizableId (required):
  Future<MultipartFile> getKeystore(String intermediatePath, String authorizableId) async {
    final response = await getKeystoreWithHttpInfo(intermediatePath, authorizableId);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body != null && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'MultipartFile',) as MultipartFile;
        }
    return Future<MultipartFile>.value(null);
  }

  /// Performs an HTTP 'GET /{path}/{name}' operation and returns the [Response].
  /// Parameters:
  ///
  /// * [String] path (required):
  ///
  /// * [String] name (required):
  Future<Response> getNodeWithHttpInfo(String path, String name) async {
    // Verify required params are set.
    if (path == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: path');
    }
    if (name == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: name');
    }

    final path = r'/{path}/{name}'
      .replaceAll('{' + 'path' + '}', path.toString())
      .replaceAll('{' + 'name' + '}', name.toString());

    Object postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    final contentTypes = <String>[];
    final nullableContentType = contentTypes.isNotEmpty ? contentTypes[0] : null;
    final authNames = <String>['aemAuth'];


    return await apiClient.invokeAPI(
      path,
      'GET',
      queryParams,
      postBody,
      headerParams,
      formParams,
      nullableContentType,
      authNames,
    );
  }

  /// Parameters:
  ///
  /// * [String] path (required):
  ///
  /// * [String] name (required):
  Future<void> getNode(String path, String name) async {
    final response = await getNodeWithHttpInfo(path, name);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
  }

  /// Performs an HTTP 'GET /etc/packages/{group}/{name}-{version}.zip' operation and returns the [Response].
  /// Parameters:
  ///
  /// * [String] group (required):
  ///
  /// * [String] name (required):
  ///
  /// * [String] version (required):
  Future<Response> getPackageWithHttpInfo(String group, String name, String version) async {
    // Verify required params are set.
    if (group == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: group');
    }
    if (name == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: name');
    }
    if (version == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: version');
    }

    final path = r'/etc/packages/{group}/{name}-{version}.zip'
      .replaceAll('{' + 'group' + '}', group.toString())
      .replaceAll('{' + 'name' + '}', name.toString())
      .replaceAll('{' + 'version' + '}', version.toString());

    Object postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    final contentTypes = <String>[];
    final nullableContentType = contentTypes.isNotEmpty ? contentTypes[0] : null;
    final authNames = <String>['aemAuth'];


    return await apiClient.invokeAPI(
      path,
      'GET',
      queryParams,
      postBody,
      headerParams,
      formParams,
      nullableContentType,
      authNames,
    );
  }

  /// Parameters:
  ///
  /// * [String] group (required):
  ///
  /// * [String] name (required):
  ///
  /// * [String] version (required):
  Future<MultipartFile> getPackage(String group, String name, String version) async {
    final response = await getPackageWithHttpInfo(group, name, version);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body != null && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'MultipartFile',) as MultipartFile;
        }
    return Future<MultipartFile>.value(null);
  }

  /// Performs an HTTP 'GET /etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json' operation and returns the [Response].
  /// Parameters:
  ///
  /// * [String] group (required):
  ///
  /// * [String] name (required):
  ///
  /// * [String] version (required):
  Future<Response> getPackageFilterWithHttpInfo(String group, String name, String version) async {
    // Verify required params are set.
    if (group == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: group');
    }
    if (name == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: name');
    }
    if (version == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: version');
    }

    final path = r'/etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json'
      .replaceAll('{' + 'group' + '}', group.toString())
      .replaceAll('{' + 'name' + '}', name.toString())
      .replaceAll('{' + 'version' + '}', version.toString());

    Object postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    final contentTypes = <String>[];
    final nullableContentType = contentTypes.isNotEmpty ? contentTypes[0] : null;
    final authNames = <String>['aemAuth'];


    return await apiClient.invokeAPI(
      path,
      'GET',
      queryParams,
      postBody,
      headerParams,
      formParams,
      nullableContentType,
      authNames,
    );
  }

  /// Parameters:
  ///
  /// * [String] group (required):
  ///
  /// * [String] name (required):
  ///
  /// * [String] version (required):
  Future<String> getPackageFilter(String group, String name, String version) async {
    final response = await getPackageFilterWithHttpInfo(group, name, version);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body != null && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'String',) as String;
        }
    return Future<String>.value(null);
  }

  /// Performs an HTTP 'GET /bin/querybuilder.json' operation and returns the [Response].
  /// Parameters:
  ///
  /// * [String] path (required):
  ///
  /// * [num] pPeriodLimit (required):
  ///
  /// * [String] n1property (required):
  ///
  /// * [String] n1propertyPeriodValue (required):
  Future<Response> getQueryWithHttpInfo(String path, num pPeriodLimit, String n1property, String n1propertyPeriodValue) async {
    // Verify required params are set.
    if (path == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: path');
    }
    if (pPeriodLimit == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: pPeriodLimit');
    }
    if (n1property == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: n1property');
    }
    if (n1propertyPeriodValue == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: n1propertyPeriodValue');
    }

    final path = r'/bin/querybuilder.json';

    Object postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

      queryParams.addAll(_convertParametersForCollectionFormat('', 'path', path));
      queryParams.addAll(_convertParametersForCollectionFormat('', 'p.limit', pPeriodLimit));
      queryParams.addAll(_convertParametersForCollectionFormat('', '1_property', n1property));
      queryParams.addAll(_convertParametersForCollectionFormat('', '1_property.value', n1propertyPeriodValue));

    final contentTypes = <String>[];
    final nullableContentType = contentTypes.isNotEmpty ? contentTypes[0] : null;
    final authNames = <String>['aemAuth'];


    return await apiClient.invokeAPI(
      path,
      'GET',
      queryParams,
      postBody,
      headerParams,
      formParams,
      nullableContentType,
      authNames,
    );
  }

  /// Parameters:
  ///
  /// * [String] path (required):
  ///
  /// * [num] pPeriodLimit (required):
  ///
  /// * [String] n1property (required):
  ///
  /// * [String] n1propertyPeriodValue (required):
  Future<String> getQuery(String path, num pPeriodLimit, String n1property, String n1propertyPeriodValue) async {
    final response = await getQueryWithHttpInfo(path, pPeriodLimit, n1property, n1propertyPeriodValue);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body != null && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'String',) as String;
        }
    return Future<String>.value(null);
  }

  /// Performs an HTTP 'GET /etc/truststore/truststore.p12' operation and returns the [Response].
  Future<Response> getTruststoreWithHttpInfo() async {
    final path = r'/etc/truststore/truststore.p12';

    Object postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    final contentTypes = <String>[];
    final nullableContentType = contentTypes.isNotEmpty ? contentTypes[0] : null;
    final authNames = <String>['aemAuth'];


    return await apiClient.invokeAPI(
      path,
      'GET',
      queryParams,
      postBody,
      headerParams,
      formParams,
      nullableContentType,
      authNames,
    );
  }

  Future<MultipartFile> getTruststore() async {
    final response = await getTruststoreWithHttpInfo();
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body != null && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'MultipartFile',) as MultipartFile;
        }
    return Future<MultipartFile>.value(null);
  }

  /// Performs an HTTP 'GET /libs/granite/security/truststore.json' operation and returns the [Response].
  Future<Response> getTruststoreInfoWithHttpInfo() async {
    final path = r'/libs/granite/security/truststore.json';

    Object postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    final contentTypes = <String>[];
    final nullableContentType = contentTypes.isNotEmpty ? contentTypes[0] : null;
    final authNames = <String>['aemAuth'];


    return await apiClient.invokeAPI(
      path,
      'GET',
      queryParams,
      postBody,
      headerParams,
      formParams,
      nullableContentType,
      authNames,
    );
  }

  Future<TruststoreInfo> getTruststoreInfo() async {
    final response = await getTruststoreInfoWithHttpInfo();
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body != null && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'TruststoreInfo',) as TruststoreInfo;
        }
    return Future<TruststoreInfo>.value(null);
  }

  /// Performs an HTTP 'POST /etc/replication/agents.{runmode}/{name}' operation and returns the [Response].
  /// Parameters:
  ///
  /// * [String] runmode (required):
  ///
  /// * [String] name (required):
  ///
  /// * [bool] jcrColonContentSlashCqColonDistribute:
  ///
  /// * [String] jcrColonContentSlashCqColonDistributeAtTypeHint:
  ///
  /// * [String] jcrColonContentSlashCqColonName:
  ///
  /// * [String] jcrColonContentSlashCqColonTemplate:
  ///
  /// * [bool] jcrColonContentSlashEnabled:
  ///
  /// * [String] jcrColonContentSlashJcrColonDescription:
  ///
  /// * [String] jcrColonContentSlashJcrColonLastModified:
  ///
  /// * [String] jcrColonContentSlashJcrColonLastModifiedBy:
  ///
  /// * [String] jcrColonContentSlashJcrColonMixinTypes:
  ///
  /// * [String] jcrColonContentSlashJcrColonTitle:
  ///
  /// * [String] jcrColonContentSlashLogLevel:
  ///
  /// * [bool] jcrColonContentSlashNoStatusUpdate:
  ///
  /// * [bool] jcrColonContentSlashNoVersioning:
  ///
  /// * [num] jcrColonContentSlashProtocolConnectTimeout:
  ///
  /// * [bool] jcrColonContentSlashProtocolHTTPConnectionClosed:
  ///
  /// * [String] jcrColonContentSlashProtocolHTTPExpired:
  ///
  /// * [List<String>] jcrColonContentSlashProtocolHTTPHeaders:
  ///
  /// * [String] jcrColonContentSlashProtocolHTTPHeadersAtTypeHint:
  ///
  /// * [String] jcrColonContentSlashProtocolHTTPMethod:
  ///
  /// * [bool] jcrColonContentSlashProtocolHTTPSRelaxed:
  ///
  /// * [String] jcrColonContentSlashProtocolInterface:
  ///
  /// * [num] jcrColonContentSlashProtocolSocketTimeout:
  ///
  /// * [String] jcrColonContentSlashProtocolVersion:
  ///
  /// * [String] jcrColonContentSlashProxyNTLMDomain:
  ///
  /// * [String] jcrColonContentSlashProxyNTLMHost:
  ///
  /// * [String] jcrColonContentSlashProxyHost:
  ///
  /// * [String] jcrColonContentSlashProxyPassword:
  ///
  /// * [num] jcrColonContentSlashProxyPort:
  ///
  /// * [String] jcrColonContentSlashProxyUser:
  ///
  /// * [num] jcrColonContentSlashQueueBatchMaxSize:
  ///
  /// * [String] jcrColonContentSlashQueueBatchMode:
  ///
  /// * [num] jcrColonContentSlashQueueBatchWaitTime:
  ///
  /// * [String] jcrColonContentSlashRetryDelay:
  ///
  /// * [bool] jcrColonContentSlashReverseReplication:
  ///
  /// * [String] jcrColonContentSlashSerializationType:
  ///
  /// * [String] jcrColonContentSlashSlingColonResourceType:
  ///
  /// * [String] jcrColonContentSlashSsl:
  ///
  /// * [String] jcrColonContentSlashTransportNTLMDomain:
  ///
  /// * [String] jcrColonContentSlashTransportNTLMHost:
  ///
  /// * [String] jcrColonContentSlashTransportPassword:
  ///
  /// * [String] jcrColonContentSlashTransportUri:
  ///
  /// * [String] jcrColonContentSlashTransportUser:
  ///
  /// * [bool] jcrColonContentSlashTriggerDistribute:
  ///
  /// * [bool] jcrColonContentSlashTriggerModified:
  ///
  /// * [bool] jcrColonContentSlashTriggerOnOffTime:
  ///
  /// * [bool] jcrColonContentSlashTriggerReceive:
  ///
  /// * [bool] jcrColonContentSlashTriggerSpecific:
  ///
  /// * [String] jcrColonContentSlashUserId:
  ///
  /// * [String] jcrColonPrimaryType:
  ///
  /// * [String] colonOperation:
  Future<Response> postAgentWithHttpInfo(String runmode, String name, { bool jcrColonContentSlashCqColonDistribute, String jcrColonContentSlashCqColonDistributeAtTypeHint, String jcrColonContentSlashCqColonName, String jcrColonContentSlashCqColonTemplate, bool jcrColonContentSlashEnabled, String jcrColonContentSlashJcrColonDescription, String jcrColonContentSlashJcrColonLastModified, String jcrColonContentSlashJcrColonLastModifiedBy, String jcrColonContentSlashJcrColonMixinTypes, String jcrColonContentSlashJcrColonTitle, String jcrColonContentSlashLogLevel, bool jcrColonContentSlashNoStatusUpdate, bool jcrColonContentSlashNoVersioning, num jcrColonContentSlashProtocolConnectTimeout, bool jcrColonContentSlashProtocolHTTPConnectionClosed, String jcrColonContentSlashProtocolHTTPExpired, List<String> jcrColonContentSlashProtocolHTTPHeaders, String jcrColonContentSlashProtocolHTTPHeadersAtTypeHint, String jcrColonContentSlashProtocolHTTPMethod, bool jcrColonContentSlashProtocolHTTPSRelaxed, String jcrColonContentSlashProtocolInterface, num jcrColonContentSlashProtocolSocketTimeout, String jcrColonContentSlashProtocolVersion, String jcrColonContentSlashProxyNTLMDomain, String jcrColonContentSlashProxyNTLMHost, String jcrColonContentSlashProxyHost, String jcrColonContentSlashProxyPassword, num jcrColonContentSlashProxyPort, String jcrColonContentSlashProxyUser, num jcrColonContentSlashQueueBatchMaxSize, String jcrColonContentSlashQueueBatchMode, num jcrColonContentSlashQueueBatchWaitTime, String jcrColonContentSlashRetryDelay, bool jcrColonContentSlashReverseReplication, String jcrColonContentSlashSerializationType, String jcrColonContentSlashSlingColonResourceType, String jcrColonContentSlashSsl, String jcrColonContentSlashTransportNTLMDomain, String jcrColonContentSlashTransportNTLMHost, String jcrColonContentSlashTransportPassword, String jcrColonContentSlashTransportUri, String jcrColonContentSlashTransportUser, bool jcrColonContentSlashTriggerDistribute, bool jcrColonContentSlashTriggerModified, bool jcrColonContentSlashTriggerOnOffTime, bool jcrColonContentSlashTriggerReceive, bool jcrColonContentSlashTriggerSpecific, String jcrColonContentSlashUserId, String jcrColonPrimaryType, String colonOperation }) async {
    // Verify required params are set.
    if (runmode == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: runmode');
    }
    if (name == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: name');
    }

    final path = r'/etc/replication/agents.{runmode}/{name}'
      .replaceAll('{' + 'runmode' + '}', runmode.toString())
      .replaceAll('{' + 'name' + '}', name.toString());

    Object postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (jcrColonContentSlashCqColonDistribute != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'jcr:content/cq:distribute', jcrColonContentSlashCqColonDistribute));
    }
    if (jcrColonContentSlashCqColonDistributeAtTypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'jcr:content/cq:distribute@TypeHint', jcrColonContentSlashCqColonDistributeAtTypeHint));
    }
    if (jcrColonContentSlashCqColonName != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'jcr:content/cq:name', jcrColonContentSlashCqColonName));
    }
    if (jcrColonContentSlashCqColonTemplate != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'jcr:content/cq:template', jcrColonContentSlashCqColonTemplate));
    }
    if (jcrColonContentSlashEnabled != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'jcr:content/enabled', jcrColonContentSlashEnabled));
    }
    if (jcrColonContentSlashJcrColonDescription != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'jcr:content/jcr:description', jcrColonContentSlashJcrColonDescription));
    }
    if (jcrColonContentSlashJcrColonLastModified != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'jcr:content/jcr:lastModified', jcrColonContentSlashJcrColonLastModified));
    }
    if (jcrColonContentSlashJcrColonLastModifiedBy != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'jcr:content/jcr:lastModifiedBy', jcrColonContentSlashJcrColonLastModifiedBy));
    }
    if (jcrColonContentSlashJcrColonMixinTypes != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'jcr:content/jcr:mixinTypes', jcrColonContentSlashJcrColonMixinTypes));
    }
    if (jcrColonContentSlashJcrColonTitle != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'jcr:content/jcr:title', jcrColonContentSlashJcrColonTitle));
    }
    if (jcrColonContentSlashLogLevel != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'jcr:content/logLevel', jcrColonContentSlashLogLevel));
    }
    if (jcrColonContentSlashNoStatusUpdate != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'jcr:content/noStatusUpdate', jcrColonContentSlashNoStatusUpdate));
    }
    if (jcrColonContentSlashNoVersioning != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'jcr:content/noVersioning', jcrColonContentSlashNoVersioning));
    }
    if (jcrColonContentSlashProtocolConnectTimeout != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'jcr:content/protocolConnectTimeout', jcrColonContentSlashProtocolConnectTimeout));
    }
    if (jcrColonContentSlashProtocolHTTPConnectionClosed != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'jcr:content/protocolHTTPConnectionClosed', jcrColonContentSlashProtocolHTTPConnectionClosed));
    }
    if (jcrColonContentSlashProtocolHTTPExpired != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'jcr:content/protocolHTTPExpired', jcrColonContentSlashProtocolHTTPExpired));
    }
    if (jcrColonContentSlashProtocolHTTPHeaders != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('multi', 'jcr:content/protocolHTTPHeaders', jcrColonContentSlashProtocolHTTPHeaders));
    }
    if (jcrColonContentSlashProtocolHTTPHeadersAtTypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'jcr:content/protocolHTTPHeaders@TypeHint', jcrColonContentSlashProtocolHTTPHeadersAtTypeHint));
    }
    if (jcrColonContentSlashProtocolHTTPMethod != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'jcr:content/protocolHTTPMethod', jcrColonContentSlashProtocolHTTPMethod));
    }
    if (jcrColonContentSlashProtocolHTTPSRelaxed != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'jcr:content/protocolHTTPSRelaxed', jcrColonContentSlashProtocolHTTPSRelaxed));
    }
    if (jcrColonContentSlashProtocolInterface != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'jcr:content/protocolInterface', jcrColonContentSlashProtocolInterface));
    }
    if (jcrColonContentSlashProtocolSocketTimeout != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'jcr:content/protocolSocketTimeout', jcrColonContentSlashProtocolSocketTimeout));
    }
    if (jcrColonContentSlashProtocolVersion != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'jcr:content/protocolVersion', jcrColonContentSlashProtocolVersion));
    }
    if (jcrColonContentSlashProxyNTLMDomain != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'jcr:content/proxyNTLMDomain', jcrColonContentSlashProxyNTLMDomain));
    }
    if (jcrColonContentSlashProxyNTLMHost != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'jcr:content/proxyNTLMHost', jcrColonContentSlashProxyNTLMHost));
    }
    if (jcrColonContentSlashProxyHost != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'jcr:content/proxyHost', jcrColonContentSlashProxyHost));
    }
    if (jcrColonContentSlashProxyPassword != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'jcr:content/proxyPassword', jcrColonContentSlashProxyPassword));
    }
    if (jcrColonContentSlashProxyPort != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'jcr:content/proxyPort', jcrColonContentSlashProxyPort));
    }
    if (jcrColonContentSlashProxyUser != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'jcr:content/proxyUser', jcrColonContentSlashProxyUser));
    }
    if (jcrColonContentSlashQueueBatchMaxSize != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'jcr:content/queueBatchMaxSize', jcrColonContentSlashQueueBatchMaxSize));
    }
    if (jcrColonContentSlashQueueBatchMode != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'jcr:content/queueBatchMode', jcrColonContentSlashQueueBatchMode));
    }
    if (jcrColonContentSlashQueueBatchWaitTime != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'jcr:content/queueBatchWaitTime', jcrColonContentSlashQueueBatchWaitTime));
    }
    if (jcrColonContentSlashRetryDelay != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'jcr:content/retryDelay', jcrColonContentSlashRetryDelay));
    }
    if (jcrColonContentSlashReverseReplication != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'jcr:content/reverseReplication', jcrColonContentSlashReverseReplication));
    }
    if (jcrColonContentSlashSerializationType != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'jcr:content/serializationType', jcrColonContentSlashSerializationType));
    }
    if (jcrColonContentSlashSlingColonResourceType != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'jcr:content/sling:resourceType', jcrColonContentSlashSlingColonResourceType));
    }
    if (jcrColonContentSlashSsl != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'jcr:content/ssl', jcrColonContentSlashSsl));
    }
    if (jcrColonContentSlashTransportNTLMDomain != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'jcr:content/transportNTLMDomain', jcrColonContentSlashTransportNTLMDomain));
    }
    if (jcrColonContentSlashTransportNTLMHost != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'jcr:content/transportNTLMHost', jcrColonContentSlashTransportNTLMHost));
    }
    if (jcrColonContentSlashTransportPassword != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'jcr:content/transportPassword', jcrColonContentSlashTransportPassword));
    }
    if (jcrColonContentSlashTransportUri != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'jcr:content/transportUri', jcrColonContentSlashTransportUri));
    }
    if (jcrColonContentSlashTransportUser != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'jcr:content/transportUser', jcrColonContentSlashTransportUser));
    }
    if (jcrColonContentSlashTriggerDistribute != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'jcr:content/triggerDistribute', jcrColonContentSlashTriggerDistribute));
    }
    if (jcrColonContentSlashTriggerModified != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'jcr:content/triggerModified', jcrColonContentSlashTriggerModified));
    }
    if (jcrColonContentSlashTriggerOnOffTime != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'jcr:content/triggerOnOffTime', jcrColonContentSlashTriggerOnOffTime));
    }
    if (jcrColonContentSlashTriggerReceive != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'jcr:content/triggerReceive', jcrColonContentSlashTriggerReceive));
    }
    if (jcrColonContentSlashTriggerSpecific != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'jcr:content/triggerSpecific', jcrColonContentSlashTriggerSpecific));
    }
    if (jcrColonContentSlashUserId != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'jcr:content/userId', jcrColonContentSlashUserId));
    }
    if (jcrColonPrimaryType != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'jcr:primaryType', jcrColonPrimaryType));
    }
    if (colonOperation != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', ':operation', colonOperation));
    }

    final contentTypes = <String>[];
    final nullableContentType = contentTypes.isNotEmpty ? contentTypes[0] : null;
    final authNames = <String>['aemAuth'];


    return await apiClient.invokeAPI(
      path,
      'POST',
      queryParams,
      postBody,
      headerParams,
      formParams,
      nullableContentType,
      authNames,
    );
  }

  /// Parameters:
  ///
  /// * [String] runmode (required):
  ///
  /// * [String] name (required):
  ///
  /// * [bool] jcrColonContentSlashCqColonDistribute:
  ///
  /// * [String] jcrColonContentSlashCqColonDistributeAtTypeHint:
  ///
  /// * [String] jcrColonContentSlashCqColonName:
  ///
  /// * [String] jcrColonContentSlashCqColonTemplate:
  ///
  /// * [bool] jcrColonContentSlashEnabled:
  ///
  /// * [String] jcrColonContentSlashJcrColonDescription:
  ///
  /// * [String] jcrColonContentSlashJcrColonLastModified:
  ///
  /// * [String] jcrColonContentSlashJcrColonLastModifiedBy:
  ///
  /// * [String] jcrColonContentSlashJcrColonMixinTypes:
  ///
  /// * [String] jcrColonContentSlashJcrColonTitle:
  ///
  /// * [String] jcrColonContentSlashLogLevel:
  ///
  /// * [bool] jcrColonContentSlashNoStatusUpdate:
  ///
  /// * [bool] jcrColonContentSlashNoVersioning:
  ///
  /// * [num] jcrColonContentSlashProtocolConnectTimeout:
  ///
  /// * [bool] jcrColonContentSlashProtocolHTTPConnectionClosed:
  ///
  /// * [String] jcrColonContentSlashProtocolHTTPExpired:
  ///
  /// * [List<String>] jcrColonContentSlashProtocolHTTPHeaders:
  ///
  /// * [String] jcrColonContentSlashProtocolHTTPHeadersAtTypeHint:
  ///
  /// * [String] jcrColonContentSlashProtocolHTTPMethod:
  ///
  /// * [bool] jcrColonContentSlashProtocolHTTPSRelaxed:
  ///
  /// * [String] jcrColonContentSlashProtocolInterface:
  ///
  /// * [num] jcrColonContentSlashProtocolSocketTimeout:
  ///
  /// * [String] jcrColonContentSlashProtocolVersion:
  ///
  /// * [String] jcrColonContentSlashProxyNTLMDomain:
  ///
  /// * [String] jcrColonContentSlashProxyNTLMHost:
  ///
  /// * [String] jcrColonContentSlashProxyHost:
  ///
  /// * [String] jcrColonContentSlashProxyPassword:
  ///
  /// * [num] jcrColonContentSlashProxyPort:
  ///
  /// * [String] jcrColonContentSlashProxyUser:
  ///
  /// * [num] jcrColonContentSlashQueueBatchMaxSize:
  ///
  /// * [String] jcrColonContentSlashQueueBatchMode:
  ///
  /// * [num] jcrColonContentSlashQueueBatchWaitTime:
  ///
  /// * [String] jcrColonContentSlashRetryDelay:
  ///
  /// * [bool] jcrColonContentSlashReverseReplication:
  ///
  /// * [String] jcrColonContentSlashSerializationType:
  ///
  /// * [String] jcrColonContentSlashSlingColonResourceType:
  ///
  /// * [String] jcrColonContentSlashSsl:
  ///
  /// * [String] jcrColonContentSlashTransportNTLMDomain:
  ///
  /// * [String] jcrColonContentSlashTransportNTLMHost:
  ///
  /// * [String] jcrColonContentSlashTransportPassword:
  ///
  /// * [String] jcrColonContentSlashTransportUri:
  ///
  /// * [String] jcrColonContentSlashTransportUser:
  ///
  /// * [bool] jcrColonContentSlashTriggerDistribute:
  ///
  /// * [bool] jcrColonContentSlashTriggerModified:
  ///
  /// * [bool] jcrColonContentSlashTriggerOnOffTime:
  ///
  /// * [bool] jcrColonContentSlashTriggerReceive:
  ///
  /// * [bool] jcrColonContentSlashTriggerSpecific:
  ///
  /// * [String] jcrColonContentSlashUserId:
  ///
  /// * [String] jcrColonPrimaryType:
  ///
  /// * [String] colonOperation:
  Future<void> postAgent(String runmode, String name, { bool jcrColonContentSlashCqColonDistribute, String jcrColonContentSlashCqColonDistributeAtTypeHint, String jcrColonContentSlashCqColonName, String jcrColonContentSlashCqColonTemplate, bool jcrColonContentSlashEnabled, String jcrColonContentSlashJcrColonDescription, String jcrColonContentSlashJcrColonLastModified, String jcrColonContentSlashJcrColonLastModifiedBy, String jcrColonContentSlashJcrColonMixinTypes, String jcrColonContentSlashJcrColonTitle, String jcrColonContentSlashLogLevel, bool jcrColonContentSlashNoStatusUpdate, bool jcrColonContentSlashNoVersioning, num jcrColonContentSlashProtocolConnectTimeout, bool jcrColonContentSlashProtocolHTTPConnectionClosed, String jcrColonContentSlashProtocolHTTPExpired, List<String> jcrColonContentSlashProtocolHTTPHeaders, String jcrColonContentSlashProtocolHTTPHeadersAtTypeHint, String jcrColonContentSlashProtocolHTTPMethod, bool jcrColonContentSlashProtocolHTTPSRelaxed, String jcrColonContentSlashProtocolInterface, num jcrColonContentSlashProtocolSocketTimeout, String jcrColonContentSlashProtocolVersion, String jcrColonContentSlashProxyNTLMDomain, String jcrColonContentSlashProxyNTLMHost, String jcrColonContentSlashProxyHost, String jcrColonContentSlashProxyPassword, num jcrColonContentSlashProxyPort, String jcrColonContentSlashProxyUser, num jcrColonContentSlashQueueBatchMaxSize, String jcrColonContentSlashQueueBatchMode, num jcrColonContentSlashQueueBatchWaitTime, String jcrColonContentSlashRetryDelay, bool jcrColonContentSlashReverseReplication, String jcrColonContentSlashSerializationType, String jcrColonContentSlashSlingColonResourceType, String jcrColonContentSlashSsl, String jcrColonContentSlashTransportNTLMDomain, String jcrColonContentSlashTransportNTLMHost, String jcrColonContentSlashTransportPassword, String jcrColonContentSlashTransportUri, String jcrColonContentSlashTransportUser, bool jcrColonContentSlashTriggerDistribute, bool jcrColonContentSlashTriggerModified, bool jcrColonContentSlashTriggerOnOffTime, bool jcrColonContentSlashTriggerReceive, bool jcrColonContentSlashTriggerSpecific, String jcrColonContentSlashUserId, String jcrColonPrimaryType, String colonOperation }) async {
    final response = await postAgentWithHttpInfo(runmode, name,  jcrColonContentSlashCqColonDistribute: jcrColonContentSlashCqColonDistribute, jcrColonContentSlashCqColonDistributeAtTypeHint: jcrColonContentSlashCqColonDistributeAtTypeHint, jcrColonContentSlashCqColonName: jcrColonContentSlashCqColonName, jcrColonContentSlashCqColonTemplate: jcrColonContentSlashCqColonTemplate, jcrColonContentSlashEnabled: jcrColonContentSlashEnabled, jcrColonContentSlashJcrColonDescription: jcrColonContentSlashJcrColonDescription, jcrColonContentSlashJcrColonLastModified: jcrColonContentSlashJcrColonLastModified, jcrColonContentSlashJcrColonLastModifiedBy: jcrColonContentSlashJcrColonLastModifiedBy, jcrColonContentSlashJcrColonMixinTypes: jcrColonContentSlashJcrColonMixinTypes, jcrColonContentSlashJcrColonTitle: jcrColonContentSlashJcrColonTitle, jcrColonContentSlashLogLevel: jcrColonContentSlashLogLevel, jcrColonContentSlashNoStatusUpdate: jcrColonContentSlashNoStatusUpdate, jcrColonContentSlashNoVersioning: jcrColonContentSlashNoVersioning, jcrColonContentSlashProtocolConnectTimeout: jcrColonContentSlashProtocolConnectTimeout, jcrColonContentSlashProtocolHTTPConnectionClosed: jcrColonContentSlashProtocolHTTPConnectionClosed, jcrColonContentSlashProtocolHTTPExpired: jcrColonContentSlashProtocolHTTPExpired, jcrColonContentSlashProtocolHTTPHeaders: jcrColonContentSlashProtocolHTTPHeaders, jcrColonContentSlashProtocolHTTPHeadersAtTypeHint: jcrColonContentSlashProtocolHTTPHeadersAtTypeHint, jcrColonContentSlashProtocolHTTPMethod: jcrColonContentSlashProtocolHTTPMethod, jcrColonContentSlashProtocolHTTPSRelaxed: jcrColonContentSlashProtocolHTTPSRelaxed, jcrColonContentSlashProtocolInterface: jcrColonContentSlashProtocolInterface, jcrColonContentSlashProtocolSocketTimeout: jcrColonContentSlashProtocolSocketTimeout, jcrColonContentSlashProtocolVersion: jcrColonContentSlashProtocolVersion, jcrColonContentSlashProxyNTLMDomain: jcrColonContentSlashProxyNTLMDomain, jcrColonContentSlashProxyNTLMHost: jcrColonContentSlashProxyNTLMHost, jcrColonContentSlashProxyHost: jcrColonContentSlashProxyHost, jcrColonContentSlashProxyPassword: jcrColonContentSlashProxyPassword, jcrColonContentSlashProxyPort: jcrColonContentSlashProxyPort, jcrColonContentSlashProxyUser: jcrColonContentSlashProxyUser, jcrColonContentSlashQueueBatchMaxSize: jcrColonContentSlashQueueBatchMaxSize, jcrColonContentSlashQueueBatchMode: jcrColonContentSlashQueueBatchMode, jcrColonContentSlashQueueBatchWaitTime: jcrColonContentSlashQueueBatchWaitTime, jcrColonContentSlashRetryDelay: jcrColonContentSlashRetryDelay, jcrColonContentSlashReverseReplication: jcrColonContentSlashReverseReplication, jcrColonContentSlashSerializationType: jcrColonContentSlashSerializationType, jcrColonContentSlashSlingColonResourceType: jcrColonContentSlashSlingColonResourceType, jcrColonContentSlashSsl: jcrColonContentSlashSsl, jcrColonContentSlashTransportNTLMDomain: jcrColonContentSlashTransportNTLMDomain, jcrColonContentSlashTransportNTLMHost: jcrColonContentSlashTransportNTLMHost, jcrColonContentSlashTransportPassword: jcrColonContentSlashTransportPassword, jcrColonContentSlashTransportUri: jcrColonContentSlashTransportUri, jcrColonContentSlashTransportUser: jcrColonContentSlashTransportUser, jcrColonContentSlashTriggerDistribute: jcrColonContentSlashTriggerDistribute, jcrColonContentSlashTriggerModified: jcrColonContentSlashTriggerModified, jcrColonContentSlashTriggerOnOffTime: jcrColonContentSlashTriggerOnOffTime, jcrColonContentSlashTriggerReceive: jcrColonContentSlashTriggerReceive, jcrColonContentSlashTriggerSpecific: jcrColonContentSlashTriggerSpecific, jcrColonContentSlashUserId: jcrColonContentSlashUserId, jcrColonPrimaryType: jcrColonPrimaryType, colonOperation: colonOperation );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
  }

  /// Performs an HTTP 'POST /{intermediatePath}/{authorizableId}.ks.html' operation and returns the [Response].
  /// Parameters:
  ///
  /// * [String] intermediatePath (required):
  ///
  /// * [String] authorizableId (required):
  ///
  /// * [String] colonOperation:
  ///
  /// * [String] currentPassword:
  ///
  /// * [String] newPassword:
  ///
  /// * [String] rePassword:
  ///
  /// * [String] keyPassword:
  ///
  /// * [String] keyStorePass:
  ///
  /// * [String] alias:
  ///
  /// * [String] newAlias:
  ///
  /// * [String] removeAlias:
  ///
  /// * [MultipartFile] certChain:
  ///
  /// * [MultipartFile] pk:
  ///
  /// * [MultipartFile] keyStore:
  Future<Response> postAuthorizableKeystoreWithHttpInfo(String intermediatePath, String authorizableId, { String colonOperation, String currentPassword, String newPassword, String rePassword, String keyPassword, String keyStorePass, String alias, String newAlias, String removeAlias, MultipartFile certChain, MultipartFile pk, MultipartFile keyStore }) async {
    // Verify required params are set.
    if (intermediatePath == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: intermediatePath');
    }
    if (authorizableId == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: authorizableId');
    }

    final path = r'/{intermediatePath}/{authorizableId}.ks.html'
      .replaceAll('{' + 'intermediatePath' + '}', intermediatePath.toString())
      .replaceAll('{' + 'authorizableId' + '}', authorizableId.toString());

    Object postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (colonOperation != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', ':operation', colonOperation));
    }
    if (currentPassword != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'currentPassword', currentPassword));
    }
    if (newPassword != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'newPassword', newPassword));
    }
    if (rePassword != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'rePassword', rePassword));
    }
    if (keyPassword != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'keyPassword', keyPassword));
    }
    if (keyStorePass != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'keyStorePass', keyStorePass));
    }
    if (alias != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'alias', alias));
    }
    if (newAlias != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'newAlias', newAlias));
    }
    if (removeAlias != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'removeAlias', removeAlias));
    }

    final contentTypes = <String>['multipart/form-data'];
    final nullableContentType = contentTypes.isNotEmpty ? contentTypes[0] : null;
    final authNames = <String>['aemAuth'];

    bool hasFields = false;
    final mp = MultipartRequest('POST', Uri.parse(path));
    if (certChain != null) {
      hasFields = true;
      mp.fields[r'cert-chain'] = certChain.field;
      mp.files.add(certChain);
    }
    if (pk != null) {
      hasFields = true;
      mp.fields[r'pk'] = pk.field;
      mp.files.add(pk);
    }
    if (keyStore != null) {
      hasFields = true;
      mp.fields[r'keyStore'] = keyStore.field;
      mp.files.add(keyStore);
    }
    if (hasFields) {
      postBody = mp;
    }

    return await apiClient.invokeAPI(
      path,
      'POST',
      queryParams,
      postBody,
      headerParams,
      formParams,
      nullableContentType,
      authNames,
    );
  }

  /// Parameters:
  ///
  /// * [String] intermediatePath (required):
  ///
  /// * [String] authorizableId (required):
  ///
  /// * [String] colonOperation:
  ///
  /// * [String] currentPassword:
  ///
  /// * [String] newPassword:
  ///
  /// * [String] rePassword:
  ///
  /// * [String] keyPassword:
  ///
  /// * [String] keyStorePass:
  ///
  /// * [String] alias:
  ///
  /// * [String] newAlias:
  ///
  /// * [String] removeAlias:
  ///
  /// * [MultipartFile] certChain:
  ///
  /// * [MultipartFile] pk:
  ///
  /// * [MultipartFile] keyStore:
  Future<KeystoreInfo> postAuthorizableKeystore(String intermediatePath, String authorizableId, { String colonOperation, String currentPassword, String newPassword, String rePassword, String keyPassword, String keyStorePass, String alias, String newAlias, String removeAlias, MultipartFile certChain, MultipartFile pk, MultipartFile keyStore }) async {
    final response = await postAuthorizableKeystoreWithHttpInfo(intermediatePath, authorizableId,  colonOperation: colonOperation, currentPassword: currentPassword, newPassword: newPassword, rePassword: rePassword, keyPassword: keyPassword, keyStorePass: keyStorePass, alias: alias, newAlias: newAlias, removeAlias: removeAlias, certChain: certChain, pk: pk, keyStore: keyStore );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body != null && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'KeystoreInfo',) as KeystoreInfo;
        }
    return Future<KeystoreInfo>.value(null);
  }

  /// Performs an HTTP 'POST /libs/granite/security/post/authorizables' operation and returns the [Response].
  /// Parameters:
  ///
  /// * [String] authorizableId (required):
  ///
  /// * [String] intermediatePath (required):
  ///
  /// * [String] createUser:
  ///
  /// * [String] createGroup:
  ///
  /// * [String] repColonPassword:
  ///
  /// * [String] profileSlashGivenName:
  Future<Response> postAuthorizablesWithHttpInfo(String authorizableId, String intermediatePath, { String createUser, String createGroup, String repColonPassword, String profileSlashGivenName }) async {
    // Verify required params are set.
    if (authorizableId == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: authorizableId');
    }
    if (intermediatePath == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: intermediatePath');
    }

    final path = r'/libs/granite/security/post/authorizables';

    Object postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

      queryParams.addAll(_convertParametersForCollectionFormat('', 'authorizableId', authorizableId));
      queryParams.addAll(_convertParametersForCollectionFormat('', 'intermediatePath', intermediatePath));
    if (createUser != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'createUser', createUser));
    }
    if (createGroup != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'createGroup', createGroup));
    }
    if (repColonPassword != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'rep:password', repColonPassword));
    }
    if (profileSlashGivenName != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'profile/givenName', profileSlashGivenName));
    }

    final contentTypes = <String>[];
    final nullableContentType = contentTypes.isNotEmpty ? contentTypes[0] : null;
    final authNames = <String>['aemAuth'];


    return await apiClient.invokeAPI(
      path,
      'POST',
      queryParams,
      postBody,
      headerParams,
      formParams,
      nullableContentType,
      authNames,
    );
  }

  /// Parameters:
  ///
  /// * [String] authorizableId (required):
  ///
  /// * [String] intermediatePath (required):
  ///
  /// * [String] createUser:
  ///
  /// * [String] createGroup:
  ///
  /// * [String] repColonPassword:
  ///
  /// * [String] profileSlashGivenName:
  Future<String> postAuthorizables(String authorizableId, String intermediatePath, { String createUser, String createGroup, String repColonPassword, String profileSlashGivenName }) async {
    final response = await postAuthorizablesWithHttpInfo(authorizableId, intermediatePath,  createUser: createUser, createGroup: createGroup, repColonPassword: repColonPassword, profileSlashGivenName: profileSlashGivenName );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body != null && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'String',) as String;
        }
    return Future<String>.value(null);
  }

  /// Performs an HTTP 'POST /apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config' operation and returns the [Response].
  /// Parameters:
  ///
  /// * [String] keyStorePassword:
  ///
  /// * [String] keyStorePasswordAtTypeHint:
  ///
  /// * [int] servicePeriodRanking:
  ///
  /// * [String] servicePeriodRankingAtTypeHint:
  ///
  /// * [bool] idpHttpRedirect:
  ///
  /// * [String] idpHttpRedirectAtTypeHint:
  ///
  /// * [bool] createUser:
  ///
  /// * [String] createUserAtTypeHint:
  ///
  /// * [String] defaultRedirectUrl:
  ///
  /// * [String] defaultRedirectUrlAtTypeHint:
  ///
  /// * [String] userIDAttribute:
  ///
  /// * [String] userIDAttributeAtTypeHint:
  ///
  /// * [List<String>] defaultGroups:
  ///
  /// * [String] defaultGroupsAtTypeHint:
  ///
  /// * [String] idpCertAlias:
  ///
  /// * [String] idpCertAliasAtTypeHint:
  ///
  /// * [bool] addGroupMemberships:
  ///
  /// * [String] addGroupMembershipsAtTypeHint:
  ///
  /// * [List<String>] path:
  ///
  /// * [String] pathAtTypeHint:
  ///
  /// * [List<String>] synchronizeAttributes:
  ///
  /// * [String] synchronizeAttributesAtTypeHint:
  ///
  /// * [int] clockTolerance:
  ///
  /// * [String] clockToleranceAtTypeHint:
  ///
  /// * [String] groupMembershipAttribute:
  ///
  /// * [String] groupMembershipAttributeAtTypeHint:
  ///
  /// * [String] idpUrl:
  ///
  /// * [String] idpUrlAtTypeHint:
  ///
  /// * [String] logoutUrl:
  ///
  /// * [String] logoutUrlAtTypeHint:
  ///
  /// * [String] serviceProviderEntityId:
  ///
  /// * [String] serviceProviderEntityIdAtTypeHint:
  ///
  /// * [String] assertionConsumerServiceURL:
  ///
  /// * [String] assertionConsumerServiceURLAtTypeHint:
  ///
  /// * [bool] handleLogout:
  ///
  /// * [String] handleLogoutAtTypeHint:
  ///
  /// * [String] spPrivateKeyAlias:
  ///
  /// * [String] spPrivateKeyAliasAtTypeHint:
  ///
  /// * [bool] useEncryption:
  ///
  /// * [String] useEncryptionAtTypeHint:
  ///
  /// * [String] nameIdFormat:
  ///
  /// * [String] nameIdFormatAtTypeHint:
  ///
  /// * [String] digestMethod:
  ///
  /// * [String] digestMethodAtTypeHint:
  ///
  /// * [String] signatureMethod:
  ///
  /// * [String] signatureMethodAtTypeHint:
  ///
  /// * [String] userIntermediatePath:
  ///
  /// * [String] userIntermediatePathAtTypeHint:
  Future<Response> postConfigAdobeGraniteSamlAuthenticationHandlerWithHttpInfo({ String keyStorePassword, String keyStorePasswordAtTypeHint, int servicePeriodRanking, String servicePeriodRankingAtTypeHint, bool idpHttpRedirect, String idpHttpRedirectAtTypeHint, bool createUser, String createUserAtTypeHint, String defaultRedirectUrl, String defaultRedirectUrlAtTypeHint, String userIDAttribute, String userIDAttributeAtTypeHint, List<String> defaultGroups, String defaultGroupsAtTypeHint, String idpCertAlias, String idpCertAliasAtTypeHint, bool addGroupMemberships, String addGroupMembershipsAtTypeHint, List<String> path, String pathAtTypeHint, List<String> synchronizeAttributes, String synchronizeAttributesAtTypeHint, int clockTolerance, String clockToleranceAtTypeHint, String groupMembershipAttribute, String groupMembershipAttributeAtTypeHint, String idpUrl, String idpUrlAtTypeHint, String logoutUrl, String logoutUrlAtTypeHint, String serviceProviderEntityId, String serviceProviderEntityIdAtTypeHint, String assertionConsumerServiceURL, String assertionConsumerServiceURLAtTypeHint, bool handleLogout, String handleLogoutAtTypeHint, String spPrivateKeyAlias, String spPrivateKeyAliasAtTypeHint, bool useEncryption, String useEncryptionAtTypeHint, String nameIdFormat, String nameIdFormatAtTypeHint, String digestMethod, String digestMethodAtTypeHint, String signatureMethod, String signatureMethodAtTypeHint, String userIntermediatePath, String userIntermediatePathAtTypeHint }) async {
    // Verify required params are set.

    final path = r'/apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config';

    Object postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (keyStorePassword != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'keyStorePassword', keyStorePassword));
    }
    if (keyStorePasswordAtTypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'keyStorePassword@TypeHint', keyStorePasswordAtTypeHint));
    }
    if (servicePeriodRanking != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'service.ranking', servicePeriodRanking));
    }
    if (servicePeriodRankingAtTypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'service.ranking@TypeHint', servicePeriodRankingAtTypeHint));
    }
    if (idpHttpRedirect != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'idpHttpRedirect', idpHttpRedirect));
    }
    if (idpHttpRedirectAtTypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'idpHttpRedirect@TypeHint', idpHttpRedirectAtTypeHint));
    }
    if (createUser != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'createUser', createUser));
    }
    if (createUserAtTypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'createUser@TypeHint', createUserAtTypeHint));
    }
    if (defaultRedirectUrl != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'defaultRedirectUrl', defaultRedirectUrl));
    }
    if (defaultRedirectUrlAtTypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'defaultRedirectUrl@TypeHint', defaultRedirectUrlAtTypeHint));
    }
    if (userIDAttribute != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'userIDAttribute', userIDAttribute));
    }
    if (userIDAttributeAtTypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'userIDAttribute@TypeHint', userIDAttributeAtTypeHint));
    }
    if (defaultGroups != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('multi', 'defaultGroups', defaultGroups));
    }
    if (defaultGroupsAtTypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'defaultGroups@TypeHint', defaultGroupsAtTypeHint));
    }
    if (idpCertAlias != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'idpCertAlias', idpCertAlias));
    }
    if (idpCertAliasAtTypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'idpCertAlias@TypeHint', idpCertAliasAtTypeHint));
    }
    if (addGroupMemberships != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'addGroupMemberships', addGroupMemberships));
    }
    if (addGroupMembershipsAtTypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'addGroupMemberships@TypeHint', addGroupMembershipsAtTypeHint));
    }
    if (path != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('multi', 'path', path));
    }
    if (pathAtTypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'path@TypeHint', pathAtTypeHint));
    }
    if (synchronizeAttributes != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('multi', 'synchronizeAttributes', synchronizeAttributes));
    }
    if (synchronizeAttributesAtTypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'synchronizeAttributes@TypeHint', synchronizeAttributesAtTypeHint));
    }
    if (clockTolerance != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'clockTolerance', clockTolerance));
    }
    if (clockToleranceAtTypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'clockTolerance@TypeHint', clockToleranceAtTypeHint));
    }
    if (groupMembershipAttribute != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'groupMembershipAttribute', groupMembershipAttribute));
    }
    if (groupMembershipAttributeAtTypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'groupMembershipAttribute@TypeHint', groupMembershipAttributeAtTypeHint));
    }
    if (idpUrl != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'idpUrl', idpUrl));
    }
    if (idpUrlAtTypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'idpUrl@TypeHint', idpUrlAtTypeHint));
    }
    if (logoutUrl != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'logoutUrl', logoutUrl));
    }
    if (logoutUrlAtTypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'logoutUrl@TypeHint', logoutUrlAtTypeHint));
    }
    if (serviceProviderEntityId != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'serviceProviderEntityId', serviceProviderEntityId));
    }
    if (serviceProviderEntityIdAtTypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'serviceProviderEntityId@TypeHint', serviceProviderEntityIdAtTypeHint));
    }
    if (assertionConsumerServiceURL != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'assertionConsumerServiceURL', assertionConsumerServiceURL));
    }
    if (assertionConsumerServiceURLAtTypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'assertionConsumerServiceURL@TypeHint', assertionConsumerServiceURLAtTypeHint));
    }
    if (handleLogout != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'handleLogout', handleLogout));
    }
    if (handleLogoutAtTypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'handleLogout@TypeHint', handleLogoutAtTypeHint));
    }
    if (spPrivateKeyAlias != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'spPrivateKeyAlias', spPrivateKeyAlias));
    }
    if (spPrivateKeyAliasAtTypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'spPrivateKeyAlias@TypeHint', spPrivateKeyAliasAtTypeHint));
    }
    if (useEncryption != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'useEncryption', useEncryption));
    }
    if (useEncryptionAtTypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'useEncryption@TypeHint', useEncryptionAtTypeHint));
    }
    if (nameIdFormat != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'nameIdFormat', nameIdFormat));
    }
    if (nameIdFormatAtTypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'nameIdFormat@TypeHint', nameIdFormatAtTypeHint));
    }
    if (digestMethod != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'digestMethod', digestMethod));
    }
    if (digestMethodAtTypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'digestMethod@TypeHint', digestMethodAtTypeHint));
    }
    if (signatureMethod != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'signatureMethod', signatureMethod));
    }
    if (signatureMethodAtTypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'signatureMethod@TypeHint', signatureMethodAtTypeHint));
    }
    if (userIntermediatePath != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'userIntermediatePath', userIntermediatePath));
    }
    if (userIntermediatePathAtTypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'userIntermediatePath@TypeHint', userIntermediatePathAtTypeHint));
    }

    final contentTypes = <String>[];
    final nullableContentType = contentTypes.isNotEmpty ? contentTypes[0] : null;
    final authNames = <String>['aemAuth'];


    return await apiClient.invokeAPI(
      path,
      'POST',
      queryParams,
      postBody,
      headerParams,
      formParams,
      nullableContentType,
      authNames,
    );
  }

  /// Parameters:
  ///
  /// * [String] keyStorePassword:
  ///
  /// * [String] keyStorePasswordAtTypeHint:
  ///
  /// * [int] servicePeriodRanking:
  ///
  /// * [String] servicePeriodRankingAtTypeHint:
  ///
  /// * [bool] idpHttpRedirect:
  ///
  /// * [String] idpHttpRedirectAtTypeHint:
  ///
  /// * [bool] createUser:
  ///
  /// * [String] createUserAtTypeHint:
  ///
  /// * [String] defaultRedirectUrl:
  ///
  /// * [String] defaultRedirectUrlAtTypeHint:
  ///
  /// * [String] userIDAttribute:
  ///
  /// * [String] userIDAttributeAtTypeHint:
  ///
  /// * [List<String>] defaultGroups:
  ///
  /// * [String] defaultGroupsAtTypeHint:
  ///
  /// * [String] idpCertAlias:
  ///
  /// * [String] idpCertAliasAtTypeHint:
  ///
  /// * [bool] addGroupMemberships:
  ///
  /// * [String] addGroupMembershipsAtTypeHint:
  ///
  /// * [List<String>] path:
  ///
  /// * [String] pathAtTypeHint:
  ///
  /// * [List<String>] synchronizeAttributes:
  ///
  /// * [String] synchronizeAttributesAtTypeHint:
  ///
  /// * [int] clockTolerance:
  ///
  /// * [String] clockToleranceAtTypeHint:
  ///
  /// * [String] groupMembershipAttribute:
  ///
  /// * [String] groupMembershipAttributeAtTypeHint:
  ///
  /// * [String] idpUrl:
  ///
  /// * [String] idpUrlAtTypeHint:
  ///
  /// * [String] logoutUrl:
  ///
  /// * [String] logoutUrlAtTypeHint:
  ///
  /// * [String] serviceProviderEntityId:
  ///
  /// * [String] serviceProviderEntityIdAtTypeHint:
  ///
  /// * [String] assertionConsumerServiceURL:
  ///
  /// * [String] assertionConsumerServiceURLAtTypeHint:
  ///
  /// * [bool] handleLogout:
  ///
  /// * [String] handleLogoutAtTypeHint:
  ///
  /// * [String] spPrivateKeyAlias:
  ///
  /// * [String] spPrivateKeyAliasAtTypeHint:
  ///
  /// * [bool] useEncryption:
  ///
  /// * [String] useEncryptionAtTypeHint:
  ///
  /// * [String] nameIdFormat:
  ///
  /// * [String] nameIdFormatAtTypeHint:
  ///
  /// * [String] digestMethod:
  ///
  /// * [String] digestMethodAtTypeHint:
  ///
  /// * [String] signatureMethod:
  ///
  /// * [String] signatureMethodAtTypeHint:
  ///
  /// * [String] userIntermediatePath:
  ///
  /// * [String] userIntermediatePathAtTypeHint:
  Future<void> postConfigAdobeGraniteSamlAuthenticationHandler({ String keyStorePassword, String keyStorePasswordAtTypeHint, int servicePeriodRanking, String servicePeriodRankingAtTypeHint, bool idpHttpRedirect, String idpHttpRedirectAtTypeHint, bool createUser, String createUserAtTypeHint, String defaultRedirectUrl, String defaultRedirectUrlAtTypeHint, String userIDAttribute, String userIDAttributeAtTypeHint, List<String> defaultGroups, String defaultGroupsAtTypeHint, String idpCertAlias, String idpCertAliasAtTypeHint, bool addGroupMemberships, String addGroupMembershipsAtTypeHint, List<String> path, String pathAtTypeHint, List<String> synchronizeAttributes, String synchronizeAttributesAtTypeHint, int clockTolerance, String clockToleranceAtTypeHint, String groupMembershipAttribute, String groupMembershipAttributeAtTypeHint, String idpUrl, String idpUrlAtTypeHint, String logoutUrl, String logoutUrlAtTypeHint, String serviceProviderEntityId, String serviceProviderEntityIdAtTypeHint, String assertionConsumerServiceURL, String assertionConsumerServiceURLAtTypeHint, bool handleLogout, String handleLogoutAtTypeHint, String spPrivateKeyAlias, String spPrivateKeyAliasAtTypeHint, bool useEncryption, String useEncryptionAtTypeHint, String nameIdFormat, String nameIdFormatAtTypeHint, String digestMethod, String digestMethodAtTypeHint, String signatureMethod, String signatureMethodAtTypeHint, String userIntermediatePath, String userIntermediatePathAtTypeHint }) async {
    final response = await postConfigAdobeGraniteSamlAuthenticationHandlerWithHttpInfo( keyStorePassword: keyStorePassword, keyStorePasswordAtTypeHint: keyStorePasswordAtTypeHint, servicePeriodRanking: servicePeriodRanking, servicePeriodRankingAtTypeHint: servicePeriodRankingAtTypeHint, idpHttpRedirect: idpHttpRedirect, idpHttpRedirectAtTypeHint: idpHttpRedirectAtTypeHint, createUser: createUser, createUserAtTypeHint: createUserAtTypeHint, defaultRedirectUrl: defaultRedirectUrl, defaultRedirectUrlAtTypeHint: defaultRedirectUrlAtTypeHint, userIDAttribute: userIDAttribute, userIDAttributeAtTypeHint: userIDAttributeAtTypeHint, defaultGroups: defaultGroups, defaultGroupsAtTypeHint: defaultGroupsAtTypeHint, idpCertAlias: idpCertAlias, idpCertAliasAtTypeHint: idpCertAliasAtTypeHint, addGroupMemberships: addGroupMemberships, addGroupMembershipsAtTypeHint: addGroupMembershipsAtTypeHint, path: path, pathAtTypeHint: pathAtTypeHint, synchronizeAttributes: synchronizeAttributes, synchronizeAttributesAtTypeHint: synchronizeAttributesAtTypeHint, clockTolerance: clockTolerance, clockToleranceAtTypeHint: clockToleranceAtTypeHint, groupMembershipAttribute: groupMembershipAttribute, groupMembershipAttributeAtTypeHint: groupMembershipAttributeAtTypeHint, idpUrl: idpUrl, idpUrlAtTypeHint: idpUrlAtTypeHint, logoutUrl: logoutUrl, logoutUrlAtTypeHint: logoutUrlAtTypeHint, serviceProviderEntityId: serviceProviderEntityId, serviceProviderEntityIdAtTypeHint: serviceProviderEntityIdAtTypeHint, assertionConsumerServiceURL: assertionConsumerServiceURL, assertionConsumerServiceURLAtTypeHint: assertionConsumerServiceURLAtTypeHint, handleLogout: handleLogout, handleLogoutAtTypeHint: handleLogoutAtTypeHint, spPrivateKeyAlias: spPrivateKeyAlias, spPrivateKeyAliasAtTypeHint: spPrivateKeyAliasAtTypeHint, useEncryption: useEncryption, useEncryptionAtTypeHint: useEncryptionAtTypeHint, nameIdFormat: nameIdFormat, nameIdFormatAtTypeHint: nameIdFormatAtTypeHint, digestMethod: digestMethod, digestMethodAtTypeHint: digestMethodAtTypeHint, signatureMethod: signatureMethod, signatureMethodAtTypeHint: signatureMethodAtTypeHint, userIntermediatePath: userIntermediatePath, userIntermediatePathAtTypeHint: userIntermediatePathAtTypeHint );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
  }

  /// Performs an HTTP 'POST /apps/system/config/org.apache.felix.http' operation and returns the [Response].
  /// Parameters:
  ///
  /// * [bool] orgPeriodApachePeriodFelixPeriodHttpsPeriodNio:
  ///
  /// * [String] orgPeriodApachePeriodFelixPeriodHttpsPeriodNioAtTypeHint:
  ///
  /// * [String] orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystore:
  ///
  /// * [String] orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystoreAtTypeHint:
  ///
  /// * [String] orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodPassword:
  ///
  /// * [String] orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodPasswordAtTypeHint:
  ///
  /// * [String] orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodKey:
  ///
  /// * [String] orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodKeyAtTypeHint:
  ///
  /// * [String] orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodKeyPeriodPassword:
  ///
  /// * [String] orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodKeyPeriodPasswordAtTypeHint:
  ///
  /// * [String] orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststore:
  ///
  /// * [String] orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststoreAtTypeHint:
  ///
  /// * [String] orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststorePeriodPassword:
  ///
  /// * [String] orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststorePeriodPasswordAtTypeHint:
  ///
  /// * [String] orgPeriodApachePeriodFelixPeriodHttpsPeriodClientcertificate:
  ///
  /// * [String] orgPeriodApachePeriodFelixPeriodHttpsPeriodClientcertificateAtTypeHint:
  ///
  /// * [bool] orgPeriodApachePeriodFelixPeriodHttpsPeriodEnable:
  ///
  /// * [String] orgPeriodApachePeriodFelixPeriodHttpsPeriodEnableAtTypeHint:
  ///
  /// * [String] orgPeriodOsgiPeriodServicePeriodHttpPeriodPortPeriodSecure:
  ///
  /// * [String] orgPeriodOsgiPeriodServicePeriodHttpPeriodPortPeriodSecureAtTypeHint:
  Future<Response> postConfigApacheFelixJettyBasedHttpServiceWithHttpInfo({ bool orgPeriodApachePeriodFelixPeriodHttpsPeriodNio, String orgPeriodApachePeriodFelixPeriodHttpsPeriodNioAtTypeHint, String orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystore, String orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystoreAtTypeHint, String orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodPassword, String orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodPasswordAtTypeHint, String orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodKey, String orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodKeyAtTypeHint, String orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodKeyPeriodPassword, String orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodKeyPeriodPasswordAtTypeHint, String orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststore, String orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststoreAtTypeHint, String orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststorePeriodPassword, String orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststorePeriodPasswordAtTypeHint, String orgPeriodApachePeriodFelixPeriodHttpsPeriodClientcertificate, String orgPeriodApachePeriodFelixPeriodHttpsPeriodClientcertificateAtTypeHint, bool orgPeriodApachePeriodFelixPeriodHttpsPeriodEnable, String orgPeriodApachePeriodFelixPeriodHttpsPeriodEnableAtTypeHint, String orgPeriodOsgiPeriodServicePeriodHttpPeriodPortPeriodSecure, String orgPeriodOsgiPeriodServicePeriodHttpPeriodPortPeriodSecureAtTypeHint }) async {
    // Verify required params are set.

    final path = r'/apps/system/config/org.apache.felix.http';

    Object postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (orgPeriodApachePeriodFelixPeriodHttpsPeriodNio != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'org.apache.felix.https.nio', orgPeriodApachePeriodFelixPeriodHttpsPeriodNio));
    }
    if (orgPeriodApachePeriodFelixPeriodHttpsPeriodNioAtTypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'org.apache.felix.https.nio@TypeHint', orgPeriodApachePeriodFelixPeriodHttpsPeriodNioAtTypeHint));
    }
    if (orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystore != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'org.apache.felix.https.keystore', orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystore));
    }
    if (orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystoreAtTypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'org.apache.felix.https.keystore@TypeHint', orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystoreAtTypeHint));
    }
    if (orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodPassword != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'org.apache.felix.https.keystore.password', orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodPassword));
    }
    if (orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodPasswordAtTypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'org.apache.felix.https.keystore.password@TypeHint', orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodPasswordAtTypeHint));
    }
    if (orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodKey != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'org.apache.felix.https.keystore.key', orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodKey));
    }
    if (orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodKeyAtTypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'org.apache.felix.https.keystore.key@TypeHint', orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodKeyAtTypeHint));
    }
    if (orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodKeyPeriodPassword != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'org.apache.felix.https.keystore.key.password', orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodKeyPeriodPassword));
    }
    if (orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodKeyPeriodPasswordAtTypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'org.apache.felix.https.keystore.key.password@TypeHint', orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodKeyPeriodPasswordAtTypeHint));
    }
    if (orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststore != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'org.apache.felix.https.truststore', orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststore));
    }
    if (orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststoreAtTypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'org.apache.felix.https.truststore@TypeHint', orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststoreAtTypeHint));
    }
    if (orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststorePeriodPassword != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'org.apache.felix.https.truststore.password', orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststorePeriodPassword));
    }
    if (orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststorePeriodPasswordAtTypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'org.apache.felix.https.truststore.password@TypeHint', orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststorePeriodPasswordAtTypeHint));
    }
    if (orgPeriodApachePeriodFelixPeriodHttpsPeriodClientcertificate != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'org.apache.felix.https.clientcertificate', orgPeriodApachePeriodFelixPeriodHttpsPeriodClientcertificate));
    }
    if (orgPeriodApachePeriodFelixPeriodHttpsPeriodClientcertificateAtTypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'org.apache.felix.https.clientcertificate@TypeHint', orgPeriodApachePeriodFelixPeriodHttpsPeriodClientcertificateAtTypeHint));
    }
    if (orgPeriodApachePeriodFelixPeriodHttpsPeriodEnable != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'org.apache.felix.https.enable', orgPeriodApachePeriodFelixPeriodHttpsPeriodEnable));
    }
    if (orgPeriodApachePeriodFelixPeriodHttpsPeriodEnableAtTypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'org.apache.felix.https.enable@TypeHint', orgPeriodApachePeriodFelixPeriodHttpsPeriodEnableAtTypeHint));
    }
    if (orgPeriodOsgiPeriodServicePeriodHttpPeriodPortPeriodSecure != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'org.osgi.service.http.port.secure', orgPeriodOsgiPeriodServicePeriodHttpPeriodPortPeriodSecure));
    }
    if (orgPeriodOsgiPeriodServicePeriodHttpPeriodPortPeriodSecureAtTypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'org.osgi.service.http.port.secure@TypeHint', orgPeriodOsgiPeriodServicePeriodHttpPeriodPortPeriodSecureAtTypeHint));
    }

    final contentTypes = <String>[];
    final nullableContentType = contentTypes.isNotEmpty ? contentTypes[0] : null;
    final authNames = <String>['aemAuth'];


    return await apiClient.invokeAPI(
      path,
      'POST',
      queryParams,
      postBody,
      headerParams,
      formParams,
      nullableContentType,
      authNames,
    );
  }

  /// Parameters:
  ///
  /// * [bool] orgPeriodApachePeriodFelixPeriodHttpsPeriodNio:
  ///
  /// * [String] orgPeriodApachePeriodFelixPeriodHttpsPeriodNioAtTypeHint:
  ///
  /// * [String] orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystore:
  ///
  /// * [String] orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystoreAtTypeHint:
  ///
  /// * [String] orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodPassword:
  ///
  /// * [String] orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodPasswordAtTypeHint:
  ///
  /// * [String] orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodKey:
  ///
  /// * [String] orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodKeyAtTypeHint:
  ///
  /// * [String] orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodKeyPeriodPassword:
  ///
  /// * [String] orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodKeyPeriodPasswordAtTypeHint:
  ///
  /// * [String] orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststore:
  ///
  /// * [String] orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststoreAtTypeHint:
  ///
  /// * [String] orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststorePeriodPassword:
  ///
  /// * [String] orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststorePeriodPasswordAtTypeHint:
  ///
  /// * [String] orgPeriodApachePeriodFelixPeriodHttpsPeriodClientcertificate:
  ///
  /// * [String] orgPeriodApachePeriodFelixPeriodHttpsPeriodClientcertificateAtTypeHint:
  ///
  /// * [bool] orgPeriodApachePeriodFelixPeriodHttpsPeriodEnable:
  ///
  /// * [String] orgPeriodApachePeriodFelixPeriodHttpsPeriodEnableAtTypeHint:
  ///
  /// * [String] orgPeriodOsgiPeriodServicePeriodHttpPeriodPortPeriodSecure:
  ///
  /// * [String] orgPeriodOsgiPeriodServicePeriodHttpPeriodPortPeriodSecureAtTypeHint:
  Future<void> postConfigApacheFelixJettyBasedHttpService({ bool orgPeriodApachePeriodFelixPeriodHttpsPeriodNio, String orgPeriodApachePeriodFelixPeriodHttpsPeriodNioAtTypeHint, String orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystore, String orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystoreAtTypeHint, String orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodPassword, String orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodPasswordAtTypeHint, String orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodKey, String orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodKeyAtTypeHint, String orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodKeyPeriodPassword, String orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodKeyPeriodPasswordAtTypeHint, String orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststore, String orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststoreAtTypeHint, String orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststorePeriodPassword, String orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststorePeriodPasswordAtTypeHint, String orgPeriodApachePeriodFelixPeriodHttpsPeriodClientcertificate, String orgPeriodApachePeriodFelixPeriodHttpsPeriodClientcertificateAtTypeHint, bool orgPeriodApachePeriodFelixPeriodHttpsPeriodEnable, String orgPeriodApachePeriodFelixPeriodHttpsPeriodEnableAtTypeHint, String orgPeriodOsgiPeriodServicePeriodHttpPeriodPortPeriodSecure, String orgPeriodOsgiPeriodServicePeriodHttpPeriodPortPeriodSecureAtTypeHint }) async {
    final response = await postConfigApacheFelixJettyBasedHttpServiceWithHttpInfo( orgPeriodApachePeriodFelixPeriodHttpsPeriodNio: orgPeriodApachePeriodFelixPeriodHttpsPeriodNio, orgPeriodApachePeriodFelixPeriodHttpsPeriodNioAtTypeHint: orgPeriodApachePeriodFelixPeriodHttpsPeriodNioAtTypeHint, orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystore: orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystore, orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystoreAtTypeHint: orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystoreAtTypeHint, orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodPassword: orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodPassword, orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodPasswordAtTypeHint: orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodPasswordAtTypeHint, orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodKey: orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodKey, orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodKeyAtTypeHint: orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodKeyAtTypeHint, orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodKeyPeriodPassword: orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodKeyPeriodPassword, orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodKeyPeriodPasswordAtTypeHint: orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodKeyPeriodPasswordAtTypeHint, orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststore: orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststore, orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststoreAtTypeHint: orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststoreAtTypeHint, orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststorePeriodPassword: orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststorePeriodPassword, orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststorePeriodPasswordAtTypeHint: orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststorePeriodPasswordAtTypeHint, orgPeriodApachePeriodFelixPeriodHttpsPeriodClientcertificate: orgPeriodApachePeriodFelixPeriodHttpsPeriodClientcertificate, orgPeriodApachePeriodFelixPeriodHttpsPeriodClientcertificateAtTypeHint: orgPeriodApachePeriodFelixPeriodHttpsPeriodClientcertificateAtTypeHint, orgPeriodApachePeriodFelixPeriodHttpsPeriodEnable: orgPeriodApachePeriodFelixPeriodHttpsPeriodEnable, orgPeriodApachePeriodFelixPeriodHttpsPeriodEnableAtTypeHint: orgPeriodApachePeriodFelixPeriodHttpsPeriodEnableAtTypeHint, orgPeriodOsgiPeriodServicePeriodHttpPeriodPortPeriodSecure: orgPeriodOsgiPeriodServicePeriodHttpPeriodPortPeriodSecure, orgPeriodOsgiPeriodServicePeriodHttpPeriodPortPeriodSecureAtTypeHint: orgPeriodOsgiPeriodServicePeriodHttpPeriodPortPeriodSecureAtTypeHint );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
  }

  /// Performs an HTTP 'POST /apps/system/config/org.apache.http.proxyconfigurator.config' operation and returns the [Response].
  /// Parameters:
  ///
  /// * [String] proxyPeriodHost:
  ///
  /// * [String] proxyPeriodHostAtTypeHint:
  ///
  /// * [int] proxyPeriodPort:
  ///
  /// * [String] proxyPeriodPortAtTypeHint:
  ///
  /// * [List<String>] proxyPeriodExceptions:
  ///
  /// * [String] proxyPeriodExceptionsAtTypeHint:
  ///
  /// * [bool] proxyPeriodEnabled:
  ///
  /// * [String] proxyPeriodEnabledAtTypeHint:
  ///
  /// * [String] proxyPeriodUser:
  ///
  /// * [String] proxyPeriodUserAtTypeHint:
  ///
  /// * [String] proxyPeriodPassword:
  ///
  /// * [String] proxyPeriodPasswordAtTypeHint:
  Future<Response> postConfigApacheHttpComponentsProxyConfigurationWithHttpInfo({ String proxyPeriodHost, String proxyPeriodHostAtTypeHint, int proxyPeriodPort, String proxyPeriodPortAtTypeHint, List<String> proxyPeriodExceptions, String proxyPeriodExceptionsAtTypeHint, bool proxyPeriodEnabled, String proxyPeriodEnabledAtTypeHint, String proxyPeriodUser, String proxyPeriodUserAtTypeHint, String proxyPeriodPassword, String proxyPeriodPasswordAtTypeHint }) async {
    // Verify required params are set.

    final path = r'/apps/system/config/org.apache.http.proxyconfigurator.config';

    Object postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (proxyPeriodHost != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'proxy.host', proxyPeriodHost));
    }
    if (proxyPeriodHostAtTypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'proxy.host@TypeHint', proxyPeriodHostAtTypeHint));
    }
    if (proxyPeriodPort != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'proxy.port', proxyPeriodPort));
    }
    if (proxyPeriodPortAtTypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'proxy.port@TypeHint', proxyPeriodPortAtTypeHint));
    }
    if (proxyPeriodExceptions != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('multi', 'proxy.exceptions', proxyPeriodExceptions));
    }
    if (proxyPeriodExceptionsAtTypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'proxy.exceptions@TypeHint', proxyPeriodExceptionsAtTypeHint));
    }
    if (proxyPeriodEnabled != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'proxy.enabled', proxyPeriodEnabled));
    }
    if (proxyPeriodEnabledAtTypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'proxy.enabled@TypeHint', proxyPeriodEnabledAtTypeHint));
    }
    if (proxyPeriodUser != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'proxy.user', proxyPeriodUser));
    }
    if (proxyPeriodUserAtTypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'proxy.user@TypeHint', proxyPeriodUserAtTypeHint));
    }
    if (proxyPeriodPassword != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'proxy.password', proxyPeriodPassword));
    }
    if (proxyPeriodPasswordAtTypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'proxy.password@TypeHint', proxyPeriodPasswordAtTypeHint));
    }

    final contentTypes = <String>[];
    final nullableContentType = contentTypes.isNotEmpty ? contentTypes[0] : null;
    final authNames = <String>['aemAuth'];


    return await apiClient.invokeAPI(
      path,
      'POST',
      queryParams,
      postBody,
      headerParams,
      formParams,
      nullableContentType,
      authNames,
    );
  }

  /// Parameters:
  ///
  /// * [String] proxyPeriodHost:
  ///
  /// * [String] proxyPeriodHostAtTypeHint:
  ///
  /// * [int] proxyPeriodPort:
  ///
  /// * [String] proxyPeriodPortAtTypeHint:
  ///
  /// * [List<String>] proxyPeriodExceptions:
  ///
  /// * [String] proxyPeriodExceptionsAtTypeHint:
  ///
  /// * [bool] proxyPeriodEnabled:
  ///
  /// * [String] proxyPeriodEnabledAtTypeHint:
  ///
  /// * [String] proxyPeriodUser:
  ///
  /// * [String] proxyPeriodUserAtTypeHint:
  ///
  /// * [String] proxyPeriodPassword:
  ///
  /// * [String] proxyPeriodPasswordAtTypeHint:
  Future<void> postConfigApacheHttpComponentsProxyConfiguration({ String proxyPeriodHost, String proxyPeriodHostAtTypeHint, int proxyPeriodPort, String proxyPeriodPortAtTypeHint, List<String> proxyPeriodExceptions, String proxyPeriodExceptionsAtTypeHint, bool proxyPeriodEnabled, String proxyPeriodEnabledAtTypeHint, String proxyPeriodUser, String proxyPeriodUserAtTypeHint, String proxyPeriodPassword, String proxyPeriodPasswordAtTypeHint }) async {
    final response = await postConfigApacheHttpComponentsProxyConfigurationWithHttpInfo( proxyPeriodHost: proxyPeriodHost, proxyPeriodHostAtTypeHint: proxyPeriodHostAtTypeHint, proxyPeriodPort: proxyPeriodPort, proxyPeriodPortAtTypeHint: proxyPeriodPortAtTypeHint, proxyPeriodExceptions: proxyPeriodExceptions, proxyPeriodExceptionsAtTypeHint: proxyPeriodExceptionsAtTypeHint, proxyPeriodEnabled: proxyPeriodEnabled, proxyPeriodEnabledAtTypeHint: proxyPeriodEnabledAtTypeHint, proxyPeriodUser: proxyPeriodUser, proxyPeriodUserAtTypeHint: proxyPeriodUserAtTypeHint, proxyPeriodPassword: proxyPeriodPassword, proxyPeriodPasswordAtTypeHint: proxyPeriodPasswordAtTypeHint );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
  }

  /// Performs an HTTP 'POST /apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet' operation and returns the [Response].
  /// Parameters:
  ///
  /// * [String] alias:
  ///
  /// * [String] aliasAtTypeHint:
  ///
  /// * [bool] davPeriodCreateAbsoluteUri:
  ///
  /// * [String] davPeriodCreateAbsoluteUriAtTypeHint:
  Future<Response> postConfigApacheSlingDavExServletWithHttpInfo({ String alias, String aliasAtTypeHint, bool davPeriodCreateAbsoluteUri, String davPeriodCreateAbsoluteUriAtTypeHint }) async {
    // Verify required params are set.

    final path = r'/apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet';

    Object postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (alias != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'alias', alias));
    }
    if (aliasAtTypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'alias@TypeHint', aliasAtTypeHint));
    }
    if (davPeriodCreateAbsoluteUri != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'dav.create-absolute-uri', davPeriodCreateAbsoluteUri));
    }
    if (davPeriodCreateAbsoluteUriAtTypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'dav.create-absolute-uri@TypeHint', davPeriodCreateAbsoluteUriAtTypeHint));
    }

    final contentTypes = <String>[];
    final nullableContentType = contentTypes.isNotEmpty ? contentTypes[0] : null;
    final authNames = <String>['aemAuth'];


    return await apiClient.invokeAPI(
      path,
      'POST',
      queryParams,
      postBody,
      headerParams,
      formParams,
      nullableContentType,
      authNames,
    );
  }

  /// Parameters:
  ///
  /// * [String] alias:
  ///
  /// * [String] aliasAtTypeHint:
  ///
  /// * [bool] davPeriodCreateAbsoluteUri:
  ///
  /// * [String] davPeriodCreateAbsoluteUriAtTypeHint:
  Future<void> postConfigApacheSlingDavExServlet({ String alias, String aliasAtTypeHint, bool davPeriodCreateAbsoluteUri, String davPeriodCreateAbsoluteUriAtTypeHint }) async {
    final response = await postConfigApacheSlingDavExServletWithHttpInfo( alias: alias, aliasAtTypeHint: aliasAtTypeHint, davPeriodCreateAbsoluteUri: davPeriodCreateAbsoluteUri, davPeriodCreateAbsoluteUriAtTypeHint: davPeriodCreateAbsoluteUriAtTypeHint );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
  }

  /// Performs an HTTP 'POST /apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet' operation and returns the [Response].
  /// Parameters:
  ///
  /// * [String] jsonPeriodMaximumresults:
  ///
  /// * [String] jsonPeriodMaximumresultsAtTypeHint:
  ///
  /// * [bool] enablePeriodHtml:
  ///
  /// * [String] enablePeriodHtmlAtTypeHint:
  ///
  /// * [bool] enablePeriodTxt:
  ///
  /// * [String] enablePeriodTxtAtTypeHint:
  ///
  /// * [bool] enablePeriodXml:
  ///
  /// * [String] enablePeriodXmlAtTypeHint:
  Future<Response> postConfigApacheSlingGetServletWithHttpInfo({ String jsonPeriodMaximumresults, String jsonPeriodMaximumresultsAtTypeHint, bool enablePeriodHtml, String enablePeriodHtmlAtTypeHint, bool enablePeriodTxt, String enablePeriodTxtAtTypeHint, bool enablePeriodXml, String enablePeriodXmlAtTypeHint }) async {
    // Verify required params are set.

    final path = r'/apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet';

    Object postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (jsonPeriodMaximumresults != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'json.maximumresults', jsonPeriodMaximumresults));
    }
    if (jsonPeriodMaximumresultsAtTypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'json.maximumresults@TypeHint', jsonPeriodMaximumresultsAtTypeHint));
    }
    if (enablePeriodHtml != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'enable.html', enablePeriodHtml));
    }
    if (enablePeriodHtmlAtTypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'enable.html@TypeHint', enablePeriodHtmlAtTypeHint));
    }
    if (enablePeriodTxt != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'enable.txt', enablePeriodTxt));
    }
    if (enablePeriodTxtAtTypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'enable.txt@TypeHint', enablePeriodTxtAtTypeHint));
    }
    if (enablePeriodXml != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'enable.xml', enablePeriodXml));
    }
    if (enablePeriodXmlAtTypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'enable.xml@TypeHint', enablePeriodXmlAtTypeHint));
    }

    final contentTypes = <String>[];
    final nullableContentType = contentTypes.isNotEmpty ? contentTypes[0] : null;
    final authNames = <String>['aemAuth'];


    return await apiClient.invokeAPI(
      path,
      'POST',
      queryParams,
      postBody,
      headerParams,
      formParams,
      nullableContentType,
      authNames,
    );
  }

  /// Parameters:
  ///
  /// * [String] jsonPeriodMaximumresults:
  ///
  /// * [String] jsonPeriodMaximumresultsAtTypeHint:
  ///
  /// * [bool] enablePeriodHtml:
  ///
  /// * [String] enablePeriodHtmlAtTypeHint:
  ///
  /// * [bool] enablePeriodTxt:
  ///
  /// * [String] enablePeriodTxtAtTypeHint:
  ///
  /// * [bool] enablePeriodXml:
  ///
  /// * [String] enablePeriodXmlAtTypeHint:
  Future<void> postConfigApacheSlingGetServlet({ String jsonPeriodMaximumresults, String jsonPeriodMaximumresultsAtTypeHint, bool enablePeriodHtml, String enablePeriodHtmlAtTypeHint, bool enablePeriodTxt, String enablePeriodTxtAtTypeHint, bool enablePeriodXml, String enablePeriodXmlAtTypeHint }) async {
    final response = await postConfigApacheSlingGetServletWithHttpInfo( jsonPeriodMaximumresults: jsonPeriodMaximumresults, jsonPeriodMaximumresultsAtTypeHint: jsonPeriodMaximumresultsAtTypeHint, enablePeriodHtml: enablePeriodHtml, enablePeriodHtmlAtTypeHint: enablePeriodHtmlAtTypeHint, enablePeriodTxt: enablePeriodTxt, enablePeriodTxtAtTypeHint: enablePeriodTxtAtTypeHint, enablePeriodXml: enablePeriodXml, enablePeriodXmlAtTypeHint: enablePeriodXmlAtTypeHint );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
  }

  /// Performs an HTTP 'POST /apps/system/config/org.apache.sling.security.impl.ReferrerFilter' operation and returns the [Response].
  /// Parameters:
  ///
  /// * [bool] allowPeriodEmpty:
  ///
  /// * [String] allowPeriodEmptyAtTypeHint:
  ///
  /// * [String] allowPeriodHosts:
  ///
  /// * [String] allowPeriodHostsAtTypeHint:
  ///
  /// * [String] allowPeriodHostsPeriodRegexp:
  ///
  /// * [String] allowPeriodHostsPeriodRegexpAtTypeHint:
  ///
  /// * [String] filterPeriodMethods:
  ///
  /// * [String] filterPeriodMethodsAtTypeHint:
  Future<Response> postConfigApacheSlingReferrerFilterWithHttpInfo({ bool allowPeriodEmpty, String allowPeriodEmptyAtTypeHint, String allowPeriodHosts, String allowPeriodHostsAtTypeHint, String allowPeriodHostsPeriodRegexp, String allowPeriodHostsPeriodRegexpAtTypeHint, String filterPeriodMethods, String filterPeriodMethodsAtTypeHint }) async {
    // Verify required params are set.

    final path = r'/apps/system/config/org.apache.sling.security.impl.ReferrerFilter';

    Object postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (allowPeriodEmpty != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'allow.empty', allowPeriodEmpty));
    }
    if (allowPeriodEmptyAtTypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'allow.empty@TypeHint', allowPeriodEmptyAtTypeHint));
    }
    if (allowPeriodHosts != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'allow.hosts', allowPeriodHosts));
    }
    if (allowPeriodHostsAtTypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'allow.hosts@TypeHint', allowPeriodHostsAtTypeHint));
    }
    if (allowPeriodHostsPeriodRegexp != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'allow.hosts.regexp', allowPeriodHostsPeriodRegexp));
    }
    if (allowPeriodHostsPeriodRegexpAtTypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'allow.hosts.regexp@TypeHint', allowPeriodHostsPeriodRegexpAtTypeHint));
    }
    if (filterPeriodMethods != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'filter.methods', filterPeriodMethods));
    }
    if (filterPeriodMethodsAtTypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'filter.methods@TypeHint', filterPeriodMethodsAtTypeHint));
    }

    final contentTypes = <String>[];
    final nullableContentType = contentTypes.isNotEmpty ? contentTypes[0] : null;
    final authNames = <String>['aemAuth'];


    return await apiClient.invokeAPI(
      path,
      'POST',
      queryParams,
      postBody,
      headerParams,
      formParams,
      nullableContentType,
      authNames,
    );
  }

  /// Parameters:
  ///
  /// * [bool] allowPeriodEmpty:
  ///
  /// * [String] allowPeriodEmptyAtTypeHint:
  ///
  /// * [String] allowPeriodHosts:
  ///
  /// * [String] allowPeriodHostsAtTypeHint:
  ///
  /// * [String] allowPeriodHostsPeriodRegexp:
  ///
  /// * [String] allowPeriodHostsPeriodRegexpAtTypeHint:
  ///
  /// * [String] filterPeriodMethods:
  ///
  /// * [String] filterPeriodMethodsAtTypeHint:
  Future<void> postConfigApacheSlingReferrerFilter({ bool allowPeriodEmpty, String allowPeriodEmptyAtTypeHint, String allowPeriodHosts, String allowPeriodHostsAtTypeHint, String allowPeriodHostsPeriodRegexp, String allowPeriodHostsPeriodRegexpAtTypeHint, String filterPeriodMethods, String filterPeriodMethodsAtTypeHint }) async {
    final response = await postConfigApacheSlingReferrerFilterWithHttpInfo( allowPeriodEmpty: allowPeriodEmpty, allowPeriodEmptyAtTypeHint: allowPeriodEmptyAtTypeHint, allowPeriodHosts: allowPeriodHosts, allowPeriodHostsAtTypeHint: allowPeriodHostsAtTypeHint, allowPeriodHostsPeriodRegexp: allowPeriodHostsPeriodRegexp, allowPeriodHostsPeriodRegexpAtTypeHint: allowPeriodHostsPeriodRegexpAtTypeHint, filterPeriodMethods: filterPeriodMethods, filterPeriodMethodsAtTypeHint: filterPeriodMethodsAtTypeHint );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
  }

  /// Performs an HTTP 'POST /apps/system/config/{configNodeName}' operation and returns the [Response].
  /// Parameters:
  ///
  /// * [String] configNodeName (required):
  Future<Response> postConfigPropertyWithHttpInfo(String configNodeName) async {
    // Verify required params are set.
    if (configNodeName == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: configNodeName');
    }

    final path = r'/apps/system/config/{configNodeName}'
      .replaceAll('{' + 'configNodeName' + '}', configNodeName.toString());

    Object postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    final contentTypes = <String>[];
    final nullableContentType = contentTypes.isNotEmpty ? contentTypes[0] : null;
    final authNames = <String>['aemAuth'];


    return await apiClient.invokeAPI(
      path,
      'POST',
      queryParams,
      postBody,
      headerParams,
      formParams,
      nullableContentType,
      authNames,
    );
  }

  /// Parameters:
  ///
  /// * [String] configNodeName (required):
  Future<void> postConfigProperty(String configNodeName) async {
    final response = await postConfigPropertyWithHttpInfo(configNodeName);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
  }

  /// Performs an HTTP 'POST /{path}/{name}' operation and returns the [Response].
  /// Parameters:
  ///
  /// * [String] path (required):
  ///
  /// * [String] name (required):
  ///
  /// * [String] colonOperation:
  ///
  /// * [String] deleteAuthorizable:
  ///
  /// * [MultipartFile] file:
  Future<Response> postNodeWithHttpInfo(String path, String name, { String colonOperation, String deleteAuthorizable, MultipartFile file }) async {
    // Verify required params are set.
    if (path == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: path');
    }
    if (name == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: name');
    }

    final path = r'/{path}/{name}'
      .replaceAll('{' + 'path' + '}', path.toString())
      .replaceAll('{' + 'name' + '}', name.toString());

    Object postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (colonOperation != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', ':operation', colonOperation));
    }
    if (deleteAuthorizable != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'deleteAuthorizable', deleteAuthorizable));
    }

    final contentTypes = <String>['multipart/form-data'];
    final nullableContentType = contentTypes.isNotEmpty ? contentTypes[0] : null;
    final authNames = <String>['aemAuth'];

    bool hasFields = false;
    final mp = MultipartRequest('POST', Uri.parse(path));
    if (file != null) {
      hasFields = true;
      mp.fields[r'file'] = file.field;
      mp.files.add(file);
    }
    if (hasFields) {
      postBody = mp;
    }

    return await apiClient.invokeAPI(
      path,
      'POST',
      queryParams,
      postBody,
      headerParams,
      formParams,
      nullableContentType,
      authNames,
    );
  }

  /// Parameters:
  ///
  /// * [String] path (required):
  ///
  /// * [String] name (required):
  ///
  /// * [String] colonOperation:
  ///
  /// * [String] deleteAuthorizable:
  ///
  /// * [MultipartFile] file:
  Future<void> postNode(String path, String name, { String colonOperation, String deleteAuthorizable, MultipartFile file }) async {
    final response = await postNodeWithHttpInfo(path, name,  colonOperation: colonOperation, deleteAuthorizable: deleteAuthorizable, file: file );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
  }

  /// Performs an HTTP 'POST /{path}/{name}.rw.html' operation and returns the [Response].
  /// Parameters:
  ///
  /// * [String] path (required):
  ///
  /// * [String] name (required):
  ///
  /// * [String] addMembers:
  Future<Response> postNodeRwWithHttpInfo(String path, String name, { String addMembers }) async {
    // Verify required params are set.
    if (path == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: path');
    }
    if (name == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: name');
    }

    final path = r'/{path}/{name}.rw.html'
      .replaceAll('{' + 'path' + '}', path.toString())
      .replaceAll('{' + 'name' + '}', name.toString());

    Object postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (addMembers != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'addMembers', addMembers));
    }

    final contentTypes = <String>[];
    final nullableContentType = contentTypes.isNotEmpty ? contentTypes[0] : null;
    final authNames = <String>['aemAuth'];


    return await apiClient.invokeAPI(
      path,
      'POST',
      queryParams,
      postBody,
      headerParams,
      formParams,
      nullableContentType,
      authNames,
    );
  }

  /// Parameters:
  ///
  /// * [String] path (required):
  ///
  /// * [String] name (required):
  ///
  /// * [String] addMembers:
  Future<void> postNodeRw(String path, String name, { String addMembers }) async {
    final response = await postNodeRwWithHttpInfo(path, name,  addMembers: addMembers );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
  }

  /// Performs an HTTP 'POST /{path}/' operation and returns the [Response].
  /// Parameters:
  ///
  /// * [String] path (required):
  ///
  /// * [String] jcrColonPrimaryType (required):
  ///
  /// * [String] colonName (required):
  Future<Response> postPathWithHttpInfo(String path, String jcrColonPrimaryType, String colonName) async {
    // Verify required params are set.
    if (path == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: path');
    }
    if (jcrColonPrimaryType == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: jcrColonPrimaryType');
    }
    if (colonName == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: colonName');
    }

    final path = r'/{path}/'
      .replaceAll('{' + 'path' + '}', path.toString());

    Object postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

      queryParams.addAll(_convertParametersForCollectionFormat('', 'jcr:primaryType', jcrColonPrimaryType));
      queryParams.addAll(_convertParametersForCollectionFormat('', ':name', colonName));

    final contentTypes = <String>[];
    final nullableContentType = contentTypes.isNotEmpty ? contentTypes[0] : null;
    final authNames = <String>['aemAuth'];


    return await apiClient.invokeAPI(
      path,
      'POST',
      queryParams,
      postBody,
      headerParams,
      formParams,
      nullableContentType,
      authNames,
    );
  }

  /// Parameters:
  ///
  /// * [String] path (required):
  ///
  /// * [String] jcrColonPrimaryType (required):
  ///
  /// * [String] colonName (required):
  Future<void> postPath(String path, String jcrColonPrimaryType, String colonName) async {
    final response = await postPathWithHttpInfo(path, jcrColonPrimaryType, colonName);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
  }

  /// Performs an HTTP 'POST /bin/querybuilder.json' operation and returns the [Response].
  /// Parameters:
  ///
  /// * [String] path (required):
  ///
  /// * [num] pPeriodLimit (required):
  ///
  /// * [String] n1property (required):
  ///
  /// * [String] n1propertyPeriodValue (required):
  Future<Response> postQueryWithHttpInfo(String path, num pPeriodLimit, String n1property, String n1propertyPeriodValue) async {
    // Verify required params are set.
    if (path == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: path');
    }
    if (pPeriodLimit == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: pPeriodLimit');
    }
    if (n1property == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: n1property');
    }
    if (n1propertyPeriodValue == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: n1propertyPeriodValue');
    }

    final path = r'/bin/querybuilder.json';

    Object postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

      queryParams.addAll(_convertParametersForCollectionFormat('', 'path', path));
      queryParams.addAll(_convertParametersForCollectionFormat('', 'p.limit', pPeriodLimit));
      queryParams.addAll(_convertParametersForCollectionFormat('', '1_property', n1property));
      queryParams.addAll(_convertParametersForCollectionFormat('', '1_property.value', n1propertyPeriodValue));

    final contentTypes = <String>[];
    final nullableContentType = contentTypes.isNotEmpty ? contentTypes[0] : null;
    final authNames = <String>['aemAuth'];


    return await apiClient.invokeAPI(
      path,
      'POST',
      queryParams,
      postBody,
      headerParams,
      formParams,
      nullableContentType,
      authNames,
    );
  }

  /// Parameters:
  ///
  /// * [String] path (required):
  ///
  /// * [num] pPeriodLimit (required):
  ///
  /// * [String] n1property (required):
  ///
  /// * [String] n1propertyPeriodValue (required):
  Future<String> postQuery(String path, num pPeriodLimit, String n1property, String n1propertyPeriodValue) async {
    final response = await postQueryWithHttpInfo(path, pPeriodLimit, n1property, n1propertyPeriodValue);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body != null && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'String',) as String;
        }
    return Future<String>.value(null);
  }

  /// Performs an HTTP 'POST /etc/replication/treeactivation.html' operation and returns the [Response].
  /// Parameters:
  ///
  /// * [bool] ignoredeactivated (required):
  ///
  /// * [bool] onlymodified (required):
  ///
  /// * [String] path (required):
  Future<Response> postTreeActivationWithHttpInfo(bool ignoredeactivated, bool onlymodified, String path) async {
    // Verify required params are set.
    if (ignoredeactivated == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: ignoredeactivated');
    }
    if (onlymodified == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: onlymodified');
    }
    if (path == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: path');
    }

    final path = r'/etc/replication/treeactivation.html';

    Object postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

      queryParams.addAll(_convertParametersForCollectionFormat('', 'ignoredeactivated', ignoredeactivated));
      queryParams.addAll(_convertParametersForCollectionFormat('', 'onlymodified', onlymodified));
      queryParams.addAll(_convertParametersForCollectionFormat('', 'path', path));

    final contentTypes = <String>[];
    final nullableContentType = contentTypes.isNotEmpty ? contentTypes[0] : null;
    final authNames = <String>['aemAuth'];


    return await apiClient.invokeAPI(
      path,
      'POST',
      queryParams,
      postBody,
      headerParams,
      formParams,
      nullableContentType,
      authNames,
    );
  }

  /// Parameters:
  ///
  /// * [bool] ignoredeactivated (required):
  ///
  /// * [bool] onlymodified (required):
  ///
  /// * [String] path (required):
  Future<void> postTreeActivation(bool ignoredeactivated, bool onlymodified, String path) async {
    final response = await postTreeActivationWithHttpInfo(ignoredeactivated, onlymodified, path);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
  }

  /// Performs an HTTP 'POST /libs/granite/security/post/truststore' operation and returns the [Response].
  /// Parameters:
  ///
  /// * [String] colonOperation:
  ///
  /// * [String] newPassword:
  ///
  /// * [String] rePassword:
  ///
  /// * [String] keyStoreType:
  ///
  /// * [String] removeAlias:
  ///
  /// * [MultipartFile] certificate:
  Future<Response> postTruststoreWithHttpInfo({ String colonOperation, String newPassword, String rePassword, String keyStoreType, String removeAlias, MultipartFile certificate }) async {
    // Verify required params are set.

    final path = r'/libs/granite/security/post/truststore';

    Object postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (colonOperation != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', ':operation', colonOperation));
    }
    if (newPassword != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'newPassword', newPassword));
    }
    if (rePassword != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'rePassword', rePassword));
    }
    if (keyStoreType != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'keyStoreType', keyStoreType));
    }
    if (removeAlias != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'removeAlias', removeAlias));
    }

    final contentTypes = <String>['multipart/form-data'];
    final nullableContentType = contentTypes.isNotEmpty ? contentTypes[0] : null;
    final authNames = <String>['aemAuth'];

    bool hasFields = false;
    final mp = MultipartRequest('POST', Uri.parse(path));
    if (certificate != null) {
      hasFields = true;
      mp.fields[r'certificate'] = certificate.field;
      mp.files.add(certificate);
    }
    if (hasFields) {
      postBody = mp;
    }

    return await apiClient.invokeAPI(
      path,
      'POST',
      queryParams,
      postBody,
      headerParams,
      formParams,
      nullableContentType,
      authNames,
    );
  }

  /// Parameters:
  ///
  /// * [String] colonOperation:
  ///
  /// * [String] newPassword:
  ///
  /// * [String] rePassword:
  ///
  /// * [String] keyStoreType:
  ///
  /// * [String] removeAlias:
  ///
  /// * [MultipartFile] certificate:
  Future<String> postTruststore({ String colonOperation, String newPassword, String rePassword, String keyStoreType, String removeAlias, MultipartFile certificate }) async {
    final response = await postTruststoreWithHttpInfo( colonOperation: colonOperation, newPassword: newPassword, rePassword: rePassword, keyStoreType: keyStoreType, removeAlias: removeAlias, certificate: certificate );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body != null && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'String',) as String;
        }
    return Future<String>.value(null);
  }

  /// Performs an HTTP 'POST /etc/truststore' operation and returns the [Response].
  /// Parameters:
  ///
  /// * [MultipartFile] truststorePeriodP12:
  Future<Response> postTruststorePKCS12WithHttpInfo({ MultipartFile truststorePeriodP12 }) async {
    // Verify required params are set.

    final path = r'/etc/truststore';

    Object postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    final contentTypes = <String>['multipart/form-data'];
    final nullableContentType = contentTypes.isNotEmpty ? contentTypes[0] : null;
    final authNames = <String>['aemAuth'];

    bool hasFields = false;
    final mp = MultipartRequest('POST', Uri.parse(path));
    if (truststorePeriodP12 != null) {
      hasFields = true;
      mp.fields[r'truststore.p12'] = truststorePeriodP12.field;
      mp.files.add(truststorePeriodP12);
    }
    if (hasFields) {
      postBody = mp;
    }

    return await apiClient.invokeAPI(
      path,
      'POST',
      queryParams,
      postBody,
      headerParams,
      formParams,
      nullableContentType,
      authNames,
    );
  }

  /// Parameters:
  ///
  /// * [MultipartFile] truststorePeriodP12:
  Future<String> postTruststorePKCS12({ MultipartFile truststorePeriodP12 }) async {
    final response = await postTruststorePKCS12WithHttpInfo( truststorePeriodP12: truststorePeriodP12 );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body != null && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'String',) as String;
        }
    return Future<String>.value(null);
  }
}
