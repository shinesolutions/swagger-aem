//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'bundle_data_prop.g.dart';

/// BundleDataProp
///
/// Properties:
/// * [key] - Bundle data key
/// * [value] - Bundle data value
@BuiltValue()
abstract class BundleDataProp implements Built<BundleDataProp, BundleDataPropBuilder> {
  /// Bundle data key
  @BuiltValueField(wireName: r'key')
  String? get key;

  /// Bundle data value
  @BuiltValueField(wireName: r'value')
  String? get value;

  BundleDataProp._();

  factory BundleDataProp([void updates(BundleDataPropBuilder b)]) = _$BundleDataProp;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(BundleDataPropBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<BundleDataProp> get serializer => _$BundleDataPropSerializer();
}

class _$BundleDataPropSerializer implements PrimitiveSerializer<BundleDataProp> {
  @override
  final Iterable<Type> types = const [BundleDataProp, _$BundleDataProp];

  @override
  final String wireName = r'BundleDataProp';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    BundleDataProp object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.key != null) {
      yield r'key';
      yield serializers.serialize(
        object.key,
        specifiedType: const FullType(String),
      );
    }
    if (object.value != null) {
      yield r'value';
      yield serializers.serialize(
        object.value,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    BundleDataProp object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required BundleDataPropBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'key':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.key = valueDes;
          break;
        case r'value':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.value = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  BundleDataProp deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = BundleDataPropBuilder();
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

