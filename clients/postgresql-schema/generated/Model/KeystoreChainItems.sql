--
-- "Adobe Experience Manager (AEM) API"
-- Prepared SQL queries for 'KeystoreChainItems' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'keystore_chain_items'
--
SELECT subject, issuer, not_before, not_after, serial_number FROM keystore_chain_items WHERE 1=1;

--
-- INSERT template for table 'keystore_chain_items'
--
INSERT INTO keystore_chain_items (subject, issuer, not_before, not_after, serial_number) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table 'keystore_chain_items'
--
UPDATE keystore_chain_items SET subject = ?, issuer = ?, not_before = ?, not_after = ?, serial_number = ? WHERE 1=2;

--
-- DELETE template for table 'keystore_chain_items'
--
DELETE FROM keystore_chain_items WHERE 1=2;

