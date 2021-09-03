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
    
    SamlConfigurationPropertyItemsArray path
    
    SamlConfigurationPropertyItemsLong serviceRanking
    
    SamlConfigurationPropertyItemsString idpUrl
    
    SamlConfigurationPropertyItemsString idpCertAlias
    
    SamlConfigurationPropertyItemsBoolean idpHttpRedirect
    
    SamlConfigurationPropertyItemsString serviceProviderEntityId
    
    SamlConfigurationPropertyItemsString assertionConsumerServiceURL
    
    SamlConfigurationPropertyItemsString spPrivateKeyAlias
    
    SamlConfigurationPropertyItemsString keyStorePassword
    
    SamlConfigurationPropertyItemsString defaultRedirectUrl
    
    SamlConfigurationPropertyItemsString userIDAttribute
    
    SamlConfigurationPropertyItemsBoolean useEncryption
    
    SamlConfigurationPropertyItemsBoolean createUser
    
    SamlConfigurationPropertyItemsBoolean addGroupMemberships
    
    SamlConfigurationPropertyItemsString groupMembershipAttribute
    
    SamlConfigurationPropertyItemsArray defaultGroups
    
    SamlConfigurationPropertyItemsString nameIdFormat
    
    SamlConfigurationPropertyItemsArray synchronizeAttributes
    
    SamlConfigurationPropertyItemsBoolean handleLogout
    
    SamlConfigurationPropertyItemsString logoutUrl
    
    SamlConfigurationPropertyItemsLong clockTolerance
    
    SamlConfigurationPropertyItemsString digestMethod
    
    SamlConfigurationPropertyItemsString signatureMethod
    
    SamlConfigurationPropertyItemsString userIntermediatePath
}
