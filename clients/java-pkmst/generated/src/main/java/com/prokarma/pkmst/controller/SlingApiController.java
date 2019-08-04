package com.prokarma.pkmst.controller;

import java.math.BigDecimal;
import java.io.File;
import com.prokarma.pkmst.model.KeystoreInfo;
import com.prokarma.pkmst.model.TruststoreInfo;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
/**
 * Api implemention
 * @author pkmst
 *
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-08-04T23:41:29.600Z[GMT]")

@Controller
public class SlingApiController implements SlingApi {
    private final ObjectMapper objectMapper;
@Autowired
    public SlingApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<Void> deleteAgent(@ApiParam(value = "",required=true ) @PathVariable("runmode") String runmode,
        @ApiParam(value = "",required=true ) @PathVariable("name") String name,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> deleteNode(@ApiParam(value = "",required=true ) @PathVariable("path") String path,
        @ApiParam(value = "",required=true ) @PathVariable("name") String name,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> getAgent(@ApiParam(value = "",required=true ) @PathVariable("runmode") String runmode,
        @ApiParam(value = "",required=true ) @PathVariable("name") String name,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<String> getAgents(@ApiParam(value = "",required=true ) @PathVariable("runmode") String runmode,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<String>(HttpStatus.OK);
    }

    public ResponseEntity<KeystoreInfo> getAuthorizableKeystore(@ApiParam(value = "",required=true ) @PathVariable("intermediatePath") String intermediatePath,
        @ApiParam(value = "",required=true ) @PathVariable("authorizableId") String authorizableId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("")) {
            return new ResponseEntity<KeystoreInfo>(objectMapper.readValue("", KeystoreInfo.class), HttpStatus.OK);
        }

        return new ResponseEntity<KeystoreInfo>(HttpStatus.OK);
    }

    public ResponseEntity<File> getKeystore(@ApiParam(value = "",required=true ) @PathVariable("intermediatePath") String intermediatePath,
        @ApiParam(value = "",required=true ) @PathVariable("authorizableId") String authorizableId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<File>(HttpStatus.OK);
    }

    public ResponseEntity<Void> getNode(@ApiParam(value = "",required=true ) @PathVariable("path") String path,
        @ApiParam(value = "",required=true ) @PathVariable("name") String name,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<File> getPackage(@ApiParam(value = "",required=true ) @PathVariable("group") String group,
        @ApiParam(value = "",required=true ) @PathVariable("name") String name,
        @ApiParam(value = "",required=true ) @PathVariable("version") String version,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<File>(HttpStatus.OK);
    }

    public ResponseEntity<String> getPackageFilter(@ApiParam(value = "",required=true ) @PathVariable("group") String group,
        @ApiParam(value = "",required=true ) @PathVariable("name") String name,
        @ApiParam(value = "",required=true ) @PathVariable("version") String version,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<String>(HttpStatus.OK);
    }

    public ResponseEntity<String> getQuery(@ApiParam(value = "", required = true)  @RequestParam(value = "path", required = true) String path,
        @ApiParam(value = "", required = true)  @RequestParam(value = "p.limit", required = true) BigDecimal pLimit,
        @ApiParam(value = "", required = true)  @RequestParam(value = "1_property", required = true) String _1property,
        @ApiParam(value = "", required = true)  @RequestParam(value = "1_property.value", required = true) String _1propertyValue,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<String>(HttpStatus.OK);
    }

    public ResponseEntity<File> getTruststore(@RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<File>(HttpStatus.OK);
    }

    public ResponseEntity<TruststoreInfo> getTruststoreInfo(@RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<TruststoreInfo>(objectMapper.readValue("", TruststoreInfo.class), HttpStatus.OK);
        }

        return new ResponseEntity<TruststoreInfo>(HttpStatus.OK);
    }

    public ResponseEntity<Void> postAgent(@ApiParam(value = "",required=true ) @PathVariable("runmode") String runmode,
        @ApiParam(value = "",required=true ) @PathVariable("name") String name,
        @ApiParam(value = "")  @RequestParam(value = "jcr:content/cq:distribute", required = false) Boolean jcrColonContentSlashCqColonDistribute,
        @ApiParam(value = "")  @RequestParam(value = "jcr:content/cq:distribute@TypeHint", required = false) String jcrColonContentSlashCqColonDistributeAtTypeHint,
        @ApiParam(value = "")  @RequestParam(value = "jcr:content/cq:name", required = false) String jcrColonContentSlashCqColonName,
        @ApiParam(value = "")  @RequestParam(value = "jcr:content/cq:template", required = false) String jcrColonContentSlashCqColonTemplate,
        @ApiParam(value = "")  @RequestParam(value = "jcr:content/enabled", required = false) Boolean jcrColonContentSlashEnabled,
        @ApiParam(value = "")  @RequestParam(value = "jcr:content/jcr:description", required = false) String jcrColonContentSlashJcrColonDescription,
        @ApiParam(value = "")  @RequestParam(value = "jcr:content/jcr:lastModified", required = false) String jcrColonContentSlashJcrColonLastModified,
        @ApiParam(value = "")  @RequestParam(value = "jcr:content/jcr:lastModifiedBy", required = false) String jcrColonContentSlashJcrColonLastModifiedBy,
        @ApiParam(value = "")  @RequestParam(value = "jcr:content/jcr:mixinTypes", required = false) String jcrColonContentSlashJcrColonMixinTypes,
        @ApiParam(value = "")  @RequestParam(value = "jcr:content/jcr:title", required = false) String jcrColonContentSlashJcrColonTitle,
        @ApiParam(value = "")  @RequestParam(value = "jcr:content/logLevel", required = false) String jcrColonContentSlashLogLevel,
        @ApiParam(value = "")  @RequestParam(value = "jcr:content/noStatusUpdate", required = false) Boolean jcrColonContentSlashNoStatusUpdate,
        @ApiParam(value = "")  @RequestParam(value = "jcr:content/noVersioning", required = false) Boolean jcrColonContentSlashNoVersioning,
        @ApiParam(value = "")  @RequestParam(value = "jcr:content/protocolConnectTimeout", required = false) BigDecimal jcrColonContentSlashProtocolConnectTimeout,
        @ApiParam(value = "")  @RequestParam(value = "jcr:content/protocolHTTPConnectionClosed", required = false) Boolean jcrColonContentSlashProtocolHTTPConnectionClosed,
        @ApiParam(value = "")  @RequestParam(value = "jcr:content/protocolHTTPExpired", required = false) String jcrColonContentSlashProtocolHTTPExpired,
        @ApiParam(value = "")  @RequestParam(value = "jcr:content/protocolHTTPHeaders", required = false) List<String> jcrColonContentSlashProtocolHTTPHeaders,
        @ApiParam(value = "")  @RequestParam(value = "jcr:content/protocolHTTPHeaders@TypeHint", required = false) String jcrColonContentSlashProtocolHTTPHeadersAtTypeHint,
        @ApiParam(value = "")  @RequestParam(value = "jcr:content/protocolHTTPMethod", required = false) String jcrColonContentSlashProtocolHTTPMethod,
        @ApiParam(value = "")  @RequestParam(value = "jcr:content/protocolHTTPSRelaxed", required = false) Boolean jcrColonContentSlashProtocolHTTPSRelaxed,
        @ApiParam(value = "")  @RequestParam(value = "jcr:content/protocolInterface", required = false) String jcrColonContentSlashProtocolInterface,
        @ApiParam(value = "")  @RequestParam(value = "jcr:content/protocolSocketTimeout", required = false) BigDecimal jcrColonContentSlashProtocolSocketTimeout,
        @ApiParam(value = "")  @RequestParam(value = "jcr:content/protocolVersion", required = false) String jcrColonContentSlashProtocolVersion,
        @ApiParam(value = "")  @RequestParam(value = "jcr:content/proxyNTLMDomain", required = false) String jcrColonContentSlashProxyNTLMDomain,
        @ApiParam(value = "")  @RequestParam(value = "jcr:content/proxyNTLMHost", required = false) String jcrColonContentSlashProxyNTLMHost,
        @ApiParam(value = "")  @RequestParam(value = "jcr:content/proxyHost", required = false) String jcrColonContentSlashProxyHost,
        @ApiParam(value = "")  @RequestParam(value = "jcr:content/proxyPassword", required = false) String jcrColonContentSlashProxyPassword,
        @ApiParam(value = "")  @RequestParam(value = "jcr:content/proxyPort", required = false) BigDecimal jcrColonContentSlashProxyPort,
        @ApiParam(value = "")  @RequestParam(value = "jcr:content/proxyUser", required = false) String jcrColonContentSlashProxyUser,
        @ApiParam(value = "")  @RequestParam(value = "jcr:content/queueBatchMaxSize", required = false) BigDecimal jcrColonContentSlashQueueBatchMaxSize,
        @ApiParam(value = "")  @RequestParam(value = "jcr:content/queueBatchMode", required = false) String jcrColonContentSlashQueueBatchMode,
        @ApiParam(value = "")  @RequestParam(value = "jcr:content/queueBatchWaitTime", required = false) BigDecimal jcrColonContentSlashQueueBatchWaitTime,
        @ApiParam(value = "")  @RequestParam(value = "jcr:content/retryDelay", required = false) String jcrColonContentSlashRetryDelay,
        @ApiParam(value = "")  @RequestParam(value = "jcr:content/reverseReplication", required = false) Boolean jcrColonContentSlashReverseReplication,
        @ApiParam(value = "")  @RequestParam(value = "jcr:content/serializationType", required = false) String jcrColonContentSlashSerializationType,
        @ApiParam(value = "")  @RequestParam(value = "jcr:content/sling:resourceType", required = false) String jcrColonContentSlashSlingColonResourceType,
        @ApiParam(value = "")  @RequestParam(value = "jcr:content/ssl", required = false) String jcrColonContentSlashSsl,
        @ApiParam(value = "")  @RequestParam(value = "jcr:content/transportNTLMDomain", required = false) String jcrColonContentSlashTransportNTLMDomain,
        @ApiParam(value = "")  @RequestParam(value = "jcr:content/transportNTLMHost", required = false) String jcrColonContentSlashTransportNTLMHost,
        @ApiParam(value = "")  @RequestParam(value = "jcr:content/transportPassword", required = false) String jcrColonContentSlashTransportPassword,
        @ApiParam(value = "")  @RequestParam(value = "jcr:content/transportUri", required = false) String jcrColonContentSlashTransportUri,
        @ApiParam(value = "")  @RequestParam(value = "jcr:content/transportUser", required = false) String jcrColonContentSlashTransportUser,
        @ApiParam(value = "")  @RequestParam(value = "jcr:content/triggerDistribute", required = false) Boolean jcrColonContentSlashTriggerDistribute,
        @ApiParam(value = "")  @RequestParam(value = "jcr:content/triggerModified", required = false) Boolean jcrColonContentSlashTriggerModified,
        @ApiParam(value = "")  @RequestParam(value = "jcr:content/triggerOnOffTime", required = false) Boolean jcrColonContentSlashTriggerOnOffTime,
        @ApiParam(value = "")  @RequestParam(value = "jcr:content/triggerReceive", required = false) Boolean jcrColonContentSlashTriggerReceive,
        @ApiParam(value = "")  @RequestParam(value = "jcr:content/triggerSpecific", required = false) Boolean jcrColonContentSlashTriggerSpecific,
        @ApiParam(value = "")  @RequestParam(value = "jcr:content/userId", required = false) String jcrColonContentSlashUserId,
        @ApiParam(value = "")  @RequestParam(value = "jcr:primaryType", required = false) String jcrColonPrimaryType,
        @ApiParam(value = "")  @RequestParam(value = ":operation", required = false) String colonOperation,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<KeystoreInfo> postAuthorizableKeystore(@ApiParam(value = "",required=true ) @PathVariable("intermediatePath") String intermediatePath,
        @ApiParam(value = "",required=true ) @PathVariable("authorizableId") String authorizableId,
        @ApiParam(value = "")  @RequestParam(value = ":operation", required = false) String colonOperation,
        @ApiParam(value = "")  @RequestParam(value = "currentPassword", required = false) String currentPassword,
        @ApiParam(value = "")  @RequestParam(value = "newPassword", required = false) String newPassword,
        @ApiParam(value = "")  @RequestParam(value = "rePassword", required = false) String rePassword,
        @ApiParam(value = "")  @RequestParam(value = "keyPassword", required = false) String keyPassword,
        @ApiParam(value = "")  @RequestParam(value = "keyStorePass", required = false) String keyStorePass,
        @ApiParam(value = "")  @RequestParam(value = "alias", required = false) String alias,
        @ApiParam(value = "")  @RequestParam(value = "newAlias", required = false) String newAlias,
        @ApiParam(value = "")  @RequestParam(value = "removeAlias", required = false) String removeAlias,
        @ApiParam(value = "file detail")  @RequestPart("file") MultipartFile cert-chain,
        @ApiParam(value = "file detail")  @RequestPart("file") MultipartFile pk,
        @ApiParam(value = "file detail")  @RequestPart("file") MultipartFile keyStore,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("")) {
            return new ResponseEntity<KeystoreInfo>(objectMapper.readValue("", KeystoreInfo.class), HttpStatus.OK);
        }

        return new ResponseEntity<KeystoreInfo>(HttpStatus.OK);
    }

    public ResponseEntity<String> postAuthorizables(@ApiParam(value = "", required = true)  @RequestParam(value = "authorizableId", required = true) String authorizableId,
        @ApiParam(value = "", required = true)  @RequestParam(value = "intermediatePath", required = true) String intermediatePath,
        @ApiParam(value = "")  @RequestParam(value = "createUser", required = false) String createUser,
        @ApiParam(value = "")  @RequestParam(value = "createGroup", required = false) String createGroup,
        @ApiParam(value = "")  @RequestParam(value = "rep:password", required = false) String repColonPassword,
        @ApiParam(value = "")  @RequestParam(value = "profile/givenName", required = false) String profileSlashGivenName,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<String>(HttpStatus.OK);
    }

    public ResponseEntity<Void> postConfigAdobeGraniteSamlAuthenticationHandler(@ApiParam(value = "")  @RequestParam(value = "keyStorePassword", required = false) String keyStorePassword,
        @ApiParam(value = "")  @RequestParam(value = "keyStorePassword@TypeHint", required = false) String keyStorePasswordAtTypeHint,
        @ApiParam(value = "")  @RequestParam(value = "service.ranking", required = false) Integer serviceRanking,
        @ApiParam(value = "")  @RequestParam(value = "service.ranking@TypeHint", required = false) String serviceRankingAtTypeHint,
        @ApiParam(value = "")  @RequestParam(value = "idpHttpRedirect", required = false) Boolean idpHttpRedirect,
        @ApiParam(value = "")  @RequestParam(value = "idpHttpRedirect@TypeHint", required = false) String idpHttpRedirectAtTypeHint,
        @ApiParam(value = "")  @RequestParam(value = "createUser", required = false) Boolean createUser,
        @ApiParam(value = "")  @RequestParam(value = "createUser@TypeHint", required = false) String createUserAtTypeHint,
        @ApiParam(value = "")  @RequestParam(value = "defaultRedirectUrl", required = false) String defaultRedirectUrl,
        @ApiParam(value = "")  @RequestParam(value = "defaultRedirectUrl@TypeHint", required = false) String defaultRedirectUrlAtTypeHint,
        @ApiParam(value = "")  @RequestParam(value = "userIDAttribute", required = false) String userIDAttribute,
        @ApiParam(value = "")  @RequestParam(value = "userIDAttribute@TypeHint", required = false) String userIDAttributeAtTypeHint,
        @ApiParam(value = "")  @RequestParam(value = "defaultGroups", required = false) List<String> defaultGroups,
        @ApiParam(value = "")  @RequestParam(value = "defaultGroups@TypeHint", required = false) String defaultGroupsAtTypeHint,
        @ApiParam(value = "")  @RequestParam(value = "idpCertAlias", required = false) String idpCertAlias,
        @ApiParam(value = "")  @RequestParam(value = "idpCertAlias@TypeHint", required = false) String idpCertAliasAtTypeHint,
        @ApiParam(value = "")  @RequestParam(value = "addGroupMemberships", required = false) Boolean addGroupMemberships,
        @ApiParam(value = "")  @RequestParam(value = "addGroupMemberships@TypeHint", required = false) String addGroupMembershipsAtTypeHint,
        @ApiParam(value = "")  @RequestParam(value = "path", required = false) List<String> path,
        @ApiParam(value = "")  @RequestParam(value = "path@TypeHint", required = false) String pathAtTypeHint,
        @ApiParam(value = "")  @RequestParam(value = "synchronizeAttributes", required = false) List<String> synchronizeAttributes,
        @ApiParam(value = "")  @RequestParam(value = "synchronizeAttributes@TypeHint", required = false) String synchronizeAttributesAtTypeHint,
        @ApiParam(value = "")  @RequestParam(value = "clockTolerance", required = false) Integer clockTolerance,
        @ApiParam(value = "")  @RequestParam(value = "clockTolerance@TypeHint", required = false) String clockToleranceAtTypeHint,
        @ApiParam(value = "")  @RequestParam(value = "groupMembershipAttribute", required = false) String groupMembershipAttribute,
        @ApiParam(value = "")  @RequestParam(value = "groupMembershipAttribute@TypeHint", required = false) String groupMembershipAttributeAtTypeHint,
        @ApiParam(value = "")  @RequestParam(value = "idpUrl", required = false) String idpUrl,
        @ApiParam(value = "")  @RequestParam(value = "idpUrl@TypeHint", required = false) String idpUrlAtTypeHint,
        @ApiParam(value = "")  @RequestParam(value = "logoutUrl", required = false) String logoutUrl,
        @ApiParam(value = "")  @RequestParam(value = "logoutUrl@TypeHint", required = false) String logoutUrlAtTypeHint,
        @ApiParam(value = "")  @RequestParam(value = "serviceProviderEntityId", required = false) String serviceProviderEntityId,
        @ApiParam(value = "")  @RequestParam(value = "serviceProviderEntityId@TypeHint", required = false) String serviceProviderEntityIdAtTypeHint,
        @ApiParam(value = "")  @RequestParam(value = "assertionConsumerServiceURL", required = false) String assertionConsumerServiceURL,
        @ApiParam(value = "")  @RequestParam(value = "assertionConsumerServiceURL@TypeHint", required = false) String assertionConsumerServiceURLAtTypeHint,
        @ApiParam(value = "")  @RequestParam(value = "handleLogout", required = false) Boolean handleLogout,
        @ApiParam(value = "")  @RequestParam(value = "handleLogout@TypeHint", required = false) String handleLogoutAtTypeHint,
        @ApiParam(value = "")  @RequestParam(value = "spPrivateKeyAlias", required = false) String spPrivateKeyAlias,
        @ApiParam(value = "")  @RequestParam(value = "spPrivateKeyAlias@TypeHint", required = false) String spPrivateKeyAliasAtTypeHint,
        @ApiParam(value = "")  @RequestParam(value = "useEncryption", required = false) Boolean useEncryption,
        @ApiParam(value = "")  @RequestParam(value = "useEncryption@TypeHint", required = false) String useEncryptionAtTypeHint,
        @ApiParam(value = "")  @RequestParam(value = "nameIdFormat", required = false) String nameIdFormat,
        @ApiParam(value = "")  @RequestParam(value = "nameIdFormat@TypeHint", required = false) String nameIdFormatAtTypeHint,
        @ApiParam(value = "")  @RequestParam(value = "digestMethod", required = false) String digestMethod,
        @ApiParam(value = "")  @RequestParam(value = "digestMethod@TypeHint", required = false) String digestMethodAtTypeHint,
        @ApiParam(value = "")  @RequestParam(value = "signatureMethod", required = false) String signatureMethod,
        @ApiParam(value = "")  @RequestParam(value = "signatureMethod@TypeHint", required = false) String signatureMethodAtTypeHint,
        @ApiParam(value = "")  @RequestParam(value = "userIntermediatePath", required = false) String userIntermediatePath,
        @ApiParam(value = "")  @RequestParam(value = "userIntermediatePath@TypeHint", required = false) String userIntermediatePathAtTypeHint,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> postConfigApacheFelixJettyBasedHttpService(@ApiParam(value = "")  @RequestParam(value = "org.apache.felix.https.nio", required = false) Boolean orgApacheFelixHttpsNio,
        @ApiParam(value = "")  @RequestParam(value = "org.apache.felix.https.nio@TypeHint", required = false) String orgApacheFelixHttpsNioAtTypeHint,
        @ApiParam(value = "")  @RequestParam(value = "org.apache.felix.https.keystore", required = false) String orgApacheFelixHttpsKeystore,
        @ApiParam(value = "")  @RequestParam(value = "org.apache.felix.https.keystore@TypeHint", required = false) String orgApacheFelixHttpsKeystoreAtTypeHint,
        @ApiParam(value = "")  @RequestParam(value = "org.apache.felix.https.keystore.password", required = false) String orgApacheFelixHttpsKeystorePassword,
        @ApiParam(value = "")  @RequestParam(value = "org.apache.felix.https.keystore.password@TypeHint", required = false) String orgApacheFelixHttpsKeystorePasswordAtTypeHint,
        @ApiParam(value = "")  @RequestParam(value = "org.apache.felix.https.keystore.key", required = false) String orgApacheFelixHttpsKeystoreKey,
        @ApiParam(value = "")  @RequestParam(value = "org.apache.felix.https.keystore.key@TypeHint", required = false) String orgApacheFelixHttpsKeystoreKeyAtTypeHint,
        @ApiParam(value = "")  @RequestParam(value = "org.apache.felix.https.keystore.key.password", required = false) String orgApacheFelixHttpsKeystoreKeyPassword,
        @ApiParam(value = "")  @RequestParam(value = "org.apache.felix.https.keystore.key.password@TypeHint", required = false) String orgApacheFelixHttpsKeystoreKeyPasswordAtTypeHint,
        @ApiParam(value = "")  @RequestParam(value = "org.apache.felix.https.truststore", required = false) String orgApacheFelixHttpsTruststore,
        @ApiParam(value = "")  @RequestParam(value = "org.apache.felix.https.truststore@TypeHint", required = false) String orgApacheFelixHttpsTruststoreAtTypeHint,
        @ApiParam(value = "")  @RequestParam(value = "org.apache.felix.https.truststore.password", required = false) String orgApacheFelixHttpsTruststorePassword,
        @ApiParam(value = "")  @RequestParam(value = "org.apache.felix.https.truststore.password@TypeHint", required = false) String orgApacheFelixHttpsTruststorePasswordAtTypeHint,
        @ApiParam(value = "")  @RequestParam(value = "org.apache.felix.https.clientcertificate", required = false) String orgApacheFelixHttpsClientcertificate,
        @ApiParam(value = "")  @RequestParam(value = "org.apache.felix.https.clientcertificate@TypeHint", required = false) String orgApacheFelixHttpsClientcertificateAtTypeHint,
        @ApiParam(value = "")  @RequestParam(value = "org.apache.felix.https.enable", required = false) Boolean orgApacheFelixHttpsEnable,
        @ApiParam(value = "")  @RequestParam(value = "org.apache.felix.https.enable@TypeHint", required = false) String orgApacheFelixHttpsEnableAtTypeHint,
        @ApiParam(value = "")  @RequestParam(value = "org.osgi.service.http.port.secure", required = false) String orgOsgiServiceHttpPortSecure,
        @ApiParam(value = "")  @RequestParam(value = "org.osgi.service.http.port.secure@TypeHint", required = false) String orgOsgiServiceHttpPortSecureAtTypeHint,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> postConfigApacheHttpComponentsProxyConfiguration(@ApiParam(value = "")  @RequestParam(value = "proxy.host", required = false) String proxyHost,
        @ApiParam(value = "")  @RequestParam(value = "proxy.host@TypeHint", required = false) String proxyHostAtTypeHint,
        @ApiParam(value = "")  @RequestParam(value = "proxy.port", required = false) Integer proxyPort,
        @ApiParam(value = "")  @RequestParam(value = "proxy.port@TypeHint", required = false) String proxyPortAtTypeHint,
        @ApiParam(value = "")  @RequestParam(value = "proxy.exceptions", required = false) List<String> proxyExceptions,
        @ApiParam(value = "")  @RequestParam(value = "proxy.exceptions@TypeHint", required = false) String proxyExceptionsAtTypeHint,
        @ApiParam(value = "")  @RequestParam(value = "proxy.enabled", required = false) Boolean proxyEnabled,
        @ApiParam(value = "")  @RequestParam(value = "proxy.enabled@TypeHint", required = false) String proxyEnabledAtTypeHint,
        @ApiParam(value = "")  @RequestParam(value = "proxy.user", required = false) String proxyUser,
        @ApiParam(value = "")  @RequestParam(value = "proxy.user@TypeHint", required = false) String proxyUserAtTypeHint,
        @ApiParam(value = "")  @RequestParam(value = "proxy.password", required = false) String proxyPassword,
        @ApiParam(value = "")  @RequestParam(value = "proxy.password@TypeHint", required = false) String proxyPasswordAtTypeHint,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> postConfigApacheSlingDavExServlet(@ApiParam(value = "")  @RequestParam(value = "alias", required = false) String alias,
        @ApiParam(value = "")  @RequestParam(value = "alias@TypeHint", required = false) String aliasAtTypeHint,
        @ApiParam(value = "")  @RequestParam(value = "dav.create-absolute-uri", required = false) Boolean davCreateAbsoluteUri,
        @ApiParam(value = "")  @RequestParam(value = "dav.create-absolute-uri@TypeHint", required = false) String davCreateAbsoluteUriAtTypeHint,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> postConfigApacheSlingGetServlet(@ApiParam(value = "")  @RequestParam(value = "json.maximumresults", required = false) String jsonMaximumresults,
        @ApiParam(value = "")  @RequestParam(value = "json.maximumresults@TypeHint", required = false) String jsonMaximumresultsAtTypeHint,
        @ApiParam(value = "")  @RequestParam(value = "enable.html", required = false) Boolean enableHtml,
        @ApiParam(value = "")  @RequestParam(value = "enable.html@TypeHint", required = false) String enableHtmlAtTypeHint,
        @ApiParam(value = "")  @RequestParam(value = "enable.txt", required = false) Boolean enableTxt,
        @ApiParam(value = "")  @RequestParam(value = "enable.txt@TypeHint", required = false) String enableTxtAtTypeHint,
        @ApiParam(value = "")  @RequestParam(value = "enable.xml", required = false) Boolean enableXml,
        @ApiParam(value = "")  @RequestParam(value = "enable.xml@TypeHint", required = false) String enableXmlAtTypeHint,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> postConfigApacheSlingReferrerFilter(@ApiParam(value = "")  @RequestParam(value = "allow.empty", required = false) Boolean allowEmpty,
        @ApiParam(value = "")  @RequestParam(value = "allow.empty@TypeHint", required = false) String allowEmptyAtTypeHint,
        @ApiParam(value = "")  @RequestParam(value = "allow.hosts", required = false) String allowHosts,
        @ApiParam(value = "")  @RequestParam(value = "allow.hosts@TypeHint", required = false) String allowHostsAtTypeHint,
        @ApiParam(value = "")  @RequestParam(value = "allow.hosts.regexp", required = false) String allowHostsRegexp,
        @ApiParam(value = "")  @RequestParam(value = "allow.hosts.regexp@TypeHint", required = false) String allowHostsRegexpAtTypeHint,
        @ApiParam(value = "")  @RequestParam(value = "filter.methods", required = false) String filterMethods,
        @ApiParam(value = "")  @RequestParam(value = "filter.methods@TypeHint", required = false) String filterMethodsAtTypeHint,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> postNode(@ApiParam(value = "",required=true ) @PathVariable("path") String path,
        @ApiParam(value = "",required=true ) @PathVariable("name") String name,
        @ApiParam(value = "")  @RequestParam(value = ":operation", required = false) String colonOperation,
        @ApiParam(value = "")  @RequestParam(value = "deleteAuthorizable", required = false) String deleteAuthorizable,
        @ApiParam(value = "file detail")  @RequestPart("file") MultipartFile file,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> postNodeRw(@ApiParam(value = "",required=true ) @PathVariable("path") String path,
        @ApiParam(value = "",required=true ) @PathVariable("name") String name,
        @ApiParam(value = "")  @RequestParam(value = "addMembers", required = false) String addMembers,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> postPath(@ApiParam(value = "",required=true ) @PathVariable("path") String path,
        @ApiParam(value = "", required = true)  @RequestParam(value = "jcr:primaryType", required = true) String jcrColonPrimaryType,
        @ApiParam(value = "", required = true)  @RequestParam(value = ":name", required = true) String colonName,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<String> postQuery(@ApiParam(value = "", required = true)  @RequestParam(value = "path", required = true) String path,
        @ApiParam(value = "", required = true)  @RequestParam(value = "p.limit", required = true) BigDecimal pLimit,
        @ApiParam(value = "", required = true)  @RequestParam(value = "1_property", required = true) String _1property,
        @ApiParam(value = "", required = true)  @RequestParam(value = "1_property.value", required = true) String _1propertyValue,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<String>(HttpStatus.OK);
    }

    public ResponseEntity<Void> postTreeActivation(@ApiParam(value = "", required = true)  @RequestParam(value = "ignoredeactivated", required = true) Boolean ignoredeactivated,
        @ApiParam(value = "", required = true)  @RequestParam(value = "onlymodified", required = true) Boolean onlymodified,
        @ApiParam(value = "", required = true)  @RequestParam(value = "path", required = true) String path,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<String> postTruststore(@ApiParam(value = "")  @RequestParam(value = ":operation", required = false) String colonOperation,
        @ApiParam(value = "")  @RequestParam(value = "newPassword", required = false) String newPassword,
        @ApiParam(value = "")  @RequestParam(value = "rePassword", required = false) String rePassword,
        @ApiParam(value = "")  @RequestParam(value = "keyStoreType", required = false) String keyStoreType,
        @ApiParam(value = "")  @RequestParam(value = "removeAlias", required = false) String removeAlias,
        @ApiParam(value = "file detail")  @RequestPart("file") MultipartFile certificate,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<String>(HttpStatus.OK);
    }

    public ResponseEntity<String> postTruststorePKCS12(@ApiParam(value = "file detail")  @RequestPart("file") MultipartFile truststore.p12,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<String>(HttpStatus.OK);
    }

}
