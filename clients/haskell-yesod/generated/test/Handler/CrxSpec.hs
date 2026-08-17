{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.CrxSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getCrxServerCrxDefaultJcr:root1JsonR" $
        it "returns 501 Not Implemented" $ do
            get CrxServerCrxDefaultJcr:root1JsonR
            statusIs 501

    describe "getCrxPackmgrInstallstatusJspR" $
        it "returns 501 Not Implemented" $ do
            get CrxPackmgrInstallstatusJspR
            statusIs 501

    describe "getCrxPackmgrServiceScriptHtmlR" $
        it "returns 501 Not Implemented" $ do
            get CrxPackmgrServiceScriptHtmlR
            statusIs 501

    describe "postCrxPackmgrServiceJspR" $
        it "returns 501 Not Implemented" $ do
            post CrxPackmgrServiceJspR
            statusIs 501

    describe "postCrxPackmgrServiceJsonByTextR" $
        it "returns 501 Not Implemented" $ do
            post $ CrxPackmgrServiceJsonByTextR "path_example"
            statusIs 501

    describe "postCrxPackmgrUpdateJspR" $
        it "returns 501 Not Implemented" $ do
            post CrxPackmgrUpdateJspR
            statusIs 501

    describe "postCrxExplorerUiSetpasswordJspR" $
        it "returns 501 Not Implemented" $ do
            post CrxExplorerUiSetpasswordJspR
            statusIs 501
