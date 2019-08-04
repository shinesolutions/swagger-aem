package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.openapitools.model.SamlConfigurationInfo;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2019-08-04T23:41:59.588Z[GMT]")
public class SystemApiServiceImpl extends SystemApiService {
    @Override
    public Response getAemHealthCheck( String tags,  Boolean combineTagsOr, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getAemProductInfo(SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getConfigMgr(SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response postBundle(String name,  @NotNull String action, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response postJmxRepository(String action, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response postSamlConfiguration( Boolean post,  Boolean apply,  Boolean delete,  String action,  String $location,  List<String> path,  Integer serviceRanking,  String idpUrl,  String idpCertAlias,  Boolean idpHttpRedirect,  String serviceProviderEntityId,  String assertionConsumerServiceURL,  String spPrivateKeyAlias,  String keyStorePassword,  String defaultRedirectUrl,  String userIDAttribute,  Boolean useEncryption,  Boolean createUser,  Boolean addGroupMemberships,  String groupMembershipAttribute,  List<String> defaultGroups,  String nameIdFormat,  List<String> synchronizeAttributes,  Boolean handleLogout,  String logoutUrl,  Integer clockTolerance,  String digestMethod,  String signatureMethod,  String userIntermediatePath,  List<String> propertylist, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
