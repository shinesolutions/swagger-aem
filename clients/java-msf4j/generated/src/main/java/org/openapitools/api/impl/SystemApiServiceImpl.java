package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.openapitools.model.BundleInfo;
import org.openapitools.model.SamlConfigurationInfo;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-09-03T15:25:23.467+10:00[Australia/Melbourne]")
public class SystemApiServiceImpl extends SystemApiService {
    @Override
    public Response getAemHealthCheck(String tags
, Boolean combineTagsOr
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getAemProductInfo() throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getBundleInfo(String name
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getConfigMgr() throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response postBundle(String name
, String action
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response postJmxRepository(String action
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response postSamlConfiguration(Boolean post
, Boolean apply
, Boolean delete
, String action
, String $location
, List<String> path
, Integer serviceRanking
, String idpUrl
, String idpCertAlias
, Boolean idpHttpRedirect
, String serviceProviderEntityId
, String assertionConsumerServiceURL
, String spPrivateKeyAlias
, String keyStorePassword
, String defaultRedirectUrl
, String userIDAttribute
, Boolean useEncryption
, Boolean createUser
, Boolean addGroupMemberships
, String groupMembershipAttribute
, List<String> defaultGroups
, String nameIdFormat
, List<String> synchronizeAttributes
, Boolean handleLogout
, String logoutUrl
, Integer clockTolerance
, String digestMethod
, String signatureMethod
, String userIntermediatePath
, List<String> propertylist
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
