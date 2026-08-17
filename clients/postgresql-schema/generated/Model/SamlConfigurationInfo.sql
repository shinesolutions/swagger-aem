--
-- "Adobe Experience Manager (AEM) API"
-- Prepared SQL queries for 'SamlConfigurationInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'saml_configuration_info'
--
SELECT pid, title, description, bundle_location, service_location, properties FROM saml_configuration_info WHERE 1=1;

--
-- INSERT template for table 'saml_configuration_info'
--
INSERT INTO saml_configuration_info (pid, title, description, bundle_location, service_location, properties) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'saml_configuration_info'
--
UPDATE saml_configuration_info SET pid = ?, title = ?, description = ?, bundle_location = ?, service_location = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'saml_configuration_info'
--
DELETE FROM saml_configuration_info WHERE 1=2;

