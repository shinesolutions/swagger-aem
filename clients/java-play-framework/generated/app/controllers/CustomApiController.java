package controllers;


import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Http;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import java.io.File;
import openapitools.OpenAPIUtils;
import com.fasterxml.jackson.core.type.TypeReference;

import javax.validation.constraints.*;
import play.Configuration;

import openapitools.OpenAPIUtils.ApiAction;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-04T23:41:35.248Z[GMT]")

public class CustomApiController extends Controller {

    private final CustomApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Configuration configuration;

    @Inject
    private CustomApiController(Configuration configuration, CustomApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }


    @ApiAction
    public Result getAemHealthCheck() throws Exception {
        String valuetags = request().getQueryString("tags");
        String tags;
        if (valuetags != null) {
            tags = valuetags;
        } else {
            tags = null;
        }
        String valuecombineTagsOr = request().getQueryString("combineTagsOr");
        Boolean combineTagsOr;
        if (valuecombineTagsOr != null) {
            combineTagsOr = Boolean.valueOf(valuecombineTagsOr);
        } else {
            combineTagsOr = null;
        }
        String obj = imp.getAemHealthCheck(tags, combineTagsOr);
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
    }

    @ApiAction
    public Result postConfigAemHealthCheckServlet() throws Exception {
        String[] bundlesIgnoredArray = request().queryString().get("bundles.ignored");
        List<String> bundlesIgnoredList = OpenAPIUtils.parametersToList("multi", bundlesIgnoredArray);
        List<String> bundlesIgnored = new ArrayList<String>();
        for (String curParam : bundlesIgnoredList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                bundlesIgnored.add(curParam);
            }
        }
        String valuebundlesIgnoredAtTypeHint = request().getQueryString("bundles.ignored@TypeHint");
        String bundlesIgnoredAtTypeHint;
        if (valuebundlesIgnoredAtTypeHint != null) {
            bundlesIgnoredAtTypeHint = valuebundlesIgnoredAtTypeHint;
        } else {
            bundlesIgnoredAtTypeHint = null;
        }
        imp.postConfigAemHealthCheckServlet(bundlesIgnored, bundlesIgnoredAtTypeHint);
        return ok();
    }

    @ApiAction
    public Result postConfigAemPasswordReset() throws Exception {
        String[] pwdresetAuthorizablesArray = request().queryString().get("pwdreset.authorizables");
        List<String> pwdresetAuthorizablesList = OpenAPIUtils.parametersToList("multi", pwdresetAuthorizablesArray);
        List<String> pwdresetAuthorizables = new ArrayList<String>();
        for (String curParam : pwdresetAuthorizablesList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                pwdresetAuthorizables.add(curParam);
            }
        }
        String valuepwdresetAuthorizablesAtTypeHint = request().getQueryString("pwdreset.authorizables@TypeHint");
        String pwdresetAuthorizablesAtTypeHint;
        if (valuepwdresetAuthorizablesAtTypeHint != null) {
            pwdresetAuthorizablesAtTypeHint = valuepwdresetAuthorizablesAtTypeHint;
        } else {
            pwdresetAuthorizablesAtTypeHint = null;
        }
        imp.postConfigAemPasswordReset(pwdresetAuthorizables, pwdresetAuthorizablesAtTypeHint);
        return ok();
    }
}
