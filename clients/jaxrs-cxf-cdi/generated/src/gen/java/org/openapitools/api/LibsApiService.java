package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import java.io.File;
import org.openapitools.model.TruststoreInfo;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2019-08-04T23:41:53.293Z[GMT]")
public interface LibsApiService {
      public Response getLoginPage(SecurityContext securityContext);
      public Response getTruststoreInfo(SecurityContext securityContext);
      public Response postAuthorizables(String authorizableId, String intermediatePath, String createUser, String createGroup, String repColonPassword, String profileSlashGivenName, SecurityContext securityContext);
      public Response postTruststore(String colonOperation, String newPassword, String rePassword, String keyStoreType, String removeAlias, InputStream certificateInputStream, Attachment certificateDetail, SecurityContext securityContext);
}
