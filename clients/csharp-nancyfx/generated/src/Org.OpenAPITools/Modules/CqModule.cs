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
    /// Module processing requests of Cq domain.
    /// </summary>
    public sealed class CqModule : NancyModule
    {
        /// <summary>
        /// Sets up HTTP methods mappings.
        /// </summary>
        /// <param name="service">Service handling requests</param>
        public CqModule(CqService service) : base("/")
        { 
            Get["/libs/granite/core/content/login.html"] = parameters =>
            {
                
                return service.GetLoginPage(Context);
            };

            Post["/.cqactions.html"] = parameters =>
            {
                var authorizableId = Parameters.ValueOf<string>(parameters, Context.Request, "authorizableId", ParameterType.Query);
                var changelog = Parameters.ValueOf<string>(parameters, Context.Request, "changelog", ParameterType.Query);
                Preconditions.IsNotNull(authorizableId, "Required parameter: 'authorizableId' is missing at 'PostCqActions'");
                
                Preconditions.IsNotNull(changelog, "Required parameter: 'changelog' is missing at 'PostCqActions'");
                
                service.PostCqActions(Context, authorizableId, changelog);
                return new Response { ContentType = ""};
            };
        }
    }

    /// <summary>
    /// Service handling Cq requests.
    /// </summary>
    public interface CqService
    {
        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <returns>string</returns>
        string GetLoginPage(NancyContext context);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="authorizableId"></param>
        /// <param name="changelog"></param>
        /// <returns></returns>
        void PostCqActions(NancyContext context, string authorizableId, string changelog);
    }

    /// <summary>
    /// Abstraction of CqService.
    /// </summary>
    public abstract class AbstractCqService: CqService
    {
        public virtual string GetLoginPage(NancyContext context)
        {
            return GetLoginPage();
        }

        public virtual void PostCqActions(NancyContext context, string authorizableId, string changelog)
        {
            PostCqActions(authorizableId, changelog);
        }

        protected abstract string GetLoginPage();

        protected abstract void PostCqActions(string authorizableId, string changelog);
    }

}
