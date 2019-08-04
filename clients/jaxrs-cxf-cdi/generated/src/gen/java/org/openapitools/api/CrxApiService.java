package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import java.io.File;
import org.openapitools.model.InstallStatus;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2019-08-04T23:41:53.293Z[GMT]")
public interface CrxApiService {
      public Response getCrxdeStatus(SecurityContext securityContext);
      public Response getInstallStatus(SecurityContext securityContext);
      public Response getPackageManagerServlet(SecurityContext securityContext);
      public Response postPackageService(String cmd, SecurityContext securityContext);
      public Response postPackageServiceJson(String path, String cmd, String groupName, String packageName, String packageVersion, String charset, Boolean force, Boolean recursive, InputStream _packageInputStream, Attachment _packageDetail, SecurityContext securityContext);
      public Response postPackageUpdate(String groupName, String packageName, String version, String path, String filter, String charset, SecurityContext securityContext);
      public Response postSetPassword(String old, String plain, String verify, SecurityContext securityContext);
}
