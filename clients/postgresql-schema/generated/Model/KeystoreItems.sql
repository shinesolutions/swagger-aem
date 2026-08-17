--
-- "Adobe Experience Manager (AEM) API"
-- Prepared SQL queries for 'KeystoreItems' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'keystore_items'
--
SELECT alias, entry_type, algorithm, "format", "chain" FROM keystore_items WHERE 1=1;

--
-- INSERT template for table 'keystore_items'
--
INSERT INTO keystore_items (alias, entry_type, algorithm, "format", "chain") VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table 'keystore_items'
--
UPDATE keystore_items SET alias = ?, entry_type = ?, algorithm = ?, "format" = ?, "chain" = ? WHERE 1=2;

--
-- DELETE template for table 'keystore_items'
--
DELETE FROM keystore_items WHERE 1=2;

