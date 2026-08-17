//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/saml_configuration_property_items_boolean.dart';
import 'package:openapi/src/model/saml_configuration_property_items_array.dart';
import 'package:openapi/src/model/saml_configuration_property_items_long.dart';
import 'package:openapi/src/model/saml_configuration_property_items_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'saml_configuration_properties.g.dart';

/// SamlConfigurationProperties
///
/// Properties:
/// * [path] 
/// * [servicePeriodRanking] 
/// * [idpUrl] 
/// * [idpCertAlias] 
/// * [idpHttpRedirect] 
/// * [serviceProviderEntityId] 
/// * [assertionConsumerServiceURL] 
/// * [spPrivateKeyAlias] 
/// * [keyStorePassword] 
/// * [defaultRedirectUrl] 
/// * [userIDAttribute] 
/// * [useEncryption] 
/// * [createUser] 
/// * [addGroupMemberships] 
/// * [groupMembershipAttribute] 
/// * [defaultGroups] 
/// * [nameIdFormat] 
/// * [synchronizeAttributes] 
/// * [handleLogout] 
/// * [logoutUrl] 
/// * [clockTolerance] 
/// * [digestMethod] 
/// * [signatureMethod] 
/// * [userIntermediatePath] 
@BuiltValue()
abstract class SamlConfigurationProperties implements Built<SamlConfigurationProperties, SamlConfigurationPropertiesBuilder> {
  @BuiltValueField(wireName: r'path')
  SamlConfigurationPropertyItemsArray? get path;

  @BuiltValueField(wireName: r'service.ranking')
  SamlConfigurationPropertyItemsLong? get servicePeriodRanking;

  @BuiltValueField(wireName: r'idpUrl')
  SamlConfigurationPropertyItemsString? get idpUrl;

  @BuiltValueField(wireName: r'idpCertAlias')
  SamlConfigurationPropertyItemsString? get idpCertAlias;

  @BuiltValueField(wireName: r'idpHttpRedirect')
  SamlConfigurationPropertyItemsBoolean? get idpHttpRedirect;

  @BuiltValueField(wireName: r'serviceProviderEntityId')
  SamlConfigurationPropertyItemsString? get serviceProviderEntityId;

  @BuiltValueField(wireName: r'assertionConsumerServiceURL')
  SamlConfigurationPropertyItemsString? get assertionConsumerServiceURL;

  @BuiltValueField(wireName: r'spPrivateKeyAlias')
  SamlConfigurationPropertyItemsString? get spPrivateKeyAlias;

  @BuiltValueField(wireName: r'keyStorePassword')
  SamlConfigurationPropertyItemsString? get keyStorePassword;

  @BuiltValueField(wireName: r'defaultRedirectUrl')
  SamlConfigurationPropertyItemsString? get defaultRedirectUrl;

  @BuiltValueField(wireName: r'userIDAttribute')
  SamlConfigurationPropertyItemsString? get userIDAttribute;

  @BuiltValueField(wireName: r'useEncryption')
  SamlConfigurationPropertyItemsBoolean? get useEncryption;

  @BuiltValueField(wireName: r'createUser')
  SamlConfigurationPropertyItemsBoolean? get createUser;

  @BuiltValueField(wireName: r'addGroupMemberships')
  SamlConfigurationPropertyItemsBoolean? get addGroupMemberships;

  @BuiltValueField(wireName: r'groupMembershipAttribute')
  SamlConfigurationPropertyItemsString? get groupMembershipAttribute;

  @BuiltValueField(wireName: r'defaultGroups')
  SamlConfigurationPropertyItemsArray? get defaultGroups;

  @BuiltValueField(wireName: r'nameIdFormat')
  SamlConfigurationPropertyItemsString? get nameIdFormat;

  @BuiltValueField(wireName: r'synchronizeAttributes')
  SamlConfigurationPropertyItemsArray? get synchronizeAttributes;

  @BuiltValueField(wireName: r'handleLogout')
  SamlConfigurationPropertyItemsBoolean? get handleLogout;

  @BuiltValueField(wireName: r'logoutUrl')
  SamlConfigurationPropertyItemsString? get logoutUrl;

