package org.openapitools.api;

import org.openapitools.model.BundleInfo;
import org.openapitools.model.SamlConfigurationInfo;

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
@Path("/system/console")
@Api(value = "/", description = "")
public interface ConsoleApi  {

    @GET
    @Path("/status-productinfo.json")
    @Produces({ "application/json" })
    @ApiOperation(value = "", tags={ "console" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class, responseContainer = "List") })
    public List<String> getAemProductInfo();

    @GET
    @Path("/bundles/{name}.json")
    @Produces({ "application/json" })
    @ApiOperation(value = "", tags={ "console" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Retrieved bundle info", response = BundleInfo.class),
        @ApiResponse(code = 200, message = "Default response", response = String.class) })
    public BundleInfo getBundleInfo(@PathParam("name") String name);

    @GET
    @Path("/configMgr")
    @Produces({ "text/xml" })
    @ApiOperation(value = "", tags={ "console" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 5XX, message = "Unexpected error.") })
    public String getConfigMgr();

    @POST
    @Path("/bundles/{name}")
    @ApiOperation(value = "", tags={ "console" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response") })
    public void postBundle(@PathParam("name") String name, @QueryParam("action") @NotNull  String action);

    @POST
    @Path("/jmx/com.adobe.granite:type=Repository/op/{action}")
    @ApiOperation(value = "", tags={ "console" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response") })
    public void postJmxRepository(@PathParam("action") String action);

    @POST
    @Path("/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", tags={ "console" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Retrieved AEM SAML Configuration", response = SamlConfigurationInfo.class),
        @ApiResponse(code = 302, message = "Default response", response = String.class),
        @ApiResponse(code = 200, message = "Default response", response = String.class) })
    public SamlConfigurationInfo postSamlConfiguration(@QueryParam("post")  Boolean post, @QueryParam("apply")  Boolean apply, @QueryParam("delete")  Boolean delete, @QueryParam("action")  String action, @QueryParam("$location")  String $location, @QueryParam("path")  List<String> path, @QueryParam("service.ranking")  Integer serviceRanking, @QueryParam("idpUrl")  String idpUrl, @QueryParam("idpCertAlias")  String idpCertAlias, @QueryParam("idpHttpRedirect")  Boolean idpHttpRedirect, @QueryParam("serviceProviderEntityId")  String serviceProviderEntityId, @QueryParam("assertionConsumerServiceURL")  String assertionConsumerServiceURL, @QueryParam("spPrivateKeyAlias")  String spPrivateKeyAlias, @QueryParam("keyStorePassword")  String keyStorePassword, @QueryParam("defaultRedirectUrl")  String defaultRedirectUrl, @QueryParam("userIDAttribute")  String userIDAttribute, @QueryParam("useEncryption")  Boolean useEncryption, @QueryParam("createUser")  Boolean createUser, @QueryParam("addGroupMemberships")  Boolean addGroupMemberships, @QueryParam("groupMembershipAttribute")  String groupMembershipAttribute, @QueryParam("defaultGroups")  List<String> defaultGroups, @QueryParam("nameIdFormat")  String nameIdFormat, @QueryParam("synchronizeAttributes")  List<String> synchronizeAttributes, @QueryParam("handleLogout")  Boolean handleLogout, @QueryParam("logoutUrl")  String logoutUrl, @QueryParam("clockTolerance")  Integer clockTolerance, @QueryParam("digestMethod")  String digestMethod, @QueryParam("signatureMethod")  String signatureMethod, @QueryParam("userIntermediatePath")  String userIntermediatePath, @QueryParam("propertylist")  List<String> propertylist);
}

