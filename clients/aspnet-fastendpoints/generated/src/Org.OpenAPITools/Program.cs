using FastEndpoints;
using FastEndpoints.Swagger;

var builder = WebApplication.CreateBuilder(args);

builder.Services
    
    .AddFastEndpoints()
    .SwaggerDocument(o =>
    {
        o.DocumentSettings = s =>
        {
            s.DocumentName = "Adobe Experience Manager (AEM) API";
            s.Title = "Adobe Experience Manager (AEM) API";
            s.Description = """
Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API
""";
            s.Version = "3.7.1-pre.0";
        };
        o.AutoTagPathSegmentIndex = 0;
    })
    
;

var app = builder.Build();

app
    
    .UseFastEndpoints(x =>
    {
        
    })
    .UseSwaggerGen();

app.UseHttpsRedirection();

app.Run();