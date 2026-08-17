package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;


import java.io.File;
import org.openapitools.model.KeystoreInfo;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-08-17T07:13:10.689769688Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public interface DefaultApiService {
      Response deleteNode(String path,String name,SecurityContext securityContext)
      throws NotFoundException;
      Response getAuthorizableKeystore(String intermediatePath,String authorizableId,SecurityContext securityContext)
      throws NotFoundException;
      Response getKeystore(String intermediatePath,String authorizableId,SecurityContext securityContext)
      throws NotFoundException;
      Response getNode(String path,String name,SecurityContext securityContext)
      throws NotFoundException;
      Response postAuthorizableKeystore(MultipartFormDataInput input,String intermediatePath,String authorizableId,String operation,String currentPassword,String newPassword,String rePassword,String keyPassword,String keyStorePass,String alias,String newAlias,String removeAlias,SecurityContext securityContext)
      throws NotFoundException;
      Response postNode(MultipartFormDataInput input,String path,String name,String operation,String deleteAuthorizable,SecurityContext securityContext)
      throws NotFoundException;
      Response postNodeRw(String path,String name,String addMembers,SecurityContext securityContext)
      throws NotFoundException;
      Response postPath(String path,String jcrPrimaryType,String name,SecurityContext securityContext)
      throws NotFoundException;


}
