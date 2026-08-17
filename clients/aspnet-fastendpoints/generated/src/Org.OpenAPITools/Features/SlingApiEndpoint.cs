using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// 
/// </summary>

public class DeleteAgentEndpoint : FastEndpoints.Endpoint<DeleteAgentRequest>
{
    public override void Configure()
    {
        Delete("/etc/replication/agents.{runmode}/{name}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("sling");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "";
            s.RequestParam(r => r.Runmode, "");
            s.RequestParam(r => r.Name, "");
            s.Responses[0] = "Default response";
        });
    }

    public override async Task HandleAsync(DeleteAgentRequest req, CancellationToken ct)
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

public class DeleteNodeEndpoint : FastEndpoints.Endpoint<DeleteNodeRequest>
{
    public override void Configure()
    {
        Delete("/{path}/{name}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("sling");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "";
            s.RequestParam(r => r.Path, "");
            s.RequestParam(r => r.Name, "");
            s.Responses[0] = "Default response";
        });
    }

    public override async Task HandleAsync(DeleteNodeRequest req, CancellationToken ct)
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

public class GetAgentEndpoint : FastEndpoints.Endpoint<GetAgentRequest>
{
    public override void Configure()
    {
        Get("/etc/replication/agents.{runmode}/{name}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("sling");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "";
            s.RequestParam(r => r.Runmode, "");
            s.RequestParam(r => r.Name, "");
            s.Responses[0] = "Default response";
        });
    }

    public override async Task HandleAsync(GetAgentRequest req, CancellationToken ct)
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

public class GetAgentsEndpoint : FastEndpoints.Endpoint<GetAgentsRequest, string>
{
    public override void Configure()
    {
        Get("/etc/replication/agents.{runmode}.-1.json");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("sling");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "";
            s.RequestParam(r => r.Runmode, "");
            s.Responses[0] = "Default response";
        });
    }

    public override async Task HandleAsync(GetAgentsRequest req, CancellationToken ct)
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

public class GetAuthorizableKeystoreEndpoint : FastEndpoints.Endpoint<GetAuthorizableKeystoreRequest, KeystoreInfo>
{
    public override void Configure()
    {
        Get("/{intermediatePath}/{authorizableId}.ks.json");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("sling");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "";
            s.RequestParam(r => r.IntermediatePath, "");
            s.RequestParam(r => r.AuthorizableId, "");
            s.Responses[200] = "Retrieved Authorizable Keystore info";
            s.Responses[0] = "Default response";
        });
    }

    public override async Task HandleAsync(GetAuthorizableKeystoreRequest req, CancellationToken ct)
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

public class GetKeystoreEndpoint : FastEndpoints.Endpoint<GetKeystoreRequest, System.IO.Stream>
{
    public override void Configure()
    {
        Get("/{intermediatePath}/{authorizableId}/keystore/store.p12");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("sling");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "";
            s.RequestParam(r => r.IntermediatePath, "");
            s.RequestParam(r => r.AuthorizableId, "");
            s.Responses[0] = "Default response";
        });
    }

    public override async Task HandleAsync(GetKeystoreRequest req, CancellationToken ct)
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

public class GetNodeEndpoint : FastEndpoints.Endpoint<GetNodeRequest>
{
    public override void Configure()
    {
        Get("/{path}/{name}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("sling");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "";
            s.RequestParam(r => r.Path, "");
            s.RequestParam(r => r.Name, "");
            s.Responses[0] = "Default response";
        });
    }

    public override async Task HandleAsync(GetNodeRequest req, CancellationToken ct)
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

public class GetPackageEndpoint : FastEndpoints.Endpoint<GetPackageRequest, System.IO.Stream>
{
    public override void Configure()
    {
        Get("/etc/packages/{group}/{name}-{version}.zip");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("sling");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "";
            s.RequestParam(r => r.Group, "");
            s.RequestParam(r => r.Name, "");
            s.RequestParam(r => r.Version, "");
            s.Responses[0] = "Default response";
        });
    }

    public override async Task HandleAsync(GetPackageRequest req, CancellationToken ct)
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

public class GetPackageFilterEndpoint : FastEndpoints.Endpoint<GetPackageFilterRequest, string>
{
    public override void Configure()
    {
        Get("/etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("sling");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "";
            s.RequestParam(r => r.Group, "");
            s.RequestParam(r => r.Name, "");
            s.RequestParam(r => r.Version, "");
            s.Responses[0] = "Default response";
        });
    }

    public override async Task HandleAsync(GetPackageFilterRequest req, CancellationToken ct)
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

