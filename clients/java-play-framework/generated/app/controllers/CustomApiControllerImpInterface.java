package controllers;


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
import openapitools.SecurityAPIUtils;
import static play.mvc.Results.ok;
import static play.mvc.Results.unauthorized;
import play.libs.Files.TemporaryFile;

import javax.validation.constraints.*;
import javax.validation.Valid;

@SuppressWarnings("RedundantThrows")
public abstract class CustomApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result getAemHealthCheckHttp(Http.Request request, String tags, Boolean combineTagsOr) throws Exception {
        String obj = getAemHealthCheck(request, tags, combineTagsOr);
        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract String getAemHealthCheck(Http.Request request, String tags, Boolean combineTagsOr) throws Exception;

    public Result postConfigAemHealthCheckServletHttp(Http.Request request, List<String> bundlesIgnored, String bundlesIgnoredAtTypeHint) throws Exception {
        postConfigAemHealthCheckServlet(request, bundlesIgnored, bundlesIgnoredAtTypeHint);
        return ok();

    }

    public abstract void postConfigAemHealthCheckServlet(Http.Request request, List<String> bundlesIgnored, String bundlesIgnoredAtTypeHint) throws Exception;

    public Result postConfigAemPasswordResetHttp(Http.Request request, List<String> pwdresetAuthorizables, String pwdresetAuthorizablesAtTypeHint) throws Exception {
        postConfigAemPasswordReset(request, pwdresetAuthorizables, pwdresetAuthorizablesAtTypeHint);
        return ok();

    }

    public abstract void postConfigAemPasswordReset(Http.Request request, List<String> pwdresetAuthorizables, String pwdresetAuthorizablesAtTypeHint) throws Exception;

}
