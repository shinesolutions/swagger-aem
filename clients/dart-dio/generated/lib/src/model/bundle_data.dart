//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/bundle_data_prop.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'bundle_data.g.dart';

/// BundleData
///
/// Properties:
/// * [id] - Bundle ID
/// * [name] - Bundle name
/// * [fragment] - Is bundle a fragment
/// * [stateRaw] - Numeric raw bundle state value
/// * [state] - Bundle state value
/// * [version] - Bundle version
/// * [symbolicName] - Bundle symbolic name
/// * [category] - Bundle category
/// * [props] 
@BuiltValue()
abstract class BundleData implements Built<BundleData, BundleDataBuilder> {
  /// Bundle ID
  @BuiltValueField(wireName: r'id')
  int? get id;

  /// Bundle name
  @BuiltValueField(wireName: r'name')
  String? get name;

  /// Is bundle a fragment
  @BuiltValueField(wireName: r'fragment')
  bool? get fragment;

  /// Numeric raw bundle state value
  @BuiltValueField(wireName: r'stateRaw')
  int? get stateRaw;

  /// Bundle state value
  @BuiltValueField(wireName: r'state')
  String? get state;

  /// Bundle version
  @BuiltValueField(wireName: r'version')
  String? get version;

  /// Bundle symbolic name
  @BuiltValueField(wireName: r'symbolicName')
  String? get symbolicName;

  /// Bundle category
  @BuiltValueField(wireName: r'category')
  String? get category;

  @BuiltValueField(wireName: r'props')
  BuiltList<BundleDataProp>? get props;

  BundleData._();

  factory BundleData([void updates(BundleDataBuilder b)]) = _$BundleData;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(BundleDataBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<BundleData> get serializer => _$BundleDataSerializer();
}

class _$BundleDataSerializer implements PrimitiveSerializer<BundleData> {
  @override
  final Iterable<Type> types = const [BundleData, _$BundleData];

  @override
  final String wireName = r'BundleData';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    BundleData object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.id != null) {
      yield r'id';
      yield serializers.serialize(
        object.id,
        specifiedType: const FullType(int),
      );
    }
    if (object.name != null) {
      yield r'name';
      yield serializers.serialize(
        object.name,
        specifiedType: const FullType(String),
      );
    }
    if (object.fragment != null) {
      yield r'fragment';
      yield serializers.serialize(
        object.fragment,
        specifiedType: const FullType(bool),
      );
    }
    if (object.stateRaw != null) {
      yield r'stateRaw';
      yield serializers.serialize(
        object.stateRaw,
        specifiedType: const FullType(int),
      );
    }
    if (object.state != null) {
      yield r'state';
      yield serializers.serialize(
        object.state,
        specifiedType: const FullType(String),
      );
    }
    if (object.version != null) {
      yield r'version';
      yield serializers.serialize(
        object.version,
        specifiedType: const FullType(String),
      );
    }
    if (object.symbolicName != null) {
      yield r'symbolicName';
      yield serializers.serialize(
        object.symbolicName,
        specifiedType: const FullType(String),
      );
    }
    if (object.category != null) {
      yield r'category';
      yield serializers.serialize(
        object.category,
        specifiedType: const FullType(String),
      );
    }
    if (object.props != null) {
      yield r'props';
      yield serializers.serialize(
        object.props,
        specifiedType: const FullType(BuiltList, [FullType(BundleDataProp)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    BundleData object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required BundleDataBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.id = valueDes;
          break;
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.name = valueDes;
          break;
        case r'fragment':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.fragment = valueDes;
          break;
        case r'stateRaw':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.stateRaw = valueDes;
          break;
        case r'state':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.state = valueDes;
          break;
        case r'version':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.version = valueDes;
          break;
        case r'symbolicName':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.symbolicName = valueDes;
          break;
        case r'category':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.category = valueDes;
          break;
        case r'props':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(BundleDataProp)]),
          ) as BuiltList<BundleDataProp>?;
          if (valueDes == null) continue;
          result.props.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  BundleData deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = BundleDataBuilder();
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

