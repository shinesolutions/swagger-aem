
package org.openapitools.client.model


case class SamlConfigurationProperties (
    _path: Option[SamlConfigurationPropertyItemsArray],
    _serviceRanking: Option[SamlConfigurationPropertyItemsLong],
    _idpUrl: Option[SamlConfigurationPropertyItemsString],
    _idpCertAlias: Option[SamlConfigurationPropertyItemsString],
    _idpHttpRedirect: Option[SamlConfigurationPropertyItemsBoolean],
    _serviceProviderEntityId: Option[SamlConfigurationPropertyItemsString],
    _assertionConsumerServiceURL: Option[SamlConfigurationPropertyItemsString],
    _spPrivateKeyAlias: Option[SamlConfigurationPropertyItemsString],
    _keyStorePassword: Option[SamlConfigurationPropertyItemsString],
    _defaultRedirectUrl: Option[SamlConfigurationPropertyItemsString],
    _userIDAttribute: Option[SamlConfigurationPropertyItemsString],
    _useEncryption: Option[SamlConfigurationPropertyItemsBoolean],
    _createUser: Option[SamlConfigurationPropertyItemsBoolean],
    _addGroupMemberships: Option[SamlConfigurationPropertyItemsBoolean],
    _groupMembershipAttribute: Option[SamlConfigurationPropertyItemsString],
    _defaultGroups: Option[SamlConfigurationPropertyItemsArray],
    _nameIdFormat: Option[SamlConfigurationPropertyItemsString],
    _synchronizeAttributes: Option[SamlConfigurationPropertyItemsArray],
    _handleLogout: Option[SamlConfigurationPropertyItemsBoolean],
    _logoutUrl: Option[SamlConfigurationPropertyItemsString],
    _clockTolerance: Option[SamlConfigurationPropertyItemsLong],
    _digestMethod: Option[SamlConfigurationPropertyItemsString],
    _signatureMethod: Option[SamlConfigurationPropertyItemsString],
    _userIntermediatePath: Option[SamlConfigurationPropertyItemsString]
)
object SamlConfigurationProperties {
    def toStringBody(var_path: Object, var_serviceRanking: Object, var_idpUrl: Object, var_idpCertAlias: Object, var_idpHttpRedirect: Object, var_serviceProviderEntityId: Object, var_assertionConsumerServiceURL: Object, var_spPrivateKeyAlias: Object, var_keyStorePassword: Object, var_defaultRedirectUrl: Object, var_userIDAttribute: Object, var_useEncryption: Object, var_createUser: Object, var_addGroupMemberships: Object, var_groupMembershipAttribute: Object, var_defaultGroups: Object, var_nameIdFormat: Object, var_synchronizeAttributes: Object, var_handleLogout: Object, var_logoutUrl: Object, var_clockTolerance: Object, var_digestMethod: Object, var_signatureMethod: Object, var_userIntermediatePath: Object) =
        s"""
        | {
        | "path":$var_path,"serviceRanking":$var_serviceRanking,"idpUrl":$var_idpUrl,"idpCertAlias":$var_idpCertAlias,"idpHttpRedirect":$var_idpHttpRedirect,"serviceProviderEntityId":$var_serviceProviderEntityId,"assertionConsumerServiceURL":$var_assertionConsumerServiceURL,"spPrivateKeyAlias":$var_spPrivateKeyAlias,"keyStorePassword":$var_keyStorePassword,"defaultRedirectUrl":$var_defaultRedirectUrl,"userIDAttribute":$var_userIDAttribute,"useEncryption":$var_useEncryption,"createUser":$var_createUser,"addGroupMemberships":$var_addGroupMemberships,"groupMembershipAttribute":$var_groupMembershipAttribute,"defaultGroups":$var_defaultGroups,"nameIdFormat":$var_nameIdFormat,"synchronizeAttributes":$var_synchronizeAttributes,"handleLogout":$var_handleLogout,"logoutUrl":$var_logoutUrl,"clockTolerance":$var_clockTolerance,"digestMethod":$var_digestMethod,"signatureMethod":$var_signatureMethod,"userIntermediatePath":$var_userIntermediatePath
        | }
        """.stripMargin
}
