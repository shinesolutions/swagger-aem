//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

import 'dart:async';

import 'package:built_value/json_object.dart';
import 'package:built_value/serializer.dart';
import 'package:dio/dio.dart';

import 'package:openapi/src/api_util.dart';

class GraniteApi {

  final Dio _dio;

  final Serializers _serializers;

  const GraniteApi(this._dio, this._serializers);

  /// sslSetup
  /// 
  ///
  /// Parameters:
  /// * [keystorePassword] 
  /// * [keystorePasswordConfirm] 
  /// * [truststorePassword] 
  /// * [truststorePasswordConfirm] 
  /// * [httpsHostname] 
  /// * [httpsPort] 
  /// * [privatekeyFile] 
  /// * [certificateFile] 
  /// * [cancelToken] - A [CancelToken] that can be used to cancel the operation
  /// * [headers] - Can be used to add additional headers to the request
  /// * [extras] - Can be used to add flags to the request
  /// * [validateStatus] - A [ValidateStatus] callback that can be used to determine request success based on the HTTP status of the response
  /// * [onSendProgress] - A [ProgressCallback] that can be used to get the send progress
  /// * [onReceiveProgress] - A [ProgressCallback] that can be used to get the receive progress
  ///
  /// Returns a [Future] containing a [Response] with a [String] as data
  /// Throws [DioException] if API call or serialization fails
  Future<Response<String>> sslSetup({ 
    required String keystorePassword,
    required String keystorePasswordConfirm,
    required String truststorePassword,
    required String truststorePasswordConfirm,
    required String httpsHostname,
    required String httpsPort,
    MultipartFile? privatekeyFile,
    MultipartFile? certificateFile,
    CancelToken? cancelToken,
    Map<String, dynamic>? headers,
    Map<String, dynamic>? extra,
    ValidateStatus? validateStatus,
    ProgressCallback? onSendProgress,
    ProgressCallback? onReceiveProgress,
  }) async {
    final _path = r'/libs/granite/security/post/sslSetup.html';
    final _options = Options(
      method: r'POST',
      headers: <String, dynamic>{
        ...?headers,
      },
      extra: <String, dynamic>{
        'secure': <Map<String, String>>[
          {
            'type': 'http',
            'scheme': 'basic',
            'name': 'aemAuth',
          },
        ],
        ...?extra,
      },
      contentType: 'multipart/form-data',
      validateStatus: validateStatus,
    );

    final _queryParameters = <String, dynamic>{
      r'keystorePassword': encodeQueryParameter(_serializers, keystorePassword, const FullType(String)),
      r'keystorePasswordConfirm': encodeQueryParameter(_serializers, keystorePasswordConfirm, const FullType(String)),
      r'truststorePassword': encodeQueryParameter(_serializers, truststorePassword, const FullType(String)),
      r'truststorePasswordConfirm': encodeQueryParameter(_serializers, truststorePasswordConfirm, const FullType(String)),
      r'httpsHostname': encodeQueryParameter(_serializers, httpsHostname, const FullType(String)),
      r'httpsPort': encodeQueryParameter(_serializers, httpsPort, const FullType(String)),
    };

    dynamic _bodyData;

    try {
      _bodyData = FormData.fromMap(<String, dynamic>{
        if (privatekeyFile != null) r'privatekeyFile': privatekeyFile,
        if (certificateFile != null) r'certificateFile': certificateFile,
      });

    } catch(error, stackTrace) {
      throw DioException(
         requestOptions: _options.compose(
          _dio.options,
          _path,
          queryParameters: _queryParameters,
        ),
        type: DioExceptionType.unknown,
        error: error,
        stackTrace: stackTrace,
      );
    }

    final _response = await _dio.request<Object>(
      _path,
      data: _bodyData,
      options: _options,
      queryParameters: _queryParameters,
      cancelToken: cancelToken,
      onSendProgress: onSendProgress,
      onReceiveProgress: onReceiveProgress,
    );

    String? _responseData;

    try {
      final rawResponse = _response.data;
      _responseData = rawResponse == null ? null : rawResponse as String;

    } catch (error, stackTrace) {
      throw DioException(
        requestOptions: _response.requestOptions,
        response: _response,
        type: DioExceptionType.unknown,
        error: error,
        stackTrace: stackTrace,
      );
    }

    return Response<String>(
      data: _responseData,
      headers: _response.headers,
      isRedirect: _response.isRedirect,
      requestOptions: _response.requestOptions,
      redirects: _response.redirects,
      statusCode: _response.statusCode,
      statusMessage: _response.statusMessage,
      extra: _response.extra,
    );
  }

}
