package org.openapitools.vertxweb.server.api;

import io.vertx.ext.web.FileUpload;
import org.openapitools.vertxweb.server.model.InstallStatus;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class CrxApiImpl implements CrxApi {
    public Future<ApiResponse<String>> getCrxdeStatus() {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<InstallStatus>> getInstallStatus() {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<Void>> getPackageManagerServlet() {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<String>> postPackageService(String cmd) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<String>> postPackageServiceJson(String path, String cmd, String groupName, String packageName, String packageVersion, String charset, Boolean force, Boolean recursive, FileUpload _package) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<String>> postPackageUpdate(String groupName, String packageName, String version, String path, String filter, String charset) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<String>> postSetPassword(String old, String plain, String verify) {
        return Future.failedFuture(new HttpException(501));
    }

}
