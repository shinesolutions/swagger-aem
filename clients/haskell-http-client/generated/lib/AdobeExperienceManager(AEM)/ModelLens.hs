{-
   Adobe Experience Manager (AEM) API

   Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API

   OpenAPI Version: 3.0.0
   Adobe Experience Manager (AEM) API API version: 3.5.0-pre.0
   Contact: opensource@shinesolutions.com
   Generated by OpenAPI Generator (https://openapi-generator.tech)
-}

{-|
Module : AdobeExperienceManager(AEM).Lens
-}

{-# LANGUAGE KindSignatures #-}
{-# LANGUAGE NamedFieldPuns #-}
{-# LANGUAGE RankNTypes #-}
{-# LANGUAGE RecordWildCards #-}
{-# OPTIONS_GHC -fno-warn-name-shadowing -fno-warn-unused-matches -fno-warn-unused-binds -fno-warn-unused-imports #-}

module AdobeExperienceManager(AEM).ModelLens where

import qualified Data.Aeson as A
import qualified Data.ByteString.Lazy as BL
import qualified Data.Data as P (Data, Typeable)
import qualified Data.Map as Map
import qualified Data.Set as Set
import qualified Data.Time as TI

import Data.Text (Text)

import Prelude (($), (.),(<$>),(<*>),(=<<),Maybe(..),Bool(..),Char,Double,FilePath,Float,Int,Integer,String,fmap,undefined,mempty,maybe,pure,Monad,Applicative,Functor)
import qualified Prelude as P

import AdobeExperienceManager(AEM).Model
import AdobeExperienceManager(AEM).Core


-- * BundleData

-- | 'bundleDataId' Lens
bundleDataIdL :: Lens_' BundleData (Maybe Int)
bundleDataIdL f BundleData{..} = (\bundleDataId -> BundleData { bundleDataId, ..} ) <$> f bundleDataId
{-# INLINE bundleDataIdL #-}

-- | 'bundleDataName' Lens
bundleDataNameL :: Lens_' BundleData (Maybe Text)
bundleDataNameL f BundleData{..} = (\bundleDataName -> BundleData { bundleDataName, ..} ) <$> f bundleDataName
{-# INLINE bundleDataNameL #-}

-- | 'bundleDataFragment' Lens
bundleDataFragmentL :: Lens_' BundleData (Maybe Bool)
bundleDataFragmentL f BundleData{..} = (\bundleDataFragment -> BundleData { bundleDataFragment, ..} ) <$> f bundleDataFragment
{-# INLINE bundleDataFragmentL #-}

-- | 'bundleDataStateRaw' Lens
bundleDataStateRawL :: Lens_' BundleData (Maybe Int)
bundleDataStateRawL f BundleData{..} = (\bundleDataStateRaw -> BundleData { bundleDataStateRaw, ..} ) <$> f bundleDataStateRaw
{-# INLINE bundleDataStateRawL #-}

-- | 'bundleDataState' Lens
bundleDataStateL :: Lens_' BundleData (Maybe Text)
bundleDataStateL f BundleData{..} = (\bundleDataState -> BundleData { bundleDataState, ..} ) <$> f bundleDataState
{-# INLINE bundleDataStateL #-}

-- | 'bundleDataVersion' Lens
bundleDataVersionL :: Lens_' BundleData (Maybe Text)
bundleDataVersionL f BundleData{..} = (\bundleDataVersion -> BundleData { bundleDataVersion, ..} ) <$> f bundleDataVersion
{-# INLINE bundleDataVersionL #-}

-- | 'bundleDataSymbolicName' Lens
bundleDataSymbolicNameL :: Lens_' BundleData (Maybe Text)
bundleDataSymbolicNameL f BundleData{..} = (\bundleDataSymbolicName -> BundleData { bundleDataSymbolicName, ..} ) <$> f bundleDataSymbolicName
{-# INLINE bundleDataSymbolicNameL #-}

-- | 'bundleDataCategory' Lens
bundleDataCategoryL :: Lens_' BundleData (Maybe Text)
bundleDataCategoryL f BundleData{..} = (\bundleDataCategory -> BundleData { bundleDataCategory, ..} ) <$> f bundleDataCategory
{-# INLINE bundleDataCategoryL #-}

-- | 'bundleDataProps' Lens
bundleDataPropsL :: Lens_' BundleData (Maybe [BundleDataProp])
bundleDataPropsL f BundleData{..} = (\bundleDataProps -> BundleData { bundleDataProps, ..} ) <$> f bundleDataProps
{-# INLINE bundleDataPropsL #-}



-- * BundleDataProp

-- | 'bundleDataPropKey' Lens
bundleDataPropKeyL :: Lens_' BundleDataProp (Maybe Text)
bundleDataPropKeyL f BundleDataProp{..} = (\bundleDataPropKey -> BundleDataProp { bundleDataPropKey, ..} ) <$> f bundleDataPropKey
{-# INLINE bundleDataPropKeyL #-}

-- | 'bundleDataPropValue' Lens
bundleDataPropValueL :: Lens_' BundleDataProp (Maybe Text)
bundleDataPropValueL f BundleDataProp{..} = (\bundleDataPropValue -> BundleDataProp { bundleDataPropValue, ..} ) <$> f bundleDataPropValue
{-# INLINE bundleDataPropValueL #-}



-- * BundleInfo

-- | 'bundleInfoStatus' Lens
bundleInfoStatusL :: Lens_' BundleInfo (Maybe Text)
bundleInfoStatusL f BundleInfo{..} = (\bundleInfoStatus -> BundleInfo { bundleInfoStatus, ..} ) <$> f bundleInfoStatus
{-# INLINE bundleInfoStatusL #-}

-- | 'bundleInfoS' Lens
bundleInfoSL :: Lens_' BundleInfo (Maybe [Int])
bundleInfoSL f BundleInfo{..} = (\bundleInfoS -> BundleInfo { bundleInfoS, ..} ) <$> f bundleInfoS
{-# INLINE bundleInfoSL #-}

-- | 'bundleInfoData' Lens
bundleInfoDataL :: Lens_' BundleInfo (Maybe [BundleData])
bundleInfoDataL f BundleInfo{..} = (\bundleInfoData -> BundleInfo { bundleInfoData, ..} ) <$> f bundleInfoData
{-# INLINE bundleInfoDataL #-}



-- * InstallStatus

-- | 'installStatusStatus' Lens
installStatusStatusL :: Lens_' InstallStatus (Maybe InstallStatusStatus)
installStatusStatusL f InstallStatus{..} = (\installStatusStatus -> InstallStatus { installStatusStatus, ..} ) <$> f installStatusStatus
{-# INLINE installStatusStatusL #-}



-- * InstallStatusStatus

-- | 'installStatusStatusFinished' Lens
installStatusStatusFinishedL :: Lens_' InstallStatusStatus (Maybe Bool)
installStatusStatusFinishedL f InstallStatusStatus{..} = (\installStatusStatusFinished -> InstallStatusStatus { installStatusStatusFinished, ..} ) <$> f installStatusStatusFinished
{-# INLINE installStatusStatusFinishedL #-}

-- | 'installStatusStatusItemCount' Lens
installStatusStatusItemCountL :: Lens_' InstallStatusStatus (Maybe Int)
installStatusStatusItemCountL f InstallStatusStatus{..} = (\installStatusStatusItemCount -> InstallStatusStatus { installStatusStatusItemCount, ..} ) <$> f installStatusStatusItemCount
{-# INLINE installStatusStatusItemCountL #-}



-- * KeystoreChainItems

-- | 'keystoreChainItemsSubject' Lens
keystoreChainItemsSubjectL :: Lens_' KeystoreChainItems (Maybe Text)
keystoreChainItemsSubjectL f KeystoreChainItems{..} = (\keystoreChainItemsSubject -> KeystoreChainItems { keystoreChainItemsSubject, ..} ) <$> f keystoreChainItemsSubject
{-# INLINE keystoreChainItemsSubjectL #-}

-- | 'keystoreChainItemsIssuer' Lens
keystoreChainItemsIssuerL :: Lens_' KeystoreChainItems (Maybe Text)
keystoreChainItemsIssuerL f KeystoreChainItems{..} = (\keystoreChainItemsIssuer -> KeystoreChainItems { keystoreChainItemsIssuer, ..} ) <$> f keystoreChainItemsIssuer
{-# INLINE keystoreChainItemsIssuerL #-}

-- | 'keystoreChainItemsNotBefore' Lens
keystoreChainItemsNotBeforeL :: Lens_' KeystoreChainItems (Maybe Text)
keystoreChainItemsNotBeforeL f KeystoreChainItems{..} = (\keystoreChainItemsNotBefore -> KeystoreChainItems { keystoreChainItemsNotBefore, ..} ) <$> f keystoreChainItemsNotBefore
{-# INLINE keystoreChainItemsNotBeforeL #-}

-- | 'keystoreChainItemsNotAfter' Lens
keystoreChainItemsNotAfterL :: Lens_' KeystoreChainItems (Maybe Text)
keystoreChainItemsNotAfterL f KeystoreChainItems{..} = (\keystoreChainItemsNotAfter -> KeystoreChainItems { keystoreChainItemsNotAfter, ..} ) <$> f keystoreChainItemsNotAfter
{-# INLINE keystoreChainItemsNotAfterL #-}

-- | 'keystoreChainItemsSerialNumber' Lens
keystoreChainItemsSerialNumberL :: Lens_' KeystoreChainItems (Maybe Int)
keystoreChainItemsSerialNumberL f KeystoreChainItems{..} = (\keystoreChainItemsSerialNumber -> KeystoreChainItems { keystoreChainItemsSerialNumber, ..} ) <$> f keystoreChainItemsSerialNumber
{-# INLINE keystoreChainItemsSerialNumberL #-}



-- * KeystoreInfo

-- | 'keystoreInfoAliases' Lens
keystoreInfoAliasesL :: Lens_' KeystoreInfo (Maybe [KeystoreItems])
keystoreInfoAliasesL f KeystoreInfo{..} = (\keystoreInfoAliases -> KeystoreInfo { keystoreInfoAliases, ..} ) <$> f keystoreInfoAliases
{-# INLINE keystoreInfoAliasesL #-}

-- | 'keystoreInfoExists' Lens
keystoreInfoExistsL :: Lens_' KeystoreInfo (Maybe Bool)
keystoreInfoExistsL f KeystoreInfo{..} = (\keystoreInfoExists -> KeystoreInfo { keystoreInfoExists, ..} ) <$> f keystoreInfoExists
{-# INLINE keystoreInfoExistsL #-}



-- * KeystoreItems

-- | 'keystoreItemsAlias' Lens
keystoreItemsAliasL :: Lens_' KeystoreItems (Maybe Text)
keystoreItemsAliasL f KeystoreItems{..} = (\keystoreItemsAlias -> KeystoreItems { keystoreItemsAlias, ..} ) <$> f keystoreItemsAlias
{-# INLINE keystoreItemsAliasL #-}

-- | 'keystoreItemsEntryType' Lens
keystoreItemsEntryTypeL :: Lens_' KeystoreItems (Maybe Text)
keystoreItemsEntryTypeL f KeystoreItems{..} = (\keystoreItemsEntryType -> KeystoreItems { keystoreItemsEntryType, ..} ) <$> f keystoreItemsEntryType
{-# INLINE keystoreItemsEntryTypeL #-}

-- | 'keystoreItemsAlgorithm' Lens
keystoreItemsAlgorithmL :: Lens_' KeystoreItems (Maybe Text)
keystoreItemsAlgorithmL f KeystoreItems{..} = (\keystoreItemsAlgorithm -> KeystoreItems { keystoreItemsAlgorithm, ..} ) <$> f keystoreItemsAlgorithm
{-# INLINE keystoreItemsAlgorithmL #-}

-- | 'keystoreItemsFormat' Lens
keystoreItemsFormatL :: Lens_' KeystoreItems (Maybe Text)
keystoreItemsFormatL f KeystoreItems{..} = (\keystoreItemsFormat -> KeystoreItems { keystoreItemsFormat, ..} ) <$> f keystoreItemsFormat
{-# INLINE keystoreItemsFormatL #-}

-- | 'keystoreItemsChain' Lens
keystoreItemsChainL :: Lens_' KeystoreItems (Maybe [KeystoreChainItems])
keystoreItemsChainL f KeystoreItems{..} = (\keystoreItemsChain -> KeystoreItems { keystoreItemsChain, ..} ) <$> f keystoreItemsChain
{-# INLINE keystoreItemsChainL #-}



-- * SamlConfigurationInfo

-- | 'samlConfigurationInfoPid' Lens
samlConfigurationInfoPidL :: Lens_' SamlConfigurationInfo (Maybe Text)
samlConfigurationInfoPidL f SamlConfigurationInfo{..} = (\samlConfigurationInfoPid -> SamlConfigurationInfo { samlConfigurationInfoPid, ..} ) <$> f samlConfigurationInfoPid
{-# INLINE samlConfigurationInfoPidL #-}

-- | 'samlConfigurationInfoTitle' Lens
samlConfigurationInfoTitleL :: Lens_' SamlConfigurationInfo (Maybe Text)
samlConfigurationInfoTitleL f SamlConfigurationInfo{..} = (\samlConfigurationInfoTitle -> SamlConfigurationInfo { samlConfigurationInfoTitle, ..} ) <$> f samlConfigurationInfoTitle
{-# INLINE samlConfigurationInfoTitleL #-}

-- | 'samlConfigurationInfoDescription' Lens
samlConfigurationInfoDescriptionL :: Lens_' SamlConfigurationInfo (Maybe Text)
samlConfigurationInfoDescriptionL f SamlConfigurationInfo{..} = (\samlConfigurationInfoDescription -> SamlConfigurationInfo { samlConfigurationInfoDescription, ..} ) <$> f samlConfigurationInfoDescription
{-# INLINE samlConfigurationInfoDescriptionL #-}

-- | 'samlConfigurationInfoBundleLocation' Lens
samlConfigurationInfoBundleLocationL :: Lens_' SamlConfigurationInfo (Maybe Text)
samlConfigurationInfoBundleLocationL f SamlConfigurationInfo{..} = (\samlConfigurationInfoBundleLocation -> SamlConfigurationInfo { samlConfigurationInfoBundleLocation, ..} ) <$> f samlConfigurationInfoBundleLocation
{-# INLINE samlConfigurationInfoBundleLocationL #-}

-- | 'samlConfigurationInfoServiceLocation' Lens
samlConfigurationInfoServiceLocationL :: Lens_' SamlConfigurationInfo (Maybe Text)
samlConfigurationInfoServiceLocationL f SamlConfigurationInfo{..} = (\samlConfigurationInfoServiceLocation -> SamlConfigurationInfo { samlConfigurationInfoServiceLocation, ..} ) <$> f samlConfigurationInfoServiceLocation
{-# INLINE samlConfigurationInfoServiceLocationL #-}

-- | 'samlConfigurationInfoProperties' Lens
samlConfigurationInfoPropertiesL :: Lens_' SamlConfigurationInfo (Maybe SamlConfigurationProperties)
samlConfigurationInfoPropertiesL f SamlConfigurationInfo{..} = (\samlConfigurationInfoProperties -> SamlConfigurationInfo { samlConfigurationInfoProperties, ..} ) <$> f samlConfigurationInfoProperties
{-# INLINE samlConfigurationInfoPropertiesL #-}



-- * SamlConfigurationProperties

-- | 'samlConfigurationPropertiesPath' Lens
samlConfigurationPropertiesPathL :: Lens_' SamlConfigurationProperties (Maybe SamlConfigurationPropertyItemsArray)
samlConfigurationPropertiesPathL f SamlConfigurationProperties{..} = (\samlConfigurationPropertiesPath -> SamlConfigurationProperties { samlConfigurationPropertiesPath, ..} ) <$> f samlConfigurationPropertiesPath
{-# INLINE samlConfigurationPropertiesPathL #-}

-- | 'samlConfigurationPropertiesServiceRanking' Lens
samlConfigurationPropertiesServiceRankingL :: Lens_' SamlConfigurationProperties (Maybe SamlConfigurationPropertyItemsLong)
samlConfigurationPropertiesServiceRankingL f SamlConfigurationProperties{..} = (\samlConfigurationPropertiesServiceRanking -> SamlConfigurationProperties { samlConfigurationPropertiesServiceRanking, ..} ) <$> f samlConfigurationPropertiesServiceRanking
{-# INLINE samlConfigurationPropertiesServiceRankingL #-}

-- | 'samlConfigurationPropertiesIdpUrl' Lens
samlConfigurationPropertiesIdpUrlL :: Lens_' SamlConfigurationProperties (Maybe SamlConfigurationPropertyItemsString)
samlConfigurationPropertiesIdpUrlL f SamlConfigurationProperties{..} = (\samlConfigurationPropertiesIdpUrl -> SamlConfigurationProperties { samlConfigurationPropertiesIdpUrl, ..} ) <$> f samlConfigurationPropertiesIdpUrl
{-# INLINE samlConfigurationPropertiesIdpUrlL #-}

-- | 'samlConfigurationPropertiesIdpCertAlias' Lens
samlConfigurationPropertiesIdpCertAliasL :: Lens_' SamlConfigurationProperties (Maybe SamlConfigurationPropertyItemsString)
samlConfigurationPropertiesIdpCertAliasL f SamlConfigurationProperties{..} = (\samlConfigurationPropertiesIdpCertAlias -> SamlConfigurationProperties { samlConfigurationPropertiesIdpCertAlias, ..} ) <$> f samlConfigurationPropertiesIdpCertAlias
{-# INLINE samlConfigurationPropertiesIdpCertAliasL #-}

-- | 'samlConfigurationPropertiesIdpHttpRedirect' Lens
samlConfigurationPropertiesIdpHttpRedirectL :: Lens_' SamlConfigurationProperties (Maybe SamlConfigurationPropertyItemsBoolean)
samlConfigurationPropertiesIdpHttpRedirectL f SamlConfigurationProperties{..} = (\samlConfigurationPropertiesIdpHttpRedirect -> SamlConfigurationProperties { samlConfigurationPropertiesIdpHttpRedirect, ..} ) <$> f samlConfigurationPropertiesIdpHttpRedirect
{-# INLINE samlConfigurationPropertiesIdpHttpRedirectL #-}

-- | 'samlConfigurationPropertiesServiceProviderEntityId' Lens
samlConfigurationPropertiesServiceProviderEntityIdL :: Lens_' SamlConfigurationProperties (Maybe SamlConfigurationPropertyItemsString)
samlConfigurationPropertiesServiceProviderEntityIdL f SamlConfigurationProperties{..} = (\samlConfigurationPropertiesServiceProviderEntityId -> SamlConfigurationProperties { samlConfigurationPropertiesServiceProviderEntityId, ..} ) <$> f samlConfigurationPropertiesServiceProviderEntityId
{-# INLINE samlConfigurationPropertiesServiceProviderEntityIdL #-}

-- | 'samlConfigurationPropertiesAssertionConsumerServiceUrl' Lens
samlConfigurationPropertiesAssertionConsumerServiceUrlL :: Lens_' SamlConfigurationProperties (Maybe SamlConfigurationPropertyItemsString)
samlConfigurationPropertiesAssertionConsumerServiceUrlL f SamlConfigurationProperties{..} = (\samlConfigurationPropertiesAssertionConsumerServiceUrl -> SamlConfigurationProperties { samlConfigurationPropertiesAssertionConsumerServiceUrl, ..} ) <$> f samlConfigurationPropertiesAssertionConsumerServiceUrl
{-# INLINE samlConfigurationPropertiesAssertionConsumerServiceUrlL #-}

-- | 'samlConfigurationPropertiesSpPrivateKeyAlias' Lens
samlConfigurationPropertiesSpPrivateKeyAliasL :: Lens_' SamlConfigurationProperties (Maybe SamlConfigurationPropertyItemsString)
samlConfigurationPropertiesSpPrivateKeyAliasL f SamlConfigurationProperties{..} = (\samlConfigurationPropertiesSpPrivateKeyAlias -> SamlConfigurationProperties { samlConfigurationPropertiesSpPrivateKeyAlias, ..} ) <$> f samlConfigurationPropertiesSpPrivateKeyAlias
{-# INLINE samlConfigurationPropertiesSpPrivateKeyAliasL #-}

-- | 'samlConfigurationPropertiesKeyStorePassword' Lens
samlConfigurationPropertiesKeyStorePasswordL :: Lens_' SamlConfigurationProperties (Maybe SamlConfigurationPropertyItemsString)
samlConfigurationPropertiesKeyStorePasswordL f SamlConfigurationProperties{..} = (\samlConfigurationPropertiesKeyStorePassword -> SamlConfigurationProperties { samlConfigurationPropertiesKeyStorePassword, ..} ) <$> f samlConfigurationPropertiesKeyStorePassword
{-# INLINE samlConfigurationPropertiesKeyStorePasswordL #-}

-- | 'samlConfigurationPropertiesDefaultRedirectUrl' Lens
samlConfigurationPropertiesDefaultRedirectUrlL :: Lens_' SamlConfigurationProperties (Maybe SamlConfigurationPropertyItemsString)
samlConfigurationPropertiesDefaultRedirectUrlL f SamlConfigurationProperties{..} = (\samlConfigurationPropertiesDefaultRedirectUrl -> SamlConfigurationProperties { samlConfigurationPropertiesDefaultRedirectUrl, ..} ) <$> f samlConfigurationPropertiesDefaultRedirectUrl
{-# INLINE samlConfigurationPropertiesDefaultRedirectUrlL #-}

-- | 'samlConfigurationPropertiesUserIdAttribute' Lens
samlConfigurationPropertiesUserIdAttributeL :: Lens_' SamlConfigurationProperties (Maybe SamlConfigurationPropertyItemsString)
samlConfigurationPropertiesUserIdAttributeL f SamlConfigurationProperties{..} = (\samlConfigurationPropertiesUserIdAttribute -> SamlConfigurationProperties { samlConfigurationPropertiesUserIdAttribute, ..} ) <$> f samlConfigurationPropertiesUserIdAttribute
{-# INLINE samlConfigurationPropertiesUserIdAttributeL #-}

-- | 'samlConfigurationPropertiesUseEncryption' Lens
samlConfigurationPropertiesUseEncryptionL :: Lens_' SamlConfigurationProperties (Maybe SamlConfigurationPropertyItemsBoolean)
samlConfigurationPropertiesUseEncryptionL f SamlConfigurationProperties{..} = (\samlConfigurationPropertiesUseEncryption -> SamlConfigurationProperties { samlConfigurationPropertiesUseEncryption, ..} ) <$> f samlConfigurationPropertiesUseEncryption
{-# INLINE samlConfigurationPropertiesUseEncryptionL #-}

-- | 'samlConfigurationPropertiesCreateUser' Lens
samlConfigurationPropertiesCreateUserL :: Lens_' SamlConfigurationProperties (Maybe SamlConfigurationPropertyItemsBoolean)
samlConfigurationPropertiesCreateUserL f SamlConfigurationProperties{..} = (\samlConfigurationPropertiesCreateUser -> SamlConfigurationProperties { samlConfigurationPropertiesCreateUser, ..} ) <$> f samlConfigurationPropertiesCreateUser
{-# INLINE samlConfigurationPropertiesCreateUserL #-}

-- | 'samlConfigurationPropertiesAddGroupMemberships' Lens
samlConfigurationPropertiesAddGroupMembershipsL :: Lens_' SamlConfigurationProperties (Maybe SamlConfigurationPropertyItemsBoolean)
samlConfigurationPropertiesAddGroupMembershipsL f SamlConfigurationProperties{..} = (\samlConfigurationPropertiesAddGroupMemberships -> SamlConfigurationProperties { samlConfigurationPropertiesAddGroupMemberships, ..} ) <$> f samlConfigurationPropertiesAddGroupMemberships
{-# INLINE samlConfigurationPropertiesAddGroupMembershipsL #-}

-- | 'samlConfigurationPropertiesGroupMembershipAttribute' Lens
samlConfigurationPropertiesGroupMembershipAttributeL :: Lens_' SamlConfigurationProperties (Maybe SamlConfigurationPropertyItemsString)
samlConfigurationPropertiesGroupMembershipAttributeL f SamlConfigurationProperties{..} = (\samlConfigurationPropertiesGroupMembershipAttribute -> SamlConfigurationProperties { samlConfigurationPropertiesGroupMembershipAttribute, ..} ) <$> f samlConfigurationPropertiesGroupMembershipAttribute
{-# INLINE samlConfigurationPropertiesGroupMembershipAttributeL #-}

-- | 'samlConfigurationPropertiesDefaultGroups' Lens
samlConfigurationPropertiesDefaultGroupsL :: Lens_' SamlConfigurationProperties (Maybe SamlConfigurationPropertyItemsArray)
samlConfigurationPropertiesDefaultGroupsL f SamlConfigurationProperties{..} = (\samlConfigurationPropertiesDefaultGroups -> SamlConfigurationProperties { samlConfigurationPropertiesDefaultGroups, ..} ) <$> f samlConfigurationPropertiesDefaultGroups
{-# INLINE samlConfigurationPropertiesDefaultGroupsL #-}

-- | 'samlConfigurationPropertiesNameIdFormat' Lens
samlConfigurationPropertiesNameIdFormatL :: Lens_' SamlConfigurationProperties (Maybe SamlConfigurationPropertyItemsString)
samlConfigurationPropertiesNameIdFormatL f SamlConfigurationProperties{..} = (\samlConfigurationPropertiesNameIdFormat -> SamlConfigurationProperties { samlConfigurationPropertiesNameIdFormat, ..} ) <$> f samlConfigurationPropertiesNameIdFormat
{-# INLINE samlConfigurationPropertiesNameIdFormatL #-}

-- | 'samlConfigurationPropertiesSynchronizeAttributes' Lens
samlConfigurationPropertiesSynchronizeAttributesL :: Lens_' SamlConfigurationProperties (Maybe SamlConfigurationPropertyItemsArray)
samlConfigurationPropertiesSynchronizeAttributesL f SamlConfigurationProperties{..} = (\samlConfigurationPropertiesSynchronizeAttributes -> SamlConfigurationProperties { samlConfigurationPropertiesSynchronizeAttributes, ..} ) <$> f samlConfigurationPropertiesSynchronizeAttributes
{-# INLINE samlConfigurationPropertiesSynchronizeAttributesL #-}

-- | 'samlConfigurationPropertiesHandleLogout' Lens
samlConfigurationPropertiesHandleLogoutL :: Lens_' SamlConfigurationProperties (Maybe SamlConfigurationPropertyItemsBoolean)
samlConfigurationPropertiesHandleLogoutL f SamlConfigurationProperties{..} = (\samlConfigurationPropertiesHandleLogout -> SamlConfigurationProperties { samlConfigurationPropertiesHandleLogout, ..} ) <$> f samlConfigurationPropertiesHandleLogout
{-# INLINE samlConfigurationPropertiesHandleLogoutL #-}

-- | 'samlConfigurationPropertiesLogoutUrl' Lens
samlConfigurationPropertiesLogoutUrlL :: Lens_' SamlConfigurationProperties (Maybe SamlConfigurationPropertyItemsString)
samlConfigurationPropertiesLogoutUrlL f SamlConfigurationProperties{..} = (\samlConfigurationPropertiesLogoutUrl -> SamlConfigurationProperties { samlConfigurationPropertiesLogoutUrl, ..} ) <$> f samlConfigurationPropertiesLogoutUrl
{-# INLINE samlConfigurationPropertiesLogoutUrlL #-}

-- | 'samlConfigurationPropertiesClockTolerance' Lens
samlConfigurationPropertiesClockToleranceL :: Lens_' SamlConfigurationProperties (Maybe SamlConfigurationPropertyItemsLong)
samlConfigurationPropertiesClockToleranceL f SamlConfigurationProperties{..} = (\samlConfigurationPropertiesClockTolerance -> SamlConfigurationProperties { samlConfigurationPropertiesClockTolerance, ..} ) <$> f samlConfigurationPropertiesClockTolerance
{-# INLINE samlConfigurationPropertiesClockToleranceL #-}

-- | 'samlConfigurationPropertiesDigestMethod' Lens
samlConfigurationPropertiesDigestMethodL :: Lens_' SamlConfigurationProperties (Maybe SamlConfigurationPropertyItemsString)
samlConfigurationPropertiesDigestMethodL f SamlConfigurationProperties{..} = (\samlConfigurationPropertiesDigestMethod -> SamlConfigurationProperties { samlConfigurationPropertiesDigestMethod, ..} ) <$> f samlConfigurationPropertiesDigestMethod
{-# INLINE samlConfigurationPropertiesDigestMethodL #-}

-- | 'samlConfigurationPropertiesSignatureMethod' Lens
samlConfigurationPropertiesSignatureMethodL :: Lens_' SamlConfigurationProperties (Maybe SamlConfigurationPropertyItemsString)
samlConfigurationPropertiesSignatureMethodL f SamlConfigurationProperties{..} = (\samlConfigurationPropertiesSignatureMethod -> SamlConfigurationProperties { samlConfigurationPropertiesSignatureMethod, ..} ) <$> f samlConfigurationPropertiesSignatureMethod
{-# INLINE samlConfigurationPropertiesSignatureMethodL #-}

-- | 'samlConfigurationPropertiesUserIntermediatePath' Lens
samlConfigurationPropertiesUserIntermediatePathL :: Lens_' SamlConfigurationProperties (Maybe SamlConfigurationPropertyItemsString)
samlConfigurationPropertiesUserIntermediatePathL f SamlConfigurationProperties{..} = (\samlConfigurationPropertiesUserIntermediatePath -> SamlConfigurationProperties { samlConfigurationPropertiesUserIntermediatePath, ..} ) <$> f samlConfigurationPropertiesUserIntermediatePath
{-# INLINE samlConfigurationPropertiesUserIntermediatePathL #-}



-- * SamlConfigurationPropertyItemsArray

-- | 'samlConfigurationPropertyItemsArrayName' Lens
samlConfigurationPropertyItemsArrayNameL :: Lens_' SamlConfigurationPropertyItemsArray (Maybe Text)
samlConfigurationPropertyItemsArrayNameL f SamlConfigurationPropertyItemsArray{..} = (\samlConfigurationPropertyItemsArrayName -> SamlConfigurationPropertyItemsArray { samlConfigurationPropertyItemsArrayName, ..} ) <$> f samlConfigurationPropertyItemsArrayName
{-# INLINE samlConfigurationPropertyItemsArrayNameL #-}

-- | 'samlConfigurationPropertyItemsArrayOptional' Lens
samlConfigurationPropertyItemsArrayOptionalL :: Lens_' SamlConfigurationPropertyItemsArray (Maybe Bool)
samlConfigurationPropertyItemsArrayOptionalL f SamlConfigurationPropertyItemsArray{..} = (\samlConfigurationPropertyItemsArrayOptional -> SamlConfigurationPropertyItemsArray { samlConfigurationPropertyItemsArrayOptional, ..} ) <$> f samlConfigurationPropertyItemsArrayOptional
{-# INLINE samlConfigurationPropertyItemsArrayOptionalL #-}

-- | 'samlConfigurationPropertyItemsArrayIsSet' Lens
samlConfigurationPropertyItemsArrayIsSetL :: Lens_' SamlConfigurationPropertyItemsArray (Maybe Bool)
samlConfigurationPropertyItemsArrayIsSetL f SamlConfigurationPropertyItemsArray{..} = (\samlConfigurationPropertyItemsArrayIsSet -> SamlConfigurationPropertyItemsArray { samlConfigurationPropertyItemsArrayIsSet, ..} ) <$> f samlConfigurationPropertyItemsArrayIsSet
{-# INLINE samlConfigurationPropertyItemsArrayIsSetL #-}

-- | 'samlConfigurationPropertyItemsArrayType' Lens
samlConfigurationPropertyItemsArrayTypeL :: Lens_' SamlConfigurationPropertyItemsArray (Maybe Int)
samlConfigurationPropertyItemsArrayTypeL f SamlConfigurationPropertyItemsArray{..} = (\samlConfigurationPropertyItemsArrayType -> SamlConfigurationPropertyItemsArray { samlConfigurationPropertyItemsArrayType, ..} ) <$> f samlConfigurationPropertyItemsArrayType
{-# INLINE samlConfigurationPropertyItemsArrayTypeL #-}

-- | 'samlConfigurationPropertyItemsArrayValues' Lens
samlConfigurationPropertyItemsArrayValuesL :: Lens_' SamlConfigurationPropertyItemsArray (Maybe [Text])
samlConfigurationPropertyItemsArrayValuesL f SamlConfigurationPropertyItemsArray{..} = (\samlConfigurationPropertyItemsArrayValues -> SamlConfigurationPropertyItemsArray { samlConfigurationPropertyItemsArrayValues, ..} ) <$> f samlConfigurationPropertyItemsArrayValues
{-# INLINE samlConfigurationPropertyItemsArrayValuesL #-}

-- | 'samlConfigurationPropertyItemsArrayDescription' Lens
samlConfigurationPropertyItemsArrayDescriptionL :: Lens_' SamlConfigurationPropertyItemsArray (Maybe Text)
samlConfigurationPropertyItemsArrayDescriptionL f SamlConfigurationPropertyItemsArray{..} = (\samlConfigurationPropertyItemsArrayDescription -> SamlConfigurationPropertyItemsArray { samlConfigurationPropertyItemsArrayDescription, ..} ) <$> f samlConfigurationPropertyItemsArrayDescription
{-# INLINE samlConfigurationPropertyItemsArrayDescriptionL #-}



-- * SamlConfigurationPropertyItemsBoolean

-- | 'samlConfigurationPropertyItemsBooleanName' Lens
samlConfigurationPropertyItemsBooleanNameL :: Lens_' SamlConfigurationPropertyItemsBoolean (Maybe Text)
samlConfigurationPropertyItemsBooleanNameL f SamlConfigurationPropertyItemsBoolean{..} = (\samlConfigurationPropertyItemsBooleanName -> SamlConfigurationPropertyItemsBoolean { samlConfigurationPropertyItemsBooleanName, ..} ) <$> f samlConfigurationPropertyItemsBooleanName
{-# INLINE samlConfigurationPropertyItemsBooleanNameL #-}

-- | 'samlConfigurationPropertyItemsBooleanOptional' Lens
samlConfigurationPropertyItemsBooleanOptionalL :: Lens_' SamlConfigurationPropertyItemsBoolean (Maybe Bool)
samlConfigurationPropertyItemsBooleanOptionalL f SamlConfigurationPropertyItemsBoolean{..} = (\samlConfigurationPropertyItemsBooleanOptional -> SamlConfigurationPropertyItemsBoolean { samlConfigurationPropertyItemsBooleanOptional, ..} ) <$> f samlConfigurationPropertyItemsBooleanOptional
{-# INLINE samlConfigurationPropertyItemsBooleanOptionalL #-}

-- | 'samlConfigurationPropertyItemsBooleanIsSet' Lens
samlConfigurationPropertyItemsBooleanIsSetL :: Lens_' SamlConfigurationPropertyItemsBoolean (Maybe Bool)
samlConfigurationPropertyItemsBooleanIsSetL f SamlConfigurationPropertyItemsBoolean{..} = (\samlConfigurationPropertyItemsBooleanIsSet -> SamlConfigurationPropertyItemsBoolean { samlConfigurationPropertyItemsBooleanIsSet, ..} ) <$> f samlConfigurationPropertyItemsBooleanIsSet
{-# INLINE samlConfigurationPropertyItemsBooleanIsSetL #-}

-- | 'samlConfigurationPropertyItemsBooleanType' Lens
samlConfigurationPropertyItemsBooleanTypeL :: Lens_' SamlConfigurationPropertyItemsBoolean (Maybe Int)
samlConfigurationPropertyItemsBooleanTypeL f SamlConfigurationPropertyItemsBoolean{..} = (\samlConfigurationPropertyItemsBooleanType -> SamlConfigurationPropertyItemsBoolean { samlConfigurationPropertyItemsBooleanType, ..} ) <$> f samlConfigurationPropertyItemsBooleanType
{-# INLINE samlConfigurationPropertyItemsBooleanTypeL #-}

-- | 'samlConfigurationPropertyItemsBooleanValue' Lens
samlConfigurationPropertyItemsBooleanValueL :: Lens_' SamlConfigurationPropertyItemsBoolean (Maybe Bool)
samlConfigurationPropertyItemsBooleanValueL f SamlConfigurationPropertyItemsBoolean{..} = (\samlConfigurationPropertyItemsBooleanValue -> SamlConfigurationPropertyItemsBoolean { samlConfigurationPropertyItemsBooleanValue, ..} ) <$> f samlConfigurationPropertyItemsBooleanValue
{-# INLINE samlConfigurationPropertyItemsBooleanValueL #-}

-- | 'samlConfigurationPropertyItemsBooleanDescription' Lens
samlConfigurationPropertyItemsBooleanDescriptionL :: Lens_' SamlConfigurationPropertyItemsBoolean (Maybe Text)
samlConfigurationPropertyItemsBooleanDescriptionL f SamlConfigurationPropertyItemsBoolean{..} = (\samlConfigurationPropertyItemsBooleanDescription -> SamlConfigurationPropertyItemsBoolean { samlConfigurationPropertyItemsBooleanDescription, ..} ) <$> f samlConfigurationPropertyItemsBooleanDescription
{-# INLINE samlConfigurationPropertyItemsBooleanDescriptionL #-}



-- * SamlConfigurationPropertyItemsLong

-- | 'samlConfigurationPropertyItemsLongName' Lens
samlConfigurationPropertyItemsLongNameL :: Lens_' SamlConfigurationPropertyItemsLong (Maybe Text)
samlConfigurationPropertyItemsLongNameL f SamlConfigurationPropertyItemsLong{..} = (\samlConfigurationPropertyItemsLongName -> SamlConfigurationPropertyItemsLong { samlConfigurationPropertyItemsLongName, ..} ) <$> f samlConfigurationPropertyItemsLongName
{-# INLINE samlConfigurationPropertyItemsLongNameL #-}

-- | 'samlConfigurationPropertyItemsLongOptional' Lens
samlConfigurationPropertyItemsLongOptionalL :: Lens_' SamlConfigurationPropertyItemsLong (Maybe Bool)
samlConfigurationPropertyItemsLongOptionalL f SamlConfigurationPropertyItemsLong{..} = (\samlConfigurationPropertyItemsLongOptional -> SamlConfigurationPropertyItemsLong { samlConfigurationPropertyItemsLongOptional, ..} ) <$> f samlConfigurationPropertyItemsLongOptional
{-# INLINE samlConfigurationPropertyItemsLongOptionalL #-}

-- | 'samlConfigurationPropertyItemsLongIsSet' Lens
samlConfigurationPropertyItemsLongIsSetL :: Lens_' SamlConfigurationPropertyItemsLong (Maybe Bool)
samlConfigurationPropertyItemsLongIsSetL f SamlConfigurationPropertyItemsLong{..} = (\samlConfigurationPropertyItemsLongIsSet -> SamlConfigurationPropertyItemsLong { samlConfigurationPropertyItemsLongIsSet, ..} ) <$> f samlConfigurationPropertyItemsLongIsSet
{-# INLINE samlConfigurationPropertyItemsLongIsSetL #-}

-- | 'samlConfigurationPropertyItemsLongType' Lens
samlConfigurationPropertyItemsLongTypeL :: Lens_' SamlConfigurationPropertyItemsLong (Maybe Int)
samlConfigurationPropertyItemsLongTypeL f SamlConfigurationPropertyItemsLong{..} = (\samlConfigurationPropertyItemsLongType -> SamlConfigurationPropertyItemsLong { samlConfigurationPropertyItemsLongType, ..} ) <$> f samlConfigurationPropertyItemsLongType
{-# INLINE samlConfigurationPropertyItemsLongTypeL #-}

-- | 'samlConfigurationPropertyItemsLongValue' Lens
samlConfigurationPropertyItemsLongValueL :: Lens_' SamlConfigurationPropertyItemsLong (Maybe Int)
samlConfigurationPropertyItemsLongValueL f SamlConfigurationPropertyItemsLong{..} = (\samlConfigurationPropertyItemsLongValue -> SamlConfigurationPropertyItemsLong { samlConfigurationPropertyItemsLongValue, ..} ) <$> f samlConfigurationPropertyItemsLongValue
{-# INLINE samlConfigurationPropertyItemsLongValueL #-}

-- | 'samlConfigurationPropertyItemsLongDescription' Lens
samlConfigurationPropertyItemsLongDescriptionL :: Lens_' SamlConfigurationPropertyItemsLong (Maybe Text)
samlConfigurationPropertyItemsLongDescriptionL f SamlConfigurationPropertyItemsLong{..} = (\samlConfigurationPropertyItemsLongDescription -> SamlConfigurationPropertyItemsLong { samlConfigurationPropertyItemsLongDescription, ..} ) <$> f samlConfigurationPropertyItemsLongDescription
{-# INLINE samlConfigurationPropertyItemsLongDescriptionL #-}



-- * SamlConfigurationPropertyItemsString

-- | 'samlConfigurationPropertyItemsStringName' Lens
samlConfigurationPropertyItemsStringNameL :: Lens_' SamlConfigurationPropertyItemsString (Maybe Text)
samlConfigurationPropertyItemsStringNameL f SamlConfigurationPropertyItemsString{..} = (\samlConfigurationPropertyItemsStringName -> SamlConfigurationPropertyItemsString { samlConfigurationPropertyItemsStringName, ..} ) <$> f samlConfigurationPropertyItemsStringName
{-# INLINE samlConfigurationPropertyItemsStringNameL #-}

-- | 'samlConfigurationPropertyItemsStringOptional' Lens
samlConfigurationPropertyItemsStringOptionalL :: Lens_' SamlConfigurationPropertyItemsString (Maybe Bool)
samlConfigurationPropertyItemsStringOptionalL f SamlConfigurationPropertyItemsString{..} = (\samlConfigurationPropertyItemsStringOptional -> SamlConfigurationPropertyItemsString { samlConfigurationPropertyItemsStringOptional, ..} ) <$> f samlConfigurationPropertyItemsStringOptional
{-# INLINE samlConfigurationPropertyItemsStringOptionalL #-}

-- | 'samlConfigurationPropertyItemsStringIsSet' Lens
samlConfigurationPropertyItemsStringIsSetL :: Lens_' SamlConfigurationPropertyItemsString (Maybe Bool)
samlConfigurationPropertyItemsStringIsSetL f SamlConfigurationPropertyItemsString{..} = (\samlConfigurationPropertyItemsStringIsSet -> SamlConfigurationPropertyItemsString { samlConfigurationPropertyItemsStringIsSet, ..} ) <$> f samlConfigurationPropertyItemsStringIsSet
{-# INLINE samlConfigurationPropertyItemsStringIsSetL #-}

-- | 'samlConfigurationPropertyItemsStringType' Lens
samlConfigurationPropertyItemsStringTypeL :: Lens_' SamlConfigurationPropertyItemsString (Maybe Int)
samlConfigurationPropertyItemsStringTypeL f SamlConfigurationPropertyItemsString{..} = (\samlConfigurationPropertyItemsStringType -> SamlConfigurationPropertyItemsString { samlConfigurationPropertyItemsStringType, ..} ) <$> f samlConfigurationPropertyItemsStringType
{-# INLINE samlConfigurationPropertyItemsStringTypeL #-}

-- | 'samlConfigurationPropertyItemsStringValue' Lens
samlConfigurationPropertyItemsStringValueL :: Lens_' SamlConfigurationPropertyItemsString (Maybe Text)
samlConfigurationPropertyItemsStringValueL f SamlConfigurationPropertyItemsString{..} = (\samlConfigurationPropertyItemsStringValue -> SamlConfigurationPropertyItemsString { samlConfigurationPropertyItemsStringValue, ..} ) <$> f samlConfigurationPropertyItemsStringValue
{-# INLINE samlConfigurationPropertyItemsStringValueL #-}

-- | 'samlConfigurationPropertyItemsStringDescription' Lens
samlConfigurationPropertyItemsStringDescriptionL :: Lens_' SamlConfigurationPropertyItemsString (Maybe Text)
samlConfigurationPropertyItemsStringDescriptionL f SamlConfigurationPropertyItemsString{..} = (\samlConfigurationPropertyItemsStringDescription -> SamlConfigurationPropertyItemsString { samlConfigurationPropertyItemsStringDescription, ..} ) <$> f samlConfigurationPropertyItemsStringDescription
{-# INLINE samlConfigurationPropertyItemsStringDescriptionL #-}



-- * TruststoreInfo

-- | 'truststoreInfoAliases' Lens
truststoreInfoAliasesL :: Lens_' TruststoreInfo (Maybe [TruststoreItems])
truststoreInfoAliasesL f TruststoreInfo{..} = (\truststoreInfoAliases -> TruststoreInfo { truststoreInfoAliases, ..} ) <$> f truststoreInfoAliases
{-# INLINE truststoreInfoAliasesL #-}

-- | 'truststoreInfoExists' Lens
truststoreInfoExistsL :: Lens_' TruststoreInfo (Maybe Bool)
truststoreInfoExistsL f TruststoreInfo{..} = (\truststoreInfoExists -> TruststoreInfo { truststoreInfoExists, ..} ) <$> f truststoreInfoExists
{-# INLINE truststoreInfoExistsL #-}



-- * TruststoreItems

-- | 'truststoreItemsAlias' Lens
truststoreItemsAliasL :: Lens_' TruststoreItems (Maybe Text)
truststoreItemsAliasL f TruststoreItems{..} = (\truststoreItemsAlias -> TruststoreItems { truststoreItemsAlias, ..} ) <$> f truststoreItemsAlias
{-# INLINE truststoreItemsAliasL #-}

-- | 'truststoreItemsEntryType' Lens
truststoreItemsEntryTypeL :: Lens_' TruststoreItems (Maybe Text)
truststoreItemsEntryTypeL f TruststoreItems{..} = (\truststoreItemsEntryType -> TruststoreItems { truststoreItemsEntryType, ..} ) <$> f truststoreItemsEntryType
{-# INLINE truststoreItemsEntryTypeL #-}

-- | 'truststoreItemsSubject' Lens
truststoreItemsSubjectL :: Lens_' TruststoreItems (Maybe Text)
truststoreItemsSubjectL f TruststoreItems{..} = (\truststoreItemsSubject -> TruststoreItems { truststoreItemsSubject, ..} ) <$> f truststoreItemsSubject
{-# INLINE truststoreItemsSubjectL #-}

-- | 'truststoreItemsIssuer' Lens
truststoreItemsIssuerL :: Lens_' TruststoreItems (Maybe Text)
truststoreItemsIssuerL f TruststoreItems{..} = (\truststoreItemsIssuer -> TruststoreItems { truststoreItemsIssuer, ..} ) <$> f truststoreItemsIssuer
{-# INLINE truststoreItemsIssuerL #-}

-- | 'truststoreItemsNotBefore' Lens
truststoreItemsNotBeforeL :: Lens_' TruststoreItems (Maybe Text)
truststoreItemsNotBeforeL f TruststoreItems{..} = (\truststoreItemsNotBefore -> TruststoreItems { truststoreItemsNotBefore, ..} ) <$> f truststoreItemsNotBefore
{-# INLINE truststoreItemsNotBeforeL #-}

-- | 'truststoreItemsNotAfter' Lens
truststoreItemsNotAfterL :: Lens_' TruststoreItems (Maybe Text)
truststoreItemsNotAfterL f TruststoreItems{..} = (\truststoreItemsNotAfter -> TruststoreItems { truststoreItemsNotAfter, ..} ) <$> f truststoreItemsNotAfter
{-# INLINE truststoreItemsNotAfterL #-}

-- | 'truststoreItemsSerialNumber' Lens
truststoreItemsSerialNumberL :: Lens_' TruststoreItems (Maybe Int)
truststoreItemsSerialNumberL f TruststoreItems{..} = (\truststoreItemsSerialNumber -> TruststoreItems { truststoreItemsSerialNumber, ..} ) <$> f truststoreItemsSerialNumber
{-# INLINE truststoreItemsSerialNumberL #-}


