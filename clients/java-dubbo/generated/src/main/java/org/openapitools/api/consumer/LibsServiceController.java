package org.openapitools.api.consumer;

import org.openapitools.model.TruststoreInfo;
import org.openapitools.model.*;
import org.openapitools.api.interfaces.LibsService;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Generated;


@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

@RestController
@RequestMapping("/libs")
public class LibsServiceController {

    @DubboReference
    private LibsService libsService;

    @RequestMapping(method = RequestMethod.GET, value = "/granite/core/content/login.html")
    public String getLoginPage(
    ) {
        return libsService.getLoginPage();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/granite/security/truststore.json")
    public TruststoreInfo getTruststoreInfo(
    ) {
        return libsService.getTruststoreInfo();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/granite/security/post/authorizables")
    public String postAuthorizables(
        @RequestParam(name = "authorizableId") String authorizableId,
        @RequestParam(name = "intermediatePath") String intermediatePath,
        @RequestParam(name = "createUser") String createUser,
        @RequestParam(name = "createGroup") String createGroup,
        @RequestParam(name = "repPassword") String repPassword,
        @RequestParam(name = "profileGivenName") String profileGivenName
    ) {
        return libsService.postAuthorizables(authorizableId, intermediatePath, createUser, createGroup, repPassword, profileGivenName);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/replication/treeactivation.html")
    public void postTreeActivation(
        @RequestParam(name = "ignoredeactivated") Boolean ignoredeactivated,
        @RequestParam(name = "onlymodified") Boolean onlymodified,
        @RequestParam(name = "path") String path,
        @RequestParam(name = "cmd", defaultValue = "activate") String cmd
    ) {
        libsService.postTreeActivation(ignoredeactivated, onlymodified, path, cmd);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/granite/security/post/truststore")
    public String postTruststore(
        @RequestParam(name = "operation") String operation,
        @RequestParam(name = "newPassword") String newPassword,
        @RequestParam(name = "rePassword") String rePassword,
        @RequestParam(name = "keyStoreType") String keyStoreType,
        @RequestParam(name = "removeAlias") String removeAlias,
        @RequestParam(name = "certificate") org.springframework.web.multipart.MultipartFile certificate
    ) {
        return libsService.postTruststore(operation, newPassword, rePassword, keyStoreType, removeAlias, certificate);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/granite/security/post/sslSetup.html")
    public String sslSetup(
        @RequestParam(name = "keystorePassword") String keystorePassword,
        @RequestParam(name = "keystorePasswordConfirm") String keystorePasswordConfirm,
        @RequestParam(name = "truststorePassword") String truststorePassword,
        @RequestParam(name = "truststorePasswordConfirm") String truststorePasswordConfirm,
        @RequestParam(name = "httpsHostname") String httpsHostname,
        @RequestParam(name = "httpsPort") String httpsPort,
        @RequestParam(name = "privatekeyFile") org.springframework.web.multipart.MultipartFile privatekeyFile,
        @RequestParam(name = "certificateFile") org.springframework.web.multipart.MultipartFile certificateFile
    ) {
        return libsService.sslSetup(keystorePassword, keystorePasswordConfirm, truststorePassword, truststorePasswordConfirm, httpsHostname, httpsPort, privatekeyFile, certificateFile);
    }
}
