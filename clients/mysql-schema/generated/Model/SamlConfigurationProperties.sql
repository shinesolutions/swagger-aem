--
-- Adobe Experience Manager (AEM) API.
-- Prepared SQL queries for 'SamlConfigurationProperties' definition.
--


--
-- SELECT template for table `SamlConfigurationProperties`
--
SELECT `path`, `service.ranking`, `idpUrl`, `idpCertAlias`, `idpHttpRedirect`, `serviceProviderEntityId`, `assertionConsumerServiceURL`, `spPrivateKeyAlias`, `keyStorePassword`, `defaultRedirectUrl`, `userIDAttribute`, `useEncryption`, `createUser`, `addGroupMemberships`, `groupMembershipAttribute`, `defaultGroups`, `nameIdFormat`, `synchronizeAttributes`, `handleLogout`, `logoutUrl`, `clockTolerance`, `digestMethod`, `signatureMethod`, `userIntermediatePath` FROM `SamlConfigurationProperties` WHERE 1;

--
-- INSERT template for table `SamlConfigurationProperties`
--
INSERT INTO `SamlConfigurationProperties`(`path`, `service.ranking`, `idpUrl`, `idpCertAlias`, `idpHttpRedirect`, `serviceProviderEntityId`, `assertionConsumerServiceURL`, `spPrivateKeyAlias`, `keyStorePassword`, `defaultRedirectUrl`, `userIDAttribute`, `useEncryption`, `createUser`, `addGroupMemberships`, `groupMembershipAttribute`, `defaultGroups`, `nameIdFormat`, `synchronizeAttributes`, `handleLogout`, `logoutUrl`, `clockTolerance`, `digestMethod`, `signatureMethod`, `userIntermediatePath`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `SamlConfigurationProperties`
--
UPDATE `SamlConfigurationProperties` SET `path` = ?, `service.ranking` = ?, `idpUrl` = ?, `idpCertAlias` = ?, `idpHttpRedirect` = ?, `serviceProviderEntityId` = ?, `assertionConsumerServiceURL` = ?, `spPrivateKeyAlias` = ?, `keyStorePassword` = ?, `defaultRedirectUrl` = ?, `userIDAttribute` = ?, `useEncryption` = ?, `createUser` = ?, `addGroupMemberships` = ?, `groupMembershipAttribute` = ?, `defaultGroups` = ?, `nameIdFormat` = ?, `synchronizeAttributes` = ?, `handleLogout` = ?, `logoutUrl` = ?, `clockTolerance` = ?, `digestMethod` = ?, `signatureMethod` = ?, `userIntermediatePath` = ? WHERE 1;

--
-- DELETE template for table `SamlConfigurationProperties`
--
DELETE FROM `SamlConfigurationProperties` WHERE 0;

