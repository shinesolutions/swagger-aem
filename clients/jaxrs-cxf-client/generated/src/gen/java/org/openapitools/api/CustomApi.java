package org.openapitools.api;


import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;

/**
 * Adobe Experience Manager (AEM) API
 *
 * <p>Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API
 *
 */
@Path("/")
@Api(value = "/", description = "")
public interface CustomApi  {

    @GET
    @Path("/system/health")
    @Produces({ "application/json" })
    @ApiOperation(value = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class) })
    public String getAemHealthCheck(@QueryParam("tags")String tags, @QueryParam("combineTagsOr")Boolean combineTagsOr);

    @POST
    @Path("/apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck")
    @ApiOperation(value = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response") })
    public void postConfigAemHealthCheckServlet(@QueryParam("bundles.ignored")List<String> bundlesIgnored, @QueryParam("bundles.ignored@TypeHint")String bundlesIgnoredAtTypeHint);

    @POST
    @Path("/apps/system/config/com.shinesolutions.aem.passwordreset.Activator")
    @ApiOperation(value = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response") })
    public void postConfigAemPasswordReset(@QueryParam("pwdreset.authorizables")List<String> pwdresetAuthorizables, @QueryParam("pwdreset.authorizables@TypeHint")String pwdresetAuthorizablesAtTypeHint);
}

