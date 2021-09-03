package controllers;

import java.io.InputStream;
import apimodels.InstallStatus;

import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Http;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import java.io.File;
import play.libs.Files.TemporaryFile;
import openapitools.OpenAPIUtils;
import com.fasterxml.jackson.core.type.TypeReference;

import javax.validation.constraints.*;
import com.typesafe.config.Config;

import openapitools.OpenAPIUtils.ApiAction;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2021-09-03T15:25:32.040+10:00[Australia/Melbourne]")
public class CrxApiController extends Controller {
    private final CrxApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private CrxApiController(Config configuration, CrxApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result getCrxdeStatus(Http.Request request) throws Exception {
        return imp.getCrxdeStatusHttp(request);
    }

    @ApiAction
    public Result getInstallStatus(Http.Request request) throws Exception {
        return imp.getInstallStatusHttp(request);
    }

    @ApiAction
    public Result getPackageManagerServlet(Http.Request request) throws Exception {
        return imp.getPackageManagerServletHttp(request);
    }

    @ApiAction
    public Result postPackageService(Http.Request request) throws Exception {
        String valuecmd = request.getQueryString("cmd");
        String cmd;
        if (valuecmd != null) {
            cmd = valuecmd;
        } else {
            throw new IllegalArgumentException("'cmd' parameter is required");
        }
        return imp.postPackageServiceHttp(request, cmd);
    }

    @ApiAction
    public Result postPackageServiceJson(Http.Request request, String path) throws Exception {
        String valuecmd = request.getQueryString("cmd");
        String cmd;
        if (valuecmd != null) {
            cmd = valuecmd;
        } else {
            throw new IllegalArgumentException("'cmd' parameter is required");
        }
        String valuegroupName = request.getQueryString("groupName");
        String groupName;
        if (valuegroupName != null) {
            groupName = valuegroupName;
        } else {
            groupName = null;
        }
        String valuepackageName = request.getQueryString("packageName");
        String packageName;
        if (valuepackageName != null) {
            packageName = valuepackageName;
        } else {
            packageName = null;
        }
        String valuepackageVersion = request.getQueryString("packageVersion");
        String packageVersion;
        if (valuepackageVersion != null) {
            packageVersion = valuepackageVersion;
        } else {
            packageVersion = null;
        }
        String valuecharset = request.getQueryString("_charset_");
        String charset;
        if (valuecharset != null) {
            charset = valuecharset;
        } else {
            charset = null;
        }
        String valueforce = request.getQueryString("force");
        Boolean force;
        if (valueforce != null) {
            force = Boolean.valueOf(valueforce);
        } else {
            force = null;
        }
        String valuerecursive = request.getQueryString("recursive");
        Boolean recursive;
        if (valuerecursive != null) {
            recursive = Boolean.valueOf(valuerecursive);
        } else {
            recursive = null;
        }
        Http.MultipartFormData<TemporaryFile> body_package = request.body().asMultipartFormData();
        Http.MultipartFormData.FilePart<TemporaryFile> _package = body_package.getFile("package");
        return imp.postPackageServiceJsonHttp(request, path, cmd, groupName, packageName, packageVersion, charset, force, recursive, _package);
    }

    @ApiAction
    public Result postPackageUpdate(Http.Request request) throws Exception {
        String valuegroupName = request.getQueryString("groupName");
        String groupName;
        if (valuegroupName != null) {
            groupName = valuegroupName;
        } else {
            throw new IllegalArgumentException("'groupName' parameter is required");
        }
        String valuepackageName = request.getQueryString("packageName");
        String packageName;
        if (valuepackageName != null) {
            packageName = valuepackageName;
        } else {
            throw new IllegalArgumentException("'packageName' parameter is required");
        }
        String valueversion = request.getQueryString("version");
        String version;
        if (valueversion != null) {
            version = valueversion;
        } else {
            throw new IllegalArgumentException("'version' parameter is required");
        }
        String valuepath = request.getQueryString("path");
        String path;
        if (valuepath != null) {
            path = valuepath;
        } else {
            throw new IllegalArgumentException("'path' parameter is required");
        }
        String valuefilter = request.getQueryString("filter");
        String filter;
        if (valuefilter != null) {
            filter = valuefilter;
        } else {
            filter = null;
        }
        String valuecharset = request.getQueryString("_charset_");
        String charset;
        if (valuecharset != null) {
            charset = valuecharset;
        } else {
            charset = null;
        }
        return imp.postPackageUpdateHttp(request, groupName, packageName, version, path, filter, charset);
    }

    @ApiAction
    public Result postSetPassword(Http.Request request) throws Exception {
        String valueold = request.getQueryString("old");
        String old;
        if (valueold != null) {
            old = valueold;
        } else {
            throw new IllegalArgumentException("'old' parameter is required");
        }
        String valueplain = request.getQueryString("plain");
        String plain;
        if (valueplain != null) {
            plain = valueplain;
        } else {
            throw new IllegalArgumentException("'plain' parameter is required");
        }
        String valueverify = request.getQueryString("verify");
        String verify;
        if (valueverify != null) {
            verify = valueverify;
        } else {
            throw new IllegalArgumentException("'verify' parameter is required");
        }
        return imp.postSetPasswordHttp(request, old, plain, verify);
    }

}
