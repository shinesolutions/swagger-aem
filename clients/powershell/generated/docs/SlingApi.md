# PSOpenAPITools.PSOpenAPITools/Api.SlingApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Invoke-DeleteAgent**](SlingApi.md#Invoke-DeleteAgent) | **DELETE** /etc/replication/agents.{runmode}/{name} | 
[**Invoke-DeleteNode**](SlingApi.md#Invoke-DeleteNode) | **DELETE** /{path}/{name} | 
[**Get-Agent**](SlingApi.md#Get-Agent) | **GET** /etc/replication/agents.{runmode}/{name} | 
[**Get-Agents**](SlingApi.md#Get-Agents) | **GET** /etc/replication/agents.{runmode}.-1.json | 
[**Get-AuthorizableKeystore**](SlingApi.md#Get-AuthorizableKeystore) | **GET** /{intermediatePath}/{authorizableId}.ks.json | 
[**Get-Keystore**](SlingApi.md#Get-Keystore) | **GET** /{intermediatePath}/{authorizableId}/keystore/store.p12 | 
[**Get-Node**](SlingApi.md#Get-Node) | **GET** /{path}/{name} | 
[**Get-Package**](SlingApi.md#Get-Package) | **GET** /etc/packages/{group}/{name}-{version}.zip | 
[**Get-PackageFilter**](SlingApi.md#Get-PackageFilter) | **GET** /etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json | 
[**Get-Query**](SlingApi.md#Get-Query) | **GET** /bin/querybuilder.json | 
[**Get-Truststore**](SlingApi.md#Get-Truststore) | **GET** /etc/truststore/truststore.p12 | 
[**Get-TruststoreInfo**](SlingApi.md#Get-TruststoreInfo) | **GET** /libs/granite/security/truststore.json | 
[**Submit-Agent**](SlingApi.md#Submit-Agent) | **POST** /etc/replication/agents.{runmode}/{name} | 
[**Submit-AuthorizableKeystore**](SlingApi.md#Submit-AuthorizableKeystore) | **POST** /{intermediatePath}/{authorizableId}.ks.html | 
[**Submit-Authorizables**](SlingApi.md#Submit-Authorizables) | **POST** /libs/granite/security/post/authorizables | 
[**Submit-ConfigAdobeGraniteSamlAuthenticationHandler**](SlingApi.md#Submit-ConfigAdobeGraniteSamlAuthenticationHandler) | **POST** /apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config | 
[**Submit-ConfigApacheFelixJettyBasedHttpService**](SlingApi.md#Submit-ConfigApacheFelixJettyBasedHttpService) | **POST** /apps/system/config/org.apache.felix.http | 
[**Submit-ConfigApacheHttpComponentsProxyConfiguration**](SlingApi.md#Submit-ConfigApacheHttpComponentsProxyConfiguration) | **POST** /apps/system/config/org.apache.http.proxyconfigurator.config | 
[**Submit-ConfigApacheSlingDavExServlet**](SlingApi.md#Submit-ConfigApacheSlingDavExServlet) | **POST** /apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet | 
[**Submit-ConfigApacheSlingGetServlet**](SlingApi.md#Submit-ConfigApacheSlingGetServlet) | **POST** /apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet | 
[**Submit-ConfigApacheSlingReferrerFilter**](SlingApi.md#Submit-ConfigApacheSlingReferrerFilter) | **POST** /apps/system/config/org.apache.sling.security.impl.ReferrerFilter | 
[**Submit-ConfigProperty**](SlingApi.md#Submit-ConfigProperty) | **POST** /apps/system/config/{configNodeName} | 
[**Submit-Node**](SlingApi.md#Submit-Node) | **POST** /{path}/{name} | 
[**Submit-NodeRw**](SlingApi.md#Submit-NodeRw) | **POST** /{path}/{name}.rw.html | 
[**Submit-Path**](SlingApi.md#Submit-Path) | **POST** /{path}/ | 
[**Submit-Query**](SlingApi.md#Submit-Query) | **POST** /bin/querybuilder.json | 
[**Submit-TreeActivation**](SlingApi.md#Submit-TreeActivation) | **POST** /etc/replication/treeactivation.html | 
[**Submit-Truststore**](SlingApi.md#Submit-Truststore) | **POST** /libs/granite/security/post/truststore | 
[**Submit-TruststorePKCS12**](SlingApi.md#Submit-TruststorePKCS12) | **POST** /etc/truststore | 


<a name="Invoke-DeleteAgent"></a>
# **Invoke-DeleteAgent**
> void Invoke-DeleteAgent<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Runmode] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Name] <String><br>



### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure HTTP basic authorization: aemAuth
$Configuration.Username = "YOUR_USERNAME"
$Configuration.Password = "YOUR_PASSWORD"

$Runmode = "MyRunmode" # String | 
$Name = "MyName" # String | 

try {
    $Result = Invoke-DeleteAgent -Runmode $Runmode -Name $Name
} catch {
    Write-Host ("Exception occured when calling Invoke-DeleteAgent: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Runmode** | **String**|  | 
 **Name** | **String**|  | 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Invoke-DeleteNode"></a>
# **Invoke-DeleteNode**
> void Invoke-DeleteNode<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Path] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Name] <String><br>



### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure HTTP basic authorization: aemAuth
$Configuration.Username = "YOUR_USERNAME"
$Configuration.Password = "YOUR_PASSWORD"

$Path = "MyPath" # String | 
$Name = "MyName" # String | 

try {
    $Result = Invoke-DeleteNode -Path $Path -Name $Name
} catch {
    Write-Host ("Exception occured when calling Invoke-DeleteNode: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Path** | **String**|  | 
 **Name** | **String**|  | 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Get-Agent"></a>
# **Get-Agent**
> void Get-Agent<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Runmode] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Name] <String><br>



### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure HTTP basic authorization: aemAuth
$Configuration.Username = "YOUR_USERNAME"
$Configuration.Password = "YOUR_PASSWORD"

$Runmode = "MyRunmode" # String | 
$Name = "MyName" # String | 

try {
    $Result = Get-Agent -Runmode $Runmode -Name $Name
} catch {
    Write-Host ("Exception occured when calling Get-Agent: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Runmode** | **String**|  | 
 **Name** | **String**|  | 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Get-Agents"></a>
# **Get-Agents**
> String Get-Agents<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Runmode] <String><br>



### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure HTTP basic authorization: aemAuth
$Configuration.Username = "YOUR_USERNAME"
$Configuration.Password = "YOUR_PASSWORD"

$Runmode = "MyRunmode" # String | 

try {
    $Result = Get-Agents -Runmode $Runmode
} catch {
    Write-Host ("Exception occured when calling Get-Agents: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Runmode** | **String**|  | 

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Get-AuthorizableKeystore"></a>
# **Get-AuthorizableKeystore**
> KeystoreInfo Get-AuthorizableKeystore<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-IntermediatePath] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AuthorizableId] <String><br>



### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure HTTP basic authorization: aemAuth
$Configuration.Username = "YOUR_USERNAME"
$Configuration.Password = "YOUR_PASSWORD"

$IntermediatePath = "MyIntermediatePath" # String | 
$AuthorizableId = "MyAuthorizableId" # String | 

try {
    $Result = Get-AuthorizableKeystore -IntermediatePath $IntermediatePath -AuthorizableId $AuthorizableId
} catch {
    Write-Host ("Exception occured when calling Get-AuthorizableKeystore: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **IntermediatePath** | **String**|  | 
 **AuthorizableId** | **String**|  | 

### Return type

[**KeystoreInfo**](KeystoreInfo.md) (PSCustomObject)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Get-Keystore"></a>
# **Get-Keystore**
> System.IO.FileInfo Get-Keystore<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-IntermediatePath] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AuthorizableId] <String><br>



### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure HTTP basic authorization: aemAuth
$Configuration.Username = "YOUR_USERNAME"
$Configuration.Password = "YOUR_PASSWORD"

$IntermediatePath = "MyIntermediatePath" # String | 
$AuthorizableId = "MyAuthorizableId" # String | 

try {
    $Result = Get-Keystore -IntermediatePath $IntermediatePath -AuthorizableId $AuthorizableId
} catch {
    Write-Host ("Exception occured when calling Get-Keystore: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **IntermediatePath** | **String**|  | 
 **AuthorizableId** | **String**|  | 

### Return type

**System.IO.FileInfo**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Get-Node"></a>
# **Get-Node**
> void Get-Node<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Path] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Name] <String><br>



### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure HTTP basic authorization: aemAuth
$Configuration.Username = "YOUR_USERNAME"
$Configuration.Password = "YOUR_PASSWORD"

$Path = "MyPath" # String | 
$Name = "MyName" # String | 

try {
    $Result = Get-Node -Path $Path -Name $Name
} catch {
    Write-Host ("Exception occured when calling Get-Node: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Path** | **String**|  | 
 **Name** | **String**|  | 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Get-Package"></a>
# **Get-Package**
> System.IO.FileInfo Get-Package<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Group] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Name] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Version] <String><br>



### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure HTTP basic authorization: aemAuth
$Configuration.Username = "YOUR_USERNAME"
$Configuration.Password = "YOUR_PASSWORD"

$Group = "MyGroup" # String | 
$Name = "MyName" # String | 
$Version = "MyVersion" # String | 

try {
    $Result = Get-Package -Group $Group -Name $Name -Version $Version
} catch {
    Write-Host ("Exception occured when calling Get-Package: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Group** | **String**|  | 
 **Name** | **String**|  | 
 **Version** | **String**|  | 

### Return type

**System.IO.FileInfo**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Get-PackageFilter"></a>
# **Get-PackageFilter**
> String Get-PackageFilter<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Group] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Name] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Version] <String><br>



### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure HTTP basic authorization: aemAuth
$Configuration.Username = "YOUR_USERNAME"
$Configuration.Password = "YOUR_PASSWORD"

$Group = "MyGroup" # String | 
$Name = "MyName" # String | 
$Version = "MyVersion" # String | 

try {
    $Result = Get-PackageFilter -Group $Group -Name $Name -Version $Version
} catch {
    Write-Host ("Exception occured when calling Get-PackageFilter: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Group** | **String**|  | 
 **Name** | **String**|  | 
 **Version** | **String**|  | 

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Get-Query"></a>
# **Get-Query**
> String Get-Query<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Path] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PLimit] <Decimal><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Var1Property] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Var1PropertyValue] <String><br>



### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure HTTP basic authorization: aemAuth
$Configuration.Username = "YOUR_USERNAME"
$Configuration.Password = "YOUR_PASSWORD"

$Path = "MyPath" # String | 
$PLimit = 8.14 # Decimal | 
$Var1Property = "MyVar1Property" # String | 
$Var1PropertyValue = "MyVar1PropertyValue" # String | 

try {
    $Result = Get-Query -Path $Path -PLimit $PLimit -Var1Property $Var1Property -Var1PropertyValue $Var1PropertyValue
} catch {
    Write-Host ("Exception occured when calling Get-Query: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Path** | **String**|  | 
 **PLimit** | **Decimal**|  | 
 **Var1Property** | **String**|  | 
 **Var1PropertyValue** | **String**|  | 

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Get-Truststore"></a>
# **Get-Truststore**
> System.IO.FileInfo Get-Truststore<br>



### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure HTTP basic authorization: aemAuth
$Configuration.Username = "YOUR_USERNAME"
$Configuration.Password = "YOUR_PASSWORD"


try {
    $Result = Get-Truststore
} catch {
    Write-Host ("Exception occured when calling Get-Truststore: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**System.IO.FileInfo**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Get-TruststoreInfo"></a>
# **Get-TruststoreInfo**
> TruststoreInfo Get-TruststoreInfo<br>



### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure HTTP basic authorization: aemAuth
$Configuration.Username = "YOUR_USERNAME"
$Configuration.Password = "YOUR_PASSWORD"


try {
    $Result = Get-TruststoreInfo
} catch {
    Write-Host ("Exception occured when calling Get-TruststoreInfo: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**TruststoreInfo**](TruststoreInfo.md) (PSCustomObject)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Submit-Agent"></a>
# **Submit-Agent**
> void Submit-Agent<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Runmode] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Name] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-JcrcontentCqdistribute] <System.Nullable[Boolean]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-JcrcontentCqdistributeTypeHint] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-JcrcontentCqname] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-JcrcontentCqtemplate] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-JcrcontentEnabled] <System.Nullable[Boolean]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-JcrcontentJcrdescription] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-JcrcontentJcrlastModified] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-JcrcontentJcrlastModifiedBy] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-JcrcontentJcrmixinTypes] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-JcrcontentJcrtitle] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-JcrcontentLogLevel] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-JcrcontentNoStatusUpdate] <System.Nullable[Boolean]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-JcrcontentNoVersioning] <System.Nullable[Boolean]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-JcrcontentProtocolConnectTimeout] <System.Nullable[Decimal]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-JcrcontentProtocolHTTPConnectionClosed] <System.Nullable[Boolean]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-JcrcontentProtocolHTTPExpired] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-JcrcontentProtocolHTTPHeaders] <String[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-JcrcontentProtocolHTTPHeadersTypeHint] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-JcrcontentProtocolHTTPMethod] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-JcrcontentProtocolHTTPSRelaxed] <System.Nullable[Boolean]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-JcrcontentProtocolInterface] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-JcrcontentProtocolSocketTimeout] <System.Nullable[Decimal]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-JcrcontentProtocolVersion] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-JcrcontentProxyNTLMDomain] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-JcrcontentProxyNTLMHost] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-JcrcontentProxyHost] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-JcrcontentProxyPassword] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-JcrcontentProxyPort] <System.Nullable[Decimal]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-JcrcontentProxyUser] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-JcrcontentQueueBatchMaxSize] <System.Nullable[Decimal]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-JcrcontentQueueBatchMode] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-JcrcontentQueueBatchWaitTime] <System.Nullable[Decimal]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-JcrcontentRetryDelay] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-JcrcontentReverseReplication] <System.Nullable[Boolean]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-JcrcontentSerializationType] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-JcrcontentSlingresourceType] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-JcrcontentSsl] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-JcrcontentTransportNTLMDomain] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-JcrcontentTransportNTLMHost] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-JcrcontentTransportPassword] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-JcrcontentTransportUri] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-JcrcontentTransportUser] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-JcrcontentTriggerDistribute] <System.Nullable[Boolean]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-JcrcontentTriggerModified] <System.Nullable[Boolean]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-JcrcontentTriggerOnOffTime] <System.Nullable[Boolean]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-JcrcontentTriggerReceive] <System.Nullable[Boolean]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-JcrcontentTriggerSpecific] <System.Nullable[Boolean]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-JcrcontentUserId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-JcrprimaryType] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Operation] <String><br>



### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure HTTP basic authorization: aemAuth
$Configuration.Username = "YOUR_USERNAME"
$Configuration.Password = "YOUR_PASSWORD"

$Runmode = "MyRunmode" # String | 
$Name = "MyName" # String | 
$JcrcontentCqdistribute = $true # Boolean |  (optional)
$JcrcontentCqdistributeTypeHint = "MyJcrcontentCqdistributeTypeHint" # String |  (optional)
$JcrcontentCqname = "MyJcrcontentCqname" # String |  (optional)
$JcrcontentCqtemplate = "MyJcrcontentCqtemplate" # String |  (optional)
$JcrcontentEnabled = $true # Boolean |  (optional)
$JcrcontentJcrdescription = "MyJcrcontentJcrdescription" # String |  (optional)
$JcrcontentJcrlastModified = "MyJcrcontentJcrlastModified" # String |  (optional)
$JcrcontentJcrlastModifiedBy = "MyJcrcontentJcrlastModifiedBy" # String |  (optional)
$JcrcontentJcrmixinTypes = "MyJcrcontentJcrmixinTypes" # String |  (optional)
$JcrcontentJcrtitle = "MyJcrcontentJcrtitle" # String |  (optional)
$JcrcontentLogLevel = "MyJcrcontentLogLevel" # String |  (optional)
$JcrcontentNoStatusUpdate = $true # Boolean |  (optional)
$JcrcontentNoVersioning = $true # Boolean |  (optional)
$JcrcontentProtocolConnectTimeout = 8.14 # Decimal |  (optional)
$JcrcontentProtocolHTTPConnectionClosed = $true # Boolean |  (optional)
$JcrcontentProtocolHTTPExpired = "MyJcrcontentProtocolHTTPExpired" # String |  (optional)
$JcrcontentProtocolHTTPHeaders = "MyJcrcontentProtocolHTTPHeaders" # String[] |  (optional)
$JcrcontentProtocolHTTPHeadersTypeHint = "MyJcrcontentProtocolHTTPHeadersTypeHint" # String |  (optional)
$JcrcontentProtocolHTTPMethod = "MyJcrcontentProtocolHTTPMethod" # String |  (optional)
$JcrcontentProtocolHTTPSRelaxed = $true # Boolean |  (optional)
$JcrcontentProtocolInterface = "MyJcrcontentProtocolInterface" # String |  (optional)
$JcrcontentProtocolSocketTimeout = 8.14 # Decimal |  (optional)
$JcrcontentProtocolVersion = "MyJcrcontentProtocolVersion" # String |  (optional)
$JcrcontentProxyNTLMDomain = "MyJcrcontentProxyNTLMDomain" # String |  (optional)
$JcrcontentProxyNTLMHost = "MyJcrcontentProxyNTLMHost" # String |  (optional)
$JcrcontentProxyHost = "MyJcrcontentProxyHost" # String |  (optional)
$JcrcontentProxyPassword = "MyJcrcontentProxyPassword" # String |  (optional)
$JcrcontentProxyPort = 8.14 # Decimal |  (optional)
$JcrcontentProxyUser = "MyJcrcontentProxyUser" # String |  (optional)
$JcrcontentQueueBatchMaxSize = 8.14 # Decimal |  (optional)
$JcrcontentQueueBatchMode = "MyJcrcontentQueueBatchMode" # String |  (optional)
$JcrcontentQueueBatchWaitTime = 8.14 # Decimal |  (optional)
$JcrcontentRetryDelay = "MyJcrcontentRetryDelay" # String |  (optional)
$JcrcontentReverseReplication = $true # Boolean |  (optional)
$JcrcontentSerializationType = "MyJcrcontentSerializationType" # String |  (optional)
$JcrcontentSlingresourceType = "MyJcrcontentSlingresourceType" # String |  (optional)
$JcrcontentSsl = "MyJcrcontentSsl" # String |  (optional)
$JcrcontentTransportNTLMDomain = "MyJcrcontentTransportNTLMDomain" # String |  (optional)
$JcrcontentTransportNTLMHost = "MyJcrcontentTransportNTLMHost" # String |  (optional)
$JcrcontentTransportPassword = "MyJcrcontentTransportPassword" # String |  (optional)
$JcrcontentTransportUri = "MyJcrcontentTransportUri" # String |  (optional)
$JcrcontentTransportUser = "MyJcrcontentTransportUser" # String |  (optional)
$JcrcontentTriggerDistribute = $true # Boolean |  (optional)
$JcrcontentTriggerModified = $true # Boolean |  (optional)
$JcrcontentTriggerOnOffTime = $true # Boolean |  (optional)
$JcrcontentTriggerReceive = $true # Boolean |  (optional)
$JcrcontentTriggerSpecific = $true # Boolean |  (optional)
$JcrcontentUserId = "MyJcrcontentUserId" # String |  (optional)
$JcrprimaryType = "MyJcrprimaryType" # String |  (optional)
$Operation = "MyOperation" # String |  (optional)

