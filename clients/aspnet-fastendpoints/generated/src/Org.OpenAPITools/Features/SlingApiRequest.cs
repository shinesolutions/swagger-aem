
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class DeleteAgentRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("runmode")]
    public string Runmode { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("name")]
    public string Name { get; set; }
}
public class DeleteNodeRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("path")]
    public string Path { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("name")]
    public string Name { get; set; }
}
public class GetAgentRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("runmode")]
    public string Runmode { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("name")]
    public string Name { get; set; }
}
public class GetAgentsRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("runmode")]
    public string Runmode { get; set; }
}
public class GetAuthorizableKeystoreRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("intermediatePath")]
    public string IntermediatePath { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("authorizableId")]
    public string AuthorizableId { get; set; }
}
public class GetKeystoreRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("intermediatePath")]
    public string IntermediatePath { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("authorizableId")]
    public string AuthorizableId { get; set; }
}
public class GetNodeRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("path")]
    public string Path { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("name")]
    public string Name { get; set; }
}
public class GetPackageRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("group")]
    public string Group { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("name")]
    public string Name { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public string Version { get; set; }
}
public class GetPackageFilterRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("group")]
    public string Group { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("name")]
    public string Name { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public string Version { get; set; }
}
public class GetQueryRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("path")]
    public string Path { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("p.limit")]
    public decimal PLimit { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("1_property")]
    public string Var1property { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("1_property.value")]
    public string Var1propertyValue { get; set; }
}
public class GetTruststoreRequest
{
}
public class GetTruststoreInfoRequest
{
}
public class PostAgentRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("runmode")]
    public string Runmode { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("name")]
    public string Name { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("jcr:content/cq:distribute")]
    public bool? JcrContentCqDistribute { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("jcr:content/cq:distribute@TypeHint")]
    public string? JcrContentCqDistributeTypeHint { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("jcr:content/cq:name")]
    public string? JcrContentCqName { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("jcr:content/cq:template")]
    public string? JcrContentCqTemplate { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("jcr:content/aliasUpdate")]
    public bool? JcrContentAliasUpdate { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("jcr:content/enabled")]
    public bool? JcrContentEnabled { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("jcr:content/jcr:description")]
    public string? JcrContentJcrDescription { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("jcr:content/jcr:lastModified")]
    public string? JcrContentJcrLastModified { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("jcr:content/jcr:lastModifiedBy")]
    public string? JcrContentJcrLastModifiedBy { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("jcr:content/jcr:mixinTypes")]
    public string? JcrContentJcrMixinTypes { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("jcr:content/jcr:title")]
    public string? JcrContentJcrTitle { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("jcr:content/logLevel")]
    public string? JcrContentLogLevel { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("jcr:content/noStatusUpdate")]
    public bool? JcrContentNoStatusUpdate { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("jcr:content/noVersioning")]
    public bool? JcrContentNoVersioning { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("jcr:content/protocolConnectTimeout")]
    public decimal? JcrContentProtocolConnectTimeout { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("jcr:content/protocolHTTPConnectionClosed")]
    public bool? JcrContentProtocolHTTPConnectionClosed { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("jcr:content/protocolHTTPExpired")]
    public string? JcrContentProtocolHTTPExpired { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("jcr:content/protocolHTTPHeaders")]
    public List<string>? JcrContentProtocolHTTPHeaders { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("jcr:content/protocolHTTPHeaders@TypeHint")]
    public string? JcrContentProtocolHTTPHeadersTypeHint { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("jcr:content/protocolHTTPMethod")]
    public string? JcrContentProtocolHTTPMethod { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("jcr:content/protocolHTTPSRelaxed")]
    public bool? JcrContentProtocolHTTPSRelaxed { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("jcr:content/protocolInterface")]
    public string? JcrContentProtocolInterface { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("jcr:content/protocolSocketTimeout")]
    public decimal? JcrContentProtocolSocketTimeout { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("jcr:content/protocolVersion")]
    public string? JcrContentProtocolVersion { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("jcr:content/proxyNTLMDomain")]
    public string? JcrContentProxyNTLMDomain { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("jcr:content/proxyNTLMHost")]
    public string? JcrContentProxyNTLMHost { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("jcr:content/proxyHost")]
    public string? JcrContentProxyHost { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("jcr:content/proxyPassword")]
    public string? JcrContentProxyPassword { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("jcr:content/proxyPort")]
    public decimal? JcrContentProxyPort { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("jcr:content/proxyUser")]
    public string? JcrContentProxyUser { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("jcr:content/queueBatchMaxSize")]
    public decimal? JcrContentQueueBatchMaxSize { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("jcr:content/queueBatchMode")]
    public string? JcrContentQueueBatchMode { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("jcr:content/queueBatchWaitTime")]
    public decimal? JcrContentQueueBatchWaitTime { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("jcr:content/retryDelay")]
    public string? JcrContentRetryDelay { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("jcr:content/reverseReplication")]
    public bool? JcrContentReverseReplication { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("jcr:content/serializationType")]
    public string? JcrContentSerializationType { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("jcr:content/sling:resourceType")]
    public string? JcrContentSlingResourceType { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("jcr:content/ssl")]
    public string? JcrContentSsl { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("jcr:content/transportNTLMDomain")]
    public string? JcrContentTransportNTLMDomain { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("jcr:content/transportNTLMHost")]
    public string? JcrContentTransportNTLMHost { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("jcr:content/transportPassword")]
    public string? JcrContentTransportPassword { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("jcr:content/transportUri")]
    public string? JcrContentTransportUri { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("jcr:content/transportUser")]
    public string? JcrContentTransportUser { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("jcr:content/triggerDistribute")]
    public bool? JcrContentTriggerDistribute { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("jcr:content/triggerModified")]
    public bool? JcrContentTriggerModified { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("jcr:content/triggerOnOffTime")]
    public bool? JcrContentTriggerOnOffTime { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("jcr:content/triggerReceive")]
    public bool? JcrContentTriggerReceive { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("jcr:content/triggerSpecific")]
    public bool? JcrContentTriggerSpecific { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("jcr:content/userId")]
    public string? JcrContentUserId { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("jcr:primaryType")]
    public string? JcrPrimaryType { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom(":operation")]
    public string? Operation { get; set; }
}
public class PostAuthorizableKeystoreRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("intermediatePath")]
    public string IntermediatePath { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("authorizableId")]
    public string AuthorizableId { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom(":operation")]
    public string? Operation { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("currentPassword")]
    public string? CurrentPassword { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("newPassword")]
    public string? NewPassword { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("rePassword")]
    public string? RePassword { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("keyPassword")]
    public string? KeyPassword { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("keyStorePass")]
    public string? KeyStorePass { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("alias")]
    public string? Alias { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("newAlias")]
    public string? NewAlias { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("removeAlias")]
    public string? RemoveAlias { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("cert-chain")]
    public System.IO.Stream? CertChain { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("pk")]
    public System.IO.Stream? Pk { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("keyStore")]
    public System.IO.Stream? KeyStore { get; set; }
}
public class PostAuthorizablesRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("authorizableId")]
    public string AuthorizableId { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("intermediatePath")]
    public string IntermediatePath { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("createUser")]
    public string? CreateUser { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("createGroup")]
    public string? CreateGroup { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("rep:password")]
    public string? RepPassword { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("profile/givenName")]
    public string? ProfileGivenName { get; set; }
}
public class PostConfigAdobeGraniteSamlAuthenticationHandlerRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("keyStorePassword")]
    public string? KeyStorePassword { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("keyStorePassword@TypeHint")]
    public string? KeyStorePasswordTypeHint { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("service.ranking")]
    public int? ServiceRanking { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("service.ranking@TypeHint")]
    public string? ServiceRankingTypeHint { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("idpHttpRedirect")]
    public bool? IdpHttpRedirect { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("idpHttpRedirect@TypeHint")]
    public string? IdpHttpRedirectTypeHint { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("createUser")]
    public bool? CreateUser { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("createUser@TypeHint")]
    public string? CreateUserTypeHint { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("defaultRedirectUrl")]
    public string? DefaultRedirectUrl { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("defaultRedirectUrl@TypeHint")]
    public string? DefaultRedirectUrlTypeHint { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("userIDAttribute")]
    public string? UserIDAttribute { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("userIDAttribute@TypeHint")]
    public string? UserIDAttributeTypeHint { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("defaultGroups")]
    public List<string>? DefaultGroups { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("defaultGroups@TypeHint")]
    public string? DefaultGroupsTypeHint { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("idpCertAlias")]
    public string? IdpCertAlias { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("idpCertAlias@TypeHint")]
    public string? IdpCertAliasTypeHint { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("addGroupMemberships")]
    public bool? AddGroupMemberships { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("addGroupMemberships@TypeHint")]
    public string? AddGroupMembershipsTypeHint { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("path")]
    public List<string>? Path { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("path@TypeHint")]
    public string? PathTypeHint { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("synchronizeAttributes")]
    public List<string>? SynchronizeAttributes { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("synchronizeAttributes@TypeHint")]
    public string? SynchronizeAttributesTypeHint { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("clockTolerance")]
    public int? ClockTolerance { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("clockTolerance@TypeHint")]
    public string? ClockToleranceTypeHint { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("groupMembershipAttribute")]
    public string? GroupMembershipAttribute { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("groupMembershipAttribute@TypeHint")]
    public string? GroupMembershipAttributeTypeHint { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("idpUrl")]
    public string? IdpUrl { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("idpUrl@TypeHint")]
    public string? IdpUrlTypeHint { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("logoutUrl")]
    public string? LogoutUrl { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("logoutUrl@TypeHint")]
    public string? LogoutUrlTypeHint { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("serviceProviderEntityId")]
    public string? ServiceProviderEntityId { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("serviceProviderEntityId@TypeHint")]
    public string? ServiceProviderEntityIdTypeHint { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assertionConsumerServiceURL")]
    public string? AssertionConsumerServiceURL { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assertionConsumerServiceURL@TypeHint")]
    public string? AssertionConsumerServiceURLTypeHint { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("handleLogout")]
    public bool? HandleLogout { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("handleLogout@TypeHint")]
    public string? HandleLogoutTypeHint { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("spPrivateKeyAlias")]
    public string? SpPrivateKeyAlias { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("spPrivateKeyAlias@TypeHint")]
    public string? SpPrivateKeyAliasTypeHint { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("useEncryption")]
    public bool? UseEncryption { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("useEncryption@TypeHint")]
    public string? UseEncryptionTypeHint { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("nameIdFormat")]
    public string? NameIdFormat { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("nameIdFormat@TypeHint")]
    public string? NameIdFormatTypeHint { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("digestMethod")]
    public string? DigestMethod { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("digestMethod@TypeHint")]
    public string? DigestMethodTypeHint { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("signatureMethod")]
    public string? SignatureMethod { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("signatureMethod@TypeHint")]
    public string? SignatureMethodTypeHint { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("userIntermediatePath")]
    public string? UserIntermediatePath { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("userIntermediatePath@TypeHint")]
    public string? UserIntermediatePathTypeHint { get; set; }
}
public class PostConfigApacheFelixJettyBasedHttpServiceRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("org.apache.felix.https.nio")]
    public bool? OrgApacheFelixHttpsNio { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("org.apache.felix.https.nio@TypeHint")]
    public string? OrgApacheFelixHttpsNioTypeHint { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("org.apache.felix.https.keystore")]
    public string? OrgApacheFelixHttpsKeystore { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("org.apache.felix.https.keystore@TypeHint")]
    public string? OrgApacheFelixHttpsKeystoreTypeHint { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("org.apache.felix.https.keystore.password")]
    public string? OrgApacheFelixHttpsKeystorePassword { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("org.apache.felix.https.keystore.password@TypeHint")]
    public string? OrgApacheFelixHttpsKeystorePasswordTypeHint { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("org.apache.felix.https.keystore.key")]
    public string? OrgApacheFelixHttpsKeystoreKey { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("org.apache.felix.https.keystore.key@TypeHint")]
    public string? OrgApacheFelixHttpsKeystoreKeyTypeHint { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("org.apache.felix.https.keystore.key.password")]
    public string? OrgApacheFelixHttpsKeystoreKeyPassword { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("org.apache.felix.https.keystore.key.password@TypeHint")]
    public string? OrgApacheFelixHttpsKeystoreKeyPasswordTypeHint { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("org.apache.felix.https.truststore")]
    public string? OrgApacheFelixHttpsTruststore { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("org.apache.felix.https.truststore@TypeHint")]
    public string? OrgApacheFelixHttpsTruststoreTypeHint { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("org.apache.felix.https.truststore.password")]
    public string? OrgApacheFelixHttpsTruststorePassword { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("org.apache.felix.https.truststore.password@TypeHint")]
    public string? OrgApacheFelixHttpsTruststorePasswordTypeHint { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("org.apache.felix.https.clientcertificate")]
    public string? OrgApacheFelixHttpsClientcertificate { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("org.apache.felix.https.clientcertificate@TypeHint")]
    public string? OrgApacheFelixHttpsClientcertificateTypeHint { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("org.apache.felix.https.enable")]
    public bool? OrgApacheFelixHttpsEnable { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("org.apache.felix.https.enable@TypeHint")]
    public string? OrgApacheFelixHttpsEnableTypeHint { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("org.osgi.service.http.port.secure")]
    public string? OrgOsgiServiceHttpPortSecure { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("org.osgi.service.http.port.secure@TypeHint")]
    public string? OrgOsgiServiceHttpPortSecureTypeHint { get; set; }
}
public class PostConfigApacheHttpComponentsProxyConfigurationRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("proxy.host")]
    public string? ProxyHost { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("proxy.host@TypeHint")]
    public string? ProxyHostTypeHint { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("proxy.port")]
    public int? ProxyPort { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("proxy.port@TypeHint")]
    public string? ProxyPortTypeHint { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("proxy.exceptions")]
    public List<string>? ProxyExceptions { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("proxy.exceptions@TypeHint")]
    public string? ProxyExceptionsTypeHint { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("proxy.enabled")]
    public bool? ProxyEnabled { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("proxy.enabled@TypeHint")]
    public string? ProxyEnabledTypeHint { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("proxy.user")]
    public string? ProxyUser { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("proxy.user@TypeHint")]
    public string? ProxyUserTypeHint { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("proxy.password")]
    public string? ProxyPassword { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("proxy.password@TypeHint")]
    public string? ProxyPasswordTypeHint { get; set; }
}
public class PostConfigApacheSlingDavExServletRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("alias")]
    public string? Alias { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("alias@TypeHint")]
    public string? AliasTypeHint { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("dav.create-absolute-uri")]
    public bool? DavCreateAbsoluteUri { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("dav.create-absolute-uri@TypeHint")]
    public string? DavCreateAbsoluteUriTypeHint { get; set; }
}
public class PostConfigApacheSlingGetServletRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("json.maximumresults")]
    public string? JsonMaximumresults { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("json.maximumresults@TypeHint")]
    public string? JsonMaximumresultsTypeHint { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("enable.html")]
    public bool? EnableHtml { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("enable.html@TypeHint")]
    public string? EnableHtmlTypeHint { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("enable.txt")]
    public bool? EnableTxt { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("enable.txt@TypeHint")]
    public string? EnableTxtTypeHint { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("enable.xml")]
    public bool? EnableXml { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("enable.xml@TypeHint")]
    public string? EnableXmlTypeHint { get; set; }
}
public class PostConfigApacheSlingReferrerFilterRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("allow.empty")]
    public bool? AllowEmpty { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("allow.empty@TypeHint")]
    public string? AllowEmptyTypeHint { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("allow.hosts")]
    public string? AllowHosts { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("allow.hosts@TypeHint")]
    public string? AllowHostsTypeHint { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("allow.hosts.regexp")]
    public string? AllowHostsRegexp { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("allow.hosts.regexp@TypeHint")]
    public string? AllowHostsRegexpTypeHint { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("filter.methods")]
    public string? FilterMethods { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("filter.methods@TypeHint")]
    public string? FilterMethodsTypeHint { get; set; }
}
public class PostConfigPropertyRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("configNodeName")]
    public string ConfigNodeName { get; set; }
}
public class PostNodeRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("path")]
    public string Path { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("name")]
    public string Name { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom(":operation")]
    public string? Operation { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deleteAuthorizable")]
    public string? DeleteAuthorizable { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("file")]
    public System.IO.Stream? File { get; set; }
}
public class PostNodeRwRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("path")]
    public string Path { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("name")]
    public string Name { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("addMembers")]
    public string? AddMembers { get; set; }
}
public class PostPathRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("path")]
    public string Path { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("jcr:primaryType")]
    public string JcrPrimaryType { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom(":name")]
    public string Name { get; set; }
}
public class PostQueryRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("path")]
    public string Path { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("p.limit")]
    public decimal PLimit { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("1_property")]
    public string Var1property { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("1_property.value")]
    public string Var1propertyValue { get; set; }
}
public class PostTreeActivationRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ignoredeactivated")]
    public bool Ignoredeactivated { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("onlymodified")]
    public bool Onlymodified { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("path")]
    public string Path { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("cmd")]
    public string Cmd { get; set; }
}
public class PostTruststoreRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom(":operation")]
    public string? Operation { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("newPassword")]
    public string? NewPassword { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("rePassword")]
    public string? RePassword { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("keyStoreType")]
    public string? KeyStoreType { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("removeAlias")]
    public string? RemoveAlias { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("certificate")]
    public System.IO.Stream? Certificate { get; set; }
}
public class PostTruststorePKCS12Request
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("truststore.p12")]
    public System.IO.Stream? TruststoreP12 { get; set; }
}


