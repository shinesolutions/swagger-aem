//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.0

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class CqApi {
  CqApi([ApiClient apiClient]) : apiClient = apiClient ?? defaultApiClient;

  final ApiClient apiClient;

  /// Performs an HTTP 'GET /libs/granite/core/content/login.html' operation and returns the [Response].
  Future<Response> getLoginPageWithHttpInfo() async {
    final path = r'/libs/granite/core/content/login.html';

    Object postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    final contentTypes = <String>[];
    final nullableContentType = contentTypes.isNotEmpty ? contentTypes[0] : null;
    final authNames = <String>[];


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

  Future<String> getLoginPage() async {
    final response = await getLoginPageWithHttpInfo();
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

  /// Performs an HTTP 'POST /.cqactions.html' operation and returns the [Response].
  /// Parameters:
  ///
  /// * [String] authorizableId (required):
  ///
  /// * [String] changelog (required):
  Future<Response> postCqActionsWithHttpInfo(String authorizableId, String changelog) async {
    // Verify required params are set.
    if (authorizableId == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: authorizableId');
    }
    if (changelog == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: changelog');
    }

    final path = r'/.cqactions.html';

    Object postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

      queryParams.addAll(_convertParametersForCollectionFormat('', 'authorizableId', authorizableId));
      queryParams.addAll(_convertParametersForCollectionFormat('', 'changelog', changelog));

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
  /// * [String] changelog (required):
  Future<void> postCqActions(String authorizableId, String changelog) async {
    final response = await postCqActionsWithHttpInfo(authorizableId, changelog);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
  }
}
