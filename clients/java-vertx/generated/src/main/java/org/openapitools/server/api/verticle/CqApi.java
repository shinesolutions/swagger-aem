package org.openapitools.server.api.verticle;

import org.openapitools.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface CqApi  {
    //getLoginPage
    void getLoginPage(Handler<AsyncResult<String>> handler);
    
    //postCqActions
    void postCqActions(String authorizableId, String changelog, Handler<AsyncResult<Void>> handler);
    
}
