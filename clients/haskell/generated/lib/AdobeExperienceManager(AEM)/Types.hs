{-# LANGUAGE GeneralizedNewtypeDeriving #-}
{-# LANGUAGE DeriveDataTypeable         #-}
{-# LANGUAGE DeriveGeneric              #-}
{-# OPTIONS_GHC -fno-warn-unused-binds -fno-warn-unused-imports #-}

module AdobeExperienceManager(AEM).Types (
  BundleData (..),
  BundleDataProp (..),
  BundleInfo (..),
  InstallStatus (..),
  InstallStatusStatus (..),
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

import Data.Data (Data)
import Data.UUID (UUID)
import Data.List (stripPrefix)
import Data.Maybe (fromMaybe)
import Data.Aeson (Value, FromJSON(..), ToJSON(..), genericToJSON, genericParseJSON)
import Data.Aeson.Types (Options(..), defaultOptions)
import Data.Set (Set)
import Data.Text (Text)
import Data.Time
import Data.Swagger (ToSchema, declareNamedSchema)
import qualified Data.Swagger as Swagger
import qualified Data.Char as Char
import qualified Data.Text as T
import qualified Data.Map as Map
import GHC.Generics (Generic)
import Data.Function ((&))


-- | 
data BundleData = BundleData
  { bundleDataId :: Maybe Int -- ^ Bundle ID
  , bundleDataName :: Maybe Text -- ^ Bundle name
  , bundleDataFragment :: Maybe Bool -- ^ Is bundle a fragment
  , bundleDataStateRaw :: Maybe Int -- ^ Numeric raw bundle state value
  , bundleDataState :: Maybe Text -- ^ Bundle state value
  , bundleDataVersion :: Maybe Text -- ^ Bundle version
  , bundleDataSymbolicName :: Maybe Text -- ^ Bundle symbolic name
  , bundleDataCategory :: Maybe Text -- ^ Bundle category
  , bundleDataProps :: Maybe [BundleDataProp] -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON BundleData where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "bundleData")
instance ToJSON BundleData where
  toJSON = genericToJSON (removeFieldLabelPrefix False "bundleData")
instance ToSchema BundleData where
  declareNamedSchema = Swagger.genericDeclareNamedSchema
    $ Swagger.fromAesonOptions
    $ removeFieldLabelPrefix False "bundleData"


-- | 
data BundleDataProp = BundleDataProp
  { bundleDataPropKey :: Maybe Text -- ^ Bundle data key
  , bundleDataPropValue :: Maybe Text -- ^ Bundle data value
  } deriving (Show, Eq, Generic, Data)

instance FromJSON BundleDataProp where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "bundleDataProp")
instance ToJSON BundleDataProp where
  toJSON = genericToJSON (removeFieldLabelPrefix False "bundleDataProp")
instance ToSchema BundleDataProp where
  declareNamedSchema = Swagger.genericDeclareNamedSchema
    $ Swagger.fromAesonOptions
    $ removeFieldLabelPrefix False "bundleDataProp"


-- | 
data BundleInfo = BundleInfo
  { bundleInfoStatus :: Maybe Text -- ^ Status description of all bundles
  , bundleInfoS :: Maybe [Int] -- ^ 
  , bundleInfoData :: Maybe [BundleData] -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON BundleInfo where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "bundleInfo")
instance ToJSON BundleInfo where
  toJSON = genericToJSON (removeFieldLabelPrefix False "bundleInfo")
instance ToSchema BundleInfo where
  declareNamedSchema = Swagger.genericDeclareNamedSchema
    $ Swagger.fromAesonOptions
    $ removeFieldLabelPrefix False "bundleInfo"


-- | 
data InstallStatus = InstallStatus
  { installStatusStatus :: Maybe InstallStatusStatus -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON InstallStatus where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "installStatus")
instance ToJSON InstallStatus where
  toJSON = genericToJSON (removeFieldLabelPrefix False "installStatus")
instance ToSchema InstallStatus where
  declareNamedSchema = Swagger.genericDeclareNamedSchema
    $ Swagger.fromAesonOptions
    $ removeFieldLabelPrefix False "installStatus"


-- | 
data InstallStatusStatus = InstallStatusStatus
  { installStatusStatusFinished :: Maybe Bool -- ^ 
  , installStatusStatusItemCount :: Maybe Int -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON InstallStatusStatus where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "installStatusStatus")
instance ToJSON InstallStatusStatus where
  toJSON = genericToJSON (removeFieldLabelPrefix False "installStatusStatus")
instance ToSchema InstallStatusStatus where
  declareNamedSchema = Swagger.genericDeclareNamedSchema
    $ Swagger.fromAesonOptions
    $ removeFieldLabelPrefix False "installStatusStatus"


-- | 
data KeystoreChainItems = KeystoreChainItems
  { keystoreChainItemsSubject :: Maybe Text -- ^ e.g. \"CN=localhost\"
  , keystoreChainItemsIssuer :: Maybe Text -- ^ e.g. \"CN=Admin\"
  , keystoreChainItemsNotBefore :: Maybe Text -- ^ e.g. \"Sun Jul 01 12:00:00 AEST 2018\"
  , keystoreChainItemsNotAfter :: Maybe Text -- ^ e.g. \"Sun Jun 30 23:59:50 AEST 2019\"
  , keystoreChainItemsSerialNumber :: Maybe Int -- ^ 18165099476682912368
  } deriving (Show, Eq, Generic, Data)

instance FromJSON KeystoreChainItems where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "keystoreChainItems")
instance ToJSON KeystoreChainItems where
  toJSON = genericToJSON (removeFieldLabelPrefix False "keystoreChainItems")
instance ToSchema KeystoreChainItems where
  declareNamedSchema = Swagger.genericDeclareNamedSchema
    $ Swagger.fromAesonOptions
    $ removeFieldLabelPrefix False "keystoreChainItems"


-- | 
data KeystoreInfo = KeystoreInfo
  { keystoreInfoAliases :: Maybe [KeystoreItems] -- ^ 
  , keystoreInfoExists :: Maybe Bool -- ^ False if truststore don't exist
  } deriving (Show, Eq, Generic, Data)

instance FromJSON KeystoreInfo where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "keystoreInfo")
instance ToJSON KeystoreInfo where
  toJSON = genericToJSON (removeFieldLabelPrefix False "keystoreInfo")
instance ToSchema KeystoreInfo where
  declareNamedSchema = Swagger.genericDeclareNamedSchema
    $ Swagger.fromAesonOptions
    $ removeFieldLabelPrefix False "keystoreInfo"


-- | 
data KeystoreItems = KeystoreItems
  { keystoreItemsAlias :: Maybe Text -- ^ Keystore alias name
  , keystoreItemsEntryType :: Maybe Text -- ^ e.g. \"privateKey\"
  , keystoreItemsAlgorithm :: Maybe Text -- ^ e.g. \"RSA\"
  , keystoreItemsFormat :: Maybe Text -- ^ e.g. \"PKCS#8\"
  , keystoreItemsChain :: Maybe [KeystoreChainItems] -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON KeystoreItems where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "keystoreItems")
instance ToJSON KeystoreItems where
  toJSON = genericToJSON (removeFieldLabelPrefix False "keystoreItems")
instance ToSchema KeystoreItems where
  declareNamedSchema = Swagger.genericDeclareNamedSchema
    $ Swagger.fromAesonOptions
    $ removeFieldLabelPrefix False "keystoreItems"


-- | 
data SamlConfigurationInfo = SamlConfigurationInfo
  { samlConfigurationInfoPid :: Maybe Text -- ^ Persistent Identity (PID)
  , samlConfigurationInfoTitle :: Maybe Text -- ^ Title
  , samlConfigurationInfoDescription :: Maybe Text -- ^ Title
  , samlConfigurationInfoBundleUnderscorelocation :: Maybe Text -- ^ needed for configuration binding
  , samlConfigurationInfoServiceUnderscorelocation :: Maybe Text -- ^ needed for configuraiton binding
  , samlConfigurationInfoProperties :: Maybe SamlConfigurationProperties -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON SamlConfigurationInfo where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "samlConfigurationInfo")
instance ToJSON SamlConfigurationInfo where
  toJSON = genericToJSON (removeFieldLabelPrefix False "samlConfigurationInfo")
instance ToSchema SamlConfigurationInfo where
  declareNamedSchema = Swagger.genericDeclareNamedSchema
    $ Swagger.fromAesonOptions
    $ removeFieldLabelPrefix False "samlConfigurationInfo"


-- | 
data SamlConfigurationProperties = SamlConfigurationProperties
  { samlConfigurationPropertiesPath :: Maybe SamlConfigurationPropertyItemsArray -- ^ 
  , samlConfigurationPropertiesServicePeriodranking :: Maybe SamlConfigurationPropertyItemsLong -- ^ 
  , samlConfigurationPropertiesIdpUrl :: Maybe SamlConfigurationPropertyItemsString -- ^ 
  , samlConfigurationPropertiesIdpCertAlias :: Maybe SamlConfigurationPropertyItemsString -- ^ 
  , samlConfigurationPropertiesIdpHttpRedirect :: Maybe SamlConfigurationPropertyItemsBoolean -- ^ 
  , samlConfigurationPropertiesServiceProviderEntityId :: Maybe SamlConfigurationPropertyItemsString -- ^ 
  , samlConfigurationPropertiesAssertionConsumerServiceURL :: Maybe SamlConfigurationPropertyItemsString -- ^ 
  , samlConfigurationPropertiesSpPrivateKeyAlias :: Maybe SamlConfigurationPropertyItemsString -- ^ 
  , samlConfigurationPropertiesKeyStorePassword :: Maybe SamlConfigurationPropertyItemsString -- ^ 
  , samlConfigurationPropertiesDefaultRedirectUrl :: Maybe SamlConfigurationPropertyItemsString -- ^ 
  , samlConfigurationPropertiesUserIDAttribute :: Maybe SamlConfigurationPropertyItemsString -- ^ 
  , samlConfigurationPropertiesUseEncryption :: Maybe SamlConfigurationPropertyItemsBoolean -- ^ 
  , samlConfigurationPropertiesCreateUser :: Maybe SamlConfigurationPropertyItemsBoolean -- ^ 
  , samlConfigurationPropertiesAddGroupMemberships :: Maybe SamlConfigurationPropertyItemsBoolean -- ^ 
  , samlConfigurationPropertiesGroupMembershipAttribute :: Maybe SamlConfigurationPropertyItemsString -- ^ 
  , samlConfigurationPropertiesDefaultGroups :: Maybe SamlConfigurationPropertyItemsArray -- ^ 
  , samlConfigurationPropertiesNameIdFormat :: Maybe SamlConfigurationPropertyItemsString -- ^ 
  , samlConfigurationPropertiesSynchronizeAttributes :: Maybe SamlConfigurationPropertyItemsArray -- ^ 
  , samlConfigurationPropertiesHandleLogout :: Maybe SamlConfigurationPropertyItemsBoolean -- ^ 
  , samlConfigurationPropertiesLogoutUrl :: Maybe SamlConfigurationPropertyItemsString -- ^ 
  , samlConfigurationPropertiesClockTolerance :: Maybe SamlConfigurationPropertyItemsLong -- ^ 
  , samlConfigurationPropertiesDigestMethod :: Maybe SamlConfigurationPropertyItemsString -- ^ 
  , samlConfigurationPropertiesSignatureMethod :: Maybe SamlConfigurationPropertyItemsString -- ^ 
  , samlConfigurationPropertiesUserIntermediatePath :: Maybe SamlConfigurationPropertyItemsString -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON SamlConfigurationProperties where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "samlConfigurationProperties")
instance ToJSON SamlConfigurationProperties where
  toJSON = genericToJSON (removeFieldLabelPrefix False "samlConfigurationProperties")
instance ToSchema SamlConfigurationProperties where
  declareNamedSchema = Swagger.genericDeclareNamedSchema
    $ Swagger.fromAesonOptions
    $ removeFieldLabelPrefix False "samlConfigurationProperties"


-- | 
data SamlConfigurationPropertyItemsArray = SamlConfigurationPropertyItemsArray
  { samlConfigurationPropertyItemsArrayName :: Maybe Text -- ^ property name
  , samlConfigurationPropertyItemsArrayOptional :: Maybe Bool -- ^ True if optional
  , samlConfigurationPropertyItemsArrayIsUnderscoreset :: Maybe Bool -- ^ True if property is set
  , samlConfigurationPropertyItemsArrayType :: Maybe Int -- ^ Property type, 1=String, 3=long, 11=boolean, 12=Password
  , samlConfigurationPropertyItemsArrayValues :: Maybe [Text] -- ^ Property value
  , samlConfigurationPropertyItemsArrayDescription :: Maybe Text -- ^ Property description
  } deriving (Show, Eq, Generic, Data)

instance FromJSON SamlConfigurationPropertyItemsArray where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "samlConfigurationPropertyItemsArray")
instance ToJSON SamlConfigurationPropertyItemsArray where
  toJSON = genericToJSON (removeFieldLabelPrefix False "samlConfigurationPropertyItemsArray")
instance ToSchema SamlConfigurationPropertyItemsArray where
  declareNamedSchema = Swagger.genericDeclareNamedSchema
    $ Swagger.fromAesonOptions
    $ removeFieldLabelPrefix False "samlConfigurationPropertyItemsArray"


-- | 
data SamlConfigurationPropertyItemsBoolean = SamlConfigurationPropertyItemsBoolean
  { samlConfigurationPropertyItemsBooleanName :: Maybe Text -- ^ property name
  , samlConfigurationPropertyItemsBooleanOptional :: Maybe Bool -- ^ True if optional
  , samlConfigurationPropertyItemsBooleanIsUnderscoreset :: Maybe Bool -- ^ True if property is set
  , samlConfigurationPropertyItemsBooleanType :: Maybe Int -- ^ Property type, 1=String, 3=long, 11=boolean, 12=Password
  , samlConfigurationPropertyItemsBooleanValue :: Maybe Bool -- ^ Property value
  , samlConfigurationPropertyItemsBooleanDescription :: Maybe Text -- ^ Property description
  } deriving (Show, Eq, Generic, Data)

instance FromJSON SamlConfigurationPropertyItemsBoolean where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "samlConfigurationPropertyItemsBoolean")
instance ToJSON SamlConfigurationPropertyItemsBoolean where
  toJSON = genericToJSON (removeFieldLabelPrefix False "samlConfigurationPropertyItemsBoolean")
