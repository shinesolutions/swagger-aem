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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-08-04T23:41:25.207Z[GMT]")
public abstract class IntermediatePathApiService {
    public abstract Response getAuthorizableKeystore(String intermediatePath
 ,String authorizableId
 ) throws NotFoundException;
    public abstract Response getKeystore(String intermediatePath
 ,String authorizableId
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
}
