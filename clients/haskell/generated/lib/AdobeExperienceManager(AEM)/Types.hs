{-# LANGUAGE GeneralizedNewtypeDeriving #-}
{-# LANGUAGE DeriveDataTypeable         #-}
{-# LANGUAGE DeriveGeneric              #-}
{-# LANGUAGE DuplicateRecordFields      #-}
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
import Data.List (lookup)
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
  parseJSON = genericParseJSON optionsBundleData
instance ToJSON BundleData where
  toJSON = genericToJSON optionsBundleData
instance ToSchema BundleData where
  declareNamedSchema = Swagger.genericDeclareNamedSchema
    $ Swagger.fromAesonOptions
    $ optionsBundleData

optionsBundleData :: Options
optionsBundleData =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("bundleDataId", "id")
      , ("bundleDataName", "name")
      , ("bundleDataFragment", "fragment")
      , ("bundleDataStateRaw", "stateRaw")
      , ("bundleDataState", "state")
      , ("bundleDataVersion", "version")
      , ("bundleDataSymbolicName", "symbolicName")
      , ("bundleDataCategory", "category")
      , ("bundleDataProps", "props")
      ]


-- | 
data BundleDataProp = BundleDataProp
  { bundleDataPropKey :: Maybe Text -- ^ Bundle data key
  , bundleDataPropValue :: Maybe Text -- ^ Bundle data value
  } deriving (Show, Eq, Generic, Data)

instance FromJSON BundleDataProp where
  parseJSON = genericParseJSON optionsBundleDataProp
instance ToJSON BundleDataProp where
  toJSON = genericToJSON optionsBundleDataProp
instance ToSchema BundleDataProp where
  declareNamedSchema = Swagger.genericDeclareNamedSchema
    $ Swagger.fromAesonOptions
    $ optionsBundleDataProp

optionsBundleDataProp :: Options
optionsBundleDataProp =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("bundleDataPropKey", "key")
      , ("bundleDataPropValue", "value")
      ]


-- | 
data BundleInfo = BundleInfo
  { bundleInfoStatus :: Maybe Text -- ^ Status description of all bundles
  , bundleInfoS :: Maybe [Int] -- ^ 
  , bundleInfoData :: Maybe [BundleData] -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON BundleInfo where
  parseJSON = genericParseJSON optionsBundleInfo
instance ToJSON BundleInfo where
  toJSON = genericToJSON optionsBundleInfo
instance ToSchema BundleInfo where
  declareNamedSchema = Swagger.genericDeclareNamedSchema
    $ Swagger.fromAesonOptions
    $ optionsBundleInfo

optionsBundleInfo :: Options
optionsBundleInfo =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("bundleInfoStatus", "status")
      , ("bundleInfoS", "s")
      , ("bundleInfoData", "data")
      ]


-- | 
data InstallStatus = InstallStatus
  { installStatusStatus :: Maybe InstallStatusStatus -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON InstallStatus where
  parseJSON = genericParseJSON optionsInstallStatus
instance ToJSON InstallStatus where
  toJSON = genericToJSON optionsInstallStatus
instance ToSchema InstallStatus where
  declareNamedSchema = Swagger.genericDeclareNamedSchema
    $ Swagger.fromAesonOptions
    $ optionsInstallStatus

optionsInstallStatus :: Options
optionsInstallStatus =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("installStatusStatus", "status")
      ]


-- | 
data InstallStatusStatus = InstallStatusStatus
  { installStatusStatusFinished :: Maybe Bool -- ^ 
  , installStatusStatusItemCount :: Maybe Int -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON InstallStatusStatus where
  parseJSON = genericParseJSON optionsInstallStatusStatus
instance ToJSON InstallStatusStatus where
  toJSON = genericToJSON optionsInstallStatusStatus
instance ToSchema InstallStatusStatus where
  declareNamedSchema = Swagger.genericDeclareNamedSchema
    $ Swagger.fromAesonOptions
    $ optionsInstallStatusStatus

optionsInstallStatusStatus :: Options
optionsInstallStatusStatus =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("installStatusStatusFinished", "finished")
      , ("installStatusStatusItemCount", "itemCount")
      ]


-- | 
data KeystoreChainItems = KeystoreChainItems
  { keystoreChainItemsSubject :: Maybe Text -- ^ e.g. \"CN=localhost\"
  , keystoreChainItemsIssuer :: Maybe Text -- ^ e.g. \"CN=Admin\"
  , keystoreChainItemsNotBefore :: Maybe Text -- ^ e.g. \"Sun Jul 01 12:00:00 AEST 2018\"
  , keystoreChainItemsNotAfter :: Maybe Text -- ^ e.g. \"Sun Jun 30 23:59:50 AEST 2019\"
  , keystoreChainItemsSerialNumber :: Maybe Int -- ^ 18165099476682912368
  } deriving (Show, Eq, Generic, Data)

instance FromJSON KeystoreChainItems where
  parseJSON = genericParseJSON optionsKeystoreChainItems
instance ToJSON KeystoreChainItems where
  toJSON = genericToJSON optionsKeystoreChainItems
instance ToSchema KeystoreChainItems where
  declareNamedSchema = Swagger.genericDeclareNamedSchema
    $ Swagger.fromAesonOptions
    $ optionsKeystoreChainItems

optionsKeystoreChainItems :: Options
optionsKeystoreChainItems =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("keystoreChainItemsSubject", "subject")
      , ("keystoreChainItemsIssuer", "issuer")
      , ("keystoreChainItemsNotBefore", "notBefore")
      , ("keystoreChainItemsNotAfter", "notAfter")
      , ("keystoreChainItemsSerialNumber", "serialNumber")
      ]


-- | 
data KeystoreInfo = KeystoreInfo
  { keystoreInfoAliases :: Maybe [KeystoreItems] -- ^ 
  , keystoreInfoExists :: Maybe Bool -- ^ False if truststore don't exist
  } deriving (Show, Eq, Generic, Data)

instance FromJSON KeystoreInfo where
  parseJSON = genericParseJSON optionsKeystoreInfo
instance ToJSON KeystoreInfo where
  toJSON = genericToJSON optionsKeystoreInfo
instance ToSchema KeystoreInfo where
  declareNamedSchema = Swagger.genericDeclareNamedSchema
    $ Swagger.fromAesonOptions
    $ optionsKeystoreInfo

optionsKeystoreInfo :: Options
optionsKeystoreInfo =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("keystoreInfoAliases", "aliases")
      , ("keystoreInfoExists", "exists")
      ]


