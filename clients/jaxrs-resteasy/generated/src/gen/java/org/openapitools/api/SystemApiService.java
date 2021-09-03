package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;


import org.openapitools.model.BundleInfo;
import org.openapitools.model.SamlConfigurationInfo;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2021-09-03T15:25:57.989+10:00[Australia/Melbourne]")
public interface SystemApiService {
      Response getAemHealthCheck(String tags,Boolean combineTagsOr,SecurityContext securityContext)
      throws NotFoundException;
      Response getAemProductInfo(SecurityContext securityContext)
      throws NotFoundException;
      Response getBundleInfo(String name,SecurityContext securityContext)
      throws NotFoundException;
      Response getConfigMgr(SecurityContext securityContext)
      throws NotFoundException;
      Response postBundle(String name,String action,SecurityContext securityContext)
      throws NotFoundException;
      Response postJmxRepository(String action,SecurityContext securityContext)
      throws NotFoundException;
      Response postSamlConfiguration(Boolean post,Boolean apply,Boolean delete,String action,String $location,List<String> path,Integer serviceRanking,String idpUrl,String idpCertAlias,Boolean idpHttpRedirect,String serviceProviderEntityId,String assertionConsumerServiceURL,String spPrivateKeyAlias,String keyStorePassword,String defaultRedirectUrl,String userIDAttribute,Boolean useEncryption,Boolean createUser,Boolean addGroupMemberships,String groupMembershipAttribute,List<String> defaultGroups,String nameIdFormat,List<String> synchronizeAttributes,Boolean handleLogout,String logoutUrl,Integer clockTolerance,String digestMethod,String signatureMethod,String userIntermediatePath,List<String> propertylist,SecurityContext securityContext)
      throws NotFoundException;
}
