package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import org.openapitools.model.SamlConfigurationInfo;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-08-04T23:41:25.207Z[GMT]")
public abstract class SystemApiService {
    public abstract Response getAemHealthCheck(String tags
 ,Boolean combineTagsOr
 ) throws NotFoundException;
    public abstract Response getAemProductInfo() throws NotFoundException;
    public abstract Response getConfigMgr() throws NotFoundException;
    public abstract Response postBundle(String name
 ,String action
 ) throws NotFoundException;
    public abstract Response postJmxRepository(String action
 ) throws NotFoundException;
    public abstract Response postSamlConfiguration(Boolean post
 ,Boolean apply
 ,Boolean delete
 ,String action
 ,String $location
 ,List<String> path
 ,Integer serviceRanking
 ,String idpUrl
 ,String idpCertAlias
 ,Boolean idpHttpRedirect
 ,String serviceProviderEntityId
 ,String assertionConsumerServiceURL
 ,String spPrivateKeyAlias
 ,String keyStorePassword
 ,String defaultRedirectUrl
 ,String userIDAttribute
 ,Boolean useEncryption
 ,Boolean createUser
 ,Boolean addGroupMemberships
 ,String groupMembershipAttribute
 ,List<String> defaultGroups
 ,String nameIdFormat
 ,List<String> synchronizeAttributes
 ,Boolean handleLogout
 ,String logoutUrl
 ,Integer clockTolerance
 ,String digestMethod
 ,String signatureMethod
 ,String userIntermediatePath
 ,List<String> propertylist
 ) throws NotFoundException;
}
