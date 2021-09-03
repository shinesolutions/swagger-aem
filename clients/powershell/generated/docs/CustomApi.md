# PSOpenAPITools.PSOpenAPITools/Api.CustomApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Get-AemHealthCheck**](CustomApi.md#Get-AemHealthCheck) | **GET** /system/health | 
[**Submit-ConfigAemHealthCheckServlet**](CustomApi.md#Submit-ConfigAemHealthCheckServlet) | **POST** /apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck | 
[**Submit-ConfigAemPasswordReset**](CustomApi.md#Submit-ConfigAemPasswordReset) | **POST** /apps/system/config/com.shinesolutions.aem.passwordreset.Activator | 


<a name="Get-AemHealthCheck"></a>
# **Get-AemHealthCheck**
> String Get-AemHealthCheck<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Tags] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CombineTagsOr] <System.Nullable[Boolean]><br>



### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure HTTP basic authorization: aemAuth
$Configuration.Username = "YOUR_USERNAME"
$Configuration.Password = "YOUR_PASSWORD"

$Tags = "MyTags" # String |  (optional)
$CombineTagsOr = $true # Boolean |  (optional)

try {
    $Result = Get-AemHealthCheck -Tags $Tags -CombineTagsOr $CombineTagsOr
} catch {
    Write-Host ("Exception occured when calling Get-AemHealthCheck: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Tags** | **String**|  | [optional] 
 **CombineTagsOr** | **Boolean**|  | [optional] 

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Submit-ConfigAemHealthCheckServlet"></a>
# **Submit-ConfigAemHealthCheckServlet**
> void Submit-ConfigAemHealthCheckServlet<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-BundlesIgnored] <String[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-BundlesIgnoredTypeHint] <String><br>



### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure HTTP basic authorization: aemAuth
$Configuration.Username = "YOUR_USERNAME"
$Configuration.Password = "YOUR_PASSWORD"

$BundlesIgnored = "MyBundlesIgnored" # String[] |  (optional)
$BundlesIgnoredTypeHint = "MyBundlesIgnoredTypeHint" # String |  (optional)

try {
    $Result = Submit-ConfigAemHealthCheckServlet -BundlesIgnored $BundlesIgnored -BundlesIgnoredTypeHint $BundlesIgnoredTypeHint
} catch {
    Write-Host ("Exception occured when calling Submit-ConfigAemHealthCheckServlet: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **BundlesIgnored** | [**String[]**](String.md)|  | [optional] 
 **BundlesIgnoredTypeHint** | **String**|  | [optional] 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Submit-ConfigAemPasswordReset"></a>
# **Submit-ConfigAemPasswordReset**
> void Submit-ConfigAemPasswordReset<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PwdresetAuthorizables] <String[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PwdresetAuthorizablesTypeHint] <String><br>



### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure HTTP basic authorization: aemAuth
$Configuration.Username = "YOUR_USERNAME"
$Configuration.Password = "YOUR_PASSWORD"

$PwdresetAuthorizables = "MyPwdresetAuthorizables" # String[] |  (optional)
$PwdresetAuthorizablesTypeHint = "MyPwdresetAuthorizablesTypeHint" # String |  (optional)

try {
    $Result = Submit-ConfigAemPasswordReset -PwdresetAuthorizables $PwdresetAuthorizables -PwdresetAuthorizablesTypeHint $PwdresetAuthorizablesTypeHint
} catch {
    Write-Host ("Exception occured when calling Submit-ConfigAemPasswordReset: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **PwdresetAuthorizables** | [**String[]**](String.md)|  | [optional] 
 **PwdresetAuthorizablesTypeHint** | **String**|  | [optional] 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