public class GetQueryEndpoint : FastEndpoints.Endpoint<GetQueryRequest, string>
{
    public override void Configure()
    {
        Get("/bin/querybuilder.json");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("sling");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "";
            s.RequestParam(r => r.Path, "");
            s.RequestParam(r => r.PLimit, "");
            s.RequestParam(r => r.Var1property, "");
            s.RequestParam(r => r.Var1propertyValue, "");
            s.Responses[0] = "Default response";
        });
    }

    public override async Task HandleAsync(GetQueryRequest req, CancellationToken ct)
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

public class GetTruststoreEndpoint : FastEndpoints.EndpointWithoutRequest<System.IO.Stream>
{
    public override void Configure()
    {
        Get("/etc/truststore/truststore.p12");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("sling");
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

public class GetTruststoreInfoEndpoint : FastEndpoints.EndpointWithoutRequest<TruststoreInfo>
{
    public override void Configure()
    {
        Get("/libs/granite/security/truststore.json");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("sling");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "";
            s.Responses[200] = "Retrieved AEM Truststore info";
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

public class PostAgentEndpoint : FastEndpoints.Endpoint<PostAgentRequest>
{
    public override void Configure()
    {
        Post("/etc/replication/agents.{runmode}/{name}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("sling");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "";
            s.RequestParam(r => r.Runmode, "");
            s.RequestParam(r => r.Name, "");
            s.RequestParam(r => r.JcrContentCqDistribute, "");
            s.RequestParam(r => r.JcrContentCqDistributeTypeHint, "");
            s.RequestParam(r => r.JcrContentCqName, "");
            s.RequestParam(r => r.JcrContentCqTemplate, "");
            s.RequestParam(r => r.JcrContentAliasUpdate, "");
            s.RequestParam(r => r.JcrContentEnabled, "");
            s.RequestParam(r => r.JcrContentJcrDescription, "");
            s.RequestParam(r => r.JcrContentJcrLastModified, "");
            s.RequestParam(r => r.JcrContentJcrLastModifiedBy, "");
            s.RequestParam(r => r.JcrContentJcrMixinTypes, "");
            s.RequestParam(r => r.JcrContentJcrTitle, "");
            s.RequestParam(r => r.JcrContentLogLevel, "");
            s.RequestParam(r => r.JcrContentNoStatusUpdate, "");
            s.RequestParam(r => r.JcrContentNoVersioning, "");
            s.RequestParam(r => r.JcrContentProtocolConnectTimeout, "");
            s.RequestParam(r => r.JcrContentProtocolHTTPConnectionClosed, "");
            s.RequestParam(r => r.JcrContentProtocolHTTPExpired, "");
            s.RequestParam(r => r.JcrContentProtocolHTTPHeaders, "");
            s.RequestParam(r => r.JcrContentProtocolHTTPHeadersTypeHint, "");
            s.RequestParam(r => r.JcrContentProtocolHTTPMethod, "");
            s.RequestParam(r => r.JcrContentProtocolHTTPSRelaxed, "");
            s.RequestParam(r => r.JcrContentProtocolInterface, "");
            s.RequestParam(r => r.JcrContentProtocolSocketTimeout, "");
            s.RequestParam(r => r.JcrContentProtocolVersion, "");
            s.RequestParam(r => r.JcrContentProxyNTLMDomain, "");
            s.RequestParam(r => r.JcrContentProxyNTLMHost, "");
            s.RequestParam(r => r.JcrContentProxyHost, "");
            s.RequestParam(r => r.JcrContentProxyPassword, "");
            s.RequestParam(r => r.JcrContentProxyPort, "");
            s.RequestParam(r => r.JcrContentProxyUser, "");
            s.RequestParam(r => r.JcrContentQueueBatchMaxSize, "");
            s.RequestParam(r => r.JcrContentQueueBatchMode, "");
            s.RequestParam(r => r.JcrContentQueueBatchWaitTime, "");
            s.RequestParam(r => r.JcrContentRetryDelay, "");
            s.RequestParam(r => r.JcrContentReverseReplication, "");
            s.RequestParam(r => r.JcrContentSerializationType, "");
            s.RequestParam(r => r.JcrContentSlingResourceType, "");
            s.RequestParam(r => r.JcrContentSsl, "");
            s.RequestParam(r => r.JcrContentTransportNTLMDomain, "");
            s.RequestParam(r => r.JcrContentTransportNTLMHost, "");
            s.RequestParam(r => r.JcrContentTransportPassword, "");
            s.RequestParam(r => r.JcrContentTransportUri, "");
            s.RequestParam(r => r.JcrContentTransportUser, "");
            s.RequestParam(r => r.JcrContentTriggerDistribute, "");
            s.RequestParam(r => r.JcrContentTriggerModified, "");
            s.RequestParam(r => r.JcrContentTriggerOnOffTime, "");
            s.RequestParam(r => r.JcrContentTriggerReceive, "");
            s.RequestParam(r => r.JcrContentTriggerSpecific, "");
            s.RequestParam(r => r.JcrContentUserId, "");
            s.RequestParam(r => r.JcrPrimaryType, "");
            s.RequestParam(r => r.Operation, "");
            s.Responses[0] = "Default response";
        });
    }

    public override async Task HandleAsync(PostAgentRequest req, CancellationToken ct)
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

public class PostAuthorizableKeystoreEndpoint : FastEndpoints.Endpoint<PostAuthorizableKeystoreRequest, KeystoreInfo>
{
    public override void Configure()
    {
        Post("/{intermediatePath}/{authorizableId}.ks.html");
        
        
        AllowAnonymous();
        AllowFileUploads();AllowFileUploads();AllowFileUploads();
        Description(x =>
        {
            x.WithTags("sling");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "";
            s.RequestParam(r => r.IntermediatePath, "");
            s.RequestParam(r => r.AuthorizableId, "");
            s.RequestParam(r => r.Operation, "");
            s.RequestParam(r => r.CurrentPassword, "");
            s.RequestParam(r => r.NewPassword, "");
            s.RequestParam(r => r.RePassword, "");
            s.RequestParam(r => r.KeyPassword, "");
            s.RequestParam(r => r.KeyStorePass, "");
            s.RequestParam(r => r.Alias, "");
            s.RequestParam(r => r.NewAlias, "");
            s.RequestParam(r => r.RemoveAlias, "");
            s.RequestParam(r => r.CertChain, "");
            s.RequestParam(r => r.Pk, "");
            s.RequestParam(r => r.KeyStore, "");
            s.Responses[200] = "Retrieved Authorizable Keystore info";
            s.Responses[0] = "Default response";
        });
    }

    public override async Task HandleAsync(PostAuthorizableKeystoreRequest req, CancellationToken ct)
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

public class PostAuthorizablesEndpoint : FastEndpoints.Endpoint<PostAuthorizablesRequest, string>
{
    public override void Configure()
    {
        Post("/libs/granite/security/post/authorizables");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("sling");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "";
            s.RequestParam(r => r.AuthorizableId, "");
            s.RequestParam(r => r.IntermediatePath, "");
            s.RequestParam(r => r.CreateUser, "");
            s.RequestParam(r => r.CreateGroup, "");
            s.RequestParam(r => r.RepPassword, "");
            s.RequestParam(r => r.ProfileGivenName, "");
            s.Responses[0] = "Default response";
        });
    }

    public override async Task HandleAsync(PostAuthorizablesRequest req, CancellationToken ct)
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

public class PostConfigAdobeGraniteSamlAuthenticationHandlerEndpoint : FastEndpoints.Endpoint<PostConfigAdobeGraniteSamlAuthenticationHandlerRequest>
{
    public override void Configure()
    {
        Post("/apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("sling");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "";
            s.RequestParam(r => r.KeyStorePassword, "");
            s.RequestParam(r => r.KeyStorePasswordTypeHint, "");
            s.RequestParam(r => r.ServiceRanking, "");
            s.RequestParam(r => r.ServiceRankingTypeHint, "");
            s.RequestParam(r => r.IdpHttpRedirect, "");
            s.RequestParam(r => r.IdpHttpRedirectTypeHint, "");
            s.RequestParam(r => r.CreateUser, "");
            s.RequestParam(r => r.CreateUserTypeHint, "");
            s.RequestParam(r => r.DefaultRedirectUrl, "");
            s.RequestParam(r => r.DefaultRedirectUrlTypeHint, "");
            s.RequestParam(r => r.UserIDAttribute, "");
            s.RequestParam(r => r.UserIDAttributeTypeHint, "");
            s.RequestParam(r => r.DefaultGroups, "");
            s.RequestParam(r => r.DefaultGroupsTypeHint, "");
            s.RequestParam(r => r.IdpCertAlias, "");
            s.RequestParam(r => r.IdpCertAliasTypeHint, "");
            s.RequestParam(r => r.AddGroupMemberships, "");
            s.RequestParam(r => r.AddGroupMembershipsTypeHint, "");
            s.RequestParam(r => r.Path, "");
            s.RequestParam(r => r.PathTypeHint, "");
            s.RequestParam(r => r.SynchronizeAttributes, "");
            s.RequestParam(r => r.SynchronizeAttributesTypeHint, "");
            s.RequestParam(r => r.ClockTolerance, "");
            s.RequestParam(r => r.ClockToleranceTypeHint, "");
            s.RequestParam(r => r.GroupMembershipAttribute, "");
            s.RequestParam(r => r.GroupMembershipAttributeTypeHint, "");
            s.RequestParam(r => r.IdpUrl, "");
            s.RequestParam(r => r.IdpUrlTypeHint, "");
            s.RequestParam(r => r.LogoutUrl, "");
            s.RequestParam(r => r.LogoutUrlTypeHint, "");
            s.RequestParam(r => r.ServiceProviderEntityId, "");
            s.RequestParam(r => r.ServiceProviderEntityIdTypeHint, "");
            s.RequestParam(r => r.AssertionConsumerServiceURL, "");
            s.RequestParam(r => r.AssertionConsumerServiceURLTypeHint, "");
            s.RequestParam(r => r.HandleLogout, "");
            s.RequestParam(r => r.HandleLogoutTypeHint, "");
            s.RequestParam(r => r.SpPrivateKeyAlias, "");
            s.RequestParam(r => r.SpPrivateKeyAliasTypeHint, "");
            s.RequestParam(r => r.UseEncryption, "");
            s.RequestParam(r => r.UseEncryptionTypeHint, "");
            s.RequestParam(r => r.NameIdFormat, "");
            s.RequestParam(r => r.NameIdFormatTypeHint, "");
            s.RequestParam(r => r.DigestMethod, "");
            s.RequestParam(r => r.DigestMethodTypeHint, "");
            s.RequestParam(r => r.SignatureMethod, "");
            s.RequestParam(r => r.SignatureMethodTypeHint, "");
            s.RequestParam(r => r.UserIntermediatePath, "");
            s.RequestParam(r => r.UserIntermediatePathTypeHint, "");
            s.Responses[0] = "Default response";
        });
    }

    public override async Task HandleAsync(PostConfigAdobeGraniteSamlAuthenticationHandlerRequest req, CancellationToken ct)
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

public class PostConfigApacheFelixJettyBasedHttpServiceEndpoint : FastEndpoints.Endpoint<PostConfigApacheFelixJettyBasedHttpServiceRequest>
{
    public override void Configure()
    {
        Post("/apps/system/config/org.apache.felix.http");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("sling");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "";
            s.RequestParam(r => r.OrgApacheFelixHttpsNio, "");
            s.RequestParam(r => r.OrgApacheFelixHttpsNioTypeHint, "");
            s.RequestParam(r => r.OrgApacheFelixHttpsKeystore, "");
            s.RequestParam(r => r.OrgApacheFelixHttpsKeystoreTypeHint, "");
            s.RequestParam(r => r.OrgApacheFelixHttpsKeystorePassword, "");
            s.RequestParam(r => r.OrgApacheFelixHttpsKeystorePasswordTypeHint, "");
            s.RequestParam(r => r.OrgApacheFelixHttpsKeystoreKey, "");
            s.RequestParam(r => r.OrgApacheFelixHttpsKeystoreKeyTypeHint, "");
            s.RequestParam(r => r.OrgApacheFelixHttpsKeystoreKeyPassword, "");
            s.RequestParam(r => r.OrgApacheFelixHttpsKeystoreKeyPasswordTypeHint, "");
            s.RequestParam(r => r.OrgApacheFelixHttpsTruststore, "");
            s.RequestParam(r => r.OrgApacheFelixHttpsTruststoreTypeHint, "");
            s.RequestParam(r => r.OrgApacheFelixHttpsTruststorePassword, "");
            s.RequestParam(r => r.OrgApacheFelixHttpsTruststorePasswordTypeHint, "");
            s.RequestParam(r => r.OrgApacheFelixHttpsClientcertificate, "");
            s.RequestParam(r => r.OrgApacheFelixHttpsClientcertificateTypeHint, "");
            s.RequestParam(r => r.OrgApacheFelixHttpsEnable, "");
            s.RequestParam(r => r.OrgApacheFelixHttpsEnableTypeHint, "");
            s.RequestParam(r => r.OrgOsgiServiceHttpPortSecure, "");
            s.RequestParam(r => r.OrgOsgiServiceHttpPortSecureTypeHint, "");
            s.Responses[0] = "Default response";
        });
    }

    public override async Task HandleAsync(PostConfigApacheFelixJettyBasedHttpServiceRequest req, CancellationToken ct)
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

public class PostConfigApacheHttpComponentsProxyConfigurationEndpoint : FastEndpoints.Endpoint<PostConfigApacheHttpComponentsProxyConfigurationRequest>
{
    public override void Configure()
    {
        Post("/apps/system/config/org.apache.http.proxyconfigurator.config");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("sling");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "";
            s.RequestParam(r => r.ProxyHost, "");
            s.RequestParam(r => r.ProxyHostTypeHint, "");
            s.RequestParam(r => r.ProxyPort, "");
            s.RequestParam(r => r.ProxyPortTypeHint, "");
            s.RequestParam(r => r.ProxyExceptions, "");
            s.RequestParam(r => r.ProxyExceptionsTypeHint, "");
            s.RequestParam(r => r.ProxyEnabled, "");
            s.RequestParam(r => r.ProxyEnabledTypeHint, "");
            s.RequestParam(r => r.ProxyUser, "");
            s.RequestParam(r => r.ProxyUserTypeHint, "");
            s.RequestParam(r => r.ProxyPassword, "");
            s.RequestParam(r => r.ProxyPasswordTypeHint, "");
            s.Responses[0] = "Default response";
        });
    }

    public override async Task HandleAsync(PostConfigApacheHttpComponentsProxyConfigurationRequest req, CancellationToken ct)
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

public class PostConfigApacheSlingDavExServletEndpoint : FastEndpoints.Endpoint<PostConfigApacheSlingDavExServletRequest>
{
    public override void Configure()
    {
        Post("/apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("sling");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "";
            s.RequestParam(r => r.Alias, "");
            s.RequestParam(r => r.AliasTypeHint, "");
            s.RequestParam(r => r.DavCreateAbsoluteUri, "");
            s.RequestParam(r => r.DavCreateAbsoluteUriTypeHint, "");
            s.Responses[0] = "Default response";
        });
    }

    public override async Task HandleAsync(PostConfigApacheSlingDavExServletRequest req, CancellationToken ct)
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

public class PostConfigApacheSlingGetServletEndpoint : FastEndpoints.Endpoint<PostConfigApacheSlingGetServletRequest>
{
    public override void Configure()
    {
        Post("/apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("sling");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "";
            s.RequestParam(r => r.JsonMaximumresults, "");
            s.RequestParam(r => r.JsonMaximumresultsTypeHint, "");
            s.RequestParam(r => r.EnableHtml, "");
            s.RequestParam(r => r.EnableHtmlTypeHint, "");
            s.RequestParam(r => r.EnableTxt, "");
            s.RequestParam(r => r.EnableTxtTypeHint, "");
            s.RequestParam(r => r.EnableXml, "");
            s.RequestParam(r => r.EnableXmlTypeHint, "");
            s.Responses[0] = "Default response";
        });
    }

    public override async Task HandleAsync(PostConfigApacheSlingGetServletRequest req, CancellationToken ct)
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

public class PostConfigApacheSlingReferrerFilterEndpoint : FastEndpoints.Endpoint<PostConfigApacheSlingReferrerFilterRequest>
{
    public override void Configure()
    {
        Post("/apps/system/config/org.apache.sling.security.impl.ReferrerFilter");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("sling");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "";
            s.RequestParam(r => r.AllowEmpty, "");
            s.RequestParam(r => r.AllowEmptyTypeHint, "");
            s.RequestParam(r => r.AllowHosts, "");
            s.RequestParam(r => r.AllowHostsTypeHint, "");
            s.RequestParam(r => r.AllowHostsRegexp, "");
            s.RequestParam(r => r.AllowHostsRegexpTypeHint, "");
            s.RequestParam(r => r.FilterMethods, "");
            s.RequestParam(r => r.FilterMethodsTypeHint, "");
            s.Responses[0] = "Default response";
        });
    }

