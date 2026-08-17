//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/saml_configuration_properties.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'saml_configuration_info.g.dart';

/// SamlConfigurationInfo
///
/// Properties:
/// * [pid] - Persistent Identity (PID)
/// * [title] - Title
/// * [description] - Title
/// * [bundleLocation] - needed for configuration binding
/// * [serviceLocation] - needed for configuraiton binding
/// * [properties] 
@BuiltValue()
abstract class SamlConfigurationInfo implements Built<SamlConfigurationInfo, SamlConfigurationInfoBuilder> {
  /// Persistent Identity (PID)
  @BuiltValueField(wireName: r'pid')
  String? get pid;

  /// Title
  @BuiltValueField(wireName: r'title')
  String? get title;

  /// Title
  @BuiltValueField(wireName: r'description')
  String? get description;

  /// needed for configuration binding
  @BuiltValueField(wireName: r'bundle_location')
  String? get bundleLocation;

  /// needed for configuraiton binding
  @BuiltValueField(wireName: r'service_location')
  String? get serviceLocation;

  @BuiltValueField(wireName: r'properties')
  SamlConfigurationProperties? get properties;

  SamlConfigurationInfo._();

  factory SamlConfigurationInfo([void updates(SamlConfigurationInfoBuilder b)]) = _$SamlConfigurationInfo;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(SamlConfigurationInfoBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<SamlConfigurationInfo> get serializer => _$SamlConfigurationInfoSerializer();
}

class _$SamlConfigurationInfoSerializer implements PrimitiveSerializer<SamlConfigurationInfo> {
  @override
  final Iterable<Type> types = const [SamlConfigurationInfo, _$SamlConfigurationInfo];

  @override
  final String wireName = r'SamlConfigurationInfo';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    SamlConfigurationInfo object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.pid != null) {
      yield r'pid';
      yield serializers.serialize(
        object.pid,
        specifiedType: const FullType(String),
      );
    }
    if (object.title != null) {
      yield r'title';
      yield serializers.serialize(
        object.title,
        specifiedType: const FullType(String),
      );
    }
    if (object.description != null) {
      yield r'description';
      yield serializers.serialize(
        object.description,
        specifiedType: const FullType(String),
      );
    }
    if (object.bundleLocation != null) {
      yield r'bundle_location';
      yield serializers.serialize(
        object.bundleLocation,
        specifiedType: const FullType(String),
      );
    }
    if (object.serviceLocation != null) {
      yield r'service_location';
      yield serializers.serialize(
        object.serviceLocation,
        specifiedType: const FullType(String),
      );
    }
    if (object.properties != null) {
      yield r'properties';
      yield serializers.serialize(
        object.properties,
        specifiedType: const FullType(SamlConfigurationProperties),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    SamlConfigurationInfo object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required SamlConfigurationInfoBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'pid':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.pid = valueDes;
          break;
        case r'title':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.title = valueDes;
          break;
        case r'description':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.description = valueDes;
          break;
        case r'bundle_location':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.bundleLocation = valueDes;
          break;
        case r'service_location':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.serviceLocation = valueDes;
          break;
        case r'properties':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(SamlConfigurationProperties),
          ) as SamlConfigurationProperties?;
          if (valueDes == null) continue;
          result.properties.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  SamlConfigurationInfo deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = SamlConfigurationInfoBuilder();
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

