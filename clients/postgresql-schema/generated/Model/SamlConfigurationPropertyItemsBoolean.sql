--
-- "Adobe Experience Manager (AEM) API"
-- Prepared SQL queries for 'SamlConfigurationPropertyItemsBoolean' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'saml_configuration_property_items_boolean'
--
SELECT "name", optional, is_set, "type", "value", description FROM saml_configuration_property_items_boolean WHERE 1=1;

--
-- INSERT template for table 'saml_configuration_property_items_boolean'
--
INSERT INTO saml_configuration_property_items_boolean ("name", optional, is_set, "type", "value", description) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'saml_configuration_property_items_boolean'
--
UPDATE saml_configuration_property_items_boolean SET "name" = ?, optional = ?, is_set = ?, "type" = ?, "value" = ?, description = ? WHERE 1=2;

--
-- DELETE template for table 'saml_configuration_property_items_boolean'
--
DELETE FROM saml_configuration_property_items_boolean WHERE 1=2;

