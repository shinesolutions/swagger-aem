

-- --------------------------------------------------------------------------
-- Table structure for table `BundleData` generated from model 'bundleData'
--

CREATE TABLE IF NOT EXISTS `BundleData` (
  `id` int PRIMARY KEY AUTOINCREMENT /*Bundle ID*/,
  `name` text /*Bundle name*/,
  `fragment` boolean /*Is bundle a fragment*/,
  `stateRaw` int /*Numeric raw bundle state value*/,
  `state` text /*Bundle state value*/,
  `version` text /*Bundle version*/,
  `symbolicName` text /*Bundle symbolic name*/,
  `category` text /*Bundle category*/,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `BundleDataBundleDataProp` generated from model 'BundleDataBundleDataProp'

CREATE TABLE IF NOT EXISTS `BundleDataBundleDataProp` (
  `bundleData` long NOT NULL
  `bundleDataProp` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `BundleDataProp` generated from model 'bundleDataProp'
--

CREATE TABLE IF NOT EXISTS `BundleDataProp` (
  `key` text /*Bundle data key*/,
  `value` text /*Bundle data value*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `BundleInfo` generated from model 'bundleInfo'
--

CREATE TABLE IF NOT EXISTS `BundleInfo` (
  `status` text /*Status description of all bundles*/,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `BundleInfoS` generated from model 'BundleInfoS'

CREATE TABLE IF NOT EXISTS `BundleInfoS` (
  `bundleInfo` long NOT NULL
  `s` int NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `BundleInfoBundleData` generated from model 'BundleInfoBundleData'

CREATE TABLE IF NOT EXISTS `BundleInfoBundleData` (
  `bundleInfo` long NOT NULL
  `bundleData` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `InstallStatus` generated from model 'installStatus'
--

CREATE TABLE IF NOT EXISTS `InstallStatus` (
  `status` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `InstallStatus_status` generated from model 'installStatusStatus'
--

CREATE TABLE IF NOT EXISTS `InstallStatus_status` (
  `finished` boolean,
  `itemCount` int
); 


-- --------------------------------------------------------------------------
-- Table structure for table `KeystoreChainItems` generated from model 'keystoreChainItems'
--

CREATE TABLE IF NOT EXISTS `KeystoreChainItems` (
  `subject` text /*e.g. \&quot;CN&#x3D;localhost\&quot;*/,
  `issuer` text /*e.g. \&quot;CN&#x3D;Admin\&quot;*/,
  `notBefore` text /*e.g. \&quot;Sun Jul 01 12:00:00 AEST 2018\&quot;*/,
  `notAfter` text /*e.g. \&quot;Sun Jun 30 23:59:50 AEST 2019\&quot;*/,
  `serialNumber` int /*18165099476682912368*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `KeystoreInfo` generated from model 'keystoreInfo'
--

CREATE TABLE IF NOT EXISTS `KeystoreInfo` (
  `exists` boolean /*False if truststore don&#39;t exist*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `KeystoreInfoKeystoreItems` generated from model 'KeystoreInfoKeystoreItems'

CREATE TABLE IF NOT EXISTS `KeystoreInfoKeystoreItems` (
  `keystoreInfo` long NOT NULL
  `keystoreItems` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `KeystoreItems` generated from model 'keystoreItems'
--

CREATE TABLE IF NOT EXISTS `KeystoreItems` (
  `alias` text /*Keystore alias name*/,
  `entryType` text /*e.g. \&quot;privateKey\&quot;*/,
  `algorithm` text /*e.g. \&quot;RSA\&quot;*/,
  `format` text /*e.g. \&quot;PKCS#8\&quot;*/,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `KeystoreItemsKeystoreChainItems` generated from model 'KeystoreItemsKeystoreChainItems'

CREATE TABLE IF NOT EXISTS `KeystoreItemsKeystoreChainItems` (
  `keystoreItems` long NOT NULL
  `keystoreChainItems` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `SamlConfigurationInfo` generated from model 'samlConfigurationInfo'
--

CREATE TABLE IF NOT EXISTS `SamlConfigurationInfo` (
  `pid` text /*Persistent Identity (PID)*/,
  `title` text /*Title*/,
  `description` text /*Title*/,
  `bundle_location` text /*needed for configuration binding*/,
  `service_location` text /*needed for configuraiton binding*/,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `SamlConfigurationProperties` generated from model 'samlConfigurationProperties'
--

CREATE TABLE IF NOT EXISTS `SamlConfigurationProperties` (
  `path` long,
  `serviceranking` long,
  `idpUrl` long,
  `idpCertAlias` long,
  `idpHttpRedirect` long,
  `serviceProviderEntityId` long,
  `assertionConsumerServiceURL` long,
  `spPrivateKeyAlias` long,
  `keyStorePassword` long,
  `defaultRedirectUrl` long,
  `userIDAttribute` long,
  `useEncryption` long,
  `createUser` long,
  `addGroupMemberships` long,
  `groupMembershipAttribute` long,
  `defaultGroups` long,
  `nameIdFormat` long,
  `synchronizeAttributes` long,
  `handleLogout` long,
  `logoutUrl` long,
  `clockTolerance` long,
  `digestMethod` long,
  `signatureMethod` long,
  `userIntermediatePath` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `SamlConfigurationPropertyItemsArray` generated from model 'samlConfigurationPropertyItemsArray'
--

CREATE TABLE IF NOT EXISTS `SamlConfigurationPropertyItemsArray` (
  `name` text /*property name*/,
  `optional` boolean /*True if optional*/,
  `is_set` boolean /*True if property is set*/,
  `type` int /*Property type, 1&#x3D;String, 3&#x3D;long, 11&#x3D;boolean, 12&#x3D;Password*/,
  `description` text /*Property description*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `SamlConfigurationPropertyItemsArrayPropertyValues` generated from model 'SamlConfigurationPropertyItemsArrayPropertyValues'

CREATE TABLE IF NOT EXISTS `SamlConfigurationPropertyItemsArrayPropertyValues` (
  `samlConfigurationPropertyItemsArray` long NOT NULL
  `propertyValues` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `SamlConfigurationPropertyItemsBoolean` generated from model 'samlConfigurationPropertyItemsBoolean'
--

CREATE TABLE IF NOT EXISTS `SamlConfigurationPropertyItemsBoolean` (
  `name` text /*property name*/,
  `optional` boolean /*True if optional*/,
  `is_set` boolean /*True if property is set*/,
  `type` int /*Property type, 1&#x3D;String, 3&#x3D;long, 11&#x3D;boolean, 12&#x3D;Password*/,
  `value` boolean /*Property value*/,
  `description` text /*Property description*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `SamlConfigurationPropertyItemsLong` generated from model 'samlConfigurationPropertyItemsLong'
--

CREATE TABLE IF NOT EXISTS `SamlConfigurationPropertyItemsLong` (
  `name` text /*property name*/,
  `optional` boolean /*True if optional*/,
  `is_set` boolean /*True if property is set*/,
  `type` int /*Property type, 1&#x3D;String, 3&#x3D;long, 11&#x3D;boolean, 12&#x3D;Password*/,
  `value` int /*Property value*/,
  `description` text /*Property description*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `SamlConfigurationPropertyItemsString` generated from model 'samlConfigurationPropertyItemsString'
--

CREATE TABLE IF NOT EXISTS `SamlConfigurationPropertyItemsString` (
  `name` text /*property name*/,
  `optional` boolean /*True if optional*/,
  `is_set` boolean /*True if property is set*/,
  `type` int /*Property type, 1&#x3D;String, 3&#x3D;long, 11&#x3D;boolean, 12&#x3D;Password*/,
  `value` text /*Property value*/,
  `description` text /*Property description*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `TruststoreInfo` generated from model 'truststoreInfo'
--

CREATE TABLE IF NOT EXISTS `TruststoreInfo` (
  `exists` boolean /*False if truststore don&#39;t exist*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `TruststoreInfoTruststoreItems` generated from model 'TruststoreInfoTruststoreItems'

CREATE TABLE IF NOT EXISTS `TruststoreInfoTruststoreItems` (
  `truststoreInfo` long NOT NULL
  `truststoreItems` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `TruststoreItems` generated from model 'truststoreItems'
--

CREATE TABLE IF NOT EXISTS `TruststoreItems` (
  `alias` text /*Truststore alias name*/,
  `entryType` text,
  `subject` text /*e.g. \&quot;CN&#x3D;localhost\&quot;*/,
  `issuer` text /*e.g. \&quot;CN&#x3D;Admin\&quot;*/,
  `notBefore` text /*e.g. \&quot;Sun Jul 01 12:00:00 AEST 2018\&quot;*/,
  `notAfter` text /*e.g. \&quot;Sun Jun 30 23:59:50 AEST 2019\&quot;*/,
  `serialNumber` int /*18165099476682912368*/
); 



--
-- Table structure for table `_db_version`
--
CREATE TABLE IF NOT EXISTS `_db_version` (
  `version`    LONG    DEFAULT 1
);
