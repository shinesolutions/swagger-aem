--  Adobe Experience Manager (AEM) API
--  Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API
--  ------------ EDIT NOTE ------------
--  This file was generated with openapi-generator.  You can modify it to implement
--  the server.  After you modify this file, you should add the following line
--  to the .openapi-generator-ignore file:
--
--  src/-servers.ads
--
--  Then, you can drop this edit note comment.
--  ------------ EDIT NOTE ------------
with Swagger.Servers;
with .Models;
with .Skeletons;
package .Servers is
   use .Models;
   type Server_Type is limited new .Skeletons.Server_Type with null record;


   --  
   overriding
   procedure Get_Aem_Product_Info
      (Server : in out Server_Type
       ;
       Result  : out Swagger.UString_Vectors.Vector;
       Context : in out Swagger.Servers.Context_Type);

   --  
   overriding
   procedure Get_Config_Mgr
      (Server : in out Server_Type
       ;
       Result  : out Swagger.UString;
       Context : in out Swagger.Servers.Context_Type);

   --  
   overriding
   procedure Post_Bundle
      (Server : in out Server_Type;
       Name : in Swagger.UString;
       Action : in Swagger.UString;
       Context : in out Swagger.Servers.Context_Type);

   --  
   overriding
   procedure Post_Jmx_Repository
      (Server : in out Server_Type;
       Action : in Swagger.UString;
       Context : in out Swagger.Servers.Context_Type);

   --  
   overriding
   procedure Post_Saml_Configuration
      (Server : in out Server_Type;
       Post : in Swagger.Nullable_Boolean;
       Apply : in Swagger.Nullable_Boolean;
       Delete : in Swagger.Nullable_Boolean;
       Action : in Swagger.Nullable_UString;
       Dollarlocation : in Swagger.Nullable_UString;
       Path : in Swagger.UString_Vectors.Vector;
       Service_Periodranking : in Swagger.Nullable_Integer;
       Idp_Url : in Swagger.Nullable_UString;
       Idp_Cert_Alias : in Swagger.Nullable_UString;
       Idp_Http_Redirect : in Swagger.Nullable_Boolean;
       Service_Provider_Entity_Id : in Swagger.Nullable_UString;
       Assertion_Consumer_Service_U_R_L : in Swagger.Nullable_UString;
       Sp_Private_Key_Alias : in Swagger.Nullable_UString;
       Key_Store_Password : in Swagger.Nullable_UString;
       Default_Redirect_Url : in Swagger.Nullable_UString;
       User_I_D_Attribute : in Swagger.Nullable_UString;
       Use_Encryption : in Swagger.Nullable_Boolean;
       Create_User : in Swagger.Nullable_Boolean;
       Add_Group_Memberships : in Swagger.Nullable_Boolean;
       Group_Membership_Attribute : in Swagger.Nullable_UString;
       Default_Groups : in Swagger.UString_Vectors.Vector;
       Name_Id_Format : in Swagger.Nullable_UString;
       Synchronize_Attributes : in Swagger.UString_Vectors.Vector;
       Handle_Logout : in Swagger.Nullable_Boolean;
       Logout_Url : in Swagger.Nullable_UString;
       Clock_Tolerance : in Swagger.Nullable_Integer;
       Digest_Method : in Swagger.Nullable_UString;
       Signature_Method : in Swagger.Nullable_UString;
       User_Intermediate_Path : in Swagger.Nullable_UString;
       Propertylist : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.SamlConfigurationInfo_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  
   overriding
   procedure Get_Login_Page
      (Server : in out Server_Type
       ;
       Result  : out Swagger.UString;
       Context : in out Swagger.Servers.Context_Type);

   --  
   overriding
   procedure Post_Cq_Actions
      (Server : in out Server_Type;
       Authorizable_Id : in Swagger.UString;
       Changelog : in Swagger.UString;
       Context : in out Swagger.Servers.Context_Type);

   --  
   overriding
   procedure Get_Crxde_Status
      (Server : in out Server_Type
       ;
       Result  : out Swagger.UString;
       Context : in out Swagger.Servers.Context_Type);

   --  
   overriding
   procedure Get_Install_Status
      (Server : in out Server_Type
       ;
       Result  : out .Models.InstallStatus_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  
   overriding
   procedure Get_Package_Manager_Servlet
      (Server : in out Server_Type
       ;
       Context : in out Swagger.Servers.Context_Type);

   --  
   overriding
   procedure Post_Package_Service
      (Server : in out Server_Type;
       Cmd : in Swagger.UString;
       Result  : out Swagger.UString;
       Context : in out Swagger.Servers.Context_Type);

   --  
   overriding
   procedure Post_Package_Service_Json
      (Server : in out Server_Type;
       Path : in Swagger.UString;
       Cmd : in Swagger.UString;
       Group_Name : in Swagger.Nullable_UString;
       Package_Name : in Swagger.Nullable_UString;
       Package_Version : in Swagger.Nullable_UString;
       Charset : in Swagger.Nullable_UString;
       Force : in Swagger.Nullable_Boolean;
       Recursive : in Swagger.Nullable_Boolean;
       P_Package : in Swagger.File_Part_Type;
       Result  : out Swagger.UString;
       Context : in out Swagger.Servers.Context_Type);

   --  
   overriding
   procedure Post_Package_Update
      (Server : in out Server_Type;
       Group_Name : in Swagger.UString;
       Package_Name : in Swagger.UString;
       Version : in Swagger.UString;
       Path : in Swagger.UString;
       Filter : in Swagger.Nullable_UString;
       Charset : in Swagger.Nullable_UString;
       Result  : out Swagger.UString;
       Context : in out Swagger.Servers.Context_Type);

   --  
   overriding
   procedure Post_Set_Password
      (Server : in out Server_Type;
       Old : in Swagger.UString;
       Plain : in Swagger.UString;
       Verify : in Swagger.UString;
       Result  : out Swagger.UString;
       Context : in out Swagger.Servers.Context_Type);

   --  
   overriding
   procedure Get_Aem_Health_Check
      (Server : in out Server_Type;
       Tags : in Swagger.Nullable_UString;
       Combine_Tags_Or : in Swagger.Nullable_Boolean;
       Result  : out Swagger.UString;
       Context : in out Swagger.Servers.Context_Type);

   --  
   overriding
   procedure Post_Config_Aem_Health_Check_Servlet
      (Server : in out Server_Type;
       Bundles_Periodignored : in Swagger.UString_Vectors.Vector;
       Bundles_Periodignored_At_Type_Hint : in Swagger.Nullable_UString;
       Context : in out Swagger.Servers.Context_Type);

   --  
   overriding
   procedure Post_Config_Aem_Password_Reset
      (Server : in out Server_Type;
       Pwdreset_Periodauthorizables : in Swagger.UString_Vectors.Vector;
       Pwdreset_Periodauthorizables_At_Type_Hint : in Swagger.Nullable_UString;
       Context : in out Swagger.Servers.Context_Type);

   --  
   overriding
   procedure Delete_Agent
      (Server : in out Server_Type;
       Runmode : in Swagger.UString;
       Name : in Swagger.UString;
       Context : in out Swagger.Servers.Context_Type);

   --  
   overriding
   procedure Delete_Node
      (Server : in out Server_Type;
       Path : in Swagger.UString;
       Name : in Swagger.UString;
       Context : in out Swagger.Servers.Context_Type);

   --  
   overriding
   procedure Get_Agent
      (Server : in out Server_Type;
       Runmode : in Swagger.UString;
       Name : in Swagger.UString;
       Context : in out Swagger.Servers.Context_Type);

   --  
   overriding
   procedure Get_Agents
      (Server : in out Server_Type;
       Runmode : in Swagger.UString;
       Result  : out Swagger.UString;
       Context : in out Swagger.Servers.Context_Type);

   --  
   overriding
   procedure Get_Authorizable_Keystore
      (Server : in out Server_Type;
       Intermediate_Path : in Swagger.UString;
       Authorizable_Id : in Swagger.UString;
       Result  : out .Models.KeystoreInfo_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  
   overriding
   procedure Get_Keystore
      (Server : in out Server_Type;
       Intermediate_Path : in Swagger.UString;
       Authorizable_Id : in Swagger.UString;
       Result  : out Swagger.Http_Content_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  
   overriding
   procedure Get_Node
      (Server : in out Server_Type;
       Path : in Swagger.UString;
       Name : in Swagger.UString;
       Context : in out Swagger.Servers.Context_Type);

   --  
   overriding
   procedure Get_Package
      (Server : in out Server_Type;
       Group : in Swagger.UString;
       Name : in Swagger.UString;
       Version : in Swagger.UString;
       Result  : out Swagger.Http_Content_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  
   overriding
   procedure Get_Package_Filter
      (Server : in out Server_Type;
       Group : in Swagger.UString;
       Name : in Swagger.UString;
       Version : in Swagger.UString;
       Result  : out Swagger.UString;
       Context : in out Swagger.Servers.Context_Type);

   --  
   overriding
   procedure Get_Query
      (Server : in out Server_Type;
       Path : in Swagger.UString;
       P_Periodlimit : in Swagger.Number;
       1_Property : in Swagger.UString;
       1_Property_Periodvalue : in Swagger.UString;
       Result  : out Swagger.UString;
       Context : in out Swagger.Servers.Context_Type);

   --  
   overriding
   procedure Get_Truststore
      (Server : in out Server_Type
       ;
       Result  : out Swagger.Http_Content_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  
   overriding
   procedure Get_Truststore_Info
      (Server : in out Server_Type
       ;
       Result  : out .Models.TruststoreInfo_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  
   overriding
   procedure Post_Agent
      (Server : in out Server_Type;
       Runmode : in Swagger.UString;
       Name : in Swagger.UString;
       Jcr_Content_Slashcq_Distribute : in Swagger.Nullable_Boolean;
       Jcr_Content_Slashcq_Distribute_At_Type_Hint : in Swagger.Nullable_UString;
       Jcr_Content_Slashcq_Name : in Swagger.Nullable_UString;
       Jcr_Content_Slashcq_Template : in Swagger.Nullable_UString;
       Jcr_Content_Slashenabled : in Swagger.Nullable_Boolean;
       Jcr_Content_Slashjcr_Description : in Swagger.Nullable_UString;
       Jcr_Content_Slashjcr_Last_Modified : in Swagger.Nullable_UString;
       Jcr_Content_Slashjcr_Last_Modified_By : in Swagger.Nullable_UString;
       Jcr_Content_Slashjcr_Mixin_Types : in Swagger.Nullable_UString;
       Jcr_Content_Slashjcr_Title : in Swagger.Nullable_UString;
       Jcr_Content_Slashlog_Level : in Swagger.Nullable_UString;
       Jcr_Content_Slashno_Status_Update : in Swagger.Nullable_Boolean;
       Jcr_Content_Slashno_Versioning : in Swagger.Nullable_Boolean;
       Jcr_Content_Slashprotocol_Connect_Timeout : in Swagger.Number;
       Jcr_Content_Slashprotocol_H_T_T_P_Connection_Closed : in Swagger.Nullable_Boolean;
       Jcr_Content_Slashprotocol_H_T_T_P_Expired : in Swagger.Nullable_UString;
       Jcr_Content_Slashprotocol_H_T_T_P_Headers : in Swagger.UString_Vectors.Vector;
       Jcr_Content_Slashprotocol_H_T_T_P_Headers_At_Type_Hint : in Swagger.Nullable_UString;
       Jcr_Content_Slashprotocol_H_T_T_P_Method : in Swagger.Nullable_UString;
       Jcr_Content_Slashprotocol_H_T_T_P_S_Relaxed : in Swagger.Nullable_Boolean;
       Jcr_Content_Slashprotocol_Interface : in Swagger.Nullable_UString;
       Jcr_Content_Slashprotocol_Socket_Timeout : in Swagger.Number;
       Jcr_Content_Slashprotocol_Version : in Swagger.Nullable_UString;
       Jcr_Content_Slashproxy_N_T_L_M_Domain : in Swagger.Nullable_UString;
       Jcr_Content_Slashproxy_N_T_L_M_Host : in Swagger.Nullable_UString;
       Jcr_Content_Slashproxy_Host : in Swagger.Nullable_UString;
       Jcr_Content_Slashproxy_Password : in Swagger.Nullable_UString;
       Jcr_Content_Slashproxy_Port : in Swagger.Number;
       Jcr_Content_Slashproxy_User : in Swagger.Nullable_UString;
       Jcr_Content_Slashqueue_Batch_Max_Size : in Swagger.Number;
       Jcr_Content_Slashqueue_Batch_Mode : in Swagger.Nullable_UString;
       Jcr_Content_Slashqueue_Batch_Wait_Time : in Swagger.Number;
       Jcr_Content_Slashretry_Delay : in Swagger.Nullable_UString;
       Jcr_Content_Slashreverse_Replication : in Swagger.Nullable_Boolean;
       Jcr_Content_Slashserialization_Type : in Swagger.Nullable_UString;
       Jcr_Content_Slashsling_Resource_Type : in Swagger.Nullable_UString;
       Jcr_Content_Slashssl : in Swagger.Nullable_UString;
       Jcr_Content_Slashtransport_N_T_L_M_Domain : in Swagger.Nullable_UString;
       Jcr_Content_Slashtransport_N_T_L_M_Host : in Swagger.Nullable_UString;
       Jcr_Content_Slashtransport_Password : in Swagger.Nullable_UString;
       Jcr_Content_Slashtransport_Uri : in Swagger.Nullable_UString;
       Jcr_Content_Slashtransport_User : in Swagger.Nullable_UString;
       Jcr_Content_Slashtrigger_Distribute : in Swagger.Nullable_Boolean;
       Jcr_Content_Slashtrigger_Modified : in Swagger.Nullable_Boolean;
       Jcr_Content_Slashtrigger_On_Off_Time : in Swagger.Nullable_Boolean;
       Jcr_Content_Slashtrigger_Receive : in Swagger.Nullable_Boolean;
       Jcr_Content_Slashtrigger_Specific : in Swagger.Nullable_Boolean;
       Jcr_Content_Slashuser_Id : in Swagger.Nullable_UString;
       Jcr_Primary_Type : in Swagger.Nullable_UString;
       Operation : in Swagger.Nullable_UString;
       Context : in out Swagger.Servers.Context_Type);

   --  
   overriding
   procedure Post_Authorizable_Keystore
      (Server : in out Server_Type;
       Intermediate_Path : in Swagger.UString;
       Authorizable_Id : in Swagger.UString;
       Operation : in Swagger.Nullable_UString;
       Current_Password : in Swagger.Nullable_UString;
       New_Password : in Swagger.Nullable_UString;
       Re_Password : in Swagger.Nullable_UString;
       Key_Password : in Swagger.Nullable_UString;
       Key_Store_Pass : in Swagger.Nullable_UString;
       Alias : in Swagger.Nullable_UString;
       New_Alias : in Swagger.Nullable_UString;
       Remove_Alias : in Swagger.Nullable_UString;
       Cert_Chain : in Swagger.File_Part_Type;
       Pk : in Swagger.File_Part_Type;
       Key_Store : in Swagger.File_Part_Type;
       Result  : out .Models.KeystoreInfo_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  
   overriding
   procedure Post_Authorizables
      (Server : in out Server_Type;
       Authorizable_Id : in Swagger.UString;
       Intermediate_Path : in Swagger.UString;
       Create_User : in Swagger.Nullable_UString;
       Create_Group : in Swagger.Nullable_UString;
       Rep_Password : in Swagger.Nullable_UString;
       Profile_Slashgiven_Name : in Swagger.Nullable_UString;
       Result  : out Swagger.UString;
       Context : in out Swagger.Servers.Context_Type);

   --  
   overriding
   procedure Post_Config_Adobe_Granite_Saml_Authentication_Handler
      (Server : in out Server_Type;
       Key_Store_Password : in Swagger.Nullable_UString;
       Key_Store_Password_At_Type_Hint : in Swagger.Nullable_UString;
       Service_Periodranking : in Swagger.Nullable_Integer;
       Service_Periodranking_At_Type_Hint : in Swagger.Nullable_UString;
       Idp_Http_Redirect : in Swagger.Nullable_Boolean;
       Idp_Http_Redirect_At_Type_Hint : in Swagger.Nullable_UString;
       Create_User : in Swagger.Nullable_Boolean;
       Create_User_At_Type_Hint : in Swagger.Nullable_UString;
       Default_Redirect_Url : in Swagger.Nullable_UString;
       Default_Redirect_Url_At_Type_Hint : in Swagger.Nullable_UString;
       User_I_D_Attribute : in Swagger.Nullable_UString;
       User_I_D_Attribute_At_Type_Hint : in Swagger.Nullable_UString;
       Default_Groups : in Swagger.UString_Vectors.Vector;
       Default_Groups_At_Type_Hint : in Swagger.Nullable_UString;
       Idp_Cert_Alias : in Swagger.Nullable_UString;
       Idp_Cert_Alias_At_Type_Hint : in Swagger.Nullable_UString;
       Add_Group_Memberships : in Swagger.Nullable_Boolean;
       Add_Group_Memberships_At_Type_Hint : in Swagger.Nullable_UString;
       Path : in Swagger.UString_Vectors.Vector;
       Path_At_Type_Hint : in Swagger.Nullable_UString;
       Synchronize_Attributes : in Swagger.UString_Vectors.Vector;
       Synchronize_Attributes_At_Type_Hint : in Swagger.Nullable_UString;
       Clock_Tolerance : in Swagger.Nullable_Integer;
       Clock_Tolerance_At_Type_Hint : in Swagger.Nullable_UString;
       Group_Membership_Attribute : in Swagger.Nullable_UString;
       Group_Membership_Attribute_At_Type_Hint : in Swagger.Nullable_UString;
       Idp_Url : in Swagger.Nullable_UString;
       Idp_Url_At_Type_Hint : in Swagger.Nullable_UString;
       Logout_Url : in Swagger.Nullable_UString;
       Logout_Url_At_Type_Hint : in Swagger.Nullable_UString;
       Service_Provider_Entity_Id : in Swagger.Nullable_UString;
       Service_Provider_Entity_Id_At_Type_Hint : in Swagger.Nullable_UString;
       Assertion_Consumer_Service_U_R_L : in Swagger.Nullable_UString;
       Assertion_Consumer_Service_U_R_L_At_Type_Hint : in Swagger.Nullable_UString;
       Handle_Logout : in Swagger.Nullable_Boolean;
       Handle_Logout_At_Type_Hint : in Swagger.Nullable_UString;
       Sp_Private_Key_Alias : in Swagger.Nullable_UString;
       Sp_Private_Key_Alias_At_Type_Hint : in Swagger.Nullable_UString;
       Use_Encryption : in Swagger.Nullable_Boolean;
       Use_Encryption_At_Type_Hint : in Swagger.Nullable_UString;
       Name_Id_Format : in Swagger.Nullable_UString;
       Name_Id_Format_At_Type_Hint : in Swagger.Nullable_UString;
       Digest_Method : in Swagger.Nullable_UString;
       Digest_Method_At_Type_Hint : in Swagger.Nullable_UString;
       Signature_Method : in Swagger.Nullable_UString;
       Signature_Method_At_Type_Hint : in Swagger.Nullable_UString;
       User_Intermediate_Path : in Swagger.Nullable_UString;
       User_Intermediate_Path_At_Type_Hint : in Swagger.Nullable_UString;
       Context : in out Swagger.Servers.Context_Type);

   --  
   overriding
   procedure Post_Config_Apache_Felix_Jetty_Based_Http_Service
      (Server : in out Server_Type;
       Org_Periodapache_Periodfelix_Periodhttps_Periodnio : in Swagger.Nullable_Boolean;
       Org_Periodapache_Periodfelix_Periodhttps_Periodnio_At_Type_Hint : in Swagger.Nullable_UString;
       Org_Periodapache_Periodfelix_Periodhttps_Periodkeystore : in Swagger.Nullable_UString;
       Org_Periodapache_Periodfelix_Periodhttps_Periodkeystore_At_Type_Hint : in Swagger.Nullable_UString;
       Org_Periodapache_Periodfelix_Periodhttps_Periodkeystore_Periodpassword : in Swagger.Nullable_UString;
       Org_Periodapache_Periodfelix_Periodhttps_Periodkeystore_Periodpassword_At_Type_Hint : in Swagger.Nullable_UString;
       Org_Periodapache_Periodfelix_Periodhttps_Periodkeystore_Periodkey : in Swagger.Nullable_UString;
       Org_Periodapache_Periodfelix_Periodhttps_Periodkeystore_Periodkey_At_Type_Hint : in Swagger.Nullable_UString;
       Org_Periodapache_Periodfelix_Periodhttps_Periodkeystore_Periodkey_Periodpassword : in Swagger.Nullable_UString;
       Org_Periodapache_Periodfelix_Periodhttps_Periodkeystore_Periodkey_Periodpassword_At_Type_Hint : in Swagger.Nullable_UString;
       Org_Periodapache_Periodfelix_Periodhttps_Periodtruststore : in Swagger.Nullable_UString;
       Org_Periodapache_Periodfelix_Periodhttps_Periodtruststore_At_Type_Hint : in Swagger.Nullable_UString;
       Org_Periodapache_Periodfelix_Periodhttps_Periodtruststore_Periodpassword : in Swagger.Nullable_UString;
       Org_Periodapache_Periodfelix_Periodhttps_Periodtruststore_Periodpassword_At_Type_Hint : in Swagger.Nullable_UString;
       Org_Periodapache_Periodfelix_Periodhttps_Periodclientcertificate : in Swagger.Nullable_UString;
       Org_Periodapache_Periodfelix_Periodhttps_Periodclientcertificate_At_Type_Hint : in Swagger.Nullable_UString;
       Org_Periodapache_Periodfelix_Periodhttps_Periodenable : in Swagger.Nullable_Boolean;
       Org_Periodapache_Periodfelix_Periodhttps_Periodenable_At_Type_Hint : in Swagger.Nullable_UString;
       Org_Periodosgi_Periodservice_Periodhttp_Periodport_Periodsecure : in Swagger.Nullable_UString;
       Org_Periodosgi_Periodservice_Periodhttp_Periodport_Periodsecure_At_Type_Hint : in Swagger.Nullable_UString;
       Context : in out Swagger.Servers.Context_Type);

   --  
   overriding
   procedure Post_Config_Apache_Http_Components_Proxy_Configuration
      (Server : in out Server_Type;
       Proxy_Periodhost : in Swagger.Nullable_UString;
       Proxy_Periodhost_At_Type_Hint : in Swagger.Nullable_UString;
       Proxy_Periodport : in Swagger.Nullable_Integer;
       Proxy_Periodport_At_Type_Hint : in Swagger.Nullable_UString;
       Proxy_Periodexceptions : in Swagger.UString_Vectors.Vector;
       Proxy_Periodexceptions_At_Type_Hint : in Swagger.Nullable_UString;
       Proxy_Periodenabled : in Swagger.Nullable_Boolean;
       Proxy_Periodenabled_At_Type_Hint : in Swagger.Nullable_UString;
       Proxy_Perioduser : in Swagger.Nullable_UString;
       Proxy_Perioduser_At_Type_Hint : in Swagger.Nullable_UString;
       Proxy_Periodpassword : in Swagger.Nullable_UString;
       Proxy_Periodpassword_At_Type_Hint : in Swagger.Nullable_UString;
       Context : in out Swagger.Servers.Context_Type);

   --  
   overriding
   procedure Post_Config_Apache_Sling_Dav_Ex_Servlet
      (Server : in out Server_Type;
       Alias : in Swagger.Nullable_UString;
       Alias_At_Type_Hint : in Swagger.Nullable_UString;
       Dav_Periodcreate_Absolute_Uri : in Swagger.Nullable_Boolean;
       Dav_Periodcreate_Absolute_Uri_At_Type_Hint : in Swagger.Nullable_UString;
       Context : in out Swagger.Servers.Context_Type);

   --  
   overriding
   procedure Post_Config_Apache_Sling_Get_Servlet
      (Server : in out Server_Type;
       Json_Periodmaximumresults : in Swagger.Nullable_UString;
       Json_Periodmaximumresults_At_Type_Hint : in Swagger.Nullable_UString;
       Enable_Periodhtml : in Swagger.Nullable_Boolean;
       Enable_Periodhtml_At_Type_Hint : in Swagger.Nullable_UString;
       Enable_Periodtxt : in Swagger.Nullable_Boolean;
       Enable_Periodtxt_At_Type_Hint : in Swagger.Nullable_UString;
       Enable_Periodxml : in Swagger.Nullable_Boolean;
       Enable_Periodxml_At_Type_Hint : in Swagger.Nullable_UString;
       Context : in out Swagger.Servers.Context_Type);

   --  
   overriding
   procedure Post_Config_Apache_Sling_Referrer_Filter
      (Server : in out Server_Type;
       Allow_Periodempty : in Swagger.Nullable_Boolean;
       Allow_Periodempty_At_Type_Hint : in Swagger.Nullable_UString;
       Allow_Periodhosts : in Swagger.Nullable_UString;
       Allow_Periodhosts_At_Type_Hint : in Swagger.Nullable_UString;
       Allow_Periodhosts_Periodregexp : in Swagger.Nullable_UString;
       Allow_Periodhosts_Periodregexp_At_Type_Hint : in Swagger.Nullable_UString;
       Filter_Periodmethods : in Swagger.Nullable_UString;
       Filter_Periodmethods_At_Type_Hint : in Swagger.Nullable_UString;
       Context : in out Swagger.Servers.Context_Type);

   --  
   overriding
   procedure Post_Node
      (Server : in out Server_Type;
       Path : in Swagger.UString;
       Name : in Swagger.UString;
       Operation : in Swagger.Nullable_UString;
       Delete_Authorizable : in Swagger.Nullable_UString;
       File : in Swagger.File_Part_Type;
       Context : in out Swagger.Servers.Context_Type);

   --  
   overriding
   procedure Post_Node_Rw
      (Server : in out Server_Type;
       Path : in Swagger.UString;
       Name : in Swagger.UString;
       Add_Members : in Swagger.Nullable_UString;
       Context : in out Swagger.Servers.Context_Type);

   --  
   overriding
   procedure Post_Path
      (Server : in out Server_Type;
       Path : in Swagger.UString;
       Jcr_Primary_Type : in Swagger.UString;
       Name : in Swagger.UString;
       Context : in out Swagger.Servers.Context_Type);

   --  
   overriding
   procedure Post_Query
      (Server : in out Server_Type;
       Path : in Swagger.UString;
       P_Periodlimit : in Swagger.Number;
       1_Property : in Swagger.UString;
       1_Property_Periodvalue : in Swagger.UString;
       Result  : out Swagger.UString;
       Context : in out Swagger.Servers.Context_Type);

   --  
   overriding
   procedure Post_Tree_Activation
      (Server : in out Server_Type;
       Ignoredeactivated : in Boolean;
       Onlymodified : in Boolean;
       Path : in Swagger.UString;
       Context : in out Swagger.Servers.Context_Type);

   --  
   overriding
   procedure Post_Truststore
      (Server : in out Server_Type;
       Operation : in Swagger.Nullable_UString;
       New_Password : in Swagger.Nullable_UString;
       Re_Password : in Swagger.Nullable_UString;
       Key_Store_Type : in Swagger.Nullable_UString;
       Remove_Alias : in Swagger.Nullable_UString;
       Certificate : in Swagger.File_Part_Type;
       Result  : out Swagger.UString;
       Context : in out Swagger.Servers.Context_Type);

   --  
   overriding
   procedure Post_Truststore_P_K_C_S12
      (Server : in out Server_Type;
       Truststore_Periodp12 : in Swagger.File_Part_Type;
       Result  : out Swagger.UString;
       Context : in out Swagger.Servers.Context_Type);

   package Server_Impl is
      new .Skeletons.Shared_Instance (Server_Type);

end .Servers;
