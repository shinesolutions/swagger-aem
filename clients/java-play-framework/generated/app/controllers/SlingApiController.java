package controllers;

import java.math.BigDecimal;
import java.io.InputStream;
import apimodels.KeystoreInfo;
import apimodels.TruststoreInfo;

import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Http;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import java.io.File;
import openapitools.OpenAPIUtils;
import com.fasterxml.jackson.core.type.TypeReference;

import javax.validation.constraints.*;
import play.Configuration;

import openapitools.OpenAPIUtils.ApiAction;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-04T23:41:35.248Z[GMT]")

public class SlingApiController extends Controller {

    private final SlingApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Configuration configuration;

    @Inject
    private SlingApiController(Configuration configuration, SlingApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }


    @ApiAction
    public Result deleteAgent(String runmode,String name) throws Exception {
        imp.deleteAgent(runmode, name);
        return ok();
    }

    @ApiAction
    public Result deleteNode(String path,String name) throws Exception {
        imp.deleteNode(path, name);
        return ok();
    }

    @ApiAction
    public Result getAgent(String runmode,String name) throws Exception {
        imp.getAgent(runmode, name);
        return ok();
    }

    @ApiAction
    public Result getAgents(String runmode) throws Exception {
        String obj = imp.getAgents(runmode);
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
    }

    @ApiAction
    public Result getAuthorizableKeystore(String intermediatePath,String authorizableId) throws Exception {
        KeystoreInfo obj = imp.getAuthorizableKeystore(intermediatePath, authorizableId);
        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
    }

    @ApiAction
    public Result getKeystore(String intermediatePath,String authorizableId) throws Exception {
        InputStream obj = imp.getKeystore(intermediatePath, authorizableId);
        return ok(obj);
    }

    @ApiAction
    public Result getNode(String path,String name) throws Exception {
        imp.getNode(path, name);
        return ok();
    }

    @ApiAction
    public Result getPackage(String group,String name,String version) throws Exception {
        InputStream obj = imp.getPackage(group, name, version);
        return ok(obj);
    }

    @ApiAction
    public Result getPackageFilter(String group,String name,String version) throws Exception {
        String obj = imp.getPackageFilter(group, name, version);
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
    }

    @ApiAction
    public Result getQuery() throws Exception {
        String valuepath = request().getQueryString("path");
        String path;
        if (valuepath != null) {
            path = valuepath;
        } else {
            throw new IllegalArgumentException("'path' parameter is required");
        }
        String valuepLimit = request().getQueryString("p.limit");
        BigDecimal pLimit;
        if (valuepLimit != null) {
            pLimit = Double.parseDouble(valuepLimit);
        } else {
            throw new IllegalArgumentException("'p.limit' parameter is required");
        }
        String value_1property = request().getQueryString("1_property");
        String _1property;
        if (value_1property != null) {
            _1property = value_1property;
        } else {
            throw new IllegalArgumentException("'1_property' parameter is required");
        }
        String value_1propertyValue = request().getQueryString("1_property.value");
        String _1propertyValue;
        if (value_1propertyValue != null) {
            _1propertyValue = value_1propertyValue;
        } else {
            throw new IllegalArgumentException("'1_property.value' parameter is required");
        }
        String obj = imp.getQuery(path, pLimit, _1property, _1propertyValue);
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
    }

    @ApiAction
    public Result getTruststore() throws Exception {
        InputStream obj = imp.getTruststore();
        return ok(obj);
    }

    @ApiAction
    public Result getTruststoreInfo() throws Exception {
        TruststoreInfo obj = imp.getTruststoreInfo();
        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
    }

