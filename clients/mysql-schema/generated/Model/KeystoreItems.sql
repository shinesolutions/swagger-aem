--
-- Adobe Experience Manager (AEM) API.
-- Prepared SQL queries for 'KeystoreItems' definition.
--


--
-- SELECT template for table `KeystoreItems`
--
SELECT `alias`, `entryType`, `algorithm`, `format`, `chain` FROM `KeystoreItems` WHERE 1;

--
-- INSERT template for table `KeystoreItems`
--
INSERT INTO `KeystoreItems`(`alias`, `entryType`, `algorithm`, `format`, `chain`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `KeystoreItems`
--
UPDATE `KeystoreItems` SET `alias` = ?, `entryType` = ?, `algorithm` = ?, `format` = ?, `chain` = ? WHERE 1;

--
-- DELETE template for table `KeystoreItems`
--
DELETE FROM `KeystoreItems` WHERE 0;

