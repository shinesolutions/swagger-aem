package org.openapitools.api.consumer;

import org.openapitools.model.*;
import org.openapitools.api.interfaces.AppsService;
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
@RequestMapping("/apps")
public class AppsServiceController {

    @DubboReference
    private AppsService appsService;

    @RequestMapping(method = RequestMethod.POST, value = "/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config")
    public void postConfigAdobeGraniteSamlAuthenticationHandler(
        @RequestParam(name = "keyStorePassword") String keyStorePassword,
        @RequestParam(name = "keyStorePasswordAtTypeHint") String keyStorePasswordAtTypeHint,
        @RequestParam(name = "serviceRanking") Integer serviceRanking,
        @RequestParam(name = "serviceRankingAtTypeHint") String serviceRankingAtTypeHint,
        @RequestParam(name = "idpHttpRedirect") Boolean idpHttpRedirect,
        @RequestParam(name = "idpHttpRedirectAtTypeHint") String idpHttpRedirectAtTypeHint,
        @RequestParam(name = "createUser") Boolean createUser,
        @RequestParam(name = "createUserAtTypeHint") String createUserAtTypeHint,
        @RequestParam(name = "defaultRedirectUrl") String defaultRedirectUrl,
        @RequestParam(name = "defaultRedirectUrlAtTypeHint") String defaultRedirectUrlAtTypeHint,
        @RequestParam(name = "userIDAttribute") String userIDAttribute,
        @RequestParam(name = "userIDAttributeAtTypeHint") String userIDAttributeAtTypeHint,
        @RequestParam(name = "defaultGroups") List<String> defaultGroups,
        @RequestParam(name = "defaultGroupsAtTypeHint") String defaultGroupsAtTypeHint,
        @RequestParam(name = "idpCertAlias") String idpCertAlias,
        @RequestParam(name = "idpCertAliasAtTypeHint") String idpCertAliasAtTypeHint,
        @RequestParam(name = "addGroupMemberships") Boolean addGroupMemberships,
        @RequestParam(name = "addGroupMembershipsAtTypeHint") String addGroupMembershipsAtTypeHint,
        @RequestParam(name = "path") List<String> path,
        @RequestParam(name = "pathAtTypeHint") String pathAtTypeHint,
        @RequestParam(name = "synchronizeAttributes") List<String> synchronizeAttributes,
        @RequestParam(name = "synchronizeAttributesAtTypeHint") String synchronizeAttributesAtTypeHint,
        @RequestParam(name = "clockTolerance") Integer clockTolerance,
        @RequestParam(name = "clockToleranceAtTypeHint") String clockToleranceAtTypeHint,
        @RequestParam(name = "groupMembershipAttribute") String groupMembershipAttribute,
        @RequestParam(name = "groupMembershipAttributeAtTypeHint") String groupMembershipAttributeAtTypeHint,
        @RequestParam(name = "idpUrl") String idpUrl,
        @RequestParam(name = "idpUrlAtTypeHint") String idpUrlAtTypeHint,
        @RequestParam(name = "logoutUrl") String logoutUrl,
        @RequestParam(name = "logoutUrlAtTypeHint") String logoutUrlAtTypeHint,
        @RequestParam(name = "serviceProviderEntityId") String serviceProviderEntityId,
        @RequestParam(name = "serviceProviderEntityIdAtTypeHint") String serviceProviderEntityIdAtTypeHint,
        @RequestParam(name = "assertionConsumerServiceURL") String assertionConsumerServiceURL,
        @RequestParam(name = "assertionConsumerServiceURLAtTypeHint") String assertionConsumerServiceURLAtTypeHint,
        @RequestParam(name = "handleLogout") Boolean handleLogout,
        @RequestParam(name = "handleLogoutAtTypeHint") String handleLogoutAtTypeHint,
        @RequestParam(name = "spPrivateKeyAlias") String spPrivateKeyAlias,
        @RequestParam(name = "spPrivateKeyAliasAtTypeHint") String spPrivateKeyAliasAtTypeHint,
        @RequestParam(name = "useEncryption") Boolean useEncryption,
        @RequestParam(name = "useEncryptionAtTypeHint") String useEncryptionAtTypeHint,
        @RequestParam(name = "nameIdFormat") String nameIdFormat,
        @RequestParam(name = "nameIdFormatAtTypeHint") String nameIdFormatAtTypeHint,
        @RequestParam(name = "digestMethod") String digestMethod,
        @RequestParam(name = "digestMethodAtTypeHint") String digestMethodAtTypeHint,
        @RequestParam(name = "signatureMethod") String signatureMethod,
        @RequestParam(name = "signatureMethodAtTypeHint") String signatureMethodAtTypeHint,
        @RequestParam(name = "userIntermediatePath") String userIntermediatePath,
        @RequestParam(name = "userIntermediatePathAtTypeHint") String userIntermediatePathAtTypeHint
    ) {
        appsService.postConfigAdobeGraniteSamlAuthenticationHandler(keyStorePassword, keyStorePasswordAtTypeHint, serviceRanking, serviceRankingAtTypeHint, idpHttpRedirect, idpHttpRedirectAtTypeHint, createUser, createUserAtTypeHint, defaultRedirectUrl, defaultRedirectUrlAtTypeHint, userIDAttribute, userIDAttributeAtTypeHint, defaultGroups, defaultGroupsAtTypeHint, idpCertAlias, idpCertAliasAtTypeHint, addGroupMemberships, addGroupMembershipsAtTypeHint, path, pathAtTypeHint, synchronizeAttributes, synchronizeAttributesAtTypeHint, clockTolerance, clockToleranceAtTypeHint, groupMembershipAttribute, groupMembershipAttributeAtTypeHint, idpUrl, idpUrlAtTypeHint, logoutUrl, logoutUrlAtTypeHint, serviceProviderEntityId, serviceProviderEntityIdAtTypeHint, assertionConsumerServiceURL, assertionConsumerServiceURLAtTypeHint, handleLogout, handleLogoutAtTypeHint, spPrivateKeyAlias, spPrivateKeyAliasAtTypeHint, useEncryption, useEncryptionAtTypeHint, nameIdFormat, nameIdFormatAtTypeHint, digestMethod, digestMethodAtTypeHint, signatureMethod, signatureMethodAtTypeHint, userIntermediatePath, userIntermediatePathAtTypeHint);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck")
    public void postConfigAemHealthCheckServlet(
        @RequestParam(name = "bundlesIgnored") List<String> bundlesIgnored,
        @RequestParam(name = "bundlesIgnoredAtTypeHint") String bundlesIgnoredAtTypeHint
    ) {
        appsService.postConfigAemHealthCheckServlet(bundlesIgnored, bundlesIgnoredAtTypeHint);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/system/config/com.shinesolutions.aem.passwordreset.Activator")
    public void postConfigAemPasswordReset(
        @RequestParam(name = "pwdresetAuthorizables") List<String> pwdresetAuthorizables,
        @RequestParam(name = "pwdresetAuthorizablesAtTypeHint") String pwdresetAuthorizablesAtTypeHint
    ) {
        appsService.postConfigAemPasswordReset(pwdresetAuthorizables, pwdresetAuthorizablesAtTypeHint);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/system/config/org.apache.felix.http")
    public void postConfigApacheFelixJettyBasedHttpService(
        @RequestParam(name = "orgApacheFelixHttpsNio") Boolean orgApacheFelixHttpsNio,
        @RequestParam(name = "orgApacheFelixHttpsNioAtTypeHint") String orgApacheFelixHttpsNioAtTypeHint,
        @RequestParam(name = "orgApacheFelixHttpsKeystore") String orgApacheFelixHttpsKeystore,
        @RequestParam(name = "orgApacheFelixHttpsKeystoreAtTypeHint") String orgApacheFelixHttpsKeystoreAtTypeHint,
        @RequestParam(name = "orgApacheFelixHttpsKeystorePassword") String orgApacheFelixHttpsKeystorePassword,
        @RequestParam(name = "orgApacheFelixHttpsKeystorePasswordAtTypeHint") String orgApacheFelixHttpsKeystorePasswordAtTypeHint,
        @RequestParam(name = "orgApacheFelixHttpsKeystoreKey") String orgApacheFelixHttpsKeystoreKey,
        @RequestParam(name = "orgApacheFelixHttpsKeystoreKeyAtTypeHint") String orgApacheFelixHttpsKeystoreKeyAtTypeHint,
        @RequestParam(name = "orgApacheFelixHttpsKeystoreKeyPassword") String orgApacheFelixHttpsKeystoreKeyPassword,
        @RequestParam(name = "orgApacheFelixHttpsKeystoreKeyPasswordAtTypeHint") String orgApacheFelixHttpsKeystoreKeyPasswordAtTypeHint,
        @RequestParam(name = "orgApacheFelixHttpsTruststore") String orgApacheFelixHttpsTruststore,
        @RequestParam(name = "orgApacheFelixHttpsTruststoreAtTypeHint") String orgApacheFelixHttpsTruststoreAtTypeHint,
        @RequestParam(name = "orgApacheFelixHttpsTruststorePassword") String orgApacheFelixHttpsTruststorePassword,
        @RequestParam(name = "orgApacheFelixHttpsTruststorePasswordAtTypeHint") String orgApacheFelixHttpsTruststorePasswordAtTypeHint,
        @RequestParam(name = "orgApacheFelixHttpsClientcertificate") String orgApacheFelixHttpsClientcertificate,
        @RequestParam(name = "orgApacheFelixHttpsClientcertificateAtTypeHint") String orgApacheFelixHttpsClientcertificateAtTypeHint,
        @RequestParam(name = "orgApacheFelixHttpsEnable") Boolean orgApacheFelixHttpsEnable,
        @RequestParam(name = "orgApacheFelixHttpsEnableAtTypeHint") String orgApacheFelixHttpsEnableAtTypeHint,
        @RequestParam(name = "orgOsgiServiceHttpPortSecure") String orgOsgiServiceHttpPortSecure,
        @RequestParam(name = "orgOsgiServiceHttpPortSecureAtTypeHint") String orgOsgiServiceHttpPortSecureAtTypeHint
    ) {
        appsService.postConfigApacheFelixJettyBasedHttpService(orgApacheFelixHttpsNio, orgApacheFelixHttpsNioAtTypeHint, orgApacheFelixHttpsKeystore, orgApacheFelixHttpsKeystoreAtTypeHint, orgApacheFelixHttpsKeystorePassword, orgApacheFelixHttpsKeystorePasswordAtTypeHint, orgApacheFelixHttpsKeystoreKey, orgApacheFelixHttpsKeystoreKeyAtTypeHint, orgApacheFelixHttpsKeystoreKeyPassword, orgApacheFelixHttpsKeystoreKeyPasswordAtTypeHint, orgApacheFelixHttpsTruststore, orgApacheFelixHttpsTruststoreAtTypeHint, orgApacheFelixHttpsTruststorePassword, orgApacheFelixHttpsTruststorePasswordAtTypeHint, orgApacheFelixHttpsClientcertificate, orgApacheFelixHttpsClientcertificateAtTypeHint, orgApacheFelixHttpsEnable, orgApacheFelixHttpsEnableAtTypeHint, orgOsgiServiceHttpPortSecure, orgOsgiServiceHttpPortSecureAtTypeHint);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/system/config/org.apache.http.proxyconfigurator.config")
    public void postConfigApacheHttpComponentsProxyConfiguration(
        @RequestParam(name = "proxyHost") String proxyHost,
        @RequestParam(name = "proxyHostAtTypeHint") String proxyHostAtTypeHint,
        @RequestParam(name = "proxyPort") Integer proxyPort,
        @RequestParam(name = "proxyPortAtTypeHint") String proxyPortAtTypeHint,
        @RequestParam(name = "proxyExceptions") List<String> proxyExceptions,
        @RequestParam(name = "proxyExceptionsAtTypeHint") String proxyExceptionsAtTypeHint,
        @RequestParam(name = "proxyEnabled") Boolean proxyEnabled,
        @RequestParam(name = "proxyEnabledAtTypeHint") String proxyEnabledAtTypeHint,
        @RequestParam(name = "proxyUser") String proxyUser,
        @RequestParam(name = "proxyUserAtTypeHint") String proxyUserAtTypeHint,
        @RequestParam(name = "proxyPassword") String proxyPassword,
        @RequestParam(name = "proxyPasswordAtTypeHint") String proxyPasswordAtTypeHint
    ) {
        appsService.postConfigApacheHttpComponentsProxyConfiguration(proxyHost, proxyHostAtTypeHint, proxyPort, proxyPortAtTypeHint, proxyExceptions, proxyExceptionsAtTypeHint, proxyEnabled, proxyEnabledAtTypeHint, proxyUser, proxyUserAtTypeHint, proxyPassword, proxyPasswordAtTypeHint);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet")
    public void postConfigApacheSlingDavExServlet(
        @RequestParam(name = "alias") String alias,
        @RequestParam(name = "aliasAtTypeHint") String aliasAtTypeHint,
        @RequestParam(name = "davCreateAbsoluteUri") Boolean davCreateAbsoluteUri,
        @RequestParam(name = "davCreateAbsoluteUriAtTypeHint") String davCreateAbsoluteUriAtTypeHint
    ) {
        appsService.postConfigApacheSlingDavExServlet(alias, aliasAtTypeHint, davCreateAbsoluteUri, davCreateAbsoluteUriAtTypeHint);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/system/config/org.apache.sling.servlets.get.DefaultGetServlet")
    public void postConfigApacheSlingGetServlet(
        @RequestParam(name = "jsonMaximumresults") String jsonMaximumresults,
        @RequestParam(name = "jsonMaximumresultsAtTypeHint") String jsonMaximumresultsAtTypeHint,
        @RequestParam(name = "enableHtml") Boolean enableHtml,
        @RequestParam(name = "enableHtmlAtTypeHint") String enableHtmlAtTypeHint,
        @RequestParam(name = "enableTxt") Boolean enableTxt,
        @RequestParam(name = "enableTxtAtTypeHint") String enableTxtAtTypeHint,
        @RequestParam(name = "enableXml") Boolean enableXml,
        @RequestParam(name = "enableXmlAtTypeHint") String enableXmlAtTypeHint
    ) {
        appsService.postConfigApacheSlingGetServlet(jsonMaximumresults, jsonMaximumresultsAtTypeHint, enableHtml, enableHtmlAtTypeHint, enableTxt, enableTxtAtTypeHint, enableXml, enableXmlAtTypeHint);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/system/config/org.apache.sling.security.impl.ReferrerFilter")
    public void postConfigApacheSlingReferrerFilter(
        @RequestParam(name = "allowEmpty") Boolean allowEmpty,
        @RequestParam(name = "allowEmptyAtTypeHint") String allowEmptyAtTypeHint,
        @RequestParam(name = "allowHosts") String allowHosts,
        @RequestParam(name = "allowHostsAtTypeHint") String allowHostsAtTypeHint,
        @RequestParam(name = "allowHostsRegexp") String allowHostsRegexp,
        @RequestParam(name = "allowHostsRegexpAtTypeHint") String allowHostsRegexpAtTypeHint,
        @RequestParam(name = "filterMethods") String filterMethods,
        @RequestParam(name = "filterMethodsAtTypeHint") String filterMethodsAtTypeHint
    ) {
        appsService.postConfigApacheSlingReferrerFilter(allowEmpty, allowEmptyAtTypeHint, allowHosts, allowHostsAtTypeHint, allowHostsRegexp, allowHostsRegexpAtTypeHint, filterMethods, filterMethodsAtTypeHint);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/system/config/{configNodeName}")
    public void postConfigProperty(
        @RequestParam(name = "configNodeName") String configNodeName
    ) {
        appsService.postConfigProperty(configNodeName);
    }
}
