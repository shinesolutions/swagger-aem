package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.*;


import org.openapitools.model.SamlConfigurationInfo;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@RequestScoped
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2019-08-04T23:42:05.073Z[GMT]")
public class SystemApiServiceImpl implements SystemApiService {
      public Response getAemHealthCheck(String tags,Boolean combineTagsOr,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response getAemProductInfo(SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response getConfigMgr(SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response postBundle(String name,String action,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response postJmxRepository(String action,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response postSamlConfiguration(Boolean post,Boolean apply,Boolean delete,String action,String $location,List<String> path,Integer serviceRanking,String idpUrl,String idpCertAlias,Boolean idpHttpRedirect,String serviceProviderEntityId,String assertionConsumerServiceURL,String spPrivateKeyAlias,String keyStorePassword,String defaultRedirectUrl,String userIDAttribute,Boolean useEncryption,Boolean createUser,Boolean addGroupMemberships,String groupMembershipAttribute,List<String> defaultGroups,String nameIdFormat,List<String> synchronizeAttributes,Boolean handleLogout,String logoutUrl,Integer clockTolerance,String digestMethod,String signatureMethod,String userIntermediatePath,List<String> propertylist,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
}
