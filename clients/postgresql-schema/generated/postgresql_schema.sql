--
-- Schema objects for PostgreSQL
-- "Adobe Experience Manager (AEM) API"
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--

--
-- DROP OBJECTS
-- (remove comment prefix to start using DROP commands)
--
-- TABLES
--
-- DROP TABLE IF EXISTS bundle_data;
-- DROP TABLE IF EXISTS bundle_data_prop;
-- DROP TABLE IF EXISTS bundle_info;
-- DROP TABLE IF EXISTS install_status;
-- DROP TABLE IF EXISTS install_status_status;
-- DROP TABLE IF EXISTS keystore_chain_items;
-- DROP TABLE IF EXISTS keystore_info;
-- DROP TABLE IF EXISTS keystore_items;
-- DROP TABLE IF EXISTS saml_configuration_info;
-- DROP TABLE IF EXISTS saml_configuration_properties;
-- DROP TABLE IF EXISTS saml_configuration_property_items_array;
-- DROP TABLE IF EXISTS saml_configuration_property_items_boolean;
-- DROP TABLE IF EXISTS saml_configuration_property_items_long;
-- DROP TABLE IF EXISTS saml_configuration_property_items_string;
-- DROP TABLE IF EXISTS truststore_info;
-- DROP TABLE IF EXISTS truststore_items;

--
-- TYPES
--


--
-- CREATE OBJECTS
--
-- TYPES
--

--
-- TABLES
--
--
-- Table 'bundle_data' generated from model 'BundleData'
--
CREATE TABLE IF NOT EXISTS bundle_data (
    "id" INTEGER DEFAULT NULL,
    "name" TEXT DEFAULT NULL,
    fragment BOOLEAN DEFAULT NULL,
    state_raw INTEGER DEFAULT NULL,
    "state" TEXT DEFAULT NULL,
    "version" TEXT DEFAULT NULL,
    symbolic_name TEXT DEFAULT NULL,
    category TEXT DEFAULT NULL,
    props JSON DEFAULT NULL
);
COMMENT ON TABLE bundle_data IS 'Original model name - BundleData.';
COMMENT ON COLUMN bundle_data."id" IS 'Bundle ID';
COMMENT ON COLUMN bundle_data."name" IS 'Bundle name';
COMMENT ON COLUMN bundle_data.fragment IS 'Is bundle a fragment';
COMMENT ON COLUMN bundle_data.state_raw IS 'Numeric raw bundle state value. Original param name - stateRaw.';
COMMENT ON COLUMN bundle_data."state" IS 'Bundle state value';
COMMENT ON COLUMN bundle_data."version" IS 'Bundle version';
COMMENT ON COLUMN bundle_data.symbolic_name IS 'Bundle symbolic name. Original param name - symbolicName.';
COMMENT ON COLUMN bundle_data.category IS 'Bundle category';

--
-- Table 'bundle_data_prop' generated from model 'BundleDataProp'
--
CREATE TABLE IF NOT EXISTS bundle_data_prop (
    "key" TEXT DEFAULT NULL,
    "value" TEXT DEFAULT NULL
);
COMMENT ON TABLE bundle_data_prop IS 'Original model name - BundleDataProp.';
COMMENT ON COLUMN bundle_data_prop."key" IS 'Bundle data key';
COMMENT ON COLUMN bundle_data_prop."value" IS 'Bundle data value';

--
-- Table 'bundle_info' generated from model 'BundleInfo'
--
CREATE TABLE IF NOT EXISTS bundle_info (
    status TEXT DEFAULT NULL,
    s JSON DEFAULT NULL,
    "data" JSON DEFAULT NULL
);
COMMENT ON TABLE bundle_info IS 'Original model name - BundleInfo.';
COMMENT ON COLUMN bundle_info.status IS 'Status description of all bundles';

--
-- Table 'install_status' generated from model 'InstallStatus'
--
CREATE TABLE IF NOT EXISTS install_status (
    status TEXT DEFAULT NULL
);
COMMENT ON TABLE install_status IS 'Original model name - InstallStatus.';

