//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

import 'dart:async';

import 'package:built_value/json_object.dart';
import 'package:built_value/serializer.dart';
import 'package:dio/dio.dart';

import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/api_util.dart';
import 'package:openapi/src/model/bundle_info.dart';
import 'package:openapi/src/model/saml_configuration_info.dart';

class ConsoleApi {

  final Dio _dio;

  final Serializers _serializers;

  const ConsoleApi(this._dio, this._serializers);

  /// getAemProductInfo
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
  /// Returns a [Future] containing a [Response] with a [BuiltList<String>] as data
  /// Throws [DioException] if API call or serialization fails
  Future<Response<BuiltList<String>>> getAemProductInfo({ 
    CancelToken? cancelToken,
    Map<String, dynamic>? headers,
    Map<String, dynamic>? extra,
    ValidateStatus? validateStatus,
    ProgressCallback? onSendProgress,
    ProgressCallback? onReceiveProgress,
  }) async {
    final _path = r'/system/console/status-productinfo.json';
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

    BuiltList<String>? _responseData;

    try {
      final rawResponse = _response.data;
      _responseData = rawResponse == null ? null : _serializers.deserialize(
        rawResponse,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      ) as BuiltList<String>;

    } catch (error, stackTrace) {
      throw DioException(
        requestOptions: _response.requestOptions,
        response: _response,
        type: DioExceptionType.unknown,
        error: error,
        stackTrace: stackTrace,
      );
    }

    return Response<BuiltList<String>>(
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

  /// getBundleInfo
  /// 
  ///
  /// Parameters:
  /// * [name] 
  /// * [cancelToken] - A [CancelToken] that can be used to cancel the operation
  /// * [headers] - Can be used to add additional headers to the request
  /// * [extras] - Can be used to add flags to the request
  /// * [validateStatus] - A [ValidateStatus] callback that can be used to determine request success based on the HTTP status of the response
  /// * [onSendProgress] - A [ProgressCallback] that can be used to get the send progress
  /// * [onReceiveProgress] - A [ProgressCallback] that can be used to get the receive progress
  ///
  /// Returns a [Future] containing a [Response] with a [BundleInfo] as data
  /// Throws [DioException] if API call or serialization fails
  Future<Response<BundleInfo>> getBundleInfo({ 
    required String name,
    CancelToken? cancelToken,
    Map<String, dynamic>? headers,
    Map<String, dynamic>? extra,
    ValidateStatus? validateStatus,
    ProgressCallback? onSendProgress,
    ProgressCallback? onReceiveProgress,
  }) async {
    final _path = r'/system/console/bundles/{name}.json'.replaceAll('{' r'name' '}', encodeQueryParameter(_serializers, name, const FullType(String)).toString());
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

    BundleInfo? _responseData;

    try {
      final rawResponse = _response.data;
      _responseData = rawResponse == null ? null : _serializers.deserialize(
        rawResponse,
        specifiedType: const FullType(BundleInfo),
      ) as BundleInfo;

    } catch (error, stackTrace) {
      throw DioException(
        requestOptions: _response.requestOptions,
        response: _response,
        type: DioExceptionType.unknown,
        error: error,
        stackTrace: stackTrace,
      );
    }

    return Response<BundleInfo>(
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

  /// getConfigMgr
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
  /// Returns a [Future] containing a [Response] with a [String] as data
  /// Throws [DioException] if API call or serialization fails
  Future<Response<String>> getConfigMgr({ 
    CancelToken? cancelToken,
    Map<String, dynamic>? headers,
    Map<String, dynamic>? extra,
    ValidateStatus? validateStatus,
    ProgressCallback? onSendProgress,
    ProgressCallback? onReceiveProgress,
  }) async {
    final _path = r'/system/console/configMgr';
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

  /// postBundle
  /// 
  ///
  /// Parameters:
  /// * [name] 
  /// * [action] 
  /// * [cancelToken] - A [CancelToken] that can be used to cancel the operation
  /// * [headers] - Can be used to add additional headers to the request
  /// * [extras] - Can be used to add flags to the request
  /// * [validateStatus] - A [ValidateStatus] callback that can be used to determine request success based on the HTTP status of the response
  /// * [onSendProgress] - A [ProgressCallback] that can be used to get the send progress
  /// * [onReceiveProgress] - A [ProgressCallback] that can be used to get the receive progress
  ///
  /// Returns a [Future]
  /// Throws [DioException] if API call or serialization fails
  Future<Response<void>> postBundle({ 
    required String name,
    required String action,
    CancelToken? cancelToken,
    Map<String, dynamic>? headers,
    Map<String, dynamic>? extra,
    ValidateStatus? validateStatus,
    ProgressCallback? onSendProgress,
    ProgressCallback? onReceiveProgress,
  }) async {
    final _path = r'/system/console/bundles/{name}'.replaceAll('{' r'name' '}', encodeQueryParameter(_serializers, name, const FullType(String)).toString());
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
      r'action': encodeQueryParameter(_serializers, action, const FullType(String)),
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

  /// postJmxRepository
  /// 
  ///
  /// Parameters:
  /// * [action] 
  /// * [cancelToken] - A [CancelToken] that can be used to cancel the operation
  /// * [headers] - Can be used to add additional headers to the request
  /// * [extras] - Can be used to add flags to the request
  /// * [validateStatus] - A [ValidateStatus] callback that can be used to determine request success based on the HTTP status of the response
  /// * [onSendProgress] - A [ProgressCallback] that can be used to get the send progress
  /// * [onReceiveProgress] - A [ProgressCallback] that can be used to get the receive progress
  ///
  /// Returns a [Future]
  /// Throws [DioException] if API call or serialization fails
  Future<Response<void>> postJmxRepository({ 
    required String action,
    CancelToken? cancelToken,
    Map<String, dynamic>? headers,
    Map<String, dynamic>? extra,
    ValidateStatus? validateStatus,
    ProgressCallback? onSendProgress,
    ProgressCallback? onReceiveProgress,
  }) async {
    final _path = r'/system/console/jmx/com.adobe.granite:type=Repository/op/{action}'.replaceAll('{' r'action' '}', encodeQueryParameter(_serializers, action, const FullType(String)).toString());
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

  /// postSamlConfiguration
  /// 
  ///
  /// Parameters:
  /// * [post] 
  /// * [apply] 
  /// * [delete] 
  /// * [action] 
  /// * [dollarLocation] 
  /// * [path] 
  /// * [servicePeriodRanking] 
  /// * [idpUrl] 
  /// * [idpCertAlias] 
  /// * [idpHttpRedirect] 
  /// * [serviceProviderEntityId] 
  /// * [assertionConsumerServiceURL] 
  /// * [spPrivateKeyAlias] 
  /// * [keyStorePassword] 
  /// * [defaultRedirectUrl] 
  /// * [userIDAttribute] 
  /// * [useEncryption] 
  /// * [createUser] 
  /// * [addGroupMemberships] 
  /// * [groupMembershipAttribute] 
  /// * [defaultGroups] 
  /// * [nameIdFormat] 
  /// * [synchronizeAttributes] 
  /// * [handleLogout] 
  /// * [logoutUrl] 
  /// * [clockTolerance] 
  /// * [digestMethod] 
  /// * [signatureMethod] 
  /// * [userIntermediatePath] 
  /// * [propertylist] 
  /// * [cancelToken] - A [CancelToken] that can be used to cancel the operation
  /// * [headers] - Can be used to add additional headers to the request
  /// * [extras] - Can be used to add flags to the request
  /// * [validateStatus] - A [ValidateStatus] callback that can be used to determine request success based on the HTTP status of the response
  /// * [onSendProgress] - A [ProgressCallback] that can be used to get the send progress
  /// * [onReceiveProgress] - A [ProgressCallback] that can be used to get the receive progress
  ///
  /// Returns a [Future] containing a [Response] with a [SamlConfigurationInfo] as data
  /// Throws [DioException] if API call or serialization fails
  Future<Response<SamlConfigurationInfo>> postSamlConfiguration({ 
    bool? post,
    bool? apply,
    bool? delete,
    String? action,
    String? dollarLocation,
    BuiltList<String>? path,
    int? servicePeriodRanking,
    String? idpUrl,
    String? idpCertAlias,
    bool? idpHttpRedirect,
    String? serviceProviderEntityId,
    String? assertionConsumerServiceURL,
    String? spPrivateKeyAlias,
    String? keyStorePassword,
    String? defaultRedirectUrl,
    String? userIDAttribute,
    bool? useEncryption,
    bool? createUser,
    bool? addGroupMemberships,
    String? groupMembershipAttribute,
    BuiltList<String>? defaultGroups,
    String? nameIdFormat,
    BuiltList<String>? synchronizeAttributes,
    bool? handleLogout,
    String? logoutUrl,
    int? clockTolerance,
    String? digestMethod,
    String? signatureMethod,
    String? userIntermediatePath,
    BuiltList<String>? propertylist,
    CancelToken? cancelToken,
    Map<String, dynamic>? headers,
    Map<String, dynamic>? extra,
    ValidateStatus? validateStatus,
    ProgressCallback? onSendProgress,
    ProgressCallback? onReceiveProgress,
  }) async {
    final _path = r'/system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler';
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
      if (post != null) r'post': encodeQueryParameter(_serializers, post, const FullType(bool)),
      if (apply != null) r'apply': encodeQueryParameter(_serializers, apply, const FullType(bool)),
      if (delete != null) r'delete': encodeQueryParameter(_serializers, delete, const FullType(bool)),
      if (action != null) r'action': encodeQueryParameter(_serializers, action, const FullType(String)),
      if (dollarLocation != null) r'$location': encodeQueryParameter(_serializers, dollarLocation, const FullType(String)),
      if (path != null) r'path': encodeCollectionQueryParameter<String>(_serializers, path, const FullType(BuiltList, [FullType(String)]), format: ListFormat.multi,),
      if (servicePeriodRanking != null) r'service.ranking': encodeQueryParameter(_serializers, servicePeriodRanking, const FullType(int)),
      if (idpUrl != null) r'idpUrl': encodeQueryParameter(_serializers, idpUrl, const FullType(String)),
      if (idpCertAlias != null) r'idpCertAlias': encodeQueryParameter(_serializers, idpCertAlias, const FullType(String)),
      if (idpHttpRedirect != null) r'idpHttpRedirect': encodeQueryParameter(_serializers, idpHttpRedirect, const FullType(bool)),
      if (serviceProviderEntityId != null) r'serviceProviderEntityId': encodeQueryParameter(_serializers, serviceProviderEntityId, const FullType(String)),
      if (assertionConsumerServiceURL != null) r'assertionConsumerServiceURL': encodeQueryParameter(_serializers, assertionConsumerServiceURL, const FullType(String)),
      if (spPrivateKeyAlias != null) r'spPrivateKeyAlias': encodeQueryParameter(_serializers, spPrivateKeyAlias, const FullType(String)),
      if (keyStorePassword != null) r'keyStorePassword': encodeQueryParameter(_serializers, keyStorePassword, const FullType(String)),
      if (defaultRedirectUrl != null) r'defaultRedirectUrl': encodeQueryParameter(_serializers, defaultRedirectUrl, const FullType(String)),
      if (userIDAttribute != null) r'userIDAttribute': encodeQueryParameter(_serializers, userIDAttribute, const FullType(String)),
      if (useEncryption != null) r'useEncryption': encodeQueryParameter(_serializers, useEncryption, const FullType(bool)),
      if (createUser != null) r'createUser': encodeQueryParameter(_serializers, createUser, const FullType(bool)),
      if (addGroupMemberships != null) r'addGroupMemberships': encodeQueryParameter(_serializers, addGroupMemberships, const FullType(bool)),
      if (groupMembershipAttribute != null) r'groupMembershipAttribute': encodeQueryParameter(_serializers, groupMembershipAttribute, const FullType(String)),
      if (defaultGroups != null) r'defaultGroups': encodeCollectionQueryParameter<String>(_serializers, defaultGroups, const FullType(BuiltList, [FullType(String)]), format: ListFormat.multi,),
      if (nameIdFormat != null) r'nameIdFormat': encodeQueryParameter(_serializers, nameIdFormat, const FullType(String)),
      if (synchronizeAttributes != null) r'synchronizeAttributes': encodeCollectionQueryParameter<String>(_serializers, synchronizeAttributes, const FullType(BuiltList, [FullType(String)]), format: ListFormat.multi,),
      if (handleLogout != null) r'handleLogout': encodeQueryParameter(_serializers, handleLogout, const FullType(bool)),
      if (logoutUrl != null) r'logoutUrl': encodeQueryParameter(_serializers, logoutUrl, const FullType(String)),
      if (clockTolerance != null) r'clockTolerance': encodeQueryParameter(_serializers, clockTolerance, const FullType(int)),
      if (digestMethod != null) r'digestMethod': encodeQueryParameter(_serializers, digestMethod, const FullType(String)),
      if (signatureMethod != null) r'signatureMethod': encodeQueryParameter(_serializers, signatureMethod, const FullType(String)),
      if (userIntermediatePath != null) r'userIntermediatePath': encodeQueryParameter(_serializers, userIntermediatePath, const FullType(String)),
      if (propertylist != null) r'propertylist': encodeCollectionQueryParameter<String>(_serializers, propertylist, const FullType(BuiltList, [FullType(String)]), format: ListFormat.csv,),
    };

    final _response = await _dio.request<Object>(
      _path,
      options: _options,
      queryParameters: _queryParameters,
      cancelToken: cancelToken,
      onSendProgress: onSendProgress,
      onReceiveProgress: onReceiveProgress,
    );

    SamlConfigurationInfo? _responseData;

    try {
      final rawResponse = _response.data;
      _responseData = rawResponse == null ? null : _serializers.deserialize(
        rawResponse,
        specifiedType: const FullType(SamlConfigurationInfo),
      ) as SamlConfigurationInfo;

    } catch (error, stackTrace) {
      throw DioException(
        requestOptions: _response.requestOptions,
        response: _response,
        type: DioExceptionType.unknown,
        error: error,
        stackTrace: stackTrace,
      );
    }

    return Response<SamlConfigurationInfo>(
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
