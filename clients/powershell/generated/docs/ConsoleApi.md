# PSOpenAPITools.PSOpenAPITools/Api.ConsoleApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Get-AemProductInfo**](ConsoleApi.md#Get-AemProductInfo) | **GET** /system/console/status-productinfo.json | 
[**Get-BundleInfo**](ConsoleApi.md#Get-BundleInfo) | **GET** /system/console/bundles/{name}.json | 
[**Get-ConfigMgr**](ConsoleApi.md#Get-ConfigMgr) | **GET** /system/console/configMgr | 
[**Submit-Bundle**](ConsoleApi.md#Submit-Bundle) | **POST** /system/console/bundles/{name} | 
[**Submit-JmxRepository**](ConsoleApi.md#Submit-JmxRepository) | **POST** /system/console/jmx/com.adobe.granite:type&#x3D;Repository/op/{action} | 
[**Submit-SamlConfiguration**](ConsoleApi.md#Submit-SamlConfiguration) | **POST** /system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler | 


<a name="Get-AemProductInfo"></a>
# **Get-AemProductInfo**
> String[] Get-AemProductInfo<br>



### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure HTTP basic authorization: aemAuth
$Configuration.Username = "YOUR_USERNAME"
$Configuration.Password = "YOUR_PASSWORD"


try {
    $Result = Get-AemProductInfo
} catch {
    Write-Host ("Exception occured when calling Get-AemProductInfo: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String[]**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Get-BundleInfo"></a>
# **Get-BundleInfo**
> BundleInfo Get-BundleInfo<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Name] <String><br>



### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure HTTP basic authorization: aemAuth
$Configuration.Username = "YOUR_USERNAME"
$Configuration.Password = "YOUR_PASSWORD"

$Name = "MyName" # String | 

try {
    $Result = Get-BundleInfo -Name $Name
} catch {
    Write-Host ("Exception occured when calling Get-BundleInfo: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Name** | **String**|  | 

### Return type

[**BundleInfo**](BundleInfo.md) (PSCustomObject)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Get-ConfigMgr"></a>
# **Get-ConfigMgr**
> String Get-ConfigMgr<br>



### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure HTTP basic authorization: aemAuth
$Configuration.Username = "YOUR_USERNAME"
$Configuration.Password = "YOUR_PASSWORD"


try {
    $Result = Get-ConfigMgr
} catch {
    Write-Host ("Exception occured when calling Get-ConfigMgr: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
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
 - **Accept**: text/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Submit-Bundle"></a>
# **Submit-Bundle**
> void Submit-Bundle<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Name] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Action] <String><br>



### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure HTTP basic authorization: aemAuth
$Configuration.Username = "YOUR_USERNAME"
$Configuration.Password = "YOUR_PASSWORD"

$Name = "MyName" # String | 
$Action = "MyAction" # String | 

try {
    $Result = Submit-Bundle -Name $Name -Action $Action
} catch {
    Write-Host ("Exception occured when calling Submit-Bundle: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Name** | **String**|  | 
 **Action** | **String**|  | 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Submit-JmxRepository"></a>
# **Submit-JmxRepository**
> void Submit-JmxRepository<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Action] <String><br>



### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure HTTP basic authorization: aemAuth
$Configuration.Username = "YOUR_USERNAME"
$Configuration.Password = "YOUR_PASSWORD"

$Action = "MyAction" # String | 

try {
    $Result = Submit-JmxRepository -Action $Action
} catch {
    Write-Host ("Exception occured when calling Submit-JmxRepository: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Action** | **String**|  | 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Submit-SamlConfiguration"></a>
# **Submit-SamlConfiguration**
> SamlConfigurationInfo Submit-SamlConfiguration<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Post] <System.Nullable[Boolean]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Apply] <System.Nullable[Boolean]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Delete] <System.Nullable[Boolean]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Action] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Location] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Path] <String[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ServiceRanking] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-IdpUrl] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-IdpCertAlias] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-IdpHttpRedirect] <System.Nullable[Boolean]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ServiceProviderEntityId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AssertionConsumerServiceURL] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-SpPrivateKeyAlias] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-KeyStorePassword] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-DefaultRedirectUrl] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-UserIDAttribute] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-UseEncryption] <System.Nullable[Boolean]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CreateUser] <System.Nullable[Boolean]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AddGroupMemberships] <System.Nullable[Boolean]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-GroupMembershipAttribute] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-DefaultGroups] <String[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-NameIdFormat] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-SynchronizeAttributes] <String[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-HandleLogout] <System.Nullable[Boolean]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-LogoutUrl] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ClockTolerance] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-DigestMethod] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-SignatureMethod] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-UserIntermediatePath] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Propertylist] <String[]><br>



### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure HTTP basic authorization: aemAuth
$Configuration.Username = "YOUR_USERNAME"
$Configuration.Password = "YOUR_PASSWORD"

