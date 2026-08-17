{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.CustomSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getSystemHealthR" $
        it "returns 501 Not Implemented" $ do
            get SystemHealthR
            statusIs 501

    describe "postAppsSystemConfigComShinesolutionsHealthcheckHcImplActiveBundleHealthCheckR" $
        it "returns 501 Not Implemented" $ do
            post AppsSystemConfigComShinesolutionsHealthcheckHcImplActiveBundleHealthCheckR
            statusIs 501

    describe "postAppsSystemConfigComShinesolutionsAemPasswordresetActivatorR" $
        it "returns 501 Not Implemented" $ do
            post AppsSystemConfigComShinesolutionsAemPasswordresetActivatorR
            statusIs 501
