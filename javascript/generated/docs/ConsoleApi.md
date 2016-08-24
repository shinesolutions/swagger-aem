# NodeSwaggerAem.ConsoleApi

All URIs are relative to *http://localhost/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**postBundle**](ConsoleApi.md#postBundle) | **POST** /system/console/bundles/{name} | 
[**postJmxRepository**](ConsoleApi.md#postJmxRepository) | **POST** /system/console/jmx/com.adobe.granite:type=Repository/op/{action} | 


<a name="postBundle"></a>
# **postBundle**
> postBundle(name, action)



### Example
```javascript
var NodeSwaggerAem = require('node-swagger-aem');
var defaultClient = NodeSwaggerAem.ApiClient.default;

// Configure HTTP basic authorization: aemAuth
var aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME'
aemAuth.password = 'YOUR PASSWORD'

var apiInstance = new NodeSwaggerAem.ConsoleApi()

var name = "name_example"; // {String} 

var action = "action_example"; // {String} 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
api.postBundle(name, action, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  | 
 **action** | **String**|  | 

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP reuqest headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="postJmxRepository"></a>
# **postJmxRepository**
> postJmxRepository(action)



### Example
```javascript
var NodeSwaggerAem = require('node-swagger-aem');
var defaultClient = NodeSwaggerAem.ApiClient.default;

// Configure HTTP basic authorization: aemAuth
var aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME'
aemAuth.password = 'YOUR PASSWORD'

var apiInstance = new NodeSwaggerAem.ConsoleApi()

var action = "action_example"; // {String} 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
api.postJmxRepository(action, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **action** | **String**|  | 

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP reuqest headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

