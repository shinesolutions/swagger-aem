package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import org.openapitools.model.TruststoreInfo;

import java.util.List;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2026-08-17T02:15:31.267227214Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public interface LibsApiService {
      public Response getLoginPage(SecurityContext securityContext);
      public Response getTruststoreInfo(SecurityContext securityContext);
      public Response postAuthorizables(String authorizableId, String intermediatePath, String createUser, String createGroup, String repPassword, String profileGivenName, SecurityContext securityContext);
      public Response postTreeActivation(Boolean ignoredeactivated, Boolean onlymodified, String path, String cmd, SecurityContext securityContext);
      public Response postTruststore(String operation, String newPassword, String rePassword, String keyStoreType, String removeAlias, Attachment certificateDetail, SecurityContext securityContext);
      public Response sslSetup(String keystorePassword, String keystorePasswordConfirm, String truststorePassword, String truststorePasswordConfirm, String httpsHostname, String httpsPort, Attachment privatekeyFileDetail, Attachment certificateFileDetail, SecurityContext securityContext);
}
