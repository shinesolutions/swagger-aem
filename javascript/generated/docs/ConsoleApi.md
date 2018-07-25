# NodeSwaggerAem.ConsoleApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**postBundle**](ConsoleApi.md#postBundle) | **POST** /system/console/bundles/{name} | 
[**postJmxRepository**](ConsoleApi.md#postJmxRepository) | **POST** /system/console/jmx/com.adobe.granite:type&#x3D;Repository/op/{action} | 


<a name="postBundle"></a>
# **postBundle**
> postBundle(name, action)



### Example
```javascript
import NodeSwaggerAem from 'node-swagger-aem';
let defaultClient = NodeSwaggerAem.ApiClient.instance;

// Configure HTTP basic authorization: aemAuth
let aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

let apiInstance = new NodeSwaggerAem.ConsoleApi();

let name = "name_example"; // String | 

let action = "action_example"; // String | 


apiInstance.postBundle(name, action, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
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

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="postJmxRepository"></a>
# **postJmxRepository**
> postJmxRepository(action)



### Example
```javascript
import NodeSwaggerAem from 'node-swagger-aem';
let defaultClient = NodeSwaggerAem.ApiClient.instance;

// Configure HTTP basic authorization: aemAuth
let aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

let apiInstance = new NodeSwaggerAem.ConsoleApi();

let action = "action_example"; // String | 


apiInstance.postJmxRepository(action, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **action** | **String**|  | 

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

