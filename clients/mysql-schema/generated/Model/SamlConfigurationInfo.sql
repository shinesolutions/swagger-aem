--
-- Adobe Experience Manager (AEM) API.
-- Prepared SQL queries for 'SamlConfigurationInfo' definition.
--


--
-- SELECT template for table `SamlConfigurationInfo`
--
SELECT `pid`, `title`, `description`, `bundle_location`, `service_location`, `properties` FROM `SamlConfigurationInfo` WHERE 1;

--
-- INSERT template for table `SamlConfigurationInfo`
--
INSERT INTO `SamlConfigurationInfo`(`pid`, `title`, `description`, `bundle_location`, `service_location`, `properties`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `SamlConfigurationInfo`
--
UPDATE `SamlConfigurationInfo` SET `pid` = ?, `title` = ?, `description` = ?, `bundle_location` = ?, `service_location` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `SamlConfigurationInfo`
--
DELETE FROM `SamlConfigurationInfo` WHERE 0;