instance ToSchema SamlConfigurationPropertyItemsBoolean where
  declareNamedSchema = Swagger.genericDeclareNamedSchema
    $ Swagger.fromAesonOptions
    $ removeFieldLabelPrefix False "samlConfigurationPropertyItemsBoolean"


-- | 
data SamlConfigurationPropertyItemsLong = SamlConfigurationPropertyItemsLong
  { samlConfigurationPropertyItemsLongName :: Maybe Text -- ^ property name
  , samlConfigurationPropertyItemsLongOptional :: Maybe Bool -- ^ True if optional
  , samlConfigurationPropertyItemsLongIsUnderscoreset :: Maybe Bool -- ^ True if property is set
  , samlConfigurationPropertyItemsLongType :: Maybe Int -- ^ Property type, 1=String, 3=long, 11=boolean, 12=Password
  , samlConfigurationPropertyItemsLongValue :: Maybe Int -- ^ Property value
  , samlConfigurationPropertyItemsLongDescription :: Maybe Text -- ^ Property description
  } deriving (Show, Eq, Generic, Data)

instance FromJSON SamlConfigurationPropertyItemsLong where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "samlConfigurationPropertyItemsLong")
instance ToJSON SamlConfigurationPropertyItemsLong where
  toJSON = genericToJSON (removeFieldLabelPrefix False "samlConfigurationPropertyItemsLong")
