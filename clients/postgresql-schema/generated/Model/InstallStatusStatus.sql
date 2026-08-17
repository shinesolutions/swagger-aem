--
-- "Adobe Experience Manager (AEM) API"
-- Prepared SQL queries for 'InstallStatus_status' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'install_status_status'
--
SELECT finished, item_count FROM install_status_status WHERE 1=1;

--
-- INSERT template for table 'install_status_status'
--
INSERT INTO install_status_status (finished, item_count) VALUES (?, ?);

--
-- UPDATE template for table 'install_status_status'
--
UPDATE install_status_status SET finished = ?, item_count = ? WHERE 1=2;

--
-- DELETE template for table 'install_status_status'
--
DELETE FROM install_status_status WHERE 1=2;

