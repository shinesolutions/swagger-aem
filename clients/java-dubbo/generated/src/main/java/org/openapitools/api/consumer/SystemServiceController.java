package org.openapitools.api.consumer;

import org.openapitools.model.BundleInfo;
import org.openapitools.model.SamlConfigurationInfo;
import org.openapitools.model.*;
import org.openapitools.api.interfaces.SystemService;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Generated;


@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

@RestController
@RequestMapping("/system")
public class SystemServiceController {

    @DubboReference
    private SystemService systemService;

    @RequestMapping(method = RequestMethod.GET, value = "/health")
    public String getAemHealthCheck(
        @RequestParam(name = "tags") String tags,
        @RequestParam(name = "combineTagsOr") Boolean combineTagsOr
    ) {
        return systemService.getAemHealthCheck(tags, combineTagsOr);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/console/status-productinfo.json")
    public List<String> getAemProductInfo(
    ) {
        return systemService.getAemProductInfo();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/console/bundles/{name}.json")
    public BundleInfo getBundleInfo(
        @RequestParam(name = "name") String name
    ) {
        return systemService.getBundleInfo(name);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/console/configMgr")
    public String getConfigMgr(
    ) {
        return systemService.getConfigMgr();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/console/bundles/{name}")
    public void postBundle(
        @RequestParam(name = "name") String name,
        @RequestParam(name = "action") String action
    ) {
        systemService.postBundle(name, action);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/console/jmx/com.adobe.granite:type=Repository/op/{action}")
    public void postJmxRepository(
        @RequestParam(name = "action") String action
    ) {
        systemService.postJmxRepository(action);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler")
    public SamlConfigurationInfo postSamlConfiguration(
        @RequestParam(name = "post") Boolean post,
        @RequestParam(name = "apply") Boolean apply,
        @RequestParam(name = "delete") Boolean delete,
        @RequestParam(name = "action") String action,
        @RequestParam(name = "$location") String $location,
        @RequestParam(name = "path") List<String> path,
        @RequestParam(name = "serviceRanking") Integer serviceRanking,
        @RequestParam(name = "idpUrl") String idpUrl,
        @RequestParam(name = "idpCertAlias") String idpCertAlias,
        @RequestParam(name = "idpHttpRedirect") Boolean idpHttpRedirect,
        @RequestParam(name = "serviceProviderEntityId") String serviceProviderEntityId,
        @RequestParam(name = "assertionConsumerServiceURL") String assertionConsumerServiceURL,
        @RequestParam(name = "spPrivateKeyAlias") String spPrivateKeyAlias,
        @RequestParam(name = "keyStorePassword") String keyStorePassword,
        @RequestParam(name = "defaultRedirectUrl") String defaultRedirectUrl,
        @RequestParam(name = "userIDAttribute") String userIDAttribute,
        @RequestParam(name = "useEncryption") Boolean useEncryption,
        @RequestParam(name = "createUser") Boolean createUser,
        @RequestParam(name = "addGroupMemberships") Boolean addGroupMemberships,
        @RequestParam(name = "groupMembershipAttribute") String groupMembershipAttribute,
        @RequestParam(name = "defaultGroups") List<String> defaultGroups,
        @RequestParam(name = "nameIdFormat") String nameIdFormat,
        @RequestParam(name = "synchronizeAttributes") List<String> synchronizeAttributes,
        @RequestParam(name = "handleLogout") Boolean handleLogout,
        @RequestParam(name = "logoutUrl") String logoutUrl,
        @RequestParam(name = "clockTolerance") Integer clockTolerance,
        @RequestParam(name = "digestMethod") String digestMethod,
        @RequestParam(name = "signatureMethod") String signatureMethod,
        @RequestParam(name = "userIntermediatePath") String userIntermediatePath,
        @RequestParam(name = "propertylist") List<String> propertylist
    ) {
        return systemService.postSamlConfiguration(post, apply, delete, action, $location, path, serviceRanking, idpUrl, idpCertAlias, idpHttpRedirect, serviceProviderEntityId, assertionConsumerServiceURL, spPrivateKeyAlias, keyStorePassword, defaultRedirectUrl, userIDAttribute, useEncryption, createUser, addGroupMemberships, groupMembershipAttribute, defaultGroups, nameIdFormat, synchronizeAttributes, handleLogout, logoutUrl, clockTolerance, digestMethod, signatureMethod, userIntermediatePath, propertylist);
    }
}
