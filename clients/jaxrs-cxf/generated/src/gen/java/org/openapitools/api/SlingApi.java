package org.openapitools.api;

import java.math.BigDecimal;
import java.io.File;
import org.openapitools.model.KeystoreInfo;
import org.openapitools.model.TruststoreInfo;

import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
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
@Path("")
@Api(value = "/", description = "")
public interface SlingApi  {

    @DELETE
    @Path("/etc/replication/agents.{runmode}/{name}")
    @ApiOperation(value = "", tags={ "sling" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response") })
    public void deleteAgent(@PathParam("runmode") String runmode, @PathParam("name") String name);

    @DELETE
    @Path("/{path}/{name}")
    @ApiOperation(value = "", tags={ "sling" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response") })
    public void deleteNode(@PathParam("path") String path, @PathParam("name") String name);

    @GET
    @Path("/etc/replication/agents.{runmode}/{name}")
    @ApiOperation(value = "", tags={ "sling" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response") })
    public void getAgent(@PathParam("runmode") String runmode, @PathParam("name") String name);

    @GET
    @Path("/etc/replication/agents.{runmode}.-1.json")
    @Produces({ "application/json" })
    @ApiOperation(value = "", tags={ "sling" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class) })
    public String getAgents(@PathParam("runmode") String runmode);

    @GET
    @Path("/{intermediatePath}/{authorizableId}.ks.json")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", tags={ "sling" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Retrieved Authorizable Keystore info", response = KeystoreInfo.class),
        @ApiResponse(code = 200, message = "Default response", response = String.class) })
    public KeystoreInfo getAuthorizableKeystore(@PathParam("intermediatePath") String intermediatePath, @PathParam("authorizableId") String authorizableId);

    @GET
    @Path("/{intermediatePath}/{authorizableId}/keystore/store.p12")
    @Produces({ "application/octet-stream" })
    @ApiOperation(value = "", tags={ "sling" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = File.class) })
    public File getKeystore(@PathParam("intermediatePath") String intermediatePath, @PathParam("authorizableId") String authorizableId);

    @GET
    @Path("/{path}/{name}")
    @ApiOperation(value = "", tags={ "sling" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response") })
    public void getNode(@PathParam("path") String path, @PathParam("name") String name);

    @GET
    @Path("/etc/packages/{group}/{name}-{version}.zip")
    @Produces({ "application/octet-stream" })
    @ApiOperation(value = "", tags={ "sling" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = File.class) })
    public File getPackage(@PathParam("group") String group, @PathParam("name") String name, @PathParam("version") String version);

    @GET
    @Path("/etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json")
    @Produces({ "application/json" })
    @ApiOperation(value = "", tags={ "sling" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class) })
    public String getPackageFilter(@PathParam("group") String group, @PathParam("name") String name, @PathParam("version") String version);

    @GET
    @Path("/bin/querybuilder.json")
    @Produces({ "application/json" })
    @ApiOperation(value = "", tags={ "sling" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class) })
    public String getQuery(@QueryParam("path") @NotNull String path, @QueryParam("p.limit") @NotNull BigDecimal pLimit, @QueryParam("1_property") @NotNull String _1property, @QueryParam("1_property.value") @NotNull String _1propertyValue);

