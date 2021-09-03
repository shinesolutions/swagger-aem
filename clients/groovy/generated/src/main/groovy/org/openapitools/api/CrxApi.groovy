package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.InstallStatus

class CrxApi {
    String basePath = "http://localhost"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def getCrxdeStatus ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/crx/server/crx.default/jcr:root/.1.json"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType






        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    String.class )

    }

    def getInstallStatus ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/crx/packmgr/installstatus.jsp"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType






        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    InstallStatus.class )

    }

    def getPackageManagerServlet ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/crx/packmgr/service/script.html"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType






        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def postPackageService ( String cmd, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/crx/packmgr/service.jsp"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (cmd == null) {
            throw new RuntimeException("missing required params cmd")
        }

        if (cmd != null) {
            queryParams.put("cmd", cmd)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    String.class )

    }

    def postPackageServiceJson ( String path, String cmd, String groupName, String packageName, String packageVersion, String charset, Boolean force, Boolean recursive, File _package, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/crx/packmgr/service/.json/${path}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (path == null) {
            throw new RuntimeException("missing required params path")
        }
        // verify required params are set
        if (cmd == null) {
            throw new RuntimeException("missing required params cmd")
        }

        if (cmd != null) {
            queryParams.put("cmd", cmd)
        }
        if (groupName != null) {
            queryParams.put("groupName", groupName)
        }
        if (packageName != null) {
            queryParams.put("packageName", packageName)
        }
        if (packageVersion != null) {
            queryParams.put("packageVersion", packageVersion)
        }
        if (charset != null) {
            queryParams.put("_charset_", charset)
        }
        if (force != null) {
            queryParams.put("force", force)
        }
        if (recursive != null) {
            queryParams.put("recursive", recursive)
        }



        contentType = 'multipart/form-data';
        bodyParams = _package

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    String.class )

    }

    def postPackageUpdate ( String groupName, String packageName, String version, String path, String filter, String charset, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/crx/packmgr/update.jsp"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

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

        if (groupName != null) {
            queryParams.put("groupName", groupName)
        }
        if (packageName != null) {
            queryParams.put("packageName", packageName)
        }
        if (version != null) {
            queryParams.put("version", version)
        }
        if (path != null) {
            queryParams.put("path", path)
        }
        if (filter != null) {
            queryParams.put("filter", filter)
        }
        if (charset != null) {
            queryParams.put("_charset_", charset)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    String.class )

    }

    def postSetPassword ( String old, String plain, String verify, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/crx/explorer/ui/setpassword.jsp"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

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

        if (old != null) {
            queryParams.put("old", old)
        }
        if (plain != null) {
            queryParams.put("plain", plain)
        }
        if (verify != null) {
            queryParams.put("verify", verify)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    String.class )

    }

}
