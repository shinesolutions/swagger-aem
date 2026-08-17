package org.openapitools.vertxweb.server.api;


import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface CustomApi  {
    Future<ApiResponse<String>> getAemHealthCheck(String tags, Boolean combineTagsOr);
    Future<ApiResponse<Void>> postConfigAemHealthCheckServlet(List<String> bundlesIgnored, String bundlesIgnoredAtTypeHint);
    Future<ApiResponse<Void>> postConfigAemPasswordReset(List<String> pwdresetAuthorizables, String pwdresetAuthorizablesAtTypeHint);
}
