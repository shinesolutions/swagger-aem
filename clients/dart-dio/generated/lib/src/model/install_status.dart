//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/install_status_status.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'install_status.g.dart';

/// InstallStatus
///
/// Properties:
/// * [status] 
@BuiltValue()
abstract class InstallStatus implements Built<InstallStatus, InstallStatusBuilder> {
  @BuiltValueField(wireName: r'status')
  InstallStatusStatus? get status;

  InstallStatus._();

  factory InstallStatus([void updates(InstallStatusBuilder b)]) = _$InstallStatus;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(InstallStatusBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<InstallStatus> get serializer => _$InstallStatusSerializer();
}

class _$InstallStatusSerializer implements PrimitiveSerializer<InstallStatus> {
  @override
  final Iterable<Type> types = const [InstallStatus, _$InstallStatus];

  @override
  final String wireName = r'InstallStatus';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    InstallStatus object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.status != null) {
      yield r'status';
      yield serializers.serialize(
        object.status,
        specifiedType: const FullType(InstallStatusStatus),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    InstallStatus object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required InstallStatusBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'status':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(InstallStatusStatus),
          ) as InstallStatusStatus?;
          if (valueDes == null) continue;
          result.status.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  InstallStatus deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = InstallStatusBuilder();
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

