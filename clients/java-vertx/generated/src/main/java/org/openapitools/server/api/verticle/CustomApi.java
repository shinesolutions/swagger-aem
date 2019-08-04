package org.openapitools.server.api.verticle;

import org.openapitools.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface CustomApi  {
    //getAemHealthCheck
    void getAemHealthCheck(String tags, Boolean combineTagsOr, Handler<AsyncResult<String>> handler);
    
    //postConfigAemHealthCheckServlet
    void postConfigAemHealthCheckServlet(List<String> bundlesIgnored, String bundlesIgnoredAtTypeHint, Handler<AsyncResult<Void>> handler);
    
    //postConfigAemPasswordReset
    void postConfigAemPasswordReset(List<String> pwdresetAuthorizables, String pwdresetAuthorizablesAtTypeHint, Handler<AsyncResult<Void>> handler);
    
}
