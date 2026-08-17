package org.openapitools.vertxweb.server.api;


import com.fasterxml.jackson.core.type.TypeReference;
import io.vertx.core.json.jackson.DatabindCodec;
import io.vertx.ext.web.openapi.RouterBuilder;
import io.vertx.ext.web.validation.RequestParameters;
import io.vertx.ext.web.validation.RequestParameter;
import io.vertx.ext.web.validation.ValidationHandler;
import io.vertx.ext.web.RoutingContext;
import io.vertx.core.json.JsonObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;

public class CqApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(CqApiHandler.class);

    private final CqApi api;

    public CqApiHandler(CqApi api) {
        this.api = api;
    }

    @Deprecated
    public CqApiHandler() {
        this(new CqApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("getLoginPage").handler(this::getLoginPage);
        builder.operation("postCqActions").handler(this::postCqActions);
    }

    private void getLoginPage(RoutingContext routingContext) {
        logger.info("getLoginPage()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);



        api.getLoginPage()
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void postCqActions(RoutingContext routingContext) {
        logger.info("postCqActions()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String authorizableId = requestParameters.queryParameter("authorizableId") != null ? requestParameters.queryParameter("authorizableId").getString() : null;
        String changelog = requestParameters.queryParameter("changelog") != null ? requestParameters.queryParameter("changelog").getString() : null;

        logger.debug("Parameter authorizableId is {}", authorizableId);
        logger.debug("Parameter changelog is {}", changelog);

        api.postCqActions(authorizableId, changelog)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

}