  @BuiltValueField(wireName: r'clockTolerance')
  SamlConfigurationPropertyItemsLong? get clockTolerance;

  @BuiltValueField(wireName: r'digestMethod')
  SamlConfigurationPropertyItemsString? get digestMethod;

  @BuiltValueField(wireName: r'signatureMethod')
  SamlConfigurationPropertyItemsString? get signatureMethod;

  @BuiltValueField(wireName: r'userIntermediatePath')
  SamlConfigurationPropertyItemsString? get userIntermediatePath;

  SamlConfigurationProperties._();

  factory SamlConfigurationProperties([void updates(SamlConfigurationPropertiesBuilder b)]) = _$SamlConfigurationProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(SamlConfigurationPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<SamlConfigurationProperties> get serializer => _$SamlConfigurationPropertiesSerializer();
}

class _$SamlConfigurationPropertiesSerializer implements PrimitiveSerializer<SamlConfigurationProperties> {
  @override
  final Iterable<Type> types = const [SamlConfigurationProperties, _$SamlConfigurationProperties];

  @override
  final String wireName = r'SamlConfigurationProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    SamlConfigurationProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.path != null) {
      yield r'path';
      yield serializers.serialize(
        object.path,
        specifiedType: const FullType(SamlConfigurationPropertyItemsArray),
      );
    }
    if (object.servicePeriodRanking != null) {
      yield r'service.ranking';
      yield serializers.serialize(
        object.servicePeriodRanking,
        specifiedType: const FullType(SamlConfigurationPropertyItemsLong),
      );
    }
    if (object.idpUrl != null) {
      yield r'idpUrl';
      yield serializers.serialize(
        object.idpUrl,
        specifiedType: const FullType(SamlConfigurationPropertyItemsString),
      );
    }
    if (object.idpCertAlias != null) {
      yield r'idpCertAlias';
      yield serializers.serialize(
        object.idpCertAlias,
        specifiedType: const FullType(SamlConfigurationPropertyItemsString),
      );
    }
    if (object.idpHttpRedirect != null) {
      yield r'idpHttpRedirect';
      yield serializers.serialize(
        object.idpHttpRedirect,
        specifiedType: const FullType(SamlConfigurationPropertyItemsBoolean),
      );
    }
    if (object.serviceProviderEntityId != null) {
      yield r'serviceProviderEntityId';
      yield serializers.serialize(
        object.serviceProviderEntityId,
        specifiedType: const FullType(SamlConfigurationPropertyItemsString),
      );
    }
    if (object.assertionConsumerServiceURL != null) {
      yield r'assertionConsumerServiceURL';
      yield serializers.serialize(
        object.assertionConsumerServiceURL,
        specifiedType: const FullType(SamlConfigurationPropertyItemsString),
      );
    }
    if (object.spPrivateKeyAlias != null) {
      yield r'spPrivateKeyAlias';
      yield serializers.serialize(
        object.spPrivateKeyAlias,
        specifiedType: const FullType(SamlConfigurationPropertyItemsString),
      );
    }
    if (object.keyStorePassword != null) {
      yield r'keyStorePassword';
      yield serializers.serialize(
        object.keyStorePassword,
        specifiedType: const FullType(SamlConfigurationPropertyItemsString),
      );
    }
    if (object.defaultRedirectUrl != null) {
      yield r'defaultRedirectUrl';
      yield serializers.serialize(
        object.defaultRedirectUrl,
        specifiedType: const FullType(SamlConfigurationPropertyItemsString),
      );
    }
    if (object.userIDAttribute != null) {
      yield r'userIDAttribute';
      yield serializers.serialize(
        object.userIDAttribute,
        specifiedType: const FullType(SamlConfigurationPropertyItemsString),
      );
    }
    if (object.useEncryption != null) {
      yield r'useEncryption';
      yield serializers.serialize(
        object.useEncryption,
        specifiedType: const FullType(SamlConfigurationPropertyItemsBoolean),
      );
    }
    if (object.createUser != null) {
      yield r'createUser';
      yield serializers.serialize(
        object.createUser,
        specifiedType: const FullType(SamlConfigurationPropertyItemsBoolean),
      );
    }
    if (object.addGroupMemberships != null) {
      yield r'addGroupMemberships';
      yield serializers.serialize(
        object.addGroupMemberships,
        specifiedType: const FullType(SamlConfigurationPropertyItemsBoolean),
      );
    }
    if (object.groupMembershipAttribute != null) {
      yield r'groupMembershipAttribute';
      yield serializers.serialize(
        object.groupMembershipAttribute,
        specifiedType: const FullType(SamlConfigurationPropertyItemsString),
      );
    }
    if (object.defaultGroups != null) {
      yield r'defaultGroups';
      yield serializers.serialize(
        object.defaultGroups,
        specifiedType: const FullType(SamlConfigurationPropertyItemsArray),
      );
    }
    if (object.nameIdFormat != null) {
      yield r'nameIdFormat';
      yield serializers.serialize(
        object.nameIdFormat,
        specifiedType: const FullType(SamlConfigurationPropertyItemsString),
      );
    }
    if (object.synchronizeAttributes != null) {
      yield r'synchronizeAttributes';
      yield serializers.serialize(
        object.synchronizeAttributes,
        specifiedType: const FullType(SamlConfigurationPropertyItemsArray),
      );
    }
    if (object.handleLogout != null) {
      yield r'handleLogout';
      yield serializers.serialize(
        object.handleLogout,
        specifiedType: const FullType(SamlConfigurationPropertyItemsBoolean),
      );
    }
    if (object.logoutUrl != null) {
      yield r'logoutUrl';
      yield serializers.serialize(
        object.logoutUrl,
        specifiedType: const FullType(SamlConfigurationPropertyItemsString),
      );
    }
    if (object.clockTolerance != null) {
      yield r'clockTolerance';
      yield serializers.serialize(
        object.clockTolerance,
        specifiedType: const FullType(SamlConfigurationPropertyItemsLong),
      );
    }
    if (object.digestMethod != null) {
      yield r'digestMethod';
      yield serializers.serialize(
        object.digestMethod,
        specifiedType: const FullType(SamlConfigurationPropertyItemsString),
      );
    }
    if (object.signatureMethod != null) {
      yield r'signatureMethod';
      yield serializers.serialize(
        object.signatureMethod,
        specifiedType: const FullType(SamlConfigurationPropertyItemsString),
      );
    }
    if (object.userIntermediatePath != null) {
      yield r'userIntermediatePath';
      yield serializers.serialize(
        object.userIntermediatePath,
        specifiedType: const FullType(SamlConfigurationPropertyItemsString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    SamlConfigurationProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required SamlConfigurationPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'path':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(SamlConfigurationPropertyItemsArray),
          ) as SamlConfigurationPropertyItemsArray?;
          if (valueDes == null) continue;
          result.path.replace(valueDes);
          break;
        case r'service.ranking':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(SamlConfigurationPropertyItemsLong),
          ) as SamlConfigurationPropertyItemsLong?;
          if (valueDes == null) continue;
          result.servicePeriodRanking.replace(valueDes);
          break;
        case r'idpUrl':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(SamlConfigurationPropertyItemsString),
          ) as SamlConfigurationPropertyItemsString?;
          if (valueDes == null) continue;
          result.idpUrl.replace(valueDes);
          break;
        case r'idpCertAlias':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(SamlConfigurationPropertyItemsString),
          ) as SamlConfigurationPropertyItemsString?;
          if (valueDes == null) continue;
          result.idpCertAlias.replace(valueDes);
          break;
        case r'idpHttpRedirect':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(SamlConfigurationPropertyItemsBoolean),
          ) as SamlConfigurationPropertyItemsBoolean?;
          if (valueDes == null) continue;
          result.idpHttpRedirect.replace(valueDes);
          break;
        case r'serviceProviderEntityId':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(SamlConfigurationPropertyItemsString),
          ) as SamlConfigurationPropertyItemsString?;
          if (valueDes == null) continue;
          result.serviceProviderEntityId.replace(valueDes);
          break;
        case r'assertionConsumerServiceURL':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(SamlConfigurationPropertyItemsString),
          ) as SamlConfigurationPropertyItemsString?;
          if (valueDes == null) continue;
          result.assertionConsumerServiceURL.replace(valueDes);
          break;
        case r'spPrivateKeyAlias':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(SamlConfigurationPropertyItemsString),
          ) as SamlConfigurationPropertyItemsString?;
          if (valueDes == null) continue;
          result.spPrivateKeyAlias.replace(valueDes);
          break;
        case r'keyStorePassword':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(SamlConfigurationPropertyItemsString),
          ) as SamlConfigurationPropertyItemsString?;
          if (valueDes == null) continue;
          result.keyStorePassword.replace(valueDes);
          break;
        case r'defaultRedirectUrl':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(SamlConfigurationPropertyItemsString),
          ) as SamlConfigurationPropertyItemsString?;
          if (valueDes == null) continue;
          result.defaultRedirectUrl.replace(valueDes);
          break;
        case r'userIDAttribute':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(SamlConfigurationPropertyItemsString),
          ) as SamlConfigurationPropertyItemsString?;
          if (valueDes == null) continue;
          result.userIDAttribute.replace(valueDes);
          break;
        case r'useEncryption':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(SamlConfigurationPropertyItemsBoolean),
          ) as SamlConfigurationPropertyItemsBoolean?;
          if (valueDes == null) continue;
          result.useEncryption.replace(valueDes);
          break;
        case r'createUser':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(SamlConfigurationPropertyItemsBoolean),
          ) as SamlConfigurationPropertyItemsBoolean?;
          if (valueDes == null) continue;
          result.createUser.replace(valueDes);
          break;
        case r'addGroupMemberships':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(SamlConfigurationPropertyItemsBoolean),
          ) as SamlConfigurationPropertyItemsBoolean?;
          if (valueDes == null) continue;
          result.addGroupMemberships.replace(valueDes);
          break;
        case r'groupMembershipAttribute':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(SamlConfigurationPropertyItemsString),
          ) as SamlConfigurationPropertyItemsString?;
          if (valueDes == null) continue;
          result.groupMembershipAttribute.replace(valueDes);
          break;
        case r'defaultGroups':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(SamlConfigurationPropertyItemsArray),
          ) as SamlConfigurationPropertyItemsArray?;
          if (valueDes == null) continue;
          result.defaultGroups.replace(valueDes);
          break;
        case r'nameIdFormat':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(SamlConfigurationPropertyItemsString),
          ) as SamlConfigurationPropertyItemsString?;
          if (valueDes == null) continue;
          result.nameIdFormat.replace(valueDes);
          break;
        case r'synchronizeAttributes':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(SamlConfigurationPropertyItemsArray),
          ) as SamlConfigurationPropertyItemsArray?;
          if (valueDes == null) continue;
          result.synchronizeAttributes.replace(valueDes);
          break;
        case r'handleLogout':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(SamlConfigurationPropertyItemsBoolean),
          ) as SamlConfigurationPropertyItemsBoolean?;
          if (valueDes == null) continue;
          result.handleLogout.replace(valueDes);
          break;
        case r'logoutUrl':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(SamlConfigurationPropertyItemsString),
          ) as SamlConfigurationPropertyItemsString?;
          if (valueDes == null) continue;
          result.logoutUrl.replace(valueDes);
          break;
        case r'clockTolerance':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(SamlConfigurationPropertyItemsLong),
          ) as SamlConfigurationPropertyItemsLong?;
          if (valueDes == null) continue;
          result.clockTolerance.replace(valueDes);
          break;
        case r'digestMethod':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(SamlConfigurationPropertyItemsString),
          ) as SamlConfigurationPropertyItemsString?;
          if (valueDes == null) continue;
          result.digestMethod.replace(valueDes);
          break;
        case r'signatureMethod':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(SamlConfigurationPropertyItemsString),
          ) as SamlConfigurationPropertyItemsString?;
          if (valueDes == null) continue;
          result.signatureMethod.replace(valueDes);
          break;
        case r'userIntermediatePath':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(SamlConfigurationPropertyItemsString),
          ) as SamlConfigurationPropertyItemsString?;
          if (valueDes == null) continue;
          result.userIntermediatePath.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  SamlConfigurationProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = SamlConfigurationPropertiesBuilder();
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

