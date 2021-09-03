package controllers;

import java.math.BigDecimal;
import java.io.InputStream;
import apimodels.KeystoreInfo;
import apimodels.TruststoreInfo;

import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Http;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import java.io.File;
import play.libs.Files.TemporaryFile;
import openapitools.OpenAPIUtils;
import com.fasterxml.jackson.core.type.TypeReference;

import javax.validation.constraints.*;
import com.typesafe.config.Config;

import openapitools.OpenAPIUtils.ApiAction;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2021-09-03T15:25:32.040+10:00[Australia/Melbourne]")
public class SlingApiController extends Controller {
    private final SlingApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private SlingApiController(Config configuration, SlingApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result deleteAgent(Http.Request request, String runmode,String name) throws Exception {
        return imp.deleteAgentHttp(request, runmode, name);
    }

    @ApiAction
    public Result deleteNode(Http.Request request, String path,String name) throws Exception {
        return imp.deleteNodeHttp(request, path, name);
    }

    @ApiAction
    public Result getAgent(Http.Request request, String runmode,String name) throws Exception {
        return imp.getAgentHttp(request, runmode, name);
    }

    @ApiAction
    public Result getAgents(Http.Request request, String runmode) throws Exception {
        return imp.getAgentsHttp(request, runmode);
    }

    @ApiAction
    public Result getAuthorizableKeystore(Http.Request request, String intermediatePath,String authorizableId) throws Exception {
        return imp.getAuthorizableKeystoreHttp(request, intermediatePath, authorizableId);
    }

    @ApiAction
    public Result getKeystore(Http.Request request, String intermediatePath,String authorizableId) throws Exception {
        return imp.getKeystoreHttp(request, intermediatePath, authorizableId);
    }

    @ApiAction
    public Result getNode(Http.Request request, String path,String name) throws Exception {
        return imp.getNodeHttp(request, path, name);
    }

    @ApiAction
    public Result getPackage(Http.Request request, String group,String name,String version) throws Exception {
        return imp.getPackageHttp(request, group, name, version);
    }

    @ApiAction
    public Result getPackageFilter(Http.Request request, String group,String name,String version) throws Exception {
        return imp.getPackageFilterHttp(request, group, name, version);
    }

    @ApiAction
    public Result getQuery(Http.Request request) throws Exception {
        String valuepath = request.getQueryString("path");
        String path;
        if (valuepath != null) {
            path = valuepath;
        } else {
            throw new IllegalArgumentException("'path' parameter is required");
        }
        String valuepLimit = request.getQueryString("p.limit");
        BigDecimal pLimit;
        if (valuepLimit != null) {
            pLimit = new BigDecimal(valuepLimit);
        } else {
            throw new IllegalArgumentException("'p.limit' parameter is required");
        }
        String value_1property = request.getQueryString("1_property");
        String _1property;
        if (value_1property != null) {
            _1property = value_1property;
        } else {
            throw new IllegalArgumentException("'1_property' parameter is required");
        }
        String value_1propertyValue = request.getQueryString("1_property.value");
        String _1propertyValue;
        if (value_1propertyValue != null) {
            _1propertyValue = value_1propertyValue;
        } else {
            throw new IllegalArgumentException("'1_property.value' parameter is required");
        }
        return imp.getQueryHttp(request, path, pLimit, _1property, _1propertyValue);
    }

    @ApiAction
    public Result getTruststore(Http.Request request) throws Exception {
        return imp.getTruststoreHttp(request);
    }

    @ApiAction
    public Result getTruststoreInfo(Http.Request request) throws Exception {
        return imp.getTruststoreInfoHttp(request);
    }

    @ApiAction
    public Result postAgent(Http.Request request, String runmode,String name) throws Exception {
        String valuejcrColonContentCqColonDistribute = request.getQueryString("jcr:content/cq:distribute");
        Boolean jcrColonContentCqColonDistribute;
        if (valuejcrColonContentCqColonDistribute != null) {
            jcrColonContentCqColonDistribute = Boolean.valueOf(valuejcrColonContentCqColonDistribute);
        } else {
            jcrColonContentCqColonDistribute = null;
        }
        String valuejcrColonContentCqColonDistributeAtTypeHint = request.getQueryString("jcr:content/cq:distribute@TypeHint");
        String jcrColonContentCqColonDistributeAtTypeHint;
        if (valuejcrColonContentCqColonDistributeAtTypeHint != null) {
            jcrColonContentCqColonDistributeAtTypeHint = valuejcrColonContentCqColonDistributeAtTypeHint;
        } else {
            jcrColonContentCqColonDistributeAtTypeHint = null;
        }
        String valuejcrColonContentCqColonName = request.getQueryString("jcr:content/cq:name");
        String jcrColonContentCqColonName;
        if (valuejcrColonContentCqColonName != null) {
            jcrColonContentCqColonName = valuejcrColonContentCqColonName;
        } else {
            jcrColonContentCqColonName = null;
        }
        String valuejcrColonContentCqColonTemplate = request.getQueryString("jcr:content/cq:template");
        String jcrColonContentCqColonTemplate;
        if (valuejcrColonContentCqColonTemplate != null) {
            jcrColonContentCqColonTemplate = valuejcrColonContentCqColonTemplate;
        } else {
            jcrColonContentCqColonTemplate = null;
        }
        String valuejcrColonContentEnabled = request.getQueryString("jcr:content/enabled");
        Boolean jcrColonContentEnabled;
        if (valuejcrColonContentEnabled != null) {
            jcrColonContentEnabled = Boolean.valueOf(valuejcrColonContentEnabled);
        } else {
            jcrColonContentEnabled = null;
        }
        String valuejcrColonContentJcrColonDescription = request.getQueryString("jcr:content/jcr:description");
        String jcrColonContentJcrColonDescription;
        if (valuejcrColonContentJcrColonDescription != null) {
            jcrColonContentJcrColonDescription = valuejcrColonContentJcrColonDescription;
        } else {
            jcrColonContentJcrColonDescription = null;
        }
        String valuejcrColonContentJcrColonLastModified = request.getQueryString("jcr:content/jcr:lastModified");
        String jcrColonContentJcrColonLastModified;
        if (valuejcrColonContentJcrColonLastModified != null) {
            jcrColonContentJcrColonLastModified = valuejcrColonContentJcrColonLastModified;
        } else {
            jcrColonContentJcrColonLastModified = null;
        }
        String valuejcrColonContentJcrColonLastModifiedBy = request.getQueryString("jcr:content/jcr:lastModifiedBy");
        String jcrColonContentJcrColonLastModifiedBy;
        if (valuejcrColonContentJcrColonLastModifiedBy != null) {
            jcrColonContentJcrColonLastModifiedBy = valuejcrColonContentJcrColonLastModifiedBy;
        } else {
            jcrColonContentJcrColonLastModifiedBy = null;
        }
        String valuejcrColonContentJcrColonMixinTypes = request.getQueryString("jcr:content/jcr:mixinTypes");
        String jcrColonContentJcrColonMixinTypes;
        if (valuejcrColonContentJcrColonMixinTypes != null) {
            jcrColonContentJcrColonMixinTypes = valuejcrColonContentJcrColonMixinTypes;
        } else {
            jcrColonContentJcrColonMixinTypes = null;
        }
        String valuejcrColonContentJcrColonTitle = request.getQueryString("jcr:content/jcr:title");
        String jcrColonContentJcrColonTitle;
        if (valuejcrColonContentJcrColonTitle != null) {
            jcrColonContentJcrColonTitle = valuejcrColonContentJcrColonTitle;
        } else {
            jcrColonContentJcrColonTitle = null;
        }
        String valuejcrColonContentLogLevel = request.getQueryString("jcr:content/logLevel");
        String jcrColonContentLogLevel;
        if (valuejcrColonContentLogLevel != null) {
            jcrColonContentLogLevel = valuejcrColonContentLogLevel;
        } else {
            jcrColonContentLogLevel = null;
        }
        String valuejcrColonContentNoStatusUpdate = request.getQueryString("jcr:content/noStatusUpdate");
        Boolean jcrColonContentNoStatusUpdate;
        if (valuejcrColonContentNoStatusUpdate != null) {
            jcrColonContentNoStatusUpdate = Boolean.valueOf(valuejcrColonContentNoStatusUpdate);
        } else {
            jcrColonContentNoStatusUpdate = null;
        }
        String valuejcrColonContentNoVersioning = request.getQueryString("jcr:content/noVersioning");
        Boolean jcrColonContentNoVersioning;
        if (valuejcrColonContentNoVersioning != null) {
            jcrColonContentNoVersioning = Boolean.valueOf(valuejcrColonContentNoVersioning);
        } else {
            jcrColonContentNoVersioning = null;
        }
        String valuejcrColonContentProtocolConnectTimeout = request.getQueryString("jcr:content/protocolConnectTimeout");
        BigDecimal jcrColonContentProtocolConnectTimeout;
        if (valuejcrColonContentProtocolConnectTimeout != null) {
            jcrColonContentProtocolConnectTimeout = new BigDecimal(valuejcrColonContentProtocolConnectTimeout);
        } else {
            jcrColonContentProtocolConnectTimeout = null;
        }
        String valuejcrColonContentProtocolHTTPConnectionClosed = request.getQueryString("jcr:content/protocolHTTPConnectionClosed");
        Boolean jcrColonContentProtocolHTTPConnectionClosed;
        if (valuejcrColonContentProtocolHTTPConnectionClosed != null) {
            jcrColonContentProtocolHTTPConnectionClosed = Boolean.valueOf(valuejcrColonContentProtocolHTTPConnectionClosed);
        } else {
            jcrColonContentProtocolHTTPConnectionClosed = null;
        }
        String valuejcrColonContentProtocolHTTPExpired = request.getQueryString("jcr:content/protocolHTTPExpired");
        String jcrColonContentProtocolHTTPExpired;
        if (valuejcrColonContentProtocolHTTPExpired != null) {
            jcrColonContentProtocolHTTPExpired = valuejcrColonContentProtocolHTTPExpired;
        } else {
            jcrColonContentProtocolHTTPExpired = null;
        }
        String[] jcrColonContentProtocolHTTPHeadersArray = request.queryString().get("jcr:content/protocolHTTPHeaders");
        List<String> jcrColonContentProtocolHTTPHeadersList = OpenAPIUtils.parametersToList("multi", jcrColonContentProtocolHTTPHeadersArray);
        List<String> jcrColonContentProtocolHTTPHeaders = new ArrayList<>();
        for (String curParam : jcrColonContentProtocolHTTPHeadersList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                jcrColonContentProtocolHTTPHeaders.add(curParam);
            }
        }
        String valuejcrColonContentProtocolHTTPHeadersAtTypeHint = request.getQueryString("jcr:content/protocolHTTPHeaders@TypeHint");
        String jcrColonContentProtocolHTTPHeadersAtTypeHint;
        if (valuejcrColonContentProtocolHTTPHeadersAtTypeHint != null) {
            jcrColonContentProtocolHTTPHeadersAtTypeHint = valuejcrColonContentProtocolHTTPHeadersAtTypeHint;
        } else {
            jcrColonContentProtocolHTTPHeadersAtTypeHint = null;
        }
        String valuejcrColonContentProtocolHTTPMethod = request.getQueryString("jcr:content/protocolHTTPMethod");
        String jcrColonContentProtocolHTTPMethod;
        if (valuejcrColonContentProtocolHTTPMethod != null) {
            jcrColonContentProtocolHTTPMethod = valuejcrColonContentProtocolHTTPMethod;
        } else {
            jcrColonContentProtocolHTTPMethod = null;
        }
        String valuejcrColonContentProtocolHTTPSRelaxed = request.getQueryString("jcr:content/protocolHTTPSRelaxed");
        Boolean jcrColonContentProtocolHTTPSRelaxed;
        if (valuejcrColonContentProtocolHTTPSRelaxed != null) {
            jcrColonContentProtocolHTTPSRelaxed = Boolean.valueOf(valuejcrColonContentProtocolHTTPSRelaxed);
        } else {
            jcrColonContentProtocolHTTPSRelaxed = null;
        }
        String valuejcrColonContentProtocolInterface = request.getQueryString("jcr:content/protocolInterface");
        String jcrColonContentProtocolInterface;
        if (valuejcrColonContentProtocolInterface != null) {
            jcrColonContentProtocolInterface = valuejcrColonContentProtocolInterface;
        } else {
            jcrColonContentProtocolInterface = null;
        }
        String valuejcrColonContentProtocolSocketTimeout = request.getQueryString("jcr:content/protocolSocketTimeout");
        BigDecimal jcrColonContentProtocolSocketTimeout;
        if (valuejcrColonContentProtocolSocketTimeout != null) {
            jcrColonContentProtocolSocketTimeout = new BigDecimal(valuejcrColonContentProtocolSocketTimeout);
        } else {
            jcrColonContentProtocolSocketTimeout = null;
        }
        String valuejcrColonContentProtocolVersion = request.getQueryString("jcr:content/protocolVersion");
        String jcrColonContentProtocolVersion;
        if (valuejcrColonContentProtocolVersion != null) {
            jcrColonContentProtocolVersion = valuejcrColonContentProtocolVersion;
        } else {
            jcrColonContentProtocolVersion = null;
        }
        String valuejcrColonContentProxyNTLMDomain = request.getQueryString("jcr:content/proxyNTLMDomain");
        String jcrColonContentProxyNTLMDomain;
        if (valuejcrColonContentProxyNTLMDomain != null) {
            jcrColonContentProxyNTLMDomain = valuejcrColonContentProxyNTLMDomain;
        } else {
            jcrColonContentProxyNTLMDomain = null;
        }
        String valuejcrColonContentProxyNTLMHost = request.getQueryString("jcr:content/proxyNTLMHost");
        String jcrColonContentProxyNTLMHost;
        if (valuejcrColonContentProxyNTLMHost != null) {
            jcrColonContentProxyNTLMHost = valuejcrColonContentProxyNTLMHost;
        } else {
            jcrColonContentProxyNTLMHost = null;
        }
        String valuejcrColonContentProxyHost = request.getQueryString("jcr:content/proxyHost");
        String jcrColonContentProxyHost;
        if (valuejcrColonContentProxyHost != null) {
            jcrColonContentProxyHost = valuejcrColonContentProxyHost;
        } else {
            jcrColonContentProxyHost = null;
        }
        String valuejcrColonContentProxyPassword = request.getQueryString("jcr:content/proxyPassword");
        String jcrColonContentProxyPassword;
        if (valuejcrColonContentProxyPassword != null) {
            jcrColonContentProxyPassword = valuejcrColonContentProxyPassword;
        } else {
            jcrColonContentProxyPassword = null;
        }
        String valuejcrColonContentProxyPort = request.getQueryString("jcr:content/proxyPort");
        BigDecimal jcrColonContentProxyPort;
        if (valuejcrColonContentProxyPort != null) {
            jcrColonContentProxyPort = new BigDecimal(valuejcrColonContentProxyPort);
        } else {
            jcrColonContentProxyPort = null;
        }
        String valuejcrColonContentProxyUser = request.getQueryString("jcr:content/proxyUser");
        String jcrColonContentProxyUser;
        if (valuejcrColonContentProxyUser != null) {
            jcrColonContentProxyUser = valuejcrColonContentProxyUser;
        } else {
            jcrColonContentProxyUser = null;
        }
        String valuejcrColonContentQueueBatchMaxSize = request.getQueryString("jcr:content/queueBatchMaxSize");
        BigDecimal jcrColonContentQueueBatchMaxSize;
        if (valuejcrColonContentQueueBatchMaxSize != null) {
            jcrColonContentQueueBatchMaxSize = new BigDecimal(valuejcrColonContentQueueBatchMaxSize);
        } else {
            jcrColonContentQueueBatchMaxSize = null;
        }
        String valuejcrColonContentQueueBatchMode = request.getQueryString("jcr:content/queueBatchMode");
        String jcrColonContentQueueBatchMode;
        if (valuejcrColonContentQueueBatchMode != null) {
            jcrColonContentQueueBatchMode = valuejcrColonContentQueueBatchMode;
        } else {
            jcrColonContentQueueBatchMode = null;
        }
        String valuejcrColonContentQueueBatchWaitTime = request.getQueryString("jcr:content/queueBatchWaitTime");
        BigDecimal jcrColonContentQueueBatchWaitTime;
        if (valuejcrColonContentQueueBatchWaitTime != null) {
            jcrColonContentQueueBatchWaitTime = new BigDecimal(valuejcrColonContentQueueBatchWaitTime);
        } else {
            jcrColonContentQueueBatchWaitTime = null;
        }
        String valuejcrColonContentRetryDelay = request.getQueryString("jcr:content/retryDelay");
        String jcrColonContentRetryDelay;
        if (valuejcrColonContentRetryDelay != null) {
            jcrColonContentRetryDelay = valuejcrColonContentRetryDelay;
        } else {
            jcrColonContentRetryDelay = null;
        }
        String valuejcrColonContentReverseReplication = request.getQueryString("jcr:content/reverseReplication");
        Boolean jcrColonContentReverseReplication;
        if (valuejcrColonContentReverseReplication != null) {
            jcrColonContentReverseReplication = Boolean.valueOf(valuejcrColonContentReverseReplication);
        } else {
            jcrColonContentReverseReplication = null;
        }
        String valuejcrColonContentSerializationType = request.getQueryString("jcr:content/serializationType");
        String jcrColonContentSerializationType;
        if (valuejcrColonContentSerializationType != null) {
            jcrColonContentSerializationType = valuejcrColonContentSerializationType;
        } else {
            jcrColonContentSerializationType = null;
        }
        String valuejcrColonContentSlingColonResourceType = request.getQueryString("jcr:content/sling:resourceType");
        String jcrColonContentSlingColonResourceType;
        if (valuejcrColonContentSlingColonResourceType != null) {
            jcrColonContentSlingColonResourceType = valuejcrColonContentSlingColonResourceType;
        } else {
            jcrColonContentSlingColonResourceType = null;
        }
        String valuejcrColonContentSsl = request.getQueryString("jcr:content/ssl");
        String jcrColonContentSsl;
        if (valuejcrColonContentSsl != null) {
            jcrColonContentSsl = valuejcrColonContentSsl;
        } else {
            jcrColonContentSsl = null;
        }
        String valuejcrColonContentTransportNTLMDomain = request.getQueryString("jcr:content/transportNTLMDomain");
        String jcrColonContentTransportNTLMDomain;
        if (valuejcrColonContentTransportNTLMDomain != null) {
            jcrColonContentTransportNTLMDomain = valuejcrColonContentTransportNTLMDomain;
        } else {
            jcrColonContentTransportNTLMDomain = null;
        }
        String valuejcrColonContentTransportNTLMHost = request.getQueryString("jcr:content/transportNTLMHost");
        String jcrColonContentTransportNTLMHost;
        if (valuejcrColonContentTransportNTLMHost != null) {
            jcrColonContentTransportNTLMHost = valuejcrColonContentTransportNTLMHost;
        } else {
            jcrColonContentTransportNTLMHost = null;
        }
        String valuejcrColonContentTransportPassword = request.getQueryString("jcr:content/transportPassword");
        String jcrColonContentTransportPassword;
        if (valuejcrColonContentTransportPassword != null) {
            jcrColonContentTransportPassword = valuejcrColonContentTransportPassword;
        } else {
            jcrColonContentTransportPassword = null;
        }
        String valuejcrColonContentTransportUri = request.getQueryString("jcr:content/transportUri");
        String jcrColonContentTransportUri;
        if (valuejcrColonContentTransportUri != null) {
            jcrColonContentTransportUri = valuejcrColonContentTransportUri;
        } else {
            jcrColonContentTransportUri = null;
        }
        String valuejcrColonContentTransportUser = request.getQueryString("jcr:content/transportUser");
        String jcrColonContentTransportUser;
        if (valuejcrColonContentTransportUser != null) {
            jcrColonContentTransportUser = valuejcrColonContentTransportUser;
        } else {
            jcrColonContentTransportUser = null;
        }
        String valuejcrColonContentTriggerDistribute = request.getQueryString("jcr:content/triggerDistribute");
        Boolean jcrColonContentTriggerDistribute;
        if (valuejcrColonContentTriggerDistribute != null) {
            jcrColonContentTriggerDistribute = Boolean.valueOf(valuejcrColonContentTriggerDistribute);
        } else {
            jcrColonContentTriggerDistribute = null;
        }
        String valuejcrColonContentTriggerModified = request.getQueryString("jcr:content/triggerModified");
        Boolean jcrColonContentTriggerModified;
        if (valuejcrColonContentTriggerModified != null) {
            jcrColonContentTriggerModified = Boolean.valueOf(valuejcrColonContentTriggerModified);
        } else {
            jcrColonContentTriggerModified = null;
        }
        String valuejcrColonContentTriggerOnOffTime = request.getQueryString("jcr:content/triggerOnOffTime");
        Boolean jcrColonContentTriggerOnOffTime;
        if (valuejcrColonContentTriggerOnOffTime != null) {
            jcrColonContentTriggerOnOffTime = Boolean.valueOf(valuejcrColonContentTriggerOnOffTime);
        } else {
            jcrColonContentTriggerOnOffTime = null;
        }
        String valuejcrColonContentTriggerReceive = request.getQueryString("jcr:content/triggerReceive");
        Boolean jcrColonContentTriggerReceive;
        if (valuejcrColonContentTriggerReceive != null) {
            jcrColonContentTriggerReceive = Boolean.valueOf(valuejcrColonContentTriggerReceive);
        } else {
            jcrColonContentTriggerReceive = null;
        }
        String valuejcrColonContentTriggerSpecific = request.getQueryString("jcr:content/triggerSpecific");
        Boolean jcrColonContentTriggerSpecific;
        if (valuejcrColonContentTriggerSpecific != null) {
            jcrColonContentTriggerSpecific = Boolean.valueOf(valuejcrColonContentTriggerSpecific);
        } else {
            jcrColonContentTriggerSpecific = null;
        }
        String valuejcrColonContentUserId = request.getQueryString("jcr:content/userId");
        String jcrColonContentUserId;
        if (valuejcrColonContentUserId != null) {
            jcrColonContentUserId = valuejcrColonContentUserId;
        } else {
            jcrColonContentUserId = null;
        }
        String valuejcrColonPrimaryType = request.getQueryString("jcr:primaryType");
        String jcrColonPrimaryType;
        if (valuejcrColonPrimaryType != null) {
            jcrColonPrimaryType = valuejcrColonPrimaryType;
        } else {
            jcrColonPrimaryType = null;
        }
        String valuecolonOperation = request.getQueryString(":operation");
        String colonOperation;
        if (valuecolonOperation != null) {
            colonOperation = valuecolonOperation;
        } else {
            colonOperation = null;
        }
        return imp.postAgentHttp(request, runmode, name, jcrColonContentCqColonDistribute, jcrColonContentCqColonDistributeAtTypeHint, jcrColonContentCqColonName, jcrColonContentCqColonTemplate, jcrColonContentEnabled, jcrColonContentJcrColonDescription, jcrColonContentJcrColonLastModified, jcrColonContentJcrColonLastModifiedBy, jcrColonContentJcrColonMixinTypes, jcrColonContentJcrColonTitle, jcrColonContentLogLevel, jcrColonContentNoStatusUpdate, jcrColonContentNoVersioning, jcrColonContentProtocolConnectTimeout, jcrColonContentProtocolHTTPConnectionClosed, jcrColonContentProtocolHTTPExpired, jcrColonContentProtocolHTTPHeaders, jcrColonContentProtocolHTTPHeadersAtTypeHint, jcrColonContentProtocolHTTPMethod, jcrColonContentProtocolHTTPSRelaxed, jcrColonContentProtocolInterface, jcrColonContentProtocolSocketTimeout, jcrColonContentProtocolVersion, jcrColonContentProxyNTLMDomain, jcrColonContentProxyNTLMHost, jcrColonContentProxyHost, jcrColonContentProxyPassword, jcrColonContentProxyPort, jcrColonContentProxyUser, jcrColonContentQueueBatchMaxSize, jcrColonContentQueueBatchMode, jcrColonContentQueueBatchWaitTime, jcrColonContentRetryDelay, jcrColonContentReverseReplication, jcrColonContentSerializationType, jcrColonContentSlingColonResourceType, jcrColonContentSsl, jcrColonContentTransportNTLMDomain, jcrColonContentTransportNTLMHost, jcrColonContentTransportPassword, jcrColonContentTransportUri, jcrColonContentTransportUser, jcrColonContentTriggerDistribute, jcrColonContentTriggerModified, jcrColonContentTriggerOnOffTime, jcrColonContentTriggerReceive, jcrColonContentTriggerSpecific, jcrColonContentUserId, jcrColonPrimaryType, colonOperation);
    }

