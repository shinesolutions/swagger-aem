# crx_api

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetCrxdeStatus**](crx_api.md#GetCrxdeStatus) | **GET** /crx/server/crx.default/jcr:root/.1.json | 
[**GetInstallStatus**](crx_api.md#GetInstallStatus) | **GET** /crx/packmgr/installstatus.jsp | 
[**GetPackageManagerServlet**](crx_api.md#GetPackageManagerServlet) | **GET** /crx/packmgr/service/script.html | 
[**PostPackageService**](crx_api.md#PostPackageService) | **POST** /crx/packmgr/service.jsp | 
[**PostPackageServiceJson**](crx_api.md#PostPackageServiceJson) | **POST** /crx/packmgr/service/.json/{path} | 
[**PostPackageUpdate**](crx_api.md#PostPackageUpdate) | **POST** /crx/packmgr/update.jsp | 
[**PostSetPassword**](crx_api.md#PostSetPassword) | **POST** /crx/explorer/ui/setpassword.jsp | 


<a name="GetCrxdeStatus"></a>
# **GetCrxdeStatus**
> String! GetCrxdeStatus()


<a name="GetInstallStatus"></a>
# **GetInstallStatus**
> InstallStatus GetInstallStatus()


<a name="GetPackageManagerServlet"></a>
# **GetPackageManagerServlet**
> GetPackageManagerServlet()


<a name="PostPackageService"></a>
# **PostPackageService**
> String! PostPackageService(cmd)


<a name="PostPackageServiceJson"></a>
# **PostPackageServiceJson**
> String! PostPackageServiceJson(path, cmd, groupName, packageName, packageVersion, charset, force, recursive, package)


<a name="PostPackageUpdate"></a>
# **PostPackageUpdate**
> String! PostPackageUpdate(groupName, packageName, version, path, filter, charset)


<a name="PostSetPassword"></a>
# **PostSetPassword**
> String! PostSetPassword(old, plain, verify)


