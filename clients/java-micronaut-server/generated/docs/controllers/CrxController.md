# CrxController

All URIs are relative to `""`

The controller class is defined in **[CrxController.java](../../src/main/java/org/openapitools/controller/CrxController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCrxdeStatus**](#getCrxdeStatus) | **GET** /crx/server/crx.default/jcr:root/.1.json | 
[**getInstallStatus**](#getInstallStatus) | **GET** /crx/packmgr/installstatus.jsp | 
[**getPackageManagerServlet**](#getPackageManagerServlet) | **GET** /crx/packmgr/service/script.html | 
[**postPackageService**](#postPackageService) | **POST** /crx/packmgr/service.jsp | 
[**postPackageServiceJson**](#postPackageServiceJson) | **POST** /crx/packmgr/service/.json/{path} | 
[**postPackageUpdate**](#postPackageUpdate) | **POST** /crx/packmgr/update.jsp | 
[**postSetPassword**](#postSetPassword) | **POST** /crx/explorer/ui/setpassword.jsp | 

<a id="getCrxdeStatus"></a>
# **getCrxdeStatus**
```java
Mono<String> CrxController.getCrxdeStatus()
```




### Return type
`String`

### Authorization
* **aemAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `plain/text`

<a id="getInstallStatus"></a>
# **getInstallStatus**
```java
Mono<InstallStatus> CrxController.getInstallStatus()
```




### Return type
[**InstallStatus**](../../docs/models/InstallStatus.md)

### Authorization
* **aemAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="getPackageManagerServlet"></a>
# **getPackageManagerServlet**
```java
Mono<Object> CrxController.getPackageManagerServlet()
```





### Authorization
* **aemAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `text/html`

<a id="postPackageService"></a>
# **postPackageService**
```java
Mono<String> CrxController.postPackageService(cmd)
```



### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**cmd** | `String` |  |

### Return type
`String`

### Authorization
* **aemAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `text/xml`

<a id="postPackageServiceJson"></a>
# **postPackageServiceJson**
```java
Mono<String> CrxController.postPackageServiceJson(pathcmdgroupNamepackageNamepackageVersioncharsetforcerecursive_package)
```



### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**path** | `String` |  |
**cmd** | `String` |  |
**groupName** | `String` |  | [optional parameter]
**packageName** | `String` |  | [optional parameter]
**packageVersion** | `String` |  | [optional parameter]
**charset** | `String` |  | [optional parameter]
**force** | `Boolean` |  | [optional parameter]
**recursive** | `Boolean` |  | [optional parameter]
**_package** | `CompletedFileUpload` |  | [optional parameter]

### Return type
`String`

### Authorization
* **aemAuth**

### HTTP request headers
 - **Accepts Content-Type**: `multipart/form-data`
 - **Produces Content-Type**: `application/json`

<a id="postPackageUpdate"></a>
# **postPackageUpdate**
```java
Mono<String> CrxController.postPackageUpdate(groupNamepackageNameversionpathfiltercharset)
```



### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**groupName** | `String` |  |
**packageName** | `String` |  |
**version** | `String` |  |
**path** | `String` |  |
**filter** | `String` |  | [optional parameter]
**charset** | `String` |  | [optional parameter]

### Return type
`String`

### Authorization
* **aemAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="postSetPassword"></a>
# **postSetPassword**
```java
Mono<String> CrxController.postSetPassword(oldplainverify)
```



### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**old** | `String` |  |
**plain** | `String` |  |
**verify** | `String` |  |

### Return type
`String`

### Authorization
* **aemAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `text/plain`