    @GET
    @Path("/etc/truststore/truststore.p12")
    @Produces({ "application/octet-stream" })
    @ApiOperation(value = "", tags={ "sling" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = File.class) })
    public File getTruststore();

    @GET
    @Path("/libs/granite/security/truststore.json")
    @Produces({ "application/json" })
    @ApiOperation(value = "", tags={ "sling" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Retrieved AEM Truststore info", response = TruststoreInfo.class),
        @ApiResponse(code = 200, message = "Default response", response = String.class) })
    public TruststoreInfo getTruststoreInfo();

    @POST
    @Path("/etc/replication/agents.{runmode}/{name}")
    @ApiOperation(value = "", tags={ "sling" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response") })
    public void postAgent(@PathParam("runmode") String runmode, @PathParam("name") String name, @QueryParam("jcr:content/cq:distribute") Boolean jcrContentCqDistribute, @QueryParam("jcr:content/cq:distribute@TypeHint") String jcrContentCqDistributeAtTypeHint, @QueryParam("jcr:content/cq:name") String jcrContentCqName, @QueryParam("jcr:content/cq:template") String jcrContentCqTemplate, @QueryParam("jcr:content/aliasUpdate") Boolean jcrContentAliasUpdate, @QueryParam("jcr:content/enabled") Boolean jcrContentEnabled, @QueryParam("jcr:content/jcr:description") String jcrContentJcrDescription, @QueryParam("jcr:content/jcr:lastModified") String jcrContentJcrLastModified, @QueryParam("jcr:content/jcr:lastModifiedBy") String jcrContentJcrLastModifiedBy, @QueryParam("jcr:content/jcr:mixinTypes") String jcrContentJcrMixinTypes, @QueryParam("jcr:content/jcr:title") String jcrContentJcrTitle, @QueryParam("jcr:content/logLevel") String jcrContentLogLevel, @QueryParam("jcr:content/noStatusUpdate") Boolean jcrContentNoStatusUpdate, @QueryParam("jcr:content/noVersioning") Boolean jcrContentNoVersioning, @QueryParam("jcr:content/protocolConnectTimeout") BigDecimal jcrContentProtocolConnectTimeout, @QueryParam("jcr:content/protocolHTTPConnectionClosed") Boolean jcrContentProtocolHTTPConnectionClosed, @QueryParam("jcr:content/protocolHTTPExpired") String jcrContentProtocolHTTPExpired, @QueryParam("jcr:content/protocolHTTPHeaders") List<String> jcrContentProtocolHTTPHeaders, @QueryParam("jcr:content/protocolHTTPHeaders@TypeHint") String jcrContentProtocolHTTPHeadersAtTypeHint, @QueryParam("jcr:content/protocolHTTPMethod") String jcrContentProtocolHTTPMethod, @QueryParam("jcr:content/protocolHTTPSRelaxed") Boolean jcrContentProtocolHTTPSRelaxed, @QueryParam("jcr:content/protocolInterface") String jcrContentProtocolInterface, @QueryParam("jcr:content/protocolSocketTimeout") BigDecimal jcrContentProtocolSocketTimeout, @QueryParam("jcr:content/protocolVersion") String jcrContentProtocolVersion, @QueryParam("jcr:content/proxyNTLMDomain") String jcrContentProxyNTLMDomain, @QueryParam("jcr:content/proxyNTLMHost") String jcrContentProxyNTLMHost, @QueryParam("jcr:content/proxyHost") String jcrContentProxyHost, @QueryParam("jcr:content/proxyPassword") String jcrContentProxyPassword, @QueryParam("jcr:content/proxyPort") BigDecimal jcrContentProxyPort, @QueryParam("jcr:content/proxyUser") String jcrContentProxyUser, @QueryParam("jcr:content/queueBatchMaxSize") BigDecimal jcrContentQueueBatchMaxSize, @QueryParam("jcr:content/queueBatchMode") String jcrContentQueueBatchMode, @QueryParam("jcr:content/queueBatchWaitTime") BigDecimal jcrContentQueueBatchWaitTime, @QueryParam("jcr:content/retryDelay") String jcrContentRetryDelay, @QueryParam("jcr:content/reverseReplication") Boolean jcrContentReverseReplication, @QueryParam("jcr:content/serializationType") String jcrContentSerializationType, @QueryParam("jcr:content/sling:resourceType") String jcrContentSlingResourceType, @QueryParam("jcr:content/ssl") String jcrContentSsl, @QueryParam("jcr:content/transportNTLMDomain") String jcrContentTransportNTLMDomain, @QueryParam("jcr:content/transportNTLMHost") String jcrContentTransportNTLMHost, @QueryParam("jcr:content/transportPassword") String jcrContentTransportPassword, @QueryParam("jcr:content/transportUri") String jcrContentTransportUri, @QueryParam("jcr:content/transportUser") String jcrContentTransportUser, @QueryParam("jcr:content/triggerDistribute") Boolean jcrContentTriggerDistribute, @QueryParam("jcr:content/triggerModified") Boolean jcrContentTriggerModified, @QueryParam("jcr:content/triggerOnOffTime") Boolean jcrContentTriggerOnOffTime, @QueryParam("jcr:content/triggerReceive") Boolean jcrContentTriggerReceive, @QueryParam("jcr:content/triggerSpecific") Boolean jcrContentTriggerSpecific, @QueryParam("jcr:content/userId") String jcrContentUserId, @QueryParam("jcr:primaryType") String jcrPrimaryType, @QueryParam(":operation") String operation);

    @POST
    @Path("/{intermediatePath}/{authorizableId}.ks.html")
    @Consumes({ "multipart/form-data" })
    @Produces({ "text/plain" })
    @ApiOperation(value = "", tags={ "sling" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Retrieved Authorizable Keystore info", response = KeystoreInfo.class),
        @ApiResponse(code = 200, message = "Default response", response = String.class) })
    public KeystoreInfo postAuthorizableKeystore(@PathParam("intermediatePath") String intermediatePath, @PathParam("authorizableId") String authorizableId, @QueryParam(":operation") String operation, @QueryParam("currentPassword") String currentPassword, @QueryParam("newPassword") String newPassword, @QueryParam("rePassword") String rePassword, @QueryParam("keyPassword") String keyPassword, @QueryParam("keyStorePass") String keyStorePass, @QueryParam("alias") String alias, @QueryParam("newAlias") String newAlias, @QueryParam("removeAlias") String removeAlias,  @Multipart(value = "cert-chain" , required = false) Attachment certChainDetail,  @Multipart(value = "pk" , required = false) Attachment pkDetail,  @Multipart(value = "keyStore" , required = false) Attachment keyStoreDetail);

    @POST
    @Path("/libs/granite/security/post/authorizables")
    @Produces({ "text/html" })
    @ApiOperation(value = "", tags={ "sling" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class) })
    public String postAuthorizables(@QueryParam("authorizableId") @NotNull String authorizableId, @QueryParam("intermediatePath") @NotNull String intermediatePath, @QueryParam("createUser") String createUser, @QueryParam("createGroup") String createGroup, @QueryParam("rep:password") String repPassword, @QueryParam("profile/givenName") String profileGivenName);

    @POST
    @Path("/apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config")
    @ApiOperation(value = "", tags={ "sling" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response") })
    public void postConfigAdobeGraniteSamlAuthenticationHandler(@QueryParam("keyStorePassword") String keyStorePassword, @QueryParam("keyStorePassword@TypeHint") String keyStorePasswordAtTypeHint, @QueryParam("service.ranking") Integer serviceRanking, @QueryParam("service.ranking@TypeHint") String serviceRankingAtTypeHint, @QueryParam("idpHttpRedirect") Boolean idpHttpRedirect, @QueryParam("idpHttpRedirect@TypeHint") String idpHttpRedirectAtTypeHint, @QueryParam("createUser") Boolean createUser, @QueryParam("createUser@TypeHint") String createUserAtTypeHint, @QueryParam("defaultRedirectUrl") String defaultRedirectUrl, @QueryParam("defaultRedirectUrl@TypeHint") String defaultRedirectUrlAtTypeHint, @QueryParam("userIDAttribute") String userIDAttribute, @QueryParam("userIDAttribute@TypeHint") String userIDAttributeAtTypeHint, @QueryParam("defaultGroups") List<String> defaultGroups, @QueryParam("defaultGroups@TypeHint") String defaultGroupsAtTypeHint, @QueryParam("idpCertAlias") String idpCertAlias, @QueryParam("idpCertAlias@TypeHint") String idpCertAliasAtTypeHint, @QueryParam("addGroupMemberships") Boolean addGroupMemberships, @QueryParam("addGroupMemberships@TypeHint") String addGroupMembershipsAtTypeHint, @QueryParam("path") List<String> path, @QueryParam("path@TypeHint") String pathAtTypeHint, @QueryParam("synchronizeAttributes") List<String> synchronizeAttributes, @QueryParam("synchronizeAttributes@TypeHint") String synchronizeAttributesAtTypeHint, @QueryParam("clockTolerance") Integer clockTolerance, @QueryParam("clockTolerance@TypeHint") String clockToleranceAtTypeHint, @QueryParam("groupMembershipAttribute") String groupMembershipAttribute, @QueryParam("groupMembershipAttribute@TypeHint") String groupMembershipAttributeAtTypeHint, @QueryParam("idpUrl") String idpUrl, @QueryParam("idpUrl@TypeHint") String idpUrlAtTypeHint, @QueryParam("logoutUrl") String logoutUrl, @QueryParam("logoutUrl@TypeHint") String logoutUrlAtTypeHint, @QueryParam("serviceProviderEntityId") String serviceProviderEntityId, @QueryParam("serviceProviderEntityId@TypeHint") String serviceProviderEntityIdAtTypeHint, @QueryParam("assertionConsumerServiceURL") String assertionConsumerServiceURL, @QueryParam("assertionConsumerServiceURL@TypeHint") String assertionConsumerServiceURLAtTypeHint, @QueryParam("handleLogout") Boolean handleLogout, @QueryParam("handleLogout@TypeHint") String handleLogoutAtTypeHint, @QueryParam("spPrivateKeyAlias") String spPrivateKeyAlias, @QueryParam("spPrivateKeyAlias@TypeHint") String spPrivateKeyAliasAtTypeHint, @QueryParam("useEncryption") Boolean useEncryption, @QueryParam("useEncryption@TypeHint") String useEncryptionAtTypeHint, @QueryParam("nameIdFormat") String nameIdFormat, @QueryParam("nameIdFormat@TypeHint") String nameIdFormatAtTypeHint, @QueryParam("digestMethod") String digestMethod, @QueryParam("digestMethod@TypeHint") String digestMethodAtTypeHint, @QueryParam("signatureMethod") String signatureMethod, @QueryParam("signatureMethod@TypeHint") String signatureMethodAtTypeHint, @QueryParam("userIntermediatePath") String userIntermediatePath, @QueryParam("userIntermediatePath@TypeHint") String userIntermediatePathAtTypeHint);

    @POST
    @Path("/apps/system/config/org.apache.felix.http")
    @ApiOperation(value = "", tags={ "sling" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response") })
    public void postConfigApacheFelixJettyBasedHttpService(@QueryParam("org.apache.felix.https.nio") Boolean orgApacheFelixHttpsNio, @QueryParam("org.apache.felix.https.nio@TypeHint") String orgApacheFelixHttpsNioAtTypeHint, @QueryParam("org.apache.felix.https.keystore") String orgApacheFelixHttpsKeystore, @QueryParam("org.apache.felix.https.keystore@TypeHint") String orgApacheFelixHttpsKeystoreAtTypeHint, @QueryParam("org.apache.felix.https.keystore.password") String orgApacheFelixHttpsKeystorePassword, @QueryParam("org.apache.felix.https.keystore.password@TypeHint") String orgApacheFelixHttpsKeystorePasswordAtTypeHint, @QueryParam("org.apache.felix.https.keystore.key") String orgApacheFelixHttpsKeystoreKey, @QueryParam("org.apache.felix.https.keystore.key@TypeHint") String orgApacheFelixHttpsKeystoreKeyAtTypeHint, @QueryParam("org.apache.felix.https.keystore.key.password") String orgApacheFelixHttpsKeystoreKeyPassword, @QueryParam("org.apache.felix.https.keystore.key.password@TypeHint") String orgApacheFelixHttpsKeystoreKeyPasswordAtTypeHint, @QueryParam("org.apache.felix.https.truststore") String orgApacheFelixHttpsTruststore, @QueryParam("org.apache.felix.https.truststore@TypeHint") String orgApacheFelixHttpsTruststoreAtTypeHint, @QueryParam("org.apache.felix.https.truststore.password") String orgApacheFelixHttpsTruststorePassword, @QueryParam("org.apache.felix.https.truststore.password@TypeHint") String orgApacheFelixHttpsTruststorePasswordAtTypeHint, @QueryParam("org.apache.felix.https.clientcertificate") String orgApacheFelixHttpsClientcertificate, @QueryParam("org.apache.felix.https.clientcertificate@TypeHint") String orgApacheFelixHttpsClientcertificateAtTypeHint, @QueryParam("org.apache.felix.https.enable") Boolean orgApacheFelixHttpsEnable, @QueryParam("org.apache.felix.https.enable@TypeHint") String orgApacheFelixHttpsEnableAtTypeHint, @QueryParam("org.osgi.service.http.port.secure") String orgOsgiServiceHttpPortSecure, @QueryParam("org.osgi.service.http.port.secure@TypeHint") String orgOsgiServiceHttpPortSecureAtTypeHint);

    @POST
    @Path("/apps/system/config/org.apache.http.proxyconfigurator.config")
    @ApiOperation(value = "", tags={ "sling" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response") })
    public void postConfigApacheHttpComponentsProxyConfiguration(@QueryParam("proxy.host") String proxyHost, @QueryParam("proxy.host@TypeHint") String proxyHostAtTypeHint, @QueryParam("proxy.port") Integer proxyPort, @QueryParam("proxy.port@TypeHint") String proxyPortAtTypeHint, @QueryParam("proxy.exceptions") List<String> proxyExceptions, @QueryParam("proxy.exceptions@TypeHint") String proxyExceptionsAtTypeHint, @QueryParam("proxy.enabled") Boolean proxyEnabled, @QueryParam("proxy.enabled@TypeHint") String proxyEnabledAtTypeHint, @QueryParam("proxy.user") String proxyUser, @QueryParam("proxy.user@TypeHint") String proxyUserAtTypeHint, @QueryParam("proxy.password") String proxyPassword, @QueryParam("proxy.password@TypeHint") String proxyPasswordAtTypeHint);

    @POST
    @Path("/apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet")
    @ApiOperation(value = "", tags={ "sling" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response") })
    public void postConfigApacheSlingDavExServlet(@QueryParam("alias") String alias, @QueryParam("alias@TypeHint") String aliasAtTypeHint, @QueryParam("dav.create-absolute-uri") Boolean davCreateAbsoluteUri, @QueryParam("dav.create-absolute-uri@TypeHint") String davCreateAbsoluteUriAtTypeHint);

    @POST
    @Path("/apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet")
    @ApiOperation(value = "", tags={ "sling" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response") })
    public void postConfigApacheSlingGetServlet(@QueryParam("json.maximumresults") String jsonMaximumresults, @QueryParam("json.maximumresults@TypeHint") String jsonMaximumresultsAtTypeHint, @QueryParam("enable.html") Boolean enableHtml, @QueryParam("enable.html@TypeHint") String enableHtmlAtTypeHint, @QueryParam("enable.txt") Boolean enableTxt, @QueryParam("enable.txt@TypeHint") String enableTxtAtTypeHint, @QueryParam("enable.xml") Boolean enableXml, @QueryParam("enable.xml@TypeHint") String enableXmlAtTypeHint);

    @POST
    @Path("/apps/system/config/org.apache.sling.security.impl.ReferrerFilter")
    @ApiOperation(value = "", tags={ "sling" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response") })
    public void postConfigApacheSlingReferrerFilter(@QueryParam("allow.empty") Boolean allowEmpty, @QueryParam("allow.empty@TypeHint") String allowEmptyAtTypeHint, @QueryParam("allow.hosts") String allowHosts, @QueryParam("allow.hosts@TypeHint") String allowHostsAtTypeHint, @QueryParam("allow.hosts.regexp") String allowHostsRegexp, @QueryParam("allow.hosts.regexp@TypeHint") String allowHostsRegexpAtTypeHint, @QueryParam("filter.methods") String filterMethods, @QueryParam("filter.methods@TypeHint") String filterMethodsAtTypeHint);

    @POST
    @Path("/apps/system/config/{configNodeName}")
    @ApiOperation(value = "", tags={ "sling" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response") })
    public void postConfigProperty(@PathParam("configNodeName") String configNodeName);

    @POST
    @Path("/{path}/{name}")
    @Consumes({ "multipart/form-data" })
    @ApiOperation(value = "", tags={ "sling" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response") })
    public void postNode(@PathParam("path") String path, @PathParam("name") String name, @QueryParam(":operation") String operation, @QueryParam("deleteAuthorizable") String deleteAuthorizable,  @Multipart(value = "file" , required = false) Attachment _fileDetail);

    @POST
    @Path("/{path}/{name}.rw.html")
    @ApiOperation(value = "", tags={ "sling" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response") })
    public void postNodeRw(@PathParam("path") String path, @PathParam("name") String name, @QueryParam("addMembers") String addMembers);

    @POST
    @Path("/{path}/")
    @ApiOperation(value = "", tags={ "sling" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response") })
    public void postPath(@PathParam("path") String path, @QueryParam("jcr:primaryType") @NotNull String jcrPrimaryType, @QueryParam(":name") @NotNull String name);

    @POST
    @Path("/bin/querybuilder.json")
    @Produces({ "application/json" })
    @ApiOperation(value = "", tags={ "sling" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class) })
    public String postQuery(@QueryParam("path") @NotNull String path, @QueryParam("p.limit") @NotNull BigDecimal pLimit, @QueryParam("1_property") @NotNull String _1property, @QueryParam("1_property.value") @NotNull String _1propertyValue);

    @POST
    @Path("/libs/replication/treeactivation.html")
    @ApiOperation(value = "", tags={ "sling" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response") })
    public void postTreeActivation(@QueryParam("ignoredeactivated") @NotNull Boolean ignoredeactivated, @QueryParam("onlymodified") @NotNull Boolean onlymodified, @QueryParam("path") @NotNull String path, @QueryParam("cmd") @NotNull @DefaultValue("activate")String cmd);

    @POST
    @Path("/libs/granite/security/post/truststore")
    @Consumes({ "multipart/form-data" })
    @Produces({ "text/plain" })
    @ApiOperation(value = "", tags={ "sling" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class) })
    public String postTruststore(@QueryParam(":operation") String operation, @QueryParam("newPassword") String newPassword, @QueryParam("rePassword") String rePassword, @QueryParam("keyStoreType") String keyStoreType, @QueryParam("removeAlias") String removeAlias,  @Multipart(value = "certificate" , required = false) Attachment certificateDetail);

    @POST
    @Path("/etc/truststore")
    @Consumes({ "multipart/form-data" })
    @Produces({ "text/plain" })
    @ApiOperation(value = "", tags={ "sling" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class) })
    public String postTruststorePKCS12( @Multipart(value = "truststore.p12" , required = false) Attachment truststoreP12Detail);
}
