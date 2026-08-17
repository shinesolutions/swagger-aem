{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.GraniteSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "postLibsGraniteSecurityPostSslSetupHtmlR" $
        it "returns 501 Not Implemented" $ do
            post LibsGraniteSecurityPostSslSetupHtmlR
            statusIs 501
