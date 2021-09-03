{-
   Adobe Experience Manager (AEM) API

   Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API

   OpenAPI Version: 3.0.0
   Adobe Experience Manager (AEM) API API version: 3.5.0-pre.0
   Contact: opensource@shinesolutions.com
   Generated by OpenAPI Generator (https://openapi-generator.tech)
-}

{-|
Module : AdobeExperienceManager(AEM).API.Granite
-}

{-# LANGUAGE FlexibleContexts #-}
{-# LANGUAGE FlexibleInstances #-}
{-# LANGUAGE MonoLocalBinds #-}
{-# LANGUAGE MultiParamTypeClasses #-}
{-# LANGUAGE OverloadedStrings #-}
{-# OPTIONS_GHC -fno-warn-name-shadowing -fno-warn-unused-binds -fno-warn-unused-imports #-}

module AdobeExperienceManager(AEM).API.Granite where

import AdobeExperienceManager(AEM).Core
import AdobeExperienceManager(AEM).MimeTypes
import AdobeExperienceManager(AEM).Model as M

import qualified Data.Aeson as A
import qualified Data.ByteString as B
import qualified Data.ByteString.Lazy as BL
import qualified Data.Data as P (Typeable, TypeRep, typeOf, typeRep)
import qualified Data.Foldable as P
import qualified Data.Map as Map
import qualified Data.Maybe as P
import qualified Data.Proxy as P (Proxy(..))
import qualified Data.Set as Set
import qualified Data.String as P
import qualified Data.Text as T
import qualified Data.Text.Encoding as T
import qualified Data.Text.Lazy as TL
import qualified Data.Text.Lazy.Encoding as TL
import qualified Data.Time as TI
import qualified Network.HTTP.Client.MultipartFormData as NH
import qualified Network.HTTP.Media as ME
import qualified Network.HTTP.Types as NH
import qualified Web.FormUrlEncoded as WH
import qualified Web.HttpApiData as WH

import Data.Text (Text)
import GHC.Base ((<|>))

import Prelude ((==),(/=),($), (.),(<$>),(<*>),(>>=),Maybe(..),Bool(..),Char,Double,FilePath,Float,Int,Integer,String,fmap,undefined,mempty,maybe,pure,Monad,Applicative,Functor)
import qualified Prelude as P

-- * Operations


-- ** Granite

-- *** sslSetup

-- | @POST \/libs\/granite\/security\/post\/sslSetup.html@
-- 
-- AuthMethod: 'AuthBasicAemAuth'
-- 
sslSetup 
  :: (Consumes SslSetup MimeMultipartFormData)
  => KeystorePassword -- ^ "keystorePassword"
  -> KeystorePasswordConfirm -- ^ "keystorePasswordConfirm"
  -> TruststorePassword -- ^ "truststorePassword"
  -> TruststorePasswordConfirm -- ^ "truststorePasswordConfirm"
  -> HttpsHostname -- ^ "httpsHostname"
  -> HttpsPort -- ^ "httpsPort"
  -> AdobeExperienceManager(AEM)Request SslSetup MimeMultipartFormData Text MimePlainText
sslSetup (KeystorePassword keystorePassword) (KeystorePasswordConfirm keystorePasswordConfirm) (TruststorePassword truststorePassword) (TruststorePasswordConfirm truststorePasswordConfirm) (HttpsHostname httpsHostname) (HttpsPort httpsPort) =
  _mkRequest "POST" ["/libs/granite/security/post/sslSetup.html"]
    `_hasAuthType` (P.Proxy :: P.Proxy AuthBasicAemAuth)
    `addQuery` toQuery ("keystorePassword", Just keystorePassword)
    `addQuery` toQuery ("keystorePasswordConfirm", Just keystorePasswordConfirm)
    `addQuery` toQuery ("truststorePassword", Just truststorePassword)
    `addQuery` toQuery ("truststorePasswordConfirm", Just truststorePasswordConfirm)
    `addQuery` toQuery ("httpsHostname", Just httpsHostname)
    `addQuery` toQuery ("httpsPort", Just httpsPort)

data SslSetup  
instance HasOptionalParam SslSetup PrivatekeyFile where
  applyOptionalParam req (PrivatekeyFile xs) =
    req `_addMultiFormPart` NH.partFileSource "privatekeyFile" xs
instance HasOptionalParam SslSetup CertificateFile where
  applyOptionalParam req (CertificateFile xs) =
    req `_addMultiFormPart` NH.partFileSource "certificateFile" xs

-- | @multipart/form-data@
instance Consumes SslSetup MimeMultipartFormData

-- | @text/plain@
instance Produces SslSetup MimePlainText
