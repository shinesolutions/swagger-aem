package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import java.io.File;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-08-04T23:41:25.207Z[GMT]")
public abstract class PathApiService {
    public abstract Response deleteNode(String path
 ,String name
 ) throws NotFoundException;
    public abstract Response getNode(String path
 ,String name
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