    @ApiAction
    public Result postAuthorizableKeystore(Http.Request request, String intermediatePath,String authorizableId) throws Exception {
        String valuecolonOperation = request.getQueryString(":operation");
        String colonOperation;
        if (valuecolonOperation != null) {
            colonOperation = valuecolonOperation;
        } else {
            colonOperation = null;
        }
        String valuecurrentPassword = request.getQueryString("currentPassword");
        String currentPassword;
        if (valuecurrentPassword != null) {
            currentPassword = valuecurrentPassword;
        } else {
            currentPassword = null;
        }
        String valuenewPassword = request.getQueryString("newPassword");
        String newPassword;
        if (valuenewPassword != null) {
            newPassword = valuenewPassword;
        } else {
            newPassword = null;
        }
        String valuerePassword = request.getQueryString("rePassword");
        String rePassword;
        if (valuerePassword != null) {
            rePassword = valuerePassword;
        } else {
            rePassword = null;
        }
        String valuekeyPassword = request.getQueryString("keyPassword");
        String keyPassword;
        if (valuekeyPassword != null) {
            keyPassword = valuekeyPassword;
        } else {
            keyPassword = null;
        }
        String valuekeyStorePass = request.getQueryString("keyStorePass");
        String keyStorePass;
        if (valuekeyStorePass != null) {
            keyStorePass = valuekeyStorePass;
        } else {
            keyStorePass = null;
        }
        String valuealias = request.getQueryString("alias");
        String alias;
        if (valuealias != null) {
            alias = valuealias;
        } else {
            alias = null;
        }
        String valuenewAlias = request.getQueryString("newAlias");
        String newAlias;
        if (valuenewAlias != null) {
            newAlias = valuenewAlias;
        } else {
            newAlias = null;
        }
        String valueremoveAlias = request.getQueryString("removeAlias");
        String removeAlias;
        if (valueremoveAlias != null) {
            removeAlias = valueremoveAlias;
        } else {
            removeAlias = null;
        }
        Http.MultipartFormData<TemporaryFile> bodycertChain = request.body().asMultipartFormData();
        Http.MultipartFormData.FilePart<TemporaryFile> certChain = bodycertChain.getFile("cert-chain");
        Http.MultipartFormData<TemporaryFile> bodypk = request.body().asMultipartFormData();
        Http.MultipartFormData.FilePart<TemporaryFile> pk = bodypk.getFile("pk");
        Http.MultipartFormData<TemporaryFile> bodykeyStore = request.body().asMultipartFormData();
        Http.MultipartFormData.FilePart<TemporaryFile> keyStore = bodykeyStore.getFile("keyStore");
        return imp.postAuthorizableKeystoreHttp(request, intermediatePath, authorizableId, colonOperation, currentPassword, newPassword, rePassword, keyPassword, keyStorePass, alias, newAlias, removeAlias, certChain, pk, keyStore);
    }

