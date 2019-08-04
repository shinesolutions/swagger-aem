package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import java.io.File;
import org.openapitools.model.TruststoreInfo;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-08-04T23:41:25.207Z[GMT]")
public abstract class LibsApiService {
    public abstract Response getLoginPage() throws NotFoundException;
    public abstract Response getTruststoreInfo() throws NotFoundException;
    public abstract Response postAuthorizables(String authorizableId
 ,String intermediatePath
 ,String createUser
 ,String createGroup
 ,String repColonPassword
 ,String profileSlashGivenName
 ) throws NotFoundException;
    public abstract Response postTruststore(String colonOperation
 ,String newPassword
 ,String rePassword
 ,String keyStoreType
 ,String removeAlias
 ,InputStream certificateInputStream, FileInfo certificateDetail
 ) throws NotFoundException;
}
