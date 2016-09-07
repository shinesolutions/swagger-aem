# NodeSwaggerAem.CqApi

All URIs are relative to *http://localhost/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**postCqActions**](CqApi.md#postCqActions) | **POST** .cqactions.html | 


<a name="postCqActions"></a>
# **postCqActions**
> postCqActions(authorizableId, changelog)



### Example
```javascript
var NodeSwaggerAem = require('node-swagger-aem');
var defaultClient = NodeSwaggerAem.ApiClient.default;

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
 - **Accept**: text/plain

