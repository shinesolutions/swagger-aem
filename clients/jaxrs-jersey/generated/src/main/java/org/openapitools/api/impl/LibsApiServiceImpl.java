package org.openapitools.api.impl;

import org.openapitools.api.*;
import java.io.File;
import org.openapitools.model.TruststoreInfo;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-08-17T02:15:33.561165235Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class LibsApiServiceImpl extends LibsApiService {
    @Override
    public Response getLoginPage(SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getTruststoreInfo(SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response postAuthorizables( @NotNull String authorizableId,  @NotNull String intermediatePath, String createUser, String createGroup, String repPassword, String profileGivenName, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response postTreeActivation( @NotNull Boolean ignoredeactivated,  @NotNull Boolean onlymodified,  @NotNull String path,  @NotNull String cmd, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response postTruststore(String operation, String newPassword, String rePassword, String keyStoreType, String removeAlias, FormDataBodyPart certificateBodypart, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response sslSetup( @NotNull String keystorePassword,  @NotNull String keystorePasswordConfirm,  @NotNull String truststorePassword,  @NotNull String truststorePasswordConfirm,  @NotNull String httpsHostname,  @NotNull String httpsPort, FormDataBodyPart privatekeyFileBodypart, FormDataBodyPart certificateFileBodypart, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
