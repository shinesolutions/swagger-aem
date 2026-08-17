package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.*;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;


import java.io.File;
import org.openapitools.model.KeystoreInfo;

import java.util.List;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-08-17T02:15:40.232181116Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class DefaultApiServiceImpl implements DefaultApi {
      public Response deleteNode(String path,String name,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response getAuthorizableKeystore(String intermediatePath,String authorizableId,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response getKeystore(String intermediatePath,String authorizableId,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response getNode(String path,String name,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response postAuthorizableKeystore(MultipartFormDataInput input,String intermediatePath,String authorizableId,String operation,String currentPassword,String newPassword,String rePassword,String keyPassword,String keyStorePass,String alias,String newAlias,String removeAlias,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response postNode(MultipartFormDataInput input,String path,String name,String operation,String deleteAuthorizable,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response postNodeRw(String path,String name,String addMembers,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response postPath(String path,String jcrPrimaryType,String name,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
}
