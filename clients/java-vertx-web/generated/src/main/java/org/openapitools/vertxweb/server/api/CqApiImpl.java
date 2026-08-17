package org.openapitools.vertxweb.server.api;


import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class CqApiImpl implements CqApi {
    public Future<ApiResponse<String>> getLoginPage() {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<Void>> postCqActions(String authorizableId, String changelog) {
        return Future.failedFuture(new HttpException(501));
    }

}
