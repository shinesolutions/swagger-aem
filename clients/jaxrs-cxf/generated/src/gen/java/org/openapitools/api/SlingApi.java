package org.openapitools.api;

import java.math.BigDecimal;
import java.io.File;
import org.openapitools.model.KeystoreInfo;
import org.openapitools.model.TruststoreInfo;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Adobe Experience Manager (AEM) API
 *
 * <p>Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API
 *
 */
@Path("/")
@Api(value = "/", description = "")
public interface SlingApi  {

    @DELETE
    @Path("/etc/replication/agents.{runmode}/{name}")
    @ApiOperation(value = "", tags={ "sling",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response") })
    public void deleteAgent(@PathParam("runmode") String runmode, @PathParam("name") String name);

    @DELETE
    @Path("/{path}/{name}")
    @ApiOperation(value = "", tags={ "sling",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response") })
    public void deleteNode(@PathParam("path") String path, @PathParam("name") String name);

    @GET
    @Path("/etc/replication/agents.{runmode}/{name}")
    @ApiOperation(value = "", tags={ "sling",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response") })
    public void getAgent(@PathParam("runmode") String runmode, @PathParam("name") String name);

    @GET
    @Path("/etc/replication/agents.{runmode}.-1.json")
    @Produces({ "application/json" })
    @ApiOperation(value = "", tags={ "sling",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class) })
    public String getAgents(@PathParam("runmode") String runmode);

    @GET
    @Path("/{intermediatePath}/{authorizableId}.ks.json")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", tags={ "sling",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Retrieved Authorizable Keystore info", response = KeystoreInfo.class),
        @ApiResponse(code = 200, message = "Default response", response = String.class) })
    public KeystoreInfo getAuthorizableKeystore(@PathParam("intermediatePath") String intermediatePath, @PathParam("authorizableId") String authorizableId);

    @GET
    @Path("/{intermediatePath}/{authorizableId}/keystore/store.p12")
    @Produces({ "application/octet-stream" })
    @ApiOperation(value = "", tags={ "sling",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = File.class) })
    public File getKeystore(@PathParam("intermediatePath") String intermediatePath, @PathParam("authorizableId") String authorizableId);

    @GET
    @Path("/{path}/{name}")
    @ApiOperation(value = "", tags={ "sling",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response") })
    public void getNode(@PathParam("path") String path, @PathParam("name") String name);

    @GET
    @Path("/etc/packages/{group}/{name}-{version}.zip")
    @Produces({ "application/octet-stream" })
    @ApiOperation(value = "", tags={ "sling",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = File.class) })
    public File getPackage(@PathParam("group") String group, @PathParam("name") String name, @PathParam("version") String version);

    @GET
    @Path("/etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json")
    @Produces({ "application/json" })
    @ApiOperation(value = "", tags={ "sling",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class) })
    public String getPackageFilter(@PathParam("group") String group, @PathParam("name") String name, @PathParam("version") String version);

    @GET
    @Path("/bin/querybuilder.json")
    @Produces({ "application/json" })
    @ApiOperation(value = "", tags={ "sling",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class) })
    public String getQuery(@QueryParam("path") @NotNull String path, @QueryParam("p.limit") @NotNull BigDecimal pLimit, @QueryParam("1_property") @NotNull String _1property, @QueryParam("1_property.value") @NotNull String _1propertyValue);

