
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class GetAemHealthCheckRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("tags")]
    public string? Tags { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("combineTagsOr")]
    public bool? CombineTagsOr { get; set; }
}
public class PostConfigAemHealthCheckServletRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("bundles.ignored")]
    public List<string>? BundlesIgnored { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("bundles.ignored@TypeHint")]
    public string? BundlesIgnoredTypeHint { get; set; }
}
public class PostConfigAemPasswordResetRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("pwdreset.authorizables")]
    public List<string>? PwdresetAuthorizables { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("pwdreset.authorizables@TypeHint")]
    public string? PwdresetAuthorizablesTypeHint { get; set; }
}


