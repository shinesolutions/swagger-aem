//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class CustomApi {
  CustomApi([ApiClient? apiClient]) : apiClient = apiClient ?? defaultApiClient;

  final ApiClient apiClient;

  /// Performs an HTTP 'GET /system/health' operation and returns the [Response].
  /// Parameters:
  ///
  /// * [String] tags:
  ///
  /// * [bool] combineTagsOr:
  Future<Response> getAemHealthCheckWithHttpInfo({ String? tags, bool? combineTagsOr, Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/system/health';

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (tags != null) {
      queryParams.addAll(_queryParams('', 'tags', tags));
    }
    if (combineTagsOr != null) {
      queryParams.addAll(_queryParams('', 'combineTagsOr', combineTagsOr));
    }

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
  /// * [String] tags:
  ///
  /// * [bool] combineTagsOr:
  Future<String?> getAemHealthCheck({ String? tags, bool? combineTagsOr, Future<void>? abortTrigger, }) async {
    final response = await getAemHealthCheckWithHttpInfo(tags: tags, combineTagsOr: combineTagsOr, abortTrigger: abortTrigger,);
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

  /// Performs an HTTP 'POST /apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck' operation and returns the [Response].
  /// Parameters:
  ///
  /// * [List<String>] bundlesPeriodIgnored:
  ///
  /// * [String] bundlesPeriodIgnoredAtTypeHint:
  Future<Response> postConfigAemHealthCheckServletWithHttpInfo({ List<String>? bundlesPeriodIgnored, String? bundlesPeriodIgnoredAtTypeHint, Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck';

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (bundlesPeriodIgnored != null) {
      queryParams.addAll(_queryParams('multi', 'bundles.ignored', bundlesPeriodIgnored));
    }
    if (bundlesPeriodIgnoredAtTypeHint != null) {
      queryParams.addAll(_queryParams('', 'bundles.ignored@TypeHint', bundlesPeriodIgnoredAtTypeHint));
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
  /// * [List<String>] bundlesPeriodIgnored:
  ///
  /// * [String] bundlesPeriodIgnoredAtTypeHint:
  Future<void> postConfigAemHealthCheckServlet({ List<String>? bundlesPeriodIgnored, String? bundlesPeriodIgnoredAtTypeHint, Future<void>? abortTrigger, }) async {
    final response = await postConfigAemHealthCheckServletWithHttpInfo(bundlesPeriodIgnored: bundlesPeriodIgnored, bundlesPeriodIgnoredAtTypeHint: bundlesPeriodIgnoredAtTypeHint, abortTrigger: abortTrigger,);
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
  Future<Response> postConfigAemPasswordResetWithHttpInfo({ List<String>? pwdresetPeriodAuthorizables, String? pwdresetPeriodAuthorizablesAtTypeHint, Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/apps/system/config/com.shinesolutions.aem.passwordreset.Activator';

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (pwdresetPeriodAuthorizables != null) {
      queryParams.addAll(_queryParams('multi', 'pwdreset.authorizables', pwdresetPeriodAuthorizables));
    }
    if (pwdresetPeriodAuthorizablesAtTypeHint != null) {
      queryParams.addAll(_queryParams('', 'pwdreset.authorizables@TypeHint', pwdresetPeriodAuthorizablesAtTypeHint));
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
  /// * [List<String>] pwdresetPeriodAuthorizables:
  ///
  /// * [String] pwdresetPeriodAuthorizablesAtTypeHint:
  Future<void> postConfigAemPasswordReset({ List<String>? pwdresetPeriodAuthorizables, String? pwdresetPeriodAuthorizablesAtTypeHint, Future<void>? abortTrigger, }) async {
    final response = await postConfigAemPasswordResetWithHttpInfo(pwdresetPeriodAuthorizables: pwdresetPeriodAuthorizables, pwdresetPeriodAuthorizablesAtTypeHint: pwdresetPeriodAuthorizablesAtTypeHint, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
  }
}