try {
    $Result = Submit-Agent -Runmode $Runmode -Name $Name -JcrcontentCqdistribute $JcrcontentCqdistribute -JcrcontentCqdistributeTypeHint $JcrcontentCqdistributeTypeHint -JcrcontentCqname $JcrcontentCqname -JcrcontentCqtemplate $JcrcontentCqtemplate -JcrcontentEnabled $JcrcontentEnabled -JcrcontentJcrdescription $JcrcontentJcrdescription -JcrcontentJcrlastModified $JcrcontentJcrlastModified -JcrcontentJcrlastModifiedBy $JcrcontentJcrlastModifiedBy -JcrcontentJcrmixinTypes $JcrcontentJcrmixinTypes -JcrcontentJcrtitle $JcrcontentJcrtitle -JcrcontentLogLevel $JcrcontentLogLevel -JcrcontentNoStatusUpdate $JcrcontentNoStatusUpdate -JcrcontentNoVersioning $JcrcontentNoVersioning -JcrcontentProtocolConnectTimeout $JcrcontentProtocolConnectTimeout -JcrcontentProtocolHTTPConnectionClosed $JcrcontentProtocolHTTPConnectionClosed -JcrcontentProtocolHTTPExpired $JcrcontentProtocolHTTPExpired -JcrcontentProtocolHTTPHeaders $JcrcontentProtocolHTTPHeaders -JcrcontentProtocolHTTPHeadersTypeHint $JcrcontentProtocolHTTPHeadersTypeHint -JcrcontentProtocolHTTPMethod $JcrcontentProtocolHTTPMethod -JcrcontentProtocolHTTPSRelaxed $JcrcontentProtocolHTTPSRelaxed -JcrcontentProtocolInterface $JcrcontentProtocolInterface -JcrcontentProtocolSocketTimeout $JcrcontentProtocolSocketTimeout -JcrcontentProtocolVersion $JcrcontentProtocolVersion -JcrcontentProxyNTLMDomain $JcrcontentProxyNTLMDomain -JcrcontentProxyNTLMHost $JcrcontentProxyNTLMHost -JcrcontentProxyHost $JcrcontentProxyHost -JcrcontentProxyPassword $JcrcontentProxyPassword -JcrcontentProxyPort $JcrcontentProxyPort -JcrcontentProxyUser $JcrcontentProxyUser -JcrcontentQueueBatchMaxSize $JcrcontentQueueBatchMaxSize -JcrcontentQueueBatchMode $JcrcontentQueueBatchMode -JcrcontentQueueBatchWaitTime $JcrcontentQueueBatchWaitTime -JcrcontentRetryDelay $JcrcontentRetryDelay -JcrcontentReverseReplication $JcrcontentReverseReplication -JcrcontentSerializationType $JcrcontentSerializationType -JcrcontentSlingresourceType $JcrcontentSlingresourceType -JcrcontentSsl $JcrcontentSsl -JcrcontentTransportNTLMDomain $JcrcontentTransportNTLMDomain -JcrcontentTransportNTLMHost $JcrcontentTransportNTLMHost -JcrcontentTransportPassword $JcrcontentTransportPassword -JcrcontentTransportUri $JcrcontentTransportUri -JcrcontentTransportUser $JcrcontentTransportUser -JcrcontentTriggerDistribute $JcrcontentTriggerDistribute -JcrcontentTriggerModified $JcrcontentTriggerModified -JcrcontentTriggerOnOffTime $JcrcontentTriggerOnOffTime -JcrcontentTriggerReceive $JcrcontentTriggerReceive -JcrcontentTriggerSpecific $JcrcontentTriggerSpecific -JcrcontentUserId $JcrcontentUserId -JcrprimaryType $JcrprimaryType -Operation $Operation
} catch {
    Write-Host ("Exception occured when calling Submit-Agent: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Runmode** | **String**|  | 
 **Name** | **String**|  | 
 **JcrcontentCqdistribute** | **Boolean**|  | [optional] 
 **JcrcontentCqdistributeTypeHint** | **String**|  | [optional] 
 **JcrcontentCqname** | **String**|  | [optional] 
 **JcrcontentCqtemplate** | **String**|  | [optional] 
 **JcrcontentEnabled** | **Boolean**|  | [optional] 
 **JcrcontentJcrdescription** | **String**|  | [optional] 
 **JcrcontentJcrlastModified** | **String**|  | [optional] 
 **JcrcontentJcrlastModifiedBy** | **String**|  | [optional] 
 **JcrcontentJcrmixinTypes** | **String**|  | [optional] 
 **JcrcontentJcrtitle** | **String**|  | [optional] 
 **JcrcontentLogLevel** | **String**|  | [optional] 
 **JcrcontentNoStatusUpdate** | **Boolean**|  | [optional] 
 **JcrcontentNoVersioning** | **Boolean**|  | [optional] 
 **JcrcontentProtocolConnectTimeout** | **Decimal**|  | [optional] 
 **JcrcontentProtocolHTTPConnectionClosed** | **Boolean**|  | [optional] 
 **JcrcontentProtocolHTTPExpired** | **String**|  | [optional] 
 **JcrcontentProtocolHTTPHeaders** | [**String[]**](String.md)|  | [optional] 
 **JcrcontentProtocolHTTPHeadersTypeHint** | **String**|  | [optional] 
 **JcrcontentProtocolHTTPMethod** | **String**|  | [optional] 
 **JcrcontentProtocolHTTPSRelaxed** | **Boolean**|  | [optional] 
 **JcrcontentProtocolInterface** | **String**|  | [optional] 
 **JcrcontentProtocolSocketTimeout** | **Decimal**|  | [optional] 
 **JcrcontentProtocolVersion** | **String**|  | [optional] 
 **JcrcontentProxyNTLMDomain** | **String**|  | [optional] 
 **JcrcontentProxyNTLMHost** | **String**|  | [optional] 
 **JcrcontentProxyHost** | **String**|  | [optional] 
 **JcrcontentProxyPassword** | **String**|  | [optional] 
 **JcrcontentProxyPort** | **Decimal**|  | [optional] 
 **JcrcontentProxyUser** | **String**|  | [optional] 
 **JcrcontentQueueBatchMaxSize** | **Decimal**|  | [optional] 
 **JcrcontentQueueBatchMode** | **String**|  | [optional] 
 **JcrcontentQueueBatchWaitTime** | **Decimal**|  | [optional] 
 **JcrcontentRetryDelay** | **String**|  | [optional] 
 **JcrcontentReverseReplication** | **Boolean**|  | [optional] 
 **JcrcontentSerializationType** | **String**|  | [optional] 
 **JcrcontentSlingresourceType** | **String**|  | [optional] 
 **JcrcontentSsl** | **String**|  | [optional] 
 **JcrcontentTransportNTLMDomain** | **String**|  | [optional] 
 **JcrcontentTransportNTLMHost** | **String**|  | [optional] 
 **JcrcontentTransportPassword** | **String**|  | [optional] 
 **JcrcontentTransportUri** | **String**|  | [optional] 
 **JcrcontentTransportUser** | **String**|  | [optional] 
 **JcrcontentTriggerDistribute** | **Boolean**|  | [optional] 
 **JcrcontentTriggerModified** | **Boolean**|  | [optional] 
 **JcrcontentTriggerOnOffTime** | **Boolean**|  | [optional] 
 **JcrcontentTriggerReceive** | **Boolean**|  | [optional] 
 **JcrcontentTriggerSpecific** | **Boolean**|  | [optional] 
 **JcrcontentUserId** | **String**|  | [optional] 
 **JcrprimaryType** | **String**|  | [optional] 
 **Operation** | **String**|  | [optional] 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Submit-AuthorizableKeystore"></a>
# **Submit-AuthorizableKeystore**
> KeystoreInfo Submit-AuthorizableKeystore<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-IntermediatePath] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AuthorizableId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Operation] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CurrentPassword] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-NewPassword] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-RePassword] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-KeyPassword] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-KeyStorePass] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Alias] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-NewAlias] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-RemoveAlias] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CertChain] <System.IO.FileInfo><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Pk] <System.IO.FileInfo><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-KeyStore] <System.IO.FileInfo><br>



### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure HTTP basic authorization: aemAuth
$Configuration.Username = "YOUR_USERNAME"
$Configuration.Password = "YOUR_PASSWORD"

$IntermediatePath = "MyIntermediatePath" # String | 
$AuthorizableId = "MyAuthorizableId" # String | 
$Operation = "MyOperation" # String |  (optional)
$CurrentPassword = "MyCurrentPassword" # String |  (optional)
$NewPassword = "MyNewPassword" # String |  (optional)
$RePassword = "MyRePassword" # String |  (optional)
$KeyPassword = "MyKeyPassword" # String |  (optional)
$KeyStorePass = "MyKeyStorePass" # String |  (optional)
$Alias = "MyAlias" # String |  (optional)
$NewAlias = "MyNewAlias" # String |  (optional)
$RemoveAlias = "MyRemoveAlias" # String |  (optional)
$CertChain =  # System.IO.FileInfo |  (optional)
$Pk =  # System.IO.FileInfo |  (optional)
$KeyStore =  # System.IO.FileInfo |  (optional)

try {
    $Result = Submit-AuthorizableKeystore -IntermediatePath $IntermediatePath -AuthorizableId $AuthorizableId -Operation $Operation -CurrentPassword $CurrentPassword -NewPassword $NewPassword -RePassword $RePassword -KeyPassword $KeyPassword -KeyStorePass $KeyStorePass -Alias $Alias -NewAlias $NewAlias -RemoveAlias $RemoveAlias -CertChain $CertChain -Pk $Pk -KeyStore $KeyStore
} catch {
    Write-Host ("Exception occured when calling Submit-AuthorizableKeystore: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **IntermediatePath** | **String**|  | 
 **AuthorizableId** | **String**|  | 
 **Operation** | **String**|  | [optional] 
 **CurrentPassword** | **String**|  | [optional] 
 **NewPassword** | **String**|  | [optional] 
 **RePassword** | **String**|  | [optional] 
 **KeyPassword** | **String**|  | [optional] 
 **KeyStorePass** | **String**|  | [optional] 
 **Alias** | **String**|  | [optional] 
 **NewAlias** | **String**|  | [optional] 
 **RemoveAlias** | **String**|  | [optional] 
 **CertChain** | **System.IO.FileInfo****System.IO.FileInfo**|  | [optional] 
 **Pk** | **System.IO.FileInfo****System.IO.FileInfo**|  | [optional] 
 **KeyStore** | **System.IO.FileInfo****System.IO.FileInfo**|  | [optional] 

### Return type

[**KeystoreInfo**](KeystoreInfo.md) (PSCustomObject)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Submit-Authorizables"></a>
# **Submit-Authorizables**
> String Submit-Authorizables<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AuthorizableId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-IntermediatePath] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CreateUser] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CreateGroup] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Reppassword] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ProfileGivenName] <String><br>



### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure HTTP basic authorization: aemAuth
$Configuration.Username = "YOUR_USERNAME"
$Configuration.Password = "YOUR_PASSWORD"

$AuthorizableId = "MyAuthorizableId" # String | 
$IntermediatePath = "MyIntermediatePath" # String | 
$CreateUser = "MyCreateUser" # String |  (optional)
$CreateGroup = "MyCreateGroup" # String |  (optional)
$Reppassword = "MyReppassword" # String |  (optional)
$ProfileGivenName = "MyProfileGivenName" # String |  (optional)

try {
    $Result = Submit-Authorizables -AuthorizableId $AuthorizableId -IntermediatePath $IntermediatePath -CreateUser $CreateUser -CreateGroup $CreateGroup -Reppassword $Reppassword -ProfileGivenName $ProfileGivenName
} catch {
    Write-Host ("Exception occured when calling Submit-Authorizables: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AuthorizableId** | **String**|  | 
 **IntermediatePath** | **String**|  | 
 **CreateUser** | **String**|  | [optional] 
 **CreateGroup** | **String**|  | [optional] 
 **Reppassword** | **String**|  | [optional] 
 **ProfileGivenName** | **String**|  | [optional] 

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Submit-ConfigAdobeGraniteSamlAuthenticationHandler"></a>
# **Submit-ConfigAdobeGraniteSamlAuthenticationHandler**
> void Submit-ConfigAdobeGraniteSamlAuthenticationHandler<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-KeyStorePassword] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-KeyStorePasswordTypeHint] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ServiceRanking] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ServiceRankingTypeHint] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-IdpHttpRedirect] <System.Nullable[Boolean]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-IdpHttpRedirectTypeHint] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CreateUser] <System.Nullable[Boolean]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CreateUserTypeHint] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-DefaultRedirectUrl] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-DefaultRedirectUrlTypeHint] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-UserIDAttribute] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-UserIDAttributeTypeHint] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-DefaultGroups] <String[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-DefaultGroupsTypeHint] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-IdpCertAlias] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-IdpCertAliasTypeHint] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AddGroupMemberships] <System.Nullable[Boolean]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AddGroupMembershipsTypeHint] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Path] <String[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PathTypeHint] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-SynchronizeAttributes] <String[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-SynchronizeAttributesTypeHint] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ClockTolerance] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ClockToleranceTypeHint] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-GroupMembershipAttribute] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-GroupMembershipAttributeTypeHint] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-IdpUrl] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-IdpUrlTypeHint] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-LogoutUrl] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-LogoutUrlTypeHint] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ServiceProviderEntityId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ServiceProviderEntityIdTypeHint] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AssertionConsumerServiceURL] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AssertionConsumerServiceURLTypeHint] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-HandleLogout] <System.Nullable[Boolean]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-HandleLogoutTypeHint] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-SpPrivateKeyAlias] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-SpPrivateKeyAliasTypeHint] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-UseEncryption] <System.Nullable[Boolean]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-UseEncryptionTypeHint] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-NameIdFormat] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-NameIdFormatTypeHint] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-DigestMethod] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-DigestMethodTypeHint] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-SignatureMethod] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-SignatureMethodTypeHint] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-UserIntermediatePath] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-UserIntermediatePathTypeHint] <String><br>



### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure HTTP basic authorization: aemAuth
$Configuration.Username = "YOUR_USERNAME"
$Configuration.Password = "YOUR_PASSWORD"