    @ApiAction
    public Result postAuthorizables(Http.Request request) throws Exception {
        String valueauthorizableId = request.getQueryString("authorizableId");
        String authorizableId;
        if (valueauthorizableId != null) {
            authorizableId = valueauthorizableId;
        } else {
            throw new IllegalArgumentException("'authorizableId' parameter is required");
        }
        String valueintermediatePath = request.getQueryString("intermediatePath");
        String intermediatePath;
        if (valueintermediatePath != null) {
            intermediatePath = valueintermediatePath;
        } else {
            throw new IllegalArgumentException("'intermediatePath' parameter is required");
        }
        String valuecreateUser = request.getQueryString("createUser");
        String createUser;
        if (valuecreateUser != null) {
            createUser = valuecreateUser;
        } else {
            createUser = null;
        }
        String valuecreateGroup = request.getQueryString("createGroup");
        String createGroup;
        if (valuecreateGroup != null) {
            createGroup = valuecreateGroup;
        } else {
            createGroup = null;
        }
        String valuerepColonPassword = request.getQueryString("rep:password");
        String repColonPassword;
        if (valuerepColonPassword != null) {
            repColonPassword = valuerepColonPassword;
        } else {
            repColonPassword = null;
        }
        String valueprofileGivenName = request.getQueryString("profile/givenName");
        String profileGivenName;
        if (valueprofileGivenName != null) {
            profileGivenName = valueprofileGivenName;
        } else {
            profileGivenName = null;
        }
        return imp.postAuthorizablesHttp(request, authorizableId, intermediatePath, createUser, createGroup, repColonPassword, profileGivenName);
    }