--
-- Table 'install_status_status' generated from model 'InstallStatusUnderscorestatus'
--
CREATE TABLE IF NOT EXISTS install_status_status (
    finished BOOLEAN DEFAULT NULL,
    item_count INTEGER DEFAULT NULL
);
COMMENT ON TABLE install_status_status IS 'Original model name - InstallStatus_status.';
COMMENT ON COLUMN install_status_status.item_count IS 'Original param name - itemCount.';

--
-- Table 'keystore_chain_items' generated from model 'KeystoreChainItems'
--
CREATE TABLE IF NOT EXISTS keystore_chain_items (
    subject TEXT DEFAULT NULL,
    issuer TEXT DEFAULT NULL,
    not_before TEXT DEFAULT NULL,
    not_after TEXT DEFAULT NULL,
    serial_number INTEGER DEFAULT NULL
);
COMMENT ON TABLE keystore_chain_items IS 'Original model name - KeystoreChainItems.';
COMMENT ON COLUMN keystore_chain_items.subject IS 'e.g. \&quot;CN&#x3D;localhost\&quot;';
COMMENT ON COLUMN keystore_chain_items.issuer IS 'e.g. \&quot;CN&#x3D;Admin\&quot;';
COMMENT ON COLUMN keystore_chain_items.not_before IS 'e.g. \&quot;Sun Jul 01 12:00:00 AEST 2018\&quot;. Original param name - notBefore.';
COMMENT ON COLUMN keystore_chain_items.not_after IS 'e.g. \&quot;Sun Jun 30 23:59:50 AEST 2019\&quot;. Original param name - notAfter.';
COMMENT ON COLUMN keystore_chain_items.serial_number IS '18165099476682912368. Original param name - serialNumber.';

--
-- Table 'keystore_info' generated from model 'KeystoreInfo'
--
CREATE TABLE IF NOT EXISTS keystore_info (
    aliases JSON DEFAULT NULL,
    "exists" BOOLEAN DEFAULT NULL
);
COMMENT ON TABLE keystore_info IS 'Original model name - KeystoreInfo.';
COMMENT ON COLUMN keystore_info."exists" IS 'False if truststore don&#39;t exist';

--
-- Table 'keystore_items' generated from model 'KeystoreItems'
--
CREATE TABLE IF NOT EXISTS keystore_items (
    alias TEXT DEFAULT NULL,
    entry_type TEXT DEFAULT NULL,
    algorithm TEXT DEFAULT NULL,
    "format" TEXT DEFAULT NULL,
    "chain" JSON DEFAULT NULL
);
COMMENT ON TABLE keystore_items IS 'Original model name - KeystoreItems.';
COMMENT ON COLUMN keystore_items.alias IS 'Keystore alias name';
COMMENT ON COLUMN keystore_items.entry_type IS 'e.g. \&quot;privateKey\&quot;. Original param name - entryType.';
COMMENT ON COLUMN keystore_items.algorithm IS 'e.g. \&quot;RSA\&quot;';
COMMENT ON COLUMN keystore_items."format" IS 'e.g. \&quot;PKCS#8\&quot;';

--
-- Table 'saml_configuration_info' generated from model 'SamlConfigurationInfo'
--
CREATE TABLE IF NOT EXISTS saml_configuration_info (
    pid TEXT DEFAULT NULL,
    title TEXT DEFAULT NULL,
    description TEXT DEFAULT NULL,
    bundle_location TEXT DEFAULT NULL,
    service_location TEXT DEFAULT NULL,
    properties TEXT DEFAULT NULL
);
COMMENT ON TABLE saml_configuration_info IS 'Original model name - SamlConfigurationInfo.';
COMMENT ON COLUMN saml_configuration_info.pid IS 'Persistent Identity (PID)';
COMMENT ON COLUMN saml_configuration_info.title IS 'Title';
COMMENT ON COLUMN saml_configuration_info.description IS 'Title';
COMMENT ON COLUMN saml_configuration_info.bundle_location IS 'needed for configuration binding';
COMMENT ON COLUMN saml_configuration_info.service_location IS 'needed for configuraiton binding';

