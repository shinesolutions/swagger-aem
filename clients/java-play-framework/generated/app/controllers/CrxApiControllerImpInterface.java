package controllers;

import java.io.InputStream;
import apimodels.InstallStatus;

import com.google.inject.Inject;
import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import play.mvc.Result;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import openapitools.OpenAPIUtils;
import static play.mvc.Results.ok;
import play.libs.Files.TemporaryFile;

import javax.validation.constraints.*;

@SuppressWarnings("RedundantThrows")
public abstract class CrxApiControllerImpInterface {
    @Inject private Config configuration;
    private ObjectMapper mapper = new ObjectMapper();

    public Result getCrxdeStatusHttp(Http.Request request) throws Exception {
        String obj = getCrxdeStatus(request);
JsonNode result = mapper.valueToTree(obj);
return ok(result);

    }

    public abstract String getCrxdeStatus(Http.Request request) throws Exception;

    public Result getInstallStatusHttp(Http.Request request) throws Exception {
        InstallStatus obj = getInstallStatus(request);
    if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
    }
JsonNode result = mapper.valueToTree(obj);
return ok(result);

    }

    public abstract InstallStatus getInstallStatus(Http.Request request) throws Exception;

    public Result getPackageManagerServletHttp(Http.Request request) throws Exception {
        getPackageManagerServlet(request);
return ok();

    }

    public abstract void getPackageManagerServlet(Http.Request request) throws Exception;

    public Result postPackageServiceHttp(Http.Request request, @NotNull String cmd) throws Exception {
        String obj = postPackageService(request, cmd);
JsonNode result = mapper.valueToTree(obj);
return ok(result);

    }

    public abstract String postPackageService(Http.Request request, @NotNull String cmd) throws Exception;

    public Result postPackageServiceJsonHttp(Http.Request request, String path, @NotNull String cmd, String groupName, String packageName, String packageVersion, String charset, Boolean force, Boolean recursive, Http.MultipartFormData.FilePart<TemporaryFile> _package) throws Exception {
        String obj = postPackageServiceJson(request, path, cmd, groupName, packageName, packageVersion, charset, force, recursive, _package);
JsonNode result = mapper.valueToTree(obj);
return ok(result);

    }

    public abstract String postPackageServiceJson(Http.Request request, String path, @NotNull String cmd, String groupName, String packageName, String packageVersion, String charset, Boolean force, Boolean recursive, Http.MultipartFormData.FilePart<TemporaryFile> _package) throws Exception;

    public Result postPackageUpdateHttp(Http.Request request, @NotNull String groupName, @NotNull String packageName, @NotNull String version, @NotNull String path, String filter, String charset) throws Exception {
        String obj = postPackageUpdate(request, groupName, packageName, version, path, filter, charset);
JsonNode result = mapper.valueToTree(obj);
return ok(result);

    }

    public abstract String postPackageUpdate(Http.Request request, @NotNull String groupName, @NotNull String packageName, @NotNull String version, @NotNull String path, String filter, String charset) throws Exception;

    public Result postSetPasswordHttp(Http.Request request, @NotNull String old, @NotNull String plain, @NotNull String verify) throws Exception {
        String obj = postSetPassword(request, old, plain, verify);
JsonNode result = mapper.valueToTree(obj);
return ok(result);

    }

    public abstract String postSetPassword(Http.Request request, @NotNull String old, @NotNull String plain, @NotNull String verify) throws Exception;

}
