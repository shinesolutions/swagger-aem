<a name="__pageTop"></a>
# GraniteApi   { #GraniteApi }


All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ssl_setup**](#ssl_setup) | **POST** `/libs/granite/security/post/sslSetup.html` | 

# **ssl_setup**   { #ssl_setup }
<a name="ssl_setup"></a>

> `ssl_setup(keystorePassword: String,keystorePasswordConfirm: String,truststorePassword: String,truststorePasswordConfirm: String,httpsHostname: String,httpsPort: String,privatekeyFile = null,certificateFile = null, on_success: Callable, on_failure: Callable)`





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
var api = GraniteApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = GraniteApi.new(config, client)


# Invoke an endpoint
api.ssl_setup(
	# keystorePassword: String = ""   Eg: keystorePassword_example
	keystorePassword,
	# keystorePasswordConfirm: String = ""   Eg: keystorePasswordConfirm_example
	keystorePasswordConfirm,
	# truststorePassword: String = ""   Eg: truststorePassword_example
	truststorePassword,
	# truststorePasswordConfirm: String = ""   Eg: truststorePasswordConfirm_example
	truststorePasswordConfirm,
	# httpsHostname: String = ""   Eg: httpsHostname_example
	httpsHostname,
	# httpsPort: String = ""   Eg: httpsPort_example
	httpsPort,
	# privatekeyFile: String   Eg: BINARY_DATA_HERE
	privatekeyFile,
	# certificateFile: String   Eg: BINARY_DATA_HERE
	certificateFile,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "ssl_setup", response)
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

