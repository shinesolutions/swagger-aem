--
-- Adobe Experience Manager (AEM) API.
-- Prepared SQL queries for 'SamlConfigurationPropertyItemsLong' definition.
--


--
-- SELECT template for table `SamlConfigurationPropertyItemsLong`
--
SELECT `name`, `optional`, `is_set`, `type`, `value`, `description` FROM `SamlConfigurationPropertyItemsLong` WHERE 1;

--
-- INSERT template for table `SamlConfigurationPropertyItemsLong`
--
INSERT INTO `SamlConfigurationPropertyItemsLong`(`name`, `optional`, `is_set`, `type`, `value`, `description`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `SamlConfigurationPropertyItemsLong`
--
UPDATE `SamlConfigurationPropertyItemsLong` SET `name` = ?, `optional` = ?, `is_set` = ?, `type` = ?, `value` = ?, `description` = ? WHERE 1;

--
-- DELETE template for table `SamlConfigurationPropertyItemsLong`
--
DELETE FROM `SamlConfigurationPropertyItemsLong` WHERE 0;

