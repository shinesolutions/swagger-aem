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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2021-09-03T15:25:48.597+10:00[Australia/Melbourne]")
public interface DefaultApiService {
      public Response deleteNode(String path, String name, SecurityContext securityContext);
      public Response getAuthorizableKeystore(String intermediatePath, String authorizableId, SecurityContext securityContext);
      public Response getKeystore(String intermediatePath, String authorizableId, SecurityContext securityContext);
      public Response getNode(String path, String name, SecurityContext securityContext);
      public Response postAuthorizableKeystore(String intermediatePath, String authorizableId, String colonOperation, String currentPassword, String newPassword, String rePassword, String keyPassword, String keyStorePass, String alias, String newAlias, String removeAlias, InputStream certChainInputStream, Attachment certChainDetail, InputStream pkInputStream, Attachment pkDetail, InputStream keyStoreInputStream, Attachment keyStoreDetail, SecurityContext securityContext);
      public Response postNode(String path, String name, String colonOperation, String deleteAuthorizable, InputStream fileInputStream, Attachment fileDetail, SecurityContext securityContext);
      public Response postNodeRw(String path, String name, String addMembers, SecurityContext securityContext);
      public Response postPath(String path, String jcrColonPrimaryType, String colonName, SecurityContext securityContext);
}
