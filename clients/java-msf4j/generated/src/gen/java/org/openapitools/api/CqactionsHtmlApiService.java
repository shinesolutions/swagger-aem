package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;


import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-08-17T02:15:13.302721680Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public abstract class CqactionsHtmlApiService {
    public abstract Response postCqActions(String authorizableId
 ,String changelog
 ) throws NotFoundException;
}
