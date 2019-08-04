# NodeSwaggerAem.CqApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getLoginPage**](CqApi.md#getLoginPage) | **GET** /libs/granite/core/content/login.html | 
[**postCqActions**](CqApi.md#postCqActions) | **POST** /.cqactions.html | 


<a name="getLoginPage"></a>
# **getLoginPage**
> String getLoginPage()



### Example
```javascript
var NodeSwaggerAem = require('node-swagger-aem');

var apiInstance = new NodeSwaggerAem.CqApi();
var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getLoginPage(callback);
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/html

<a name="postCqActions"></a>
# **postCqActions**
> postCqActions(authorizableId, changelog)



### Example
```javascript
var NodeSwaggerAem = require('node-swagger-aem');
var defaultClient = NodeSwaggerAem.ApiClient.instance;

// Configure HTTP basic authorization: aemAuth
var aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

var apiInstance = new NodeSwaggerAem.CqApi();
var authorizableId = "authorizableId_example"; // String | 
var changelog = "changelog_example"; // String | 
var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.postCqActions(authorizableId, changelog, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorizableId** | **String**|  | 
 **changelog** | **String**|  | 

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