    @ApiAction
    public Result postConfigAdobeGraniteSamlAuthenticationHandler(Http.Request request) throws Exception {
        String valuekeyStorePassword = request.getQueryString("keyStorePassword");
        String keyStorePassword;
        if (valuekeyStorePassword != null) {
            keyStorePassword = valuekeyStorePassword;
        } else {
            keyStorePassword = null;
        }
        String valuekeyStorePasswordAtTypeHint = request.getQueryString("keyStorePassword@TypeHint");
        String keyStorePasswordAtTypeHint;
        if (valuekeyStorePasswordAtTypeHint != null) {
            keyStorePasswordAtTypeHint = valuekeyStorePasswordAtTypeHint;
        } else {
            keyStorePasswordAtTypeHint = null;
        }
        String valueserviceRanking = request.getQueryString("service.ranking");
        Integer serviceRanking;
        if (valueserviceRanking != null) {
            serviceRanking = Integer.parseInt(valueserviceRanking);
        } else {
            serviceRanking = null;
        }
        String valueserviceRankingAtTypeHint = request.getQueryString("service.ranking@TypeHint");
        String serviceRankingAtTypeHint;
        if (valueserviceRankingAtTypeHint != null) {
            serviceRankingAtTypeHint = valueserviceRankingAtTypeHint;
        } else {
            serviceRankingAtTypeHint = null;
        }
        String valueidpHttpRedirect = request.getQueryString("idpHttpRedirect");
        Boolean idpHttpRedirect;
        if (valueidpHttpRedirect != null) {
            idpHttpRedirect = Boolean.valueOf(valueidpHttpRedirect);
        } else {
            idpHttpRedirect = null;
        }
        String valueidpHttpRedirectAtTypeHint = request.getQueryString("idpHttpRedirect@TypeHint");
        String idpHttpRedirectAtTypeHint;
        if (valueidpHttpRedirectAtTypeHint != null) {
            idpHttpRedirectAtTypeHint = valueidpHttpRedirectAtTypeHint;
        } else {
            idpHttpRedirectAtTypeHint = null;
        }
        String valuecreateUser = request.getQueryString("createUser");
        Boolean createUser;
        if (valuecreateUser != null) {
            createUser = Boolean.valueOf(valuecreateUser);
        } else {
            createUser = null;
        }
        String valuecreateUserAtTypeHint = request.getQueryString("createUser@TypeHint");
        String createUserAtTypeHint;
        if (valuecreateUserAtTypeHint != null) {
            createUserAtTypeHint = valuecreateUserAtTypeHint;
        } else {
            createUserAtTypeHint = null;
        }
        String valuedefaultRedirectUrl = request.getQueryString("defaultRedirectUrl");
        String defaultRedirectUrl;
        if (valuedefaultRedirectUrl != null) {
            defaultRedirectUrl = valuedefaultRedirectUrl;
        } else {
            defaultRedirectUrl = null;
        }
        String valuedefaultRedirectUrlAtTypeHint = request.getQueryString("defaultRedirectUrl@TypeHint");
        String defaultRedirectUrlAtTypeHint;
        if (valuedefaultRedirectUrlAtTypeHint != null) {
            defaultRedirectUrlAtTypeHint = valuedefaultRedirectUrlAtTypeHint;
        } else {
            defaultRedirectUrlAtTypeHint = null;
        }
        String valueuserIDAttribute = request.getQueryString("userIDAttribute");
        String userIDAttribute;
        if (valueuserIDAttribute != null) {
            userIDAttribute = valueuserIDAttribute;
        } else {
            userIDAttribute = null;
        }
        String valueuserIDAttributeAtTypeHint = request.getQueryString("userIDAttribute@TypeHint");
        String userIDAttributeAtTypeHint;
        if (valueuserIDAttributeAtTypeHint != null) {
            userIDAttributeAtTypeHint = valueuserIDAttributeAtTypeHint;
        } else {
            userIDAttributeAtTypeHint = null;
        }
        String[] defaultGroupsArray = request.queryString().get("defaultGroups");
        List<String> defaultGroupsList = OpenAPIUtils.parametersToList("multi", defaultGroupsArray);
        List<String> defaultGroups = new ArrayList<>();
        for (String curParam : defaultGroupsList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                defaultGroups.add(curParam);
            }
        }
        String valuedefaultGroupsAtTypeHint = request.getQueryString("defaultGroups@TypeHint");
        String defaultGroupsAtTypeHint;
        if (valuedefaultGroupsAtTypeHint != null) {
            defaultGroupsAtTypeHint = valuedefaultGroupsAtTypeHint;
        } else {
            defaultGroupsAtTypeHint = null;
        }
        String valueidpCertAlias = request.getQueryString("idpCertAlias");
        String idpCertAlias;
        if (valueidpCertAlias != null) {
            idpCertAlias = valueidpCertAlias;
        } else {
            idpCertAlias = null;
        }
        String valueidpCertAliasAtTypeHint = request.getQueryString("idpCertAlias@TypeHint");
        String idpCertAliasAtTypeHint;
        if (valueidpCertAliasAtTypeHint != null) {
            idpCertAliasAtTypeHint = valueidpCertAliasAtTypeHint;
        } else {
            idpCertAliasAtTypeHint = null;
        }
        String valueaddGroupMemberships = request.getQueryString("addGroupMemberships");
        Boolean addGroupMemberships;
        if (valueaddGroupMemberships != null) {
            addGroupMemberships = Boolean.valueOf(valueaddGroupMemberships);
        } else {
            addGroupMemberships = null;
        }
        String valueaddGroupMembershipsAtTypeHint = request.getQueryString("addGroupMemberships@TypeHint");
        String addGroupMembershipsAtTypeHint;
        if (valueaddGroupMembershipsAtTypeHint != null) {
            addGroupMembershipsAtTypeHint = valueaddGroupMembershipsAtTypeHint;
        } else {
            addGroupMembershipsAtTypeHint = null;
        }
        String[] pathArray = request.queryString().get("path");
        List<String> pathList = OpenAPIUtils.parametersToList("multi", pathArray);
        List<String> path = new ArrayList<>();
        for (String curParam : pathList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                path.add(curParam);
            }
        }
        String valuepathAtTypeHint = request.getQueryString("path@TypeHint");
        String pathAtTypeHint;
        if (valuepathAtTypeHint != null) {
            pathAtTypeHint = valuepathAtTypeHint;
        } else {
            pathAtTypeHint = null;
        }
        String[] synchronizeAttributesArray = request.queryString().get("synchronizeAttributes");
        List<String> synchronizeAttributesList = OpenAPIUtils.parametersToList("multi", synchronizeAttributesArray);
        List<String> synchronizeAttributes = new ArrayList<>();
        for (String curParam : synchronizeAttributesList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                synchronizeAttributes.add(curParam);
            }
        }
        String valuesynchronizeAttributesAtTypeHint = request.getQueryString("synchronizeAttributes@TypeHint");
        String synchronizeAttributesAtTypeHint;
        if (valuesynchronizeAttributesAtTypeHint != null) {
            synchronizeAttributesAtTypeHint = valuesynchronizeAttributesAtTypeHint;
        } else {
            synchronizeAttributesAtTypeHint = null;
        }
        String valueclockTolerance = request.getQueryString("clockTolerance");
        Integer clockTolerance;
        if (valueclockTolerance != null) {
            clockTolerance = Integer.parseInt(valueclockTolerance);
        } else {
            clockTolerance = null;
        }
        String valueclockToleranceAtTypeHint = request.getQueryString("clockTolerance@TypeHint");
        String clockToleranceAtTypeHint;
        if (valueclockToleranceAtTypeHint != null) {
            clockToleranceAtTypeHint = valueclockToleranceAtTypeHint;
        } else {
            clockToleranceAtTypeHint = null;
        }
        String valuegroupMembershipAttribute = request.getQueryString("groupMembershipAttribute");
        String groupMembershipAttribute;
        if (valuegroupMembershipAttribute != null) {
            groupMembershipAttribute = valuegroupMembershipAttribute;
        } else {
            groupMembershipAttribute = null;
        }
        String valuegroupMembershipAttributeAtTypeHint = request.getQueryString("groupMembershipAttribute@TypeHint");
        String groupMembershipAttributeAtTypeHint;
        if (valuegroupMembershipAttributeAtTypeHint != null) {
            groupMembershipAttributeAtTypeHint = valuegroupMembershipAttributeAtTypeHint;
        } else {
            groupMembershipAttributeAtTypeHint = null;
        }
        String valueidpUrl = request.getQueryString("idpUrl");
        String idpUrl;
        if (valueidpUrl != null) {
            idpUrl = valueidpUrl;
        } else {
            idpUrl = null;
        }
        String valueidpUrlAtTypeHint = request.getQueryString("idpUrl@TypeHint");
        String idpUrlAtTypeHint;
        if (valueidpUrlAtTypeHint != null) {
            idpUrlAtTypeHint = valueidpUrlAtTypeHint;
        } else {
            idpUrlAtTypeHint = null;
        }
        String valuelogoutUrl = request.getQueryString("logoutUrl");
        String logoutUrl;
        if (valuelogoutUrl != null) {
            logoutUrl = valuelogoutUrl;
        } else {
            logoutUrl = null;
        }
        String valuelogoutUrlAtTypeHint = request.getQueryString("logoutUrl@TypeHint");
        String logoutUrlAtTypeHint;
        if (valuelogoutUrlAtTypeHint != null) {
            logoutUrlAtTypeHint = valuelogoutUrlAtTypeHint;
        } else {
            logoutUrlAtTypeHint = null;
        }
        String valueserviceProviderEntityId = request.getQueryString("serviceProviderEntityId");
        String serviceProviderEntityId;
        if (valueserviceProviderEntityId != null) {
            serviceProviderEntityId = valueserviceProviderEntityId;
        } else {
            serviceProviderEntityId = null;
        }
        String valueserviceProviderEntityIdAtTypeHint = request.getQueryString("serviceProviderEntityId@TypeHint");
        String serviceProviderEntityIdAtTypeHint;
        if (valueserviceProviderEntityIdAtTypeHint != null) {
            serviceProviderEntityIdAtTypeHint = valueserviceProviderEntityIdAtTypeHint;
        } else {
            serviceProviderEntityIdAtTypeHint = null;
        }
        String valueassertionConsumerServiceURL = request.getQueryString("assertionConsumerServiceURL");
        String assertionConsumerServiceURL;
        if (valueassertionConsumerServiceURL != null) {
            assertionConsumerServiceURL = valueassertionConsumerServiceURL;
        } else {
            assertionConsumerServiceURL = null;
        }
        String valueassertionConsumerServiceURLAtTypeHint = request.getQueryString("assertionConsumerServiceURL@TypeHint");
        String assertionConsumerServiceURLAtTypeHint;
        if (valueassertionConsumerServiceURLAtTypeHint != null) {
            assertionConsumerServiceURLAtTypeHint = valueassertionConsumerServiceURLAtTypeHint;
        } else {
            assertionConsumerServiceURLAtTypeHint = null;
        }
        String valuehandleLogout = request.getQueryString("handleLogout");
        Boolean handleLogout;
        if (valuehandleLogout != null) {
            handleLogout = Boolean.valueOf(valuehandleLogout);
        } else {
            handleLogout = null;
        }
        String valuehandleLogoutAtTypeHint = request.getQueryString("handleLogout@TypeHint");
        String handleLogoutAtTypeHint;
        if (valuehandleLogoutAtTypeHint != null) {
            handleLogoutAtTypeHint = valuehandleLogoutAtTypeHint;
        } else {
            handleLogoutAtTypeHint = null;
        }
        String valuespPrivateKeyAlias = request.getQueryString("spPrivateKeyAlias");
        String spPrivateKeyAlias;
        if (valuespPrivateKeyAlias != null) {
            spPrivateKeyAlias = valuespPrivateKeyAlias;
        } else {
            spPrivateKeyAlias = null;
        }
        String valuespPrivateKeyAliasAtTypeHint = request.getQueryString("spPrivateKeyAlias@TypeHint");
        String spPrivateKeyAliasAtTypeHint;
        if (valuespPrivateKeyAliasAtTypeHint != null) {
            spPrivateKeyAliasAtTypeHint = valuespPrivateKeyAliasAtTypeHint;
        } else {
            spPrivateKeyAliasAtTypeHint = null;
        }
        String valueuseEncryption = request.getQueryString("useEncryption");
        Boolean useEncryption;
        if (valueuseEncryption != null) {
            useEncryption = Boolean.valueOf(valueuseEncryption);
        } else {
            useEncryption = null;
        }
        String valueuseEncryptionAtTypeHint = request.getQueryString("useEncryption@TypeHint");
        String useEncryptionAtTypeHint;
        if (valueuseEncryptionAtTypeHint != null) {
            useEncryptionAtTypeHint = valueuseEncryptionAtTypeHint;
        } else {
            useEncryptionAtTypeHint = null;
        }
        String valuenameIdFormat = request.getQueryString("nameIdFormat");
        String nameIdFormat;
        if (valuenameIdFormat != null) {
            nameIdFormat = valuenameIdFormat;
        } else {
            nameIdFormat = null;
        }
        String valuenameIdFormatAtTypeHint = request.getQueryString("nameIdFormat@TypeHint");
        String nameIdFormatAtTypeHint;
        if (valuenameIdFormatAtTypeHint != null) {
            nameIdFormatAtTypeHint = valuenameIdFormatAtTypeHint;
        } else {
            nameIdFormatAtTypeHint = null;
        }
        String valuedigestMethod = request.getQueryString("digestMethod");
        String digestMethod;
        if (valuedigestMethod != null) {
            digestMethod = valuedigestMethod;
        } else {
            digestMethod = null;
        }
        String valuedigestMethodAtTypeHint = request.getQueryString("digestMethod@TypeHint");
        String digestMethodAtTypeHint;
        if (valuedigestMethodAtTypeHint != null) {
            digestMethodAtTypeHint = valuedigestMethodAtTypeHint;
        } else {
            digestMethodAtTypeHint = null;
        }
        String valuesignatureMethod = request.getQueryString("signatureMethod");
        String signatureMethod;
        if (valuesignatureMethod != null) {
            signatureMethod = valuesignatureMethod;
        } else {
            signatureMethod = null;
        }
        String valuesignatureMethodAtTypeHint = request.getQueryString("signatureMethod@TypeHint");
        String signatureMethodAtTypeHint;
        if (valuesignatureMethodAtTypeHint != null) {
            signatureMethodAtTypeHint = valuesignatureMethodAtTypeHint;
        } else {
            signatureMethodAtTypeHint = null;
        }
        String valueuserIntermediatePath = request.getQueryString("userIntermediatePath");
        String userIntermediatePath;
        if (valueuserIntermediatePath != null) {
            userIntermediatePath = valueuserIntermediatePath;
        } else {
            userIntermediatePath = null;
        }
        String valueuserIntermediatePathAtTypeHint = request.getQueryString("userIntermediatePath@TypeHint");
        String userIntermediatePathAtTypeHint;
        if (valueuserIntermediatePathAtTypeHint != null) {
            userIntermediatePathAtTypeHint = valueuserIntermediatePathAtTypeHint;
        } else {
            userIntermediatePathAtTypeHint = null;
        }
        return imp.postConfigAdobeGraniteSamlAuthenticationHandlerHttp(request, keyStorePassword, keyStorePasswordAtTypeHint, serviceRanking, serviceRankingAtTypeHint, idpHttpRedirect, idpHttpRedirectAtTypeHint, createUser, createUserAtTypeHint, defaultRedirectUrl, defaultRedirectUrlAtTypeHint, userIDAttribute, userIDAttributeAtTypeHint, defaultGroups, defaultGroupsAtTypeHint, idpCertAlias, idpCertAliasAtTypeHint, addGroupMemberships, addGroupMembershipsAtTypeHint, path, pathAtTypeHint, synchronizeAttributes, synchronizeAttributesAtTypeHint, clockTolerance, clockToleranceAtTypeHint, groupMembershipAttribute, groupMembershipAttributeAtTypeHint, idpUrl, idpUrlAtTypeHint, logoutUrl, logoutUrlAtTypeHint, serviceProviderEntityId, serviceProviderEntityIdAtTypeHint, assertionConsumerServiceURL, assertionConsumerServiceURLAtTypeHint, handleLogout, handleLogoutAtTypeHint, spPrivateKeyAlias, spPrivateKeyAliasAtTypeHint, useEncryption, useEncryptionAtTypeHint, nameIdFormat, nameIdFormatAtTypeHint, digestMethod, digestMethodAtTypeHint, signatureMethod, signatureMethodAtTypeHint, userIntermediatePath, userIntermediatePathAtTypeHint);
    }

    @ApiAction
    public Result postConfigApacheFelixJettyBasedHttpService(Http.Request request) throws Exception {
        String valueorgApacheFelixHttpsNio = request.getQueryString("org.apache.felix.https.nio");
        Boolean orgApacheFelixHttpsNio;
        if (valueorgApacheFelixHttpsNio != null) {
            orgApacheFelixHttpsNio = Boolean.valueOf(valueorgApacheFelixHttpsNio);
        } else {
            orgApacheFelixHttpsNio = null;
        }
        String valueorgApacheFelixHttpsNioAtTypeHint = request.getQueryString("org.apache.felix.https.nio@TypeHint");
        String orgApacheFelixHttpsNioAtTypeHint;
        if (valueorgApacheFelixHttpsNioAtTypeHint != null) {
            orgApacheFelixHttpsNioAtTypeHint = valueorgApacheFelixHttpsNioAtTypeHint;
        } else {
            orgApacheFelixHttpsNioAtTypeHint = null;
        }
        String valueorgApacheFelixHttpsKeystore = request.getQueryString("org.apache.felix.https.keystore");
        String orgApacheFelixHttpsKeystore;
        if (valueorgApacheFelixHttpsKeystore != null) {
            orgApacheFelixHttpsKeystore = valueorgApacheFelixHttpsKeystore;
        } else {
            orgApacheFelixHttpsKeystore = null;
        }
        String valueorgApacheFelixHttpsKeystoreAtTypeHint = request.getQueryString("org.apache.felix.https.keystore@TypeHint");
        String orgApacheFelixHttpsKeystoreAtTypeHint;
        if (valueorgApacheFelixHttpsKeystoreAtTypeHint != null) {
            orgApacheFelixHttpsKeystoreAtTypeHint = valueorgApacheFelixHttpsKeystoreAtTypeHint;
        } else {
            orgApacheFelixHttpsKeystoreAtTypeHint = null;
        }
        String valueorgApacheFelixHttpsKeystorePassword = request.getQueryString("org.apache.felix.https.keystore.password");
        String orgApacheFelixHttpsKeystorePassword;
        if (valueorgApacheFelixHttpsKeystorePassword != null) {
            orgApacheFelixHttpsKeystorePassword = valueorgApacheFelixHttpsKeystorePassword;
        } else {
            orgApacheFelixHttpsKeystorePassword = null;
        }
        String valueorgApacheFelixHttpsKeystorePasswordAtTypeHint = request.getQueryString("org.apache.felix.https.keystore.password@TypeHint");
        String orgApacheFelixHttpsKeystorePasswordAtTypeHint;
        if (valueorgApacheFelixHttpsKeystorePasswordAtTypeHint != null) {
            orgApacheFelixHttpsKeystorePasswordAtTypeHint = valueorgApacheFelixHttpsKeystorePasswordAtTypeHint;
        } else {
            orgApacheFelixHttpsKeystorePasswordAtTypeHint = null;
        }
        String valueorgApacheFelixHttpsKeystoreKey = request.getQueryString("org.apache.felix.https.keystore.key");
        String orgApacheFelixHttpsKeystoreKey;
        if (valueorgApacheFelixHttpsKeystoreKey != null) {
            orgApacheFelixHttpsKeystoreKey = valueorgApacheFelixHttpsKeystoreKey;
        } else {
            orgApacheFelixHttpsKeystoreKey = null;
        }
        String valueorgApacheFelixHttpsKeystoreKeyAtTypeHint = request.getQueryString("org.apache.felix.https.keystore.key@TypeHint");
        String orgApacheFelixHttpsKeystoreKeyAtTypeHint;
        if (valueorgApacheFelixHttpsKeystoreKeyAtTypeHint != null) {
            orgApacheFelixHttpsKeystoreKeyAtTypeHint = valueorgApacheFelixHttpsKeystoreKeyAtTypeHint;
        } else {
            orgApacheFelixHttpsKeystoreKeyAtTypeHint = null;
        }
        String valueorgApacheFelixHttpsKeystoreKeyPassword = request.getQueryString("org.apache.felix.https.keystore.key.password");
        String orgApacheFelixHttpsKeystoreKeyPassword;
        if (valueorgApacheFelixHttpsKeystoreKeyPassword != null) {
            orgApacheFelixHttpsKeystoreKeyPassword = valueorgApacheFelixHttpsKeystoreKeyPassword;
        } else {
            orgApacheFelixHttpsKeystoreKeyPassword = null;
        }
        String valueorgApacheFelixHttpsKeystoreKeyPasswordAtTypeHint = request.getQueryString("org.apache.felix.https.keystore.key.password@TypeHint");
        String orgApacheFelixHttpsKeystoreKeyPasswordAtTypeHint;
        if (valueorgApacheFelixHttpsKeystoreKeyPasswordAtTypeHint != null) {
            orgApacheFelixHttpsKeystoreKeyPasswordAtTypeHint = valueorgApacheFelixHttpsKeystoreKeyPasswordAtTypeHint;
        } else {
            orgApacheFelixHttpsKeystoreKeyPasswordAtTypeHint = null;
        }
        String valueorgApacheFelixHttpsTruststore = request.getQueryString("org.apache.felix.https.truststore");
        String orgApacheFelixHttpsTruststore;
        if (valueorgApacheFelixHttpsTruststore != null) {
            orgApacheFelixHttpsTruststore = valueorgApacheFelixHttpsTruststore;
        } else {
            orgApacheFelixHttpsTruststore = null;
        }
        String valueorgApacheFelixHttpsTruststoreAtTypeHint = request.getQueryString("org.apache.felix.https.truststore@TypeHint");
        String orgApacheFelixHttpsTruststoreAtTypeHint;
        if (valueorgApacheFelixHttpsTruststoreAtTypeHint != null) {
            orgApacheFelixHttpsTruststoreAtTypeHint = valueorgApacheFelixHttpsTruststoreAtTypeHint;
        } else {
            orgApacheFelixHttpsTruststoreAtTypeHint = null;
        }
        String valueorgApacheFelixHttpsTruststorePassword = request.getQueryString("org.apache.felix.https.truststore.password");
        String orgApacheFelixHttpsTruststorePassword;
        if (valueorgApacheFelixHttpsTruststorePassword != null) {
            orgApacheFelixHttpsTruststorePassword = valueorgApacheFelixHttpsTruststorePassword;
        } else {
            orgApacheFelixHttpsTruststorePassword = null;
        }
        String valueorgApacheFelixHttpsTruststorePasswordAtTypeHint = request.getQueryString("org.apache.felix.https.truststore.password@TypeHint");
        String orgApacheFelixHttpsTruststorePasswordAtTypeHint;
        if (valueorgApacheFelixHttpsTruststorePasswordAtTypeHint != null) {
            orgApacheFelixHttpsTruststorePasswordAtTypeHint = valueorgApacheFelixHttpsTruststorePasswordAtTypeHint;
        } else {
            orgApacheFelixHttpsTruststorePasswordAtTypeHint = null;
        }
        String valueorgApacheFelixHttpsClientcertificate = request.getQueryString("org.apache.felix.https.clientcertificate");
        String orgApacheFelixHttpsClientcertificate;
        if (valueorgApacheFelixHttpsClientcertificate != null) {
            orgApacheFelixHttpsClientcertificate = valueorgApacheFelixHttpsClientcertificate;
        } else {
            orgApacheFelixHttpsClientcertificate = null;
        }
        String valueorgApacheFelixHttpsClientcertificateAtTypeHint = request.getQueryString("org.apache.felix.https.clientcertificate@TypeHint");
        String orgApacheFelixHttpsClientcertificateAtTypeHint;
        if (valueorgApacheFelixHttpsClientcertificateAtTypeHint != null) {
            orgApacheFelixHttpsClientcertificateAtTypeHint = valueorgApacheFelixHttpsClientcertificateAtTypeHint;
        } else {
            orgApacheFelixHttpsClientcertificateAtTypeHint = null;
        }
        String valueorgApacheFelixHttpsEnable = request.getQueryString("org.apache.felix.https.enable");
        Boolean orgApacheFelixHttpsEnable;
        if (valueorgApacheFelixHttpsEnable != null) {
            orgApacheFelixHttpsEnable = Boolean.valueOf(valueorgApacheFelixHttpsEnable);
        } else {
            orgApacheFelixHttpsEnable = null;
        }
        String valueorgApacheFelixHttpsEnableAtTypeHint = request.getQueryString("org.apache.felix.https.enable@TypeHint");
        String orgApacheFelixHttpsEnableAtTypeHint;
        if (valueorgApacheFelixHttpsEnableAtTypeHint != null) {
            orgApacheFelixHttpsEnableAtTypeHint = valueorgApacheFelixHttpsEnableAtTypeHint;
        } else {
            orgApacheFelixHttpsEnableAtTypeHint = null;
        }
        String valueorgOsgiServiceHttpPortSecure = request.getQueryString("org.osgi.service.http.port.secure");
        String orgOsgiServiceHttpPortSecure;
        if (valueorgOsgiServiceHttpPortSecure != null) {
            orgOsgiServiceHttpPortSecure = valueorgOsgiServiceHttpPortSecure;
        } else {
            orgOsgiServiceHttpPortSecure = null;
        }
        String valueorgOsgiServiceHttpPortSecureAtTypeHint = request.getQueryString("org.osgi.service.http.port.secure@TypeHint");
        String orgOsgiServiceHttpPortSecureAtTypeHint;
        if (valueorgOsgiServiceHttpPortSecureAtTypeHint != null) {
            orgOsgiServiceHttpPortSecureAtTypeHint = valueorgOsgiServiceHttpPortSecureAtTypeHint;
        } else {
            orgOsgiServiceHttpPortSecureAtTypeHint = null;
        }
        return imp.postConfigApacheFelixJettyBasedHttpServiceHttp(request, orgApacheFelixHttpsNio, orgApacheFelixHttpsNioAtTypeHint, orgApacheFelixHttpsKeystore, orgApacheFelixHttpsKeystoreAtTypeHint, orgApacheFelixHttpsKeystorePassword, orgApacheFelixHttpsKeystorePasswordAtTypeHint, orgApacheFelixHttpsKeystoreKey, orgApacheFelixHttpsKeystoreKeyAtTypeHint, orgApacheFelixHttpsKeystoreKeyPassword, orgApacheFelixHttpsKeystoreKeyPasswordAtTypeHint, orgApacheFelixHttpsTruststore, orgApacheFelixHttpsTruststoreAtTypeHint, orgApacheFelixHttpsTruststorePassword, orgApacheFelixHttpsTruststorePasswordAtTypeHint, orgApacheFelixHttpsClientcertificate, orgApacheFelixHttpsClientcertificateAtTypeHint, orgApacheFelixHttpsEnable, orgApacheFelixHttpsEnableAtTypeHint, orgOsgiServiceHttpPortSecure, orgOsgiServiceHttpPortSecureAtTypeHint);
    }

    @ApiAction
    public Result postConfigApacheHttpComponentsProxyConfiguration(Http.Request request) throws Exception {
        String valueproxyHost = request.getQueryString("proxy.host");
        String proxyHost;
        if (valueproxyHost != null) {
            proxyHost = valueproxyHost;
        } else {
            proxyHost = null;
        }
        String valueproxyHostAtTypeHint = request.getQueryString("proxy.host@TypeHint");
        String proxyHostAtTypeHint;
        if (valueproxyHostAtTypeHint != null) {
            proxyHostAtTypeHint = valueproxyHostAtTypeHint;
        } else {
            proxyHostAtTypeHint = null;
        }
        String valueproxyPort = request.getQueryString("proxy.port");
        Integer proxyPort;
        if (valueproxyPort != null) {
            proxyPort = Integer.parseInt(valueproxyPort);
        } else {
            proxyPort = null;
        }
        String valueproxyPortAtTypeHint = request.getQueryString("proxy.port@TypeHint");
        String proxyPortAtTypeHint;
        if (valueproxyPortAtTypeHint != null) {
            proxyPortAtTypeHint = valueproxyPortAtTypeHint;
        } else {
            proxyPortAtTypeHint = null;
        }
        String[] proxyExceptionsArray = request.queryString().get("proxy.exceptions");
        List<String> proxyExceptionsList = OpenAPIUtils.parametersToList("multi", proxyExceptionsArray);
        List<String> proxyExceptions = new ArrayList<>();
        for (String curParam : proxyExceptionsList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                proxyExceptions.add(curParam);
            }
        }
        String valueproxyExceptionsAtTypeHint = request.getQueryString("proxy.exceptions@TypeHint");
        String proxyExceptionsAtTypeHint;
        if (valueproxyExceptionsAtTypeHint != null) {
            proxyExceptionsAtTypeHint = valueproxyExceptionsAtTypeHint;
        } else {
            proxyExceptionsAtTypeHint = null;
        }
        String valueproxyEnabled = request.getQueryString("proxy.enabled");
        Boolean proxyEnabled;
        if (valueproxyEnabled != null) {
            proxyEnabled = Boolean.valueOf(valueproxyEnabled);
        } else {
            proxyEnabled = null;
        }
        String valueproxyEnabledAtTypeHint = request.getQueryString("proxy.enabled@TypeHint");
        String proxyEnabledAtTypeHint;
        if (valueproxyEnabledAtTypeHint != null) {
            proxyEnabledAtTypeHint = valueproxyEnabledAtTypeHint;
        } else {
            proxyEnabledAtTypeHint = null;
        }
        String valueproxyUser = request.getQueryString("proxy.user");
        String proxyUser;
        if (valueproxyUser != null) {
            proxyUser = valueproxyUser;
        } else {
            proxyUser = null;
        }
        String valueproxyUserAtTypeHint = request.getQueryString("proxy.user@TypeHint");
        String proxyUserAtTypeHint;
        if (valueproxyUserAtTypeHint != null) {
            proxyUserAtTypeHint = valueproxyUserAtTypeHint;
        } else {
            proxyUserAtTypeHint = null;
        }
        String valueproxyPassword = request.getQueryString("proxy.password");
        String proxyPassword;
        if (valueproxyPassword != null) {
            proxyPassword = valueproxyPassword;
        } else {
            proxyPassword = null;
        }
        String valueproxyPasswordAtTypeHint = request.getQueryString("proxy.password@TypeHint");
        String proxyPasswordAtTypeHint;
        if (valueproxyPasswordAtTypeHint != null) {
            proxyPasswordAtTypeHint = valueproxyPasswordAtTypeHint;
        } else {
            proxyPasswordAtTypeHint = null;
        }
        return imp.postConfigApacheHttpComponentsProxyConfigurationHttp(request, proxyHost, proxyHostAtTypeHint, proxyPort, proxyPortAtTypeHint, proxyExceptions, proxyExceptionsAtTypeHint, proxyEnabled, proxyEnabledAtTypeHint, proxyUser, proxyUserAtTypeHint, proxyPassword, proxyPasswordAtTypeHint);
    }

    @ApiAction
    public Result postConfigApacheSlingDavExServlet(Http.Request request) throws Exception {
        String valuealias = request.getQueryString("alias");
        String alias;
        if (valuealias != null) {
            alias = valuealias;
        } else {
            alias = null;
        }
        String valuealiasAtTypeHint = request.getQueryString("alias@TypeHint");
        String aliasAtTypeHint;
        if (valuealiasAtTypeHint != null) {
            aliasAtTypeHint = valuealiasAtTypeHint;
        } else {
            aliasAtTypeHint = null;
        }
        String valuedavCreateAbsoluteUri = request.getQueryString("dav.create-absolute-uri");
        Boolean davCreateAbsoluteUri;
        if (valuedavCreateAbsoluteUri != null) {
            davCreateAbsoluteUri = Boolean.valueOf(valuedavCreateAbsoluteUri);
        } else {
            davCreateAbsoluteUri = null;
        }
        String valuedavCreateAbsoluteUriAtTypeHint = request.getQueryString("dav.create-absolute-uri@TypeHint");
        String davCreateAbsoluteUriAtTypeHint;
        if (valuedavCreateAbsoluteUriAtTypeHint != null) {
            davCreateAbsoluteUriAtTypeHint = valuedavCreateAbsoluteUriAtTypeHint;
        } else {
            davCreateAbsoluteUriAtTypeHint = null;
        }
        return imp.postConfigApacheSlingDavExServletHttp(request, alias, aliasAtTypeHint, davCreateAbsoluteUri, davCreateAbsoluteUriAtTypeHint);
    }

    @ApiAction
    public Result postConfigApacheSlingGetServlet(Http.Request request) throws Exception {
        String valuejsonMaximumresults = request.getQueryString("json.maximumresults");
        String jsonMaximumresults;
        if (valuejsonMaximumresults != null) {
            jsonMaximumresults = valuejsonMaximumresults;
        } else {
            jsonMaximumresults = null;
        }
        String valuejsonMaximumresultsAtTypeHint = request.getQueryString("json.maximumresults@TypeHint");
        String jsonMaximumresultsAtTypeHint;
        if (valuejsonMaximumresultsAtTypeHint != null) {
            jsonMaximumresultsAtTypeHint = valuejsonMaximumresultsAtTypeHint;
        } else {
            jsonMaximumresultsAtTypeHint = null;
        }
        String valueenableHtml = request.getQueryString("enable.html");
        Boolean enableHtml;
        if (valueenableHtml != null) {
            enableHtml = Boolean.valueOf(valueenableHtml);
        } else {
            enableHtml = null;
        }
        String valueenableHtmlAtTypeHint = request.getQueryString("enable.html@TypeHint");
        String enableHtmlAtTypeHint;
        if (valueenableHtmlAtTypeHint != null) {
            enableHtmlAtTypeHint = valueenableHtmlAtTypeHint;
        } else {
            enableHtmlAtTypeHint = null;
        }
        String valueenableTxt = request.getQueryString("enable.txt");
        Boolean enableTxt;
        if (valueenableTxt != null) {
            enableTxt = Boolean.valueOf(valueenableTxt);
        } else {
            enableTxt = null;
        }
        String valueenableTxtAtTypeHint = request.getQueryString("enable.txt@TypeHint");
        String enableTxtAtTypeHint;
        if (valueenableTxtAtTypeHint != null) {
            enableTxtAtTypeHint = valueenableTxtAtTypeHint;
        } else {
            enableTxtAtTypeHint = null;
        }
        String valueenableXml = request.getQueryString("enable.xml");
        Boolean enableXml;
        if (valueenableXml != null) {
            enableXml = Boolean.valueOf(valueenableXml);
        } else {
            enableXml = null;
        }
        String valueenableXmlAtTypeHint = request.getQueryString("enable.xml@TypeHint");
        String enableXmlAtTypeHint;
        if (valueenableXmlAtTypeHint != null) {
            enableXmlAtTypeHint = valueenableXmlAtTypeHint;
        } else {
            enableXmlAtTypeHint = null;
        }
        return imp.postConfigApacheSlingGetServletHttp(request, jsonMaximumresults, jsonMaximumresultsAtTypeHint, enableHtml, enableHtmlAtTypeHint, enableTxt, enableTxtAtTypeHint, enableXml, enableXmlAtTypeHint);
    }

    @ApiAction
    public Result postConfigApacheSlingReferrerFilter(Http.Request request) throws Exception {
        String valueallowEmpty = request.getQueryString("allow.empty");
        Boolean allowEmpty;
        if (valueallowEmpty != null) {
            allowEmpty = Boolean.valueOf(valueallowEmpty);
        } else {
            allowEmpty = null;
        }
        String valueallowEmptyAtTypeHint = request.getQueryString("allow.empty@TypeHint");
        String allowEmptyAtTypeHint;
        if (valueallowEmptyAtTypeHint != null) {
            allowEmptyAtTypeHint = valueallowEmptyAtTypeHint;
        } else {
            allowEmptyAtTypeHint = null;
        }
        String valueallowHosts = request.getQueryString("allow.hosts");
        String allowHosts;
        if (valueallowHosts != null) {
            allowHosts = valueallowHosts;
        } else {
            allowHosts = null;
        }
        String valueallowHostsAtTypeHint = request.getQueryString("allow.hosts@TypeHint");
        String allowHostsAtTypeHint;
        if (valueallowHostsAtTypeHint != null) {
            allowHostsAtTypeHint = valueallowHostsAtTypeHint;
        } else {
            allowHostsAtTypeHint = null;
        }
        String valueallowHostsRegexp = request.getQueryString("allow.hosts.regexp");
        String allowHostsRegexp;
        if (valueallowHostsRegexp != null) {
            allowHostsRegexp = valueallowHostsRegexp;
        } else {
            allowHostsRegexp = null;
        }
        String valueallowHostsRegexpAtTypeHint = request.getQueryString("allow.hosts.regexp@TypeHint");
        String allowHostsRegexpAtTypeHint;
        if (valueallowHostsRegexpAtTypeHint != null) {
            allowHostsRegexpAtTypeHint = valueallowHostsRegexpAtTypeHint;
        } else {
            allowHostsRegexpAtTypeHint = null;
        }
        String valuefilterMethods = request.getQueryString("filter.methods");
        String filterMethods;
        if (valuefilterMethods != null) {
            filterMethods = valuefilterMethods;
        } else {
            filterMethods = null;
        }
        String valuefilterMethodsAtTypeHint = request.getQueryString("filter.methods@TypeHint");
        String filterMethodsAtTypeHint;
        if (valuefilterMethodsAtTypeHint != null) {
            filterMethodsAtTypeHint = valuefilterMethodsAtTypeHint;
        } else {
            filterMethodsAtTypeHint = null;
        }
        return imp.postConfigApacheSlingReferrerFilterHttp(request, allowEmpty, allowEmptyAtTypeHint, allowHosts, allowHostsAtTypeHint, allowHostsRegexp, allowHostsRegexpAtTypeHint, filterMethods, filterMethodsAtTypeHint);
    }

    @ApiAction
    public Result postConfigProperty(Http.Request request, String configNodeName) throws Exception {
        return imp.postConfigPropertyHttp(request, configNodeName);
    }

    @ApiAction
    public Result postNode(Http.Request request, String path,String name) throws Exception {
        String valuecolonOperation = request.getQueryString(":operation");
        String colonOperation;
        if (valuecolonOperation != null) {
            colonOperation = valuecolonOperation;
        } else {
            colonOperation = null;
        }
        String valuedeleteAuthorizable = request.getQueryString("deleteAuthorizable");
        String deleteAuthorizable;
        if (valuedeleteAuthorizable != null) {
            deleteAuthorizable = valuedeleteAuthorizable;
        } else {
            deleteAuthorizable = null;
        }
        Http.MultipartFormData<TemporaryFile> bodyfile = request.body().asMultipartFormData();
        Http.MultipartFormData.FilePart<TemporaryFile> file = bodyfile.getFile("file");
        return imp.postNodeHttp(request, path, name, colonOperation, deleteAuthorizable, file);
    }

    @ApiAction
    public Result postNodeRw(Http.Request request, String path,String name) throws Exception {
        String valueaddMembers = request.getQueryString("addMembers");
        String addMembers;
        if (valueaddMembers != null) {
            addMembers = valueaddMembers;
        } else {
            addMembers = null;
        }
        return imp.postNodeRwHttp(request, path, name, addMembers);
    }

    @ApiAction
    public Result postPath(Http.Request request, String path) throws Exception {
        String valuejcrColonPrimaryType = request.getQueryString("jcr:primaryType");
        String jcrColonPrimaryType;
        if (valuejcrColonPrimaryType != null) {
            jcrColonPrimaryType = valuejcrColonPrimaryType;
        } else {
            throw new IllegalArgumentException("'jcr:primaryType' parameter is required");
        }
        String valuecolonName = request.getQueryString(":name");
        String colonName;
        if (valuecolonName != null) {
            colonName = valuecolonName;
        } else {
            throw new IllegalArgumentException("':name' parameter is required");
        }
        return imp.postPathHttp(request, path, jcrColonPrimaryType, colonName);
    }

    @ApiAction
    public Result postQuery(Http.Request request) throws Exception {
        String valuepath = request.getQueryString("path");
        String path;
        if (valuepath != null) {
            path = valuepath;
        } else {
            throw new IllegalArgumentException("'path' parameter is required");
        }
        String valuepLimit = request.getQueryString("p.limit");
        BigDecimal pLimit;
        if (valuepLimit != null) {
            pLimit = new BigDecimal(valuepLimit);
        } else {
            throw new IllegalArgumentException("'p.limit' parameter is required");
        }
        String value_1property = request.getQueryString("1_property");
        String _1property;
        if (value_1property != null) {
            _1property = value_1property;
        } else {
            throw new IllegalArgumentException("'1_property' parameter is required");
        }
        String value_1propertyValue = request.getQueryString("1_property.value");
        String _1propertyValue;
        if (value_1propertyValue != null) {
            _1propertyValue = value_1propertyValue;
        } else {
            throw new IllegalArgumentException("'1_property.value' parameter is required");
        }
        return imp.postQueryHttp(request, path, pLimit, _1property, _1propertyValue);
    }

    @ApiAction
    public Result postTreeActivation(Http.Request request) throws Exception {
        String valueignoredeactivated = request.getQueryString("ignoredeactivated");
        Boolean ignoredeactivated;
        if (valueignoredeactivated != null) {
            ignoredeactivated = Boolean.valueOf(valueignoredeactivated);
        } else {
            throw new IllegalArgumentException("'ignoredeactivated' parameter is required");
        }
        String valueonlymodified = request.getQueryString("onlymodified");
        Boolean onlymodified;
        if (valueonlymodified != null) {
            onlymodified = Boolean.valueOf(valueonlymodified);
        } else {
            throw new IllegalArgumentException("'onlymodified' parameter is required");
        }
        String valuepath = request.getQueryString("path");
        String path;
        if (valuepath != null) {
            path = valuepath;
        } else {
            throw new IllegalArgumentException("'path' parameter is required");
        }
        return imp.postTreeActivationHttp(request, ignoredeactivated, onlymodified, path);
    }

    @ApiAction
    public Result postTruststore(Http.Request request) throws Exception {
        String valuecolonOperation = request.getQueryString(":operation");
        String colonOperation;
        if (valuecolonOperation != null) {
            colonOperation = valuecolonOperation;
        } else {
            colonOperation = null;
        }
        String valuenewPassword = request.getQueryString("newPassword");
        String newPassword;
        if (valuenewPassword != null) {
            newPassword = valuenewPassword;
        } else {
            newPassword = null;
        }
        String valuerePassword = request.getQueryString("rePassword");
        String rePassword;
        if (valuerePassword != null) {
            rePassword = valuerePassword;
        } else {
            rePassword = null;
        }
        String valuekeyStoreType = request.getQueryString("keyStoreType");
        String keyStoreType;
        if (valuekeyStoreType != null) {
            keyStoreType = valuekeyStoreType;
        } else {
            keyStoreType = null;
        }
        String valueremoveAlias = request.getQueryString("removeAlias");
        String removeAlias;
        if (valueremoveAlias != null) {
            removeAlias = valueremoveAlias;
        } else {
            removeAlias = null;
        }
        Http.MultipartFormData<TemporaryFile> bodycertificate = request.body().asMultipartFormData();
        Http.MultipartFormData.FilePart<TemporaryFile> certificate = bodycertificate.getFile("certificate");
        return imp.postTruststoreHttp(request, colonOperation, newPassword, rePassword, keyStoreType, removeAlias, certificate);
    }

    @ApiAction
    public Result postTruststorePKCS12(Http.Request request) throws Exception {
        Http.MultipartFormData<TemporaryFile> bodytruststoreP12 = request.body().asMultipartFormData();
        Http.MultipartFormData.FilePart<TemporaryFile> truststoreP12 = bodytruststoreP12.getFile("truststore.p12");
        return imp.postTruststorePKCS12Http(request, truststoreP12);
    }

}
