package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;

import java.io.File;
import org.openapitools.model.KeystoreInfo;

import java.util.List;

import java.io.InputStream;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@RequestScoped
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2021-09-03T15:25:48.597+10:00[Australia/Melbourne]")
public class DefaultApiServiceImpl implements DefaultApiService {
      @Override
      public Response deleteNode(String path, String name, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response getAuthorizableKeystore(String intermediatePath, String authorizableId, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response getKeystore(String intermediatePath, String authorizableId, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response getNode(String path, String name, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response postAuthorizableKeystore(String intermediatePath, String authorizableId, String colonOperation, String currentPassword, String newPassword, String rePassword, String keyPassword, String keyStorePass, String alias, String newAlias, String removeAlias, InputStream certChainInputStream, Attachment certChainDetail, InputStream pkInputStream, Attachment pkDetail, InputStream keyStoreInputStream, Attachment keyStoreDetail, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response postNode(String path, String name, String colonOperation, String deleteAuthorizable, InputStream fileInputStream, Attachment fileDetail, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response postNodeRw(String path, String name, String addMembers, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response postPath(String path, String jcrColonPrimaryType, String colonName, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
}
