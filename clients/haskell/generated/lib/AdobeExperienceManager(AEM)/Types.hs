{-# LANGUAGE DeriveGeneric #-}
{-# LANGUAGE GeneralizedNewtypeDeriving #-}
{-# OPTIONS_GHC -fno-warn-unused-binds -fno-warn-unused-imports #-}

module AdobeExperienceManager(AEM).Types (
  InstallStatus (..),
  InstallStatus_status (..),
  KeystoreChainItems (..),
  KeystoreInfo (..),
  KeystoreItems (..),
  SamlConfigurationInfo (..),
  SamlConfigurationProperties (..),
  SamlConfigurationPropertyItemsArray (..),
  SamlConfigurationPropertyItemsBoolean (..),
  SamlConfigurationPropertyItemsLong (..),
  SamlConfigurationPropertyItemsString (..),
  TruststoreInfo (..),
  TruststoreItems (..),
  ) where

import Data.List (stripPrefix)
import Data.Maybe (fromMaybe)
import Data.Aeson (Value, FromJSON(..), ToJSON(..), genericToJSON, genericParseJSON)
import Data.Aeson.Types (Options(..), defaultOptions)
import Data.Text (Text)
import qualified Data.Text as T
import qualified Data.Map as Map
import GHC.Generics (Generic)
import Data.Function ((&))


-- | 
data InstallStatus = InstallStatus
  { installStatusStatus :: InstallStatus_status -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON InstallStatus where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "installStatus")
instance ToJSON InstallStatus where
  toJSON = genericToJSON (removeFieldLabelPrefix False "installStatus")

-- | 
data InstallStatus_status = InstallStatus_status
  { installStatusStatusFinished :: Bool -- ^ 
  , installStatusStatusItemCount :: Int -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON InstallStatus_status where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "installStatusStatus")
instance ToJSON InstallStatus_status where
  toJSON = genericToJSON (removeFieldLabelPrefix False "installStatusStatus")

-- | 
data KeystoreChainItems = KeystoreChainItems
  { keystoreChainItemsSubject :: Text -- ^ e.g. \"CN=localhost\"
  , keystoreChainItemsIssuer :: Text -- ^ e.g. \"CN=Admin\"
  , keystoreChainItemsNotBefore :: Text -- ^ e.g. \"Sun Jul 01 12:00:00 AEST 2018\"
  , keystoreChainItemsNotAfter :: Text -- ^ e.g. \"Sun Jun 30 23:59:50 AEST 2019\"
  , keystoreChainItemsSerialNumber :: Int -- ^ 18165099476682912368
  } deriving (Show, Eq, Generic)

instance FromJSON KeystoreChainItems where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "keystoreChainItems")
instance ToJSON KeystoreChainItems where
  toJSON = genericToJSON (removeFieldLabelPrefix False "keystoreChainItems")

-- | 
data KeystoreInfo = KeystoreInfo
  { keystoreInfoAliases :: [KeystoreItems] -- ^ 
  , keystoreInfoExists :: Bool -- ^ False if truststore don't exist
  } deriving (Show, Eq, Generic)

instance FromJSON KeystoreInfo where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "keystoreInfo")
instance ToJSON KeystoreInfo where
  toJSON = genericToJSON (removeFieldLabelPrefix False "keystoreInfo")

-- | 
data KeystoreItems = KeystoreItems
  { keystoreItemsAlias :: Text -- ^ Keystore alias name
  , keystoreItemsEntryType :: Text -- ^ e.g. \"privateKey\"
  , keystoreItemsAlgorithm :: Text -- ^ e.g. \"RSA\"
  , keystoreItemsFormat :: Text -- ^ e.g. \"PKCS#8\"
  , keystoreItemsChain :: [KeystoreChainItems] -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON KeystoreItems where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "keystoreItems")
instance ToJSON KeystoreItems where
  toJSON = genericToJSON (removeFieldLabelPrefix False "keystoreItems")

-- | 
data SamlConfigurationInfo = SamlConfigurationInfo
  { samlConfigurationInfoPid :: Text -- ^ Persistent Identity (PID)
  , samlConfigurationInfoTitle :: Text -- ^ Title
  , samlConfigurationInfoDescription :: Text -- ^ Title
  , samlConfigurationInfoBundleUnderscorelocation :: Text -- ^ needed for configuration binding
  , samlConfigurationInfoServiceUnderscorelocation :: Text -- ^ needed for configuraiton binding
  , samlConfigurationInfoProperties :: SamlConfigurationProperties -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON SamlConfigurationInfo where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "samlConfigurationInfo")
instance ToJSON SamlConfigurationInfo where
  toJSON = genericToJSON (removeFieldLabelPrefix False "samlConfigurationInfo")

-- | 
data SamlConfigurationProperties = SamlConfigurationProperties
  { samlConfigurationPropertiesPath :: SamlConfigurationPropertyItemsArray -- ^ 
  , samlConfigurationPropertiesServicePeriodranking :: SamlConfigurationPropertyItemsLong -- ^ 
  , samlConfigurationPropertiesIdpUrl :: SamlConfigurationPropertyItemsString -- ^ 
  , samlConfigurationPropertiesIdpCertAlias :: SamlConfigurationPropertyItemsString -- ^ 
  , samlConfigurationPropertiesIdpHttpRedirect :: SamlConfigurationPropertyItemsBoolean -- ^ 
  , samlConfigurationPropertiesServiceProviderEntityId :: SamlConfigurationPropertyItemsString -- ^ 
  , samlConfigurationPropertiesAssertionConsumerServiceURL :: SamlConfigurationPropertyItemsString -- ^ 
  , samlConfigurationPropertiesSpPrivateKeyAlias :: SamlConfigurationPropertyItemsString -- ^ 
  , samlConfigurationPropertiesKeyStorePassword :: SamlConfigurationPropertyItemsString -- ^ 
  , samlConfigurationPropertiesDefaultRedirectUrl :: SamlConfigurationPropertyItemsString -- ^ 
  , samlConfigurationPropertiesUserIDAttribute :: SamlConfigurationPropertyItemsString -- ^ 
  , samlConfigurationPropertiesUseEncryption :: SamlConfigurationPropertyItemsBoolean -- ^ 
  , samlConfigurationPropertiesCreateUser :: SamlConfigurationPropertyItemsBoolean -- ^ 
  , samlConfigurationPropertiesAddGroupMemberships :: SamlConfigurationPropertyItemsBoolean -- ^ 
  , samlConfigurationPropertiesGroupMembershipAttribute :: SamlConfigurationPropertyItemsString -- ^ 
  , samlConfigurationPropertiesDefaultGroups :: SamlConfigurationPropertyItemsArray -- ^ 
  , samlConfigurationPropertiesNameIdFormat :: SamlConfigurationPropertyItemsString -- ^ 
  , samlConfigurationPropertiesSynchronizeAttributes :: SamlConfigurationPropertyItemsArray -- ^ 
  , samlConfigurationPropertiesHandleLogout :: SamlConfigurationPropertyItemsBoolean -- ^ 
  , samlConfigurationPropertiesLogoutUrl :: SamlConfigurationPropertyItemsString -- ^ 
  , samlConfigurationPropertiesClockTolerance :: SamlConfigurationPropertyItemsLong -- ^ 
  , samlConfigurationPropertiesDigestMethod :: SamlConfigurationPropertyItemsString -- ^ 
  , samlConfigurationPropertiesSignatureMethod :: SamlConfigurationPropertyItemsString -- ^ 
  , samlConfigurationPropertiesUserIntermediatePath :: SamlConfigurationPropertyItemsString -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON SamlConfigurationProperties where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "samlConfigurationProperties")
instance ToJSON SamlConfigurationProperties where
  toJSON = genericToJSON (removeFieldLabelPrefix False "samlConfigurationProperties")

-- | 
data SamlConfigurationPropertyItemsArray = SamlConfigurationPropertyItemsArray
  { samlConfigurationPropertyItemsArrayName :: Text -- ^ property name
  , samlConfigurationPropertyItemsArrayOptional :: Bool -- ^ True if optional
  , samlConfigurationPropertyItemsArrayIsUnderscoreset :: Bool -- ^ True if property is set
  , samlConfigurationPropertyItemsArrayType :: Int -- ^ Property type, 1=String, 3=long, 11=boolean, 12=Password
  , samlConfigurationPropertyItemsArrayValues :: [Text] -- ^ Property value
  , samlConfigurationPropertyItemsArrayDescription :: Text -- ^ Property description
  } deriving (Show, Eq, Generic)

instance FromJSON SamlConfigurationPropertyItemsArray where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "samlConfigurationPropertyItemsArray")
instance ToJSON SamlConfigurationPropertyItemsArray where
  toJSON = genericToJSON (removeFieldLabelPrefix False "samlConfigurationPropertyItemsArray")

