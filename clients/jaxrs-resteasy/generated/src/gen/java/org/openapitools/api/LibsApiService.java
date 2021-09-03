package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;


import java.io.File;
import org.openapitools.model.TruststoreInfo;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2021-09-03T15:25:57.989+10:00[Australia/Melbourne]")
public interface LibsApiService {
      Response getLoginPage(SecurityContext securityContext)
      throws NotFoundException;
      Response getTruststoreInfo(SecurityContext securityContext)
      throws NotFoundException;
      Response postAuthorizables(String authorizableId,String intermediatePath,String createUser,String createGroup,String repColonPassword,String profileGivenName,SecurityContext securityContext)
      throws NotFoundException;
      Response postTruststore(MultipartFormDataInput input,String colonOperation,String newPassword,String rePassword,String keyStoreType,String removeAlias,SecurityContext securityContext)
      throws NotFoundException;
      Response sslSetup(MultipartFormDataInput input,String keystorePassword,String keystorePasswordConfirm,String truststorePassword,String truststorePasswordConfirm,String httpsHostname,String httpsPort,SecurityContext securityContext)
      throws NotFoundException;
}