    @ApiAction
    public Result postAgent(String runmode,String name) throws Exception {
        String valuejcrColonContentSlashCqColonDistribute = request().getQueryString("jcr:content/cq:distribute");
        Boolean jcrColonContentSlashCqColonDistribute;
        if (valuejcrColonContentSlashCqColonDistribute != null) {
            jcrColonContentSlashCqColonDistribute = Boolean.valueOf(valuejcrColonContentSlashCqColonDistribute);
        } else {
            jcrColonContentSlashCqColonDistribute = null;
        }
        String valuejcrColonContentSlashCqColonDistributeAtTypeHint = request().getQueryString("jcr:content/cq:distribute@TypeHint");
        String jcrColonContentSlashCqColonDistributeAtTypeHint;
        if (valuejcrColonContentSlashCqColonDistributeAtTypeHint != null) {
            jcrColonContentSlashCqColonDistributeAtTypeHint = valuejcrColonContentSlashCqColonDistributeAtTypeHint;
        } else {
            jcrColonContentSlashCqColonDistributeAtTypeHint = null;
        }
        String valuejcrColonContentSlashCqColonName = request().getQueryString("jcr:content/cq:name");
        String jcrColonContentSlashCqColonName;
        if (valuejcrColonContentSlashCqColonName != null) {
            jcrColonContentSlashCqColonName = valuejcrColonContentSlashCqColonName;
        } else {
            jcrColonContentSlashCqColonName = null;
        }
        String valuejcrColonContentSlashCqColonTemplate = request().getQueryString("jcr:content/cq:template");
        String jcrColonContentSlashCqColonTemplate;
        if (valuejcrColonContentSlashCqColonTemplate != null) {
            jcrColonContentSlashCqColonTemplate = valuejcrColonContentSlashCqColonTemplate;
        } else {
            jcrColonContentSlashCqColonTemplate = null;
        }
        String valuejcrColonContentSlashEnabled = request().getQueryString("jcr:content/enabled");
        Boolean jcrColonContentSlashEnabled;
        if (valuejcrColonContentSlashEnabled != null) {
            jcrColonContentSlashEnabled = Boolean.valueOf(valuejcrColonContentSlashEnabled);
        } else {
            jcrColonContentSlashEnabled = null;
        }
        String valuejcrColonContentSlashJcrColonDescription = request().getQueryString("jcr:content/jcr:description");
        String jcrColonContentSlashJcrColonDescription;
        if (valuejcrColonContentSlashJcrColonDescription != null) {
            jcrColonContentSlashJcrColonDescription = valuejcrColonContentSlashJcrColonDescription;
        } else {
            jcrColonContentSlashJcrColonDescription = null;
        }
        String valuejcrColonContentSlashJcrColonLastModified = request().getQueryString("jcr:content/jcr:lastModified");
        String jcrColonContentSlashJcrColonLastModified;
        if (valuejcrColonContentSlashJcrColonLastModified != null) {
            jcrColonContentSlashJcrColonLastModified = valuejcrColonContentSlashJcrColonLastModified;
        } else {
            jcrColonContentSlashJcrColonLastModified = null;
        }
        String valuejcrColonContentSlashJcrColonLastModifiedBy = request().getQueryString("jcr:content/jcr:lastModifiedBy");
        String jcrColonContentSlashJcrColonLastModifiedBy;
        if (valuejcrColonContentSlashJcrColonLastModifiedBy != null) {
            jcrColonContentSlashJcrColonLastModifiedBy = valuejcrColonContentSlashJcrColonLastModifiedBy;
        } else {
            jcrColonContentSlashJcrColonLastModifiedBy = null;
        }
        String valuejcrColonContentSlashJcrColonMixinTypes = request().getQueryString("jcr:content/jcr:mixinTypes");
        String jcrColonContentSlashJcrColonMixinTypes;
        if (valuejcrColonContentSlashJcrColonMixinTypes != null) {
            jcrColonContentSlashJcrColonMixinTypes = valuejcrColonContentSlashJcrColonMixinTypes;
        } else {
            jcrColonContentSlashJcrColonMixinTypes = null;
        }
        String valuejcrColonContentSlashJcrColonTitle = request().getQueryString("jcr:content/jcr:title");
        String jcrColonContentSlashJcrColonTitle;
        if (valuejcrColonContentSlashJcrColonTitle != null) {
            jcrColonContentSlashJcrColonTitle = valuejcrColonContentSlashJcrColonTitle;
        } else {
            jcrColonContentSlashJcrColonTitle = null;
        }
        String valuejcrColonContentSlashLogLevel = request().getQueryString("jcr:content/logLevel");
        String jcrColonContentSlashLogLevel;
        if (valuejcrColonContentSlashLogLevel != null) {
            jcrColonContentSlashLogLevel = valuejcrColonContentSlashLogLevel;
        } else {
            jcrColonContentSlashLogLevel = null;
        }
        String valuejcrColonContentSlashNoStatusUpdate = request().getQueryString("jcr:content/noStatusUpdate");
        Boolean jcrColonContentSlashNoStatusUpdate;
        if (valuejcrColonContentSlashNoStatusUpdate != null) {
            jcrColonContentSlashNoStatusUpdate = Boolean.valueOf(valuejcrColonContentSlashNoStatusUpdate);
        } else {
            jcrColonContentSlashNoStatusUpdate = null;
        }
        String valuejcrColonContentSlashNoVersioning = request().getQueryString("jcr:content/noVersioning");
        Boolean jcrColonContentSlashNoVersioning;
        if (valuejcrColonContentSlashNoVersioning != null) {
            jcrColonContentSlashNoVersioning = Boolean.valueOf(valuejcrColonContentSlashNoVersioning);
        } else {
            jcrColonContentSlashNoVersioning = null;
        }
        String valuejcrColonContentSlashProtocolConnectTimeout = request().getQueryString("jcr:content/protocolConnectTimeout");
        BigDecimal jcrColonContentSlashProtocolConnectTimeout;
        if (valuejcrColonContentSlashProtocolConnectTimeout != null) {
            jcrColonContentSlashProtocolConnectTimeout = Double.parseDouble(valuejcrColonContentSlashProtocolConnectTimeout);
        } else {
            jcrColonContentSlashProtocolConnectTimeout = null;
        }
        String valuejcrColonContentSlashProtocolHTTPConnectionClosed = request().getQueryString("jcr:content/protocolHTTPConnectionClosed");
        Boolean jcrColonContentSlashProtocolHTTPConnectionClosed;
        if (valuejcrColonContentSlashProtocolHTTPConnectionClosed != null) {
            jcrColonContentSlashProtocolHTTPConnectionClosed = Boolean.valueOf(valuejcrColonContentSlashProtocolHTTPConnectionClosed);
        } else {
            jcrColonContentSlashProtocolHTTPConnectionClosed = null;
        }
        String valuejcrColonContentSlashProtocolHTTPExpired = request().getQueryString("jcr:content/protocolHTTPExpired");
        String jcrColonContentSlashProtocolHTTPExpired;
        if (valuejcrColonContentSlashProtocolHTTPExpired != null) {
            jcrColonContentSlashProtocolHTTPExpired = valuejcrColonContentSlashProtocolHTTPExpired;
        } else {
            jcrColonContentSlashProtocolHTTPExpired = null;
        }
        String[] jcrColonContentSlashProtocolHTTPHeadersArray = request().queryString().get("jcr:content/protocolHTTPHeaders");
        List<String> jcrColonContentSlashProtocolHTTPHeadersList = OpenAPIUtils.parametersToList("multi", jcrColonContentSlashProtocolHTTPHeadersArray);
        List<String> jcrColonContentSlashProtocolHTTPHeaders = new ArrayList<String>();
        for (String curParam : jcrColonContentSlashProtocolHTTPHeadersList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                jcrColonContentSlashProtocolHTTPHeaders.add(curParam);
            }
        }
        String valuejcrColonContentSlashProtocolHTTPHeadersAtTypeHint = request().getQueryString("jcr:content/protocolHTTPHeaders@TypeHint");
        String jcrColonContentSlashProtocolHTTPHeadersAtTypeHint;
        if (valuejcrColonContentSlashProtocolHTTPHeadersAtTypeHint != null) {
            jcrColonContentSlashProtocolHTTPHeadersAtTypeHint = valuejcrColonContentSlashProtocolHTTPHeadersAtTypeHint;
        } else {
            jcrColonContentSlashProtocolHTTPHeadersAtTypeHint = null;
        }
        String valuejcrColonContentSlashProtocolHTTPMethod = request().getQueryString("jcr:content/protocolHTTPMethod");
        String jcrColonContentSlashProtocolHTTPMethod;
        if (valuejcrColonContentSlashProtocolHTTPMethod != null) {
            jcrColonContentSlashProtocolHTTPMethod = valuejcrColonContentSlashProtocolHTTPMethod;
        } else {
            jcrColonContentSlashProtocolHTTPMethod = null;
        }
        String valuejcrColonContentSlashProtocolHTTPSRelaxed = request().getQueryString("jcr:content/protocolHTTPSRelaxed");
        Boolean jcrColonContentSlashProtocolHTTPSRelaxed;
        if (valuejcrColonContentSlashProtocolHTTPSRelaxed != null) {
            jcrColonContentSlashProtocolHTTPSRelaxed = Boolean.valueOf(valuejcrColonContentSlashProtocolHTTPSRelaxed);
        } else {
            jcrColonContentSlashProtocolHTTPSRelaxed = null;
        }
        String valuejcrColonContentSlashProtocolInterface = request().getQueryString("jcr:content/protocolInterface");
        String jcrColonContentSlashProtocolInterface;
        if (valuejcrColonContentSlashProtocolInterface != null) {
            jcrColonContentSlashProtocolInterface = valuejcrColonContentSlashProtocolInterface;
        } else {
            jcrColonContentSlashProtocolInterface = null;
        }
        String valuejcrColonContentSlashProtocolSocketTimeout = request().getQueryString("jcr:content/protocolSocketTimeout");
        BigDecimal jcrColonContentSlashProtocolSocketTimeout;
        if (valuejcrColonContentSlashProtocolSocketTimeout != null) {
            jcrColonContentSlashProtocolSocketTimeout = Double.parseDouble(valuejcrColonContentSlashProtocolSocketTimeout);
        } else {
            jcrColonContentSlashProtocolSocketTimeout = null;
        }
        String valuejcrColonContentSlashProtocolVersion = request().getQueryString("jcr:content/protocolVersion");
        String jcrColonContentSlashProtocolVersion;
        if (valuejcrColonContentSlashProtocolVersion != null) {
            jcrColonContentSlashProtocolVersion = valuejcrColonContentSlashProtocolVersion;
        } else {
            jcrColonContentSlashProtocolVersion = null;
        }
        String valuejcrColonContentSlashProxyNTLMDomain = request().getQueryString("jcr:content/proxyNTLMDomain");
        String jcrColonContentSlashProxyNTLMDomain;
        if (valuejcrColonContentSlashProxyNTLMDomain != null) {
            jcrColonContentSlashProxyNTLMDomain = valuejcrColonContentSlashProxyNTLMDomain;
        } else {
            jcrColonContentSlashProxyNTLMDomain = null;
        }
        String valuejcrColonContentSlashProxyNTLMHost = request().getQueryString("jcr:content/proxyNTLMHost");
        String jcrColonContentSlashProxyNTLMHost;
        if (valuejcrColonContentSlashProxyNTLMHost != null) {
            jcrColonContentSlashProxyNTLMHost = valuejcrColonContentSlashProxyNTLMHost;
        } else {
            jcrColonContentSlashProxyNTLMHost = null;
        }
        String valuejcrColonContentSlashProxyHost = request().getQueryString("jcr:content/proxyHost");
        String jcrColonContentSlashProxyHost;
        if (valuejcrColonContentSlashProxyHost != null) {
            jcrColonContentSlashProxyHost = valuejcrColonContentSlashProxyHost;
        } else {
            jcrColonContentSlashProxyHost = null;
        }
        String valuejcrColonContentSlashProxyPassword = request().getQueryString("jcr:content/proxyPassword");
        String jcrColonContentSlashProxyPassword;
        if (valuejcrColonContentSlashProxyPassword != null) {
            jcrColonContentSlashProxyPassword = valuejcrColonContentSlashProxyPassword;
        } else {
            jcrColonContentSlashProxyPassword = null;
        }
        String valuejcrColonContentSlashProxyPort = request().getQueryString("jcr:content/proxyPort");
        BigDecimal jcrColonContentSlashProxyPort;
        if (valuejcrColonContentSlashProxyPort != null) {
            jcrColonContentSlashProxyPort = Double.parseDouble(valuejcrColonContentSlashProxyPort);
        } else {
            jcrColonContentSlashProxyPort = null;
        }
        String valuejcrColonContentSlashProxyUser = request().getQueryString("jcr:content/proxyUser");
        String jcrColonContentSlashProxyUser;
        if (valuejcrColonContentSlashProxyUser != null) {
            jcrColonContentSlashProxyUser = valuejcrColonContentSlashProxyUser;
        } else {
            jcrColonContentSlashProxyUser = null;
        }
        String valuejcrColonContentSlashQueueBatchMaxSize = request().getQueryString("jcr:content/queueBatchMaxSize");
        BigDecimal jcrColonContentSlashQueueBatchMaxSize;
        if (valuejcrColonContentSlashQueueBatchMaxSize != null) {
            jcrColonContentSlashQueueBatchMaxSize = Double.parseDouble(valuejcrColonContentSlashQueueBatchMaxSize);
        } else {
            jcrColonContentSlashQueueBatchMaxSize = null;
        }
        String valuejcrColonContentSlashQueueBatchMode = request().getQueryString("jcr:content/queueBatchMode");
        String jcrColonContentSlashQueueBatchMode;
        if (valuejcrColonContentSlashQueueBatchMode != null) {
            jcrColonContentSlashQueueBatchMode = valuejcrColonContentSlashQueueBatchMode;
        } else {
            jcrColonContentSlashQueueBatchMode = null;
        }
        String valuejcrColonContentSlashQueueBatchWaitTime = request().getQueryString("jcr:content/queueBatchWaitTime");
        BigDecimal jcrColonContentSlashQueueBatchWaitTime;
        if (valuejcrColonContentSlashQueueBatchWaitTime != null) {
            jcrColonContentSlashQueueBatchWaitTime = Double.parseDouble(valuejcrColonContentSlashQueueBatchWaitTime);
        } else {
            jcrColonContentSlashQueueBatchWaitTime = null;
        }
        String valuejcrColonContentSlashRetryDelay = request().getQueryString("jcr:content/retryDelay");
        String jcrColonContentSlashRetryDelay;
        if (valuejcrColonContentSlashRetryDelay != null) {
            jcrColonContentSlashRetryDelay = valuejcrColonContentSlashRetryDelay;
        } else {
            jcrColonContentSlashRetryDelay = null;
        }
        String valuejcrColonContentSlashReverseReplication = request().getQueryString("jcr:content/reverseReplication");
        Boolean jcrColonContentSlashReverseReplication;
        if (valuejcrColonContentSlashReverseReplication != null) {
            jcrColonContentSlashReverseReplication = Boolean.valueOf(valuejcrColonContentSlashReverseReplication);
        } else {
            jcrColonContentSlashReverseReplication = null;
        }
        String valuejcrColonContentSlashSerializationType = request().getQueryString("jcr:content/serializationType");
        String jcrColonContentSlashSerializationType;
        if (valuejcrColonContentSlashSerializationType != null) {
            jcrColonContentSlashSerializationType = valuejcrColonContentSlashSerializationType;
        } else {
            jcrColonContentSlashSerializationType = null;
        }
        String valuejcrColonContentSlashSlingColonResourceType = request().getQueryString("jcr:content/sling:resourceType");
        String jcrColonContentSlashSlingColonResourceType;
        if (valuejcrColonContentSlashSlingColonResourceType != null) {
            jcrColonContentSlashSlingColonResourceType = valuejcrColonContentSlashSlingColonResourceType;
        } else {
            jcrColonContentSlashSlingColonResourceType = null;
        }
        String valuejcrColonContentSlashSsl = request().getQueryString("jcr:content/ssl");
        String jcrColonContentSlashSsl;
        if (valuejcrColonContentSlashSsl != null) {
            jcrColonContentSlashSsl = valuejcrColonContentSlashSsl;
        } else {
            jcrColonContentSlashSsl = null;
        }
        String valuejcrColonContentSlashTransportNTLMDomain = request().getQueryString("jcr:content/transportNTLMDomain");
        String jcrColonContentSlashTransportNTLMDomain;
        if (valuejcrColonContentSlashTransportNTLMDomain != null) {
            jcrColonContentSlashTransportNTLMDomain = valuejcrColonContentSlashTransportNTLMDomain;
        } else {
            jcrColonContentSlashTransportNTLMDomain = null;
        }
        String valuejcrColonContentSlashTransportNTLMHost = request().getQueryString("jcr:content/transportNTLMHost");
        String jcrColonContentSlashTransportNTLMHost;
        if (valuejcrColonContentSlashTransportNTLMHost != null) {
            jcrColonContentSlashTransportNTLMHost = valuejcrColonContentSlashTransportNTLMHost;
        } else {
            jcrColonContentSlashTransportNTLMHost = null;
        }
        String valuejcrColonContentSlashTransportPassword = request().getQueryString("jcr:content/transportPassword");
        String jcrColonContentSlashTransportPassword;
        if (valuejcrColonContentSlashTransportPassword != null) {
            jcrColonContentSlashTransportPassword = valuejcrColonContentSlashTransportPassword;
        } else {
            jcrColonContentSlashTransportPassword = null;
        }
        String valuejcrColonContentSlashTransportUri = request().getQueryString("jcr:content/transportUri");
        String jcrColonContentSlashTransportUri;
        if (valuejcrColonContentSlashTransportUri != null) {
            jcrColonContentSlashTransportUri = valuejcrColonContentSlashTransportUri;
        } else {
            jcrColonContentSlashTransportUri = null;
        }
        String valuejcrColonContentSlashTransportUser = request().getQueryString("jcr:content/transportUser");
        String jcrColonContentSlashTransportUser;
        if (valuejcrColonContentSlashTransportUser != null) {
            jcrColonContentSlashTransportUser = valuejcrColonContentSlashTransportUser;
        } else {
            jcrColonContentSlashTransportUser = null;
        }
        String valuejcrColonContentSlashTriggerDistribute = request().getQueryString("jcr:content/triggerDistribute");
        Boolean jcrColonContentSlashTriggerDistribute;
        if (valuejcrColonContentSlashTriggerDistribute != null) {
            jcrColonContentSlashTriggerDistribute = Boolean.valueOf(valuejcrColonContentSlashTriggerDistribute);
        } else {
            jcrColonContentSlashTriggerDistribute = null;
        }
        String valuejcrColonContentSlashTriggerModified = request().getQueryString("jcr:content/triggerModified");
        Boolean jcrColonContentSlashTriggerModified;
        if (valuejcrColonContentSlashTriggerModified != null) {
            jcrColonContentSlashTriggerModified = Boolean.valueOf(valuejcrColonContentSlashTriggerModified);
        } else {
            jcrColonContentSlashTriggerModified = null;
        }
        String valuejcrColonContentSlashTriggerOnOffTime = request().getQueryString("jcr:content/triggerOnOffTime");
        Boolean jcrColonContentSlashTriggerOnOffTime;
        if (valuejcrColonContentSlashTriggerOnOffTime != null) {
            jcrColonContentSlashTriggerOnOffTime = Boolean.valueOf(valuejcrColonContentSlashTriggerOnOffTime);
        } else {
            jcrColonContentSlashTriggerOnOffTime = null;
        }
        String valuejcrColonContentSlashTriggerReceive = request().getQueryString("jcr:content/triggerReceive");
        Boolean jcrColonContentSlashTriggerReceive;
        if (valuejcrColonContentSlashTriggerReceive != null) {
            jcrColonContentSlashTriggerReceive = Boolean.valueOf(valuejcrColonContentSlashTriggerReceive);
        } else {
            jcrColonContentSlashTriggerReceive = null;
        }
        String valuejcrColonContentSlashTriggerSpecific = request().getQueryString("jcr:content/triggerSpecific");
        Boolean jcrColonContentSlashTriggerSpecific;
        if (valuejcrColonContentSlashTriggerSpecific != null) {
            jcrColonContentSlashTriggerSpecific = Boolean.valueOf(valuejcrColonContentSlashTriggerSpecific);
        } else {
            jcrColonContentSlashTriggerSpecific = null;
        }
        String valuejcrColonContentSlashUserId = request().getQueryString("jcr:content/userId");
        String jcrColonContentSlashUserId;
        if (valuejcrColonContentSlashUserId != null) {
            jcrColonContentSlashUserId = valuejcrColonContentSlashUserId;
        } else {
            jcrColonContentSlashUserId = null;
        }
        String valuejcrColonPrimaryType = request().getQueryString("jcr:primaryType");
        String jcrColonPrimaryType;
        if (valuejcrColonPrimaryType != null) {
            jcrColonPrimaryType = valuejcrColonPrimaryType;
        } else {
            jcrColonPrimaryType = null;
        }
        String valuecolonOperation = request().getQueryString(":operation");
        String colonOperation;
        if (valuecolonOperation != null) {
            colonOperation = valuecolonOperation;
        } else {
            colonOperation = null;
        }
        imp.postAgent(runmode, name, jcrColonContentSlashCqColonDistribute, jcrColonContentSlashCqColonDistributeAtTypeHint, jcrColonContentSlashCqColonName, jcrColonContentSlashCqColonTemplate, jcrColonContentSlashEnabled, jcrColonContentSlashJcrColonDescription, jcrColonContentSlashJcrColonLastModified, jcrColonContentSlashJcrColonLastModifiedBy, jcrColonContentSlashJcrColonMixinTypes, jcrColonContentSlashJcrColonTitle, jcrColonContentSlashLogLevel, jcrColonContentSlashNoStatusUpdate, jcrColonContentSlashNoVersioning, jcrColonContentSlashProtocolConnectTimeout, jcrColonContentSlashProtocolHTTPConnectionClosed, jcrColonContentSlashProtocolHTTPExpired, jcrColonContentSlashProtocolHTTPHeaders, jcrColonContentSlashProtocolHTTPHeadersAtTypeHint, jcrColonContentSlashProtocolHTTPMethod, jcrColonContentSlashProtocolHTTPSRelaxed, jcrColonContentSlashProtocolInterface, jcrColonContentSlashProtocolSocketTimeout, jcrColonContentSlashProtocolVersion, jcrColonContentSlashProxyNTLMDomain, jcrColonContentSlashProxyNTLMHost, jcrColonContentSlashProxyHost, jcrColonContentSlashProxyPassword, jcrColonContentSlashProxyPort, jcrColonContentSlashProxyUser, jcrColonContentSlashQueueBatchMaxSize, jcrColonContentSlashQueueBatchMode, jcrColonContentSlashQueueBatchWaitTime, jcrColonContentSlashRetryDelay, jcrColonContentSlashReverseReplication, jcrColonContentSlashSerializationType, jcrColonContentSlashSlingColonResourceType, jcrColonContentSlashSsl, jcrColonContentSlashTransportNTLMDomain, jcrColonContentSlashTransportNTLMHost, jcrColonContentSlashTransportPassword, jcrColonContentSlashTransportUri, jcrColonContentSlashTransportUser, jcrColonContentSlashTriggerDistribute, jcrColonContentSlashTriggerModified, jcrColonContentSlashTriggerOnOffTime, jcrColonContentSlashTriggerReceive, jcrColonContentSlashTriggerSpecific, jcrColonContentSlashUserId, jcrColonPrimaryType, colonOperation);
        return ok();
    }

    @ApiAction
    public Result postAuthorizableKeystore(String intermediatePath,String authorizableId) throws Exception {
        String valuecolonOperation = request().getQueryString(":operation");
        String colonOperation;
        if (valuecolonOperation != null) {
            colonOperation = valuecolonOperation;
        } else {
            colonOperation = null;
        }
        String valuecurrentPassword = request().getQueryString("currentPassword");
        String currentPassword;
        if (valuecurrentPassword != null) {
            currentPassword = valuecurrentPassword;
        } else {
            currentPassword = null;
        }
        String valuenewPassword = request().getQueryString("newPassword");
        String newPassword;
        if (valuenewPassword != null) {
            newPassword = valuenewPassword;
        } else {
            newPassword = null;
        }
        String valuerePassword = request().getQueryString("rePassword");
        String rePassword;
        if (valuerePassword != null) {
            rePassword = valuerePassword;
        } else {
            rePassword = null;
        }
        String valuekeyPassword = request().getQueryString("keyPassword");
        String keyPassword;
        if (valuekeyPassword != null) {
            keyPassword = valuekeyPassword;
        } else {
            keyPassword = null;
        }
        String valuekeyStorePass = request().getQueryString("keyStorePass");
        String keyStorePass;
        if (valuekeyStorePass != null) {
            keyStorePass = valuekeyStorePass;
        } else {
            keyStorePass = null;
        }
        String valuealias = request().getQueryString("alias");
        String alias;
        if (valuealias != null) {
            alias = valuealias;
        } else {
            alias = null;
        }
        String valuenewAlias = request().getQueryString("newAlias");
        String newAlias;
        if (valuenewAlias != null) {
            newAlias = valuenewAlias;
        } else {
            newAlias = null;
        }
        String valueremoveAlias = request().getQueryString("removeAlias");
        String removeAlias;
        if (valueremoveAlias != null) {
            removeAlias = valueremoveAlias;
        } else {
            removeAlias = null;
        }
        Http.MultipartFormData.FilePart certChain = request().body().asMultipartFormData().getFile("cert-chain");
        Http.MultipartFormData.FilePart pk = request().body().asMultipartFormData().getFile("pk");
        Http.MultipartFormData.FilePart keyStore = request().body().asMultipartFormData().getFile("keyStore");
        KeystoreInfo obj = imp.postAuthorizableKeystore(intermediatePath, authorizableId, colonOperation, currentPassword, newPassword, rePassword, keyPassword, keyStorePass, alias, newAlias, removeAlias, certChain, pk, keyStore);
        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
    }

    @ApiAction
    public Result postAuthorizables() throws Exception {
        String valueauthorizableId = request().getQueryString("authorizableId");
        String authorizableId;
        if (valueauthorizableId != null) {
            authorizableId = valueauthorizableId;
        } else {
            throw new IllegalArgumentException("'authorizableId' parameter is required");
        }
        String valueintermediatePath = request().getQueryString("intermediatePath");
        String intermediatePath;
        if (valueintermediatePath != null) {
            intermediatePath = valueintermediatePath;
        } else {
            throw new IllegalArgumentException("'intermediatePath' parameter is required");
        }
        String valuecreateUser = request().getQueryString("createUser");
        String createUser;
        if (valuecreateUser != null) {
            createUser = valuecreateUser;
        } else {
            createUser = null;
        }
        String valuecreateGroup = request().getQueryString("createGroup");
        String createGroup;
        if (valuecreateGroup != null) {
            createGroup = valuecreateGroup;
        } else {
            createGroup = null;
        }
        String valuerepColonPassword = request().getQueryString("rep:password");
        String repColonPassword;
        if (valuerepColonPassword != null) {
            repColonPassword = valuerepColonPassword;
        } else {
            repColonPassword = null;
        }
        String valueprofileSlashGivenName = request().getQueryString("profile/givenName");
        String profileSlashGivenName;
        if (valueprofileSlashGivenName != null) {
            profileSlashGivenName = valueprofileSlashGivenName;
        } else {
            profileSlashGivenName = null;
        }
        String obj = imp.postAuthorizables(authorizableId, intermediatePath, createUser, createGroup, repColonPassword, profileSlashGivenName);
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
    }

    @ApiAction
    public Result postConfigAdobeGraniteSamlAuthenticationHandler() throws Exception {
        String valuekeyStorePassword = request().getQueryString("keyStorePassword");
        String keyStorePassword;
        if (valuekeyStorePassword != null) {
            keyStorePassword = valuekeyStorePassword;
        } else {
            keyStorePassword = null;
        }
        String valuekeyStorePasswordAtTypeHint = request().getQueryString("keyStorePassword@TypeHint");
        String keyStorePasswordAtTypeHint;
        if (valuekeyStorePasswordAtTypeHint != null) {
            keyStorePasswordAtTypeHint = valuekeyStorePasswordAtTypeHint;
        } else {
            keyStorePasswordAtTypeHint = null;
        }
        String valueserviceRanking = request().getQueryString("service.ranking");
        Integer serviceRanking;
        if (valueserviceRanking != null) {
            serviceRanking = Integer.parseInt(valueserviceRanking);
        } else {
            serviceRanking = null;
        }
        String valueserviceRankingAtTypeHint = request().getQueryString("service.ranking@TypeHint");
        String serviceRankingAtTypeHint;
        if (valueserviceRankingAtTypeHint != null) {
            serviceRankingAtTypeHint = valueserviceRankingAtTypeHint;
        } else {
            serviceRankingAtTypeHint = null;
        }
        String valueidpHttpRedirect = request().getQueryString("idpHttpRedirect");
        Boolean idpHttpRedirect;
        if (valueidpHttpRedirect != null) {
            idpHttpRedirect = Boolean.valueOf(valueidpHttpRedirect);
        } else {
            idpHttpRedirect = null;
        }
        String valueidpHttpRedirectAtTypeHint = request().getQueryString("idpHttpRedirect@TypeHint");
        String idpHttpRedirectAtTypeHint;
        if (valueidpHttpRedirectAtTypeHint != null) {
            idpHttpRedirectAtTypeHint = valueidpHttpRedirectAtTypeHint;
        } else {
            idpHttpRedirectAtTypeHint = null;
        }
        String valuecreateUser = request().getQueryString("createUser");
        Boolean createUser;
        if (valuecreateUser != null) {
            createUser = Boolean.valueOf(valuecreateUser);
        } else {
            createUser = null;
        }
        String valuecreateUserAtTypeHint = request().getQueryString("createUser@TypeHint");
        String createUserAtTypeHint;
        if (valuecreateUserAtTypeHint != null) {
            createUserAtTypeHint = valuecreateUserAtTypeHint;
        } else {
            createUserAtTypeHint = null;
        }
        String valuedefaultRedirectUrl = request().getQueryString("defaultRedirectUrl");
        String defaultRedirectUrl;
        if (valuedefaultRedirectUrl != null) {
            defaultRedirectUrl = valuedefaultRedirectUrl;
        } else {
            defaultRedirectUrl = null;
        }
        String valuedefaultRedirectUrlAtTypeHint = request().getQueryString("defaultRedirectUrl@TypeHint");
        String defaultRedirectUrlAtTypeHint;
        if (valuedefaultRedirectUrlAtTypeHint != null) {
            defaultRedirectUrlAtTypeHint = valuedefaultRedirectUrlAtTypeHint;
        } else {
            defaultRedirectUrlAtTypeHint = null;
        }
        String valueuserIDAttribute = request().getQueryString("userIDAttribute");
        String userIDAttribute;
        if (valueuserIDAttribute != null) {
            userIDAttribute = valueuserIDAttribute;
        } else {
            userIDAttribute = null;
        }
        String valueuserIDAttributeAtTypeHint = request().getQueryString("userIDAttribute@TypeHint");
        String userIDAttributeAtTypeHint;
        if (valueuserIDAttributeAtTypeHint != null) {
            userIDAttributeAtTypeHint = valueuserIDAttributeAtTypeHint;
        } else {
            userIDAttributeAtTypeHint = null;
        }
        String[] defaultGroupsArray = request().queryString().get("defaultGroups");
        List<String> defaultGroupsList = OpenAPIUtils.parametersToList("multi", defaultGroupsArray);
        List<String> defaultGroups = new ArrayList<String>();
        for (String curParam : defaultGroupsList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                defaultGroups.add(curParam);
            }
        }
        String valuedefaultGroupsAtTypeHint = request().getQueryString("defaultGroups@TypeHint");
        String defaultGroupsAtTypeHint;
        if (valuedefaultGroupsAtTypeHint != null) {
            defaultGroupsAtTypeHint = valuedefaultGroupsAtTypeHint;
        } else {
            defaultGroupsAtTypeHint = null;
        }
        String valueidpCertAlias = request().getQueryString("idpCertAlias");
        String idpCertAlias;
        if (valueidpCertAlias != null) {
            idpCertAlias = valueidpCertAlias;
        } else {
            idpCertAlias = null;
        }
        String valueidpCertAliasAtTypeHint = request().getQueryString("idpCertAlias@TypeHint");
        String idpCertAliasAtTypeHint;
        if (valueidpCertAliasAtTypeHint != null) {
            idpCertAliasAtTypeHint = valueidpCertAliasAtTypeHint;
        } else {
            idpCertAliasAtTypeHint = null;
        }
        String valueaddGroupMemberships = request().getQueryString("addGroupMemberships");
        Boolean addGroupMemberships;
        if (valueaddGroupMemberships != null) {
            addGroupMemberships = Boolean.valueOf(valueaddGroupMemberships);
        } else {
            addGroupMemberships = null;
        }
        String valueaddGroupMembershipsAtTypeHint = request().getQueryString("addGroupMemberships@TypeHint");
        String addGroupMembershipsAtTypeHint;
        if (valueaddGroupMembershipsAtTypeHint != null) {
            addGroupMembershipsAtTypeHint = valueaddGroupMembershipsAtTypeHint;
        } else {
            addGroupMembershipsAtTypeHint = null;
        }
        String[] pathArray = request().queryString().get("path");
        List<String> pathList = OpenAPIUtils.parametersToList("multi", pathArray);
        List<String> path = new ArrayList<String>();
        for (String curParam : pathList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                path.add(curParam);
            }
        }
        String valuepathAtTypeHint = request().getQueryString("path@TypeHint");
        String pathAtTypeHint;
        if (valuepathAtTypeHint != null) {
            pathAtTypeHint = valuepathAtTypeHint;
        } else {
            pathAtTypeHint = null;
        }
        String[] synchronizeAttributesArray = request().queryString().get("synchronizeAttributes");
        List<String> synchronizeAttributesList = OpenAPIUtils.parametersToList("multi", synchronizeAttributesArray);
        List<String> synchronizeAttributes = new ArrayList<String>();
        for (String curParam : synchronizeAttributesList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                synchronizeAttributes.add(curParam);
            }
        }
        String valuesynchronizeAttributesAtTypeHint = request().getQueryString("synchronizeAttributes@TypeHint");
        String synchronizeAttributesAtTypeHint;
        if (valuesynchronizeAttributesAtTypeHint != null) {
            synchronizeAttributesAtTypeHint = valuesynchronizeAttributesAtTypeHint;
        } else {
            synchronizeAttributesAtTypeHint = null;
        }
        String valueclockTolerance = request().getQueryString("clockTolerance");
        Integer clockTolerance;
        if (valueclockTolerance != null) {
            clockTolerance = Integer.parseInt(valueclockTolerance);
        } else {
            clockTolerance = null;
        }
        String valueclockToleranceAtTypeHint = request().getQueryString("clockTolerance@TypeHint");
        String clockToleranceAtTypeHint;
        if (valueclockToleranceAtTypeHint != null) {
            clockToleranceAtTypeHint = valueclockToleranceAtTypeHint;
        } else {
            clockToleranceAtTypeHint = null;
        }
        String valuegroupMembershipAttribute = request().getQueryString("groupMembershipAttribute");
        String groupMembershipAttribute;
        if (valuegroupMembershipAttribute != null) {
            groupMembershipAttribute = valuegroupMembershipAttribute;
        } else {
            groupMembershipAttribute = null;
        }
        String valuegroupMembershipAttributeAtTypeHint = request().getQueryString("groupMembershipAttribute@TypeHint");
        String groupMembershipAttributeAtTypeHint;
        if (valuegroupMembershipAttributeAtTypeHint != null) {
            groupMembershipAttributeAtTypeHint = valuegroupMembershipAttributeAtTypeHint;
        } else {
            groupMembershipAttributeAtTypeHint = null;
        }
        String valueidpUrl = request().getQueryString("idpUrl");
        String idpUrl;
        if (valueidpUrl != null) {
            idpUrl = valueidpUrl;
        } else {
            idpUrl = null;
        }
        String valueidpUrlAtTypeHint = request().getQueryString("idpUrl@TypeHint");
        String idpUrlAtTypeHint;
        if (valueidpUrlAtTypeHint != null) {
            idpUrlAtTypeHint = valueidpUrlAtTypeHint;
        } else {
            idpUrlAtTypeHint = null;
        }
        String valuelogoutUrl = request().getQueryString("logoutUrl");
        String logoutUrl;
        if (valuelogoutUrl != null) {
            logoutUrl = valuelogoutUrl;
        } else {
            logoutUrl = null;
        }
        String valuelogoutUrlAtTypeHint = request().getQueryString("logoutUrl@TypeHint");
        String logoutUrlAtTypeHint;
        if (valuelogoutUrlAtTypeHint != null) {
            logoutUrlAtTypeHint = valuelogoutUrlAtTypeHint;
        } else {
            logoutUrlAtTypeHint = null;
        }
        String valueserviceProviderEntityId = request().getQueryString("serviceProviderEntityId");
        String serviceProviderEntityId;
        if (valueserviceProviderEntityId != null) {
            serviceProviderEntityId = valueserviceProviderEntityId;
        } else {
            serviceProviderEntityId = null;
        }
        String valueserviceProviderEntityIdAtTypeHint = request().getQueryString("serviceProviderEntityId@TypeHint");
        String serviceProviderEntityIdAtTypeHint;
        if (valueserviceProviderEntityIdAtTypeHint != null) {
            serviceProviderEntityIdAtTypeHint = valueserviceProviderEntityIdAtTypeHint;
        } else {
            serviceProviderEntityIdAtTypeHint = null;
        }
        String valueassertionConsumerServiceURL = request().getQueryString("assertionConsumerServiceURL");
        String assertionConsumerServiceURL;
        if (valueassertionConsumerServiceURL != null) {
            assertionConsumerServiceURL = valueassertionConsumerServiceURL;
        } else {
            assertionConsumerServiceURL = null;
        }
        String valueassertionConsumerServiceURLAtTypeHint = request().getQueryString("assertionConsumerServiceURL@TypeHint");
        String assertionConsumerServiceURLAtTypeHint;
        if (valueassertionConsumerServiceURLAtTypeHint != null) {
            assertionConsumerServiceURLAtTypeHint = valueassertionConsumerServiceURLAtTypeHint;
        } else {
            assertionConsumerServiceURLAtTypeHint = null;
        }
        String valuehandleLogout = request().getQueryString("handleLogout");
        Boolean handleLogout;
        if (valuehandleLogout != null) {
            handleLogout = Boolean.valueOf(valuehandleLogout);
        } else {
            handleLogout = null;
        }
        String valuehandleLogoutAtTypeHint = request().getQueryString("handleLogout@TypeHint");
        String handleLogoutAtTypeHint;
        if (valuehandleLogoutAtTypeHint != null) {
            handleLogoutAtTypeHint = valuehandleLogoutAtTypeHint;
        } else {
            handleLogoutAtTypeHint = null;
        }
        String valuespPrivateKeyAlias = request().getQueryString("spPrivateKeyAlias");
        String spPrivateKeyAlias;
        if (valuespPrivateKeyAlias != null) {
            spPrivateKeyAlias = valuespPrivateKeyAlias;
        } else {
            spPrivateKeyAlias = null;
        }
        String valuespPrivateKeyAliasAtTypeHint = request().getQueryString("spPrivateKeyAlias@TypeHint");
        String spPrivateKeyAliasAtTypeHint;
        if (valuespPrivateKeyAliasAtTypeHint != null) {
            spPrivateKeyAliasAtTypeHint = valuespPrivateKeyAliasAtTypeHint;
        } else {
            spPrivateKeyAliasAtTypeHint = null;
        }
        String valueuseEncryption = request().getQueryString("useEncryption");
        Boolean useEncryption;
        if (valueuseEncryption != null) {
            useEncryption = Boolean.valueOf(valueuseEncryption);
        } else {
            useEncryption = null;
        }
        String valueuseEncryptionAtTypeHint = request().getQueryString("useEncryption@TypeHint");
        String useEncryptionAtTypeHint;
        if (valueuseEncryptionAtTypeHint != null) {
            useEncryptionAtTypeHint = valueuseEncryptionAtTypeHint;
        } else {
            useEncryptionAtTypeHint = null;
        }
        String valuenameIdFormat = request().getQueryString("nameIdFormat");
        String nameIdFormat;
        if (valuenameIdFormat != null) {
            nameIdFormat = valuenameIdFormat;
        } else {
            nameIdFormat = null;
        }
        String valuenameIdFormatAtTypeHint = request().getQueryString("nameIdFormat@TypeHint");
        String nameIdFormatAtTypeHint;
        if (valuenameIdFormatAtTypeHint != null) {
            nameIdFormatAtTypeHint = valuenameIdFormatAtTypeHint;
        } else {
            nameIdFormatAtTypeHint = null;
        }
        String valuedigestMethod = request().getQueryString("digestMethod");
        String digestMethod;
        if (valuedigestMethod != null) {
            digestMethod = valuedigestMethod;
        } else {
            digestMethod = null;
        }
        String valuedigestMethodAtTypeHint = request().getQueryString("digestMethod@TypeHint");
        String digestMethodAtTypeHint;
        if (valuedigestMethodAtTypeHint != null) {
            digestMethodAtTypeHint = valuedigestMethodAtTypeHint;
        } else {
            digestMethodAtTypeHint = null;
        }
        String valuesignatureMethod = request().getQueryString("signatureMethod");
        String signatureMethod;
        if (valuesignatureMethod != null) {
            signatureMethod = valuesignatureMethod;
        } else {
            signatureMethod = null;
        }
        String valuesignatureMethodAtTypeHint = request().getQueryString("signatureMethod@TypeHint");
        String signatureMethodAtTypeHint;
        if (valuesignatureMethodAtTypeHint != null) {
            signatureMethodAtTypeHint = valuesignatureMethodAtTypeHint;
        } else {
            signatureMethodAtTypeHint = null;
        }
        String valueuserIntermediatePath = request().getQueryString("userIntermediatePath");
        String userIntermediatePath;
        if (valueuserIntermediatePath != null) {
            userIntermediatePath = valueuserIntermediatePath;
        } else {
            userIntermediatePath = null;
        }
        String valueuserIntermediatePathAtTypeHint = request().getQueryString("userIntermediatePath@TypeHint");
        String userIntermediatePathAtTypeHint;
        if (valueuserIntermediatePathAtTypeHint != null) {
            userIntermediatePathAtTypeHint = valueuserIntermediatePathAtTypeHint;
        } else {
            userIntermediatePathAtTypeHint = null;
        }
        imp.postConfigAdobeGraniteSamlAuthenticationHandler(keyStorePassword, keyStorePasswordAtTypeHint, serviceRanking, serviceRankingAtTypeHint, idpHttpRedirect, idpHttpRedirectAtTypeHint, createUser, createUserAtTypeHint, defaultRedirectUrl, defaultRedirectUrlAtTypeHint, userIDAttribute, userIDAttributeAtTypeHint, defaultGroups, defaultGroupsAtTypeHint, idpCertAlias, idpCertAliasAtTypeHint, addGroupMemberships, addGroupMembershipsAtTypeHint, path, pathAtTypeHint, synchronizeAttributes, synchronizeAttributesAtTypeHint, clockTolerance, clockToleranceAtTypeHint, groupMembershipAttribute, groupMembershipAttributeAtTypeHint, idpUrl, idpUrlAtTypeHint, logoutUrl, logoutUrlAtTypeHint, serviceProviderEntityId, serviceProviderEntityIdAtTypeHint, assertionConsumerServiceURL, assertionConsumerServiceURLAtTypeHint, handleLogout, handleLogoutAtTypeHint, spPrivateKeyAlias, spPrivateKeyAliasAtTypeHint, useEncryption, useEncryptionAtTypeHint, nameIdFormat, nameIdFormatAtTypeHint, digestMethod, digestMethodAtTypeHint, signatureMethod, signatureMethodAtTypeHint, userIntermediatePath, userIntermediatePathAtTypeHint);
        return ok();
    }

    @ApiAction
    public Result postConfigApacheFelixJettyBasedHttpService() throws Exception {
        String valueorgApacheFelixHttpsNio = request().getQueryString("org.apache.felix.https.nio");
        Boolean orgApacheFelixHttpsNio;
        if (valueorgApacheFelixHttpsNio != null) {
            orgApacheFelixHttpsNio = Boolean.valueOf(valueorgApacheFelixHttpsNio);
        } else {
            orgApacheFelixHttpsNio = null;
        }
        String valueorgApacheFelixHttpsNioAtTypeHint = request().getQueryString("org.apache.felix.https.nio@TypeHint");
        String orgApacheFelixHttpsNioAtTypeHint;
        if (valueorgApacheFelixHttpsNioAtTypeHint != null) {
            orgApacheFelixHttpsNioAtTypeHint = valueorgApacheFelixHttpsNioAtTypeHint;
        } else {
            orgApacheFelixHttpsNioAtTypeHint = null;
        }
        String valueorgApacheFelixHttpsKeystore = request().getQueryString("org.apache.felix.https.keystore");
        String orgApacheFelixHttpsKeystore;
        if (valueorgApacheFelixHttpsKeystore != null) {
            orgApacheFelixHttpsKeystore = valueorgApacheFelixHttpsKeystore;
        } else {
            orgApacheFelixHttpsKeystore = null;
        }
        String valueorgApacheFelixHttpsKeystoreAtTypeHint = request().getQueryString("org.apache.felix.https.keystore@TypeHint");
        String orgApacheFelixHttpsKeystoreAtTypeHint;
        if (valueorgApacheFelixHttpsKeystoreAtTypeHint != null) {
            orgApacheFelixHttpsKeystoreAtTypeHint = valueorgApacheFelixHttpsKeystoreAtTypeHint;
        } else {
            orgApacheFelixHttpsKeystoreAtTypeHint = null;
        }
        String valueorgApacheFelixHttpsKeystorePassword = request().getQueryString("org.apache.felix.https.keystore.password");
        String orgApacheFelixHttpsKeystorePassword;
        if (valueorgApacheFelixHttpsKeystorePassword != null) {
            orgApacheFelixHttpsKeystorePassword = valueorgApacheFelixHttpsKeystorePassword;
        } else {
            orgApacheFelixHttpsKeystorePassword = null;
        }
        String valueorgApacheFelixHttpsKeystorePasswordAtTypeHint = request().getQueryString("org.apache.felix.https.keystore.password@TypeHint");
        String orgApacheFelixHttpsKeystorePasswordAtTypeHint;
        if (valueorgApacheFelixHttpsKeystorePasswordAtTypeHint != null) {
            orgApacheFelixHttpsKeystorePasswordAtTypeHint = valueorgApacheFelixHttpsKeystorePasswordAtTypeHint;
        } else {
            orgApacheFelixHttpsKeystorePasswordAtTypeHint = null;
        }
        String valueorgApacheFelixHttpsKeystoreKey = request().getQueryString("org.apache.felix.https.keystore.key");
        String orgApacheFelixHttpsKeystoreKey;
        if (valueorgApacheFelixHttpsKeystoreKey != null) {
            orgApacheFelixHttpsKeystoreKey = valueorgApacheFelixHttpsKeystoreKey;
        } else {
            orgApacheFelixHttpsKeystoreKey = null;
        }
        String valueorgApacheFelixHttpsKeystoreKeyAtTypeHint = request().getQueryString("org.apache.felix.https.keystore.key@TypeHint");
        String orgApacheFelixHttpsKeystoreKeyAtTypeHint;
        if (valueorgApacheFelixHttpsKeystoreKeyAtTypeHint != null) {
            orgApacheFelixHttpsKeystoreKeyAtTypeHint = valueorgApacheFelixHttpsKeystoreKeyAtTypeHint;
        } else {
            orgApacheFelixHttpsKeystoreKeyAtTypeHint = null;
        }
        String valueorgApacheFelixHttpsKeystoreKeyPassword = request().getQueryString("org.apache.felix.https.keystore.key.password");
        String orgApacheFelixHttpsKeystoreKeyPassword;
        if (valueorgApacheFelixHttpsKeystoreKeyPassword != null) {
            orgApacheFelixHttpsKeystoreKeyPassword = valueorgApacheFelixHttpsKeystoreKeyPassword;
        } else {
            orgApacheFelixHttpsKeystoreKeyPassword = null;
        }
        String valueorgApacheFelixHttpsKeystoreKeyPasswordAtTypeHint = request().getQueryString("org.apache.felix.https.keystore.key.password@TypeHint");
        String orgApacheFelixHttpsKeystoreKeyPasswordAtTypeHint;
        if (valueorgApacheFelixHttpsKeystoreKeyPasswordAtTypeHint != null) {
            orgApacheFelixHttpsKeystoreKeyPasswordAtTypeHint = valueorgApacheFelixHttpsKeystoreKeyPasswordAtTypeHint;
        } else {
            orgApacheFelixHttpsKeystoreKeyPasswordAtTypeHint = null;
        }
        String valueorgApacheFelixHttpsTruststore = request().getQueryString("org.apache.felix.https.truststore");
        String orgApacheFelixHttpsTruststore;
        if (valueorgApacheFelixHttpsTruststore != null) {
            orgApacheFelixHttpsTruststore = valueorgApacheFelixHttpsTruststore;
        } else {
            orgApacheFelixHttpsTruststore = null;
        }
        String valueorgApacheFelixHttpsTruststoreAtTypeHint = request().getQueryString("org.apache.felix.https.truststore@TypeHint");
        String orgApacheFelixHttpsTruststoreAtTypeHint;
        if (valueorgApacheFelixHttpsTruststoreAtTypeHint != null) {
            orgApacheFelixHttpsTruststoreAtTypeHint = valueorgApacheFelixHttpsTruststoreAtTypeHint;
        } else {
            orgApacheFelixHttpsTruststoreAtTypeHint = null;
        }
        String valueorgApacheFelixHttpsTruststorePassword = request().getQueryString("org.apache.felix.https.truststore.password");
        String orgApacheFelixHttpsTruststorePassword;
        if (valueorgApacheFelixHttpsTruststorePassword != null) {
            orgApacheFelixHttpsTruststorePassword = valueorgApacheFelixHttpsTruststorePassword;
        } else {
            orgApacheFelixHttpsTruststorePassword = null;
        }
        String valueorgApacheFelixHttpsTruststorePasswordAtTypeHint = request().getQueryString("org.apache.felix.https.truststore.password@TypeHint");
        String orgApacheFelixHttpsTruststorePasswordAtTypeHint;
        if (valueorgApacheFelixHttpsTruststorePasswordAtTypeHint != null) {
            orgApacheFelixHttpsTruststorePasswordAtTypeHint = valueorgApacheFelixHttpsTruststorePasswordAtTypeHint;
        } else {
            orgApacheFelixHttpsTruststorePasswordAtTypeHint = null;
        }
        String valueorgApacheFelixHttpsClientcertificate = request().getQueryString("org.apache.felix.https.clientcertificate");
        String orgApacheFelixHttpsClientcertificate;
        if (valueorgApacheFelixHttpsClientcertificate != null) {
            orgApacheFelixHttpsClientcertificate = valueorgApacheFelixHttpsClientcertificate;
        } else {
            orgApacheFelixHttpsClientcertificate = null;
        }
        String valueorgApacheFelixHttpsClientcertificateAtTypeHint = request().getQueryString("org.apache.felix.https.clientcertificate@TypeHint");
        String orgApacheFelixHttpsClientcertificateAtTypeHint;
        if (valueorgApacheFelixHttpsClientcertificateAtTypeHint != null) {
            orgApacheFelixHttpsClientcertificateAtTypeHint = valueorgApacheFelixHttpsClientcertificateAtTypeHint;
        } else {
            orgApacheFelixHttpsClientcertificateAtTypeHint = null;
        }
        String valueorgApacheFelixHttpsEnable = request().getQueryString("org.apache.felix.https.enable");
        Boolean orgApacheFelixHttpsEnable;
        if (valueorgApacheFelixHttpsEnable != null) {
            orgApacheFelixHttpsEnable = Boolean.valueOf(valueorgApacheFelixHttpsEnable);
        } else {
            orgApacheFelixHttpsEnable = null;
        }
        String valueorgApacheFelixHttpsEnableAtTypeHint = request().getQueryString("org.apache.felix.https.enable@TypeHint");
        String orgApacheFelixHttpsEnableAtTypeHint;
        if (valueorgApacheFelixHttpsEnableAtTypeHint != null) {
            orgApacheFelixHttpsEnableAtTypeHint = valueorgApacheFelixHttpsEnableAtTypeHint;
        } else {
            orgApacheFelixHttpsEnableAtTypeHint = null;
        }
        String valueorgOsgiServiceHttpPortSecure = request().getQueryString("org.osgi.service.http.port.secure");
        String orgOsgiServiceHttpPortSecure;
        if (valueorgOsgiServiceHttpPortSecure != null) {
            orgOsgiServiceHttpPortSecure = valueorgOsgiServiceHttpPortSecure;
        } else {
            orgOsgiServiceHttpPortSecure = null;
        }
        String valueorgOsgiServiceHttpPortSecureAtTypeHint = request().getQueryString("org.osgi.service.http.port.secure@TypeHint");
        String orgOsgiServiceHttpPortSecureAtTypeHint;
        if (valueorgOsgiServiceHttpPortSecureAtTypeHint != null) {
            orgOsgiServiceHttpPortSecureAtTypeHint = valueorgOsgiServiceHttpPortSecureAtTypeHint;
        } else {
            orgOsgiServiceHttpPortSecureAtTypeHint = null;
        }
        imp.postConfigApacheFelixJettyBasedHttpService(orgApacheFelixHttpsNio, orgApacheFelixHttpsNioAtTypeHint, orgApacheFelixHttpsKeystore, orgApacheFelixHttpsKeystoreAtTypeHint, orgApacheFelixHttpsKeystorePassword, orgApacheFelixHttpsKeystorePasswordAtTypeHint, orgApacheFelixHttpsKeystoreKey, orgApacheFelixHttpsKeystoreKeyAtTypeHint, orgApacheFelixHttpsKeystoreKeyPassword, orgApacheFelixHttpsKeystoreKeyPasswordAtTypeHint, orgApacheFelixHttpsTruststore, orgApacheFelixHttpsTruststoreAtTypeHint, orgApacheFelixHttpsTruststorePassword, orgApacheFelixHttpsTruststorePasswordAtTypeHint, orgApacheFelixHttpsClientcertificate, orgApacheFelixHttpsClientcertificateAtTypeHint, orgApacheFelixHttpsEnable, orgApacheFelixHttpsEnableAtTypeHint, orgOsgiServiceHttpPortSecure, orgOsgiServiceHttpPortSecureAtTypeHint);
        return ok();
    }

    @ApiAction
    public Result postConfigApacheHttpComponentsProxyConfiguration() throws Exception {
        String valueproxyHost = request().getQueryString("proxy.host");
        String proxyHost;
        if (valueproxyHost != null) {
            proxyHost = valueproxyHost;
        } else {
            proxyHost = null;
        }
        String valueproxyHostAtTypeHint = request().getQueryString("proxy.host@TypeHint");
        String proxyHostAtTypeHint;
        if (valueproxyHostAtTypeHint != null) {
            proxyHostAtTypeHint = valueproxyHostAtTypeHint;
        } else {
            proxyHostAtTypeHint = null;
        }
        String valueproxyPort = request().getQueryString("proxy.port");
        Integer proxyPort;
        if (valueproxyPort != null) {
            proxyPort = Integer.parseInt(valueproxyPort);
        } else {
            proxyPort = null;
        }
        String valueproxyPortAtTypeHint = request().getQueryString("proxy.port@TypeHint");
        String proxyPortAtTypeHint;
        if (valueproxyPortAtTypeHint != null) {
            proxyPortAtTypeHint = valueproxyPortAtTypeHint;
        } else {
            proxyPortAtTypeHint = null;
        }
        String[] proxyExceptionsArray = request().queryString().get("proxy.exceptions");
        List<String> proxyExceptionsList = OpenAPIUtils.parametersToList("multi", proxyExceptionsArray);
        List<String> proxyExceptions = new ArrayList<String>();
        for (String curParam : proxyExceptionsList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                proxyExceptions.add(curParam);
            }
        }
        String valueproxyExceptionsAtTypeHint = request().getQueryString("proxy.exceptions@TypeHint");
        String proxyExceptionsAtTypeHint;
        if (valueproxyExceptionsAtTypeHint != null) {
            proxyExceptionsAtTypeHint = valueproxyExceptionsAtTypeHint;
        } else {
            proxyExceptionsAtTypeHint = null;
        }
        String valueproxyEnabled = request().getQueryString("proxy.enabled");
        Boolean proxyEnabled;
        if (valueproxyEnabled != null) {
            proxyEnabled = Boolean.valueOf(valueproxyEnabled);
        } else {
            proxyEnabled = null;
        }
        String valueproxyEnabledAtTypeHint = request().getQueryString("proxy.enabled@TypeHint");
        String proxyEnabledAtTypeHint;
        if (valueproxyEnabledAtTypeHint != null) {
            proxyEnabledAtTypeHint = valueproxyEnabledAtTypeHint;
        } else {
            proxyEnabledAtTypeHint = null;
        }
        String valueproxyUser = request().getQueryString("proxy.user");
        String proxyUser;
        if (valueproxyUser != null) {
            proxyUser = valueproxyUser;
        } else {
            proxyUser = null;
        }
        String valueproxyUserAtTypeHint = request().getQueryString("proxy.user@TypeHint");
        String proxyUserAtTypeHint;
        if (valueproxyUserAtTypeHint != null) {
            proxyUserAtTypeHint = valueproxyUserAtTypeHint;
        } else {
            proxyUserAtTypeHint = null;
        }
        String valueproxyPassword = request().getQueryString("proxy.password");
        String proxyPassword;
        if (valueproxyPassword != null) {
            proxyPassword = valueproxyPassword;
        } else {
            proxyPassword = null;
        }
        String valueproxyPasswordAtTypeHint = request().getQueryString("proxy.password@TypeHint");
        String proxyPasswordAtTypeHint;
        if (valueproxyPasswordAtTypeHint != null) {
            proxyPasswordAtTypeHint = valueproxyPasswordAtTypeHint;
        } else {
            proxyPasswordAtTypeHint = null;
        }
        imp.postConfigApacheHttpComponentsProxyConfiguration(proxyHost, proxyHostAtTypeHint, proxyPort, proxyPortAtTypeHint, proxyExceptions, proxyExceptionsAtTypeHint, proxyEnabled, proxyEnabledAtTypeHint, proxyUser, proxyUserAtTypeHint, proxyPassword, proxyPasswordAtTypeHint);
        return ok();
    }

    @ApiAction
    public Result postConfigApacheSlingDavExServlet() throws Exception {
        String valuealias = request().getQueryString("alias");
        String alias;
        if (valuealias != null) {
            alias = valuealias;
        } else {
            alias = null;
        }
        String valuealiasAtTypeHint = request().getQueryString("alias@TypeHint");
        String aliasAtTypeHint;
        if (valuealiasAtTypeHint != null) {
            aliasAtTypeHint = valuealiasAtTypeHint;
        } else {
            aliasAtTypeHint = null;
        }
        String valuedavCreateAbsoluteUri = request().getQueryString("dav.create-absolute-uri");
        Boolean davCreateAbsoluteUri;
        if (valuedavCreateAbsoluteUri != null) {
            davCreateAbsoluteUri = Boolean.valueOf(valuedavCreateAbsoluteUri);
        } else {
            davCreateAbsoluteUri = null;
        }
        String valuedavCreateAbsoluteUriAtTypeHint = request().getQueryString("dav.create-absolute-uri@TypeHint");
        String davCreateAbsoluteUriAtTypeHint;
        if (valuedavCreateAbsoluteUriAtTypeHint != null) {
            davCreateAbsoluteUriAtTypeHint = valuedavCreateAbsoluteUriAtTypeHint;
        } else {
            davCreateAbsoluteUriAtTypeHint = null;
        }
        imp.postConfigApacheSlingDavExServlet(alias, aliasAtTypeHint, davCreateAbsoluteUri, davCreateAbsoluteUriAtTypeHint);
        return ok();
    }

    @ApiAction
    public Result postConfigApacheSlingGetServlet() throws Exception {
        String valuejsonMaximumresults = request().getQueryString("json.maximumresults");
        String jsonMaximumresults;
        if (valuejsonMaximumresults != null) {
            jsonMaximumresults = valuejsonMaximumresults;
        } else {
            jsonMaximumresults = null;
        }
        String valuejsonMaximumresultsAtTypeHint = request().getQueryString("json.maximumresults@TypeHint");
        String jsonMaximumresultsAtTypeHint;
        if (valuejsonMaximumresultsAtTypeHint != null) {
            jsonMaximumresultsAtTypeHint = valuejsonMaximumresultsAtTypeHint;
        } else {
            jsonMaximumresultsAtTypeHint = null;
        }
        String valueenableHtml = request().getQueryString("enable.html");
        Boolean enableHtml;
        if (valueenableHtml != null) {
            enableHtml = Boolean.valueOf(valueenableHtml);
        } else {
            enableHtml = null;
        }
        String valueenableHtmlAtTypeHint = request().getQueryString("enable.html@TypeHint");
        String enableHtmlAtTypeHint;
        if (valueenableHtmlAtTypeHint != null) {
            enableHtmlAtTypeHint = valueenableHtmlAtTypeHint;
        } else {
            enableHtmlAtTypeHint = null;
        }
        String valueenableTxt = request().getQueryString("enable.txt");
        Boolean enableTxt;
        if (valueenableTxt != null) {
            enableTxt = Boolean.valueOf(valueenableTxt);
        } else {
            enableTxt = null;
        }
        String valueenableTxtAtTypeHint = request().getQueryString("enable.txt@TypeHint");
        String enableTxtAtTypeHint;
        if (valueenableTxtAtTypeHint != null) {
            enableTxtAtTypeHint = valueenableTxtAtTypeHint;
        } else {
            enableTxtAtTypeHint = null;
        }
        String valueenableXml = request().getQueryString("enable.xml");
        Boolean enableXml;
        if (valueenableXml != null) {
            enableXml = Boolean.valueOf(valueenableXml);
        } else {
            enableXml = null;
        }
        String valueenableXmlAtTypeHint = request().getQueryString("enable.xml@TypeHint");
        String enableXmlAtTypeHint;
        if (valueenableXmlAtTypeHint != null) {
            enableXmlAtTypeHint = valueenableXmlAtTypeHint;
        } else {
            enableXmlAtTypeHint = null;
        }
        imp.postConfigApacheSlingGetServlet(jsonMaximumresults, jsonMaximumresultsAtTypeHint, enableHtml, enableHtmlAtTypeHint, enableTxt, enableTxtAtTypeHint, enableXml, enableXmlAtTypeHint);
        return ok();
    }

    @ApiAction
    public Result postConfigApacheSlingReferrerFilter() throws Exception {
        String valueallowEmpty = request().getQueryString("allow.empty");
        Boolean allowEmpty;
        if (valueallowEmpty != null) {
            allowEmpty = Boolean.valueOf(valueallowEmpty);
        } else {
            allowEmpty = null;
        }
        String valueallowEmptyAtTypeHint = request().getQueryString("allow.empty@TypeHint");
        String allowEmptyAtTypeHint;
        if (valueallowEmptyAtTypeHint != null) {
            allowEmptyAtTypeHint = valueallowEmptyAtTypeHint;
        } else {
            allowEmptyAtTypeHint = null;
        }
        String valueallowHosts = request().getQueryString("allow.hosts");
        String allowHosts;
        if (valueallowHosts != null) {
            allowHosts = valueallowHosts;
        } else {
            allowHosts = null;
        }
        String valueallowHostsAtTypeHint = request().getQueryString("allow.hosts@TypeHint");
        String allowHostsAtTypeHint;
        if (valueallowHostsAtTypeHint != null) {
            allowHostsAtTypeHint = valueallowHostsAtTypeHint;
        } else {
            allowHostsAtTypeHint = null;
        }
        String valueallowHostsRegexp = request().getQueryString("allow.hosts.regexp");
        String allowHostsRegexp;
        if (valueallowHostsRegexp != null) {
            allowHostsRegexp = valueallowHostsRegexp;
        } else {
            allowHostsRegexp = null;
        }
        String valueallowHostsRegexpAtTypeHint = request().getQueryString("allow.hosts.regexp@TypeHint");
        String allowHostsRegexpAtTypeHint;
        if (valueallowHostsRegexpAtTypeHint != null) {
            allowHostsRegexpAtTypeHint = valueallowHostsRegexpAtTypeHint;
        } else {
            allowHostsRegexpAtTypeHint = null;
        }
        String valuefilterMethods = request().getQueryString("filter.methods");
        String filterMethods;
        if (valuefilterMethods != null) {
            filterMethods = valuefilterMethods;
        } else {
            filterMethods = null;
        }
        String valuefilterMethodsAtTypeHint = request().getQueryString("filter.methods@TypeHint");
        String filterMethodsAtTypeHint;
        if (valuefilterMethodsAtTypeHint != null) {
            filterMethodsAtTypeHint = valuefilterMethodsAtTypeHint;
        } else {
            filterMethodsAtTypeHint = null;
        }
        imp.postConfigApacheSlingReferrerFilter(allowEmpty, allowEmptyAtTypeHint, allowHosts, allowHostsAtTypeHint, allowHostsRegexp, allowHostsRegexpAtTypeHint, filterMethods, filterMethodsAtTypeHint);
        return ok();
    }

    @ApiAction
    public Result postNode(String path,String name) throws Exception {
        String valuecolonOperation = request().getQueryString(":operation");
        String colonOperation;
        if (valuecolonOperation != null) {
            colonOperation = valuecolonOperation;
        } else {
            colonOperation = null;
        }
        String valuedeleteAuthorizable = request().getQueryString("deleteAuthorizable");
        String deleteAuthorizable;
        if (valuedeleteAuthorizable != null) {
            deleteAuthorizable = valuedeleteAuthorizable;
        } else {
            deleteAuthorizable = null;
        }
        Http.MultipartFormData.FilePart file = request().body().asMultipartFormData().getFile("file");
        imp.postNode(path, name, colonOperation, deleteAuthorizable, file);
        return ok();
    }

    @ApiAction
    public Result postNodeRw(String path,String name) throws Exception {
        String valueaddMembers = request().getQueryString("addMembers");
        String addMembers;
        if (valueaddMembers != null) {
            addMembers = valueaddMembers;
        } else {
            addMembers = null;
        }
        imp.postNodeRw(path, name, addMembers);
        return ok();
    }

    @ApiAction
    public Result postPath(String path) throws Exception {
        String valuejcrColonPrimaryType = request().getQueryString("jcr:primaryType");
        String jcrColonPrimaryType;
        if (valuejcrColonPrimaryType != null) {
            jcrColonPrimaryType = valuejcrColonPrimaryType;
        } else {
            throw new IllegalArgumentException("'jcr:primaryType' parameter is required");
        }
        String valuecolonName = request().getQueryString(":name");
        String colonName;
        if (valuecolonName != null) {
            colonName = valuecolonName;
        } else {
            throw new IllegalArgumentException("':name' parameter is required");
        }
        imp.postPath(path, jcrColonPrimaryType, colonName);
        return ok();
    }

    @ApiAction
    public Result postQuery() throws Exception {
        String valuepath = request().getQueryString("path");
        String path;
        if (valuepath != null) {
            path = valuepath;
        } else {
            throw new IllegalArgumentException("'path' parameter is required");
        }
        String valuepLimit = request().getQueryString("p.limit");
        BigDecimal pLimit;
        if (valuepLimit != null) {
            pLimit = Double.parseDouble(valuepLimit);
        } else {
            throw new IllegalArgumentException("'p.limit' parameter is required");
        }
        String value_1property = request().getQueryString("1_property");
        String _1property;
        if (value_1property != null) {
            _1property = value_1property;
        } else {
            throw new IllegalArgumentException("'1_property' parameter is required");
        }
        String value_1propertyValue = request().getQueryString("1_property.value");
        String _1propertyValue;
        if (value_1propertyValue != null) {
            _1propertyValue = value_1propertyValue;
        } else {
            throw new IllegalArgumentException("'1_property.value' parameter is required");
        }
        String obj = imp.postQuery(path, pLimit, _1property, _1propertyValue);
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
    }

    @ApiAction
    public Result postTreeActivation() throws Exception {
        String valueignoredeactivated = request().getQueryString("ignoredeactivated");
        Boolean ignoredeactivated;
        if (valueignoredeactivated != null) {
            ignoredeactivated = Boolean.valueOf(valueignoredeactivated);
        } else {
            throw new IllegalArgumentException("'ignoredeactivated' parameter is required");
        }
        String valueonlymodified = request().getQueryString("onlymodified");
        Boolean onlymodified;
        if (valueonlymodified != null) {
            onlymodified = Boolean.valueOf(valueonlymodified);
        } else {
            throw new IllegalArgumentException("'onlymodified' parameter is required");
        }
        String valuepath = request().getQueryString("path");
        String path;
        if (valuepath != null) {
            path = valuepath;
        } else {
            throw new IllegalArgumentException("'path' parameter is required");
        }
        imp.postTreeActivation(ignoredeactivated, onlymodified, path);
        return ok();
    }

    @ApiAction
    public Result postTruststore() throws Exception {
        String valuecolonOperation = request().getQueryString(":operation");
        String colonOperation;
        if (valuecolonOperation != null) {
            colonOperation = valuecolonOperation;
        } else {
            colonOperation = null;
        }
        String valuenewPassword = request().getQueryString("newPassword");
        String newPassword;
        if (valuenewPassword != null) {
            newPassword = valuenewPassword;
        } else {
            newPassword = null;
        }
        String valuerePassword = request().getQueryString("rePassword");
        String rePassword;
        if (valuerePassword != null) {
            rePassword = valuerePassword;
        } else {
            rePassword = null;
        }
        String valuekeyStoreType = request().getQueryString("keyStoreType");
        String keyStoreType;
        if (valuekeyStoreType != null) {
            keyStoreType = valuekeyStoreType;
        } else {
            keyStoreType = null;
        }
        String valueremoveAlias = request().getQueryString("removeAlias");
        String removeAlias;
        if (valueremoveAlias != null) {
            removeAlias = valueremoveAlias;
        } else {
            removeAlias = null;
        }
        Http.MultipartFormData.FilePart certificate = request().body().asMultipartFormData().getFile("certificate");
        String obj = imp.postTruststore(colonOperation, newPassword, rePassword, keyStoreType, removeAlias, certificate);
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
    }

    @ApiAction
    public Result postTruststorePKCS12() throws Exception {
        Http.MultipartFormData.FilePart truststoreP12 = request().body().asMultipartFormData().getFile("truststore.p12");
        String obj = imp.postTruststorePKCS12(truststoreP12);
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
    }
}
