--
-- Adobe Experience Manager (AEM) API.
-- Prepared SQL queries for 'SamlConfigurationPropertyItemsString' definition.
--


--
-- SELECT template for table `SamlConfigurationPropertyItemsString`
--
SELECT `name`, `optional`, `is_set`, `type`, `value`, `description` FROM `SamlConfigurationPropertyItemsString` WHERE 1;

--
-- INSERT template for table `SamlConfigurationPropertyItemsString`
--
INSERT INTO `SamlConfigurationPropertyItemsString`(`name`, `optional`, `is_set`, `type`, `value`, `description`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `SamlConfigurationPropertyItemsString`
--
UPDATE `SamlConfigurationPropertyItemsString` SET `name` = ?, `optional` = ?, `is_set` = ?, `type` = ?, `value` = ?, `description` = ? WHERE 1;

--
-- DELETE template for table `SamlConfigurationPropertyItemsString`
--
DELETE FROM `SamlConfigurationPropertyItemsString` WHERE 0;

