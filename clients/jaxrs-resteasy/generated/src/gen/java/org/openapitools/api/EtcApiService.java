package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;


import java.math.BigDecimal;
import java.io.File;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-08-17T02:15:38.090574223Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public interface EtcApiService {
      Response deleteAgent(String runmode,String name,SecurityContext securityContext)
      throws NotFoundException;
      Response getAgent(String runmode,String name,SecurityContext securityContext)
      throws NotFoundException;
      Response getAgents(String runmode,SecurityContext securityContext)
      throws NotFoundException;
      Response getPackage(String group,String name,String version,SecurityContext securityContext)
      throws NotFoundException;
      Response getPackageFilter(String group,String name,String version,SecurityContext securityContext)
      throws NotFoundException;
      Response getTruststore(SecurityContext securityContext)
      throws NotFoundException;
      Response postAgent(String runmode,String name,Boolean jcrContentCqDistribute,String jcrContentCqDistributeAtTypeHint,String jcrContentCqName,String jcrContentCqTemplate,Boolean jcrContentAliasUpdate,Boolean jcrContentEnabled,String jcrContentJcrDescription,String jcrContentJcrLastModified,String jcrContentJcrLastModifiedBy,String jcrContentJcrMixinTypes,String jcrContentJcrTitle,String jcrContentLogLevel,Boolean jcrContentNoStatusUpdate,Boolean jcrContentNoVersioning,BigDecimal jcrContentProtocolConnectTimeout,Boolean jcrContentProtocolHTTPConnectionClosed,String jcrContentProtocolHTTPExpired,List<String> jcrContentProtocolHTTPHeaders,String jcrContentProtocolHTTPHeadersAtTypeHint,String jcrContentProtocolHTTPMethod,Boolean jcrContentProtocolHTTPSRelaxed,String jcrContentProtocolInterface,BigDecimal jcrContentProtocolSocketTimeout,String jcrContentProtocolVersion,String jcrContentProxyNTLMDomain,String jcrContentProxyNTLMHost,String jcrContentProxyHost,String jcrContentProxyPassword,BigDecimal jcrContentProxyPort,String jcrContentProxyUser,BigDecimal jcrContentQueueBatchMaxSize,String jcrContentQueueBatchMode,BigDecimal jcrContentQueueBatchWaitTime,String jcrContentRetryDelay,Boolean jcrContentReverseReplication,String jcrContentSerializationType,String jcrContentSlingResourceType,String jcrContentSsl,String jcrContentTransportNTLMDomain,String jcrContentTransportNTLMHost,String jcrContentTransportPassword,String jcrContentTransportUri,String jcrContentTransportUser,Boolean jcrContentTriggerDistribute,Boolean jcrContentTriggerModified,Boolean jcrContentTriggerOnOffTime,Boolean jcrContentTriggerReceive,Boolean jcrContentTriggerSpecific,String jcrContentUserId,String jcrPrimaryType,String operation,SecurityContext securityContext)
      throws NotFoundException;
      Response postTruststorePKCS12(MultipartFormDataInput input,SecurityContext securityContext)
      throws NotFoundException;


}
