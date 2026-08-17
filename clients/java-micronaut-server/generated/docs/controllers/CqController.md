# CqController

All URIs are relative to `""`

The controller class is defined in **[CqController.java](../../src/main/java/org/openapitools/controller/CqController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**getLoginPage**](#getLoginPage) | **GET** /libs/granite/core/content/login.html | 
[**postCqActions**](#postCqActions) | **POST** /.cqactions.html | 

<a id="getLoginPage"></a>
# **getLoginPage**
```java
Mono<String> CqController.getLoginPage()
```




### Return type
`String`


### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `text/html`

<a id="postCqActions"></a>
# **postCqActions**
```java
Mono<Object> CqController.postCqActions(authorizableIdchangelog)
```



### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**authorizableId** | `String` |  |
**changelog** | `String` |  |


### Authorization
* **aemAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: Not defined

