package org.openapitools.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import org.openapitools.api.ApiUtils


import java.util.*;

@Mixin(ApiUtils)
class CqApi {
    String basePath = "http://localhost"
    String versionPath = "/api/v1"

    def getLoginPage ( Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/libs/granite/core/content/login.html"

        // query params
        def queryParams = [:]
        def headerParams = [:]

        // TODO: form params, body param not yet support

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    String.class )

    }

    def postCqActions ( String authorizableId, String changelog, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/.cqactions.html"

        // query params
        def queryParams = [:]
        def headerParams = [:]

        // verify required params are set
        if (authorizableId == null) {
            throw new RuntimeException("missing required params authorizableId")
        }

        // verify required params are set
        if (changelog == null) {
            throw new RuntimeException("missing required params changelog")
        }

        if (!"null".equals(String.valueOf(authorizableId)))
            queryParams.put("authorizableId", String.valueOf(authorizableId))

        if (!"null".equals(String.valueOf(changelog)))
            queryParams.put("changelog", String.valueOf(changelog))

        // TODO: form params, body param not yet support

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    null )

    }

}
