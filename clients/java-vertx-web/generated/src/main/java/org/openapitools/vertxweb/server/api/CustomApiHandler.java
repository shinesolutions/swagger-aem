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

public class CustomApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(CustomApiHandler.class);

    private final CustomApi api;

    public CustomApiHandler(CustomApi api) {
        this.api = api;
    }

    @Deprecated
    public CustomApiHandler() {
        this(new CustomApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("getAemHealthCheck").handler(this::getAemHealthCheck);
        builder.operation("postConfigAemHealthCheckServlet").handler(this::postConfigAemHealthCheckServlet);
        builder.operation("postConfigAemPasswordReset").handler(this::postConfigAemPasswordReset);
    }

    private void getAemHealthCheck(RoutingContext routingContext) {
        logger.info("getAemHealthCheck()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String tags = requestParameters.queryParameter("tags") != null ? requestParameters.queryParameter("tags").getString() : null;
        Boolean combineTagsOr = requestParameters.queryParameter("combineTagsOr") != null ? requestParameters.queryParameter("combineTagsOr").getBoolean() : null;

        logger.debug("Parameter tags is {}", tags);
        logger.debug("Parameter combineTagsOr is {}", combineTagsOr);

        api.getAemHealthCheck(tags, combineTagsOr)
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

    private void postConfigAemHealthCheckServlet(RoutingContext routingContext) {
        logger.info("postConfigAemHealthCheckServlet()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        List<String> bundlesIgnored = requestParameters.queryParameter("bundles.ignored") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("bundles.ignored").get(), new TypeReference<List<String>>(){}) : null;
        String bundlesIgnoredAtTypeHint = requestParameters.queryParameter("bundles.ignored@TypeHint") != null ? requestParameters.queryParameter("bundles.ignored@TypeHint").getString() : null;

        logger.debug("Parameter bundlesIgnored is {}", bundlesIgnored);
        logger.debug("Parameter bundlesIgnoredAtTypeHint is {}", bundlesIgnoredAtTypeHint);

        api.postConfigAemHealthCheckServlet(bundlesIgnored, bundlesIgnoredAtTypeHint)
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

    private void postConfigAemPasswordReset(RoutingContext routingContext) {
        logger.info("postConfigAemPasswordReset()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        List<String> pwdresetAuthorizables = requestParameters.queryParameter("pwdreset.authorizables") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("pwdreset.authorizables").get(), new TypeReference<List<String>>(){}) : null;
        String pwdresetAuthorizablesAtTypeHint = requestParameters.queryParameter("pwdreset.authorizables@TypeHint") != null ? requestParameters.queryParameter("pwdreset.authorizables@TypeHint").getString() : null;

        logger.debug("Parameter pwdresetAuthorizables is {}", pwdresetAuthorizables);
        logger.debug("Parameter pwdresetAuthorizablesAtTypeHint is {}", pwdresetAuthorizablesAtTypeHint);

        api.postConfigAemPasswordReset(pwdresetAuthorizables, pwdresetAuthorizablesAtTypeHint)
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