-- | 
data SamlConfigurationPropertyItemsBoolean = SamlConfigurationPropertyItemsBoolean
  { samlConfigurationPropertyItemsBooleanName :: Text -- ^ property name
  , samlConfigurationPropertyItemsBooleanOptional :: Bool -- ^ True if optional
  , samlConfigurationPropertyItemsBooleanIsUnderscoreset :: Bool -- ^ True if property is set
  , samlConfigurationPropertyItemsBooleanType :: Int -- ^ Property type, 1=String, 3=long, 11=boolean, 12=Password
  , samlConfigurationPropertyItemsBooleanValue :: Bool -- ^ Property value
  , samlConfigurationPropertyItemsBooleanDescription :: Text -- ^ Property description
  } deriving (Show, Eq, Generic)

instance FromJSON SamlConfigurationPropertyItemsBoolean where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "samlConfigurationPropertyItemsBoolean")
instance ToJSON SamlConfigurationPropertyItemsBoolean where
  toJSON = genericToJSON (removeFieldLabelPrefix False "samlConfigurationPropertyItemsBoolean")

-- | 
data SamlConfigurationPropertyItemsLong = SamlConfigurationPropertyItemsLong
  { samlConfigurationPropertyItemsLongName :: Text -- ^ property name
  , samlConfigurationPropertyItemsLongOptional :: Bool -- ^ True if optional
  , samlConfigurationPropertyItemsLongIsUnderscoreset :: Bool -- ^ True if property is set
  , samlConfigurationPropertyItemsLongType :: Int -- ^ Property type, 1=String, 3=long, 11=boolean, 12=Password
  , samlConfigurationPropertyItemsLongValue :: Int -- ^ Property value
  , samlConfigurationPropertyItemsLongDescription :: Text -- ^ Property description
  } deriving (Show, Eq, Generic)

