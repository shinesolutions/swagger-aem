package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.*;

import java.io.File;
import org.openapitools.model.TruststoreInfo;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-08-17T02:15:13.302721680Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class LibsApiServiceImpl extends LibsApiService {
    @Override
    public Response getLoginPage() throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getTruststoreInfo() throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response postAuthorizables(String authorizableId
, String intermediatePath
, String createUser
, String createGroup
, String repPassword
, String profileGivenName
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response postTreeActivation(Boolean ignoredeactivated
, Boolean onlymodified
, String path
, String cmd
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response postTruststore(String operation
, String newPassword
, String rePassword
, String keyStoreType
, String removeAlias
, InputStream certificateInputStream, FileInfo certificateDetail
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response sslSetup(String keystorePassword
, String keystorePasswordConfirm
, String truststorePassword
, String truststorePasswordConfirm
, String httpsHostname
, String httpsPort
, InputStream privatekeyFileInputStream, FileInfo privatekeyFileDetail
, InputStream certificateFileInputStream, FileInfo certificateFileDetail
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
