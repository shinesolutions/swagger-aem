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

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-08-17T07:13:10.689769688Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public interface LibsApiService {
      Response getLoginPage(SecurityContext securityContext)
      throws NotFoundException;
      Response getTruststoreInfo(SecurityContext securityContext)
      throws NotFoundException;
      Response postAuthorizables(String authorizableId,String intermediatePath,String createUser,String createGroup,String repPassword,String profileGivenName,SecurityContext securityContext)
      throws NotFoundException;
      Response postTreeActivation(Boolean ignoredeactivated,Boolean onlymodified,String path,String cmd,SecurityContext securityContext)
      throws NotFoundException;
      Response postTruststore(MultipartFormDataInput input,String operation,String newPassword,String rePassword,String keyStoreType,String removeAlias,SecurityContext securityContext)
      throws NotFoundException;
      Response sslSetup(MultipartFormDataInput input,String keystorePassword,String keystorePasswordConfirm,String truststorePassword,String truststorePasswordConfirm,String httpsHostname,String httpsPort,SecurityContext securityContext)
      throws NotFoundException;


}
