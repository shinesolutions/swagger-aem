#tag Class
Protected Class SlingApi
	#tag Method, Flags = &h0
		Sub DeleteAgent(, runmode As String, name As String)
		  // Operation deleteAgent
		  // - parameter runmode: (path)  
		  // - parameter name: (path)  
		  //
		  // Invokes SlingApiCallbackHandler.DeleteAgentCallback() on completion. 
		  //
		  // - DELETE /etc/replication/agents.{runmode}/{name}
		  //
		  // - BASIC:
		  //   - type: http
		  //   - name: aemAuth
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  
		  
		  AddHandler localVarHTTPSocket.AuthenticationRequired, addressof Me.AuthenticationRequired


		  Dim localVarPath As String = "/etc/replication/agents.{runmode}/{name}"
		  
		  Dim localVarPathStringrunmode As String = runmode
		  
		  localVarPath = localVarPath.ReplaceAllB("{runmode}", localVarPathStringrunmode)
		  Dim localVarPathStringname As String = name
		  
		  localVarPath = localVarPath.ReplaceAllB("{name}", localVarPathStringname)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof Me.DeleteAgent_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.DeleteAgent_error
		  
		  localVarHTTPSocket.SendRequest("DELETE", Me.BasePath + localVarPath)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod


	#tag Method, Flags = &h21
		Private Sub DeleteAgent_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  CallbackHandler.DeleteAgentCallback(error)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub DeleteAgent_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  #Pragma Unused Headers
		  #Pragma Unused Content

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", "")
		  
		  
		  
		  CallbackHandler.DeleteAgentCallback(error)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub DeleteNode(, path As String, name As String)
		  // Operation deleteNode
		  // - parameter path: (path)  
		  // - parameter name: (path)  
		  //
		  // Invokes SlingApiCallbackHandler.DeleteNodeCallback() on completion. 
		  //
		  // - DELETE /{path}/{name}
		  //
		  // - BASIC:
		  //   - type: http
		  //   - name: aemAuth
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  
		  
		  AddHandler localVarHTTPSocket.AuthenticationRequired, addressof Me.AuthenticationRequired


		  Dim localVarPath As String = "/{path}/{name}"
		  
		  Dim localVarPathStringpath As String = path
		  
		  localVarPath = localVarPath.ReplaceAllB("{path}", localVarPathStringpath)
		  Dim localVarPathStringname As String = name
		  
		  localVarPath = localVarPath.ReplaceAllB("{name}", localVarPathStringname)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof Me.DeleteNode_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.DeleteNode_error
		  
		  localVarHTTPSocket.SendRequest("DELETE", Me.BasePath + localVarPath)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod


	#tag Method, Flags = &h21
		Private Sub DeleteNode_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  CallbackHandler.DeleteNodeCallback(error)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub DeleteNode_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  #Pragma Unused Headers
		  #Pragma Unused Content

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", "")
		  
		  
		  
		  CallbackHandler.DeleteNodeCallback(error)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub GetAgent(, runmode As String, name As String)
		  // Operation getAgent
		  // - parameter runmode: (path)  
		  // - parameter name: (path)  
		  //
		  // Invokes SlingApiCallbackHandler.GetAgentCallback() on completion. 
		  //
		  // - GET /etc/replication/agents.{runmode}/{name}
		  //
		  // - BASIC:
		  //   - type: http
		  //   - name: aemAuth
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  
		  
		  AddHandler localVarHTTPSocket.AuthenticationRequired, addressof Me.AuthenticationRequired


		  Dim localVarPath As String = "/etc/replication/agents.{runmode}/{name}"
		  
		  Dim localVarPathStringrunmode As String = runmode
		  
		  localVarPath = localVarPath.ReplaceAllB("{runmode}", localVarPathStringrunmode)
		  Dim localVarPathStringname As String = name
		  
		  localVarPath = localVarPath.ReplaceAllB("{name}", localVarPathStringname)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof Me.GetAgent_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.GetAgent_error
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod


	#tag Method, Flags = &h21
		Private Sub GetAgent_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  CallbackHandler.GetAgentCallback(error)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub GetAgent_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  #Pragma Unused Headers
		  #Pragma Unused Content

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", "")
		  
		  
		  
		  CallbackHandler.GetAgentCallback(error)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub GetAgents(, runmode As String)
		  // Operation getAgents
		  // - 
		  // - parameter runmode: (path)  
		  //
		  // Invokes SlingApiCallbackHandler.GetAgentsCallback(String) on completion. 
		  //
		  // - GET /etc/replication/agents.{runmode}.-1.json
		  // - defaultResponse: Sample
		  //
		  // - BASIC:
		  //   - type: http
		  //   - name: aemAuth
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  
		  
		  AddHandler localVarHTTPSocket.AuthenticationRequired, addressof Me.AuthenticationRequired


		  Dim localVarPath As String = "/etc/replication/agents.{runmode}.-1.json"
		  
		  Dim localVarPathStringrunmode As String = runmode
		  
		  localVarPath = localVarPath.ReplaceAllB("{runmode}", localVarPathStringrunmode)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.GetAgents_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.GetAgents_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function GetAgentsPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As String) As Boolean
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
		Private Sub GetAgents_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As String
		  CallbackHandler.GetAgentsCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub GetAgents_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As String
		  Call GetAgentsPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.GetAgentsCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub GetAuthorizableKeystore(, intermediatePath As String, authorizableId As String)
		  // Operation getAuthorizableKeystore
		  // - 
		  // - parameter intermediatePath: (path)  
		  // - parameter authorizableId: (path)  
		  //
		  // Invokes SlingApiCallbackHandler.GetAuthorizableKeystoreCallback(KeystoreInfo) on completion. 
		  //
		  // - GET /{intermediatePath}/{authorizableId}.ks.json
		  // - defaultResponse: Nil
		  //
		  // - BASIC:
		  //   - type: http
		  //   - name: aemAuth
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  
		  
		  AddHandler localVarHTTPSocket.AuthenticationRequired, addressof Me.AuthenticationRequired


		  Dim localVarPath As String = "/{intermediatePath}/{authorizableId}.ks.json"
		  
		  Dim localVarPathStringintermediatePath As String = intermediatePath
		  
		  localVarPath = localVarPath.ReplaceAllB("{intermediatePath}", localVarPathStringintermediatePath)
		  Dim localVarPathStringauthorizableId As String = authorizableId
		  
		  localVarPath = localVarPath.ReplaceAllB("{authorizableId}", localVarPathStringauthorizableId)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.GetAuthorizableKeystore_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.GetAuthorizableKeystore_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function GetAuthorizableKeystorePrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.KeystoreInfo) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.KeystoreInfo
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
		Private Sub GetAuthorizableKeystore_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.KeystoreInfo
		  CallbackHandler.GetAuthorizableKeystoreCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub GetAuthorizableKeystore_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.KeystoreInfo
		  Call GetAuthorizableKeystorePrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.GetAuthorizableKeystoreCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub GetKeystore(downloadToFile As FolderItem, intermediatePath As String, authorizableId As String)
		  // Operation getKeystore
		  // - parameter downloadToFile: The writable, non-existing path in the filesystem where the response body should be stored.
		  // - parameter intermediatePath: (path)  
		  // - parameter authorizableId: (path)  
		  //
		  // Invokes SlingApiCallbackHandler.GetKeystoreCallback(FolderItem) on completion. 
		  //
		  // - GET /{intermediatePath}/{authorizableId}/keystore/store.p12
		  // - defaultResponse: Sample
		  //
		  // - BASIC:
		  //   - type: http
		  //   - name: aemAuth
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  
		  
		  AddHandler localVarHTTPSocket.AuthenticationRequired, addressof Me.AuthenticationRequired


		  Dim localVarPath As String = "/{intermediatePath}/{authorizableId}/keystore/store.p12"
		  
		  Dim localVarPathStringintermediatePath As String = intermediatePath
		  
		  localVarPath = localVarPath.ReplaceAllB("{intermediatePath}", localVarPathStringintermediatePath)
		  Dim localVarPathStringauthorizableId As String = authorizableId
		  
		  localVarPath = localVarPath.ReplaceAllB("{authorizableId}", localVarPathStringauthorizableId)
		  
		  AddHandler localVarHTTPSocket.DownloadComplete, addressof me.GetKeystore_handler
		  AddHandler localVarHTTPSocket.ReceiveProgress, addressof Me.GetKeystore_progress
		  
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath, downloadToFile)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod


	#tag Method, Flags = &h21
		Private Sub GetKeystore_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim file As FolderItem
		  CallbackHandler.GetKeystoreCallback(error, file)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub GetKeystore_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, File As FolderItem)
		  #Pragma Unused URL
		  #Pragma Unused Headers

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", "")
		  
		  
		  
		  CallbackHandler.GetKeystoreCallback(error, File)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub GetKeystore_progress(sender As HTTPSecureSocket, BytesReceived As Integer, TotalBytes As Integer, NewData As String)
		  CallbackHandler.GetKeystoreDownloadProgress(BytesReceived, TotalBytes)
		End Sub
	#tag EndMethod


	#tag Method, Flags = &h0
		Sub GetNode(, path As String, name As String)
		  // Operation getNode
		  // - parameter path: (path)  
		  // - parameter name: (path)  
		  //
		  // Invokes SlingApiCallbackHandler.GetNodeCallback() on completion. 
		  //
		  // - GET /{path}/{name}
		  //
		  // - BASIC:
		  //   - type: http
		  //   - name: aemAuth
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  
		  
		  AddHandler localVarHTTPSocket.AuthenticationRequired, addressof Me.AuthenticationRequired


		  Dim localVarPath As String = "/{path}/{name}"
		  
		  Dim localVarPathStringpath As String = path
		  
		  localVarPath = localVarPath.ReplaceAllB("{path}", localVarPathStringpath)
		  Dim localVarPathStringname As String = name
		  
		  localVarPath = localVarPath.ReplaceAllB("{name}", localVarPathStringname)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof Me.GetNode_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.GetNode_error
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod


	#tag Method, Flags = &h21
		Private Sub GetNode_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  CallbackHandler.GetNodeCallback(error)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub GetNode_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  #Pragma Unused Headers
		  #Pragma Unused Content

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", "")
		  
		  
		  
		  CallbackHandler.GetNodeCallback(error)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub GetPackage(downloadToFile As FolderItem, group As String, name As String, version As String)
		  // Operation getPackage
		  // - parameter downloadToFile: The writable, non-existing path in the filesystem where the response body should be stored.
		  // - parameter group: (path)  
		  // - parameter name: (path)  
		  // - parameter version: (path)  
		  //
		  // Invokes SlingApiCallbackHandler.GetPackageCallback(FolderItem) on completion. 
		  //
		  // - GET /etc/packages/{group}/{name}-{version}.zip
		  // - defaultResponse: Sample
		  //
		  // - BASIC:
		  //   - type: http
		  //   - name: aemAuth
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  
		  
		  AddHandler localVarHTTPSocket.AuthenticationRequired, addressof Me.AuthenticationRequired


		  Dim localVarPath As String = "/etc/packages/{group}/{name}-{version}.zip"
		  
		  Dim localVarPathStringgroup As String = group
		  
		  localVarPath = localVarPath.ReplaceAllB("{group}", localVarPathStringgroup)
		  Dim localVarPathStringname As String = name
		  
		  localVarPath = localVarPath.ReplaceAllB("{name}", localVarPathStringname)
		  Dim localVarPathStringversion As String = version
		  
		  localVarPath = localVarPath.ReplaceAllB("{version}", localVarPathStringversion)
		  
		  AddHandler localVarHTTPSocket.DownloadComplete, addressof me.GetPackage_handler
		  AddHandler localVarHTTPSocket.ReceiveProgress, addressof Me.GetPackage_progress
		  
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath, downloadToFile)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod


	#tag Method, Flags = &h21
		Private Sub GetPackage_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim file As FolderItem
		  CallbackHandler.GetPackageCallback(error, file)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub GetPackage_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, File As FolderItem)
		  #Pragma Unused URL
		  #Pragma Unused Headers

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", "")
		  
		  
		  
		  CallbackHandler.GetPackageCallback(error, File)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub GetPackage_progress(sender As HTTPSecureSocket, BytesReceived As Integer, TotalBytes As Integer, NewData As String)
		  CallbackHandler.GetPackageDownloadProgress(BytesReceived, TotalBytes)
		End Sub
	#tag EndMethod


	#tag Method, Flags = &h0
		Sub GetPackageFilter(, group As String, name As String, version As String)
		  // Operation getPackageFilter
		  // - 
		  // - parameter group: (path)  
		  // - parameter name: (path)  
		  // - parameter version: (path)  
		  //
		  // Invokes SlingApiCallbackHandler.GetPackageFilterCallback(String) on completion. 
		  //
		  // - GET /etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json
		  // - defaultResponse: Sample
		  //
		  // - BASIC:
		  //   - type: http
		  //   - name: aemAuth
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  
		  
		  AddHandler localVarHTTPSocket.AuthenticationRequired, addressof Me.AuthenticationRequired


		  Dim localVarPath As String = "/etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json"
		  
		  Dim localVarPathStringgroup As String = group
		  
		  localVarPath = localVarPath.ReplaceAllB("{group}", localVarPathStringgroup)
		  Dim localVarPathStringname As String = name
		  
		  localVarPath = localVarPath.ReplaceAllB("{name}", localVarPathStringname)
		  Dim localVarPathStringversion As String = version
		  
		  localVarPath = localVarPath.ReplaceAllB("{version}", localVarPathStringversion)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.GetPackageFilter_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.GetPackageFilter_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function GetPackageFilterPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As String) As Boolean
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
		Private Sub GetPackageFilter_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As String
		  CallbackHandler.GetPackageFilterCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub GetPackageFilter_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As String
		  Call GetPackageFilterPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.GetPackageFilterCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub GetQuery(, path As String, pLimit As Double, _1property As String, _1propertyValue As String)
		  // Operation getQuery
		  // - 
		  // - parameter path: (query)  
		  // - parameter pLimit: (query)  
		  // - parameter _1property: (query)  
		  // - parameter _1propertyValue: (query)  
		  //
		  // Invokes SlingApiCallbackHandler.GetQueryCallback(String) on completion. 
		  //
		  // - GET /bin/querybuilder.json
		  // - defaultResponse: Sample
		  //
		  // - BASIC:
		  //   - type: http
		  //   - name: aemAuth
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  Dim localVarQueryParams As String = "?"
		  localVarQueryParams = localVarQueryParams + EncodeURLComponent("path") + "=" + EncodeURLComponent(path)
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("p.limit") + "=" + EncodeURLComponent(pLimit.ToString)
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("1_property") + "=" + EncodeURLComponent(_1property)
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("1_property.value") + "=" + EncodeURLComponent(_1propertyValue)
		  

		  
		  AddHandler localVarHTTPSocket.AuthenticationRequired, addressof Me.AuthenticationRequired


		  Dim localVarPath As String = "/bin/querybuilder.json"
		  
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.GetQuery_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.GetQuery_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function GetQueryPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As String) As Boolean
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
		Private Sub GetQuery_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As String
		  CallbackHandler.GetQueryCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub GetQuery_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As String
		  Call GetQueryPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.GetQueryCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub GetTruststore(downloadToFile As FolderItem)
		  // Operation getTruststore
		  // - parameter downloadToFile: The writable, non-existing path in the filesystem where the response body should be stored.
		  //
		  // Invokes SlingApiCallbackHandler.GetTruststoreCallback(FolderItem) on completion. 
		  //
		  // - GET /etc/truststore/truststore.p12
		  // - defaultResponse: Sample
		  //
		  // - BASIC:
		  //   - type: http
		  //   - name: aemAuth
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  
		  
		  AddHandler localVarHTTPSocket.AuthenticationRequired, addressof Me.AuthenticationRequired


		  Dim localVarPath As String = "/etc/truststore/truststore.p12"
		  
		  
		  AddHandler localVarHTTPSocket.DownloadComplete, addressof me.GetTruststore_handler
		  AddHandler localVarHTTPSocket.ReceiveProgress, addressof Me.GetTruststore_progress
		  
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath, downloadToFile)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod


	#tag Method, Flags = &h21
		Private Sub GetTruststore_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim file As FolderItem
		  CallbackHandler.GetTruststoreCallback(error, file)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub GetTruststore_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, File As FolderItem)
		  #Pragma Unused URL
		  #Pragma Unused Headers

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", "")
		  
		  
		  
		  CallbackHandler.GetTruststoreCallback(error, File)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub GetTruststore_progress(sender As HTTPSecureSocket, BytesReceived As Integer, TotalBytes As Integer, NewData As String)
		  CallbackHandler.GetTruststoreDownloadProgress(BytesReceived, TotalBytes)
		End Sub
	#tag EndMethod


	#tag Method, Flags = &h0
		Sub GetTruststoreInfo()
		  // Operation getTruststoreInfo
		  // - 
		  //
		  // Invokes SlingApiCallbackHandler.GetTruststoreInfoCallback(TruststoreInfo) on completion. 
		  //
		  // - GET /libs/granite/security/truststore.json
		  // - defaultResponse: Nil
		  //
		  // - BASIC:
		  //   - type: http
		  //   - name: aemAuth
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  
		  
		  AddHandler localVarHTTPSocket.AuthenticationRequired, addressof Me.AuthenticationRequired


		  Dim localVarPath As String = "/libs/granite/security/truststore.json"
		  
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.GetTruststoreInfo_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.GetTruststoreInfo_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function GetTruststoreInfoPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.TruststoreInfo) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.TruststoreInfo
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
		Private Sub GetTruststoreInfo_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.TruststoreInfo
		  CallbackHandler.GetTruststoreInfoCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub GetTruststoreInfo_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.TruststoreInfo
		  Call GetTruststoreInfoPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.GetTruststoreInfoCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub PostAgent(, runmode As String, name As String, Optional jcrContentCqDistribute As Xoson.O.OptionalBoolean, Optional jcrContentCqDistributeTypeHint As Xoson.O.OptionalString, Optional jcrContentCqName As Xoson.O.OptionalString, Optional jcrContentCqTemplate As Xoson.O.OptionalString, Optional jcrContentAliasUpdate As Xoson.O.OptionalBoolean, Optional jcrContentEnabled As Xoson.O.OptionalBoolean, Optional jcrContentJcrDescription As Xoson.O.OptionalString, Optional jcrContentJcrLastModified As Xoson.O.OptionalString, Optional jcrContentJcrLastModifiedBy As Xoson.O.OptionalString, Optional jcrContentJcrMixinTypes As Xoson.O.OptionalString, Optional jcrContentJcrTitle As Xoson.O.OptionalString, Optional jcrContentLogLevel As Xoson.O.OptionalString, Optional jcrContentNoStatusUpdate As Xoson.O.OptionalBoolean, Optional jcrContentNoVersioning As Xoson.O.OptionalBoolean, Optional jcrContentProtocolConnectTimeout As Xoson.O.OptionalDouble, Optional jcrContentProtocolHTTPConnectionClosed As Xoson.O.OptionalBoolean, Optional jcrContentProtocolHTTPExpired As Xoson.O.OptionalString, jcrContentProtocolHTTPHeaders() As String, Optional jcrContentProtocolHTTPHeadersTypeHint As Xoson.O.OptionalString, Optional jcrContentProtocolHTTPMethod As Xoson.O.OptionalString, Optional jcrContentProtocolHTTPSRelaxed As Xoson.O.OptionalBoolean, Optional jcrContentProtocolInterface As Xoson.O.OptionalString, Optional jcrContentProtocolSocketTimeout As Xoson.O.OptionalDouble, Optional jcrContentProtocolVersion As Xoson.O.OptionalString, Optional jcrContentProxyNTLMDomain As Xoson.O.OptionalString, Optional jcrContentProxyNTLMHost As Xoson.O.OptionalString, Optional jcrContentProxyHost As Xoson.O.OptionalString, Optional jcrContentProxyPassword As Xoson.O.OptionalString, Optional jcrContentProxyPort As Xoson.O.OptionalDouble, Optional jcrContentProxyUser As Xoson.O.OptionalString, Optional jcrContentQueueBatchMaxSize As Xoson.O.OptionalDouble, Optional jcrContentQueueBatchMode As Xoson.O.OptionalString, Optional jcrContentQueueBatchWaitTime As Xoson.O.OptionalDouble, Optional jcrContentRetryDelay As Xoson.O.OptionalString, Optional jcrContentReverseReplication As Xoson.O.OptionalBoolean, Optional jcrContentSerializationType As Xoson.O.OptionalString, Optional jcrContentSlingResourceType As Xoson.O.OptionalString, Optional jcrContentSsl As Xoson.O.OptionalString, Optional jcrContentTransportNTLMDomain As Xoson.O.OptionalString, Optional jcrContentTransportNTLMHost As Xoson.O.OptionalString, Optional jcrContentTransportPassword As Xoson.O.OptionalString, Optional jcrContentTransportUri As Xoson.O.OptionalString, Optional jcrContentTransportUser As Xoson.O.OptionalString, Optional jcrContentTriggerDistribute As Xoson.O.OptionalBoolean, Optional jcrContentTriggerModified As Xoson.O.OptionalBoolean, Optional jcrContentTriggerOnOffTime As Xoson.O.OptionalBoolean, Optional jcrContentTriggerReceive As Xoson.O.OptionalBoolean, Optional jcrContentTriggerSpecific As Xoson.O.OptionalBoolean, Optional jcrContentUserId As Xoson.O.OptionalString, Optional jcrPrimaryType As Xoson.O.OptionalString, Optional operation As Xoson.O.OptionalString)
		  // Operation postAgent
		  // - parameter runmode: (path)  
		  // - parameter name: (path)  
		  // - parameter jcrContentCqDistribute: (query)  (optional, default to False)
		  // - parameter jcrContentCqDistributeTypeHint: (query)  (optional, default to Sample)
		  // - parameter jcrContentCqName: (query)  (optional, default to Sample)
		  // - parameter jcrContentCqTemplate: (query)  (optional, default to Sample)
		  // - parameter jcrContentAliasUpdate: (query)  (optional, default to False)
		  // - parameter jcrContentEnabled: (query)  (optional, default to False)
		  // - parameter jcrContentJcrDescription: (query)  (optional, default to Sample)
		  // - parameter jcrContentJcrLastModified: (query)  (optional, default to Sample)
		  // - parameter jcrContentJcrLastModifiedBy: (query)  (optional, default to Sample)
		  // - parameter jcrContentJcrMixinTypes: (query)  (optional, default to Sample)
		  // - parameter jcrContentJcrTitle: (query)  (optional, default to Sample)
		  // - parameter jcrContentLogLevel: (query)  (optional, default to Sample)
		  // - parameter jcrContentNoStatusUpdate: (query)  (optional, default to False)
		  // - parameter jcrContentNoVersioning: (query)  (optional, default to False)
		  // - parameter jcrContentProtocolConnectTimeout: (query)  (optional, default to 0)
		  // - parameter jcrContentProtocolHTTPConnectionClosed: (query)  (optional, default to False)
		  // - parameter jcrContentProtocolHTTPExpired: (query)  (optional, default to Sample)
		  // - parameter jcrContentProtocolHTTPHeaders: (query)  (optional, default to Nil)
		  // - parameter jcrContentProtocolHTTPHeadersTypeHint: (query)  (optional, default to Sample)
		  // - parameter jcrContentProtocolHTTPMethod: (query)  (optional, default to Sample)
		  // - parameter jcrContentProtocolHTTPSRelaxed: (query)  (optional, default to False)
		  // - parameter jcrContentProtocolInterface: (query)  (optional, default to Sample)
		  // - parameter jcrContentProtocolSocketTimeout: (query)  (optional, default to 0)
		  // - parameter jcrContentProtocolVersion: (query)  (optional, default to Sample)
		  // - parameter jcrContentProxyNTLMDomain: (query)  (optional, default to Sample)
		  // - parameter jcrContentProxyNTLMHost: (query)  (optional, default to Sample)
		  // - parameter jcrContentProxyHost: (query)  (optional, default to Sample)
		  // - parameter jcrContentProxyPassword: (query)  (optional, default to Sample)
		  // - parameter jcrContentProxyPort: (query)  (optional, default to 0)
		  // - parameter jcrContentProxyUser: (query)  (optional, default to Sample)
		  // - parameter jcrContentQueueBatchMaxSize: (query)  (optional, default to 0)
		  // - parameter jcrContentQueueBatchMode: (query)  (optional, default to Sample)
		  // - parameter jcrContentQueueBatchWaitTime: (query)  (optional, default to 0)
		  // - parameter jcrContentRetryDelay: (query)  (optional, default to Sample)
		  // - parameter jcrContentReverseReplication: (query)  (optional, default to False)
		  // - parameter jcrContentSerializationType: (query)  (optional, default to Sample)
		  // - parameter jcrContentSlingResourceType: (query)  (optional, default to Sample)
		  // - parameter jcrContentSsl: (query)  (optional, default to Sample)
		  // - parameter jcrContentTransportNTLMDomain: (query)  (optional, default to Sample)
		  // - parameter jcrContentTransportNTLMHost: (query)  (optional, default to Sample)
		  // - parameter jcrContentTransportPassword: (query)  (optional, default to Sample)
		  // - parameter jcrContentTransportUri: (query)  (optional, default to Sample)
		  // - parameter jcrContentTransportUser: (query)  (optional, default to Sample)
		  // - parameter jcrContentTriggerDistribute: (query)  (optional, default to False)
		  // - parameter jcrContentTriggerModified: (query)  (optional, default to False)
		  // - parameter jcrContentTriggerOnOffTime: (query)  (optional, default to False)
		  // - parameter jcrContentTriggerReceive: (query)  (optional, default to False)
		  // - parameter jcrContentTriggerSpecific: (query)  (optional, default to False)
		  // - parameter jcrContentUserId: (query)  (optional, default to Sample)
		  // - parameter jcrPrimaryType: (query)  (optional, default to Sample)
		  // - parameter operation: (query)  (optional, default to Sample)
		  //
		  // Invokes SlingApiCallbackHandler.PostAgentCallback() on completion. 
		  //
		  // - POST /etc/replication/agents.{runmode}/{name}
		  //
		  // - BASIC:
		  //   - type: http
		  //   - name: aemAuth
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  Dim localVarQueryParams As String = "?"
		  If jcrContentCqDistribute <> nil Then localVarQueryParams = localVarQueryParams + EncodeURLComponent("jcr:content/cq:distribute") + "=" + EncodeURLComponent(jcrContentCqDistribute.ToString)
		  
		  If jcrContentCqDistributeTypeHint <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("jcr:content/cq:distribute@TypeHint") + "=" + EncodeURLComponent(jcrContentCqDistributeTypeHint)
		  
		  If jcrContentCqName <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("jcr:content/cq:name") + "=" + EncodeURLComponent(jcrContentCqName)
		  
		  If jcrContentCqTemplate <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("jcr:content/cq:template") + "=" + EncodeURLComponent(jcrContentCqTemplate)
		  
		  If jcrContentAliasUpdate <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("jcr:content/aliasUpdate") + "=" + EncodeURLComponent(jcrContentAliasUpdate.ToString)
		  
		  If jcrContentEnabled <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("jcr:content/enabled") + "=" + EncodeURLComponent(jcrContentEnabled.ToString)
		  
		  If jcrContentJcrDescription <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("jcr:content/jcr:description") + "=" + EncodeURLComponent(jcrContentJcrDescription)
		  
		  If jcrContentJcrLastModified <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("jcr:content/jcr:lastModified") + "=" + EncodeURLComponent(jcrContentJcrLastModified)
		  
		  If jcrContentJcrLastModifiedBy <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("jcr:content/jcr:lastModifiedBy") + "=" + EncodeURLComponent(jcrContentJcrLastModifiedBy)
		  
		  If jcrContentJcrMixinTypes <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("jcr:content/jcr:mixinTypes") + "=" + EncodeURLComponent(jcrContentJcrMixinTypes)
		  
		  If jcrContentJcrTitle <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("jcr:content/jcr:title") + "=" + EncodeURLComponent(jcrContentJcrTitle)
		  
		  If jcrContentLogLevel <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("jcr:content/logLevel") + "=" + EncodeURLComponent(jcrContentLogLevel)
		  
		  If jcrContentNoStatusUpdate <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("jcr:content/noStatusUpdate") + "=" + EncodeURLComponent(jcrContentNoStatusUpdate.ToString)
		  
		  If jcrContentNoVersioning <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("jcr:content/noVersioning") + "=" + EncodeURLComponent(jcrContentNoVersioning.ToString)
		  
		  If jcrContentProtocolConnectTimeout <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("jcr:content/protocolConnectTimeout") + "=" + EncodeURLComponent(jcrContentProtocolConnectTimeout.ToString)
		  
		  If jcrContentProtocolHTTPConnectionClosed <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("jcr:content/protocolHTTPConnectionClosed") + "=" + EncodeURLComponent(jcrContentProtocolHTTPConnectionClosed.ToString)
		  
		  If jcrContentProtocolHTTPExpired <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("jcr:content/protocolHTTPExpired") + "=" + EncodeURLComponent(jcrContentProtocolHTTPExpired)
		  
		  
		  Dim localVarQueryStringsjcrContentProtocolHTTPHeaders() As String
		  For Each localVarItemjcrContentProtocolHTTPHeaders As String in jcrContentProtocolHTTPHeaders
		    Dim encodedParameter As String = EncodeURLComponent(localVarItemjcrContentProtocolHTTPHeaders)
		    Select Case "form"
		      Case "form"
		        localVarQueryStringsjcrContentProtocolHTTPHeaders.Append("inner=" + encodedParameter)
		      Case "spaceDelimited"
		        localVarQueryStringsjcrContentProtocolHTTPHeaders.Append("inner=" + encodedParameter)
		      Case "pipeDelimited"
		        localVarQueryStringsjcrContentProtocolHTTPHeaders.Append("inner=" + encodedParameter)
		      Case "deepObject"
		        Raise New OpenAPIClient.OpenAPIClientException(kErrorUnsupportedFeature, "deepObject query parameters are not supported")
		    End Select
		  Next
		  
		  Dim localVarQueryStringjcrContentProtocolHTTPHeaders As String
		  localVarQueryStringjcrContentProtocolHTTPHeaders = Join(localVarQueryStringsjcrContentProtocolHTTPHeaders, "&")
		  If jcrContentProtocolHTTPHeadersTypeHint <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("jcr:content/protocolHTTPHeaders@TypeHint") + "=" + EncodeURLComponent(jcrContentProtocolHTTPHeadersTypeHint)
		  
		  If jcrContentProtocolHTTPMethod <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("jcr:content/protocolHTTPMethod") + "=" + EncodeURLComponent(jcrContentProtocolHTTPMethod)
		  
		  If jcrContentProtocolHTTPSRelaxed <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("jcr:content/protocolHTTPSRelaxed") + "=" + EncodeURLComponent(jcrContentProtocolHTTPSRelaxed.ToString)
		  
		  If jcrContentProtocolInterface <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("jcr:content/protocolInterface") + "=" + EncodeURLComponent(jcrContentProtocolInterface)
		  
		  If jcrContentProtocolSocketTimeout <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("jcr:content/protocolSocketTimeout") + "=" + EncodeURLComponent(jcrContentProtocolSocketTimeout.ToString)
		  
		  If jcrContentProtocolVersion <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("jcr:content/protocolVersion") + "=" + EncodeURLComponent(jcrContentProtocolVersion)
		  
		  If jcrContentProxyNTLMDomain <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("jcr:content/proxyNTLMDomain") + "=" + EncodeURLComponent(jcrContentProxyNTLMDomain)
		  
		  If jcrContentProxyNTLMHost <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("jcr:content/proxyNTLMHost") + "=" + EncodeURLComponent(jcrContentProxyNTLMHost)
		  
		  If jcrContentProxyHost <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("jcr:content/proxyHost") + "=" + EncodeURLComponent(jcrContentProxyHost)
		  
		  If jcrContentProxyPassword <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("jcr:content/proxyPassword") + "=" + EncodeURLComponent(jcrContentProxyPassword)
		  
		  If jcrContentProxyPort <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("jcr:content/proxyPort") + "=" + EncodeURLComponent(jcrContentProxyPort.ToString)
		  
		  If jcrContentProxyUser <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("jcr:content/proxyUser") + "=" + EncodeURLComponent(jcrContentProxyUser)
		  
		  If jcrContentQueueBatchMaxSize <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("jcr:content/queueBatchMaxSize") + "=" + EncodeURLComponent(jcrContentQueueBatchMaxSize.ToString)
		  
		  If jcrContentQueueBatchMode <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("jcr:content/queueBatchMode") + "=" + EncodeURLComponent(jcrContentQueueBatchMode)
		  
		  If jcrContentQueueBatchWaitTime <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("jcr:content/queueBatchWaitTime") + "=" + EncodeURLComponent(jcrContentQueueBatchWaitTime.ToString)
		  
		  If jcrContentRetryDelay <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("jcr:content/retryDelay") + "=" + EncodeURLComponent(jcrContentRetryDelay)
		  
		  If jcrContentReverseReplication <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("jcr:content/reverseReplication") + "=" + EncodeURLComponent(jcrContentReverseReplication.ToString)
		  
		  If jcrContentSerializationType <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("jcr:content/serializationType") + "=" + EncodeURLComponent(jcrContentSerializationType)
		  
		  If jcrContentSlingResourceType <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("jcr:content/sling:resourceType") + "=" + EncodeURLComponent(jcrContentSlingResourceType)
		  
		  If jcrContentSsl <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("jcr:content/ssl") + "=" + EncodeURLComponent(jcrContentSsl)
		  
		  If jcrContentTransportNTLMDomain <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("jcr:content/transportNTLMDomain") + "=" + EncodeURLComponent(jcrContentTransportNTLMDomain)
		  
		  If jcrContentTransportNTLMHost <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("jcr:content/transportNTLMHost") + "=" + EncodeURLComponent(jcrContentTransportNTLMHost)
		  
		  If jcrContentTransportPassword <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("jcr:content/transportPassword") + "=" + EncodeURLComponent(jcrContentTransportPassword)
		  
		  If jcrContentTransportUri <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("jcr:content/transportUri") + "=" + EncodeURLComponent(jcrContentTransportUri)
		  
		  If jcrContentTransportUser <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("jcr:content/transportUser") + "=" + EncodeURLComponent(jcrContentTransportUser)
		  
		  If jcrContentTriggerDistribute <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("jcr:content/triggerDistribute") + "=" + EncodeURLComponent(jcrContentTriggerDistribute.ToString)
		  
		  If jcrContentTriggerModified <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("jcr:content/triggerModified") + "=" + EncodeURLComponent(jcrContentTriggerModified.ToString)
		  
		  If jcrContentTriggerOnOffTime <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("jcr:content/triggerOnOffTime") + "=" + EncodeURLComponent(jcrContentTriggerOnOffTime.ToString)
		  
		  If jcrContentTriggerReceive <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("jcr:content/triggerReceive") + "=" + EncodeURLComponent(jcrContentTriggerReceive.ToString)
		  
		  If jcrContentTriggerSpecific <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("jcr:content/triggerSpecific") + "=" + EncodeURLComponent(jcrContentTriggerSpecific.ToString)
		  
		  If jcrContentUserId <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("jcr:content/userId") + "=" + EncodeURLComponent(jcrContentUserId)
		  
		  If jcrPrimaryType <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("jcr:primaryType") + "=" + EncodeURLComponent(jcrPrimaryType)
		  
		  If operation <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent(":operation") + "=" + EncodeURLComponent(operation)
		  

		  
		  AddHandler localVarHTTPSocket.AuthenticationRequired, addressof Me.AuthenticationRequired


		  Dim localVarPath As String = "/etc/replication/agents.{runmode}/{name}"
		  
		  Dim localVarPathStringrunmode As String = runmode
		  
		  localVarPath = localVarPath.ReplaceAllB("{runmode}", localVarPathStringrunmode)
		  Dim localVarPathStringname As String = name
		  
		  localVarPath = localVarPath.ReplaceAllB("{name}", localVarPathStringname)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof Me.PostAgent_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.PostAgent_error
		  
		  localVarHTTPSocket.SendRequest("POST", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod


	#tag Method, Flags = &h21
		Private Sub PostAgent_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  CallbackHandler.PostAgentCallback(error)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub PostAgent_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  #Pragma Unused Headers
		  #Pragma Unused Content

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", "")
		  
		  
		  
		  CallbackHandler.PostAgentCallback(error)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub PostAuthorizableKeystore(, intermediatePath As String, authorizableId As String, Optional operation As Xoson.O.OptionalString, Optional currentPassword As Xoson.O.OptionalString, Optional newPassword As Xoson.O.OptionalString, Optional rePassword As Xoson.O.OptionalString, Optional keyPassword As Xoson.O.OptionalString, Optional keyStorePass As Xoson.O.OptionalString, Optional alias As Xoson.O.OptionalString, Optional newAlias As Xoson.O.OptionalString, Optional removeAlias As Xoson.O.OptionalString, Optional certChain As FolderItem, Optional pk As FolderItem, Optional keyStore As FolderItem)
		  // Operation postAuthorizableKeystore
		  // - 
		  // - parameter intermediatePath: (path)  
		  // - parameter authorizableId: (path)  
		  // - parameter operation: (query)  (optional, default to Sample)
		  // - parameter currentPassword: (query)  (optional, default to Sample)
		  // - parameter newPassword: (query)  (optional, default to Sample)
		  // - parameter rePassword: (query)  (optional, default to Sample)
		  // - parameter keyPassword: (query)  (optional, default to Sample)
		  // - parameter keyStorePass: (query)  (optional, default to Sample)
		  // - parameter alias: (query)  (optional, default to Sample)
		  // - parameter newAlias: (query)  (optional, default to Sample)
		  // - parameter removeAlias: (query)  (optional, default to Sample)
		  // - parameter certChain: (form)  (optional, default to Sample)
		  // - parameter pk: (form)  (optional, default to Sample)
		  // - parameter keyStore: (form)  (optional, default to Sample)
		  //
		  // Invokes SlingApiCallbackHandler.PostAuthorizableKeystoreCallback(KeystoreInfo) on completion. 
		  //
		  // - POST /{intermediatePath}/{authorizableId}.ks.html
		  // - defaultResponse: Nil
		  //
		  // - BASIC:
		  //   - type: http
		  //   - name: aemAuth
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  Dim localVarFormParams As New Dictionary
		  If certChain <> nil Then localVarFormParams.Value("cert-chain") = certChain.LocalFuncSerializeFile
If pk <> nil Then localVarFormParams.Value("pk") = pk.LocalFuncSerializeFile
If keyStore <> nil Then localVarFormParams.Value("keyStore") = keyStore.LocalFuncSerializeFile
		  If localVarFormParams.Count > 0 Then localVarHTTPSocket.SetFormData(localVarFormParams)
		  
		  Dim localVarQueryParams As String = "?"
		  If operation <> nil Then localVarQueryParams = localVarQueryParams + EncodeURLComponent(":operation") + "=" + EncodeURLComponent(operation)
		  
		  If currentPassword <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("currentPassword") + "=" + EncodeURLComponent(currentPassword)
		  
		  If newPassword <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("newPassword") + "=" + EncodeURLComponent(newPassword)
		  
		  If rePassword <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("rePassword") + "=" + EncodeURLComponent(rePassword)
		  
		  If keyPassword <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("keyPassword") + "=" + EncodeURLComponent(keyPassword)
		  
		  If keyStorePass <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("keyStorePass") + "=" + EncodeURLComponent(keyStorePass)
		  
		  If alias <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("alias") + "=" + EncodeURLComponent(alias)
		  
		  If newAlias <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("newAlias") + "=" + EncodeURLComponent(newAlias)
		  
		  If removeAlias <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("removeAlias") + "=" + EncodeURLComponent(removeAlias)
		  

		  
		  AddHandler localVarHTTPSocket.AuthenticationRequired, addressof Me.AuthenticationRequired


		  Dim localVarPath As String = "/{intermediatePath}/{authorizableId}.ks.html"
		  
		  Dim localVarPathStringintermediatePath As String = intermediatePath
		  
		  localVarPath = localVarPath.ReplaceAllB("{intermediatePath}", localVarPathStringintermediatePath)
		  Dim localVarPathStringauthorizableId As String = authorizableId
		  
		  localVarPath = localVarPath.ReplaceAllB("{authorizableId}", localVarPathStringauthorizableId)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.PostAuthorizableKeystore_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.PostAuthorizableKeystore_error
		  
		  
		  localVarHTTPSocket.SendRequest("POST", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function PostAuthorizableKeystorePrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.KeystoreInfo) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.KeystoreInfo
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
		Private Sub PostAuthorizableKeystore_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.KeystoreInfo
		  CallbackHandler.PostAuthorizableKeystoreCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub PostAuthorizableKeystore_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.KeystoreInfo
		  Call PostAuthorizableKeystorePrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.PostAuthorizableKeystoreCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub PostAuthorizables(, authorizableId As String, intermediatePath As String, Optional createUser As Xoson.O.OptionalString, Optional createGroup As Xoson.O.OptionalString, Optional repPassword As Xoson.O.OptionalString, Optional profileGivenName As Xoson.O.OptionalString)
		  // Operation postAuthorizables
		  // - 
		  // - parameter authorizableId: (query)  
		  // - parameter intermediatePath: (query)  
		  // - parameter createUser: (query)  (optional, default to Sample)
		  // - parameter createGroup: (query)  (optional, default to Sample)
		  // - parameter repPassword: (query)  (optional, default to Sample)
		  // - parameter profileGivenName: (query)  (optional, default to Sample)
		  //
		  // Invokes SlingApiCallbackHandler.PostAuthorizablesCallback(String) on completion. 
		  //
		  // - POST /libs/granite/security/post/authorizables
		  // - defaultResponse: Sample
		  //
		  // - BASIC:
		  //   - type: http
		  //   - name: aemAuth
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  Dim localVarQueryParams As String = "?"
		  localVarQueryParams = localVarQueryParams + EncodeURLComponent("authorizableId") + "=" + EncodeURLComponent(authorizableId)
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("intermediatePath") + "=" + EncodeURLComponent(intermediatePath)
		  
		  If createUser <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("createUser") + "=" + EncodeURLComponent(createUser)
		  
		  If createGroup <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("createGroup") + "=" + EncodeURLComponent(createGroup)
		  
		  If repPassword <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("rep:password") + "=" + EncodeURLComponent(repPassword)
		  
		  If profileGivenName <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("profile/givenName") + "=" + EncodeURLComponent(profileGivenName)
		  

		  
		  AddHandler localVarHTTPSocket.AuthenticationRequired, addressof Me.AuthenticationRequired


		  Dim localVarPath As String = "/libs/granite/security/post/authorizables"
		  
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.PostAuthorizables_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.PostAuthorizables_error
		  
		  
		  localVarHTTPSocket.SendRequest("POST", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function PostAuthorizablesPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As String) As Boolean
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
		Private Sub PostAuthorizables_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As String
		  CallbackHandler.PostAuthorizablesCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub PostAuthorizables_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As String
		  Call PostAuthorizablesPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.PostAuthorizablesCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub PostConfigAdobeGraniteSamlAuthenticationHandler(, Optional keyStorePassword As Xoson.O.OptionalString, Optional keyStorePasswordTypeHint As Xoson.O.OptionalString, Optional serviceRanking As Xoson.O.OptionalInteger, Optional serviceRankingTypeHint As Xoson.O.OptionalString, Optional idpHttpRedirect As Xoson.O.OptionalBoolean, Optional idpHttpRedirectTypeHint As Xoson.O.OptionalString, Optional createUser As Xoson.O.OptionalBoolean, Optional createUserTypeHint As Xoson.O.OptionalString, Optional defaultRedirectUrl As Xoson.O.OptionalString, Optional defaultRedirectUrlTypeHint As Xoson.O.OptionalString, Optional userIDAttribute As Xoson.O.OptionalString, Optional userIDAttributeTypeHint As Xoson.O.OptionalString, defaultGroups() As String, Optional defaultGroupsTypeHint As Xoson.O.OptionalString, Optional idpCertAlias As Xoson.O.OptionalString, Optional idpCertAliasTypeHint As Xoson.O.OptionalString, Optional addGroupMemberships As Xoson.O.OptionalBoolean, Optional addGroupMembershipsTypeHint As Xoson.O.OptionalString, path() As String, Optional pathTypeHint As Xoson.O.OptionalString, synchronizeAttributes() As String, Optional synchronizeAttributesTypeHint As Xoson.O.OptionalString, Optional clockTolerance As Xoson.O.OptionalInteger, Optional clockToleranceTypeHint As Xoson.O.OptionalString, Optional groupMembershipAttribute As Xoson.O.OptionalString, Optional groupMembershipAttributeTypeHint As Xoson.O.OptionalString, Optional idpUrl As Xoson.O.OptionalString, Optional idpUrlTypeHint As Xoson.O.OptionalString, Optional logoutUrl As Xoson.O.OptionalString, Optional logoutUrlTypeHint As Xoson.O.OptionalString, Optional serviceProviderEntityId As Xoson.O.OptionalString, Optional serviceProviderEntityIdTypeHint As Xoson.O.OptionalString, Optional assertionConsumerServiceURL As Xoson.O.OptionalString, Optional assertionConsumerServiceURLTypeHint As Xoson.O.OptionalString, Optional handleLogout As Xoson.O.OptionalBoolean, Optional handleLogoutTypeHint As Xoson.O.OptionalString, Optional spPrivateKeyAlias As Xoson.O.OptionalString, Optional spPrivateKeyAliasTypeHint As Xoson.O.OptionalString, Optional useEncryption As Xoson.O.OptionalBoolean, Optional useEncryptionTypeHint As Xoson.O.OptionalString, Optional nameIdFormat As Xoson.O.OptionalString, Optional nameIdFormatTypeHint As Xoson.O.OptionalString, Optional digestMethod As Xoson.O.OptionalString, Optional digestMethodTypeHint As Xoson.O.OptionalString, Optional signatureMethod As Xoson.O.OptionalString, Optional signatureMethodTypeHint As Xoson.O.OptionalString, Optional userIntermediatePath As Xoson.O.OptionalString, Optional userIntermediatePathTypeHint As Xoson.O.OptionalString)
		  // Operation postConfigAdobeGraniteSamlAuthenticationHandler
		  // - parameter keyStorePassword: (query)  (optional, default to Sample)
		  // - parameter keyStorePasswordTypeHint: (query)  (optional, default to Sample)
		  // - parameter serviceRanking: (query)  (optional, default to 0)
		  // - parameter serviceRankingTypeHint: (query)  (optional, default to Sample)
		  // - parameter idpHttpRedirect: (query)  (optional, default to False)
		  // - parameter idpHttpRedirectTypeHint: (query)  (optional, default to Sample)
		  // - parameter createUser: (query)  (optional, default to False)
		  // - parameter createUserTypeHint: (query)  (optional, default to Sample)
		  // - parameter defaultRedirectUrl: (query)  (optional, default to Sample)
		  // - parameter defaultRedirectUrlTypeHint: (query)  (optional, default to Sample)
		  // - parameter userIDAttribute: (query)  (optional, default to Sample)
		  // - parameter userIDAttributeTypeHint: (query)  (optional, default to Sample)
		  // - parameter defaultGroups: (query)  (optional, default to Nil)
		  // - parameter defaultGroupsTypeHint: (query)  (optional, default to Sample)
		  // - parameter idpCertAlias: (query)  (optional, default to Sample)
		  // - parameter idpCertAliasTypeHint: (query)  (optional, default to Sample)
		  // - parameter addGroupMemberships: (query)  (optional, default to False)
		  // - parameter addGroupMembershipsTypeHint: (query)  (optional, default to Sample)
		  // - parameter path: (query)  (optional, default to Nil)
		  // - parameter pathTypeHint: (query)  (optional, default to Sample)
		  // - parameter synchronizeAttributes: (query)  (optional, default to Nil)
		  // - parameter synchronizeAttributesTypeHint: (query)  (optional, default to Sample)
		  // - parameter clockTolerance: (query)  (optional, default to 0)
		  // - parameter clockToleranceTypeHint: (query)  (optional, default to Sample)
		  // - parameter groupMembershipAttribute: (query)  (optional, default to Sample)
		  // - parameter groupMembershipAttributeTypeHint: (query)  (optional, default to Sample)
		  // - parameter idpUrl: (query)  (optional, default to Sample)
		  // - parameter idpUrlTypeHint: (query)  (optional, default to Sample)
		  // - parameter logoutUrl: (query)  (optional, default to Sample)
		  // - parameter logoutUrlTypeHint: (query)  (optional, default to Sample)
		  // - parameter serviceProviderEntityId: (query)  (optional, default to Sample)
		  // - parameter serviceProviderEntityIdTypeHint: (query)  (optional, default to Sample)
		  // - parameter assertionConsumerServiceURL: (query)  (optional, default to Sample)
		  // - parameter assertionConsumerServiceURLTypeHint: (query)  (optional, default to Sample)
		  // - parameter handleLogout: (query)  (optional, default to False)
		  // - parameter handleLogoutTypeHint: (query)  (optional, default to Sample)
		  // - parameter spPrivateKeyAlias: (query)  (optional, default to Sample)
		  // - parameter spPrivateKeyAliasTypeHint: (query)  (optional, default to Sample)
		  // - parameter useEncryption: (query)  (optional, default to False)
		  // - parameter useEncryptionTypeHint: (query)  (optional, default to Sample)
		  // - parameter nameIdFormat: (query)  (optional, default to Sample)
		  // - parameter nameIdFormatTypeHint: (query)  (optional, default to Sample)
		  // - parameter digestMethod: (query)  (optional, default to Sample)
		  // - parameter digestMethodTypeHint: (query)  (optional, default to Sample)
		  // - parameter signatureMethod: (query)  (optional, default to Sample)
		  // - parameter signatureMethodTypeHint: (query)  (optional, default to Sample)
		  // - parameter userIntermediatePath: (query)  (optional, default to Sample)
		  // - parameter userIntermediatePathTypeHint: (query)  (optional, default to Sample)
		  //
		  // Invokes SlingApiCallbackHandler.PostConfigAdobeGraniteSamlAuthenticationHandlerCallback() on completion. 
		  //
		  // - POST /apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config
		  //
		  // - BASIC:
		  //   - type: http
		  //   - name: aemAuth
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  Dim localVarQueryParams As String = "?"
		  If keyStorePassword <> nil Then localVarQueryParams = localVarQueryParams + EncodeURLComponent("keyStorePassword") + "=" + EncodeURLComponent(keyStorePassword)
		  
		  If keyStorePasswordTypeHint <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("keyStorePassword@TypeHint") + "=" + EncodeURLComponent(keyStorePasswordTypeHint)
		  
		  If serviceRanking <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("service.ranking") + "=" + EncodeURLComponent(serviceRanking.ToString)
		  
		  If serviceRankingTypeHint <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("service.ranking@TypeHint") + "=" + EncodeURLComponent(serviceRankingTypeHint)
		  
		  If idpHttpRedirect <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("idpHttpRedirect") + "=" + EncodeURLComponent(idpHttpRedirect.ToString)
		  
		  If idpHttpRedirectTypeHint <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("idpHttpRedirect@TypeHint") + "=" + EncodeURLComponent(idpHttpRedirectTypeHint)
		  
		  If createUser <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("createUser") + "=" + EncodeURLComponent(createUser.ToString)
		  
		  If createUserTypeHint <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("createUser@TypeHint") + "=" + EncodeURLComponent(createUserTypeHint)
		  
		  If defaultRedirectUrl <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("defaultRedirectUrl") + "=" + EncodeURLComponent(defaultRedirectUrl)
		  
		  If defaultRedirectUrlTypeHint <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("defaultRedirectUrl@TypeHint") + "=" + EncodeURLComponent(defaultRedirectUrlTypeHint)
		  
		  If userIDAttribute <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("userIDAttribute") + "=" + EncodeURLComponent(userIDAttribute)
		  
		  If userIDAttributeTypeHint <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("userIDAttribute@TypeHint") + "=" + EncodeURLComponent(userIDAttributeTypeHint)
		  
		  
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
		  If defaultGroupsTypeHint <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("defaultGroups@TypeHint") + "=" + EncodeURLComponent(defaultGroupsTypeHint)
		  
		  If idpCertAlias <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("idpCertAlias") + "=" + EncodeURLComponent(idpCertAlias)
		  
		  If idpCertAliasTypeHint <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("idpCertAlias@TypeHint") + "=" + EncodeURLComponent(idpCertAliasTypeHint)
		  
		  If addGroupMemberships <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("addGroupMemberships") + "=" + EncodeURLComponent(addGroupMemberships.ToString)
		  
		  If addGroupMembershipsTypeHint <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("addGroupMemberships@TypeHint") + "=" + EncodeURLComponent(addGroupMembershipsTypeHint)
		  
		  
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
		  If pathTypeHint <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("path@TypeHint") + "=" + EncodeURLComponent(pathTypeHint)
		  
		  
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
		  If synchronizeAttributesTypeHint <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("synchronizeAttributes@TypeHint") + "=" + EncodeURLComponent(synchronizeAttributesTypeHint)
		  
		  If clockTolerance <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("clockTolerance") + "=" + EncodeURLComponent(clockTolerance.ToString)
		  
		  If clockToleranceTypeHint <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("clockTolerance@TypeHint") + "=" + EncodeURLComponent(clockToleranceTypeHint)
		  
		  If groupMembershipAttribute <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("groupMembershipAttribute") + "=" + EncodeURLComponent(groupMembershipAttribute)
		  
		  If groupMembershipAttributeTypeHint <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("groupMembershipAttribute@TypeHint") + "=" + EncodeURLComponent(groupMembershipAttributeTypeHint)
		  
		  If idpUrl <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("idpUrl") + "=" + EncodeURLComponent(idpUrl)
		  
		  If idpUrlTypeHint <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("idpUrl@TypeHint") + "=" + EncodeURLComponent(idpUrlTypeHint)
		  
		  If logoutUrl <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("logoutUrl") + "=" + EncodeURLComponent(logoutUrl)
		  
		  If logoutUrlTypeHint <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("logoutUrl@TypeHint") + "=" + EncodeURLComponent(logoutUrlTypeHint)
		  
		  If serviceProviderEntityId <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("serviceProviderEntityId") + "=" + EncodeURLComponent(serviceProviderEntityId)
		  
		  If serviceProviderEntityIdTypeHint <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("serviceProviderEntityId@TypeHint") + "=" + EncodeURLComponent(serviceProviderEntityIdTypeHint)
		  
		  If assertionConsumerServiceURL <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("assertionConsumerServiceURL") + "=" + EncodeURLComponent(assertionConsumerServiceURL)
		  
		  If assertionConsumerServiceURLTypeHint <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("assertionConsumerServiceURL@TypeHint") + "=" + EncodeURLComponent(assertionConsumerServiceURLTypeHint)
		  
		  If handleLogout <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("handleLogout") + "=" + EncodeURLComponent(handleLogout.ToString)
		  
		  If handleLogoutTypeHint <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("handleLogout@TypeHint") + "=" + EncodeURLComponent(handleLogoutTypeHint)
		  
		  If spPrivateKeyAlias <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("spPrivateKeyAlias") + "=" + EncodeURLComponent(spPrivateKeyAlias)
		  
		  If spPrivateKeyAliasTypeHint <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("spPrivateKeyAlias@TypeHint") + "=" + EncodeURLComponent(spPrivateKeyAliasTypeHint)
		  
		  If useEncryption <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("useEncryption") + "=" + EncodeURLComponent(useEncryption.ToString)
		  
		  If useEncryptionTypeHint <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("useEncryption@TypeHint") + "=" + EncodeURLComponent(useEncryptionTypeHint)
		  
		  If nameIdFormat <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("nameIdFormat") + "=" + EncodeURLComponent(nameIdFormat)
		  
		  If nameIdFormatTypeHint <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("nameIdFormat@TypeHint") + "=" + EncodeURLComponent(nameIdFormatTypeHint)
		  
		  If digestMethod <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("digestMethod") + "=" + EncodeURLComponent(digestMethod)
		  
		  If digestMethodTypeHint <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("digestMethod@TypeHint") + "=" + EncodeURLComponent(digestMethodTypeHint)
		  
		  If signatureMethod <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("signatureMethod") + "=" + EncodeURLComponent(signatureMethod)
		  
		  If signatureMethodTypeHint <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("signatureMethod@TypeHint") + "=" + EncodeURLComponent(signatureMethodTypeHint)
		  
		  If userIntermediatePath <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("userIntermediatePath") + "=" + EncodeURLComponent(userIntermediatePath)
		  
		  If userIntermediatePathTypeHint <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("userIntermediatePath@TypeHint") + "=" + EncodeURLComponent(userIntermediatePathTypeHint)
		  

		  
		  AddHandler localVarHTTPSocket.AuthenticationRequired, addressof Me.AuthenticationRequired


		  Dim localVarPath As String = "/apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config"
		  
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof Me.PostConfigAdobeGraniteSamlAuthenticationHandler_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.PostConfigAdobeGraniteSamlAuthenticationHandler_error
		  
		  localVarHTTPSocket.SendRequest("POST", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod


	#tag Method, Flags = &h21
		Private Sub PostConfigAdobeGraniteSamlAuthenticationHandler_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  CallbackHandler.PostConfigAdobeGraniteSamlAuthenticationHandlerCallback(error)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub PostConfigAdobeGraniteSamlAuthenticationHandler_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  #Pragma Unused Headers
		  #Pragma Unused Content

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", "")
		  
		  
		  
		  CallbackHandler.PostConfigAdobeGraniteSamlAuthenticationHandlerCallback(error)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub PostConfigApacheFelixJettyBasedHttpService(, Optional orgApacheFelixHttpsNio As Xoson.O.OptionalBoolean, Optional orgApacheFelixHttpsNioTypeHint As Xoson.O.OptionalString, Optional orgApacheFelixHttpsKeystore As Xoson.O.OptionalString, Optional orgApacheFelixHttpsKeystoreTypeHint As Xoson.O.OptionalString, Optional orgApacheFelixHttpsKeystorePassword As Xoson.O.OptionalString, Optional orgApacheFelixHttpsKeystorePasswordTypeHint As Xoson.O.OptionalString, Optional orgApacheFelixHttpsKeystoreKey As Xoson.O.OptionalString, Optional orgApacheFelixHttpsKeystoreKeyTypeHint As Xoson.O.OptionalString, Optional orgApacheFelixHttpsKeystoreKeyPassword As Xoson.O.OptionalString, Optional orgApacheFelixHttpsKeystoreKeyPasswordTypeHint As Xoson.O.OptionalString, Optional orgApacheFelixHttpsTruststore As Xoson.O.OptionalString, Optional orgApacheFelixHttpsTruststoreTypeHint As Xoson.O.OptionalString, Optional orgApacheFelixHttpsTruststorePassword As Xoson.O.OptionalString, Optional orgApacheFelixHttpsTruststorePasswordTypeHint As Xoson.O.OptionalString, Optional orgApacheFelixHttpsClientcertificate As Xoson.O.OptionalString, Optional orgApacheFelixHttpsClientcertificateTypeHint As Xoson.O.OptionalString, Optional orgApacheFelixHttpsEnable As Xoson.O.OptionalBoolean, Optional orgApacheFelixHttpsEnableTypeHint As Xoson.O.OptionalString, Optional orgOsgiServiceHttpPortSecure As Xoson.O.OptionalString, Optional orgOsgiServiceHttpPortSecureTypeHint As Xoson.O.OptionalString)
		  // Operation postConfigApacheFelixJettyBasedHttpService
		  // - parameter orgApacheFelixHttpsNio: (query)  (optional, default to False)
		  // - parameter orgApacheFelixHttpsNioTypeHint: (query)  (optional, default to Sample)
		  // - parameter orgApacheFelixHttpsKeystore: (query)  (optional, default to Sample)
		  // - parameter orgApacheFelixHttpsKeystoreTypeHint: (query)  (optional, default to Sample)
		  // - parameter orgApacheFelixHttpsKeystorePassword: (query)  (optional, default to Sample)
		  // - parameter orgApacheFelixHttpsKeystorePasswordTypeHint: (query)  (optional, default to Sample)
		  // - parameter orgApacheFelixHttpsKeystoreKey: (query)  (optional, default to Sample)
		  // - parameter orgApacheFelixHttpsKeystoreKeyTypeHint: (query)  (optional, default to Sample)
		  // - parameter orgApacheFelixHttpsKeystoreKeyPassword: (query)  (optional, default to Sample)
		  // - parameter orgApacheFelixHttpsKeystoreKeyPasswordTypeHint: (query)  (optional, default to Sample)
		  // - parameter orgApacheFelixHttpsTruststore: (query)  (optional, default to Sample)
		  // - parameter orgApacheFelixHttpsTruststoreTypeHint: (query)  (optional, default to Sample)
		  // - parameter orgApacheFelixHttpsTruststorePassword: (query)  (optional, default to Sample)
		  // - parameter orgApacheFelixHttpsTruststorePasswordTypeHint: (query)  (optional, default to Sample)
		  // - parameter orgApacheFelixHttpsClientcertificate: (query)  (optional, default to Sample)
		  // - parameter orgApacheFelixHttpsClientcertificateTypeHint: (query)  (optional, default to Sample)
		  // - parameter orgApacheFelixHttpsEnable: (query)  (optional, default to False)
		  // - parameter orgApacheFelixHttpsEnableTypeHint: (query)  (optional, default to Sample)
		  // - parameter orgOsgiServiceHttpPortSecure: (query)  (optional, default to Sample)
		  // - parameter orgOsgiServiceHttpPortSecureTypeHint: (query)  (optional, default to Sample)
		  //
		  // Invokes SlingApiCallbackHandler.PostConfigApacheFelixJettyBasedHttpServiceCallback() on completion. 
		  //
		  // - POST /apps/system/config/org.apache.felix.http
		  //
		  // - BASIC:
		  //   - type: http
		  //   - name: aemAuth
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  Dim localVarQueryParams As String = "?"
		  If orgApacheFelixHttpsNio <> nil Then localVarQueryParams = localVarQueryParams + EncodeURLComponent("org.apache.felix.https.nio") + "=" + EncodeURLComponent(orgApacheFelixHttpsNio.ToString)
		  
		  If orgApacheFelixHttpsNioTypeHint <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("org.apache.felix.https.nio@TypeHint") + "=" + EncodeURLComponent(orgApacheFelixHttpsNioTypeHint)
		  
		  If orgApacheFelixHttpsKeystore <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("org.apache.felix.https.keystore") + "=" + EncodeURLComponent(orgApacheFelixHttpsKeystore)
		  
		  If orgApacheFelixHttpsKeystoreTypeHint <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("org.apache.felix.https.keystore@TypeHint") + "=" + EncodeURLComponent(orgApacheFelixHttpsKeystoreTypeHint)
		  
		  If orgApacheFelixHttpsKeystorePassword <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("org.apache.felix.https.keystore.password") + "=" + EncodeURLComponent(orgApacheFelixHttpsKeystorePassword)
		  
		  If orgApacheFelixHttpsKeystorePasswordTypeHint <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("org.apache.felix.https.keystore.password@TypeHint") + "=" + EncodeURLComponent(orgApacheFelixHttpsKeystorePasswordTypeHint)
		  
		  If orgApacheFelixHttpsKeystoreKey <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("org.apache.felix.https.keystore.key") + "=" + EncodeURLComponent(orgApacheFelixHttpsKeystoreKey)
		  
		  If orgApacheFelixHttpsKeystoreKeyTypeHint <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("org.apache.felix.https.keystore.key@TypeHint") + "=" + EncodeURLComponent(orgApacheFelixHttpsKeystoreKeyTypeHint)
		  
		  If orgApacheFelixHttpsKeystoreKeyPassword <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("org.apache.felix.https.keystore.key.password") + "=" + EncodeURLComponent(orgApacheFelixHttpsKeystoreKeyPassword)
		  
		  If orgApacheFelixHttpsKeystoreKeyPasswordTypeHint <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("org.apache.felix.https.keystore.key.password@TypeHint") + "=" + EncodeURLComponent(orgApacheFelixHttpsKeystoreKeyPasswordTypeHint)
		  
		  If orgApacheFelixHttpsTruststore <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("org.apache.felix.https.truststore") + "=" + EncodeURLComponent(orgApacheFelixHttpsTruststore)
		  
		  If orgApacheFelixHttpsTruststoreTypeHint <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("org.apache.felix.https.truststore@TypeHint") + "=" + EncodeURLComponent(orgApacheFelixHttpsTruststoreTypeHint)
		  
		  If orgApacheFelixHttpsTruststorePassword <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("org.apache.felix.https.truststore.password") + "=" + EncodeURLComponent(orgApacheFelixHttpsTruststorePassword)
		  
		  If orgApacheFelixHttpsTruststorePasswordTypeHint <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("org.apache.felix.https.truststore.password@TypeHint") + "=" + EncodeURLComponent(orgApacheFelixHttpsTruststorePasswordTypeHint)
		  
		  If orgApacheFelixHttpsClientcertificate <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("org.apache.felix.https.clientcertificate") + "=" + EncodeURLComponent(orgApacheFelixHttpsClientcertificate)
		  
		  If orgApacheFelixHttpsClientcertificateTypeHint <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("org.apache.felix.https.clientcertificate@TypeHint") + "=" + EncodeURLComponent(orgApacheFelixHttpsClientcertificateTypeHint)
		  
		  If orgApacheFelixHttpsEnable <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("org.apache.felix.https.enable") + "=" + EncodeURLComponent(orgApacheFelixHttpsEnable.ToString)
		  
		  If orgApacheFelixHttpsEnableTypeHint <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("org.apache.felix.https.enable@TypeHint") + "=" + EncodeURLComponent(orgApacheFelixHttpsEnableTypeHint)
		  
		  If orgOsgiServiceHttpPortSecure <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("org.osgi.service.http.port.secure") + "=" + EncodeURLComponent(orgOsgiServiceHttpPortSecure)
		  
		  If orgOsgiServiceHttpPortSecureTypeHint <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("org.osgi.service.http.port.secure@TypeHint") + "=" + EncodeURLComponent(orgOsgiServiceHttpPortSecureTypeHint)
		  

		  
		  AddHandler localVarHTTPSocket.AuthenticationRequired, addressof Me.AuthenticationRequired


		  Dim localVarPath As String = "/apps/system/config/org.apache.felix.http"
		  
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof Me.PostConfigApacheFelixJettyBasedHttpService_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.PostConfigApacheFelixJettyBasedHttpService_error
		  
		  localVarHTTPSocket.SendRequest("POST", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod


	#tag Method, Flags = &h21
		Private Sub PostConfigApacheFelixJettyBasedHttpService_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  CallbackHandler.PostConfigApacheFelixJettyBasedHttpServiceCallback(error)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub PostConfigApacheFelixJettyBasedHttpService_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  #Pragma Unused Headers
		  #Pragma Unused Content

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", "")
		  
		  
		  
		  CallbackHandler.PostConfigApacheFelixJettyBasedHttpServiceCallback(error)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub PostConfigApacheHttpComponentsProxyConfiguration(, Optional proxyHost As Xoson.O.OptionalString, Optional proxyHostTypeHint As Xoson.O.OptionalString, Optional proxyPort As Xoson.O.OptionalInteger, Optional proxyPortTypeHint As Xoson.O.OptionalString, proxyExceptions() As String, Optional proxyExceptionsTypeHint As Xoson.O.OptionalString, Optional proxyEnabled As Xoson.O.OptionalBoolean, Optional proxyEnabledTypeHint As Xoson.O.OptionalString, Optional proxyUser As Xoson.O.OptionalString, Optional proxyUserTypeHint As Xoson.O.OptionalString, Optional proxyPassword As Xoson.O.OptionalString, Optional proxyPasswordTypeHint As Xoson.O.OptionalString)
		  // Operation postConfigApacheHttpComponentsProxyConfiguration
		  // - parameter proxyHost: (query)  (optional, default to Sample)
		  // - parameter proxyHostTypeHint: (query)  (optional, default to Sample)
		  // - parameter proxyPort: (query)  (optional, default to 0)
		  // - parameter proxyPortTypeHint: (query)  (optional, default to Sample)
		  // - parameter proxyExceptions: (query)  (optional, default to Nil)
		  // - parameter proxyExceptionsTypeHint: (query)  (optional, default to Sample)
		  // - parameter proxyEnabled: (query)  (optional, default to False)
		  // - parameter proxyEnabledTypeHint: (query)  (optional, default to Sample)
		  // - parameter proxyUser: (query)  (optional, default to Sample)
		  // - parameter proxyUserTypeHint: (query)  (optional, default to Sample)
		  // - parameter proxyPassword: (query)  (optional, default to Sample)
		  // - parameter proxyPasswordTypeHint: (query)  (optional, default to Sample)
		  //
		  // Invokes SlingApiCallbackHandler.PostConfigApacheHttpComponentsProxyConfigurationCallback() on completion. 
		  //
		  // - POST /apps/system/config/org.apache.http.proxyconfigurator.config
		  //
		  // - BASIC:
		  //   - type: http
		  //   - name: aemAuth
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  Dim localVarQueryParams As String = "?"
		  If proxyHost <> nil Then localVarQueryParams = localVarQueryParams + EncodeURLComponent("proxy.host") + "=" + EncodeURLComponent(proxyHost)
		  
		  If proxyHostTypeHint <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("proxy.host@TypeHint") + "=" + EncodeURLComponent(proxyHostTypeHint)
		  
		  If proxyPort <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("proxy.port") + "=" + EncodeURLComponent(proxyPort.ToString)
		  
		  If proxyPortTypeHint <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("proxy.port@TypeHint") + "=" + EncodeURLComponent(proxyPortTypeHint)
		  
		  
		  Dim localVarQueryStringsproxyExceptions() As String
		  For Each localVarItemproxyExceptions As String in proxyExceptions
		    Dim encodedParameter As String = EncodeURLComponent(localVarItemproxyExceptions)
		    Select Case "form"
		      Case "form"
		        localVarQueryStringsproxyExceptions.Append("inner=" + encodedParameter)
		      Case "spaceDelimited"
		        localVarQueryStringsproxyExceptions.Append("inner=" + encodedParameter)
		      Case "pipeDelimited"
		        localVarQueryStringsproxyExceptions.Append("inner=" + encodedParameter)
		      Case "deepObject"
		        Raise New OpenAPIClient.OpenAPIClientException(kErrorUnsupportedFeature, "deepObject query parameters are not supported")
		    End Select
		  Next
		  
		  Dim localVarQueryStringproxyExceptions As String
		  localVarQueryStringproxyExceptions = Join(localVarQueryStringsproxyExceptions, "&")
		  If proxyExceptionsTypeHint <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("proxy.exceptions@TypeHint") + "=" + EncodeURLComponent(proxyExceptionsTypeHint)
		  
		  If proxyEnabled <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("proxy.enabled") + "=" + EncodeURLComponent(proxyEnabled.ToString)
		  
		  If proxyEnabledTypeHint <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("proxy.enabled@TypeHint") + "=" + EncodeURLComponent(proxyEnabledTypeHint)
		  
		  If proxyUser <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("proxy.user") + "=" + EncodeURLComponent(proxyUser)
		  
		  If proxyUserTypeHint <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("proxy.user@TypeHint") + "=" + EncodeURLComponent(proxyUserTypeHint)
		  
		  If proxyPassword <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("proxy.password") + "=" + EncodeURLComponent(proxyPassword)
		  
		  If proxyPasswordTypeHint <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("proxy.password@TypeHint") + "=" + EncodeURLComponent(proxyPasswordTypeHint)
		  

		  
		  AddHandler localVarHTTPSocket.AuthenticationRequired, addressof Me.AuthenticationRequired


		  Dim localVarPath As String = "/apps/system/config/org.apache.http.proxyconfigurator.config"
		  
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof Me.PostConfigApacheHttpComponentsProxyConfiguration_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.PostConfigApacheHttpComponentsProxyConfiguration_error
		  
		  localVarHTTPSocket.SendRequest("POST", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod


	#tag Method, Flags = &h21
		Private Sub PostConfigApacheHttpComponentsProxyConfiguration_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  CallbackHandler.PostConfigApacheHttpComponentsProxyConfigurationCallback(error)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub PostConfigApacheHttpComponentsProxyConfiguration_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  #Pragma Unused Headers
		  #Pragma Unused Content

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", "")
		  
		  
		  
		  CallbackHandler.PostConfigApacheHttpComponentsProxyConfigurationCallback(error)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub PostConfigApacheSlingDavExServlet(, Optional alias As Xoson.O.OptionalString, Optional aliasTypeHint As Xoson.O.OptionalString, Optional davCreateAbsoluteUri As Xoson.O.OptionalBoolean, Optional davCreateAbsoluteUriTypeHint As Xoson.O.OptionalString)
		  // Operation postConfigApacheSlingDavExServlet
		  // - parameter alias: (query)  (optional, default to Sample)
		  // - parameter aliasTypeHint: (query)  (optional, default to Sample)
		  // - parameter davCreateAbsoluteUri: (query)  (optional, default to False)
		  // - parameter davCreateAbsoluteUriTypeHint: (query)  (optional, default to Sample)
		  //
		  // Invokes SlingApiCallbackHandler.PostConfigApacheSlingDavExServletCallback() on completion. 
		  //
		  // - POST /apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet
		  //
		  // - BASIC:
		  //   - type: http
		  //   - name: aemAuth
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  Dim localVarQueryParams As String = "?"
		  If alias <> nil Then localVarQueryParams = localVarQueryParams + EncodeURLComponent("alias") + "=" + EncodeURLComponent(alias)
		  
		  If aliasTypeHint <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("alias@TypeHint") + "=" + EncodeURLComponent(aliasTypeHint)
		  
		  If davCreateAbsoluteUri <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("dav.create-absolute-uri") + "=" + EncodeURLComponent(davCreateAbsoluteUri.ToString)
		  
		  If davCreateAbsoluteUriTypeHint <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("dav.create-absolute-uri@TypeHint") + "=" + EncodeURLComponent(davCreateAbsoluteUriTypeHint)
		  

		  
		  AddHandler localVarHTTPSocket.AuthenticationRequired, addressof Me.AuthenticationRequired


		  Dim localVarPath As String = "/apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet"
		  
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof Me.PostConfigApacheSlingDavExServlet_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.PostConfigApacheSlingDavExServlet_error
		  
		  localVarHTTPSocket.SendRequest("POST", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod


	#tag Method, Flags = &h21
		Private Sub PostConfigApacheSlingDavExServlet_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  CallbackHandler.PostConfigApacheSlingDavExServletCallback(error)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub PostConfigApacheSlingDavExServlet_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  #Pragma Unused Headers
		  #Pragma Unused Content

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", "")
		  
		  
		  
		  CallbackHandler.PostConfigApacheSlingDavExServletCallback(error)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub PostConfigApacheSlingGetServlet(, Optional jsonMaximumresults As Xoson.O.OptionalString, Optional jsonMaximumresultsTypeHint As Xoson.O.OptionalString, Optional enableHtml As Xoson.O.OptionalBoolean, Optional enableHtmlTypeHint As Xoson.O.OptionalString, Optional enableTxt As Xoson.O.OptionalBoolean, Optional enableTxtTypeHint As Xoson.O.OptionalString, Optional enableXml As Xoson.O.OptionalBoolean, Optional enableXmlTypeHint As Xoson.O.OptionalString)
		  // Operation postConfigApacheSlingGetServlet
		  // - parameter jsonMaximumresults: (query)  (optional, default to Sample)
		  // - parameter jsonMaximumresultsTypeHint: (query)  (optional, default to Sample)
		  // - parameter enableHtml: (query)  (optional, default to False)
		  // - parameter enableHtmlTypeHint: (query)  (optional, default to Sample)
		  // - parameter enableTxt: (query)  (optional, default to False)
		  // - parameter enableTxtTypeHint: (query)  (optional, default to Sample)
		  // - parameter enableXml: (query)  (optional, default to False)
		  // - parameter enableXmlTypeHint: (query)  (optional, default to Sample)
		  //
		  // Invokes SlingApiCallbackHandler.PostConfigApacheSlingGetServletCallback() on completion. 
		  //
		  // - POST /apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet
		  //
		  // - BASIC:
		  //   - type: http
		  //   - name: aemAuth
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  Dim localVarQueryParams As String = "?"
		  If jsonMaximumresults <> nil Then localVarQueryParams = localVarQueryParams + EncodeURLComponent("json.maximumresults") + "=" + EncodeURLComponent(jsonMaximumresults)
		  
		  If jsonMaximumresultsTypeHint <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("json.maximumresults@TypeHint") + "=" + EncodeURLComponent(jsonMaximumresultsTypeHint)
		  
		  If enableHtml <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("enable.html") + "=" + EncodeURLComponent(enableHtml.ToString)
		  
		  If enableHtmlTypeHint <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("enable.html@TypeHint") + "=" + EncodeURLComponent(enableHtmlTypeHint)
		  
		  If enableTxt <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("enable.txt") + "=" + EncodeURLComponent(enableTxt.ToString)
		  
		  If enableTxtTypeHint <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("enable.txt@TypeHint") + "=" + EncodeURLComponent(enableTxtTypeHint)
		  
		  If enableXml <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("enable.xml") + "=" + EncodeURLComponent(enableXml.ToString)
		  
		  If enableXmlTypeHint <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("enable.xml@TypeHint") + "=" + EncodeURLComponent(enableXmlTypeHint)
		  

		  
		  AddHandler localVarHTTPSocket.AuthenticationRequired, addressof Me.AuthenticationRequired


		  Dim localVarPath As String = "/apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet"
		  
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof Me.PostConfigApacheSlingGetServlet_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.PostConfigApacheSlingGetServlet_error
		  
		  localVarHTTPSocket.SendRequest("POST", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod


	#tag Method, Flags = &h21
		Private Sub PostConfigApacheSlingGetServlet_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  CallbackHandler.PostConfigApacheSlingGetServletCallback(error)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub PostConfigApacheSlingGetServlet_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  #Pragma Unused Headers
		  #Pragma Unused Content

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", "")
		  
		  
		  
		  CallbackHandler.PostConfigApacheSlingGetServletCallback(error)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub PostConfigApacheSlingReferrerFilter(, Optional allowEmpty As Xoson.O.OptionalBoolean, Optional allowEmptyTypeHint As Xoson.O.OptionalString, Optional allowHosts As Xoson.O.OptionalString, Optional allowHostsTypeHint As Xoson.O.OptionalString, Optional allowHostsRegexp As Xoson.O.OptionalString, Optional allowHostsRegexpTypeHint As Xoson.O.OptionalString, Optional filterMethods As Xoson.O.OptionalString, Optional filterMethodsTypeHint As Xoson.O.OptionalString)
		  // Operation postConfigApacheSlingReferrerFilter
		  // - parameter allowEmpty: (query)  (optional, default to False)
		  // - parameter allowEmptyTypeHint: (query)  (optional, default to Sample)
		  // - parameter allowHosts: (query)  (optional, default to Sample)
		  // - parameter allowHostsTypeHint: (query)  (optional, default to Sample)
		  // - parameter allowHostsRegexp: (query)  (optional, default to Sample)
		  // - parameter allowHostsRegexpTypeHint: (query)  (optional, default to Sample)
		  // - parameter filterMethods: (query)  (optional, default to Sample)
		  // - parameter filterMethodsTypeHint: (query)  (optional, default to Sample)
		  //
		  // Invokes SlingApiCallbackHandler.PostConfigApacheSlingReferrerFilterCallback() on completion. 
		  //
		  // - POST /apps/system/config/org.apache.sling.security.impl.ReferrerFilter
		  //
		  // - BASIC:
		  //   - type: http
		  //   - name: aemAuth
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  Dim localVarQueryParams As String = "?"
		  If allowEmpty <> nil Then localVarQueryParams = localVarQueryParams + EncodeURLComponent("allow.empty") + "=" + EncodeURLComponent(allowEmpty.ToString)
		  
		  If allowEmptyTypeHint <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("allow.empty@TypeHint") + "=" + EncodeURLComponent(allowEmptyTypeHint)
		  
		  If allowHosts <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("allow.hosts") + "=" + EncodeURLComponent(allowHosts)
		  
		  If allowHostsTypeHint <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("allow.hosts@TypeHint") + "=" + EncodeURLComponent(allowHostsTypeHint)
		  
		  If allowHostsRegexp <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("allow.hosts.regexp") + "=" + EncodeURLComponent(allowHostsRegexp)
		  
		  If allowHostsRegexpTypeHint <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("allow.hosts.regexp@TypeHint") + "=" + EncodeURLComponent(allowHostsRegexpTypeHint)
		  
		  If filterMethods <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("filter.methods") + "=" + EncodeURLComponent(filterMethods)
		  
		  If filterMethodsTypeHint <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("filter.methods@TypeHint") + "=" + EncodeURLComponent(filterMethodsTypeHint)
		  

		  
		  AddHandler localVarHTTPSocket.AuthenticationRequired, addressof Me.AuthenticationRequired


		  Dim localVarPath As String = "/apps/system/config/org.apache.sling.security.impl.ReferrerFilter"
		  
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof Me.PostConfigApacheSlingReferrerFilter_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.PostConfigApacheSlingReferrerFilter_error
		  
		  localVarHTTPSocket.SendRequest("POST", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod


	#tag Method, Flags = &h21
		Private Sub PostConfigApacheSlingReferrerFilter_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  CallbackHandler.PostConfigApacheSlingReferrerFilterCallback(error)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub PostConfigApacheSlingReferrerFilter_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  #Pragma Unused Headers
		  #Pragma Unused Content

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", "")
		  
		  
		  
		  CallbackHandler.PostConfigApacheSlingReferrerFilterCallback(error)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub PostConfigProperty(, configNodeName As String)
		  // Operation postConfigProperty
		  // - parameter configNodeName: (path)  
		  //
		  // Invokes SlingApiCallbackHandler.PostConfigPropertyCallback() on completion. 
		  //
		  // - POST /apps/system/config/{configNodeName}
		  //
		  // - BASIC:
		  //   - type: http
		  //   - name: aemAuth
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  
		  
		  AddHandler localVarHTTPSocket.AuthenticationRequired, addressof Me.AuthenticationRequired


		  Dim localVarPath As String = "/apps/system/config/{configNodeName}"
		  
		  Dim localVarPathStringconfigNodeName As String = configNodeName
		  
		  localVarPath = localVarPath.ReplaceAllB("{configNodeName}", localVarPathStringconfigNodeName)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof Me.PostConfigProperty_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.PostConfigProperty_error
		  
		  localVarHTTPSocket.SendRequest("POST", Me.BasePath + localVarPath)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod


	#tag Method, Flags = &h21
		Private Sub PostConfigProperty_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  CallbackHandler.PostConfigPropertyCallback(error)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub PostConfigProperty_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  #Pragma Unused Headers
		  #Pragma Unused Content

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", "")
		  
		  
		  
		  CallbackHandler.PostConfigPropertyCallback(error)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub PostNode(, path As String, name As String, Optional operation As Xoson.O.OptionalString, Optional deleteAuthorizable As Xoson.O.OptionalString, Optional Escapedfile As FolderItem)
		  // Operation postNode
		  // - parameter path: (path)  
		  // - parameter name: (path)  
		  // - parameter operation: (query)  (optional, default to Sample)
		  // - parameter deleteAuthorizable: (query)  (optional, default to Sample)
		  // - parameter Escapedfile: (form)  (optional, default to Sample)
		  //
		  // Invokes SlingApiCallbackHandler.PostNodeCallback() on completion. 
		  //
		  // - POST /{path}/{name}
		  //
		  // - BASIC:
		  //   - type: http
		  //   - name: aemAuth
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  Dim localVarFormParams As New Dictionary
		  If Escapedfile <> nil Then localVarFormParams.Value("file") = Escapedfile.LocalFuncSerializeFile
		  If localVarFormParams.Count > 0 Then localVarHTTPSocket.SetFormData(localVarFormParams)
		  
		  Dim localVarQueryParams As String = "?"
		  If operation <> nil Then localVarQueryParams = localVarQueryParams + EncodeURLComponent(":operation") + "=" + EncodeURLComponent(operation)
		  
		  If deleteAuthorizable <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("deleteAuthorizable") + "=" + EncodeURLComponent(deleteAuthorizable)
		  

		  
		  AddHandler localVarHTTPSocket.AuthenticationRequired, addressof Me.AuthenticationRequired


		  Dim localVarPath As String = "/{path}/{name}"
		  
		  Dim localVarPathStringpath As String = path
		  
		  localVarPath = localVarPath.ReplaceAllB("{path}", localVarPathStringpath)
		  Dim localVarPathStringname As String = name
		  
		  localVarPath = localVarPath.ReplaceAllB("{name}", localVarPathStringname)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof Me.PostNode_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.PostNode_error
		  
		  localVarHTTPSocket.SendRequest("POST", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod


	#tag Method, Flags = &h21
		Private Sub PostNode_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  CallbackHandler.PostNodeCallback(error)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub PostNode_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  #Pragma Unused Headers
		  #Pragma Unused Content

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", "")
		  
		  
		  
		  CallbackHandler.PostNodeCallback(error)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub PostNodeRw(, path As String, name As String, Optional addMembers As Xoson.O.OptionalString)
		  // Operation postNodeRw
		  // - parameter path: (path)  
		  // - parameter name: (path)  
		  // - parameter addMembers: (query)  (optional, default to Sample)
		  //
		  // Invokes SlingApiCallbackHandler.PostNodeRwCallback() on completion. 
		  //
		  // - POST /{path}/{name}.rw.html
		  //
		  // - BASIC:
		  //   - type: http
		  //   - name: aemAuth
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  Dim localVarQueryParams As String = "?"
		  If addMembers <> nil Then localVarQueryParams = localVarQueryParams + EncodeURLComponent("addMembers") + "=" + EncodeURLComponent(addMembers)
		  

		  
		  AddHandler localVarHTTPSocket.AuthenticationRequired, addressof Me.AuthenticationRequired


		  Dim localVarPath As String = "/{path}/{name}.rw.html"
		  
		  Dim localVarPathStringpath As String = path
		  
		  localVarPath = localVarPath.ReplaceAllB("{path}", localVarPathStringpath)
		  Dim localVarPathStringname As String = name
		  
		  localVarPath = localVarPath.ReplaceAllB("{name}", localVarPathStringname)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof Me.PostNodeRw_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.PostNodeRw_error
		  
		  localVarHTTPSocket.SendRequest("POST", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod


	#tag Method, Flags = &h21
		Private Sub PostNodeRw_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  CallbackHandler.PostNodeRwCallback(error)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub PostNodeRw_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  #Pragma Unused Headers
		  #Pragma Unused Content

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", "")
		  
		  
		  
		  CallbackHandler.PostNodeRwCallback(error)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub PostPath(, path As String, jcrPrimaryType As String, name As String)
		  // Operation postPath
		  // - parameter path: (path)  
		  // - parameter jcrPrimaryType: (query)  
		  // - parameter name: (query)  
		  //
		  // Invokes SlingApiCallbackHandler.PostPathCallback() on completion. 
		  //
		  // - POST /{path}/
		  //
		  // - BASIC:
		  //   - type: http
		  //   - name: aemAuth
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  Dim localVarQueryParams As String = "?"
		  localVarQueryParams = localVarQueryParams + EncodeURLComponent("jcr:primaryType") + "=" + EncodeURLComponent(jcrPrimaryType)
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent(":name") + "=" + EncodeURLComponent(name)
		  

		  
		  AddHandler localVarHTTPSocket.AuthenticationRequired, addressof Me.AuthenticationRequired


		  Dim localVarPath As String = "/{path}/"
		  
		  Dim localVarPathStringpath As String = path
		  
		  localVarPath = localVarPath.ReplaceAllB("{path}", localVarPathStringpath)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof Me.PostPath_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.PostPath_error
		  
		  localVarHTTPSocket.SendRequest("POST", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod


	#tag Method, Flags = &h21
		Private Sub PostPath_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  CallbackHandler.PostPathCallback(error)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub PostPath_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  #Pragma Unused Headers
		  #Pragma Unused Content

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", "")
		  
		  
		  
		  CallbackHandler.PostPathCallback(error)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub PostQuery(, path As String, pLimit As Double, _1property As String, _1propertyValue As String)
		  // Operation postQuery
		  // - 
		  // - parameter path: (query)  
		  // - parameter pLimit: (query)  
		  // - parameter _1property: (query)  
		  // - parameter _1propertyValue: (query)  
		  //
		  // Invokes SlingApiCallbackHandler.PostQueryCallback(String) on completion. 
		  //
		  // - POST /bin/querybuilder.json
		  // - defaultResponse: Sample
		  //
		  // - BASIC:
		  //   - type: http
		  //   - name: aemAuth
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  Dim localVarQueryParams As String = "?"
		  localVarQueryParams = localVarQueryParams + EncodeURLComponent("path") + "=" + EncodeURLComponent(path)
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("p.limit") + "=" + EncodeURLComponent(pLimit.ToString)
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("1_property") + "=" + EncodeURLComponent(_1property)
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("1_property.value") + "=" + EncodeURLComponent(_1propertyValue)
		  

		  
		  AddHandler localVarHTTPSocket.AuthenticationRequired, addressof Me.AuthenticationRequired


		  Dim localVarPath As String = "/bin/querybuilder.json"
		  
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.PostQuery_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.PostQuery_error
		  
		  
		  localVarHTTPSocket.SendRequest("POST", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function PostQueryPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As String) As Boolean
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
		Private Sub PostQuery_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As String
		  CallbackHandler.PostQueryCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub PostQuery_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As String
		  Call PostQueryPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.PostQueryCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub PostTreeActivation(, ignoredeactivated As Boolean, onlymodified As Boolean, path As String, cmd As String)
		  // Operation postTreeActivation
		  // - parameter ignoredeactivated: (query)  
		  // - parameter onlymodified: (query)  
		  // - parameter path: (query)  
		  // - parameter cmd: (query)  
		  //
		  // Invokes SlingApiCallbackHandler.PostTreeActivationCallback() on completion. 
		  //
		  // - POST /libs/replication/treeactivation.html
		  //
		  // - BASIC:
		  //   - type: http
		  //   - name: aemAuth
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  Dim localVarQueryParams As String = "?"
		  localVarQueryParams = localVarQueryParams + EncodeURLComponent("ignoredeactivated") + "=" + EncodeURLComponent(ignoredeactivated.ToString)
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("onlymodified") + "=" + EncodeURLComponent(onlymodified.ToString)
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("path") + "=" + EncodeURLComponent(path)
		  
		  localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("cmd") + "=" + EncodeURLComponent(cmd)
		  

		  
		  AddHandler localVarHTTPSocket.AuthenticationRequired, addressof Me.AuthenticationRequired


		  Dim localVarPath As String = "/libs/replication/treeactivation.html"
		  
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof Me.PostTreeActivation_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.PostTreeActivation_error
		  
		  localVarHTTPSocket.SendRequest("POST", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod


	#tag Method, Flags = &h21
		Private Sub PostTreeActivation_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  CallbackHandler.PostTreeActivationCallback(error)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub PostTreeActivation_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  #Pragma Unused Headers
		  #Pragma Unused Content

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", "")
		  
		  
		  
		  CallbackHandler.PostTreeActivationCallback(error)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub PostTruststore(, Optional operation As Xoson.O.OptionalString, Optional newPassword As Xoson.O.OptionalString, Optional rePassword As Xoson.O.OptionalString, Optional keyStoreType As Xoson.O.OptionalString, Optional removeAlias As Xoson.O.OptionalString, Optional certificate As FolderItem)
		  // Operation postTruststore
		  // - 
		  // - parameter operation: (query)  (optional, default to Sample)
		  // - parameter newPassword: (query)  (optional, default to Sample)
		  // - parameter rePassword: (query)  (optional, default to Sample)
		  // - parameter keyStoreType: (query)  (optional, default to Sample)
		  // - parameter removeAlias: (query)  (optional, default to Sample)
		  // - parameter certificate: (form)  (optional, default to Sample)
		  //
		  // Invokes SlingApiCallbackHandler.PostTruststoreCallback(String) on completion. 
		  //
		  // - POST /libs/granite/security/post/truststore
		  // - defaultResponse: Sample
		  //
		  // - BASIC:
		  //   - type: http
		  //   - name: aemAuth
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  Dim localVarFormParams As New Dictionary
		  If certificate <> nil Then localVarFormParams.Value("certificate") = certificate.LocalFuncSerializeFile
		  If localVarFormParams.Count > 0 Then localVarHTTPSocket.SetFormData(localVarFormParams)
		  
		  Dim localVarQueryParams As String = "?"
		  If operation <> nil Then localVarQueryParams = localVarQueryParams + EncodeURLComponent(":operation") + "=" + EncodeURLComponent(operation)
		  
		  If newPassword <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("newPassword") + "=" + EncodeURLComponent(newPassword)
		  
		  If rePassword <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("rePassword") + "=" + EncodeURLComponent(rePassword)
		  
		  If keyStoreType <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("keyStoreType") + "=" + EncodeURLComponent(keyStoreType)
		  
		  If removeAlias <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("removeAlias") + "=" + EncodeURLComponent(removeAlias)
		  

		  
		  AddHandler localVarHTTPSocket.AuthenticationRequired, addressof Me.AuthenticationRequired


		  Dim localVarPath As String = "/libs/granite/security/post/truststore"
		  
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.PostTruststore_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.PostTruststore_error
		  
		  
		  localVarHTTPSocket.SendRequest("POST", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function PostTruststorePrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As String) As Boolean
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
		Private Sub PostTruststore_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As String
		  CallbackHandler.PostTruststoreCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub PostTruststore_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As String
		  Call PostTruststorePrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.PostTruststoreCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub PostTruststorePKCS12(, Optional truststoreP12 As FolderItem)
		  // Operation postTruststorePKCS12
		  // - 
		  // - parameter truststoreP12: (form)  (optional, default to Sample)
		  //
		  // Invokes SlingApiCallbackHandler.PostTruststorePKCS12Callback(String) on completion. 
		  //
		  // - POST /etc/truststore
		  // - defaultResponse: Sample
		  //
		  // - BASIC:
		  //   - type: http
		  //   - name: aemAuth
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  Dim localVarFormParams As New Dictionary
		  If truststoreP12 <> nil Then localVarFormParams.Value("truststore.p12") = truststoreP12.LocalFuncSerializeFile
		  If localVarFormParams.Count > 0 Then localVarHTTPSocket.SetFormData(localVarFormParams)
		  
		  
		  
		  AddHandler localVarHTTPSocket.AuthenticationRequired, addressof Me.AuthenticationRequired


		  Dim localVarPath As String = "/etc/truststore"
		  
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.PostTruststorePKCS12_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.PostTruststorePKCS12_error
		  
		  
		  localVarHTTPSocket.SendRequest("POST", Me.BasePath + localVarPath)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function PostTruststorePKCS12PrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As String) As Boolean
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
		Private Sub PostTruststorePKCS12_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As String
		  CallbackHandler.PostTruststorePKCS12Callback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub PostTruststorePKCS12_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As String
		  Call PostTruststorePKCS12PrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.PostTruststorePKCS12Callback(error, data)
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
		CallbackHandler As OpenAPIClient.APIs.SlingApiCallbackHandler
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
