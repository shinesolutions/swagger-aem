package org.openapitools.vertxweb.server.api;

import io.vertx.ext.web.FileUpload;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class GraniteApiImpl implements GraniteApi {
    public Future<ApiResponse<String>> sslSetup(String keystorePassword, String keystorePasswordConfirm, String truststorePassword, String truststorePasswordConfirm, String httpsHostname, String httpsPort, FileUpload privatekeyFile, FileUpload certificateFile) {
        return Future.failedFuture(new HttpException(501));
    }

}
