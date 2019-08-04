using System;
using Nancy;
using Nancy.ModelBinding;
using System.Collections.Generic;
using Sharpility.Base;
using Org.OpenAPITools..Models;
using Org.OpenAPITools..Utils;
using NodaTime;

namespace Org.OpenAPITools..Modules
{ 

    /// <summary>
    /// Module processing requests of Custom domain.
    /// </summary>
    public sealed class CustomModule : NancyModule
    {
        /// <summary>
        /// Sets up HTTP methods mappings.
        /// </summary>
        /// <param name="service">Service handling requests</param>
        public CustomModule(CustomService service) : base("/")
        { 
            Get["/system/health"] = parameters =>
            {
                var tags = Parameters.ValueOf<string>(parameters, Context.Request, "tags", ParameterType.Query);
                var combineTagsOr = Parameters.ValueOf<bool?>(parameters, Context.Request, "combineTagsOr", ParameterType.Query);
                return service.GetAemHealthCheck(Context, tags, combineTagsOr);
            };

            Post["/apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck"] = parameters =>
            {
                var bundlesIgnored = Parameters.ValueOf<List<string>>(parameters, Context.Request, "bundlesIgnored", ParameterType.Query);
                var bundlesIgnoredTypeHint = Parameters.ValueOf<string>(parameters, Context.Request, "bundlesIgnoredTypeHint", ParameterType.Query);
                service.PostConfigAemHealthCheckServlet(Context, bundlesIgnored, bundlesIgnoredTypeHint);
                return new Response { ContentType = ""};
            };

            Post["/apps/system/config/com.shinesolutions.aem.passwordreset.Activator"] = parameters =>
            {
                var pwdresetAuthorizables = Parameters.ValueOf<List<string>>(parameters, Context.Request, "pwdresetAuthorizables", ParameterType.Query);
                var pwdresetAuthorizablesTypeHint = Parameters.ValueOf<string>(parameters, Context.Request, "pwdresetAuthorizablesTypeHint", ParameterType.Query);
                service.PostConfigAemPasswordReset(Context, pwdresetAuthorizables, pwdresetAuthorizablesTypeHint);
                return new Response { ContentType = ""};
            };
        }
    }

    /// <summary>
    /// Service handling Custom requests.
    /// </summary>
    public interface CustomService
    {
        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="tags"> (optional)</param>
        /// <param name="combineTagsOr"> (optional)</param>
        /// <returns>string</returns>
        string GetAemHealthCheck(NancyContext context, string tags, bool? combineTagsOr);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="bundlesIgnored"> (optional)</param>
        /// <param name="bundlesIgnoredTypeHint"> (optional)</param>
        /// <returns></returns>
        void PostConfigAemHealthCheckServlet(NancyContext context, List<string> bundlesIgnored, string bundlesIgnoredTypeHint);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="pwdresetAuthorizables"> (optional)</param>
        /// <param name="pwdresetAuthorizablesTypeHint"> (optional)</param>
        /// <returns></returns>
        void PostConfigAemPasswordReset(NancyContext context, List<string> pwdresetAuthorizables, string pwdresetAuthorizablesTypeHint);
    }

    /// <summary>
    /// Abstraction of CustomService.
    /// </summary>
    public abstract class AbstractCustomService: CustomService
    {
        public virtual string GetAemHealthCheck(NancyContext context, string tags, bool? combineTagsOr)
        {
            return GetAemHealthCheck(tags, combineTagsOr);
        }

        public virtual void PostConfigAemHealthCheckServlet(NancyContext context, List<string> bundlesIgnored, string bundlesIgnoredTypeHint)
        {
            PostConfigAemHealthCheckServlet(bundlesIgnored, bundlesIgnoredTypeHint);
        }

        public virtual void PostConfigAemPasswordReset(NancyContext context, List<string> pwdresetAuthorizables, string pwdresetAuthorizablesTypeHint)
        {
            PostConfigAemPasswordReset(pwdresetAuthorizables, pwdresetAuthorizablesTypeHint);
        }

        protected abstract string GetAemHealthCheck(string tags, bool? combineTagsOr);

        protected abstract void PostConfigAemHealthCheckServlet(List<string> bundlesIgnored, string bundlesIgnoredTypeHint);

        protected abstract void PostConfigAemPasswordReset(List<string> pwdresetAuthorizables, string pwdresetAuthorizablesTypeHint);
    }

}
