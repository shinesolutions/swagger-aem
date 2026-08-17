package org.openapitools.vertxweb.server.api;

import io.vertx.ext.web.FileUpload;
import org.openapitools.vertxweb.server.model.InstallStatus;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface CrxApi  {
    Future<ApiResponse<String>> getCrxdeStatus();
    Future<ApiResponse<InstallStatus>> getInstallStatus();
    Future<ApiResponse<Void>> getPackageManagerServlet();
    Future<ApiResponse<String>> postPackageService(String cmd);
    Future<ApiResponse<String>> postPackageServiceJson(String path, String cmd, String groupName, String packageName, String packageVersion, String charset, Boolean force, Boolean recursive, FileUpload _package);
    Future<ApiResponse<String>> postPackageUpdate(String groupName, String packageName, String version, String path, String filter, String charset);
    Future<ApiResponse<String>> postSetPassword(String old, String plain, String verify);
}
