{-# OPTIONS_GHC -fno-warn-unused-imports #-}

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

-- * Models
 
instance Arbitrary InstallStatus where
  arbitrary =
    InstallStatus
      <$> arbitrary -- installStatusStatus :: Maybe InstallStatusStatus
    
instance Arbitrary InstallStatusStatus where
  arbitrary =
    InstallStatusStatus
      <$> arbitrary -- installStatusStatusFinished :: Maybe Bool
      <*> arbitrary -- installStatusStatusItemCount :: Maybe Int
    
instance Arbitrary KeystoreChainItems where
  arbitrary =
    KeystoreChainItems
      <$> arbitrary -- keystoreChainItemsSubject :: Maybe Text
      <*> arbitrary -- keystoreChainItemsIssuer :: Maybe Text
      <*> arbitrary -- keystoreChainItemsNotBefore :: Maybe Text
      <*> arbitrary -- keystoreChainItemsNotAfter :: Maybe Text
      <*> arbitrary -- keystoreChainItemsSerialNumber :: Maybe Int
    
instance Arbitrary KeystoreInfo where
  arbitrary =
    KeystoreInfo
      <$> arbitrary -- keystoreInfoAliases :: Maybe [KeystoreItems]
      <*> arbitrary -- keystoreInfoExists :: Maybe Bool
    
instance Arbitrary KeystoreItems where
  arbitrary =
    KeystoreItems
      <$> arbitrary -- keystoreItemsAlias :: Maybe Text
      <*> arbitrary -- keystoreItemsEntryType :: Maybe Text
      <*> arbitrary -- keystoreItemsAlgorithm :: Maybe Text
      <*> arbitrary -- keystoreItemsFormat :: Maybe Text
      <*> arbitrary -- keystoreItemsChain :: Maybe [KeystoreChainItems]
    
instance Arbitrary SamlConfigurationInfo where
  arbitrary =
    SamlConfigurationInfo
      <$> arbitrary -- samlConfigurationInfoPid :: Maybe Text
      <*> arbitrary -- samlConfigurationInfoTitle :: Maybe Text
      <*> arbitrary -- samlConfigurationInfoDescription :: Maybe Text
      <*> arbitrary -- samlConfigurationInfoBundleLocation :: Maybe Text
      <*> arbitrary -- samlConfigurationInfoServiceLocation :: Maybe Text
      <*> arbitrary -- samlConfigurationInfoProperties :: Maybe SamlConfigurationProperties
    
instance Arbitrary SamlConfigurationProperties where
  arbitrary =
    SamlConfigurationProperties
      <$> arbitrary -- samlConfigurationPropertiesPath :: Maybe SamlConfigurationPropertyItemsArray
      <*> arbitrary -- samlConfigurationPropertiesServiceRanking :: Maybe SamlConfigurationPropertyItemsLong
      <*> arbitrary -- samlConfigurationPropertiesIdpUrl :: Maybe SamlConfigurationPropertyItemsString
      <*> arbitrary -- samlConfigurationPropertiesIdpCertAlias :: Maybe SamlConfigurationPropertyItemsString
      <*> arbitrary -- samlConfigurationPropertiesIdpHttpRedirect :: Maybe SamlConfigurationPropertyItemsBoolean
      <*> arbitrary -- samlConfigurationPropertiesServiceProviderEntityId :: Maybe SamlConfigurationPropertyItemsString
      <*> arbitrary -- samlConfigurationPropertiesAssertionConsumerServiceUrl :: Maybe SamlConfigurationPropertyItemsString
      <*> arbitrary -- samlConfigurationPropertiesSpPrivateKeyAlias :: Maybe SamlConfigurationPropertyItemsString
      <*> arbitrary -- samlConfigurationPropertiesKeyStorePassword :: Maybe SamlConfigurationPropertyItemsString
      <*> arbitrary -- samlConfigurationPropertiesDefaultRedirectUrl :: Maybe SamlConfigurationPropertyItemsString
      <*> arbitrary -- samlConfigurationPropertiesUserIdAttribute :: Maybe SamlConfigurationPropertyItemsString
      <*> arbitrary -- samlConfigurationPropertiesUseEncryption :: Maybe SamlConfigurationPropertyItemsBoolean
      <*> arbitrary -- samlConfigurationPropertiesCreateUser :: Maybe SamlConfigurationPropertyItemsBoolean
      <*> arbitrary -- samlConfigurationPropertiesAddGroupMemberships :: Maybe SamlConfigurationPropertyItemsBoolean
      <*> arbitrary -- samlConfigurationPropertiesGroupMembershipAttribute :: Maybe SamlConfigurationPropertyItemsString
      <*> arbitrary -- samlConfigurationPropertiesDefaultGroups :: Maybe SamlConfigurationPropertyItemsArray
      <*> arbitrary -- samlConfigurationPropertiesNameIdFormat :: Maybe SamlConfigurationPropertyItemsString
      <*> arbitrary -- samlConfigurationPropertiesSynchronizeAttributes :: Maybe SamlConfigurationPropertyItemsArray
      <*> arbitrary -- samlConfigurationPropertiesHandleLogout :: Maybe SamlConfigurationPropertyItemsBoolean
      <*> arbitrary -- samlConfigurationPropertiesLogoutUrl :: Maybe SamlConfigurationPropertyItemsString
      <*> arbitrary -- samlConfigurationPropertiesClockTolerance :: Maybe SamlConfigurationPropertyItemsLong
      <*> arbitrary -- samlConfigurationPropertiesDigestMethod :: Maybe SamlConfigurationPropertyItemsString
      <*> arbitrary -- samlConfigurationPropertiesSignatureMethod :: Maybe SamlConfigurationPropertyItemsString
      <*> arbitrary -- samlConfigurationPropertiesUserIntermediatePath :: Maybe SamlConfigurationPropertyItemsString
    
instance Arbitrary SamlConfigurationPropertyItemsArray where
  arbitrary =
    SamlConfigurationPropertyItemsArray
      <$> arbitrary -- samlConfigurationPropertyItemsArrayName :: Maybe Text
      <*> arbitrary -- samlConfigurationPropertyItemsArrayOptional :: Maybe Bool
      <*> arbitrary -- samlConfigurationPropertyItemsArrayIsSet :: Maybe Bool
      <*> arbitrary -- samlConfigurationPropertyItemsArrayType :: Maybe Int
      <*> arbitrary -- samlConfigurationPropertyItemsArrayValues :: Maybe [Text]
      <*> arbitrary -- samlConfigurationPropertyItemsArrayDescription :: Maybe Text
    
instance Arbitrary SamlConfigurationPropertyItemsBoolean where
  arbitrary =
    SamlConfigurationPropertyItemsBoolean
      <$> arbitrary -- samlConfigurationPropertyItemsBooleanName :: Maybe Text
      <*> arbitrary -- samlConfigurationPropertyItemsBooleanOptional :: Maybe Bool
      <*> arbitrary -- samlConfigurationPropertyItemsBooleanIsSet :: Maybe Bool
      <*> arbitrary -- samlConfigurationPropertyItemsBooleanType :: Maybe Int
      <*> arbitrary -- samlConfigurationPropertyItemsBooleanValue :: Maybe Bool
      <*> arbitrary -- samlConfigurationPropertyItemsBooleanDescription :: Maybe Text
    
instance Arbitrary SamlConfigurationPropertyItemsLong where
  arbitrary =
    SamlConfigurationPropertyItemsLong
      <$> arbitrary -- samlConfigurationPropertyItemsLongName :: Maybe Text
      <*> arbitrary -- samlConfigurationPropertyItemsLongOptional :: Maybe Bool
      <*> arbitrary -- samlConfigurationPropertyItemsLongIsSet :: Maybe Bool
      <*> arbitrary -- samlConfigurationPropertyItemsLongType :: Maybe Int
      <*> arbitrary -- samlConfigurationPropertyItemsLongValue :: Maybe Int
      <*> arbitrary -- samlConfigurationPropertyItemsLongDescription :: Maybe Text
    
instance Arbitrary SamlConfigurationPropertyItemsString where
  arbitrary =
    SamlConfigurationPropertyItemsString
      <$> arbitrary -- samlConfigurationPropertyItemsStringName :: Maybe Text
      <*> arbitrary -- samlConfigurationPropertyItemsStringOptional :: Maybe Bool
      <*> arbitrary -- samlConfigurationPropertyItemsStringIsSet :: Maybe Bool
      <*> arbitrary -- samlConfigurationPropertyItemsStringType :: Maybe Int
      <*> arbitrary -- samlConfigurationPropertyItemsStringValue :: Maybe Text
      <*> arbitrary -- samlConfigurationPropertyItemsStringDescription :: Maybe Text
    
instance Arbitrary TruststoreInfo where
  arbitrary =
    TruststoreInfo
      <$> arbitrary -- truststoreInfoAliases :: Maybe [TruststoreItems]
      <*> arbitrary -- truststoreInfoExists :: Maybe Bool
    
instance Arbitrary TruststoreItems where
  arbitrary =
    TruststoreItems
      <$> arbitrary -- truststoreItemsAlias :: Maybe Text
      <*> arbitrary -- truststoreItemsEntryType :: Maybe Text
      <*> arbitrary -- truststoreItemsSubject :: Maybe Text
      <*> arbitrary -- truststoreItemsIssuer :: Maybe Text
      <*> arbitrary -- truststoreItemsNotBefore :: Maybe Text
      <*> arbitrary -- truststoreItemsNotAfter :: Maybe Text
      <*> arbitrary -- truststoreItemsSerialNumber :: Maybe Int
    


