//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.0

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class SamlConfigurationProperties {
  /// Returns a new [SamlConfigurationProperties] instance.
  SamlConfigurationProperties({
    this.path,
    this.servicePeriodRanking,
    this.idpUrl,
    this.idpCertAlias,
    this.idpHttpRedirect,
    this.serviceProviderEntityId,
    this.assertionConsumerServiceURL,
    this.spPrivateKeyAlias,
    this.keyStorePassword,
    this.defaultRedirectUrl,
    this.userIDAttribute,
    this.useEncryption,
    this.createUser,
    this.addGroupMemberships,
    this.groupMembershipAttribute,
    this.defaultGroups,
    this.nameIdFormat,
    this.synchronizeAttributes,
    this.handleLogout,
    this.logoutUrl,
    this.clockTolerance,
    this.digestMethod,
    this.signatureMethod,
    this.userIntermediatePath,
  });

  SamlConfigurationPropertyItemsArray path;

  SamlConfigurationPropertyItemsLong servicePeriodRanking;

  SamlConfigurationPropertyItemsString idpUrl;

  SamlConfigurationPropertyItemsString idpCertAlias;

  SamlConfigurationPropertyItemsBoolean idpHttpRedirect;

  SamlConfigurationPropertyItemsString serviceProviderEntityId;

  SamlConfigurationPropertyItemsString assertionConsumerServiceURL;

  SamlConfigurationPropertyItemsString spPrivateKeyAlias;

  SamlConfigurationPropertyItemsString keyStorePassword;

  SamlConfigurationPropertyItemsString defaultRedirectUrl;

  SamlConfigurationPropertyItemsString userIDAttribute;

  SamlConfigurationPropertyItemsBoolean useEncryption;

  SamlConfigurationPropertyItemsBoolean createUser;

  SamlConfigurationPropertyItemsBoolean addGroupMemberships;

  SamlConfigurationPropertyItemsString groupMembershipAttribute;

  SamlConfigurationPropertyItemsArray defaultGroups;

  SamlConfigurationPropertyItemsString nameIdFormat;

  SamlConfigurationPropertyItemsArray synchronizeAttributes;

  SamlConfigurationPropertyItemsBoolean handleLogout;

  SamlConfigurationPropertyItemsString logoutUrl;

  SamlConfigurationPropertyItemsLong clockTolerance;

  SamlConfigurationPropertyItemsString digestMethod;

  SamlConfigurationPropertyItemsString signatureMethod;

  SamlConfigurationPropertyItemsString userIntermediatePath;

  @override
  bool operator ==(Object other) => identical(this, other) || other is SamlConfigurationProperties &&
     other.path == path &&
     other.servicePeriodRanking == servicePeriodRanking &&
     other.idpUrl == idpUrl &&
     other.idpCertAlias == idpCertAlias &&
     other.idpHttpRedirect == idpHttpRedirect &&
     other.serviceProviderEntityId == serviceProviderEntityId &&
     other.assertionConsumerServiceURL == assertionConsumerServiceURL &&
     other.spPrivateKeyAlias == spPrivateKeyAlias &&
     other.keyStorePassword == keyStorePassword &&
     other.defaultRedirectUrl == defaultRedirectUrl &&
     other.userIDAttribute == userIDAttribute &&
     other.useEncryption == useEncryption &&
     other.createUser == createUser &&
     other.addGroupMemberships == addGroupMemberships &&
     other.groupMembershipAttribute == groupMembershipAttribute &&
     other.defaultGroups == defaultGroups &&
     other.nameIdFormat == nameIdFormat &&
     other.synchronizeAttributes == synchronizeAttributes &&
     other.handleLogout == handleLogout &&
     other.logoutUrl == logoutUrl &&
     other.clockTolerance == clockTolerance &&
     other.digestMethod == digestMethod &&
     other.signatureMethod == signatureMethod &&
     other.userIntermediatePath == userIntermediatePath;

  @override
  int get hashCode =>
    (path == null ? 0 : path.hashCode) +
    (servicePeriodRanking == null ? 0 : servicePeriodRanking.hashCode) +
    (idpUrl == null ? 0 : idpUrl.hashCode) +
    (idpCertAlias == null ? 0 : idpCertAlias.hashCode) +
    (idpHttpRedirect == null ? 0 : idpHttpRedirect.hashCode) +
    (serviceProviderEntityId == null ? 0 : serviceProviderEntityId.hashCode) +
    (assertionConsumerServiceURL == null ? 0 : assertionConsumerServiceURL.hashCode) +
    (spPrivateKeyAlias == null ? 0 : spPrivateKeyAlias.hashCode) +
    (keyStorePassword == null ? 0 : keyStorePassword.hashCode) +
    (defaultRedirectUrl == null ? 0 : defaultRedirectUrl.hashCode) +
    (userIDAttribute == null ? 0 : userIDAttribute.hashCode) +
    (useEncryption == null ? 0 : useEncryption.hashCode) +
    (createUser == null ? 0 : createUser.hashCode) +
    (addGroupMemberships == null ? 0 : addGroupMemberships.hashCode) +
    (groupMembershipAttribute == null ? 0 : groupMembershipAttribute.hashCode) +
    (defaultGroups == null ? 0 : defaultGroups.hashCode) +
    (nameIdFormat == null ? 0 : nameIdFormat.hashCode) +
    (synchronizeAttributes == null ? 0 : synchronizeAttributes.hashCode) +
    (handleLogout == null ? 0 : handleLogout.hashCode) +
    (logoutUrl == null ? 0 : logoutUrl.hashCode) +
    (clockTolerance == null ? 0 : clockTolerance.hashCode) +
    (digestMethod == null ? 0 : digestMethod.hashCode) +
    (signatureMethod == null ? 0 : signatureMethod.hashCode) +
    (userIntermediatePath == null ? 0 : userIntermediatePath.hashCode);

  @override
  String toString() => 'SamlConfigurationProperties[path=$path, servicePeriodRanking=$servicePeriodRanking, idpUrl=$idpUrl, idpCertAlias=$idpCertAlias, idpHttpRedirect=$idpHttpRedirect, serviceProviderEntityId=$serviceProviderEntityId, assertionConsumerServiceURL=$assertionConsumerServiceURL, spPrivateKeyAlias=$spPrivateKeyAlias, keyStorePassword=$keyStorePassword, defaultRedirectUrl=$defaultRedirectUrl, userIDAttribute=$userIDAttribute, useEncryption=$useEncryption, createUser=$createUser, addGroupMemberships=$addGroupMemberships, groupMembershipAttribute=$groupMembershipAttribute, defaultGroups=$defaultGroups, nameIdFormat=$nameIdFormat, synchronizeAttributes=$synchronizeAttributes, handleLogout=$handleLogout, logoutUrl=$logoutUrl, clockTolerance=$clockTolerance, digestMethod=$digestMethod, signatureMethod=$signatureMethod, userIntermediatePath=$userIntermediatePath]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (path != null) {
      json[r'path'] = path;
    }
    if (servicePeriodRanking != null) {
      json[r'service.ranking'] = servicePeriodRanking;
    }
    if (idpUrl != null) {
      json[r'idpUrl'] = idpUrl;
    }
    if (idpCertAlias != null) {
      json[r'idpCertAlias'] = idpCertAlias;
    }
    if (idpHttpRedirect != null) {
      json[r'idpHttpRedirect'] = idpHttpRedirect;
    }
    if (serviceProviderEntityId != null) {
      json[r'serviceProviderEntityId'] = serviceProviderEntityId;
    }
    if (assertionConsumerServiceURL != null) {
      json[r'assertionConsumerServiceURL'] = assertionConsumerServiceURL;
    }
    if (spPrivateKeyAlias != null) {
      json[r'spPrivateKeyAlias'] = spPrivateKeyAlias;
    }
    if (keyStorePassword != null) {
      json[r'keyStorePassword'] = keyStorePassword;
    }
    if (defaultRedirectUrl != null) {
      json[r'defaultRedirectUrl'] = defaultRedirectUrl;
    }
    if (userIDAttribute != null) {
      json[r'userIDAttribute'] = userIDAttribute;
    }
    if (useEncryption != null) {
      json[r'useEncryption'] = useEncryption;
    }
    if (createUser != null) {
      json[r'createUser'] = createUser;
    }
    if (addGroupMemberships != null) {
      json[r'addGroupMemberships'] = addGroupMemberships;
    }
    if (groupMembershipAttribute != null) {
      json[r'groupMembershipAttribute'] = groupMembershipAttribute;
    }
    if (defaultGroups != null) {
      json[r'defaultGroups'] = defaultGroups;
    }
    if (nameIdFormat != null) {
      json[r'nameIdFormat'] = nameIdFormat;
    }
    if (synchronizeAttributes != null) {
      json[r'synchronizeAttributes'] = synchronizeAttributes;
    }
    if (handleLogout != null) {
      json[r'handleLogout'] = handleLogout;
    }
    if (logoutUrl != null) {
      json[r'logoutUrl'] = logoutUrl;
    }
    if (clockTolerance != null) {
      json[r'clockTolerance'] = clockTolerance;
    }
    if (digestMethod != null) {
      json[r'digestMethod'] = digestMethod;
    }
    if (signatureMethod != null) {
      json[r'signatureMethod'] = signatureMethod;
    }
    if (userIntermediatePath != null) {
      json[r'userIntermediatePath'] = userIntermediatePath;
    }
    return json;
  }

  /// Returns a new [SamlConfigurationProperties] instance and imports its values from
  /// [json] if it's non-null, null if [json] is null.
  static SamlConfigurationProperties fromJson(Map<String, dynamic> json) => json == null
    ? null
    : SamlConfigurationProperties(
        path: SamlConfigurationPropertyItemsArray.fromJson(json[r'path']),
        servicePeriodRanking: SamlConfigurationPropertyItemsLong.fromJson(json[r'service.ranking']),
        idpUrl: SamlConfigurationPropertyItemsString.fromJson(json[r'idpUrl']),
        idpCertAlias: SamlConfigurationPropertyItemsString.fromJson(json[r'idpCertAlias']),
        idpHttpRedirect: SamlConfigurationPropertyItemsBoolean.fromJson(json[r'idpHttpRedirect']),
        serviceProviderEntityId: SamlConfigurationPropertyItemsString.fromJson(json[r'serviceProviderEntityId']),
        assertionConsumerServiceURL: SamlConfigurationPropertyItemsString.fromJson(json[r'assertionConsumerServiceURL']),
        spPrivateKeyAlias: SamlConfigurationPropertyItemsString.fromJson(json[r'spPrivateKeyAlias']),
        keyStorePassword: SamlConfigurationPropertyItemsString.fromJson(json[r'keyStorePassword']),
        defaultRedirectUrl: SamlConfigurationPropertyItemsString.fromJson(json[r'defaultRedirectUrl']),
        userIDAttribute: SamlConfigurationPropertyItemsString.fromJson(json[r'userIDAttribute']),
        useEncryption: SamlConfigurationPropertyItemsBoolean.fromJson(json[r'useEncryption']),
        createUser: SamlConfigurationPropertyItemsBoolean.fromJson(json[r'createUser']),
        addGroupMemberships: SamlConfigurationPropertyItemsBoolean.fromJson(json[r'addGroupMemberships']),
        groupMembershipAttribute: SamlConfigurationPropertyItemsString.fromJson(json[r'groupMembershipAttribute']),
        defaultGroups: SamlConfigurationPropertyItemsArray.fromJson(json[r'defaultGroups']),
        nameIdFormat: SamlConfigurationPropertyItemsString.fromJson(json[r'nameIdFormat']),
        synchronizeAttributes: SamlConfigurationPropertyItemsArray.fromJson(json[r'synchronizeAttributes']),
        handleLogout: SamlConfigurationPropertyItemsBoolean.fromJson(json[r'handleLogout']),
        logoutUrl: SamlConfigurationPropertyItemsString.fromJson(json[r'logoutUrl']),
        clockTolerance: SamlConfigurationPropertyItemsLong.fromJson(json[r'clockTolerance']),
        digestMethod: SamlConfigurationPropertyItemsString.fromJson(json[r'digestMethod']),
        signatureMethod: SamlConfigurationPropertyItemsString.fromJson(json[r'signatureMethod']),
        userIntermediatePath: SamlConfigurationPropertyItemsString.fromJson(json[r'userIntermediatePath']),
    );

  static List<SamlConfigurationProperties> listFromJson(List<dynamic> json, {bool emptyIsNull, bool growable,}) =>
    json == null || json.isEmpty
      ? true == emptyIsNull ? null : <SamlConfigurationProperties>[]
      : json.map((dynamic value) => SamlConfigurationProperties.fromJson(value)).toList(growable: true == growable);

  static Map<String, SamlConfigurationProperties> mapFromJson(Map<String, dynamic> json) {
    final map = <String, SamlConfigurationProperties>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) => map[key] = SamlConfigurationProperties.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of SamlConfigurationProperties-objects as value to a dart map
  static Map<String, List<SamlConfigurationProperties>> mapListFromJson(Map<String, dynamic> json, {bool emptyIsNull, bool growable,}) {
    final map = <String, List<SamlConfigurationProperties>>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) {
        map[key] = SamlConfigurationProperties.listFromJson(value, emptyIsNull: emptyIsNull, growable: growable,);
      });
    }
    return map;
  }
}

