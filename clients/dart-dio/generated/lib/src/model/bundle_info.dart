//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/bundle_data.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'bundle_info.g.dart';

/// BundleInfo
///
/// Properties:
/// * [status] - Status description of all bundles
/// * [s] 
/// * [data] 
@BuiltValue()
abstract class BundleInfo implements Built<BundleInfo, BundleInfoBuilder> {
  /// Status description of all bundles
  @BuiltValueField(wireName: r'status')
  String? get status;

  @BuiltValueField(wireName: r's')
  BuiltList<int>? get s;

  @BuiltValueField(wireName: r'data')
  BuiltList<BundleData>? get data;

  BundleInfo._();

  factory BundleInfo([void updates(BundleInfoBuilder b)]) = _$BundleInfo;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(BundleInfoBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<BundleInfo> get serializer => _$BundleInfoSerializer();
}

class _$BundleInfoSerializer implements PrimitiveSerializer<BundleInfo> {
  @override
  final Iterable<Type> types = const [BundleInfo, _$BundleInfo];

  @override
  final String wireName = r'BundleInfo';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    BundleInfo object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.status != null) {
      yield r'status';
      yield serializers.serialize(
        object.status,
        specifiedType: const FullType(String),
      );
    }
    if (object.s != null) {
      yield r's';
      yield serializers.serialize(
        object.s,
        specifiedType: const FullType(BuiltList, [FullType(int)]),
      );
    }
    if (object.data != null) {
      yield r'data';
      yield serializers.serialize(
        object.data,
        specifiedType: const FullType(BuiltList, [FullType(BundleData)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    BundleInfo object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required BundleInfoBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'status':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.status = valueDes;
          break;
        case r's':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(int)]),
          ) as BuiltList<int>?;
          if (valueDes == null) continue;
          result.s.replace(valueDes);
          break;
        case r'data':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(BundleData)]),
          ) as BuiltList<BundleData>?;
          if (valueDes == null) continue;
          result.data.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  BundleInfo deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = BundleInfoBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}

