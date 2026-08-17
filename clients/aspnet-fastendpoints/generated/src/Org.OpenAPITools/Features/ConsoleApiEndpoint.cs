using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// 
/// </summary>

public class GetAemProductInfoEndpoint : FastEndpoints.EndpointWithoutRequest<List<string>>
{
    public override void Configure()
    {
        Get("/system/console/status-productinfo.json");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("console");
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

public class GetBundleInfoEndpoint : FastEndpoints.Endpoint<GetBundleInfoRequest, BundleInfo>
{
    public override void Configure()
    {
        Get("/system/console/bundles/{name}.json");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("console");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "";
            s.RequestParam(r => r.Name, "");
            s.Responses[200] = "Retrieved bundle info";
            s.Responses[0] = "Default response";
        });
    }

    public override async Task HandleAsync(GetBundleInfoRequest req, CancellationToken ct)
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

public class GetConfigMgrEndpoint : FastEndpoints.EndpointWithoutRequest<string>
{
    public override void Configure()
    {
        Get("/system/console/configMgr");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("console");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 5XX);
        });

        Summary(s => {
            s.Summary = "";
            s.Responses[200] = "OK";
            s.Responses[5XX] = "Unexpected error.";
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

public class PostBundleEndpoint : FastEndpoints.Endpoint<PostBundleRequest>
{
    public override void Configure()
    {
        Post("/system/console/bundles/{name}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("console");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "";
            s.RequestParam(r => r.Name, "");
            s.RequestParam(r => r.Action, "");
            s.Responses[0] = "Default response";
        });
    }

    public override async Task HandleAsync(PostBundleRequest req, CancellationToken ct)
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

public class PostJmxRepositoryEndpoint : FastEndpoints.Endpoint<PostJmxRepositoryRequest>
{
    public override void Configure()
    {
        Post("/system/console/jmx/com.adobe.granite:type=Repository/op/{action}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("console");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "";
            s.RequestParam(r => r.Action, "");
            s.Responses[0] = "Default response";
        });
    }

    public override async Task HandleAsync(PostJmxRepositoryRequest req, CancellationToken ct)
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

public class PostSamlConfigurationEndpoint : FastEndpoints.Endpoint<PostSamlConfigurationRequest, SamlConfigurationInfo>
{
    public override void Configure()
    {
        Post("/system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("console");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 302);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "";
            s.RequestParam(r => r.Post, "");
            s.RequestParam(r => r.Apply, "");
            s.RequestParam(r => r.Delete, "");
            s.RequestParam(r => r.Action, "");
            s.RequestParam(r => r.Location, "");
            s.RequestParam(r => r.Path, "");
            s.RequestParam(r => r.ServiceRanking, "");
            s.RequestParam(r => r.IdpUrl, "");
            s.RequestParam(r => r.IdpCertAlias, "");
            s.RequestParam(r => r.IdpHttpRedirect, "");
            s.RequestParam(r => r.ServiceProviderEntityId, "");
            s.RequestParam(r => r.AssertionConsumerServiceURL, "");
            s.RequestParam(r => r.SpPrivateKeyAlias, "");
            s.RequestParam(r => r.KeyStorePassword, "");
            s.RequestParam(r => r.DefaultRedirectUrl, "");
            s.RequestParam(r => r.UserIDAttribute, "");
            s.RequestParam(r => r.UseEncryption, "");
            s.RequestParam(r => r.CreateUser, "");
            s.RequestParam(r => r.AddGroupMemberships, "");
            s.RequestParam(r => r.GroupMembershipAttribute, "");
            s.RequestParam(r => r.DefaultGroups, "");
            s.RequestParam(r => r.NameIdFormat, "");
            s.RequestParam(r => r.SynchronizeAttributes, "");
            s.RequestParam(r => r.HandleLogout, "");
            s.RequestParam(r => r.LogoutUrl, "");
            s.RequestParam(r => r.ClockTolerance, "");
            s.RequestParam(r => r.DigestMethod, "");
            s.RequestParam(r => r.SignatureMethod, "");
            s.RequestParam(r => r.UserIntermediatePath, "");
            s.RequestParam(r => r.Propertylist, "");
            s.Responses[200] = "Retrieved AEM SAML Configuration";
            s.Responses[302] = "Default response";
            s.Responses[0] = "Default response";
        });
    }

    public override async Task HandleAsync(PostSamlConfigurationRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

