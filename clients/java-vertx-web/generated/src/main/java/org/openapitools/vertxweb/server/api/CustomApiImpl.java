package org.openapitools.vertxweb.server.api;


import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class CustomApiImpl implements CustomApi {
    public Future<ApiResponse<String>> getAemHealthCheck(String tags, Boolean combineTagsOr) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<Void>> postConfigAemHealthCheckServlet(List<String> bundlesIgnored, String bundlesIgnoredAtTypeHint) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<Void>> postConfigAemPasswordReset(List<String> pwdresetAuthorizables, String pwdresetAuthorizablesAtTypeHint) {
        return Future.failedFuture(new HttpException(501));
    }

}
