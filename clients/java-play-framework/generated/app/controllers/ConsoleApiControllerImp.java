package controllers;

import apimodels.SamlConfigurationInfo;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.FileInputStream;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-04T23:41:35.248Z[GMT]")

public class ConsoleApiControllerImp implements ConsoleApiControllerImpInterface {
    @Override
    public List<String> getAemProductInfo() throws Exception {
        //Do your magic!!!
        return new ArrayList<String>();
    }

    @Override
    public String getConfigMgr() throws Exception {
        //Do your magic!!!
        return new String();
    }

    @Override
    public void postBundle(String name,  @NotNull String action) throws Exception {
        //Do your magic!!!
    }

    @Override
    public void postJmxRepository(String action) throws Exception {
        //Do your magic!!!
    }

    @Override
    public SamlConfigurationInfo postSamlConfiguration(Boolean post, Boolean apply, Boolean delete, String action, String $location, List<String> path, Integer serviceRanking, String idpUrl, String idpCertAlias, Boolean idpHttpRedirect, String serviceProviderEntityId, String assertionConsumerServiceURL, String spPrivateKeyAlias, String keyStorePassword, String defaultRedirectUrl, String userIDAttribute, Boolean useEncryption, Boolean createUser, Boolean addGroupMemberships, String groupMembershipAttribute, List<String> defaultGroups, String nameIdFormat, List<String> synchronizeAttributes, Boolean handleLogout, String logoutUrl, Integer clockTolerance, String digestMethod, String signatureMethod, String userIntermediatePath, List<String> propertylist) throws Exception {
        //Do your magic!!!
        return new SamlConfigurationInfo();
    }

}
