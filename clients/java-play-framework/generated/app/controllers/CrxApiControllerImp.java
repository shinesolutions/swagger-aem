package controllers;

import java.io.InputStream;
import apimodels.InstallStatus;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.FileInputStream;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-04T23:41:35.248Z[GMT]")

public class CrxApiControllerImp implements CrxApiControllerImpInterface {
    @Override
    public String getCrxdeStatus() throws Exception {
        //Do your magic!!!
        return new String();
    }

    @Override
    public InstallStatus getInstallStatus() throws Exception {
        //Do your magic!!!
        return new InstallStatus();
    }

    @Override
    public void getPackageManagerServlet() throws Exception {
        //Do your magic!!!
    }

    @Override
    public String postPackageService( @NotNull String cmd) throws Exception {
        //Do your magic!!!
        return new String();
    }

    @Override
    public String postPackageServiceJson(String path,  @NotNull String cmd, String groupName, String packageName, String packageVersion, String charset, Boolean force, Boolean recursive, Http.MultipartFormData.FilePart _package) throws Exception {
        //Do your magic!!!
        return new String();
    }

    @Override
    public String postPackageUpdate( @NotNull String groupName,  @NotNull String packageName,  @NotNull String version,  @NotNull String path, String filter, String charset) throws Exception {
        //Do your magic!!!
        return new String();
    }

    @Override
    public String postSetPassword( @NotNull String old,  @NotNull String plain,  @NotNull String verify) throws Exception {
        //Do your magic!!!
        return new String();
    }

}