    public override async Task HandleAsync(PostConfigApacheSlingReferrerFilterRequest req, CancellationToken ct)
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

public class PostConfigPropertyEndpoint : FastEndpoints.Endpoint<PostConfigPropertyRequest>
{
    public override void Configure()
    {
        Post("/apps/system/config/{configNodeName}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("sling");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "";
            s.RequestParam(r => r.ConfigNodeName, "");
            s.Responses[0] = "Default response";
        });
    }

    public override async Task HandleAsync(PostConfigPropertyRequest req, CancellationToken ct)
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

public class PostNodeEndpoint : FastEndpoints.Endpoint<PostNodeRequest>
{
    public override void Configure()
    {
        Post("/{path}/{name}");
        
        
        AllowAnonymous();
        AllowFileUploads();
        Description(x =>
        {
            x.WithTags("sling");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "";
            s.RequestParam(r => r.Path, "");
            s.RequestParam(r => r.Name, "");
            s.RequestParam(r => r.Operation, "");
            s.RequestParam(r => r.DeleteAuthorizable, "");
            s.RequestParam(r => r.File, "");
            s.Responses[0] = "Default response";
        });
    }

    public override async Task HandleAsync(PostNodeRequest req, CancellationToken ct)
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

public class PostNodeRwEndpoint : FastEndpoints.Endpoint<PostNodeRwRequest>
{
    public override void Configure()
    {
        Post("/{path}/{name}.rw.html");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("sling");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "";
            s.RequestParam(r => r.Path, "");
            s.RequestParam(r => r.Name, "");
            s.RequestParam(r => r.AddMembers, "");
            s.Responses[0] = "Default response";
        });
    }

