<a name="__pageTop"></a>
# CqApi   { #CqApi }


All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_login_page**](#get_login_page) | **GET** `/libs/granite/core/content/login.html` | 
[**post_cq_actions**](#post_cq_actions) | **POST** `/.cqactions.html` | 

# **get_login_page**   { #get_login_page }
<a name="get_login_page"></a>

> `get_login_page( on_success: Callable, on_failure: Callable)`





### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = CqApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = CqApi.new(config, client)


# Invoke an endpoint
api.get_login_page(
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "get_login_page", response)
		assert(response.data is string)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **post_cq_actions**   { #post_cq_actions }
<a name="post_cq_actions"></a>

> `post_cq_actions(authorizableId: String,changelog: String, on_success: Callable, on_failure: Callable)`





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
var api = CqApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = CqApi.new(config, client)


# Invoke an endpoint
api.post_cq_actions(
	# authorizableId: String = ""   Eg: authorizableId_example
	authorizableId,
	# changelog: String = ""   Eg: changelog_example
	changelog,
	# On Success
	func(response):
		prints("Success!", "post_cq_actions", response)
		
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

