using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// 
/// </summary>

public class GetAemHealthCheckEndpoint : FastEndpoints.Endpoint<GetAemHealthCheckRequest, string>
{
    public override void Configure()
    {
        Get("/system/health");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("custom");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "";
            s.RequestParam(r => r.Tags, "");
            s.RequestParam(r => r.CombineTagsOr, "");
            s.Responses[0] = "Default response";
        });
    }

    public override async Task HandleAsync(GetAemHealthCheckRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// 
/// </summary>

public class PostConfigAemHealthCheckServletEndpoint : FastEndpoints.Endpoint<PostConfigAemHealthCheckServletRequest>
{
    public override void Configure()
    {
        Post("/apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("custom");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "";
            s.RequestParam(r => r.BundlesIgnored, "");
            s.RequestParam(r => r.BundlesIgnoredTypeHint, "");
            s.Responses[0] = "Default response";
        });
    }

    public override async Task HandleAsync(PostConfigAemHealthCheckServletRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// 
/// </summary>

public class PostConfigAemPasswordResetEndpoint : FastEndpoints.Endpoint<PostConfigAemPasswordResetRequest>
{
    public override void Configure()
    {
        Post("/apps/system/config/com.shinesolutions.aem.passwordreset.Activator");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("custom");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "";
            s.RequestParam(r => r.PwdresetAuthorizables, "");
            s.RequestParam(r => r.PwdresetAuthorizablesTypeHint, "");
            s.Responses[0] = "Default response";
        });
    }

    public override async Task HandleAsync(PostConfigAemPasswordResetRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

