/* SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO"; */
/* SET AUTOCOMMIT = 0; */
/* START TRANSACTION; */
/* SET time_zone = "+00:00"; */

-- --------------------------------------------------------

--
-- Table structure for table `BundleData` generated from model 'BundleData'
--

CREATE TABLE IF NOT EXISTS `BundleData` (
  `id` INT DEFAULT NULL COMMENT 'Bundle ID',
  `name` TEXT DEFAULT NULL COMMENT 'Bundle name',
  `fragment` TINYINT(1) DEFAULT NULL COMMENT 'Is bundle a fragment',
  `stateRaw` INT DEFAULT NULL COMMENT 'Numeric raw bundle state value',
  `state` TEXT DEFAULT NULL COMMENT 'Bundle state value',
  `version` TEXT DEFAULT NULL COMMENT 'Bundle version',
  `symbolicName` TEXT DEFAULT NULL COMMENT 'Bundle symbolic name',
  `category` TEXT DEFAULT NULL COMMENT 'Bundle category',
  `props` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `BundleDataProp` generated from model 'BundleDataProp'
--

CREATE TABLE IF NOT EXISTS `BundleDataProp` (
  `key` TEXT DEFAULT NULL COMMENT 'Bundle data key',
  `value` TEXT DEFAULT NULL COMMENT 'Bundle data value'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `BundleInfo` generated from model 'BundleInfo'
--

CREATE TABLE IF NOT EXISTS `BundleInfo` (
  `status` TEXT DEFAULT NULL COMMENT 'Status description of all bundles',
  `s` JSON DEFAULT NULL,
  `data` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `InstallStatus` generated from model 'InstallStatus'
--

CREATE TABLE IF NOT EXISTS `InstallStatus` (
  `status` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `InstallStatus_status` generated from model 'InstallStatusUnderscorestatus'
--

CREATE TABLE IF NOT EXISTS `InstallStatus_status` (
  `finished` TINYINT(1) DEFAULT NULL,
  `itemCount` INT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `KeystoreChainItems` generated from model 'KeystoreChainItems'
--

CREATE TABLE IF NOT EXISTS `KeystoreChainItems` (
  `subject` TEXT DEFAULT NULL COMMENT 'e.g. \&quot;CN&#x3D;localhost\&quot;',
  `issuer` TEXT DEFAULT NULL COMMENT 'e.g. \&quot;CN&#x3D;Admin\&quot;',
  `notBefore` TEXT DEFAULT NULL COMMENT 'e.g. \&quot;Sun Jul 01 12:00:00 AEST 2018\&quot;',
  `notAfter` TEXT DEFAULT NULL COMMENT 'e.g. \&quot;Sun Jun 30 23:59:50 AEST 2019\&quot;',
  `serialNumber` INT DEFAULT NULL COMMENT '18165099476682912368'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `KeystoreInfo` generated from model 'KeystoreInfo'
--

CREATE TABLE IF NOT EXISTS `KeystoreInfo` (
  `aliases` JSON DEFAULT NULL,
  `exists` TINYINT(1) DEFAULT NULL COMMENT 'False if truststore don&#39;t exist'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `KeystoreItems` generated from model 'KeystoreItems'
--

CREATE TABLE IF NOT EXISTS `KeystoreItems` (
  `alias` TEXT DEFAULT NULL COMMENT 'Keystore alias name',
  `entryType` TEXT DEFAULT NULL COMMENT 'e.g. \&quot;privateKey\&quot;',
  `algorithm` TEXT DEFAULT NULL COMMENT 'e.g. \&quot;RSA\&quot;',
  `format` TEXT DEFAULT NULL COMMENT 'e.g. \&quot;PKCS#8\&quot;',
  `chain` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `SamlConfigurationInfo` generated from model 'SamlConfigurationInfo'
--

CREATE TABLE IF NOT EXISTS `SamlConfigurationInfo` (
  `pid` TEXT DEFAULT NULL COMMENT 'Persistent Identity (PID)',
  `title` TEXT DEFAULT NULL COMMENT 'Title',
  `description` TEXT DEFAULT NULL COMMENT 'Title',
  `bundle_location` TEXT DEFAULT NULL COMMENT 'needed for configuration binding',
  `service_location` TEXT DEFAULT NULL COMMENT 'needed for configuraiton binding',
  `properties` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `SamlConfigurationProperties` generated from model 'SamlConfigurationProperties'
--

CREATE TABLE IF NOT EXISTS `SamlConfigurationProperties` (
  `path` TEXT DEFAULT NULL,
  `service.ranking` TEXT DEFAULT NULL,
  `idpUrl` TEXT DEFAULT NULL,
  `idpCertAlias` TEXT DEFAULT NULL,
  `idpHttpRedirect` TEXT DEFAULT NULL,
  `serviceProviderEntityId` TEXT DEFAULT NULL,
  `assertionConsumerServiceURL` TEXT DEFAULT NULL,
  `spPrivateKeyAlias` TEXT DEFAULT NULL,
  `keyStorePassword` TEXT DEFAULT NULL,
  `defaultRedirectUrl` TEXT DEFAULT NULL,
  `userIDAttribute` TEXT DEFAULT NULL,
  `useEncryption` TEXT DEFAULT NULL,
  `createUser` TEXT DEFAULT NULL,
  `addGroupMemberships` TEXT DEFAULT NULL,
  `groupMembershipAttribute` TEXT DEFAULT NULL,
  `defaultGroups` TEXT DEFAULT NULL,
  `nameIdFormat` TEXT DEFAULT NULL,
  `synchronizeAttributes` TEXT DEFAULT NULL,
  `handleLogout` TEXT DEFAULT NULL,
  `logoutUrl` TEXT DEFAULT NULL,
  `clockTolerance` TEXT DEFAULT NULL,
  `digestMethod` TEXT DEFAULT NULL,
  `signatureMethod` TEXT DEFAULT NULL,
  `userIntermediatePath` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `SamlConfigurationPropertyItemsArray` generated from model 'SamlConfigurationPropertyItemsArray'
--

CREATE TABLE IF NOT EXISTS `SamlConfigurationPropertyItemsArray` (
  `name` TEXT DEFAULT NULL COMMENT 'property name',
  `optional` TINYINT(1) DEFAULT NULL COMMENT 'True if optional',
  `is_set` TINYINT(1) DEFAULT NULL COMMENT 'True if property is set',
  `type` INT DEFAULT NULL COMMENT 'Property type, 1&#x3D;String, 3&#x3D;long, 11&#x3D;boolean, 12&#x3D;Password',
  `values` JSON DEFAULT NULL COMMENT 'Property value',
  `description` TEXT DEFAULT NULL COMMENT 'Property description'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `SamlConfigurationPropertyItemsBoolean` generated from model 'SamlConfigurationPropertyItemsBoolean'
--

CREATE TABLE IF NOT EXISTS `SamlConfigurationPropertyItemsBoolean` (
  `name` TEXT DEFAULT NULL COMMENT 'property name',
  `optional` TINYINT(1) DEFAULT NULL COMMENT 'True if optional',
  `is_set` TINYINT(1) DEFAULT NULL COMMENT 'True if property is set',
  `type` INT DEFAULT NULL COMMENT 'Property type, 1&#x3D;String, 3&#x3D;long, 11&#x3D;boolean, 12&#x3D;Password',
  `value` TINYINT(1) DEFAULT NULL COMMENT 'Property value',
  `description` TEXT DEFAULT NULL COMMENT 'Property description'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `SamlConfigurationPropertyItemsLong` generated from model 'SamlConfigurationPropertyItemsLong'
--

CREATE TABLE IF NOT EXISTS `SamlConfigurationPropertyItemsLong` (
  `name` TEXT DEFAULT NULL COMMENT 'property name',
  `optional` TINYINT(1) DEFAULT NULL COMMENT 'True if optional',
  `is_set` TINYINT(1) DEFAULT NULL COMMENT 'True if property is set',
  `type` INT DEFAULT NULL COMMENT 'Property type, 1&#x3D;String, 3&#x3D;long, 11&#x3D;boolean, 12&#x3D;Password',
  `value` INT DEFAULT NULL COMMENT 'Property value',
  `description` TEXT DEFAULT NULL COMMENT 'Property description'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `SamlConfigurationPropertyItemsString` generated from model 'SamlConfigurationPropertyItemsString'
--

CREATE TABLE IF NOT EXISTS `SamlConfigurationPropertyItemsString` (
  `name` TEXT DEFAULT NULL COMMENT 'property name',
  `optional` TINYINT(1) DEFAULT NULL COMMENT 'True if optional',
  `is_set` TINYINT(1) DEFAULT NULL COMMENT 'True if property is set',
  `type` INT DEFAULT NULL COMMENT 'Property type, 1&#x3D;String, 3&#x3D;long, 11&#x3D;boolean, 12&#x3D;Password',
  `value` TEXT DEFAULT NULL COMMENT 'Property value',
  `description` TEXT DEFAULT NULL COMMENT 'Property description'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `TruststoreInfo` generated from model 'TruststoreInfo'
--

CREATE TABLE IF NOT EXISTS `TruststoreInfo` (
  `aliases` JSON DEFAULT NULL,
  `exists` TINYINT(1) DEFAULT NULL COMMENT 'False if truststore don&#39;t exist'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `TruststoreItems` generated from model 'TruststoreItems'
--

CREATE TABLE IF NOT EXISTS `TruststoreItems` (
  `alias` TEXT DEFAULT NULL COMMENT 'Truststore alias name',
  `entryType` TEXT DEFAULT NULL,
  `subject` TEXT DEFAULT NULL COMMENT 'e.g. \&quot;CN&#x3D;localhost\&quot;',
  `issuer` TEXT DEFAULT NULL COMMENT 'e.g. \&quot;CN&#x3D;Admin\&quot;',
  `notBefore` TEXT DEFAULT NULL COMMENT 'e.g. \&quot;Sun Jul 01 12:00:00 AEST 2018\&quot;',
  `notAfter` TEXT DEFAULT NULL COMMENT 'e.g. \&quot;Sun Jun 30 23:59:50 AEST 2019\&quot;',
  `serialNumber` INT DEFAULT NULL COMMENT '18165099476682912368'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;


