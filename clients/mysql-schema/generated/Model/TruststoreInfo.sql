--
-- Adobe Experience Manager (AEM) API.
-- Prepared SQL queries for 'TruststoreInfo' definition.
--


--
-- SELECT template for table `TruststoreInfo`
--
SELECT `aliases`, `exists` FROM `TruststoreInfo` WHERE 1;

--
-- INSERT template for table `TruststoreInfo`
--
INSERT INTO `TruststoreInfo`(`aliases`, `exists`) VALUES (?, ?);

--
-- UPDATE template for table `TruststoreInfo`
--
UPDATE `TruststoreInfo` SET `aliases` = ?, `exists` = ? WHERE 1;

--
-- DELETE template for table `TruststoreInfo`
--
DELETE FROM `TruststoreInfo` WHERE 0;

