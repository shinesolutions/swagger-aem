package org.openapitools.server.api.verticle;

import java.io.File;
import org.openapitools.server.api.model.InstallStatus;
import org.openapitools.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface CrxApi  {
    //getCrxdeStatus
    void getCrxdeStatus(Handler<AsyncResult<String>> handler);
    
    //getInstallStatus
    void getInstallStatus(Handler<AsyncResult<InstallStatus>> handler);
    
    //getPackageManagerServlet
    void getPackageManagerServlet(Handler<AsyncResult<Void>> handler);
    
    //postPackageService
    void postPackageService(String cmd, Handler<AsyncResult<String>> handler);
    
    //postPackageServiceJson
    void postPackageServiceJson(String path, String cmd, String groupName, String packageName, String packageVersion, String charset, Boolean force, Boolean recursive, File _package, Handler<AsyncResult<String>> handler);
    
    //postPackageUpdate
    void postPackageUpdate(String groupName, String packageName, String version, String path, String filter, String charset, Handler<AsyncResult<String>> handler);
    
    //postSetPassword
    void postSetPassword(String old, String plain, String verify, Handler<AsyncResult<String>> handler);
    
}
