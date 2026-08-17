using System.IO;
using System.Net;
using System.Threading.Tasks;
using System.ComponentModel.DataAnnotations;
using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
using Microsoft.Azure.WebJobs;
using Microsoft.Azure.WebJobs.Extensions.Http;
using Microsoft.Azure.WebJobs.Extensions.OpenApi.Core.Attributes;
using Microsoft.Azure.WebJobs.Extensions.OpenApi.Core.Enums;
using Microsoft.Extensions.Logging;
using Microsoft.OpenApi.Models;
using Newtonsoft.Json;
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Functions
{ 
    public partial class CustomApi
    { 
        [FunctionName("CustomApi_GetAemHealthCheck")]
        public async Task<ActionResult<string>> _GetAemHealthCheck([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "system/health")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetAemHealthCheck");
            return method != null
                ? (await ((Task<string>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("CustomApi_PostConfigAemHealthCheckServlet")]
        public async Task<ActionResult<>> _PostConfigAemHealthCheckServlet([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("PostConfigAemHealthCheckServlet");
            return method != null
                ? (await ((Task<>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("CustomApi_PostConfigAemPasswordReset")]
        public async Task<ActionResult<>> _PostConfigAemPasswordReset([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "apps/system/config/com.shinesolutions.aem.passwordreset.Activator")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("PostConfigAemPasswordReset");
            return method != null
                ? (await ((Task<>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
