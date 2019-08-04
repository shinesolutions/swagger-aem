package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import java.math.BigDecimal;
import java.io.File;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2019-08-04T23:41:53.293Z[GMT]")
public interface EtcApiService {
      public Response deleteAgent(String runmode, String name, SecurityContext securityContext);
      public Response getAgent(String runmode, String name, SecurityContext securityContext);
      public Response getAgents(String runmode, SecurityContext securityContext);
      public Response getPackage(String group, String name, String version, SecurityContext securityContext);
      public Response getPackageFilter(String group, String name, String version, SecurityContext securityContext);
      public Response getTruststore(SecurityContext securityContext);
      public Response postAgent(String runmode, String name, Boolean jcrColonContentSlashCqColonDistribute, String jcrColonContentSlashCqColonDistributeAtTypeHint, String jcrColonContentSlashCqColonName, String jcrColonContentSlashCqColonTemplate, Boolean jcrColonContentSlashEnabled, String jcrColonContentSlashJcrColonDescription, String jcrColonContentSlashJcrColonLastModified, String jcrColonContentSlashJcrColonLastModifiedBy, String jcrColonContentSlashJcrColonMixinTypes, String jcrColonContentSlashJcrColonTitle, String jcrColonContentSlashLogLevel, Boolean jcrColonContentSlashNoStatusUpdate, Boolean jcrColonContentSlashNoVersioning, BigDecimal jcrColonContentSlashProtocolConnectTimeout, Boolean jcrColonContentSlashProtocolHTTPConnectionClosed, String jcrColonContentSlashProtocolHTTPExpired, List<String> jcrColonContentSlashProtocolHTTPHeaders, String jcrColonContentSlashProtocolHTTPHeadersAtTypeHint, String jcrColonContentSlashProtocolHTTPMethod, Boolean jcrColonContentSlashProtocolHTTPSRelaxed, String jcrColonContentSlashProtocolInterface, BigDecimal jcrColonContentSlashProtocolSocketTimeout, String jcrColonContentSlashProtocolVersion, String jcrColonContentSlashProxyNTLMDomain, String jcrColonContentSlashProxyNTLMHost, String jcrColonContentSlashProxyHost, String jcrColonContentSlashProxyPassword, BigDecimal jcrColonContentSlashProxyPort, String jcrColonContentSlashProxyUser, BigDecimal jcrColonContentSlashQueueBatchMaxSize, String jcrColonContentSlashQueueBatchMode, BigDecimal jcrColonContentSlashQueueBatchWaitTime, String jcrColonContentSlashRetryDelay, Boolean jcrColonContentSlashReverseReplication, String jcrColonContentSlashSerializationType, String jcrColonContentSlashSlingColonResourceType, String jcrColonContentSlashSsl, String jcrColonContentSlashTransportNTLMDomain, String jcrColonContentSlashTransportNTLMHost, String jcrColonContentSlashTransportPassword, String jcrColonContentSlashTransportUri, String jcrColonContentSlashTransportUser, Boolean jcrColonContentSlashTriggerDistribute, Boolean jcrColonContentSlashTriggerModified, Boolean jcrColonContentSlashTriggerOnOffTime, Boolean jcrColonContentSlashTriggerReceive, Boolean jcrColonContentSlashTriggerSpecific, String jcrColonContentSlashUserId, String jcrColonPrimaryType, String colonOperation, SecurityContext securityContext);
      public Response postTreeActivation(Boolean ignoredeactivated, Boolean onlymodified, String path, SecurityContext securityContext);
      public Response postTruststorePKCS12(InputStream truststoreP12InputStream, Attachment truststoreP12Detail, SecurityContext securityContext);
}
