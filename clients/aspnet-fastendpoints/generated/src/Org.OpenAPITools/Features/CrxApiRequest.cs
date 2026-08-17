
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class GetCrxdeStatusRequest
{
}
public class GetInstallStatusRequest
{
}
public class GetPackageManagerServletRequest
{
}
public class PostPackageServiceRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("cmd")]
    public string Cmd { get; set; }
}
public class PostPackageServiceJsonRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("path")]
    public string Path { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("cmd")]
    public string Cmd { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("groupName")]
    public string? GroupName { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("packageName")]
    public string? PackageName { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("packageVersion")]
    public string? PackageVersion { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("_charset_")]
    public string? Charset { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("force")]
    public bool? Force { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("recursive")]
    public bool? Recursive { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("package")]
    public System.IO.Stream? Package { get; set; }
}
public class PostPackageUpdateRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("groupName")]
    public string GroupName { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("packageName")]
    public string PackageName { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("version")]
    public string Version { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("path")]
    public string Path { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("filter")]
    public string? Filter { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("_charset_")]
    public string? Charset { get; set; }
}
public class PostSetPasswordRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("old")]
    public string Old { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("plain")]
    public string Plain { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("verify")]
    public string Verify { get; set; }
}


