package org.openapitools.server.api.verticle;

import java.io.File;
import org.openapitools.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface GraniteApi  {
    //sslSetup
    void sslSetup(String keystorePassword, String keystorePasswordConfirm, String truststorePassword, String truststorePasswordConfirm, String httpsHostname, String httpsPort, File privatekeyFile, File certificateFile, Handler<AsyncResult<String>> handler);
    
}
