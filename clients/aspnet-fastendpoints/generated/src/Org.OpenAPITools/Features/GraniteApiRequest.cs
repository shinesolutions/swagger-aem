
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class SslSetupRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("keystorePassword")]
    public string KeystorePassword { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("keystorePasswordConfirm")]
    public string KeystorePasswordConfirm { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("truststorePassword")]
    public string TruststorePassword { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("truststorePasswordConfirm")]
    public string TruststorePasswordConfirm { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("httpsHostname")]
    public string HttpsHostname { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("httpsPort")]
    public string HttpsPort { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("privatekeyFile")]
    public System.IO.Stream? PrivatekeyFile { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("certificateFile")]
    public System.IO.Stream? CertificateFile { get; set; }
}


