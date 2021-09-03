# PSOpenAPITools.PSOpenAPITools/Api.CrxApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Get-CrxdeStatus**](CrxApi.md#Get-CrxdeStatus) | **GET** /crx/server/crx.default/jcr:root/.1.json | 
[**Get-InstallStatus**](CrxApi.md#Get-InstallStatus) | **GET** /crx/packmgr/installstatus.jsp | 
[**Get-PackageManagerServlet**](CrxApi.md#Get-PackageManagerServlet) | **GET** /crx/packmgr/service/script.html | 
[**Submit-PackageService**](CrxApi.md#Submit-PackageService) | **POST** /crx/packmgr/service.jsp | 
[**Submit-PackageServiceJson**](CrxApi.md#Submit-PackageServiceJson) | **POST** /crx/packmgr/service/.json/{path} | 
[**Submit-PackageUpdate**](CrxApi.md#Submit-PackageUpdate) | **POST** /crx/packmgr/update.jsp | 
[**Submit-SetPassword**](CrxApi.md#Submit-SetPassword) | **POST** /crx/explorer/ui/setpassword.jsp | 


<a name="Get-CrxdeStatus"></a>
# **Get-CrxdeStatus**
> String Get-CrxdeStatus<br>



### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure HTTP basic authorization: aemAuth
$Configuration.Username = "YOUR_USERNAME"
$Configuration.Password = "YOUR_PASSWORD"


try {
    $Result = Get-CrxdeStatus
} catch {
    Write-Host ("Exception occured when calling Get-CrxdeStatus: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: plain/text

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Get-InstallStatus"></a>
# **Get-InstallStatus**
> InstallStatus Get-InstallStatus<br>



### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure HTTP basic authorization: aemAuth
$Configuration.Username = "YOUR_USERNAME"
$Configuration.Password = "YOUR_PASSWORD"


try {
    $Result = Get-InstallStatus
} catch {
    Write-Host ("Exception occured when calling Get-InstallStatus: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InstallStatus**](InstallStatus.md) (PSCustomObject)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Get-PackageManagerServlet"></a>
# **Get-PackageManagerServlet**
> void Get-PackageManagerServlet<br>



### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure HTTP basic authorization: aemAuth
$Configuration.Username = "YOUR_USERNAME"
$Configuration.Password = "YOUR_PASSWORD"


try {
    $Result = Get-PackageManagerServlet
} catch {
    Write-Host ("Exception occured when calling Get-PackageManagerServlet: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Submit-PackageService"></a>
# **Submit-PackageService**
> String Submit-PackageService<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Cmd] <String><br>



### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure HTTP basic authorization: aemAuth
$Configuration.Username = "YOUR_USERNAME"
$Configuration.Password = "YOUR_PASSWORD"

$Cmd = "MyCmd" # String | 

try {
    $Result = Submit-PackageService -Cmd $Cmd
} catch {
    Write-Host ("Exception occured when calling Submit-PackageService: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Cmd** | **String**|  | 

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Submit-PackageServiceJson"></a>
# **Submit-PackageServiceJson**
> String Submit-PackageServiceJson<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Path] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Cmd] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-GroupName] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PackageName] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PackageVersion] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Charset] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Force] <System.Nullable[Boolean]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Recursive] <System.Nullable[Boolean]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Package] <System.IO.FileInfo><br>



### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure HTTP basic authorization: aemAuth
$Configuration.Username = "YOUR_USERNAME"
$Configuration.Password = "YOUR_PASSWORD"

$Path = "MyPath" # String | 
$Cmd = "MyCmd" # String | 
$GroupName = "MyGroupName" # String |  (optional)
$PackageName = "MyPackageName" # String |  (optional)
$PackageVersion = "MyPackageVersion" # String |  (optional)
$Charset = "MyCharset" # String |  (optional)
$Force = $true # Boolean |  (optional)
$Recursive = $true # Boolean |  (optional)
$Package =  # System.IO.FileInfo |  (optional)

try {
    $Result = Submit-PackageServiceJson -Path $Path -Cmd $Cmd -GroupName $GroupName -PackageName $PackageName -PackageVersion $PackageVersion -Charset $Charset -Force $Force -Recursive $Recursive -Package $Package
} catch {
    Write-Host ("Exception occured when calling Submit-PackageServiceJson: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Path** | **String**|  | 
 **Cmd** | **String**|  | 
 **GroupName** | **String**|  | [optional] 
 **PackageName** | **String**|  | [optional] 
 **PackageVersion** | **String**|  | [optional] 
 **Charset** | **String**|  | [optional] 
 **Force** | **Boolean**|  | [optional] 
 **Recursive** | **Boolean**|  | [optional] 
 **Package** | **System.IO.FileInfo****System.IO.FileInfo**|  | [optional] 

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Submit-PackageUpdate"></a>
# **Submit-PackageUpdate**
> String Submit-PackageUpdate<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-GroupName] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PackageName] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Version] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Path] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Filter] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Charset] <String><br>



### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure HTTP basic authorization: aemAuth
$Configuration.Username = "YOUR_USERNAME"
$Configuration.Password = "YOUR_PASSWORD"

$GroupName = "MyGroupName" # String | 
$PackageName = "MyPackageName" # String | 
$Version = "MyVersion" # String | 
$Path = "MyPath" # String | 
$Filter = "MyFilter" # String |  (optional)
$Charset = "MyCharset" # String |  (optional)

try {
    $Result = Submit-PackageUpdate -GroupName $GroupName -PackageName $PackageName -Version $Version -Path $Path -Filter $Filter -Charset $Charset
} catch {
    Write-Host ("Exception occured when calling Submit-PackageUpdate: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **GroupName** | **String**|  | 
 **PackageName** | **String**|  | 
 **Version** | **String**|  | 
 **Path** | **String**|  | 
 **Filter** | **String**|  | [optional] 
 **Charset** | **String**|  | [optional] 

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Submit-SetPassword"></a>
# **Submit-SetPassword**
> String Submit-SetPassword<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Old] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Plain] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Verify] <String><br>



### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure HTTP basic authorization: aemAuth
$Configuration.Username = "YOUR_USERNAME"
$Configuration.Password = "YOUR_PASSWORD"

$Old = "MyOld" # String | 
$Plain = "MyPlain" # String | 
$Verify = "MyVerify" # String | 

try {
    $Result = Submit-SetPassword -Old $Old -Plain $Plain -Verify $Verify
} catch {
    Write-Host ("Exception occured when calling Submit-SetPassword: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Old** | **String**|  | 
 **Plain** | **String**|  | 
 **Verify** | **String**|  | 

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

