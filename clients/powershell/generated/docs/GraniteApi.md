# PSOpenAPITools.PSOpenAPITools/Api.GraniteApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Invoke-SslSetup**](GraniteApi.md#Invoke-SslSetup) | **POST** /libs/granite/security/post/sslSetup.html | 


<a name="Invoke-SslSetup"></a>
# **Invoke-SslSetup**
> String Invoke-SslSetup<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-KeystorePassword] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-KeystorePasswordConfirm] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-TruststorePassword] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-TruststorePasswordConfirm] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-HttpsHostname] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-HttpsPort] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PrivatekeyFile] <System.IO.FileInfo><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CertificateFile] <System.IO.FileInfo><br>



### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure HTTP basic authorization: aemAuth
$Configuration.Username = "YOUR_USERNAME"
$Configuration.Password = "YOUR_PASSWORD"

$KeystorePassword = "MyKeystorePassword" # String | 
$KeystorePasswordConfirm = "MyKeystorePasswordConfirm" # String | 
$TruststorePassword = "MyTruststorePassword" # String | 
$TruststorePasswordConfirm = "MyTruststorePasswordConfirm" # String | 
$HttpsHostname = "MyHttpsHostname" # String | 
$HttpsPort = "MyHttpsPort" # String | 
$PrivatekeyFile =  # System.IO.FileInfo |  (optional)
$CertificateFile =  # System.IO.FileInfo |  (optional)

try {
    $Result = Invoke-SslSetup -KeystorePassword $KeystorePassword -KeystorePasswordConfirm $KeystorePasswordConfirm -TruststorePassword $TruststorePassword -TruststorePasswordConfirm $TruststorePasswordConfirm -HttpsHostname $HttpsHostname -HttpsPort $HttpsPort -PrivatekeyFile $PrivatekeyFile -CertificateFile $CertificateFile
} catch {
    Write-Host ("Exception occured when calling Invoke-SslSetup: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **KeystorePassword** | **String**|  | 
 **KeystorePasswordConfirm** | **String**|  | 
 **TruststorePassword** | **String**|  | 
 **TruststorePasswordConfirm** | **String**|  | 
 **HttpsHostname** | **String**|  | 
 **HttpsPort** | **String**|  | 
 **PrivatekeyFile** | **System.IO.FileInfo****System.IO.FileInfo**|  | [optional] 
 **CertificateFile** | **System.IO.FileInfo****System.IO.FileInfo**|  | [optional] 

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

