--
-- Adobe Experience Manager (AEM) API.
-- Prepared SQL queries for 'TruststoreItems' definition.
--


--
-- SELECT template for table `TruststoreItems`
--
SELECT `alias`, `entryType`, `subject`, `issuer`, `notBefore`, `notAfter`, `serialNumber` FROM `TruststoreItems` WHERE 1;

--
-- INSERT template for table `TruststoreItems`
--
INSERT INTO `TruststoreItems`(`alias`, `entryType`, `subject`, `issuer`, `notBefore`, `notAfter`, `serialNumber`) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `TruststoreItems`
--
UPDATE `TruststoreItems` SET `alias` = ?, `entryType` = ?, `subject` = ?, `issuer` = ?, `notBefore` = ?, `notAfter` = ?, `serialNumber` = ? WHERE 1;

--
-- DELETE template for table `TruststoreItems`
--
DELETE FROM `TruststoreItems` WHERE 0;