-- | 
data KeystoreItems = KeystoreItems
  { keystoreItemsAlias :: Maybe Text -- ^ Keystore alias name
  , keystoreItemsEntryType :: Maybe Text -- ^ e.g. \"privateKey\"
  , keystoreItemsAlgorithm :: Maybe Text -- ^ e.g. \"RSA\"
  , keystoreItemsFormat :: Maybe Text -- ^ e.g. \"PKCS#8\"
  , keystoreItemsChain :: Maybe [KeystoreChainItems] -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON KeystoreItems where
  parseJSON = genericParseJSON optionsKeystoreItems
instance ToJSON KeystoreItems where
  toJSON = genericToJSON optionsKeystoreItems
instance ToSchema KeystoreItems where
  declareNamedSchema = Swagger.genericDeclareNamedSchema
    $ Swagger.fromAesonOptions
    $ optionsKeystoreItems

optionsKeystoreItems :: Options
optionsKeystoreItems =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("keystoreItemsAlias", "alias")
      , ("keystoreItemsEntryType", "entryType")
      , ("keystoreItemsAlgorithm", "algorithm")
      , ("keystoreItemsFormat", "format")
      , ("keystoreItemsChain", "chain")
      ]


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
  parseJSON = genericParseJSON optionsSamlConfigurationInfo
instance ToJSON SamlConfigurationInfo where
  toJSON = genericToJSON optionsSamlConfigurationInfo
instance ToSchema SamlConfigurationInfo where
  declareNamedSchema = Swagger.genericDeclareNamedSchema
    $ Swagger.fromAesonOptions
    $ optionsSamlConfigurationInfo

optionsSamlConfigurationInfo :: Options
optionsSamlConfigurationInfo =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("samlConfigurationInfoPid", "pid")
      , ("samlConfigurationInfoTitle", "title")
      , ("samlConfigurationInfoDescription", "description")
      , ("samlConfigurationInfoBundleUnderscorelocation", "bundle_location")
      , ("samlConfigurationInfoServiceUnderscorelocation", "service_location")
      , ("samlConfigurationInfoProperties", "properties")
      ]


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
  parseJSON = genericParseJSON optionsSamlConfigurationProperties
