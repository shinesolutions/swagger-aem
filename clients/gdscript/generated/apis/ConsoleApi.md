<a name="__pageTop"></a>
# ConsoleApi   { #ConsoleApi }


All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_aem_product_info**](#get_aem_product_info) | **GET** `/system/console/status-productinfo.json` | 
[**get_bundle_info**](#get_bundle_info) | **GET** `/system/console/bundles/{name}.json` | 
[**get_config_mgr**](#get_config_mgr) | **GET** `/system/console/configMgr` | 
[**post_bundle**](#post_bundle) | **POST** `/system/console/bundles/{name}` | 
[**post_jmx_repository**](#post_jmx_repository) | **POST** `/system/console/jmx/com.adobe.granite:type&#x3D;Repository/op/{action}` | 
[**post_saml_configuration**](#post_saml_configuration) | **POST** `/system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler` | 

# **get_aem_product_info**   { #get_aem_product_info }
<a name="get_aem_product_info"></a>

> `get_aem_product_info( on_success: Callable, on_failure: Callable)`





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
var api = ConsoleApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = ConsoleApi.new(config, client)


# Invoke an endpoint
api.get_aem_product_info(
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "get_aem_product_info", response)
		assert(response.data is string)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **get_bundle_info**   { #get_bundle_info }
<a name="get_bundle_info"></a>

> `get_bundle_info(name: String, on_success: Callable, on_failure: Callable)`





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
var api = ConsoleApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = ConsoleApi.new(config, client)


# Invoke an endpoint
api.get_bundle_info(
	# name: String = ""   Eg: name_example
	name,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "get_bundle_info", response)
		assert(response.data is BundleInfo)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **get_config_mgr**   { #get_config_mgr }
<a name="get_config_mgr"></a>

> `get_config_mgr( on_success: Callable, on_failure: Callable)`





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
var api = ConsoleApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = ConsoleApi.new(config, client)


# Invoke an endpoint
api.get_config_mgr(
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "get_config_mgr", response)
		assert(response.data is string)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **post_bundle**   { #post_bundle }
<a name="post_bundle"></a>

> `post_bundle(name: String,action: String, on_success: Callable, on_failure: Callable)`





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
var api = ConsoleApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = ConsoleApi.new(config, client)


# Invoke an endpoint
api.post_bundle(
	# name: String = ""   Eg: name_example
	name,
	# action: String = ""   Eg: action_example
	action,
	# On Success
	func(response):
		prints("Success!", "post_bundle", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **post_jmx_repository**   { #post_jmx_repository }
<a name="post_jmx_repository"></a>

> `post_jmx_repository(action: String, on_success: Callable, on_failure: Callable)`





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
var api = ConsoleApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = ConsoleApi.new(config, client)


# Invoke an endpoint
api.post_jmx_repository(
	# action: String = ""   Eg: action_example
	action,
	# On Success
	func(response):
		prints("Success!", "post_jmx_repository", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **post_saml_configuration**   { #post_saml_configuration }
<a name="post_saml_configuration"></a>

> `post_saml_configuration(post = null,apply = null,delete = null,action = "",Dollarlocation = "",path = null,servicePeriodranking = null,idpUrl = "",idpCertAlias = "",idpHttpRedirect = null,serviceProviderEntityId = "",assertionConsumerServiceURL = "",spPrivateKeyAlias = "",keyStorePassword = "",defaultRedirectUrl = "",userIDAttribute = "",useEncryption = null,createUser = null,addGroupMemberships = null,groupMembershipAttribute = "",defaultGroups = null,nameIdFormat = "",synchronizeAttributes = null,handleLogout = null,logoutUrl = "",clockTolerance = null,digestMethod = "",signatureMethod = "",userIntermediatePath = "",propertylist = null, on_success: Callable, on_failure: Callable)`





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
var api = ConsoleApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = ConsoleApi.new(config, client)


# Invoke an endpoint
api.post_saml_configuration(
	# post: bool   Eg: true
	post,
	# apply: bool   Eg: true
	apply,
	# delete: bool   Eg: true
	delete,
	# action: String = ""   Eg: action_example
	action,
	# Dollarlocation: String = ""   Eg: Dollarlocation_example
	Dollarlocation,
	# path: Array
	path,
	# servicePeriodranking: int   Eg: 56
	servicePeriodranking,
	# idpUrl: String = ""   Eg: idpUrl_example
	idpUrl,
	# idpCertAlias: String = ""   Eg: idpCertAlias_example
	idpCertAlias,
	# idpHttpRedirect: bool   Eg: true
	idpHttpRedirect,
	# serviceProviderEntityId: String = ""   Eg: serviceProviderEntityId_example
	serviceProviderEntityId,
	# assertionConsumerServiceURL: String = ""   Eg: assertionConsumerServiceURL_example
	assertionConsumerServiceURL,
	# spPrivateKeyAlias: String = ""   Eg: spPrivateKeyAlias_example
	spPrivateKeyAlias,
	# keyStorePassword: String = ""   Eg: keyStorePassword_example
	keyStorePassword,
	# defaultRedirectUrl: String = ""   Eg: defaultRedirectUrl_example
	defaultRedirectUrl,
	# userIDAttribute: String = ""   Eg: userIDAttribute_example
	userIDAttribute,
	# useEncryption: bool   Eg: true
	useEncryption,
	# createUser: bool   Eg: true
	createUser,
	# addGroupMemberships: bool   Eg: true
	addGroupMemberships,
	# groupMembershipAttribute: String = ""   Eg: groupMembershipAttribute_example
	groupMembershipAttribute,
	# defaultGroups: Array
	defaultGroups,
	# nameIdFormat: String = ""   Eg: nameIdFormat_example
	nameIdFormat,
	# synchronizeAttributes: Array
	synchronizeAttributes,
	# handleLogout: bool   Eg: true
	handleLogout,
	# logoutUrl: String = ""   Eg: logoutUrl_example
	logoutUrl,
	# clockTolerance: int   Eg: 56
	clockTolerance,
	# digestMethod: String = ""   Eg: digestMethod_example
	digestMethod,
	# signatureMethod: String = ""   Eg: signatureMethod_example
	signatureMethod,
	# userIntermediatePath: String = ""   Eg: userIntermediatePath_example
	userIntermediatePath,
	# propertylist: Array
	propertylist,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "post_saml_configuration", response)
		assert(response.data is SamlConfigurationInfo)
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

