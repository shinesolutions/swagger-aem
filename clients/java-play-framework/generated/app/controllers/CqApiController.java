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
public class CqApiController extends Controller {
    private final CqApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private CqApiController(Config configuration, CqApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result getLoginPage(Http.Request request) throws Exception {
        return imp.getLoginPageHttp(request);
    }

    @ApiAction
    public Result postCqActions(Http.Request request) throws Exception {
        String valueauthorizableId = request.getQueryString("authorizableId");
        String authorizableId;
        if (valueauthorizableId != null) {
            authorizableId = valueauthorizableId;
        } else {
            throw new IllegalArgumentException("'authorizableId' parameter is required");
        }
        String valuechangelog = request.getQueryString("changelog");
        String changelog;
        if (valuechangelog != null) {
            changelog = valuechangelog;
        } else {
            throw new IllegalArgumentException("'changelog' parameter is required");
        }
        return imp.postCqActionsHttp(request, authorizableId, changelog);
    }

}
