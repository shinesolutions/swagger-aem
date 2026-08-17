--
-- Adobe Experience Manager (AEM) API.
-- Prepared SQL queries for 'KeystoreChainItems' definition.
--


--
-- SELECT template for table `KeystoreChainItems`
--
SELECT `subject`, `issuer`, `notBefore`, `notAfter`, `serialNumber` FROM `KeystoreChainItems` WHERE 1;

--
-- INSERT template for table `KeystoreChainItems`
--
INSERT INTO `KeystoreChainItems`(`subject`, `issuer`, `notBefore`, `notAfter`, `serialNumber`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `KeystoreChainItems`
--
UPDATE `KeystoreChainItems` SET `subject` = ?, `issuer` = ?, `notBefore` = ?, `notAfter` = ?, `serialNumber` = ? WHERE 1;

--
-- DELETE template for table `KeystoreChainItems`
--
DELETE FROM `KeystoreChainItems` WHERE 0;

