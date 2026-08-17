package org.openapitools.api.interfaces;

import org.openapitools.model.KeystoreInfo;
import org.openapitools.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.annotation.Generated;


@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public interface IntermediatePathService {

    /**
     * 
     * 
     *
     * @param intermediatePath  (required)
     * @param authorizableId  (required)
     * @return KeystoreInfo
     */
    KeystoreInfo getAuthorizableKeystore(
        String intermediatePath,
        String authorizableId
    );

    /**
     * 
     * 
     *
     * @param intermediatePath  (required)
     * @param authorizableId  (required)
     * @return org.springframework.web.multipart.MultipartFile
     */
    org.springframework.web.multipart.MultipartFile getKeystore(
        String intermediatePath,
        String authorizableId
    );

    /**
     * 
     * 
     *
     * @param intermediatePath  (required)
     * @param authorizableId  (required)
     * @param operation  (optional)
     * @param currentPassword  (optional)
     * @param newPassword  (optional)
     * @param rePassword  (optional)
     * @param keyPassword  (optional)
     * @param keyStorePass  (optional)
     * @param alias  (optional)
     * @param newAlias  (optional)
     * @param removeAlias  (optional)
     * @param certChain  (optional)
     * @param pk  (optional)
     * @param keyStore  (optional)
     * @return KeystoreInfo
     */
    KeystoreInfo postAuthorizableKeystore(
        String intermediatePath,
        String authorizableId,
        String operation,
        String currentPassword,
        String newPassword,
        String rePassword,
        String keyPassword,
        String keyStorePass,
        String alias,
        String newAlias,
        String removeAlias,
        org.springframework.web.multipart.MultipartFile certChain,
        org.springframework.web.multipart.MultipartFile pk,
        org.springframework.web.multipart.MultipartFile keyStore
    );
}
