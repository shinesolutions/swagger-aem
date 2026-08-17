--
-- Adobe Experience Manager (AEM) API.
-- Prepared SQL queries for 'BundleDataProp' definition.
--


--
-- SELECT template for table `BundleDataProp`
--
SELECT `key`, `value` FROM `BundleDataProp` WHERE 1;

--
-- INSERT template for table `BundleDataProp`
--
INSERT INTO `BundleDataProp`(`key`, `value`) VALUES (?, ?);

--
-- UPDATE template for table `BundleDataProp`
--
UPDATE `BundleDataProp` SET `key` = ?, `value` = ? WHERE 1;

--
-- DELETE template for table `BundleDataProp`
--
DELETE FROM `BundleDataProp` WHERE 0;

