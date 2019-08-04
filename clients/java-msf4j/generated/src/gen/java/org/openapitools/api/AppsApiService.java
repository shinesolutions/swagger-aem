package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;


import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-08-04T23:41:25.207Z[GMT]")
public abstract class AppsApiService {
    public abstract Response postConfigAdobeGraniteSamlAuthenticationHandler(String keyStorePassword
 ,String keyStorePasswordAtTypeHint
 ,Integer serviceRanking
 ,String serviceRankingAtTypeHint
 ,Boolean idpHttpRedirect
 ,String idpHttpRedirectAtTypeHint
 ,Boolean createUser
 ,String createUserAtTypeHint
 ,String defaultRedirectUrl
 ,String defaultRedirectUrlAtTypeHint
 ,String userIDAttribute
 ,String userIDAttributeAtTypeHint
 ,List<String> defaultGroups
 ,String defaultGroupsAtTypeHint
 ,String idpCertAlias
 ,String idpCertAliasAtTypeHint
 ,Boolean addGroupMemberships
 ,String addGroupMembershipsAtTypeHint
 ,List<String> path
 ,String pathAtTypeHint
 ,List<String> synchronizeAttributes
 ,String synchronizeAttributesAtTypeHint
 ,Integer clockTolerance
 ,String clockToleranceAtTypeHint
 ,String groupMembershipAttribute
 ,String groupMembershipAttributeAtTypeHint
 ,String idpUrl
 ,String idpUrlAtTypeHint
 ,String logoutUrl
 ,String logoutUrlAtTypeHint
 ,String serviceProviderEntityId
 ,String serviceProviderEntityIdAtTypeHint
 ,String assertionConsumerServiceURL
 ,String assertionConsumerServiceURLAtTypeHint
 ,Boolean handleLogout
 ,String handleLogoutAtTypeHint
 ,String spPrivateKeyAlias
 ,String spPrivateKeyAliasAtTypeHint
 ,Boolean useEncryption
 ,String useEncryptionAtTypeHint
 ,String nameIdFormat
 ,String nameIdFormatAtTypeHint
 ,String digestMethod
 ,String digestMethodAtTypeHint
 ,String signatureMethod
 ,String signatureMethodAtTypeHint
 ,String userIntermediatePath
 ,String userIntermediatePathAtTypeHint
 ) throws NotFoundException;
    public abstract Response postConfigAemHealthCheckServlet(List<String> bundlesIgnored
 ,String bundlesIgnoredAtTypeHint
 ) throws NotFoundException;
    public abstract Response postConfigAemPasswordReset(List<String> pwdresetAuthorizables
 ,String pwdresetAuthorizablesAtTypeHint
 ) throws NotFoundException;
    public abstract Response postConfigApacheFelixJettyBasedHttpService(Boolean orgApacheFelixHttpsNio
 ,String orgApacheFelixHttpsNioAtTypeHint
 ,String orgApacheFelixHttpsKeystore
 ,String orgApacheFelixHttpsKeystoreAtTypeHint
 ,String orgApacheFelixHttpsKeystorePassword
 ,String orgApacheFelixHttpsKeystorePasswordAtTypeHint
 ,String orgApacheFelixHttpsKeystoreKey
 ,String orgApacheFelixHttpsKeystoreKeyAtTypeHint
 ,String orgApacheFelixHttpsKeystoreKeyPassword
 ,String orgApacheFelixHttpsKeystoreKeyPasswordAtTypeHint
 ,String orgApacheFelixHttpsTruststore
 ,String orgApacheFelixHttpsTruststoreAtTypeHint
 ,String orgApacheFelixHttpsTruststorePassword
 ,String orgApacheFelixHttpsTruststorePasswordAtTypeHint
 ,String orgApacheFelixHttpsClientcertificate
 ,String orgApacheFelixHttpsClientcertificateAtTypeHint
 ,Boolean orgApacheFelixHttpsEnable
 ,String orgApacheFelixHttpsEnableAtTypeHint
 ,String orgOsgiServiceHttpPortSecure
 ,String orgOsgiServiceHttpPortSecureAtTypeHint
 ) throws NotFoundException;
    public abstract Response postConfigApacheHttpComponentsProxyConfiguration(String proxyHost
 ,String proxyHostAtTypeHint
 ,Integer proxyPort
 ,String proxyPortAtTypeHint
 ,List<String> proxyExceptions
 ,String proxyExceptionsAtTypeHint
 ,Boolean proxyEnabled
 ,String proxyEnabledAtTypeHint
 ,String proxyUser
 ,String proxyUserAtTypeHint
 ,String proxyPassword
 ,String proxyPasswordAtTypeHint
 ) throws NotFoundException;
    public abstract Response postConfigApacheSlingDavExServlet(String alias
 ,String aliasAtTypeHint
 ,Boolean davCreateAbsoluteUri
 ,String davCreateAbsoluteUriAtTypeHint
 ) throws NotFoundException;
    public abstract Response postConfigApacheSlingGetServlet(String jsonMaximumresults
 ,String jsonMaximumresultsAtTypeHint
 ,Boolean enableHtml
 ,String enableHtmlAtTypeHint
 ,Boolean enableTxt
 ,String enableTxtAtTypeHint
 ,Boolean enableXml
 ,String enableXmlAtTypeHint
 ) throws NotFoundException;
    public abstract Response postConfigApacheSlingReferrerFilter(Boolean allowEmpty
 ,String allowEmptyAtTypeHint
 ,String allowHosts
 ,String allowHostsAtTypeHint
 ,String allowHostsRegexp
 ,String allowHostsRegexpAtTypeHint
 ,String filterMethods
 ,String filterMethodsAtTypeHint
 ) throws NotFoundException;
}
