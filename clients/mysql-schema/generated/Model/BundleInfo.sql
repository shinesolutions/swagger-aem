--
-- Adobe Experience Manager (AEM) API.
-- Prepared SQL queries for 'BundleInfo' definition.
--


--
-- SELECT template for table `BundleInfo`
--
SELECT `status`, `s`, `data` FROM `BundleInfo` WHERE 1;

--
-- INSERT template for table `BundleInfo`
--
INSERT INTO `BundleInfo`(`status`, `s`, `data`) VALUES (?, ?, ?);

--
-- UPDATE template for table `BundleInfo`
--
UPDATE `BundleInfo` SET `status` = ?, `s` = ?, `data` = ? WHERE 1;

--
-- DELETE template for table `BundleInfo`
--
DELETE FROM `BundleInfo` WHERE 0;

