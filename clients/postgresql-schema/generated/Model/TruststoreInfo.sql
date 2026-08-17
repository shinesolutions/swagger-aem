--
-- "Adobe Experience Manager (AEM) API"
-- Prepared SQL queries for 'TruststoreInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'truststore_info'
--
SELECT aliases, "exists" FROM truststore_info WHERE 1=1;

--
-- INSERT template for table 'truststore_info'
--
INSERT INTO truststore_info (aliases, "exists") VALUES (?, ?);

--
-- UPDATE template for table 'truststore_info'
--
UPDATE truststore_info SET aliases = ?, "exists" = ? WHERE 1=2;

--
-- DELETE template for table 'truststore_info'
--
DELETE FROM truststore_info WHERE 1=2;

