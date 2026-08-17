package org.openapitools.api.impl;

import org.openapitools.api.*;
import java.io.File;

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
public class GraniteApiServiceImpl implements GraniteApi {
    @Override
    public String sslSetup(String keystorePassword, String keystorePasswordConfirm, String truststorePassword, String truststorePasswordConfirm, String httpsHostname, String httpsPort,  Attachment privatekeyFileDetail,  Attachment certificateFileDetail) {
        // TODO: Implement...
        return null;
    }

}
