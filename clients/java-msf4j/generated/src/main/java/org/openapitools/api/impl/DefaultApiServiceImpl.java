package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.*;

import java.io.File;
import org.openapitools.model.KeystoreInfo;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-09-03T15:25:23.467+10:00[Australia/Melbourne]")
public class DefaultApiServiceImpl extends DefaultApiService {
    @Override
    public Response deleteNode(String path
, String name
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getAuthorizableKeystore(String intermediatePath
, String authorizableId
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getKeystore(String intermediatePath
, String authorizableId
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getNode(String path
, String name
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response postAuthorizableKeystore(String intermediatePath
, String authorizableId
, String colonOperation
, String currentPassword
, String newPassword
, String rePassword
, String keyPassword
, String keyStorePass
, String alias
, String newAlias
, String removeAlias
, InputStream certChainInputStream, FileInfo certChainDetail
, InputStream pkInputStream, FileInfo pkDetail
, InputStream keyStoreInputStream, FileInfo keyStoreDetail
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response postNode(String path
, String name
, String colonOperation
, String deleteAuthorizable
, InputStream fileInputStream, FileInfo fileDetail
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response postNodeRw(String path
, String name
, String addMembers
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response postPath(String path
, String jcrColonPrimaryType
, String colonName
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
