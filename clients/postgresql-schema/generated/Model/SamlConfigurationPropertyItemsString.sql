--
-- "Adobe Experience Manager (AEM) API"
-- Prepared SQL queries for 'SamlConfigurationPropertyItemsString' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'saml_configuration_property_items_string'
--
SELECT "name", optional, is_set, "type", "value", description FROM saml_configuration_property_items_string WHERE 1=1;

--
-- INSERT template for table 'saml_configuration_property_items_string'
--
INSERT INTO saml_configuration_property_items_string ("name", optional, is_set, "type", "value", description) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'saml_configuration_property_items_string'
--
UPDATE saml_configuration_property_items_string SET "name" = ?, optional = ?, is_set = ?, "type" = ?, "value" = ?, description = ? WHERE 1=2;

--
-- DELETE template for table 'saml_configuration_property_items_string'
--
DELETE FROM saml_configuration_property_items_string WHERE 1=2;

