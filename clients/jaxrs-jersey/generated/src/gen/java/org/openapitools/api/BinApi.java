package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.BinApiService;
import org.openapitools.api.factories.BinApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import java.math.BigDecimal;

import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataParam;
import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/bin/querybuilder.json")


@io.swagger.annotations.Api(description = "the bin API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2021-09-03T15:25:53.422+10:00[Australia/Melbourne]")
public class BinApi  {
   private final BinApiService delegate;

   public BinApi(@Context ServletConfig servletContext) {
      BinApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("BinApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (BinApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = BinApiServiceFactory.getBinApi();
      }

      this.delegate = delegate;
   }

    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "sling", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response getQuery(@ApiParam(value = "", required = true) @QueryParam("path") @NotNull  String path,@ApiParam(value = "", required = true) @QueryParam("p.limit") @NotNull  BigDecimal pLimit,@ApiParam(value = "", required = true) @QueryParam("1_property") @NotNull  String _1property,@ApiParam(value = "", required = true) @QueryParam("1_property.value") @NotNull  String _1propertyValue,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getQuery(path, pLimit, _1property, _1propertyValue, securityContext);
    }
    @POST
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "sling", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response postQuery(@ApiParam(value = "", required = true) @QueryParam("path") @NotNull  String path,@ApiParam(value = "", required = true) @QueryParam("p.limit") @NotNull  BigDecimal pLimit,@ApiParam(value = "", required = true) @QueryParam("1_property") @NotNull  String _1property,@ApiParam(value = "", required = true) @QueryParam("1_property.value") @NotNull  String _1propertyValue,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.postQuery(path, pLimit, _1property, _1propertyValue, securityContext);
    }
}
