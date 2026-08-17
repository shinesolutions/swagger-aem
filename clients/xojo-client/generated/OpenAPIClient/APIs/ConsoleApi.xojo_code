#tag Class
Protected Class ConsoleApi
	#tag Method, Flags = &h0
		Sub GetAemProductInfo()
		  // Operation getAemProductInfo
		  // - 
		  //
		  // Invokes ConsoleApiCallbackHandler.GetAemProductInfoCallback(String) on completion. 
		  //
		  // - GET /system/console/status-productinfo.json
		  // - defaultResponse: Nil
		  //
		  // - BASIC:
		  //   - type: http
		  //   - name: aemAuth
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  
		  
		  AddHandler localVarHTTPSocket.AuthenticationRequired, addressof Me.AuthenticationRequired


		  Dim localVarPath As String = "/system/console/status-productinfo.json"
		  
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.GetAemProductInfo_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.GetAemProductInfo_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function GetAemProductInfoPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, outData() As String) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
		      Try
		        Xoson.fromJSON(outData, Content.toText())

		      Catch e As JSONException
		        error.Message = error.Message + " with JSON parse exception: " + e.Message
		        error.ErrorNumber = kErrorInvalidJSON
		        Return False
		        
		      Catch e As Xojo.Data.InvalidJSONException
		        error.Message = error.Message + " with Xojo.Data.JSON parse exception: " + e.Message
		        error.ErrorNumber = kErrorInvalidJSON
		        Return False
		        
		      Catch e As Xoson.XosonException
		        error.Message = error.Message + " with Xoson parse exception: " + e.Message
		        error.ErrorNumber = kErrorXosonProblem
		        Return False

		      End Try
		      
		    ElseIf contentType.LeftB(19) = "multipart/form-data" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    ElseIf contentType.LeftB(33) = "application/x-www-form-urlencoded" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    Else
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    End If
		  Else
		    error.Message = error.Message + ". " + Content
			error.ErrorNumber = kErrorHTTPFail
		    Return False
		  End If
		  
		  Return True
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub GetAemProductInfo_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data() As String
		  CallbackHandler.GetAemProductInfoCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub GetAemProductInfo_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data() As String
		  Call GetAemProductInfoPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.GetAemProductInfoCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub GetBundleInfo(, name As String)
		  // Operation getBundleInfo
		  // - 
		  // - parameter name: (path)  
		  //
		  // Invokes ConsoleApiCallbackHandler.GetBundleInfoCallback(BundleInfo) on completion. 
		  //
		  // - GET /system/console/bundles/{name}.json
		  // - defaultResponse: Nil
		  //
		  // - BASIC:
		  //   - type: http
		  //   - name: aemAuth
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  
		  
		  AddHandler localVarHTTPSocket.AuthenticationRequired, addressof Me.AuthenticationRequired


		  Dim localVarPath As String = "/system/console/bundles/{name}.json"
		  
		  Dim localVarPathStringname As String = name
		  
		  localVarPath = localVarPath.ReplaceAllB("{name}", localVarPathStringname)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.GetBundleInfo_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.GetBundleInfo_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function GetBundleInfoPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.BundleInfo) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.BundleInfo
			  Try
		        Xoson.fromJSON(outData, Content.toText())

		      Catch e As JSONException
		        error.Message = error.Message + " with JSON parse exception: " + e.Message
		        error.ErrorNumber = kErrorInvalidJSON
		        Return False
		        
		      Catch e As Xojo.Data.InvalidJSONException
		        error.Message = error.Message + " with Xojo.Data.JSON parse exception: " + e.Message
		        error.ErrorNumber = kErrorInvalidJSON
		        Return False
		        
		      Catch e As Xoson.XosonException
		        error.Message = error.Message + " with Xoson parse exception: " + e.Message
		        error.ErrorNumber = kErrorXosonProblem
		        Return False

		      End Try
		      
		      
		    ElseIf contentType.LeftB(19) = "multipart/form-data" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    ElseIf contentType.LeftB(33) = "application/x-www-form-urlencoded" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    Else
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    End If
		  Else
		    error.Message = error.Message + ". " + Content
			error.ErrorNumber = kErrorHTTPFail
		    Return False
		  End If
		  
		  Return True
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub GetBundleInfo_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.BundleInfo
		  CallbackHandler.GetBundleInfoCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub GetBundleInfo_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.BundleInfo
		  Call GetBundleInfoPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.GetBundleInfoCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub GetConfigMgr()
		  // Operation getConfigMgr
		  // - 
		  //
		  // Invokes ConsoleApiCallbackHandler.GetConfigMgrCallback(String) on completion. 
		  //
		  // - GET /system/console/configMgr
		  // - defaultResponse: Sample
		  //
		  // - BASIC:
		  //   - type: http
		  //   - name: aemAuth
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  
		  
		  AddHandler localVarHTTPSocket.AuthenticationRequired, addressof Me.AuthenticationRequired


		  Dim localVarPath As String = "/system/console/configMgr"
		  
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.GetConfigMgr_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.GetConfigMgr_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function GetConfigMgrPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As String) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      outData = Content
		      
		      
		    ElseIf contentType.LeftB(19) = "multipart/form-data" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    ElseIf contentType.LeftB(33) = "application/x-www-form-urlencoded" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    Else
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    End If
		  Else
		    error.Message = error.Message + ". " + Content
			error.ErrorNumber = kErrorHTTPFail
		    Return False
		  End If
		  
		  Return True
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub GetConfigMgr_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As String
		  CallbackHandler.GetConfigMgrCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub GetConfigMgr_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As String
		  Call GetConfigMgrPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.GetConfigMgrCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub PostBundle(, name As String, action As String)
		  // Operation postBundle
		  // - parameter name: (path)  
		  // - parameter action: (query)  
		  //
		  // Invokes ConsoleApiCallbackHandler.PostBundleCallback() on completion. 
		  //
		  // - POST /system/console/bundles/{name}
		  //
		  // - BASIC:
		  //   - type: http
		  //   - name: aemAuth
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  Dim localVarQueryParams As String = "?"
		  localVarQueryParams = localVarQueryParams + EncodeURLComponent("action") + "=" + EncodeURLComponent(action)
		  

		  
		  AddHandler localVarHTTPSocket.AuthenticationRequired, addressof Me.AuthenticationRequired


		  Dim localVarPath As String = "/system/console/bundles/{name}"
		  
		  Dim localVarPathStringname As String = name
		  
		  localVarPath = localVarPath.ReplaceAllB("{name}", localVarPathStringname)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof Me.PostBundle_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.PostBundle_error
		  
		  localVarHTTPSocket.SendRequest("POST", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod


	#tag Method, Flags = &h21
		Private Sub PostBundle_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  CallbackHandler.PostBundleCallback(error)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub PostBundle_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  #Pragma Unused Headers
		  #Pragma Unused Content

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", "")
		  
		  
		  
		  CallbackHandler.PostBundleCallback(error)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub PostJmxRepository(, action As String)
		  // Operation postJmxRepository
		  // - parameter action: (path)  
		  //
		  // Invokes ConsoleApiCallbackHandler.PostJmxRepositoryCallback() on completion. 
		  //
		  // - POST /system/console/jmx/com.adobe.granite:type=Repository/op/{action}
		  //
		  // - BASIC:
		  //   - type: http
		  //   - name: aemAuth
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  
		  
		  AddHandler localVarHTTPSocket.AuthenticationRequired, addressof Me.AuthenticationRequired


		  Dim localVarPath As String = "/system/console/jmx/com.adobe.granite:type=Repository/op/{action}"
		  
		  Dim localVarPathStringaction As String = action
		  
		  localVarPath = localVarPath.ReplaceAllB("{action}", localVarPathStringaction)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof Me.PostJmxRepository_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.PostJmxRepository_error
		  
		  localVarHTTPSocket.SendRequest("POST", Me.BasePath + localVarPath)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod


	#tag Method, Flags = &h21
		Private Sub PostJmxRepository_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  CallbackHandler.PostJmxRepositoryCallback(error)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub PostJmxRepository_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  #Pragma Unused Headers
		  #Pragma Unused Content

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", "")
		  
		  
		  
		  CallbackHandler.PostJmxRepositoryCallback(error)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub PostSamlConfiguration(, Optional post As Xoson.O.OptionalBoolean, Optional apply As Xoson.O.OptionalBoolean, Optional delete As Xoson.O.OptionalBoolean, Optional action As Xoson.O.OptionalString, Optional location As Xoson.O.OptionalString, path() As String, Optional serviceRanking As Xoson.O.OptionalInteger, Optional idpUrl As Xoson.O.OptionalString, Optional idpCertAlias As Xoson.O.OptionalString, Optional idpHttpRedirect As Xoson.O.OptionalBoolean, Optional serviceProviderEntityId As Xoson.O.OptionalString, Optional assertionConsumerServiceURL As Xoson.O.OptionalString, Optional spPrivateKeyAlias As Xoson.O.OptionalString, Optional keyStorePassword As Xoson.O.OptionalString, Optional defaultRedirectUrl As Xoson.O.OptionalString, Optional userIDAttribute As Xoson.O.OptionalString, Optional useEncryption As Xoson.O.OptionalBoolean, Optional createUser As Xoson.O.OptionalBoolean, Optional addGroupMemberships As Xoson.O.OptionalBoolean, Optional groupMembershipAttribute As Xoson.O.OptionalString, defaultGroups() As String, Optional nameIdFormat As Xoson.O.OptionalString, synchronizeAttributes() As String, Optional handleLogout As Xoson.O.OptionalBoolean, Optional logoutUrl As Xoson.O.OptionalString, Optional clockTolerance As Xoson.O.OptionalInteger, Optional digestMethod As Xoson.O.OptionalString, Optional signatureMethod As Xoson.O.OptionalString, Optional userIntermediatePath As Xoson.O.OptionalString, propertylist() As String)
		  // Operation postSamlConfiguration
		  // - 
		  // - parameter post: (query)  (optional, default to False)
		  // - parameter apply: (query)  (optional, default to False)
		  // - parameter delete: (query)  (optional, default to False)
		  // - parameter action: (query)  (optional, default to Sample)
		  // - parameter location: (query)  (optional, default to Sample)
		  // - parameter path: (query)  (optional, default to Nil)
		  // - parameter serviceRanking: (query)  (optional, default to 0)
		  // - parameter idpUrl: (query)  (optional, default to Sample)
		  // - parameter idpCertAlias: (query)  (optional, default to Sample)
		  // - parameter idpHttpRedirect: (query)  (optional, default to False)
		  // - parameter serviceProviderEntityId: (query)  (optional, default to Sample)
		  // - parameter assertionConsumerServiceURL: (query)  (optional, default to Sample)
		  // - parameter spPrivateKeyAlias: (query)  (optional, default to Sample)
		  // - parameter keyStorePassword: (query)  (optional, default to Sample)
		  // - parameter defaultRedirectUrl: (query)  (optional, default to Sample)
		  // - parameter userIDAttribute: (query)  (optional, default to Sample)
		  // - parameter useEncryption: (query)  (optional, default to False)
		  // - parameter createUser: (query)  (optional, default to False)
		  // - parameter addGroupMemberships: (query)  (optional, default to False)
		  // - parameter groupMembershipAttribute: (query)  (optional, default to Sample)
		  // - parameter defaultGroups: (query)  (optional, default to Nil)
		  // - parameter nameIdFormat: (query)  (optional, default to Sample)
		  // - parameter synchronizeAttributes: (query)  (optional, default to Nil)
		  // - parameter handleLogout: (query)  (optional, default to False)
		  // - parameter logoutUrl: (query)  (optional, default to Sample)
		  // - parameter clockTolerance: (query)  (optional, default to 0)
		  // - parameter digestMethod: (query)  (optional, default to Sample)
		  // - parameter signatureMethod: (query)  (optional, default to Sample)
		  // - parameter userIntermediatePath: (query)  (optional, default to Sample)
		  // - parameter propertylist: (query)  (optional, default to Nil)
		  //
		  // Invokes ConsoleApiCallbackHandler.PostSamlConfigurationCallback(SamlConfigurationInfo) on completion. 
		  //
		  // - POST /system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler
		  // - defaultResponse: Nil
		  //
		  // - BASIC:
		  //   - type: http
		  //   - name: aemAuth
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  Dim localVarQueryParams As String = "?"
		  If post <> nil Then localVarQueryParams = localVarQueryParams + EncodeURLComponent("post") + "=" + EncodeURLComponent(post.ToString)
		  
		  If apply <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("apply") + "=" + EncodeURLComponent(apply.ToString)
		  
		  If delete <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("delete") + "=" + EncodeURLComponent(delete.ToString)
		  
		  If action <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("action") + "=" + EncodeURLComponent(action)
		  
		  If location <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("$location") + "=" + EncodeURLComponent(location)
		  
		  
		  Dim localVarQueryStringspath() As String
		  For Each localVarItempath As String in path
		    Dim encodedParameter As String = EncodeURLComponent(localVarItempath)
		    Select Case "form"
		      Case "form"
		        localVarQueryStringspath.Append("inner=" + encodedParameter)
		      Case "spaceDelimited"
		        localVarQueryStringspath.Append("inner=" + encodedParameter)
		      Case "pipeDelimited"
		        localVarQueryStringspath.Append("inner=" + encodedParameter)
		      Case "deepObject"
		        Raise New OpenAPIClient.OpenAPIClientException(kErrorUnsupportedFeature, "deepObject query parameters are not supported")
		    End Select
		  Next
		  
		  Dim localVarQueryStringpath As String
		  localVarQueryStringpath = Join(localVarQueryStringspath, "&")
		  If serviceRanking <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("service.ranking") + "=" + EncodeURLComponent(serviceRanking.ToString)
		  
		  If idpUrl <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("idpUrl") + "=" + EncodeURLComponent(idpUrl)
		  
		  If idpCertAlias <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("idpCertAlias") + "=" + EncodeURLComponent(idpCertAlias)
		  
		  If idpHttpRedirect <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("idpHttpRedirect") + "=" + EncodeURLComponent(idpHttpRedirect.ToString)
		  
		  If serviceProviderEntityId <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("serviceProviderEntityId") + "=" + EncodeURLComponent(serviceProviderEntityId)
		  
		  If assertionConsumerServiceURL <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("assertionConsumerServiceURL") + "=" + EncodeURLComponent(assertionConsumerServiceURL)
		  
		  If spPrivateKeyAlias <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("spPrivateKeyAlias") + "=" + EncodeURLComponent(spPrivateKeyAlias)
		  
		  If keyStorePassword <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("keyStorePassword") + "=" + EncodeURLComponent(keyStorePassword)
		  
		  If defaultRedirectUrl <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("defaultRedirectUrl") + "=" + EncodeURLComponent(defaultRedirectUrl)
		  
		  If userIDAttribute <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("userIDAttribute") + "=" + EncodeURLComponent(userIDAttribute)
		  
		  If useEncryption <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("useEncryption") + "=" + EncodeURLComponent(useEncryption.ToString)
		  
		  If createUser <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("createUser") + "=" + EncodeURLComponent(createUser.ToString)
		  
		  If addGroupMemberships <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("addGroupMemberships") + "=" + EncodeURLComponent(addGroupMemberships.ToString)
		  
		  If groupMembershipAttribute <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("groupMembershipAttribute") + "=" + EncodeURLComponent(groupMembershipAttribute)
		  
		  
		  Dim localVarQueryStringsdefaultGroups() As String
		  For Each localVarItemdefaultGroups As String in defaultGroups
		    Dim encodedParameter As String = EncodeURLComponent(localVarItemdefaultGroups)
		    Select Case "form"
		      Case "form"
		        localVarQueryStringsdefaultGroups.Append("inner=" + encodedParameter)
		      Case "spaceDelimited"
		        localVarQueryStringsdefaultGroups.Append("inner=" + encodedParameter)
		      Case "pipeDelimited"
		        localVarQueryStringsdefaultGroups.Append("inner=" + encodedParameter)
		      Case "deepObject"
		        Raise New OpenAPIClient.OpenAPIClientException(kErrorUnsupportedFeature, "deepObject query parameters are not supported")
		    End Select
		  Next
		  
		  Dim localVarQueryStringdefaultGroups As String
		  localVarQueryStringdefaultGroups = Join(localVarQueryStringsdefaultGroups, "&")
		  If nameIdFormat <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("nameIdFormat") + "=" + EncodeURLComponent(nameIdFormat)
		  
		  
		  Dim localVarQueryStringssynchronizeAttributes() As String
		  For Each localVarItemsynchronizeAttributes As String in synchronizeAttributes
		    Dim encodedParameter As String = EncodeURLComponent(localVarItemsynchronizeAttributes)
		    Select Case "form"
		      Case "form"
		        localVarQueryStringssynchronizeAttributes.Append("inner=" + encodedParameter)
		      Case "spaceDelimited"
		        localVarQueryStringssynchronizeAttributes.Append("inner=" + encodedParameter)
		      Case "pipeDelimited"
		        localVarQueryStringssynchronizeAttributes.Append("inner=" + encodedParameter)
		      Case "deepObject"
		        Raise New OpenAPIClient.OpenAPIClientException(kErrorUnsupportedFeature, "deepObject query parameters are not supported")
		    End Select
		  Next
		  
		  Dim localVarQueryStringsynchronizeAttributes As String
		  localVarQueryStringsynchronizeAttributes = Join(localVarQueryStringssynchronizeAttributes, "&")
		  If handleLogout <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("handleLogout") + "=" + EncodeURLComponent(handleLogout.ToString)
		  
		  If logoutUrl <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("logoutUrl") + "=" + EncodeURLComponent(logoutUrl)
		  
		  If clockTolerance <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("clockTolerance") + "=" + EncodeURLComponent(clockTolerance.ToString)
		  
		  If digestMethod <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("digestMethod") + "=" + EncodeURLComponent(digestMethod)
		  
		  If signatureMethod <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("signatureMethod") + "=" + EncodeURLComponent(signatureMethod)
		  
		  If userIntermediatePath <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("userIntermediatePath") + "=" + EncodeURLComponent(userIntermediatePath)
		  
		  
		  Dim localVarQueryStringspropertylist() As String
		  For Each localVarItempropertylist As String in propertylist
		    Dim encodedParameter As String = EncodeURLComponent(localVarItempropertylist)
		    localVarQueryStringspropertylist.Append(encodedParameter)
		  Next
		  
		  Dim localVarQueryStringpropertylist As String
		  Select Case "form"
		    Case "form"
			  localVarQueryStringpropertylist = "inner=" + Join(localVarQueryStringspropertylist, ",")
		    Case "spaceDelimited"
		      localVarQueryStringpropertylist = "inner=" + Join(localVarQueryStringspropertylist, " ")
		    Case "pipeDelimited"
		      localVarQueryStringpropertylist = "inner=" + Join(localVarQueryStringspropertylist, "|")
		    Case "deepObject"
		      Raise New OpenAPIClient.OpenAPIClientException(kErrorUnsupportedFeature, "deepObject query parameters are not supported")
		  End Select
		  If localVarQueryStringspropertylist.Ubound() > -1 Then localVarQueryParams = localVarQueryParams + "&"  + EncodeURLComponent("inner") + "=" + EncodeURLComponent(localVarQueryStringpropertylist)

		  
		  AddHandler localVarHTTPSocket.AuthenticationRequired, addressof Me.AuthenticationRequired


		  Dim localVarPath As String = "/system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler"
		  
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.PostSamlConfiguration_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.PostSamlConfiguration_error
		  
		  
		  localVarHTTPSocket.SendRequest("POST", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function PostSamlConfigurationPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.SamlConfigurationInfo) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.SamlConfigurationInfo
			  Try
		        Xoson.fromJSON(outData, Content.toText())

		      Catch e As JSONException
		        error.Message = error.Message + " with JSON parse exception: " + e.Message
		        error.ErrorNumber = kErrorInvalidJSON
		        Return False
		        
		      Catch e As Xojo.Data.InvalidJSONException
		        error.Message = error.Message + " with Xojo.Data.JSON parse exception: " + e.Message
		        error.ErrorNumber = kErrorInvalidJSON
		        Return False
		        
		      Catch e As Xoson.XosonException
		        error.Message = error.Message + " with Xoson parse exception: " + e.Message
		        error.ErrorNumber = kErrorXosonProblem
		        Return False

		      End Try
		      
		      
		    ElseIf contentType.LeftB(19) = "multipart/form-data" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    ElseIf contentType.LeftB(33) = "application/x-www-form-urlencoded" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    Else
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    End If
		  Else
		    error.Message = error.Message + ". " + Content
			error.ErrorNumber = kErrorHTTPFail
		    Return False
		  End If
		  
		  Return True
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub PostSamlConfiguration_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.SamlConfigurationInfo
		  CallbackHandler.PostSamlConfigurationCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub PostSamlConfiguration_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.SamlConfigurationInfo
		  Call PostSamlConfigurationPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.PostSamlConfigurationCallback(error, data)
		End Sub
	#tag EndMethod






	#tag Method, Flags = &h21
		Private Function AuthenticationRequired(Realm As String, Headers As InternetHeaders, ByRef Name As String, ByRef Password As String) As Boolean
		  #Pragma Unused Realm
		  #Pragma Unused Headers
		  Name = Me.BasicAuthUser
		  Password = Me.BasicAuthPassword
		  Return True
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub PrivateFuncPrepareSocket(socket As HTTPSecureSocket)
		  socket.Secure = Me.useHTTPS
		  socket.ConnectionType = SSLSocket.TLSv12
		  socket.Port = Me.Port
		  socket.RequestHeaders.Delete("Accept")
		  socket.RequestHeaders.AppendHeader("Accept", "text/plain")
		  socket.RequestHeaders.AppendHeader("Accept", "application/json")
		  socket.RequestHeaders.AppendHeader("Content-Type", "application/json")

		  If Me.AdditionalHeaders <> Nil Then
		    For Each HeaderName As Variant In Me.AdditionalHeaders.Keys
		      Dim headerValueS As Variant = additionalHeaders.Value(HeaderName)
		      If headerValueS.IsArray Then
		        If headerValueS.ArrayElementType = Variant.TypeString Then
		          Dim values() As String = headerValueS
		          For Each value As String In values
		            socket.RequestHeaders.AppendHeader(HeaderName, value)
		          Next
		        Else
		          Raise New OpenAPIClient.OpenAPIClientException(kErrorInternal, "AdditionalHeaders only support Strings and String arrays as values.")
		        End If
		      Else
		        socket.RequestHeaders.AppendHeader(HeaderName, headerValueS.StringValue)
		      End If
		    Next
		  End If
		End Sub
	#tag EndMethod



	#tag Property, Flags = &h0
		AdditionalHeaders As Dictionary
	#tag EndProperty

	#tag Property, Flags = &h0
		BasePath As String = "http://localhost"
	#tag EndProperty

	#tag Property, Flags = &h0
		BasicAuthPassword As String
	#tag EndProperty

	#tag Property, Flags = &h0
		BasicAuthUser As String
	#tag EndProperty

	#tag Property, Flags = &h0
		CallbackHandler As OpenAPIClient.APIs.ConsoleApiCallbackHandler
	#tag EndProperty

	#tag Property, Flags = &h0
		Host As String = ""
	#tag EndProperty

	#tag Property, Flags = &h0
		Port As Integer
	#tag EndProperty

	#tag Property, Flags = &h0
		UseHTTPS As Boolean = true
	#tag EndProperty


	#tag ViewBehavior
		#tag ViewProperty
			Name="Name"
			Visible=true
			Group="ID"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Index"
			Visible=true
			Group="ID"
			InitialValue="-2147483648"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Super"
			Visible=true
			Group="ID"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Left"
			Visible=true
			Group="Position"
			InitialValue="0"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Top"
			Visible=true
			Group="Position"
			InitialValue="0"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="BasePath"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType="MultiLineEditor"
		#tag EndViewProperty
		#tag ViewProperty
			Name="BasicAuthUser"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType="MultiLineEditor"
		#tag EndViewProperty
		#tag ViewProperty
			Name="BasicAuthPassword"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType="MultiLineEditor"
		#tag EndViewProperty
		#tag ViewProperty
			Name="UseHTTPS"
			Visible=false
			Group="Behavior"
			InitialValue="true"
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Port"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Host"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType="MultiLineEditor"
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass
