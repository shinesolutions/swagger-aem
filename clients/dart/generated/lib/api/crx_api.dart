//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.0

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class CrxApi {
  CrxApi([ApiClient apiClient]) : apiClient = apiClient ?? defaultApiClient;

  final ApiClient apiClient;

  /// Performs an HTTP 'GET /crx/server/crx.default/jcr:root/.1.json' operation and returns the [Response].
  Future<Response> getCrxdeStatusWithHttpInfo() async {
    final path = r'/crx/server/crx.default/jcr:root/.1.json';

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

  Future<String> getCrxdeStatus() async {
    final response = await getCrxdeStatusWithHttpInfo();
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

  /// Performs an HTTP 'GET /crx/packmgr/installstatus.jsp' operation and returns the [Response].
  Future<Response> getInstallStatusWithHttpInfo() async {
    final path = r'/crx/packmgr/installstatus.jsp';

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

  Future<InstallStatus> getInstallStatus() async {
    final response = await getInstallStatusWithHttpInfo();
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body != null && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'InstallStatus',) as InstallStatus;
        }
    return Future<InstallStatus>.value(null);
  }

  /// Performs an HTTP 'GET /crx/packmgr/service/script.html' operation and returns the [Response].
  Future<Response> getPackageManagerServletWithHttpInfo() async {
    final path = r'/crx/packmgr/service/script.html';

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

  Future<void> getPackageManagerServlet() async {
    final response = await getPackageManagerServletWithHttpInfo();
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
  }

  /// Performs an HTTP 'POST /crx/packmgr/service.jsp' operation and returns the [Response].
  /// Parameters:
  ///
  /// * [String] cmd (required):
  Future<Response> postPackageServiceWithHttpInfo(String cmd) async {
    // Verify required params are set.
    if (cmd == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: cmd');
    }

    final path = r'/crx/packmgr/service.jsp';

    Object postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

      queryParams.addAll(_convertParametersForCollectionFormat('', 'cmd', cmd));

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
  /// * [String] cmd (required):
  Future<String> postPackageService(String cmd) async {
    final response = await postPackageServiceWithHttpInfo(cmd);
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
  Future<Response> postPackageServiceJsonWithHttpInfo(String path, String cmd, { String groupName, String packageName, String packageVersion, String charset, bool force, bool recursive, MultipartFile package }) async {
    // Verify required params are set.
    if (path == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: path');
    }
    if (cmd == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: cmd');
    }

    final path = r'/crx/packmgr/service/.json/{path}'
      .replaceAll('{' + 'path' + '}', path.toString());

    Object postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

      queryParams.addAll(_convertParametersForCollectionFormat('', 'cmd', cmd));
    if (groupName != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'groupName', groupName));
    }
    if (packageName != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'packageName', packageName));
    }
    if (packageVersion != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'packageVersion', packageVersion));
    }
    if (charset != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', '_charset_', charset));
    }
    if (force != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'force', force));
    }
    if (recursive != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'recursive', recursive));
    }

    final contentTypes = <String>['multipart/form-data'];
    final nullableContentType = contentTypes.isNotEmpty ? contentTypes[0] : null;
    final authNames = <String>['aemAuth'];

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
  Future<String> postPackageServiceJson(String path, String cmd, { String groupName, String packageName, String packageVersion, String charset, bool force, bool recursive, MultipartFile package }) async {
    final response = await postPackageServiceJsonWithHttpInfo(path, cmd,  groupName: groupName, packageName: packageName, packageVersion: packageVersion, charset: charset, force: force, recursive: recursive, package: package );
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
  Future<Response> postPackageUpdateWithHttpInfo(String groupName, String packageName, String version, String path, { String filter, String charset }) async {
    // Verify required params are set.
    if (groupName == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: groupName');
    }
    if (packageName == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: packageName');
    }
    if (version == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: version');
    }
    if (path == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: path');
    }

    final path = r'/crx/packmgr/update.jsp';

    Object postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

      queryParams.addAll(_convertParametersForCollectionFormat('', 'groupName', groupName));
      queryParams.addAll(_convertParametersForCollectionFormat('', 'packageName', packageName));
      queryParams.addAll(_convertParametersForCollectionFormat('', 'version', version));
      queryParams.addAll(_convertParametersForCollectionFormat('', 'path', path));
    if (filter != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', 'filter', filter));
    }
    if (charset != null) {
      queryParams.addAll(_convertParametersForCollectionFormat('', '_charset_', charset));
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
  Future<String> postPackageUpdate(String groupName, String packageName, String version, String path, { String filter, String charset }) async {
    final response = await postPackageUpdateWithHttpInfo(groupName, packageName, version, path,  filter: filter, charset: charset );
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

  /// Performs an HTTP 'POST /crx/explorer/ui/setpassword.jsp' operation and returns the [Response].
  /// Parameters:
  ///
  /// * [String] old (required):
  ///
  /// * [String] plain (required):
  ///
  /// * [String] verify (required):
  Future<Response> postSetPasswordWithHttpInfo(String old, String plain, String verify) async {
    // Verify required params are set.
    if (old == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: old');
    }
    if (plain == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: plain');
    }
    if (verify == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: verify');
    }

    final path = r'/crx/explorer/ui/setpassword.jsp';

    Object postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

      queryParams.addAll(_convertParametersForCollectionFormat('', 'old', old));
      queryParams.addAll(_convertParametersForCollectionFormat('', 'plain', plain));
      queryParams.addAll(_convertParametersForCollectionFormat('', 'verify', verify));

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
  /// * [String] old (required):
  ///
  /// * [String] plain (required):
  ///
  /// * [String] verify (required):
  Future<String> postSetPassword(String old, String plain, String verify) async {
    final response = await postSetPasswordWithHttpInfo(old, plain, verify);
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
