package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;


import java.io.File;
import org.openapitools.model.TruststoreInfo;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2019-08-04T23:42:05.073Z[GMT]")
public interface LibsApiService {
      Response getLoginPage(SecurityContext securityContext)
      throws NotFoundException;
      Response getTruststoreInfo(SecurityContext securityContext)
      throws NotFoundException;
      Response postAuthorizables(String authorizableId,String intermediatePath,String createUser,String createGroup,String repColonPassword,String profileSlashGivenName,SecurityContext securityContext)
      throws NotFoundException;
      Response postTruststore(MultipartFormDataInput input,String colonOperation,String newPassword,String rePassword,String keyStoreType,String removeAlias,SecurityContext securityContext)
      throws NotFoundException;
}
