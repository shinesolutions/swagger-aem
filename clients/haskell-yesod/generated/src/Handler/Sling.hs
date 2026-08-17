{-# LANGUAGE NoImplicitPrelude #-}
{-# OPTIONS_GHC -fno-warn-unused-matches #-}
module Handler.Sling where

import           Import


-- | 
--
-- operationId: deleteAgent
deleteEtcReplicationAgents{runmode}ByTextR :: Text -- ^ 
                                           -> Text -- ^ 
                                           -> Handler Value
deleteEtcReplicationAgents{runmode}ByTextR runmode name = notImplemented

-- | 
--
-- operationId: deleteNode
deleteByTextByTextR :: Text -- ^ 
                    -> Text -- ^ 
                    -> Handler Value
deleteByTextByTextR path name = notImplemented

-- | 
--
-- operationId: getAgent
getEtcReplicationAgents{runmode}ByTextR :: Text -- ^ 
                                        -> Text -- ^ 
                                        -> Handler Value
getEtcReplicationAgents{runmode}ByTextR runmode name = notImplemented

-- | 
--
-- operationId: getAgents
getEtcReplicationAgents{runmode}1JsonR :: Text -- ^ 
                                       -> Handler Value
getEtcReplicationAgents{runmode}1JsonR runmode = notImplemented

-- | 
--
-- operationId: getAuthorizableKeystore
getByText{AuthorizableId}KsJsonR :: Text -- ^ 
                                 -> Text -- ^ 
                                 -> Handler Value
getByText{AuthorizableId}KsJsonR intermediatePath authorizableId = notImplemented

-- | 
--
-- operationId: getKeystore
getByTextByTextKeystoreStoreP12R :: Text -- ^ 
                                 -> Text -- ^ 
                                 -> Handler Value
getByTextByTextKeystoreStoreP12R intermediatePath authorizableId = notImplemented

-- | 
--
-- operationId: getNode
getByTextByTextR :: Text -- ^ 
                 -> Text -- ^ 
                 -> Handler Value
getByTextByTextR path name = notImplemented

-- | 
--
-- operationId: getPackage
getEtcPackagesByText{Name}{version}ZipR :: Text -- ^ 
                                        -> Text -- ^ 
                                        -> Text -- ^ 
                                        -> Handler Value
getEtcPackagesByText{Name}{version}ZipR group name version = notImplemented

-- | 
--
-- operationId: getPackageFilter
getEtcPackagesByText{Name}{version}ZipJcr:contentVlt:definitionFilterTidy2JsonR :: Text -- ^ 
                                                                                -> Text -- ^ 
                                                                                -> Text -- ^ 
                                                                                -> Handler Value
getEtcPackagesByText{Name}{version}ZipJcr:contentVlt:definitionFilterTidy2JsonR group name version = notImplemented

-- | 
--
-- operationId: getQuery
getBinQuerybuilderJsonR :: Handler Value
getBinQuerybuilderJsonR = notImplemented

-- | 
--
-- operationId: getTruststore
getEtcTruststoreTruststoreP12R :: Handler Value
getEtcTruststoreTruststoreP12R = notImplemented

-- | 
--
-- operationId: getTruststoreInfo
getLibsGraniteSecurityTruststoreJsonR :: Handler Value
getLibsGraniteSecurityTruststoreJsonR = notImplemented

-- | 
--
-- operationId: postAgent
postEtcReplicationAgents{runmode}ByTextR :: Text -- ^ 
                                         -> Text -- ^ 
                                         -> Handler Value
postEtcReplicationAgents{runmode}ByTextR runmode name = notImplemented

-- | 
--
-- operationId: postAuthorizableKeystore
postByText{AuthorizableId}KsHtmlR :: Text -- ^ 
                                  -> Text -- ^ 
                                  -> Handler Value
postByText{AuthorizableId}KsHtmlR intermediatePath authorizableId = notImplemented

-- | 
--
-- operationId: postAuthorizables
postLibsGraniteSecurityPostAuthorizablesR :: Handler Value
postLibsGraniteSecurityPostAuthorizablesR = notImplemented

-- | 
--
-- operationId: postConfigAdobeGraniteSamlAuthenticationHandler
postAppsSystemConfigComAdobeGraniteAuthSamlSamlAuthenticationHandlerConfigR :: Handler Value
postAppsSystemConfigComAdobeGraniteAuthSamlSamlAuthenticationHandlerConfigR = notImplemented

-- | 
--
-- operationId: postConfigApacheFelixJettyBasedHttpService
postAppsSystemConfigOrgApacheFelixHttpR :: Handler Value
postAppsSystemConfigOrgApacheFelixHttpR = notImplemented

-- | 
--
-- operationId: postConfigApacheHttpComponentsProxyConfiguration
postAppsSystemConfigOrgApacheHttpProxyconfiguratorConfigR :: Handler Value
postAppsSystemConfigOrgApacheHttpProxyconfiguratorConfigR = notImplemented

-- | 
--
-- operationId: postConfigApacheSlingDavExServlet
postAppsSystemConfigOrgApacheSlingJcrDavexImplServletsSlingDavExServletR :: Handler Value
postAppsSystemConfigOrgApacheSlingJcrDavexImplServletsSlingDavExServletR = notImplemented

-- | 
--
-- operationId: postConfigApacheSlingGetServlet
postAppsSystemConfigOrgApacheSlingServletsGetDefaultGetServletR :: Handler Value
postAppsSystemConfigOrgApacheSlingServletsGetDefaultGetServletR = notImplemented

-- | 
--
-- operationId: postConfigApacheSlingReferrerFilter
postAppsSystemConfigOrgApacheSlingSecurityImplReferrerFilterR :: Handler Value
postAppsSystemConfigOrgApacheSlingSecurityImplReferrerFilterR = notImplemented

-- | 
--
-- operationId: postConfigProperty
postAppsSystemConfigByTextR :: Text -- ^ 
                            -> Handler Value
postAppsSystemConfigByTextR configNodeName = notImplemented

-- | 
--
-- operationId: postNode
postByTextByTextR :: Text -- ^ 
                  -> Text -- ^ 
                  -> Handler Value
postByTextByTextR path name = notImplemented

-- | 
--
-- operationId: postNodeRw
postByText{Name}RwHtmlR :: Text -- ^ 
                        -> Text -- ^ 
                        -> Handler Value
postByText{Name}RwHtmlR path name = notImplemented

-- | 
--
-- operationId: postPath
postByTextR :: Text -- ^ 
            -> Handler Value
postByTextR path = notImplemented

-- | 
--
-- operationId: postQuery
postBinQuerybuilderJsonR :: Handler Value
postBinQuerybuilderJsonR = notImplemented

-- | 
--
-- operationId: postTreeActivation
postLibsReplicationTreeactivationHtmlR :: Handler Value
postLibsReplicationTreeactivationHtmlR = notImplemented

-- | 
--
-- operationId: postTruststore
postLibsGraniteSecurityPostTruststoreR :: Handler Value
postLibsGraniteSecurityPostTruststoreR = notImplemented

-- | 
--
-- operationId: postTruststorePKCS12
postEtcTruststoreR :: Handler Value
postEtcTruststoreR = notImplemented
