package org.openapitools.vertxweb.server.api;

import io.vertx.ext.web.FileUpload;
import org.openapitools.vertxweb.server.model.InstallStatus;

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

public class CrxApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(CrxApiHandler.class);

    private final CrxApi api;

    public CrxApiHandler(CrxApi api) {
        this.api = api;
    }

    @Deprecated
    public CrxApiHandler() {
        this(new CrxApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("getCrxdeStatus").handler(this::getCrxdeStatus);
        builder.operation("getInstallStatus").handler(this::getInstallStatus);
        builder.operation("getPackageManagerServlet").handler(this::getPackageManagerServlet);
        builder.operation("postPackageService").handler(this::postPackageService);
        builder.operation("postPackageServiceJson").handler(this::postPackageServiceJson);
        builder.operation("postPackageUpdate").handler(this::postPackageUpdate);
        builder.operation("postSetPassword").handler(this::postSetPassword);
    }

    private void getCrxdeStatus(RoutingContext routingContext) {
        logger.info("getCrxdeStatus()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);



        api.getCrxdeStatus()
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

    private void getInstallStatus(RoutingContext routingContext) {
        logger.info("getInstallStatus()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);



        api.getInstallStatus()
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

    private void getPackageManagerServlet(RoutingContext routingContext) {
        logger.info("getPackageManagerServlet()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);



        api.getPackageManagerServlet()
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

    private void postPackageService(RoutingContext routingContext) {
        logger.info("postPackageService()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String cmd = requestParameters.queryParameter("cmd") != null ? requestParameters.queryParameter("cmd").getString() : null;

        logger.debug("Parameter cmd is {}", cmd);

        api.postPackageService(cmd)
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

    private void postPackageServiceJson(RoutingContext routingContext) {
        logger.info("postPackageServiceJson()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String path = requestParameters.pathParameter("path") != null ? requestParameters.pathParameter("path").getString() : null;
        String cmd = requestParameters.queryParameter("cmd") != null ? requestParameters.queryParameter("cmd").getString() : null;
        String groupName = requestParameters.queryParameter("groupName") != null ? requestParameters.queryParameter("groupName").getString() : null;
        String packageName = requestParameters.queryParameter("packageName") != null ? requestParameters.queryParameter("packageName").getString() : null;
        String packageVersion = requestParameters.queryParameter("packageVersion") != null ? requestParameters.queryParameter("packageVersion").getString() : null;
        String charset = requestParameters.queryParameter("_charset_") != null ? requestParameters.queryParameter("_charset_").getString() : null;
        Boolean force = requestParameters.queryParameter("force") != null ? requestParameters.queryParameter("force").getBoolean() : null;
        Boolean recursive = requestParameters.queryParameter("recursive") != null ? requestParameters.queryParameter("recursive").getBoolean() : null;
        FileUpload _package = routingContext.fileUploads().iterator().next();

        logger.debug("Parameter path is {}", path);
        logger.debug("Parameter cmd is {}", cmd);
        logger.debug("Parameter groupName is {}", groupName);
        logger.debug("Parameter packageName is {}", packageName);
        logger.debug("Parameter packageVersion is {}", packageVersion);
        logger.debug("Parameter charset is {}", charset);
        logger.debug("Parameter force is {}", force);
        logger.debug("Parameter recursive is {}", recursive);
        logger.debug("Parameter _package is {}", _package);

        api.postPackageServiceJson(path, cmd, groupName, packageName, packageVersion, charset, force, recursive, _package)
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

    private void postPackageUpdate(RoutingContext routingContext) {
        logger.info("postPackageUpdate()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String groupName = requestParameters.queryParameter("groupName") != null ? requestParameters.queryParameter("groupName").getString() : null;
        String packageName = requestParameters.queryParameter("packageName") != null ? requestParameters.queryParameter("packageName").getString() : null;
        String version = requestParameters.queryParameter("version") != null ? requestParameters.queryParameter("version").getString() : null;
        String path = requestParameters.queryParameter("path") != null ? requestParameters.queryParameter("path").getString() : null;
        String filter = requestParameters.queryParameter("filter") != null ? requestParameters.queryParameter("filter").getString() : null;
        String charset = requestParameters.queryParameter("_charset_") != null ? requestParameters.queryParameter("_charset_").getString() : null;

        logger.debug("Parameter groupName is {}", groupName);
        logger.debug("Parameter packageName is {}", packageName);
        logger.debug("Parameter version is {}", version);
        logger.debug("Parameter path is {}", path);
        logger.debug("Parameter filter is {}", filter);
        logger.debug("Parameter charset is {}", charset);

        api.postPackageUpdate(groupName, packageName, version, path, filter, charset)
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

    private void postSetPassword(RoutingContext routingContext) {
        logger.info("postSetPassword()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String old = requestParameters.queryParameter("old") != null ? requestParameters.queryParameter("old").getString() : null;
        String plain = requestParameters.queryParameter("plain") != null ? requestParameters.queryParameter("plain").getString() : null;
        String verify = requestParameters.queryParameter("verify") != null ? requestParameters.queryParameter("verify").getString() : null;

        logger.debug("Parameter old is {}", old);
        logger.debug("Parameter plain is {}", plain);
        logger.debug("Parameter verify is {}", verify);

        api.postSetPassword(old, plain, verify)
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
