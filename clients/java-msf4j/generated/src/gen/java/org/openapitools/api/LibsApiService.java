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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-08-17T07:12:45.791437416Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public abstract class LibsApiService {
    public abstract Response getLoginPage() throws NotFoundException;
    public abstract Response getTruststoreInfo() throws NotFoundException;
    public abstract Response postAuthorizables(String authorizableId
 ,String intermediatePath
 ,String createUser
 ,String createGroup
 ,String repPassword
 ,String profileGivenName
 ) throws NotFoundException;
    public abstract Response postTreeActivation(Boolean ignoredeactivated
 ,Boolean onlymodified
 ,String path
 ,String cmd
 ) throws NotFoundException;
    public abstract Response postTruststore(String operation
 ,String newPassword
 ,String rePassword
 ,String keyStoreType
 ,String removeAlias
 ,InputStream certificateInputStream, FileInfo certificateDetail
 ) throws NotFoundException;
    public abstract Response sslSetup(String keystorePassword
 ,String keystorePasswordConfirm
 ,String truststorePassword
 ,String truststorePasswordConfirm
 ,String httpsHostname
 ,String httpsPort
 ,InputStream privatekeyFileInputStream, FileInfo privatekeyFileDetail
 ,InputStream certificateFileInputStream, FileInfo certificateFileDetail
 ) throws NotFoundException;
}
