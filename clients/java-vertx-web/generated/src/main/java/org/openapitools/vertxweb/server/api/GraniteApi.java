package org.openapitools.vertxweb.server.api;

import io.vertx.ext.web.FileUpload;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface GraniteApi  {
    Future<ApiResponse<String>> sslSetup(String keystorePassword, String keystorePasswordConfirm, String truststorePassword, String truststorePasswordConfirm, String httpsHostname, String httpsPort, FileUpload privatekeyFile, FileUpload certificateFile);
}