--
-- Table 'saml_configuration_properties' generated from model 'SamlConfigurationProperties'
--
CREATE TABLE IF NOT EXISTS saml_configuration_properties (
    "path" TEXT DEFAULT NULL,
    service/ranking TEXT DEFAULT NULL,
    idp_url TEXT DEFAULT NULL,
    idp_cert_alias TEXT DEFAULT NULL,
    idp_http_redirect TEXT DEFAULT NULL,
    service_provider_entity_id TEXT DEFAULT NULL,
    assertion_consumer_service_url TEXT DEFAULT NULL,
    sp_private_key_alias TEXT DEFAULT NULL,
    key_store_password TEXT DEFAULT NULL,
    default_redirect_url TEXT DEFAULT NULL,
    user_id_attribute TEXT DEFAULT NULL,
    use_encryption TEXT DEFAULT NULL,
    create_user TEXT DEFAULT NULL,
    add_group_memberships TEXT DEFAULT NULL,
    group_membership_attribute TEXT DEFAULT NULL,
    default_groups TEXT DEFAULT NULL,
    name_id_format TEXT DEFAULT NULL,
    synchronize_attributes TEXT DEFAULT NULL,
    handle_logout TEXT DEFAULT NULL,
    logout_url TEXT DEFAULT NULL,
    clock_tolerance TEXT DEFAULT NULL,
    digest_method TEXT DEFAULT NULL,
    signature_method TEXT DEFAULT NULL,
    user_intermediate_path TEXT DEFAULT NULL
);
COMMENT ON TABLE saml_configuration_properties IS 'Original model name - SamlConfigurationProperties.';
COMMENT ON COLUMN saml_configuration_properties.service/ranking IS 'Original param name - service.ranking.';
COMMENT ON COLUMN saml_configuration_properties.idp_url IS 'Original param name - idpUrl.';
COMMENT ON COLUMN saml_configuration_properties.idp_cert_alias IS 'Original param name - idpCertAlias.';
COMMENT ON COLUMN saml_configuration_properties.idp_http_redirect IS 'Original param name - idpHttpRedirect.';
COMMENT ON COLUMN saml_configuration_properties.service_provider_entity_id IS 'Original param name - serviceProviderEntityId.';
COMMENT ON COLUMN saml_configuration_properties.assertion_consumer_service_url IS 'Original param name - assertionConsumerServiceURL.';
COMMENT ON COLUMN saml_configuration_properties.sp_private_key_alias IS 'Original param name - spPrivateKeyAlias.';
COMMENT ON COLUMN saml_configuration_properties.key_store_password IS 'Original param name - keyStorePassword.';
COMMENT ON COLUMN saml_configuration_properties.default_redirect_url IS 'Original param name - defaultRedirectUrl.';
COMMENT ON COLUMN saml_configuration_properties.user_id_attribute IS 'Original param name - userIDAttribute.';
COMMENT ON COLUMN saml_configuration_properties.use_encryption IS 'Original param name - useEncryption.';
COMMENT ON COLUMN saml_configuration_properties.create_user IS 'Original param name - createUser.';
COMMENT ON COLUMN saml_configuration_properties.add_group_memberships IS 'Original param name - addGroupMemberships.';
COMMENT ON COLUMN saml_configuration_properties.group_membership_attribute IS 'Original param name - groupMembershipAttribute.';
COMMENT ON COLUMN saml_configuration_properties.default_groups IS 'Original param name - defaultGroups.';
COMMENT ON COLUMN saml_configuration_properties.name_id_format IS 'Original param name - nameIdFormat.';
COMMENT ON COLUMN saml_configuration_properties.synchronize_attributes IS 'Original param name - synchronizeAttributes.';
COMMENT ON COLUMN saml_configuration_properties.handle_logout IS 'Original param name - handleLogout.';
COMMENT ON COLUMN saml_configuration_properties.logout_url IS 'Original param name - logoutUrl.';
COMMENT ON COLUMN saml_configuration_properties.clock_tolerance IS 'Original param name - clockTolerance.';
COMMENT ON COLUMN saml_configuration_properties.digest_method IS 'Original param name - digestMethod.';
COMMENT ON COLUMN saml_configuration_properties.signature_method IS 'Original param name - signatureMethod.';
COMMENT ON COLUMN saml_configuration_properties.user_intermediate_path IS 'Original param name - userIntermediatePath.';

