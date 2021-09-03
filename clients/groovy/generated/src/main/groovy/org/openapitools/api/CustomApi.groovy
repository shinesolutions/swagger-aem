package org.openapitools.api;

import org.openapitools.api.ApiUtils

class CustomApi {
    String basePath = "http://localhost"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def getAemHealthCheck ( String tags, Boolean combineTagsOr, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/system/health"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (tags != null) {
            queryParams.put("tags", tags)
        }
        if (combineTagsOr != null) {
            queryParams.put("combineTagsOr", combineTagsOr)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    String.class )

    }

    def postConfigAemHealthCheckServlet ( List<String> bundlesIgnored, String bundlesIgnoredAtTypeHint, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (bundlesIgnored != null) {
            queryParams.put("bundles.ignored", bundlesIgnored)
        }
        if (bundlesIgnoredAtTypeHint != null) {
            queryParams.put("bundles.ignored@TypeHint", bundlesIgnoredAtTypeHint)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def postConfigAemPasswordReset ( List<String> pwdresetAuthorizables, String pwdresetAuthorizablesAtTypeHint, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/apps/system/config/com.shinesolutions.aem.passwordreset.Activator"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (pwdresetAuthorizables != null) {
            queryParams.put("pwdreset.authorizables", pwdresetAuthorizables)
        }
        if (pwdresetAuthorizablesAtTypeHint != null) {
            queryParams.put("pwdreset.authorizables@TypeHint", pwdresetAuthorizablesAtTypeHint)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

}
