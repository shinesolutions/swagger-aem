package org.openapitools.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import org.openapitools.api.ApiUtils


import java.util.*;

@Mixin(ApiUtils)
class CustomApi {
    String basePath = "http://localhost"
    String versionPath = "/api/v1"

    def getAemHealthCheck ( String tags, Boolean combineTagsOr, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/system/health"

        // query params
        def queryParams = [:]
        def headerParams = [:]

        if (!"null".equals(String.valueOf(tags)))
            queryParams.put("tags", String.valueOf(tags))

        if (!"null".equals(String.valueOf(combineTagsOr)))
            queryParams.put("combineTagsOr", String.valueOf(combineTagsOr))

        // TODO: form params, body param not yet support

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    String.class )

    }

    def postConfigAemHealthCheckServlet ( List<String> bundlesIgnored, String bundlesIgnoredAtTypeHint, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck"

        // query params
        def queryParams = [:]
        def headerParams = [:]

        if (!"null".equals(String.valueOf(bundlesIgnored)))
            queryParams.put("bundles.ignored", String.valueOf(bundlesIgnored))

        if (!"null".equals(String.valueOf(bundlesIgnoredAtTypeHint)))
            queryParams.put("bundles.ignored@TypeHint", String.valueOf(bundlesIgnoredAtTypeHint))

        // TODO: form params, body param not yet support

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    null )

    }

    def postConfigAemPasswordReset ( List<String> pwdresetAuthorizables, String pwdresetAuthorizablesAtTypeHint, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/apps/system/config/com.shinesolutions.aem.passwordreset.Activator"

        // query params
        def queryParams = [:]
        def headerParams = [:]

        if (!"null".equals(String.valueOf(pwdresetAuthorizables)))
            queryParams.put("pwdreset.authorizables", String.valueOf(pwdresetAuthorizables))

        if (!"null".equals(String.valueOf(pwdresetAuthorizablesAtTypeHint)))
            queryParams.put("pwdreset.authorizables@TypeHint", String.valueOf(pwdresetAuthorizablesAtTypeHint))

        // TODO: form params, body param not yet support

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    null )

    }

}
