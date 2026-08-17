package org.openapitools.vertxweb.server.api;

import io.vertx.ext.web.FileUpload;

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

public class GraniteApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(GraniteApiHandler.class);

    private final GraniteApi api;

    public GraniteApiHandler(GraniteApi api) {
        this.api = api;
    }

    @Deprecated
    public GraniteApiHandler() {
        this(new GraniteApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("sslSetup").handler(this::sslSetup);
    }

    private void sslSetup(RoutingContext routingContext) {
        logger.info("sslSetup()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String keystorePassword = requestParameters.queryParameter("keystorePassword") != null ? requestParameters.queryParameter("keystorePassword").getString() : null;
        String keystorePasswordConfirm = requestParameters.queryParameter("keystorePasswordConfirm") != null ? requestParameters.queryParameter("keystorePasswordConfirm").getString() : null;
        String truststorePassword = requestParameters.queryParameter("truststorePassword") != null ? requestParameters.queryParameter("truststorePassword").getString() : null;
        String truststorePasswordConfirm = requestParameters.queryParameter("truststorePasswordConfirm") != null ? requestParameters.queryParameter("truststorePasswordConfirm").getString() : null;
        String httpsHostname = requestParameters.queryParameter("httpsHostname") != null ? requestParameters.queryParameter("httpsHostname").getString() : null;
        String httpsPort = requestParameters.queryParameter("httpsPort") != null ? requestParameters.queryParameter("httpsPort").getString() : null;
        FileUpload privatekeyFile = routingContext.fileUploads().iterator().next();
        FileUpload certificateFile = routingContext.fileUploads().iterator().next();

        logger.debug("Parameter keystorePassword is {}", keystorePassword);
        logger.debug("Parameter keystorePasswordConfirm is {}", keystorePasswordConfirm);
        logger.debug("Parameter truststorePassword is {}", truststorePassword);
        logger.debug("Parameter truststorePasswordConfirm is {}", truststorePasswordConfirm);
        logger.debug("Parameter httpsHostname is {}", httpsHostname);
        logger.debug("Parameter httpsPort is {}", httpsPort);
        logger.debug("Parameter privatekeyFile is {}", privatekeyFile);
        logger.debug("Parameter certificateFile is {}", certificateFile);

        api.sslSetup(keystorePassword, keystorePasswordConfirm, truststorePassword, truststorePasswordConfirm, httpsHostname, httpsPort, privatekeyFile, certificateFile)
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
