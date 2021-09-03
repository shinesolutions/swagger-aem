package org.openapitools.api;

import java.io.File;

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
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Adobe Experience Manager (AEM) API
 *
 * <p>Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API
 *
 */
@Path("/libs/granite/security/post/sslSetup.html")
@Api(value = "/", description = "")
public interface GraniteApi  {

    @POST
    
    @Consumes({ "multipart/form-data" })
    @Produces({ "text/plain" })
    @ApiOperation(value = "", tags={ "granite" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class) })
    public String sslSetup(@QueryParam("keystorePassword") @NotNull  String keystorePassword, @QueryParam("keystorePasswordConfirm") @NotNull  String keystorePasswordConfirm, @QueryParam("truststorePassword") @NotNull  String truststorePassword, @QueryParam("truststorePasswordConfirm") @NotNull  String truststorePasswordConfirm, @QueryParam("httpsHostname") @NotNull  String httpsHostname, @QueryParam("httpsPort") @NotNull  String httpsPort,  @Multipart(value = "privatekeyFile" , required = false) Attachment privatekeyFileDetail,  @Multipart(value = "certificateFile" , required = false) Attachment certificateFileDetail);
}

