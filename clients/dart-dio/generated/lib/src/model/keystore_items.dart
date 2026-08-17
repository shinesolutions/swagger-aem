//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/keystore_chain_items.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'keystore_items.g.dart';

/// KeystoreItems
///
/// Properties:
/// * [alias] - Keystore alias name
/// * [entryType] - e.g. \"privateKey\"
/// * [algorithm] - e.g. \"RSA\"
/// * [format] - e.g. \"PKCS#8\"
/// * [chain] 
@BuiltValue()
abstract class KeystoreItems implements Built<KeystoreItems, KeystoreItemsBuilder> {
  /// Keystore alias name
  @BuiltValueField(wireName: r'alias')
  String? get alias;

  /// e.g. \"privateKey\"
  @BuiltValueField(wireName: r'entryType')
  String? get entryType;

  /// e.g. \"RSA\"
  @BuiltValueField(wireName: r'algorithm')
  String? get algorithm;

  /// e.g. \"PKCS#8\"
  @BuiltValueField(wireName: r'format')
  String? get format;

  @BuiltValueField(wireName: r'chain')
  BuiltList<KeystoreChainItems>? get chain;

  KeystoreItems._();

  factory KeystoreItems([void updates(KeystoreItemsBuilder b)]) = _$KeystoreItems;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(KeystoreItemsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<KeystoreItems> get serializer => _$KeystoreItemsSerializer();
}

class _$KeystoreItemsSerializer implements PrimitiveSerializer<KeystoreItems> {
  @override
  final Iterable<Type> types = const [KeystoreItems, _$KeystoreItems];

  @override
  final String wireName = r'KeystoreItems';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    KeystoreItems object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.alias != null) {
      yield r'alias';
      yield serializers.serialize(
        object.alias,
        specifiedType: const FullType(String),
      );
    }
    if (object.entryType != null) {
      yield r'entryType';
      yield serializers.serialize(
        object.entryType,
        specifiedType: const FullType(String),
      );
    }
    if (object.algorithm != null) {
      yield r'algorithm';
      yield serializers.serialize(
        object.algorithm,
        specifiedType: const FullType(String),
      );
    }
    if (object.format != null) {
      yield r'format';
      yield serializers.serialize(
        object.format,
        specifiedType: const FullType(String),
      );
    }
    if (object.chain != null) {
      yield r'chain';
      yield serializers.serialize(
        object.chain,
        specifiedType: const FullType(BuiltList, [FullType(KeystoreChainItems)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    KeystoreItems object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required KeystoreItemsBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'alias':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.alias = valueDes;
          break;
        case r'entryType':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.entryType = valueDes;
          break;
        case r'algorithm':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.algorithm = valueDes;
          break;
        case r'format':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.format = valueDes;
          break;
        case r'chain':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(KeystoreChainItems)]),
          ) as BuiltList<KeystoreChainItems>?;
          if (valueDes == null) continue;
          result.chain.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  KeystoreItems deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = KeystoreItemsBuilder();
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

