//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'truststore_items.g.dart';

/// TruststoreItems
///
/// Properties:
/// * [alias] - Truststore alias name
/// * [entryType] 
/// * [subject] - e.g. \"CN=localhost\"
/// * [issuer] - e.g. \"CN=Admin\"
/// * [notBefore] - e.g. \"Sun Jul 01 12:00:00 AEST 2018\"
/// * [notAfter] - e.g. \"Sun Jun 30 23:59:50 AEST 2019\"
/// * [serialNumber] - 18165099476682912368
@BuiltValue()
abstract class TruststoreItems implements Built<TruststoreItems, TruststoreItemsBuilder> {
  /// Truststore alias name
  @BuiltValueField(wireName: r'alias')
  String? get alias;

  @BuiltValueField(wireName: r'entryType')
  String? get entryType;

  /// e.g. \"CN=localhost\"
  @BuiltValueField(wireName: r'subject')
  String? get subject;

  /// e.g. \"CN=Admin\"
  @BuiltValueField(wireName: r'issuer')
  String? get issuer;

  /// e.g. \"Sun Jul 01 12:00:00 AEST 2018\"
  @BuiltValueField(wireName: r'notBefore')
  String? get notBefore;

  /// e.g. \"Sun Jun 30 23:59:50 AEST 2019\"
  @BuiltValueField(wireName: r'notAfter')
  String? get notAfter;

  /// 18165099476682912368
  @BuiltValueField(wireName: r'serialNumber')
  int? get serialNumber;

  TruststoreItems._();

  factory TruststoreItems([void updates(TruststoreItemsBuilder b)]) = _$TruststoreItems;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(TruststoreItemsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<TruststoreItems> get serializer => _$TruststoreItemsSerializer();
}

class _$TruststoreItemsSerializer implements PrimitiveSerializer<TruststoreItems> {
  @override
  final Iterable<Type> types = const [TruststoreItems, _$TruststoreItems];

  @override
  final String wireName = r'TruststoreItems';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    TruststoreItems object, {
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
    if (object.subject != null) {
      yield r'subject';
      yield serializers.serialize(
        object.subject,
        specifiedType: const FullType(String),
      );
    }
    if (object.issuer != null) {
      yield r'issuer';
      yield serializers.serialize(
        object.issuer,
        specifiedType: const FullType(String),
      );
    }
    if (object.notBefore != null) {
      yield r'notBefore';
      yield serializers.serialize(
        object.notBefore,
        specifiedType: const FullType(String),
      );
    }
    if (object.notAfter != null) {
      yield r'notAfter';
      yield serializers.serialize(
        object.notAfter,
        specifiedType: const FullType(String),
      );
    }
    if (object.serialNumber != null) {
      yield r'serialNumber';
      yield serializers.serialize(
        object.serialNumber,
        specifiedType: const FullType(int),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    TruststoreItems object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required TruststoreItemsBuilder result,
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
        case r'subject':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.subject = valueDes;
          break;
        case r'issuer':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.issuer = valueDes;
          break;
        case r'notBefore':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.notBefore = valueDes;
          break;
        case r'notAfter':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.notAfter = valueDes;
          break;
        case r'serialNumber':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.serialNumber = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  TruststoreItems deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = TruststoreItemsBuilder();
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

