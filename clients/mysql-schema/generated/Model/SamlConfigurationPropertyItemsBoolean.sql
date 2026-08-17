--
-- Adobe Experience Manager (AEM) API.
-- Prepared SQL queries for 'SamlConfigurationPropertyItemsBoolean' definition.
--


--
-- SELECT template for table `SamlConfigurationPropertyItemsBoolean`
--
SELECT `name`, `optional`, `is_set`, `type`, `value`, `description` FROM `SamlConfigurationPropertyItemsBoolean` WHERE 1;

--
-- INSERT template for table `SamlConfigurationPropertyItemsBoolean`
--
INSERT INTO `SamlConfigurationPropertyItemsBoolean`(`name`, `optional`, `is_set`, `type`, `value`, `description`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `SamlConfigurationPropertyItemsBoolean`
--
UPDATE `SamlConfigurationPropertyItemsBoolean` SET `name` = ?, `optional` = ?, `is_set` = ?, `type` = ?, `value` = ?, `description` = ? WHERE 1;

--
-- DELETE template for table `SamlConfigurationPropertyItemsBoolean`
--
DELETE FROM `SamlConfigurationPropertyItemsBoolean` WHERE 0;

