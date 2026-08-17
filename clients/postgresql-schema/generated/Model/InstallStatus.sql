--
-- "Adobe Experience Manager (AEM) API"
-- Prepared SQL queries for 'InstallStatus' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'install_status'
--
SELECT status FROM install_status WHERE 1=1;

--
-- INSERT template for table 'install_status'
--
INSERT INTO install_status (status) VALUES (?);

--
-- UPDATE template for table 'install_status'
--
UPDATE install_status SET status = ? WHERE 1=2;

--
-- DELETE template for table 'install_status'
--
DELETE FROM install_status WHERE 1=2;

