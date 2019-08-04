package org.openapitools.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import org.openapitools.api.ApiUtils

import org.openapitools.model.InstallStatus

import java.util.*;

@Mixin(ApiUtils)
class CrxApi {
    String basePath = "http://localhost"
    String versionPath = "/api/v1"

    def getCrxdeStatus ( Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/crx/server/crx.default/jcr:root/.1.json"

        // query params
        def queryParams = [:]
        def headerParams = [:]

        // TODO: form params, body param not yet support

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    String.class )

    }

    def getInstallStatus ( Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/crx/packmgr/installstatus.jsp"

        // query params
        def queryParams = [:]
        def headerParams = [:]

        // TODO: form params, body param not yet support

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    InstallStatus.class )

    }

    def getPackageManagerServlet ( Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/crx/packmgr/service/script.html"

        // query params
        def queryParams = [:]
        def headerParams = [:]

        // TODO: form params, body param not yet support

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    null )

    }

    def postPackageService ( String cmd, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/crx/packmgr/service.jsp"

        // query params
        def queryParams = [:]
        def headerParams = [:]

        // verify required params are set
        if (cmd == null) {
            throw new RuntimeException("missing required params cmd")
        }

        if (!"null".equals(String.valueOf(cmd)))
            queryParams.put("cmd", String.valueOf(cmd))

        // TODO: form params, body param not yet support

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    String.class )

    }

    def postPackageServiceJson ( String path, String cmd, String groupName, String packageName, String packageVersion, String charset, Boolean force, Boolean recursive, File _package, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/crx/packmgr/service/.json/{path}"

        // query params
        def queryParams = [:]
        def headerParams = [:]

        // verify required params are set
        if (path == null) {
            throw new RuntimeException("missing required params path")
        }

        // verify required params are set
        if (cmd == null) {
            throw new RuntimeException("missing required params cmd")
        }

        if (!"null".equals(String.valueOf(cmd)))
            queryParams.put("cmd", String.valueOf(cmd))

        if (!"null".equals(String.valueOf(groupName)))
            queryParams.put("groupName", String.valueOf(groupName))

        if (!"null".equals(String.valueOf(packageName)))
            queryParams.put("packageName", String.valueOf(packageName))

        if (!"null".equals(String.valueOf(packageVersion)))
            queryParams.put("packageVersion", String.valueOf(packageVersion))

        if (!"null".equals(String.valueOf(charset)))
            queryParams.put("_charset_", String.valueOf(charset))

        if (!"null".equals(String.valueOf(force)))
            queryParams.put("force", String.valueOf(force))

        if (!"null".equals(String.valueOf(recursive)))
            queryParams.put("recursive", String.valueOf(recursive))

        // TODO: form params, body param not yet support

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    String.class )

    }

    def postPackageUpdate ( String groupName, String packageName, String version, String path, String filter, String charset, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/crx/packmgr/update.jsp"

        // query params
        def queryParams = [:]
        def headerParams = [:]

        // verify required params are set
        if (groupName == null) {
            throw new RuntimeException("missing required params groupName")
        }

        // verify required params are set
        if (packageName == null) {
            throw new RuntimeException("missing required params packageName")
        }

        // verify required params are set
        if (version == null) {
            throw new RuntimeException("missing required params version")
        }

        // verify required params are set
        if (path == null) {
            throw new RuntimeException("missing required params path")
        }

        if (!"null".equals(String.valueOf(groupName)))
            queryParams.put("groupName", String.valueOf(groupName))

        if (!"null".equals(String.valueOf(packageName)))
            queryParams.put("packageName", String.valueOf(packageName))

        if (!"null".equals(String.valueOf(version)))
            queryParams.put("version", String.valueOf(version))

        if (!"null".equals(String.valueOf(path)))
            queryParams.put("path", String.valueOf(path))

        if (!"null".equals(String.valueOf(filter)))
            queryParams.put("filter", String.valueOf(filter))

        if (!"null".equals(String.valueOf(charset)))
            queryParams.put("_charset_", String.valueOf(charset))

        // TODO: form params, body param not yet support

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    String.class )

    }

    def postSetPassword ( String old, String plain, String verify, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/crx/explorer/ui/setpassword.jsp"

        // query params
        def queryParams = [:]
        def headerParams = [:]

        // verify required params are set
        if (old == null) {
            throw new RuntimeException("missing required params old")
        }

        // verify required params are set
        if (plain == null) {
            throw new RuntimeException("missing required params plain")
        }

        // verify required params are set
        if (verify == null) {
            throw new RuntimeException("missing required params verify")
        }

        if (!"null".equals(String.valueOf(old)))
            queryParams.put("old", String.valueOf(old))

        if (!"null".equals(String.valueOf(plain)))
            queryParams.put("plain", String.valueOf(plain))

        if (!"null".equals(String.valueOf(verify)))
            queryParams.put("verify", String.valueOf(verify))

        // TODO: form params, body param not yet support

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    String.class )

    }

}
