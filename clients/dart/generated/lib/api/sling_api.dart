//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class SlingApi {
  SlingApi([ApiClient? apiClient]) : apiClient = apiClient ?? defaultApiClient;

  final ApiClient apiClient;

  /// Performs an HTTP 'DELETE /etc/replication/agents.{runmode}/{name}' operation and returns the [Response].
  /// Parameters:
  ///
  /// * [String] runmode (required):
  ///
  /// * [String] name (required):
  Future<Response> deleteAgentWithHttpInfo(String runmode, String name, { Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/etc/replication/agents.{runmode}/{name}'
      .replaceAll('{runmode}', runmode)
      .replaceAll('{name}', name);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    const contentTypes = <String>[];


    return apiClient.invokeAPI(
      path,
      'DELETE',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
      abortTrigger: abortTrigger,
    );
  }

  /// Parameters:
  ///
  /// * [String] runmode (required):
  ///
  /// * [String] name (required):
  Future<void> deleteAgent(String runmode, String name, { Future<void>? abortTrigger, }) async {
    final response = await deleteAgentWithHttpInfo(runmode, name, abortTrigger: abortTrigger,);
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
  Future<Response> deleteNodeWithHttpInfo(String path, String name, { Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/{path}/{name}'
      .replaceAll('{path}', path)
      .replaceAll('{name}', name);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    const contentTypes = <String>[];


    return apiClient.invokeAPI(
      path,
      'DELETE',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
      abortTrigger: abortTrigger,
    );
  }

  /// Parameters:
  ///
  /// * [String] path (required):
  ///
  /// * [String] name (required):
  Future<void> deleteNode(String path, String name, { Future<void>? abortTrigger, }) async {
    final response = await deleteNodeWithHttpInfo(path, name, abortTrigger: abortTrigger,);
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
  Future<Response> getAgentWithHttpInfo(String runmode, String name, { Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/etc/replication/agents.{runmode}/{name}'
      .replaceAll('{runmode}', runmode)
      .replaceAll('{name}', name);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    const contentTypes = <String>[];


    return apiClient.invokeAPI(
      path,
      'GET',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
      abortTrigger: abortTrigger,
    );
  }

  /// Parameters:
  ///
  /// * [String] runmode (required):
  ///
  /// * [String] name (required):
  Future<void> getAgent(String runmode, String name, { Future<void>? abortTrigger, }) async {
    final response = await getAgentWithHttpInfo(runmode, name, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
  }

  /// Performs an HTTP 'GET /etc/replication/agents.{runmode}.-1.json' operation and returns the [Response].
  /// Parameters:
  ///
  /// * [String] runmode (required):
  Future<Response> getAgentsWithHttpInfo(String runmode, { Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/etc/replication/agents.{runmode}.-1.json'
      .replaceAll('{runmode}', runmode);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    const contentTypes = <String>[];


    return apiClient.invokeAPI(
      path,
      'GET',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
      abortTrigger: abortTrigger,
    );
  }

  /// Parameters:
  ///
  /// * [String] runmode (required):
  Future<String?> getAgents(String runmode, { Future<void>? abortTrigger, }) async {
    final response = await getAgentsWithHttpInfo(runmode, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'String',) as String;
    
    }
    return null;
  }

  /// Performs an HTTP 'GET /{intermediatePath}/{authorizableId}.ks.json' operation and returns the [Response].
  /// Parameters:
  ///
  /// * [String] intermediatePath (required):
  ///
  /// * [String] authorizableId (required):
  Future<Response> getAuthorizableKeystoreWithHttpInfo(String intermediatePath, String authorizableId, { Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/{intermediatePath}/{authorizableId}.ks.json'
      .replaceAll('{intermediatePath}', intermediatePath)
      .replaceAll('{authorizableId}', authorizableId);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    const contentTypes = <String>[];


    return apiClient.invokeAPI(
      path,
      'GET',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
      abortTrigger: abortTrigger,
    );
  }

  /// Parameters:
  ///
  /// * [String] intermediatePath (required):
  ///
  /// * [String] authorizableId (required):
  Future<KeystoreInfo?> getAuthorizableKeystore(String intermediatePath, String authorizableId, { Future<void>? abortTrigger, }) async {
    final response = await getAuthorizableKeystoreWithHttpInfo(intermediatePath, authorizableId, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'KeystoreInfo',) as KeystoreInfo;
    
    }
    return null;
  }

  /// Performs an HTTP 'GET /{intermediatePath}/{authorizableId}/keystore/store.p12' operation and returns the [Response].
  /// Parameters:
  ///
  /// * [String] intermediatePath (required):
  ///
  /// * [String] authorizableId (required):
  Future<Response> getKeystoreWithHttpInfo(String intermediatePath, String authorizableId, { Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/{intermediatePath}/{authorizableId}/keystore/store.p12'
      .replaceAll('{intermediatePath}', intermediatePath)
      .replaceAll('{authorizableId}', authorizableId);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    const contentTypes = <String>[];


    return apiClient.invokeAPI(
      path,
      'GET',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
      abortTrigger: abortTrigger,
    );
  }

  /// Parameters:
  ///
  /// * [String] intermediatePath (required):
  ///
  /// * [String] authorizableId (required):
  Future<MultipartFile?> getKeystore(String intermediatePath, String authorizableId, { Future<void>? abortTrigger, }) async {
    final response = await getKeystoreWithHttpInfo(intermediatePath, authorizableId, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'MultipartFile',) as MultipartFile;
    
    }
    return null;
  }

  /// Performs an HTTP 'GET /{path}/{name}' operation and returns the [Response].
  /// Parameters:
  ///
  /// * [String] path (required):
  ///
  /// * [String] name (required):
  Future<Response> getNodeWithHttpInfo(String path, String name, { Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/{path}/{name}'
      .replaceAll('{path}', path)
      .replaceAll('{name}', name);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    const contentTypes = <String>[];


    return apiClient.invokeAPI(
      path,
      'GET',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
      abortTrigger: abortTrigger,
    );
  }

  /// Parameters:
  ///
  /// * [String] path (required):
  ///
  /// * [String] name (required):
  Future<void> getNode(String path, String name, { Future<void>? abortTrigger, }) async {
    final response = await getNodeWithHttpInfo(path, name, abortTrigger: abortTrigger,);
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
  Future<Response> getPackageWithHttpInfo(String group, String name, String version, { Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/etc/packages/{group}/{name}-{version}.zip'
      .replaceAll('{group}', group)
      .replaceAll('{name}', name)
      .replaceAll('{version}', version);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    const contentTypes = <String>[];


    return apiClient.invokeAPI(
      path,
      'GET',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
      abortTrigger: abortTrigger,
    );
  }

  /// Parameters:
  ///
  /// * [String] group (required):
  ///
  /// * [String] name (required):
  ///
  /// * [String] version (required):
  Future<MultipartFile?> getPackage(String group, String name, String version, { Future<void>? abortTrigger, }) async {
    final response = await getPackageWithHttpInfo(group, name, version, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'MultipartFile',) as MultipartFile;
    
    }
    return null;
  }

  /// Performs an HTTP 'GET /etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json' operation and returns the [Response].
  /// Parameters:
  ///
  /// * [String] group (required):
  ///
  /// * [String] name (required):
  ///
  /// * [String] version (required):
  Future<Response> getPackageFilterWithHttpInfo(String group, String name, String version, { Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json'
      .replaceAll('{group}', group)
      .replaceAll('{name}', name)
      .replaceAll('{version}', version);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    const contentTypes = <String>[];


    return apiClient.invokeAPI(
      path,
      'GET',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
      abortTrigger: abortTrigger,
    );
  }

  /// Parameters:
  ///
  /// * [String] group (required):
  ///
  /// * [String] name (required):
  ///
  /// * [String] version (required):
  Future<String?> getPackageFilter(String group, String name, String version, { Future<void>? abortTrigger, }) async {
    final response = await getPackageFilterWithHttpInfo(group, name, version, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'String',) as String;
    
    }
    return null;
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
  Future<Response> getQueryWithHttpInfo(String path, num pPeriodLimit, String n1property, String n1propertyPeriodValue, { Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/bin/querybuilder.json';

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

      queryParams.addAll(_queryParams('', 'path', path));
      queryParams.addAll(_queryParams('', 'p.limit', pPeriodLimit));
      queryParams.addAll(_queryParams('', '1_property', n1property));
      queryParams.addAll(_queryParams('', '1_property.value', n1propertyPeriodValue));

    const contentTypes = <String>[];


    return apiClient.invokeAPI(
      path,
      'GET',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
      abortTrigger: abortTrigger,
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
  Future<String?> getQuery(String path, num pPeriodLimit, String n1property, String n1propertyPeriodValue, { Future<void>? abortTrigger, }) async {
    final response = await getQueryWithHttpInfo(path, pPeriodLimit, n1property, n1propertyPeriodValue, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'String',) as String;
    
    }
    return null;
  }

  /// Performs an HTTP 'GET /etc/truststore/truststore.p12' operation and returns the [Response].
  Future<Response> getTruststoreWithHttpInfo({ Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/etc/truststore/truststore.p12';

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    const contentTypes = <String>[];


    return apiClient.invokeAPI(
      path,
      'GET',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
      abortTrigger: abortTrigger,
    );
  }

  Future<MultipartFile?> getTruststore({ Future<void>? abortTrigger, }) async {
    final response = await getTruststoreWithHttpInfo(abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'MultipartFile',) as MultipartFile;
    
    }
    return null;
  }

  /// Performs an HTTP 'GET /libs/granite/security/truststore.json' operation and returns the [Response].
  Future<Response> getTruststoreInfoWithHttpInfo({ Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/libs/granite/security/truststore.json';

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    const contentTypes = <String>[];


    return apiClient.invokeAPI(
      path,
      'GET',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
      abortTrigger: abortTrigger,
    );
  }

  Future<TruststoreInfo?> getTruststoreInfo({ Future<void>? abortTrigger, }) async {
    final response = await getTruststoreInfoWithHttpInfo(abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'TruststoreInfo',) as TruststoreInfo;
    
    }
    return null;
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
  /// * [bool] jcrColonContentSlashAliasUpdate:
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
  Future<Response> postAgentWithHttpInfo(String runmode, String name, { bool? jcrColonContentSlashCqColonDistribute, String? jcrColonContentSlashCqColonDistributeAtTypeHint, String? jcrColonContentSlashCqColonName, String? jcrColonContentSlashCqColonTemplate, bool? jcrColonContentSlashAliasUpdate, bool? jcrColonContentSlashEnabled, String? jcrColonContentSlashJcrColonDescription, String? jcrColonContentSlashJcrColonLastModified, String? jcrColonContentSlashJcrColonLastModifiedBy, String? jcrColonContentSlashJcrColonMixinTypes, String? jcrColonContentSlashJcrColonTitle, String? jcrColonContentSlashLogLevel, bool? jcrColonContentSlashNoStatusUpdate, bool? jcrColonContentSlashNoVersioning, num? jcrColonContentSlashProtocolConnectTimeout, bool? jcrColonContentSlashProtocolHTTPConnectionClosed, String? jcrColonContentSlashProtocolHTTPExpired, List<String>? jcrColonContentSlashProtocolHTTPHeaders, String? jcrColonContentSlashProtocolHTTPHeadersAtTypeHint, String? jcrColonContentSlashProtocolHTTPMethod, bool? jcrColonContentSlashProtocolHTTPSRelaxed, String? jcrColonContentSlashProtocolInterface, num? jcrColonContentSlashProtocolSocketTimeout, String? jcrColonContentSlashProtocolVersion, String? jcrColonContentSlashProxyNTLMDomain, String? jcrColonContentSlashProxyNTLMHost, String? jcrColonContentSlashProxyHost, String? jcrColonContentSlashProxyPassword, num? jcrColonContentSlashProxyPort, String? jcrColonContentSlashProxyUser, num? jcrColonContentSlashQueueBatchMaxSize, String? jcrColonContentSlashQueueBatchMode, num? jcrColonContentSlashQueueBatchWaitTime, String? jcrColonContentSlashRetryDelay, bool? jcrColonContentSlashReverseReplication, String? jcrColonContentSlashSerializationType, String? jcrColonContentSlashSlingColonResourceType, String? jcrColonContentSlashSsl, String? jcrColonContentSlashTransportNTLMDomain, String? jcrColonContentSlashTransportNTLMHost, String? jcrColonContentSlashTransportPassword, String? jcrColonContentSlashTransportUri, String? jcrColonContentSlashTransportUser, bool? jcrColonContentSlashTriggerDistribute, bool? jcrColonContentSlashTriggerModified, bool? jcrColonContentSlashTriggerOnOffTime, bool? jcrColonContentSlashTriggerReceive, bool? jcrColonContentSlashTriggerSpecific, String? jcrColonContentSlashUserId, String? jcrColonPrimaryType, String? colonOperation, Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/etc/replication/agents.{runmode}/{name}'
      .replaceAll('{runmode}', runmode)
      .replaceAll('{name}', name);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (jcrColonContentSlashCqColonDistribute != null) {
      queryParams.addAll(_queryParams('', 'jcr:content/cq:distribute', jcrColonContentSlashCqColonDistribute));
    }
    if (jcrColonContentSlashCqColonDistributeAtTypeHint != null) {
      queryParams.addAll(_queryParams('', 'jcr:content/cq:distribute@TypeHint', jcrColonContentSlashCqColonDistributeAtTypeHint));
    }
    if (jcrColonContentSlashCqColonName != null) {
      queryParams.addAll(_queryParams('', 'jcr:content/cq:name', jcrColonContentSlashCqColonName));
    }
    if (jcrColonContentSlashCqColonTemplate != null) {
      queryParams.addAll(_queryParams('', 'jcr:content/cq:template', jcrColonContentSlashCqColonTemplate));
    }
    if (jcrColonContentSlashAliasUpdate != null) {
      queryParams.addAll(_queryParams('', 'jcr:content/aliasUpdate', jcrColonContentSlashAliasUpdate));
    }
    if (jcrColonContentSlashEnabled != null) {
      queryParams.addAll(_queryParams('', 'jcr:content/enabled', jcrColonContentSlashEnabled));
    }
    if (jcrColonContentSlashJcrColonDescription != null) {
      queryParams.addAll(_queryParams('', 'jcr:content/jcr:description', jcrColonContentSlashJcrColonDescription));
    }
    if (jcrColonContentSlashJcrColonLastModified != null) {
      queryParams.addAll(_queryParams('', 'jcr:content/jcr:lastModified', jcrColonContentSlashJcrColonLastModified));
    }
    if (jcrColonContentSlashJcrColonLastModifiedBy != null) {
      queryParams.addAll(_queryParams('', 'jcr:content/jcr:lastModifiedBy', jcrColonContentSlashJcrColonLastModifiedBy));
    }
    if (jcrColonContentSlashJcrColonMixinTypes != null) {
      queryParams.addAll(_queryParams('', 'jcr:content/jcr:mixinTypes', jcrColonContentSlashJcrColonMixinTypes));
    }
    if (jcrColonContentSlashJcrColonTitle != null) {
      queryParams.addAll(_queryParams('', 'jcr:content/jcr:title', jcrColonContentSlashJcrColonTitle));
    }
    if (jcrColonContentSlashLogLevel != null) {
      queryParams.addAll(_queryParams('', 'jcr:content/logLevel', jcrColonContentSlashLogLevel));
    }
    if (jcrColonContentSlashNoStatusUpdate != null) {
      queryParams.addAll(_queryParams('', 'jcr:content/noStatusUpdate', jcrColonContentSlashNoStatusUpdate));
    }
    if (jcrColonContentSlashNoVersioning != null) {
      queryParams.addAll(_queryParams('', 'jcr:content/noVersioning', jcrColonContentSlashNoVersioning));
    }
    if (jcrColonContentSlashProtocolConnectTimeout != null) {
      queryParams.addAll(_queryParams('', 'jcr:content/protocolConnectTimeout', jcrColonContentSlashProtocolConnectTimeout));
    }
    if (jcrColonContentSlashProtocolHTTPConnectionClosed != null) {
      queryParams.addAll(_queryParams('', 'jcr:content/protocolHTTPConnectionClosed', jcrColonContentSlashProtocolHTTPConnectionClosed));
    }
    if (jcrColonContentSlashProtocolHTTPExpired != null) {
      queryParams.addAll(_queryParams('', 'jcr:content/protocolHTTPExpired', jcrColonContentSlashProtocolHTTPExpired));
    }
    if (jcrColonContentSlashProtocolHTTPHeaders != null) {
      queryParams.addAll(_queryParams('multi', 'jcr:content/protocolHTTPHeaders', jcrColonContentSlashProtocolHTTPHeaders));
    }
    if (jcrColonContentSlashProtocolHTTPHeadersAtTypeHint != null) {
      queryParams.addAll(_queryParams('', 'jcr:content/protocolHTTPHeaders@TypeHint', jcrColonContentSlashProtocolHTTPHeadersAtTypeHint));
    }
    if (jcrColonContentSlashProtocolHTTPMethod != null) {
      queryParams.addAll(_queryParams('', 'jcr:content/protocolHTTPMethod', jcrColonContentSlashProtocolHTTPMethod));
    }
    if (jcrColonContentSlashProtocolHTTPSRelaxed != null) {
      queryParams.addAll(_queryParams('', 'jcr:content/protocolHTTPSRelaxed', jcrColonContentSlashProtocolHTTPSRelaxed));
    }
    if (jcrColonContentSlashProtocolInterface != null) {
      queryParams.addAll(_queryParams('', 'jcr:content/protocolInterface', jcrColonContentSlashProtocolInterface));
    }
    if (jcrColonContentSlashProtocolSocketTimeout != null) {
      queryParams.addAll(_queryParams('', 'jcr:content/protocolSocketTimeout', jcrColonContentSlashProtocolSocketTimeout));
    }
    if (jcrColonContentSlashProtocolVersion != null) {
      queryParams.addAll(_queryParams('', 'jcr:content/protocolVersion', jcrColonContentSlashProtocolVersion));
    }
    if (jcrColonContentSlashProxyNTLMDomain != null) {
      queryParams.addAll(_queryParams('', 'jcr:content/proxyNTLMDomain', jcrColonContentSlashProxyNTLMDomain));
    }
    if (jcrColonContentSlashProxyNTLMHost != null) {
      queryParams.addAll(_queryParams('', 'jcr:content/proxyNTLMHost', jcrColonContentSlashProxyNTLMHost));
    }
    if (jcrColonContentSlashProxyHost != null) {
      queryParams.addAll(_queryParams('', 'jcr:content/proxyHost', jcrColonContentSlashProxyHost));
    }
    if (jcrColonContentSlashProxyPassword != null) {
      queryParams.addAll(_queryParams('', 'jcr:content/proxyPassword', jcrColonContentSlashProxyPassword));
    }
    if (jcrColonContentSlashProxyPort != null) {
      queryParams.addAll(_queryParams('', 'jcr:content/proxyPort', jcrColonContentSlashProxyPort));
    }
    if (jcrColonContentSlashProxyUser != null) {
      queryParams.addAll(_queryParams('', 'jcr:content/proxyUser', jcrColonContentSlashProxyUser));
    }
    if (jcrColonContentSlashQueueBatchMaxSize != null) {
      queryParams.addAll(_queryParams('', 'jcr:content/queueBatchMaxSize', jcrColonContentSlashQueueBatchMaxSize));
    }
    if (jcrColonContentSlashQueueBatchMode != null) {
      queryParams.addAll(_queryParams('', 'jcr:content/queueBatchMode', jcrColonContentSlashQueueBatchMode));
    }
    if (jcrColonContentSlashQueueBatchWaitTime != null) {
      queryParams.addAll(_queryParams('', 'jcr:content/queueBatchWaitTime', jcrColonContentSlashQueueBatchWaitTime));
    }
    if (jcrColonContentSlashRetryDelay != null) {
      queryParams.addAll(_queryParams('', 'jcr:content/retryDelay', jcrColonContentSlashRetryDelay));
    }
    if (jcrColonContentSlashReverseReplication != null) {
      queryParams.addAll(_queryParams('', 'jcr:content/reverseReplication', jcrColonContentSlashReverseReplication));
    }
    if (jcrColonContentSlashSerializationType != null) {
      queryParams.addAll(_queryParams('', 'jcr:content/serializationType', jcrColonContentSlashSerializationType));
    }
    if (jcrColonContentSlashSlingColonResourceType != null) {
      queryParams.addAll(_queryParams('', 'jcr:content/sling:resourceType', jcrColonContentSlashSlingColonResourceType));
    }
    if (jcrColonContentSlashSsl != null) {
      queryParams.addAll(_queryParams('', 'jcr:content/ssl', jcrColonContentSlashSsl));
    }
    if (jcrColonContentSlashTransportNTLMDomain != null) {
      queryParams.addAll(_queryParams('', 'jcr:content/transportNTLMDomain', jcrColonContentSlashTransportNTLMDomain));
    }
    if (jcrColonContentSlashTransportNTLMHost != null) {
      queryParams.addAll(_queryParams('', 'jcr:content/transportNTLMHost', jcrColonContentSlashTransportNTLMHost));
    }
    if (jcrColonContentSlashTransportPassword != null) {
      queryParams.addAll(_queryParams('', 'jcr:content/transportPassword', jcrColonContentSlashTransportPassword));
    }
    if (jcrColonContentSlashTransportUri != null) {
      queryParams.addAll(_queryParams('', 'jcr:content/transportUri', jcrColonContentSlashTransportUri));
    }
    if (jcrColonContentSlashTransportUser != null) {
      queryParams.addAll(_queryParams('', 'jcr:content/transportUser', jcrColonContentSlashTransportUser));
    }
    if (jcrColonContentSlashTriggerDistribute != null) {
      queryParams.addAll(_queryParams('', 'jcr:content/triggerDistribute', jcrColonContentSlashTriggerDistribute));
    }
    if (jcrColonContentSlashTriggerModified != null) {
      queryParams.addAll(_queryParams('', 'jcr:content/triggerModified', jcrColonContentSlashTriggerModified));
    }
    if (jcrColonContentSlashTriggerOnOffTime != null) {
      queryParams.addAll(_queryParams('', 'jcr:content/triggerOnOffTime', jcrColonContentSlashTriggerOnOffTime));
    }
    if (jcrColonContentSlashTriggerReceive != null) {
      queryParams.addAll(_queryParams('', 'jcr:content/triggerReceive', jcrColonContentSlashTriggerReceive));
    }
    if (jcrColonContentSlashTriggerSpecific != null) {
      queryParams.addAll(_queryParams('', 'jcr:content/triggerSpecific', jcrColonContentSlashTriggerSpecific));
    }
    if (jcrColonContentSlashUserId != null) {
      queryParams.addAll(_queryParams('', 'jcr:content/userId', jcrColonContentSlashUserId));
    }
    if (jcrColonPrimaryType != null) {
      queryParams.addAll(_queryParams('', 'jcr:primaryType', jcrColonPrimaryType));
    }
    if (colonOperation != null) {
      queryParams.addAll(_queryParams('', ':operation', colonOperation));
    }

    const contentTypes = <String>[];


    return apiClient.invokeAPI(
      path,
      'POST',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
      abortTrigger: abortTrigger,
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
  /// * [bool] jcrColonContentSlashAliasUpdate:
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
  Future<void> postAgent(String runmode, String name, { bool? jcrColonContentSlashCqColonDistribute, String? jcrColonContentSlashCqColonDistributeAtTypeHint, String? jcrColonContentSlashCqColonName, String? jcrColonContentSlashCqColonTemplate, bool? jcrColonContentSlashAliasUpdate, bool? jcrColonContentSlashEnabled, String? jcrColonContentSlashJcrColonDescription, String? jcrColonContentSlashJcrColonLastModified, String? jcrColonContentSlashJcrColonLastModifiedBy, String? jcrColonContentSlashJcrColonMixinTypes, String? jcrColonContentSlashJcrColonTitle, String? jcrColonContentSlashLogLevel, bool? jcrColonContentSlashNoStatusUpdate, bool? jcrColonContentSlashNoVersioning, num? jcrColonContentSlashProtocolConnectTimeout, bool? jcrColonContentSlashProtocolHTTPConnectionClosed, String? jcrColonContentSlashProtocolHTTPExpired, List<String>? jcrColonContentSlashProtocolHTTPHeaders, String? jcrColonContentSlashProtocolHTTPHeadersAtTypeHint, String? jcrColonContentSlashProtocolHTTPMethod, bool? jcrColonContentSlashProtocolHTTPSRelaxed, String? jcrColonContentSlashProtocolInterface, num? jcrColonContentSlashProtocolSocketTimeout, String? jcrColonContentSlashProtocolVersion, String? jcrColonContentSlashProxyNTLMDomain, String? jcrColonContentSlashProxyNTLMHost, String? jcrColonContentSlashProxyHost, String? jcrColonContentSlashProxyPassword, num? jcrColonContentSlashProxyPort, String? jcrColonContentSlashProxyUser, num? jcrColonContentSlashQueueBatchMaxSize, String? jcrColonContentSlashQueueBatchMode, num? jcrColonContentSlashQueueBatchWaitTime, String? jcrColonContentSlashRetryDelay, bool? jcrColonContentSlashReverseReplication, String? jcrColonContentSlashSerializationType, String? jcrColonContentSlashSlingColonResourceType, String? jcrColonContentSlashSsl, String? jcrColonContentSlashTransportNTLMDomain, String? jcrColonContentSlashTransportNTLMHost, String? jcrColonContentSlashTransportPassword, String? jcrColonContentSlashTransportUri, String? jcrColonContentSlashTransportUser, bool? jcrColonContentSlashTriggerDistribute, bool? jcrColonContentSlashTriggerModified, bool? jcrColonContentSlashTriggerOnOffTime, bool? jcrColonContentSlashTriggerReceive, bool? jcrColonContentSlashTriggerSpecific, String? jcrColonContentSlashUserId, String? jcrColonPrimaryType, String? colonOperation, Future<void>? abortTrigger, }) async {
    final response = await postAgentWithHttpInfo(runmode, name, jcrColonContentSlashCqColonDistribute: jcrColonContentSlashCqColonDistribute, jcrColonContentSlashCqColonDistributeAtTypeHint: jcrColonContentSlashCqColonDistributeAtTypeHint, jcrColonContentSlashCqColonName: jcrColonContentSlashCqColonName, jcrColonContentSlashCqColonTemplate: jcrColonContentSlashCqColonTemplate, jcrColonContentSlashAliasUpdate: jcrColonContentSlashAliasUpdate, jcrColonContentSlashEnabled: jcrColonContentSlashEnabled, jcrColonContentSlashJcrColonDescription: jcrColonContentSlashJcrColonDescription, jcrColonContentSlashJcrColonLastModified: jcrColonContentSlashJcrColonLastModified, jcrColonContentSlashJcrColonLastModifiedBy: jcrColonContentSlashJcrColonLastModifiedBy, jcrColonContentSlashJcrColonMixinTypes: jcrColonContentSlashJcrColonMixinTypes, jcrColonContentSlashJcrColonTitle: jcrColonContentSlashJcrColonTitle, jcrColonContentSlashLogLevel: jcrColonContentSlashLogLevel, jcrColonContentSlashNoStatusUpdate: jcrColonContentSlashNoStatusUpdate, jcrColonContentSlashNoVersioning: jcrColonContentSlashNoVersioning, jcrColonContentSlashProtocolConnectTimeout: jcrColonContentSlashProtocolConnectTimeout, jcrColonContentSlashProtocolHTTPConnectionClosed: jcrColonContentSlashProtocolHTTPConnectionClosed, jcrColonContentSlashProtocolHTTPExpired: jcrColonContentSlashProtocolHTTPExpired, jcrColonContentSlashProtocolHTTPHeaders: jcrColonContentSlashProtocolHTTPHeaders, jcrColonContentSlashProtocolHTTPHeadersAtTypeHint: jcrColonContentSlashProtocolHTTPHeadersAtTypeHint, jcrColonContentSlashProtocolHTTPMethod: jcrColonContentSlashProtocolHTTPMethod, jcrColonContentSlashProtocolHTTPSRelaxed: jcrColonContentSlashProtocolHTTPSRelaxed, jcrColonContentSlashProtocolInterface: jcrColonContentSlashProtocolInterface, jcrColonContentSlashProtocolSocketTimeout: jcrColonContentSlashProtocolSocketTimeout, jcrColonContentSlashProtocolVersion: jcrColonContentSlashProtocolVersion, jcrColonContentSlashProxyNTLMDomain: jcrColonContentSlashProxyNTLMDomain, jcrColonContentSlashProxyNTLMHost: jcrColonContentSlashProxyNTLMHost, jcrColonContentSlashProxyHost: jcrColonContentSlashProxyHost, jcrColonContentSlashProxyPassword: jcrColonContentSlashProxyPassword, jcrColonContentSlashProxyPort: jcrColonContentSlashProxyPort, jcrColonContentSlashProxyUser: jcrColonContentSlashProxyUser, jcrColonContentSlashQueueBatchMaxSize: jcrColonContentSlashQueueBatchMaxSize, jcrColonContentSlashQueueBatchMode: jcrColonContentSlashQueueBatchMode, jcrColonContentSlashQueueBatchWaitTime: jcrColonContentSlashQueueBatchWaitTime, jcrColonContentSlashRetryDelay: jcrColonContentSlashRetryDelay, jcrColonContentSlashReverseReplication: jcrColonContentSlashReverseReplication, jcrColonContentSlashSerializationType: jcrColonContentSlashSerializationType, jcrColonContentSlashSlingColonResourceType: jcrColonContentSlashSlingColonResourceType, jcrColonContentSlashSsl: jcrColonContentSlashSsl, jcrColonContentSlashTransportNTLMDomain: jcrColonContentSlashTransportNTLMDomain, jcrColonContentSlashTransportNTLMHost: jcrColonContentSlashTransportNTLMHost, jcrColonContentSlashTransportPassword: jcrColonContentSlashTransportPassword, jcrColonContentSlashTransportUri: jcrColonContentSlashTransportUri, jcrColonContentSlashTransportUser: jcrColonContentSlashTransportUser, jcrColonContentSlashTriggerDistribute: jcrColonContentSlashTriggerDistribute, jcrColonContentSlashTriggerModified: jcrColonContentSlashTriggerModified, jcrColonContentSlashTriggerOnOffTime: jcrColonContentSlashTriggerOnOffTime, jcrColonContentSlashTriggerReceive: jcrColonContentSlashTriggerReceive, jcrColonContentSlashTriggerSpecific: jcrColonContentSlashTriggerSpecific, jcrColonContentSlashUserId: jcrColonContentSlashUserId, jcrColonPrimaryType: jcrColonPrimaryType, colonOperation: colonOperation, abortTrigger: abortTrigger,);
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
  Future<Response> postAuthorizableKeystoreWithHttpInfo(String intermediatePath, String authorizableId, { String? colonOperation, String? currentPassword, String? newPassword, String? rePassword, String? keyPassword, String? keyStorePass, String? alias, String? newAlias, String? removeAlias, MultipartFile? certChain, MultipartFile? pk, MultipartFile? keyStore, Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/{intermediatePath}/{authorizableId}.ks.html'
      .replaceAll('{intermediatePath}', intermediatePath)
      .replaceAll('{authorizableId}', authorizableId);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (colonOperation != null) {
      queryParams.addAll(_queryParams('', ':operation', colonOperation));
    }
    if (currentPassword != null) {
      queryParams.addAll(_queryParams('', 'currentPassword', currentPassword));
    }
    if (newPassword != null) {
      queryParams.addAll(_queryParams('', 'newPassword', newPassword));
    }
    if (rePassword != null) {
      queryParams.addAll(_queryParams('', 'rePassword', rePassword));
    }
    if (keyPassword != null) {
      queryParams.addAll(_queryParams('', 'keyPassword', keyPassword));
    }
    if (keyStorePass != null) {
      queryParams.addAll(_queryParams('', 'keyStorePass', keyStorePass));
    }
    if (alias != null) {
      queryParams.addAll(_queryParams('', 'alias', alias));
    }
    if (newAlias != null) {
      queryParams.addAll(_queryParams('', 'newAlias', newAlias));
    }
    if (removeAlias != null) {
      queryParams.addAll(_queryParams('', 'removeAlias', removeAlias));
    }

    const contentTypes = <String>['multipart/form-data'];

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

    return apiClient.invokeAPI(
      path,
      'POST',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
      abortTrigger: abortTrigger,
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
  Future<KeystoreInfo?> postAuthorizableKeystore(String intermediatePath, String authorizableId, { String? colonOperation, String? currentPassword, String? newPassword, String? rePassword, String? keyPassword, String? keyStorePass, String? alias, String? newAlias, String? removeAlias, MultipartFile? certChain, MultipartFile? pk, MultipartFile? keyStore, Future<void>? abortTrigger, }) async {
    final response = await postAuthorizableKeystoreWithHttpInfo(intermediatePath, authorizableId, colonOperation: colonOperation, currentPassword: currentPassword, newPassword: newPassword, rePassword: rePassword, keyPassword: keyPassword, keyStorePass: keyStorePass, alias: alias, newAlias: newAlias, removeAlias: removeAlias, certChain: certChain, pk: pk, keyStore: keyStore, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'KeystoreInfo',) as KeystoreInfo;
    
    }
    return null;
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
  Future<Response> postAuthorizablesWithHttpInfo(String authorizableId, String intermediatePath, { String? createUser, String? createGroup, String? repColonPassword, String? profileSlashGivenName, Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/libs/granite/security/post/authorizables';

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

      queryParams.addAll(_queryParams('', 'authorizableId', authorizableId));
      queryParams.addAll(_queryParams('', 'intermediatePath', intermediatePath));
    if (createUser != null) {
      queryParams.addAll(_queryParams('', 'createUser', createUser));
    }
    if (createGroup != null) {
      queryParams.addAll(_queryParams('', 'createGroup', createGroup));
    }
    if (repColonPassword != null) {
      queryParams.addAll(_queryParams('', 'rep:password', repColonPassword));
    }
    if (profileSlashGivenName != null) {
      queryParams.addAll(_queryParams('', 'profile/givenName', profileSlashGivenName));
    }

    const contentTypes = <String>[];


    return apiClient.invokeAPI(
      path,
      'POST',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
      abortTrigger: abortTrigger,
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
  Future<String?> postAuthorizables(String authorizableId, String intermediatePath, { String? createUser, String? createGroup, String? repColonPassword, String? profileSlashGivenName, Future<void>? abortTrigger, }) async {
    final response = await postAuthorizablesWithHttpInfo(authorizableId, intermediatePath, createUser: createUser, createGroup: createGroup, repColonPassword: repColonPassword, profileSlashGivenName: profileSlashGivenName, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'String',) as String;
    
    }
    return null;
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
  Future<Response> postConfigAdobeGraniteSamlAuthenticationHandlerWithHttpInfo({ String? keyStorePassword, String? keyStorePasswordAtTypeHint, int? servicePeriodRanking, String? servicePeriodRankingAtTypeHint, bool? idpHttpRedirect, String? idpHttpRedirectAtTypeHint, bool? createUser, String? createUserAtTypeHint, String? defaultRedirectUrl, String? defaultRedirectUrlAtTypeHint, String? userIDAttribute, String? userIDAttributeAtTypeHint, List<String>? defaultGroups, String? defaultGroupsAtTypeHint, String? idpCertAlias, String? idpCertAliasAtTypeHint, bool? addGroupMemberships, String? addGroupMembershipsAtTypeHint, List<String>? path, String? pathAtTypeHint, List<String>? synchronizeAttributes, String? synchronizeAttributesAtTypeHint, int? clockTolerance, String? clockToleranceAtTypeHint, String? groupMembershipAttribute, String? groupMembershipAttributeAtTypeHint, String? idpUrl, String? idpUrlAtTypeHint, String? logoutUrl, String? logoutUrlAtTypeHint, String? serviceProviderEntityId, String? serviceProviderEntityIdAtTypeHint, String? assertionConsumerServiceURL, String? assertionConsumerServiceURLAtTypeHint, bool? handleLogout, String? handleLogoutAtTypeHint, String? spPrivateKeyAlias, String? spPrivateKeyAliasAtTypeHint, bool? useEncryption, String? useEncryptionAtTypeHint, String? nameIdFormat, String? nameIdFormatAtTypeHint, String? digestMethod, String? digestMethodAtTypeHint, String? signatureMethod, String? signatureMethodAtTypeHint, String? userIntermediatePath, String? userIntermediatePathAtTypeHint, Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config';

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (keyStorePassword != null) {
      queryParams.addAll(_queryParams('', 'keyStorePassword', keyStorePassword));
    }
    if (keyStorePasswordAtTypeHint != null) {
      queryParams.addAll(_queryParams('', 'keyStorePassword@TypeHint', keyStorePasswordAtTypeHint));
    }
    if (servicePeriodRanking != null) {
      queryParams.addAll(_queryParams('', 'service.ranking', servicePeriodRanking));
    }
    if (servicePeriodRankingAtTypeHint != null) {
      queryParams.addAll(_queryParams('', 'service.ranking@TypeHint', servicePeriodRankingAtTypeHint));
    }
    if (idpHttpRedirect != null) {
      queryParams.addAll(_queryParams('', 'idpHttpRedirect', idpHttpRedirect));
    }
    if (idpHttpRedirectAtTypeHint != null) {
      queryParams.addAll(_queryParams('', 'idpHttpRedirect@TypeHint', idpHttpRedirectAtTypeHint));
    }
    if (createUser != null) {
      queryParams.addAll(_queryParams('', 'createUser', createUser));
    }
    if (createUserAtTypeHint != null) {
      queryParams.addAll(_queryParams('', 'createUser@TypeHint', createUserAtTypeHint));
    }
    if (defaultRedirectUrl != null) {
      queryParams.addAll(_queryParams('', 'defaultRedirectUrl', defaultRedirectUrl));
    }
    if (defaultRedirectUrlAtTypeHint != null) {
      queryParams.addAll(_queryParams('', 'defaultRedirectUrl@TypeHint', defaultRedirectUrlAtTypeHint));
    }
    if (userIDAttribute != null) {
      queryParams.addAll(_queryParams('', 'userIDAttribute', userIDAttribute));
    }
    if (userIDAttributeAtTypeHint != null) {
      queryParams.addAll(_queryParams('', 'userIDAttribute@TypeHint', userIDAttributeAtTypeHint));
    }
    if (defaultGroups != null) {
      queryParams.addAll(_queryParams('multi', 'defaultGroups', defaultGroups));
    }
    if (defaultGroupsAtTypeHint != null) {
      queryParams.addAll(_queryParams('', 'defaultGroups@TypeHint', defaultGroupsAtTypeHint));
    }
    if (idpCertAlias != null) {
      queryParams.addAll(_queryParams('', 'idpCertAlias', idpCertAlias));
    }
    if (idpCertAliasAtTypeHint != null) {
      queryParams.addAll(_queryParams('', 'idpCertAlias@TypeHint', idpCertAliasAtTypeHint));
    }
    if (addGroupMemberships != null) {
      queryParams.addAll(_queryParams('', 'addGroupMemberships', addGroupMemberships));
    }
    if (addGroupMembershipsAtTypeHint != null) {
      queryParams.addAll(_queryParams('', 'addGroupMemberships@TypeHint', addGroupMembershipsAtTypeHint));
    }
    if (path != null) {
      queryParams.addAll(_queryParams('multi', 'path', path));
    }
    if (pathAtTypeHint != null) {
      queryParams.addAll(_queryParams('', 'path@TypeHint', pathAtTypeHint));
    }
    if (synchronizeAttributes != null) {
      queryParams.addAll(_queryParams('multi', 'synchronizeAttributes', synchronizeAttributes));
    }
    if (synchronizeAttributesAtTypeHint != null) {
      queryParams.addAll(_queryParams('', 'synchronizeAttributes@TypeHint', synchronizeAttributesAtTypeHint));
    }
    if (clockTolerance != null) {
      queryParams.addAll(_queryParams('', 'clockTolerance', clockTolerance));
    }
    if (clockToleranceAtTypeHint != null) {
      queryParams.addAll(_queryParams('', 'clockTolerance@TypeHint', clockToleranceAtTypeHint));
    }
    if (groupMembershipAttribute != null) {
      queryParams.addAll(_queryParams('', 'groupMembershipAttribute', groupMembershipAttribute));
    }
    if (groupMembershipAttributeAtTypeHint != null) {
      queryParams.addAll(_queryParams('', 'groupMembershipAttribute@TypeHint', groupMembershipAttributeAtTypeHint));
    }
    if (idpUrl != null) {
      queryParams.addAll(_queryParams('', 'idpUrl', idpUrl));
    }
    if (idpUrlAtTypeHint != null) {
      queryParams.addAll(_queryParams('', 'idpUrl@TypeHint', idpUrlAtTypeHint));
    }
    if (logoutUrl != null) {
      queryParams.addAll(_queryParams('', 'logoutUrl', logoutUrl));
    }
    if (logoutUrlAtTypeHint != null) {
      queryParams.addAll(_queryParams('', 'logoutUrl@TypeHint', logoutUrlAtTypeHint));
    }
    if (serviceProviderEntityId != null) {
      queryParams.addAll(_queryParams('', 'serviceProviderEntityId', serviceProviderEntityId));
    }
    if (serviceProviderEntityIdAtTypeHint != null) {
      queryParams.addAll(_queryParams('', 'serviceProviderEntityId@TypeHint', serviceProviderEntityIdAtTypeHint));
    }
    if (assertionConsumerServiceURL != null) {
      queryParams.addAll(_queryParams('', 'assertionConsumerServiceURL', assertionConsumerServiceURL));
    }
    if (assertionConsumerServiceURLAtTypeHint != null) {
      queryParams.addAll(_queryParams('', 'assertionConsumerServiceURL@TypeHint', assertionConsumerServiceURLAtTypeHint));
    }
    if (handleLogout != null) {
      queryParams.addAll(_queryParams('', 'handleLogout', handleLogout));
    }
    if (handleLogoutAtTypeHint != null) {
      queryParams.addAll(_queryParams('', 'handleLogout@TypeHint', handleLogoutAtTypeHint));
    }
    if (spPrivateKeyAlias != null) {
      queryParams.addAll(_queryParams('', 'spPrivateKeyAlias', spPrivateKeyAlias));
    }
    if (spPrivateKeyAliasAtTypeHint != null) {
      queryParams.addAll(_queryParams('', 'spPrivateKeyAlias@TypeHint', spPrivateKeyAliasAtTypeHint));
    }
    if (useEncryption != null) {
      queryParams.addAll(_queryParams('', 'useEncryption', useEncryption));
    }
    if (useEncryptionAtTypeHint != null) {
      queryParams.addAll(_queryParams('', 'useEncryption@TypeHint', useEncryptionAtTypeHint));
    }
    if (nameIdFormat != null) {
      queryParams.addAll(_queryParams('', 'nameIdFormat', nameIdFormat));
    }
    if (nameIdFormatAtTypeHint != null) {
      queryParams.addAll(_queryParams('', 'nameIdFormat@TypeHint', nameIdFormatAtTypeHint));
    }
    if (digestMethod != null) {
      queryParams.addAll(_queryParams('', 'digestMethod', digestMethod));
    }
    if (digestMethodAtTypeHint != null) {
      queryParams.addAll(_queryParams('', 'digestMethod@TypeHint', digestMethodAtTypeHint));
    }
    if (signatureMethod != null) {
      queryParams.addAll(_queryParams('', 'signatureMethod', signatureMethod));
    }
    if (signatureMethodAtTypeHint != null) {
      queryParams.addAll(_queryParams('', 'signatureMethod@TypeHint', signatureMethodAtTypeHint));
    }
    if (userIntermediatePath != null) {
      queryParams.addAll(_queryParams('', 'userIntermediatePath', userIntermediatePath));
    }
    if (userIntermediatePathAtTypeHint != null) {
      queryParams.addAll(_queryParams('', 'userIntermediatePath@TypeHint', userIntermediatePathAtTypeHint));
    }

    const contentTypes = <String>[];


    return apiClient.invokeAPI(
      path,
      'POST',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
      abortTrigger: abortTrigger,
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
  Future<void> postConfigAdobeGraniteSamlAuthenticationHandler({ String? keyStorePassword, String? keyStorePasswordAtTypeHint, int? servicePeriodRanking, String? servicePeriodRankingAtTypeHint, bool? idpHttpRedirect, String? idpHttpRedirectAtTypeHint, bool? createUser, String? createUserAtTypeHint, String? defaultRedirectUrl, String? defaultRedirectUrlAtTypeHint, String? userIDAttribute, String? userIDAttributeAtTypeHint, List<String>? defaultGroups, String? defaultGroupsAtTypeHint, String? idpCertAlias, String? idpCertAliasAtTypeHint, bool? addGroupMemberships, String? addGroupMembershipsAtTypeHint, List<String>? path, String? pathAtTypeHint, List<String>? synchronizeAttributes, String? synchronizeAttributesAtTypeHint, int? clockTolerance, String? clockToleranceAtTypeHint, String? groupMembershipAttribute, String? groupMembershipAttributeAtTypeHint, String? idpUrl, String? idpUrlAtTypeHint, String? logoutUrl, String? logoutUrlAtTypeHint, String? serviceProviderEntityId, String? serviceProviderEntityIdAtTypeHint, String? assertionConsumerServiceURL, String? assertionConsumerServiceURLAtTypeHint, bool? handleLogout, String? handleLogoutAtTypeHint, String? spPrivateKeyAlias, String? spPrivateKeyAliasAtTypeHint, bool? useEncryption, String? useEncryptionAtTypeHint, String? nameIdFormat, String? nameIdFormatAtTypeHint, String? digestMethod, String? digestMethodAtTypeHint, String? signatureMethod, String? signatureMethodAtTypeHint, String? userIntermediatePath, String? userIntermediatePathAtTypeHint, Future<void>? abortTrigger, }) async {
    final response = await postConfigAdobeGraniteSamlAuthenticationHandlerWithHttpInfo(keyStorePassword: keyStorePassword, keyStorePasswordAtTypeHint: keyStorePasswordAtTypeHint, servicePeriodRanking: servicePeriodRanking, servicePeriodRankingAtTypeHint: servicePeriodRankingAtTypeHint, idpHttpRedirect: idpHttpRedirect, idpHttpRedirectAtTypeHint: idpHttpRedirectAtTypeHint, createUser: createUser, createUserAtTypeHint: createUserAtTypeHint, defaultRedirectUrl: defaultRedirectUrl, defaultRedirectUrlAtTypeHint: defaultRedirectUrlAtTypeHint, userIDAttribute: userIDAttribute, userIDAttributeAtTypeHint: userIDAttributeAtTypeHint, defaultGroups: defaultGroups, defaultGroupsAtTypeHint: defaultGroupsAtTypeHint, idpCertAlias: idpCertAlias, idpCertAliasAtTypeHint: idpCertAliasAtTypeHint, addGroupMemberships: addGroupMemberships, addGroupMembershipsAtTypeHint: addGroupMembershipsAtTypeHint, path: path, pathAtTypeHint: pathAtTypeHint, synchronizeAttributes: synchronizeAttributes, synchronizeAttributesAtTypeHint: synchronizeAttributesAtTypeHint, clockTolerance: clockTolerance, clockToleranceAtTypeHint: clockToleranceAtTypeHint, groupMembershipAttribute: groupMembershipAttribute, groupMembershipAttributeAtTypeHint: groupMembershipAttributeAtTypeHint, idpUrl: idpUrl, idpUrlAtTypeHint: idpUrlAtTypeHint, logoutUrl: logoutUrl, logoutUrlAtTypeHint: logoutUrlAtTypeHint, serviceProviderEntityId: serviceProviderEntityId, serviceProviderEntityIdAtTypeHint: serviceProviderEntityIdAtTypeHint, assertionConsumerServiceURL: assertionConsumerServiceURL, assertionConsumerServiceURLAtTypeHint: assertionConsumerServiceURLAtTypeHint, handleLogout: handleLogout, handleLogoutAtTypeHint: handleLogoutAtTypeHint, spPrivateKeyAlias: spPrivateKeyAlias, spPrivateKeyAliasAtTypeHint: spPrivateKeyAliasAtTypeHint, useEncryption: useEncryption, useEncryptionAtTypeHint: useEncryptionAtTypeHint, nameIdFormat: nameIdFormat, nameIdFormatAtTypeHint: nameIdFormatAtTypeHint, digestMethod: digestMethod, digestMethodAtTypeHint: digestMethodAtTypeHint, signatureMethod: signatureMethod, signatureMethodAtTypeHint: signatureMethodAtTypeHint, userIntermediatePath: userIntermediatePath, userIntermediatePathAtTypeHint: userIntermediatePathAtTypeHint, abortTrigger: abortTrigger,);
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
  Future<Response> postConfigApacheFelixJettyBasedHttpServiceWithHttpInfo({ bool? orgPeriodApachePeriodFelixPeriodHttpsPeriodNio, String? orgPeriodApachePeriodFelixPeriodHttpsPeriodNioAtTypeHint, String? orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystore, String? orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystoreAtTypeHint, String? orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodPassword, String? orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodPasswordAtTypeHint, String? orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodKey, String? orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodKeyAtTypeHint, String? orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodKeyPeriodPassword, String? orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodKeyPeriodPasswordAtTypeHint, String? orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststore, String? orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststoreAtTypeHint, String? orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststorePeriodPassword, String? orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststorePeriodPasswordAtTypeHint, String? orgPeriodApachePeriodFelixPeriodHttpsPeriodClientcertificate, String? orgPeriodApachePeriodFelixPeriodHttpsPeriodClientcertificateAtTypeHint, bool? orgPeriodApachePeriodFelixPeriodHttpsPeriodEnable, String? orgPeriodApachePeriodFelixPeriodHttpsPeriodEnableAtTypeHint, String? orgPeriodOsgiPeriodServicePeriodHttpPeriodPortPeriodSecure, String? orgPeriodOsgiPeriodServicePeriodHttpPeriodPortPeriodSecureAtTypeHint, Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/apps/system/config/org.apache.felix.http';

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (orgPeriodApachePeriodFelixPeriodHttpsPeriodNio != null) {
      queryParams.addAll(_queryParams('', 'org.apache.felix.https.nio', orgPeriodApachePeriodFelixPeriodHttpsPeriodNio));
    }
    if (orgPeriodApachePeriodFelixPeriodHttpsPeriodNioAtTypeHint != null) {
      queryParams.addAll(_queryParams('', 'org.apache.felix.https.nio@TypeHint', orgPeriodApachePeriodFelixPeriodHttpsPeriodNioAtTypeHint));
    }
    if (orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystore != null) {
      queryParams.addAll(_queryParams('', 'org.apache.felix.https.keystore', orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystore));
    }
    if (orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystoreAtTypeHint != null) {
      queryParams.addAll(_queryParams('', 'org.apache.felix.https.keystore@TypeHint', orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystoreAtTypeHint));
    }
    if (orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodPassword != null) {
      queryParams.addAll(_queryParams('', 'org.apache.felix.https.keystore.password', orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodPassword));
    }
    if (orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodPasswordAtTypeHint != null) {
      queryParams.addAll(_queryParams('', 'org.apache.felix.https.keystore.password@TypeHint', orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodPasswordAtTypeHint));
    }
    if (orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodKey != null) {
      queryParams.addAll(_queryParams('', 'org.apache.felix.https.keystore.key', orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodKey));
    }
    if (orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodKeyAtTypeHint != null) {
      queryParams.addAll(_queryParams('', 'org.apache.felix.https.keystore.key@TypeHint', orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodKeyAtTypeHint));
    }
    if (orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodKeyPeriodPassword != null) {
      queryParams.addAll(_queryParams('', 'org.apache.felix.https.keystore.key.password', orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodKeyPeriodPassword));
    }
    if (orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodKeyPeriodPasswordAtTypeHint != null) {
      queryParams.addAll(_queryParams('', 'org.apache.felix.https.keystore.key.password@TypeHint', orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodKeyPeriodPasswordAtTypeHint));
    }
    if (orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststore != null) {
      queryParams.addAll(_queryParams('', 'org.apache.felix.https.truststore', orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststore));
    }
    if (orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststoreAtTypeHint != null) {
      queryParams.addAll(_queryParams('', 'org.apache.felix.https.truststore@TypeHint', orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststoreAtTypeHint));
    }
    if (orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststorePeriodPassword != null) {
      queryParams.addAll(_queryParams('', 'org.apache.felix.https.truststore.password', orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststorePeriodPassword));
    }
    if (orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststorePeriodPasswordAtTypeHint != null) {
      queryParams.addAll(_queryParams('', 'org.apache.felix.https.truststore.password@TypeHint', orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststorePeriodPasswordAtTypeHint));
    }
    if (orgPeriodApachePeriodFelixPeriodHttpsPeriodClientcertificate != null) {
      queryParams.addAll(_queryParams('', 'org.apache.felix.https.clientcertificate', orgPeriodApachePeriodFelixPeriodHttpsPeriodClientcertificate));
    }
    if (orgPeriodApachePeriodFelixPeriodHttpsPeriodClientcertificateAtTypeHint != null) {
      queryParams.addAll(_queryParams('', 'org.apache.felix.https.clientcertificate@TypeHint', orgPeriodApachePeriodFelixPeriodHttpsPeriodClientcertificateAtTypeHint));
    }
    if (orgPeriodApachePeriodFelixPeriodHttpsPeriodEnable != null) {
      queryParams.addAll(_queryParams('', 'org.apache.felix.https.enable', orgPeriodApachePeriodFelixPeriodHttpsPeriodEnable));
    }
    if (orgPeriodApachePeriodFelixPeriodHttpsPeriodEnableAtTypeHint != null) {
      queryParams.addAll(_queryParams('', 'org.apache.felix.https.enable@TypeHint', orgPeriodApachePeriodFelixPeriodHttpsPeriodEnableAtTypeHint));
    }
    if (orgPeriodOsgiPeriodServicePeriodHttpPeriodPortPeriodSecure != null) {
      queryParams.addAll(_queryParams('', 'org.osgi.service.http.port.secure', orgPeriodOsgiPeriodServicePeriodHttpPeriodPortPeriodSecure));
    }
    if (orgPeriodOsgiPeriodServicePeriodHttpPeriodPortPeriodSecureAtTypeHint != null) {
      queryParams.addAll(_queryParams('', 'org.osgi.service.http.port.secure@TypeHint', orgPeriodOsgiPeriodServicePeriodHttpPeriodPortPeriodSecureAtTypeHint));
    }

    const contentTypes = <String>[];


    return apiClient.invokeAPI(
      path,
      'POST',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
      abortTrigger: abortTrigger,
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
  Future<void> postConfigApacheFelixJettyBasedHttpService({ bool? orgPeriodApachePeriodFelixPeriodHttpsPeriodNio, String? orgPeriodApachePeriodFelixPeriodHttpsPeriodNioAtTypeHint, String? orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystore, String? orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystoreAtTypeHint, String? orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodPassword, String? orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodPasswordAtTypeHint, String? orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodKey, String? orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodKeyAtTypeHint, String? orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodKeyPeriodPassword, String? orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodKeyPeriodPasswordAtTypeHint, String? orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststore, String? orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststoreAtTypeHint, String? orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststorePeriodPassword, String? orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststorePeriodPasswordAtTypeHint, String? orgPeriodApachePeriodFelixPeriodHttpsPeriodClientcertificate, String? orgPeriodApachePeriodFelixPeriodHttpsPeriodClientcertificateAtTypeHint, bool? orgPeriodApachePeriodFelixPeriodHttpsPeriodEnable, String? orgPeriodApachePeriodFelixPeriodHttpsPeriodEnableAtTypeHint, String? orgPeriodOsgiPeriodServicePeriodHttpPeriodPortPeriodSecure, String? orgPeriodOsgiPeriodServicePeriodHttpPeriodPortPeriodSecureAtTypeHint, Future<void>? abortTrigger, }) async {
    final response = await postConfigApacheFelixJettyBasedHttpServiceWithHttpInfo(orgPeriodApachePeriodFelixPeriodHttpsPeriodNio: orgPeriodApachePeriodFelixPeriodHttpsPeriodNio, orgPeriodApachePeriodFelixPeriodHttpsPeriodNioAtTypeHint: orgPeriodApachePeriodFelixPeriodHttpsPeriodNioAtTypeHint, orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystore: orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystore, orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystoreAtTypeHint: orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystoreAtTypeHint, orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodPassword: orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodPassword, orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodPasswordAtTypeHint: orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodPasswordAtTypeHint, orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodKey: orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodKey, orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodKeyAtTypeHint: orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodKeyAtTypeHint, orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodKeyPeriodPassword: orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodKeyPeriodPassword, orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodKeyPeriodPasswordAtTypeHint: orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodKeyPeriodPasswordAtTypeHint, orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststore: orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststore, orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststoreAtTypeHint: orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststoreAtTypeHint, orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststorePeriodPassword: orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststorePeriodPassword, orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststorePeriodPasswordAtTypeHint: orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststorePeriodPasswordAtTypeHint, orgPeriodApachePeriodFelixPeriodHttpsPeriodClientcertificate: orgPeriodApachePeriodFelixPeriodHttpsPeriodClientcertificate, orgPeriodApachePeriodFelixPeriodHttpsPeriodClientcertificateAtTypeHint: orgPeriodApachePeriodFelixPeriodHttpsPeriodClientcertificateAtTypeHint, orgPeriodApachePeriodFelixPeriodHttpsPeriodEnable: orgPeriodApachePeriodFelixPeriodHttpsPeriodEnable, orgPeriodApachePeriodFelixPeriodHttpsPeriodEnableAtTypeHint: orgPeriodApachePeriodFelixPeriodHttpsPeriodEnableAtTypeHint, orgPeriodOsgiPeriodServicePeriodHttpPeriodPortPeriodSecure: orgPeriodOsgiPeriodServicePeriodHttpPeriodPortPeriodSecure, orgPeriodOsgiPeriodServicePeriodHttpPeriodPortPeriodSecureAtTypeHint: orgPeriodOsgiPeriodServicePeriodHttpPeriodPortPeriodSecureAtTypeHint, abortTrigger: abortTrigger,);
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
  Future<Response> postConfigApacheHttpComponentsProxyConfigurationWithHttpInfo({ String? proxyPeriodHost, String? proxyPeriodHostAtTypeHint, int? proxyPeriodPort, String? proxyPeriodPortAtTypeHint, List<String>? proxyPeriodExceptions, String? proxyPeriodExceptionsAtTypeHint, bool? proxyPeriodEnabled, String? proxyPeriodEnabledAtTypeHint, String? proxyPeriodUser, String? proxyPeriodUserAtTypeHint, String? proxyPeriodPassword, String? proxyPeriodPasswordAtTypeHint, Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/apps/system/config/org.apache.http.proxyconfigurator.config';

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (proxyPeriodHost != null) {
      queryParams.addAll(_queryParams('', 'proxy.host', proxyPeriodHost));
    }
    if (proxyPeriodHostAtTypeHint != null) {
      queryParams.addAll(_queryParams('', 'proxy.host@TypeHint', proxyPeriodHostAtTypeHint));
    }
    if (proxyPeriodPort != null) {
      queryParams.addAll(_queryParams('', 'proxy.port', proxyPeriodPort));
    }
    if (proxyPeriodPortAtTypeHint != null) {
      queryParams.addAll(_queryParams('', 'proxy.port@TypeHint', proxyPeriodPortAtTypeHint));
    }
    if (proxyPeriodExceptions != null) {
      queryParams.addAll(_queryParams('multi', 'proxy.exceptions', proxyPeriodExceptions));
    }
    if (proxyPeriodExceptionsAtTypeHint != null) {
      queryParams.addAll(_queryParams('', 'proxy.exceptions@TypeHint', proxyPeriodExceptionsAtTypeHint));
    }
    if (proxyPeriodEnabled != null) {
      queryParams.addAll(_queryParams('', 'proxy.enabled', proxyPeriodEnabled));
    }
    if (proxyPeriodEnabledAtTypeHint != null) {
      queryParams.addAll(_queryParams('', 'proxy.enabled@TypeHint', proxyPeriodEnabledAtTypeHint));
    }
    if (proxyPeriodUser != null) {
      queryParams.addAll(_queryParams('', 'proxy.user', proxyPeriodUser));
    }
    if (proxyPeriodUserAtTypeHint != null) {
      queryParams.addAll(_queryParams('', 'proxy.user@TypeHint', proxyPeriodUserAtTypeHint));
    }
    if (proxyPeriodPassword != null) {
      queryParams.addAll(_queryParams('', 'proxy.password', proxyPeriodPassword));
    }
    if (proxyPeriodPasswordAtTypeHint != null) {
      queryParams.addAll(_queryParams('', 'proxy.password@TypeHint', proxyPeriodPasswordAtTypeHint));
    }

    const contentTypes = <String>[];


    return apiClient.invokeAPI(
      path,
      'POST',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
      abortTrigger: abortTrigger,
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
  Future<void> postConfigApacheHttpComponentsProxyConfiguration({ String? proxyPeriodHost, String? proxyPeriodHostAtTypeHint, int? proxyPeriodPort, String? proxyPeriodPortAtTypeHint, List<String>? proxyPeriodExceptions, String? proxyPeriodExceptionsAtTypeHint, bool? proxyPeriodEnabled, String? proxyPeriodEnabledAtTypeHint, String? proxyPeriodUser, String? proxyPeriodUserAtTypeHint, String? proxyPeriodPassword, String? proxyPeriodPasswordAtTypeHint, Future<void>? abortTrigger, }) async {
    final response = await postConfigApacheHttpComponentsProxyConfigurationWithHttpInfo(proxyPeriodHost: proxyPeriodHost, proxyPeriodHostAtTypeHint: proxyPeriodHostAtTypeHint, proxyPeriodPort: proxyPeriodPort, proxyPeriodPortAtTypeHint: proxyPeriodPortAtTypeHint, proxyPeriodExceptions: proxyPeriodExceptions, proxyPeriodExceptionsAtTypeHint: proxyPeriodExceptionsAtTypeHint, proxyPeriodEnabled: proxyPeriodEnabled, proxyPeriodEnabledAtTypeHint: proxyPeriodEnabledAtTypeHint, proxyPeriodUser: proxyPeriodUser, proxyPeriodUserAtTypeHint: proxyPeriodUserAtTypeHint, proxyPeriodPassword: proxyPeriodPassword, proxyPeriodPasswordAtTypeHint: proxyPeriodPasswordAtTypeHint, abortTrigger: abortTrigger,);
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
  Future<Response> postConfigApacheSlingDavExServletWithHttpInfo({ String? alias, String? aliasAtTypeHint, bool? davPeriodCreateAbsoluteUri, String? davPeriodCreateAbsoluteUriAtTypeHint, Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet';

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (alias != null) {
      queryParams.addAll(_queryParams('', 'alias', alias));
    }
    if (aliasAtTypeHint != null) {
      queryParams.addAll(_queryParams('', 'alias@TypeHint', aliasAtTypeHint));
    }
    if (davPeriodCreateAbsoluteUri != null) {
      queryParams.addAll(_queryParams('', 'dav.create-absolute-uri', davPeriodCreateAbsoluteUri));
    }
    if (davPeriodCreateAbsoluteUriAtTypeHint != null) {
      queryParams.addAll(_queryParams('', 'dav.create-absolute-uri@TypeHint', davPeriodCreateAbsoluteUriAtTypeHint));
    }

    const contentTypes = <String>[];


    return apiClient.invokeAPI(
      path,
      'POST',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
      abortTrigger: abortTrigger,
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
  Future<void> postConfigApacheSlingDavExServlet({ String? alias, String? aliasAtTypeHint, bool? davPeriodCreateAbsoluteUri, String? davPeriodCreateAbsoluteUriAtTypeHint, Future<void>? abortTrigger, }) async {
    final response = await postConfigApacheSlingDavExServletWithHttpInfo(alias: alias, aliasAtTypeHint: aliasAtTypeHint, davPeriodCreateAbsoluteUri: davPeriodCreateAbsoluteUri, davPeriodCreateAbsoluteUriAtTypeHint: davPeriodCreateAbsoluteUriAtTypeHint, abortTrigger: abortTrigger,);
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
  Future<Response> postConfigApacheSlingGetServletWithHttpInfo({ String? jsonPeriodMaximumresults, String? jsonPeriodMaximumresultsAtTypeHint, bool? enablePeriodHtml, String? enablePeriodHtmlAtTypeHint, bool? enablePeriodTxt, String? enablePeriodTxtAtTypeHint, bool? enablePeriodXml, String? enablePeriodXmlAtTypeHint, Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet';

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (jsonPeriodMaximumresults != null) {
      queryParams.addAll(_queryParams('', 'json.maximumresults', jsonPeriodMaximumresults));
    }
    if (jsonPeriodMaximumresultsAtTypeHint != null) {
      queryParams.addAll(_queryParams('', 'json.maximumresults@TypeHint', jsonPeriodMaximumresultsAtTypeHint));
    }
    if (enablePeriodHtml != null) {
      queryParams.addAll(_queryParams('', 'enable.html', enablePeriodHtml));
    }
    if (enablePeriodHtmlAtTypeHint != null) {
      queryParams.addAll(_queryParams('', 'enable.html@TypeHint', enablePeriodHtmlAtTypeHint));
    }
    if (enablePeriodTxt != null) {
      queryParams.addAll(_queryParams('', 'enable.txt', enablePeriodTxt));
    }
    if (enablePeriodTxtAtTypeHint != null) {
      queryParams.addAll(_queryParams('', 'enable.txt@TypeHint', enablePeriodTxtAtTypeHint));
    }
    if (enablePeriodXml != null) {
      queryParams.addAll(_queryParams('', 'enable.xml', enablePeriodXml));
    }
    if (enablePeriodXmlAtTypeHint != null) {
      queryParams.addAll(_queryParams('', 'enable.xml@TypeHint', enablePeriodXmlAtTypeHint));
    }

    const contentTypes = <String>[];


    return apiClient.invokeAPI(
      path,
      'POST',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
      abortTrigger: abortTrigger,
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
  Future<void> postConfigApacheSlingGetServlet({ String? jsonPeriodMaximumresults, String? jsonPeriodMaximumresultsAtTypeHint, bool? enablePeriodHtml, String? enablePeriodHtmlAtTypeHint, bool? enablePeriodTxt, String? enablePeriodTxtAtTypeHint, bool? enablePeriodXml, String? enablePeriodXmlAtTypeHint, Future<void>? abortTrigger, }) async {
    final response = await postConfigApacheSlingGetServletWithHttpInfo(jsonPeriodMaximumresults: jsonPeriodMaximumresults, jsonPeriodMaximumresultsAtTypeHint: jsonPeriodMaximumresultsAtTypeHint, enablePeriodHtml: enablePeriodHtml, enablePeriodHtmlAtTypeHint: enablePeriodHtmlAtTypeHint, enablePeriodTxt: enablePeriodTxt, enablePeriodTxtAtTypeHint: enablePeriodTxtAtTypeHint, enablePeriodXml: enablePeriodXml, enablePeriodXmlAtTypeHint: enablePeriodXmlAtTypeHint, abortTrigger: abortTrigger,);
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
  Future<Response> postConfigApacheSlingReferrerFilterWithHttpInfo({ bool? allowPeriodEmpty, String? allowPeriodEmptyAtTypeHint, String? allowPeriodHosts, String? allowPeriodHostsAtTypeHint, String? allowPeriodHostsPeriodRegexp, String? allowPeriodHostsPeriodRegexpAtTypeHint, String? filterPeriodMethods, String? filterPeriodMethodsAtTypeHint, Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/apps/system/config/org.apache.sling.security.impl.ReferrerFilter';

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (allowPeriodEmpty != null) {
      queryParams.addAll(_queryParams('', 'allow.empty', allowPeriodEmpty));
    }
    if (allowPeriodEmptyAtTypeHint != null) {
      queryParams.addAll(_queryParams('', 'allow.empty@TypeHint', allowPeriodEmptyAtTypeHint));
    }
    if (allowPeriodHosts != null) {
      queryParams.addAll(_queryParams('', 'allow.hosts', allowPeriodHosts));
    }
    if (allowPeriodHostsAtTypeHint != null) {
      queryParams.addAll(_queryParams('', 'allow.hosts@TypeHint', allowPeriodHostsAtTypeHint));
    }
    if (allowPeriodHostsPeriodRegexp != null) {
      queryParams.addAll(_queryParams('', 'allow.hosts.regexp', allowPeriodHostsPeriodRegexp));
    }
    if (allowPeriodHostsPeriodRegexpAtTypeHint != null) {
      queryParams.addAll(_queryParams('', 'allow.hosts.regexp@TypeHint', allowPeriodHostsPeriodRegexpAtTypeHint));
    }
    if (filterPeriodMethods != null) {
      queryParams.addAll(_queryParams('', 'filter.methods', filterPeriodMethods));
    }
    if (filterPeriodMethodsAtTypeHint != null) {
      queryParams.addAll(_queryParams('', 'filter.methods@TypeHint', filterPeriodMethodsAtTypeHint));
    }

    const contentTypes = <String>[];


    return apiClient.invokeAPI(
      path,
      'POST',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
      abortTrigger: abortTrigger,
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
  Future<void> postConfigApacheSlingReferrerFilter({ bool? allowPeriodEmpty, String? allowPeriodEmptyAtTypeHint, String? allowPeriodHosts, String? allowPeriodHostsAtTypeHint, String? allowPeriodHostsPeriodRegexp, String? allowPeriodHostsPeriodRegexpAtTypeHint, String? filterPeriodMethods, String? filterPeriodMethodsAtTypeHint, Future<void>? abortTrigger, }) async {
    final response = await postConfigApacheSlingReferrerFilterWithHttpInfo(allowPeriodEmpty: allowPeriodEmpty, allowPeriodEmptyAtTypeHint: allowPeriodEmptyAtTypeHint, allowPeriodHosts: allowPeriodHosts, allowPeriodHostsAtTypeHint: allowPeriodHostsAtTypeHint, allowPeriodHostsPeriodRegexp: allowPeriodHostsPeriodRegexp, allowPeriodHostsPeriodRegexpAtTypeHint: allowPeriodHostsPeriodRegexpAtTypeHint, filterPeriodMethods: filterPeriodMethods, filterPeriodMethodsAtTypeHint: filterPeriodMethodsAtTypeHint, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
  }

  /// Performs an HTTP 'POST /apps/system/config/{configNodeName}' operation and returns the [Response].
  /// Parameters:
  ///
  /// * [String] configNodeName (required):
  Future<Response> postConfigPropertyWithHttpInfo(String configNodeName, { Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/apps/system/config/{configNodeName}'
      .replaceAll('{configNodeName}', configNodeName);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    const contentTypes = <String>[];


    return apiClient.invokeAPI(
      path,
      'POST',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
      abortTrigger: abortTrigger,
    );
  }

  /// Parameters:
  ///
  /// * [String] configNodeName (required):
  Future<void> postConfigProperty(String configNodeName, { Future<void>? abortTrigger, }) async {
    final response = await postConfigPropertyWithHttpInfo(configNodeName, abortTrigger: abortTrigger,);
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
  Future<Response> postNodeWithHttpInfo(String path, String name, { String? colonOperation, String? deleteAuthorizable, MultipartFile? file, Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/{path}/{name}'
      .replaceAll('{path}', path)
      .replaceAll('{name}', name);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (colonOperation != null) {
      queryParams.addAll(_queryParams('', ':operation', colonOperation));
    }
    if (deleteAuthorizable != null) {
      queryParams.addAll(_queryParams('', 'deleteAuthorizable', deleteAuthorizable));
    }

    const contentTypes = <String>['multipart/form-data'];

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

    return apiClient.invokeAPI(
      path,
      'POST',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
      abortTrigger: abortTrigger,
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
  Future<void> postNode(String path, String name, { String? colonOperation, String? deleteAuthorizable, MultipartFile? file, Future<void>? abortTrigger, }) async {
    final response = await postNodeWithHttpInfo(path, name, colonOperation: colonOperation, deleteAuthorizable: deleteAuthorizable, file: file, abortTrigger: abortTrigger,);
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
  Future<Response> postNodeRwWithHttpInfo(String path, String name, { String? addMembers, Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/{path}/{name}.rw.html'
      .replaceAll('{path}', path)
      .replaceAll('{name}', name);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (addMembers != null) {
      queryParams.addAll(_queryParams('', 'addMembers', addMembers));
    }

    const contentTypes = <String>[];


    return apiClient.invokeAPI(
      path,
      'POST',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
      abortTrigger: abortTrigger,
    );
  }

  /// Parameters:
  ///
  /// * [String] path (required):
  ///
  /// * [String] name (required):
  ///
  /// * [String] addMembers:
  Future<void> postNodeRw(String path, String name, { String? addMembers, Future<void>? abortTrigger, }) async {
    final response = await postNodeRwWithHttpInfo(path, name, addMembers: addMembers, abortTrigger: abortTrigger,);
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
  Future<Response> postPathWithHttpInfo(String path, String jcrColonPrimaryType, String colonName, { Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/{path}/'
      .replaceAll('{path}', path);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

      queryParams.addAll(_queryParams('', 'jcr:primaryType', jcrColonPrimaryType));
      queryParams.addAll(_queryParams('', ':name', colonName));

    const contentTypes = <String>[];


    return apiClient.invokeAPI(
      path,
      'POST',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
      abortTrigger: abortTrigger,
    );
  }

  /// Parameters:
  ///
  /// * [String] path (required):
  ///
  /// * [String] jcrColonPrimaryType (required):
  ///
  /// * [String] colonName (required):
  Future<void> postPath(String path, String jcrColonPrimaryType, String colonName, { Future<void>? abortTrigger, }) async {
    final response = await postPathWithHttpInfo(path, jcrColonPrimaryType, colonName, abortTrigger: abortTrigger,);
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
  Future<Response> postQueryWithHttpInfo(String path, num pPeriodLimit, String n1property, String n1propertyPeriodValue, { Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/bin/querybuilder.json';

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

      queryParams.addAll(_queryParams('', 'path', path));
      queryParams.addAll(_queryParams('', 'p.limit', pPeriodLimit));
      queryParams.addAll(_queryParams('', '1_property', n1property));
      queryParams.addAll(_queryParams('', '1_property.value', n1propertyPeriodValue));

    const contentTypes = <String>[];


    return apiClient.invokeAPI(
      path,
      'POST',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
      abortTrigger: abortTrigger,
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
  Future<String?> postQuery(String path, num pPeriodLimit, String n1property, String n1propertyPeriodValue, { Future<void>? abortTrigger, }) async {
    final response = await postQueryWithHttpInfo(path, pPeriodLimit, n1property, n1propertyPeriodValue, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'String',) as String;
    
    }
    return null;
  }

  /// Performs an HTTP 'POST /libs/replication/treeactivation.html' operation and returns the [Response].
  /// Parameters:
  ///
  /// * [bool] ignoredeactivated (required):
  ///
  /// * [bool] onlymodified (required):
  ///
  /// * [String] path (required):
  ///
  /// * [String] cmd (required):
  Future<Response> postTreeActivationWithHttpInfo(bool ignoredeactivated, bool onlymodified, String path, String cmd, { Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/libs/replication/treeactivation.html';

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

      queryParams.addAll(_queryParams('', 'ignoredeactivated', ignoredeactivated));
      queryParams.addAll(_queryParams('', 'onlymodified', onlymodified));
      queryParams.addAll(_queryParams('', 'path', path));
      queryParams.addAll(_queryParams('', 'cmd', cmd));

    const contentTypes = <String>[];


    return apiClient.invokeAPI(
      path,
      'POST',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
      abortTrigger: abortTrigger,
    );
  }

  /// Parameters:
  ///
  /// * [bool] ignoredeactivated (required):
  ///
  /// * [bool] onlymodified (required):
  ///
  /// * [String] path (required):
  ///
  /// * [String] cmd (required):
  Future<void> postTreeActivation(bool ignoredeactivated, bool onlymodified, String path, String cmd, { Future<void>? abortTrigger, }) async {
    final response = await postTreeActivationWithHttpInfo(ignoredeactivated, onlymodified, path, cmd, abortTrigger: abortTrigger,);
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
  Future<Response> postTruststoreWithHttpInfo({ String? colonOperation, String? newPassword, String? rePassword, String? keyStoreType, String? removeAlias, MultipartFile? certificate, Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/libs/granite/security/post/truststore';

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (colonOperation != null) {
      queryParams.addAll(_queryParams('', ':operation', colonOperation));
    }
    if (newPassword != null) {
      queryParams.addAll(_queryParams('', 'newPassword', newPassword));
    }
    if (rePassword != null) {
      queryParams.addAll(_queryParams('', 'rePassword', rePassword));
    }
    if (keyStoreType != null) {
      queryParams.addAll(_queryParams('', 'keyStoreType', keyStoreType));
    }
    if (removeAlias != null) {
      queryParams.addAll(_queryParams('', 'removeAlias', removeAlias));
    }

    const contentTypes = <String>['multipart/form-data'];

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

    return apiClient.invokeAPI(
      path,
      'POST',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
      abortTrigger: abortTrigger,
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
  Future<String?> postTruststore({ String? colonOperation, String? newPassword, String? rePassword, String? keyStoreType, String? removeAlias, MultipartFile? certificate, Future<void>? abortTrigger, }) async {
    final response = await postTruststoreWithHttpInfo(colonOperation: colonOperation, newPassword: newPassword, rePassword: rePassword, keyStoreType: keyStoreType, removeAlias: removeAlias, certificate: certificate, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'String',) as String;
    
    }
    return null;
  }

  /// Performs an HTTP 'POST /etc/truststore' operation and returns the [Response].
  /// Parameters:
  ///
  /// * [MultipartFile] truststorePeriodP12:
  Future<Response> postTruststorePKCS12WithHttpInfo({ MultipartFile? truststorePeriodP12, Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/etc/truststore';

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    const contentTypes = <String>['multipart/form-data'];

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

    return apiClient.invokeAPI(
      path,
      'POST',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
      abortTrigger: abortTrigger,
    );
  }

  /// Parameters:
  ///
  /// * [MultipartFile] truststorePeriodP12:
  Future<String?> postTruststorePKCS12({ MultipartFile? truststorePeriodP12, Future<void>? abortTrigger, }) async {
    final response = await postTruststorePKCS12WithHttpInfo(truststorePeriodP12: truststorePeriodP12, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'String',) as String;
    
    }
    return null;
  }
}
