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
    public partial class CrxApi
    { 
        [FunctionName("CrxApi_GetCrxdeStatus")]
        public async Task<ActionResult<string>> _GetCrxdeStatus([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "crx/server/crx.default/jcr:root/.1.json")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetCrxdeStatus");
            return method != null
                ? (await ((Task<string>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("CrxApi_GetInstallStatus")]
        public async Task<ActionResult<InstallStatus>> _GetInstallStatus([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "crx/packmgr/installstatus.jsp")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetInstallStatus");
            return method != null
                ? (await ((Task<InstallStatus>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("CrxApi_GetPackageManagerServlet")]
        public async Task<ActionResult<>> _GetPackageManagerServlet([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "crx/packmgr/service/script.html")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetPackageManagerServlet");
            return method != null
                ? (await ((Task<>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("CrxApi_PostPackageService")]
        public async Task<ActionResult<string>> _PostPackageService([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "crx/packmgr/service.jsp")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("PostPackageService");
            return method != null
                ? (await ((Task<string>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("CrxApi_PostPackageServiceJson")]
        public async Task<ActionResult<string>> _PostPackageServiceJson([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "crx/packmgr/service/.json/{path}")]HttpRequest req, ExecutionContext context, string path)
        {
            var method = this.GetType().GetMethod("PostPackageServiceJson");
            return method != null
                ? (await ((Task<string>)method.Invoke(this, new object[] { req, context, path })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("CrxApi_PostPackageUpdate")]
        public async Task<ActionResult<string>> _PostPackageUpdate([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "crx/packmgr/update.jsp")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("PostPackageUpdate");
            return method != null
                ? (await ((Task<string>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("CrxApi_PostSetPassword")]
        public async Task<ActionResult<string>> _PostSetPassword([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "crx/explorer/ui/setpassword.jsp")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("PostSetPassword");
            return method != null
                ? (await ((Task<string>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
