//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'install_status_status.g.dart';

/// InstallStatusStatus
///
/// Properties:
/// * [finished] 
/// * [itemCount] 
@BuiltValue()
abstract class InstallStatusStatus implements Built<InstallStatusStatus, InstallStatusStatusBuilder> {
  @BuiltValueField(wireName: r'finished')
  bool? get finished;

  @BuiltValueField(wireName: r'itemCount')
  int? get itemCount;

  InstallStatusStatus._();

  factory InstallStatusStatus([void updates(InstallStatusStatusBuilder b)]) = _$InstallStatusStatus;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(InstallStatusStatusBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<InstallStatusStatus> get serializer => _$InstallStatusStatusSerializer();
}

class _$InstallStatusStatusSerializer implements PrimitiveSerializer<InstallStatusStatus> {
  @override
  final Iterable<Type> types = const [InstallStatusStatus, _$InstallStatusStatus];

  @override
  final String wireName = r'InstallStatusStatus';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    InstallStatusStatus object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.finished != null) {
      yield r'finished';
      yield serializers.serialize(
        object.finished,
        specifiedType: const FullType(bool),
      );
    }
    if (object.itemCount != null) {
      yield r'itemCount';
      yield serializers.serialize(
        object.itemCount,
        specifiedType: const FullType(int),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    InstallStatusStatus object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required InstallStatusStatusBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'finished':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.finished = valueDes;
          break;
        case r'itemCount':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.itemCount = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  InstallStatusStatus deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = InstallStatusStatusBuilder();
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

