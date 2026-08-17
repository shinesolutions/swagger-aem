//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

import 'dart:async';

import 'package:built_value/json_object.dart';
import 'package:built_value/serializer.dart';
import 'package:dio/dio.dart';

import 'dart:typed_data';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/api_util.dart';
import 'package:openapi/src/model/keystore_info.dart';
import 'package:openapi/src/model/truststore_info.dart';

class SlingApi {

  final Dio _dio;

  final Serializers _serializers;

  const SlingApi(this._dio, this._serializers);

  /// deleteAgent
  /// 
  ///
  /// Parameters:
  /// * [runmode] 
  /// * [name] 
  /// * [cancelToken] - A [CancelToken] that can be used to cancel the operation
  /// * [headers] - Can be used to add additional headers to the request
  /// * [extras] - Can be used to add flags to the request
  /// * [validateStatus] - A [ValidateStatus] callback that can be used to determine request success based on the HTTP status of the response
  /// * [onSendProgress] - A [ProgressCallback] that can be used to get the send progress
  /// * [onReceiveProgress] - A [ProgressCallback] that can be used to get the receive progress
  ///
  /// Returns a [Future]
  /// Throws [DioException] if API call or serialization fails
  Future<Response<void>> deleteAgent({ 
    required String runmode,
    required String name,
    CancelToken? cancelToken,
    Map<String, dynamic>? headers,
    Map<String, dynamic>? extra,
    ValidateStatus? validateStatus,
    ProgressCallback? onSendProgress,
    ProgressCallback? onReceiveProgress,
  }) async {
    final _path = r'/etc/replication/agents.{runmode}/{name}'.replaceAll('{' r'runmode' '}', encodeQueryParameter(_serializers, runmode, const FullType(String)).toString()).replaceAll('{' r'name' '}', encodeQueryParameter(_serializers, name, const FullType(String)).toString());
    final _options = Options(
      method: r'DELETE',
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
      validateStatus: validateStatus,
    );

    final _response = await _dio.request<Object>(
      _path,
      options: _options,
      cancelToken: cancelToken,
      onSendProgress: onSendProgress,
      onReceiveProgress: onReceiveProgress,
    );

    return _response;
  }

  /// deleteNode
  /// 
  ///
  /// Parameters:
  /// * [path] 
  /// * [name] 
  /// * [cancelToken] - A [CancelToken] that can be used to cancel the operation
  /// * [headers] - Can be used to add additional headers to the request
  /// * [extras] - Can be used to add flags to the request
  /// * [validateStatus] - A [ValidateStatus] callback that can be used to determine request success based on the HTTP status of the response
  /// * [onSendProgress] - A [ProgressCallback] that can be used to get the send progress
  /// * [onReceiveProgress] - A [ProgressCallback] that can be used to get the receive progress
  ///
  /// Returns a [Future]
  /// Throws [DioException] if API call or serialization fails
  Future<Response<void>> deleteNode({ 
    required String path,
    required String name,
    CancelToken? cancelToken,
    Map<String, dynamic>? headers,
    Map<String, dynamic>? extra,
    ValidateStatus? validateStatus,
    ProgressCallback? onSendProgress,
    ProgressCallback? onReceiveProgress,
  }) async {
    final _path = r'/{path}/{name}'.replaceAll('{' r'path' '}', encodeQueryParameter(_serializers, path, const FullType(String)).toString()).replaceAll('{' r'name' '}', encodeQueryParameter(_serializers, name, const FullType(String)).toString());
    final _options = Options(
      method: r'DELETE',
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
      validateStatus: validateStatus,
    );

    final _response = await _dio.request<Object>(
      _path,
      options: _options,
      cancelToken: cancelToken,
      onSendProgress: onSendProgress,
      onReceiveProgress: onReceiveProgress,
    );

    return _response;
  }

  /// getAgent
  /// 
  ///
  /// Parameters:
  /// * [runmode] 
  /// * [name] 
  /// * [cancelToken] - A [CancelToken] that can be used to cancel the operation
  /// * [headers] - Can be used to add additional headers to the request
  /// * [extras] - Can be used to add flags to the request
  /// * [validateStatus] - A [ValidateStatus] callback that can be used to determine request success based on the HTTP status of the response
  /// * [onSendProgress] - A [ProgressCallback] that can be used to get the send progress
  /// * [onReceiveProgress] - A [ProgressCallback] that can be used to get the receive progress
  ///
  /// Returns a [Future]
  /// Throws [DioException] if API call or serialization fails
  Future<Response<void>> getAgent({ 
    required String runmode,
    required String name,
    CancelToken? cancelToken,
    Map<String, dynamic>? headers,
    Map<String, dynamic>? extra,
    ValidateStatus? validateStatus,
    ProgressCallback? onSendProgress,
    ProgressCallback? onReceiveProgress,
  }) async {
    final _path = r'/etc/replication/agents.{runmode}/{name}'.replaceAll('{' r'runmode' '}', encodeQueryParameter(_serializers, runmode, const FullType(String)).toString()).replaceAll('{' r'name' '}', encodeQueryParameter(_serializers, name, const FullType(String)).toString());
    final _options = Options(
      method: r'GET',
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
      validateStatus: validateStatus,
    );

    final _response = await _dio.request<Object>(
      _path,
      options: _options,
      cancelToken: cancelToken,
      onSendProgress: onSendProgress,
      onReceiveProgress: onReceiveProgress,
    );

    return _response;
  }

