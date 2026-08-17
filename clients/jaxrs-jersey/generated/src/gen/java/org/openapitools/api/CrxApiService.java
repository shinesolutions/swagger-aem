package org.openapitools.api;

import org.openapitools.api.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import java.io.File;
import org.openapitools.model.InstallStatus;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-08-17T07:13:06.132469009Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public abstract class CrxApiService {
    public abstract Response getCrxdeStatus(SecurityContext securityContext) throws NotFoundException;
    public abstract Response getInstallStatus(SecurityContext securityContext) throws NotFoundException;
    public abstract Response getPackageManagerServlet(SecurityContext securityContext) throws NotFoundException;
    public abstract Response postPackageService( @NotNull String cmd,SecurityContext securityContext) throws NotFoundException;
    public abstract Response postPackageServiceJson(String path, @NotNull String cmd,String groupName,String packageName,String packageVersion,String charset,Boolean force,Boolean recursive,FormDataBodyPart _packageBodypart,SecurityContext securityContext) throws NotFoundException;
    public abstract Response postPackageUpdate( @NotNull String groupName, @NotNull String packageName, @NotNull String version, @NotNull String path,String filter,String charset,SecurityContext securityContext) throws NotFoundException;
    public abstract Response postSetPassword( @NotNull String old, @NotNull String plain, @NotNull String verify,SecurityContext securityContext) throws NotFoundException;
}
