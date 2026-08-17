//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/keystore_items.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'keystore_info.g.dart';

/// KeystoreInfo
///
/// Properties:
/// * [aliases] 
/// * [exists] - False if truststore don't exist
@BuiltValue()
abstract class KeystoreInfo implements Built<KeystoreInfo, KeystoreInfoBuilder> {
  @BuiltValueField(wireName: r'aliases')
  BuiltList<KeystoreItems>? get aliases;

  /// False if truststore don't exist
  @BuiltValueField(wireName: r'exists')
  bool? get exists;

  KeystoreInfo._();

  factory KeystoreInfo([void updates(KeystoreInfoBuilder b)]) = _$KeystoreInfo;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(KeystoreInfoBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<KeystoreInfo> get serializer => _$KeystoreInfoSerializer();
}

class _$KeystoreInfoSerializer implements PrimitiveSerializer<KeystoreInfo> {
  @override
  final Iterable<Type> types = const [KeystoreInfo, _$KeystoreInfo];

  @override
  final String wireName = r'KeystoreInfo';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    KeystoreInfo object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.aliases != null) {
      yield r'aliases';
      yield serializers.serialize(
        object.aliases,
        specifiedType: const FullType(BuiltList, [FullType(KeystoreItems)]),
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
    KeystoreInfo object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required KeystoreInfoBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'aliases':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(KeystoreItems)]),
          ) as BuiltList<KeystoreItems>?;
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
  KeystoreInfo deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = KeystoreInfoBuilder();
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

