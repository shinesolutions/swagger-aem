
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class GetLoginPageRequest
{
}
public class PostCqActionsRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("authorizableId")]
    public string AuthorizableId { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("changelog")]
    public string Changelog { get; set; }
}


