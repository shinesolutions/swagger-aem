package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.*;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;


import java.io.File;
import org.openapitools.model.TruststoreInfo;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2021-09-03T15:26:02.321+10:00[Australia/Melbourne]")
public class LibsApiServiceImpl implements LibsApi {
      public Response getLoginPage(SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response getTruststoreInfo(SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response postAuthorizables(String authorizableId,String intermediatePath,String createUser,String createGroup,String repColonPassword,String profileGivenName,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response postTruststore(MultipartFormDataInput input,String colonOperation,String newPassword,String rePassword,String keyStoreType,String removeAlias,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response sslSetup(MultipartFormDataInput input,String keystorePassword,String keystorePasswordConfirm,String truststorePassword,String truststorePasswordConfirm,String httpsHostname,String httpsPort,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
}
