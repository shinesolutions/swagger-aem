--
-- Adobe Experience Manager (AEM) API.
-- Prepared SQL queries for 'KeystoreInfo' definition.
--


--
-- SELECT template for table `KeystoreInfo`
--
SELECT `aliases`, `exists` FROM `KeystoreInfo` WHERE 1;

--
-- INSERT template for table `KeystoreInfo`
--
INSERT INTO `KeystoreInfo`(`aliases`, `exists`) VALUES (?, ?);

--
-- UPDATE template for table `KeystoreInfo`
--
UPDATE `KeystoreInfo` SET `aliases` = ?, `exists` = ? WHERE 1;

--
-- DELETE template for table `KeystoreInfo`
--
DELETE FROM `KeystoreInfo` WHERE 0;

