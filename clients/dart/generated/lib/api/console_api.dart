//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.0

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class ConsoleApi {
  ConsoleApi([ApiClient apiClient]) : apiClient = apiClient ?? defaultApiClient;

  final ApiClient apiClient;

  /// Performs an HTTP 'GET /system/console/status-productinfo.json' operation and returns the [Response].
  Future<Response> getAemProductInfoWithHttpInfo() async {
    final path = r'/system/console/status-productinfo.json';

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

  Future<List<String>> getAemProductInfo() async {
    final response = await getAemProductInfoWithHttpInfo();
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body != null && response.statusCode != HttpStatus.noContent) {
      return (await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'List<String>') as List)
        .cast<String>()
        .toList(growable: false);
    }
    return Future<List<String>>.value(null);
  }

  /// Performs an HTTP 'GET /system/console/bundles/{name}.json' operation and returns the [Response].
  /// Parameters:
  ///
  /// * [String] name (required):
  Future<Response> getBundleInfoWithHttpInfo(String name) async {
    // Verify required params are set.
    if (name == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: name');
    }

    final path = r'/system/console/bundles/{name}.json'
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
  /// * [String] name (required):
  Future<BundleInfo> getBundleInfo(String name) async {
    final response = await getBundleInfoWithHttpInfo(name);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body != null && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'BundleInfo',) as BundleInfo;
        }
    return Future<BundleInfo>.value(null);
  }

  /// Performs an HTTP 'GET /system/console/configMgr' operation and returns the [Response].
  Future<Response> getConfigMgrWithHttpInfo() async {
    final path = r'/system/console/configMgr';

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

  Future<String> getConfigMgr() async {
    final response = await getConfigMgrWithHttpInfo();
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

  /// Performs an HTTP 'POST /system/console/bundles/{name}' operation and returns the [Response].
  /// Parameters:
  ///
  /// * [String] name (required):
  ///
  /// * [String] action (required):
  Future<Response> postBundleWithHttpInfo(String name, String action) async {
    // Verify required params are set.
    if (name == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: name');
    }
    if (action == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: action');
    }

    final path = r'/system/console/bundles/{name}'
      .replaceAll('{' + 'name' + '}', name.toString());

    Object postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

      queryParams.addAll(_convertParametersForCollectionFormat('', 'action', action));

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
  /// * [String] name (required):
  ///
  /// * [String] action (required):
  Future<void> postBundle(String name, String action) async {
    final response = await postBundleWithHttpInfo(name, action);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
  }

  /// Performs an HTTP 'POST /system/console/jmx/com.adobe.granite:type=Repository/op/{action}' operation and returns the [Response].
  /// Parameters:
  ///
  /// * [String] action (required):
  Future<Response> postJmxRepositoryWithHttpInfo(String action) async {
    // Verify required params are set.
    if (action == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: action');
    }

    final path = r'/system/console/jmx/com.adobe.granite:type=Repository/op/{action}'
      .replaceAll('{' + 'action' + '}', action.toString());

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
  /// * [String] action (required):
  Future<void> postJmxRepository(String action) async {
    final response = await postJmxRepositoryWithHttpInfo(action);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
  }

  /// Performs an HTTP 'POST /system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler' operation and returns the [Response].
  /// Parameters:
  ///
  /// * [bool] post:
  ///
  /// * [bool] apply:
  ///
  /// * [bool] delete:
  ///
  /// * [String] action:
  ///
  /// * [String] dollarLocation:
  ///
  /// * [List<String>] path:
  ///
  /// * [int] servicePeriodRanking:
  ///
  /// * [String] idpUrl:
  ///
  /// * [String] idpCertAlias:
  ///
  /// * [bool] idpHttpRedirect:
  ///
  /// * [String] serviceProviderEntityId:
  ///
  /// * [String] assertionConsumerServiceURL:
  ///
  /// * [String] spPrivateKeyAlias:
  ///
  /// * [String] keyStorePassword:
  ///
  /// * [String] defaultRedirectUrl:
  ///
  /// * [String] userIDAttribute:
  ///
  /// * [bool] useEncryption:
  ///
  /// * [bool] createUser:
  ///
  /// * [bool] addGroupMemberships:
  ///
  /// * [String] groupMembershipAttribute:
  ///
  /// * [List<String>] defaultGroups:
  ///
  /// * [String] nameIdFormat:
  ///
  /// * [List<String>] synchronizeAttributes:
  ///
  /// * [bool] handleLogout:
  ///
  /// * [String] logoutUrl:
  ///
  /// * [int] clockTolerance:
  ///
  /// * [String] digestMethod:
  ///
  /// * [String] signatureMethod:
  ///
  /// * [String] userIntermediatePath:
  ///
  /// * [List<String>] propertylist:
  Future<Response> postSamlConfigurationWithHttpInfo({ bool post, bool apply, bool delete, String action, String dollarLocation, List<String> path, int servicePeriodRanking, String idpUrl, String idpCertAlias, bool idpHttpRedirect, String serviceProviderEntityId, String assertionConsumerServiceURL, String spPrivateKeyAlias, String keyStorePassword, String defaultRedirectUrl, String userIDAttribute, bool useEncryption, bool createUser, bool addGroupMemberships, String groupMembershipAttribute, List<String> defaultGroups, String nameIdFormat, List<String> synchronizeAttributes, bool handleLogout, String logoutUrl, int clockTolerance, String digestMethod, String signatureMethod, String userIntermediatePath, List<String> propertylist }) async {
    // Verify required params are set.

    final path = r'/system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler';

    Object postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (post != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'post', post));
    }
    if (apply != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'apply', apply));
    }
    if (delete != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'delete', delete));
    }
    if (action != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'action', action));
    }
    if (dollarLocation != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', '$location', dollarLocation));
    }
    if (path != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('multi', 'path', path));
    }
    if (servicePeriodRanking != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'service.ranking', servicePeriodRanking));
    }
    if (idpUrl != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'idpUrl', idpUrl));
    }
    if (idpCertAlias != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'idpCertAlias', idpCertAlias));
    }
    if (idpHttpRedirect != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'idpHttpRedirect', idpHttpRedirect));
    }
    if (serviceProviderEntityId != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'serviceProviderEntityId', serviceProviderEntityId));
    }
    if (assertionConsumerServiceURL != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'assertionConsumerServiceURL', assertionConsumerServiceURL));
    }
    if (spPrivateKeyAlias != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'spPrivateKeyAlias', spPrivateKeyAlias));
    }
    if (keyStorePassword != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'keyStorePassword', keyStorePassword));
    }
    if (defaultRedirectUrl != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'defaultRedirectUrl', defaultRedirectUrl));
    }
    if (userIDAttribute != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'userIDAttribute', userIDAttribute));
    }
    if (useEncryption != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'useEncryption', useEncryption));
    }
    if (createUser != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'createUser', createUser));
    }
    if (addGroupMemberships != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'addGroupMemberships', addGroupMemberships));
    }
    if (groupMembershipAttribute != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'groupMembershipAttribute', groupMembershipAttribute));
    }
    if (defaultGroups != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('multi', 'defaultGroups', defaultGroups));
    }
    if (nameIdFormat != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'nameIdFormat', nameIdFormat));
    }
    if (synchronizeAttributes != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('multi', 'synchronizeAttributes', synchronizeAttributes));
    }
    if (handleLogout != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'handleLogout', handleLogout));
    }
    if (logoutUrl != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'logoutUrl', logoutUrl));
    }
    if (clockTolerance != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'clockTolerance', clockTolerance));
    }
    if (digestMethod != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'digestMethod', digestMethod));
    }
    if (signatureMethod != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'signatureMethod', signatureMethod));
    }
    if (userIntermediatePath != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'userIntermediatePath', userIntermediatePath));
    }
    if (propertylist != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('csv', 'propertylist', propertylist));
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
  /// * [bool] post:
  ///
  /// * [bool] apply:
  ///
  /// * [bool] delete:
  ///
  /// * [String] action:
  ///
  /// * [String] dollarLocation:
  ///
  /// * [List<String>] path:
  ///
  /// * [int] servicePeriodRanking:
  ///
  /// * [String] idpUrl:
  ///
  /// * [String] idpCertAlias:
  ///
  /// * [bool] idpHttpRedirect:
  ///
  /// * [String] serviceProviderEntityId:
  ///
  /// * [String] assertionConsumerServiceURL:
  ///
  /// * [String] spPrivateKeyAlias:
  ///
  /// * [String] keyStorePassword:
  ///
  /// * [String] defaultRedirectUrl:
  ///
  /// * [String] userIDAttribute:
  ///
  /// * [bool] useEncryption:
  ///
  /// * [bool] createUser:
  ///
  /// * [bool] addGroupMemberships:
  ///
  /// * [String] groupMembershipAttribute:
  ///
  /// * [List<String>] defaultGroups:
  ///
  /// * [String] nameIdFormat:
  ///
  /// * [List<String>] synchronizeAttributes:
  ///
  /// * [bool] handleLogout:
  ///
  /// * [String] logoutUrl:
  ///
  /// * [int] clockTolerance:
  ///
  /// * [String] digestMethod:
  ///
  /// * [String] signatureMethod:
  ///
  /// * [String] userIntermediatePath:
  ///
  /// * [List<String>] propertylist:
  Future<SamlConfigurationInfo> postSamlConfiguration({ bool post, bool apply, bool delete, String action, String dollarLocation, List<String> path, int servicePeriodRanking, String idpUrl, String idpCertAlias, bool idpHttpRedirect, String serviceProviderEntityId, String assertionConsumerServiceURL, String spPrivateKeyAlias, String keyStorePassword, String defaultRedirectUrl, String userIDAttribute, bool useEncryption, bool createUser, bool addGroupMemberships, String groupMembershipAttribute, List<String> defaultGroups, String nameIdFormat, List<String> synchronizeAttributes, bool handleLogout, String logoutUrl, int clockTolerance, String digestMethod, String signatureMethod, String userIntermediatePath, List<String> propertylist }) async {
    final response = await postSamlConfigurationWithHttpInfo( post: post, apply: apply, delete: delete, action: action, dollarLocation: dollarLocation, path: path, servicePeriodRanking: servicePeriodRanking, idpUrl: idpUrl, idpCertAlias: idpCertAlias, idpHttpRedirect: idpHttpRedirect, serviceProviderEntityId: serviceProviderEntityId, assertionConsumerServiceURL: assertionConsumerServiceURL, spPrivateKeyAlias: spPrivateKeyAlias, keyStorePassword: keyStorePassword, defaultRedirectUrl: defaultRedirectUrl, userIDAttribute: userIDAttribute, useEncryption: useEncryption, createUser: createUser, addGroupMemberships: addGroupMemberships, groupMembershipAttribute: groupMembershipAttribute, defaultGroups: defaultGroups, nameIdFormat: nameIdFormat, synchronizeAttributes: synchronizeAttributes, handleLogout: handleLogout, logoutUrl: logoutUrl, clockTolerance: clockTolerance, digestMethod: digestMethod, signatureMethod: signatureMethod, userIntermediatePath: userIntermediatePath, propertylist: propertylist );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body != null && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'SamlConfigurationInfo',) as SamlConfigurationInfo;
        }
    return Future<SamlConfigurationInfo>.value(null);
  }
}
