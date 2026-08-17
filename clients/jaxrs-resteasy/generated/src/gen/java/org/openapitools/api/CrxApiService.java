package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;


import java.io.File;
import org.openapitools.model.InstallStatus;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-08-17T07:13:10.689769688Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public interface CrxApiService {
      Response getCrxdeStatus(SecurityContext securityContext)
      throws NotFoundException;
      Response getInstallStatus(SecurityContext securityContext)
      throws NotFoundException;
      Response getPackageManagerServlet(SecurityContext securityContext)
      throws NotFoundException;
      Response postPackageService(String cmd,SecurityContext securityContext)
      throws NotFoundException;
      Response postPackageServiceJson(MultipartFormDataInput input,String path,String cmd,String groupName,String packageName,String packageVersion,String charset,Boolean force,Boolean recursive,SecurityContext securityContext)
      throws NotFoundException;
      Response postPackageUpdate(String groupName,String packageName,String version,String path,String filter,String charset,SecurityContext securityContext)
      throws NotFoundException;
      Response postSetPassword(String old,String plain,String verify,SecurityContext securityContext)
      throws NotFoundException;


}
