package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.SamlConfigurationInfo;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;

/**
 * Adobe Experience Manager (AEM) API
 *
 * <p>Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API
 *
 */
public class ConsoleApiServiceImpl implements ConsoleApi {
    public List<String> getAemProductInfo() {
        // TODO: Implement...
        
        return null;
    }
    
    public String getConfigMgr() {
        // TODO: Implement...
        
        return null;
    }
    
    public void postBundle(String name, String action) {
        // TODO: Implement...
        
        
    }
    
    public void postJmxRepository(String action) {
        // TODO: Implement...
        
        
    }
    
    public SamlConfigurationInfo postSamlConfiguration(Boolean post, Boolean apply, Boolean delete, String action, String $location, List<String> path, Integer serviceRanking, String idpUrl, String idpCertAlias, Boolean idpHttpRedirect, String serviceProviderEntityId, String assertionConsumerServiceURL, String spPrivateKeyAlias, String keyStorePassword, String defaultRedirectUrl, String userIDAttribute, Boolean useEncryption, Boolean createUser, Boolean addGroupMemberships, String groupMembershipAttribute, List<String> defaultGroups, String nameIdFormat, List<String> synchronizeAttributes, Boolean handleLogout, String logoutUrl, Integer clockTolerance, String digestMethod, String signatureMethod, String userIntermediatePath, List<String> propertylist) {
        // TODO: Implement...
        
        return null;
    }
    
}

