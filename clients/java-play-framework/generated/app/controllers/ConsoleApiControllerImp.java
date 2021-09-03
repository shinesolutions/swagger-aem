package controllers;

import apimodels.BundleInfo;
import apimodels.SamlConfigurationInfo;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2021-09-03T15:25:32.040+10:00[Australia/Melbourne]")
public class ConsoleApiControllerImp extends ConsoleApiControllerImpInterface {
    @Override
    public List<String> getAemProductInfo(Http.Request request) throws Exception {
        //Do your magic!!!
        return new ArrayList<String>();
    }

    @Override
    public BundleInfo getBundleInfo(Http.Request request, String name) throws Exception {
        //Do your magic!!!
        return new BundleInfo();
    }

    @Override
    public String getConfigMgr(Http.Request request) throws Exception {
        //Do your magic!!!
        return new String();
    }

    @Override
    public void postBundle(Http.Request request, String name, @NotNull String action) throws Exception {
        //Do your magic!!!
    }

    @Override
    public void postJmxRepository(Http.Request request, String action) throws Exception {
        //Do your magic!!!
    }

    @Override
    public SamlConfigurationInfo postSamlConfiguration(Http.Request request, Boolean post, Boolean apply, Boolean delete, String action, String $location, List<String> path, Integer serviceRanking, String idpUrl, String idpCertAlias, Boolean idpHttpRedirect, String serviceProviderEntityId, String assertionConsumerServiceURL, String spPrivateKeyAlias, String keyStorePassword, String defaultRedirectUrl, String userIDAttribute, Boolean useEncryption, Boolean createUser, Boolean addGroupMemberships, String groupMembershipAttribute, List<String> defaultGroups, String nameIdFormat, List<String> synchronizeAttributes, Boolean handleLogout, String logoutUrl, Integer clockTolerance, String digestMethod, String signatureMethod, String userIntermediatePath, List<String> propertylist) throws Exception {
        //Do your magic!!!
        return new SamlConfigurationInfo();
    }

}
