package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import java.io.File;
import org.openapitools.model.KeystoreInfo;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2021-09-03T15:25:53.422+10:00[Australia/Melbourne]")
public abstract class DefaultApiService {
    public abstract Response deleteNode(String path,String name,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getAuthorizableKeystore(String intermediatePath,String authorizableId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getKeystore(String intermediatePath,String authorizableId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getNode(String path,String name,SecurityContext securityContext) throws NotFoundException;
    public abstract Response postAuthorizableKeystore(String intermediatePath,String authorizableId,String colonOperation,String currentPassword,String newPassword,String rePassword,String keyPassword,String keyStorePass,String alias,String newAlias,String removeAlias,FormDataBodyPart certChainBodypart,FormDataBodyPart pkBodypart,FormDataBodyPart keyStoreBodypart,SecurityContext securityContext) throws NotFoundException;
    public abstract Response postNode(String path,String name,String colonOperation,String deleteAuthorizable,FormDataBodyPart fileBodypart,SecurityContext securityContext) throws NotFoundException;
    public abstract Response postNodeRw(String path,String name,String addMembers,SecurityContext securityContext) throws NotFoundException;
    public abstract Response postPath(String path, @NotNull String jcrColonPrimaryType, @NotNull String colonName,SecurityContext securityContext) throws NotFoundException;
}
