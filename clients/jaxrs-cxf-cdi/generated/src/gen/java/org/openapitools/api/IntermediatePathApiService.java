package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import java.io.File;
import org.openapitools.model.KeystoreInfo;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2019-08-04T23:41:53.293Z[GMT]")
public interface IntermediatePathApiService {
      public Response getAuthorizableKeystore(String intermediatePath, String authorizableId, SecurityContext securityContext);
      public Response getKeystore(String intermediatePath, String authorizableId, SecurityContext securityContext);
      public Response postAuthorizableKeystore(String intermediatePath, String authorizableId, String colonOperation, String currentPassword, String newPassword, String rePassword, String keyPassword, String keyStorePass, String alias, String newAlias, String removeAlias, InputStream certChainInputStream, Attachment certChainDetail, InputStream pkInputStream, Attachment pkDetail, InputStream keyStoreInputStream, Attachment keyStoreDetail, SecurityContext securityContext);
}
