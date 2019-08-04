# Auto-Generated OpenAPI Bindings to `AdobeExperienceManager(AEM)`

The library in `lib` provides auto-generated-from-OpenAPI bindings to the AdobeExperienceManager(AEM) API.

## Installation

Installation follows the standard approach to installing Stack-based projects.

1. Install the [Haskell `stack` tool](http://docs.haskellstack.org/en/stable/README).
2. Run `stack install` to install this package.

## Main Interface

The main interface to this library is in the `AdobeExperienceManager(AEM).API` module, which exports the AdobeExperienceManager(AEM)Backend type. The AdobeExperienceManager(AEM)Backend
type can be used to create and define servers and clients for the API.

## Creating a Client

A client can be created via the `createAdobeExperienceManager(AEM)Client` function, which, if provided with a hostname and a port, will generate
a client that can be used to access the API if it is being served at that hostname / port combination. For example, if
`localhost:8080` is serving the AdobeExperienceManager(AEM) API, you can write:

```haskell
{-# LANGUAGE RecordWildCards #-}

import AdobeExperienceManager(AEM).API

main :: IO ()
main = do
  AdobeExperienceManager(AEM)Backend{..} <- createAdobeExperienceManager(AEM)Client (ServerConfig "localhost" 8080)
  -- Any AdobeExperienceManager(AEM) API call can go here.
  return ()
```

## Creating a Server

In order to create a server, you must use the `runAdobeExperienceManager(AEM)Server` function. However, you unlike the client, in which case you *got* a `AdobeExperienceManager(AEM)Backend`
from the library, you must instead *provide* a `AdobeExperienceManager(AEM)Backend`. For example, if you have defined handler functions for all the
functions in `AdobeExperienceManager(AEM).Handlers`, you can write:

```haskell
{-# LANGUAGE RecordWildCards #-}

import AdobeExperienceManager(AEM).API

-- A module you wrote yourself, containing all handlers needed for the AdobeExperienceManager(AEM)Backend type.
import AdobeExperienceManager(AEM).Handlers

-- Run a AdobeExperienceManager(AEM) server on localhost:8080
main :: IO ()
main = do
  let server = AdobeExperienceManager(AEM)Backend{..}
  runAdobeExperienceManager(AEM)Server (ServerConfig "localhost" 8080) server
```

You could use `optparse-applicative` or a similar library to read the host and port from command-line arguments:
```
{-# LANGUAGE RecordWildCards #-}

module Main (main) where

import AdobeExperienceManager(AEM).API (runAdobeExperienceManager(AEM)Server, AdobeExperienceManager(AEM)Backend(..), ServerConfig(..))

import Control.Applicative ((<$>), (<*>))
import Options.Applicative (execParser, option, str, auto, long, metavar, help)

main :: IO ()
main = do
  config <- parseArguments
  runAdobeExperienceManager(AEM)Server config AdobeExperienceManager(AEM)Backend{}

-- | Parse host and port from the command line arguments.
parseArguments :: IO ServerConfig
parseArguments =
  execParser $
    ServerConfig
      <$> option str  (long "host" <> metavar "HOST" <> help "Host to serve on")
      <*> option auto (long "port" <> metavar "PORT" <> help "Port to serve on")
```
