package controllers;

import apimodels.SamlConfigurationInfo;

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

public class ConsoleApiController extends Controller {

    private final ConsoleApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Configuration configuration;

    @Inject
    private ConsoleApiController(Configuration configuration, ConsoleApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }


    @ApiAction
    public Result getAemProductInfo() throws Exception {
        List<String> obj = imp.getAemProductInfo();
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
    }

    @ApiAction
    public Result getConfigMgr() throws Exception {
        String obj = imp.getConfigMgr();
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
    }

    @ApiAction
    public Result postBundle(String name) throws Exception {
        String valueaction = request().getQueryString("action");
        String action;
        if (valueaction != null) {
            action = valueaction;
        } else {
            throw new IllegalArgumentException("'action' parameter is required");
        }
        imp.postBundle(name, action);
        return ok();
    }

    @ApiAction
    public Result postJmxRepository(String action) throws Exception {
        imp.postJmxRepository(action);
        return ok();
    }

    @ApiAction
    public Result postSamlConfiguration() throws Exception {
        String valuepost = request().getQueryString("post");
        Boolean post;
        if (valuepost != null) {
            post = Boolean.valueOf(valuepost);
        } else {
            post = null;
        }
        String valueapply = request().getQueryString("apply");
        Boolean apply;
        if (valueapply != null) {
            apply = Boolean.valueOf(valueapply);
        } else {
            apply = null;
        }
        String valuedelete = request().getQueryString("delete");
        Boolean delete;
        if (valuedelete != null) {
            delete = Boolean.valueOf(valuedelete);
        } else {
            delete = null;
        }
        String valueaction = request().getQueryString("action");
        String action;
        if (valueaction != null) {
            action = valueaction;
        } else {
            action = null;
        }
        String value$location = request().getQueryString("$location");
        String $location;
        if (value$location != null) {
            $location = value$location;
        } else {
            $location = null;
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
        String valueserviceRanking = request().getQueryString("service.ranking");
        Integer serviceRanking;
        if (valueserviceRanking != null) {
            serviceRanking = Integer.parseInt(valueserviceRanking);
        } else {
            serviceRanking = null;
        }
        String valueidpUrl = request().getQueryString("idpUrl");
        String idpUrl;
        if (valueidpUrl != null) {
            idpUrl = valueidpUrl;
        } else {
            idpUrl = null;
        }
        String valueidpCertAlias = request().getQueryString("idpCertAlias");
        String idpCertAlias;
        if (valueidpCertAlias != null) {
            idpCertAlias = valueidpCertAlias;
        } else {
            idpCertAlias = null;
        }
        String valueidpHttpRedirect = request().getQueryString("idpHttpRedirect");
        Boolean idpHttpRedirect;
        if (valueidpHttpRedirect != null) {
            idpHttpRedirect = Boolean.valueOf(valueidpHttpRedirect);
        } else {
            idpHttpRedirect = null;
        }
        String valueserviceProviderEntityId = request().getQueryString("serviceProviderEntityId");
        String serviceProviderEntityId;
        if (valueserviceProviderEntityId != null) {
            serviceProviderEntityId = valueserviceProviderEntityId;
        } else {
            serviceProviderEntityId = null;
        }
        String valueassertionConsumerServiceURL = request().getQueryString("assertionConsumerServiceURL");
        String assertionConsumerServiceURL;
        if (valueassertionConsumerServiceURL != null) {
            assertionConsumerServiceURL = valueassertionConsumerServiceURL;
        } else {
            assertionConsumerServiceURL = null;
        }
        String valuespPrivateKeyAlias = request().getQueryString("spPrivateKeyAlias");
        String spPrivateKeyAlias;
        if (valuespPrivateKeyAlias != null) {
            spPrivateKeyAlias = valuespPrivateKeyAlias;
        } else {
            spPrivateKeyAlias = null;
        }
        String valuekeyStorePassword = request().getQueryString("keyStorePassword");
        String keyStorePassword;
        if (valuekeyStorePassword != null) {
            keyStorePassword = valuekeyStorePassword;
        } else {
            keyStorePassword = null;
        }
        String valuedefaultRedirectUrl = request().getQueryString("defaultRedirectUrl");
        String defaultRedirectUrl;
        if (valuedefaultRedirectUrl != null) {
            defaultRedirectUrl = valuedefaultRedirectUrl;
        } else {
            defaultRedirectUrl = null;
        }
        String valueuserIDAttribute = request().getQueryString("userIDAttribute");
        String userIDAttribute;
        if (valueuserIDAttribute != null) {
            userIDAttribute = valueuserIDAttribute;
        } else {
            userIDAttribute = null;
        }
        String valueuseEncryption = request().getQueryString("useEncryption");
        Boolean useEncryption;
        if (valueuseEncryption != null) {
            useEncryption = Boolean.valueOf(valueuseEncryption);
        } else {
            useEncryption = null;
        }
        String valuecreateUser = request().getQueryString("createUser");
        Boolean createUser;
        if (valuecreateUser != null) {
            createUser = Boolean.valueOf(valuecreateUser);
        } else {
            createUser = null;
        }
        String valueaddGroupMemberships = request().getQueryString("addGroupMemberships");
        Boolean addGroupMemberships;
        if (valueaddGroupMemberships != null) {
            addGroupMemberships = Boolean.valueOf(valueaddGroupMemberships);
        } else {
            addGroupMemberships = null;
        }
        String valuegroupMembershipAttribute = request().getQueryString("groupMembershipAttribute");
        String groupMembershipAttribute;
        if (valuegroupMembershipAttribute != null) {
            groupMembershipAttribute = valuegroupMembershipAttribute;
        } else {
            groupMembershipAttribute = null;
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
        String valuenameIdFormat = request().getQueryString("nameIdFormat");
        String nameIdFormat;
        if (valuenameIdFormat != null) {
            nameIdFormat = valuenameIdFormat;
        } else {
            nameIdFormat = null;
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
        String valuehandleLogout = request().getQueryString("handleLogout");
        Boolean handleLogout;
        if (valuehandleLogout != null) {
            handleLogout = Boolean.valueOf(valuehandleLogout);
        } else {
            handleLogout = null;
        }
        String valuelogoutUrl = request().getQueryString("logoutUrl");
        String logoutUrl;
        if (valuelogoutUrl != null) {
            logoutUrl = valuelogoutUrl;
        } else {
            logoutUrl = null;
        }
        String valueclockTolerance = request().getQueryString("clockTolerance");
        Integer clockTolerance;
        if (valueclockTolerance != null) {
            clockTolerance = Integer.parseInt(valueclockTolerance);
        } else {
            clockTolerance = null;
        }
        String valuedigestMethod = request().getQueryString("digestMethod");
        String digestMethod;
        if (valuedigestMethod != null) {
            digestMethod = valuedigestMethod;
        } else {
            digestMethod = null;
        }
        String valuesignatureMethod = request().getQueryString("signatureMethod");
        String signatureMethod;
        if (valuesignatureMethod != null) {
            signatureMethod = valuesignatureMethod;
        } else {
            signatureMethod = null;
        }
        String valueuserIntermediatePath = request().getQueryString("userIntermediatePath");
        String userIntermediatePath;
        if (valueuserIntermediatePath != null) {
            userIntermediatePath = valueuserIntermediatePath;
        } else {
            userIntermediatePath = null;
        }
        String[] propertylistArray = request().queryString().get("propertylist");
        List<String> propertylistList = OpenAPIUtils.parametersToList("csv", propertylistArray);
        List<String> propertylist = new ArrayList<String>();
        for (String curParam : propertylistList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                propertylist.add(curParam);
            }
        }
        SamlConfigurationInfo obj = imp.postSamlConfiguration(post, apply, delete, action, $location, path, serviceRanking, idpUrl, idpCertAlias, idpHttpRedirect, serviceProviderEntityId, assertionConsumerServiceURL, spPrivateKeyAlias, keyStorePassword, defaultRedirectUrl, userIDAttribute, useEncryption, createUser, addGroupMemberships, groupMembershipAttribute, defaultGroups, nameIdFormat, synchronizeAttributes, handleLogout, logoutUrl, clockTolerance, digestMethod, signatureMethod, userIntermediatePath, propertylist);
        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
    }
}
