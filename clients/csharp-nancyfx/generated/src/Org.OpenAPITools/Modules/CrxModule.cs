using System;
using Nancy;
using Nancy.ModelBinding;
using System.Collections.Generic;
using Sharpility.Base;
using Org.OpenAPITools._.Models;
using Org.OpenAPITools._.Utils;
using NodaTime;

namespace Org.OpenAPITools._.Modules
{ 

    /// <summary>
    /// Module processing requests of Crx domain.
    /// </summary>
    public sealed class CrxModule : NancyModule
    {
        /// <summary>
        /// Sets up HTTP methods mappings.
        /// </summary>
        /// <param name="service">Service handling requests</param>
        public CrxModule(CrxService service) : base("/")
        { 
            Get["/crx/server/crx.default/jcr:root/.1.json"] = parameters =>
            {
                
                return service.GetCrxdeStatus(Context);
            };

            Get["/crx/packmgr/installstatus.jsp"] = parameters =>
            {
                
                return service.GetInstallStatus(Context);
            };

            Get["/crx/packmgr/service/script.html"] = parameters =>
            {
                
                service.GetPackageManagerServlet(Context);
                return new Response { ContentType = "text/html"};
            };

            Post["/crx/packmgr/service.jsp"] = parameters =>
            {
                var cmd = Parameters.ValueOf<string>(parameters, Context.Request, "cmd", ParameterType.Query);
                Preconditions.IsNotNull(cmd, "Required parameter: 'cmd' is missing at 'PostPackageService'");
                
                return service.PostPackageService(Context, cmd);
            };

            Post["/crx/packmgr/service/.json/{path}"] = parameters =>
            {
                var path = Parameters.ValueOf<string>(parameters, Context.Request, "path", ParameterType.Path);
                var cmd = Parameters.ValueOf<string>(parameters, Context.Request, "cmd", ParameterType.Query);
                var groupName = Parameters.ValueOf<string>(parameters, Context.Request, "groupName", ParameterType.Query);
                var packageName = Parameters.ValueOf<string>(parameters, Context.Request, "packageName", ParameterType.Query);
                var packageVersion = Parameters.ValueOf<string>(parameters, Context.Request, "packageVersion", ParameterType.Query);
                var charset = Parameters.ValueOf<string>(parameters, Context.Request, "charset", ParameterType.Query);
                var force = Parameters.ValueOf<bool?>(parameters, Context.Request, "force", ParameterType.Query);
                var recursive = Parameters.ValueOf<bool?>(parameters, Context.Request, "recursive", ParameterType.Query);
                var package = Parameters.ValueOf<System.IO.Stream>(parameters, Context.Request, "package", ParameterType.Undefined);
                Preconditions.IsNotNull(path, "Required parameter: 'path' is missing at 'PostPackageServiceJson'");
                
                Preconditions.IsNotNull(cmd, "Required parameter: 'cmd' is missing at 'PostPackageServiceJson'");
                
                return service.PostPackageServiceJson(Context, path, cmd, groupName, packageName, packageVersion, charset, force, recursive, package);
            };

            Post["/crx/packmgr/update.jsp"] = parameters =>
            {
                var groupName = Parameters.ValueOf<string>(parameters, Context.Request, "groupName", ParameterType.Query);
                var packageName = Parameters.ValueOf<string>(parameters, Context.Request, "packageName", ParameterType.Query);
                var version = Parameters.ValueOf<string>(parameters, Context.Request, "version", ParameterType.Query);
                var path = Parameters.ValueOf<string>(parameters, Context.Request, "path", ParameterType.Query);
                var filter = Parameters.ValueOf<string>(parameters, Context.Request, "filter", ParameterType.Query);
                var charset = Parameters.ValueOf<string>(parameters, Context.Request, "charset", ParameterType.Query);
                Preconditions.IsNotNull(groupName, "Required parameter: 'groupName' is missing at 'PostPackageUpdate'");
                
                Preconditions.IsNotNull(packageName, "Required parameter: 'packageName' is missing at 'PostPackageUpdate'");
                
                Preconditions.IsNotNull(version, "Required parameter: 'version' is missing at 'PostPackageUpdate'");
                
                Preconditions.IsNotNull(path, "Required parameter: 'path' is missing at 'PostPackageUpdate'");
                
                return service.PostPackageUpdate(Context, groupName, packageName, version, path, filter, charset);
            };

            Post["/crx/explorer/ui/setpassword.jsp"] = parameters =>
            {
                var old = Parameters.ValueOf<string>(parameters, Context.Request, "old", ParameterType.Query);
                var plain = Parameters.ValueOf<string>(parameters, Context.Request, "plain", ParameterType.Query);
                var verify = Parameters.ValueOf<string>(parameters, Context.Request, "verify", ParameterType.Query);
                Preconditions.IsNotNull(old, "Required parameter: 'old' is missing at 'PostSetPassword'");
                
                Preconditions.IsNotNull(plain, "Required parameter: 'plain' is missing at 'PostSetPassword'");
                
                Preconditions.IsNotNull(verify, "Required parameter: 'verify' is missing at 'PostSetPassword'");
                
                return service.PostSetPassword(Context, old, plain, verify);
            };
        }
    }

