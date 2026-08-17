{-# LANGUAGE NoImplicitPrelude #-}
{-# OPTIONS_GHC -fno-warn-unused-matches #-}
module Handler.Console where

import           Import


-- | 
--
-- operationId: getAemProductInfo
getSystemConsoleStatusProductinfoJsonR :: Handler Value
getSystemConsoleStatusProductinfoJsonR = notImplemented

-- | 
--
-- operationId: getBundleInfo
getSystemConsoleBundles{Name}JsonR :: Text -- ^ 
                                   -> Handler Value
getSystemConsoleBundles{Name}JsonR name = notImplemented

-- | 
--
-- operationId: getConfigMgr
getSystemConsoleConfigMgrR :: Handler Value
getSystemConsoleConfigMgrR = notImplemented

-- | 
--
-- operationId: postBundle
postSystemConsoleBundlesByTextR :: Text -- ^ 
                                -> Handler Value
postSystemConsoleBundlesByTextR name = notImplemented

-- | 
--
-- operationId: postJmxRepository
postSystemConsoleJmxComAdobeGranite:type&#x3D;RepositoryOpByTextR :: Text -- ^ 
                                                             -> Handler Value
postSystemConsoleJmxComAdobeGranite:type&#x3D;RepositoryOpByTextR action = notImplemented

-- | 
--
-- operationId: postSamlConfiguration
postSystemConsoleConfigMgrComAdobeGraniteAuthSamlSamlAuthenticationHandlerR :: Handler Value
postSystemConsoleConfigMgrComAdobeGraniteAuthSamlSamlAuthenticationHandlerR = notImplemented
