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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2021-09-03T15:25:48.597+10:00[Australia/Melbourne]")
public interface LibsApiService {
      public Response getLoginPage(SecurityContext securityContext);
      public Response getTruststoreInfo(SecurityContext securityContext);
      public Response postAuthorizables(String authorizableId, String intermediatePath, String createUser, String createGroup, String repColonPassword, String profileGivenName, SecurityContext securityContext);
      public Response postTruststore(String colonOperation, String newPassword, String rePassword, String keyStoreType, String removeAlias, InputStream certificateInputStream, Attachment certificateDetail, SecurityContext securityContext);
      public Response sslSetup(String keystorePassword, String keystorePasswordConfirm, String truststorePassword, String truststorePasswordConfirm, String httpsHostname, String httpsPort, InputStream privatekeyFileInputStream, Attachment privatekeyFileDetail, InputStream certificateFileInputStream, Attachment certificateFileDetail, SecurityContext securityContext);
}
