{-# LANGUAGE ScopedTypeVariables #-}
{-# LANGUAGE OverloadedStrings #-}
{-# LANGUAGE RecordWildCards #-}
{-# LANGUAGE PartialTypeSignatures #-}

module Main where

import Data.Typeable (Proxy(..))
import Test.Hspec
import Test.Hspec.QuickCheck

import PropMime
import Instances ()

import AdobeExperienceManager(AEM).Model
import AdobeExperienceManager(AEM).MimeTypes

main :: IO ()
main =
  hspec $ modifyMaxSize (const 10) $ do
    describe "JSON instances" $ do
      pure ()
      propMimeEq MimeJSON (Proxy :: Proxy BundleData)
      propMimeEq MimeJSON (Proxy :: Proxy BundleDataProp)
      propMimeEq MimeJSON (Proxy :: Proxy BundleInfo)
      propMimeEq MimeJSON (Proxy :: Proxy InstallStatus)
      propMimeEq MimeJSON (Proxy :: Proxy InstallStatusStatus)
      propMimeEq MimeJSON (Proxy :: Proxy KeystoreChainItems)
      propMimeEq MimeJSON (Proxy :: Proxy KeystoreInfo)
      propMimeEq MimeJSON (Proxy :: Proxy KeystoreItems)
      propMimeEq MimeJSON (Proxy :: Proxy SamlConfigurationInfo)
      propMimeEq MimeJSON (Proxy :: Proxy SamlConfigurationProperties)
      propMimeEq MimeJSON (Proxy :: Proxy SamlConfigurationPropertyItemsArray)
      propMimeEq MimeJSON (Proxy :: Proxy SamlConfigurationPropertyItemsBoolean)
      propMimeEq MimeJSON (Proxy :: Proxy SamlConfigurationPropertyItemsLong)
      propMimeEq MimeJSON (Proxy :: Proxy SamlConfigurationPropertyItemsString)
      propMimeEq MimeJSON (Proxy :: Proxy TruststoreInfo)
      propMimeEq MimeJSON (Proxy :: Proxy TruststoreItems)
      
