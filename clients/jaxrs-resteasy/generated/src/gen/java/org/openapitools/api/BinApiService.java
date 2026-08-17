package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;



import java.math.BigDecimal;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-08-17T02:15:38.090574223Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public interface BinApiService {
      Response getQuery(String path,BigDecimal pLimit,String _1property,String _1propertyValue,SecurityContext securityContext)
      throws NotFoundException;
      Response postQuery(String path,BigDecimal pLimit,String _1property,String _1propertyValue,SecurityContext securityContext)
      throws NotFoundException;


}
