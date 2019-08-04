part of openapi.api;

class SamlConfigurationProperties {
  
  SamlConfigurationPropertyItemsArray path = null;
  
  SamlConfigurationPropertyItemsLong serviceRanking = null;
  
  SamlConfigurationPropertyItemsString idpUrl = null;
  
  SamlConfigurationPropertyItemsString idpCertAlias = null;
  
  SamlConfigurationPropertyItemsBoolean idpHttpRedirect = null;
  
  SamlConfigurationPropertyItemsString serviceProviderEntityId = null;
  
  SamlConfigurationPropertyItemsString assertionConsumerServiceURL = null;
  
  SamlConfigurationPropertyItemsString spPrivateKeyAlias = null;
  
  SamlConfigurationPropertyItemsString keyStorePassword = null;
  
  SamlConfigurationPropertyItemsString defaultRedirectUrl = null;
  
  SamlConfigurationPropertyItemsString userIDAttribute = null;
  
  SamlConfigurationPropertyItemsBoolean useEncryption = null;
  
  SamlConfigurationPropertyItemsBoolean createUser = null;
  
  SamlConfigurationPropertyItemsBoolean addGroupMemberships = null;
  
  SamlConfigurationPropertyItemsString groupMembershipAttribute = null;
  
  SamlConfigurationPropertyItemsArray defaultGroups = null;
  
  SamlConfigurationPropertyItemsString nameIdFormat = null;
  
  SamlConfigurationPropertyItemsArray synchronizeAttributes = null;
  
  SamlConfigurationPropertyItemsBoolean handleLogout = null;
  
  SamlConfigurationPropertyItemsString logoutUrl = null;
  
  SamlConfigurationPropertyItemsLong clockTolerance = null;
  
  SamlConfigurationPropertyItemsString digestMethod = null;
  
  SamlConfigurationPropertyItemsString signatureMethod = null;
  
  SamlConfigurationPropertyItemsString userIntermediatePath = null;
  SamlConfigurationProperties();

  @override
  String toString() {
    return 'SamlConfigurationProperties[path=$path, serviceRanking=$serviceRanking, idpUrl=$idpUrl, idpCertAlias=$idpCertAlias, idpHttpRedirect=$idpHttpRedirect, serviceProviderEntityId=$serviceProviderEntityId, assertionConsumerServiceURL=$assertionConsumerServiceURL, spPrivateKeyAlias=$spPrivateKeyAlias, keyStorePassword=$keyStorePassword, defaultRedirectUrl=$defaultRedirectUrl, userIDAttribute=$userIDAttribute, useEncryption=$useEncryption, createUser=$createUser, addGroupMemberships=$addGroupMemberships, groupMembershipAttribute=$groupMembershipAttribute, defaultGroups=$defaultGroups, nameIdFormat=$nameIdFormat, synchronizeAttributes=$synchronizeAttributes, handleLogout=$handleLogout, logoutUrl=$logoutUrl, clockTolerance=$clockTolerance, digestMethod=$digestMethod, signatureMethod=$signatureMethod, userIntermediatePath=$userIntermediatePath, ]';
  }

  SamlConfigurationProperties.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    path = new SamlConfigurationPropertyItemsArray.fromJson(json['path']);
    serviceRanking = new SamlConfigurationPropertyItemsLong.fromJson(json['service.ranking']);
    idpUrl = new SamlConfigurationPropertyItemsString.fromJson(json['idpUrl']);
    idpCertAlias = new SamlConfigurationPropertyItemsString.fromJson(json['idpCertAlias']);
    idpHttpRedirect = new SamlConfigurationPropertyItemsBoolean.fromJson(json['idpHttpRedirect']);
    serviceProviderEntityId = new SamlConfigurationPropertyItemsString.fromJson(json['serviceProviderEntityId']);
    assertionConsumerServiceURL = new SamlConfigurationPropertyItemsString.fromJson(json['assertionConsumerServiceURL']);
    spPrivateKeyAlias = new SamlConfigurationPropertyItemsString.fromJson(json['spPrivateKeyAlias']);
    keyStorePassword = new SamlConfigurationPropertyItemsString.fromJson(json['keyStorePassword']);
    defaultRedirectUrl = new SamlConfigurationPropertyItemsString.fromJson(json['defaultRedirectUrl']);
    userIDAttribute = new SamlConfigurationPropertyItemsString.fromJson(json['userIDAttribute']);
    useEncryption = new SamlConfigurationPropertyItemsBoolean.fromJson(json['useEncryption']);
    createUser = new SamlConfigurationPropertyItemsBoolean.fromJson(json['createUser']);
    addGroupMemberships = new SamlConfigurationPropertyItemsBoolean.fromJson(json['addGroupMemberships']);
    groupMembershipAttribute = new SamlConfigurationPropertyItemsString.fromJson(json['groupMembershipAttribute']);
    defaultGroups = new SamlConfigurationPropertyItemsArray.fromJson(json['defaultGroups']);
    nameIdFormat = new SamlConfigurationPropertyItemsString.fromJson(json['nameIdFormat']);
    synchronizeAttributes = new SamlConfigurationPropertyItemsArray.fromJson(json['synchronizeAttributes']);
    handleLogout = new SamlConfigurationPropertyItemsBoolean.fromJson(json['handleLogout']);
    logoutUrl = new SamlConfigurationPropertyItemsString.fromJson(json['logoutUrl']);
    clockTolerance = new SamlConfigurationPropertyItemsLong.fromJson(json['clockTolerance']);
    digestMethod = new SamlConfigurationPropertyItemsString.fromJson(json['digestMethod']);
    signatureMethod = new SamlConfigurationPropertyItemsString.fromJson(json['signatureMethod']);
    userIntermediatePath = new SamlConfigurationPropertyItemsString.fromJson(json['userIntermediatePath']);
  }

  Map<String, dynamic> toJson() {
    return {
      'path': path,
      'service.ranking': serviceRanking,
      'idpUrl': idpUrl,
      'idpCertAlias': idpCertAlias,
      'idpHttpRedirect': idpHttpRedirect,
      'serviceProviderEntityId': serviceProviderEntityId,
      'assertionConsumerServiceURL': assertionConsumerServiceURL,
      'spPrivateKeyAlias': spPrivateKeyAlias,
      'keyStorePassword': keyStorePassword,
      'defaultRedirectUrl': defaultRedirectUrl,
      'userIDAttribute': userIDAttribute,
      'useEncryption': useEncryption,
      'createUser': createUser,
      'addGroupMemberships': addGroupMemberships,
      'groupMembershipAttribute': groupMembershipAttribute,
      'defaultGroups': defaultGroups,
      'nameIdFormat': nameIdFormat,
      'synchronizeAttributes': synchronizeAttributes,
      'handleLogout': handleLogout,
      'logoutUrl': logoutUrl,
      'clockTolerance': clockTolerance,
      'digestMethod': digestMethod,
      'signatureMethod': signatureMethod,
      'userIntermediatePath': userIntermediatePath
    };
  }

  static List<SamlConfigurationProperties> listFromJson(List<dynamic> json) {
    return json == null ? new List<SamlConfigurationProperties>() : json.map((value) => new SamlConfigurationProperties.fromJson(value)).toList();
  }

  static Map<String, SamlConfigurationProperties> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, SamlConfigurationProperties>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new SamlConfigurationProperties.fromJson(value));
    }
    return map;
  }
}