instance ToSchema SamlConfigurationPropertyItemsLong where
  declareNamedSchema = Swagger.genericDeclareNamedSchema
    $ Swagger.fromAesonOptions
    $ removeFieldLabelPrefix False "samlConfigurationPropertyItemsLong"


-- | 
data SamlConfigurationPropertyItemsString = SamlConfigurationPropertyItemsString
  { samlConfigurationPropertyItemsStringName :: Maybe Text -- ^ property name
  , samlConfigurationPropertyItemsStringOptional :: Maybe Bool -- ^ True if optional
  , samlConfigurationPropertyItemsStringIsUnderscoreset :: Maybe Bool -- ^ True if property is set
  , samlConfigurationPropertyItemsStringType :: Maybe Int -- ^ Property type, 1=String, 3=long, 11=boolean, 12=Password
  , samlConfigurationPropertyItemsStringValue :: Maybe Text -- ^ Property value
  , samlConfigurationPropertyItemsStringDescription :: Maybe Text -- ^ Property description
  } deriving (Show, Eq, Generic, Data)

instance FromJSON SamlConfigurationPropertyItemsString where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "samlConfigurationPropertyItemsString")
instance ToJSON SamlConfigurationPropertyItemsString where
  toJSON = genericToJSON (removeFieldLabelPrefix False "samlConfigurationPropertyItemsString")
