package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.*;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;


import java.io.File;
import org.openapitools.model.InstallStatus;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-08-04T23:42:11.561Z[GMT]")
public class CrxApiServiceImpl implements CrxApi {
      public Response getCrxdeStatus(SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response getInstallStatus(SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response getPackageManagerServlet(SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response postPackageService(String cmd,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response postPackageServiceJson(MultipartFormDataInput input,String path,String cmd,String groupName,String packageName,String packageVersion,String charset,Boolean force,Boolean recursive,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response postPackageUpdate(String groupName,String packageName,String version,String path,String filter,String charset,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response postSetPassword(String old,String plain,String verify,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
}
