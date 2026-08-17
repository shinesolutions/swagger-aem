<a name="__pageTop"></a>
# CrxApi   { #CrxApi }


All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_crxde_status**](#get_crxde_status) | **GET** `/crx/server/crx.default/jcr:root/.1.json` | 
[**get_install_status**](#get_install_status) | **GET** `/crx/packmgr/installstatus.jsp` | 
[**get_package_manager_servlet**](#get_package_manager_servlet) | **GET** `/crx/packmgr/service/script.html` | 
[**post_package_service**](#post_package_service) | **POST** `/crx/packmgr/service.jsp` | 
[**post_package_service_json**](#post_package_service_json) | **POST** `/crx/packmgr/service/.json/{path}` | 
[**post_package_update**](#post_package_update) | **POST** `/crx/packmgr/update.jsp` | 
[**post_set_password**](#post_set_password) | **POST** `/crx/explorer/ui/setpassword.jsp` | 

# **get_crxde_status**   { #get_crxde_status }
<a name="get_crxde_status"></a>

> `get_crxde_status( on_success: Callable, on_failure: Callable)`





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
var api = CrxApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = CrxApi.new(config, client)


# Invoke an endpoint
api.get_crxde_status(
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "get_crxde_status", response)
		assert(response.data is string)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **get_install_status**   { #get_install_status }
<a name="get_install_status"></a>

> `get_install_status( on_success: Callable, on_failure: Callable)`





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
var api = CrxApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = CrxApi.new(config, client)


# Invoke an endpoint
api.get_install_status(
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "get_install_status", response)
		assert(response.data is InstallStatus)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **get_package_manager_servlet**   { #get_package_manager_servlet }
<a name="get_package_manager_servlet"></a>

> `get_package_manager_servlet( on_success: Callable, on_failure: Callable)`





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
var api = CrxApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = CrxApi.new(config, client)


# Invoke an endpoint
api.get_package_manager_servlet(
	# On Success
	func(response):
		prints("Success!", "get_package_manager_servlet", response)
		
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **post_package_service**   { #post_package_service }
<a name="post_package_service"></a>

> `post_package_service(cmd: String, on_success: Callable, on_failure: Callable)`





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
var api = CrxApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = CrxApi.new(config, client)


# Invoke an endpoint
api.post_package_service(
	# cmd: String = ""   Eg: cmd_example
	cmd,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "post_package_service", response)
		assert(response.data is string)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **post_package_service_json**   { #post_package_service_json }
<a name="post_package_service_json"></a>

> `post_package_service_json(path: String,cmd: String,groupName = "",packageName = "",packageVersion = "",charset = "",force = null,recursive = null,package = null, on_success: Callable, on_failure: Callable)`





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
var api = CrxApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = CrxApi.new(config, client)


# Invoke an endpoint
api.post_package_service_json(
	# path: String = ""   Eg: path_example
	path,
	# cmd: String = ""   Eg: cmd_example
	cmd,
	# groupName: String = ""   Eg: groupName_example
	groupName,
	# packageName: String = ""   Eg: packageName_example
	packageName,
	# packageVersion: String = ""   Eg: packageVersion_example
	packageVersion,
	# charset: String = ""   Eg: charset_example
	charset,
	# force: bool   Eg: true
	force,
	# recursive: bool   Eg: true
	recursive,
	# package: String   Eg: BINARY_DATA_HERE
	package,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "post_package_service_json", response)
		assert(response.data is string)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **post_package_update**   { #post_package_update }
<a name="post_package_update"></a>

> `post_package_update(groupName: String,packageName: String,version: String,path: String,filter = "",charset = "", on_success: Callable, on_failure: Callable)`





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
var api = CrxApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = CrxApi.new(config, client)


# Invoke an endpoint
api.post_package_update(
	# groupName: String = ""   Eg: groupName_example
	groupName,
	# packageName: String = ""   Eg: packageName_example
	packageName,
	# version: String = ""   Eg: version_example
	version,
	# path: String = ""   Eg: path_example
	path,
	# filter: String = ""   Eg: filter_example
	filter,
	# charset: String = ""   Eg: charset_example
	charset,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "post_package_update", response)
		assert(response.data is string)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **post_set_password**   { #post_set_password }
<a name="post_set_password"></a>

> `post_set_password(old: String,plain: String,verify: String, on_success: Callable, on_failure: Callable)`





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
var api = CrxApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = CrxApi.new(config, client)


# Invoke an endpoint
api.post_set_password(
	# old: String = ""   Eg: old_example
	old,
	# plain: String = ""   Eg: plain_example
	plain,
	# verify: String = ""   Eg: verify_example
	verify,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "post_set_password", response)
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