$KeyStorePassword = "MyKeyStorePassword" # String |  (optional)
$KeyStorePasswordTypeHint = "MyKeyStorePasswordTypeHint" # String |  (optional)
$ServiceRanking = 56 # Int32 |  (optional)
$ServiceRankingTypeHint = "MyServiceRankingTypeHint" # String |  (optional)
$IdpHttpRedirect = $true # Boolean |  (optional)
$IdpHttpRedirectTypeHint = "MyIdpHttpRedirectTypeHint" # String |  (optional)
$CreateUser = $true # Boolean |  (optional)
$CreateUserTypeHint = "MyCreateUserTypeHint" # String |  (optional)
$DefaultRedirectUrl = "MyDefaultRedirectUrl" # String |  (optional)
$DefaultRedirectUrlTypeHint = "MyDefaultRedirectUrlTypeHint" # String |  (optional)
$UserIDAttribute = "MyUserIDAttribute" # String |  (optional)
$UserIDAttributeTypeHint = "MyUserIDAttributeTypeHint" # String |  (optional)
$DefaultGroups = "MyDefaultGroups" # String[] |  (optional)
$DefaultGroupsTypeHint = "MyDefaultGroupsTypeHint" # String |  (optional)
$IdpCertAlias = "MyIdpCertAlias" # String |  (optional)
$IdpCertAliasTypeHint = "MyIdpCertAliasTypeHint" # String |  (optional)
$AddGroupMemberships = $true # Boolean |  (optional)
$AddGroupMembershipsTypeHint = "MyAddGroupMembershipsTypeHint" # String |  (optional)
$Path = "MyPath" # String[] |  (optional)
$PathTypeHint = "MyPathTypeHint" # String |  (optional)
$SynchronizeAttributes = "MySynchronizeAttributes" # String[] |  (optional)
$SynchronizeAttributesTypeHint = "MySynchronizeAttributesTypeHint" # String |  (optional)
$ClockTolerance = 56 # Int32 |  (optional)
$ClockToleranceTypeHint = "MyClockToleranceTypeHint" # String |  (optional)
$GroupMembershipAttribute = "MyGroupMembershipAttribute" # String |  (optional)
$GroupMembershipAttributeTypeHint = "MyGroupMembershipAttributeTypeHint" # String |  (optional)
$IdpUrl = "MyIdpUrl" # String |  (optional)
$IdpUrlTypeHint = "MyIdpUrlTypeHint" # String |  (optional)
$LogoutUrl = "MyLogoutUrl" # String |  (optional)
$LogoutUrlTypeHint = "MyLogoutUrlTypeHint" # String |  (optional)
$ServiceProviderEntityId = "MyServiceProviderEntityId" # String |  (optional)
$ServiceProviderEntityIdTypeHint = "MyServiceProviderEntityIdTypeHint" # String |  (optional)
$AssertionConsumerServiceURL = "MyAssertionConsumerServiceURL" # String |  (optional)
$AssertionConsumerServiceURLTypeHint = "MyAssertionConsumerServiceURLTypeHint" # String |  (optional)
$HandleLogout = $true # Boolean |  (optional)
$HandleLogoutTypeHint = "MyHandleLogoutTypeHint" # String |  (optional)
$SpPrivateKeyAlias = "MySpPrivateKeyAlias" # String |  (optional)
$SpPrivateKeyAliasTypeHint = "MySpPrivateKeyAliasTypeHint" # String |  (optional)
$UseEncryption = $true # Boolean |  (optional)
$UseEncryptionTypeHint = "MyUseEncryptionTypeHint" # String |  (optional)
$NameIdFormat = "MyNameIdFormat" # String |  (optional)
$NameIdFormatTypeHint = "MyNameIdFormatTypeHint" # String |  (optional)
$DigestMethod = "MyDigestMethod" # String |  (optional)
$DigestMethodTypeHint = "MyDigestMethodTypeHint" # String |  (optional)
$SignatureMethod = "MySignatureMethod" # String |  (optional)
$SignatureMethodTypeHint = "MySignatureMethodTypeHint" # String |  (optional)
$UserIntermediatePath = "MyUserIntermediatePath" # String |  (optional)
$UserIntermediatePathTypeHint = "MyUserIntermediatePathTypeHint" # String |  (optional)

try {
    $Result = Submit-ConfigAdobeGraniteSamlAuthenticationHandler -KeyStorePassword $KeyStorePassword -KeyStorePasswordTypeHint $KeyStorePasswordTypeHint -ServiceRanking $ServiceRanking -ServiceRankingTypeHint $ServiceRankingTypeHint -IdpHttpRedirect $IdpHttpRedirect -IdpHttpRedirectTypeHint $IdpHttpRedirectTypeHint -CreateUser $CreateUser -CreateUserTypeHint $CreateUserTypeHint -DefaultRedirectUrl $DefaultRedirectUrl -DefaultRedirectUrlTypeHint $DefaultRedirectUrlTypeHint -UserIDAttribute $UserIDAttribute -UserIDAttributeTypeHint $UserIDAttributeTypeHint -DefaultGroups $DefaultGroups -DefaultGroupsTypeHint $DefaultGroupsTypeHint -IdpCertAlias $IdpCertAlias -IdpCertAliasTypeHint $IdpCertAliasTypeHint -AddGroupMemberships $AddGroupMemberships -AddGroupMembershipsTypeHint $AddGroupMembershipsTypeHint -Path $Path -PathTypeHint $PathTypeHint -SynchronizeAttributes $SynchronizeAttributes -SynchronizeAttributesTypeHint $SynchronizeAttributesTypeHint -ClockTolerance $ClockTolerance -ClockToleranceTypeHint $ClockToleranceTypeHint -GroupMembershipAttribute $GroupMembershipAttribute -GroupMembershipAttributeTypeHint $GroupMembershipAttributeTypeHint -IdpUrl $IdpUrl -IdpUrlTypeHint $IdpUrlTypeHint -LogoutUrl $LogoutUrl -LogoutUrlTypeHint $LogoutUrlTypeHint -ServiceProviderEntityId $ServiceProviderEntityId -ServiceProviderEntityIdTypeHint $ServiceProviderEntityIdTypeHint -AssertionConsumerServiceURL $AssertionConsumerServiceURL -AssertionConsumerServiceURLTypeHint $AssertionConsumerServiceURLTypeHint -HandleLogout $HandleLogout -HandleLogoutTypeHint $HandleLogoutTypeHint -SpPrivateKeyAlias $SpPrivateKeyAlias -SpPrivateKeyAliasTypeHint $SpPrivateKeyAliasTypeHint -UseEncryption $UseEncryption -UseEncryptionTypeHint $UseEncryptionTypeHint -NameIdFormat $NameIdFormat -NameIdFormatTypeHint $NameIdFormatTypeHint -DigestMethod $DigestMethod -DigestMethodTypeHint $DigestMethodTypeHint -SignatureMethod $SignatureMethod -SignatureMethodTypeHint $SignatureMethodTypeHint -UserIntermediatePath $UserIntermediatePath -UserIntermediatePathTypeHint $UserIntermediatePathTypeHint
} catch {
    Write-Host ("Exception occured when calling Submit-ConfigAdobeGraniteSamlAuthenticationHandler: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **KeyStorePassword** | **String**|  | [optional] 
 **KeyStorePasswordTypeHint** | **String**|  | [optional] 
 **ServiceRanking** | **Int32**|  | [optional] 
 **ServiceRankingTypeHint** | **String**|  | [optional] 
 **IdpHttpRedirect** | **Boolean**|  | [optional] 
 **IdpHttpRedirectTypeHint** | **String**|  | [optional] 
 **CreateUser** | **Boolean**|  | [optional] 
 **CreateUserTypeHint** | **String**|  | [optional] 
 **DefaultRedirectUrl** | **String**|  | [optional] 
 **DefaultRedirectUrlTypeHint** | **String**|  | [optional] 
 **UserIDAttribute** | **String**|  | [optional] 
 **UserIDAttributeTypeHint** | **String**|  | [optional] 
 **DefaultGroups** | [**String[]**](String.md)|  | [optional] 
 **DefaultGroupsTypeHint** | **String**|  | [optional] 
 **IdpCertAlias** | **String**|  | [optional] 
 **IdpCertAliasTypeHint** | **String**|  | [optional] 
 **AddGroupMemberships** | **Boolean**|  | [optional] 
 **AddGroupMembershipsTypeHint** | **String**|  | [optional] 
 **Path** | [**String[]**](String.md)|  | [optional] 
 **PathTypeHint** | **String**|  | [optional] 
 **SynchronizeAttributes** | [**String[]**](String.md)|  | [optional] 
 **SynchronizeAttributesTypeHint** | **String**|  | [optional] 
 **ClockTolerance** | **Int32**|  | [optional] 
 **ClockToleranceTypeHint** | **String**|  | [optional] 
 **GroupMembershipAttribute** | **String**|  | [optional] 
 **GroupMembershipAttributeTypeHint** | **String**|  | [optional] 
 **IdpUrl** | **String**|  | [optional] 
 **IdpUrlTypeHint** | **String**|  | [optional] 
 **LogoutUrl** | **String**|  | [optional] 
 **LogoutUrlTypeHint** | **String**|  | [optional] 
 **ServiceProviderEntityId** | **String**|  | [optional] 
 **ServiceProviderEntityIdTypeHint** | **String**|  | [optional] 
 **AssertionConsumerServiceURL** | **String**|  | [optional] 
 **AssertionConsumerServiceURLTypeHint** | **String**|  | [optional] 
 **HandleLogout** | **Boolean**|  | [optional] 
 **HandleLogoutTypeHint** | **String**|  | [optional] 
 **SpPrivateKeyAlias** | **String**|  | [optional] 
 **SpPrivateKeyAliasTypeHint** | **String**|  | [optional] 
 **UseEncryption** | **Boolean**|  | [optional] 
 **UseEncryptionTypeHint** | **String**|  | [optional] 
 **NameIdFormat** | **String**|  | [optional] 
 **NameIdFormatTypeHint** | **String**|  | [optional] 
 **DigestMethod** | **String**|  | [optional] 
 **DigestMethodTypeHint** | **String**|  | [optional] 
 **SignatureMethod** | **String**|  | [optional] 
 **SignatureMethodTypeHint** | **String**|  | [optional] 
 **UserIntermediatePath** | **String**|  | [optional] 
 **UserIntermediatePathTypeHint** | **String**|  | [optional] 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Submit-ConfigApacheFelixJettyBasedHttpService"></a>
# **Submit-ConfigApacheFelixJettyBasedHttpService**
> void Submit-ConfigApacheFelixJettyBasedHttpService<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-OrgApacheFelixHttpsNio] <System.Nullable[Boolean]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-OrgApacheFelixHttpsNioTypeHint] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-OrgApacheFelixHttpsKeystore] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-OrgApacheFelixHttpsKeystoreTypeHint] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-OrgApacheFelixHttpsKeystorePassword] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-OrgApacheFelixHttpsKeystorePasswordTypeHint] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-OrgApacheFelixHttpsKeystoreKey] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-OrgApacheFelixHttpsKeystoreKeyTypeHint] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-OrgApacheFelixHttpsKeystoreKeyPassword] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-OrgApacheFelixHttpsKeystoreKeyPasswordTypeHint] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-OrgApacheFelixHttpsTruststore] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-OrgApacheFelixHttpsTruststoreTypeHint] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-OrgApacheFelixHttpsTruststorePassword] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-OrgApacheFelixHttpsTruststorePasswordTypeHint] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-OrgApacheFelixHttpsClientcertificate] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-OrgApacheFelixHttpsClientcertificateTypeHint] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-OrgApacheFelixHttpsEnable] <System.Nullable[Boolean]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-OrgApacheFelixHttpsEnableTypeHint] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-OrgOsgiServiceHttpPortSecure] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-OrgOsgiServiceHttpPortSecureTypeHint] <String><br>



### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure HTTP basic authorization: aemAuth
$Configuration.Username = "YOUR_USERNAME"
$Configuration.Password = "YOUR_PASSWORD"

$OrgApacheFelixHttpsNio = $true # Boolean |  (optional)
$OrgApacheFelixHttpsNioTypeHint = "MyOrgApacheFelixHttpsNioTypeHint" # String |  (optional)
$OrgApacheFelixHttpsKeystore = "MyOrgApacheFelixHttpsKeystore" # String |  (optional)
$OrgApacheFelixHttpsKeystoreTypeHint = "MyOrgApacheFelixHttpsKeystoreTypeHint" # String |  (optional)
$OrgApacheFelixHttpsKeystorePassword = "MyOrgApacheFelixHttpsKeystorePassword" # String |  (optional)
$OrgApacheFelixHttpsKeystorePasswordTypeHint = "MyOrgApacheFelixHttpsKeystorePasswordTypeHint" # String |  (optional)
$OrgApacheFelixHttpsKeystoreKey = "MyOrgApacheFelixHttpsKeystoreKey" # String |  (optional)
$OrgApacheFelixHttpsKeystoreKeyTypeHint = "MyOrgApacheFelixHttpsKeystoreKeyTypeHint" # String |  (optional)
$OrgApacheFelixHttpsKeystoreKeyPassword = "MyOrgApacheFelixHttpsKeystoreKeyPassword" # String |  (optional)
$OrgApacheFelixHttpsKeystoreKeyPasswordTypeHint = "MyOrgApacheFelixHttpsKeystoreKeyPasswordTypeHint" # String |  (optional)
$OrgApacheFelixHttpsTruststore = "MyOrgApacheFelixHttpsTruststore" # String |  (optional)
$OrgApacheFelixHttpsTruststoreTypeHint = "MyOrgApacheFelixHttpsTruststoreTypeHint" # String |  (optional)
$OrgApacheFelixHttpsTruststorePassword = "MyOrgApacheFelixHttpsTruststorePassword" # String |  (optional)
$OrgApacheFelixHttpsTruststorePasswordTypeHint = "MyOrgApacheFelixHttpsTruststorePasswordTypeHint" # String |  (optional)
$OrgApacheFelixHttpsClientcertificate = "MyOrgApacheFelixHttpsClientcertificate" # String |  (optional)
$OrgApacheFelixHttpsClientcertificateTypeHint = "MyOrgApacheFelixHttpsClientcertificateTypeHint" # String |  (optional)
$OrgApacheFelixHttpsEnable = $true # Boolean |  (optional)
$OrgApacheFelixHttpsEnableTypeHint = "MyOrgApacheFelixHttpsEnableTypeHint" # String |  (optional)
$OrgOsgiServiceHttpPortSecure = "MyOrgOsgiServiceHttpPortSecure" # String |  (optional)
$OrgOsgiServiceHttpPortSecureTypeHint = "MyOrgOsgiServiceHttpPortSecureTypeHint" # String |  (optional)

try {
    $Result = Submit-ConfigApacheFelixJettyBasedHttpService -OrgApacheFelixHttpsNio $OrgApacheFelixHttpsNio -OrgApacheFelixHttpsNioTypeHint $OrgApacheFelixHttpsNioTypeHint -OrgApacheFelixHttpsKeystore $OrgApacheFelixHttpsKeystore -OrgApacheFelixHttpsKeystoreTypeHint $OrgApacheFelixHttpsKeystoreTypeHint -OrgApacheFelixHttpsKeystorePassword $OrgApacheFelixHttpsKeystorePassword -OrgApacheFelixHttpsKeystorePasswordTypeHint $OrgApacheFelixHttpsKeystorePasswordTypeHint -OrgApacheFelixHttpsKeystoreKey $OrgApacheFelixHttpsKeystoreKey -OrgApacheFelixHttpsKeystoreKeyTypeHint $OrgApacheFelixHttpsKeystoreKeyTypeHint -OrgApacheFelixHttpsKeystoreKeyPassword $OrgApacheFelixHttpsKeystoreKeyPassword -OrgApacheFelixHttpsKeystoreKeyPasswordTypeHint $OrgApacheFelixHttpsKeystoreKeyPasswordTypeHint -OrgApacheFelixHttpsTruststore $OrgApacheFelixHttpsTruststore -OrgApacheFelixHttpsTruststoreTypeHint $OrgApacheFelixHttpsTruststoreTypeHint -OrgApacheFelixHttpsTruststorePassword $OrgApacheFelixHttpsTruststorePassword -OrgApacheFelixHttpsTruststorePasswordTypeHint $OrgApacheFelixHttpsTruststorePasswordTypeHint -OrgApacheFelixHttpsClientcertificate $OrgApacheFelixHttpsClientcertificate -OrgApacheFelixHttpsClientcertificateTypeHint $OrgApacheFelixHttpsClientcertificateTypeHint -OrgApacheFelixHttpsEnable $OrgApacheFelixHttpsEnable -OrgApacheFelixHttpsEnableTypeHint $OrgApacheFelixHttpsEnableTypeHint -OrgOsgiServiceHttpPortSecure $OrgOsgiServiceHttpPortSecure -OrgOsgiServiceHttpPortSecureTypeHint $OrgOsgiServiceHttpPortSecureTypeHint
} catch {
    Write-Host ("Exception occured when calling Submit-ConfigApacheFelixJettyBasedHttpService: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **OrgApacheFelixHttpsNio** | **Boolean**|  | [optional] 
 **OrgApacheFelixHttpsNioTypeHint** | **String**|  | [optional] 
 **OrgApacheFelixHttpsKeystore** | **String**|  | [optional] 
 **OrgApacheFelixHttpsKeystoreTypeHint** | **String**|  | [optional] 
 **OrgApacheFelixHttpsKeystorePassword** | **String**|  | [optional] 
 **OrgApacheFelixHttpsKeystorePasswordTypeHint** | **String**|  | [optional] 
 **OrgApacheFelixHttpsKeystoreKey** | **String**|  | [optional] 
 **OrgApacheFelixHttpsKeystoreKeyTypeHint** | **String**|  | [optional] 
 **OrgApacheFelixHttpsKeystoreKeyPassword** | **String**|  | [optional] 
 **OrgApacheFelixHttpsKeystoreKeyPasswordTypeHint** | **String**|  | [optional] 
 **OrgApacheFelixHttpsTruststore** | **String**|  | [optional] 
 **OrgApacheFelixHttpsTruststoreTypeHint** | **String**|  | [optional] 
 **OrgApacheFelixHttpsTruststorePassword** | **String**|  | [optional] 
 **OrgApacheFelixHttpsTruststorePasswordTypeHint** | **String**|  | [optional] 
 **OrgApacheFelixHttpsClientcertificate** | **String**|  | [optional] 
 **OrgApacheFelixHttpsClientcertificateTypeHint** | **String**|  | [optional] 
 **OrgApacheFelixHttpsEnable** | **Boolean**|  | [optional] 
 **OrgApacheFelixHttpsEnableTypeHint** | **String**|  | [optional] 
 **OrgOsgiServiceHttpPortSecure** | **String**|  | [optional] 
 **OrgOsgiServiceHttpPortSecureTypeHint** | **String**|  | [optional] 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Submit-ConfigApacheHttpComponentsProxyConfiguration"></a>
# **Submit-ConfigApacheHttpComponentsProxyConfiguration**
> void Submit-ConfigApacheHttpComponentsProxyConfiguration<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ProxyHost] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ProxyHostTypeHint] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ProxyPort] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ProxyPortTypeHint] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ProxyExceptions] <String[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ProxyExceptionsTypeHint] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ProxyEnabled] <System.Nullable[Boolean]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ProxyEnabledTypeHint] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ProxyUser] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ProxyUserTypeHint] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ProxyPassword] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ProxyPasswordTypeHint] <String><br>



### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure HTTP basic authorization: aemAuth
$Configuration.Username = "YOUR_USERNAME"
$Configuration.Password = "YOUR_PASSWORD"

$ProxyHost = "MyProxyHost" # String |  (optional)
$ProxyHostTypeHint = "MyProxyHostTypeHint" # String |  (optional)
$ProxyPort = 56 # Int32 |  (optional)
$ProxyPortTypeHint = "MyProxyPortTypeHint" # String |  (optional)
$ProxyExceptions = "MyProxyExceptions" # String[] |  (optional)
$ProxyExceptionsTypeHint = "MyProxyExceptionsTypeHint" # String |  (optional)
$ProxyEnabled = $true # Boolean |  (optional)
$ProxyEnabledTypeHint = "MyProxyEnabledTypeHint" # String |  (optional)
$ProxyUser = "MyProxyUser" # String |  (optional)
$ProxyUserTypeHint = "MyProxyUserTypeHint" # String |  (optional)
$ProxyPassword = "MyProxyPassword" # String |  (optional)
$ProxyPasswordTypeHint = "MyProxyPasswordTypeHint" # String |  (optional)

try {
    $Result = Submit-ConfigApacheHttpComponentsProxyConfiguration -ProxyHost $ProxyHost -ProxyHostTypeHint $ProxyHostTypeHint -ProxyPort $ProxyPort -ProxyPortTypeHint $ProxyPortTypeHint -ProxyExceptions $ProxyExceptions -ProxyExceptionsTypeHint $ProxyExceptionsTypeHint -ProxyEnabled $ProxyEnabled -ProxyEnabledTypeHint $ProxyEnabledTypeHint -ProxyUser $ProxyUser -ProxyUserTypeHint $ProxyUserTypeHint -ProxyPassword $ProxyPassword -ProxyPasswordTypeHint $ProxyPasswordTypeHint
} catch {
    Write-Host ("Exception occured when calling Submit-ConfigApacheHttpComponentsProxyConfiguration: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ProxyHost** | **String**|  | [optional] 
 **ProxyHostTypeHint** | **String**|  | [optional] 
 **ProxyPort** | **Int32**|  | [optional] 
 **ProxyPortTypeHint** | **String**|  | [optional] 
 **ProxyExceptions** | [**String[]**](String.md)|  | [optional] 
 **ProxyExceptionsTypeHint** | **String**|  | [optional] 
 **ProxyEnabled** | **Boolean**|  | [optional] 
 **ProxyEnabledTypeHint** | **String**|  | [optional] 
 **ProxyUser** | **String**|  | [optional] 
 **ProxyUserTypeHint** | **String**|  | [optional] 
 **ProxyPassword** | **String**|  | [optional] 
 **ProxyPasswordTypeHint** | **String**|  | [optional] 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Submit-ConfigApacheSlingDavExServlet"></a>
# **Submit-ConfigApacheSlingDavExServlet**
> void Submit-ConfigApacheSlingDavExServlet<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Alias] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AliasTypeHint] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-DavCreateAbsoluteUri] <System.Nullable[Boolean]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-DavCreateAbsoluteUriTypeHint] <String><br>



### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure HTTP basic authorization: aemAuth
$Configuration.Username = "YOUR_USERNAME"
$Configuration.Password = "YOUR_PASSWORD"

$Alias = "MyAlias" # String |  (optional)
$AliasTypeHint = "MyAliasTypeHint" # String |  (optional)
$DavCreateAbsoluteUri = $true # Boolean |  (optional)
$DavCreateAbsoluteUriTypeHint = "MyDavCreateAbsoluteUriTypeHint" # String |  (optional)

try {
    $Result = Submit-ConfigApacheSlingDavExServlet -Alias $Alias -AliasTypeHint $AliasTypeHint -DavCreateAbsoluteUri $DavCreateAbsoluteUri -DavCreateAbsoluteUriTypeHint $DavCreateAbsoluteUriTypeHint
} catch {
    Write-Host ("Exception occured when calling Submit-ConfigApacheSlingDavExServlet: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Alias** | **String**|  | [optional] 
 **AliasTypeHint** | **String**|  | [optional] 
 **DavCreateAbsoluteUri** | **Boolean**|  | [optional] 
 **DavCreateAbsoluteUriTypeHint** | **String**|  | [optional] 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Submit-ConfigApacheSlingGetServlet"></a>
# **Submit-ConfigApacheSlingGetServlet**
> void Submit-ConfigApacheSlingGetServlet<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-JsonMaximumresults] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-JsonMaximumresultsTypeHint] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-EnableHtml] <System.Nullable[Boolean]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-EnableHtmlTypeHint] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-EnableTxt] <System.Nullable[Boolean]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-EnableTxtTypeHint] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-EnableXml] <System.Nullable[Boolean]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-EnableXmlTypeHint] <String><br>



### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure HTTP basic authorization: aemAuth
$Configuration.Username = "YOUR_USERNAME"
$Configuration.Password = "YOUR_PASSWORD"

$JsonMaximumresults = "MyJsonMaximumresults" # String |  (optional)
$JsonMaximumresultsTypeHint = "MyJsonMaximumresultsTypeHint" # String |  (optional)
$EnableHtml = $true # Boolean |  (optional)
$EnableHtmlTypeHint = "MyEnableHtmlTypeHint" # String |  (optional)
$EnableTxt = $true # Boolean |  (optional)
$EnableTxtTypeHint = "MyEnableTxtTypeHint" # String |  (optional)
$EnableXml = $true # Boolean |  (optional)
$EnableXmlTypeHint = "MyEnableXmlTypeHint" # String |  (optional)

try {
    $Result = Submit-ConfigApacheSlingGetServlet -JsonMaximumresults $JsonMaximumresults -JsonMaximumresultsTypeHint $JsonMaximumresultsTypeHint -EnableHtml $EnableHtml -EnableHtmlTypeHint $EnableHtmlTypeHint -EnableTxt $EnableTxt -EnableTxtTypeHint $EnableTxtTypeHint -EnableXml $EnableXml -EnableXmlTypeHint $EnableXmlTypeHint
} catch {
    Write-Host ("Exception occured when calling Submit-ConfigApacheSlingGetServlet: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **JsonMaximumresults** | **String**|  | [optional] 
 **JsonMaximumresultsTypeHint** | **String**|  | [optional] 
 **EnableHtml** | **Boolean**|  | [optional] 
 **EnableHtmlTypeHint** | **String**|  | [optional] 
 **EnableTxt** | **Boolean**|  | [optional] 
 **EnableTxtTypeHint** | **String**|  | [optional] 
 **EnableXml** | **Boolean**|  | [optional] 
 **EnableXmlTypeHint** | **String**|  | [optional] 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Submit-ConfigApacheSlingReferrerFilter"></a>
# **Submit-ConfigApacheSlingReferrerFilter**
> void Submit-ConfigApacheSlingReferrerFilter<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AllowEmpty] <System.Nullable[Boolean]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AllowEmptyTypeHint] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AllowHosts] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AllowHostsTypeHint] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AllowHostsRegexp] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AllowHostsRegexpTypeHint] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-FilterMethods] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-FilterMethodsTypeHint] <String><br>



### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure HTTP basic authorization: aemAuth
$Configuration.Username = "YOUR_USERNAME"
$Configuration.Password = "YOUR_PASSWORD"