instance FromJSON SamlConfigurationPropertyItemsLong where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "samlConfigurationPropertyItemsLong")
instance ToJSON SamlConfigurationPropertyItemsLong where
  toJSON = genericToJSON (removeFieldLabelPrefix False "samlConfigurationPropertyItemsLong")

-- | 
data SamlConfigurationPropertyItemsString = SamlConfigurationPropertyItemsString
  { samlConfigurationPropertyItemsStringName :: Text -- ^ property name
  , samlConfigurationPropertyItemsStringOptional :: Bool -- ^ True if optional
  , samlConfigurationPropertyItemsStringIsUnderscoreset :: Bool -- ^ True if property is set
  , samlConfigurationPropertyItemsStringType :: Int -- ^ Property type, 1=String, 3=long, 11=boolean, 12=Password
  , samlConfigurationPropertyItemsStringValue :: Text -- ^ Property value
  , samlConfigurationPropertyItemsStringDescription :: Text -- ^ Property description
  } deriving (Show, Eq, Generic)

instance FromJSON SamlConfigurationPropertyItemsString where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "samlConfigurationPropertyItemsString")
instance ToJSON SamlConfigurationPropertyItemsString where
  toJSON = genericToJSON (removeFieldLabelPrefix False "samlConfigurationPropertyItemsString")

