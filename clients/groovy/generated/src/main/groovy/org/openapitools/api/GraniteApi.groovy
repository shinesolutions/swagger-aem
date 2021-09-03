package org.openapitools.api;

import org.openapitools.api.ApiUtils

class GraniteApi {
    String basePath = "http://localhost"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def sslSetup ( String keystorePassword, String keystorePasswordConfirm, String truststorePassword, String truststorePasswordConfirm, String httpsHostname, String httpsPort, File privatekeyFile, File certificateFile, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/libs/granite/security/post/sslSetup.html"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (keystorePassword == null) {
            throw new RuntimeException("missing required params keystorePassword")
        }
        // verify required params are set
        if (keystorePasswordConfirm == null) {
            throw new RuntimeException("missing required params keystorePasswordConfirm")
        }
        // verify required params are set
        if (truststorePassword == null) {
            throw new RuntimeException("missing required params truststorePassword")
        }
        // verify required params are set
        if (truststorePasswordConfirm == null) {
            throw new RuntimeException("missing required params truststorePasswordConfirm")
        }
        // verify required params are set
        if (httpsHostname == null) {
            throw new RuntimeException("missing required params httpsHostname")
        }
        // verify required params are set
        if (httpsPort == null) {
            throw new RuntimeException("missing required params httpsPort")
        }

        if (keystorePassword != null) {
            queryParams.put("keystorePassword", keystorePassword)
        }
        if (keystorePasswordConfirm != null) {
            queryParams.put("keystorePasswordConfirm", keystorePasswordConfirm)
        }
        if (truststorePassword != null) {
            queryParams.put("truststorePassword", truststorePassword)
        }
        if (truststorePasswordConfirm != null) {
            queryParams.put("truststorePasswordConfirm", truststorePasswordConfirm)
        }
        if (httpsHostname != null) {
            queryParams.put("httpsHostname", httpsHostname)
        }
        if (httpsPort != null) {
            queryParams.put("httpsPort", httpsPort)
        }



        contentType = 'multipart/form-data';
        bodyParams = [:]
        bodyParams.put("privatekeyFile", privatekeyFile)
        bodyParams.put("certificateFile", certificateFile)

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    String.class )

    }

}
