--
-- "Adobe Experience Manager (AEM) API"
-- Prepared SQL queries for 'SamlConfigurationPropertyItemsArray' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'saml_configuration_property_items_array'
--
SELECT "name", optional, is_set, "type", "values", description FROM saml_configuration_property_items_array WHERE 1=1;

--
-- INSERT template for table 'saml_configuration_property_items_array'
--
INSERT INTO saml_configuration_property_items_array ("name", optional, is_set, "type", "values", description) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'saml_configuration_property_items_array'
--
UPDATE saml_configuration_property_items_array SET "name" = ?, optional = ?, is_set = ?, "type" = ?, "values" = ?, description = ? WHERE 1=2;

--
-- DELETE template for table 'saml_configuration_property_items_array'
--
DELETE FROM saml_configuration_property_items_array WHERE 1=2;

