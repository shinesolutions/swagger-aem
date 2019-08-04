package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import java.io.File;
import org.openapitools.model.KeystoreInfo;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2019-08-04T23:41:59.588Z[GMT]")
public abstract class IntermediatePathApiService {
    public abstract Response getAuthorizableKeystore(String intermediatePath,String authorizableId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getKeystore(String intermediatePath,String authorizableId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response postAuthorizableKeystore(String intermediatePath,String authorizableId, String colonOperation, String currentPassword, String newPassword, String rePassword, String keyPassword, String keyStorePass, String alias, String newAlias, String removeAlias,InputStream certChainInputStream, FormDataContentDisposition certChainDetail,InputStream pkInputStream, FormDataContentDisposition pkDetail,InputStream keyStoreInputStream, FormDataContentDisposition keyStoreDetail,SecurityContext securityContext) throws NotFoundException;
}
