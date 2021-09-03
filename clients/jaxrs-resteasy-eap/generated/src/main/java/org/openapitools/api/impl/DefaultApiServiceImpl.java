package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.*;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;


import java.io.File;
import org.openapitools.model.KeystoreInfo;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2021-09-03T15:26:02.321+10:00[Australia/Melbourne]")
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
      public Response postAuthorizableKeystore(MultipartFormDataInput input,String intermediatePath,String authorizableId,String colonOperation,String currentPassword,String newPassword,String rePassword,String keyPassword,String keyStorePass,String alias,String newAlias,String removeAlias,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response postNode(MultipartFormDataInput input,String path,String name,String colonOperation,String deleteAuthorizable,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response postNodeRw(String path,String name,String addMembers,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response postPath(String path,String jcrColonPrimaryType,String colonName,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
}
