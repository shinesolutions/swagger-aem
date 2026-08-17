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
    public partial class SlingApi
    { 
        [FunctionName("SlingApi_DeleteAgent")]
        public async Task<ActionResult<>> _DeleteAgent([HttpTrigger(AuthorizationLevel.Anonymous, "Delete", Route = "etc/replication/agents.{runmode}/{name}")]HttpRequest req, ExecutionContext context, string runmode, string name)
        {
            var method = this.GetType().GetMethod("DeleteAgent");
            return method != null
                ? (await ((Task<>)method.Invoke(this, new object[] { req, context, runmode, name })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("SlingApi_DeleteNode")]
        public async Task<ActionResult<>> _DeleteNode([HttpTrigger(AuthorizationLevel.Anonymous, "Delete", Route = "{path}/{name}")]HttpRequest req, ExecutionContext context, string path, string name)
        {
            var method = this.GetType().GetMethod("DeleteNode");
            return method != null
                ? (await ((Task<>)method.Invoke(this, new object[] { req, context, path, name })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("SlingApi_GetAgent")]
        public async Task<ActionResult<>> _GetAgent([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "etc/replication/agents.{runmode}/{name}")]HttpRequest req, ExecutionContext context, string runmode, string name)
        {
            var method = this.GetType().GetMethod("GetAgent");
            return method != null
                ? (await ((Task<>)method.Invoke(this, new object[] { req, context, runmode, name })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("SlingApi_GetAgents")]
        public async Task<ActionResult<string>> _GetAgents([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "etc/replication/agents.{runmode}.-1.json")]HttpRequest req, ExecutionContext context, string runmode)
        {
            var method = this.GetType().GetMethod("GetAgents");
            return method != null
                ? (await ((Task<string>)method.Invoke(this, new object[] { req, context, runmode })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("SlingApi_GetAuthorizableKeystore")]
        public async Task<ActionResult<KeystoreInfo>> _GetAuthorizableKeystore([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "{intermediatePath}/{authorizableId}.ks.json")]HttpRequest req, ExecutionContext context, string intermediatePath, string authorizableId)
        {
            var method = this.GetType().GetMethod("GetAuthorizableKeystore");
            return method != null
                ? (await ((Task<KeystoreInfo>)method.Invoke(this, new object[] { req, context, intermediatePath, authorizableId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("SlingApi_GetKeystore")]
        public async Task<ActionResult<System.IO.Stream>> _GetKeystore([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "{intermediatePath}/{authorizableId}/keystore/store.p12")]HttpRequest req, ExecutionContext context, string intermediatePath, string authorizableId)
        {
            var method = this.GetType().GetMethod("GetKeystore");
            return method != null
                ? (await ((Task<System.IO.Stream>)method.Invoke(this, new object[] { req, context, intermediatePath, authorizableId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("SlingApi_GetNode")]
        public async Task<ActionResult<>> _GetNode([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "{path}/{name}")]HttpRequest req, ExecutionContext context, string path, string name)
        {
            var method = this.GetType().GetMethod("GetNode");
            return method != null
                ? (await ((Task<>)method.Invoke(this, new object[] { req, context, path, name })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("SlingApi_GetPackage")]
        public async Task<ActionResult<System.IO.Stream>> _GetPackage([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "etc/packages/{group}/{name}-{version}.zip")]HttpRequest req, ExecutionContext context, string group, string name, string version)
        {
            var method = this.GetType().GetMethod("GetPackage");
            return method != null
                ? (await ((Task<System.IO.Stream>)method.Invoke(this, new object[] { req, context, group, name, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("SlingApi_GetPackageFilter")]
        public async Task<ActionResult<string>> _GetPackageFilter([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json")]HttpRequest req, ExecutionContext context, string group, string name, string version)
        {
            var method = this.GetType().GetMethod("GetPackageFilter");
            return method != null
                ? (await ((Task<string>)method.Invoke(this, new object[] { req, context, group, name, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("SlingApi_GetQuery")]
        public async Task<ActionResult<string>> _GetQuery([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "bin/querybuilder.json")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetQuery");
            return method != null
                ? (await ((Task<string>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("SlingApi_GetTruststore")]
        public async Task<ActionResult<System.IO.Stream>> _GetTruststore([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "etc/truststore/truststore.p12")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetTruststore");
            return method != null
                ? (await ((Task<System.IO.Stream>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("SlingApi_GetTruststoreInfo")]
        public async Task<ActionResult<TruststoreInfo>> _GetTruststoreInfo([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "libs/granite/security/truststore.json")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetTruststoreInfo");
            return method != null
                ? (await ((Task<TruststoreInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("SlingApi_PostAgent")]
        public async Task<ActionResult<>> _PostAgent([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "etc/replication/agents.{runmode}/{name}")]HttpRequest req, ExecutionContext context, string runmode, string name)
        {
            var method = this.GetType().GetMethod("PostAgent");
            return method != null
                ? (await ((Task<>)method.Invoke(this, new object[] { req, context, runmode, name })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("SlingApi_PostAuthorizableKeystore")]
        public async Task<ActionResult<KeystoreInfo>> _PostAuthorizableKeystore([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "{intermediatePath}/{authorizableId}.ks.html")]HttpRequest req, ExecutionContext context, string intermediatePath, string authorizableId)
        {
            var method = this.GetType().GetMethod("PostAuthorizableKeystore");
            return method != null
                ? (await ((Task<KeystoreInfo>)method.Invoke(this, new object[] { req, context, intermediatePath, authorizableId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("SlingApi_PostAuthorizables")]
        public async Task<ActionResult<string>> _PostAuthorizables([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "libs/granite/security/post/authorizables")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("PostAuthorizables");
            return method != null
                ? (await ((Task<string>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("SlingApi_PostConfigAdobeGraniteSamlAuthenticationHandler")]
        public async Task<ActionResult<>> _PostConfigAdobeGraniteSamlAuthenticationHandler([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("PostConfigAdobeGraniteSamlAuthenticationHandler");
            return method != null
                ? (await ((Task<>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("SlingApi_PostConfigApacheFelixJettyBasedHttpService")]
        public async Task<ActionResult<>> _PostConfigApacheFelixJettyBasedHttpService([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "apps/system/config/org.apache.felix.http")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("PostConfigApacheFelixJettyBasedHttpService");
            return method != null
                ? (await ((Task<>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("SlingApi_PostConfigApacheHttpComponentsProxyConfiguration")]
        public async Task<ActionResult<>> _PostConfigApacheHttpComponentsProxyConfiguration([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "apps/system/config/org.apache.http.proxyconfigurator.config")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("PostConfigApacheHttpComponentsProxyConfiguration");
            return method != null
                ? (await ((Task<>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("SlingApi_PostConfigApacheSlingDavExServlet")]
        public async Task<ActionResult<>> _PostConfigApacheSlingDavExServlet([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("PostConfigApacheSlingDavExServlet");
            return method != null
                ? (await ((Task<>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("SlingApi_PostConfigApacheSlingGetServlet")]
        public async Task<ActionResult<>> _PostConfigApacheSlingGetServlet([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("PostConfigApacheSlingGetServlet");
            return method != null
                ? (await ((Task<>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("SlingApi_PostConfigApacheSlingReferrerFilter")]
        public async Task<ActionResult<>> _PostConfigApacheSlingReferrerFilter([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "apps/system/config/org.apache.sling.security.impl.ReferrerFilter")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("PostConfigApacheSlingReferrerFilter");
            return method != null
                ? (await ((Task<>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("SlingApi_PostConfigProperty")]
        public async Task<ActionResult<>> _PostConfigProperty([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "apps/system/config/{configNodeName}")]HttpRequest req, ExecutionContext context, string configNodeName)
        {
            var method = this.GetType().GetMethod("PostConfigProperty");
            return method != null
                ? (await ((Task<>)method.Invoke(this, new object[] { req, context, configNodeName })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("SlingApi_PostNode")]
        public async Task<ActionResult<>> _PostNode([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "{path}/{name}")]HttpRequest req, ExecutionContext context, string path, string name)
        {
            var method = this.GetType().GetMethod("PostNode");
            return method != null
                ? (await ((Task<>)method.Invoke(this, new object[] { req, context, path, name })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("SlingApi_PostNodeRw")]
        public async Task<ActionResult<>> _PostNodeRw([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "{path}/{name}.rw.html")]HttpRequest req, ExecutionContext context, string path, string name)
        {
            var method = this.GetType().GetMethod("PostNodeRw");
            return method != null
                ? (await ((Task<>)method.Invoke(this, new object[] { req, context, path, name })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("SlingApi_PostPath")]
        public async Task<ActionResult<>> _PostPath([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "{path}/")]HttpRequest req, ExecutionContext context, string path)
        {
            var method = this.GetType().GetMethod("PostPath");
            return method != null
                ? (await ((Task<>)method.Invoke(this, new object[] { req, context, path })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("SlingApi_PostQuery")]
        public async Task<ActionResult<string>> _PostQuery([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "bin/querybuilder.json")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("PostQuery");
            return method != null
                ? (await ((Task<string>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("SlingApi_PostTreeActivation")]
        public async Task<ActionResult<>> _PostTreeActivation([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "libs/replication/treeactivation.html")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("PostTreeActivation");
            return method != null
                ? (await ((Task<>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("SlingApi_PostTruststore")]
        public async Task<ActionResult<string>> _PostTruststore([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "libs/granite/security/post/truststore")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("PostTruststore");
            return method != null
                ? (await ((Task<string>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("SlingApi_PostTruststorePKCS12")]
        public async Task<ActionResult<string>> _PostTruststorePKCS12([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "etc/truststore")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("PostTruststorePKCS12");
            return method != null
                ? (await ((Task<string>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
