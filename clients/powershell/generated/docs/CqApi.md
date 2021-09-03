# PSOpenAPITools.PSOpenAPITools/Api.CqApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Get-LoginPage**](CqApi.md#Get-LoginPage) | **GET** /libs/granite/core/content/login.html | 
[**Submit-CqActions**](CqApi.md#Submit-CqActions) | **POST** /.cqactions.html | 


<a name="Get-LoginPage"></a>
# **Get-LoginPage**
> String Get-LoginPage<br>



### Example
```powershell

try {
    $Result = Get-LoginPage
} catch {
    Write-Host ("Exception occured when calling Get-LoginPage: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Submit-CqActions"></a>
# **Submit-CqActions**
> void Submit-CqActions<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AuthorizableId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Changelog] <String><br>



### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure HTTP basic authorization: aemAuth
$Configuration.Username = "YOUR_USERNAME"
$Configuration.Password = "YOUR_PASSWORD"

$AuthorizableId = "MyAuthorizableId" # String | 
$Changelog = "MyChangelog" # String | 

try {
    $Result = Submit-CqActions -AuthorizableId $AuthorizableId -Changelog $Changelog
} catch {
    Write-Host ("Exception occured when calling Submit-CqActions: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AuthorizableId** | **String**|  | 
 **Changelog** | **String**|  | 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

