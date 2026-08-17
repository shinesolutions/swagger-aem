#tag Class
Protected Class CustomApi
	#tag Method, Flags = &h0
		Sub GetAemHealthCheck(, Optional tags As Xoson.O.OptionalString, Optional combineTagsOr As Xoson.O.OptionalBoolean)
		  // Operation getAemHealthCheck
		  // - 
		  // - parameter tags: (query)  (optional, default to Sample)
		  // - parameter combineTagsOr: (query)  (optional, default to False)
		  //
		  // Invokes CustomApiCallbackHandler.GetAemHealthCheckCallback(String) on completion. 
		  //
		  // - GET /system/health
		  // - defaultResponse: Sample
		  //
		  // - BASIC:
		  //   - type: http
		  //   - name: aemAuth
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  Dim localVarQueryParams As String = "?"
		  If tags <> nil Then localVarQueryParams = localVarQueryParams + EncodeURLComponent("tags") + "=" + EncodeURLComponent(tags)
		  
		  If combineTagsOr <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("combineTagsOr") + "=" + EncodeURLComponent(combineTagsOr.ToString)
		  

		  
		  AddHandler localVarHTTPSocket.AuthenticationRequired, addressof Me.AuthenticationRequired


		  Dim localVarPath As String = "/system/health"
		  
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.GetAemHealthCheck_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.GetAemHealthCheck_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function GetAemHealthCheckPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As String) As Boolean
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
		Private Sub GetAemHealthCheck_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As String
		  CallbackHandler.GetAemHealthCheckCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub GetAemHealthCheck_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As String
		  Call GetAemHealthCheckPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.GetAemHealthCheckCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub PostConfigAemHealthCheckServlet(, bundlesIgnored() As String, Optional bundlesIgnoredTypeHint As Xoson.O.OptionalString)
		  // Operation postConfigAemHealthCheckServlet
		  // - parameter bundlesIgnored: (query)  (optional, default to Nil)
		  // - parameter bundlesIgnoredTypeHint: (query)  (optional, default to Sample)
		  //
		  // Invokes CustomApiCallbackHandler.PostConfigAemHealthCheckServletCallback() on completion. 
		  //
		  // - POST /apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck
		  //
		  // - BASIC:
		  //   - type: http
		  //   - name: aemAuth
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  Dim localVarQueryParams As String = "?"
		  
		  Dim localVarQueryStringsbundlesIgnored() As String
		  For Each localVarItembundlesIgnored As String in bundlesIgnored
		    Dim encodedParameter As String = EncodeURLComponent(localVarItembundlesIgnored)
		    Select Case "form"
		      Case "form"
		        localVarQueryStringsbundlesIgnored.Append("inner=" + encodedParameter)
		      Case "spaceDelimited"
		        localVarQueryStringsbundlesIgnored.Append("inner=" + encodedParameter)
		      Case "pipeDelimited"
		        localVarQueryStringsbundlesIgnored.Append("inner=" + encodedParameter)
		      Case "deepObject"
		        Raise New OpenAPIClient.OpenAPIClientException(kErrorUnsupportedFeature, "deepObject query parameters are not supported")
		    End Select
		  Next
		  
		  Dim localVarQueryStringbundlesIgnored As String
		  localVarQueryStringbundlesIgnored = Join(localVarQueryStringsbundlesIgnored, "&")
		  If bundlesIgnoredTypeHint <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("bundles.ignored@TypeHint") + "=" + EncodeURLComponent(bundlesIgnoredTypeHint)
		  

		  
		  AddHandler localVarHTTPSocket.AuthenticationRequired, addressof Me.AuthenticationRequired


		  Dim localVarPath As String = "/apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck"
		  
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof Me.PostConfigAemHealthCheckServlet_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.PostConfigAemHealthCheckServlet_error
		  
		  localVarHTTPSocket.SendRequest("POST", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod


	#tag Method, Flags = &h21
		Private Sub PostConfigAemHealthCheckServlet_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  CallbackHandler.PostConfigAemHealthCheckServletCallback(error)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub PostConfigAemHealthCheckServlet_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  #Pragma Unused Headers
		  #Pragma Unused Content

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", "")
		  
		  
		  
		  CallbackHandler.PostConfigAemHealthCheckServletCallback(error)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub PostConfigAemPasswordReset(, pwdresetAuthorizables() As String, Optional pwdresetAuthorizablesTypeHint As Xoson.O.OptionalString)
		  // Operation postConfigAemPasswordReset
		  // - parameter pwdresetAuthorizables: (query)  (optional, default to Nil)
		  // - parameter pwdresetAuthorizablesTypeHint: (query)  (optional, default to Sample)
		  //
		  // Invokes CustomApiCallbackHandler.PostConfigAemPasswordResetCallback() on completion. 
		  //
		  // - POST /apps/system/config/com.shinesolutions.aem.passwordreset.Activator
		  //
		  // - BASIC:
		  //   - type: http
		  //   - name: aemAuth
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  Dim localVarQueryParams As String = "?"
		  
		  Dim localVarQueryStringspwdresetAuthorizables() As String
		  For Each localVarItempwdresetAuthorizables As String in pwdresetAuthorizables
		    Dim encodedParameter As String = EncodeURLComponent(localVarItempwdresetAuthorizables)
		    Select Case "form"
		      Case "form"
		        localVarQueryStringspwdresetAuthorizables.Append("inner=" + encodedParameter)
		      Case "spaceDelimited"
		        localVarQueryStringspwdresetAuthorizables.Append("inner=" + encodedParameter)
		      Case "pipeDelimited"
		        localVarQueryStringspwdresetAuthorizables.Append("inner=" + encodedParameter)
		      Case "deepObject"
		        Raise New OpenAPIClient.OpenAPIClientException(kErrorUnsupportedFeature, "deepObject query parameters are not supported")
		    End Select
		  Next
		  
		  Dim localVarQueryStringpwdresetAuthorizables As String
		  localVarQueryStringpwdresetAuthorizables = Join(localVarQueryStringspwdresetAuthorizables, "&")
		  If pwdresetAuthorizablesTypeHint <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("pwdreset.authorizables@TypeHint") + "=" + EncodeURLComponent(pwdresetAuthorizablesTypeHint)
		  

		  
		  AddHandler localVarHTTPSocket.AuthenticationRequired, addressof Me.AuthenticationRequired


		  Dim localVarPath As String = "/apps/system/config/com.shinesolutions.aem.passwordreset.Activator"
		  
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof Me.PostConfigAemPasswordReset_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.PostConfigAemPasswordReset_error
		  
		  localVarHTTPSocket.SendRequest("POST", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod


	#tag Method, Flags = &h21
		Private Sub PostConfigAemPasswordReset_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  CallbackHandler.PostConfigAemPasswordResetCallback(error)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub PostConfigAemPasswordReset_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  #Pragma Unused Headers
		  #Pragma Unused Content

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", "")
		  
		  
		  
		  CallbackHandler.PostConfigAemPasswordResetCallback(error)
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
		CallbackHandler As OpenAPIClient.APIs.CustomApiCallbackHandler
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
