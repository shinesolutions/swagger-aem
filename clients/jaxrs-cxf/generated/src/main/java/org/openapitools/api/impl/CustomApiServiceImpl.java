package org.openapitools.api.impl;

import org.openapitools.api.*;

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
public class CustomApiServiceImpl implements CustomApi {
    public String getAemHealthCheck(String tags, Boolean combineTagsOr) {
        // TODO: Implement...
        
        return null;
    }
    
    public void postConfigAemHealthCheckServlet(List<String> bundlesIgnored, String bundlesIgnoredAtTypeHint) {
        // TODO: Implement...
        
        
    }
    
    public void postConfigAemPasswordReset(List<String> pwdresetAuthorizables, String pwdresetAuthorizablesAtTypeHint) {
        // TODO: Implement...
        
        
    }
    
}

