//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class ConsoleApi {
  ConsoleApi([ApiClient? apiClient]) : apiClient = apiClient ?? defaultApiClient;

  final ApiClient apiClient;

  /// Performs an HTTP 'GET /system/console/status-productinfo.json' operation and returns the [Response].
  Future<Response> getAemProductInfoWithHttpInfo({ Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/system/console/status-productinfo.json';

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

  Future<List<String>?> getAemProductInfo({ Future<void>? abortTrigger, }) async {
    final response = await getAemProductInfoWithHttpInfo(abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      final responseBody = await _decodeBodyBytes(response);
      return (await apiClient.deserializeAsync(responseBody, 'List<String>') as List)
        .cast<String>()
        .toList(growable: false);

    }
    return null;
  }

  /// Performs an HTTP 'GET /system/console/bundles/{name}.json' operation and returns the [Response].
  /// Parameters:
  ///
  /// * [String] name (required):
  Future<Response> getBundleInfoWithHttpInfo(String name, { Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/system/console/bundles/{name}.json'
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
  /// * [String] name (required):
  Future<BundleInfo?> getBundleInfo(String name, { Future<void>? abortTrigger, }) async {
    final response = await getBundleInfoWithHttpInfo(name, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'BundleInfo',) as BundleInfo;
    
    }
    return null;
  }

  /// Performs an HTTP 'GET /system/console/configMgr' operation and returns the [Response].
  Future<Response> getConfigMgrWithHttpInfo({ Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/system/console/configMgr';

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

  Future<String?> getConfigMgr({ Future<void>? abortTrigger, }) async {
    final response = await getConfigMgrWithHttpInfo(abortTrigger: abortTrigger,);
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

  /// Performs an HTTP 'POST /system/console/bundles/{name}' operation and returns the [Response].
  /// Parameters:
  ///
  /// * [String] name (required):
  ///
  /// * [String] action (required):
  Future<Response> postBundleWithHttpInfo(String name, String action, { Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/system/console/bundles/{name}'
      .replaceAll('{name}', name);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

      queryParams.addAll(_queryParams('', 'action', action));

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
  /// * [String] name (required):
  ///
  /// * [String] action (required):
  Future<void> postBundle(String name, String action, { Future<void>? abortTrigger, }) async {
    final response = await postBundleWithHttpInfo(name, action, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
  }

  /// Performs an HTTP 'POST /system/console/jmx/com.adobe.granite:type=Repository/op/{action}' operation and returns the [Response].
  /// Parameters:
  ///
  /// * [String] action (required):
  Future<Response> postJmxRepositoryWithHttpInfo(String action, { Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/system/console/jmx/com.adobe.granite:type=Repository/op/{action}'
      .replaceAll('{action}', action);

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
  /// * [String] action (required):
  Future<void> postJmxRepository(String action, { Future<void>? abortTrigger, }) async {
    final response = await postJmxRepositoryWithHttpInfo(action, abortTrigger: abortTrigger,);
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
  Future<Response> postSamlConfigurationWithHttpInfo({ bool? post, bool? apply, bool? delete, String? action, String? dollarLocation, List<String>? path, int? servicePeriodRanking, String? idpUrl, String? idpCertAlias, bool? idpHttpRedirect, String? serviceProviderEntityId, String? assertionConsumerServiceURL, String? spPrivateKeyAlias, String? keyStorePassword, String? defaultRedirectUrl, String? userIDAttribute, bool? useEncryption, bool? createUser, bool? addGroupMemberships, String? groupMembershipAttribute, List<String>? defaultGroups, String? nameIdFormat, List<String>? synchronizeAttributes, bool? handleLogout, String? logoutUrl, int? clockTolerance, String? digestMethod, String? signatureMethod, String? userIntermediatePath, List<String>? propertylist, Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler';

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (post != null) {
      queryParams.addAll(_queryParams('', 'post', post));
    }
    if (apply != null) {
      queryParams.addAll(_queryParams('', 'apply', apply));
    }
    if (delete != null) {
      queryParams.addAll(_queryParams('', 'delete', delete));
    }
    if (action != null) {
      queryParams.addAll(_queryParams('', 'action', action));
    }
    if (dollarLocation != null) {
      queryParams.addAll(_queryParams('', '$location', dollarLocation));
    }
    if (path != null) {
      queryParams.addAll(_queryParams('multi', 'path', path));
    }
    if (servicePeriodRanking != null) {
      queryParams.addAll(_queryParams('', 'service.ranking', servicePeriodRanking));
    }
    if (idpUrl != null) {
      queryParams.addAll(_queryParams('', 'idpUrl', idpUrl));
    }
    if (idpCertAlias != null) {
      queryParams.addAll(_queryParams('', 'idpCertAlias', idpCertAlias));
    }
    if (idpHttpRedirect != null) {
      queryParams.addAll(_queryParams('', 'idpHttpRedirect', idpHttpRedirect));
    }
    if (serviceProviderEntityId != null) {
      queryParams.addAll(_queryParams('', 'serviceProviderEntityId', serviceProviderEntityId));
    }
    if (assertionConsumerServiceURL != null) {
      queryParams.addAll(_queryParams('', 'assertionConsumerServiceURL', assertionConsumerServiceURL));
    }
    if (spPrivateKeyAlias != null) {
      queryParams.addAll(_queryParams('', 'spPrivateKeyAlias', spPrivateKeyAlias));
    }
    if (keyStorePassword != null) {
      queryParams.addAll(_queryParams('', 'keyStorePassword', keyStorePassword));
    }
    if (defaultRedirectUrl != null) {
      queryParams.addAll(_queryParams('', 'defaultRedirectUrl', defaultRedirectUrl));
    }
    if (userIDAttribute != null) {
      queryParams.addAll(_queryParams('', 'userIDAttribute', userIDAttribute));
    }
    if (useEncryption != null) {
      queryParams.addAll(_queryParams('', 'useEncryption', useEncryption));
    }
    if (createUser != null) {
      queryParams.addAll(_queryParams('', 'createUser', createUser));
    }
    if (addGroupMemberships != null) {
      queryParams.addAll(_queryParams('', 'addGroupMemberships', addGroupMemberships));
    }
    if (groupMembershipAttribute != null) {
      queryParams.addAll(_queryParams('', 'groupMembershipAttribute', groupMembershipAttribute));
    }
    if (defaultGroups != null) {
      queryParams.addAll(_queryParams('multi', 'defaultGroups', defaultGroups));
    }
    if (nameIdFormat != null) {
      queryParams.addAll(_queryParams('', 'nameIdFormat', nameIdFormat));
    }
    if (synchronizeAttributes != null) {
      queryParams.addAll(_queryParams('multi', 'synchronizeAttributes', synchronizeAttributes));
    }
    if (handleLogout != null) {
      queryParams.addAll(_queryParams('', 'handleLogout', handleLogout));
    }
    if (logoutUrl != null) {
      queryParams.addAll(_queryParams('', 'logoutUrl', logoutUrl));
    }
    if (clockTolerance != null) {
      queryParams.addAll(_queryParams('', 'clockTolerance', clockTolerance));
    }
    if (digestMethod != null) {
      queryParams.addAll(_queryParams('', 'digestMethod', digestMethod));
    }
    if (signatureMethod != null) {
      queryParams.addAll(_queryParams('', 'signatureMethod', signatureMethod));
    }
    if (userIntermediatePath != null) {
      queryParams.addAll(_queryParams('', 'userIntermediatePath', userIntermediatePath));
    }
    if (propertylist != null) {
      queryParams.addAll(_queryParams('csv', 'propertylist', propertylist));
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
  Future<SamlConfigurationInfo?> postSamlConfiguration({ bool? post, bool? apply, bool? delete, String? action, String? dollarLocation, List<String>? path, int? servicePeriodRanking, String? idpUrl, String? idpCertAlias, bool? idpHttpRedirect, String? serviceProviderEntityId, String? assertionConsumerServiceURL, String? spPrivateKeyAlias, String? keyStorePassword, String? defaultRedirectUrl, String? userIDAttribute, bool? useEncryption, bool? createUser, bool? addGroupMemberships, String? groupMembershipAttribute, List<String>? defaultGroups, String? nameIdFormat, List<String>? synchronizeAttributes, bool? handleLogout, String? logoutUrl, int? clockTolerance, String? digestMethod, String? signatureMethod, String? userIntermediatePath, List<String>? propertylist, Future<void>? abortTrigger, }) async {
    final response = await postSamlConfigurationWithHttpInfo(post: post, apply: apply, delete: delete, action: action, dollarLocation: dollarLocation, path: path, servicePeriodRanking: servicePeriodRanking, idpUrl: idpUrl, idpCertAlias: idpCertAlias, idpHttpRedirect: idpHttpRedirect, serviceProviderEntityId: serviceProviderEntityId, assertionConsumerServiceURL: assertionConsumerServiceURL, spPrivateKeyAlias: spPrivateKeyAlias, keyStorePassword: keyStorePassword, defaultRedirectUrl: defaultRedirectUrl, userIDAttribute: userIDAttribute, useEncryption: useEncryption, createUser: createUser, addGroupMemberships: addGroupMemberships, groupMembershipAttribute: groupMembershipAttribute, defaultGroups: defaultGroups, nameIdFormat: nameIdFormat, synchronizeAttributes: synchronizeAttributes, handleLogout: handleLogout, logoutUrl: logoutUrl, clockTolerance: clockTolerance, digestMethod: digestMethod, signatureMethod: signatureMethod, userIntermediatePath: userIntermediatePath, propertylist: propertylist, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'SamlConfigurationInfo',) as SamlConfigurationInfo;
    
    }
    return null;
  }
}
