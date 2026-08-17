package org.openapitools.api.interfaces;

import org.openapitools.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.annotation.Generated;


@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public interface AppsService {

    /**
     * 
     * 
     *
     * @param keyStorePassword  (optional)
     * @param keyStorePasswordAtTypeHint  (optional)
     * @param serviceRanking  (optional)
     * @param serviceRankingAtTypeHint  (optional)
     * @param idpHttpRedirect  (optional)
     * @param idpHttpRedirectAtTypeHint  (optional)
     * @param createUser  (optional)
     * @param createUserAtTypeHint  (optional)
     * @param defaultRedirectUrl  (optional)
     * @param defaultRedirectUrlAtTypeHint  (optional)
     * @param userIDAttribute  (optional)
     * @param userIDAttributeAtTypeHint  (optional)
     * @param defaultGroups  (optional)
     * @param defaultGroupsAtTypeHint  (optional)
     * @param idpCertAlias  (optional)
     * @param idpCertAliasAtTypeHint  (optional)
     * @param addGroupMemberships  (optional)
     * @param addGroupMembershipsAtTypeHint  (optional)
     * @param path  (optional)
     * @param pathAtTypeHint  (optional)
     * @param synchronizeAttributes  (optional)
     * @param synchronizeAttributesAtTypeHint  (optional)
     * @param clockTolerance  (optional)
     * @param clockToleranceAtTypeHint  (optional)
     * @param groupMembershipAttribute  (optional)
     * @param groupMembershipAttributeAtTypeHint  (optional)
     * @param idpUrl  (optional)
     * @param idpUrlAtTypeHint  (optional)
     * @param logoutUrl  (optional)
     * @param logoutUrlAtTypeHint  (optional)
     * @param serviceProviderEntityId  (optional)
     * @param serviceProviderEntityIdAtTypeHint  (optional)
     * @param assertionConsumerServiceURL  (optional)
     * @param assertionConsumerServiceURLAtTypeHint  (optional)
     * @param handleLogout  (optional)
     * @param handleLogoutAtTypeHint  (optional)
     * @param spPrivateKeyAlias  (optional)
     * @param spPrivateKeyAliasAtTypeHint  (optional)
     * @param useEncryption  (optional)
     * @param useEncryptionAtTypeHint  (optional)
     * @param nameIdFormat  (optional)
     * @param nameIdFormatAtTypeHint  (optional)
     * @param digestMethod  (optional)
     * @param digestMethodAtTypeHint  (optional)
     * @param signatureMethod  (optional)
     * @param signatureMethodAtTypeHint  (optional)
     * @param userIntermediatePath  (optional)
     * @param userIntermediatePathAtTypeHint  (optional)
     * @return void
     */
    void postConfigAdobeGraniteSamlAuthenticationHandler(
        String keyStorePassword,
        String keyStorePasswordAtTypeHint,
        Integer serviceRanking,
        String serviceRankingAtTypeHint,
        Boolean idpHttpRedirect,
        String idpHttpRedirectAtTypeHint,
        Boolean createUser,
        String createUserAtTypeHint,
        String defaultRedirectUrl,
        String defaultRedirectUrlAtTypeHint,
        String userIDAttribute,
        String userIDAttributeAtTypeHint,
        List<String> defaultGroups,
        String defaultGroupsAtTypeHint,
        String idpCertAlias,
        String idpCertAliasAtTypeHint,
        Boolean addGroupMemberships,
        String addGroupMembershipsAtTypeHint,
        List<String> path,
        String pathAtTypeHint,
        List<String> synchronizeAttributes,
        String synchronizeAttributesAtTypeHint,
        Integer clockTolerance,
        String clockToleranceAtTypeHint,
        String groupMembershipAttribute,
        String groupMembershipAttributeAtTypeHint,
        String idpUrl,
        String idpUrlAtTypeHint,
        String logoutUrl,
        String logoutUrlAtTypeHint,
        String serviceProviderEntityId,
        String serviceProviderEntityIdAtTypeHint,
        String assertionConsumerServiceURL,
        String assertionConsumerServiceURLAtTypeHint,
        Boolean handleLogout,
        String handleLogoutAtTypeHint,
        String spPrivateKeyAlias,
        String spPrivateKeyAliasAtTypeHint,
        Boolean useEncryption,
        String useEncryptionAtTypeHint,
        String nameIdFormat,
        String nameIdFormatAtTypeHint,
        String digestMethod,
        String digestMethodAtTypeHint,
        String signatureMethod,
        String signatureMethodAtTypeHint,
        String userIntermediatePath,
        String userIntermediatePathAtTypeHint
    );

    /**
     * 
     * 
     *
     * @param bundlesIgnored  (optional)
     * @param bundlesIgnoredAtTypeHint  (optional)
     * @return void
     */
    void postConfigAemHealthCheckServlet(
        List<String> bundlesIgnored,
        String bundlesIgnoredAtTypeHint
    );

    /**
     * 
     * 
     *
     * @param pwdresetAuthorizables  (optional)
     * @param pwdresetAuthorizablesAtTypeHint  (optional)
     * @return void
     */
    void postConfigAemPasswordReset(
        List<String> pwdresetAuthorizables,
        String pwdresetAuthorizablesAtTypeHint
    );

    /**
     * 
     * 
     *
     * @param orgApacheFelixHttpsNio  (optional)
     * @param orgApacheFelixHttpsNioAtTypeHint  (optional)
     * @param orgApacheFelixHttpsKeystore  (optional)
     * @param orgApacheFelixHttpsKeystoreAtTypeHint  (optional)
     * @param orgApacheFelixHttpsKeystorePassword  (optional)
     * @param orgApacheFelixHttpsKeystorePasswordAtTypeHint  (optional)
     * @param orgApacheFelixHttpsKeystoreKey  (optional)
     * @param orgApacheFelixHttpsKeystoreKeyAtTypeHint  (optional)
     * @param orgApacheFelixHttpsKeystoreKeyPassword  (optional)
     * @param orgApacheFelixHttpsKeystoreKeyPasswordAtTypeHint  (optional)
     * @param orgApacheFelixHttpsTruststore  (optional)
     * @param orgApacheFelixHttpsTruststoreAtTypeHint  (optional)
     * @param orgApacheFelixHttpsTruststorePassword  (optional)
     * @param orgApacheFelixHttpsTruststorePasswordAtTypeHint  (optional)
     * @param orgApacheFelixHttpsClientcertificate  (optional)
     * @param orgApacheFelixHttpsClientcertificateAtTypeHint  (optional)
     * @param orgApacheFelixHttpsEnable  (optional)
     * @param orgApacheFelixHttpsEnableAtTypeHint  (optional)
     * @param orgOsgiServiceHttpPortSecure  (optional)
     * @param orgOsgiServiceHttpPortSecureAtTypeHint  (optional)
     * @return void
     */
    void postConfigApacheFelixJettyBasedHttpService(
        Boolean orgApacheFelixHttpsNio,
        String orgApacheFelixHttpsNioAtTypeHint,
        String orgApacheFelixHttpsKeystore,
        String orgApacheFelixHttpsKeystoreAtTypeHint,
        String orgApacheFelixHttpsKeystorePassword,
        String orgApacheFelixHttpsKeystorePasswordAtTypeHint,
        String orgApacheFelixHttpsKeystoreKey,
        String orgApacheFelixHttpsKeystoreKeyAtTypeHint,
        String orgApacheFelixHttpsKeystoreKeyPassword,
        String orgApacheFelixHttpsKeystoreKeyPasswordAtTypeHint,
        String orgApacheFelixHttpsTruststore,
        String orgApacheFelixHttpsTruststoreAtTypeHint,
        String orgApacheFelixHttpsTruststorePassword,
        String orgApacheFelixHttpsTruststorePasswordAtTypeHint,
        String orgApacheFelixHttpsClientcertificate,
        String orgApacheFelixHttpsClientcertificateAtTypeHint,
        Boolean orgApacheFelixHttpsEnable,
        String orgApacheFelixHttpsEnableAtTypeHint,
        String orgOsgiServiceHttpPortSecure,
        String orgOsgiServiceHttpPortSecureAtTypeHint
    );

    /**
     * 
     * 
     *
     * @param proxyHost  (optional)
     * @param proxyHostAtTypeHint  (optional)
     * @param proxyPort  (optional)
     * @param proxyPortAtTypeHint  (optional)
     * @param proxyExceptions  (optional)
     * @param proxyExceptionsAtTypeHint  (optional)
     * @param proxyEnabled  (optional)
     * @param proxyEnabledAtTypeHint  (optional)
     * @param proxyUser  (optional)
     * @param proxyUserAtTypeHint  (optional)
     * @param proxyPassword  (optional)
     * @param proxyPasswordAtTypeHint  (optional)
     * @return void
     */
    void postConfigApacheHttpComponentsProxyConfiguration(
        String proxyHost,
        String proxyHostAtTypeHint,
        Integer proxyPort,
        String proxyPortAtTypeHint,
        List<String> proxyExceptions,
        String proxyExceptionsAtTypeHint,
        Boolean proxyEnabled,
        String proxyEnabledAtTypeHint,
        String proxyUser,
        String proxyUserAtTypeHint,
        String proxyPassword,
        String proxyPasswordAtTypeHint
    );

    /**
     * 
     * 
     *
     * @param alias  (optional)
     * @param aliasAtTypeHint  (optional)
     * @param davCreateAbsoluteUri  (optional)
     * @param davCreateAbsoluteUriAtTypeHint  (optional)
     * @return void
     */
    void postConfigApacheSlingDavExServlet(
        String alias,
        String aliasAtTypeHint,
        Boolean davCreateAbsoluteUri,
        String davCreateAbsoluteUriAtTypeHint
    );

    /**
     * 
     * 
     *
     * @param jsonMaximumresults  (optional)
     * @param jsonMaximumresultsAtTypeHint  (optional)
     * @param enableHtml  (optional)
     * @param enableHtmlAtTypeHint  (optional)
     * @param enableTxt  (optional)
     * @param enableTxtAtTypeHint  (optional)
     * @param enableXml  (optional)
     * @param enableXmlAtTypeHint  (optional)
     * @return void
     */
    void postConfigApacheSlingGetServlet(
        String jsonMaximumresults,
        String jsonMaximumresultsAtTypeHint,
        Boolean enableHtml,
        String enableHtmlAtTypeHint,
        Boolean enableTxt,
        String enableTxtAtTypeHint,
        Boolean enableXml,
        String enableXmlAtTypeHint
    );

    /**
     * 
     * 
     *
     * @param allowEmpty  (optional)
     * @param allowEmptyAtTypeHint  (optional)
     * @param allowHosts  (optional)
     * @param allowHostsAtTypeHint  (optional)
     * @param allowHostsRegexp  (optional)
     * @param allowHostsRegexpAtTypeHint  (optional)
     * @param filterMethods  (optional)
     * @param filterMethodsAtTypeHint  (optional)
     * @return void
     */
    void postConfigApacheSlingReferrerFilter(
        Boolean allowEmpty,
        String allowEmptyAtTypeHint,
        String allowHosts,
        String allowHostsAtTypeHint,
        String allowHostsRegexp,
        String allowHostsRegexpAtTypeHint,
        String filterMethods,
        String filterMethodsAtTypeHint
    );

    /**
     * 
     * 
     *
     * @param configNodeName  (required)
     * @return void
     */
    void postConfigProperty(
        String configNodeName
    );
}
