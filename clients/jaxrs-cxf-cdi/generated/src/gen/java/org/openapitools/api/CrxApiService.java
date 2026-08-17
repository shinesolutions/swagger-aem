package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import org.openapitools.model.InstallStatus;

import java.util.List;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2026-08-17T07:13:03.808307969Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public interface CrxApiService {
      public Response getCrxdeStatus(SecurityContext securityContext);
      public Response getInstallStatus(SecurityContext securityContext);
      public Response getPackageManagerServlet(SecurityContext securityContext);
      public Response postPackageService(String cmd, SecurityContext securityContext);
      public Response postPackageServiceJson(String path, String cmd, String groupName, String packageName, String packageVersion, String charset, Boolean force, Boolean recursive, Attachment _packageDetail, SecurityContext securityContext);
      public Response postPackageUpdate(String groupName, String packageName, String version, String path, String filter, String charset, SecurityContext securityContext);
      public Response postSetPassword(String old, String plain, String verify, SecurityContext securityContext);
}
