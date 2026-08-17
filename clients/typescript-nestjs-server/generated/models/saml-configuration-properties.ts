import { SamlConfigurationPropertyItemsArray } from './saml-configuration-property-items-array';
import { SamlConfigurationPropertyItemsString } from './saml-configuration-property-items-string';
import { SamlConfigurationPropertyItemsLong } from './saml-configuration-property-items-long';
import { SamlConfigurationPropertyItemsBoolean } from './saml-configuration-property-items-boolean';


export interface SamlConfigurationProperties { 
  path?: SamlConfigurationPropertyItemsArray;
  'service.ranking'?: SamlConfigurationPropertyItemsLong;
  idpUrl?: SamlConfigurationPropertyItemsString;
  idpCertAlias?: SamlConfigurationPropertyItemsString;
  idpHttpRedirect?: SamlConfigurationPropertyItemsBoolean;
  serviceProviderEntityId?: SamlConfigurationPropertyItemsString;
  assertionConsumerServiceURL?: SamlConfigurationPropertyItemsString;
  spPrivateKeyAlias?: SamlConfigurationPropertyItemsString;
  keyStorePassword?: SamlConfigurationPropertyItemsString;
  defaultRedirectUrl?: SamlConfigurationPropertyItemsString;
  userIDAttribute?: SamlConfigurationPropertyItemsString;
  useEncryption?: SamlConfigurationPropertyItemsBoolean;
  createUser?: SamlConfigurationPropertyItemsBoolean;
  addGroupMemberships?: SamlConfigurationPropertyItemsBoolean;
  groupMembershipAttribute?: SamlConfigurationPropertyItemsString;
  defaultGroups?: SamlConfigurationPropertyItemsArray;
  nameIdFormat?: SamlConfigurationPropertyItemsString;
  synchronizeAttributes?: SamlConfigurationPropertyItemsArray;
  handleLogout?: SamlConfigurationPropertyItemsBoolean;
  logoutUrl?: SamlConfigurationPropertyItemsString;
  clockTolerance?: SamlConfigurationPropertyItemsLong;
  digestMethod?: SamlConfigurationPropertyItemsString;
  signatureMethod?: SamlConfigurationPropertyItemsString;
  userIntermediatePath?: SamlConfigurationPropertyItemsString;
}

