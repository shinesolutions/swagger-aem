package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import java.math.BigDecimal;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2021-09-03T15:25:53.422+10:00[Australia/Melbourne]")
public abstract class BinApiService {
    public abstract Response getQuery( @NotNull String path, @NotNull BigDecimal pLimit, @NotNull String _1property, @NotNull String _1propertyValue,SecurityContext securityContext) throws NotFoundException;
    public abstract Response postQuery( @NotNull String path, @NotNull BigDecimal pLimit, @NotNull String _1property, @NotNull String _1propertyValue,SecurityContext securityContext) throws NotFoundException;
}
