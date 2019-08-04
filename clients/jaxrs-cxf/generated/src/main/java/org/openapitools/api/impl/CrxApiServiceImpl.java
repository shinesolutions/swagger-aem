package org.openapitools.api.impl;

import org.openapitools.api.*;
import java.io.File;
import org.openapitools.model.InstallStatus;

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
public class CrxApiServiceImpl implements CrxApi {
    public String getCrxdeStatus() {
        // TODO: Implement...
        
        return null;
    }
    
    public InstallStatus getInstallStatus() {
        // TODO: Implement...
        
        return null;
    }
    
    public void getPackageManagerServlet() {
        // TODO: Implement...
        
        
    }
    
    public String postPackageService(String cmd) {
        // TODO: Implement...
        
        return null;
    }
    
    public String postPackageServiceJson(String path, String cmd, String groupName, String packageName, String packageVersion, String charset, Boolean force, Boolean recursive,  Attachment _packageDetail) {
        // TODO: Implement...
        
        return null;
    }
    
    public String postPackageUpdate(String groupName, String packageName, String version, String path, String filter, String charset) {
        // TODO: Implement...
        
        return null;
    }
    
    public String postSetPassword(String old, String plain, String verify) {
        // TODO: Implement...
        
        return null;
    }
    
}

