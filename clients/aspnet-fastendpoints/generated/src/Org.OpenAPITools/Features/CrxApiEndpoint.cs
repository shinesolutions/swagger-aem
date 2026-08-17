using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// 
/// </summary>

public class GetCrxdeStatusEndpoint : FastEndpoints.EndpointWithoutRequest<string>
{
    public override void Configure()
    {
        Get("/crx/server/crx.default/jcr:root/.1.json");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("crx");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 404);
        });

        Summary(s => {
            s.Summary = "";
            s.Responses[200] = "CRXDE is enabled";
            s.Responses[404] = "CRXDE is disabled";
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

public class GetInstallStatusEndpoint : FastEndpoints.EndpointWithoutRequest<InstallStatus>
{
    public override void Configure()
    {
        Get("/crx/packmgr/installstatus.jsp");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("crx");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "";
            s.Responses[200] = "Retrieved CRX package manager install status";
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

public class GetPackageManagerServletEndpoint : FastEndpoints.EndpointWithoutRequest
{
    public override void Configure()
    {
        Get("/crx/packmgr/service/script.html");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("crx");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 404);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 405);
        });

        Summary(s => {
            s.Summary = "";
            s.Responses[404] = "Package Manager Servlet is disabled";
            s.Responses[405] = "Package Manager Servlet is active";
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

public class PostPackageServiceEndpoint : FastEndpoints.Endpoint<PostPackageServiceRequest, string>
{
    public override void Configure()
    {
        Post("/crx/packmgr/service.jsp");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("crx");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "";
            s.RequestParam(r => r.Cmd, "");
            s.Responses[0] = "Default response";
        });
    }

    public override async Task HandleAsync(PostPackageServiceRequest req, CancellationToken ct)
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

public class PostPackageServiceJsonEndpoint : FastEndpoints.Endpoint<PostPackageServiceJsonRequest, string>
{
    public override void Configure()
    {
        Post("/crx/packmgr/service/.json/{path}");
        
        
        AllowAnonymous();
        AllowFileUploads();
        Description(x =>
        {
            x.WithTags("crx");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "";
            s.RequestParam(r => r.Path, "");
            s.RequestParam(r => r.Cmd, "");
            s.RequestParam(r => r.GroupName, "");
            s.RequestParam(r => r.PackageName, "");
            s.RequestParam(r => r.PackageVersion, "");
            s.RequestParam(r => r.Charset, "");
            s.RequestParam(r => r.Force, "");
            s.RequestParam(r => r.Recursive, "");
            s.RequestParam(r => r.Package, "");
            s.Responses[0] = "Default response";
        });
    }

    public override async Task HandleAsync(PostPackageServiceJsonRequest req, CancellationToken ct)
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

public class PostPackageUpdateEndpoint : FastEndpoints.Endpoint<PostPackageUpdateRequest, string>
{
    public override void Configure()
    {
        Post("/crx/packmgr/update.jsp");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("crx");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "";
            s.RequestParam(r => r.GroupName, "");
            s.RequestParam(r => r.PackageName, "");
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.Path, "");
            s.RequestParam(r => r.Filter, "");
            s.RequestParam(r => r.Charset, "");
            s.Responses[0] = "Default response";
        });
    }

    public override async Task HandleAsync(PostPackageUpdateRequest req, CancellationToken ct)
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

public class PostSetPasswordEndpoint : FastEndpoints.Endpoint<PostSetPasswordRequest, string>
{
    public override void Configure()
    {
        Post("/crx/explorer/ui/setpassword.jsp");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("crx");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "";
            s.RequestParam(r => r.Old, "");
            s.RequestParam(r => r.Plain, "");
            s.RequestParam(r => r.Verify, "");
            s.Responses[0] = "Default response";
        });
    }

    public override async Task HandleAsync(PostSetPasswordRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

