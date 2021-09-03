package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import java.io.File;
import org.openapitools.model.KeystoreInfo;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-09-03T15:25:23.467+10:00[Australia/Melbourne]")
public abstract class DefaultApiService {
    public abstract Response deleteNode(String path
 ,String name
 ) throws NotFoundException;
    public abstract Response getAuthorizableKeystore(String intermediatePath
 ,String authorizableId
 ) throws NotFoundException;
    public abstract Response getKeystore(String intermediatePath
 ,String authorizableId
 ) throws NotFoundException;
    public abstract Response getNode(String path
 ,String name
 ) throws NotFoundException;
    public abstract Response postAuthorizableKeystore(String intermediatePath
 ,String authorizableId
 ,String colonOperation
 ,String currentPassword
 ,String newPassword
 ,String rePassword
 ,String keyPassword
 ,String keyStorePass
 ,String alias
 ,String newAlias
 ,String removeAlias
 ,InputStream certChainInputStream, FileInfo certChainDetail
 ,InputStream pkInputStream, FileInfo pkDetail
 ,InputStream keyStoreInputStream, FileInfo keyStoreDetail
 ) throws NotFoundException;
    public abstract Response postNode(String path
 ,String name
 ,String colonOperation
 ,String deleteAuthorizable
 ,InputStream fileInputStream, FileInfo fileDetail
 ) throws NotFoundException;
    public abstract Response postNodeRw(String path
 ,String name
 ,String addMembers
 ) throws NotFoundException;
    public abstract Response postPath(String path
 ,String jcrColonPrimaryType
 ,String colonName
 ) throws NotFoundException;
}
