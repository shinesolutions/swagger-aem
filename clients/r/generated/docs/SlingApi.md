# SlingApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**DeleteAgent**](SlingApi.md#DeleteAgent) | **DELETE** /etc/replication/agents.{runmode}/{name} | 
[**DeleteNode**](SlingApi.md#DeleteNode) | **DELETE** /{path}/{name} | 
[**GetAgent**](SlingApi.md#GetAgent) | **GET** /etc/replication/agents.{runmode}/{name} | 
[**GetAgents**](SlingApi.md#GetAgents) | **GET** /etc/replication/agents.{runmode}.-1.json | 
[**GetAuthorizableKeystore**](SlingApi.md#GetAuthorizableKeystore) | **GET** /{intermediatePath}/{authorizableId}.ks.json | 
[**GetKeystore**](SlingApi.md#GetKeystore) | **GET** /{intermediatePath}/{authorizableId}/keystore/store.p12 | 
[**GetNode**](SlingApi.md#GetNode) | **GET** /{path}/{name} | 
[**GetPackage**](SlingApi.md#GetPackage) | **GET** /etc/packages/{group}/{name}-{version}.zip | 
[**GetPackageFilter**](SlingApi.md#GetPackageFilter) | **GET** /etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json | 
[**GetQuery**](SlingApi.md#GetQuery) | **GET** /bin/querybuilder.json | 
[**GetTruststore**](SlingApi.md#GetTruststore) | **GET** /etc/truststore/truststore.p12 | 
[**GetTruststoreInfo**](SlingApi.md#GetTruststoreInfo) | **GET** /libs/granite/security/truststore.json | 
[**PostAgent**](SlingApi.md#PostAgent) | **POST** /etc/replication/agents.{runmode}/{name} | 
[**PostAuthorizableKeystore**](SlingApi.md#PostAuthorizableKeystore) | **POST** /{intermediatePath}/{authorizableId}.ks.html | 
[**PostAuthorizables**](SlingApi.md#PostAuthorizables) | **POST** /libs/granite/security/post/authorizables | 
[**PostConfigAdobeGraniteSamlAuthenticationHandler**](SlingApi.md#PostConfigAdobeGraniteSamlAuthenticationHandler) | **POST** /apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config | 
[**PostConfigApacheFelixJettyBasedHttpService**](SlingApi.md#PostConfigApacheFelixJettyBasedHttpService) | **POST** /apps/system/config/org.apache.felix.http | 
[**PostConfigApacheHttpComponentsProxyConfiguration**](SlingApi.md#PostConfigApacheHttpComponentsProxyConfiguration) | **POST** /apps/system/config/org.apache.http.proxyconfigurator.config | 
[**PostConfigApacheSlingDavExServlet**](SlingApi.md#PostConfigApacheSlingDavExServlet) | **POST** /apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet | 
[**PostConfigApacheSlingGetServlet**](SlingApi.md#PostConfigApacheSlingGetServlet) | **POST** /apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet | 
[**PostConfigApacheSlingReferrerFilter**](SlingApi.md#PostConfigApacheSlingReferrerFilter) | **POST** /apps/system/config/org.apache.sling.security.impl.ReferrerFilter | 
[**PostConfigProperty**](SlingApi.md#PostConfigProperty) | **POST** /apps/system/config/{configNodeName} | 
[**PostNode**](SlingApi.md#PostNode) | **POST** /{path}/{name} | 
[**PostNodeRw**](SlingApi.md#PostNodeRw) | **POST** /{path}/{name}.rw.html | 
[**PostPath**](SlingApi.md#PostPath) | **POST** /{path}/ | 
[**PostQuery**](SlingApi.md#PostQuery) | **POST** /bin/querybuilder.json | 
[**PostTreeActivation**](SlingApi.md#PostTreeActivation) | **POST** /etc/replication/treeactivation.html | 
[**PostTruststore**](SlingApi.md#PostTruststore) | **POST** /libs/granite/security/post/truststore | 
[**PostTruststorePKCS12**](SlingApi.md#PostTruststorePKCS12) | **POST** /etc/truststore | 


# **DeleteAgent**
> DeleteAgent(runmode, name)



### Example
```R
library(openapi)

var.runmode <- 'runmode_example' # character | 
var.name <- 'name_example' # character | 

api.instance <- SlingApi$new()
# Configure HTTP basic authorization: aemAuth
api.instance$apiClient$username <- 'TODO_YOUR_USERNAME';
api.instance$apiClient$password <- 'TODO_YOUR_PASSWORD';
api.instance$DeleteAgent(var.runmode, var.name)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runmode** | **character**|  | 
 **name** | **character**|  | 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

# **DeleteNode**
> DeleteNode(path, name)



### Example
```R
library(openapi)

var.path <- 'path_example' # character | 
var.name <- 'name_example' # character | 

api.instance <- SlingApi$new()
# Configure HTTP basic authorization: aemAuth
api.instance$apiClient$username <- 'TODO_YOUR_USERNAME';
api.instance$apiClient$password <- 'TODO_YOUR_PASSWORD';
api.instance$DeleteNode(var.path, var.name)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **character**|  | 
 **name** | **character**|  | 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

# **GetAgent**
> GetAgent(runmode, name)



### Example
```R
library(openapi)

var.runmode <- 'runmode_example' # character | 
var.name <- 'name_example' # character | 

api.instance <- SlingApi$new()
# Configure HTTP basic authorization: aemAuth
api.instance$apiClient$username <- 'TODO_YOUR_USERNAME';
api.instance$apiClient$password <- 'TODO_YOUR_PASSWORD';
api.instance$GetAgent(var.runmode, var.name)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runmode** | **character**|  | 
 **name** | **character**|  | 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

# **GetAgents**
> character GetAgents(runmode)



### Example
```R
library(openapi)

var.runmode <- 'runmode_example' # character | 

api.instance <- SlingApi$new()
# Configure HTTP basic authorization: aemAuth
api.instance$apiClient$username <- 'TODO_YOUR_USERNAME';
api.instance$apiClient$password <- 'TODO_YOUR_PASSWORD';
result <- api.instance$GetAgents(var.runmode)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runmode** | **character**|  | 

### Return type

**character**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

# **GetAuthorizableKeystore**
> KeystoreInfo GetAuthorizableKeystore(intermediate.path, authorizable.id)



### Example
```R
library(openapi)

var.intermediate.path <- 'intermediate.path_example' # character | 
var.authorizable.id <- 'authorizable.id_example' # character | 

api.instance <- SlingApi$new()
# Configure HTTP basic authorization: aemAuth
api.instance$apiClient$username <- 'TODO_YOUR_USERNAME';
api.instance$apiClient$password <- 'TODO_YOUR_PASSWORD';
result <- api.instance$GetAuthorizableKeystore(var.intermediate.path, var.authorizable.id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **intermediate.path** | **character**|  | 
 **authorizable.id** | **character**|  | 

### Return type

[**KeystoreInfo**](KeystoreInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Retrieved Authorizable Keystore info |  -  |
| **0** | Default response |  -  |

# **GetKeystore**
> data.frame GetKeystore(intermediate.path, authorizable.id)



### Example
```R
library(openapi)

var.intermediate.path <- 'intermediate.path_example' # character | 
var.authorizable.id <- 'authorizable.id_example' # character | 

api.instance <- SlingApi$new()
# Configure HTTP basic authorization: aemAuth
api.instance$apiClient$username <- 'TODO_YOUR_USERNAME';
api.instance$apiClient$password <- 'TODO_YOUR_PASSWORD';
result <- api.instance$GetKeystore(var.intermediate.path, var.authorizable.id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **intermediate.path** | **character**|  | 
 **authorizable.id** | **character**|  | 

### Return type

**data.frame**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

# **GetNode**
> GetNode(path, name)



### Example
```R
library(openapi)

var.path <- 'path_example' # character | 
var.name <- 'name_example' # character | 

api.instance <- SlingApi$new()
# Configure HTTP basic authorization: aemAuth
api.instance$apiClient$username <- 'TODO_YOUR_USERNAME';
api.instance$apiClient$password <- 'TODO_YOUR_PASSWORD';
api.instance$GetNode(var.path, var.name)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **character**|  | 
 **name** | **character**|  | 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

# **GetPackage**
> data.frame GetPackage(group, name, version)



### Example
```R
library(openapi)

var.group <- 'group_example' # character | 
var.name <- 'name_example' # character | 
var.version <- 'version_example' # character | 

api.instance <- SlingApi$new()
# Configure HTTP basic authorization: aemAuth
api.instance$apiClient$username <- 'TODO_YOUR_USERNAME';
api.instance$apiClient$password <- 'TODO_YOUR_PASSWORD';
result <- api.instance$GetPackage(var.group, var.name, var.version)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group** | **character**|  | 
 **name** | **character**|  | 
 **version** | **character**|  | 

### Return type

**data.frame**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

# **GetPackageFilter**
> character GetPackageFilter(group, name, version)



### Example
```R
library(openapi)

var.group <- 'group_example' # character | 
var.name <- 'name_example' # character | 
var.version <- 'version_example' # character | 

api.instance <- SlingApi$new()
# Configure HTTP basic authorization: aemAuth
api.instance$apiClient$username <- 'TODO_YOUR_USERNAME';
api.instance$apiClient$password <- 'TODO_YOUR_PASSWORD';
result <- api.instance$GetPackageFilter(var.group, var.name, var.version)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group** | **character**|  | 
 **name** | **character**|  | 
 **version** | **character**|  | 

### Return type

**character**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

# **GetQuery**
> character GetQuery(path, p.limit, Var1.property, Var1.property.value)



### Example
```R
library(openapi)

var.path <- 'path_example' # character | 
var.p.limit <- 3.4 # numeric | 
var.Var1.property <- 'Var1.property_example' # character | 
var.Var1.property.value <- 'Var1.property.value_example' # character | 

api.instance <- SlingApi$new()
# Configure HTTP basic authorization: aemAuth
api.instance$apiClient$username <- 'TODO_YOUR_USERNAME';
api.instance$apiClient$password <- 'TODO_YOUR_PASSWORD';
result <- api.instance$GetQuery(var.path, var.p.limit, var.Var1.property, var.Var1.property.value)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **character**|  | 
 **p.limit** | **numeric**|  | 
 **Var1.property** | **character**|  | 
 **Var1.property.value** | **character**|  | 

### Return type

**character**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

# **GetTruststore**
> data.frame GetTruststore()



### Example
```R
library(openapi)


api.instance <- SlingApi$new()
# Configure HTTP basic authorization: aemAuth
api.instance$apiClient$username <- 'TODO_YOUR_USERNAME';
api.instance$apiClient$password <- 'TODO_YOUR_PASSWORD';
result <- api.instance$GetTruststore()
dput(result)
```

### Parameters
This endpoint does not need any parameter.

### Return type

**data.frame**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

# **GetTruststoreInfo**
> TruststoreInfo GetTruststoreInfo()



### Example
```R
library(openapi)


api.instance <- SlingApi$new()
# Configure HTTP basic authorization: aemAuth
api.instance$apiClient$username <- 'TODO_YOUR_USERNAME';
api.instance$apiClient$password <- 'TODO_YOUR_PASSWORD';
result <- api.instance$GetTruststoreInfo()
dput(result)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**TruststoreInfo**](TruststoreInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Retrieved AEM Truststore info |  -  |
| **0** | Default response |  -  |

# **PostAgent**
> PostAgent(runmode, name, jcrcontent.cqdistribute=var.jcrcontent.cqdistribute, jcrcontent.cqdistribute.type.hint=var.jcrcontent.cqdistribute.type.hint, jcrcontent.cqname=var.jcrcontent.cqname, jcrcontent.cqtemplate=var.jcrcontent.cqtemplate, jcrcontent.enabled=var.jcrcontent.enabled, jcrcontent.jcrdescription=var.jcrcontent.jcrdescription, jcrcontent.jcrlast.modified=var.jcrcontent.jcrlast.modified, jcrcontent.jcrlast.modified.by=var.jcrcontent.jcrlast.modified.by, jcrcontent.jcrmixin.types=var.jcrcontent.jcrmixin.types, jcrcontent.jcrtitle=var.jcrcontent.jcrtitle, jcrcontent.log.level=var.jcrcontent.log.level, jcrcontent.no.status.update=var.jcrcontent.no.status.update, jcrcontent.no.versioning=var.jcrcontent.no.versioning, jcrcontent.protocol.connect.timeout=var.jcrcontent.protocol.connect.timeout, jcrcontent.protocol.http.connection.closed=var.jcrcontent.protocol.http.connection.closed, jcrcontent.protocol.http.expired=var.jcrcontent.protocol.http.expired, jcrcontent.protocol.http.headers=var.jcrcontent.protocol.http.headers, jcrcontent.protocol.http.headers.type.hint=var.jcrcontent.protocol.http.headers.type.hint, jcrcontent.protocol.http.method=var.jcrcontent.protocol.http.method, jcrcontent.protocol.https.relaxed=var.jcrcontent.protocol.https.relaxed, jcrcontent.protocol.interface=var.jcrcontent.protocol.interface, jcrcontent.protocol.socket.timeout=var.jcrcontent.protocol.socket.timeout, jcrcontent.protocol.version=var.jcrcontent.protocol.version, jcrcontent.proxy.ntlm.domain=var.jcrcontent.proxy.ntlm.domain, jcrcontent.proxy.ntlm.host=var.jcrcontent.proxy.ntlm.host, jcrcontent.proxy.host=var.jcrcontent.proxy.host, jcrcontent.proxy.password=var.jcrcontent.proxy.password, jcrcontent.proxy.port=var.jcrcontent.proxy.port, jcrcontent.proxy.user=var.jcrcontent.proxy.user, jcrcontent.queue.batch.max.size=var.jcrcontent.queue.batch.max.size, jcrcontent.queue.batch.mode=var.jcrcontent.queue.batch.mode, jcrcontent.queue.batch.wait.time=var.jcrcontent.queue.batch.wait.time, jcrcontent.retry.delay=var.jcrcontent.retry.delay, jcrcontent.reverse.replication=var.jcrcontent.reverse.replication, jcrcontent.serialization.type=var.jcrcontent.serialization.type, jcrcontent.slingresource.type=var.jcrcontent.slingresource.type, jcrcontent.ssl=var.jcrcontent.ssl, jcrcontent.transport.ntlm.domain=var.jcrcontent.transport.ntlm.domain, jcrcontent.transport.ntlm.host=var.jcrcontent.transport.ntlm.host, jcrcontent.transport.password=var.jcrcontent.transport.password, jcrcontent.transport.uri=var.jcrcontent.transport.uri, jcrcontent.transport.user=var.jcrcontent.transport.user, jcrcontent.trigger.distribute=var.jcrcontent.trigger.distribute, jcrcontent.trigger.modified=var.jcrcontent.trigger.modified, jcrcontent.trigger.on.off.time=var.jcrcontent.trigger.on.off.time, jcrcontent.trigger.receive=var.jcrcontent.trigger.receive, jcrcontent.trigger.specific=var.jcrcontent.trigger.specific, jcrcontent.user.id=var.jcrcontent.user.id, jcrprimary.type=var.jcrprimary.type, operation=var.operation)



### Example
```R
library(openapi)

var.runmode <- 'runmode_example' # character | 
var.name <- 'name_example' # character | 
var.jcrcontent.cqdistribute <- 'jcrcontent.cqdistribute_example' # character | 
var.jcrcontent.cqdistribute.type.hint <- 'jcrcontent.cqdistribute.type.hint_example' # character | 
var.jcrcontent.cqname <- 'jcrcontent.cqname_example' # character | 
var.jcrcontent.cqtemplate <- 'jcrcontent.cqtemplate_example' # character | 
var.jcrcontent.enabled <- 'jcrcontent.enabled_example' # character | 
var.jcrcontent.jcrdescription <- 'jcrcontent.jcrdescription_example' # character | 
var.jcrcontent.jcrlast.modified <- 'jcrcontent.jcrlast.modified_example' # character | 
var.jcrcontent.jcrlast.modified.by <- 'jcrcontent.jcrlast.modified.by_example' # character | 
var.jcrcontent.jcrmixin.types <- 'jcrcontent.jcrmixin.types_example' # character | 
var.jcrcontent.jcrtitle <- 'jcrcontent.jcrtitle_example' # character | 
var.jcrcontent.log.level <- 'jcrcontent.log.level_example' # character | 
var.jcrcontent.no.status.update <- 'jcrcontent.no.status.update_example' # character | 
var.jcrcontent.no.versioning <- 'jcrcontent.no.versioning_example' # character | 
var.jcrcontent.protocol.connect.timeout <- 3.4 # numeric | 
var.jcrcontent.protocol.http.connection.closed <- 'jcrcontent.protocol.http.connection.closed_example' # character | 
var.jcrcontent.protocol.http.expired <- 'jcrcontent.protocol.http.expired_example' # character | 
var.jcrcontent.protocol.http.headers <- list("inner_example") # array[character] | 
var.jcrcontent.protocol.http.headers.type.hint <- 'jcrcontent.protocol.http.headers.type.hint_example' # character | 
var.jcrcontent.protocol.http.method <- 'jcrcontent.protocol.http.method_example' # character | 
var.jcrcontent.protocol.https.relaxed <- 'jcrcontent.protocol.https.relaxed_example' # character | 
var.jcrcontent.protocol.interface <- 'jcrcontent.protocol.interface_example' # character | 
var.jcrcontent.protocol.socket.timeout <- 3.4 # numeric | 
var.jcrcontent.protocol.version <- 'jcrcontent.protocol.version_example' # character | 
var.jcrcontent.proxy.ntlm.domain <- 'jcrcontent.proxy.ntlm.domain_example' # character | 
var.jcrcontent.proxy.ntlm.host <- 'jcrcontent.proxy.ntlm.host_example' # character | 
var.jcrcontent.proxy.host <- 'jcrcontent.proxy.host_example' # character | 
var.jcrcontent.proxy.password <- 'jcrcontent.proxy.password_example' # character | 
var.jcrcontent.proxy.port <- 3.4 # numeric | 
var.jcrcontent.proxy.user <- 'jcrcontent.proxy.user_example' # character | 
var.jcrcontent.queue.batch.max.size <- 3.4 # numeric | 
var.jcrcontent.queue.batch.mode <- 'jcrcontent.queue.batch.mode_example' # character | 
var.jcrcontent.queue.batch.wait.time <- 3.4 # numeric | 
var.jcrcontent.retry.delay <- 'jcrcontent.retry.delay_example' # character | 
var.jcrcontent.reverse.replication <- 'jcrcontent.reverse.replication_example' # character | 
var.jcrcontent.serialization.type <- 'jcrcontent.serialization.type_example' # character | 
var.jcrcontent.slingresource.type <- 'jcrcontent.slingresource.type_example' # character | 
var.jcrcontent.ssl <- 'jcrcontent.ssl_example' # character | 
var.jcrcontent.transport.ntlm.domain <- 'jcrcontent.transport.ntlm.domain_example' # character | 
var.jcrcontent.transport.ntlm.host <- 'jcrcontent.transport.ntlm.host_example' # character | 
var.jcrcontent.transport.password <- 'jcrcontent.transport.password_example' # character | 
var.jcrcontent.transport.uri <- 'jcrcontent.transport.uri_example' # character | 
var.jcrcontent.transport.user <- 'jcrcontent.transport.user_example' # character | 
var.jcrcontent.trigger.distribute <- 'jcrcontent.trigger.distribute_example' # character | 
var.jcrcontent.trigger.modified <- 'jcrcontent.trigger.modified_example' # character | 
var.jcrcontent.trigger.on.off.time <- 'jcrcontent.trigger.on.off.time_example' # character | 
var.jcrcontent.trigger.receive <- 'jcrcontent.trigger.receive_example' # character | 
var.jcrcontent.trigger.specific <- 'jcrcontent.trigger.specific_example' # character | 
var.jcrcontent.user.id <- 'jcrcontent.user.id_example' # character | 
var.jcrprimary.type <- 'jcrprimary.type_example' # character | 
var.operation <- 'operation_example' # character | 

api.instance <- SlingApi$new()
# Configure HTTP basic authorization: aemAuth
api.instance$apiClient$username <- 'TODO_YOUR_USERNAME';
api.instance$apiClient$password <- 'TODO_YOUR_PASSWORD';
api.instance$PostAgent(var.runmode, var.name, jcrcontent.cqdistribute=var.jcrcontent.cqdistribute, jcrcontent.cqdistribute.type.hint=var.jcrcontent.cqdistribute.type.hint, jcrcontent.cqname=var.jcrcontent.cqname, jcrcontent.cqtemplate=var.jcrcontent.cqtemplate, jcrcontent.enabled=var.jcrcontent.enabled, jcrcontent.jcrdescription=var.jcrcontent.jcrdescription, jcrcontent.jcrlast.modified=var.jcrcontent.jcrlast.modified, jcrcontent.jcrlast.modified.by=var.jcrcontent.jcrlast.modified.by, jcrcontent.jcrmixin.types=var.jcrcontent.jcrmixin.types, jcrcontent.jcrtitle=var.jcrcontent.jcrtitle, jcrcontent.log.level=var.jcrcontent.log.level, jcrcontent.no.status.update=var.jcrcontent.no.status.update, jcrcontent.no.versioning=var.jcrcontent.no.versioning, jcrcontent.protocol.connect.timeout=var.jcrcontent.protocol.connect.timeout, jcrcontent.protocol.http.connection.closed=var.jcrcontent.protocol.http.connection.closed, jcrcontent.protocol.http.expired=var.jcrcontent.protocol.http.expired, jcrcontent.protocol.http.headers=var.jcrcontent.protocol.http.headers, jcrcontent.protocol.http.headers.type.hint=var.jcrcontent.protocol.http.headers.type.hint, jcrcontent.protocol.http.method=var.jcrcontent.protocol.http.method, jcrcontent.protocol.https.relaxed=var.jcrcontent.protocol.https.relaxed, jcrcontent.protocol.interface=var.jcrcontent.protocol.interface, jcrcontent.protocol.socket.timeout=var.jcrcontent.protocol.socket.timeout, jcrcontent.protocol.version=var.jcrcontent.protocol.version, jcrcontent.proxy.ntlm.domain=var.jcrcontent.proxy.ntlm.domain, jcrcontent.proxy.ntlm.host=var.jcrcontent.proxy.ntlm.host, jcrcontent.proxy.host=var.jcrcontent.proxy.host, jcrcontent.proxy.password=var.jcrcontent.proxy.password, jcrcontent.proxy.port=var.jcrcontent.proxy.port, jcrcontent.proxy.user=var.jcrcontent.proxy.user, jcrcontent.queue.batch.max.size=var.jcrcontent.queue.batch.max.size, jcrcontent.queue.batch.mode=var.jcrcontent.queue.batch.mode, jcrcontent.queue.batch.wait.time=var.jcrcontent.queue.batch.wait.time, jcrcontent.retry.delay=var.jcrcontent.retry.delay, jcrcontent.reverse.replication=var.jcrcontent.reverse.replication, jcrcontent.serialization.type=var.jcrcontent.serialization.type, jcrcontent.slingresource.type=var.jcrcontent.slingresource.type, jcrcontent.ssl=var.jcrcontent.ssl, jcrcontent.transport.ntlm.domain=var.jcrcontent.transport.ntlm.domain, jcrcontent.transport.ntlm.host=var.jcrcontent.transport.ntlm.host, jcrcontent.transport.password=var.jcrcontent.transport.password, jcrcontent.transport.uri=var.jcrcontent.transport.uri, jcrcontent.transport.user=var.jcrcontent.transport.user, jcrcontent.trigger.distribute=var.jcrcontent.trigger.distribute, jcrcontent.trigger.modified=var.jcrcontent.trigger.modified, jcrcontent.trigger.on.off.time=var.jcrcontent.trigger.on.off.time, jcrcontent.trigger.receive=var.jcrcontent.trigger.receive, jcrcontent.trigger.specific=var.jcrcontent.trigger.specific, jcrcontent.user.id=var.jcrcontent.user.id, jcrprimary.type=var.jcrprimary.type, operation=var.operation)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runmode** | **character**|  | 
 **name** | **character**|  | 
 **jcrcontent.cqdistribute** | **character**|  | [optional] 
 **jcrcontent.cqdistribute.type.hint** | **character**|  | [optional] 
 **jcrcontent.cqname** | **character**|  | [optional] 
 **jcrcontent.cqtemplate** | **character**|  | [optional] 
 **jcrcontent.enabled** | **character**|  | [optional] 
 **jcrcontent.jcrdescription** | **character**|  | [optional] 
 **jcrcontent.jcrlast.modified** | **character**|  | [optional] 
 **jcrcontent.jcrlast.modified.by** | **character**|  | [optional] 
 **jcrcontent.jcrmixin.types** | **character**|  | [optional] 
 **jcrcontent.jcrtitle** | **character**|  | [optional] 
 **jcrcontent.log.level** | **character**|  | [optional] 
 **jcrcontent.no.status.update** | **character**|  | [optional] 
 **jcrcontent.no.versioning** | **character**|  | [optional] 
 **jcrcontent.protocol.connect.timeout** | **numeric**|  | [optional] 
 **jcrcontent.protocol.http.connection.closed** | **character**|  | [optional] 
 **jcrcontent.protocol.http.expired** | **character**|  | [optional] 
 **jcrcontent.protocol.http.headers** | list( **character** )|  | [optional] 
 **jcrcontent.protocol.http.headers.type.hint** | **character**|  | [optional] 
 **jcrcontent.protocol.http.method** | **character**|  | [optional] 
 **jcrcontent.protocol.https.relaxed** | **character**|  | [optional] 
 **jcrcontent.protocol.interface** | **character**|  | [optional] 
 **jcrcontent.protocol.socket.timeout** | **numeric**|  | [optional] 
 **jcrcontent.protocol.version** | **character**|  | [optional] 
 **jcrcontent.proxy.ntlm.domain** | **character**|  | [optional] 
 **jcrcontent.proxy.ntlm.host** | **character**|  | [optional] 
 **jcrcontent.proxy.host** | **character**|  | [optional] 
 **jcrcontent.proxy.password** | **character**|  | [optional] 
 **jcrcontent.proxy.port** | **numeric**|  | [optional] 
 **jcrcontent.proxy.user** | **character**|  | [optional] 
 **jcrcontent.queue.batch.max.size** | **numeric**|  | [optional] 
 **jcrcontent.queue.batch.mode** | **character**|  | [optional] 
 **jcrcontent.queue.batch.wait.time** | **numeric**|  | [optional] 
 **jcrcontent.retry.delay** | **character**|  | [optional] 
 **jcrcontent.reverse.replication** | **character**|  | [optional] 
 **jcrcontent.serialization.type** | **character**|  | [optional] 
 **jcrcontent.slingresource.type** | **character**|  | [optional] 
 **jcrcontent.ssl** | **character**|  | [optional] 
 **jcrcontent.transport.ntlm.domain** | **character**|  | [optional] 
 **jcrcontent.transport.ntlm.host** | **character**|  | [optional] 
 **jcrcontent.transport.password** | **character**|  | [optional] 
 **jcrcontent.transport.uri** | **character**|  | [optional] 
 **jcrcontent.transport.user** | **character**|  | [optional] 
 **jcrcontent.trigger.distribute** | **character**|  | [optional] 
 **jcrcontent.trigger.modified** | **character**|  | [optional] 
 **jcrcontent.trigger.on.off.time** | **character**|  | [optional] 
 **jcrcontent.trigger.receive** | **character**|  | [optional] 
 **jcrcontent.trigger.specific** | **character**|  | [optional] 
 **jcrcontent.user.id** | **character**|  | [optional] 
 **jcrprimary.type** | **character**|  | [optional] 
 **operation** | **character**|  | [optional] 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

# **PostAuthorizableKeystore**
> KeystoreInfo PostAuthorizableKeystore(intermediate.path, authorizable.id, operation=var.operation, current.password=var.current.password, new.password=var.new.password, re.password=var.re.password, key.password=var.key.password, key.store.pass=var.key.store.pass, alias=var.alias, new.alias=var.new.alias, remove.alias=var.remove.alias, cert.chain=var.cert.chain, pk=var.pk, key.store=var.key.store)



### Example
```R
library(openapi)

var.intermediate.path <- 'intermediate.path_example' # character | 
var.authorizable.id <- 'authorizable.id_example' # character | 
var.operation <- 'operation_example' # character | 
var.current.password <- 'current.password_example' # character | 
var.new.password <- 'new.password_example' # character | 
var.re.password <- 're.password_example' # character | 
var.key.password <- 'key.password_example' # character | 
var.key.store.pass <- 'key.store.pass_example' # character | 
var.alias <- 'alias_example' # character | 
var.new.alias <- 'new.alias_example' # character | 
var.remove.alias <- 'remove.alias_example' # character | 
var.cert.chain <- File.new('/path/to/file') # data.frame | 
var.pk <- File.new('/path/to/file') # data.frame | 
var.key.store <- File.new('/path/to/file') # data.frame | 

api.instance <- SlingApi$new()
# Configure HTTP basic authorization: aemAuth
api.instance$apiClient$username <- 'TODO_YOUR_USERNAME';
api.instance$apiClient$password <- 'TODO_YOUR_PASSWORD';
result <- api.instance$PostAuthorizableKeystore(var.intermediate.path, var.authorizable.id, operation=var.operation, current.password=var.current.password, new.password=var.new.password, re.password=var.re.password, key.password=var.key.password, key.store.pass=var.key.store.pass, alias=var.alias, new.alias=var.new.alias, remove.alias=var.remove.alias, cert.chain=var.cert.chain, pk=var.pk, key.store=var.key.store)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **intermediate.path** | **character**|  | 
 **authorizable.id** | **character**|  | 
 **operation** | **character**|  | [optional] 
 **current.password** | **character**|  | [optional] 
 **new.password** | **character**|  | [optional] 
 **re.password** | **character**|  | [optional] 
 **key.password** | **character**|  | [optional] 
 **key.store.pass** | **character**|  | [optional] 
 **alias** | **character**|  | [optional] 
 **new.alias** | **character**|  | [optional] 
 **remove.alias** | **character**|  | [optional] 
 **cert.chain** | **data.frame**|  | [optional] 
 **pk** | **data.frame**|  | [optional] 
 **key.store** | **data.frame**|  | [optional] 

### Return type

[**KeystoreInfo**](KeystoreInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Retrieved Authorizable Keystore info |  -  |
| **0** | Default response |  -  |

# **PostAuthorizables**
> character PostAuthorizables(authorizable.id, intermediate.path, create.user=var.create.user, create.group=var.create.group, reppassword=var.reppassword, profile.given.name=var.profile.given.name)



### Example
```R
library(openapi)

var.authorizable.id <- 'authorizable.id_example' # character | 
var.intermediate.path <- 'intermediate.path_example' # character | 
var.create.user <- 'create.user_example' # character | 
var.create.group <- 'create.group_example' # character | 
var.reppassword <- 'reppassword_example' # character | 
var.profile.given.name <- 'profile.given.name_example' # character | 

api.instance <- SlingApi$new()
# Configure HTTP basic authorization: aemAuth
api.instance$apiClient$username <- 'TODO_YOUR_USERNAME';
api.instance$apiClient$password <- 'TODO_YOUR_PASSWORD';
result <- api.instance$PostAuthorizables(var.authorizable.id, var.intermediate.path, create.user=var.create.user, create.group=var.create.group, reppassword=var.reppassword, profile.given.name=var.profile.given.name)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorizable.id** | **character**|  | 
 **intermediate.path** | **character**|  | 
 **create.user** | **character**|  | [optional] 
 **create.group** | **character**|  | [optional] 
 **reppassword** | **character**|  | [optional] 
 **profile.given.name** | **character**|  | [optional] 

### Return type

**character**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/html

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

# **PostConfigAdobeGraniteSamlAuthenticationHandler**
> PostConfigAdobeGraniteSamlAuthenticationHandler(key.store.password=var.key.store.password, key.store.password.type.hint=var.key.store.password.type.hint, service.ranking=var.service.ranking, service.ranking.type.hint=var.service.ranking.type.hint, idp.http.redirect=var.idp.http.redirect, idp.http.redirect.type.hint=var.idp.http.redirect.type.hint, create.user=var.create.user, create.user.type.hint=var.create.user.type.hint, default.redirect.url=var.default.redirect.url, default.redirect.url.type.hint=var.default.redirect.url.type.hint, user.id.attribute=var.user.id.attribute, user.id.attribute.type.hint=var.user.id.attribute.type.hint, default.groups=var.default.groups, default.groups.type.hint=var.default.groups.type.hint, idp.cert.alias=var.idp.cert.alias, idp.cert.alias.type.hint=var.idp.cert.alias.type.hint, add.group.memberships=var.add.group.memberships, add.group.memberships.type.hint=var.add.group.memberships.type.hint, path=var.path, path.type.hint=var.path.type.hint, synchronize.attributes=var.synchronize.attributes, synchronize.attributes.type.hint=var.synchronize.attributes.type.hint, clock.tolerance=var.clock.tolerance, clock.tolerance.type.hint=var.clock.tolerance.type.hint, group.membership.attribute=var.group.membership.attribute, group.membership.attribute.type.hint=var.group.membership.attribute.type.hint, idp.url=var.idp.url, idp.url.type.hint=var.idp.url.type.hint, logout.url=var.logout.url, logout.url.type.hint=var.logout.url.type.hint, service.provider.entity.id=var.service.provider.entity.id, service.provider.entity.id.type.hint=var.service.provider.entity.id.type.hint, assertion.consumer.service.url=var.assertion.consumer.service.url, assertion.consumer.service.url.type.hint=var.assertion.consumer.service.url.type.hint, handle.logout=var.handle.logout, handle.logout.type.hint=var.handle.logout.type.hint, sp.private.key.alias=var.sp.private.key.alias, sp.private.key.alias.type.hint=var.sp.private.key.alias.type.hint, use.encryption=var.use.encryption, use.encryption.type.hint=var.use.encryption.type.hint, name.id.format=var.name.id.format, name.id.format.type.hint=var.name.id.format.type.hint, digest.method=var.digest.method, digest.method.type.hint=var.digest.method.type.hint, signature.method=var.signature.method, signature.method.type.hint=var.signature.method.type.hint, user.intermediate.path=var.user.intermediate.path, user.intermediate.path.type.hint=var.user.intermediate.path.type.hint)



### Example
```R
library(openapi)

var.key.store.password <- 'key.store.password_example' # character | 
var.key.store.password.type.hint <- 'key.store.password.type.hint_example' # character | 
var.service.ranking <- 56 # integer | 
var.service.ranking.type.hint <- 'service.ranking.type.hint_example' # character | 
var.idp.http.redirect <- 'idp.http.redirect_example' # character | 
var.idp.http.redirect.type.hint <- 'idp.http.redirect.type.hint_example' # character | 
var.create.user <- 'create.user_example' # character | 
var.create.user.type.hint <- 'create.user.type.hint_example' # character | 
var.default.redirect.url <- 'default.redirect.url_example' # character | 
var.default.redirect.url.type.hint <- 'default.redirect.url.type.hint_example' # character | 
var.user.id.attribute <- 'user.id.attribute_example' # character | 
var.user.id.attribute.type.hint <- 'user.id.attribute.type.hint_example' # character | 
var.default.groups <- list("inner_example") # array[character] | 
var.default.groups.type.hint <- 'default.groups.type.hint_example' # character | 
var.idp.cert.alias <- 'idp.cert.alias_example' # character | 
var.idp.cert.alias.type.hint <- 'idp.cert.alias.type.hint_example' # character | 
var.add.group.memberships <- 'add.group.memberships_example' # character | 
var.add.group.memberships.type.hint <- 'add.group.memberships.type.hint_example' # character | 
var.path <- list("inner_example") # array[character] | 
var.path.type.hint <- 'path.type.hint_example' # character | 
var.synchronize.attributes <- list("inner_example") # array[character] | 
var.synchronize.attributes.type.hint <- 'synchronize.attributes.type.hint_example' # character | 
var.clock.tolerance <- 56 # integer | 
var.clock.tolerance.type.hint <- 'clock.tolerance.type.hint_example' # character | 
var.group.membership.attribute <- 'group.membership.attribute_example' # character | 
var.group.membership.attribute.type.hint <- 'group.membership.attribute.type.hint_example' # character | 
var.idp.url <- 'idp.url_example' # character | 
var.idp.url.type.hint <- 'idp.url.type.hint_example' # character | 
var.logout.url <- 'logout.url_example' # character | 
var.logout.url.type.hint <- 'logout.url.type.hint_example' # character | 
var.service.provider.entity.id <- 'service.provider.entity.id_example' # character | 
var.service.provider.entity.id.type.hint <- 'service.provider.entity.id.type.hint_example' # character | 
var.assertion.consumer.service.url <- 'assertion.consumer.service.url_example' # character | 
var.assertion.consumer.service.url.type.hint <- 'assertion.consumer.service.url.type.hint_example' # character | 
var.handle.logout <- 'handle.logout_example' # character | 
var.handle.logout.type.hint <- 'handle.logout.type.hint_example' # character | 
var.sp.private.key.alias <- 'sp.private.key.alias_example' # character | 
var.sp.private.key.alias.type.hint <- 'sp.private.key.alias.type.hint_example' # character | 
var.use.encryption <- 'use.encryption_example' # character | 
var.use.encryption.type.hint <- 'use.encryption.type.hint_example' # character | 
var.name.id.format <- 'name.id.format_example' # character | 
var.name.id.format.type.hint <- 'name.id.format.type.hint_example' # character | 
var.digest.method <- 'digest.method_example' # character | 
var.digest.method.type.hint <- 'digest.method.type.hint_example' # character | 
var.signature.method <- 'signature.method_example' # character | 
var.signature.method.type.hint <- 'signature.method.type.hint_example' # character | 
var.user.intermediate.path <- 'user.intermediate.path_example' # character | 
var.user.intermediate.path.type.hint <- 'user.intermediate.path.type.hint_example' # character | 

api.instance <- SlingApi$new()
# Configure HTTP basic authorization: aemAuth
api.instance$apiClient$username <- 'TODO_YOUR_USERNAME';
api.instance$apiClient$password <- 'TODO_YOUR_PASSWORD';
api.instance$PostConfigAdobeGraniteSamlAuthenticationHandler(key.store.password=var.key.store.password, key.store.password.type.hint=var.key.store.password.type.hint, service.ranking=var.service.ranking, service.ranking.type.hint=var.service.ranking.type.hint, idp.http.redirect=var.idp.http.redirect, idp.http.redirect.type.hint=var.idp.http.redirect.type.hint, create.user=var.create.user, create.user.type.hint=var.create.user.type.hint, default.redirect.url=var.default.redirect.url, default.redirect.url.type.hint=var.default.redirect.url.type.hint, user.id.attribute=var.user.id.attribute, user.id.attribute.type.hint=var.user.id.attribute.type.hint, default.groups=var.default.groups, default.groups.type.hint=var.default.groups.type.hint, idp.cert.alias=var.idp.cert.alias, idp.cert.alias.type.hint=var.idp.cert.alias.type.hint, add.group.memberships=var.add.group.memberships, add.group.memberships.type.hint=var.add.group.memberships.type.hint, path=var.path, path.type.hint=var.path.type.hint, synchronize.attributes=var.synchronize.attributes, synchronize.attributes.type.hint=var.synchronize.attributes.type.hint, clock.tolerance=var.clock.tolerance, clock.tolerance.type.hint=var.clock.tolerance.type.hint, group.membership.attribute=var.group.membership.attribute, group.membership.attribute.type.hint=var.group.membership.attribute.type.hint, idp.url=var.idp.url, idp.url.type.hint=var.idp.url.type.hint, logout.url=var.logout.url, logout.url.type.hint=var.logout.url.type.hint, service.provider.entity.id=var.service.provider.entity.id, service.provider.entity.id.type.hint=var.service.provider.entity.id.type.hint, assertion.consumer.service.url=var.assertion.consumer.service.url, assertion.consumer.service.url.type.hint=var.assertion.consumer.service.url.type.hint, handle.logout=var.handle.logout, handle.logout.type.hint=var.handle.logout.type.hint, sp.private.key.alias=var.sp.private.key.alias, sp.private.key.alias.type.hint=var.sp.private.key.alias.type.hint, use.encryption=var.use.encryption, use.encryption.type.hint=var.use.encryption.type.hint, name.id.format=var.name.id.format, name.id.format.type.hint=var.name.id.format.type.hint, digest.method=var.digest.method, digest.method.type.hint=var.digest.method.type.hint, signature.method=var.signature.method, signature.method.type.hint=var.signature.method.type.hint, user.intermediate.path=var.user.intermediate.path, user.intermediate.path.type.hint=var.user.intermediate.path.type.hint)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key.store.password** | **character**|  | [optional] 
 **key.store.password.type.hint** | **character**|  | [optional] 
 **service.ranking** | **integer**|  | [optional] 
 **service.ranking.type.hint** | **character**|  | [optional] 
 **idp.http.redirect** | **character**|  | [optional] 
 **idp.http.redirect.type.hint** | **character**|  | [optional] 
 **create.user** | **character**|  | [optional] 
 **create.user.type.hint** | **character**|  | [optional] 
 **default.redirect.url** | **character**|  | [optional] 
 **default.redirect.url.type.hint** | **character**|  | [optional] 
 **user.id.attribute** | **character**|  | [optional] 
 **user.id.attribute.type.hint** | **character**|  | [optional] 
 **default.groups** | list( **character** )|  | [optional] 
 **default.groups.type.hint** | **character**|  | [optional] 
 **idp.cert.alias** | **character**|  | [optional] 
 **idp.cert.alias.type.hint** | **character**|  | [optional] 
 **add.group.memberships** | **character**|  | [optional] 
 **add.group.memberships.type.hint** | **character**|  | [optional] 
 **path** | list( **character** )|  | [optional] 
 **path.type.hint** | **character**|  | [optional] 
 **synchronize.attributes** | list( **character** )|  | [optional] 
 **synchronize.attributes.type.hint** | **character**|  | [optional] 
 **clock.tolerance** | **integer**|  | [optional] 
 **clock.tolerance.type.hint** | **character**|  | [optional] 
 **group.membership.attribute** | **character**|  | [optional] 
 **group.membership.attribute.type.hint** | **character**|  | [optional] 
 **idp.url** | **character**|  | [optional] 
 **idp.url.type.hint** | **character**|  | [optional] 
 **logout.url** | **character**|  | [optional] 
 **logout.url.type.hint** | **character**|  | [optional] 
 **service.provider.entity.id** | **character**|  | [optional] 
 **service.provider.entity.id.type.hint** | **character**|  | [optional] 
 **assertion.consumer.service.url** | **character**|  | [optional] 
 **assertion.consumer.service.url.type.hint** | **character**|  | [optional] 
 **handle.logout** | **character**|  | [optional] 
 **handle.logout.type.hint** | **character**|  | [optional] 
 **sp.private.key.alias** | **character**|  | [optional] 
 **sp.private.key.alias.type.hint** | **character**|  | [optional] 
 **use.encryption** | **character**|  | [optional] 
 **use.encryption.type.hint** | **character**|  | [optional] 
 **name.id.format** | **character**|  | [optional] 
 **name.id.format.type.hint** | **character**|  | [optional] 
 **digest.method** | **character**|  | [optional] 
 **digest.method.type.hint** | **character**|  | [optional] 
 **signature.method** | **character**|  | [optional] 
 **signature.method.type.hint** | **character**|  | [optional] 
 **user.intermediate.path** | **character**|  | [optional] 
 **user.intermediate.path.type.hint** | **character**|  | [optional] 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

# **PostConfigApacheFelixJettyBasedHttpService**
> PostConfigApacheFelixJettyBasedHttpService(org.apache.felix.https.nio=var.org.apache.felix.https.nio, org.apache.felix.https.nio.type.hint=var.org.apache.felix.https.nio.type.hint, org.apache.felix.https.keystore=var.org.apache.felix.https.keystore, org.apache.felix.https.keystore.type.hint=var.org.apache.felix.https.keystore.type.hint, org.apache.felix.https.keystore.password=var.org.apache.felix.https.keystore.password, org.apache.felix.https.keystore.password.type.hint=var.org.apache.felix.https.keystore.password.type.hint, org.apache.felix.https.keystore.key=var.org.apache.felix.https.keystore.key, org.apache.felix.https.keystore.key.type.hint=var.org.apache.felix.https.keystore.key.type.hint, org.apache.felix.https.keystore.key.password=var.org.apache.felix.https.keystore.key.password, org.apache.felix.https.keystore.key.password.type.hint=var.org.apache.felix.https.keystore.key.password.type.hint, org.apache.felix.https.truststore=var.org.apache.felix.https.truststore, org.apache.felix.https.truststore.type.hint=var.org.apache.felix.https.truststore.type.hint, org.apache.felix.https.truststore.password=var.org.apache.felix.https.truststore.password, org.apache.felix.https.truststore.password.type.hint=var.org.apache.felix.https.truststore.password.type.hint, org.apache.felix.https.clientcertificate=var.org.apache.felix.https.clientcertificate, org.apache.felix.https.clientcertificate.type.hint=var.org.apache.felix.https.clientcertificate.type.hint, org.apache.felix.https.enable=var.org.apache.felix.https.enable, org.apache.felix.https.enable.type.hint=var.org.apache.felix.https.enable.type.hint, org.osgi.service.http.port.secure=var.org.osgi.service.http.port.secure, org.osgi.service.http.port.secure.type.hint=var.org.osgi.service.http.port.secure.type.hint)



### Example
```R
library(openapi)

var.org.apache.felix.https.nio <- 'org.apache.felix.https.nio_example' # character | 
var.org.apache.felix.https.nio.type.hint <- 'org.apache.felix.https.nio.type.hint_example' # character | 
var.org.apache.felix.https.keystore <- 'org.apache.felix.https.keystore_example' # character | 
var.org.apache.felix.https.keystore.type.hint <- 'org.apache.felix.https.keystore.type.hint_example' # character | 
var.org.apache.felix.https.keystore.password <- 'org.apache.felix.https.keystore.password_example' # character | 
var.org.apache.felix.https.keystore.password.type.hint <- 'org.apache.felix.https.keystore.password.type.hint_example' # character | 
var.org.apache.felix.https.keystore.key <- 'org.apache.felix.https.keystore.key_example' # character | 
var.org.apache.felix.https.keystore.key.type.hint <- 'org.apache.felix.https.keystore.key.type.hint_example' # character | 
var.org.apache.felix.https.keystore.key.password <- 'org.apache.felix.https.keystore.key.password_example' # character | 
var.org.apache.felix.https.keystore.key.password.type.hint <- 'org.apache.felix.https.keystore.key.password.type.hint_example' # character | 
var.org.apache.felix.https.truststore <- 'org.apache.felix.https.truststore_example' # character | 
var.org.apache.felix.https.truststore.type.hint <- 'org.apache.felix.https.truststore.type.hint_example' # character | 
var.org.apache.felix.https.truststore.password <- 'org.apache.felix.https.truststore.password_example' # character | 
var.org.apache.felix.https.truststore.password.type.hint <- 'org.apache.felix.https.truststore.password.type.hint_example' # character | 
var.org.apache.felix.https.clientcertificate <- 'org.apache.felix.https.clientcertificate_example' # character | 
var.org.apache.felix.https.clientcertificate.type.hint <- 'org.apache.felix.https.clientcertificate.type.hint_example' # character | 
var.org.apache.felix.https.enable <- 'org.apache.felix.https.enable_example' # character | 
var.org.apache.felix.https.enable.type.hint <- 'org.apache.felix.https.enable.type.hint_example' # character | 
var.org.osgi.service.http.port.secure <- 'org.osgi.service.http.port.secure_example' # character | 
var.org.osgi.service.http.port.secure.type.hint <- 'org.osgi.service.http.port.secure.type.hint_example' # character | 

api.instance <- SlingApi$new()
# Configure HTTP basic authorization: aemAuth
api.instance$apiClient$username <- 'TODO_YOUR_USERNAME';
api.instance$apiClient$password <- 'TODO_YOUR_PASSWORD';
api.instance$PostConfigApacheFelixJettyBasedHttpService(org.apache.felix.https.nio=var.org.apache.felix.https.nio, org.apache.felix.https.nio.type.hint=var.org.apache.felix.https.nio.type.hint, org.apache.felix.https.keystore=var.org.apache.felix.https.keystore, org.apache.felix.https.keystore.type.hint=var.org.apache.felix.https.keystore.type.hint, org.apache.felix.https.keystore.password=var.org.apache.felix.https.keystore.password, org.apache.felix.https.keystore.password.type.hint=var.org.apache.felix.https.keystore.password.type.hint, org.apache.felix.https.keystore.key=var.org.apache.felix.https.keystore.key, org.apache.felix.https.keystore.key.type.hint=var.org.apache.felix.https.keystore.key.type.hint, org.apache.felix.https.keystore.key.password=var.org.apache.felix.https.keystore.key.password, org.apache.felix.https.keystore.key.password.type.hint=var.org.apache.felix.https.keystore.key.password.type.hint, org.apache.felix.https.truststore=var.org.apache.felix.https.truststore, org.apache.felix.https.truststore.type.hint=var.org.apache.felix.https.truststore.type.hint, org.apache.felix.https.truststore.password=var.org.apache.felix.https.truststore.password, org.apache.felix.https.truststore.password.type.hint=var.org.apache.felix.https.truststore.password.type.hint, org.apache.felix.https.clientcertificate=var.org.apache.felix.https.clientcertificate, org.apache.felix.https.clientcertificate.type.hint=var.org.apache.felix.https.clientcertificate.type.hint, org.apache.felix.https.enable=var.org.apache.felix.https.enable, org.apache.felix.https.enable.type.hint=var.org.apache.felix.https.enable.type.hint, org.osgi.service.http.port.secure=var.org.osgi.service.http.port.secure, org.osgi.service.http.port.secure.type.hint=var.org.osgi.service.http.port.secure.type.hint)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org.apache.felix.https.nio** | **character**|  | [optional] 
 **org.apache.felix.https.nio.type.hint** | **character**|  | [optional] 
 **org.apache.felix.https.keystore** | **character**|  | [optional] 
 **org.apache.felix.https.keystore.type.hint** | **character**|  | [optional] 
 **org.apache.felix.https.keystore.password** | **character**|  | [optional] 
 **org.apache.felix.https.keystore.password.type.hint** | **character**|  | [optional] 
 **org.apache.felix.https.keystore.key** | **character**|  | [optional] 
 **org.apache.felix.https.keystore.key.type.hint** | **character**|  | [optional] 
 **org.apache.felix.https.keystore.key.password** | **character**|  | [optional] 
 **org.apache.felix.https.keystore.key.password.type.hint** | **character**|  | [optional] 
 **org.apache.felix.https.truststore** | **character**|  | [optional] 
 **org.apache.felix.https.truststore.type.hint** | **character**|  | [optional] 
 **org.apache.felix.https.truststore.password** | **character**|  | [optional] 
 **org.apache.felix.https.truststore.password.type.hint** | **character**|  | [optional] 
 **org.apache.felix.https.clientcertificate** | **character**|  | [optional] 
 **org.apache.felix.https.clientcertificate.type.hint** | **character**|  | [optional] 
 **org.apache.felix.https.enable** | **character**|  | [optional] 
 **org.apache.felix.https.enable.type.hint** | **character**|  | [optional] 
 **org.osgi.service.http.port.secure** | **character**|  | [optional] 
 **org.osgi.service.http.port.secure.type.hint** | **character**|  | [optional] 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

# **PostConfigApacheHttpComponentsProxyConfiguration**
> PostConfigApacheHttpComponentsProxyConfiguration(proxy.host=var.proxy.host, proxy.host.type.hint=var.proxy.host.type.hint, proxy.port=var.proxy.port, proxy.port.type.hint=var.proxy.port.type.hint, proxy.exceptions=var.proxy.exceptions, proxy.exceptions.type.hint=var.proxy.exceptions.type.hint, proxy.enabled=var.proxy.enabled, proxy.enabled.type.hint=var.proxy.enabled.type.hint, proxy.user=var.proxy.user, proxy.user.type.hint=var.proxy.user.type.hint, proxy.password=var.proxy.password, proxy.password.type.hint=var.proxy.password.type.hint)



### Example
```R
library(openapi)

var.proxy.host <- 'proxy.host_example' # character | 
var.proxy.host.type.hint <- 'proxy.host.type.hint_example' # character | 
var.proxy.port <- 56 # integer | 
var.proxy.port.type.hint <- 'proxy.port.type.hint_example' # character | 
var.proxy.exceptions <- list("inner_example") # array[character] | 
var.proxy.exceptions.type.hint <- 'proxy.exceptions.type.hint_example' # character | 
var.proxy.enabled <- 'proxy.enabled_example' # character | 
var.proxy.enabled.type.hint <- 'proxy.enabled.type.hint_example' # character | 
var.proxy.user <- 'proxy.user_example' # character | 
var.proxy.user.type.hint <- 'proxy.user.type.hint_example' # character | 
var.proxy.password <- 'proxy.password_example' # character | 
var.proxy.password.type.hint <- 'proxy.password.type.hint_example' # character | 

api.instance <- SlingApi$new()
# Configure HTTP basic authorization: aemAuth
api.instance$apiClient$username <- 'TODO_YOUR_USERNAME';
api.instance$apiClient$password <- 'TODO_YOUR_PASSWORD';
api.instance$PostConfigApacheHttpComponentsProxyConfiguration(proxy.host=var.proxy.host, proxy.host.type.hint=var.proxy.host.type.hint, proxy.port=var.proxy.port, proxy.port.type.hint=var.proxy.port.type.hint, proxy.exceptions=var.proxy.exceptions, proxy.exceptions.type.hint=var.proxy.exceptions.type.hint, proxy.enabled=var.proxy.enabled, proxy.enabled.type.hint=var.proxy.enabled.type.hint, proxy.user=var.proxy.user, proxy.user.type.hint=var.proxy.user.type.hint, proxy.password=var.proxy.password, proxy.password.type.hint=var.proxy.password.type.hint)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **proxy.host** | **character**|  | [optional] 
 **proxy.host.type.hint** | **character**|  | [optional] 
 **proxy.port** | **integer**|  | [optional] 
 **proxy.port.type.hint** | **character**|  | [optional] 
 **proxy.exceptions** | list( **character** )|  | [optional] 
 **proxy.exceptions.type.hint** | **character**|  | [optional] 
 **proxy.enabled** | **character**|  | [optional] 
 **proxy.enabled.type.hint** | **character**|  | [optional] 
 **proxy.user** | **character**|  | [optional] 
 **proxy.user.type.hint** | **character**|  | [optional] 
 **proxy.password** | **character**|  | [optional] 
 **proxy.password.type.hint** | **character**|  | [optional] 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

# **PostConfigApacheSlingDavExServlet**
> PostConfigApacheSlingDavExServlet(alias=var.alias, alias.type.hint=var.alias.type.hint, dav.create.absolute.uri=var.dav.create.absolute.uri, dav.create.absolute.uri.type.hint=var.dav.create.absolute.uri.type.hint)



### Example
```R
library(openapi)

var.alias <- 'alias_example' # character | 
var.alias.type.hint <- 'alias.type.hint_example' # character | 
var.dav.create.absolute.uri <- 'dav.create.absolute.uri_example' # character | 
var.dav.create.absolute.uri.type.hint <- 'dav.create.absolute.uri.type.hint_example' # character | 

api.instance <- SlingApi$new()
# Configure HTTP basic authorization: aemAuth
api.instance$apiClient$username <- 'TODO_YOUR_USERNAME';
api.instance$apiClient$password <- 'TODO_YOUR_PASSWORD';
api.instance$PostConfigApacheSlingDavExServlet(alias=var.alias, alias.type.hint=var.alias.type.hint, dav.create.absolute.uri=var.dav.create.absolute.uri, dav.create.absolute.uri.type.hint=var.dav.create.absolute.uri.type.hint)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **alias** | **character**|  | [optional] 
 **alias.type.hint** | **character**|  | [optional] 
 **dav.create.absolute.uri** | **character**|  | [optional] 
 **dav.create.absolute.uri.type.hint** | **character**|  | [optional] 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

# **PostConfigApacheSlingGetServlet**
> PostConfigApacheSlingGetServlet(json.maximumresults=var.json.maximumresults, json.maximumresults.type.hint=var.json.maximumresults.type.hint, enable.html=var.enable.html, enable.html.type.hint=var.enable.html.type.hint, enable.txt=var.enable.txt, enable.txt.type.hint=var.enable.txt.type.hint, enable.xml=var.enable.xml, enable.xml.type.hint=var.enable.xml.type.hint)



### Example
```R
library(openapi)

var.json.maximumresults <- 'json.maximumresults_example' # character | 
var.json.maximumresults.type.hint <- 'json.maximumresults.type.hint_example' # character | 
var.enable.html <- 'enable.html_example' # character | 
var.enable.html.type.hint <- 'enable.html.type.hint_example' # character | 
var.enable.txt <- 'enable.txt_example' # character | 
var.enable.txt.type.hint <- 'enable.txt.type.hint_example' # character | 
var.enable.xml <- 'enable.xml_example' # character | 
var.enable.xml.type.hint <- 'enable.xml.type.hint_example' # character | 

api.instance <- SlingApi$new()
# Configure HTTP basic authorization: aemAuth
api.instance$apiClient$username <- 'TODO_YOUR_USERNAME';
api.instance$apiClient$password <- 'TODO_YOUR_PASSWORD';
api.instance$PostConfigApacheSlingGetServlet(json.maximumresults=var.json.maximumresults, json.maximumresults.type.hint=var.json.maximumresults.type.hint, enable.html=var.enable.html, enable.html.type.hint=var.enable.html.type.hint, enable.txt=var.enable.txt, enable.txt.type.hint=var.enable.txt.type.hint, enable.xml=var.enable.xml, enable.xml.type.hint=var.enable.xml.type.hint)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **json.maximumresults** | **character**|  | [optional] 
 **json.maximumresults.type.hint** | **character**|  | [optional] 
 **enable.html** | **character**|  | [optional] 
 **enable.html.type.hint** | **character**|  | [optional] 
 **enable.txt** | **character**|  | [optional] 
 **enable.txt.type.hint** | **character**|  | [optional] 
 **enable.xml** | **character**|  | [optional] 
 **enable.xml.type.hint** | **character**|  | [optional] 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

# **PostConfigApacheSlingReferrerFilter**
> PostConfigApacheSlingReferrerFilter(allow.empty=var.allow.empty, allow.empty.type.hint=var.allow.empty.type.hint, allow.hosts=var.allow.hosts, allow.hosts.type.hint=var.allow.hosts.type.hint, allow.hosts.regexp=var.allow.hosts.regexp, allow.hosts.regexp.type.hint=var.allow.hosts.regexp.type.hint, filter.methods=var.filter.methods, filter.methods.type.hint=var.filter.methods.type.hint)



### Example
```R
library(openapi)

var.allow.empty <- 'allow.empty_example' # character | 
var.allow.empty.type.hint <- 'allow.empty.type.hint_example' # character | 
var.allow.hosts <- 'allow.hosts_example' # character | 
var.allow.hosts.type.hint <- 'allow.hosts.type.hint_example' # character | 
var.allow.hosts.regexp <- 'allow.hosts.regexp_example' # character | 
var.allow.hosts.regexp.type.hint <- 'allow.hosts.regexp.type.hint_example' # character | 
var.filter.methods <- 'filter.methods_example' # character | 
var.filter.methods.type.hint <- 'filter.methods.type.hint_example' # character | 

api.instance <- SlingApi$new()
# Configure HTTP basic authorization: aemAuth
api.instance$apiClient$username <- 'TODO_YOUR_USERNAME';
api.instance$apiClient$password <- 'TODO_YOUR_PASSWORD';
api.instance$PostConfigApacheSlingReferrerFilter(allow.empty=var.allow.empty, allow.empty.type.hint=var.allow.empty.type.hint, allow.hosts=var.allow.hosts, allow.hosts.type.hint=var.allow.hosts.type.hint, allow.hosts.regexp=var.allow.hosts.regexp, allow.hosts.regexp.type.hint=var.allow.hosts.regexp.type.hint, filter.methods=var.filter.methods, filter.methods.type.hint=var.filter.methods.type.hint)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allow.empty** | **character**|  | [optional] 
 **allow.empty.type.hint** | **character**|  | [optional] 
 **allow.hosts** | **character**|  | [optional] 
 **allow.hosts.type.hint** | **character**|  | [optional] 
 **allow.hosts.regexp** | **character**|  | [optional] 
 **allow.hosts.regexp.type.hint** | **character**|  | [optional] 
 **filter.methods** | **character**|  | [optional] 
 **filter.methods.type.hint** | **character**|  | [optional] 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

# **PostConfigProperty**
> PostConfigProperty(config.node.name)



### Example
```R
library(openapi)

var.config.node.name <- 'config.node.name_example' # character | 

api.instance <- SlingApi$new()
# Configure HTTP basic authorization: aemAuth
api.instance$apiClient$username <- 'TODO_YOUR_USERNAME';
api.instance$apiClient$password <- 'TODO_YOUR_PASSWORD';
api.instance$PostConfigProperty(var.config.node.name)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **config.node.name** | **character**|  | 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

# **PostNode**
> PostNode(path, name, operation=var.operation, delete.authorizable=var.delete.authorizable, file=var.file)



### Example
```R
library(openapi)

var.path <- 'path_example' # character | 
var.name <- 'name_example' # character | 
var.operation <- 'operation_example' # character | 
var.delete.authorizable <- 'delete.authorizable_example' # character | 
var.file <- File.new('/path/to/file') # data.frame | 

api.instance <- SlingApi$new()
# Configure HTTP basic authorization: aemAuth
api.instance$apiClient$username <- 'TODO_YOUR_USERNAME';
api.instance$apiClient$password <- 'TODO_YOUR_PASSWORD';
api.instance$PostNode(var.path, var.name, operation=var.operation, delete.authorizable=var.delete.authorizable, file=var.file)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **character**|  | 
 **name** | **character**|  | 
 **operation** | **character**|  | [optional] 
 **delete.authorizable** | **character**|  | [optional] 
 **file** | **data.frame**|  | [optional] 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

# **PostNodeRw**
> PostNodeRw(path, name, add.members=var.add.members)



### Example
```R
library(openapi)

var.path <- 'path_example' # character | 
var.name <- 'name_example' # character | 
var.add.members <- 'add.members_example' # character | 

api.instance <- SlingApi$new()
# Configure HTTP basic authorization: aemAuth
api.instance$apiClient$username <- 'TODO_YOUR_USERNAME';
api.instance$apiClient$password <- 'TODO_YOUR_PASSWORD';
api.instance$PostNodeRw(var.path, var.name, add.members=var.add.members)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **character**|  | 
 **name** | **character**|  | 
 **add.members** | **character**|  | [optional] 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

# **PostPath**
> PostPath(path, jcrprimary.type, name)



### Example
```R
library(openapi)

var.path <- 'path_example' # character | 
var.jcrprimary.type <- 'jcrprimary.type_example' # character | 
var.name <- 'name_example' # character | 

api.instance <- SlingApi$new()
# Configure HTTP basic authorization: aemAuth
api.instance$apiClient$username <- 'TODO_YOUR_USERNAME';
api.instance$apiClient$password <- 'TODO_YOUR_PASSWORD';
api.instance$PostPath(var.path, var.jcrprimary.type, var.name)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **character**|  | 
 **jcrprimary.type** | **character**|  | 
 **name** | **character**|  | 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

# **PostQuery**
> character PostQuery(path, p.limit, Var1.property, Var1.property.value)



### Example
```R
library(openapi)

var.path <- 'path_example' # character | 
var.p.limit <- 3.4 # numeric | 
var.Var1.property <- 'Var1.property_example' # character | 
var.Var1.property.value <- 'Var1.property.value_example' # character | 

api.instance <- SlingApi$new()
# Configure HTTP basic authorization: aemAuth
api.instance$apiClient$username <- 'TODO_YOUR_USERNAME';
api.instance$apiClient$password <- 'TODO_YOUR_PASSWORD';
result <- api.instance$PostQuery(var.path, var.p.limit, var.Var1.property, var.Var1.property.value)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **character**|  | 
 **p.limit** | **numeric**|  | 
 **Var1.property** | **character**|  | 
 **Var1.property.value** | **character**|  | 

### Return type

**character**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

# **PostTreeActivation**
> PostTreeActivation(ignoredeactivated, onlymodified, path)



### Example
```R
library(openapi)

var.ignoredeactivated <- 'ignoredeactivated_example' # character | 
var.onlymodified <- 'onlymodified_example' # character | 
var.path <- 'path_example' # character | 

api.instance <- SlingApi$new()
# Configure HTTP basic authorization: aemAuth
api.instance$apiClient$username <- 'TODO_YOUR_USERNAME';
api.instance$apiClient$password <- 'TODO_YOUR_PASSWORD';
api.instance$PostTreeActivation(var.ignoredeactivated, var.onlymodified, var.path)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ignoredeactivated** | **character**|  | 
 **onlymodified** | **character**|  | 
 **path** | **character**|  | 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

# **PostTruststore**
> character PostTruststore(operation=var.operation, new.password=var.new.password, re.password=var.re.password, key.store.type=var.key.store.type, remove.alias=var.remove.alias, certificate=var.certificate)



### Example
```R
library(openapi)

var.operation <- 'operation_example' # character | 
var.new.password <- 'new.password_example' # character | 
var.re.password <- 're.password_example' # character | 
var.key.store.type <- 'key.store.type_example' # character | 
var.remove.alias <- 'remove.alias_example' # character | 
var.certificate <- File.new('/path/to/file') # data.frame | 

api.instance <- SlingApi$new()
# Configure HTTP basic authorization: aemAuth
api.instance$apiClient$username <- 'TODO_YOUR_USERNAME';
api.instance$apiClient$password <- 'TODO_YOUR_PASSWORD';
result <- api.instance$PostTruststore(operation=var.operation, new.password=var.new.password, re.password=var.re.password, key.store.type=var.key.store.type, remove.alias=var.remove.alias, certificate=var.certificate)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **operation** | **character**|  | [optional] 
 **new.password** | **character**|  | [optional] 
 **re.password** | **character**|  | [optional] 
 **key.store.type** | **character**|  | [optional] 
 **remove.alias** | **character**|  | [optional] 
 **certificate** | **data.frame**|  | [optional] 

### Return type

**character**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

# **PostTruststorePKCS12**
> character PostTruststorePKCS12(truststore.p12=var.truststore.p12)



### Example
```R
library(openapi)

var.truststore.p12 <- File.new('/path/to/file') # data.frame | 

api.instance <- SlingApi$new()
# Configure HTTP basic authorization: aemAuth
api.instance$apiClient$username <- 'TODO_YOUR_USERNAME';
api.instance$apiClient$password <- 'TODO_YOUR_PASSWORD';
result <- api.instance$PostTruststorePKCS12(truststore.p12=var.truststore.p12)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **truststore.p12** | **data.frame**|  | [optional] 

### Return type

**character**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

