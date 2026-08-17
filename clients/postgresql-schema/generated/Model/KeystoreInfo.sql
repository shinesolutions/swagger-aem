--
-- "Adobe Experience Manager (AEM) API"
-- Prepared SQL queries for 'KeystoreInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'keystore_info'
--
SELECT aliases, "exists" FROM keystore_info WHERE 1=1;

--
-- INSERT template for table 'keystore_info'
--
INSERT INTO keystore_info (aliases, "exists") VALUES (?, ?);

--
-- UPDATE template for table 'keystore_info'
--
UPDATE keystore_info SET aliases = ?, "exists" = ? WHERE 1=2;

--
-- DELETE template for table 'keystore_info'
--
DELETE FROM keystore_info WHERE 1=2;

