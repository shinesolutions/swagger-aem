package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import java.io.File;
import org.openapitools.model.TruststoreInfo;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2019-08-04T23:41:59.588Z[GMT]")
public abstract class LibsApiService {
    public abstract Response getLoginPage(SecurityContext securityContext) throws NotFoundException;
    public abstract Response getTruststoreInfo(SecurityContext securityContext) throws NotFoundException;
    public abstract Response postAuthorizables( @NotNull String authorizableId, @NotNull String intermediatePath, String createUser, String createGroup, String repColonPassword, String profileSlashGivenName,SecurityContext securityContext) throws NotFoundException;
    public abstract Response postTruststore( String colonOperation, String newPassword, String rePassword, String keyStoreType, String removeAlias,InputStream certificateInputStream, FormDataContentDisposition certificateDetail,SecurityContext securityContext) throws NotFoundException;
}
