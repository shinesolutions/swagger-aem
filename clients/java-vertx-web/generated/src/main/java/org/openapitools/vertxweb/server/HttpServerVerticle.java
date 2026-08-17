package org.openapitools.vertxweb.server;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Promise;
import io.vertx.core.http.HttpServerOptions;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.RoutingContext;
import io.vertx.ext.web.openapi.RouterBuilder;
import io.vertx.ext.web.openapi.RouterBuilderOptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.openapitools.vertxweb.server.api.ConsoleApiHandler;
import org.openapitools.vertxweb.server.api.ConsoleApiImpl;
import org.openapitools.vertxweb.server.api.CqApiHandler;
import org.openapitools.vertxweb.server.api.CqApiImpl;
import org.openapitools.vertxweb.server.api.CrxApiHandler;
import org.openapitools.vertxweb.server.api.CrxApiImpl;
import org.openapitools.vertxweb.server.api.CustomApiHandler;
import org.openapitools.vertxweb.server.api.CustomApiImpl;
import org.openapitools.vertxweb.server.api.GraniteApiHandler;
import org.openapitools.vertxweb.server.api.GraniteApiImpl;
import org.openapitools.vertxweb.server.api.SlingApiHandler;
import org.openapitools.vertxweb.server.api.SlingApiImpl;

public class HttpServerVerticle extends AbstractVerticle {

    private static final Logger logger = LoggerFactory.getLogger(HttpServerVerticle.class);
    private static final String specFile = "src/main/resources/openapi.yaml";

    
    private final ConsoleApiHandler consoleHandler = new ConsoleApiHandler(new ConsoleApiImpl());
    private final CqApiHandler cqHandler = new CqApiHandler(new CqApiImpl());
    private final CrxApiHandler crxHandler = new CrxApiHandler(new CrxApiImpl());
    private final CustomApiHandler customHandler = new CustomApiHandler(new CustomApiImpl());
    private final GraniteApiHandler graniteHandler = new GraniteApiHandler(new GraniteApiImpl());
    private final SlingApiHandler slingHandler = new SlingApiHandler(new SlingApiImpl());

    @Override
    public void start(Promise<Void> startPromise) {
        RouterBuilder.create(vertx, specFile)
            .map(builder -> {
              builder.setOptions(new RouterBuilderOptions()
                  // For production use case, you need to enable this flag and provide the proper security handler
                  .setRequireSecurityHandlers(false)
              );
              
              consoleHandler.mount(builder);
              cqHandler.mount(builder);
              crxHandler.mount(builder);
              customHandler.mount(builder);
              graniteHandler.mount(builder);
              slingHandler.mount(builder);

              Router router = builder.createRouter();
              router.errorHandler(400, this::validationFailureHandler);

              return router;
            })
            .compose(router ->
                vertx.createHttpServer()
                    .requestHandler(router)
                    .listen(8080)
            )
            .onSuccess(server -> logger.info("Http verticle deploy successful"))
            .onFailure(t -> logger.error("Http verticle failed to deploy", t))
            // Complete the start promise
            .<Void>mapEmpty().onComplete(startPromise);
    }

    private void validationFailureHandler(RoutingContext rc) {
         rc.response().setStatusCode(400)
                 .end("Bad Request : " + rc.failure().getMessage());
    }
}
