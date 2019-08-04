package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import java.io.File;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2019-08-04T23:41:59.588Z[GMT]")
public abstract class PathApiService {
    public abstract Response deleteNode(String path,String name,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getNode(String path,String name,SecurityContext securityContext) throws NotFoundException;
    public abstract Response postNode(String path,String name, String colonOperation, String deleteAuthorizable,InputStream fileInputStream, FormDataContentDisposition fileDetail,SecurityContext securityContext) throws NotFoundException;
    public abstract Response postNodeRw(String path,String name, String addMembers,SecurityContext securityContext) throws NotFoundException;
    public abstract Response postPath(String path, @NotNull String jcrColonPrimaryType, @NotNull String colonName,SecurityContext securityContext) throws NotFoundException;
}
