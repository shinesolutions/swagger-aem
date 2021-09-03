package controllers;

import java.io.InputStream;

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
public class GraniteApiController extends Controller {
    private final GraniteApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private GraniteApiController(Config configuration, GraniteApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result sslSetup(Http.Request request) throws Exception {
        String valuekeystorePassword = request.getQueryString("keystorePassword");
        String keystorePassword;
        if (valuekeystorePassword != null) {
            keystorePassword = valuekeystorePassword;
        } else {
            throw new IllegalArgumentException("'keystorePassword' parameter is required");
        }
        String valuekeystorePasswordConfirm = request.getQueryString("keystorePasswordConfirm");
        String keystorePasswordConfirm;
        if (valuekeystorePasswordConfirm != null) {
            keystorePasswordConfirm = valuekeystorePasswordConfirm;
        } else {
            throw new IllegalArgumentException("'keystorePasswordConfirm' parameter is required");
        }
        String valuetruststorePassword = request.getQueryString("truststorePassword");
        String truststorePassword;
        if (valuetruststorePassword != null) {
            truststorePassword = valuetruststorePassword;
        } else {
            throw new IllegalArgumentException("'truststorePassword' parameter is required");
        }
        String valuetruststorePasswordConfirm = request.getQueryString("truststorePasswordConfirm");
        String truststorePasswordConfirm;
        if (valuetruststorePasswordConfirm != null) {
            truststorePasswordConfirm = valuetruststorePasswordConfirm;
        } else {
            throw new IllegalArgumentException("'truststorePasswordConfirm' parameter is required");
        }
        String valuehttpsHostname = request.getQueryString("httpsHostname");
        String httpsHostname;
        if (valuehttpsHostname != null) {
            httpsHostname = valuehttpsHostname;
        } else {
            throw new IllegalArgumentException("'httpsHostname' parameter is required");
        }
        String valuehttpsPort = request.getQueryString("httpsPort");
        String httpsPort;
        if (valuehttpsPort != null) {
            httpsPort = valuehttpsPort;
        } else {
            throw new IllegalArgumentException("'httpsPort' parameter is required");
        }
        Http.MultipartFormData<TemporaryFile> bodyprivatekeyFile = request.body().asMultipartFormData();
        Http.MultipartFormData.FilePart<TemporaryFile> privatekeyFile = bodyprivatekeyFile.getFile("privatekeyFile");
        Http.MultipartFormData<TemporaryFile> bodycertificateFile = request.body().asMultipartFormData();
        Http.MultipartFormData.FilePart<TemporaryFile> certificateFile = bodycertificateFile.getFile("certificateFile");
        return imp.sslSetupHttp(request, keystorePassword, keystorePasswordConfirm, truststorePassword, truststorePasswordConfirm, httpsHostname, httpsPort, privatekeyFile, certificateFile);
    }

}
