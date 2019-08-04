package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.SamlConfigurationPropertyItemsArray;
import org.openapitools.model.SamlConfigurationPropertyItemsBoolean;
import org.openapitools.model.SamlConfigurationPropertyItemsLong;
import org.openapitools.model.SamlConfigurationPropertyItemsString;

@Canonical
class SamlConfigurationProperties {
    SamlConfigurationPropertyItemsArray path = null

    SamlConfigurationPropertyItemsLong serviceRanking = null

    SamlConfigurationPropertyItemsString idpUrl = null

    SamlConfigurationPropertyItemsString idpCertAlias = null

    SamlConfigurationPropertyItemsBoolean idpHttpRedirect = null

    SamlConfigurationPropertyItemsString serviceProviderEntityId = null

    SamlConfigurationPropertyItemsString assertionConsumerServiceURL = null

    SamlConfigurationPropertyItemsString spPrivateKeyAlias = null

    SamlConfigurationPropertyItemsString keyStorePassword = null

    SamlConfigurationPropertyItemsString defaultRedirectUrl = null

    SamlConfigurationPropertyItemsString userIDAttribute = null

    SamlConfigurationPropertyItemsBoolean useEncryption = null

    SamlConfigurationPropertyItemsBoolean createUser = null

    SamlConfigurationPropertyItemsBoolean addGroupMemberships = null

    SamlConfigurationPropertyItemsString groupMembershipAttribute = null

    SamlConfigurationPropertyItemsArray defaultGroups = null

    SamlConfigurationPropertyItemsString nameIdFormat = null

    SamlConfigurationPropertyItemsArray synchronizeAttributes = null

    SamlConfigurationPropertyItemsBoolean handleLogout = null

    SamlConfigurationPropertyItemsString logoutUrl = null

    SamlConfigurationPropertyItemsLong clockTolerance = null

    SamlConfigurationPropertyItemsString digestMethod = null

    SamlConfigurationPropertyItemsString signatureMethod = null

    SamlConfigurationPropertyItemsString userIntermediatePath = null

}