    /// <summary>
    /// Service handling Crx requests.
    /// </summary>
    public interface CrxService
    {
        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <returns>string</returns>
        string GetCrxdeStatus(NancyContext context);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <returns>InstallStatus</returns>
        InstallStatus GetInstallStatus(NancyContext context);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <returns></returns>
        void GetPackageManagerServlet(NancyContext context);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="cmd"></param>
        /// <returns>string</returns>
        string PostPackageService(NancyContext context, string cmd);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="path"></param>
        /// <param name="cmd"></param>
        /// <param name="groupName"> (optional)</param>
        /// <param name="packageName"> (optional)</param>
        /// <param name="packageVersion"> (optional)</param>
        /// <param name="charset"> (optional)</param>
        /// <param name="force"> (optional)</param>
        /// <param name="recursive"> (optional)</param>
        /// <param name="package"> (optional)</param>
        /// <returns>string</returns>
        string PostPackageServiceJson(NancyContext context, string path, string cmd, string groupName, string packageName, string packageVersion, string charset, bool? force, bool? recursive, System.IO.Stream package);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="groupName"></param>
        /// <param name="packageName"></param>
        /// <param name="version"></param>
        /// <param name="path"></param>
        /// <param name="filter"> (optional)</param>
        /// <param name="charset"> (optional)</param>
        /// <returns>string</returns>
        string PostPackageUpdate(NancyContext context, string groupName, string packageName, string version, string path, string filter, string charset);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="old"></param>
        /// <param name="plain"></param>
        /// <param name="verify"></param>
        /// <returns>string</returns>
        string PostSetPassword(NancyContext context, string old, string plain, string verify);
    }

    /// <summary>
    /// Abstraction of CrxService.
    /// </summary>
    public abstract class AbstractCrxService: CrxService
    {
        public virtual string GetCrxdeStatus(NancyContext context)
        {
            return GetCrxdeStatus();
        }

        public virtual InstallStatus GetInstallStatus(NancyContext context)
        {
            return GetInstallStatus();
        }

        public virtual void GetPackageManagerServlet(NancyContext context)
        {
            GetPackageManagerServlet();
        }

        public virtual string PostPackageService(NancyContext context, string cmd)
        {
            return PostPackageService(cmd);
        }

        public virtual string PostPackageServiceJson(NancyContext context, string path, string cmd, string groupName, string packageName, string packageVersion, string charset, bool? force, bool? recursive, System.IO.Stream package)
        {
            return PostPackageServiceJson(path, cmd, groupName, packageName, packageVersion, charset, force, recursive, package);
        }

        public virtual string PostPackageUpdate(NancyContext context, string groupName, string packageName, string version, string path, string filter, string charset)
        {
            return PostPackageUpdate(groupName, packageName, version, path, filter, charset);
        }

        public virtual string PostSetPassword(NancyContext context, string old, string plain, string verify)
        {
            return PostSetPassword(old, plain, verify);
        }

        protected abstract string GetCrxdeStatus();

        protected abstract InstallStatus GetInstallStatus();

        protected abstract void GetPackageManagerServlet();

        protected abstract string PostPackageService(string cmd);

        protected abstract string PostPackageServiceJson(string path, string cmd, string groupName, string packageName, string packageVersion, string charset, bool? force, bool? recursive, System.IO.Stream package);

        protected abstract string PostPackageUpdate(string groupName, string packageName, string version, string path, string filter, string charset);

        protected abstract string PostSetPassword(string old, string plain, string verify);
    }

}
