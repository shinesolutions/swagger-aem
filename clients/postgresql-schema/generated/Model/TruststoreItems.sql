--
-- "Adobe Experience Manager (AEM) API"
-- Prepared SQL queries for 'TruststoreItems' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'truststore_items'
--
SELECT alias, entry_type, subject, issuer, not_before, not_after, serial_number FROM truststore_items WHERE 1=1;

--
-- INSERT template for table 'truststore_items'
--
INSERT INTO truststore_items (alias, entry_type, subject, issuer, not_before, not_after, serial_number) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'truststore_items'
--
UPDATE truststore_items SET alias = ?, entry_type = ?, subject = ?, issuer = ?, not_before = ?, not_after = ?, serial_number = ? WHERE 1=2;

--
-- DELETE template for table 'truststore_items'
--
DELETE FROM truststore_items WHERE 1=2;

