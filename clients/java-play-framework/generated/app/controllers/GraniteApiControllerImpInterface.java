package controllers;

import java.io.InputStream;

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
public abstract class GraniteApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result sslSetupHttp(Http.Request request, @NotNull String keystorePassword, @NotNull String keystorePasswordConfirm, @NotNull String truststorePassword, @NotNull String truststorePasswordConfirm, @NotNull String httpsHostname, @NotNull String httpsPort, Http.MultipartFormData.FilePart<TemporaryFile> privatekeyFile, Http.MultipartFormData.FilePart<TemporaryFile> certificateFile) throws Exception {
        String obj = sslSetup(request, keystorePassword, keystorePasswordConfirm, truststorePassword, truststorePasswordConfirm, httpsHostname, httpsPort, privatekeyFile, certificateFile);
        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract String sslSetup(Http.Request request, @NotNull String keystorePassword, @NotNull String keystorePasswordConfirm, @NotNull String truststorePassword, @NotNull String truststorePasswordConfirm, @NotNull String httpsHostname, @NotNull String httpsPort, Http.MultipartFormData.FilePart<TemporaryFile> privatekeyFile, Http.MultipartFormData.FilePart<TemporaryFile> certificateFile) throws Exception;

}
