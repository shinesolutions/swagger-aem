# NodeSwaggerAem.CrxApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getInstallStatus**](CrxApi.md#getInstallStatus) | **GET** /crx/packmgr/installstatus.jsp | 
[**postPackageService**](CrxApi.md#postPackageService) | **POST** /crx/packmgr/service.jsp | 
[**postPackageServiceJson**](CrxApi.md#postPackageServiceJson) | **POST** /crx/packmgr/service/.json/{path} | 
[**postPackageUpdate**](CrxApi.md#postPackageUpdate) | **POST** /crx/packmgr/update.jsp | 
[**postSetPassword**](CrxApi.md#postSetPassword) | **POST** /crx/explorer/ui/setpassword.jsp | 


<a name="getInstallStatus"></a>
# **getInstallStatus**
> InstallStatus getInstallStatus()



### Example
```javascript
var NodeSwaggerAem = require('node-swagger-aem');
var defaultClient = NodeSwaggerAem.ApiClient.instance;

// Configure HTTP basic authorization: aemAuth
var aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

var apiInstance = new NodeSwaggerAem.CrxApi();

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getInstallStatus(callback);
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InstallStatus**](InstallStatus.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postPackageService"></a>
# **postPackageService**
> &#39;String&#39; postPackageService(cmd)



### Example
```javascript
var NodeSwaggerAem = require('node-swagger-aem');
var defaultClient = NodeSwaggerAem.ApiClient.instance;

// Configure HTTP basic authorization: aemAuth
var aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

var apiInstance = new NodeSwaggerAem.CrxApi();

var cmd = "cmd_example"; // String | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.postPackageService(cmd, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cmd** | **String**|  | 

### Return type

**&#39;String&#39;**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/xml

<a name="postPackageServiceJson"></a>
# **postPackageServiceJson**
> &#39;String&#39; postPackageServiceJson(path, cmd, opts)



### Example
```javascript
var NodeSwaggerAem = require('node-swagger-aem');
var defaultClient = NodeSwaggerAem.ApiClient.instance;

// Configure HTTP basic authorization: aemAuth
var aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

var apiInstance = new NodeSwaggerAem.CrxApi();

var path = "path_example"; // String | 

var cmd = "cmd_example"; // String | 

var opts = { 
  'groupName': "groupName_example", // String | 
  'packageName': "packageName_example", // String | 
  'packageVersion': "packageVersion_example", // String | 
  'charset_': "charset__example", // String | 
  'force': true, // Boolean | 
  'recursive': true, // Boolean | 
  '_package': "/path/to/file.txt" // File | 
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.postPackageServiceJson(path, cmd, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**|  | 
 **cmd** | **String**|  | 
 **groupName** | **String**|  | [optional] 
 **packageName** | **String**|  | [optional] 
 **packageVersion** | **String**|  | [optional] 
 **charset_** | **String**|  | [optional] 
 **force** | **Boolean**|  | [optional] 
 **recursive** | **Boolean**|  | [optional] 
 **_package** | **File**|  | [optional] 

### Return type

**&#39;String&#39;**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="postPackageUpdate"></a>
# **postPackageUpdate**
> &#39;String&#39; postPackageUpdate(groupName, packageName, version, path, opts)



### Example
```javascript
var NodeSwaggerAem = require('node-swagger-aem');
var defaultClient = NodeSwaggerAem.ApiClient.instance;

// Configure HTTP basic authorization: aemAuth
var aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

var apiInstance = new NodeSwaggerAem.CrxApi();

var groupName = "groupName_example"; // String | 

var packageName = "packageName_example"; // String | 

var version = "version_example"; // String | 

var path = "path_example"; // String | 

var opts = { 
  'filter': "filter_example", // String | 
  'charset_': "charset__example" // String | 
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.postPackageUpdate(groupName, packageName, version, path, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupName** | **String**|  | 
 **packageName** | **String**|  | 
 **version** | **String**|  | 
 **path** | **String**|  | 
 **filter** | **String**|  | [optional] 
 **charset_** | **String**|  | [optional] 

### Return type

**&#39;String&#39;**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postSetPassword"></a>
# **postSetPassword**
> &#39;String&#39; postSetPassword(old, plain, verify)



### Example
```javascript
var NodeSwaggerAem = require('node-swagger-aem');
var defaultClient = NodeSwaggerAem.ApiClient.instance;

// Configure HTTP basic authorization: aemAuth
var aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

var apiInstance = new NodeSwaggerAem.CrxApi();

var old = "old_example"; // String | 

var plain = "plain_example"; // String | 

var verify = "verify_example"; // String | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.postSetPassword(old, plain, verify, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **old** | **String**|  | 
 **plain** | **String**|  | 
 **verify** | **String**|  | 

### Return type

**&#39;String&#39;**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

