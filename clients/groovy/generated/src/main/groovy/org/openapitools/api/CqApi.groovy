package org.openapitools.api;

import org.openapitools.api.ApiUtils

class CqApi {
    String basePath = "http://localhost"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def getLoginPage ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/libs/granite/core/content/login.html"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType






        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    String.class )

    }

    def postCqActions ( String authorizableId, String changelog, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/.cqactions.html"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (authorizableId == null) {
            throw new RuntimeException("missing required params authorizableId")
        }
        // verify required params are set
        if (changelog == null) {
            throw new RuntimeException("missing required params changelog")
        }

        if (authorizableId != null) {
            queryParams.put("authorizableId", authorizableId)
        }
        if (changelog != null) {
            queryParams.put("changelog", changelog)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

}