$AllowEmpty = $true # Boolean |  (optional)
$AllowEmptyTypeHint = "MyAllowEmptyTypeHint" # String |  (optional)
$AllowHosts = "MyAllowHosts" # String |  (optional)
$AllowHostsTypeHint = "MyAllowHostsTypeHint" # String |  (optional)
$AllowHostsRegexp = "MyAllowHostsRegexp" # String |  (optional)
$AllowHostsRegexpTypeHint = "MyAllowHostsRegexpTypeHint" # String |  (optional)
$FilterMethods = "MyFilterMethods" # String |  (optional)
$FilterMethodsTypeHint = "MyFilterMethodsTypeHint" # String |  (optional)

try {
    $Result = Submit-ConfigApacheSlingReferrerFilter -AllowEmpty $AllowEmpty -AllowEmptyTypeHint $AllowEmptyTypeHint -AllowHosts $AllowHosts -AllowHostsTypeHint $AllowHostsTypeHint -AllowHostsRegexp $AllowHostsRegexp -AllowHostsRegexpTypeHint $AllowHostsRegexpTypeHint -FilterMethods $FilterMethods -FilterMethodsTypeHint $FilterMethodsTypeHint
} catch {
    Write-Host ("Exception occured when calling Submit-ConfigApacheSlingReferrerFilter: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AllowEmpty** | **Boolean**|  | [optional] 
 **AllowEmptyTypeHint** | **String**|  | [optional] 
 **AllowHosts** | **String**|  | [optional] 
 **AllowHostsTypeHint** | **String**|  | [optional] 
 **AllowHostsRegexp** | **String**|  | [optional] 
 **AllowHostsRegexpTypeHint** | **String**|  | [optional] 
 **FilterMethods** | **String**|  | [optional] 
 **FilterMethodsTypeHint** | **String**|  | [optional] 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Submit-ConfigProperty"></a>
# **Submit-ConfigProperty**
> void Submit-ConfigProperty<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ConfigNodeName] <String><br>



### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure HTTP basic authorization: aemAuth
$Configuration.Username = "YOUR_USERNAME"
$Configuration.Password = "YOUR_PASSWORD"

$ConfigNodeName = "MyConfigNodeName" # String | 

try {
    $Result = Submit-ConfigProperty -ConfigNodeName $ConfigNodeName
} catch {
    Write-Host ("Exception occured when calling Submit-ConfigProperty: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ConfigNodeName** | **String**|  | 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Submit-Node"></a>
# **Submit-Node**
> void Submit-Node<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Path] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Name] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Operation] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-DeleteAuthorizable] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-File] <System.IO.FileInfo><br>



### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure HTTP basic authorization: aemAuth
$Configuration.Username = "YOUR_USERNAME"
$Configuration.Password = "YOUR_PASSWORD"

$Path = "MyPath" # String | 
$Name = "MyName" # String | 
$Operation = "MyOperation" # String |  (optional)
$DeleteAuthorizable = "MyDeleteAuthorizable" # String |  (optional)
$File =  # System.IO.FileInfo |  (optional)

try {
    $Result = Submit-Node -Path $Path -Name $Name -Operation $Operation -DeleteAuthorizable $DeleteAuthorizable -File $File
} catch {
    Write-Host ("Exception occured when calling Submit-Node: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Path** | **String**|  | 
 **Name** | **String**|  | 
 **Operation** | **String**|  | [optional] 
 **DeleteAuthorizable** | **String**|  | [optional] 
 **File** | **System.IO.FileInfo****System.IO.FileInfo**|  | [optional] 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Submit-NodeRw"></a>
# **Submit-NodeRw**
> void Submit-NodeRw<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Path] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Name] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AddMembers] <String><br>



### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure HTTP basic authorization: aemAuth
$Configuration.Username = "YOUR_USERNAME"
$Configuration.Password = "YOUR_PASSWORD"

$Path = "MyPath" # String | 
$Name = "MyName" # String | 
$AddMembers = "MyAddMembers" # String |  (optional)

try {
    $Result = Submit-NodeRw -Path $Path -Name $Name -AddMembers $AddMembers
} catch {
    Write-Host ("Exception occured when calling Submit-NodeRw: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Path** | **String**|  | 
 **Name** | **String**|  | 
 **AddMembers** | **String**|  | [optional] 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Submit-Path"></a>
# **Submit-Path**
> void Submit-Path<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Path] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-JcrprimaryType] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Name] <String><br>



### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure HTTP basic authorization: aemAuth
$Configuration.Username = "YOUR_USERNAME"
$Configuration.Password = "YOUR_PASSWORD"

$Path = "MyPath" # String | 
$JcrprimaryType = "MyJcrprimaryType" # String | 
$Name = "MyName" # String | 

try {
    $Result = Submit-Path -Path $Path -JcrprimaryType $JcrprimaryType -Name $Name
} catch {
    Write-Host ("Exception occured when calling Submit-Path: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Path** | **String**|  | 
 **JcrprimaryType** | **String**|  | 
 **Name** | **String**|  | 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Submit-Query"></a>
# **Submit-Query**
> String Submit-Query<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Path] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PLimit] <Decimal><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Var1Property] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Var1PropertyValue] <String><br>



### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure HTTP basic authorization: aemAuth
$Configuration.Username = "YOUR_USERNAME"
$Configuration.Password = "YOUR_PASSWORD"

$Path = "MyPath" # String | 
$PLimit = 8.14 # Decimal | 
$Var1Property = "MyVar1Property" # String | 
$Var1PropertyValue = "MyVar1PropertyValue" # String | 

try {
    $Result = Submit-Query -Path $Path -PLimit $PLimit -Var1Property $Var1Property -Var1PropertyValue $Var1PropertyValue
} catch {
    Write-Host ("Exception occured when calling Submit-Query: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Path** | **String**|  | 
 **PLimit** | **Decimal**|  | 
 **Var1Property** | **String**|  | 
 **Var1PropertyValue** | **String**|  | 

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Submit-TreeActivation"></a>
# **Submit-TreeActivation**
> void Submit-TreeActivation<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Ignoredeactivated] <Boolean><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Onlymodified] <Boolean><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Path] <String><br>



### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure HTTP basic authorization: aemAuth
$Configuration.Username = "YOUR_USERNAME"
$Configuration.Password = "YOUR_PASSWORD"

$Ignoredeactivated = $true # Boolean | 
$Onlymodified = $true # Boolean | 
$Path = "MyPath" # String | 

try {
    $Result = Submit-TreeActivation -Ignoredeactivated $Ignoredeactivated -Onlymodified $Onlymodified -Path $Path
} catch {
    Write-Host ("Exception occured when calling Submit-TreeActivation: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Ignoredeactivated** | **Boolean**|  | 
 **Onlymodified** | **Boolean**|  | 
 **Path** | **String**|  | 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Submit-Truststore"></a>
# **Submit-Truststore**
> String Submit-Truststore<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Operation] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-NewPassword] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-RePassword] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-KeyStoreType] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-RemoveAlias] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Certificate] <System.IO.FileInfo><br>



### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure HTTP basic authorization: aemAuth
$Configuration.Username = "YOUR_USERNAME"
$Configuration.Password = "YOUR_PASSWORD"

$Operation = "MyOperation" # String |  (optional)
$NewPassword = "MyNewPassword" # String |  (optional)
$RePassword = "MyRePassword" # String |  (optional)
$KeyStoreType = "MyKeyStoreType" # String |  (optional)
$RemoveAlias = "MyRemoveAlias" # String |  (optional)
$Certificate =  # System.IO.FileInfo |  (optional)

try {
    $Result = Submit-Truststore -Operation $Operation -NewPassword $NewPassword -RePassword $RePassword -KeyStoreType $KeyStoreType -RemoveAlias $RemoveAlias -Certificate $Certificate
} catch {
    Write-Host ("Exception occured when calling Submit-Truststore: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Operation** | **String**|  | [optional] 
 **NewPassword** | **String**|  | [optional] 
 **RePassword** | **String**|  | [optional] 
 **KeyStoreType** | **String**|  | [optional] 
 **RemoveAlias** | **String**|  | [optional] 
 **Certificate** | **System.IO.FileInfo****System.IO.FileInfo**|  | [optional] 

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Submit-TruststorePKCS12"></a>
# **Submit-TruststorePKCS12**
> String Submit-TruststorePKCS12<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-TruststoreP12] <System.IO.FileInfo><br>



### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure HTTP basic authorization: aemAuth
$Configuration.Username = "YOUR_USERNAME"
$Configuration.Password = "YOUR_PASSWORD"

$TruststoreP12 =  # System.IO.FileInfo |  (optional)

try {
    $Result = Submit-TruststorePKCS12 -TruststoreP12 $TruststoreP12
} catch {
    Write-Host ("Exception occured when calling Submit-TruststorePKCS12: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **TruststoreP12** | **System.IO.FileInfo****System.IO.FileInfo**|  | [optional] 

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

