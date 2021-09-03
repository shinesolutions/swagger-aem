package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;

import java.math.BigDecimal;
import java.io.File;

import java.util.List;

import java.io.InputStream;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@RequestScoped
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2021-09-03T15:25:48.597+10:00[Australia/Melbourne]")
public class EtcApiServiceImpl implements EtcApiService {
      @Override
      public Response deleteAgent(String runmode, String name, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response getAgent(String runmode, String name, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response getAgents(String runmode, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response getPackage(String group, String name, String version, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response getPackageFilter(String group, String name, String version, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response getTruststore(SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response postAgent(String runmode, String name, Boolean jcrColonContentCqColonDistribute, String jcrColonContentCqColonDistributeAtTypeHint, String jcrColonContentCqColonName, String jcrColonContentCqColonTemplate, Boolean jcrColonContentEnabled, String jcrColonContentJcrColonDescription, String jcrColonContentJcrColonLastModified, String jcrColonContentJcrColonLastModifiedBy, String jcrColonContentJcrColonMixinTypes, String jcrColonContentJcrColonTitle, String jcrColonContentLogLevel, Boolean jcrColonContentNoStatusUpdate, Boolean jcrColonContentNoVersioning, BigDecimal jcrColonContentProtocolConnectTimeout, Boolean jcrColonContentProtocolHTTPConnectionClosed, String jcrColonContentProtocolHTTPExpired, List<String> jcrColonContentProtocolHTTPHeaders, String jcrColonContentProtocolHTTPHeadersAtTypeHint, String jcrColonContentProtocolHTTPMethod, Boolean jcrColonContentProtocolHTTPSRelaxed, String jcrColonContentProtocolInterface, BigDecimal jcrColonContentProtocolSocketTimeout, String jcrColonContentProtocolVersion, String jcrColonContentProxyNTLMDomain, String jcrColonContentProxyNTLMHost, String jcrColonContentProxyHost, String jcrColonContentProxyPassword, BigDecimal jcrColonContentProxyPort, String jcrColonContentProxyUser, BigDecimal jcrColonContentQueueBatchMaxSize, String jcrColonContentQueueBatchMode, BigDecimal jcrColonContentQueueBatchWaitTime, String jcrColonContentRetryDelay, Boolean jcrColonContentReverseReplication, String jcrColonContentSerializationType, String jcrColonContentSlingColonResourceType, String jcrColonContentSsl, String jcrColonContentTransportNTLMDomain, String jcrColonContentTransportNTLMHost, String jcrColonContentTransportPassword, String jcrColonContentTransportUri, String jcrColonContentTransportUser, Boolean jcrColonContentTriggerDistribute, Boolean jcrColonContentTriggerModified, Boolean jcrColonContentTriggerOnOffTime, Boolean jcrColonContentTriggerReceive, Boolean jcrColonContentTriggerSpecific, String jcrColonContentUserId, String jcrColonPrimaryType, String colonOperation, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response postTreeActivation(Boolean ignoredeactivated, Boolean onlymodified, String path, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response postTruststorePKCS12(InputStream truststoreP12InputStream, Attachment truststoreP12Detail, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
}
