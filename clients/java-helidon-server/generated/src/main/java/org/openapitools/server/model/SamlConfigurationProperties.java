package org.openapitools.server.model;

import org.openapitools.server.model.SamlConfigurationPropertyItemsArray;
import org.openapitools.server.model.SamlConfigurationPropertyItemsBoolean;
import org.openapitools.server.model.SamlConfigurationPropertyItemsLong;
import org.openapitools.server.model.SamlConfigurationPropertyItemsString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class SamlConfigurationProperties   {

    private SamlConfigurationPropertyItemsArray path;
    private SamlConfigurationPropertyItemsLong serviceRanking;
    private SamlConfigurationPropertyItemsString idpUrl;
    private SamlConfigurationPropertyItemsString idpCertAlias;
    private SamlConfigurationPropertyItemsBoolean idpHttpRedirect;
    private SamlConfigurationPropertyItemsString serviceProviderEntityId;
    private SamlConfigurationPropertyItemsString assertionConsumerServiceURL;
    private SamlConfigurationPropertyItemsString spPrivateKeyAlias;
    private SamlConfigurationPropertyItemsString keyStorePassword;
    private SamlConfigurationPropertyItemsString defaultRedirectUrl;
    private SamlConfigurationPropertyItemsString userIDAttribute;
    private SamlConfigurationPropertyItemsBoolean useEncryption;
    private SamlConfigurationPropertyItemsBoolean createUser;
    private SamlConfigurationPropertyItemsBoolean addGroupMemberships;
    private SamlConfigurationPropertyItemsString groupMembershipAttribute;
    private SamlConfigurationPropertyItemsArray defaultGroups;
    private SamlConfigurationPropertyItemsString nameIdFormat;
    private SamlConfigurationPropertyItemsArray synchronizeAttributes;
    private SamlConfigurationPropertyItemsBoolean handleLogout;
    private SamlConfigurationPropertyItemsString logoutUrl;
    private SamlConfigurationPropertyItemsLong clockTolerance;
    private SamlConfigurationPropertyItemsString digestMethod;
    private SamlConfigurationPropertyItemsString signatureMethod;
    private SamlConfigurationPropertyItemsString userIntermediatePath;

    /**
     * Default constructor.
     */
    public SamlConfigurationProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create SamlConfigurationProperties.
     *
     * @param path path
     * @param serviceRanking serviceRanking
     * @param idpUrl idpUrl
     * @param idpCertAlias idpCertAlias
     * @param idpHttpRedirect idpHttpRedirect
     * @param serviceProviderEntityId serviceProviderEntityId
     * @param assertionConsumerServiceURL assertionConsumerServiceURL
     * @param spPrivateKeyAlias spPrivateKeyAlias
     * @param keyStorePassword keyStorePassword
     * @param defaultRedirectUrl defaultRedirectUrl
     * @param userIDAttribute userIDAttribute
     * @param useEncryption useEncryption
     * @param createUser createUser
     * @param addGroupMemberships addGroupMemberships
     * @param groupMembershipAttribute groupMembershipAttribute
     * @param defaultGroups defaultGroups
     * @param nameIdFormat nameIdFormat
     * @param synchronizeAttributes synchronizeAttributes
     * @param handleLogout handleLogout
     * @param logoutUrl logoutUrl
     * @param clockTolerance clockTolerance
     * @param digestMethod digestMethod
     * @param signatureMethod signatureMethod
     * @param userIntermediatePath userIntermediatePath
     */
    public SamlConfigurationProperties(
        SamlConfigurationPropertyItemsArray path, 
        SamlConfigurationPropertyItemsLong serviceRanking, 
        SamlConfigurationPropertyItemsString idpUrl, 
        SamlConfigurationPropertyItemsString idpCertAlias, 
        SamlConfigurationPropertyItemsBoolean idpHttpRedirect, 
        SamlConfigurationPropertyItemsString serviceProviderEntityId, 
        SamlConfigurationPropertyItemsString assertionConsumerServiceURL, 
        SamlConfigurationPropertyItemsString spPrivateKeyAlias, 
        SamlConfigurationPropertyItemsString keyStorePassword, 
        SamlConfigurationPropertyItemsString defaultRedirectUrl, 
        SamlConfigurationPropertyItemsString userIDAttribute, 
        SamlConfigurationPropertyItemsBoolean useEncryption, 
        SamlConfigurationPropertyItemsBoolean createUser, 
        SamlConfigurationPropertyItemsBoolean addGroupMemberships, 
        SamlConfigurationPropertyItemsString groupMembershipAttribute, 
        SamlConfigurationPropertyItemsArray defaultGroups, 
        SamlConfigurationPropertyItemsString nameIdFormat, 
        SamlConfigurationPropertyItemsArray synchronizeAttributes, 
        SamlConfigurationPropertyItemsBoolean handleLogout, 
        SamlConfigurationPropertyItemsString logoutUrl, 
        SamlConfigurationPropertyItemsLong clockTolerance, 
        SamlConfigurationPropertyItemsString digestMethod, 
        SamlConfigurationPropertyItemsString signatureMethod, 
        SamlConfigurationPropertyItemsString userIntermediatePath
    ) {
        this.path = path;
        this.serviceRanking = serviceRanking;
        this.idpUrl = idpUrl;
        this.idpCertAlias = idpCertAlias;
        this.idpHttpRedirect = idpHttpRedirect;
        this.serviceProviderEntityId = serviceProviderEntityId;
        this.assertionConsumerServiceURL = assertionConsumerServiceURL;
        this.spPrivateKeyAlias = spPrivateKeyAlias;
        this.keyStorePassword = keyStorePassword;
        this.defaultRedirectUrl = defaultRedirectUrl;
        this.userIDAttribute = userIDAttribute;
        this.useEncryption = useEncryption;
        this.createUser = createUser;
        this.addGroupMemberships = addGroupMemberships;
        this.groupMembershipAttribute = groupMembershipAttribute;
        this.defaultGroups = defaultGroups;
        this.nameIdFormat = nameIdFormat;
        this.synchronizeAttributes = synchronizeAttributes;
        this.handleLogout = handleLogout;
        this.logoutUrl = logoutUrl;
        this.clockTolerance = clockTolerance;
        this.digestMethod = digestMethod;
        this.signatureMethod = signatureMethod;
        this.userIntermediatePath = userIntermediatePath;
    }



    /**
     * Get path
     * @return path
     */
    public SamlConfigurationPropertyItemsArray getPath() {
        return path;
    }

    public void setPath(SamlConfigurationPropertyItemsArray path) {
        this.path = path;
    }

    /**
     * Get serviceRanking
     * @return serviceRanking
     */
    public SamlConfigurationPropertyItemsLong getServiceRanking() {
        return serviceRanking;
    }

    public void setServiceRanking(SamlConfigurationPropertyItemsLong serviceRanking) {
        this.serviceRanking = serviceRanking;
    }

    /**
     * Get idpUrl
     * @return idpUrl
     */
    public SamlConfigurationPropertyItemsString getIdpUrl() {
        return idpUrl;
    }

    public void setIdpUrl(SamlConfigurationPropertyItemsString idpUrl) {
        this.idpUrl = idpUrl;
    }

    /**
     * Get idpCertAlias
     * @return idpCertAlias
     */
    public SamlConfigurationPropertyItemsString getIdpCertAlias() {
        return idpCertAlias;
    }

    public void setIdpCertAlias(SamlConfigurationPropertyItemsString idpCertAlias) {
        this.idpCertAlias = idpCertAlias;
    }

    /**
     * Get idpHttpRedirect
     * @return idpHttpRedirect
     */
    public SamlConfigurationPropertyItemsBoolean getIdpHttpRedirect() {
        return idpHttpRedirect;
    }

    public void setIdpHttpRedirect(SamlConfigurationPropertyItemsBoolean idpHttpRedirect) {
        this.idpHttpRedirect = idpHttpRedirect;
    }

    /**
     * Get serviceProviderEntityId
     * @return serviceProviderEntityId
     */
    public SamlConfigurationPropertyItemsString getServiceProviderEntityId() {
        return serviceProviderEntityId;
    }

    public void setServiceProviderEntityId(SamlConfigurationPropertyItemsString serviceProviderEntityId) {
        this.serviceProviderEntityId = serviceProviderEntityId;
    }

    /**
     * Get assertionConsumerServiceURL
     * @return assertionConsumerServiceURL
     */
    public SamlConfigurationPropertyItemsString getAssertionConsumerServiceURL() {
        return assertionConsumerServiceURL;
    }

    public void setAssertionConsumerServiceURL(SamlConfigurationPropertyItemsString assertionConsumerServiceURL) {
        this.assertionConsumerServiceURL = assertionConsumerServiceURL;
    }

    /**
     * Get spPrivateKeyAlias
     * @return spPrivateKeyAlias
     */
    public SamlConfigurationPropertyItemsString getSpPrivateKeyAlias() {
        return spPrivateKeyAlias;
    }

    public void setSpPrivateKeyAlias(SamlConfigurationPropertyItemsString spPrivateKeyAlias) {
        this.spPrivateKeyAlias = spPrivateKeyAlias;
    }

    /**
     * Get keyStorePassword
     * @return keyStorePassword
     */
    public SamlConfigurationPropertyItemsString getKeyStorePassword() {
        return keyStorePassword;
    }

    public void setKeyStorePassword(SamlConfigurationPropertyItemsString keyStorePassword) {
        this.keyStorePassword = keyStorePassword;
    }

    /**
     * Get defaultRedirectUrl
     * @return defaultRedirectUrl
     */
    public SamlConfigurationPropertyItemsString getDefaultRedirectUrl() {
        return defaultRedirectUrl;
    }

    public void setDefaultRedirectUrl(SamlConfigurationPropertyItemsString defaultRedirectUrl) {
        this.defaultRedirectUrl = defaultRedirectUrl;
    }

    /**
     * Get userIDAttribute
     * @return userIDAttribute
     */
    public SamlConfigurationPropertyItemsString getUserIDAttribute() {
        return userIDAttribute;
    }

    public void setUserIDAttribute(SamlConfigurationPropertyItemsString userIDAttribute) {
        this.userIDAttribute = userIDAttribute;
    }

    /**
     * Get useEncryption
     * @return useEncryption
     */
    public SamlConfigurationPropertyItemsBoolean getUseEncryption() {
        return useEncryption;
    }

    public void setUseEncryption(SamlConfigurationPropertyItemsBoolean useEncryption) {
        this.useEncryption = useEncryption;
    }

    /**
     * Get createUser
     * @return createUser
     */
    public SamlConfigurationPropertyItemsBoolean getCreateUser() {
        return createUser;
    }

    public void setCreateUser(SamlConfigurationPropertyItemsBoolean createUser) {
        this.createUser = createUser;
    }

    /**
     * Get addGroupMemberships
     * @return addGroupMemberships
     */
    public SamlConfigurationPropertyItemsBoolean getAddGroupMemberships() {
        return addGroupMemberships;
    }

    public void setAddGroupMemberships(SamlConfigurationPropertyItemsBoolean addGroupMemberships) {
        this.addGroupMemberships = addGroupMemberships;
    }

    /**
     * Get groupMembershipAttribute
     * @return groupMembershipAttribute
     */
    public SamlConfigurationPropertyItemsString getGroupMembershipAttribute() {
        return groupMembershipAttribute;
    }

    public void setGroupMembershipAttribute(SamlConfigurationPropertyItemsString groupMembershipAttribute) {
        this.groupMembershipAttribute = groupMembershipAttribute;
    }

    /**
     * Get defaultGroups
     * @return defaultGroups
     */
    public SamlConfigurationPropertyItemsArray getDefaultGroups() {
        return defaultGroups;
    }

    public void setDefaultGroups(SamlConfigurationPropertyItemsArray defaultGroups) {
        this.defaultGroups = defaultGroups;
    }

    /**
     * Get nameIdFormat
     * @return nameIdFormat
     */
    public SamlConfigurationPropertyItemsString getNameIdFormat() {
        return nameIdFormat;
    }

    public void setNameIdFormat(SamlConfigurationPropertyItemsString nameIdFormat) {
        this.nameIdFormat = nameIdFormat;
    }

    /**
     * Get synchronizeAttributes
     * @return synchronizeAttributes
     */
    public SamlConfigurationPropertyItemsArray getSynchronizeAttributes() {
        return synchronizeAttributes;
    }

    public void setSynchronizeAttributes(SamlConfigurationPropertyItemsArray synchronizeAttributes) {
        this.synchronizeAttributes = synchronizeAttributes;
    }

    /**
     * Get handleLogout
     * @return handleLogout
     */
    public SamlConfigurationPropertyItemsBoolean getHandleLogout() {
        return handleLogout;
    }

    public void setHandleLogout(SamlConfigurationPropertyItemsBoolean handleLogout) {
        this.handleLogout = handleLogout;
    }

    /**
     * Get logoutUrl
     * @return logoutUrl
     */
    public SamlConfigurationPropertyItemsString getLogoutUrl() {
        return logoutUrl;
    }

    public void setLogoutUrl(SamlConfigurationPropertyItemsString logoutUrl) {
        this.logoutUrl = logoutUrl;
    }

    /**
     * Get clockTolerance
     * @return clockTolerance
     */
    public SamlConfigurationPropertyItemsLong getClockTolerance() {
        return clockTolerance;
    }

    public void setClockTolerance(SamlConfigurationPropertyItemsLong clockTolerance) {
        this.clockTolerance = clockTolerance;
    }

    /**
     * Get digestMethod
     * @return digestMethod
     */
    public SamlConfigurationPropertyItemsString getDigestMethod() {
        return digestMethod;
    }

    public void setDigestMethod(SamlConfigurationPropertyItemsString digestMethod) {
        this.digestMethod = digestMethod;
    }

    /**
     * Get signatureMethod
     * @return signatureMethod
     */
    public SamlConfigurationPropertyItemsString getSignatureMethod() {
        return signatureMethod;
    }

    public void setSignatureMethod(SamlConfigurationPropertyItemsString signatureMethod) {
        this.signatureMethod = signatureMethod;
    }

    /**
     * Get userIntermediatePath
     * @return userIntermediatePath
     */
    public SamlConfigurationPropertyItemsString getUserIntermediatePath() {
        return userIntermediatePath;
    }

    public void setUserIntermediatePath(SamlConfigurationPropertyItemsString userIntermediatePath) {
        this.userIntermediatePath = userIntermediatePath;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SamlConfigurationProperties {\n");
        
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    serviceRanking: ").append(toIndentedString(serviceRanking)).append("\n");
        sb.append("    idpUrl: ").append(toIndentedString(idpUrl)).append("\n");
        sb.append("    idpCertAlias: ").append(toIndentedString(idpCertAlias)).append("\n");
        sb.append("    idpHttpRedirect: ").append(toIndentedString(idpHttpRedirect)).append("\n");
        sb.append("    serviceProviderEntityId: ").append(toIndentedString(serviceProviderEntityId)).append("\n");
        sb.append("    assertionConsumerServiceURL: ").append(toIndentedString(assertionConsumerServiceURL)).append("\n");
        sb.append("    spPrivateKeyAlias: ").append(toIndentedString(spPrivateKeyAlias)).append("\n");
        sb.append("    keyStorePassword: ").append(toIndentedString(keyStorePassword)).append("\n");
        sb.append("    defaultRedirectUrl: ").append(toIndentedString(defaultRedirectUrl)).append("\n");
        sb.append("    userIDAttribute: ").append(toIndentedString(userIDAttribute)).append("\n");
        sb.append("    useEncryption: ").append(toIndentedString(useEncryption)).append("\n");
        sb.append("    createUser: ").append(toIndentedString(createUser)).append("\n");
        sb.append("    addGroupMemberships: ").append(toIndentedString(addGroupMemberships)).append("\n");
        sb.append("    groupMembershipAttribute: ").append(toIndentedString(groupMembershipAttribute)).append("\n");
        sb.append("    defaultGroups: ").append(toIndentedString(defaultGroups)).append("\n");
        sb.append("    nameIdFormat: ").append(toIndentedString(nameIdFormat)).append("\n");
        sb.append("    synchronizeAttributes: ").append(toIndentedString(synchronizeAttributes)).append("\n");
        sb.append("    handleLogout: ").append(toIndentedString(handleLogout)).append("\n");
        sb.append("    logoutUrl: ").append(toIndentedString(logoutUrl)).append("\n");
        sb.append("    clockTolerance: ").append(toIndentedString(clockTolerance)).append("\n");
        sb.append("    digestMethod: ").append(toIndentedString(digestMethod)).append("\n");
        sb.append("    signatureMethod: ").append(toIndentedString(signatureMethod)).append("\n");
        sb.append("    userIntermediatePath: ").append(toIndentedString(userIntermediatePath)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
    */
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

