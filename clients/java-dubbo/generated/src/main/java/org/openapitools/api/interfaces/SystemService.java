package org.openapitools.api.interfaces;

import org.openapitools.model.BundleInfo;
import org.openapitools.model.SamlConfigurationInfo;
import org.openapitools.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.annotation.Generated;


@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public interface SystemService {

    /**
     * 
     * 
     *
     * @param tags  (optional)
     * @param combineTagsOr  (optional)
     * @return String
     */
    String getAemHealthCheck(
        String tags,
        Boolean combineTagsOr
    );

    /**
     * 
     * 
     *
     * @return List<String>
     */
    List<String> getAemProductInfo(
    );

    /**
     * 
     * 
     *
     * @param name  (required)
     * @return BundleInfo
     */
    BundleInfo getBundleInfo(
        String name
    );

    /**
     * 
     * 
     *
     * @return String
     */
    String getConfigMgr(
    );

    /**
     * 
     * 
     *
     * @param name  (required)
     * @param action  (required)
     * @return void
     */
    void postBundle(
        String name,
        String action
    );

    /**
     * 
     * 
     *
     * @param action  (required)
     * @return void
     */
    void postJmxRepository(
        String action
    );

    /**
     * 
     * 
     *
     * @param post  (optional)
     * @param apply  (optional)
     * @param delete  (optional)
     * @param action  (optional)
     * @param $location  (optional)
     * @param path  (optional)
     * @param serviceRanking  (optional)
     * @param idpUrl  (optional)
     * @param idpCertAlias  (optional)
     * @param idpHttpRedirect  (optional)
     * @param serviceProviderEntityId  (optional)
     * @param assertionConsumerServiceURL  (optional)
     * @param spPrivateKeyAlias  (optional)
     * @param keyStorePassword  (optional)
     * @param defaultRedirectUrl  (optional)
     * @param userIDAttribute  (optional)
     * @param useEncryption  (optional)
     * @param createUser  (optional)
     * @param addGroupMemberships  (optional)
     * @param groupMembershipAttribute  (optional)
     * @param defaultGroups  (optional)
     * @param nameIdFormat  (optional)
     * @param synchronizeAttributes  (optional)
     * @param handleLogout  (optional)
     * @param logoutUrl  (optional)
     * @param clockTolerance  (optional)
     * @param digestMethod  (optional)
     * @param signatureMethod  (optional)
     * @param userIntermediatePath  (optional)
     * @param propertylist  (optional)
     * @return SamlConfigurationInfo
     */
    SamlConfigurationInfo postSamlConfiguration(
        Boolean post,
        Boolean apply,
        Boolean delete,
        String action,
        String $location,
        List<String> path,
        Integer serviceRanking,
        String idpUrl,
        String idpCertAlias,
        Boolean idpHttpRedirect,
        String serviceProviderEntityId,
        String assertionConsumerServiceURL,
        String spPrivateKeyAlias,
        String keyStorePassword,
        String defaultRedirectUrl,
        String userIDAttribute,
        Boolean useEncryption,
        Boolean createUser,
        Boolean addGroupMemberships,
        String groupMembershipAttribute,
        List<String> defaultGroups,
        String nameIdFormat,
        List<String> synchronizeAttributes,
        Boolean handleLogout,
        String logoutUrl,
        Integer clockTolerance,
        String digestMethod,
        String signatureMethod,
        String userIntermediatePath,
        List<String> propertylist
    );
}
