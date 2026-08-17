package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import java.io.File;
import org.openapitools.model.InstallStatus;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-08-17T07:12:45.791437416Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public abstract class CrxApiService {
    public abstract Response getCrxdeStatus() throws NotFoundException;
    public abstract Response getInstallStatus() throws NotFoundException;
    public abstract Response getPackageManagerServlet() throws NotFoundException;
    public abstract Response postPackageService(String cmd
 ) throws NotFoundException;
    public abstract Response postPackageServiceJson(String path
 ,String cmd
 ,String groupName
 ,String packageName
 ,String packageVersion
 ,String charset
 ,Boolean force
 ,Boolean recursive
 ,InputStream _packageInputStream, FileInfo _packageDetail
 ) throws NotFoundException;
    public abstract Response postPackageUpdate(String groupName
 ,String packageName
 ,String version
 ,String path
 ,String filter
 ,String charset
 ) throws NotFoundException;
    public abstract Response postSetPassword(String old
 ,String plain
 ,String verify
 ) throws NotFoundException;
}
