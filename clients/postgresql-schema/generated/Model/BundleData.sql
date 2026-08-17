--
-- "Adobe Experience Manager (AEM) API"
-- Prepared SQL queries for 'BundleData' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'bundle_data'
--
SELECT "id", "name", fragment, state_raw, "state", "version", symbolic_name, category, props FROM bundle_data WHERE 1=1;

--
-- INSERT template for table 'bundle_data'
--
INSERT INTO bundle_data ("id", "name", fragment, state_raw, "state", "version", symbolic_name, category, props) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'bundle_data'
--
UPDATE bundle_data SET "id" = ?, "name" = ?, fragment = ?, state_raw = ?, "state" = ?, "version" = ?, symbolic_name = ?, category = ?, props = ? WHERE 1=2;

--
-- DELETE template for table 'bundle_data'
--
DELETE FROM bundle_data WHERE 1=2;

