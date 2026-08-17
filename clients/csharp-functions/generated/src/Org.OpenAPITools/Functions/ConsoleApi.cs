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
    public partial class ConsoleApi
    { 
        [FunctionName("ConsoleApi_GetAemProductInfo")]
        public async Task<ActionResult<List<string>>> _GetAemProductInfo([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "system/console/status-productinfo.json")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetAemProductInfo");
            return method != null
                ? (await ((Task<List<string>>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConsoleApi_GetBundleInfo")]
        public async Task<ActionResult<BundleInfo>> _GetBundleInfo([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "system/console/bundles/{name}.json")]HttpRequest req, ExecutionContext context, string name)
        {
            var method = this.GetType().GetMethod("GetBundleInfo");
            return method != null
                ? (await ((Task<BundleInfo>)method.Invoke(this, new object[] { req, context, name })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConsoleApi_GetConfigMgr")]
        public async Task<ActionResult<string>> _GetConfigMgr([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "system/console/configMgr")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetConfigMgr");
            return method != null
                ? (await ((Task<string>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConsoleApi_PostBundle")]
        public async Task<ActionResult<>> _PostBundle([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/bundles/{name}")]HttpRequest req, ExecutionContext context, string name)
        {
            var method = this.GetType().GetMethod("PostBundle");
            return method != null
                ? (await ((Task<>)method.Invoke(this, new object[] { req, context, name })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConsoleApi_PostJmxRepository")]
        public async Task<ActionResult<>> _PostJmxRepository([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/jmx/com.adobe.granite:type=Repository/op/{action}")]HttpRequest req, ExecutionContext context, string action)
        {
            var method = this.GetType().GetMethod("PostJmxRepository");
            return method != null
                ? (await ((Task<>)method.Invoke(this, new object[] { req, context, action })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConsoleApi_PostSamlConfiguration")]
        public async Task<ActionResult<SamlConfigurationInfo>> _PostSamlConfiguration([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("PostSamlConfiguration");
            return method != null
                ? (await ((Task<SamlConfigurationInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
