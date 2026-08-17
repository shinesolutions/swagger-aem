#tag Class
Protected Class KeystoreInfo

	#tag Property, Flags = &h0
		aliases() As OpenAPIClient.Models.KeystoreItems
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			False if truststore don't exist
		#tag EndNote
		exists As Xoson.O.OptionalBoolean
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
			Name="aliases"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="KeystoreItems"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="exists"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


