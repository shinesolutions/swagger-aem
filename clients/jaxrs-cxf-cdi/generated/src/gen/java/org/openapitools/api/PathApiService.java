package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import java.io.File;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2019-08-04T23:41:53.293Z[GMT]")
public interface PathApiService {
      public Response deleteNode(String path, String name, SecurityContext securityContext);
      public Response getNode(String path, String name, SecurityContext securityContext);
      public Response postNode(String path, String name, String colonOperation, String deleteAuthorizable, InputStream fileInputStream, Attachment fileDetail, SecurityContext securityContext);
      public Response postNodeRw(String path, String name, String addMembers, SecurityContext securityContext);
      public Response postPath(String path, String jcrColonPrimaryType, String colonName, SecurityContext securityContext);
}
