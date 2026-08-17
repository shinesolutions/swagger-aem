--
-- "Adobe Experience Manager (AEM) API"
-- Prepared SQL queries for 'BundleDataProp' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'bundle_data_prop'
--
SELECT "key", "value" FROM bundle_data_prop WHERE 1=1;

--
-- INSERT template for table 'bundle_data_prop'
--
INSERT INTO bundle_data_prop ("key", "value") VALUES (?, ?);

--
-- UPDATE template for table 'bundle_data_prop'
--
UPDATE bundle_data_prop SET "key" = ?, "value" = ? WHERE 1=2;

--
-- DELETE template for table 'bundle_data_prop'
--
DELETE FROM bundle_data_prop WHERE 1=2;