instance ToSchema SamlConfigurationPropertyItemsString where
  declareNamedSchema = Swagger.genericDeclareNamedSchema
    $ Swagger.fromAesonOptions
    $ removeFieldLabelPrefix False "samlConfigurationPropertyItemsString"


-- | 
data TruststoreInfo = TruststoreInfo
  { truststoreInfoAliases :: Maybe [TruststoreItems] -- ^ 
  , truststoreInfoExists :: Maybe Bool -- ^ False if truststore don't exist
  } deriving (Show, Eq, Generic, Data)

instance FromJSON TruststoreInfo where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "truststoreInfo")
instance ToJSON TruststoreInfo where
  toJSON = genericToJSON (removeFieldLabelPrefix False "truststoreInfo")
instance ToSchema TruststoreInfo where
  declareNamedSchema = Swagger.genericDeclareNamedSchema
    $ Swagger.fromAesonOptions
    $ removeFieldLabelPrefix False "truststoreInfo"


-- | 
data TruststoreItems = TruststoreItems
  { truststoreItemsAlias :: Maybe Text -- ^ Truststore alias name
  , truststoreItemsEntryType :: Maybe Text -- ^ 
  , truststoreItemsSubject :: Maybe Text -- ^ e.g. \"CN=localhost\"
  , truststoreItemsIssuer :: Maybe Text -- ^ e.g. \"CN=Admin\"
  , truststoreItemsNotBefore :: Maybe Text -- ^ e.g. \"Sun Jul 01 12:00:00 AEST 2018\"
  , truststoreItemsNotAfter :: Maybe Text -- ^ e.g. \"Sun Jun 30 23:59:50 AEST 2019\"
  , truststoreItemsSerialNumber :: Maybe Int -- ^ 18165099476682912368
  } deriving (Show, Eq, Generic, Data)

