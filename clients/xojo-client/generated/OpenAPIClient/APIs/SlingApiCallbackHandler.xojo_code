#tag Interface
Protected Interface SlingApiCallbackHandler
	#tag Method, Flags = &h0
		Sub DeleteAgentCallback(status As OpenAPIClient.OpenAPIClientException)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub DeleteNodeCallback(status As OpenAPIClient.OpenAPIClientException)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GetAgentCallback(status As OpenAPIClient.OpenAPIClientException)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GetAgentsCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As String)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GetAuthorizableKeystoreCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.KeystoreInfo)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GetKeystoreCallback(status As OpenAPIClient.OpenAPIClientException, Optional file As FolderItem)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GetKeystoreDownloadProgress(BytesReceived as Integer, TotalBytes as Integer)
		  
		End Sub
	#tag EndMethod
	#tag Method, Flags = &h0
		Sub GetNodeCallback(status As OpenAPIClient.OpenAPIClientException)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GetPackageCallback(status As OpenAPIClient.OpenAPIClientException, Optional file As FolderItem)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GetPackageDownloadProgress(BytesReceived as Integer, TotalBytes as Integer)
		  
		End Sub
	#tag EndMethod
	#tag Method, Flags = &h0
		Sub GetPackageFilterCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As String)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GetQueryCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As String)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GetTruststoreCallback(status As OpenAPIClient.OpenAPIClientException, Optional file As FolderItem)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GetTruststoreDownloadProgress(BytesReceived as Integer, TotalBytes as Integer)
		  
		End Sub
	#tag EndMethod
	#tag Method, Flags = &h0
		Sub GetTruststoreInfoCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.TruststoreInfo)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub PostAgentCallback(status As OpenAPIClient.OpenAPIClientException)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub PostAuthorizableKeystoreCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.KeystoreInfo)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub PostAuthorizablesCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As String)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub PostConfigAdobeGraniteSamlAuthenticationHandlerCallback(status As OpenAPIClient.OpenAPIClientException)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub PostConfigApacheFelixJettyBasedHttpServiceCallback(status As OpenAPIClient.OpenAPIClientException)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub PostConfigApacheHttpComponentsProxyConfigurationCallback(status As OpenAPIClient.OpenAPIClientException)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub PostConfigApacheSlingDavExServletCallback(status As OpenAPIClient.OpenAPIClientException)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub PostConfigApacheSlingGetServletCallback(status As OpenAPIClient.OpenAPIClientException)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub PostConfigApacheSlingReferrerFilterCallback(status As OpenAPIClient.OpenAPIClientException)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub PostConfigPropertyCallback(status As OpenAPIClient.OpenAPIClientException)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub PostNodeCallback(status As OpenAPIClient.OpenAPIClientException)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub PostNodeRwCallback(status As OpenAPIClient.OpenAPIClientException)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub PostPathCallback(status As OpenAPIClient.OpenAPIClientException)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub PostQueryCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As String)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub PostTreeActivationCallback(status As OpenAPIClient.OpenAPIClientException)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub PostTruststoreCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As String)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub PostTruststorePKCS12Callback(status As OpenAPIClient.OpenAPIClientException, Optional data As String)
		  
		End Sub
	#tag EndMethod




	#tag ViewBehavior
		#tag ViewProperty
			Name="Name"
			Visible=true
			Group="ID"
			Type="String"
		#tag EndViewProperty
		#tag ViewProperty
			Name="Index"
			Visible=true
			Group="ID"
			InitialValue="-2147483648"
			Type="Integer"
		#tag EndViewProperty
		#tag ViewProperty
			Name="Super"
			Visible=true
			Group="ID"
			Type="String"
		#tag EndViewProperty
		#tag ViewProperty
			Name="Left"
			Visible=true
			Group="Position"
			InitialValue="0"
			Type="Integer"
		#tag EndViewProperty
		#tag ViewProperty
			Name="Top"
			Visible=true
			Group="Position"
			InitialValue="0"
			Type="Integer"
		#tag EndViewProperty
	#tag EndViewBehavior
End Interface
#tag EndInterface
