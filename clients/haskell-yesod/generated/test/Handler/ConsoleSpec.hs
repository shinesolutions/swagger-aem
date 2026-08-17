{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.ConsoleSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getSystemConsoleStatusProductinfoJsonR" $
        it "returns 501 Not Implemented" $ do
            get SystemConsoleStatusProductinfoJsonR
            statusIs 501

    describe "getSystemConsoleBundles{Name}JsonR" $
        it "returns 501 Not Implemented" $ do
            get $ SystemConsoleBundles{Name}JsonR "name_example"
            statusIs 501

    describe "getSystemConsoleConfigMgrR" $
        it "returns 501 Not Implemented" $ do
            get SystemConsoleConfigMgrR
            statusIs 501

    describe "postSystemConsoleBundlesByTextR" $
        it "returns 501 Not Implemented" $ do
            post $ SystemConsoleBundlesByTextR "name_example"
            statusIs 501

    describe "postSystemConsoleJmxComAdobeGranite:type&#x3D;RepositoryOpByTextR" $
        it "returns 501 Not Implemented" $ do
            post $ SystemConsoleJmxComAdobeGranite:type&#x3D;RepositoryOpByTextR "action_example"
            statusIs 501

    describe "postSystemConsoleConfigMgrComAdobeGraniteAuthSamlSamlAuthenticationHandlerR" $
        it "returns 501 Not Implemented" $ do
            post SystemConsoleConfigMgrComAdobeGraniteAuthSamlSamlAuthenticationHandlerR
            statusIs 501
