package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;


import java.math.BigDecimal;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2021-09-03T15:25:57.989+10:00[Australia/Melbourne]")
public interface BinApiService {
      Response getQuery(String path,BigDecimal pLimit,String _1property,String _1propertyValue,SecurityContext securityContext)
      throws NotFoundException;
      Response postQuery(String path,BigDecimal pLimit,String _1property,String _1propertyValue,SecurityContext securityContext)
      throws NotFoundException;
}