instance ToJSON SamlConfigurationProperties where
  toJSON = genericToJSON optionsSamlConfigurationProperties
instance ToSchema SamlConfigurationProperties where
  declareNamedSchema = Swagger.genericDeclareNamedSchema
    $ Swagger.fromAesonOptions
    $ optionsSamlConfigurationProperties

optionsSamlConfigurationProperties :: Options
optionsSamlConfigurationProperties =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("samlConfigurationPropertiesPath", "path")
      , ("samlConfigurationPropertiesServicePeriodranking", "service.ranking")
      , ("samlConfigurationPropertiesIdpUrl", "idpUrl")
      , ("samlConfigurationPropertiesIdpCertAlias", "idpCertAlias")
      , ("samlConfigurationPropertiesIdpHttpRedirect", "idpHttpRedirect")
      , ("samlConfigurationPropertiesServiceProviderEntityId", "serviceProviderEntityId")
      , ("samlConfigurationPropertiesAssertionConsumerServiceURL", "assertionConsumerServiceURL")
      , ("samlConfigurationPropertiesSpPrivateKeyAlias", "spPrivateKeyAlias")
      , ("samlConfigurationPropertiesKeyStorePassword", "keyStorePassword")
      , ("samlConfigurationPropertiesDefaultRedirectUrl", "defaultRedirectUrl")
      , ("samlConfigurationPropertiesUserIDAttribute", "userIDAttribute")
      , ("samlConfigurationPropertiesUseEncryption", "useEncryption")
      , ("samlConfigurationPropertiesCreateUser", "createUser")
      , ("samlConfigurationPropertiesAddGroupMemberships", "addGroupMemberships")
      , ("samlConfigurationPropertiesGroupMembershipAttribute", "groupMembershipAttribute")
      , ("samlConfigurationPropertiesDefaultGroups", "defaultGroups")
      , ("samlConfigurationPropertiesNameIdFormat", "nameIdFormat")
      , ("samlConfigurationPropertiesSynchronizeAttributes", "synchronizeAttributes")
      , ("samlConfigurationPropertiesHandleLogout", "handleLogout")
      , ("samlConfigurationPropertiesLogoutUrl", "logoutUrl")
      , ("samlConfigurationPropertiesClockTolerance", "clockTolerance")
      , ("samlConfigurationPropertiesDigestMethod", "digestMethod")
      , ("samlConfigurationPropertiesSignatureMethod", "signatureMethod")
      , ("samlConfigurationPropertiesUserIntermediatePath", "userIntermediatePath")
      ]


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
  parseJSON = genericParseJSON optionsSamlConfigurationPropertyItemsArray
instance ToJSON SamlConfigurationPropertyItemsArray where
  toJSON = genericToJSON optionsSamlConfigurationPropertyItemsArray
instance ToSchema SamlConfigurationPropertyItemsArray where
  declareNamedSchema = Swagger.genericDeclareNamedSchema
    $ Swagger.fromAesonOptions
    $ optionsSamlConfigurationPropertyItemsArray

optionsSamlConfigurationPropertyItemsArray :: Options
optionsSamlConfigurationPropertyItemsArray =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("samlConfigurationPropertyItemsArrayName", "name")
      , ("samlConfigurationPropertyItemsArrayOptional", "optional")
      , ("samlConfigurationPropertyItemsArrayIsUnderscoreset", "is_set")
      , ("samlConfigurationPropertyItemsArrayType", "type")
      , ("samlConfigurationPropertyItemsArrayValues", "values")
      , ("samlConfigurationPropertyItemsArrayDescription", "description")
      ]


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
  parseJSON = genericParseJSON optionsSamlConfigurationPropertyItemsBoolean
instance ToJSON SamlConfigurationPropertyItemsBoolean where
  toJSON = genericToJSON optionsSamlConfigurationPropertyItemsBoolean
instance ToSchema SamlConfigurationPropertyItemsBoolean where
  declareNamedSchema = Swagger.genericDeclareNamedSchema
    $ Swagger.fromAesonOptions
    $ optionsSamlConfigurationPropertyItemsBoolean

