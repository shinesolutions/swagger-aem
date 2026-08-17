--
-- "Adobe Experience Manager (AEM) API"
-- Prepared SQL queries for 'BundleInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'bundle_info'
--
SELECT status, s, "data" FROM bundle_info WHERE 1=1;

--
-- INSERT template for table 'bundle_info'
--
INSERT INTO bundle_info (status, s, "data") VALUES (?, ?, ?);

--
-- UPDATE template for table 'bundle_info'
--
UPDATE bundle_info SET status = ?, s = ?, "data" = ? WHERE 1=2;

--
-- DELETE template for table 'bundle_info'
--
DELETE FROM bundle_info WHERE 1=2;

