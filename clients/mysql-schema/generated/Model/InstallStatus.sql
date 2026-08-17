--
-- Adobe Experience Manager (AEM) API.
-- Prepared SQL queries for 'InstallStatus' definition.
--


--
-- SELECT template for table `InstallStatus`
--
SELECT `status` FROM `InstallStatus` WHERE 1;

--
-- INSERT template for table `InstallStatus`
--
INSERT INTO `InstallStatus`(`status`) VALUES (?);

--
-- UPDATE template for table `InstallStatus`
--
UPDATE `InstallStatus` SET `status` = ? WHERE 1;

--
-- DELETE template for table `InstallStatus`
--
DELETE FROM `InstallStatus` WHERE 0;

