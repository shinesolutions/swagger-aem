package org.openapitools.api;

import org.openapitools.api.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import java.io.File;
import org.openapitools.model.KeystoreInfo;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-08-17T02:15:33.561165235Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public abstract class DefaultApiService {
    public abstract Response deleteNode(String path,String name,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getAuthorizableKeystore(String intermediatePath,String authorizableId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getKeystore(String intermediatePath,String authorizableId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getNode(String path,String name,SecurityContext securityContext) throws NotFoundException;
    public abstract Response postAuthorizableKeystore(String intermediatePath,String authorizableId,String operation,String currentPassword,String newPassword,String rePassword,String keyPassword,String keyStorePass,String alias,String newAlias,String removeAlias,FormDataBodyPart certChainBodypart,FormDataBodyPart pkBodypart,FormDataBodyPart keyStoreBodypart,SecurityContext securityContext) throws NotFoundException;
    public abstract Response postNode(String path,String name,String operation,String deleteAuthorizable,FormDataBodyPart _fileBodypart,SecurityContext securityContext) throws NotFoundException;
    public abstract Response postNodeRw(String path,String name,String addMembers,SecurityContext securityContext) throws NotFoundException;
    public abstract Response postPath(String path, @NotNull String jcrPrimaryType, @NotNull String name,SecurityContext securityContext) throws NotFoundException;
}