-- | 
data TruststoreInfo = TruststoreInfo
  { truststoreInfoAliases :: [TruststoreItems] -- ^ 
  , truststoreInfoExists :: Bool -- ^ False if truststore don't exist
  } deriving (Show, Eq, Generic)

instance FromJSON TruststoreInfo where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "truststoreInfo")
instance ToJSON TruststoreInfo where
  toJSON = genericToJSON (removeFieldLabelPrefix False "truststoreInfo")

-- | 
data TruststoreItems = TruststoreItems
  { truststoreItemsAlias :: Text -- ^ Truststore alias name
  , truststoreItemsEntryType :: Text -- ^ 
  , truststoreItemsSubject :: Text -- ^ e.g. \"CN=localhost\"
  , truststoreItemsIssuer :: Text -- ^ e.g. \"CN=Admin\"
  , truststoreItemsNotBefore :: Text -- ^ e.g. \"Sun Jul 01 12:00:00 AEST 2018\"
  , truststoreItemsNotAfter :: Text -- ^ e.g. \"Sun Jun 30 23:59:50 AEST 2019\"
  , truststoreItemsSerialNumber :: Int -- ^ 18165099476682912368
  } deriving (Show, Eq, Generic)

instance FromJSON TruststoreItems where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "truststoreItems")
instance ToJSON TruststoreItems where
  toJSON = genericToJSON (removeFieldLabelPrefix False "truststoreItems")

-- Remove a field label prefix during JSON parsing.
-- Also perform any replacements for special characters.
removeFieldLabelPrefix :: Bool -> String -> Options
removeFieldLabelPrefix forParsing prefix =
  defaultOptions
  {fieldLabelModifier = fromMaybe (error ("did not find prefix " ++ prefix)) . stripPrefix prefix . replaceSpecialChars}
  where
    replaceSpecialChars field = foldl (&) field (map mkCharReplacement specialChars)
    specialChars =
      [ ("@", "'At")
      , ("\\", "'Back_Slash")
      , ("<=", "'Less_Than_Or_Equal_To")
      , ("\"", "'Double_Quote")
      , ("[", "'Left_Square_Bracket")
      , ("]", "'Right_Square_Bracket")
      , ("^", "'Caret")
      , ("_", "'Underscore")
      , ("`", "'Backtick")
      , ("!", "'Exclamation")
      , ("#", "'Hash")
      , ("$", "'Dollar")
      , ("%", "'Percent")
      , ("&", "'Ampersand")
      , ("'", "'Quote")
      , ("(", "'Left_Parenthesis")
      , (")", "'Right_Parenthesis")
      , ("*", "'Star")
      , ("+", "'Plus")
      , (",", "'Comma")
      , ("-", "'Dash")
      , (".", "'Period")
      , ("/", "'Slash")
      , (":", "'Colon")
      , ("{", "'Left_Curly_Bracket")
      , ("|", "'Pipe")
      , ("<", "'LessThan")
      , ("!=", "'Not_Equal")
      , ("=", "'Equal")
      , ("}", "'Right_Curly_Bracket")
      , (">", "'GreaterThan")
      , ("~", "'Tilde")
      , ("?", "'Question_Mark")
      , (">=", "'Greater_Than_Or_Equal_To")
      ]
    mkCharReplacement (replaceStr, searchStr) = T.unpack . replacer (T.pack searchStr) (T.pack replaceStr) . T.pack
    replacer =
      if forParsing
        then flip T.replace
        else T.replace