    public override async Task HandleAsync(PostNodeRwRequest req, CancellationToken ct)
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

public class PostPathEndpoint : FastEndpoints.Endpoint<PostPathRequest>
{
    public override void Configure()
    {
        Post("/{path}/");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("sling");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "";
            s.RequestParam(r => r.Path, "");
            s.RequestParam(r => r.JcrPrimaryType, "");
            s.RequestParam(r => r.Name, "");
            s.Responses[0] = "Default response";
        });
    }

    public override async Task HandleAsync(PostPathRequest req, CancellationToken ct)
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

public class PostQueryEndpoint : FastEndpoints.Endpoint<PostQueryRequest, string>
{
    public override void Configure()
    {
        Post("/bin/querybuilder.json");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("sling");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "";
            s.RequestParam(r => r.Path, "");
            s.RequestParam(r => r.PLimit, "");
            s.RequestParam(r => r.Var1property, "");
            s.RequestParam(r => r.Var1propertyValue, "");
            s.Responses[0] = "Default response";
        });
    }

    public override async Task HandleAsync(PostQueryRequest req, CancellationToken ct)
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

public class PostTreeActivationEndpoint : FastEndpoints.Endpoint<PostTreeActivationRequest>
{
    public override void Configure()
    {
        Post("/libs/replication/treeactivation.html");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("sling");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "";
            s.RequestParam(r => r.Ignoredeactivated, "");
            s.RequestParam(r => r.Onlymodified, "");
            s.RequestParam(r => r.Path, "");
            s.RequestParam(r => r.Cmd, "");
            s.Responses[0] = "Default response";
        });
    }

    public override async Task HandleAsync(PostTreeActivationRequest req, CancellationToken ct)
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

