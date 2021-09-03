//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.0

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class GraniteApi {
  GraniteApi([ApiClient apiClient]) : apiClient = apiClient ?? defaultApiClient;

  final ApiClient apiClient;

  /// Performs an HTTP 'POST /libs/granite/security/post/sslSetup.html' operation and returns the [Response].
  /// Parameters:
  ///
  /// * [String] keystorePassword (required):
  ///
  /// * [String] keystorePasswordConfirm (required):
  ///
  /// * [String] truststorePassword (required):
  ///
  /// * [String] truststorePasswordConfirm (required):
  ///
  /// * [String] httpsHostname (required):
  ///
  /// * [String] httpsPort (required):
  ///
  /// * [MultipartFile] privatekeyFile:
  ///
  /// * [MultipartFile] certificateFile:
  Future<Response> sslSetupWithHttpInfo(String keystorePassword, String keystorePasswordConfirm, String truststorePassword, String truststorePasswordConfirm, String httpsHostname, String httpsPort, { MultipartFile privatekeyFile, MultipartFile certificateFile }) async {
    // Verify required params are set.
    if (keystorePassword == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: keystorePassword');
    }
    if (keystorePasswordConfirm == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: keystorePasswordConfirm');
    }
    if (truststorePassword == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: truststorePassword');
    }
    if (truststorePasswordConfirm == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: truststorePasswordConfirm');
    }
    if (httpsHostname == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: httpsHostname');
    }
    if (httpsPort == null) {
     throw ApiException(HttpStatus.badRequest, 'Missing required param: httpsPort');
    }

    final path = r'/libs/granite/security/post/sslSetup.html';

    Object postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

      queryParams.addAll(_convertParametersForCollectionFormat('', 'keystorePassword', keystorePassword));
      queryParams.addAll(_convertParametersForCollectionFormat('', 'keystorePasswordConfirm', keystorePasswordConfirm));
      queryParams.addAll(_convertParametersForCollectionFormat('', 'truststorePassword', truststorePassword));
      queryParams.addAll(_convertParametersForCollectionFormat('', 'truststorePasswordConfirm', truststorePasswordConfirm));
      queryParams.addAll(_convertParametersForCollectionFormat('', 'httpsHostname', httpsHostname));
      queryParams.addAll(_convertParametersForCollectionFormat('', 'httpsPort', httpsPort));

    final contentTypes = <String>['multipart/form-data'];
    final nullableContentType = contentTypes.isNotEmpty ? contentTypes[0] : null;
    final authNames = <String>['aemAuth'];

    bool hasFields = false;
    final mp = MultipartRequest('POST', Uri.parse(path));
    if (privatekeyFile != null) {
      hasFields = true;
      mp.fields[r'privatekeyFile'] = privatekeyFile.field;
      mp.files.add(privatekeyFile);
    }
    if (certificateFile != null) {
      hasFields = true;
      mp.fields[r'certificateFile'] = certificateFile.field;
      mp.files.add(certificateFile);
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
  /// * [String] keystorePassword (required):
  ///
  /// * [String] keystorePasswordConfirm (required):
  ///
  /// * [String] truststorePassword (required):
  ///
  /// * [String] truststorePasswordConfirm (required):
  ///
  /// * [String] httpsHostname (required):
  ///
  /// * [String] httpsPort (required):
  ///
  /// * [MultipartFile] privatekeyFile:
  ///
  /// * [MultipartFile] certificateFile:
  Future<String> sslSetup(String keystorePassword, String keystorePasswordConfirm, String truststorePassword, String truststorePasswordConfirm, String httpsHostname, String httpsPort, { MultipartFile privatekeyFile, MultipartFile certificateFile }) async {
    final response = await sslSetupWithHttpInfo(keystorePassword, keystorePasswordConfirm, truststorePassword, truststorePasswordConfirm, httpsHostname, httpsPort,  privatekeyFile: privatekeyFile, certificateFile: certificateFile );
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
