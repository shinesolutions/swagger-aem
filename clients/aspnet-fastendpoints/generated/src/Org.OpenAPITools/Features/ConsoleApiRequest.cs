
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class GetAemProductInfoRequest
{
}
public class GetBundleInfoRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("name")]
    public string Name { get; set; }
}
public class GetConfigMgrRequest
{
}
public class PostBundleRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("name")]
    public string Name { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("action")]
    public string Action { get; set; }
}
public class PostJmxRepositoryRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("action")]
    public string Action { get; set; }
}
public class PostSamlConfigurationRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("post")]
    public bool? Post { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("apply")]
    public bool? Apply { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("delete")]
    public bool? Delete { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("action")]
    public string? Action { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("$location")]
    public string? Location { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("path")]
    public List<string>? Path { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("service.ranking")]
    public int? ServiceRanking { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("idpUrl")]
    public string? IdpUrl { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("idpCertAlias")]
    public string? IdpCertAlias { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("idpHttpRedirect")]
    public bool? IdpHttpRedirect { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("serviceProviderEntityId")]
    public string? ServiceProviderEntityId { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assertionConsumerServiceURL")]
    public string? AssertionConsumerServiceURL { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("spPrivateKeyAlias")]
    public string? SpPrivateKeyAlias { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("keyStorePassword")]
    public string? KeyStorePassword { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("defaultRedirectUrl")]
    public string? DefaultRedirectUrl { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("userIDAttribute")]
    public string? UserIDAttribute { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("useEncryption")]
    public bool? UseEncryption { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("createUser")]
    public bool? CreateUser { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("addGroupMemberships")]
    public bool? AddGroupMemberships { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("groupMembershipAttribute")]
    public string? GroupMembershipAttribute { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("defaultGroups")]
    public List<string>? DefaultGroups { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("nameIdFormat")]
    public string? NameIdFormat { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("synchronizeAttributes")]
    public List<string>? SynchronizeAttributes { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("handleLogout")]
    public bool? HandleLogout { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("logoutUrl")]
    public string? LogoutUrl { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("clockTolerance")]
    public int? ClockTolerance { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("digestMethod")]
    public string? DigestMethod { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("signatureMethod")]
    public string? SignatureMethod { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("userIntermediatePath")]
    public string? UserIntermediatePath { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("propertylist")]
    public List<string>? Propertylist { get; set; }
}


