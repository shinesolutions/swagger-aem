--
-- Adobe Experience Manager (AEM) API.
-- Prepared SQL queries for 'SamlConfigurationPropertyItemsArray' definition.
--


--
-- SELECT template for table `SamlConfigurationPropertyItemsArray`
--
SELECT `name`, `optional`, `is_set`, `type`, `values`, `description` FROM `SamlConfigurationPropertyItemsArray` WHERE 1;

--
-- INSERT template for table `SamlConfigurationPropertyItemsArray`
--
INSERT INTO `SamlConfigurationPropertyItemsArray`(`name`, `optional`, `is_set`, `type`, `values`, `description`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `SamlConfigurationPropertyItemsArray`
--
UPDATE `SamlConfigurationPropertyItemsArray` SET `name` = ?, `optional` = ?, `is_set` = ?, `type` = ?, `values` = ?, `description` = ? WHERE 1;

--
-- DELETE template for table `SamlConfigurationPropertyItemsArray`
--
DELETE FROM `SamlConfigurationPropertyItemsArray` WHERE 0;

