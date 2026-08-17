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
import javax.validation.Valid;
import com.typesafe.config.Config;

import openapitools.OpenAPIUtils.ApiAction;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-17T02:15:17.717598878Z[Etc/UTC]", comments = "Generator version: 7.24.0")
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
        String valuejcrContentCqDistribute = request.getQueryString("jcr:content/cq:distribute");
        Boolean jcrContentCqDistribute;
        if (valuejcrContentCqDistribute != null) {
            jcrContentCqDistribute = Boolean.valueOf(valuejcrContentCqDistribute);
        } else {
            jcrContentCqDistribute = null;
        }
        String valuejcrContentCqDistributeAtTypeHint = request.getQueryString("jcr:content/cq:distribute@TypeHint");
        String jcrContentCqDistributeAtTypeHint;
        if (valuejcrContentCqDistributeAtTypeHint != null) {
            jcrContentCqDistributeAtTypeHint = valuejcrContentCqDistributeAtTypeHint;
        } else {
            jcrContentCqDistributeAtTypeHint = null;
        }
        String valuejcrContentCqName = request.getQueryString("jcr:content/cq:name");
        String jcrContentCqName;
        if (valuejcrContentCqName != null) {
            jcrContentCqName = valuejcrContentCqName;
        } else {
            jcrContentCqName = null;
        }
        String valuejcrContentCqTemplate = request.getQueryString("jcr:content/cq:template");
        String jcrContentCqTemplate;
        if (valuejcrContentCqTemplate != null) {
            jcrContentCqTemplate = valuejcrContentCqTemplate;
        } else {
            jcrContentCqTemplate = null;
        }
        String valuejcrContentAliasUpdate = request.getQueryString("jcr:content/aliasUpdate");
        Boolean jcrContentAliasUpdate;
        if (valuejcrContentAliasUpdate != null) {
            jcrContentAliasUpdate = Boolean.valueOf(valuejcrContentAliasUpdate);
        } else {
            jcrContentAliasUpdate = null;
        }
        String valuejcrContentEnabled = request.getQueryString("jcr:content/enabled");
        Boolean jcrContentEnabled;
        if (valuejcrContentEnabled != null) {
            jcrContentEnabled = Boolean.valueOf(valuejcrContentEnabled);
        } else {
            jcrContentEnabled = null;
        }
        String valuejcrContentJcrDescription = request.getQueryString("jcr:content/jcr:description");
        String jcrContentJcrDescription;
        if (valuejcrContentJcrDescription != null) {
            jcrContentJcrDescription = valuejcrContentJcrDescription;
        } else {
            jcrContentJcrDescription = null;
        }
        String valuejcrContentJcrLastModified = request.getQueryString("jcr:content/jcr:lastModified");
        String jcrContentJcrLastModified;
        if (valuejcrContentJcrLastModified != null) {
            jcrContentJcrLastModified = valuejcrContentJcrLastModified;
        } else {
            jcrContentJcrLastModified = null;
        }
        String valuejcrContentJcrLastModifiedBy = request.getQueryString("jcr:content/jcr:lastModifiedBy");
        String jcrContentJcrLastModifiedBy;
        if (valuejcrContentJcrLastModifiedBy != null) {
            jcrContentJcrLastModifiedBy = valuejcrContentJcrLastModifiedBy;
        } else {
            jcrContentJcrLastModifiedBy = null;
        }
        String valuejcrContentJcrMixinTypes = request.getQueryString("jcr:content/jcr:mixinTypes");
        String jcrContentJcrMixinTypes;
        if (valuejcrContentJcrMixinTypes != null) {
            jcrContentJcrMixinTypes = valuejcrContentJcrMixinTypes;
        } else {
            jcrContentJcrMixinTypes = null;
        }
        String valuejcrContentJcrTitle = request.getQueryString("jcr:content/jcr:title");
        String jcrContentJcrTitle;
        if (valuejcrContentJcrTitle != null) {
            jcrContentJcrTitle = valuejcrContentJcrTitle;
        } else {
            jcrContentJcrTitle = null;
        }
        String valuejcrContentLogLevel = request.getQueryString("jcr:content/logLevel");
        String jcrContentLogLevel;
        if (valuejcrContentLogLevel != null) {
            jcrContentLogLevel = valuejcrContentLogLevel;
        } else {
            jcrContentLogLevel = null;
        }
        String valuejcrContentNoStatusUpdate = request.getQueryString("jcr:content/noStatusUpdate");
        Boolean jcrContentNoStatusUpdate;
        if (valuejcrContentNoStatusUpdate != null) {
            jcrContentNoStatusUpdate = Boolean.valueOf(valuejcrContentNoStatusUpdate);
        } else {
            jcrContentNoStatusUpdate = null;
        }
        String valuejcrContentNoVersioning = request.getQueryString("jcr:content/noVersioning");
        Boolean jcrContentNoVersioning;
        if (valuejcrContentNoVersioning != null) {
            jcrContentNoVersioning = Boolean.valueOf(valuejcrContentNoVersioning);
        } else {
            jcrContentNoVersioning = null;
        }
        String valuejcrContentProtocolConnectTimeout = request.getQueryString("jcr:content/protocolConnectTimeout");
        BigDecimal jcrContentProtocolConnectTimeout;
        if (valuejcrContentProtocolConnectTimeout != null) {
            jcrContentProtocolConnectTimeout = new BigDecimal(valuejcrContentProtocolConnectTimeout);
        } else {
            jcrContentProtocolConnectTimeout = null;
        }
        String valuejcrContentProtocolHTTPConnectionClosed = request.getQueryString("jcr:content/protocolHTTPConnectionClosed");
        Boolean jcrContentProtocolHTTPConnectionClosed;
        if (valuejcrContentProtocolHTTPConnectionClosed != null) {
            jcrContentProtocolHTTPConnectionClosed = Boolean.valueOf(valuejcrContentProtocolHTTPConnectionClosed);
        } else {
            jcrContentProtocolHTTPConnectionClosed = null;
        }
        String valuejcrContentProtocolHTTPExpired = request.getQueryString("jcr:content/protocolHTTPExpired");
        String jcrContentProtocolHTTPExpired;
        if (valuejcrContentProtocolHTTPExpired != null) {
            jcrContentProtocolHTTPExpired = valuejcrContentProtocolHTTPExpired;
        } else {
            jcrContentProtocolHTTPExpired = null;
        }
        String[] jcrContentProtocolHTTPHeadersArray = request.queryString().get("jcr:content/protocolHTTPHeaders");
        List<String> jcrContentProtocolHTTPHeadersList = OpenAPIUtils.parametersToList("multi", jcrContentProtocolHTTPHeadersArray);
        List<String> jcrContentProtocolHTTPHeaders = new ArrayList<>();
        for (String curParam : jcrContentProtocolHTTPHeadersList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                jcrContentProtocolHTTPHeaders.add(curParam);
            }
        }
        String valuejcrContentProtocolHTTPHeadersAtTypeHint = request.getQueryString("jcr:content/protocolHTTPHeaders@TypeHint");
        String jcrContentProtocolHTTPHeadersAtTypeHint;
        if (valuejcrContentProtocolHTTPHeadersAtTypeHint != null) {
            jcrContentProtocolHTTPHeadersAtTypeHint = valuejcrContentProtocolHTTPHeadersAtTypeHint;
        } else {
            jcrContentProtocolHTTPHeadersAtTypeHint = null;
        }
        String valuejcrContentProtocolHTTPMethod = request.getQueryString("jcr:content/protocolHTTPMethod");
        String jcrContentProtocolHTTPMethod;
        if (valuejcrContentProtocolHTTPMethod != null) {
            jcrContentProtocolHTTPMethod = valuejcrContentProtocolHTTPMethod;
        } else {
            jcrContentProtocolHTTPMethod = null;
        }
        String valuejcrContentProtocolHTTPSRelaxed = request.getQueryString("jcr:content/protocolHTTPSRelaxed");
        Boolean jcrContentProtocolHTTPSRelaxed;
        if (valuejcrContentProtocolHTTPSRelaxed != null) {
            jcrContentProtocolHTTPSRelaxed = Boolean.valueOf(valuejcrContentProtocolHTTPSRelaxed);
        } else {
            jcrContentProtocolHTTPSRelaxed = null;
        }
        String valuejcrContentProtocolInterface = request.getQueryString("jcr:content/protocolInterface");
        String jcrContentProtocolInterface;
        if (valuejcrContentProtocolInterface != null) {
            jcrContentProtocolInterface = valuejcrContentProtocolInterface;
        } else {
            jcrContentProtocolInterface = null;
        }
        String valuejcrContentProtocolSocketTimeout = request.getQueryString("jcr:content/protocolSocketTimeout");
        BigDecimal jcrContentProtocolSocketTimeout;
        if (valuejcrContentProtocolSocketTimeout != null) {
            jcrContentProtocolSocketTimeout = new BigDecimal(valuejcrContentProtocolSocketTimeout);
        } else {
            jcrContentProtocolSocketTimeout = null;
        }
        String valuejcrContentProtocolVersion = request.getQueryString("jcr:content/protocolVersion");
        String jcrContentProtocolVersion;
        if (valuejcrContentProtocolVersion != null) {
            jcrContentProtocolVersion = valuejcrContentProtocolVersion;
        } else {
            jcrContentProtocolVersion = null;
        }
        String valuejcrContentProxyNTLMDomain = request.getQueryString("jcr:content/proxyNTLMDomain");
        String jcrContentProxyNTLMDomain;
        if (valuejcrContentProxyNTLMDomain != null) {
            jcrContentProxyNTLMDomain = valuejcrContentProxyNTLMDomain;
        } else {
            jcrContentProxyNTLMDomain = null;
        }
        String valuejcrContentProxyNTLMHost = request.getQueryString("jcr:content/proxyNTLMHost");
        String jcrContentProxyNTLMHost;
        if (valuejcrContentProxyNTLMHost != null) {
            jcrContentProxyNTLMHost = valuejcrContentProxyNTLMHost;
        } else {
            jcrContentProxyNTLMHost = null;
        }
        String valuejcrContentProxyHost = request.getQueryString("jcr:content/proxyHost");
        String jcrContentProxyHost;
        if (valuejcrContentProxyHost != null) {
            jcrContentProxyHost = valuejcrContentProxyHost;
        } else {
            jcrContentProxyHost = null;
        }
        String valuejcrContentProxyPassword = request.getQueryString("jcr:content/proxyPassword");
        String jcrContentProxyPassword;
        if (valuejcrContentProxyPassword != null) {
            jcrContentProxyPassword = valuejcrContentProxyPassword;
        } else {
            jcrContentProxyPassword = null;
        }
        String valuejcrContentProxyPort = request.getQueryString("jcr:content/proxyPort");
        BigDecimal jcrContentProxyPort;
        if (valuejcrContentProxyPort != null) {
            jcrContentProxyPort = new BigDecimal(valuejcrContentProxyPort);
        } else {
            jcrContentProxyPort = null;
        }
        String valuejcrContentProxyUser = request.getQueryString("jcr:content/proxyUser");
        String jcrContentProxyUser;
        if (valuejcrContentProxyUser != null) {
            jcrContentProxyUser = valuejcrContentProxyUser;
        } else {
            jcrContentProxyUser = null;
        }
        String valuejcrContentQueueBatchMaxSize = request.getQueryString("jcr:content/queueBatchMaxSize");
        BigDecimal jcrContentQueueBatchMaxSize;
        if (valuejcrContentQueueBatchMaxSize != null) {
            jcrContentQueueBatchMaxSize = new BigDecimal(valuejcrContentQueueBatchMaxSize);
        } else {
            jcrContentQueueBatchMaxSize = null;
        }
        String valuejcrContentQueueBatchMode = request.getQueryString("jcr:content/queueBatchMode");
        String jcrContentQueueBatchMode;
        if (valuejcrContentQueueBatchMode != null) {
            jcrContentQueueBatchMode = valuejcrContentQueueBatchMode;
        } else {
            jcrContentQueueBatchMode = null;
        }
        String valuejcrContentQueueBatchWaitTime = request.getQueryString("jcr:content/queueBatchWaitTime");
        BigDecimal jcrContentQueueBatchWaitTime;
        if (valuejcrContentQueueBatchWaitTime != null) {
            jcrContentQueueBatchWaitTime = new BigDecimal(valuejcrContentQueueBatchWaitTime);
        } else {
            jcrContentQueueBatchWaitTime = null;
        }
        String valuejcrContentRetryDelay = request.getQueryString("jcr:content/retryDelay");
        String jcrContentRetryDelay;
        if (valuejcrContentRetryDelay != null) {
            jcrContentRetryDelay = valuejcrContentRetryDelay;
        } else {
            jcrContentRetryDelay = null;
        }
        String valuejcrContentReverseReplication = request.getQueryString("jcr:content/reverseReplication");
        Boolean jcrContentReverseReplication;
        if (valuejcrContentReverseReplication != null) {
            jcrContentReverseReplication = Boolean.valueOf(valuejcrContentReverseReplication);
        } else {
            jcrContentReverseReplication = null;
        }
        String valuejcrContentSerializationType = request.getQueryString("jcr:content/serializationType");
        String jcrContentSerializationType;
        if (valuejcrContentSerializationType != null) {
            jcrContentSerializationType = valuejcrContentSerializationType;
        } else {
            jcrContentSerializationType = null;
        }
        String valuejcrContentSlingResourceType = request.getQueryString("jcr:content/sling:resourceType");
        String jcrContentSlingResourceType;
        if (valuejcrContentSlingResourceType != null) {
            jcrContentSlingResourceType = valuejcrContentSlingResourceType;
        } else {
            jcrContentSlingResourceType = null;
        }
        String valuejcrContentSsl = request.getQueryString("jcr:content/ssl");
        String jcrContentSsl;
        if (valuejcrContentSsl != null) {
            jcrContentSsl = valuejcrContentSsl;
        } else {
            jcrContentSsl = null;
        }
        String valuejcrContentTransportNTLMDomain = request.getQueryString("jcr:content/transportNTLMDomain");
        String jcrContentTransportNTLMDomain;
        if (valuejcrContentTransportNTLMDomain != null) {
            jcrContentTransportNTLMDomain = valuejcrContentTransportNTLMDomain;
        } else {
            jcrContentTransportNTLMDomain = null;
        }
        String valuejcrContentTransportNTLMHost = request.getQueryString("jcr:content/transportNTLMHost");
        String jcrContentTransportNTLMHost;
        if (valuejcrContentTransportNTLMHost != null) {
            jcrContentTransportNTLMHost = valuejcrContentTransportNTLMHost;
        } else {
            jcrContentTransportNTLMHost = null;
        }
        String valuejcrContentTransportPassword = request.getQueryString("jcr:content/transportPassword");
        String jcrContentTransportPassword;
        if (valuejcrContentTransportPassword != null) {
            jcrContentTransportPassword = valuejcrContentTransportPassword;
        } else {
            jcrContentTransportPassword = null;
        }
        String valuejcrContentTransportUri = request.getQueryString("jcr:content/transportUri");
        String jcrContentTransportUri;
        if (valuejcrContentTransportUri != null) {
            jcrContentTransportUri = valuejcrContentTransportUri;
        } else {
            jcrContentTransportUri = null;
        }
        String valuejcrContentTransportUser = request.getQueryString("jcr:content/transportUser");
        String jcrContentTransportUser;
        if (valuejcrContentTransportUser != null) {
            jcrContentTransportUser = valuejcrContentTransportUser;
        } else {
            jcrContentTransportUser = null;
        }
        String valuejcrContentTriggerDistribute = request.getQueryString("jcr:content/triggerDistribute");
        Boolean jcrContentTriggerDistribute;
        if (valuejcrContentTriggerDistribute != null) {
            jcrContentTriggerDistribute = Boolean.valueOf(valuejcrContentTriggerDistribute);
        } else {
            jcrContentTriggerDistribute = null;
        }
        String valuejcrContentTriggerModified = request.getQueryString("jcr:content/triggerModified");
        Boolean jcrContentTriggerModified;
        if (valuejcrContentTriggerModified != null) {
            jcrContentTriggerModified = Boolean.valueOf(valuejcrContentTriggerModified);
        } else {
            jcrContentTriggerModified = null;
        }
        String valuejcrContentTriggerOnOffTime = request.getQueryString("jcr:content/triggerOnOffTime");
        Boolean jcrContentTriggerOnOffTime;
        if (valuejcrContentTriggerOnOffTime != null) {
            jcrContentTriggerOnOffTime = Boolean.valueOf(valuejcrContentTriggerOnOffTime);
        } else {
            jcrContentTriggerOnOffTime = null;
        }
        String valuejcrContentTriggerReceive = request.getQueryString("jcr:content/triggerReceive");
        Boolean jcrContentTriggerReceive;
        if (valuejcrContentTriggerReceive != null) {
            jcrContentTriggerReceive = Boolean.valueOf(valuejcrContentTriggerReceive);
        } else {
            jcrContentTriggerReceive = null;
        }
        String valuejcrContentTriggerSpecific = request.getQueryString("jcr:content/triggerSpecific");
        Boolean jcrContentTriggerSpecific;
        if (valuejcrContentTriggerSpecific != null) {
            jcrContentTriggerSpecific = Boolean.valueOf(valuejcrContentTriggerSpecific);
        } else {
            jcrContentTriggerSpecific = null;
        }
        String valuejcrContentUserId = request.getQueryString("jcr:content/userId");
        String jcrContentUserId;
        if (valuejcrContentUserId != null) {
            jcrContentUserId = valuejcrContentUserId;
        } else {
            jcrContentUserId = null;
        }
        String valuejcrPrimaryType = request.getQueryString("jcr:primaryType");
        String jcrPrimaryType;
        if (valuejcrPrimaryType != null) {
            jcrPrimaryType = valuejcrPrimaryType;
        } else {
            jcrPrimaryType = null;
        }
        String valueoperation = request.getQueryString(":operation");
        String operation;
        if (valueoperation != null) {
            operation = valueoperation;
        } else {
            operation = null;
        }
        return imp.postAgentHttp(request, runmode, name, jcrContentCqDistribute, jcrContentCqDistributeAtTypeHint, jcrContentCqName, jcrContentCqTemplate, jcrContentAliasUpdate, jcrContentEnabled, jcrContentJcrDescription, jcrContentJcrLastModified, jcrContentJcrLastModifiedBy, jcrContentJcrMixinTypes, jcrContentJcrTitle, jcrContentLogLevel, jcrContentNoStatusUpdate, jcrContentNoVersioning, jcrContentProtocolConnectTimeout, jcrContentProtocolHTTPConnectionClosed, jcrContentProtocolHTTPExpired, jcrContentProtocolHTTPHeaders, jcrContentProtocolHTTPHeadersAtTypeHint, jcrContentProtocolHTTPMethod, jcrContentProtocolHTTPSRelaxed, jcrContentProtocolInterface, jcrContentProtocolSocketTimeout, jcrContentProtocolVersion, jcrContentProxyNTLMDomain, jcrContentProxyNTLMHost, jcrContentProxyHost, jcrContentProxyPassword, jcrContentProxyPort, jcrContentProxyUser, jcrContentQueueBatchMaxSize, jcrContentQueueBatchMode, jcrContentQueueBatchWaitTime, jcrContentRetryDelay, jcrContentReverseReplication, jcrContentSerializationType, jcrContentSlingResourceType, jcrContentSsl, jcrContentTransportNTLMDomain, jcrContentTransportNTLMHost, jcrContentTransportPassword, jcrContentTransportUri, jcrContentTransportUser, jcrContentTriggerDistribute, jcrContentTriggerModified, jcrContentTriggerOnOffTime, jcrContentTriggerReceive, jcrContentTriggerSpecific, jcrContentUserId, jcrPrimaryType, operation);
    }

    @ApiAction
    public Result postAuthorizableKeystore(Http.Request request, String intermediatePath,String authorizableId) throws Exception {
        String valueoperation = request.getQueryString(":operation");
        String operation;
        if (valueoperation != null) {
            operation = valueoperation;
        } else {
            operation = null;
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
        return imp.postAuthorizableKeystoreHttp(request, intermediatePath, authorizableId, operation, currentPassword, newPassword, rePassword, keyPassword, keyStorePass, alias, newAlias, removeAlias, certChain, pk, keyStore);
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
        String valuerepPassword = request.getQueryString("rep:password");
        String repPassword;
        if (valuerepPassword != null) {
            repPassword = valuerepPassword;
        } else {
            repPassword = null;
        }
        String valueprofileGivenName = request.getQueryString("profile/givenName");
        String profileGivenName;
        if (valueprofileGivenName != null) {
            profileGivenName = valueprofileGivenName;
        } else {
            profileGivenName = null;
        }
        return imp.postAuthorizablesHttp(request, authorizableId, intermediatePath, createUser, createGroup, repPassword, profileGivenName);
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
        String valueoperation = request.getQueryString(":operation");
        String operation;
        if (valueoperation != null) {
            operation = valueoperation;
        } else {
            operation = null;
        }
        String valuedeleteAuthorizable = request.getQueryString("deleteAuthorizable");
        String deleteAuthorizable;
        if (valuedeleteAuthorizable != null) {
            deleteAuthorizable = valuedeleteAuthorizable;
        } else {
            deleteAuthorizable = null;
        }
        Http.MultipartFormData<TemporaryFile> body_file = request.body().asMultipartFormData();
        Http.MultipartFormData.FilePart<TemporaryFile> _file = body_file.getFile("file");
        return imp.postNodeHttp(request, path, name, operation, deleteAuthorizable, _file);
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
        String valuejcrPrimaryType = request.getQueryString("jcr:primaryType");
        String jcrPrimaryType;
        if (valuejcrPrimaryType != null) {
            jcrPrimaryType = valuejcrPrimaryType;
        } else {
            throw new IllegalArgumentException("'jcr:primaryType' parameter is required");
        }
        String valuename = request.getQueryString(":name");
        String name;
        if (valuename != null) {
            name = valuename;
        } else {
            throw new IllegalArgumentException("':name' parameter is required");
        }
        return imp.postPathHttp(request, path, jcrPrimaryType, name);
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
        String valuecmd = request.getQueryString("cmd");
        String cmd;
        if (valuecmd != null) {
            cmd = valuecmd;
        } else {
            throw new IllegalArgumentException("'cmd' parameter is required");
        }
        return imp.postTreeActivationHttp(request, ignoredeactivated, onlymodified, path, cmd);
    }

    @ApiAction
    public Result postTruststore(Http.Request request) throws Exception {
        String valueoperation = request.getQueryString(":operation");
        String operation;
        if (valueoperation != null) {
            operation = valueoperation;
        } else {
            operation = null;
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
        return imp.postTruststoreHttp(request, operation, newPassword, rePassword, keyStoreType, removeAlias, certificate);
    }

    @ApiAction
    public Result postTruststorePKCS12(Http.Request request) throws Exception {
        Http.MultipartFormData<TemporaryFile> bodytruststoreP12 = request.body().asMultipartFormData();
        Http.MultipartFormData.FilePart<TemporaryFile> truststoreP12 = bodytruststoreP12.getFile("truststore.p12");
        return imp.postTruststorePKCS12Http(request, truststoreP12);
    }

}
