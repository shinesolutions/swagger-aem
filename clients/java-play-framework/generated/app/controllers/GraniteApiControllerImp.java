package controllers;

import java.io.InputStream;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2021-09-03T15:25:32.040+10:00[Australia/Melbourne]")
public class GraniteApiControllerImp extends GraniteApiControllerImpInterface {
    @Override
    public String sslSetup(Http.Request request, @NotNull String keystorePassword, @NotNull String keystorePasswordConfirm, @NotNull String truststorePassword, @NotNull String truststorePasswordConfirm, @NotNull String httpsHostname, @NotNull String httpsPort, Http.MultipartFormData.FilePart<TemporaryFile> privatekeyFile, Http.MultipartFormData.FilePart<TemporaryFile> certificateFile) throws Exception {
        //Do your magic!!!
        return new String();
    }

}
