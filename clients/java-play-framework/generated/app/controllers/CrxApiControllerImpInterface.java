package controllers;

import java.io.InputStream;
import apimodels.InstallStatus;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import javax.validation.constraints.*;

@SuppressWarnings("RedundantThrows")
public interface CrxApiControllerImpInterface {
    String getCrxdeStatus() throws Exception;

    InstallStatus getInstallStatus() throws Exception;

    void getPackageManagerServlet() throws Exception;

    String postPackageService( @NotNull String cmd) throws Exception;

    String postPackageServiceJson(String path,  @NotNull String cmd, String groupName, String packageName, String packageVersion, String charset, Boolean force, Boolean recursive, Http.MultipartFormData.FilePart _package) throws Exception;

    String postPackageUpdate( @NotNull String groupName,  @NotNull String packageName,  @NotNull String version,  @NotNull String path, String filter, String charset) throws Exception;

    String postSetPassword( @NotNull String old,  @NotNull String plain,  @NotNull String verify) throws Exception;

}
