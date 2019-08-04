package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;


import java.io.File;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2019-08-04T23:42:05.073Z[GMT]")
public interface PathApiService {
      Response deleteNode(String path,String name,SecurityContext securityContext)
      throws NotFoundException;
      Response getNode(String path,String name,SecurityContext securityContext)
      throws NotFoundException;
      Response postNode(MultipartFormDataInput input,String path,String name,String colonOperation,String deleteAuthorizable,SecurityContext securityContext)
      throws NotFoundException;
      Response postNodeRw(String path,String name,String addMembers,SecurityContext securityContext)
      throws NotFoundException;
      Response postPath(String path,String jcrColonPrimaryType,String colonName,SecurityContext securityContext)
      throws NotFoundException;
}
