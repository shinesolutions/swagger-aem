package org.openapitools.vertxweb.server.api;


import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface CqApi  {
    Future<ApiResponse<String>> getLoginPage();
    Future<ApiResponse<Void>> postCqActions(String authorizableId, String changelog);
}