--
-- Table 'saml_configuration_property_items_array' generated from model 'SamlConfigurationPropertyItemsArray'
--
CREATE TABLE IF NOT EXISTS saml_configuration_property_items_array (
    "name" TEXT DEFAULT NULL,
    optional BOOLEAN DEFAULT NULL,
    is_set BOOLEAN DEFAULT NULL,
    "type" INTEGER DEFAULT NULL,
    "values" JSON DEFAULT NULL,
    description TEXT DEFAULT NULL
);
COMMENT ON TABLE saml_configuration_property_items_array IS 'Original model name - SamlConfigurationPropertyItemsArray.';
COMMENT ON COLUMN saml_configuration_property_items_array."name" IS 'property name';
COMMENT ON COLUMN saml_configuration_property_items_array.optional IS 'True if optional';
COMMENT ON COLUMN saml_configuration_property_items_array.is_set IS 'True if property is set';
COMMENT ON COLUMN saml_configuration_property_items_array."type" IS 'Property type, 1&#x3D;String, 3&#x3D;long, 11&#x3D;boolean, 12&#x3D;Password';
COMMENT ON COLUMN saml_configuration_property_items_array."values" IS 'Property value';
COMMENT ON COLUMN saml_configuration_property_items_array.description IS 'Property description';

--
-- Table 'saml_configuration_property_items_boolean' generated from model 'SamlConfigurationPropertyItemsBoolean'
--
CREATE TABLE IF NOT EXISTS saml_configuration_property_items_boolean (
    "name" TEXT DEFAULT NULL,
    optional BOOLEAN DEFAULT NULL,
    is_set BOOLEAN DEFAULT NULL,
    "type" INTEGER DEFAULT NULL,
    "value" BOOLEAN DEFAULT NULL,
    description TEXT DEFAULT NULL
);
COMMENT ON TABLE saml_configuration_property_items_boolean IS 'Original model name - SamlConfigurationPropertyItemsBoolean.';
COMMENT ON COLUMN saml_configuration_property_items_boolean."name" IS 'property name';
COMMENT ON COLUMN saml_configuration_property_items_boolean.optional IS 'True if optional';
COMMENT ON COLUMN saml_configuration_property_items_boolean.is_set IS 'True if property is set';
COMMENT ON COLUMN saml_configuration_property_items_boolean."type" IS 'Property type, 1&#x3D;String, 3&#x3D;long, 11&#x3D;boolean, 12&#x3D;Password';
COMMENT ON COLUMN saml_configuration_property_items_boolean."value" IS 'Property value';
COMMENT ON COLUMN saml_configuration_property_items_boolean.description IS 'Property description';

