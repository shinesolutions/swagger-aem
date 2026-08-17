package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import java.math.BigDecimal;

import java.util.List;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2026-08-17T02:15:31.267227214Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public interface BinApiService {
      public Response getQuery(String path, BigDecimal pLimit, String _1property, String _1propertyValue, SecurityContext securityContext);
      public Response postQuery(String path, BigDecimal pLimit, String _1property, String _1propertyValue, SecurityContext securityContext);
}
