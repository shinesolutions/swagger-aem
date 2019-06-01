
# SamlConfigurationProperties

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**path** | [**List&lt;SamlConfigurationPropertyItemsArray&gt;**](SamlConfigurationPropertyItemsArray.md) | Repository path for which this authentication handler should be used by Sling. If this is empty, the authentication handler will be disabled. |  [optional]
**serviceRanking** | [**List&lt;SamlConfigurationPropertyItemsLong&gt;**](SamlConfigurationPropertyItemsLong.md) | OSGi Framework Service Ranking value to indicate the order in which to call this service. This is an int value where higher values designate higher precedence. Default value is 0. |  [optional]
**idpUrl** | [**List&lt;SamlConfigurationPropertyItemsString&gt;**](SamlConfigurationPropertyItemsString.md) | URL of the IDP where the SAML Authentication Request should be sent to. If this property is empty the authentication handler is disabled. (idpUrl) |  [optional]
**idpCertAlias** | [**List&lt;SamlConfigurationPropertyItemsString&gt;**](SamlConfigurationPropertyItemsString.md) | The alias of the IdP&#39;s certificate in the global truststore. If this property is empty the authentication handler is disabled. |  [optional]
**idpHttpRedirect** | [**List&lt;SamlConfigurationPropertyItemsBoolean&gt;**](SamlConfigurationPropertyItemsBoolean.md) | Use an HTTP Redirect to the IDP URL instead of sending an AuthnRequest-message to request credentials. Use this for IDP initiated authentication. |  [optional]
**serviceProviderEntityId** | [**List&lt;SamlConfigurationPropertyItemsString&gt;**](SamlConfigurationPropertyItemsString.md) | ID which uniquely identifies this service provider with the identity provider. If this property is empty the authentication handler is disabled. |  [optional]
**assertionConsumerServiceURL** | [**List&lt;SamlConfigurationPropertyItemsString&gt;**](SamlConfigurationPropertyItemsString.md) | The (optional) AssertionConsumerServiceURL attribute of an Authn request specifies the location to which a &lt;Response&gt; message MUST be sent to the requester. |  [optional]
**spPrivateKeyAlias** | [**List&lt;SamlConfigurationPropertyItemsString&gt;**](SamlConfigurationPropertyItemsString.md) | The alias of the SP&#39;s private key in the key-store of the &#39;authentication-service&#39; system user. If this property is empty the handler will not be able to sign or decrypt messages. |  [optional]
**keyStorePassword** | [**List&lt;SamlConfigurationPropertyItemsString&gt;**](SamlConfigurationPropertyItemsString.md) | The password of the key-store of the &#39;authentication-service&#39; system user. |  [optional]
**defaultRedirectUrl** | [**List&lt;SamlConfigurationPropertyItemsString&gt;**](SamlConfigurationPropertyItemsString.md) | The default location to redirect to after successful authentication. |  [optional]
**userIDAttribute** | [**List&lt;SamlConfigurationPropertyItemsString&gt;**](SamlConfigurationPropertyItemsString.md) | The name of the attribute containing the user ID used to authenticate and create the user in the CRX repository. Leave empty to use the Subject:NameId. |  [optional]
**useEncryption** | [**List&lt;SamlConfigurationPropertyItemsBoolean&gt;**](SamlConfigurationPropertyItemsBoolean.md) | Whether or not this authentication handler expects encrypted SAML assertions. If this is enabled the SP&#39;s private key must be provided in the key-store of the &#39;authentication-service&#39; system user (see SP Private Key Alias above). |  [optional]
**createUser** | [**List&lt;SamlConfigurationPropertyItemsBoolean&gt;**](SamlConfigurationPropertyItemsBoolean.md) | Whether or not to autocreate nonexisting users in the repository. |  [optional]
**addGroupMemberships** | [**List&lt;SamlConfigurationPropertyItemsBoolean&gt;**](SamlConfigurationPropertyItemsBoolean.md) | Whether or not a user should be automatically added to CRX groups after successful authentication. |  [optional]
**groupMembershipAttribute** | [**List&lt;SamlConfigurationPropertyItemsString&gt;**](SamlConfigurationPropertyItemsString.md) | The name of the attribute containing a list of CRX groups this user should be added to. |  [optional]
**defaultGroups** | [**List&lt;SamlConfigurationPropertyItemsArray&gt;**](SamlConfigurationPropertyItemsArray.md) | A list of default CRX groups users are added to after successful authentication. |  [optional]
**nameIdFormat** | [**List&lt;SamlConfigurationPropertyItemsString&gt;**](SamlConfigurationPropertyItemsString.md) | The value of the NameIDPolicy format parameter to send in the AuthnRequest message. |  [optional]
**synchronizeAttributes** | [**List&lt;SamlConfigurationPropertyItemsArray&gt;**](SamlConfigurationPropertyItemsArray.md) | A list of attribute mappings (in the format \\attributename&#x3D;path/relative/to/user/node\\) which should be stored in the repository on user-synchronization. |  [optional]
**handleLogout** | [**List&lt;SamlConfigurationPropertyItemsBoolean&gt;**](SamlConfigurationPropertyItemsBoolean.md) | Whether or not logout (dropCredentials) requests will be processed by this handler. |  [optional]
**logoutUrl** | [**List&lt;SamlConfigurationPropertyItemsString&gt;**](SamlConfigurationPropertyItemsString.md) | URL of the IDP where the SAML Logout Request should be sent to. If this property is empty the authentication handler won&#39;t handle logouts. |  [optional]
**clockTolerance** | [**List&lt;SamlConfigurationPropertyItemsLong&gt;**](SamlConfigurationPropertyItemsLong.md) | Time tolerance in seconds to compensate clock skew between IDP and SP when validating Assertions. |  [optional]
**digestMethod** | [**List&lt;SamlConfigurationPropertyItemsString&gt;**](SamlConfigurationPropertyItemsString.md) | The digest algorithm to use when signing a SAML message. |  [optional]
**signatureMethod** | [**List&lt;SamlConfigurationPropertyItemsString&gt;**](SamlConfigurationPropertyItemsString.md) | The signature algorithm to use when signing a SAML message. |  [optional]
**userIntermediatePath** | [**List&lt;SamlConfigurationPropertyItemsString&gt;**](SamlConfigurationPropertyItemsString.md) | User intermediate path to store created users. |  [optional]



