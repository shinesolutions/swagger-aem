{-# LANGUAGE DataKinds #-}
{-# LANGUAGE DeriveGeneric #-}
{-# LANGUAGE DeriveTraversable #-}
{-# LANGUAGE FlexibleContexts #-}
{-# LANGUAGE FlexibleInstances #-}
{-# LANGUAGE GeneralizedNewtypeDeriving #-}
{-# LANGUAGE OverloadedStrings #-}
{-# LANGUAGE RecordWildCards #-}
{-# LANGUAGE TypeFamilies #-}
{-# LANGUAGE TypeOperators #-}
{-# LANGUAGE ViewPatterns #-}
{-# OPTIONS_GHC
-fno-warn-unused-binds -fno-warn-unused-imports -fcontext-stack=328 #-}

module AdobeExperienceManager(AEM).API
  -- * Client and Server
  ( ServerConfig(..)
  , AdobeExperienceManager(AEM)Backend
  , createAdobeExperienceManager(AEM)Client
  , runAdobeExperienceManager(AEM)Server
  , runAdobeExperienceManager(AEM)Client
  , runAdobeExperienceManager(AEM)ClientWithManager
  , AdobeExperienceManager(AEM)Client
  -- ** Servant
  , AdobeExperienceManager(AEM)API
  ) where

import AdobeExperienceManager(AEM).Types

import Control.Monad.Except (ExceptT)
import Control.Monad.IO.Class
import Data.Aeson (Value)
import Data.Coerce (coerce)
import Data.Function ((&))
import qualified Data.Map as Map
import Data.Monoid ((<>))
import Data.Proxy (Proxy(..))
import Data.Text (Text)
import qualified Data.Text as T
import GHC.Exts (IsString(..))
import GHC.Generics (Generic)
import Network.HTTP.Client (Manager, defaultManagerSettings, newManager)
import Network.HTTP.Types.Method (methodOptions)
import qualified Network.Wai.Handler.Warp as Warp
import Servant (ServantErr, serve)
import Servant.API
import Servant.API.Verbs (StdMethod(..), Verb)
import Servant.Client (Scheme(Http), ServantError, client)
import Servant.Common.BaseUrl (BaseUrl(..))
import Web.HttpApiData



data FormPostPackageServiceJson = FormPostPackageServiceJson
  { postPackageServiceJsonPackage :: FilePath
  } deriving (Show, Eq, Generic)

instance FromFormUrlEncoded FormPostPackageServiceJson where
  fromFormUrlEncoded inputs = FormPostPackageServiceJson <$> lookupEither "package" inputs

instance ToFormUrlEncoded FormPostPackageServiceJson where
  toFormUrlEncoded value =
    [ ("package", toQueryParam $ postPackageServiceJsonPackage value)
    ]
data FormPostAuthorizableKeystore = FormPostAuthorizableKeystore
  { postAuthorizableKeystoreCertChain :: FilePath
  , postAuthorizableKeystorePk :: FilePath
  , postAuthorizableKeystoreKeyStore :: FilePath
  } deriving (Show, Eq, Generic)

instance FromFormUrlEncoded FormPostAuthorizableKeystore where
  fromFormUrlEncoded inputs = FormPostAuthorizableKeystore <$> lookupEither "cert-chain" inputs <*> lookupEither "pk" inputs <*> lookupEither "keyStore" inputs

instance ToFormUrlEncoded FormPostAuthorizableKeystore where
  toFormUrlEncoded value =
    [ ("cert-chain", toQueryParam $ postAuthorizableKeystoreCertChain value)
    , ("pk", toQueryParam $ postAuthorizableKeystorePk value)
    , ("keyStore", toQueryParam $ postAuthorizableKeystoreKeyStore value)
    ]
data FormPostNode = FormPostNode
  { postNodeFile :: FilePath
  } deriving (Show, Eq, Generic)

instance FromFormUrlEncoded FormPostNode where
  fromFormUrlEncoded inputs = FormPostNode <$> lookupEither "file" inputs

instance ToFormUrlEncoded FormPostNode where
  toFormUrlEncoded value =
    [ ("file", toQueryParam $ postNodeFile value)
    ]
data FormPostTruststore = FormPostTruststore
  { postTruststoreCertificate :: FilePath
  } deriving (Show, Eq, Generic)

instance FromFormUrlEncoded FormPostTruststore where
  fromFormUrlEncoded inputs = FormPostTruststore <$> lookupEither "certificate" inputs

instance ToFormUrlEncoded FormPostTruststore where
  toFormUrlEncoded value =
    [ ("certificate", toQueryParam $ postTruststoreCertificate value)
    ]
data FormPostTruststorePKCS12 = FormPostTruststorePKCS12
  { postTruststorePKCS12TruststoreP12 :: FilePath
  } deriving (Show, Eq, Generic)

instance FromFormUrlEncoded FormPostTruststorePKCS12 where
  fromFormUrlEncoded inputs = FormPostTruststorePKCS12 <$> lookupEither "truststore.p12" inputs

instance ToFormUrlEncoded FormPostTruststorePKCS12 where
  toFormUrlEncoded value =
    [ ("truststore.p12", toQueryParam $ postTruststorePKCS12TruststoreP12 value)
    ]

-- For the form data code generation.
lookupEither :: FromHttpApiData b => Text -> [(Text, Text)] -> Either String b
lookupEither key assocs =
  case lookup key assocs of
    Nothing -> Left $ "Could not find parameter " <> (T.unpack key) <> " in form data"
    Just value ->
      case parseQueryParam value of
        Left result -> Left $ T.unpack result
        Right result -> Right $ result

-- | Servant type-level API, generated from the OpenAPI spec for AdobeExperienceManager(AEM).
type AdobeExperienceManager(AEM)API
    =    "system" :> "console" :> "status-productinfo.json" :> Verb 'GET 200 '[JSON] [Text] -- 'getAemProductInfo' route
    :<|> "system" :> "console" :> "configMgr" :> Verb 'GET 200 '[JSON] Text -- 'getConfigMgr' route
    :<|> "system" :> "console" :> "bundles" :> Capture "name" Text :> QueryParam "action" Text :> Verb 'POST 200 '[JSON] () -- 'postBundle' route
    :<|> "system" :> "console" :> "jmx" :> "com.adobe.granite:type=Repository" :> "op" :> Capture "action" Text :> Verb 'POST 200 '[JSON] () -- 'postJmxRepository' route
    :<|> "system" :> "console" :> "configMgr" :> "com.adobe.granite.auth.saml.SamlAuthenticationHandler" :> QueryParam "post" Bool :> QueryParam "apply" Bool :> QueryParam "delete" Bool :> QueryParam "action" Text :> QueryParam "$location" Text :> QueryParam "path" (QueryList 'MultiParamArray (Text)) :> QueryParam "service.ranking" Int :> QueryParam "idpUrl" Text :> QueryParam "idpCertAlias" Text :> QueryParam "idpHttpRedirect" Bool :> QueryParam "serviceProviderEntityId" Text :> QueryParam "assertionConsumerServiceURL" Text :> QueryParam "spPrivateKeyAlias" Text :> QueryParam "keyStorePassword" Text :> QueryParam "defaultRedirectUrl" Text :> QueryParam "userIDAttribute" Text :> QueryParam "useEncryption" Bool :> QueryParam "createUser" Bool :> QueryParam "addGroupMemberships" Bool :> QueryParam "groupMembershipAttribute" Text :> QueryParam "defaultGroups" (QueryList 'MultiParamArray (Text)) :> QueryParam "nameIdFormat" Text :> QueryParam "synchronizeAttributes" (QueryList 'MultiParamArray (Text)) :> QueryParam "handleLogout" Bool :> QueryParam "logoutUrl" Text :> QueryParam "clockTolerance" Int :> QueryParam "digestMethod" Text :> QueryParam "signatureMethod" Text :> QueryParam "userIntermediatePath" Text :> QueryParam "propertylist" (QueryList 'CommaSeparated (Text)) :> Verb 'POST 200 '[JSON] SamlConfigurationInfo -- 'postSamlConfiguration' route
    :<|> "libs" :> "granite" :> "core" :> "content" :> "login.html" :> Verb 'GET 200 '[JSON] Text -- 'getLoginPage' route
    :<|> ".cqactions.html" :> QueryParam "authorizableId" Text :> QueryParam "changelog" Text :> Verb 'POST 200 '[JSON] () -- 'postCqActions' route
    :<|> "crx" :> "server" :> "crx.default" :> "jcr:root" :> ".1.json" :> Verb 'GET 200 '[JSON] Text -- 'getCrxdeStatus' route
    :<|> "crx" :> "packmgr" :> "installstatus.jsp" :> Verb 'GET 200 '[JSON] InstallStatus -- 'getInstallStatus' route
    :<|> "crx" :> "packmgr" :> "service" :> "script.html" :> Verb 'GET 200 '[JSON] () -- 'getPackageManagerServlet' route
    :<|> "crx" :> "packmgr" :> "service.jsp" :> QueryParam "cmd" Text :> Verb 'POST 200 '[JSON] Text -- 'postPackageService' route
    :<|> "crx" :> "packmgr" :> "service" :> ".json" :> Capture "path" Text :> QueryParam "cmd" Text :> QueryParam "groupName" Text :> QueryParam "packageName" Text :> QueryParam "packageVersion" Text :> QueryParam "_charset_" Text :> QueryParam "force" Bool :> QueryParam "recursive" Bool :> ReqBody '[FormUrlEncoded] FormPostPackageServiceJson :> Verb 'POST 200 '[JSON] Text -- 'postPackageServiceJson' route
    :<|> "crx" :> "packmgr" :> "update.jsp" :> QueryParam "groupName" Text :> QueryParam "packageName" Text :> QueryParam "version" Text :> QueryParam "path" Text :> QueryParam "filter" Text :> QueryParam "_charset_" Text :> Verb 'POST 200 '[JSON] Text -- 'postPackageUpdate' route
    :<|> "crx" :> "explorer" :> "ui" :> "setpassword.jsp" :> QueryParam "old" Text :> QueryParam "plain" Text :> QueryParam "verify" Text :> Verb 'POST 200 '[JSON] Text -- 'postSetPassword' route
    :<|> "system" :> "health" :> QueryParam "tags" Text :> QueryParam "combineTagsOr" Bool :> Verb 'GET 200 '[JSON] Text -- 'getAemHealthCheck' route
    :<|> "apps" :> "system" :> "config" :> "com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck" :> QueryParam "bundles.ignored" (QueryList 'MultiParamArray (Text)) :> QueryParam "bundles.ignored@TypeHint" Text :> Verb 'POST 200 '[JSON] () -- 'postConfigAemHealthCheckServlet' route
    :<|> "apps" :> "system" :> "config" :> "com.shinesolutions.aem.passwordreset.Activator" :> QueryParam "pwdreset.authorizables" (QueryList 'MultiParamArray (Text)) :> QueryParam "pwdreset.authorizables@TypeHint" Text :> Verb 'POST 200 '[JSON] () -- 'postConfigAemPasswordReset' route
    :<|> "etc" :> "replication" :> "agents.{runmode}" :> Capture "name" Text :> Verb 'DELETE 200 '[JSON] () -- 'deleteAgent' route
    :<|> Capture "path" Text :> Capture "name" Text :> Verb 'DELETE 200 '[JSON] () -- 'deleteNode' route
    :<|> "etc" :> "replication" :> "agents.{runmode}" :> Capture "name" Text :> Verb 'GET 200 '[JSON] () -- 'getAgent' route
    :<|> "etc" :> "replication" :> "agents.{runmode}.-1.json" :> Verb 'GET 200 '[JSON] Text -- 'getAgents' route
    :<|> Capture "intermediatePath" Text :> "{authorizableId}.ks.json" :> Verb 'GET 200 '[JSON] KeystoreInfo -- 'getAuthorizableKeystore' route
    :<|> Capture "intermediatePath" Text :> Capture "authorizableId" Text :> "keystore" :> "store.p12" :> Verb 'GET 200 '[JSON] FilePath -- 'getKeystore' route
    :<|> Capture "path" Text :> Capture "name" Text :> Verb 'GET 200 '[JSON] () -- 'getNode' route
    :<|> "etc" :> "packages" :> Capture "group" Text :> "{name}-{version}.zip" :> Verb 'GET 200 '[JSON] FilePath -- 'getPackage' route
    :<|> "etc" :> "packages" :> Capture "group" Text :> "{name}-{version}.zip" :> "jcr:content" :> "vlt:definition" :> "filter.tidy.2.json" :> Verb 'GET 200 '[JSON] Text -- 'getPackageFilter' route
    :<|> "bin" :> "querybuilder.json" :> QueryParam "path" Text :> QueryParam "p.limit" Double :> QueryParam "1_property" Text :> QueryParam "1_property.value" Text :> Verb 'GET 200 '[JSON] Text -- 'getQuery' route
    :<|> "etc" :> "truststore" :> "truststore.p12" :> Verb 'GET 200 '[JSON] FilePath -- 'getTruststore' route
    :<|> "libs" :> "granite" :> "security" :> "truststore.json" :> Verb 'GET 200 '[JSON] TruststoreInfo -- 'getTruststoreInfo' route
    :<|> "etc" :> "replication" :> "agents.{runmode}" :> Capture "name" Text :> QueryParam "jcr:content/cq:distribute" Bool :> QueryParam "jcr:content/cq:distribute@TypeHint" Text :> QueryParam "jcr:content/cq:name" Text :> QueryParam "jcr:content/cq:template" Text :> QueryParam "jcr:content/enabled" Bool :> QueryParam "jcr:content/jcr:description" Text :> QueryParam "jcr:content/jcr:lastModified" Text :> QueryParam "jcr:content/jcr:lastModifiedBy" Text :> QueryParam "jcr:content/jcr:mixinTypes" Text :> QueryParam "jcr:content/jcr:title" Text :> QueryParam "jcr:content/logLevel" Text :> QueryParam "jcr:content/noStatusUpdate" Bool :> QueryParam "jcr:content/noVersioning" Bool :> QueryParam "jcr:content/protocolConnectTimeout" Double :> QueryParam "jcr:content/protocolHTTPConnectionClosed" Bool :> QueryParam "jcr:content/protocolHTTPExpired" Text :> QueryParam "jcr:content/protocolHTTPHeaders" (QueryList 'MultiParamArray (Text)) :> QueryParam "jcr:content/protocolHTTPHeaders@TypeHint" Text :> QueryParam "jcr:content/protocolHTTPMethod" Text :> QueryParam "jcr:content/protocolHTTPSRelaxed" Bool :> QueryParam "jcr:content/protocolInterface" Text :> QueryParam "jcr:content/protocolSocketTimeout" Double :> QueryParam "jcr:content/protocolVersion" Text :> QueryParam "jcr:content/proxyNTLMDomain" Text :> QueryParam "jcr:content/proxyNTLMHost" Text :> QueryParam "jcr:content/proxyHost" Text :> QueryParam "jcr:content/proxyPassword" Text :> QueryParam "jcr:content/proxyPort" Double :> QueryParam "jcr:content/proxyUser" Text :> QueryParam "jcr:content/queueBatchMaxSize" Double :> QueryParam "jcr:content/queueBatchMode" Text :> QueryParam "jcr:content/queueBatchWaitTime" Double :> QueryParam "jcr:content/retryDelay" Text :> QueryParam "jcr:content/reverseReplication" Bool :> QueryParam "jcr:content/serializationType" Text :> QueryParam "jcr:content/sling:resourceType" Text :> QueryParam "jcr:content/ssl" Text :> QueryParam "jcr:content/transportNTLMDomain" Text :> QueryParam "jcr:content/transportNTLMHost" Text :> QueryParam "jcr:content/transportPassword" Text :> QueryParam "jcr:content/transportUri" Text :> QueryParam "jcr:content/transportUser" Text :> QueryParam "jcr:content/triggerDistribute" Bool :> QueryParam "jcr:content/triggerModified" Bool :> QueryParam "jcr:content/triggerOnOffTime" Bool :> QueryParam "jcr:content/triggerReceive" Bool :> QueryParam "jcr:content/triggerSpecific" Bool :> QueryParam "jcr:content/userId" Text :> QueryParam "jcr:primaryType" Text :> QueryParam ":operation" Text :> Verb 'POST 200 '[JSON] () -- 'postAgent' route
    :<|> Capture "intermediatePath" Text :> "{authorizableId}.ks.html" :> QueryParam ":operation" Text :> QueryParam "currentPassword" Text :> QueryParam "newPassword" Text :> QueryParam "rePassword" Text :> QueryParam "keyPassword" Text :> QueryParam "keyStorePass" Text :> QueryParam "alias" Text :> QueryParam "newAlias" Text :> QueryParam "removeAlias" Text :> ReqBody '[FormUrlEncoded] FormPostAuthorizableKeystore :> Verb 'POST 200 '[JSON] KeystoreInfo -- 'postAuthorizableKeystore' route
    :<|> "libs" :> "granite" :> "security" :> "post" :> "authorizables" :> QueryParam "authorizableId" Text :> QueryParam "intermediatePath" Text :> QueryParam "createUser" Text :> QueryParam "createGroup" Text :> QueryParam "rep:password" Text :> QueryParam "profile/givenName" Text :> Verb 'POST 200 '[JSON] Text -- 'postAuthorizables' route
    :<|> "apps" :> "system" :> "config" :> "com.adobe.granite.auth.saml.SamlAuthenticationHandler.config" :> QueryParam "keyStorePassword" Text :> QueryParam "keyStorePassword@TypeHint" Text :> QueryParam "service.ranking" Int :> QueryParam "service.ranking@TypeHint" Text :> QueryParam "idpHttpRedirect" Bool :> QueryParam "idpHttpRedirect@TypeHint" Text :> QueryParam "createUser" Bool :> QueryParam "createUser@TypeHint" Text :> QueryParam "defaultRedirectUrl" Text :> QueryParam "defaultRedirectUrl@TypeHint" Text :> QueryParam "userIDAttribute" Text :> QueryParam "userIDAttribute@TypeHint" Text :> QueryParam "defaultGroups" (QueryList 'MultiParamArray (Text)) :> QueryParam "defaultGroups@TypeHint" Text :> QueryParam "idpCertAlias" Text :> QueryParam "idpCertAlias@TypeHint" Text :> QueryParam "addGroupMemberships" Bool :> QueryParam "addGroupMemberships@TypeHint" Text :> QueryParam "path" (QueryList 'MultiParamArray (Text)) :> QueryParam "path@TypeHint" Text :> QueryParam "synchronizeAttributes" (QueryList 'MultiParamArray (Text)) :> QueryParam "synchronizeAttributes@TypeHint" Text :> QueryParam "clockTolerance" Int :> QueryParam "clockTolerance@TypeHint" Text :> QueryParam "groupMembershipAttribute" Text :> QueryParam "groupMembershipAttribute@TypeHint" Text :> QueryParam "idpUrl" Text :> QueryParam "idpUrl@TypeHint" Text :> QueryParam "logoutUrl" Text :> QueryParam "logoutUrl@TypeHint" Text :> QueryParam "serviceProviderEntityId" Text :> QueryParam "serviceProviderEntityId@TypeHint" Text :> QueryParam "assertionConsumerServiceURL" Text :> QueryParam "assertionConsumerServiceURL@TypeHint" Text :> QueryParam "handleLogout" Bool :> QueryParam "handleLogout@TypeHint" Text :> QueryParam "spPrivateKeyAlias" Text :> QueryParam "spPrivateKeyAlias@TypeHint" Text :> QueryParam "useEncryption" Bool :> QueryParam "useEncryption@TypeHint" Text :> QueryParam "nameIdFormat" Text :> QueryParam "nameIdFormat@TypeHint" Text :> QueryParam "digestMethod" Text :> QueryParam "digestMethod@TypeHint" Text :> QueryParam "signatureMethod" Text :> QueryParam "signatureMethod@TypeHint" Text :> QueryParam "userIntermediatePath" Text :> QueryParam "userIntermediatePath@TypeHint" Text :> Verb 'POST 200 '[JSON] () -- 'postConfigAdobeGraniteSamlAuthenticationHandler' route
    :<|> "apps" :> "system" :> "config" :> "org.apache.felix.http" :> QueryParam "org.apache.felix.https.nio" Bool :> QueryParam "org.apache.felix.https.nio@TypeHint" Text :> QueryParam "org.apache.felix.https.keystore" Text :> QueryParam "org.apache.felix.https.keystore@TypeHint" Text :> QueryParam "org.apache.felix.https.keystore.password" Text :> QueryParam "org.apache.felix.https.keystore.password@TypeHint" Text :> QueryParam "org.apache.felix.https.keystore.key" Text :> QueryParam "org.apache.felix.https.keystore.key@TypeHint" Text :> QueryParam "org.apache.felix.https.keystore.key.password" Text :> QueryParam "org.apache.felix.https.keystore.key.password@TypeHint" Text :> QueryParam "org.apache.felix.https.truststore" Text :> QueryParam "org.apache.felix.https.truststore@TypeHint" Text :> QueryParam "org.apache.felix.https.truststore.password" Text :> QueryParam "org.apache.felix.https.truststore.password@TypeHint" Text :> QueryParam "org.apache.felix.https.clientcertificate" Text :> QueryParam "org.apache.felix.https.clientcertificate@TypeHint" Text :> QueryParam "org.apache.felix.https.enable" Bool :> QueryParam "org.apache.felix.https.enable@TypeHint" Text :> QueryParam "org.osgi.service.http.port.secure" Text :> QueryParam "org.osgi.service.http.port.secure@TypeHint" Text :> Verb 'POST 200 '[JSON] () -- 'postConfigApacheFelixJettyBasedHttpService' route
    :<|> "apps" :> "system" :> "config" :> "org.apache.http.proxyconfigurator.config" :> QueryParam "proxy.host" Text :> QueryParam "proxy.host@TypeHint" Text :> QueryParam "proxy.port" Int :> QueryParam "proxy.port@TypeHint" Text :> QueryParam "proxy.exceptions" (QueryList 'MultiParamArray (Text)) :> QueryParam "proxy.exceptions@TypeHint" Text :> QueryParam "proxy.enabled" Bool :> QueryParam "proxy.enabled@TypeHint" Text :> QueryParam "proxy.user" Text :> QueryParam "proxy.user@TypeHint" Text :> QueryParam "proxy.password" Text :> QueryParam "proxy.password@TypeHint" Text :> Verb 'POST 200 '[JSON] () -- 'postConfigApacheHttpComponentsProxyConfiguration' route
    :<|> "apps" :> "system" :> "config" :> "org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet" :> QueryParam "alias" Text :> QueryParam "alias@TypeHint" Text :> QueryParam "dav.create-absolute-uri" Bool :> QueryParam "dav.create-absolute-uri@TypeHint" Text :> Verb 'POST 200 '[JSON] () -- 'postConfigApacheSlingDavExServlet' route
    :<|> "apps" :> "system" :> "config" :> "org.apache.sling.servlets.get.DefaultGetServlet" :> QueryParam "json.maximumresults" Text :> QueryParam "json.maximumresults@TypeHint" Text :> QueryParam "enable.html" Bool :> QueryParam "enable.html@TypeHint" Text :> QueryParam "enable.txt" Bool :> QueryParam "enable.txt@TypeHint" Text :> QueryParam "enable.xml" Bool :> QueryParam "enable.xml@TypeHint" Text :> Verb 'POST 200 '[JSON] () -- 'postConfigApacheSlingGetServlet' route
    :<|> "apps" :> "system" :> "config" :> "org.apache.sling.security.impl.ReferrerFilter" :> QueryParam "allow.empty" Bool :> QueryParam "allow.empty@TypeHint" Text :> QueryParam "allow.hosts" Text :> QueryParam "allow.hosts@TypeHint" Text :> QueryParam "allow.hosts.regexp" Text :> QueryParam "allow.hosts.regexp@TypeHint" Text :> QueryParam "filter.methods" Text :> QueryParam "filter.methods@TypeHint" Text :> Verb 'POST 200 '[JSON] () -- 'postConfigApacheSlingReferrerFilter' route
    :<|> Capture "path" Text :> Capture "name" Text :> QueryParam ":operation" Text :> QueryParam "deleteAuthorizable" Text :> ReqBody '[FormUrlEncoded] FormPostNode :> Verb 'POST 200 '[JSON] () -- 'postNode' route
    :<|> Capture "path" Text :> "{name}.rw.html" :> QueryParam "addMembers" Text :> Verb 'POST 200 '[JSON] () -- 'postNodeRw' route
    :<|> Capture "path" Text :> QueryParam "jcr:primaryType" Text :> QueryParam ":name" Text :> Verb 'POST 200 '[JSON] () -- 'postPath' route
    :<|> "bin" :> "querybuilder.json" :> QueryParam "path" Text :> QueryParam "p.limit" Double :> QueryParam "1_property" Text :> QueryParam "1_property.value" Text :> Verb 'POST 200 '[JSON] Text -- 'postQuery' route
    :<|> "etc" :> "replication" :> "treeactivation.html" :> QueryParam "ignoredeactivated" Bool :> QueryParam "onlymodified" Bool :> QueryParam "path" Text :> Verb 'POST 200 '[JSON] () -- 'postTreeActivation' route
    :<|> "libs" :> "granite" :> "security" :> "post" :> "truststore" :> QueryParam ":operation" Text :> QueryParam "newPassword" Text :> QueryParam "rePassword" Text :> QueryParam "keyStoreType" Text :> QueryParam "removeAlias" Text :> ReqBody '[FormUrlEncoded] FormPostTruststore :> Verb 'POST 200 '[JSON] Text -- 'postTruststore' route
    :<|> "etc" :> "truststore" :> ReqBody '[FormUrlEncoded] FormPostTruststorePKCS12 :> Verb 'POST 200 '[JSON] Text -- 'postTruststorePKCS12' route

-- | Server or client configuration, specifying the host and port to query or serve on.
data ServerConfig = ServerConfig
  { configHost :: String  -- ^ Hostname to serve on, e.g. "127.0.0.1"
  , configPort :: Int      -- ^ Port to serve on, e.g. 8080
  } deriving (Eq, Ord, Show, Read)

-- | List of elements parsed from a query.
newtype QueryList (p :: CollectionFormat) a = QueryList
  { fromQueryList :: [a]
  } deriving (Functor, Applicative, Monad, Foldable, Traversable)

-- | Formats in which a list can be encoded into a HTTP path.
data CollectionFormat
  = CommaSeparated -- ^ CSV format for multiple parameters.
  | SpaceSeparated -- ^ Also called "SSV"
  | TabSeparated -- ^ Also called "TSV"
  | PipeSeparated -- ^ `value1|value2|value2`
  | MultiParamArray -- ^ Using multiple GET parameters, e.g. `foo=bar&foo=baz`. Only for GET params.

instance FromHttpApiData a => FromHttpApiData (QueryList 'CommaSeparated a) where
  parseQueryParam = parseSeparatedQueryList ','

instance FromHttpApiData a => FromHttpApiData (QueryList 'TabSeparated a) where
  parseQueryParam = parseSeparatedQueryList '\t'

instance FromHttpApiData a => FromHttpApiData (QueryList 'SpaceSeparated a) where
  parseQueryParam = parseSeparatedQueryList ' '

instance FromHttpApiData a => FromHttpApiData (QueryList 'PipeSeparated a) where
  parseQueryParam = parseSeparatedQueryList '|'

instance FromHttpApiData a => FromHttpApiData (QueryList 'MultiParamArray a) where
  parseQueryParam = error "unimplemented FromHttpApiData for MultiParamArray collection format"

parseSeparatedQueryList :: FromHttpApiData a => Char -> Text -> Either Text (QueryList p a)
parseSeparatedQueryList char = fmap QueryList . mapM parseQueryParam . T.split (== char)

instance ToHttpApiData a => ToHttpApiData (QueryList 'CommaSeparated a) where
  toQueryParam = formatSeparatedQueryList ','

instance ToHttpApiData a => ToHttpApiData (QueryList 'TabSeparated a) where
  toQueryParam = formatSeparatedQueryList '\t'

instance ToHttpApiData a => ToHttpApiData (QueryList 'SpaceSeparated a) where
  toQueryParam = formatSeparatedQueryList ' '

instance ToHttpApiData a => ToHttpApiData (QueryList 'PipeSeparated a) where
  toQueryParam = formatSeparatedQueryList '|'

instance ToHttpApiData a => ToHttpApiData (QueryList 'MultiParamArray a) where
  toQueryParam = error "unimplemented ToHttpApiData for MultiParamArray collection format"

formatSeparatedQueryList :: ToHttpApiData a => Char ->  QueryList p a -> Text
formatSeparatedQueryList char = T.intercalate (T.singleton char) . map toQueryParam . fromQueryList


-- | Backend for AdobeExperienceManager(AEM).
-- The backend can be used both for the client and the server. The client generated from the AdobeExperienceManager(AEM) OpenAPI spec
-- is a backend that executes actions by sending HTTP requests (see @createAdobeExperienceManager(AEM)Client@). Alternatively, provided
-- a backend, the API can be served using @runAdobeExperienceManager(AEM)Server@.
data AdobeExperienceManager(AEM)Backend m = AdobeExperienceManager(AEM)Backend
  { getAemProductInfo :: m [Text]{- ^  -}
  , getConfigMgr :: m Text{- ^  -}
  , postBundle :: Text -> Maybe Text -> m (){- ^  -}
  , postJmxRepository :: Text -> m (){- ^  -}
  , postSamlConfiguration :: Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Text -> Maybe Text -> Maybe [Text] -> Maybe Int -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Text -> Maybe [Text] -> Maybe Text -> Maybe [Text] -> Maybe Bool -> Maybe Text -> Maybe Int -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe [Text] -> m SamlConfigurationInfo{- ^  -}
  , getLoginPage :: m Text{- ^  -}
  , postCqActions :: Maybe Text -> Maybe Text -> m (){- ^  -}
  , getCrxdeStatus :: m Text{- ^  -}
  , getInstallStatus :: m InstallStatus{- ^  -}
  , getPackageManagerServlet :: m (){- ^  -}
  , postPackageService :: Maybe Text -> m Text{- ^  -}
  , postPackageServiceJson :: Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Bool -> FormPostPackageServiceJson -> m Text{- ^  -}
  , postPackageUpdate :: Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> m Text{- ^  -}
  , postSetPassword :: Maybe Text -> Maybe Text -> Maybe Text -> m Text{- ^  -}
  , getAemHealthCheck :: Maybe Text -> Maybe Bool -> m Text{- ^  -}
  , postConfigAemHealthCheckServlet :: Maybe [Text] -> Maybe Text -> m (){- ^  -}
  , postConfigAemPasswordReset :: Maybe [Text] -> Maybe Text -> m (){- ^  -}
  , deleteAgent :: Text -> m (){- ^  -}
  , deleteNode :: Text -> Text -> m (){- ^  -}
  , getAgent :: Text -> m (){- ^  -}
  , getAgents :: m Text{- ^  -}
  , getAuthorizableKeystore :: Text -> m KeystoreInfo{- ^  -}
  , getKeystore :: Text -> Text -> m FilePath{- ^  -}
  , getNode :: Text -> Text -> m (){- ^  -}
  , getPackage :: Text -> m FilePath{- ^  -}
  , getPackageFilter :: Text -> m Text{- ^  -}
  , getQuery :: Maybe Text -> Maybe Double -> Maybe Text -> Maybe Text -> m Text{- ^  -}
  , getTruststore :: m FilePath{- ^  -}
  , getTruststoreInfo :: m TruststoreInfo{- ^  -}
  , postAgent :: Text -> Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Bool -> Maybe Double -> Maybe Bool -> Maybe Text -> Maybe [Text] -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Text -> Maybe Double -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Double -> Maybe Text -> Maybe Double -> Maybe Text -> Maybe Double -> Maybe Text -> Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Text -> m (){- ^  -}
  , postAuthorizableKeystore :: Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> FormPostAuthorizableKeystore -> m KeystoreInfo{- ^  -}
  , postAuthorizables :: Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> m Text{- ^  -}
  , postConfigAdobeGraniteSamlAuthenticationHandler :: Maybe Text -> Maybe Text -> Maybe Int -> Maybe Text -> Maybe Bool -> Maybe Text -> Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe [Text] -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Text -> Maybe [Text] -> Maybe Text -> Maybe [Text] -> Maybe Text -> Maybe Int -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> m (){- ^  -}
  , postConfigApacheFelixJettyBasedHttpService :: Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Text -> m (){- ^  -}
  , postConfigApacheHttpComponentsProxyConfiguration :: Maybe Text -> Maybe Text -> Maybe Int -> Maybe Text -> Maybe [Text] -> Maybe Text -> Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> m (){- ^  -}
  , postConfigApacheSlingDavExServlet :: Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Text -> m (){- ^  -}
  , postConfigApacheSlingGetServlet :: Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Text -> Maybe Bool -> Maybe Text -> Maybe Bool -> Maybe Text -> m (){- ^  -}
  , postConfigApacheSlingReferrerFilter :: Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> m (){- ^  -}
  , postNode :: Text -> Text -> Maybe Text -> Maybe Text -> FormPostNode -> m (){- ^  -}
  , postNodeRw :: Text -> Maybe Text -> m (){- ^  -}
  , postPath :: Text -> Maybe Text -> Maybe Text -> m (){- ^  -}
  , postQuery :: Maybe Text -> Maybe Double -> Maybe Text -> Maybe Text -> m Text{- ^  -}
  , postTreeActivation :: Maybe Bool -> Maybe Bool -> Maybe Text -> m (){- ^  -}
  , postTruststore :: Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> FormPostTruststore -> m Text{- ^  -}
  , postTruststorePKCS12 :: FormPostTruststorePKCS12 -> m Text{- ^  -}
  }

newtype AdobeExperienceManager(AEM)Client a = AdobeExperienceManager(AEM)Client
  { runClient :: Manager -> BaseUrl -> ExceptT ServantError IO a
  } deriving Functor

instance Applicative AdobeExperienceManager(AEM)Client where
  pure x = AdobeExperienceManager(AEM)Client (\_ _ -> pure x)
  (AdobeExperienceManager(AEM)Client f) <*> (AdobeExperienceManager(AEM)Client x) =
    AdobeExperienceManager(AEM)Client (\manager url -> f manager url <*> x manager url)

instance Monad AdobeExperienceManager(AEM)Client where
  (AdobeExperienceManager(AEM)Client a) >>= f =
    AdobeExperienceManager(AEM)Client (\manager url -> do
      value <- a manager url
      runClient (f value) manager url)

instance MonadIO AdobeExperienceManager(AEM)Client where
  liftIO io = AdobeExperienceManager(AEM)Client (\_ _ -> liftIO io)

createAdobeExperienceManager(AEM)Client :: AdobeExperienceManager(AEM)Backend AdobeExperienceManager(AEM)Client
createAdobeExperienceManager(AEM)Client = AdobeExperienceManager(AEM)Backend{..}
  where
    ((coerce -> getAemProductInfo) :<|>
     (coerce -> getConfigMgr) :<|>
     (coerce -> postBundle) :<|>
     (coerce -> postJmxRepository) :<|>
     (coerce -> postSamlConfiguration) :<|>
     (coerce -> getLoginPage) :<|>
     (coerce -> postCqActions) :<|>
     (coerce -> getCrxdeStatus) :<|>
     (coerce -> getInstallStatus) :<|>
     (coerce -> getPackageManagerServlet) :<|>
     (coerce -> postPackageService) :<|>
     (coerce -> postPackageServiceJson) :<|>
     (coerce -> postPackageUpdate) :<|>
     (coerce -> postSetPassword) :<|>
     (coerce -> getAemHealthCheck) :<|>
     (coerce -> postConfigAemHealthCheckServlet) :<|>
     (coerce -> postConfigAemPasswordReset) :<|>
     (coerce -> deleteAgent) :<|>
     (coerce -> deleteNode) :<|>
     (coerce -> getAgent) :<|>
     (coerce -> getAgents) :<|>
     (coerce -> getAuthorizableKeystore) :<|>
     (coerce -> getKeystore) :<|>
     (coerce -> getNode) :<|>
     (coerce -> getPackage) :<|>
     (coerce -> getPackageFilter) :<|>
     (coerce -> getQuery) :<|>
     (coerce -> getTruststore) :<|>
     (coerce -> getTruststoreInfo) :<|>
     (coerce -> postAgent) :<|>
     (coerce -> postAuthorizableKeystore) :<|>
     (coerce -> postAuthorizables) :<|>
     (coerce -> postConfigAdobeGraniteSamlAuthenticationHandler) :<|>
     (coerce -> postConfigApacheFelixJettyBasedHttpService) :<|>
     (coerce -> postConfigApacheHttpComponentsProxyConfiguration) :<|>
     (coerce -> postConfigApacheSlingDavExServlet) :<|>
     (coerce -> postConfigApacheSlingGetServlet) :<|>
     (coerce -> postConfigApacheSlingReferrerFilter) :<|>
     (coerce -> postNode) :<|>
     (coerce -> postNodeRw) :<|>
     (coerce -> postPath) :<|>
     (coerce -> postQuery) :<|>
     (coerce -> postTreeActivation) :<|>
     (coerce -> postTruststore) :<|>
     (coerce -> postTruststorePKCS12)) = client (Proxy :: Proxy AdobeExperienceManager(AEM)API)

-- | Run requests in the AdobeExperienceManager(AEM)Client monad.
runAdobeExperienceManager(AEM)Client :: ServerConfig -> AdobeExperienceManager(AEM)Client a -> ExceptT ServantError IO a
runAdobeExperienceManager(AEM)Client clientConfig cl = do
  manager <- liftIO $ newManager defaultManagerSettings
  runAdobeExperienceManager(AEM)ClientWithManager manager clientConfig cl

-- | Run requests in the AdobeExperienceManager(AEM)Client monad using a custom manager.
runAdobeExperienceManager(AEM)ClientWithManager :: Manager -> ServerConfig -> AdobeExperienceManager(AEM)Client a -> ExceptT ServantError IO a
runAdobeExperienceManager(AEM)ClientWithManager manager clientConfig cl =
  runClient cl manager $ BaseUrl Http (configHost clientConfig) (configPort clientConfig) ""

-- | Run the AdobeExperienceManager(AEM) server at the provided host and port.
runAdobeExperienceManager(AEM)Server :: MonadIO m => ServerConfig -> AdobeExperienceManager(AEM)Backend (ExceptT ServantErr IO)  -> m ()
runAdobeExperienceManager(AEM)Server ServerConfig{..} backend =
  liftIO $ Warp.runSettings warpSettings $ serve (Proxy :: Proxy AdobeExperienceManager(AEM)API) (serverFromBackend backend)
  where
    warpSettings = Warp.defaultSettings & Warp.setPort configPort & Warp.setHost (fromString configHost)
    serverFromBackend AdobeExperienceManager(AEM)Backend{..} =
      (coerce getAemProductInfo :<|>
       coerce getConfigMgr :<|>
       coerce postBundle :<|>
       coerce postJmxRepository :<|>
       coerce postSamlConfiguration :<|>
       coerce getLoginPage :<|>
       coerce postCqActions :<|>
       coerce getCrxdeStatus :<|>
       coerce getInstallStatus :<|>
       coerce getPackageManagerServlet :<|>
       coerce postPackageService :<|>
       coerce postPackageServiceJson :<|>
       coerce postPackageUpdate :<|>
       coerce postSetPassword :<|>
       coerce getAemHealthCheck :<|>
       coerce postConfigAemHealthCheckServlet :<|>
       coerce postConfigAemPasswordReset :<|>
       coerce deleteAgent :<|>
       coerce deleteNode :<|>
       coerce getAgent :<|>
       coerce getAgents :<|>
       coerce getAuthorizableKeystore :<|>
       coerce getKeystore :<|>
       coerce getNode :<|>
       coerce getPackage :<|>
       coerce getPackageFilter :<|>
       coerce getQuery :<|>
       coerce getTruststore :<|>
       coerce getTruststoreInfo :<|>
       coerce postAgent :<|>
       coerce postAuthorizableKeystore :<|>
       coerce postAuthorizables :<|>
       coerce postConfigAdobeGraniteSamlAuthenticationHandler :<|>
       coerce postConfigApacheFelixJettyBasedHttpService :<|>
       coerce postConfigApacheHttpComponentsProxyConfiguration :<|>
       coerce postConfigApacheSlingDavExServlet :<|>
       coerce postConfigApacheSlingGetServlet :<|>
       coerce postConfigApacheSlingReferrerFilter :<|>
       coerce postNode :<|>
       coerce postNodeRw :<|>
       coerce postPath :<|>
       coerce postQuery :<|>
       coerce postTreeActivation :<|>
       coerce postTruststore :<|>
       coerce postTruststorePKCS12)
