#tag Interface
Protected Interface CrxApiCallbackHandler
	#tag Method, Flags = &h0
		Sub GetCrxdeStatusCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As String)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GetInstallStatusCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.InstallStatus)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GetPackageManagerServletCallback(status As OpenAPIClient.OpenAPIClientException)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub PostPackageServiceCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As String)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub PostPackageServiceJsonCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As String)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub PostPackageUpdateCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As String)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub PostSetPasswordCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As String)
		  
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
