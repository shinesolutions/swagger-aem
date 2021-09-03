package controllers;

import java.io.InputStream;
import apimodels.InstallStatus;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2021-09-03T15:25:32.040+10:00[Australia/Melbourne]")
public class CrxApiControllerImp extends CrxApiControllerImpInterface {
    @Override
    public String getCrxdeStatus(Http.Request request) throws Exception {
        //Do your magic!!!
        return new String();
    }

    @Override
    public InstallStatus getInstallStatus(Http.Request request) throws Exception {
        //Do your magic!!!
        return new InstallStatus();
    }

    @Override
    public void getPackageManagerServlet(Http.Request request) throws Exception {
        //Do your magic!!!
    }

    @Override
    public String postPackageService(Http.Request request, @NotNull String cmd) throws Exception {
        //Do your magic!!!
        return new String();
    }

    @Override
    public String postPackageServiceJson(Http.Request request, String path, @NotNull String cmd, String groupName, String packageName, String packageVersion, String charset, Boolean force, Boolean recursive, Http.MultipartFormData.FilePart<TemporaryFile> _package) throws Exception {
        //Do your magic!!!
        return new String();
    }

    @Override
    public String postPackageUpdate(Http.Request request, @NotNull String groupName, @NotNull String packageName, @NotNull String version, @NotNull String path, String filter, String charset) throws Exception {
        //Do your magic!!!
        return new String();
    }

    @Override
    public String postSetPassword(Http.Request request, @NotNull String old, @NotNull String plain, @NotNull String verify) throws Exception {
        //Do your magic!!!
        return new String();
    }

}
