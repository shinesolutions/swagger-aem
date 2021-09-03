package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import java.math.BigDecimal;
import java.io.File;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2021-09-03T15:25:53.422+10:00[Australia/Melbourne]")
public abstract class EtcApiService {
    public abstract Response deleteAgent(String runmode,String name,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getAgent(String runmode,String name,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getAgents(String runmode,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getPackage(String group,String name,String version,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getPackageFilter(String group,String name,String version,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getTruststore(SecurityContext securityContext) throws NotFoundException;
    public abstract Response postAgent(String runmode,String name,Boolean jcrColonContentCqColonDistribute,String jcrColonContentCqColonDistributeAtTypeHint,String jcrColonContentCqColonName,String jcrColonContentCqColonTemplate,Boolean jcrColonContentEnabled,String jcrColonContentJcrColonDescription,String jcrColonContentJcrColonLastModified,String jcrColonContentJcrColonLastModifiedBy,String jcrColonContentJcrColonMixinTypes,String jcrColonContentJcrColonTitle,String jcrColonContentLogLevel,Boolean jcrColonContentNoStatusUpdate,Boolean jcrColonContentNoVersioning,BigDecimal jcrColonContentProtocolConnectTimeout,Boolean jcrColonContentProtocolHTTPConnectionClosed,String jcrColonContentProtocolHTTPExpired,List<String> jcrColonContentProtocolHTTPHeaders,String jcrColonContentProtocolHTTPHeadersAtTypeHint,String jcrColonContentProtocolHTTPMethod,Boolean jcrColonContentProtocolHTTPSRelaxed,String jcrColonContentProtocolInterface,BigDecimal jcrColonContentProtocolSocketTimeout,String jcrColonContentProtocolVersion,String jcrColonContentProxyNTLMDomain,String jcrColonContentProxyNTLMHost,String jcrColonContentProxyHost,String jcrColonContentProxyPassword,BigDecimal jcrColonContentProxyPort,String jcrColonContentProxyUser,BigDecimal jcrColonContentQueueBatchMaxSize,String jcrColonContentQueueBatchMode,BigDecimal jcrColonContentQueueBatchWaitTime,String jcrColonContentRetryDelay,Boolean jcrColonContentReverseReplication,String jcrColonContentSerializationType,String jcrColonContentSlingColonResourceType,String jcrColonContentSsl,String jcrColonContentTransportNTLMDomain,String jcrColonContentTransportNTLMHost,String jcrColonContentTransportPassword,String jcrColonContentTransportUri,String jcrColonContentTransportUser,Boolean jcrColonContentTriggerDistribute,Boolean jcrColonContentTriggerModified,Boolean jcrColonContentTriggerOnOffTime,Boolean jcrColonContentTriggerReceive,Boolean jcrColonContentTriggerSpecific,String jcrColonContentUserId,String jcrColonPrimaryType,String colonOperation,SecurityContext securityContext) throws NotFoundException;
    public abstract Response postTreeActivation( @NotNull Boolean ignoredeactivated, @NotNull Boolean onlymodified, @NotNull String path,SecurityContext securityContext) throws NotFoundException;
    public abstract Response postTruststorePKCS12(FormDataBodyPart truststoreP12Bodypart,SecurityContext securityContext) throws NotFoundException;
}
