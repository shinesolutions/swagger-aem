--
-- Adobe Experience Manager (AEM) API.
-- Prepared SQL queries for 'InstallStatus_status' definition.
--


--
-- SELECT template for table `InstallStatus_status`
--
SELECT `finished`, `itemCount` FROM `InstallStatus_status` WHERE 1;

--
-- INSERT template for table `InstallStatus_status`
--
INSERT INTO `InstallStatus_status`(`finished`, `itemCount`) VALUES (?, ?);

--
-- UPDATE template for table `InstallStatus_status`
--
UPDATE `InstallStatus_status` SET `finished` = ?, `itemCount` = ? WHERE 1;

--
-- DELETE template for table `InstallStatus_status`
--
DELETE FROM `InstallStatus_status` WHERE 0;

