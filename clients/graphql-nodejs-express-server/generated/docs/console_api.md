# console_api

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetAemProductInfo**](console_api.md#GetAemProductInfo) | **GET** /system/console/status-productinfo.json | 
[**GetBundleInfo**](console_api.md#GetBundleInfo) | **GET** /system/console/bundles/{name}.json | 
[**GetConfigMgr**](console_api.md#GetConfigMgr) | **GET** /system/console/configMgr | 
[**PostBundle**](console_api.md#PostBundle) | **POST** /system/console/bundles/{name} | 
[**PostJmxRepository**](console_api.md#PostJmxRepository) | **POST** /system/console/jmx/com.adobe.granite:type&#x3D;Repository/op/{action} | 
[**PostSamlConfiguration**](console_api.md#PostSamlConfiguration) | **POST** /system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler | 


<a name="GetAemProductInfo"></a>
# **GetAemProductInfo**
> String! GetAemProductInfo()


<a name="GetBundleInfo"></a>
# **GetBundleInfo**
> BundleInfo GetBundleInfo(name)


<a name="GetConfigMgr"></a>
# **GetConfigMgr**
> String! GetConfigMgr()


<a name="PostBundle"></a>
# **PostBundle**
> PostBundle(name, action)


<a name="PostJmxRepository"></a>
# **PostJmxRepository**
> PostJmxRepository(action)


<a name="PostSamlConfiguration"></a>
# **PostSamlConfiguration**
> SamlConfigurationInfo PostSamlConfiguration(post, apply, delete, action, location, path, serviceRanking, idpUrl, idpCertAlias, idpHttpRedirect, serviceProviderEntityId, assertionConsumerServiceURL, spPrivateKeyAlias, keyStorePassword, defaultRedirectUrl, userIDAttribute, useEncryption, createUser, addGroupMemberships, groupMembershipAttribute, defaultGroups, nameIdFormat, synchronizeAttributes, handleLogout, logoutUrl, clockTolerance, digestMethod, signatureMethod, userIntermediatePath, propertylist)