public class PostTruststoreEndpoint : FastEndpoints.Endpoint<PostTruststoreRequest, string>
{
    public override void Configure()
    {
        Post("/libs/granite/security/post/truststore");
        
        
        AllowAnonymous();
        AllowFileUploads();
        Description(x =>
        {
            x.WithTags("sling");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "";
            s.RequestParam(r => r.Operation, "");
            s.RequestParam(r => r.NewPassword, "");
            s.RequestParam(r => r.RePassword, "");
            s.RequestParam(r => r.KeyStoreType, "");
            s.RequestParam(r => r.RemoveAlias, "");
            s.RequestParam(r => r.Certificate, "");
            s.Responses[0] = "Default response";
        });
    }

    public override async Task HandleAsync(PostTruststoreRequest req, CancellationToken ct)
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

public class PostTruststorePKCS12Endpoint : FastEndpoints.Endpoint<PostTruststorePKCS12Request, string>
{
    public override void Configure()
    {
        Post("/etc/truststore");
        
        
        AllowAnonymous();
        AllowFileUploads();
        Description(x =>
        {
            x.WithTags("sling");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "";
            s.RequestParam(r => r.TruststoreP12, "");
            s.Responses[0] = "Default response";
        });
    }

    public override async Task HandleAsync(PostTruststorePKCS12Request req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

