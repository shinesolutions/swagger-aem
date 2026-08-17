//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/truststore_items.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'truststore_info.g.dart';

/// TruststoreInfo
///
/// Properties:
/// * [aliases] 
/// * [exists] - False if truststore don't exist
@BuiltValue()
abstract class TruststoreInfo implements Built<TruststoreInfo, TruststoreInfoBuilder> {
  @BuiltValueField(wireName: r'aliases')
  BuiltList<TruststoreItems>? get aliases;

  /// False if truststore don't exist
  @BuiltValueField(wireName: r'exists')
  bool? get exists;

  TruststoreInfo._();

  factory TruststoreInfo([void updates(TruststoreInfoBuilder b)]) = _$TruststoreInfo;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(TruststoreInfoBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<TruststoreInfo> get serializer => _$TruststoreInfoSerializer();
}

class _$TruststoreInfoSerializer implements PrimitiveSerializer<TruststoreInfo> {
  @override
  final Iterable<Type> types = const [TruststoreInfo, _$TruststoreInfo];

  @override
  final String wireName = r'TruststoreInfo';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    TruststoreInfo object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.aliases != null) {
      yield r'aliases';
      yield serializers.serialize(
        object.aliases,
        specifiedType: const FullType(BuiltList, [FullType(TruststoreItems)]),
      );
    }
    if (object.exists != null) {
      yield r'exists';
      yield serializers.serialize(
        object.exists,
        specifiedType: const FullType(bool),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    TruststoreInfo object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required TruststoreInfoBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'aliases':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(TruststoreItems)]),
          ) as BuiltList<TruststoreItems>?;
          if (valueDes == null) continue;
          result.aliases.replace(valueDes);
          break;
        case r'exists':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.exists = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  TruststoreInfo deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = TruststoreInfoBuilder();
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

