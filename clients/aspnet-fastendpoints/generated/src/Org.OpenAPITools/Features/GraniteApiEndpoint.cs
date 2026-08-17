using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// 
/// </summary>

public class SslSetupEndpoint : FastEndpoints.Endpoint<SslSetupRequest, string>
{
    public override void Configure()
    {
        Post("/libs/granite/security/post/sslSetup.html");
        
        
        AllowAnonymous();
        AllowFileUploads();AllowFileUploads();
        Description(x =>
        {
            x.WithTags("granite");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "";
            s.RequestParam(r => r.KeystorePassword, "");
            s.RequestParam(r => r.KeystorePasswordConfirm, "");
            s.RequestParam(r => r.TruststorePassword, "");
            s.RequestParam(r => r.TruststorePasswordConfirm, "");
            s.RequestParam(r => r.HttpsHostname, "");
            s.RequestParam(r => r.HttpsPort, "");
            s.RequestParam(r => r.PrivatekeyFile, "");
            s.RequestParam(r => r.CertificateFile, "");
            s.Responses[0] = "Default response";
        });
    }

    public override async Task HandleAsync(SslSetupRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

