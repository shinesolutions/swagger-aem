--
-- "Adobe Experience Manager (AEM) API"
-- Prepared SQL queries for 'SamlConfigurationPropertyItemsLong' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'saml_configuration_property_items_long'
--
SELECT "name", optional, is_set, "type", "value", description FROM saml_configuration_property_items_long WHERE 1=1;

--
-- INSERT template for table 'saml_configuration_property_items_long'
--
INSERT INTO saml_configuration_property_items_long ("name", optional, is_set, "type", "value", description) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'saml_configuration_property_items_long'
--
UPDATE saml_configuration_property_items_long SET "name" = ?, optional = ?, is_set = ?, "type" = ?, "value" = ?, description = ? WHERE 1=2;

--
-- DELETE template for table 'saml_configuration_property_items_long'
--
DELETE FROM saml_configuration_property_items_long WHERE 1=2;

