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
import static play.mvc.Results.ok;
import play.libs.Files.TemporaryFile;

import javax.validation.constraints.*;

@SuppressWarnings("RedundantThrows")
public abstract class CqApiControllerImpInterface {
    @Inject private Config configuration;
    private ObjectMapper mapper = new ObjectMapper();

    public Result getLoginPageHttp(Http.Request request) throws Exception {
        String obj = getLoginPage(request);
JsonNode result = mapper.valueToTree(obj);
return ok(result);

    }

    public abstract String getLoginPage(Http.Request request) throws Exception;

    public Result postCqActionsHttp(Http.Request request, @NotNull String authorizableId, @NotNull String changelog) throws Exception {
        postCqActions(request, authorizableId, changelog);
return ok();

    }

    public abstract void postCqActions(Http.Request request, @NotNull String authorizableId, @NotNull String changelog) throws Exception;

}
