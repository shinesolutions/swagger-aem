# NodeSwaggerAem.CustomApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAemHealthCheck**](CustomApi.md#getAemHealthCheck) | **GET** /system/health | 
[**postConfigAemHealthCheckServlet**](CustomApi.md#postConfigAemHealthCheckServlet) | **POST** /apps/system/config.{runmode}/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck | 
[**postConfigAemPasswordReset**](CustomApi.md#postConfigAemPasswordReset) | **POST** /apps/system/config.{runmode}/com.shinesolutions.aem.passwordreset.Activator | 


<a name="getAemHealthCheck"></a>
# **getAemHealthCheck**
> &#39;String&#39; getAemHealthCheck(opts)



### Example
```javascript
var NodeSwaggerAem = require('node-swagger-aem');
var defaultClient = NodeSwaggerAem.ApiClient.instance;

// Configure HTTP basic authorization: aemAuth
var aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

var apiInstance = new NodeSwaggerAem.CustomApi();

var opts = { 
  'tags': "tags_example", // String | 
  'combineTagsOr': true // Boolean | 
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getAemHealthCheck(opts, callback);
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
var NodeSwaggerAem = require('node-swagger-aem');
var defaultClient = NodeSwaggerAem.ApiClient.instance;

// Configure HTTP basic authorization: aemAuth
var aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

var apiInstance = new NodeSwaggerAem.CustomApi();

var runmode = "runmode_example"; // String | 

var opts = { 
  'bundlesIgnored': ["bundlesIgnored_example"], // [String] | 
  'bundlesIgnoredTypeHint': "bundlesIgnoredTypeHint_example" // String | 
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.postConfigAemHealthCheckServlet(runmode, opts, callback);
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
var NodeSwaggerAem = require('node-swagger-aem');
var defaultClient = NodeSwaggerAem.ApiClient.instance;

// Configure HTTP basic authorization: aemAuth
var aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

var apiInstance = new NodeSwaggerAem.CustomApi();

var runmode = "runmode_example"; // String | 

var opts = { 
  'pwdresetAuthorizables': ["pwdresetAuthorizables_example"], // [String] | 
  'pwdresetAuthorizablesTypeHint': "pwdresetAuthorizablesTypeHint_example" // String | 
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.postConfigAemPasswordReset(runmode, opts, callback);
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

