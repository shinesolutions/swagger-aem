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

public class CqApiController extends Controller {

    private final CqApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Configuration configuration;

    @Inject
    private CqApiController(Configuration configuration, CqApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }


    @ApiAction
    public Result getLoginPage() throws Exception {
        String obj = imp.getLoginPage();
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
    }

    @ApiAction
    public Result postCqActions() throws Exception {
        String valueauthorizableId = request().getQueryString("authorizableId");
        String authorizableId;
        if (valueauthorizableId != null) {
            authorizableId = valueauthorizableId;
        } else {
            throw new IllegalArgumentException("'authorizableId' parameter is required");
        }
        String valuechangelog = request().getQueryString("changelog");
        String changelog;
        if (valuechangelog != null) {
            changelog = valuechangelog;
        } else {
            throw new IllegalArgumentException("'changelog' parameter is required");
        }
        imp.postCqActions(authorizableId, changelog);
        return ok();
    }
}
