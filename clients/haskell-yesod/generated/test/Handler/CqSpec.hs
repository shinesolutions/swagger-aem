{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.CqSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getLibsGraniteCoreContentLoginHtmlR" $
        it "returns 501 Not Implemented" $ do
            get LibsGraniteCoreContentLoginHtmlR
            statusIs 501

    describe "postCqactionsHtmlR" $
        it "returns 501 Not Implemented" $ do
            post CqactionsHtmlR
            statusIs 501
