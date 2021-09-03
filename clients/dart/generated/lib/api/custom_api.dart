//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.0

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class CustomApi {
  CustomApi([ApiClient apiClient]) : apiClient = apiClient ?? defaultApiClient;

  final ApiClient apiClient;

  /// Performs an HTTP 'GET /system/health' operation and returns the [Response].
  /// Parameters:
  ///
  /// * [String] tags:
  ///
  /// * [bool] combineTagsOr:
  Future<Response> getAemHealthCheckWithHttpInfo({ String tags, bool combineTagsOr }) async {
    // Verify required params are set.

    final path = r'/system/health';

    Object postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (tags != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'tags', tags));
    }
    if (combineTagsOr != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'combineTagsOr', combineTagsOr));
    }

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
  /// * [String] tags:
  ///
  /// * [bool] combineTagsOr:
  Future<String> getAemHealthCheck({ String tags, bool combineTagsOr }) async {
    final response = await getAemHealthCheckWithHttpInfo( tags: tags, combineTagsOr: combineTagsOr );
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

  /// Performs an HTTP 'POST /apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck' operation and returns the [Response].
  /// Parameters:
  ///
  /// * [List<String>] bundlesPeriodIgnored:
  ///
  /// * [String] bundlesPeriodIgnoredAtTypeHint:
  Future<Response> postConfigAemHealthCheckServletWithHttpInfo({ List<String> bundlesPeriodIgnored, String bundlesPeriodIgnoredAtTypeHint }) async {
    // Verify required params are set.

    final path = r'/apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck';

    Object postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (bundlesPeriodIgnored != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('multi', 'bundles.ignored', bundlesPeriodIgnored));
    }
    if (bundlesPeriodIgnoredAtTypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'bundles.ignored@TypeHint', bundlesPeriodIgnoredAtTypeHint));
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
  /// * [List<String>] bundlesPeriodIgnored:
  ///
  /// * [String] bundlesPeriodIgnoredAtTypeHint:
  Future<void> postConfigAemHealthCheckServlet({ List<String> bundlesPeriodIgnored, String bundlesPeriodIgnoredAtTypeHint }) async {
    final response = await postConfigAemHealthCheckServletWithHttpInfo( bundlesPeriodIgnored: bundlesPeriodIgnored, bundlesPeriodIgnoredAtTypeHint: bundlesPeriodIgnoredAtTypeHint );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
  }

  /// Performs an HTTP 'POST /apps/system/config/com.shinesolutions.aem.passwordreset.Activator' operation and returns the [Response].
  /// Parameters:
  ///
  /// * [List<String>] pwdresetPeriodAuthorizables:
  ///
  /// * [String] pwdresetPeriodAuthorizablesAtTypeHint:
  Future<Response> postConfigAemPasswordResetWithHttpInfo({ List<String> pwdresetPeriodAuthorizables, String pwdresetPeriodAuthorizablesAtTypeHint }) async {
    // Verify required params are set.

    final path = r'/apps/system/config/com.shinesolutions.aem.passwordreset.Activator';

    Object postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (pwdresetPeriodAuthorizables != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('multi', 'pwdreset.authorizables', pwdresetPeriodAuthorizables));
    }
    if (pwdresetPeriodAuthorizablesAtTypeHint != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'pwdreset.authorizables@TypeHint', pwdresetPeriodAuthorizablesAtTypeHint));
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
  /// * [List<String>] pwdresetPeriodAuthorizables:
  ///
  /// * [String] pwdresetPeriodAuthorizablesAtTypeHint:
  Future<void> postConfigAemPasswordReset({ List<String> pwdresetPeriodAuthorizables, String pwdresetPeriodAuthorizablesAtTypeHint }) async {
    final response = await postConfigAemPasswordResetWithHttpInfo( pwdresetPeriodAuthorizables: pwdresetPeriodAuthorizables, pwdresetPeriodAuthorizablesAtTypeHint: pwdresetPeriodAuthorizablesAtTypeHint );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
  }
}
