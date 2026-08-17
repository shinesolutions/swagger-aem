<a name="__pageTop"></a>
# CustomApi   { #CustomApi }


All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_aem_health_check**](#get_aem_health_check) | **GET** `/system/health` | 
[**post_config_aem_health_check_servlet**](#post_config_aem_health_check_servlet) | **POST** `/apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck` | 
[**post_config_aem_password_reset**](#post_config_aem_password_reset) | **POST** `/apps/system/config/com.shinesolutions.aem.passwordreset.Activator` | 

# **get_aem_health_check**   { #get_aem_health_check }
<a name="get_aem_health_check"></a>

> `get_aem_health_check(tags = "",combineTagsOr = null, on_success: Callable, on_failure: Callable)`





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
var api = CustomApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = CustomApi.new(config, client)


# Invoke an endpoint
api.get_aem_health_check(
	# tags: String = ""   Eg: tags_example
	tags,
	# combineTagsOr: bool   Eg: true
	combineTagsOr,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "get_aem_health_check", response)
		assert(response.data is string)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **post_config_aem_health_check_servlet**   { #post_config_aem_health_check_servlet }
<a name="post_config_aem_health_check_servlet"></a>

> `post_config_aem_health_check_servlet(bundlesPeriodignored = null,bundlesPeriodignoredAtTypeHint = "", on_success: Callable, on_failure: Callable)`





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
var api = CustomApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = CustomApi.new(config, client)


# Invoke an endpoint
api.post_config_aem_health_check_servlet(
	# bundlesPeriodignored: Array
	bundlesPeriodignored,
	# bundlesPeriodignoredAtTypeHint: String = ""   Eg: bundlesPeriodignoredAtTypeHint_example
	bundlesPeriodignoredAtTypeHint,
	# On Success
	func(response):
		prints("Success!", "post_config_aem_health_check_servlet", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **post_config_aem_password_reset**   { #post_config_aem_password_reset }
<a name="post_config_aem_password_reset"></a>

> `post_config_aem_password_reset(pwdresetPeriodauthorizables = null,pwdresetPeriodauthorizablesAtTypeHint = "", on_success: Callable, on_failure: Callable)`





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
var api = CustomApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = CustomApi.new(config, client)


# Invoke an endpoint
api.post_config_aem_password_reset(
	# pwdresetPeriodauthorizables: Array
	pwdresetPeriodauthorizables,
	# pwdresetPeriodauthorizablesAtTypeHint: String = ""   Eg: pwdresetPeriodauthorizablesAtTypeHint_example
	pwdresetPeriodauthorizablesAtTypeHint,
	# On Success
	func(response):
		prints("Success!", "post_config_aem_password_reset", response)
		
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