$Post = $true # Boolean |  (optional)
$Apply = $true # Boolean |  (optional)
$Delete = $true # Boolean |  (optional)
$Action = "MyAction" # String |  (optional)
$Location = "MyLocation" # String |  (optional)
$Path = "MyPath" # String[] |  (optional)
$ServiceRanking = 56 # Int32 |  (optional)
$IdpUrl = "MyIdpUrl" # String |  (optional)
$IdpCertAlias = "MyIdpCertAlias" # String |  (optional)
$IdpHttpRedirect = $true # Boolean |  (optional)
$ServiceProviderEntityId = "MyServiceProviderEntityId" # String |  (optional)
$AssertionConsumerServiceURL = "MyAssertionConsumerServiceURL" # String |  (optional)
$SpPrivateKeyAlias = "MySpPrivateKeyAlias" # String |  (optional)
$KeyStorePassword = "MyKeyStorePassword" # String |  (optional)
$DefaultRedirectUrl = "MyDefaultRedirectUrl" # String |  (optional)
$UserIDAttribute = "MyUserIDAttribute" # String |  (optional)
$UseEncryption = $true # Boolean |  (optional)
$CreateUser = $true # Boolean |  (optional)
$AddGroupMemberships = $true # Boolean |  (optional)
$GroupMembershipAttribute = "MyGroupMembershipAttribute" # String |  (optional)
$DefaultGroups = "MyDefaultGroups" # String[] |  (optional)
$NameIdFormat = "MyNameIdFormat" # String |  (optional)
$SynchronizeAttributes = "MySynchronizeAttributes" # String[] |  (optional)
$HandleLogout = $true # Boolean |  (optional)
$LogoutUrl = "MyLogoutUrl" # String |  (optional)
$ClockTolerance = 56 # Int32 |  (optional)
$DigestMethod = "MyDigestMethod" # String |  (optional)
$SignatureMethod = "MySignatureMethod" # String |  (optional)
$UserIntermediatePath = "MyUserIntermediatePath" # String |  (optional)
$Propertylist = "MyPropertylist" # String[] |  (optional)

try {
    $Result = Submit-SamlConfiguration -Post $Post -Apply $Apply -Delete $Delete -Action $Action -Location $Location -Path $Path -ServiceRanking $ServiceRanking -IdpUrl $IdpUrl -IdpCertAlias $IdpCertAlias -IdpHttpRedirect $IdpHttpRedirect -ServiceProviderEntityId $ServiceProviderEntityId -AssertionConsumerServiceURL $AssertionConsumerServiceURL -SpPrivateKeyAlias $SpPrivateKeyAlias -KeyStorePassword $KeyStorePassword -DefaultRedirectUrl $DefaultRedirectUrl -UserIDAttribute $UserIDAttribute -UseEncryption $UseEncryption -CreateUser $CreateUser -AddGroupMemberships $AddGroupMemberships -GroupMembershipAttribute $GroupMembershipAttribute -DefaultGroups $DefaultGroups -NameIdFormat $NameIdFormat -SynchronizeAttributes $SynchronizeAttributes -HandleLogout $HandleLogout -LogoutUrl $LogoutUrl -ClockTolerance $ClockTolerance -DigestMethod $DigestMethod -SignatureMethod $SignatureMethod -UserIntermediatePath $UserIntermediatePath -Propertylist $Propertylist
} catch {
    Write-Host ("Exception occured when calling Submit-SamlConfiguration: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Post** | **Boolean**|  | [optional] 
 **Apply** | **Boolean**|  | [optional] 
 **Delete** | **Boolean**|  | [optional] 
 **Action** | **String**|  | [optional] 
 **Location** | **String**|  | [optional] 
 **Path** | [**String[]**](String.md)|  | [optional] 
 **ServiceRanking** | **Int32**|  | [optional] 
 **IdpUrl** | **String**|  | [optional] 
 **IdpCertAlias** | **String**|  | [optional] 
 **IdpHttpRedirect** | **Boolean**|  | [optional] 
 **ServiceProviderEntityId** | **String**|  | [optional] 
 **AssertionConsumerServiceURL** | **String**|  | [optional] 
 **SpPrivateKeyAlias** | **String**|  | [optional] 
 **KeyStorePassword** | **String**|  | [optional] 
 **DefaultRedirectUrl** | **String**|  | [optional] 
 **UserIDAttribute** | **String**|  | [optional] 
 **UseEncryption** | **Boolean**|  | [optional] 
 **CreateUser** | **Boolean**|  | [optional] 
 **AddGroupMemberships** | **Boolean**|  | [optional] 
 **GroupMembershipAttribute** | **String**|  | [optional] 
 **DefaultGroups** | [**String[]**](String.md)|  | [optional] 
 **NameIdFormat** | **String**|  | [optional] 
 **SynchronizeAttributes** | [**String[]**](String.md)|  | [optional] 
 **HandleLogout** | **Boolean**|  | [optional] 
 **LogoutUrl** | **String**|  | [optional] 
 **ClockTolerance** | **Int32**|  | [optional] 
 **DigestMethod** | **String**|  | [optional] 
 **SignatureMethod** | **String**|  | [optional] 
 **UserIntermediatePath** | **String**|  | [optional] 
 **Propertylist** | [**String[]**](String.md)|  | [optional] 

### Return type

[**SamlConfigurationInfo**](SamlConfigurationInfo.md) (PSCustomObject)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