  /// getAgents
  /// 
  ///
  /// Parameters:
  /// * [runmode] 
  /// * [cancelToken] - A [CancelToken] that can be used to cancel the operation
  /// * [headers] - Can be used to add additional headers to the request
  /// * [extras] - Can be used to add flags to the request
  /// * [validateStatus] - A [ValidateStatus] callback that can be used to determine request success based on the HTTP status of the response
  /// * [onSendProgress] - A [ProgressCallback] that can be used to get the send progress
  /// * [onReceiveProgress] - A [ProgressCallback] that can be used to get the receive progress
  ///
  /// Returns a [Future] containing a [Response] with a [String] as data
  /// Throws [DioException] if API call or serialization fails
  Future<Response<String>> getAgents({ 
    required String runmode,
    CancelToken? cancelToken,
    Map<String, dynamic>? headers,
    Map<String, dynamic>? extra,
    ValidateStatus? validateStatus,
    ProgressCallback? onSendProgress,
    ProgressCallback? onReceiveProgress,
  }) async {
    final _path = r'/etc/replication/agents.{runmode}.-1.json'.replaceAll('{' r'runmode' '}', encodeQueryParameter(_serializers, runmode, const FullType(String)).toString());
    final _options = Options(
      method: r'GET',
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
      validateStatus: validateStatus,
    );

    final _response = await _dio.request<Object>(
      _path,
      options: _options,
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

  /// getAuthorizableKeystore
  /// 
  ///
  /// Parameters:
  /// * [intermediatePath] 
  /// * [authorizableId] 
  /// * [cancelToken] - A [CancelToken] that can be used to cancel the operation
  /// * [headers] - Can be used to add additional headers to the request
  /// * [extras] - Can be used to add flags to the request
  /// * [validateStatus] - A [ValidateStatus] callback that can be used to determine request success based on the HTTP status of the response
  /// * [onSendProgress] - A [ProgressCallback] that can be used to get the send progress
  /// * [onReceiveProgress] - A [ProgressCallback] that can be used to get the receive progress
  ///
  /// Returns a [Future] containing a [Response] with a [KeystoreInfo] as data
  /// Throws [DioException] if API call or serialization fails
  Future<Response<KeystoreInfo>> getAuthorizableKeystore({ 
    required String intermediatePath,
    required String authorizableId,
    CancelToken? cancelToken,
    Map<String, dynamic>? headers,
    Map<String, dynamic>? extra,
    ValidateStatus? validateStatus,
    ProgressCallback? onSendProgress,
    ProgressCallback? onReceiveProgress,
  }) async {
    final _path = r'/{intermediatePath}/{authorizableId}.ks.json'.replaceAll('{' r'intermediatePath' '}', encodeQueryParameter(_serializers, intermediatePath, const FullType(String)).toString()).replaceAll('{' r'authorizableId' '}', encodeQueryParameter(_serializers, authorizableId, const FullType(String)).toString());
    final _options = Options(
      method: r'GET',
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
      validateStatus: validateStatus,
    );

    final _response = await _dio.request<Object>(
      _path,
      options: _options,
      cancelToken: cancelToken,
      onSendProgress: onSendProgress,
      onReceiveProgress: onReceiveProgress,
    );

    KeystoreInfo? _responseData;

    try {
      final rawResponse = _response.data;
      _responseData = rawResponse == null ? null : _serializers.deserialize(
        rawResponse,
        specifiedType: const FullType(KeystoreInfo),
      ) as KeystoreInfo;

    } catch (error, stackTrace) {
      throw DioException(
        requestOptions: _response.requestOptions,
        response: _response,
        type: DioExceptionType.unknown,
        error: error,
        stackTrace: stackTrace,
      );
    }

    return Response<KeystoreInfo>(
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

  /// getKeystore
  /// 
  ///
  /// Parameters:
  /// * [intermediatePath] 
  /// * [authorizableId] 
  /// * [cancelToken] - A [CancelToken] that can be used to cancel the operation
  /// * [headers] - Can be used to add additional headers to the request
  /// * [extras] - Can be used to add flags to the request
  /// * [validateStatus] - A [ValidateStatus] callback that can be used to determine request success based on the HTTP status of the response
  /// * [onSendProgress] - A [ProgressCallback] that can be used to get the send progress
  /// * [onReceiveProgress] - A [ProgressCallback] that can be used to get the receive progress
  ///
  /// Returns a [Future] containing a [Response] with a [Uint8List] as data
  /// Throws [DioException] if API call or serialization fails
  Future<Response<Uint8List>> getKeystore({ 
    required String intermediatePath,
    required String authorizableId,
    CancelToken? cancelToken,
    Map<String, dynamic>? headers,
    Map<String, dynamic>? extra,
    ValidateStatus? validateStatus,
    ProgressCallback? onSendProgress,
    ProgressCallback? onReceiveProgress,
  }) async {
    final _path = r'/{intermediatePath}/{authorizableId}/keystore/store.p12'.replaceAll('{' r'intermediatePath' '}', encodeQueryParameter(_serializers, intermediatePath, const FullType(String)).toString()).replaceAll('{' r'authorizableId' '}', encodeQueryParameter(_serializers, authorizableId, const FullType(String)).toString());
    final _options = Options(
      method: r'GET',
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
      validateStatus: validateStatus,
    );

    final _response = await _dio.request<Object>(
      _path,
      options: _options,
      cancelToken: cancelToken,
      onSendProgress: onSendProgress,
      onReceiveProgress: onReceiveProgress,
    );

    Uint8List? _responseData;

    try {
      final rawResponse = _response.data;
      _responseData = rawResponse == null ? null : _serializers.deserialize(
        rawResponse,
        specifiedType: const FullType(Uint8List),
      ) as Uint8List;

    } catch (error, stackTrace) {
      throw DioException(
        requestOptions: _response.requestOptions,
        response: _response,
        type: DioExceptionType.unknown,
        error: error,
        stackTrace: stackTrace,
      );
    }

    return Response<Uint8List>(
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

  /// getNode
  /// 
  ///
  /// Parameters:
  /// * [path] 
  /// * [name] 
  /// * [cancelToken] - A [CancelToken] that can be used to cancel the operation
  /// * [headers] - Can be used to add additional headers to the request
  /// * [extras] - Can be used to add flags to the request
  /// * [validateStatus] - A [ValidateStatus] callback that can be used to determine request success based on the HTTP status of the response
  /// * [onSendProgress] - A [ProgressCallback] that can be used to get the send progress
  /// * [onReceiveProgress] - A [ProgressCallback] that can be used to get the receive progress
  ///
  /// Returns a [Future]
  /// Throws [DioException] if API call or serialization fails
  Future<Response<void>> getNode({ 
    required String path,
    required String name,
    CancelToken? cancelToken,
    Map<String, dynamic>? headers,
    Map<String, dynamic>? extra,
    ValidateStatus? validateStatus,
    ProgressCallback? onSendProgress,
    ProgressCallback? onReceiveProgress,
  }) async {
    final _path = r'/{path}/{name}'.replaceAll('{' r'path' '}', encodeQueryParameter(_serializers, path, const FullType(String)).toString()).replaceAll('{' r'name' '}', encodeQueryParameter(_serializers, name, const FullType(String)).toString());
    final _options = Options(
      method: r'GET',
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
      validateStatus: validateStatus,
    );

    final _response = await _dio.request<Object>(
      _path,
      options: _options,
      cancelToken: cancelToken,
      onSendProgress: onSendProgress,
      onReceiveProgress: onReceiveProgress,
    );

    return _response;
  }

  /// getPackage
  /// 
  ///
  /// Parameters:
  /// * [group] 
  /// * [name] 
  /// * [version] 
  /// * [cancelToken] - A [CancelToken] that can be used to cancel the operation
  /// * [headers] - Can be used to add additional headers to the request
  /// * [extras] - Can be used to add flags to the request
  /// * [validateStatus] - A [ValidateStatus] callback that can be used to determine request success based on the HTTP status of the response
  /// * [onSendProgress] - A [ProgressCallback] that can be used to get the send progress
  /// * [onReceiveProgress] - A [ProgressCallback] that can be used to get the receive progress
  ///
  /// Returns a [Future] containing a [Response] with a [Uint8List] as data
  /// Throws [DioException] if API call or serialization fails
  Future<Response<Uint8List>> getPackage({ 
    required String group,
    required String name,
    required String version,
    CancelToken? cancelToken,
    Map<String, dynamic>? headers,
    Map<String, dynamic>? extra,
    ValidateStatus? validateStatus,
    ProgressCallback? onSendProgress,
    ProgressCallback? onReceiveProgress,
  }) async {
    final _path = r'/etc/packages/{group}/{name}-{version}.zip'.replaceAll('{' r'group' '}', encodeQueryParameter(_serializers, group, const FullType(String)).toString()).replaceAll('{' r'name' '}', encodeQueryParameter(_serializers, name, const FullType(String)).toString()).replaceAll('{' r'version' '}', encodeQueryParameter(_serializers, version, const FullType(String)).toString());
    final _options = Options(
      method: r'GET',
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
      validateStatus: validateStatus,
    );

    final _response = await _dio.request<Object>(
      _path,
      options: _options,
      cancelToken: cancelToken,
      onSendProgress: onSendProgress,
      onReceiveProgress: onReceiveProgress,
    );

    Uint8List? _responseData;

    try {
      final rawResponse = _response.data;
      _responseData = rawResponse == null ? null : _serializers.deserialize(
        rawResponse,
        specifiedType: const FullType(Uint8List),
      ) as Uint8List;

    } catch (error, stackTrace) {
      throw DioException(
        requestOptions: _response.requestOptions,
        response: _response,
        type: DioExceptionType.unknown,
        error: error,
        stackTrace: stackTrace,
      );
    }

    return Response<Uint8List>(
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

  /// getPackageFilter
  /// 
  ///
  /// Parameters:
  /// * [group] 
  /// * [name] 
  /// * [version] 
  /// * [cancelToken] - A [CancelToken] that can be used to cancel the operation
  /// * [headers] - Can be used to add additional headers to the request
  /// * [extras] - Can be used to add flags to the request
  /// * [validateStatus] - A [ValidateStatus] callback that can be used to determine request success based on the HTTP status of the response
  /// * [onSendProgress] - A [ProgressCallback] that can be used to get the send progress
  /// * [onReceiveProgress] - A [ProgressCallback] that can be used to get the receive progress
  ///
  /// Returns a [Future] containing a [Response] with a [String] as data
  /// Throws [DioException] if API call or serialization fails
  Future<Response<String>> getPackageFilter({ 
    required String group,
    required String name,
    required String version,
    CancelToken? cancelToken,
    Map<String, dynamic>? headers,
    Map<String, dynamic>? extra,
    ValidateStatus? validateStatus,
    ProgressCallback? onSendProgress,
    ProgressCallback? onReceiveProgress,
  }) async {
    final _path = r'/etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json'.replaceAll('{' r'group' '}', encodeQueryParameter(_serializers, group, const FullType(String)).toString()).replaceAll('{' r'name' '}', encodeQueryParameter(_serializers, name, const FullType(String)).toString()).replaceAll('{' r'version' '}', encodeQueryParameter(_serializers, version, const FullType(String)).toString());
    final _options = Options(
      method: r'GET',
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
      validateStatus: validateStatus,
    );

    final _response = await _dio.request<Object>(
      _path,
      options: _options,
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

  /// getQuery
  /// 
  ///
  /// Parameters:
  /// * [path] 
  /// * [pPeriodLimit] 
  /// * [n1property] 
  /// * [n1propertyPeriodValue] 
  /// * [cancelToken] - A [CancelToken] that can be used to cancel the operation
  /// * [headers] - Can be used to add additional headers to the request
  /// * [extras] - Can be used to add flags to the request
  /// * [validateStatus] - A [ValidateStatus] callback that can be used to determine request success based on the HTTP status of the response
  /// * [onSendProgress] - A [ProgressCallback] that can be used to get the send progress
  /// * [onReceiveProgress] - A [ProgressCallback] that can be used to get the receive progress
  ///
  /// Returns a [Future] containing a [Response] with a [String] as data
  /// Throws [DioException] if API call or serialization fails
  Future<Response<String>> getQuery({ 
    required String path,
    required num pPeriodLimit,
    required String n1property,
    required String n1propertyPeriodValue,
    CancelToken? cancelToken,
    Map<String, dynamic>? headers,
    Map<String, dynamic>? extra,
    ValidateStatus? validateStatus,
    ProgressCallback? onSendProgress,
    ProgressCallback? onReceiveProgress,
  }) async {
    final _path = r'/bin/querybuilder.json';
    final _options = Options(
      method: r'GET',
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
      validateStatus: validateStatus,
    );

    final _queryParameters = <String, dynamic>{
      r'path': encodeQueryParameter(_serializers, path, const FullType(String)),
      r'p.limit': encodeQueryParameter(_serializers, pPeriodLimit, const FullType(num)),
      r'1_property': encodeQueryParameter(_serializers, n1property, const FullType(String)),
      r'1_property.value': encodeQueryParameter(_serializers, n1propertyPeriodValue, const FullType(String)),
    };

    final _response = await _dio.request<Object>(
      _path,
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

  /// getTruststore
  /// 
  ///
  /// Parameters:
  /// * [cancelToken] - A [CancelToken] that can be used to cancel the operation
  /// * [headers] - Can be used to add additional headers to the request
  /// * [extras] - Can be used to add flags to the request
  /// * [validateStatus] - A [ValidateStatus] callback that can be used to determine request success based on the HTTP status of the response
  /// * [onSendProgress] - A [ProgressCallback] that can be used to get the send progress
  /// * [onReceiveProgress] - A [ProgressCallback] that can be used to get the receive progress
  ///
  /// Returns a [Future] containing a [Response] with a [Uint8List] as data
  /// Throws [DioException] if API call or serialization fails
  Future<Response<Uint8List>> getTruststore({ 
    CancelToken? cancelToken,
    Map<String, dynamic>? headers,
    Map<String, dynamic>? extra,
    ValidateStatus? validateStatus,
    ProgressCallback? onSendProgress,
    ProgressCallback? onReceiveProgress,
  }) async {
    final _path = r'/etc/truststore/truststore.p12';
    final _options = Options(
      method: r'GET',
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
      validateStatus: validateStatus,
    );

    final _response = await _dio.request<Object>(
      _path,
      options: _options,
      cancelToken: cancelToken,
      onSendProgress: onSendProgress,
      onReceiveProgress: onReceiveProgress,
    );

    Uint8List? _responseData;

    try {
      final rawResponse = _response.data;
      _responseData = rawResponse == null ? null : _serializers.deserialize(
        rawResponse,
        specifiedType: const FullType(Uint8List),
      ) as Uint8List;

    } catch (error, stackTrace) {
      throw DioException(
        requestOptions: _response.requestOptions,
        response: _response,
        type: DioExceptionType.unknown,
        error: error,
        stackTrace: stackTrace,
      );
    }

    return Response<Uint8List>(
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

  /// getTruststoreInfo
  /// 
  ///
  /// Parameters:
  /// * [cancelToken] - A [CancelToken] that can be used to cancel the operation
  /// * [headers] - Can be used to add additional headers to the request
  /// * [extras] - Can be used to add flags to the request
  /// * [validateStatus] - A [ValidateStatus] callback that can be used to determine request success based on the HTTP status of the response
  /// * [onSendProgress] - A [ProgressCallback] that can be used to get the send progress
  /// * [onReceiveProgress] - A [ProgressCallback] that can be used to get the receive progress
  ///
  /// Returns a [Future] containing a [Response] with a [TruststoreInfo] as data
  /// Throws [DioException] if API call or serialization fails
  Future<Response<TruststoreInfo>> getTruststoreInfo({ 
    CancelToken? cancelToken,
    Map<String, dynamic>? headers,
    Map<String, dynamic>? extra,
    ValidateStatus? validateStatus,
    ProgressCallback? onSendProgress,
    ProgressCallback? onReceiveProgress,
  }) async {
    final _path = r'/libs/granite/security/truststore.json';
    final _options = Options(
      method: r'GET',
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
      validateStatus: validateStatus,
    );

    final _response = await _dio.request<Object>(
      _path,
      options: _options,
      cancelToken: cancelToken,
      onSendProgress: onSendProgress,
      onReceiveProgress: onReceiveProgress,
    );

    TruststoreInfo? _responseData;

    try {
      final rawResponse = _response.data;
      _responseData = rawResponse == null ? null : _serializers.deserialize(
        rawResponse,
        specifiedType: const FullType(TruststoreInfo),
      ) as TruststoreInfo;

    } catch (error, stackTrace) {
      throw DioException(
        requestOptions: _response.requestOptions,
        response: _response,
        type: DioExceptionType.unknown,
        error: error,
        stackTrace: stackTrace,
      );
    }

    return Response<TruststoreInfo>(
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

  /// postAgent
  /// 
  ///
  /// Parameters:
  /// * [runmode] 
  /// * [name] 
  /// * [jcrColonContentSlashCqColonDistribute] 
  /// * [jcrColonContentSlashCqColonDistributeAtTypeHint] 
  /// * [jcrColonContentSlashCqColonName] 
  /// * [jcrColonContentSlashCqColonTemplate] 
  /// * [jcrColonContentSlashAliasUpdate] 
  /// * [jcrColonContentSlashEnabled] 
  /// * [jcrColonContentSlashJcrColonDescription] 
  /// * [jcrColonContentSlashJcrColonLastModified] 
  /// * [jcrColonContentSlashJcrColonLastModifiedBy] 
  /// * [jcrColonContentSlashJcrColonMixinTypes] 
  /// * [jcrColonContentSlashJcrColonTitle] 
  /// * [jcrColonContentSlashLogLevel] 
  /// * [jcrColonContentSlashNoStatusUpdate] 
  /// * [jcrColonContentSlashNoVersioning] 
  /// * [jcrColonContentSlashProtocolConnectTimeout] 
  /// * [jcrColonContentSlashProtocolHTTPConnectionClosed] 
  /// * [jcrColonContentSlashProtocolHTTPExpired] 
  /// * [jcrColonContentSlashProtocolHTTPHeaders] 
  /// * [jcrColonContentSlashProtocolHTTPHeadersAtTypeHint] 
  /// * [jcrColonContentSlashProtocolHTTPMethod] 
  /// * [jcrColonContentSlashProtocolHTTPSRelaxed] 
  /// * [jcrColonContentSlashProtocolInterface] 
  /// * [jcrColonContentSlashProtocolSocketTimeout] 
  /// * [jcrColonContentSlashProtocolVersion] 
  /// * [jcrColonContentSlashProxyNTLMDomain] 
  /// * [jcrColonContentSlashProxyNTLMHost] 
  /// * [jcrColonContentSlashProxyHost] 
  /// * [jcrColonContentSlashProxyPassword] 
  /// * [jcrColonContentSlashProxyPort] 
  /// * [jcrColonContentSlashProxyUser] 
  /// * [jcrColonContentSlashQueueBatchMaxSize] 
  /// * [jcrColonContentSlashQueueBatchMode] 
  /// * [jcrColonContentSlashQueueBatchWaitTime] 
  /// * [jcrColonContentSlashRetryDelay] 
  /// * [jcrColonContentSlashReverseReplication] 
  /// * [jcrColonContentSlashSerializationType] 
  /// * [jcrColonContentSlashSlingColonResourceType] 
  /// * [jcrColonContentSlashSsl] 
  /// * [jcrColonContentSlashTransportNTLMDomain] 
  /// * [jcrColonContentSlashTransportNTLMHost] 
  /// * [jcrColonContentSlashTransportPassword] 
  /// * [jcrColonContentSlashTransportUri] 
  /// * [jcrColonContentSlashTransportUser] 
  /// * [jcrColonContentSlashTriggerDistribute] 
  /// * [jcrColonContentSlashTriggerModified] 
  /// * [jcrColonContentSlashTriggerOnOffTime] 
  /// * [jcrColonContentSlashTriggerReceive] 
  /// * [jcrColonContentSlashTriggerSpecific] 
  /// * [jcrColonContentSlashUserId] 
  /// * [jcrColonPrimaryType] 
  /// * [colonOperation] 
  /// * [cancelToken] - A [CancelToken] that can be used to cancel the operation
  /// * [headers] - Can be used to add additional headers to the request
  /// * [extras] - Can be used to add flags to the request
  /// * [validateStatus] - A [ValidateStatus] callback that can be used to determine request success based on the HTTP status of the response
  /// * [onSendProgress] - A [ProgressCallback] that can be used to get the send progress
  /// * [onReceiveProgress] - A [ProgressCallback] that can be used to get the receive progress
  ///
  /// Returns a [Future]
  /// Throws [DioException] if API call or serialization fails
  Future<Response<void>> postAgent({ 
    required String runmode,
    required String name,
    bool? jcrColonContentSlashCqColonDistribute,
    String? jcrColonContentSlashCqColonDistributeAtTypeHint,
    String? jcrColonContentSlashCqColonName,
    String? jcrColonContentSlashCqColonTemplate,
    bool? jcrColonContentSlashAliasUpdate,
    bool? jcrColonContentSlashEnabled,
    String? jcrColonContentSlashJcrColonDescription,
    String? jcrColonContentSlashJcrColonLastModified,
    String? jcrColonContentSlashJcrColonLastModifiedBy,
    String? jcrColonContentSlashJcrColonMixinTypes,
    String? jcrColonContentSlashJcrColonTitle,
    String? jcrColonContentSlashLogLevel,
    bool? jcrColonContentSlashNoStatusUpdate,
    bool? jcrColonContentSlashNoVersioning,
    num? jcrColonContentSlashProtocolConnectTimeout,
    bool? jcrColonContentSlashProtocolHTTPConnectionClosed,
    String? jcrColonContentSlashProtocolHTTPExpired,
    BuiltList<String>? jcrColonContentSlashProtocolHTTPHeaders,
    String? jcrColonContentSlashProtocolHTTPHeadersAtTypeHint,
    String? jcrColonContentSlashProtocolHTTPMethod,
    bool? jcrColonContentSlashProtocolHTTPSRelaxed,
    String? jcrColonContentSlashProtocolInterface,
    num? jcrColonContentSlashProtocolSocketTimeout,
    String? jcrColonContentSlashProtocolVersion,
    String? jcrColonContentSlashProxyNTLMDomain,
    String? jcrColonContentSlashProxyNTLMHost,
    String? jcrColonContentSlashProxyHost,
    String? jcrColonContentSlashProxyPassword,
    num? jcrColonContentSlashProxyPort,
    String? jcrColonContentSlashProxyUser,
    num? jcrColonContentSlashQueueBatchMaxSize,
    String? jcrColonContentSlashQueueBatchMode,
    num? jcrColonContentSlashQueueBatchWaitTime,
    String? jcrColonContentSlashRetryDelay,
    bool? jcrColonContentSlashReverseReplication,
    String? jcrColonContentSlashSerializationType,
    String? jcrColonContentSlashSlingColonResourceType,
    String? jcrColonContentSlashSsl,
    String? jcrColonContentSlashTransportNTLMDomain,
    String? jcrColonContentSlashTransportNTLMHost,
    String? jcrColonContentSlashTransportPassword,
    String? jcrColonContentSlashTransportUri,
    String? jcrColonContentSlashTransportUser,
    bool? jcrColonContentSlashTriggerDistribute,
    bool? jcrColonContentSlashTriggerModified,
    bool? jcrColonContentSlashTriggerOnOffTime,
    bool? jcrColonContentSlashTriggerReceive,
    bool? jcrColonContentSlashTriggerSpecific,
    String? jcrColonContentSlashUserId,
    String? jcrColonPrimaryType,
    String? colonOperation,
    CancelToken? cancelToken,
    Map<String, dynamic>? headers,
    Map<String, dynamic>? extra,
    ValidateStatus? validateStatus,
    ProgressCallback? onSendProgress,
    ProgressCallback? onReceiveProgress,
  }) async {
    final _path = r'/etc/replication/agents.{runmode}/{name}'.replaceAll('{' r'runmode' '}', encodeQueryParameter(_serializers, runmode, const FullType(String)).toString()).replaceAll('{' r'name' '}', encodeQueryParameter(_serializers, name, const FullType(String)).toString());
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
      validateStatus: validateStatus,
    );

    final _queryParameters = <String, dynamic>{
      if (jcrColonContentSlashCqColonDistribute != null) r'jcr:content/cq:distribute': encodeQueryParameter(_serializers, jcrColonContentSlashCqColonDistribute, const FullType(bool)),
      if (jcrColonContentSlashCqColonDistributeAtTypeHint != null) r'jcr:content/cq:distribute@TypeHint': encodeQueryParameter(_serializers, jcrColonContentSlashCqColonDistributeAtTypeHint, const FullType(String)),
      if (jcrColonContentSlashCqColonName != null) r'jcr:content/cq:name': encodeQueryParameter(_serializers, jcrColonContentSlashCqColonName, const FullType(String)),
      if (jcrColonContentSlashCqColonTemplate != null) r'jcr:content/cq:template': encodeQueryParameter(_serializers, jcrColonContentSlashCqColonTemplate, const FullType(String)),
      if (jcrColonContentSlashAliasUpdate != null) r'jcr:content/aliasUpdate': encodeQueryParameter(_serializers, jcrColonContentSlashAliasUpdate, const FullType(bool)),
      if (jcrColonContentSlashEnabled != null) r'jcr:content/enabled': encodeQueryParameter(_serializers, jcrColonContentSlashEnabled, const FullType(bool)),
      if (jcrColonContentSlashJcrColonDescription != null) r'jcr:content/jcr:description': encodeQueryParameter(_serializers, jcrColonContentSlashJcrColonDescription, const FullType(String)),
      if (jcrColonContentSlashJcrColonLastModified != null) r'jcr:content/jcr:lastModified': encodeQueryParameter(_serializers, jcrColonContentSlashJcrColonLastModified, const FullType(String)),
      if (jcrColonContentSlashJcrColonLastModifiedBy != null) r'jcr:content/jcr:lastModifiedBy': encodeQueryParameter(_serializers, jcrColonContentSlashJcrColonLastModifiedBy, const FullType(String)),
      if (jcrColonContentSlashJcrColonMixinTypes != null) r'jcr:content/jcr:mixinTypes': encodeQueryParameter(_serializers, jcrColonContentSlashJcrColonMixinTypes, const FullType(String)),
      if (jcrColonContentSlashJcrColonTitle != null) r'jcr:content/jcr:title': encodeQueryParameter(_serializers, jcrColonContentSlashJcrColonTitle, const FullType(String)),
      if (jcrColonContentSlashLogLevel != null) r'jcr:content/logLevel': encodeQueryParameter(_serializers, jcrColonContentSlashLogLevel, const FullType(String)),
      if (jcrColonContentSlashNoStatusUpdate != null) r'jcr:content/noStatusUpdate': encodeQueryParameter(_serializers, jcrColonContentSlashNoStatusUpdate, const FullType(bool)),
      if (jcrColonContentSlashNoVersioning != null) r'jcr:content/noVersioning': encodeQueryParameter(_serializers, jcrColonContentSlashNoVersioning, const FullType(bool)),
      if (jcrColonContentSlashProtocolConnectTimeout != null) r'jcr:content/protocolConnectTimeout': encodeQueryParameter(_serializers, jcrColonContentSlashProtocolConnectTimeout, const FullType(num)),
      if (jcrColonContentSlashProtocolHTTPConnectionClosed != null) r'jcr:content/protocolHTTPConnectionClosed': encodeQueryParameter(_serializers, jcrColonContentSlashProtocolHTTPConnectionClosed, const FullType(bool)),
      if (jcrColonContentSlashProtocolHTTPExpired != null) r'jcr:content/protocolHTTPExpired': encodeQueryParameter(_serializers, jcrColonContentSlashProtocolHTTPExpired, const FullType(String)),
      if (jcrColonContentSlashProtocolHTTPHeaders != null) r'jcr:content/protocolHTTPHeaders': encodeCollectionQueryParameter<String>(_serializers, jcrColonContentSlashProtocolHTTPHeaders, const FullType(BuiltList, [FullType(String)]), format: ListFormat.multi,),
      if (jcrColonContentSlashProtocolHTTPHeadersAtTypeHint != null) r'jcr:content/protocolHTTPHeaders@TypeHint': encodeQueryParameter(_serializers, jcrColonContentSlashProtocolHTTPHeadersAtTypeHint, const FullType(String)),
      if (jcrColonContentSlashProtocolHTTPMethod != null) r'jcr:content/protocolHTTPMethod': encodeQueryParameter(_serializers, jcrColonContentSlashProtocolHTTPMethod, const FullType(String)),
      if (jcrColonContentSlashProtocolHTTPSRelaxed != null) r'jcr:content/protocolHTTPSRelaxed': encodeQueryParameter(_serializers, jcrColonContentSlashProtocolHTTPSRelaxed, const FullType(bool)),
      if (jcrColonContentSlashProtocolInterface != null) r'jcr:content/protocolInterface': encodeQueryParameter(_serializers, jcrColonContentSlashProtocolInterface, const FullType(String)),
      if (jcrColonContentSlashProtocolSocketTimeout != null) r'jcr:content/protocolSocketTimeout': encodeQueryParameter(_serializers, jcrColonContentSlashProtocolSocketTimeout, const FullType(num)),
      if (jcrColonContentSlashProtocolVersion != null) r'jcr:content/protocolVersion': encodeQueryParameter(_serializers, jcrColonContentSlashProtocolVersion, const FullType(String)),
      if (jcrColonContentSlashProxyNTLMDomain != null) r'jcr:content/proxyNTLMDomain': encodeQueryParameter(_serializers, jcrColonContentSlashProxyNTLMDomain, const FullType(String)),
      if (jcrColonContentSlashProxyNTLMHost != null) r'jcr:content/proxyNTLMHost': encodeQueryParameter(_serializers, jcrColonContentSlashProxyNTLMHost, const FullType(String)),
      if (jcrColonContentSlashProxyHost != null) r'jcr:content/proxyHost': encodeQueryParameter(_serializers, jcrColonContentSlashProxyHost, const FullType(String)),
      if (jcrColonContentSlashProxyPassword != null) r'jcr:content/proxyPassword': encodeQueryParameter(_serializers, jcrColonContentSlashProxyPassword, const FullType(String)),
      if (jcrColonContentSlashProxyPort != null) r'jcr:content/proxyPort': encodeQueryParameter(_serializers, jcrColonContentSlashProxyPort, const FullType(num)),
      if (jcrColonContentSlashProxyUser != null) r'jcr:content/proxyUser': encodeQueryParameter(_serializers, jcrColonContentSlashProxyUser, const FullType(String)),
      if (jcrColonContentSlashQueueBatchMaxSize != null) r'jcr:content/queueBatchMaxSize': encodeQueryParameter(_serializers, jcrColonContentSlashQueueBatchMaxSize, const FullType(num)),
      if (jcrColonContentSlashQueueBatchMode != null) r'jcr:content/queueBatchMode': encodeQueryParameter(_serializers, jcrColonContentSlashQueueBatchMode, const FullType(String)),
      if (jcrColonContentSlashQueueBatchWaitTime != null) r'jcr:content/queueBatchWaitTime': encodeQueryParameter(_serializers, jcrColonContentSlashQueueBatchWaitTime, const FullType(num)),
      if (jcrColonContentSlashRetryDelay != null) r'jcr:content/retryDelay': encodeQueryParameter(_serializers, jcrColonContentSlashRetryDelay, const FullType(String)),
      if (jcrColonContentSlashReverseReplication != null) r'jcr:content/reverseReplication': encodeQueryParameter(_serializers, jcrColonContentSlashReverseReplication, const FullType(bool)),
      if (jcrColonContentSlashSerializationType != null) r'jcr:content/serializationType': encodeQueryParameter(_serializers, jcrColonContentSlashSerializationType, const FullType(String)),
      if (jcrColonContentSlashSlingColonResourceType != null) r'jcr:content/sling:resourceType': encodeQueryParameter(_serializers, jcrColonContentSlashSlingColonResourceType, const FullType(String)),
      if (jcrColonContentSlashSsl != null) r'jcr:content/ssl': encodeQueryParameter(_serializers, jcrColonContentSlashSsl, const FullType(String)),
      if (jcrColonContentSlashTransportNTLMDomain != null) r'jcr:content/transportNTLMDomain': encodeQueryParameter(_serializers, jcrColonContentSlashTransportNTLMDomain, const FullType(String)),
      if (jcrColonContentSlashTransportNTLMHost != null) r'jcr:content/transportNTLMHost': encodeQueryParameter(_serializers, jcrColonContentSlashTransportNTLMHost, const FullType(String)),
      if (jcrColonContentSlashTransportPassword != null) r'jcr:content/transportPassword': encodeQueryParameter(_serializers, jcrColonContentSlashTransportPassword, const FullType(String)),
      if (jcrColonContentSlashTransportUri != null) r'jcr:content/transportUri': encodeQueryParameter(_serializers, jcrColonContentSlashTransportUri, const FullType(String)),
      if (jcrColonContentSlashTransportUser != null) r'jcr:content/transportUser': encodeQueryParameter(_serializers, jcrColonContentSlashTransportUser, const FullType(String)),
      if (jcrColonContentSlashTriggerDistribute != null) r'jcr:content/triggerDistribute': encodeQueryParameter(_serializers, jcrColonContentSlashTriggerDistribute, const FullType(bool)),
      if (jcrColonContentSlashTriggerModified != null) r'jcr:content/triggerModified': encodeQueryParameter(_serializers, jcrColonContentSlashTriggerModified, const FullType(bool)),
      if (jcrColonContentSlashTriggerOnOffTime != null) r'jcr:content/triggerOnOffTime': encodeQueryParameter(_serializers, jcrColonContentSlashTriggerOnOffTime, const FullType(bool)),
      if (jcrColonContentSlashTriggerReceive != null) r'jcr:content/triggerReceive': encodeQueryParameter(_serializers, jcrColonContentSlashTriggerReceive, const FullType(bool)),
      if (jcrColonContentSlashTriggerSpecific != null) r'jcr:content/triggerSpecific': encodeQueryParameter(_serializers, jcrColonContentSlashTriggerSpecific, const FullType(bool)),
      if (jcrColonContentSlashUserId != null) r'jcr:content/userId': encodeQueryParameter(_serializers, jcrColonContentSlashUserId, const FullType(String)),
      if (jcrColonPrimaryType != null) r'jcr:primaryType': encodeQueryParameter(_serializers, jcrColonPrimaryType, const FullType(String)),
      if (colonOperation != null) r':operation': encodeQueryParameter(_serializers, colonOperation, const FullType(String)),
    };

    final _response = await _dio.request<Object>(
      _path,
      options: _options,
      queryParameters: _queryParameters,
      cancelToken: cancelToken,
      onSendProgress: onSendProgress,
      onReceiveProgress: onReceiveProgress,
    );

    return _response;
  }

  /// postAuthorizableKeystore
  /// 
  ///
  /// Parameters:
  /// * [intermediatePath] 
  /// * [authorizableId] 
  /// * [colonOperation] 
  /// * [currentPassword] 
  /// * [newPassword] 
  /// * [rePassword] 
  /// * [keyPassword] 
  /// * [keyStorePass] 
  /// * [alias] 
  /// * [newAlias] 
  /// * [removeAlias] 
  /// * [certChain] 
  /// * [pk] 
  /// * [keyStore] 
  /// * [cancelToken] - A [CancelToken] that can be used to cancel the operation
  /// * [headers] - Can be used to add additional headers to the request
  /// * [extras] - Can be used to add flags to the request
  /// * [validateStatus] - A [ValidateStatus] callback that can be used to determine request success based on the HTTP status of the response
  /// * [onSendProgress] - A [ProgressCallback] that can be used to get the send progress
  /// * [onReceiveProgress] - A [ProgressCallback] that can be used to get the receive progress
  ///
  /// Returns a [Future] containing a [Response] with a [KeystoreInfo] as data
  /// Throws [DioException] if API call or serialization fails
  Future<Response<KeystoreInfo>> postAuthorizableKeystore({ 
    required String intermediatePath,
    required String authorizableId,
    String? colonOperation,
    String? currentPassword,
    String? newPassword,
    String? rePassword,
    String? keyPassword,
    String? keyStorePass,
    String? alias,
    String? newAlias,
    String? removeAlias,
    MultipartFile? certChain,
    MultipartFile? pk,
    MultipartFile? keyStore,
    CancelToken? cancelToken,
    Map<String, dynamic>? headers,
    Map<String, dynamic>? extra,
    ValidateStatus? validateStatus,
    ProgressCallback? onSendProgress,
    ProgressCallback? onReceiveProgress,
  }) async {
    final _path = r'/{intermediatePath}/{authorizableId}.ks.html'.replaceAll('{' r'intermediatePath' '}', encodeQueryParameter(_serializers, intermediatePath, const FullType(String)).toString()).replaceAll('{' r'authorizableId' '}', encodeQueryParameter(_serializers, authorizableId, const FullType(String)).toString());
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
      if (colonOperation != null) r':operation': encodeQueryParameter(_serializers, colonOperation, const FullType(String)),
      if (currentPassword != null) r'currentPassword': encodeQueryParameter(_serializers, currentPassword, const FullType(String)),
      if (newPassword != null) r'newPassword': encodeQueryParameter(_serializers, newPassword, const FullType(String)),
      if (rePassword != null) r'rePassword': encodeQueryParameter(_serializers, rePassword, const FullType(String)),
      if (keyPassword != null) r'keyPassword': encodeQueryParameter(_serializers, keyPassword, const FullType(String)),
      if (keyStorePass != null) r'keyStorePass': encodeQueryParameter(_serializers, keyStorePass, const FullType(String)),
      if (alias != null) r'alias': encodeQueryParameter(_serializers, alias, const FullType(String)),
      if (newAlias != null) r'newAlias': encodeQueryParameter(_serializers, newAlias, const FullType(String)),
      if (removeAlias != null) r'removeAlias': encodeQueryParameter(_serializers, removeAlias, const FullType(String)),
    };

    dynamic _bodyData;

    try {
      _bodyData = FormData.fromMap(<String, dynamic>{
        if (certChain != null) r'cert-chain': certChain,
        if (pk != null) r'pk': pk,
        if (keyStore != null) r'keyStore': keyStore,
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

    KeystoreInfo? _responseData;

    try {
      final rawResponse = _response.data;
      _responseData = rawResponse == null ? null : _serializers.deserialize(
        rawResponse,
        specifiedType: const FullType(KeystoreInfo),
      ) as KeystoreInfo;

    } catch (error, stackTrace) {
      throw DioException(
        requestOptions: _response.requestOptions,
        response: _response,
        type: DioExceptionType.unknown,
        error: error,
        stackTrace: stackTrace,
      );
    }

    return Response<KeystoreInfo>(
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

  /// postAuthorizables
  /// 
  ///
  /// Parameters:
  /// * [authorizableId] 
  /// * [intermediatePath] 
  /// * [createUser] 
  /// * [createGroup] 
  /// * [repColonPassword] 
  /// * [profileSlashGivenName] 
  /// * [cancelToken] - A [CancelToken] that can be used to cancel the operation
  /// * [headers] - Can be used to add additional headers to the request
  /// * [extras] - Can be used to add flags to the request
  /// * [validateStatus] - A [ValidateStatus] callback that can be used to determine request success based on the HTTP status of the response
  /// * [onSendProgress] - A [ProgressCallback] that can be used to get the send progress
  /// * [onReceiveProgress] - A [ProgressCallback] that can be used to get the receive progress
  ///
  /// Returns a [Future] containing a [Response] with a [String] as data
  /// Throws [DioException] if API call or serialization fails
  Future<Response<String>> postAuthorizables({ 
    required String authorizableId,
    required String intermediatePath,
    String? createUser,
    String? createGroup,
    String? repColonPassword,
    String? profileSlashGivenName,
    CancelToken? cancelToken,
    Map<String, dynamic>? headers,
    Map<String, dynamic>? extra,
    ValidateStatus? validateStatus,
    ProgressCallback? onSendProgress,
    ProgressCallback? onReceiveProgress,
  }) async {
    final _path = r'/libs/granite/security/post/authorizables';
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
      validateStatus: validateStatus,
    );

    final _queryParameters = <String, dynamic>{
      r'authorizableId': encodeQueryParameter(_serializers, authorizableId, const FullType(String)),
      r'intermediatePath': encodeQueryParameter(_serializers, intermediatePath, const FullType(String)),
      if (createUser != null) r'createUser': encodeQueryParameter(_serializers, createUser, const FullType(String)),
      if (createGroup != null) r'createGroup': encodeQueryParameter(_serializers, createGroup, const FullType(String)),
      if (repColonPassword != null) r'rep:password': encodeQueryParameter(_serializers, repColonPassword, const FullType(String)),
      if (profileSlashGivenName != null) r'profile/givenName': encodeQueryParameter(_serializers, profileSlashGivenName, const FullType(String)),
    };

    final _response = await _dio.request<Object>(
      _path,
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

  /// postConfigAdobeGraniteSamlAuthenticationHandler
  /// 
  ///
  /// Parameters:
  /// * [keyStorePassword] 
  /// * [keyStorePasswordAtTypeHint] 
  /// * [servicePeriodRanking] 
  /// * [servicePeriodRankingAtTypeHint] 
  /// * [idpHttpRedirect] 
  /// * [idpHttpRedirectAtTypeHint] 
  /// * [createUser] 
  /// * [createUserAtTypeHint] 
  /// * [defaultRedirectUrl] 
  /// * [defaultRedirectUrlAtTypeHint] 
  /// * [userIDAttribute] 
  /// * [userIDAttributeAtTypeHint] 
  /// * [defaultGroups] 
  /// * [defaultGroupsAtTypeHint] 
  /// * [idpCertAlias] 
  /// * [idpCertAliasAtTypeHint] 
  /// * [addGroupMemberships] 
  /// * [addGroupMembershipsAtTypeHint] 
  /// * [path] 
  /// * [pathAtTypeHint] 
  /// * [synchronizeAttributes] 
  /// * [synchronizeAttributesAtTypeHint] 
  /// * [clockTolerance] 
  /// * [clockToleranceAtTypeHint] 
  /// * [groupMembershipAttribute] 
  /// * [groupMembershipAttributeAtTypeHint] 
  /// * [idpUrl] 
  /// * [idpUrlAtTypeHint] 
  /// * [logoutUrl] 
  /// * [logoutUrlAtTypeHint] 
  /// * [serviceProviderEntityId] 
  /// * [serviceProviderEntityIdAtTypeHint] 
  /// * [assertionConsumerServiceURL] 
  /// * [assertionConsumerServiceURLAtTypeHint] 
  /// * [handleLogout] 
  /// * [handleLogoutAtTypeHint] 
  /// * [spPrivateKeyAlias] 
  /// * [spPrivateKeyAliasAtTypeHint] 
  /// * [useEncryption] 
  /// * [useEncryptionAtTypeHint] 
  /// * [nameIdFormat] 
  /// * [nameIdFormatAtTypeHint] 
  /// * [digestMethod] 
  /// * [digestMethodAtTypeHint] 
  /// * [signatureMethod] 
  /// * [signatureMethodAtTypeHint] 
  /// * [userIntermediatePath] 
  /// * [userIntermediatePathAtTypeHint] 
  /// * [cancelToken] - A [CancelToken] that can be used to cancel the operation
  /// * [headers] - Can be used to add additional headers to the request
  /// * [extras] - Can be used to add flags to the request
  /// * [validateStatus] - A [ValidateStatus] callback that can be used to determine request success based on the HTTP status of the response
  /// * [onSendProgress] - A [ProgressCallback] that can be used to get the send progress
  /// * [onReceiveProgress] - A [ProgressCallback] that can be used to get the receive progress
  ///
  /// Returns a [Future]
  /// Throws [DioException] if API call or serialization fails
  Future<Response<void>> postConfigAdobeGraniteSamlAuthenticationHandler({ 
    String? keyStorePassword,
    String? keyStorePasswordAtTypeHint,
    int? servicePeriodRanking,
    String? servicePeriodRankingAtTypeHint,
    bool? idpHttpRedirect,
    String? idpHttpRedirectAtTypeHint,
    bool? createUser,
    String? createUserAtTypeHint,
    String? defaultRedirectUrl,
    String? defaultRedirectUrlAtTypeHint,
    String? userIDAttribute,
    String? userIDAttributeAtTypeHint,
    BuiltList<String>? defaultGroups,
    String? defaultGroupsAtTypeHint,
    String? idpCertAlias,
    String? idpCertAliasAtTypeHint,
    bool? addGroupMemberships,
    String? addGroupMembershipsAtTypeHint,
    BuiltList<String>? path,
    String? pathAtTypeHint,
    BuiltList<String>? synchronizeAttributes,
    String? synchronizeAttributesAtTypeHint,
    int? clockTolerance,
    String? clockToleranceAtTypeHint,
    String? groupMembershipAttribute,
    String? groupMembershipAttributeAtTypeHint,
    String? idpUrl,
    String? idpUrlAtTypeHint,
    String? logoutUrl,
    String? logoutUrlAtTypeHint,
    String? serviceProviderEntityId,
    String? serviceProviderEntityIdAtTypeHint,
    String? assertionConsumerServiceURL,
    String? assertionConsumerServiceURLAtTypeHint,
    bool? handleLogout,
    String? handleLogoutAtTypeHint,
    String? spPrivateKeyAlias,
    String? spPrivateKeyAliasAtTypeHint,
    bool? useEncryption,
    String? useEncryptionAtTypeHint,
    String? nameIdFormat,
    String? nameIdFormatAtTypeHint,
    String? digestMethod,
    String? digestMethodAtTypeHint,
    String? signatureMethod,
    String? signatureMethodAtTypeHint,
    String? userIntermediatePath,
    String? userIntermediatePathAtTypeHint,
    CancelToken? cancelToken,
    Map<String, dynamic>? headers,
    Map<String, dynamic>? extra,
    ValidateStatus? validateStatus,
    ProgressCallback? onSendProgress,
    ProgressCallback? onReceiveProgress,
  }) async {
    final _path = r'/apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config';
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
      validateStatus: validateStatus,
    );

    final _queryParameters = <String, dynamic>{
      if (keyStorePassword != null) r'keyStorePassword': encodeQueryParameter(_serializers, keyStorePassword, const FullType(String)),
      if (keyStorePasswordAtTypeHint != null) r'keyStorePassword@TypeHint': encodeQueryParameter(_serializers, keyStorePasswordAtTypeHint, const FullType(String)),
      if (servicePeriodRanking != null) r'service.ranking': encodeQueryParameter(_serializers, servicePeriodRanking, const FullType(int)),
      if (servicePeriodRankingAtTypeHint != null) r'service.ranking@TypeHint': encodeQueryParameter(_serializers, servicePeriodRankingAtTypeHint, const FullType(String)),
      if (idpHttpRedirect != null) r'idpHttpRedirect': encodeQueryParameter(_serializers, idpHttpRedirect, const FullType(bool)),
      if (idpHttpRedirectAtTypeHint != null) r'idpHttpRedirect@TypeHint': encodeQueryParameter(_serializers, idpHttpRedirectAtTypeHint, const FullType(String)),
      if (createUser != null) r'createUser': encodeQueryParameter(_serializers, createUser, const FullType(bool)),
      if (createUserAtTypeHint != null) r'createUser@TypeHint': encodeQueryParameter(_serializers, createUserAtTypeHint, const FullType(String)),
      if (defaultRedirectUrl != null) r'defaultRedirectUrl': encodeQueryParameter(_serializers, defaultRedirectUrl, const FullType(String)),
      if (defaultRedirectUrlAtTypeHint != null) r'defaultRedirectUrl@TypeHint': encodeQueryParameter(_serializers, defaultRedirectUrlAtTypeHint, const FullType(String)),
      if (userIDAttribute != null) r'userIDAttribute': encodeQueryParameter(_serializers, userIDAttribute, const FullType(String)),
      if (userIDAttributeAtTypeHint != null) r'userIDAttribute@TypeHint': encodeQueryParameter(_serializers, userIDAttributeAtTypeHint, const FullType(String)),
      if (defaultGroups != null) r'defaultGroups': encodeCollectionQueryParameter<String>(_serializers, defaultGroups, const FullType(BuiltList, [FullType(String)]), format: ListFormat.multi,),
      if (defaultGroupsAtTypeHint != null) r'defaultGroups@TypeHint': encodeQueryParameter(_serializers, defaultGroupsAtTypeHint, const FullType(String)),
      if (idpCertAlias != null) r'idpCertAlias': encodeQueryParameter(_serializers, idpCertAlias, const FullType(String)),
      if (idpCertAliasAtTypeHint != null) r'idpCertAlias@TypeHint': encodeQueryParameter(_serializers, idpCertAliasAtTypeHint, const FullType(String)),
      if (addGroupMemberships != null) r'addGroupMemberships': encodeQueryParameter(_serializers, addGroupMemberships, const FullType(bool)),
      if (addGroupMembershipsAtTypeHint != null) r'addGroupMemberships@TypeHint': encodeQueryParameter(_serializers, addGroupMembershipsAtTypeHint, const FullType(String)),
      if (path != null) r'path': encodeCollectionQueryParameter<String>(_serializers, path, const FullType(BuiltList, [FullType(String)]), format: ListFormat.multi,),
      if (pathAtTypeHint != null) r'path@TypeHint': encodeQueryParameter(_serializers, pathAtTypeHint, const FullType(String)),
      if (synchronizeAttributes != null) r'synchronizeAttributes': encodeCollectionQueryParameter<String>(_serializers, synchronizeAttributes, const FullType(BuiltList, [FullType(String)]), format: ListFormat.multi,),
      if (synchronizeAttributesAtTypeHint != null) r'synchronizeAttributes@TypeHint': encodeQueryParameter(_serializers, synchronizeAttributesAtTypeHint, const FullType(String)),
      if (clockTolerance != null) r'clockTolerance': encodeQueryParameter(_serializers, clockTolerance, const FullType(int)),
      if (clockToleranceAtTypeHint != null) r'clockTolerance@TypeHint': encodeQueryParameter(_serializers, clockToleranceAtTypeHint, const FullType(String)),
      if (groupMembershipAttribute != null) r'groupMembershipAttribute': encodeQueryParameter(_serializers, groupMembershipAttribute, const FullType(String)),
      if (groupMembershipAttributeAtTypeHint != null) r'groupMembershipAttribute@TypeHint': encodeQueryParameter(_serializers, groupMembershipAttributeAtTypeHint, const FullType(String)),
      if (idpUrl != null) r'idpUrl': encodeQueryParameter(_serializers, idpUrl, const FullType(String)),
      if (idpUrlAtTypeHint != null) r'idpUrl@TypeHint': encodeQueryParameter(_serializers, idpUrlAtTypeHint, const FullType(String)),
      if (logoutUrl != null) r'logoutUrl': encodeQueryParameter(_serializers, logoutUrl, const FullType(String)),
      if (logoutUrlAtTypeHint != null) r'logoutUrl@TypeHint': encodeQueryParameter(_serializers, logoutUrlAtTypeHint, const FullType(String)),
      if (serviceProviderEntityId != null) r'serviceProviderEntityId': encodeQueryParameter(_serializers, serviceProviderEntityId, const FullType(String)),
      if (serviceProviderEntityIdAtTypeHint != null) r'serviceProviderEntityId@TypeHint': encodeQueryParameter(_serializers, serviceProviderEntityIdAtTypeHint, const FullType(String)),
      if (assertionConsumerServiceURL != null) r'assertionConsumerServiceURL': encodeQueryParameter(_serializers, assertionConsumerServiceURL, const FullType(String)),
      if (assertionConsumerServiceURLAtTypeHint != null) r'assertionConsumerServiceURL@TypeHint': encodeQueryParameter(_serializers, assertionConsumerServiceURLAtTypeHint, const FullType(String)),
      if (handleLogout != null) r'handleLogout': encodeQueryParameter(_serializers, handleLogout, const FullType(bool)),
      if (handleLogoutAtTypeHint != null) r'handleLogout@TypeHint': encodeQueryParameter(_serializers, handleLogoutAtTypeHint, const FullType(String)),
      if (spPrivateKeyAlias != null) r'spPrivateKeyAlias': encodeQueryParameter(_serializers, spPrivateKeyAlias, const FullType(String)),
      if (spPrivateKeyAliasAtTypeHint != null) r'spPrivateKeyAlias@TypeHint': encodeQueryParameter(_serializers, spPrivateKeyAliasAtTypeHint, const FullType(String)),
      if (useEncryption != null) r'useEncryption': encodeQueryParameter(_serializers, useEncryption, const FullType(bool)),
      if (useEncryptionAtTypeHint != null) r'useEncryption@TypeHint': encodeQueryParameter(_serializers, useEncryptionAtTypeHint, const FullType(String)),
      if (nameIdFormat != null) r'nameIdFormat': encodeQueryParameter(_serializers, nameIdFormat, const FullType(String)),
      if (nameIdFormatAtTypeHint != null) r'nameIdFormat@TypeHint': encodeQueryParameter(_serializers, nameIdFormatAtTypeHint, const FullType(String)),
      if (digestMethod != null) r'digestMethod': encodeQueryParameter(_serializers, digestMethod, const FullType(String)),
      if (digestMethodAtTypeHint != null) r'digestMethod@TypeHint': encodeQueryParameter(_serializers, digestMethodAtTypeHint, const FullType(String)),
      if (signatureMethod != null) r'signatureMethod': encodeQueryParameter(_serializers, signatureMethod, const FullType(String)),
      if (signatureMethodAtTypeHint != null) r'signatureMethod@TypeHint': encodeQueryParameter(_serializers, signatureMethodAtTypeHint, const FullType(String)),
      if (userIntermediatePath != null) r'userIntermediatePath': encodeQueryParameter(_serializers, userIntermediatePath, const FullType(String)),
      if (userIntermediatePathAtTypeHint != null) r'userIntermediatePath@TypeHint': encodeQueryParameter(_serializers, userIntermediatePathAtTypeHint, const FullType(String)),
    };

    final _response = await _dio.request<Object>(
      _path,
      options: _options,
      queryParameters: _queryParameters,
      cancelToken: cancelToken,
      onSendProgress: onSendProgress,
      onReceiveProgress: onReceiveProgress,
    );

    return _response;
  }

  /// postConfigApacheFelixJettyBasedHttpService
  /// 
  ///
  /// Parameters:
  /// * [orgPeriodApachePeriodFelixPeriodHttpsPeriodNio] 
  /// * [orgPeriodApachePeriodFelixPeriodHttpsPeriodNioAtTypeHint] 
  /// * [orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystore] 
  /// * [orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystoreAtTypeHint] 
  /// * [orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodPassword] 
  /// * [orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodPasswordAtTypeHint] 
  /// * [orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodKey] 
  /// * [orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodKeyAtTypeHint] 
  /// * [orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodKeyPeriodPassword] 
  /// * [orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodKeyPeriodPasswordAtTypeHint] 
  /// * [orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststore] 
  /// * [orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststoreAtTypeHint] 
  /// * [orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststorePeriodPassword] 
  /// * [orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststorePeriodPasswordAtTypeHint] 
  /// * [orgPeriodApachePeriodFelixPeriodHttpsPeriodClientcertificate] 
  /// * [orgPeriodApachePeriodFelixPeriodHttpsPeriodClientcertificateAtTypeHint] 
  /// * [orgPeriodApachePeriodFelixPeriodHttpsPeriodEnable] 
  /// * [orgPeriodApachePeriodFelixPeriodHttpsPeriodEnableAtTypeHint] 
  /// * [orgPeriodOsgiPeriodServicePeriodHttpPeriodPortPeriodSecure] 
  /// * [orgPeriodOsgiPeriodServicePeriodHttpPeriodPortPeriodSecureAtTypeHint] 
  /// * [cancelToken] - A [CancelToken] that can be used to cancel the operation
  /// * [headers] - Can be used to add additional headers to the request
  /// * [extras] - Can be used to add flags to the request
  /// * [validateStatus] - A [ValidateStatus] callback that can be used to determine request success based on the HTTP status of the response
  /// * [onSendProgress] - A [ProgressCallback] that can be used to get the send progress
  /// * [onReceiveProgress] - A [ProgressCallback] that can be used to get the receive progress
  ///
  /// Returns a [Future]
  /// Throws [DioException] if API call or serialization fails
  Future<Response<void>> postConfigApacheFelixJettyBasedHttpService({ 
    bool? orgPeriodApachePeriodFelixPeriodHttpsPeriodNio,
    String? orgPeriodApachePeriodFelixPeriodHttpsPeriodNioAtTypeHint,
    String? orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystore,
    String? orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystoreAtTypeHint,
    String? orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodPassword,
    String? orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodPasswordAtTypeHint,
    String? orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodKey,
    String? orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodKeyAtTypeHint,
    String? orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodKeyPeriodPassword,
    String? orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodKeyPeriodPasswordAtTypeHint,
    String? orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststore,
    String? orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststoreAtTypeHint,
    String? orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststorePeriodPassword,
    String? orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststorePeriodPasswordAtTypeHint,
    String? orgPeriodApachePeriodFelixPeriodHttpsPeriodClientcertificate,
    String? orgPeriodApachePeriodFelixPeriodHttpsPeriodClientcertificateAtTypeHint,
    bool? orgPeriodApachePeriodFelixPeriodHttpsPeriodEnable,
    String? orgPeriodApachePeriodFelixPeriodHttpsPeriodEnableAtTypeHint,
    String? orgPeriodOsgiPeriodServicePeriodHttpPeriodPortPeriodSecure,
    String? orgPeriodOsgiPeriodServicePeriodHttpPeriodPortPeriodSecureAtTypeHint,
    CancelToken? cancelToken,
    Map<String, dynamic>? headers,
    Map<String, dynamic>? extra,
    ValidateStatus? validateStatus,
    ProgressCallback? onSendProgress,
    ProgressCallback? onReceiveProgress,
  }) async {
    final _path = r'/apps/system/config/org.apache.felix.http';
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
      validateStatus: validateStatus,
    );

    final _queryParameters = <String, dynamic>{
      if (orgPeriodApachePeriodFelixPeriodHttpsPeriodNio != null) r'org.apache.felix.https.nio': encodeQueryParameter(_serializers, orgPeriodApachePeriodFelixPeriodHttpsPeriodNio, const FullType(bool)),
      if (orgPeriodApachePeriodFelixPeriodHttpsPeriodNioAtTypeHint != null) r'org.apache.felix.https.nio@TypeHint': encodeQueryParameter(_serializers, orgPeriodApachePeriodFelixPeriodHttpsPeriodNioAtTypeHint, const FullType(String)),
      if (orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystore != null) r'org.apache.felix.https.keystore': encodeQueryParameter(_serializers, orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystore, const FullType(String)),
      if (orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystoreAtTypeHint != null) r'org.apache.felix.https.keystore@TypeHint': encodeQueryParameter(_serializers, orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystoreAtTypeHint, const FullType(String)),
      if (orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodPassword != null) r'org.apache.felix.https.keystore.password': encodeQueryParameter(_serializers, orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodPassword, const FullType(String)),
      if (orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodPasswordAtTypeHint != null) r'org.apache.felix.https.keystore.password@TypeHint': encodeQueryParameter(_serializers, orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodPasswordAtTypeHint, const FullType(String)),
      if (orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodKey != null) r'org.apache.felix.https.keystore.key': encodeQueryParameter(_serializers, orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodKey, const FullType(String)),
      if (orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodKeyAtTypeHint != null) r'org.apache.felix.https.keystore.key@TypeHint': encodeQueryParameter(_serializers, orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodKeyAtTypeHint, const FullType(String)),
      if (orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodKeyPeriodPassword != null) r'org.apache.felix.https.keystore.key.password': encodeQueryParameter(_serializers, orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodKeyPeriodPassword, const FullType(String)),
      if (orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodKeyPeriodPasswordAtTypeHint != null) r'org.apache.felix.https.keystore.key.password@TypeHint': encodeQueryParameter(_serializers, orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodKeyPeriodPasswordAtTypeHint, const FullType(String)),
      if (orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststore != null) r'org.apache.felix.https.truststore': encodeQueryParameter(_serializers, orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststore, const FullType(String)),
      if (orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststoreAtTypeHint != null) r'org.apache.felix.https.truststore@TypeHint': encodeQueryParameter(_serializers, orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststoreAtTypeHint, const FullType(String)),
      if (orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststorePeriodPassword != null) r'org.apache.felix.https.truststore.password': encodeQueryParameter(_serializers, orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststorePeriodPassword, const FullType(String)),
      if (orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststorePeriodPasswordAtTypeHint != null) r'org.apache.felix.https.truststore.password@TypeHint': encodeQueryParameter(_serializers, orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststorePeriodPasswordAtTypeHint, const FullType(String)),
      if (orgPeriodApachePeriodFelixPeriodHttpsPeriodClientcertificate != null) r'org.apache.felix.https.clientcertificate': encodeQueryParameter(_serializers, orgPeriodApachePeriodFelixPeriodHttpsPeriodClientcertificate, const FullType(String)),
      if (orgPeriodApachePeriodFelixPeriodHttpsPeriodClientcertificateAtTypeHint != null) r'org.apache.felix.https.clientcertificate@TypeHint': encodeQueryParameter(_serializers, orgPeriodApachePeriodFelixPeriodHttpsPeriodClientcertificateAtTypeHint, const FullType(String)),
      if (orgPeriodApachePeriodFelixPeriodHttpsPeriodEnable != null) r'org.apache.felix.https.enable': encodeQueryParameter(_serializers, orgPeriodApachePeriodFelixPeriodHttpsPeriodEnable, const FullType(bool)),
      if (orgPeriodApachePeriodFelixPeriodHttpsPeriodEnableAtTypeHint != null) r'org.apache.felix.https.enable@TypeHint': encodeQueryParameter(_serializers, orgPeriodApachePeriodFelixPeriodHttpsPeriodEnableAtTypeHint, const FullType(String)),
      if (orgPeriodOsgiPeriodServicePeriodHttpPeriodPortPeriodSecure != null) r'org.osgi.service.http.port.secure': encodeQueryParameter(_serializers, orgPeriodOsgiPeriodServicePeriodHttpPeriodPortPeriodSecure, const FullType(String)),
      if (orgPeriodOsgiPeriodServicePeriodHttpPeriodPortPeriodSecureAtTypeHint != null) r'org.osgi.service.http.port.secure@TypeHint': encodeQueryParameter(_serializers, orgPeriodOsgiPeriodServicePeriodHttpPeriodPortPeriodSecureAtTypeHint, const FullType(String)),
    };

    final _response = await _dio.request<Object>(
      _path,
      options: _options,
      queryParameters: _queryParameters,
      cancelToken: cancelToken,
      onSendProgress: onSendProgress,
      onReceiveProgress: onReceiveProgress,
    );

    return _response;
  }

  /// postConfigApacheHttpComponentsProxyConfiguration
  /// 
  ///
  /// Parameters:
  /// * [proxyPeriodHost] 
  /// * [proxyPeriodHostAtTypeHint] 
  /// * [proxyPeriodPort] 
  /// * [proxyPeriodPortAtTypeHint] 
  /// * [proxyPeriodExceptions] 
  /// * [proxyPeriodExceptionsAtTypeHint] 
  /// * [proxyPeriodEnabled] 
  /// * [proxyPeriodEnabledAtTypeHint] 
  /// * [proxyPeriodUser] 
  /// * [proxyPeriodUserAtTypeHint] 
  /// * [proxyPeriodPassword] 
  /// * [proxyPeriodPasswordAtTypeHint] 
  /// * [cancelToken] - A [CancelToken] that can be used to cancel the operation
  /// * [headers] - Can be used to add additional headers to the request
  /// * [extras] - Can be used to add flags to the request
  /// * [validateStatus] - A [ValidateStatus] callback that can be used to determine request success based on the HTTP status of the response
  /// * [onSendProgress] - A [ProgressCallback] that can be used to get the send progress
  /// * [onReceiveProgress] - A [ProgressCallback] that can be used to get the receive progress
  ///
  /// Returns a [Future]
  /// Throws [DioException] if API call or serialization fails
  Future<Response<void>> postConfigApacheHttpComponentsProxyConfiguration({ 
    String? proxyPeriodHost,
    String? proxyPeriodHostAtTypeHint,
    int? proxyPeriodPort,
    String? proxyPeriodPortAtTypeHint,
    BuiltList<String>? proxyPeriodExceptions,
    String? proxyPeriodExceptionsAtTypeHint,
    bool? proxyPeriodEnabled,
    String? proxyPeriodEnabledAtTypeHint,
    String? proxyPeriodUser,
    String? proxyPeriodUserAtTypeHint,
    String? proxyPeriodPassword,
    String? proxyPeriodPasswordAtTypeHint,
    CancelToken? cancelToken,
    Map<String, dynamic>? headers,
    Map<String, dynamic>? extra,
    ValidateStatus? validateStatus,
    ProgressCallback? onSendProgress,
    ProgressCallback? onReceiveProgress,
  }) async {
    final _path = r'/apps/system/config/org.apache.http.proxyconfigurator.config';
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
      validateStatus: validateStatus,
    );

    final _queryParameters = <String, dynamic>{
      if (proxyPeriodHost != null) r'proxy.host': encodeQueryParameter(_serializers, proxyPeriodHost, const FullType(String)),
      if (proxyPeriodHostAtTypeHint != null) r'proxy.host@TypeHint': encodeQueryParameter(_serializers, proxyPeriodHostAtTypeHint, const FullType(String)),
      if (proxyPeriodPort != null) r'proxy.port': encodeQueryParameter(_serializers, proxyPeriodPort, const FullType(int)),
      if (proxyPeriodPortAtTypeHint != null) r'proxy.port@TypeHint': encodeQueryParameter(_serializers, proxyPeriodPortAtTypeHint, const FullType(String)),
      if (proxyPeriodExceptions != null) r'proxy.exceptions': encodeCollectionQueryParameter<String>(_serializers, proxyPeriodExceptions, const FullType(BuiltList, [FullType(String)]), format: ListFormat.multi,),
      if (proxyPeriodExceptionsAtTypeHint != null) r'proxy.exceptions@TypeHint': encodeQueryParameter(_serializers, proxyPeriodExceptionsAtTypeHint, const FullType(String)),
      if (proxyPeriodEnabled != null) r'proxy.enabled': encodeQueryParameter(_serializers, proxyPeriodEnabled, const FullType(bool)),
      if (proxyPeriodEnabledAtTypeHint != null) r'proxy.enabled@TypeHint': encodeQueryParameter(_serializers, proxyPeriodEnabledAtTypeHint, const FullType(String)),
      if (proxyPeriodUser != null) r'proxy.user': encodeQueryParameter(_serializers, proxyPeriodUser, const FullType(String)),
      if (proxyPeriodUserAtTypeHint != null) r'proxy.user@TypeHint': encodeQueryParameter(_serializers, proxyPeriodUserAtTypeHint, const FullType(String)),
      if (proxyPeriodPassword != null) r'proxy.password': encodeQueryParameter(_serializers, proxyPeriodPassword, const FullType(String)),
      if (proxyPeriodPasswordAtTypeHint != null) r'proxy.password@TypeHint': encodeQueryParameter(_serializers, proxyPeriodPasswordAtTypeHint, const FullType(String)),
    };

    final _response = await _dio.request<Object>(
      _path,
      options: _options,
      queryParameters: _queryParameters,
      cancelToken: cancelToken,
      onSendProgress: onSendProgress,
      onReceiveProgress: onReceiveProgress,
    );

    return _response;
  }

  /// postConfigApacheSlingDavExServlet
  /// 
  ///
  /// Parameters:
  /// * [alias] 
  /// * [aliasAtTypeHint] 
  /// * [davPeriodCreateAbsoluteUri] 
  /// * [davPeriodCreateAbsoluteUriAtTypeHint] 
  /// * [cancelToken] - A [CancelToken] that can be used to cancel the operation
  /// * [headers] - Can be used to add additional headers to the request
  /// * [extras] - Can be used to add flags to the request
  /// * [validateStatus] - A [ValidateStatus] callback that can be used to determine request success based on the HTTP status of the response
  /// * [onSendProgress] - A [ProgressCallback] that can be used to get the send progress
  /// * [onReceiveProgress] - A [ProgressCallback] that can be used to get the receive progress
  ///
  /// Returns a [Future]
  /// Throws [DioException] if API call or serialization fails
  Future<Response<void>> postConfigApacheSlingDavExServlet({ 
    String? alias,
    String? aliasAtTypeHint,
    bool? davPeriodCreateAbsoluteUri,
    String? davPeriodCreateAbsoluteUriAtTypeHint,
    CancelToken? cancelToken,
    Map<String, dynamic>? headers,
    Map<String, dynamic>? extra,
    ValidateStatus? validateStatus,
    ProgressCallback? onSendProgress,
    ProgressCallback? onReceiveProgress,
  }) async {
    final _path = r'/apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet';
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
      validateStatus: validateStatus,
    );

    final _queryParameters = <String, dynamic>{
      if (alias != null) r'alias': encodeQueryParameter(_serializers, alias, const FullType(String)),
      if (aliasAtTypeHint != null) r'alias@TypeHint': encodeQueryParameter(_serializers, aliasAtTypeHint, const FullType(String)),
      if (davPeriodCreateAbsoluteUri != null) r'dav.create-absolute-uri': encodeQueryParameter(_serializers, davPeriodCreateAbsoluteUri, const FullType(bool)),
      if (davPeriodCreateAbsoluteUriAtTypeHint != null) r'dav.create-absolute-uri@TypeHint': encodeQueryParameter(_serializers, davPeriodCreateAbsoluteUriAtTypeHint, const FullType(String)),
    };

    final _response = await _dio.request<Object>(
      _path,
      options: _options,
      queryParameters: _queryParameters,
      cancelToken: cancelToken,
      onSendProgress: onSendProgress,
      onReceiveProgress: onReceiveProgress,
    );

    return _response;
  }

  /// postConfigApacheSlingGetServlet
  /// 
  ///
  /// Parameters:
  /// * [jsonPeriodMaximumresults] 
  /// * [jsonPeriodMaximumresultsAtTypeHint] 
  /// * [enablePeriodHtml] 
  /// * [enablePeriodHtmlAtTypeHint] 
  /// * [enablePeriodTxt] 
  /// * [enablePeriodTxtAtTypeHint] 
  /// * [enablePeriodXml] 
  /// * [enablePeriodXmlAtTypeHint] 
  /// * [cancelToken] - A [CancelToken] that can be used to cancel the operation
  /// * [headers] - Can be used to add additional headers to the request
  /// * [extras] - Can be used to add flags to the request
  /// * [validateStatus] - A [ValidateStatus] callback that can be used to determine request success based on the HTTP status of the response
  /// * [onSendProgress] - A [ProgressCallback] that can be used to get the send progress
  /// * [onReceiveProgress] - A [ProgressCallback] that can be used to get the receive progress
  ///
  /// Returns a [Future]
  /// Throws [DioException] if API call or serialization fails
  Future<Response<void>> postConfigApacheSlingGetServlet({ 
    String? jsonPeriodMaximumresults,
    String? jsonPeriodMaximumresultsAtTypeHint,
    bool? enablePeriodHtml,
    String? enablePeriodHtmlAtTypeHint,
    bool? enablePeriodTxt,
    String? enablePeriodTxtAtTypeHint,
    bool? enablePeriodXml,
    String? enablePeriodXmlAtTypeHint,
    CancelToken? cancelToken,
    Map<String, dynamic>? headers,
    Map<String, dynamic>? extra,
    ValidateStatus? validateStatus,
    ProgressCallback? onSendProgress,
    ProgressCallback? onReceiveProgress,
  }) async {
    final _path = r'/apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet';
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
      validateStatus: validateStatus,
    );

    final _queryParameters = <String, dynamic>{
      if (jsonPeriodMaximumresults != null) r'json.maximumresults': encodeQueryParameter(_serializers, jsonPeriodMaximumresults, const FullType(String)),
      if (jsonPeriodMaximumresultsAtTypeHint != null) r'json.maximumresults@TypeHint': encodeQueryParameter(_serializers, jsonPeriodMaximumresultsAtTypeHint, const FullType(String)),
      if (enablePeriodHtml != null) r'enable.html': encodeQueryParameter(_serializers, enablePeriodHtml, const FullType(bool)),
      if (enablePeriodHtmlAtTypeHint != null) r'enable.html@TypeHint': encodeQueryParameter(_serializers, enablePeriodHtmlAtTypeHint, const FullType(String)),
      if (enablePeriodTxt != null) r'enable.txt': encodeQueryParameter(_serializers, enablePeriodTxt, const FullType(bool)),
      if (enablePeriodTxtAtTypeHint != null) r'enable.txt@TypeHint': encodeQueryParameter(_serializers, enablePeriodTxtAtTypeHint, const FullType(String)),
      if (enablePeriodXml != null) r'enable.xml': encodeQueryParameter(_serializers, enablePeriodXml, const FullType(bool)),
      if (enablePeriodXmlAtTypeHint != null) r'enable.xml@TypeHint': encodeQueryParameter(_serializers, enablePeriodXmlAtTypeHint, const FullType(String)),
    };

    final _response = await _dio.request<Object>(
      _path,
      options: _options,
      queryParameters: _queryParameters,
      cancelToken: cancelToken,
      onSendProgress: onSendProgress,
      onReceiveProgress: onReceiveProgress,
    );

    return _response;
  }

  /// postConfigApacheSlingReferrerFilter
  /// 
  ///
  /// Parameters:
  /// * [allowPeriodEmpty] 
  /// * [allowPeriodEmptyAtTypeHint] 
  /// * [allowPeriodHosts] 
  /// * [allowPeriodHostsAtTypeHint] 
  /// * [allowPeriodHostsPeriodRegexp] 
  /// * [allowPeriodHostsPeriodRegexpAtTypeHint] 
  /// * [filterPeriodMethods] 
  /// * [filterPeriodMethodsAtTypeHint] 
  /// * [cancelToken] - A [CancelToken] that can be used to cancel the operation
  /// * [headers] - Can be used to add additional headers to the request
  /// * [extras] - Can be used to add flags to the request
  /// * [validateStatus] - A [ValidateStatus] callback that can be used to determine request success based on the HTTP status of the response
  /// * [onSendProgress] - A [ProgressCallback] that can be used to get the send progress
  /// * [onReceiveProgress] - A [ProgressCallback] that can be used to get the receive progress
  ///
  /// Returns a [Future]
  /// Throws [DioException] if API call or serialization fails
  Future<Response<void>> postConfigApacheSlingReferrerFilter({ 
    bool? allowPeriodEmpty,
    String? allowPeriodEmptyAtTypeHint,
    String? allowPeriodHosts,
    String? allowPeriodHostsAtTypeHint,
    String? allowPeriodHostsPeriodRegexp,
    String? allowPeriodHostsPeriodRegexpAtTypeHint,
    String? filterPeriodMethods,
    String? filterPeriodMethodsAtTypeHint,
    CancelToken? cancelToken,
    Map<String, dynamic>? headers,
    Map<String, dynamic>? extra,
    ValidateStatus? validateStatus,
    ProgressCallback? onSendProgress,
    ProgressCallback? onReceiveProgress,
  }) async {
    final _path = r'/apps/system/config/org.apache.sling.security.impl.ReferrerFilter';
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
      validateStatus: validateStatus,
    );

    final _queryParameters = <String, dynamic>{
      if (allowPeriodEmpty != null) r'allow.empty': encodeQueryParameter(_serializers, allowPeriodEmpty, const FullType(bool)),
      if (allowPeriodEmptyAtTypeHint != null) r'allow.empty@TypeHint': encodeQueryParameter(_serializers, allowPeriodEmptyAtTypeHint, const FullType(String)),
      if (allowPeriodHosts != null) r'allow.hosts': encodeQueryParameter(_serializers, allowPeriodHosts, const FullType(String)),
      if (allowPeriodHostsAtTypeHint != null) r'allow.hosts@TypeHint': encodeQueryParameter(_serializers, allowPeriodHostsAtTypeHint, const FullType(String)),
      if (allowPeriodHostsPeriodRegexp != null) r'allow.hosts.regexp': encodeQueryParameter(_serializers, allowPeriodHostsPeriodRegexp, const FullType(String)),
      if (allowPeriodHostsPeriodRegexpAtTypeHint != null) r'allow.hosts.regexp@TypeHint': encodeQueryParameter(_serializers, allowPeriodHostsPeriodRegexpAtTypeHint, const FullType(String)),
      if (filterPeriodMethods != null) r'filter.methods': encodeQueryParameter(_serializers, filterPeriodMethods, const FullType(String)),
      if (filterPeriodMethodsAtTypeHint != null) r'filter.methods@TypeHint': encodeQueryParameter(_serializers, filterPeriodMethodsAtTypeHint, const FullType(String)),
    };

    final _response = await _dio.request<Object>(
      _path,
      options: _options,
      queryParameters: _queryParameters,
      cancelToken: cancelToken,
      onSendProgress: onSendProgress,
      onReceiveProgress: onReceiveProgress,
    );

    return _response;
  }

  /// postConfigProperty
  /// 
  ///
  /// Parameters:
  /// * [configNodeName] 
  /// * [cancelToken] - A [CancelToken] that can be used to cancel the operation
  /// * [headers] - Can be used to add additional headers to the request
  /// * [extras] - Can be used to add flags to the request
  /// * [validateStatus] - A [ValidateStatus] callback that can be used to determine request success based on the HTTP status of the response
  /// * [onSendProgress] - A [ProgressCallback] that can be used to get the send progress
  /// * [onReceiveProgress] - A [ProgressCallback] that can be used to get the receive progress
  ///
  /// Returns a [Future]
  /// Throws [DioException] if API call or serialization fails
  Future<Response<void>> postConfigProperty({ 
    required String configNodeName,
    CancelToken? cancelToken,
    Map<String, dynamic>? headers,
    Map<String, dynamic>? extra,
    ValidateStatus? validateStatus,
    ProgressCallback? onSendProgress,
    ProgressCallback? onReceiveProgress,
  }) async {
    final _path = r'/apps/system/config/{configNodeName}'.replaceAll('{' r'configNodeName' '}', encodeQueryParameter(_serializers, configNodeName, const FullType(String)).toString());
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
      validateStatus: validateStatus,
    );

    final _response = await _dio.request<Object>(
      _path,
      options: _options,
      cancelToken: cancelToken,
      onSendProgress: onSendProgress,
      onReceiveProgress: onReceiveProgress,
    );

    return _response;
  }

  /// postNode
  /// 
  ///
  /// Parameters:
  /// * [path] 
  /// * [name] 
  /// * [colonOperation] 
  /// * [deleteAuthorizable] 
  /// * [file] 
  /// * [cancelToken] - A [CancelToken] that can be used to cancel the operation
  /// * [headers] - Can be used to add additional headers to the request
  /// * [extras] - Can be used to add flags to the request
  /// * [validateStatus] - A [ValidateStatus] callback that can be used to determine request success based on the HTTP status of the response
  /// * [onSendProgress] - A [ProgressCallback] that can be used to get the send progress
  /// * [onReceiveProgress] - A [ProgressCallback] that can be used to get the receive progress
  ///
  /// Returns a [Future]
  /// Throws [DioException] if API call or serialization fails
  Future<Response<void>> postNode({ 
    required String path,
    required String name,
    String? colonOperation,
    String? deleteAuthorizable,
    MultipartFile? file,
    CancelToken? cancelToken,
    Map<String, dynamic>? headers,
    Map<String, dynamic>? extra,
    ValidateStatus? validateStatus,
    ProgressCallback? onSendProgress,
    ProgressCallback? onReceiveProgress,
  }) async {
    final _path = r'/{path}/{name}'.replaceAll('{' r'path' '}', encodeQueryParameter(_serializers, path, const FullType(String)).toString()).replaceAll('{' r'name' '}', encodeQueryParameter(_serializers, name, const FullType(String)).toString());
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
      if (colonOperation != null) r':operation': encodeQueryParameter(_serializers, colonOperation, const FullType(String)),
      if (deleteAuthorizable != null) r'deleteAuthorizable': encodeQueryParameter(_serializers, deleteAuthorizable, const FullType(String)),
    };

    dynamic _bodyData;

    try {
      _bodyData = FormData.fromMap(<String, dynamic>{
        if (file != null) r'file': file,
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

    return _response;
  }

  /// postNodeRw
  /// 
  ///
  /// Parameters:
  /// * [path] 
  /// * [name] 
  /// * [addMembers] 
  /// * [cancelToken] - A [CancelToken] that can be used to cancel the operation
  /// * [headers] - Can be used to add additional headers to the request
  /// * [extras] - Can be used to add flags to the request
  /// * [validateStatus] - A [ValidateStatus] callback that can be used to determine request success based on the HTTP status of the response
  /// * [onSendProgress] - A [ProgressCallback] that can be used to get the send progress
  /// * [onReceiveProgress] - A [ProgressCallback] that can be used to get the receive progress
  ///
  /// Returns a [Future]
  /// Throws [DioException] if API call or serialization fails
  Future<Response<void>> postNodeRw({ 
    required String path,
    required String name,
    String? addMembers,
    CancelToken? cancelToken,
    Map<String, dynamic>? headers,
    Map<String, dynamic>? extra,
    ValidateStatus? validateStatus,
    ProgressCallback? onSendProgress,
    ProgressCallback? onReceiveProgress,
  }) async {
    final _path = r'/{path}/{name}.rw.html'.replaceAll('{' r'path' '}', encodeQueryParameter(_serializers, path, const FullType(String)).toString()).replaceAll('{' r'name' '}', encodeQueryParameter(_serializers, name, const FullType(String)).toString());
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
      validateStatus: validateStatus,
    );

    final _queryParameters = <String, dynamic>{
      if (addMembers != null) r'addMembers': encodeQueryParameter(_serializers, addMembers, const FullType(String)),
    };

    final _response = await _dio.request<Object>(
      _path,
      options: _options,
      queryParameters: _queryParameters,
      cancelToken: cancelToken,
      onSendProgress: onSendProgress,
      onReceiveProgress: onReceiveProgress,
    );

    return _response;
  }

  /// postPath
  /// 
  ///
  /// Parameters:
  /// * [path] 
  /// * [jcrColonPrimaryType] 
  /// * [colonName] 
  /// * [cancelToken] - A [CancelToken] that can be used to cancel the operation
  /// * [headers] - Can be used to add additional headers to the request
  /// * [extras] - Can be used to add flags to the request
  /// * [validateStatus] - A [ValidateStatus] callback that can be used to determine request success based on the HTTP status of the response
  /// * [onSendProgress] - A [ProgressCallback] that can be used to get the send progress
  /// * [onReceiveProgress] - A [ProgressCallback] that can be used to get the receive progress
  ///
  /// Returns a [Future]
  /// Throws [DioException] if API call or serialization fails
  Future<Response<void>> postPath({ 
    required String path,
    required String jcrColonPrimaryType,
    required String colonName,
    CancelToken? cancelToken,
    Map<String, dynamic>? headers,
    Map<String, dynamic>? extra,
    ValidateStatus? validateStatus,
    ProgressCallback? onSendProgress,
    ProgressCallback? onReceiveProgress,
  }) async {
    final _path = r'/{path}/'.replaceAll('{' r'path' '}', encodeQueryParameter(_serializers, path, const FullType(String)).toString());
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
      validateStatus: validateStatus,
    );

    final _queryParameters = <String, dynamic>{
      r'jcr:primaryType': encodeQueryParameter(_serializers, jcrColonPrimaryType, const FullType(String)),
      r':name': encodeQueryParameter(_serializers, colonName, const FullType(String)),
    };

    final _response = await _dio.request<Object>(
      _path,
      options: _options,
      queryParameters: _queryParameters,
      cancelToken: cancelToken,
      onSendProgress: onSendProgress,
      onReceiveProgress: onReceiveProgress,
    );

    return _response;
  }

  /// postQuery
  /// 
  ///
  /// Parameters:
  /// * [path] 
  /// * [pPeriodLimit] 
  /// * [n1property] 
  /// * [n1propertyPeriodValue] 
  /// * [cancelToken] - A [CancelToken] that can be used to cancel the operation
  /// * [headers] - Can be used to add additional headers to the request
  /// * [extras] - Can be used to add flags to the request
  /// * [validateStatus] - A [ValidateStatus] callback that can be used to determine request success based on the HTTP status of the response
  /// * [onSendProgress] - A [ProgressCallback] that can be used to get the send progress
  /// * [onReceiveProgress] - A [ProgressCallback] that can be used to get the receive progress
  ///
  /// Returns a [Future] containing a [Response] with a [String] as data
  /// Throws [DioException] if API call or serialization fails
  Future<Response<String>> postQuery({ 
    required String path,
    required num pPeriodLimit,
    required String n1property,
    required String n1propertyPeriodValue,
    CancelToken? cancelToken,
    Map<String, dynamic>? headers,
    Map<String, dynamic>? extra,
    ValidateStatus? validateStatus,
    ProgressCallback? onSendProgress,
    ProgressCallback? onReceiveProgress,
  }) async {
    final _path = r'/bin/querybuilder.json';
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
      validateStatus: validateStatus,
    );

    final _queryParameters = <String, dynamic>{
      r'path': encodeQueryParameter(_serializers, path, const FullType(String)),
      r'p.limit': encodeQueryParameter(_serializers, pPeriodLimit, const FullType(num)),
      r'1_property': encodeQueryParameter(_serializers, n1property, const FullType(String)),
      r'1_property.value': encodeQueryParameter(_serializers, n1propertyPeriodValue, const FullType(String)),
    };

    final _response = await _dio.request<Object>(
      _path,
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

  /// postTreeActivation
  /// 
  ///
  /// Parameters:
  /// * [ignoredeactivated] 
  /// * [onlymodified] 
  /// * [path] 
  /// * [cmd] 
  /// * [cancelToken] - A [CancelToken] that can be used to cancel the operation
  /// * [headers] - Can be used to add additional headers to the request
  /// * [extras] - Can be used to add flags to the request
  /// * [validateStatus] - A [ValidateStatus] callback that can be used to determine request success based on the HTTP status of the response
  /// * [onSendProgress] - A [ProgressCallback] that can be used to get the send progress
  /// * [onReceiveProgress] - A [ProgressCallback] that can be used to get the receive progress
  ///
  /// Returns a [Future]
  /// Throws [DioException] if API call or serialization fails
  Future<Response<void>> postTreeActivation({ 
    required bool ignoredeactivated,
    required bool onlymodified,
    required String path,
    String cmd = 'activate',
    CancelToken? cancelToken,
    Map<String, dynamic>? headers,
    Map<String, dynamic>? extra,
    ValidateStatus? validateStatus,
    ProgressCallback? onSendProgress,
    ProgressCallback? onReceiveProgress,
  }) async {
    final _path = r'/libs/replication/treeactivation.html';
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
      validateStatus: validateStatus,
    );

    final _queryParameters = <String, dynamic>{
      r'ignoredeactivated': encodeQueryParameter(_serializers, ignoredeactivated, const FullType(bool)),
      r'onlymodified': encodeQueryParameter(_serializers, onlymodified, const FullType(bool)),
      r'path': encodeQueryParameter(_serializers, path, const FullType(String)),
      r'cmd': encodeQueryParameter(_serializers, cmd, const FullType(String)),
    };

    final _response = await _dio.request<Object>(
      _path,
      options: _options,
      queryParameters: _queryParameters,
      cancelToken: cancelToken,
      onSendProgress: onSendProgress,
      onReceiveProgress: onReceiveProgress,
    );

    return _response;
  }

  /// postTruststore
  /// 
  ///
  /// Parameters:
  /// * [colonOperation] 
  /// * [newPassword] 
  /// * [rePassword] 
  /// * [keyStoreType] 
  /// * [removeAlias] 
  /// * [certificate] 
  /// * [cancelToken] - A [CancelToken] that can be used to cancel the operation
  /// * [headers] - Can be used to add additional headers to the request
  /// * [extras] - Can be used to add flags to the request
  /// * [validateStatus] - A [ValidateStatus] callback that can be used to determine request success based on the HTTP status of the response
  /// * [onSendProgress] - A [ProgressCallback] that can be used to get the send progress
  /// * [onReceiveProgress] - A [ProgressCallback] that can be used to get the receive progress
  ///
  /// Returns a [Future] containing a [Response] with a [String] as data
  /// Throws [DioException] if API call or serialization fails
  Future<Response<String>> postTruststore({ 
    String? colonOperation,
    String? newPassword,
    String? rePassword,
    String? keyStoreType,
    String? removeAlias,
    MultipartFile? certificate,
    CancelToken? cancelToken,
    Map<String, dynamic>? headers,
    Map<String, dynamic>? extra,
    ValidateStatus? validateStatus,
    ProgressCallback? onSendProgress,
    ProgressCallback? onReceiveProgress,
  }) async {
    final _path = r'/libs/granite/security/post/truststore';
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
      if (colonOperation != null) r':operation': encodeQueryParameter(_serializers, colonOperation, const FullType(String)),
      if (newPassword != null) r'newPassword': encodeQueryParameter(_serializers, newPassword, const FullType(String)),
      if (rePassword != null) r'rePassword': encodeQueryParameter(_serializers, rePassword, const FullType(String)),
      if (keyStoreType != null) r'keyStoreType': encodeQueryParameter(_serializers, keyStoreType, const FullType(String)),
      if (removeAlias != null) r'removeAlias': encodeQueryParameter(_serializers, removeAlias, const FullType(String)),
    };

    dynamic _bodyData;

    try {
      _bodyData = FormData.fromMap(<String, dynamic>{
        if (certificate != null) r'certificate': certificate,
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

  /// postTruststorePKCS12
  /// 
  ///
  /// Parameters:
  /// * [truststorePeriodP12] 
  /// * [cancelToken] - A [CancelToken] that can be used to cancel the operation
  /// * [headers] - Can be used to add additional headers to the request
  /// * [extras] - Can be used to add flags to the request
  /// * [validateStatus] - A [ValidateStatus] callback that can be used to determine request success based on the HTTP status of the response
  /// * [onSendProgress] - A [ProgressCallback] that can be used to get the send progress
  /// * [onReceiveProgress] - A [ProgressCallback] that can be used to get the receive progress
  ///
  /// Returns a [Future] containing a [Response] with a [String] as data
  /// Throws [DioException] if API call or serialization fails
  Future<Response<String>> postTruststorePKCS12({ 
    MultipartFile? truststorePeriodP12,
    CancelToken? cancelToken,
    Map<String, dynamic>? headers,
    Map<String, dynamic>? extra,
    ValidateStatus? validateStatus,
    ProgressCallback? onSendProgress,
    ProgressCallback? onReceiveProgress,
  }) async {
    final _path = r'/etc/truststore';
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

    dynamic _bodyData;

    try {
      _bodyData = FormData.fromMap(<String, dynamic>{
        if (truststorePeriodP12 != null) r'truststore.p12': truststorePeriodP12,
      });

    } catch(error, stackTrace) {
      throw DioException(
         requestOptions: _options.compose(
          _dio.options,
          _path,
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