--
-- Table 'saml_configuration_property_items_long' generated from model 'SamlConfigurationPropertyItemsLong'
--
CREATE TABLE IF NOT EXISTS saml_configuration_property_items_long (
    "name" TEXT DEFAULT NULL,
    optional BOOLEAN DEFAULT NULL,
    is_set BOOLEAN DEFAULT NULL,
    "type" INTEGER DEFAULT NULL,
    "value" INTEGER DEFAULT NULL,
    description TEXT DEFAULT NULL
);
COMMENT ON TABLE saml_configuration_property_items_long IS 'Original model name - SamlConfigurationPropertyItemsLong.';
COMMENT ON COLUMN saml_configuration_property_items_long."name" IS 'property name';
COMMENT ON COLUMN saml_configuration_property_items_long.optional IS 'True if optional';
COMMENT ON COLUMN saml_configuration_property_items_long.is_set IS 'True if property is set';
COMMENT ON COLUMN saml_configuration_property_items_long."type" IS 'Property type, 1&#x3D;String, 3&#x3D;long, 11&#x3D;boolean, 12&#x3D;Password';
COMMENT ON COLUMN saml_configuration_property_items_long."value" IS 'Property value';
COMMENT ON COLUMN saml_configuration_property_items_long.description IS 'Property description';

--
-- Table 'saml_configuration_property_items_string' generated from model 'SamlConfigurationPropertyItemsString'
--
CREATE TABLE IF NOT EXISTS saml_configuration_property_items_string (
    "name" TEXT DEFAULT NULL,
    optional BOOLEAN DEFAULT NULL,
    is_set BOOLEAN DEFAULT NULL,
    "type" INTEGER DEFAULT NULL,
    "value" TEXT DEFAULT NULL,
    description TEXT DEFAULT NULL
);
COMMENT ON TABLE saml_configuration_property_items_string IS 'Original model name - SamlConfigurationPropertyItemsString.';
COMMENT ON COLUMN saml_configuration_property_items_string."name" IS 'property name';
COMMENT ON COLUMN saml_configuration_property_items_string.optional IS 'True if optional';
COMMENT ON COLUMN saml_configuration_property_items_string.is_set IS 'True if property is set';
COMMENT ON COLUMN saml_configuration_property_items_string."type" IS 'Property type, 1&#x3D;String, 3&#x3D;long, 11&#x3D;boolean, 12&#x3D;Password';
COMMENT ON COLUMN saml_configuration_property_items_string."value" IS 'Property value';
COMMENT ON COLUMN saml_configuration_property_items_string.description IS 'Property description';

--
-- Table 'truststore_info' generated from model 'TruststoreInfo'
--
CREATE TABLE IF NOT EXISTS truststore_info (
    aliases JSON DEFAULT NULL,
    "exists" BOOLEAN DEFAULT NULL
);
COMMENT ON TABLE truststore_info IS 'Original model name - TruststoreInfo.';
COMMENT ON COLUMN truststore_info."exists" IS 'False if truststore don&#39;t exist';

--
-- Table 'truststore_items' generated from model 'TruststoreItems'
--
CREATE TABLE IF NOT EXISTS truststore_items (
    alias TEXT DEFAULT NULL,
    entry_type TEXT DEFAULT NULL,
    subject TEXT DEFAULT NULL,
    issuer TEXT DEFAULT NULL,
    not_before TEXT DEFAULT NULL,
    not_after TEXT DEFAULT NULL,
    serial_number INTEGER DEFAULT NULL
);
COMMENT ON TABLE truststore_items IS 'Original model name - TruststoreItems.';
COMMENT ON COLUMN truststore_items.alias IS 'Truststore alias name';
COMMENT ON COLUMN truststore_items.entry_type IS 'Original param name - entryType.';
COMMENT ON COLUMN truststore_items.subject IS 'e.g. \&quot;CN&#x3D;localhost\&quot;';
COMMENT ON COLUMN truststore_items.issuer IS 'e.g. \&quot;CN&#x3D;Admin\&quot;';
COMMENT ON COLUMN truststore_items.not_before IS 'e.g. \&quot;Sun Jul 01 12:00:00 AEST 2018\&quot;. Original param name - notBefore.';
COMMENT ON COLUMN truststore_items.not_after IS 'e.g. \&quot;Sun Jun 30 23:59:50 AEST 2019\&quot;. Original param name - notAfter.';
COMMENT ON COLUMN truststore_items.serial_number IS '18165099476682912368. Original param name - serialNumber.';

