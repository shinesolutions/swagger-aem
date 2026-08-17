# CustomController

All URIs are relative to `""`

The controller class is defined in **[CustomController.java](../../src/main/java/org/openapitools/controller/CustomController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAemHealthCheck**](#getAemHealthCheck) | **GET** /system/health | 
[**postConfigAemHealthCheckServlet**](#postConfigAemHealthCheckServlet) | **POST** /apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck | 
[**postConfigAemPasswordReset**](#postConfigAemPasswordReset) | **POST** /apps/system/config/com.shinesolutions.aem.passwordreset.Activator | 

<a id="getAemHealthCheck"></a>
# **getAemHealthCheck**
```java
Mono<String> CustomController.getAemHealthCheck(tagscombineTagsOr)
```



### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**tags** | `String` |  | [optional parameter]
**combineTagsOr** | `Boolean` |  | [optional parameter]

### Return type
`String`

### Authorization
* **aemAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="postConfigAemHealthCheckServlet"></a>
# **postConfigAemHealthCheckServlet**
```java
Mono<Object> CustomController.postConfigAemHealthCheckServlet(bundlesIgnoredbundlesIgnoredAtTypeHint)
```



### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**bundlesIgnored** | [**List&lt;String&gt;**](../../docs/models/String.md) |  | [optional parameter]
**bundlesIgnoredAtTypeHint** | `String` |  | [optional parameter]


### Authorization
* **aemAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: Not defined

<a id="postConfigAemPasswordReset"></a>
# **postConfigAemPasswordReset**
```java
Mono<Object> CustomController.postConfigAemPasswordReset(pwdresetAuthorizablespwdresetAuthorizablesAtTypeHint)
```



### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**pwdresetAuthorizables** | [**List&lt;String&gt;**](../../docs/models/String.md) |  | [optional parameter]
**pwdresetAuthorizablesAtTypeHint** | `String` |  | [optional parameter]


### Authorization
* **aemAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: Not defined

