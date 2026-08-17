package org.openapitools.api.interfaces;

import org.openapitools.model.TruststoreInfo;
import org.openapitools.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.annotation.Generated;


@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public interface LibsService {

    /**
     * 
     * 
     *
     * @return String
     */
    String getLoginPage(
    );

    /**
     * 
     * 
     *
     * @return TruststoreInfo
     */
    TruststoreInfo getTruststoreInfo(
    );

    /**
     * 
     * 
     *
     * @param authorizableId  (required)
     * @param intermediatePath  (required)
     * @param createUser  (optional)
     * @param createGroup  (optional)
     * @param repPassword  (optional)
     * @param profileGivenName  (optional)
     * @return String
     */
    String postAuthorizables(
        String authorizableId,
        String intermediatePath,
        String createUser,
        String createGroup,
        String repPassword,
        String profileGivenName
    );

    /**
     * 
     * 
     *
     * @param ignoredeactivated  (required)
     * @param onlymodified  (required)
     * @param path  (required)
     * @param cmd  (required)
     * @return void
     */
    void postTreeActivation(
        Boolean ignoredeactivated,
        Boolean onlymodified,
        String path,
        String cmd
    );

    /**
     * 
     * 
     *
     * @param operation  (optional)
     * @param newPassword  (optional)
     * @param rePassword  (optional)
     * @param keyStoreType  (optional)
     * @param removeAlias  (optional)
     * @param certificate  (optional)
     * @return String
     */
    String postTruststore(
        String operation,
        String newPassword,
        String rePassword,
        String keyStoreType,
        String removeAlias,
        org.springframework.web.multipart.MultipartFile certificate
    );

    /**
     * 
     * 
     *
     * @param keystorePassword  (required)
     * @param keystorePasswordConfirm  (required)
     * @param truststorePassword  (required)
     * @param truststorePasswordConfirm  (required)
     * @param httpsHostname  (required)
     * @param httpsPort  (required)
     * @param privatekeyFile  (optional)
     * @param certificateFile  (optional)
     * @return String
     */
    String sslSetup(
        String keystorePassword,
        String keystorePasswordConfirm,
        String truststorePassword,
        String truststorePasswordConfirm,
        String httpsHostname,
        String httpsPort,
        org.springframework.web.multipart.MultipartFile privatekeyFile,
        org.springframework.web.multipart.MultipartFile certificateFile
    );
}