    @GET
    @Path("/etc/truststore/truststore.p12")
    @Produces({ "application/octet-stream" })
    @ApiOperation(value = "", tags={ "sling",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = File.class) })
    public File getTruststore();

    @GET
    @Path("/libs/granite/security/truststore.json")
    @Produces({ "application/json" })
    @ApiOperation(value = "", tags={ "sling",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Retrieved AEM Truststore info", response = TruststoreInfo.class),
        @ApiResponse(code = 200, message = "Default response", response = String.class) })
    public TruststoreInfo getTruststoreInfo();

    @POST
    @Path("/etc/replication/agents.{runmode}/{name}")
    @ApiOperation(value = "", tags={ "sling",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response") })
    public void postAgent(@PathParam("runmode") String runmode, @PathParam("name") String name, @QueryParam("jcr:content/cq:distribute") Boolean jcrColonContentSlashCqColonDistribute, @QueryParam("jcr:content/cq:distribute@TypeHint") String jcrColonContentSlashCqColonDistributeAtTypeHint, @QueryParam("jcr:content/cq:name") String jcrColonContentSlashCqColonName, @QueryParam("jcr:content/cq:template") String jcrColonContentSlashCqColonTemplate, @QueryParam("jcr:content/enabled") Boolean jcrColonContentSlashEnabled, @QueryParam("jcr:content/jcr:description") String jcrColonContentSlashJcrColonDescription, @QueryParam("jcr:content/jcr:lastModified") String jcrColonContentSlashJcrColonLastModified, @QueryParam("jcr:content/jcr:lastModifiedBy") String jcrColonContentSlashJcrColonLastModifiedBy, @QueryParam("jcr:content/jcr:mixinTypes") String jcrColonContentSlashJcrColonMixinTypes, @QueryParam("jcr:content/jcr:title") String jcrColonContentSlashJcrColonTitle, @QueryParam("jcr:content/logLevel") String jcrColonContentSlashLogLevel, @QueryParam("jcr:content/noStatusUpdate") Boolean jcrColonContentSlashNoStatusUpdate, @QueryParam("jcr:content/noVersioning") Boolean jcrColonContentSlashNoVersioning, @QueryParam("jcr:content/protocolConnectTimeout") BigDecimal jcrColonContentSlashProtocolConnectTimeout, @QueryParam("jcr:content/protocolHTTPConnectionClosed") Boolean jcrColonContentSlashProtocolHTTPConnectionClosed, @QueryParam("jcr:content/protocolHTTPExpired") String jcrColonContentSlashProtocolHTTPExpired, @QueryParam("jcr:content/protocolHTTPHeaders") List<String> jcrColonContentSlashProtocolHTTPHeaders, @QueryParam("jcr:content/protocolHTTPHeaders@TypeHint") String jcrColonContentSlashProtocolHTTPHeadersAtTypeHint, @QueryParam("jcr:content/protocolHTTPMethod") String jcrColonContentSlashProtocolHTTPMethod, @QueryParam("jcr:content/protocolHTTPSRelaxed") Boolean jcrColonContentSlashProtocolHTTPSRelaxed, @QueryParam("jcr:content/protocolInterface") String jcrColonContentSlashProtocolInterface, @QueryParam("jcr:content/protocolSocketTimeout") BigDecimal jcrColonContentSlashProtocolSocketTimeout, @QueryParam("jcr:content/protocolVersion") String jcrColonContentSlashProtocolVersion, @QueryParam("jcr:content/proxyNTLMDomain") String jcrColonContentSlashProxyNTLMDomain, @QueryParam("jcr:content/proxyNTLMHost") String jcrColonContentSlashProxyNTLMHost, @QueryParam("jcr:content/proxyHost") String jcrColonContentSlashProxyHost, @QueryParam("jcr:content/proxyPassword") String jcrColonContentSlashProxyPassword, @QueryParam("jcr:content/proxyPort") BigDecimal jcrColonContentSlashProxyPort, @QueryParam("jcr:content/proxyUser") String jcrColonContentSlashProxyUser, @QueryParam("jcr:content/queueBatchMaxSize") BigDecimal jcrColonContentSlashQueueBatchMaxSize, @QueryParam("jcr:content/queueBatchMode") String jcrColonContentSlashQueueBatchMode, @QueryParam("jcr:content/queueBatchWaitTime") BigDecimal jcrColonContentSlashQueueBatchWaitTime, @QueryParam("jcr:content/retryDelay") String jcrColonContentSlashRetryDelay, @QueryParam("jcr:content/reverseReplication") Boolean jcrColonContentSlashReverseReplication, @QueryParam("jcr:content/serializationType") String jcrColonContentSlashSerializationType, @QueryParam("jcr:content/sling:resourceType") String jcrColonContentSlashSlingColonResourceType, @QueryParam("jcr:content/ssl") String jcrColonContentSlashSsl, @QueryParam("jcr:content/transportNTLMDomain") String jcrColonContentSlashTransportNTLMDomain, @QueryParam("jcr:content/transportNTLMHost") String jcrColonContentSlashTransportNTLMHost, @QueryParam("jcr:content/transportPassword") String jcrColonContentSlashTransportPassword, @QueryParam("jcr:content/transportUri") String jcrColonContentSlashTransportUri, @QueryParam("jcr:content/transportUser") String jcrColonContentSlashTransportUser, @QueryParam("jcr:content/triggerDistribute") Boolean jcrColonContentSlashTriggerDistribute, @QueryParam("jcr:content/triggerModified") Boolean jcrColonContentSlashTriggerModified, @QueryParam("jcr:content/triggerOnOffTime") Boolean jcrColonContentSlashTriggerOnOffTime, @QueryParam("jcr:content/triggerReceive") Boolean jcrColonContentSlashTriggerReceive, @QueryParam("jcr:content/triggerSpecific") Boolean jcrColonContentSlashTriggerSpecific, @QueryParam("jcr:content/userId") String jcrColonContentSlashUserId, @QueryParam("jcr:primaryType") String jcrColonPrimaryType, @QueryParam(":operation") String colonOperation);

    @POST
    @Path("/{intermediatePath}/{authorizableId}.ks.html")
    @Consumes({ "multipart/form-data" })
    @Produces({ "text/plain" })
    @ApiOperation(value = "", tags={ "sling",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Retrieved Authorizable Keystore info", response = KeystoreInfo.class),
        @ApiResponse(code = 200, message = "Default response", response = String.class) })
    public KeystoreInfo postAuthorizableKeystore(@PathParam("intermediatePath") String intermediatePath, @PathParam("authorizableId") String authorizableId, @QueryParam(":operation") String colonOperation, @QueryParam("currentPassword") String currentPassword, @QueryParam("newPassword") String newPassword, @QueryParam("rePassword") String rePassword, @QueryParam("keyPassword") String keyPassword, @QueryParam("keyStorePass") String keyStorePass, @QueryParam("alias") String alias, @QueryParam("newAlias") String newAlias, @QueryParam("removeAlias") String removeAlias,  @Multipart(value = "cert-chain" , required = false) Attachment certChainDetail,  @Multipart(value = "pk" , required = false) Attachment pkDetail,  @Multipart(value = "keyStore" , required = false) Attachment keyStoreDetail);

    @POST
    @Path("/libs/granite/security/post/authorizables")
    @Produces({ "text/html" })
    @ApiOperation(value = "", tags={ "sling",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class) })
    public String postAuthorizables(@QueryParam("authorizableId") @NotNull String authorizableId, @QueryParam("intermediatePath") @NotNull String intermediatePath, @QueryParam("createUser") String createUser, @QueryParam("createGroup") String createGroup, @QueryParam("rep:password") String repColonPassword, @QueryParam("profile/givenName") String profileSlashGivenName);

    @POST
    @Path("/apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config")
    @ApiOperation(value = "", tags={ "sling",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response") })
    public void postConfigAdobeGraniteSamlAuthenticationHandler(@QueryParam("keyStorePassword") String keyStorePassword, @QueryParam("keyStorePassword@TypeHint") String keyStorePasswordAtTypeHint, @QueryParam("service.ranking") Integer serviceRanking, @QueryParam("service.ranking@TypeHint") String serviceRankingAtTypeHint, @QueryParam("idpHttpRedirect") Boolean idpHttpRedirect, @QueryParam("idpHttpRedirect@TypeHint") String idpHttpRedirectAtTypeHint, @QueryParam("createUser") Boolean createUser, @QueryParam("createUser@TypeHint") String createUserAtTypeHint, @QueryParam("defaultRedirectUrl") String defaultRedirectUrl, @QueryParam("defaultRedirectUrl@TypeHint") String defaultRedirectUrlAtTypeHint, @QueryParam("userIDAttribute") String userIDAttribute, @QueryParam("userIDAttribute@TypeHint") String userIDAttributeAtTypeHint, @QueryParam("defaultGroups") List<String> defaultGroups, @QueryParam("defaultGroups@TypeHint") String defaultGroupsAtTypeHint, @QueryParam("idpCertAlias") String idpCertAlias, @QueryParam("idpCertAlias@TypeHint") String idpCertAliasAtTypeHint, @QueryParam("addGroupMemberships") Boolean addGroupMemberships, @QueryParam("addGroupMemberships@TypeHint") String addGroupMembershipsAtTypeHint, @QueryParam("path") List<String> path, @QueryParam("path@TypeHint") String pathAtTypeHint, @QueryParam("synchronizeAttributes") List<String> synchronizeAttributes, @QueryParam("synchronizeAttributes@TypeHint") String synchronizeAttributesAtTypeHint, @QueryParam("clockTolerance") Integer clockTolerance, @QueryParam("clockTolerance@TypeHint") String clockToleranceAtTypeHint, @QueryParam("groupMembershipAttribute") String groupMembershipAttribute, @QueryParam("groupMembershipAttribute@TypeHint") String groupMembershipAttributeAtTypeHint, @QueryParam("idpUrl") String idpUrl, @QueryParam("idpUrl@TypeHint") String idpUrlAtTypeHint, @QueryParam("logoutUrl") String logoutUrl, @QueryParam("logoutUrl@TypeHint") String logoutUrlAtTypeHint, @QueryParam("serviceProviderEntityId") String serviceProviderEntityId, @QueryParam("serviceProviderEntityId@TypeHint") String serviceProviderEntityIdAtTypeHint, @QueryParam("assertionConsumerServiceURL") String assertionConsumerServiceURL, @QueryParam("assertionConsumerServiceURL@TypeHint") String assertionConsumerServiceURLAtTypeHint, @QueryParam("handleLogout") Boolean handleLogout, @QueryParam("handleLogout@TypeHint") String handleLogoutAtTypeHint, @QueryParam("spPrivateKeyAlias") String spPrivateKeyAlias, @QueryParam("spPrivateKeyAlias@TypeHint") String spPrivateKeyAliasAtTypeHint, @QueryParam("useEncryption") Boolean useEncryption, @QueryParam("useEncryption@TypeHint") String useEncryptionAtTypeHint, @QueryParam("nameIdFormat") String nameIdFormat, @QueryParam("nameIdFormat@TypeHint") String nameIdFormatAtTypeHint, @QueryParam("digestMethod") String digestMethod, @QueryParam("digestMethod@TypeHint") String digestMethodAtTypeHint, @QueryParam("signatureMethod") String signatureMethod, @QueryParam("signatureMethod@TypeHint") String signatureMethodAtTypeHint, @QueryParam("userIntermediatePath") String userIntermediatePath, @QueryParam("userIntermediatePath@TypeHint") String userIntermediatePathAtTypeHint);

    @POST
    @Path("/apps/system/config/org.apache.felix.http")
    @ApiOperation(value = "", tags={ "sling",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response") })
    public void postConfigApacheFelixJettyBasedHttpService(@QueryParam("org.apache.felix.https.nio") Boolean orgApacheFelixHttpsNio, @QueryParam("org.apache.felix.https.nio@TypeHint") String orgApacheFelixHttpsNioAtTypeHint, @QueryParam("org.apache.felix.https.keystore") String orgApacheFelixHttpsKeystore, @QueryParam("org.apache.felix.https.keystore@TypeHint") String orgApacheFelixHttpsKeystoreAtTypeHint, @QueryParam("org.apache.felix.https.keystore.password") String orgApacheFelixHttpsKeystorePassword, @QueryParam("org.apache.felix.https.keystore.password@TypeHint") String orgApacheFelixHttpsKeystorePasswordAtTypeHint, @QueryParam("org.apache.felix.https.keystore.key") String orgApacheFelixHttpsKeystoreKey, @QueryParam("org.apache.felix.https.keystore.key@TypeHint") String orgApacheFelixHttpsKeystoreKeyAtTypeHint, @QueryParam("org.apache.felix.https.keystore.key.password") String orgApacheFelixHttpsKeystoreKeyPassword, @QueryParam("org.apache.felix.https.keystore.key.password@TypeHint") String orgApacheFelixHttpsKeystoreKeyPasswordAtTypeHint, @QueryParam("org.apache.felix.https.truststore") String orgApacheFelixHttpsTruststore, @QueryParam("org.apache.felix.https.truststore@TypeHint") String orgApacheFelixHttpsTruststoreAtTypeHint, @QueryParam("org.apache.felix.https.truststore.password") String orgApacheFelixHttpsTruststorePassword, @QueryParam("org.apache.felix.https.truststore.password@TypeHint") String orgApacheFelixHttpsTruststorePasswordAtTypeHint, @QueryParam("org.apache.felix.https.clientcertificate") String orgApacheFelixHttpsClientcertificate, @QueryParam("org.apache.felix.https.clientcertificate@TypeHint") String orgApacheFelixHttpsClientcertificateAtTypeHint, @QueryParam("org.apache.felix.https.enable") Boolean orgApacheFelixHttpsEnable, @QueryParam("org.apache.felix.https.enable@TypeHint") String orgApacheFelixHttpsEnableAtTypeHint, @QueryParam("org.osgi.service.http.port.secure") String orgOsgiServiceHttpPortSecure, @QueryParam("org.osgi.service.http.port.secure@TypeHint") String orgOsgiServiceHttpPortSecureAtTypeHint);

    @POST
    @Path("/apps/system/config/org.apache.http.proxyconfigurator.config")
    @ApiOperation(value = "", tags={ "sling",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response") })
    public void postConfigApacheHttpComponentsProxyConfiguration(@QueryParam("proxy.host") String proxyHost, @QueryParam("proxy.host@TypeHint") String proxyHostAtTypeHint, @QueryParam("proxy.port") Integer proxyPort, @QueryParam("proxy.port@TypeHint") String proxyPortAtTypeHint, @QueryParam("proxy.exceptions") List<String> proxyExceptions, @QueryParam("proxy.exceptions@TypeHint") String proxyExceptionsAtTypeHint, @QueryParam("proxy.enabled") Boolean proxyEnabled, @QueryParam("proxy.enabled@TypeHint") String proxyEnabledAtTypeHint, @QueryParam("proxy.user") String proxyUser, @QueryParam("proxy.user@TypeHint") String proxyUserAtTypeHint, @QueryParam("proxy.password") String proxyPassword, @QueryParam("proxy.password@TypeHint") String proxyPasswordAtTypeHint);

    @POST
    @Path("/apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet")
    @ApiOperation(value = "", tags={ "sling",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response") })
    public void postConfigApacheSlingDavExServlet(@QueryParam("alias") String alias, @QueryParam("alias@TypeHint") String aliasAtTypeHint, @QueryParam("dav.create-absolute-uri") Boolean davCreateAbsoluteUri, @QueryParam("dav.create-absolute-uri@TypeHint") String davCreateAbsoluteUriAtTypeHint);

    @POST
    @Path("/apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet")
    @ApiOperation(value = "", tags={ "sling",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response") })
    public void postConfigApacheSlingGetServlet(@QueryParam("json.maximumresults") String jsonMaximumresults, @QueryParam("json.maximumresults@TypeHint") String jsonMaximumresultsAtTypeHint, @QueryParam("enable.html") Boolean enableHtml, @QueryParam("enable.html@TypeHint") String enableHtmlAtTypeHint, @QueryParam("enable.txt") Boolean enableTxt, @QueryParam("enable.txt@TypeHint") String enableTxtAtTypeHint, @QueryParam("enable.xml") Boolean enableXml, @QueryParam("enable.xml@TypeHint") String enableXmlAtTypeHint);

    @POST
    @Path("/apps/system/config/org.apache.sling.security.impl.ReferrerFilter")
    @ApiOperation(value = "", tags={ "sling",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response") })
    public void postConfigApacheSlingReferrerFilter(@QueryParam("allow.empty") Boolean allowEmpty, @QueryParam("allow.empty@TypeHint") String allowEmptyAtTypeHint, @QueryParam("allow.hosts") String allowHosts, @QueryParam("allow.hosts@TypeHint") String allowHostsAtTypeHint, @QueryParam("allow.hosts.regexp") String allowHostsRegexp, @QueryParam("allow.hosts.regexp@TypeHint") String allowHostsRegexpAtTypeHint, @QueryParam("filter.methods") String filterMethods, @QueryParam("filter.methods@TypeHint") String filterMethodsAtTypeHint);

    @POST
    @Path("/{path}/{name}")
    @Consumes({ "multipart/form-data" })
    @ApiOperation(value = "", tags={ "sling",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response") })
    public void postNode(@PathParam("path") String path, @PathParam("name") String name, @QueryParam(":operation") String colonOperation, @QueryParam("deleteAuthorizable") String deleteAuthorizable,  @Multipart(value = "file" , required = false) Attachment fileDetail);

    @POST
    @Path("/{path}/{name}.rw.html")
    @ApiOperation(value = "", tags={ "sling",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response") })
    public void postNodeRw(@PathParam("path") String path, @PathParam("name") String name, @QueryParam("addMembers") String addMembers);

    @POST
    @Path("/{path}/")
    @ApiOperation(value = "", tags={ "sling",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response") })
    public void postPath(@PathParam("path") String path, @QueryParam("jcr:primaryType") @NotNull String jcrColonPrimaryType, @QueryParam(":name") @NotNull String colonName);

    @POST
    @Path("/bin/querybuilder.json")
    @Produces({ "application/json" })
    @ApiOperation(value = "", tags={ "sling",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class) })
    public String postQuery(@QueryParam("path") @NotNull String path, @QueryParam("p.limit") @NotNull BigDecimal pLimit, @QueryParam("1_property") @NotNull String _1property, @QueryParam("1_property.value") @NotNull String _1propertyValue);

    @POST
    @Path("/etc/replication/treeactivation.html")
    @ApiOperation(value = "", tags={ "sling",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response") })
    public void postTreeActivation(@QueryParam("ignoredeactivated") @NotNull Boolean ignoredeactivated, @QueryParam("onlymodified") @NotNull Boolean onlymodified, @QueryParam("path") @NotNull String path);

    @POST
    @Path("/libs/granite/security/post/truststore")
    @Consumes({ "multipart/form-data" })
    @Produces({ "text/plain" })
    @ApiOperation(value = "", tags={ "sling",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class) })
    public String postTruststore(@QueryParam(":operation") String colonOperation, @QueryParam("newPassword") String newPassword, @QueryParam("rePassword") String rePassword, @QueryParam("keyStoreType") String keyStoreType, @QueryParam("removeAlias") String removeAlias,  @Multipart(value = "certificate" , required = false) Attachment certificateDetail);

    @POST
    @Path("/etc/truststore")
    @Consumes({ "multipart/form-data" })
    @Produces({ "text/plain" })
    @ApiOperation(value = "", tags={ "sling" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class) })
    public String postTruststorePKCS12( @Multipart(value = "truststore.p12" , required = false) Attachment truststoreP12Detail);
}

