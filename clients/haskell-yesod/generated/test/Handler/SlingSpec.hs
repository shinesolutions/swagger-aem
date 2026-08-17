{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.SlingSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "deleteEtcReplicationAgents{runmode}ByTextR" $
        it "returns 501 Not Implemented" $ do
            performMethod "DELETE" $ EtcReplicationAgents{runmode}ByTextR "runmode_example" "name_example"
            statusIs 501

    describe "deleteByTextByTextR" $
        it "returns 501 Not Implemented" $ do
            performMethod "DELETE" $ ByTextByTextR "path_example" "name_example"
            statusIs 501

    describe "getEtcReplicationAgents{runmode}ByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ EtcReplicationAgents{runmode}ByTextR "runmode_example" "name_example"
            statusIs 501

    describe "getEtcReplicationAgents{runmode}1JsonR" $
        it "returns 501 Not Implemented" $ do
            get $ EtcReplicationAgents{runmode}1JsonR "runmode_example"
            statusIs 501

    describe "getByText{AuthorizableId}KsJsonR" $
        it "returns 501 Not Implemented" $ do
            get $ ByText{AuthorizableId}KsJsonR "intermediatePath_example" "authorizableId_example"
            statusIs 501

    describe "getByTextByTextKeystoreStoreP12R" $
        it "returns 501 Not Implemented" $ do
            get $ ByTextByTextKeystoreStoreP12R "intermediatePath_example" "authorizableId_example"
            statusIs 501

    describe "getByTextByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ ByTextByTextR "path_example" "name_example"
            statusIs 501

    describe "getEtcPackagesByText{Name}{version}ZipR" $
        it "returns 501 Not Implemented" $ do
            get $ EtcPackagesByText{Name}{version}ZipR "group_example" "name_example" "version_example"
            statusIs 501

    describe "getEtcPackagesByText{Name}{version}ZipJcr:contentVlt:definitionFilterTidy2JsonR" $
        it "returns 501 Not Implemented" $ do
            get $ EtcPackagesByText{Name}{version}ZipJcr:contentVlt:definitionFilterTidy2JsonR "group_example" "name_example" "version_example"
            statusIs 501

    describe "getBinQuerybuilderJsonR" $
        it "returns 501 Not Implemented" $ do
            get BinQuerybuilderJsonR
            statusIs 501

    describe "getEtcTruststoreTruststoreP12R" $
        it "returns 501 Not Implemented" $ do
            get EtcTruststoreTruststoreP12R
            statusIs 501

    describe "getLibsGraniteSecurityTruststoreJsonR" $
        it "returns 501 Not Implemented" $ do
            get LibsGraniteSecurityTruststoreJsonR
            statusIs 501

    describe "postEtcReplicationAgents{runmode}ByTextR" $
        it "returns 501 Not Implemented" $ do
            post $ EtcReplicationAgents{runmode}ByTextR "runmode_example" "name_example"
            statusIs 501

    describe "postByText{AuthorizableId}KsHtmlR" $
        it "returns 501 Not Implemented" $ do
            post $ ByText{AuthorizableId}KsHtmlR "intermediatePath_example" "authorizableId_example"
            statusIs 501

    describe "postLibsGraniteSecurityPostAuthorizablesR" $
        it "returns 501 Not Implemented" $ do
            post LibsGraniteSecurityPostAuthorizablesR
            statusIs 501

    describe "postAppsSystemConfigComAdobeGraniteAuthSamlSamlAuthenticationHandlerConfigR" $
        it "returns 501 Not Implemented" $ do
            post AppsSystemConfigComAdobeGraniteAuthSamlSamlAuthenticationHandlerConfigR
            statusIs 501

    describe "postAppsSystemConfigOrgApacheFelixHttpR" $
        it "returns 501 Not Implemented" $ do
            post AppsSystemConfigOrgApacheFelixHttpR
            statusIs 501

    describe "postAppsSystemConfigOrgApacheHttpProxyconfiguratorConfigR" $
        it "returns 501 Not Implemented" $ do
            post AppsSystemConfigOrgApacheHttpProxyconfiguratorConfigR
            statusIs 501

    describe "postAppsSystemConfigOrgApacheSlingJcrDavexImplServletsSlingDavExServletR" $
        it "returns 501 Not Implemented" $ do
            post AppsSystemConfigOrgApacheSlingJcrDavexImplServletsSlingDavExServletR
            statusIs 501

    describe "postAppsSystemConfigOrgApacheSlingServletsGetDefaultGetServletR" $
        it "returns 501 Not Implemented" $ do
            post AppsSystemConfigOrgApacheSlingServletsGetDefaultGetServletR
            statusIs 501

    describe "postAppsSystemConfigOrgApacheSlingSecurityImplReferrerFilterR" $
        it "returns 501 Not Implemented" $ do
            post AppsSystemConfigOrgApacheSlingSecurityImplReferrerFilterR
            statusIs 501

    describe "postAppsSystemConfigByTextR" $
        it "returns 501 Not Implemented" $ do
            post $ AppsSystemConfigByTextR "configNodeName_example"
            statusIs 501

    describe "postByTextByTextR" $
        it "returns 501 Not Implemented" $ do
            post $ ByTextByTextR "path_example" "name_example"
            statusIs 501

    describe "postByText{Name}RwHtmlR" $
        it "returns 501 Not Implemented" $ do
            post $ ByText{Name}RwHtmlR "path_example" "name_example"
            statusIs 501

    describe "postByTextR" $
        it "returns 501 Not Implemented" $ do
            post $ ByTextR "path_example"
            statusIs 501

    describe "postBinQuerybuilderJsonR" $
        it "returns 501 Not Implemented" $ do
            post BinQuerybuilderJsonR
            statusIs 501

    describe "postLibsReplicationTreeactivationHtmlR" $
        it "returns 501 Not Implemented" $ do
            post LibsReplicationTreeactivationHtmlR
            statusIs 501

    describe "postLibsGraniteSecurityPostTruststoreR" $
        it "returns 501 Not Implemented" $ do
            post LibsGraniteSecurityPostTruststoreR
            statusIs 501

    describe "postEtcTruststoreR" $
        it "returns 501 Not Implemented" $ do
            post EtcTruststoreR
            statusIs 501