optionsSamlConfigurationPropertyItemsBoolean :: Options
optionsSamlConfigurationPropertyItemsBoolean =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("samlConfigurationPropertyItemsBooleanName", "name")
      , ("samlConfigurationPropertyItemsBooleanOptional", "optional")
      , ("samlConfigurationPropertyItemsBooleanIsUnderscoreset", "is_set")
      , ("samlConfigurationPropertyItemsBooleanType", "type")
      , ("samlConfigurationPropertyItemsBooleanValue", "value")
      , ("samlConfigurationPropertyItemsBooleanDescription", "description")
      ]


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
  parseJSON = genericParseJSON optionsSamlConfigurationPropertyItemsLong
instance ToJSON SamlConfigurationPropertyItemsLong where
  toJSON = genericToJSON optionsSamlConfigurationPropertyItemsLong
instance ToSchema SamlConfigurationPropertyItemsLong where
  declareNamedSchema = Swagger.genericDeclareNamedSchema
    $ Swagger.fromAesonOptions
    $ optionsSamlConfigurationPropertyItemsLong

optionsSamlConfigurationPropertyItemsLong :: Options
optionsSamlConfigurationPropertyItemsLong =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("samlConfigurationPropertyItemsLongName", "name")
      , ("samlConfigurationPropertyItemsLongOptional", "optional")
      , ("samlConfigurationPropertyItemsLongIsUnderscoreset", "is_set")
      , ("samlConfigurationPropertyItemsLongType", "type")
      , ("samlConfigurationPropertyItemsLongValue", "value")
      , ("samlConfigurationPropertyItemsLongDescription", "description")
      ]


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
  parseJSON = genericParseJSON optionsSamlConfigurationPropertyItemsString
instance ToJSON SamlConfigurationPropertyItemsString where
  toJSON = genericToJSON optionsSamlConfigurationPropertyItemsString
instance ToSchema SamlConfigurationPropertyItemsString where
  declareNamedSchema = Swagger.genericDeclareNamedSchema
    $ Swagger.fromAesonOptions
    $ optionsSamlConfigurationPropertyItemsString

optionsSamlConfigurationPropertyItemsString :: Options
optionsSamlConfigurationPropertyItemsString =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("samlConfigurationPropertyItemsStringName", "name")
      , ("samlConfigurationPropertyItemsStringOptional", "optional")
      , ("samlConfigurationPropertyItemsStringIsUnderscoreset", "is_set")
      , ("samlConfigurationPropertyItemsStringType", "type")
      , ("samlConfigurationPropertyItemsStringValue", "value")
      , ("samlConfigurationPropertyItemsStringDescription", "description")
      ]


-- | 
data TruststoreInfo = TruststoreInfo
  { truststoreInfoAliases :: Maybe [TruststoreItems] -- ^ 
  , truststoreInfoExists :: Maybe Bool -- ^ False if truststore don't exist
  } deriving (Show, Eq, Generic, Data)

instance FromJSON TruststoreInfo where
  parseJSON = genericParseJSON optionsTruststoreInfo
instance ToJSON TruststoreInfo where
  toJSON = genericToJSON optionsTruststoreInfo
instance ToSchema TruststoreInfo where
  declareNamedSchema = Swagger.genericDeclareNamedSchema
    $ Swagger.fromAesonOptions
    $ optionsTruststoreInfo

optionsTruststoreInfo :: Options
optionsTruststoreInfo =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("truststoreInfoAliases", "aliases")
      , ("truststoreInfoExists", "exists")
      ]


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
  parseJSON = genericParseJSON optionsTruststoreItems
instance ToJSON TruststoreItems where
  toJSON = genericToJSON optionsTruststoreItems
instance ToSchema TruststoreItems where
  declareNamedSchema = Swagger.genericDeclareNamedSchema
    $ Swagger.fromAesonOptions
    $ optionsTruststoreItems

optionsTruststoreItems :: Options
optionsTruststoreItems =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("truststoreItemsAlias", "alias")
      , ("truststoreItemsEntryType", "entryType")
      , ("truststoreItemsSubject", "subject")
      , ("truststoreItemsIssuer", "issuer")
      , ("truststoreItemsNotBefore", "notBefore")
      , ("truststoreItemsNotAfter", "notAfter")
      , ("truststoreItemsSerialNumber", "serialNumber")
      ]