instance FromJSON TruststoreItems where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "truststoreItems")
instance ToJSON TruststoreItems where
  toJSON = genericToJSON (removeFieldLabelPrefix False "truststoreItems")
instance ToSchema TruststoreItems where
  declareNamedSchema = Swagger.genericDeclareNamedSchema
    $ Swagger.fromAesonOptions
    $ removeFieldLabelPrefix False "truststoreItems"


uncapitalize :: String -> String
uncapitalize (first:rest) = Char.toLower first : rest
uncapitalize [] = []

-- | Remove a field label prefix during JSON parsing.
--   Also perform any replacements for special characters.
--   The @forParsing@ parameter is to distinguish between the cases in which we're using this
--   to power a @FromJSON@ or a @ToJSON@ instance. In the first case we're parsing, and we want
--   to replace special characters with their quoted equivalents (because we cannot have special
--   chars in identifier names), while we want to do viceversa when sending data instead.
removeFieldLabelPrefix :: Bool -> String -> Options
removeFieldLabelPrefix forParsing prefix =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = uncapitalize . fromMaybe (error ("did not find prefix " ++ prefix)) . stripPrefix prefix . replaceSpecialChars
    }
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
      , ("~=", "'Tilde_Equal")
      ]
    mkCharReplacement (replaceStr, searchStr) = T.unpack . replacer (T.pack searchStr) (T.pack replaceStr) . T.pack
    replacer =
      if forParsing
        then flip T.replace
        else T.replace
