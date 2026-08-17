//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class CrxApi {
  CrxApi([ApiClient? apiClient]) : apiClient = apiClient ?? defaultApiClient;

  final ApiClient apiClient;

  /// Performs an HTTP 'GET /crx/server/crx.default/jcr:root/.1.json' operation and returns the [Response].
  Future<Response> getCrxdeStatusWithHttpInfo({ Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/crx/server/crx.default/jcr:root/.1.json';

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

  Future<String?> getCrxdeStatus({ Future<void>? abortTrigger, }) async {
    final response = await getCrxdeStatusWithHttpInfo(abortTrigger: abortTrigger,);
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

  /// Performs an HTTP 'GET /crx/packmgr/installstatus.jsp' operation and returns the [Response].
  Future<Response> getInstallStatusWithHttpInfo({ Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/crx/packmgr/installstatus.jsp';

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

  Future<InstallStatus?> getInstallStatus({ Future<void>? abortTrigger, }) async {
    final response = await getInstallStatusWithHttpInfo(abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'InstallStatus',) as InstallStatus;
    
    }
    return null;
  }

  /// Performs an HTTP 'GET /crx/packmgr/service/script.html' operation and returns the [Response].
  Future<Response> getPackageManagerServletWithHttpInfo({ Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/crx/packmgr/service/script.html';

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

  Future<void> getPackageManagerServlet({ Future<void>? abortTrigger, }) async {
    final response = await getPackageManagerServletWithHttpInfo(abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
  }

  /// Performs an HTTP 'POST /crx/packmgr/service.jsp' operation and returns the [Response].
  /// Parameters:
  ///
  /// * [String] cmd (required):
  Future<Response> postPackageServiceWithHttpInfo(String cmd, { Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/crx/packmgr/service.jsp';

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

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
  /// * [String] cmd (required):
  Future<String?> postPackageService(String cmd, { Future<void>? abortTrigger, }) async {
    final response = await postPackageServiceWithHttpInfo(cmd, abortTrigger: abortTrigger,);
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

  /// Performs an HTTP 'POST /crx/packmgr/service/.json/{path}' operation and returns the [Response].
  /// Parameters:
  ///
  /// * [String] path (required):
  ///
  /// * [String] cmd (required):
  ///
  /// * [String] groupName:
  ///
  /// * [String] packageName:
  ///
  /// * [String] packageVersion:
  ///
  /// * [String] charset:
  ///
  /// * [bool] force:
  ///
  /// * [bool] recursive:
  ///
  /// * [MultipartFile] package:
  Future<Response> postPackageServiceJsonWithHttpInfo(String path, String cmd, { String? groupName, String? packageName, String? packageVersion, String? charset, bool? force, bool? recursive, MultipartFile? package, Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/crx/packmgr/service/.json/{path}'
      .replaceAll('{path}', path);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

      queryParams.addAll(_queryParams('', 'cmd', cmd));
    if (groupName != null) {
      queryParams.addAll(_queryParams('', 'groupName', groupName));
    }
    if (packageName != null) {
      queryParams.addAll(_queryParams('', 'packageName', packageName));
    }
    if (packageVersion != null) {
      queryParams.addAll(_queryParams('', 'packageVersion', packageVersion));
    }
    if (charset != null) {
      queryParams.addAll(_queryParams('', '_charset_', charset));
    }
    if (force != null) {
      queryParams.addAll(_queryParams('', 'force', force));
    }
    if (recursive != null) {
      queryParams.addAll(_queryParams('', 'recursive', recursive));
    }

    const contentTypes = <String>['multipart/form-data'];

    bool hasFields = false;
    final mp = MultipartRequest('POST', Uri.parse(path));
    if (package != null) {
      hasFields = true;
      mp.fields[r'package'] = package.field;
      mp.files.add(package);
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
  /// * [String] cmd (required):
  ///
  /// * [String] groupName:
  ///
  /// * [String] packageName:
  ///
  /// * [String] packageVersion:
  ///
  /// * [String] charset:
  ///
  /// * [bool] force:
  ///
  /// * [bool] recursive:
  ///
  /// * [MultipartFile] package:
  Future<String?> postPackageServiceJson(String path, String cmd, { String? groupName, String? packageName, String? packageVersion, String? charset, bool? force, bool? recursive, MultipartFile? package, Future<void>? abortTrigger, }) async {
    final response = await postPackageServiceJsonWithHttpInfo(path, cmd, groupName: groupName, packageName: packageName, packageVersion: packageVersion, charset: charset, force: force, recursive: recursive, package: package, abortTrigger: abortTrigger,);
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

  /// Performs an HTTP 'POST /crx/packmgr/update.jsp' operation and returns the [Response].
  /// Parameters:
  ///
  /// * [String] groupName (required):
  ///
  /// * [String] packageName (required):
  ///
  /// * [String] version (required):
  ///
  /// * [String] path (required):
  ///
  /// * [String] filter:
  ///
  /// * [String] charset:
  Future<Response> postPackageUpdateWithHttpInfo(String groupName, String packageName, String version, String path, { String? filter, String? charset, Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/crx/packmgr/update.jsp';

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

      queryParams.addAll(_queryParams('', 'groupName', groupName));
      queryParams.addAll(_queryParams('', 'packageName', packageName));
      queryParams.addAll(_queryParams('', 'version', version));
      queryParams.addAll(_queryParams('', 'path', path));
    if (filter != null) {
      queryParams.addAll(_queryParams('', 'filter', filter));
    }
    if (charset != null) {
      queryParams.addAll(_queryParams('', '_charset_', charset));
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
  /// * [String] groupName (required):
  ///
  /// * [String] packageName (required):
  ///
  /// * [String] version (required):
  ///
  /// * [String] path (required):
  ///
  /// * [String] filter:
  ///
  /// * [String] charset:
  Future<String?> postPackageUpdate(String groupName, String packageName, String version, String path, { String? filter, String? charset, Future<void>? abortTrigger, }) async {
    final response = await postPackageUpdateWithHttpInfo(groupName, packageName, version, path, filter: filter, charset: charset, abortTrigger: abortTrigger,);
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

  /// Performs an HTTP 'POST /crx/explorer/ui/setpassword.jsp' operation and returns the [Response].
  /// Parameters:
  ///
  /// * [String] old (required):
  ///
  /// * [String] plain (required):
  ///
  /// * [String] verify (required):
  Future<Response> postSetPasswordWithHttpInfo(String old, String plain, String verify, { Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/crx/explorer/ui/setpassword.jsp';

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

      queryParams.addAll(_queryParams('', 'old', old));
      queryParams.addAll(_queryParams('', 'plain', plain));
      queryParams.addAll(_queryParams('', 'verify', verify));

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
  /// * [String] old (required):
  ///
  /// * [String] plain (required):
  ///
  /// * [String] verify (required):
  Future<String?> postSetPassword(String old, String plain, String verify, { Future<void>? abortTrigger, }) async {
    final response = await postSetPasswordWithHttpInfo(old, plain, verify, abortTrigger: abortTrigger,);
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
