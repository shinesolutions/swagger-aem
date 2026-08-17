--
-- Adobe Experience Manager (AEM) API.
-- Prepared SQL queries for 'BundleData' definition.
--


--
-- SELECT template for table `BundleData`
--
SELECT `id`, `name`, `fragment`, `stateRaw`, `state`, `version`, `symbolicName`, `category`, `props` FROM `BundleData` WHERE 1;

--
-- INSERT template for table `BundleData`
--
INSERT INTO `BundleData`(`id`, `name`, `fragment`, `stateRaw`, `state`, `version`, `symbolicName`, `category`, `props`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `BundleData`
--
UPDATE `BundleData` SET `id` = ?, `name` = ?, `fragment` = ?, `stateRaw` = ?, `state` = ?, `version` = ?, `symbolicName` = ?, `category` = ?, `props` = ? WHERE 1;

--
-- DELETE template for table `BundleData`
--
DELETE FROM `BundleData` WHERE 0;

