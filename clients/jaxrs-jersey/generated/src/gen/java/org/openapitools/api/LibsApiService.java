package org.openapitools.api;

import org.openapitools.api.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import java.io.File;
import org.openapitools.model.TruststoreInfo;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-08-17T02:15:33.561165235Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public abstract class LibsApiService {
    public abstract Response getLoginPage(SecurityContext securityContext) throws NotFoundException;
    public abstract Response getTruststoreInfo(SecurityContext securityContext) throws NotFoundException;
    public abstract Response postAuthorizables( @NotNull String authorizableId, @NotNull String intermediatePath,String createUser,String createGroup,String repPassword,String profileGivenName,SecurityContext securityContext) throws NotFoundException;
    public abstract Response postTreeActivation( @NotNull Boolean ignoredeactivated, @NotNull Boolean onlymodified, @NotNull String path, @NotNull String cmd,SecurityContext securityContext) throws NotFoundException;
    public abstract Response postTruststore(String operation,String newPassword,String rePassword,String keyStoreType,String removeAlias,FormDataBodyPart certificateBodypart,SecurityContext securityContext) throws NotFoundException;
    public abstract Response sslSetup( @NotNull String keystorePassword, @NotNull String keystorePasswordConfirm, @NotNull String truststorePassword, @NotNull String truststorePasswordConfirm, @NotNull String httpsHostname, @NotNull String httpsPort,FormDataBodyPart privatekeyFileBodypart,FormDataBodyPart certificateFileBodypart,SecurityContext securityContext) throws NotFoundException;
}
