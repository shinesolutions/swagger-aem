package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import java.math.BigDecimal;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-08-04T23:41:25.207Z[GMT]")
public abstract class BinApiService {
    public abstract Response getQuery(String path
 ,BigDecimal pLimit
 ,String _1property
 ,String _1propertyValue
 ) throws NotFoundException;
    public abstract Response postQuery(String path
 ,BigDecimal pLimit
 ,String _1property
 ,String _1propertyValue
 ) throws NotFoundException;
}
