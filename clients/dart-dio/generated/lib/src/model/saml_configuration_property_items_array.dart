//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'saml_configuration_property_items_array.g.dart';

/// SamlConfigurationPropertyItemsArray
///
/// Properties:
/// * [name] - property name
/// * [optional] - True if optional
/// * [isSet] - True if property is set
/// * [type] - Property type, 1=String, 3=long, 11=boolean, 12=Password
/// * [values] - Property value
/// * [description] - Property description
@BuiltValue()
abstract class SamlConfigurationPropertyItemsArray implements Built<SamlConfigurationPropertyItemsArray, SamlConfigurationPropertyItemsArrayBuilder> {
  /// property name
  @BuiltValueField(wireName: r'name')
  String? get name;

  /// True if optional
  @BuiltValueField(wireName: r'optional')
  bool? get optional;

  /// True if property is set
  @BuiltValueField(wireName: r'is_set')
  bool? get isSet;

  /// Property type, 1=String, 3=long, 11=boolean, 12=Password
  @BuiltValueField(wireName: r'type')
  int? get type;

  /// Property value
  @BuiltValueField(wireName: r'values')
  BuiltList<String>? get values;

  /// Property description
  @BuiltValueField(wireName: r'description')
  String? get description;

  SamlConfigurationPropertyItemsArray._();

  factory SamlConfigurationPropertyItemsArray([void updates(SamlConfigurationPropertyItemsArrayBuilder b)]) = _$SamlConfigurationPropertyItemsArray;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(SamlConfigurationPropertyItemsArrayBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<SamlConfigurationPropertyItemsArray> get serializer => _$SamlConfigurationPropertyItemsArraySerializer();
}

class _$SamlConfigurationPropertyItemsArraySerializer implements PrimitiveSerializer<SamlConfigurationPropertyItemsArray> {
  @override
  final Iterable<Type> types = const [SamlConfigurationPropertyItemsArray, _$SamlConfigurationPropertyItemsArray];

  @override
  final String wireName = r'SamlConfigurationPropertyItemsArray';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    SamlConfigurationPropertyItemsArray object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.name != null) {
      yield r'name';
      yield serializers.serialize(
        object.name,
        specifiedType: const FullType(String),
      );
    }
    if (object.optional != null) {
      yield r'optional';
      yield serializers.serialize(
        object.optional,
        specifiedType: const FullType(bool),
      );
    }
    if (object.isSet != null) {
      yield r'is_set';
      yield serializers.serialize(
        object.isSet,
        specifiedType: const FullType(bool),
      );
    }
    if (object.type != null) {
      yield r'type';
      yield serializers.serialize(
        object.type,
        specifiedType: const FullType(int),
      );
    }
    if (object.values != null) {
      yield r'values';
      yield serializers.serialize(
        object.values,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
    if (object.description != null) {
      yield r'description';
      yield serializers.serialize(
        object.description,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    SamlConfigurationPropertyItemsArray object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required SamlConfigurationPropertyItemsArrayBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.name = valueDes;
          break;
        case r'optional':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.optional = valueDes;
          break;
        case r'is_set':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.isSet = valueDes;
          break;
        case r'type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.type = valueDes;
          break;
        case r'values':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.values.replace(valueDes);
          break;
        case r'description':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.description = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  SamlConfigurationPropertyItemsArray deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = SamlConfigurationPropertyItemsArrayBuilder();
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

