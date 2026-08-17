#tag Class
Protected Class SamlConfigurationProperties

	#tag Property, Flags = &h0
		path As OpenAPIClient.Models.SamlConfigurationPropertyItemsArray
	#tag EndProperty


	#tag Property, Flags = &h0
		service_ranking As OpenAPIClient.Models.SamlConfigurationPropertyItemsLong
	#tag EndProperty


	#tag Property, Flags = &h0
		idpUrl As OpenAPIClient.Models.SamlConfigurationPropertyItemsString
	#tag EndProperty


	#tag Property, Flags = &h0
		idpCertAlias As OpenAPIClient.Models.SamlConfigurationPropertyItemsString
	#tag EndProperty


	#tag Property, Flags = &h0
		idpHttpRedirect As OpenAPIClient.Models.SamlConfigurationPropertyItemsBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		serviceProviderEntityId As OpenAPIClient.Models.SamlConfigurationPropertyItemsString
	#tag EndProperty


	#tag Property, Flags = &h0
		assertionConsumerServiceURL As OpenAPIClient.Models.SamlConfigurationPropertyItemsString
	#tag EndProperty


	#tag Property, Flags = &h0
		spPrivateKeyAlias As OpenAPIClient.Models.SamlConfigurationPropertyItemsString
	#tag EndProperty


	#tag Property, Flags = &h0
		keyStorePassword As OpenAPIClient.Models.SamlConfigurationPropertyItemsString
	#tag EndProperty


	#tag Property, Flags = &h0
		defaultRedirectUrl As OpenAPIClient.Models.SamlConfigurationPropertyItemsString
	#tag EndProperty


	#tag Property, Flags = &h0
		userIDAttribute As OpenAPIClient.Models.SamlConfigurationPropertyItemsString
	#tag EndProperty


	#tag Property, Flags = &h0
		useEncryption As OpenAPIClient.Models.SamlConfigurationPropertyItemsBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		createUser As OpenAPIClient.Models.SamlConfigurationPropertyItemsBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		addGroupMemberships As OpenAPIClient.Models.SamlConfigurationPropertyItemsBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		groupMembershipAttribute As OpenAPIClient.Models.SamlConfigurationPropertyItemsString
	#tag EndProperty


	#tag Property, Flags = &h0
		defaultGroups As OpenAPIClient.Models.SamlConfigurationPropertyItemsArray
	#tag EndProperty


	#tag Property, Flags = &h0
		nameIdFormat As OpenAPIClient.Models.SamlConfigurationPropertyItemsString
	#tag EndProperty


	#tag Property, Flags = &h0
		synchronizeAttributes As OpenAPIClient.Models.SamlConfigurationPropertyItemsArray
	#tag EndProperty


	#tag Property, Flags = &h0
		handleLogout As OpenAPIClient.Models.SamlConfigurationPropertyItemsBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		logoutUrl As OpenAPIClient.Models.SamlConfigurationPropertyItemsString
	#tag EndProperty


	#tag Property, Flags = &h0
		clockTolerance As OpenAPIClient.Models.SamlConfigurationPropertyItemsLong
	#tag EndProperty


	#tag Property, Flags = &h0
		digestMethod As OpenAPIClient.Models.SamlConfigurationPropertyItemsString
	#tag EndProperty


	#tag Property, Flags = &h0
		signatureMethod As OpenAPIClient.Models.SamlConfigurationPropertyItemsString
	#tag EndProperty


	#tag Property, Flags = &h0
		userIntermediatePath As OpenAPIClient.Models.SamlConfigurationPropertyItemsString
	#tag EndProperty





	#tag ViewBehavior
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
			Name="path"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="SamlConfigurationPropertyItemsArray"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="service_ranking"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="SamlConfigurationPropertyItemsLong"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="idpUrl"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="SamlConfigurationPropertyItemsString"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="idpCertAlias"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="SamlConfigurationPropertyItemsString"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="idpHttpRedirect"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="SamlConfigurationPropertyItemsBoolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="serviceProviderEntityId"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="SamlConfigurationPropertyItemsString"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="assertionConsumerServiceURL"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="SamlConfigurationPropertyItemsString"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="spPrivateKeyAlias"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="SamlConfigurationPropertyItemsString"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="keyStorePassword"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="SamlConfigurationPropertyItemsString"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="defaultRedirectUrl"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="SamlConfigurationPropertyItemsString"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="userIDAttribute"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="SamlConfigurationPropertyItemsString"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="useEncryption"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="SamlConfigurationPropertyItemsBoolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="createUser"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="SamlConfigurationPropertyItemsBoolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="addGroupMemberships"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="SamlConfigurationPropertyItemsBoolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="groupMembershipAttribute"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="SamlConfigurationPropertyItemsString"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="defaultGroups"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="SamlConfigurationPropertyItemsArray"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="nameIdFormat"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="SamlConfigurationPropertyItemsString"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="synchronizeAttributes"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="SamlConfigurationPropertyItemsArray"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="handleLogout"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="SamlConfigurationPropertyItemsBoolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="logoutUrl"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="SamlConfigurationPropertyItemsString"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="clockTolerance"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="SamlConfigurationPropertyItemsLong"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="digestMethod"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="SamlConfigurationPropertyItemsString"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="signatureMethod"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="SamlConfigurationPropertyItemsString"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="userIntermediatePath"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="SamlConfigurationPropertyItemsString"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


