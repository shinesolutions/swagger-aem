package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.AppsApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;


import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.inject.Inject;

import javax.validation.constraints.*;

@Path("/apps")


@io.swagger.annotations.Api(description = "the apps API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2019-08-04T23:42:05.073Z[GMT]")
public class AppsApi  {

    @Inject AppsApiService service;

    @POST
    @Path("/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "sling", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = Void.class) })
    public Response postConfigAdobeGraniteSamlAuthenticationHandler(  @QueryParam("keyStorePassword") String keyStorePassword,  @QueryParam("keyStorePassword@TypeHint") String keyStorePasswordAtTypeHint,  @QueryParam("service.ranking") Integer serviceRanking,  @QueryParam("service.ranking@TypeHint") String serviceRankingAtTypeHint,  @QueryParam("idpHttpRedirect") Boolean idpHttpRedirect,  @QueryParam("idpHttpRedirect@TypeHint") String idpHttpRedirectAtTypeHint,  @QueryParam("createUser") Boolean createUser,  @QueryParam("createUser@TypeHint") String createUserAtTypeHint,  @QueryParam("defaultRedirectUrl") String defaultRedirectUrl,  @QueryParam("defaultRedirectUrl@TypeHint") String defaultRedirectUrlAtTypeHint,  @QueryParam("userIDAttribute") String userIDAttribute,  @QueryParam("userIDAttribute@TypeHint") String userIDAttributeAtTypeHint,  @QueryParam("defaultGroups") List<String> defaultGroups,  @QueryParam("defaultGroups@TypeHint") String defaultGroupsAtTypeHint,  @QueryParam("idpCertAlias") String idpCertAlias,  @QueryParam("idpCertAlias@TypeHint") String idpCertAliasAtTypeHint,  @QueryParam("addGroupMemberships") Boolean addGroupMemberships,  @QueryParam("addGroupMemberships@TypeHint") String addGroupMembershipsAtTypeHint,  @QueryParam("path") List<String> path,  @QueryParam("path@TypeHint") String pathAtTypeHint,  @QueryParam("synchronizeAttributes") List<String> synchronizeAttributes,  @QueryParam("synchronizeAttributes@TypeHint") String synchronizeAttributesAtTypeHint,  @QueryParam("clockTolerance") Integer clockTolerance,  @QueryParam("clockTolerance@TypeHint") String clockToleranceAtTypeHint,  @QueryParam("groupMembershipAttribute") String groupMembershipAttribute,  @QueryParam("groupMembershipAttribute@TypeHint") String groupMembershipAttributeAtTypeHint,  @QueryParam("idpUrl") String idpUrl,  @QueryParam("idpUrl@TypeHint") String idpUrlAtTypeHint,  @QueryParam("logoutUrl") String logoutUrl,  @QueryParam("logoutUrl@TypeHint") String logoutUrlAtTypeHint,  @QueryParam("serviceProviderEntityId") String serviceProviderEntityId,  @QueryParam("serviceProviderEntityId@TypeHint") String serviceProviderEntityIdAtTypeHint,  @QueryParam("assertionConsumerServiceURL") String assertionConsumerServiceURL,  @QueryParam("assertionConsumerServiceURL@TypeHint") String assertionConsumerServiceURLAtTypeHint,  @QueryParam("handleLogout") Boolean handleLogout,  @QueryParam("handleLogout@TypeHint") String handleLogoutAtTypeHint,  @QueryParam("spPrivateKeyAlias") String spPrivateKeyAlias,  @QueryParam("spPrivateKeyAlias@TypeHint") String spPrivateKeyAliasAtTypeHint,  @QueryParam("useEncryption") Boolean useEncryption,  @QueryParam("useEncryption@TypeHint") String useEncryptionAtTypeHint,  @QueryParam("nameIdFormat") String nameIdFormat,  @QueryParam("nameIdFormat@TypeHint") String nameIdFormatAtTypeHint,  @QueryParam("digestMethod") String digestMethod,  @QueryParam("digestMethod@TypeHint") String digestMethodAtTypeHint,  @QueryParam("signatureMethod") String signatureMethod,  @QueryParam("signatureMethod@TypeHint") String signatureMethodAtTypeHint,  @QueryParam("userIntermediatePath") String userIntermediatePath,  @QueryParam("userIntermediatePath@TypeHint") String userIntermediatePathAtTypeHint,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.postConfigAdobeGraniteSamlAuthenticationHandler(keyStorePassword,keyStorePasswordAtTypeHint,serviceRanking,serviceRankingAtTypeHint,idpHttpRedirect,idpHttpRedirectAtTypeHint,createUser,createUserAtTypeHint,defaultRedirectUrl,defaultRedirectUrlAtTypeHint,userIDAttribute,userIDAttributeAtTypeHint,defaultGroups,defaultGroupsAtTypeHint,idpCertAlias,idpCertAliasAtTypeHint,addGroupMemberships,addGroupMembershipsAtTypeHint,path,pathAtTypeHint,synchronizeAttributes,synchronizeAttributesAtTypeHint,clockTolerance,clockToleranceAtTypeHint,groupMembershipAttribute,groupMembershipAttributeAtTypeHint,idpUrl,idpUrlAtTypeHint,logoutUrl,logoutUrlAtTypeHint,serviceProviderEntityId,serviceProviderEntityIdAtTypeHint,assertionConsumerServiceURL,assertionConsumerServiceURLAtTypeHint,handleLogout,handleLogoutAtTypeHint,spPrivateKeyAlias,spPrivateKeyAliasAtTypeHint,useEncryption,useEncryptionAtTypeHint,nameIdFormat,nameIdFormatAtTypeHint,digestMethod,digestMethodAtTypeHint,signatureMethod,signatureMethodAtTypeHint,userIntermediatePath,userIntermediatePathAtTypeHint,securityContext);
    }
    @POST
    @Path("/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "custom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = Void.class) })
    public Response postConfigAemHealthCheckServlet(  @QueryParam("bundles.ignored") List<String> bundlesIgnored,  @QueryParam("bundles.ignored@TypeHint") String bundlesIgnoredAtTypeHint,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.postConfigAemHealthCheckServlet(bundlesIgnored,bundlesIgnoredAtTypeHint,securityContext);
    }
    @POST
    @Path("/system/config/com.shinesolutions.aem.passwordreset.Activator")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "custom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = Void.class) })
    public Response postConfigAemPasswordReset(  @QueryParam("pwdreset.authorizables") List<String> pwdresetAuthorizables,  @QueryParam("pwdreset.authorizables@TypeHint") String pwdresetAuthorizablesAtTypeHint,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.postConfigAemPasswordReset(pwdresetAuthorizables,pwdresetAuthorizablesAtTypeHint,securityContext);
    }
    @POST
    @Path("/system/config/org.apache.felix.http")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "sling", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = Void.class) })
    public Response postConfigApacheFelixJettyBasedHttpService(  @QueryParam("org.apache.felix.https.nio") Boolean orgApacheFelixHttpsNio,  @QueryParam("org.apache.felix.https.nio@TypeHint") String orgApacheFelixHttpsNioAtTypeHint,  @QueryParam("org.apache.felix.https.keystore") String orgApacheFelixHttpsKeystore,  @QueryParam("org.apache.felix.https.keystore@TypeHint") String orgApacheFelixHttpsKeystoreAtTypeHint,  @QueryParam("org.apache.felix.https.keystore.password") String orgApacheFelixHttpsKeystorePassword,  @QueryParam("org.apache.felix.https.keystore.password@TypeHint") String orgApacheFelixHttpsKeystorePasswordAtTypeHint,  @QueryParam("org.apache.felix.https.keystore.key") String orgApacheFelixHttpsKeystoreKey,  @QueryParam("org.apache.felix.https.keystore.key@TypeHint") String orgApacheFelixHttpsKeystoreKeyAtTypeHint,  @QueryParam("org.apache.felix.https.keystore.key.password") String orgApacheFelixHttpsKeystoreKeyPassword,  @QueryParam("org.apache.felix.https.keystore.key.password@TypeHint") String orgApacheFelixHttpsKeystoreKeyPasswordAtTypeHint,  @QueryParam("org.apache.felix.https.truststore") String orgApacheFelixHttpsTruststore,  @QueryParam("org.apache.felix.https.truststore@TypeHint") String orgApacheFelixHttpsTruststoreAtTypeHint,  @QueryParam("org.apache.felix.https.truststore.password") String orgApacheFelixHttpsTruststorePassword,  @QueryParam("org.apache.felix.https.truststore.password@TypeHint") String orgApacheFelixHttpsTruststorePasswordAtTypeHint,  @QueryParam("org.apache.felix.https.clientcertificate") String orgApacheFelixHttpsClientcertificate,  @QueryParam("org.apache.felix.https.clientcertificate@TypeHint") String orgApacheFelixHttpsClientcertificateAtTypeHint,  @QueryParam("org.apache.felix.https.enable") Boolean orgApacheFelixHttpsEnable,  @QueryParam("org.apache.felix.https.enable@TypeHint") String orgApacheFelixHttpsEnableAtTypeHint,  @QueryParam("org.osgi.service.http.port.secure") String orgOsgiServiceHttpPortSecure,  @QueryParam("org.osgi.service.http.port.secure@TypeHint") String orgOsgiServiceHttpPortSecureAtTypeHint,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.postConfigApacheFelixJettyBasedHttpService(orgApacheFelixHttpsNio,orgApacheFelixHttpsNioAtTypeHint,orgApacheFelixHttpsKeystore,orgApacheFelixHttpsKeystoreAtTypeHint,orgApacheFelixHttpsKeystorePassword,orgApacheFelixHttpsKeystorePasswordAtTypeHint,orgApacheFelixHttpsKeystoreKey,orgApacheFelixHttpsKeystoreKeyAtTypeHint,orgApacheFelixHttpsKeystoreKeyPassword,orgApacheFelixHttpsKeystoreKeyPasswordAtTypeHint,orgApacheFelixHttpsTruststore,orgApacheFelixHttpsTruststoreAtTypeHint,orgApacheFelixHttpsTruststorePassword,orgApacheFelixHttpsTruststorePasswordAtTypeHint,orgApacheFelixHttpsClientcertificate,orgApacheFelixHttpsClientcertificateAtTypeHint,orgApacheFelixHttpsEnable,orgApacheFelixHttpsEnableAtTypeHint,orgOsgiServiceHttpPortSecure,orgOsgiServiceHttpPortSecureAtTypeHint,securityContext);
    }
    @POST
    @Path("/system/config/org.apache.http.proxyconfigurator.config")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "sling", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = Void.class) })
    public Response postConfigApacheHttpComponentsProxyConfiguration(  @QueryParam("proxy.host") String proxyHost,  @QueryParam("proxy.host@TypeHint") String proxyHostAtTypeHint,  @QueryParam("proxy.port") Integer proxyPort,  @QueryParam("proxy.port@TypeHint") String proxyPortAtTypeHint,  @QueryParam("proxy.exceptions") List<String> proxyExceptions,  @QueryParam("proxy.exceptions@TypeHint") String proxyExceptionsAtTypeHint,  @QueryParam("proxy.enabled") Boolean proxyEnabled,  @QueryParam("proxy.enabled@TypeHint") String proxyEnabledAtTypeHint,  @QueryParam("proxy.user") String proxyUser,  @QueryParam("proxy.user@TypeHint") String proxyUserAtTypeHint,  @QueryParam("proxy.password") String proxyPassword,  @QueryParam("proxy.password@TypeHint") String proxyPasswordAtTypeHint,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.postConfigApacheHttpComponentsProxyConfiguration(proxyHost,proxyHostAtTypeHint,proxyPort,proxyPortAtTypeHint,proxyExceptions,proxyExceptionsAtTypeHint,proxyEnabled,proxyEnabledAtTypeHint,proxyUser,proxyUserAtTypeHint,proxyPassword,proxyPasswordAtTypeHint,securityContext);
    }
    @POST
    @Path("/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "sling", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = Void.class) })
    public Response postConfigApacheSlingDavExServlet(  @QueryParam("alias") String alias,  @QueryParam("alias@TypeHint") String aliasAtTypeHint,  @QueryParam("dav.create-absolute-uri") Boolean davCreateAbsoluteUri,  @QueryParam("dav.create-absolute-uri@TypeHint") String davCreateAbsoluteUriAtTypeHint,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.postConfigApacheSlingDavExServlet(alias,aliasAtTypeHint,davCreateAbsoluteUri,davCreateAbsoluteUriAtTypeHint,securityContext);
    }
    @POST
    @Path("/system/config/org.apache.sling.servlets.get.DefaultGetServlet")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "sling", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = Void.class) })
    public Response postConfigApacheSlingGetServlet(  @QueryParam("json.maximumresults") String jsonMaximumresults,  @QueryParam("json.maximumresults@TypeHint") String jsonMaximumresultsAtTypeHint,  @QueryParam("enable.html") Boolean enableHtml,  @QueryParam("enable.html@TypeHint") String enableHtmlAtTypeHint,  @QueryParam("enable.txt") Boolean enableTxt,  @QueryParam("enable.txt@TypeHint") String enableTxtAtTypeHint,  @QueryParam("enable.xml") Boolean enableXml,  @QueryParam("enable.xml@TypeHint") String enableXmlAtTypeHint,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.postConfigApacheSlingGetServlet(jsonMaximumresults,jsonMaximumresultsAtTypeHint,enableHtml,enableHtmlAtTypeHint,enableTxt,enableTxtAtTypeHint,enableXml,enableXmlAtTypeHint,securityContext);
    }
    @POST
    @Path("/system/config/org.apache.sling.security.impl.ReferrerFilter")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "sling", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = Void.class) })
    public Response postConfigApacheSlingReferrerFilter(  @QueryParam("allow.empty") Boolean allowEmpty,  @QueryParam("allow.empty@TypeHint") String allowEmptyAtTypeHint,  @QueryParam("allow.hosts") String allowHosts,  @QueryParam("allow.hosts@TypeHint") String allowHostsAtTypeHint,  @QueryParam("allow.hosts.regexp") String allowHostsRegexp,  @QueryParam("allow.hosts.regexp@TypeHint") String allowHostsRegexpAtTypeHint,  @QueryParam("filter.methods") String filterMethods,  @QueryParam("filter.methods@TypeHint") String filterMethodsAtTypeHint,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.postConfigApacheSlingReferrerFilter(allowEmpty,allowEmptyAtTypeHint,allowHosts,allowHostsAtTypeHint,allowHostsRegexp,allowHostsRegexpAtTypeHint,filterMethods,filterMethodsAtTypeHint,securityContext);
    }
}
