package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import java.io.File;
import org.openapitools.model.TruststoreInfo;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2021-09-03T15:25:53.422+10:00[Australia/Melbourne]")
public abstract class LibsApiService {
    public abstract Response getLoginPage(SecurityContext securityContext) throws NotFoundException;
    public abstract Response getTruststoreInfo(SecurityContext securityContext) throws NotFoundException;
    public abstract Response postAuthorizables( @NotNull String authorizableId, @NotNull String intermediatePath,String createUser,String createGroup,String repColonPassword,String profileGivenName,SecurityContext securityContext) throws NotFoundException;
    public abstract Response postTruststore(String colonOperation,String newPassword,String rePassword,String keyStoreType,String removeAlias,FormDataBodyPart certificateBodypart,SecurityContext securityContext) throws NotFoundException;
    public abstract Response sslSetup( @NotNull String keystorePassword, @NotNull String keystorePasswordConfirm, @NotNull String truststorePassword, @NotNull String truststorePasswordConfirm, @NotNull String httpsHostname, @NotNull String httpsPort,FormDataBodyPart privatekeyFileBodypart,FormDataBodyPart certificateFileBodypart,SecurityContext securityContext) throws NotFoundException;
}
