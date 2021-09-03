package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;

import org.openapitools.model.BundleInfo;
import org.openapitools.model.SamlConfigurationInfo;

import java.util.List;

import java.io.InputStream;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@RequestScoped
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2021-09-03T15:25:48.597+10:00[Australia/Melbourne]")
public class SystemApiServiceImpl implements SystemApiService {
      @Override
      public Response getAemHealthCheck(String tags, Boolean combineTagsOr, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response getAemProductInfo(SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response getBundleInfo(String name, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response getConfigMgr(SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response postBundle(String name, String action, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response postJmxRepository(String action, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response postSamlConfiguration(Boolean post, Boolean apply, Boolean delete, String action, String $location, List<String> path, Integer serviceRanking, String idpUrl, String idpCertAlias, Boolean idpHttpRedirect, String serviceProviderEntityId, String assertionConsumerServiceURL, String spPrivateKeyAlias, String keyStorePassword, String defaultRedirectUrl, String userIDAttribute, Boolean useEncryption, Boolean createUser, Boolean addGroupMemberships, String groupMembershipAttribute, List<String> defaultGroups, String nameIdFormat, List<String> synchronizeAttributes, Boolean handleLogout, String logoutUrl, Integer clockTolerance, String digestMethod, String signatureMethod, String userIntermediatePath, List<String> propertylist, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
}
