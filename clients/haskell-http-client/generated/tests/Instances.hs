{-# OPTIONS_GHC -fno-warn-unused-imports -fno-warn-unused-matches #-}

module Instances where

import AdobeExperienceManager(AEM).Model
import AdobeExperienceManager(AEM).Core

import qualified Data.Aeson as A
import qualified Data.ByteString.Lazy as BL
import qualified Data.HashMap.Strict as HM
import qualified Data.Set as Set
import qualified Data.Text as T
import qualified Data.Time as TI
import qualified Data.Vector as V

import Control.Monad
import Data.Char (isSpace)
import Data.List (sort)
import Test.QuickCheck

import ApproxEq

instance Arbitrary T.Text where
  arbitrary = T.pack <$> arbitrary

instance Arbitrary TI.Day where
  arbitrary = TI.ModifiedJulianDay . (2000 +) <$> arbitrary
  shrink = (TI.ModifiedJulianDay <$>) . shrink . TI.toModifiedJulianDay

instance Arbitrary TI.UTCTime where
  arbitrary =
    TI.UTCTime <$> arbitrary <*> (TI.secondsToDiffTime <$> choose (0, 86401))

instance Arbitrary BL.ByteString where
    arbitrary = BL.pack <$> arbitrary
    shrink xs = BL.pack <$> shrink (BL.unpack xs)

instance Arbitrary ByteArray where
    arbitrary = ByteArray <$> arbitrary
    shrink (ByteArray xs) = ByteArray <$> shrink xs

instance Arbitrary Binary where
    arbitrary = Binary <$> arbitrary
    shrink (Binary xs) = Binary <$> shrink xs

instance Arbitrary DateTime where
    arbitrary = DateTime <$> arbitrary
    shrink (DateTime xs) = DateTime <$> shrink xs

instance Arbitrary Date where
    arbitrary = Date <$> arbitrary
    shrink (Date xs) = Date <$> shrink xs

-- | A naive Arbitrary instance for A.Value:
instance Arbitrary A.Value where
  arbitrary = frequency [(3, simpleTypes), (1, arrayTypes), (1, objectTypes)]
    where
      simpleTypes :: Gen A.Value
      simpleTypes =
        frequency
          [ (1, return A.Null)
          , (2, liftM A.Bool (arbitrary :: Gen Bool))
          , (2, liftM (A.Number . fromIntegral) (arbitrary :: Gen Int))
          , (2, liftM (A.String . T.pack) (arbitrary :: Gen String))
          ]
      mapF (k, v) = (T.pack k, v)
      simpleAndArrays = frequency [(1, sized sizedArray), (4, simpleTypes)]
      arrayTypes = sized sizedArray
      objectTypes = sized sizedObject
      sizedArray n = liftM (A.Array . V.fromList) $ replicateM n simpleTypes
      sizedObject n =
        liftM (A.object . map mapF) $
        replicateM n $ (,) <$> (arbitrary :: Gen String) <*> simpleAndArrays
    
-- | Checks if a given list has no duplicates in _O(n log n)_.
hasNoDups
  :: (Ord a)
  => [a] -> Bool
hasNoDups = go Set.empty
  where
    go _ [] = True
    go s (x:xs)
      | s' <- Set.insert x s
      , Set.size s' > Set.size s = go s' xs
      | otherwise = False

instance ApproxEq TI.Day where
  (=~) = (==)
    
arbitraryReduced :: Arbitrary a => Int -> Gen a
arbitraryReduced n = resize (n `div` 2) arbitrary

arbitraryReducedMaybe :: Arbitrary a => Int -> Gen (Maybe a)
arbitraryReducedMaybe 0 = elements [Nothing]
arbitraryReducedMaybe n = arbitraryReduced n

arbitraryReducedMaybeValue :: Int -> Gen (Maybe A.Value)
arbitraryReducedMaybeValue 0 = elements [Nothing]
arbitraryReducedMaybeValue n = do
  generated <- arbitraryReduced n
  if generated == Just A.Null
    then return Nothing
    else return generated

-- * Models
 
instance Arbitrary BundleData where
  arbitrary = sized genBundleData

genBundleData :: Int -> Gen BundleData
genBundleData n =
  BundleData
    <$> arbitraryReducedMaybe n -- bundleDataId :: Maybe Int
    <*> arbitraryReducedMaybe n -- bundleDataName :: Maybe Text
    <*> arbitraryReducedMaybe n -- bundleDataFragment :: Maybe Bool
    <*> arbitraryReducedMaybe n -- bundleDataStateRaw :: Maybe Int
    <*> arbitraryReducedMaybe n -- bundleDataState :: Maybe Text
    <*> arbitraryReducedMaybe n -- bundleDataVersion :: Maybe Text
    <*> arbitraryReducedMaybe n -- bundleDataSymbolicName :: Maybe Text
    <*> arbitraryReducedMaybe n -- bundleDataCategory :: Maybe Text
    <*> arbitraryReducedMaybe n -- bundleDataProps :: Maybe [BundleDataProp]
  
instance Arbitrary BundleDataProp where
  arbitrary = sized genBundleDataProp

genBundleDataProp :: Int -> Gen BundleDataProp
genBundleDataProp n =
  BundleDataProp
    <$> arbitraryReducedMaybe n -- bundleDataPropKey :: Maybe Text
    <*> arbitraryReducedMaybe n -- bundleDataPropValue :: Maybe Text
  
instance Arbitrary BundleInfo where
  arbitrary = sized genBundleInfo

genBundleInfo :: Int -> Gen BundleInfo
genBundleInfo n =
  BundleInfo
    <$> arbitraryReducedMaybe n -- bundleInfoStatus :: Maybe Text
    <*> arbitraryReducedMaybe n -- bundleInfoS :: Maybe [Int]
    <*> arbitraryReducedMaybe n -- bundleInfoData :: Maybe [BundleData]
  
instance Arbitrary InstallStatus where
  arbitrary = sized genInstallStatus

genInstallStatus :: Int -> Gen InstallStatus
genInstallStatus n =
  InstallStatus
    <$> arbitraryReducedMaybe n -- installStatusStatus :: Maybe InstallStatusStatus
  
instance Arbitrary InstallStatusStatus where
  arbitrary = sized genInstallStatusStatus

genInstallStatusStatus :: Int -> Gen InstallStatusStatus
genInstallStatusStatus n =
  InstallStatusStatus
    <$> arbitraryReducedMaybe n -- installStatusStatusFinished :: Maybe Bool
    <*> arbitraryReducedMaybe n -- installStatusStatusItemCount :: Maybe Int
  
instance Arbitrary KeystoreChainItems where
  arbitrary = sized genKeystoreChainItems

genKeystoreChainItems :: Int -> Gen KeystoreChainItems
genKeystoreChainItems n =
  KeystoreChainItems
    <$> arbitraryReducedMaybe n -- keystoreChainItemsSubject :: Maybe Text
    <*> arbitraryReducedMaybe n -- keystoreChainItemsIssuer :: Maybe Text
    <*> arbitraryReducedMaybe n -- keystoreChainItemsNotBefore :: Maybe Text
    <*> arbitraryReducedMaybe n -- keystoreChainItemsNotAfter :: Maybe Text
    <*> arbitraryReducedMaybe n -- keystoreChainItemsSerialNumber :: Maybe Int
  
instance Arbitrary KeystoreInfo where
  arbitrary = sized genKeystoreInfo

genKeystoreInfo :: Int -> Gen KeystoreInfo
genKeystoreInfo n =
  KeystoreInfo
    <$> arbitraryReducedMaybe n -- keystoreInfoAliases :: Maybe [KeystoreItems]
    <*> arbitraryReducedMaybe n -- keystoreInfoExists :: Maybe Bool
  
instance Arbitrary KeystoreItems where
  arbitrary = sized genKeystoreItems

genKeystoreItems :: Int -> Gen KeystoreItems
genKeystoreItems n =
  KeystoreItems
    <$> arbitraryReducedMaybe n -- keystoreItemsAlias :: Maybe Text
    <*> arbitraryReducedMaybe n -- keystoreItemsEntryType :: Maybe Text
    <*> arbitraryReducedMaybe n -- keystoreItemsAlgorithm :: Maybe Text
    <*> arbitraryReducedMaybe n -- keystoreItemsFormat :: Maybe Text
    <*> arbitraryReducedMaybe n -- keystoreItemsChain :: Maybe [KeystoreChainItems]
  
instance Arbitrary SamlConfigurationInfo where
  arbitrary = sized genSamlConfigurationInfo

genSamlConfigurationInfo :: Int -> Gen SamlConfigurationInfo
genSamlConfigurationInfo n =
  SamlConfigurationInfo
    <$> arbitraryReducedMaybe n -- samlConfigurationInfoPid :: Maybe Text
    <*> arbitraryReducedMaybe n -- samlConfigurationInfoTitle :: Maybe Text
    <*> arbitraryReducedMaybe n -- samlConfigurationInfoDescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- samlConfigurationInfoBundleLocation :: Maybe Text
    <*> arbitraryReducedMaybe n -- samlConfigurationInfoServiceLocation :: Maybe Text
    <*> arbitraryReducedMaybe n -- samlConfigurationInfoProperties :: Maybe SamlConfigurationProperties
  
instance Arbitrary SamlConfigurationProperties where
  arbitrary = sized genSamlConfigurationProperties

genSamlConfigurationProperties :: Int -> Gen SamlConfigurationProperties
genSamlConfigurationProperties n =
  SamlConfigurationProperties
    <$> arbitraryReducedMaybe n -- samlConfigurationPropertiesPath :: Maybe SamlConfigurationPropertyItemsArray
    <*> arbitraryReducedMaybe n -- samlConfigurationPropertiesServiceRanking :: Maybe SamlConfigurationPropertyItemsLong
    <*> arbitraryReducedMaybe n -- samlConfigurationPropertiesIdpUrl :: Maybe SamlConfigurationPropertyItemsString
    <*> arbitraryReducedMaybe n -- samlConfigurationPropertiesIdpCertAlias :: Maybe SamlConfigurationPropertyItemsString
    <*> arbitraryReducedMaybe n -- samlConfigurationPropertiesIdpHttpRedirect :: Maybe SamlConfigurationPropertyItemsBoolean
    <*> arbitraryReducedMaybe n -- samlConfigurationPropertiesServiceProviderEntityId :: Maybe SamlConfigurationPropertyItemsString
    <*> arbitraryReducedMaybe n -- samlConfigurationPropertiesAssertionConsumerServiceUrl :: Maybe SamlConfigurationPropertyItemsString
    <*> arbitraryReducedMaybe n -- samlConfigurationPropertiesSpPrivateKeyAlias :: Maybe SamlConfigurationPropertyItemsString
    <*> arbitraryReducedMaybe n -- samlConfigurationPropertiesKeyStorePassword :: Maybe SamlConfigurationPropertyItemsString
    <*> arbitraryReducedMaybe n -- samlConfigurationPropertiesDefaultRedirectUrl :: Maybe SamlConfigurationPropertyItemsString
    <*> arbitraryReducedMaybe n -- samlConfigurationPropertiesUserIdAttribute :: Maybe SamlConfigurationPropertyItemsString
    <*> arbitraryReducedMaybe n -- samlConfigurationPropertiesUseEncryption :: Maybe SamlConfigurationPropertyItemsBoolean
    <*> arbitraryReducedMaybe n -- samlConfigurationPropertiesCreateUser :: Maybe SamlConfigurationPropertyItemsBoolean
    <*> arbitraryReducedMaybe n -- samlConfigurationPropertiesAddGroupMemberships :: Maybe SamlConfigurationPropertyItemsBoolean
    <*> arbitraryReducedMaybe n -- samlConfigurationPropertiesGroupMembershipAttribute :: Maybe SamlConfigurationPropertyItemsString
    <*> arbitraryReducedMaybe n -- samlConfigurationPropertiesDefaultGroups :: Maybe SamlConfigurationPropertyItemsArray
    <*> arbitraryReducedMaybe n -- samlConfigurationPropertiesNameIdFormat :: Maybe SamlConfigurationPropertyItemsString
    <*> arbitraryReducedMaybe n -- samlConfigurationPropertiesSynchronizeAttributes :: Maybe SamlConfigurationPropertyItemsArray
    <*> arbitraryReducedMaybe n -- samlConfigurationPropertiesHandleLogout :: Maybe SamlConfigurationPropertyItemsBoolean
    <*> arbitraryReducedMaybe n -- samlConfigurationPropertiesLogoutUrl :: Maybe SamlConfigurationPropertyItemsString
    <*> arbitraryReducedMaybe n -- samlConfigurationPropertiesClockTolerance :: Maybe SamlConfigurationPropertyItemsLong
    <*> arbitraryReducedMaybe n -- samlConfigurationPropertiesDigestMethod :: Maybe SamlConfigurationPropertyItemsString
    <*> arbitraryReducedMaybe n -- samlConfigurationPropertiesSignatureMethod :: Maybe SamlConfigurationPropertyItemsString
    <*> arbitraryReducedMaybe n -- samlConfigurationPropertiesUserIntermediatePath :: Maybe SamlConfigurationPropertyItemsString
  
instance Arbitrary SamlConfigurationPropertyItemsArray where
  arbitrary = sized genSamlConfigurationPropertyItemsArray

genSamlConfigurationPropertyItemsArray :: Int -> Gen SamlConfigurationPropertyItemsArray
genSamlConfigurationPropertyItemsArray n =
  SamlConfigurationPropertyItemsArray
    <$> arbitraryReducedMaybe n -- samlConfigurationPropertyItemsArrayName :: Maybe Text
    <*> arbitraryReducedMaybe n -- samlConfigurationPropertyItemsArrayOptional :: Maybe Bool
    <*> arbitraryReducedMaybe n -- samlConfigurationPropertyItemsArrayIsSet :: Maybe Bool
    <*> arbitraryReducedMaybe n -- samlConfigurationPropertyItemsArrayType :: Maybe Int
    <*> arbitraryReducedMaybe n -- samlConfigurationPropertyItemsArrayValues :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- samlConfigurationPropertyItemsArrayDescription :: Maybe Text
  
instance Arbitrary SamlConfigurationPropertyItemsBoolean where
  arbitrary = sized genSamlConfigurationPropertyItemsBoolean

genSamlConfigurationPropertyItemsBoolean :: Int -> Gen SamlConfigurationPropertyItemsBoolean
genSamlConfigurationPropertyItemsBoolean n =
  SamlConfigurationPropertyItemsBoolean
    <$> arbitraryReducedMaybe n -- samlConfigurationPropertyItemsBooleanName :: Maybe Text
    <*> arbitraryReducedMaybe n -- samlConfigurationPropertyItemsBooleanOptional :: Maybe Bool
    <*> arbitraryReducedMaybe n -- samlConfigurationPropertyItemsBooleanIsSet :: Maybe Bool
    <*> arbitraryReducedMaybe n -- samlConfigurationPropertyItemsBooleanType :: Maybe Int
    <*> arbitraryReducedMaybe n -- samlConfigurationPropertyItemsBooleanValue :: Maybe Bool
    <*> arbitraryReducedMaybe n -- samlConfigurationPropertyItemsBooleanDescription :: Maybe Text
  
instance Arbitrary SamlConfigurationPropertyItemsLong where
  arbitrary = sized genSamlConfigurationPropertyItemsLong

genSamlConfigurationPropertyItemsLong :: Int -> Gen SamlConfigurationPropertyItemsLong
genSamlConfigurationPropertyItemsLong n =
  SamlConfigurationPropertyItemsLong
    <$> arbitraryReducedMaybe n -- samlConfigurationPropertyItemsLongName :: Maybe Text
    <*> arbitraryReducedMaybe n -- samlConfigurationPropertyItemsLongOptional :: Maybe Bool
    <*> arbitraryReducedMaybe n -- samlConfigurationPropertyItemsLongIsSet :: Maybe Bool
    <*> arbitraryReducedMaybe n -- samlConfigurationPropertyItemsLongType :: Maybe Int
    <*> arbitraryReducedMaybe n -- samlConfigurationPropertyItemsLongValue :: Maybe Int
    <*> arbitraryReducedMaybe n -- samlConfigurationPropertyItemsLongDescription :: Maybe Text
  
instance Arbitrary SamlConfigurationPropertyItemsString where
  arbitrary = sized genSamlConfigurationPropertyItemsString

genSamlConfigurationPropertyItemsString :: Int -> Gen SamlConfigurationPropertyItemsString
genSamlConfigurationPropertyItemsString n =
  SamlConfigurationPropertyItemsString
    <$> arbitraryReducedMaybe n -- samlConfigurationPropertyItemsStringName :: Maybe Text
    <*> arbitraryReducedMaybe n -- samlConfigurationPropertyItemsStringOptional :: Maybe Bool
    <*> arbitraryReducedMaybe n -- samlConfigurationPropertyItemsStringIsSet :: Maybe Bool
    <*> arbitraryReducedMaybe n -- samlConfigurationPropertyItemsStringType :: Maybe Int
    <*> arbitraryReducedMaybe n -- samlConfigurationPropertyItemsStringValue :: Maybe Text
    <*> arbitraryReducedMaybe n -- samlConfigurationPropertyItemsStringDescription :: Maybe Text
  
instance Arbitrary TruststoreInfo where
  arbitrary = sized genTruststoreInfo

genTruststoreInfo :: Int -> Gen TruststoreInfo
genTruststoreInfo n =
  TruststoreInfo
    <$> arbitraryReducedMaybe n -- truststoreInfoAliases :: Maybe [TruststoreItems]
    <*> arbitraryReducedMaybe n -- truststoreInfoExists :: Maybe Bool
  
instance Arbitrary TruststoreItems where
  arbitrary = sized genTruststoreItems

genTruststoreItems :: Int -> Gen TruststoreItems
genTruststoreItems n =
  TruststoreItems
    <$> arbitraryReducedMaybe n -- truststoreItemsAlias :: Maybe Text
    <*> arbitraryReducedMaybe n -- truststoreItemsEntryType :: Maybe Text
    <*> arbitraryReducedMaybe n -- truststoreItemsSubject :: Maybe Text
    <*> arbitraryReducedMaybe n -- truststoreItemsIssuer :: Maybe Text
    <*> arbitraryReducedMaybe n -- truststoreItemsNotBefore :: Maybe Text
    <*> arbitraryReducedMaybe n -- truststoreItemsNotAfter :: Maybe Text
    <*> arbitraryReducedMaybe n -- truststoreItemsSerialNumber :: Maybe Int
  



