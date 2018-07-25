# NodeSwaggerAem.CustomApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAemHealthCheck**](CustomApi.md#getAemHealthCheck) | **GET** /system/health | 
[**postConfigAemHealthCheckServlet**](CustomApi.md#postConfigAemHealthCheckServlet) | **POST** /apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck | 
[**postConfigAemPasswordReset**](CustomApi.md#postConfigAemPasswordReset) | **POST** /apps/system/config/com.shinesolutions.aem.passwordreset.Activator | 


<a name="getAemHealthCheck"></a>
# **getAemHealthCheck**
> &#39;String&#39; getAemHealthCheck(opts)



### Example
```javascript
import NodeSwaggerAem from 'node-swagger-aem';
let defaultClient = NodeSwaggerAem.ApiClient.instance;

// Configure HTTP basic authorization: aemAuth
let aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

let apiInstance = new NodeSwaggerAem.CustomApi();

let opts = { 
  'tags': "tags_example", // String | 
  'combineTagsOr': true // Boolean | 
};

apiInstance.getAemHealthCheck(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tags** | **String**|  | [optional] 
 **combineTagsOr** | **Boolean**|  | [optional] 

### Return type

**&#39;String&#39;**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postConfigAemHealthCheckServlet"></a>
# **postConfigAemHealthCheckServlet**
> postConfigAemHealthCheckServlet(runmode, opts)



### Example
```javascript
import NodeSwaggerAem from 'node-swagger-aem';
let defaultClient = NodeSwaggerAem.ApiClient.instance;

// Configure HTTP basic authorization: aemAuth
let aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

let apiInstance = new NodeSwaggerAem.CustomApi();

let runmode = "runmode_example"; // String | 

let opts = { 
  'bundlesIgnored': ["bundlesIgnored_example"], // [String] | 
  'bundlesIgnoredTypeHint': "bundlesIgnoredTypeHint_example" // String | 
};

apiInstance.postConfigAemHealthCheckServlet(runmode, opts, (error, data, response) => {
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
 **runmode** | **String**|  | 
 **bundlesIgnored** | [**[String]**](String.md)|  | [optional] 
 **bundlesIgnoredTypeHint** | **String**|  | [optional] 

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="postConfigAemPasswordReset"></a>
# **postConfigAemPasswordReset**
> postConfigAemPasswordReset(runmode, opts)



### Example
```javascript
import NodeSwaggerAem from 'node-swagger-aem';
let defaultClient = NodeSwaggerAem.ApiClient.instance;

// Configure HTTP basic authorization: aemAuth
let aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

let apiInstance = new NodeSwaggerAem.CustomApi();

let runmode = "runmode_example"; // String | 

let opts = { 
  'pwdresetAuthorizables': ["pwdresetAuthorizables_example"], // [String] | 
  'pwdresetAuthorizablesTypeHint': "pwdresetAuthorizablesTypeHint_example" // String | 
};

apiInstance.postConfigAemPasswordReset(runmode, opts, (error, data, response) => {
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
 **runmode** | **String**|  | 
 **pwdresetAuthorizables** | [**[String]**](String.md)|  | [optional] 
 **pwdresetAuthorizablesTypeHint** | **String**|  | [optional] 

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

