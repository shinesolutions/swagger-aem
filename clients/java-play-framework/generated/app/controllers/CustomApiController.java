package controllers;


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
public class CustomApiController extends Controller {
    private final CustomApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private CustomApiController(Config configuration, CustomApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result getAemHealthCheck(Http.Request request) throws Exception {
        String valuetags = request.getQueryString("tags");
        String tags;
        if (valuetags != null) {
            tags = valuetags;
        } else {
            tags = null;
        }
        String valuecombineTagsOr = request.getQueryString("combineTagsOr");
        Boolean combineTagsOr;
        if (valuecombineTagsOr != null) {
            combineTagsOr = Boolean.valueOf(valuecombineTagsOr);
        } else {
            combineTagsOr = null;
        }
        return imp.getAemHealthCheckHttp(request, tags, combineTagsOr);
    }

    @ApiAction
    public Result postConfigAemHealthCheckServlet(Http.Request request) throws Exception {
        String[] bundlesIgnoredArray = request.queryString().get("bundles.ignored");
        List<String> bundlesIgnoredList = OpenAPIUtils.parametersToList("multi", bundlesIgnoredArray);
        List<String> bundlesIgnored = new ArrayList<>();
        for (String curParam : bundlesIgnoredList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                bundlesIgnored.add(curParam);
            }
        }
        String valuebundlesIgnoredAtTypeHint = request.getQueryString("bundles.ignored@TypeHint");
        String bundlesIgnoredAtTypeHint;
        if (valuebundlesIgnoredAtTypeHint != null) {
            bundlesIgnoredAtTypeHint = valuebundlesIgnoredAtTypeHint;
        } else {
            bundlesIgnoredAtTypeHint = null;
        }
        return imp.postConfigAemHealthCheckServletHttp(request, bundlesIgnored, bundlesIgnoredAtTypeHint);
    }

    @ApiAction
    public Result postConfigAemPasswordReset(Http.Request request) throws Exception {
        String[] pwdresetAuthorizablesArray = request.queryString().get("pwdreset.authorizables");
        List<String> pwdresetAuthorizablesList = OpenAPIUtils.parametersToList("multi", pwdresetAuthorizablesArray);
        List<String> pwdresetAuthorizables = new ArrayList<>();
        for (String curParam : pwdresetAuthorizablesList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                pwdresetAuthorizables.add(curParam);
            }
        }
        String valuepwdresetAuthorizablesAtTypeHint = request.getQueryString("pwdreset.authorizables@TypeHint");
        String pwdresetAuthorizablesAtTypeHint;
        if (valuepwdresetAuthorizablesAtTypeHint != null) {
            pwdresetAuthorizablesAtTypeHint = valuepwdresetAuthorizablesAtTypeHint;
        } else {
            pwdresetAuthorizablesAtTypeHint = null;
        }
        return imp.postConfigAemPasswordResetHttp(request, pwdresetAuthorizables, pwdresetAuthorizablesAtTypeHint);
    }

}
