using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// 
/// </summary>

public class GetLoginPageEndpoint : FastEndpoints.EndpointWithoutRequest<string>
{
    public override void Configure()
    {
        Get("/libs/granite/core/content/login.html");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("cq");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "";
            s.Responses[0] = "Default response";
        });
    }

    public override async Task HandleAsync(CancellationToken ct)
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

public class PostCqActionsEndpoint : FastEndpoints.Endpoint<PostCqActionsRequest>
{
    public override void Configure()
    {
        Post("/.cqactions.html");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("cq");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "";
            s.RequestParam(r => r.AuthorizableId, "");
            s.RequestParam(r => r.Changelog, "");
            s.Responses[0] = "Default response";
        });
    }

    public override async Task HandleAsync(PostCqActionsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

