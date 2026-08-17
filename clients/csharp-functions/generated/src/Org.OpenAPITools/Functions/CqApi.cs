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
    public partial class CqApi
    { 
        [FunctionName("CqApi_GetLoginPage")]
        public async Task<ActionResult<string>> _GetLoginPage([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "libs/granite/core/content/login.html")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetLoginPage");
            return method != null
                ? (await ((Task<string>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("CqApi_PostCqActions")]
        public async Task<ActionResult<>> _PostCqActions([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = ".cqactions.html")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("PostCqActions");
            return method != null
                ? (await ((Task<>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
