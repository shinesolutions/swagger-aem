<a name="__pageTop"></a>
# SlingApi   { #SlingApi }


All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete_agent**](#delete_agent) | **DELETE** `/etc/replication/agents.{runmode}/{name}` | 
[**delete_node**](#delete_node) | **DELETE** `/{path}/{name}` | 
[**get_agent**](#get_agent) | **GET** `/etc/replication/agents.{runmode}/{name}` | 
[**get_agents**](#get_agents) | **GET** `/etc/replication/agents.{runmode}.-1.json` | 
[**get_authorizable_keystore**](#get_authorizable_keystore) | **GET** `/{intermediatePath}/{authorizableId}.ks.json` | 
[**get_keystore**](#get_keystore) | **GET** `/{intermediatePath}/{authorizableId}/keystore/store.p12` | 
[**get_node**](#get_node) | **GET** `/{path}/{name}` | 
[**get_package**](#get_package) | **GET** `/etc/packages/{group}/{name}-{version}.zip` | 
[**get_package_filter**](#get_package_filter) | **GET** `/etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json` | 
[**get_query**](#get_query) | **GET** `/bin/querybuilder.json` | 
[**get_truststore**](#get_truststore) | **GET** `/etc/truststore/truststore.p12` | 
[**get_truststore_info**](#get_truststore_info) | **GET** `/libs/granite/security/truststore.json` | 
[**post_agent**](#post_agent) | **POST** `/etc/replication/agents.{runmode}/{name}` | 
[**post_authorizable_keystore**](#post_authorizable_keystore) | **POST** `/{intermediatePath}/{authorizableId}.ks.html` | 
[**post_authorizables**](#post_authorizables) | **POST** `/libs/granite/security/post/authorizables` | 
[**post_config_adobe_granite_saml_authentication_handler**](#post_config_adobe_granite_saml_authentication_handler) | **POST** `/apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config` | 
[**post_config_apache_felix_jetty_based_http_service**](#post_config_apache_felix_jetty_based_http_service) | **POST** `/apps/system/config/org.apache.felix.http` | 
[**post_config_apache_http_components_proxy_configuration**](#post_config_apache_http_components_proxy_configuration) | **POST** `/apps/system/config/org.apache.http.proxyconfigurator.config` | 
[**post_config_apache_sling_dav_ex_servlet**](#post_config_apache_sling_dav_ex_servlet) | **POST** `/apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet` | 
[**post_config_apache_sling_get_servlet**](#post_config_apache_sling_get_servlet) | **POST** `/apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet` | 
[**post_config_apache_sling_referrer_filter**](#post_config_apache_sling_referrer_filter) | **POST** `/apps/system/config/org.apache.sling.security.impl.ReferrerFilter` | 
[**post_config_property**](#post_config_property) | **POST** `/apps/system/config/{configNodeName}` | 
[**post_node**](#post_node) | **POST** `/{path}/{name}` | 
[**post_node_rw**](#post_node_rw) | **POST** `/{path}/{name}.rw.html` | 
[**post_path**](#post_path) | **POST** `/{path}/` | 
[**post_query**](#post_query) | **POST** `/bin/querybuilder.json` | 
[**post_tree_activation**](#post_tree_activation) | **POST** `/libs/replication/treeactivation.html` | 
[**post_truststore**](#post_truststore) | **POST** `/libs/granite/security/post/truststore` | 
[**post_truststore_pkcs12**](#post_truststore_pkcs12) | **POST** `/etc/truststore` | 

# **delete_agent**   { #delete_agent }
<a name="delete_agent"></a>

> `delete_agent(runmode: String,name: String, on_success: Callable, on_failure: Callable)`





### Example

* Basic Authentication (`aemAuth`)

```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = SlingApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = SlingApi.new(config, client)


# Invoke an endpoint
api.delete_agent(
	# runmode: String = ""   Eg: runmode_example
	runmode,
	# name: String = ""   Eg: name_example
	name,
	# On Success
	func(response):
		prints("Success!", "delete_agent", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **delete_node**   { #delete_node }
<a name="delete_node"></a>

> `delete_node(path: String,name: String, on_success: Callable, on_failure: Callable)`





### Example

* Basic Authentication (`aemAuth`)

```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = SlingApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = SlingApi.new(config, client)


# Invoke an endpoint
api.delete_node(
	# path: String = ""   Eg: path_example
	path,
	# name: String = ""   Eg: name_example
	name,
	# On Success
	func(response):
		prints("Success!", "delete_node", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **get_agent**   { #get_agent }
<a name="get_agent"></a>

> `get_agent(runmode: String,name: String, on_success: Callable, on_failure: Callable)`





### Example

* Basic Authentication (`aemAuth`)

```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = SlingApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = SlingApi.new(config, client)


# Invoke an endpoint
api.get_agent(
	# runmode: String = ""   Eg: runmode_example
	runmode,
	# name: String = ""   Eg: name_example
	name,
	# On Success
	func(response):
		prints("Success!", "get_agent", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **get_agents**   { #get_agents }
<a name="get_agents"></a>

> `get_agents(runmode: String, on_success: Callable, on_failure: Callable)`





### Example

* Basic Authentication (`aemAuth`)

```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = SlingApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = SlingApi.new(config, client)


# Invoke an endpoint
api.get_agents(
	# runmode: String = ""   Eg: runmode_example
	runmode,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "get_agents", response)
		assert(response.data is string)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **get_authorizable_keystore**   { #get_authorizable_keystore }
<a name="get_authorizable_keystore"></a>

> `get_authorizable_keystore(intermediatePath: String,authorizableId: String, on_success: Callable, on_failure: Callable)`





### Example

* Basic Authentication (`aemAuth`)

```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = SlingApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = SlingApi.new(config, client)


# Invoke an endpoint
api.get_authorizable_keystore(
	# intermediatePath: String = ""   Eg: intermediatePath_example
	intermediatePath,
	# authorizableId: String = ""   Eg: authorizableId_example
	authorizableId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "get_authorizable_keystore", response)
		assert(response.data is KeystoreInfo)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **get_keystore**   { #get_keystore }
<a name="get_keystore"></a>

> `get_keystore(intermediatePath: String,authorizableId: String, on_success: Callable, on_failure: Callable)`





### Example

* Basic Authentication (`aemAuth`)

```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = SlingApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = SlingApi.new(config, client)


# Invoke an endpoint
api.get_keystore(
	# intermediatePath: String = ""   Eg: intermediatePath_example
	intermediatePath,
	# authorizableId: String = ""   Eg: authorizableId_example
	authorizableId,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "get_keystore", response)
		assert(response.data is file)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **get_node**   { #get_node }
<a name="get_node"></a>

> `get_node(path: String,name: String, on_success: Callable, on_failure: Callable)`





### Example

* Basic Authentication (`aemAuth`)

```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = SlingApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = SlingApi.new(config, client)


# Invoke an endpoint
api.get_node(
	# path: String = ""   Eg: path_example
	path,
	# name: String = ""   Eg: name_example
	name,
	# On Success
	func(response):
		prints("Success!", "get_node", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **get_package**   { #get_package }
<a name="get_package"></a>

> `get_package(group: String,name: String,version: String, on_success: Callable, on_failure: Callable)`





### Example

* Basic Authentication (`aemAuth`)

```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = SlingApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = SlingApi.new(config, client)


# Invoke an endpoint
api.get_package(
	# group: String = ""   Eg: group_example
	group,
	# name: String = ""   Eg: name_example
	name,
	# version: String = ""   Eg: version_example
	version,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "get_package", response)
		assert(response.data is file)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **get_package_filter**   { #get_package_filter }
<a name="get_package_filter"></a>

> `get_package_filter(group: String,name: String,version: String, on_success: Callable, on_failure: Callable)`





### Example

* Basic Authentication (`aemAuth`)

```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = SlingApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = SlingApi.new(config, client)


# Invoke an endpoint
api.get_package_filter(
	# group: String = ""   Eg: group_example
	group,
	# name: String = ""   Eg: name_example
	name,
	# version: String = ""   Eg: version_example
	version,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "get_package_filter", response)
		assert(response.data is string)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **get_query**   { #get_query }
<a name="get_query"></a>

> `get_query(path: String,pPeriodlimit: float,1Property: String,1PropertyPeriodvalue: String, on_success: Callable, on_failure: Callable)`





### Example

* Basic Authentication (`aemAuth`)

```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = SlingApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = SlingApi.new(config, client)


# Invoke an endpoint
api.get_query(
	# path: String = ""   Eg: path_example
	path,
	# pPeriodlimit: float   Eg: 8.14
	pPeriodlimit,
	# 1Property: String = ""   Eg: 1Property_example
	1Property,
	# 1PropertyPeriodvalue: String = ""   Eg: 1PropertyPeriodvalue_example
	1PropertyPeriodvalue,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "get_query", response)
		assert(response.data is string)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **get_truststore**   { #get_truststore }
<a name="get_truststore"></a>

> `get_truststore( on_success: Callable, on_failure: Callable)`





### Example

* Basic Authentication (`aemAuth`)

```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = SlingApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = SlingApi.new(config, client)


# Invoke an endpoint
api.get_truststore(
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "get_truststore", response)
		assert(response.data is file)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **get_truststore_info**   { #get_truststore_info }
<a name="get_truststore_info"></a>

> `get_truststore_info( on_success: Callable, on_failure: Callable)`





### Example

* Basic Authentication (`aemAuth`)

```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = SlingApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = SlingApi.new(config, client)


# Invoke an endpoint
api.get_truststore_info(
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "get_truststore_info", response)
		assert(response.data is TruststoreInfo)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **post_agent**   { #post_agent }
<a name="post_agent"></a>

> `post_agent(runmode: String,name: String,jcrContentSlashcqDistribute = null,jcrContentSlashcqDistributeAtTypeHint = "",jcrContentSlashcqName = "",jcrContentSlashcqTemplate = "",jcrContentSlashaliasUpdate = null,jcrContentSlashenabled = null,jcrContentSlashjcrDescription = "",jcrContentSlashjcrLastModified = "",jcrContentSlashjcrLastModifiedBy = "",jcrContentSlashjcrMixinTypes = "",jcrContentSlashjcrTitle = "",jcrContentSlashlogLevel = "",jcrContentSlashnoStatusUpdate = null,jcrContentSlashnoVersioning = null,jcrContentSlashprotocolConnectTimeout = null,jcrContentSlashprotocolHTTPConnectionClosed = null,jcrContentSlashprotocolHTTPExpired = "",jcrContentSlashprotocolHTTPHeaders = null,jcrContentSlashprotocolHTTPHeadersAtTypeHint = "",jcrContentSlashprotocolHTTPMethod = "",jcrContentSlashprotocolHTTPSRelaxed = null,jcrContentSlashprotocolInterface = "",jcrContentSlashprotocolSocketTimeout = null,jcrContentSlashprotocolVersion = "",jcrContentSlashproxyNTLMDomain = "",jcrContentSlashproxyNTLMHost = "",jcrContentSlashproxyHost = "",jcrContentSlashproxyPassword = "",jcrContentSlashproxyPort = null,jcrContentSlashproxyUser = "",jcrContentSlashqueueBatchMaxSize = null,jcrContentSlashqueueBatchMode = "",jcrContentSlashqueueBatchWaitTime = null,jcrContentSlashretryDelay = "",jcrContentSlashreverseReplication = null,jcrContentSlashserializationType = "",jcrContentSlashslingResourceType = "",jcrContentSlashssl = "",jcrContentSlashtransportNTLMDomain = "",jcrContentSlashtransportNTLMHost = "",jcrContentSlashtransportPassword = "",jcrContentSlashtransportUri = "",jcrContentSlashtransportUser = "",jcrContentSlashtriggerDistribute = null,jcrContentSlashtriggerModified = null,jcrContentSlashtriggerOnOffTime = null,jcrContentSlashtriggerReceive = null,jcrContentSlashtriggerSpecific = null,jcrContentSlashuserId = "",jcrPrimaryType = "",operation = "", on_success: Callable, on_failure: Callable)`





### Example

* Basic Authentication (`aemAuth`)

```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = SlingApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = SlingApi.new(config, client)


# Invoke an endpoint
api.post_agent(
	# runmode: String = ""   Eg: runmode_example
	runmode,
	# name: String = ""   Eg: name_example
	name,
	# jcrContentSlashcqDistribute: bool   Eg: true
	jcrContentSlashcqDistribute,
	# jcrContentSlashcqDistributeAtTypeHint: String = ""   Eg: jcrContentSlashcqDistributeAtTypeHint_example
	jcrContentSlashcqDistributeAtTypeHint,
	# jcrContentSlashcqName: String = ""   Eg: jcrContentSlashcqName_example
	jcrContentSlashcqName,
	# jcrContentSlashcqTemplate: String = ""   Eg: jcrContentSlashcqTemplate_example
	jcrContentSlashcqTemplate,
	# jcrContentSlashaliasUpdate: bool   Eg: true
	jcrContentSlashaliasUpdate,
	# jcrContentSlashenabled: bool   Eg: true
	jcrContentSlashenabled,
	# jcrContentSlashjcrDescription: String = ""   Eg: jcrContentSlashjcrDescription_example
	jcrContentSlashjcrDescription,
	# jcrContentSlashjcrLastModified: String = ""   Eg: jcrContentSlashjcrLastModified_example
	jcrContentSlashjcrLastModified,
	# jcrContentSlashjcrLastModifiedBy: String = ""   Eg: jcrContentSlashjcrLastModifiedBy_example
	jcrContentSlashjcrLastModifiedBy,
	# jcrContentSlashjcrMixinTypes: String = ""   Eg: jcrContentSlashjcrMixinTypes_example
	jcrContentSlashjcrMixinTypes,
	# jcrContentSlashjcrTitle: String = ""   Eg: jcrContentSlashjcrTitle_example
	jcrContentSlashjcrTitle,
	# jcrContentSlashlogLevel: String = ""   Eg: jcrContentSlashlogLevel_example
	jcrContentSlashlogLevel,
	# jcrContentSlashnoStatusUpdate: bool   Eg: true
	jcrContentSlashnoStatusUpdate,
	# jcrContentSlashnoVersioning: bool   Eg: true
	jcrContentSlashnoVersioning,
	# jcrContentSlashprotocolConnectTimeout: float   Eg: 8.14
	jcrContentSlashprotocolConnectTimeout,
	# jcrContentSlashprotocolHTTPConnectionClosed: bool   Eg: true
	jcrContentSlashprotocolHTTPConnectionClosed,
	# jcrContentSlashprotocolHTTPExpired: String = ""   Eg: jcrContentSlashprotocolHTTPExpired_example
	jcrContentSlashprotocolHTTPExpired,
	# jcrContentSlashprotocolHTTPHeaders: Array
	jcrContentSlashprotocolHTTPHeaders,
	# jcrContentSlashprotocolHTTPHeadersAtTypeHint: String = ""   Eg: jcrContentSlashprotocolHTTPHeadersAtTypeHint_example
	jcrContentSlashprotocolHTTPHeadersAtTypeHint,
	# jcrContentSlashprotocolHTTPMethod: String = ""   Eg: jcrContentSlashprotocolHTTPMethod_example
	jcrContentSlashprotocolHTTPMethod,
	# jcrContentSlashprotocolHTTPSRelaxed: bool   Eg: true
	jcrContentSlashprotocolHTTPSRelaxed,
	# jcrContentSlashprotocolInterface: String = ""   Eg: jcrContentSlashprotocolInterface_example
	jcrContentSlashprotocolInterface,
	# jcrContentSlashprotocolSocketTimeout: float   Eg: 8.14
	jcrContentSlashprotocolSocketTimeout,
	# jcrContentSlashprotocolVersion: String = ""   Eg: jcrContentSlashprotocolVersion_example
	jcrContentSlashprotocolVersion,
	# jcrContentSlashproxyNTLMDomain: String = ""   Eg: jcrContentSlashproxyNTLMDomain_example
	jcrContentSlashproxyNTLMDomain,
	# jcrContentSlashproxyNTLMHost: String = ""   Eg: jcrContentSlashproxyNTLMHost_example
	jcrContentSlashproxyNTLMHost,
	# jcrContentSlashproxyHost: String = ""   Eg: jcrContentSlashproxyHost_example
	jcrContentSlashproxyHost,
	# jcrContentSlashproxyPassword: String = ""   Eg: jcrContentSlashproxyPassword_example
	jcrContentSlashproxyPassword,
	# jcrContentSlashproxyPort: float   Eg: 8.14
	jcrContentSlashproxyPort,
	# jcrContentSlashproxyUser: String = ""   Eg: jcrContentSlashproxyUser_example
	jcrContentSlashproxyUser,
	# jcrContentSlashqueueBatchMaxSize: float   Eg: 8.14
	jcrContentSlashqueueBatchMaxSize,
	# jcrContentSlashqueueBatchMode: String = ""   Eg: jcrContentSlashqueueBatchMode_example
	jcrContentSlashqueueBatchMode,
	# jcrContentSlashqueueBatchWaitTime: float   Eg: 8.14
	jcrContentSlashqueueBatchWaitTime,
	# jcrContentSlashretryDelay: String = ""   Eg: jcrContentSlashretryDelay_example
	jcrContentSlashretryDelay,
	# jcrContentSlashreverseReplication: bool   Eg: true
	jcrContentSlashreverseReplication,
	# jcrContentSlashserializationType: String = ""   Eg: jcrContentSlashserializationType_example
	jcrContentSlashserializationType,
	# jcrContentSlashslingResourceType: String = ""   Eg: jcrContentSlashslingResourceType_example
	jcrContentSlashslingResourceType,
	# jcrContentSlashssl: String = ""   Eg: jcrContentSlashssl_example
	jcrContentSlashssl,
	# jcrContentSlashtransportNTLMDomain: String = ""   Eg: jcrContentSlashtransportNTLMDomain_example
	jcrContentSlashtransportNTLMDomain,
	# jcrContentSlashtransportNTLMHost: String = ""   Eg: jcrContentSlashtransportNTLMHost_example
	jcrContentSlashtransportNTLMHost,
	# jcrContentSlashtransportPassword: String = ""   Eg: jcrContentSlashtransportPassword_example
	jcrContentSlashtransportPassword,
	# jcrContentSlashtransportUri: String = ""   Eg: jcrContentSlashtransportUri_example
	jcrContentSlashtransportUri,
	# jcrContentSlashtransportUser: String = ""   Eg: jcrContentSlashtransportUser_example
	jcrContentSlashtransportUser,
	# jcrContentSlashtriggerDistribute: bool   Eg: true
	jcrContentSlashtriggerDistribute,
	# jcrContentSlashtriggerModified: bool   Eg: true
	jcrContentSlashtriggerModified,
	# jcrContentSlashtriggerOnOffTime: bool   Eg: true
	jcrContentSlashtriggerOnOffTime,
	# jcrContentSlashtriggerReceive: bool   Eg: true
	jcrContentSlashtriggerReceive,
	# jcrContentSlashtriggerSpecific: bool   Eg: true
	jcrContentSlashtriggerSpecific,
	# jcrContentSlashuserId: String = ""   Eg: jcrContentSlashuserId_example
	jcrContentSlashuserId,
	# jcrPrimaryType: String = ""   Eg: jcrPrimaryType_example
	jcrPrimaryType,
	# operation: String = ""   Eg: operation_example
	operation,
	# On Success
	func(response):
		prints("Success!", "post_agent", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **post_authorizable_keystore**   { #post_authorizable_keystore }
<a name="post_authorizable_keystore"></a>

> `post_authorizable_keystore(intermediatePath: String,authorizableId: String,operation = "",currentPassword = "",newPassword = "",rePassword = "",keyPassword = "",keyStorePass = "",alias = "",newAlias = "",removeAlias = "",certChain = null,pk = null,keyStore = null, on_success: Callable, on_failure: Callable)`





### Example

* Basic Authentication (`aemAuth`)

```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = SlingApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = SlingApi.new(config, client)


# Invoke an endpoint
api.post_authorizable_keystore(
	# intermediatePath: String = ""   Eg: intermediatePath_example
	intermediatePath,
	# authorizableId: String = ""   Eg: authorizableId_example
	authorizableId,
	# operation: String = ""   Eg: operation_example
	operation,
	# currentPassword: String = ""   Eg: currentPassword_example
	currentPassword,
	# newPassword: String = ""   Eg: newPassword_example
	newPassword,
	# rePassword: String = ""   Eg: rePassword_example
	rePassword,
	# keyPassword: String = ""   Eg: keyPassword_example
	keyPassword,
	# keyStorePass: String = ""   Eg: keyStorePass_example
	keyStorePass,
	# alias: String = ""   Eg: alias_example
	alias,
	# newAlias: String = ""   Eg: newAlias_example
	newAlias,
	# removeAlias: String = ""   Eg: removeAlias_example
	removeAlias,
	# certChain: String   Eg: BINARY_DATA_HERE
	certChain,
	# pk: String   Eg: BINARY_DATA_HERE
	pk,
	# keyStore: String   Eg: BINARY_DATA_HERE
	keyStore,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "post_authorizable_keystore", response)
		assert(response.data is KeystoreInfo)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **post_authorizables**   { #post_authorizables }
<a name="post_authorizables"></a>

> `post_authorizables(authorizableId: String,intermediatePath: String,createUser = "",createGroup = "",repPassword = "",profileSlashgivenName = "", on_success: Callable, on_failure: Callable)`





### Example

* Basic Authentication (`aemAuth`)

```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = SlingApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = SlingApi.new(config, client)


# Invoke an endpoint
api.post_authorizables(
	# authorizableId: String = ""   Eg: authorizableId_example
	authorizableId,
	# intermediatePath: String = ""   Eg: intermediatePath_example
	intermediatePath,
	# createUser: String = ""   Eg: createUser_example
	createUser,
	# createGroup: String = ""   Eg: createGroup_example
	createGroup,
	# repPassword: String = ""   Eg: repPassword_example
	repPassword,
	# profileSlashgivenName: String = ""   Eg: profileSlashgivenName_example
	profileSlashgivenName,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "post_authorizables", response)
		assert(response.data is string)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **post_config_adobe_granite_saml_authentication_handler**   { #post_config_adobe_granite_saml_authentication_handler }
<a name="post_config_adobe_granite_saml_authentication_handler"></a>

> `post_config_adobe_granite_saml_authentication_handler(keyStorePassword = "",keyStorePasswordAtTypeHint = "",servicePeriodranking = null,servicePeriodrankingAtTypeHint = "",idpHttpRedirect = null,idpHttpRedirectAtTypeHint = "",createUser = null,createUserAtTypeHint = "",defaultRedirectUrl = "",defaultRedirectUrlAtTypeHint = "",userIDAttribute = "",userIDAttributeAtTypeHint = "",defaultGroups = null,defaultGroupsAtTypeHint = "",idpCertAlias = "",idpCertAliasAtTypeHint = "",addGroupMemberships = null,addGroupMembershipsAtTypeHint = "",path = null,pathAtTypeHint = "",synchronizeAttributes = null,synchronizeAttributesAtTypeHint = "",clockTolerance = null,clockToleranceAtTypeHint = "",groupMembershipAttribute = "",groupMembershipAttributeAtTypeHint = "",idpUrl = "",idpUrlAtTypeHint = "",logoutUrl = "",logoutUrlAtTypeHint = "",serviceProviderEntityId = "",serviceProviderEntityIdAtTypeHint = "",assertionConsumerServiceURL = "",assertionConsumerServiceURLAtTypeHint = "",handleLogout = null,handleLogoutAtTypeHint = "",spPrivateKeyAlias = "",spPrivateKeyAliasAtTypeHint = "",useEncryption = null,useEncryptionAtTypeHint = "",nameIdFormat = "",nameIdFormatAtTypeHint = "",digestMethod = "",digestMethodAtTypeHint = "",signatureMethod = "",signatureMethodAtTypeHint = "",userIntermediatePath = "",userIntermediatePathAtTypeHint = "", on_success: Callable, on_failure: Callable)`





### Example

* Basic Authentication (`aemAuth`)

```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = SlingApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = SlingApi.new(config, client)


# Invoke an endpoint
api.post_config_adobe_granite_saml_authentication_handler(
	# keyStorePassword: String = ""   Eg: keyStorePassword_example
	keyStorePassword,
	# keyStorePasswordAtTypeHint: String = ""   Eg: keyStorePasswordAtTypeHint_example
	keyStorePasswordAtTypeHint,
	# servicePeriodranking: int   Eg: 56
	servicePeriodranking,
	# servicePeriodrankingAtTypeHint: String = ""   Eg: servicePeriodrankingAtTypeHint_example
	servicePeriodrankingAtTypeHint,
	# idpHttpRedirect: bool   Eg: true
	idpHttpRedirect,
	# idpHttpRedirectAtTypeHint: String = ""   Eg: idpHttpRedirectAtTypeHint_example
	idpHttpRedirectAtTypeHint,
	# createUser: bool   Eg: true
	createUser,
	# createUserAtTypeHint: String = ""   Eg: createUserAtTypeHint_example
	createUserAtTypeHint,
	# defaultRedirectUrl: String = ""   Eg: defaultRedirectUrl_example
	defaultRedirectUrl,
	# defaultRedirectUrlAtTypeHint: String = ""   Eg: defaultRedirectUrlAtTypeHint_example
	defaultRedirectUrlAtTypeHint,
	# userIDAttribute: String = ""   Eg: userIDAttribute_example
	userIDAttribute,
	# userIDAttributeAtTypeHint: String = ""   Eg: userIDAttributeAtTypeHint_example
	userIDAttributeAtTypeHint,
	# defaultGroups: Array
	defaultGroups,
	# defaultGroupsAtTypeHint: String = ""   Eg: defaultGroupsAtTypeHint_example
	defaultGroupsAtTypeHint,
	# idpCertAlias: String = ""   Eg: idpCertAlias_example
	idpCertAlias,
	# idpCertAliasAtTypeHint: String = ""   Eg: idpCertAliasAtTypeHint_example
	idpCertAliasAtTypeHint,
	# addGroupMemberships: bool   Eg: true
	addGroupMemberships,
	# addGroupMembershipsAtTypeHint: String = ""   Eg: addGroupMembershipsAtTypeHint_example
	addGroupMembershipsAtTypeHint,
	# path: Array
	path,
	# pathAtTypeHint: String = ""   Eg: pathAtTypeHint_example
	pathAtTypeHint,
	# synchronizeAttributes: Array
	synchronizeAttributes,
	# synchronizeAttributesAtTypeHint: String = ""   Eg: synchronizeAttributesAtTypeHint_example
	synchronizeAttributesAtTypeHint,
	# clockTolerance: int   Eg: 56
	clockTolerance,
	# clockToleranceAtTypeHint: String = ""   Eg: clockToleranceAtTypeHint_example
	clockToleranceAtTypeHint,
	# groupMembershipAttribute: String = ""   Eg: groupMembershipAttribute_example
	groupMembershipAttribute,
	# groupMembershipAttributeAtTypeHint: String = ""   Eg: groupMembershipAttributeAtTypeHint_example
	groupMembershipAttributeAtTypeHint,
	# idpUrl: String = ""   Eg: idpUrl_example
	idpUrl,
	# idpUrlAtTypeHint: String = ""   Eg: idpUrlAtTypeHint_example
	idpUrlAtTypeHint,
	# logoutUrl: String = ""   Eg: logoutUrl_example
	logoutUrl,
	# logoutUrlAtTypeHint: String = ""   Eg: logoutUrlAtTypeHint_example
	logoutUrlAtTypeHint,
	# serviceProviderEntityId: String = ""   Eg: serviceProviderEntityId_example
	serviceProviderEntityId,
	# serviceProviderEntityIdAtTypeHint: String = ""   Eg: serviceProviderEntityIdAtTypeHint_example
	serviceProviderEntityIdAtTypeHint,
	# assertionConsumerServiceURL: String = ""   Eg: assertionConsumerServiceURL_example
	assertionConsumerServiceURL,
	# assertionConsumerServiceURLAtTypeHint: String = ""   Eg: assertionConsumerServiceURLAtTypeHint_example
	assertionConsumerServiceURLAtTypeHint,
	# handleLogout: bool   Eg: true
	handleLogout,
	# handleLogoutAtTypeHint: String = ""   Eg: handleLogoutAtTypeHint_example
	handleLogoutAtTypeHint,
	# spPrivateKeyAlias: String = ""   Eg: spPrivateKeyAlias_example
	spPrivateKeyAlias,
	# spPrivateKeyAliasAtTypeHint: String = ""   Eg: spPrivateKeyAliasAtTypeHint_example
	spPrivateKeyAliasAtTypeHint,
	# useEncryption: bool   Eg: true
	useEncryption,
	# useEncryptionAtTypeHint: String = ""   Eg: useEncryptionAtTypeHint_example
	useEncryptionAtTypeHint,
	# nameIdFormat: String = ""   Eg: nameIdFormat_example
	nameIdFormat,
	# nameIdFormatAtTypeHint: String = ""   Eg: nameIdFormatAtTypeHint_example
	nameIdFormatAtTypeHint,
	# digestMethod: String = ""   Eg: digestMethod_example
	digestMethod,
	# digestMethodAtTypeHint: String = ""   Eg: digestMethodAtTypeHint_example
	digestMethodAtTypeHint,
	# signatureMethod: String = ""   Eg: signatureMethod_example
	signatureMethod,
	# signatureMethodAtTypeHint: String = ""   Eg: signatureMethodAtTypeHint_example
	signatureMethodAtTypeHint,
	# userIntermediatePath: String = ""   Eg: userIntermediatePath_example
	userIntermediatePath,
	# userIntermediatePathAtTypeHint: String = ""   Eg: userIntermediatePathAtTypeHint_example
	userIntermediatePathAtTypeHint,
	# On Success
	func(response):
		prints("Success!", "post_config_adobe_granite_saml_authentication_handler", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **post_config_apache_felix_jetty_based_http_service**   { #post_config_apache_felix_jetty_based_http_service }
<a name="post_config_apache_felix_jetty_based_http_service"></a>

> `post_config_apache_felix_jetty_based_http_service(orgPeriodapachePeriodfelixPeriodhttpsPeriodnio = null,orgPeriodapachePeriodfelixPeriodhttpsPeriodnioAtTypeHint = "",orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystore = "",orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystoreAtTypeHint = "",orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodpassword = "",orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodpasswordAtTypeHint = "",orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkey = "",orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyAtTypeHint = "",orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyPeriodpassword = "",orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyPeriodpasswordAtTypeHint = "",orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststore = "",orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststoreAtTypeHint = "",orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststorePeriodpassword = "",orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststorePeriodpasswordAtTypeHint = "",orgPeriodapachePeriodfelixPeriodhttpsPeriodclientcertificate = "",orgPeriodapachePeriodfelixPeriodhttpsPeriodclientcertificateAtTypeHint = "",orgPeriodapachePeriodfelixPeriodhttpsPeriodenable = null,orgPeriodapachePeriodfelixPeriodhttpsPeriodenableAtTypeHint = "",orgPeriodosgiPeriodservicePeriodhttpPeriodportPeriodsecure = "",orgPeriodosgiPeriodservicePeriodhttpPeriodportPeriodsecureAtTypeHint = "", on_success: Callable, on_failure: Callable)`





### Example

* Basic Authentication (`aemAuth`)

```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = SlingApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = SlingApi.new(config, client)


# Invoke an endpoint
api.post_config_apache_felix_jetty_based_http_service(
	# orgPeriodapachePeriodfelixPeriodhttpsPeriodnio: bool   Eg: true
	orgPeriodapachePeriodfelixPeriodhttpsPeriodnio,
	# orgPeriodapachePeriodfelixPeriodhttpsPeriodnioAtTypeHint: String = ""   Eg: orgPeriodapachePeriodfelixPeriodhttpsPeriodnioAtTypeHint_example
	orgPeriodapachePeriodfelixPeriodhttpsPeriodnioAtTypeHint,
	# orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystore: String = ""   Eg: orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystore_example
	orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystore,
	# orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystoreAtTypeHint: String = ""   Eg: orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystoreAtTypeHint_example
	orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystoreAtTypeHint,
	# orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodpassword: String = ""   Eg: orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodpassword_example
	orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodpassword,
	# orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodpasswordAtTypeHint: String = ""   Eg: orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodpasswordAtTypeHint_example
	orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodpasswordAtTypeHint,
	# orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkey: String = ""   Eg: orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkey_example
	orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkey,
	# orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyAtTypeHint: String = ""   Eg: orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyAtTypeHint_example
	orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyAtTypeHint,
	# orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyPeriodpassword: String = ""   Eg: orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyPeriodpassword_example
	orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyPeriodpassword,
	# orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyPeriodpasswordAtTypeHint: String = ""   Eg: orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyPeriodpasswordAtTypeHint_example
	orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyPeriodpasswordAtTypeHint,
	# orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststore: String = ""   Eg: orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststore_example
	orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststore,
	# orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststoreAtTypeHint: String = ""   Eg: orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststoreAtTypeHint_example
	orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststoreAtTypeHint,
	# orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststorePeriodpassword: String = ""   Eg: orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststorePeriodpassword_example
	orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststorePeriodpassword,
	# orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststorePeriodpasswordAtTypeHint: String = ""   Eg: orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststorePeriodpasswordAtTypeHint_example
	orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststorePeriodpasswordAtTypeHint,
	# orgPeriodapachePeriodfelixPeriodhttpsPeriodclientcertificate: String = ""   Eg: orgPeriodapachePeriodfelixPeriodhttpsPeriodclientcertificate_example
	orgPeriodapachePeriodfelixPeriodhttpsPeriodclientcertificate,
	# orgPeriodapachePeriodfelixPeriodhttpsPeriodclientcertificateAtTypeHint: String = ""   Eg: orgPeriodapachePeriodfelixPeriodhttpsPeriodclientcertificateAtTypeHint_example
	orgPeriodapachePeriodfelixPeriodhttpsPeriodclientcertificateAtTypeHint,
	# orgPeriodapachePeriodfelixPeriodhttpsPeriodenable: bool   Eg: true
	orgPeriodapachePeriodfelixPeriodhttpsPeriodenable,
	# orgPeriodapachePeriodfelixPeriodhttpsPeriodenableAtTypeHint: String = ""   Eg: orgPeriodapachePeriodfelixPeriodhttpsPeriodenableAtTypeHint_example
	orgPeriodapachePeriodfelixPeriodhttpsPeriodenableAtTypeHint,
	# orgPeriodosgiPeriodservicePeriodhttpPeriodportPeriodsecure: String = ""   Eg: orgPeriodosgiPeriodservicePeriodhttpPeriodportPeriodsecure_example
	orgPeriodosgiPeriodservicePeriodhttpPeriodportPeriodsecure,
	# orgPeriodosgiPeriodservicePeriodhttpPeriodportPeriodsecureAtTypeHint: String = ""   Eg: orgPeriodosgiPeriodservicePeriodhttpPeriodportPeriodsecureAtTypeHint_example
	orgPeriodosgiPeriodservicePeriodhttpPeriodportPeriodsecureAtTypeHint,
	# On Success
	func(response):
		prints("Success!", "post_config_apache_felix_jetty_based_http_service", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **post_config_apache_http_components_proxy_configuration**   { #post_config_apache_http_components_proxy_configuration }
<a name="post_config_apache_http_components_proxy_configuration"></a>

> `post_config_apache_http_components_proxy_configuration(proxyPeriodhost = "",proxyPeriodhostAtTypeHint = "",proxyPeriodport = null,proxyPeriodportAtTypeHint = "",proxyPeriodexceptions = null,proxyPeriodexceptionsAtTypeHint = "",proxyPeriodenabled = null,proxyPeriodenabledAtTypeHint = "",proxyPerioduser = "",proxyPerioduserAtTypeHint = "",proxyPeriodpassword = "",proxyPeriodpasswordAtTypeHint = "", on_success: Callable, on_failure: Callable)`





### Example

* Basic Authentication (`aemAuth`)

```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = SlingApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = SlingApi.new(config, client)


# Invoke an endpoint
api.post_config_apache_http_components_proxy_configuration(
	# proxyPeriodhost: String = ""   Eg: proxyPeriodhost_example
	proxyPeriodhost,
	# proxyPeriodhostAtTypeHint: String = ""   Eg: proxyPeriodhostAtTypeHint_example
	proxyPeriodhostAtTypeHint,
	# proxyPeriodport: int   Eg: 56
	proxyPeriodport,
	# proxyPeriodportAtTypeHint: String = ""   Eg: proxyPeriodportAtTypeHint_example
	proxyPeriodportAtTypeHint,
	# proxyPeriodexceptions: Array
	proxyPeriodexceptions,
	# proxyPeriodexceptionsAtTypeHint: String = ""   Eg: proxyPeriodexceptionsAtTypeHint_example
	proxyPeriodexceptionsAtTypeHint,
	# proxyPeriodenabled: bool   Eg: true
	proxyPeriodenabled,
	# proxyPeriodenabledAtTypeHint: String = ""   Eg: proxyPeriodenabledAtTypeHint_example
	proxyPeriodenabledAtTypeHint,
	# proxyPerioduser: String = ""   Eg: proxyPerioduser_example
	proxyPerioduser,
	# proxyPerioduserAtTypeHint: String = ""   Eg: proxyPerioduserAtTypeHint_example
	proxyPerioduserAtTypeHint,
	# proxyPeriodpassword: String = ""   Eg: proxyPeriodpassword_example
	proxyPeriodpassword,
	# proxyPeriodpasswordAtTypeHint: String = ""   Eg: proxyPeriodpasswordAtTypeHint_example
	proxyPeriodpasswordAtTypeHint,
	# On Success
	func(response):
		prints("Success!", "post_config_apache_http_components_proxy_configuration", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **post_config_apache_sling_dav_ex_servlet**   { #post_config_apache_sling_dav_ex_servlet }
<a name="post_config_apache_sling_dav_ex_servlet"></a>

> `post_config_apache_sling_dav_ex_servlet(alias = "",aliasAtTypeHint = "",davPeriodcreateAbsoluteUri = null,davPeriodcreateAbsoluteUriAtTypeHint = "", on_success: Callable, on_failure: Callable)`





### Example

* Basic Authentication (`aemAuth`)

```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = SlingApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = SlingApi.new(config, client)


# Invoke an endpoint
api.post_config_apache_sling_dav_ex_servlet(
	# alias: String = ""   Eg: alias_example
	alias,
	# aliasAtTypeHint: String = ""   Eg: aliasAtTypeHint_example
	aliasAtTypeHint,
	# davPeriodcreateAbsoluteUri: bool   Eg: true
	davPeriodcreateAbsoluteUri,
	# davPeriodcreateAbsoluteUriAtTypeHint: String = ""   Eg: davPeriodcreateAbsoluteUriAtTypeHint_example
	davPeriodcreateAbsoluteUriAtTypeHint,
	# On Success
	func(response):
		prints("Success!", "post_config_apache_sling_dav_ex_servlet", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **post_config_apache_sling_get_servlet**   { #post_config_apache_sling_get_servlet }
<a name="post_config_apache_sling_get_servlet"></a>

> `post_config_apache_sling_get_servlet(jsonPeriodmaximumresults = "",jsonPeriodmaximumresultsAtTypeHint = "",enablePeriodhtml = null,enablePeriodhtmlAtTypeHint = "",enablePeriodtxt = null,enablePeriodtxtAtTypeHint = "",enablePeriodxml = null,enablePeriodxmlAtTypeHint = "", on_success: Callable, on_failure: Callable)`





### Example

* Basic Authentication (`aemAuth`)

```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = SlingApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = SlingApi.new(config, client)


# Invoke an endpoint
api.post_config_apache_sling_get_servlet(
	# jsonPeriodmaximumresults: String = ""   Eg: jsonPeriodmaximumresults_example
	jsonPeriodmaximumresults,
	# jsonPeriodmaximumresultsAtTypeHint: String = ""   Eg: jsonPeriodmaximumresultsAtTypeHint_example
	jsonPeriodmaximumresultsAtTypeHint,
	# enablePeriodhtml: bool   Eg: true
	enablePeriodhtml,
	# enablePeriodhtmlAtTypeHint: String = ""   Eg: enablePeriodhtmlAtTypeHint_example
	enablePeriodhtmlAtTypeHint,
	# enablePeriodtxt: bool   Eg: true
	enablePeriodtxt,
	# enablePeriodtxtAtTypeHint: String = ""   Eg: enablePeriodtxtAtTypeHint_example
	enablePeriodtxtAtTypeHint,
	# enablePeriodxml: bool   Eg: true
	enablePeriodxml,
	# enablePeriodxmlAtTypeHint: String = ""   Eg: enablePeriodxmlAtTypeHint_example
	enablePeriodxmlAtTypeHint,
	# On Success
	func(response):
		prints("Success!", "post_config_apache_sling_get_servlet", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **post_config_apache_sling_referrer_filter**   { #post_config_apache_sling_referrer_filter }
<a name="post_config_apache_sling_referrer_filter"></a>

> `post_config_apache_sling_referrer_filter(allowPeriodempty = null,allowPeriodemptyAtTypeHint = "",allowPeriodhosts = "",allowPeriodhostsAtTypeHint = "",allowPeriodhostsPeriodregexp = "",allowPeriodhostsPeriodregexpAtTypeHint = "",filterPeriodmethods = "",filterPeriodmethodsAtTypeHint = "", on_success: Callable, on_failure: Callable)`





### Example

* Basic Authentication (`aemAuth`)

```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = SlingApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = SlingApi.new(config, client)


# Invoke an endpoint
api.post_config_apache_sling_referrer_filter(
	# allowPeriodempty: bool   Eg: true
	allowPeriodempty,
	# allowPeriodemptyAtTypeHint: String = ""   Eg: allowPeriodemptyAtTypeHint_example
	allowPeriodemptyAtTypeHint,
	# allowPeriodhosts: String = ""   Eg: allowPeriodhosts_example
	allowPeriodhosts,
	# allowPeriodhostsAtTypeHint: String = ""   Eg: allowPeriodhostsAtTypeHint_example
	allowPeriodhostsAtTypeHint,
	# allowPeriodhostsPeriodregexp: String = ""   Eg: allowPeriodhostsPeriodregexp_example
	allowPeriodhostsPeriodregexp,
	# allowPeriodhostsPeriodregexpAtTypeHint: String = ""   Eg: allowPeriodhostsPeriodregexpAtTypeHint_example
	allowPeriodhostsPeriodregexpAtTypeHint,
	# filterPeriodmethods: String = ""   Eg: filterPeriodmethods_example
	filterPeriodmethods,
	# filterPeriodmethodsAtTypeHint: String = ""   Eg: filterPeriodmethodsAtTypeHint_example
	filterPeriodmethodsAtTypeHint,
	# On Success
	func(response):
		prints("Success!", "post_config_apache_sling_referrer_filter", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **post_config_property**   { #post_config_property }
<a name="post_config_property"></a>

> `post_config_property(configNodeName: String, on_success: Callable, on_failure: Callable)`





### Example

* Basic Authentication (`aemAuth`)

```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = SlingApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = SlingApi.new(config, client)


# Invoke an endpoint
api.post_config_property(
	# configNodeName: String = ""   Eg: configNodeName_example
	configNodeName,
	# On Success
	func(response):
		prints("Success!", "post_config_property", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **post_node**   { #post_node }
<a name="post_node"></a>

> `post_node(path: String,name: String,operation = "",deleteAuthorizable = "",file = null, on_success: Callable, on_failure: Callable)`





### Example

* Basic Authentication (`aemAuth`)

```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = SlingApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = SlingApi.new(config, client)


# Invoke an endpoint
api.post_node(
	# path: String = ""   Eg: path_example
	path,
	# name: String = ""   Eg: name_example
	name,
	# operation: String = ""   Eg: operation_example
	operation,
	# deleteAuthorizable: String = ""   Eg: deleteAuthorizable_example
	deleteAuthorizable,
	# file: String   Eg: BINARY_DATA_HERE
	file,
	# On Success
	func(response):
		prints("Success!", "post_node", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **post_node_rw**   { #post_node_rw }
<a name="post_node_rw"></a>

> `post_node_rw(path: String,name: String,addMembers = "", on_success: Callable, on_failure: Callable)`





### Example

* Basic Authentication (`aemAuth`)

```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = SlingApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = SlingApi.new(config, client)


# Invoke an endpoint
api.post_node_rw(
	# path: String = ""   Eg: path_example
	path,
	# name: String = ""   Eg: name_example
	name,
	# addMembers: String = ""   Eg: addMembers_example
	addMembers,
	# On Success
	func(response):
		prints("Success!", "post_node_rw", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **post_path**   { #post_path }
<a name="post_path"></a>

> `post_path(path: String,jcrPrimaryType: String,name: String, on_success: Callable, on_failure: Callable)`





### Example

* Basic Authentication (`aemAuth`)

```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = SlingApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = SlingApi.new(config, client)


# Invoke an endpoint
api.post_path(
	# path: String = ""   Eg: path_example
	path,
	# jcrPrimaryType: String = ""   Eg: jcrPrimaryType_example
	jcrPrimaryType,
	# name: String = ""   Eg: name_example
	name,
	# On Success
	func(response):
		prints("Success!", "post_path", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **post_query**   { #post_query }
<a name="post_query"></a>

> `post_query(path: String,pPeriodlimit: float,1Property: String,1PropertyPeriodvalue: String, on_success: Callable, on_failure: Callable)`





### Example

* Basic Authentication (`aemAuth`)

```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = SlingApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = SlingApi.new(config, client)


# Invoke an endpoint
api.post_query(
	# path: String = ""   Eg: path_example
	path,
	# pPeriodlimit: float   Eg: 8.14
	pPeriodlimit,
	# 1Property: String = ""   Eg: 1Property_example
	1Property,
	# 1PropertyPeriodvalue: String = ""   Eg: 1PropertyPeriodvalue_example
	1PropertyPeriodvalue,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "post_query", response)
		assert(response.data is string)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **post_tree_activation**   { #post_tree_activation }
<a name="post_tree_activation"></a>

> `post_tree_activation(ignoredeactivated: bool,onlymodified: bool,path: String,cmd: String, on_success: Callable, on_failure: Callable)`





### Example

* Basic Authentication (`aemAuth`)

```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = SlingApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = SlingApi.new(config, client)


# Invoke an endpoint
api.post_tree_activation(
	# ignoredeactivated: bool   Eg: true
	ignoredeactivated,
	# onlymodified: bool   Eg: true
	onlymodified,
	# path: String = ""   Eg: path_example
	path,
	# cmd: String = "activate"   Eg: cmd_example
	cmd,
	# On Success
	func(response):
		prints("Success!", "post_tree_activation", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **post_truststore**   { #post_truststore }
<a name="post_truststore"></a>

> `post_truststore(operation = "",newPassword = "",rePassword = "",keyStoreType = "",removeAlias = "",certificate = null, on_success: Callable, on_failure: Callable)`





### Example

* Basic Authentication (`aemAuth`)

```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = SlingApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = SlingApi.new(config, client)


# Invoke an endpoint
api.post_truststore(
	# operation: String = ""   Eg: operation_example
	operation,
	# newPassword: String = ""   Eg: newPassword_example
	newPassword,
	# rePassword: String = ""   Eg: rePassword_example
	rePassword,
	# keyStoreType: String = ""   Eg: keyStoreType_example
	keyStoreType,
	# removeAlias: String = ""   Eg: removeAlias_example
	removeAlias,
	# certificate: String   Eg: BINARY_DATA_HERE
	certificate,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "post_truststore", response)
		assert(response.data is string)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **post_truststore_pkcs12**   { #post_truststore_pkcs12 }
<a name="post_truststore_pkcs12"></a>

> `post_truststore_pkcs12(truststorePeriodp12 = null, on_success: Callable, on_failure: Callable)`





### Example

* Basic Authentication (`aemAuth`)

```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = SlingApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = SlingApi.new(config, client)


# Invoke an endpoint
api.post_truststore_pkcs12(
	# truststorePeriodp12: String   Eg: BINARY_DATA_HERE
	truststorePeriodp12,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "post_truststore_pkcs12", response)
		assert(response.data is string)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```


### Authorization

[aemAuth](../README.md#aemAuth)

[[Back to top]](#__pageTop) \
[[Back to API list]](../README.md#documentation-for-api-endpoints) \
[[Back to Model list]](../README.md#documentation-for-models) \
[[Back to README]](../README.md) \

