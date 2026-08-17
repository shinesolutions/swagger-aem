package org.openapitools.model;

import org.openapitools.model.SamlConfigurationPropertyItemsArray;
import org.openapitools.model.SamlConfigurationPropertyItemsBoolean;
import org.openapitools.model.SamlConfigurationPropertyItemsLong;
import org.openapitools.model.SamlConfigurationPropertyItemsString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SamlConfigurationProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private SamlConfigurationPropertyItemsArray path;

  @ApiModelProperty(value = "")
  @Valid
  private SamlConfigurationPropertyItemsLong serviceRanking;

  @ApiModelProperty(value = "")
  @Valid
  private SamlConfigurationPropertyItemsString idpUrl;

  @ApiModelProperty(value = "")
  @Valid
  private SamlConfigurationPropertyItemsString idpCertAlias;

  @ApiModelProperty(value = "")
  @Valid
  private SamlConfigurationPropertyItemsBoolean idpHttpRedirect;

  @ApiModelProperty(value = "")
  @Valid
  private SamlConfigurationPropertyItemsString serviceProviderEntityId;

  @ApiModelProperty(value = "")
  @Valid
  private SamlConfigurationPropertyItemsString assertionConsumerServiceURL;

  @ApiModelProperty(value = "")
  @Valid
  private SamlConfigurationPropertyItemsString spPrivateKeyAlias;

  @ApiModelProperty(value = "")
  @Valid
  private SamlConfigurationPropertyItemsString keyStorePassword;

  @ApiModelProperty(value = "")
  @Valid
  private SamlConfigurationPropertyItemsString defaultRedirectUrl;

  @ApiModelProperty(value = "")
  @Valid
  private SamlConfigurationPropertyItemsString userIDAttribute;

  @ApiModelProperty(value = "")
  @Valid
  private SamlConfigurationPropertyItemsBoolean useEncryption;

  @ApiModelProperty(value = "")
  @Valid
  private SamlConfigurationPropertyItemsBoolean createUser;

  @ApiModelProperty(value = "")
  @Valid
  private SamlConfigurationPropertyItemsBoolean addGroupMemberships;

  @ApiModelProperty(value = "")
  @Valid
  private SamlConfigurationPropertyItemsString groupMembershipAttribute;

  @ApiModelProperty(value = "")
  @Valid
  private SamlConfigurationPropertyItemsArray defaultGroups;

  @ApiModelProperty(value = "")
  @Valid
  private SamlConfigurationPropertyItemsString nameIdFormat;

  @ApiModelProperty(value = "")
  @Valid
  private SamlConfigurationPropertyItemsArray synchronizeAttributes;

  @ApiModelProperty(value = "")
  @Valid
  private SamlConfigurationPropertyItemsBoolean handleLogout;

  @ApiModelProperty(value = "")
  @Valid
  private SamlConfigurationPropertyItemsString logoutUrl;

  @ApiModelProperty(value = "")
  @Valid
  private SamlConfigurationPropertyItemsLong clockTolerance;

  @ApiModelProperty(value = "")
  @Valid
  private SamlConfigurationPropertyItemsString digestMethod;

  @ApiModelProperty(value = "")
  @Valid
  private SamlConfigurationPropertyItemsString signatureMethod;

  @ApiModelProperty(value = "")
  @Valid
  private SamlConfigurationPropertyItemsString userIntermediatePath;
 /**
  * Get path
  * @return path
  */
  @JsonProperty("path")
  public SamlConfigurationPropertyItemsArray getPath() {
    return path;
  }

  /**
   * Sets the <code>path</code> property.
   */
 public void setPath(SamlConfigurationPropertyItemsArray path) {
    this.path = path;
  }

  /**
   * Sets the <code>path</code> property.
   */
  public SamlConfigurationProperties path(SamlConfigurationPropertyItemsArray path) {
    this.path = path;
    return this;
  }

 /**
  * Get serviceRanking
  * @return serviceRanking
  */
  @JsonProperty("service.ranking")
  public SamlConfigurationPropertyItemsLong getServiceRanking() {
    return serviceRanking;
  }

  /**
   * Sets the <code>serviceRanking</code> property.
   */
 public void setServiceRanking(SamlConfigurationPropertyItemsLong serviceRanking) {
    this.serviceRanking = serviceRanking;
  }

  /**
   * Sets the <code>serviceRanking</code> property.
   */
  public SamlConfigurationProperties serviceRanking(SamlConfigurationPropertyItemsLong serviceRanking) {
    this.serviceRanking = serviceRanking;
    return this;
  }

 /**
  * Get idpUrl
  * @return idpUrl
  */
  @JsonProperty("idpUrl")
  public SamlConfigurationPropertyItemsString getIdpUrl() {
    return idpUrl;
  }

  /**
   * Sets the <code>idpUrl</code> property.
   */
 public void setIdpUrl(SamlConfigurationPropertyItemsString idpUrl) {
    this.idpUrl = idpUrl;
  }

  /**
   * Sets the <code>idpUrl</code> property.
   */
  public SamlConfigurationProperties idpUrl(SamlConfigurationPropertyItemsString idpUrl) {
    this.idpUrl = idpUrl;
    return this;
  }

 /**
  * Get idpCertAlias
  * @return idpCertAlias
  */
  @JsonProperty("idpCertAlias")
  public SamlConfigurationPropertyItemsString getIdpCertAlias() {
    return idpCertAlias;
  }

  /**
   * Sets the <code>idpCertAlias</code> property.
   */
 public void setIdpCertAlias(SamlConfigurationPropertyItemsString idpCertAlias) {
    this.idpCertAlias = idpCertAlias;
  }

  /**
   * Sets the <code>idpCertAlias</code> property.
   */
  public SamlConfigurationProperties idpCertAlias(SamlConfigurationPropertyItemsString idpCertAlias) {
    this.idpCertAlias = idpCertAlias;
    return this;
  }

 /**
  * Get idpHttpRedirect
  * @return idpHttpRedirect
  */
  @JsonProperty("idpHttpRedirect")
  public SamlConfigurationPropertyItemsBoolean getIdpHttpRedirect() {
    return idpHttpRedirect;
  }

  /**
   * Sets the <code>idpHttpRedirect</code> property.
   */
 public void setIdpHttpRedirect(SamlConfigurationPropertyItemsBoolean idpHttpRedirect) {
    this.idpHttpRedirect = idpHttpRedirect;
  }

  /**
   * Sets the <code>idpHttpRedirect</code> property.
   */
  public SamlConfigurationProperties idpHttpRedirect(SamlConfigurationPropertyItemsBoolean idpHttpRedirect) {
    this.idpHttpRedirect = idpHttpRedirect;
    return this;
  }

 /**
  * Get serviceProviderEntityId
  * @return serviceProviderEntityId
  */
  @JsonProperty("serviceProviderEntityId")
  public SamlConfigurationPropertyItemsString getServiceProviderEntityId() {
    return serviceProviderEntityId;
  }

  /**
   * Sets the <code>serviceProviderEntityId</code> property.
   */
 public void setServiceProviderEntityId(SamlConfigurationPropertyItemsString serviceProviderEntityId) {
    this.serviceProviderEntityId = serviceProviderEntityId;
  }

  /**
   * Sets the <code>serviceProviderEntityId</code> property.
   */
  public SamlConfigurationProperties serviceProviderEntityId(SamlConfigurationPropertyItemsString serviceProviderEntityId) {
    this.serviceProviderEntityId = serviceProviderEntityId;
    return this;
  }

 /**
  * Get assertionConsumerServiceURL
  * @return assertionConsumerServiceURL
  */
  @JsonProperty("assertionConsumerServiceURL")
  public SamlConfigurationPropertyItemsString getAssertionConsumerServiceURL() {
    return assertionConsumerServiceURL;
  }

  /**
   * Sets the <code>assertionConsumerServiceURL</code> property.
   */
 public void setAssertionConsumerServiceURL(SamlConfigurationPropertyItemsString assertionConsumerServiceURL) {
    this.assertionConsumerServiceURL = assertionConsumerServiceURL;
  }

  /**
   * Sets the <code>assertionConsumerServiceURL</code> property.
   */
  public SamlConfigurationProperties assertionConsumerServiceURL(SamlConfigurationPropertyItemsString assertionConsumerServiceURL) {
    this.assertionConsumerServiceURL = assertionConsumerServiceURL;
    return this;
  }

 /**
  * Get spPrivateKeyAlias
  * @return spPrivateKeyAlias
  */
  @JsonProperty("spPrivateKeyAlias")
  public SamlConfigurationPropertyItemsString getSpPrivateKeyAlias() {
    return spPrivateKeyAlias;
  }

  /**
   * Sets the <code>spPrivateKeyAlias</code> property.
   */
 public void setSpPrivateKeyAlias(SamlConfigurationPropertyItemsString spPrivateKeyAlias) {
    this.spPrivateKeyAlias = spPrivateKeyAlias;
  }

  /**
   * Sets the <code>spPrivateKeyAlias</code> property.
   */
  public SamlConfigurationProperties spPrivateKeyAlias(SamlConfigurationPropertyItemsString spPrivateKeyAlias) {
    this.spPrivateKeyAlias = spPrivateKeyAlias;
    return this;
  }

 /**
  * Get keyStorePassword
  * @return keyStorePassword
  */
  @JsonProperty("keyStorePassword")
  public SamlConfigurationPropertyItemsString getKeyStorePassword() {
    return keyStorePassword;
  }

  /**
   * Sets the <code>keyStorePassword</code> property.
   */
 public void setKeyStorePassword(SamlConfigurationPropertyItemsString keyStorePassword) {
    this.keyStorePassword = keyStorePassword;
  }

  /**
   * Sets the <code>keyStorePassword</code> property.
   */
  public SamlConfigurationProperties keyStorePassword(SamlConfigurationPropertyItemsString keyStorePassword) {
    this.keyStorePassword = keyStorePassword;
    return this;
  }

 /**
  * Get defaultRedirectUrl
  * @return defaultRedirectUrl
  */
  @JsonProperty("defaultRedirectUrl")
  public SamlConfigurationPropertyItemsString getDefaultRedirectUrl() {
    return defaultRedirectUrl;
  }

  /**
   * Sets the <code>defaultRedirectUrl</code> property.
   */
 public void setDefaultRedirectUrl(SamlConfigurationPropertyItemsString defaultRedirectUrl) {
    this.defaultRedirectUrl = defaultRedirectUrl;
  }

  /**
   * Sets the <code>defaultRedirectUrl</code> property.
   */
  public SamlConfigurationProperties defaultRedirectUrl(SamlConfigurationPropertyItemsString defaultRedirectUrl) {
    this.defaultRedirectUrl = defaultRedirectUrl;
    return this;
  }

 /**
  * Get userIDAttribute
  * @return userIDAttribute
  */
  @JsonProperty("userIDAttribute")
  public SamlConfigurationPropertyItemsString getUserIDAttribute() {
    return userIDAttribute;
  }

  /**
   * Sets the <code>userIDAttribute</code> property.
   */
 public void setUserIDAttribute(SamlConfigurationPropertyItemsString userIDAttribute) {
    this.userIDAttribute = userIDAttribute;
  }

  /**
   * Sets the <code>userIDAttribute</code> property.
   */
  public SamlConfigurationProperties userIDAttribute(SamlConfigurationPropertyItemsString userIDAttribute) {
    this.userIDAttribute = userIDAttribute;
    return this;
  }

 /**
  * Get useEncryption
  * @return useEncryption
  */
  @JsonProperty("useEncryption")
  public SamlConfigurationPropertyItemsBoolean getUseEncryption() {
    return useEncryption;
  }

  /**
   * Sets the <code>useEncryption</code> property.
   */
 public void setUseEncryption(SamlConfigurationPropertyItemsBoolean useEncryption) {
    this.useEncryption = useEncryption;
  }

  /**
   * Sets the <code>useEncryption</code> property.
   */
  public SamlConfigurationProperties useEncryption(SamlConfigurationPropertyItemsBoolean useEncryption) {
    this.useEncryption = useEncryption;
    return this;
  }

 /**
  * Get createUser
  * @return createUser
  */
  @JsonProperty("createUser")
  public SamlConfigurationPropertyItemsBoolean getCreateUser() {
    return createUser;
  }

  /**
   * Sets the <code>createUser</code> property.
   */
 public void setCreateUser(SamlConfigurationPropertyItemsBoolean createUser) {
    this.createUser = createUser;
  }

  /**
   * Sets the <code>createUser</code> property.
   */
  public SamlConfigurationProperties createUser(SamlConfigurationPropertyItemsBoolean createUser) {
    this.createUser = createUser;
    return this;
  }

 /**
  * Get addGroupMemberships
  * @return addGroupMemberships
  */
  @JsonProperty("addGroupMemberships")
  public SamlConfigurationPropertyItemsBoolean getAddGroupMemberships() {
    return addGroupMemberships;
  }

  /**
   * Sets the <code>addGroupMemberships</code> property.
   */
 public void setAddGroupMemberships(SamlConfigurationPropertyItemsBoolean addGroupMemberships) {
    this.addGroupMemberships = addGroupMemberships;
  }

  /**
   * Sets the <code>addGroupMemberships</code> property.
   */
  public SamlConfigurationProperties addGroupMemberships(SamlConfigurationPropertyItemsBoolean addGroupMemberships) {
    this.addGroupMemberships = addGroupMemberships;
    return this;
  }

 /**
  * Get groupMembershipAttribute
  * @return groupMembershipAttribute
  */
  @JsonProperty("groupMembershipAttribute")
  public SamlConfigurationPropertyItemsString getGroupMembershipAttribute() {
    return groupMembershipAttribute;
  }

  /**
   * Sets the <code>groupMembershipAttribute</code> property.
   */
 public void setGroupMembershipAttribute(SamlConfigurationPropertyItemsString groupMembershipAttribute) {
    this.groupMembershipAttribute = groupMembershipAttribute;
  }

  /**
   * Sets the <code>groupMembershipAttribute</code> property.
   */
  public SamlConfigurationProperties groupMembershipAttribute(SamlConfigurationPropertyItemsString groupMembershipAttribute) {
    this.groupMembershipAttribute = groupMembershipAttribute;
    return this;
  }

 /**
  * Get defaultGroups
  * @return defaultGroups
  */
  @JsonProperty("defaultGroups")
  public SamlConfigurationPropertyItemsArray getDefaultGroups() {
    return defaultGroups;
  }

  /**
   * Sets the <code>defaultGroups</code> property.
   */
 public void setDefaultGroups(SamlConfigurationPropertyItemsArray defaultGroups) {
    this.defaultGroups = defaultGroups;
  }

  /**
   * Sets the <code>defaultGroups</code> property.
   */
  public SamlConfigurationProperties defaultGroups(SamlConfigurationPropertyItemsArray defaultGroups) {
    this.defaultGroups = defaultGroups;
    return this;
  }

 /**
  * Get nameIdFormat
  * @return nameIdFormat
  */
  @JsonProperty("nameIdFormat")
  public SamlConfigurationPropertyItemsString getNameIdFormat() {
    return nameIdFormat;
  }

  /**
   * Sets the <code>nameIdFormat</code> property.
   */
 public void setNameIdFormat(SamlConfigurationPropertyItemsString nameIdFormat) {
    this.nameIdFormat = nameIdFormat;
  }

  /**
   * Sets the <code>nameIdFormat</code> property.
   */
  public SamlConfigurationProperties nameIdFormat(SamlConfigurationPropertyItemsString nameIdFormat) {
    this.nameIdFormat = nameIdFormat;
    return this;
  }

 /**
  * Get synchronizeAttributes
  * @return synchronizeAttributes
  */
  @JsonProperty("synchronizeAttributes")
  public SamlConfigurationPropertyItemsArray getSynchronizeAttributes() {
    return synchronizeAttributes;
  }

  /**
   * Sets the <code>synchronizeAttributes</code> property.
   */
 public void setSynchronizeAttributes(SamlConfigurationPropertyItemsArray synchronizeAttributes) {
    this.synchronizeAttributes = synchronizeAttributes;
  }

  /**
   * Sets the <code>synchronizeAttributes</code> property.
   */
  public SamlConfigurationProperties synchronizeAttributes(SamlConfigurationPropertyItemsArray synchronizeAttributes) {
    this.synchronizeAttributes = synchronizeAttributes;
    return this;
  }

 /**
  * Get handleLogout
  * @return handleLogout
  */
  @JsonProperty("handleLogout")
  public SamlConfigurationPropertyItemsBoolean getHandleLogout() {
    return handleLogout;
  }

  /**
   * Sets the <code>handleLogout</code> property.
   */
 public void setHandleLogout(SamlConfigurationPropertyItemsBoolean handleLogout) {
    this.handleLogout = handleLogout;
  }

  /**
   * Sets the <code>handleLogout</code> property.
   */
  public SamlConfigurationProperties handleLogout(SamlConfigurationPropertyItemsBoolean handleLogout) {
    this.handleLogout = handleLogout;
    return this;
  }

 /**
  * Get logoutUrl
  * @return logoutUrl
  */
  @JsonProperty("logoutUrl")
  public SamlConfigurationPropertyItemsString getLogoutUrl() {
    return logoutUrl;
  }

  /**
   * Sets the <code>logoutUrl</code> property.
   */
 public void setLogoutUrl(SamlConfigurationPropertyItemsString logoutUrl) {
    this.logoutUrl = logoutUrl;
  }

  /**
   * Sets the <code>logoutUrl</code> property.
   */
  public SamlConfigurationProperties logoutUrl(SamlConfigurationPropertyItemsString logoutUrl) {
    this.logoutUrl = logoutUrl;
    return this;
  }

 /**
  * Get clockTolerance
  * @return clockTolerance
  */
  @JsonProperty("clockTolerance")
  public SamlConfigurationPropertyItemsLong getClockTolerance() {
    return clockTolerance;
  }

  /**
   * Sets the <code>clockTolerance</code> property.
   */
 public void setClockTolerance(SamlConfigurationPropertyItemsLong clockTolerance) {
    this.clockTolerance = clockTolerance;
  }

  /**
   * Sets the <code>clockTolerance</code> property.
   */
  public SamlConfigurationProperties clockTolerance(SamlConfigurationPropertyItemsLong clockTolerance) {
    this.clockTolerance = clockTolerance;
    return this;
  }

 /**
  * Get digestMethod
  * @return digestMethod
  */
  @JsonProperty("digestMethod")
  public SamlConfigurationPropertyItemsString getDigestMethod() {
    return digestMethod;
  }

  /**
   * Sets the <code>digestMethod</code> property.
   */
 public void setDigestMethod(SamlConfigurationPropertyItemsString digestMethod) {
    this.digestMethod = digestMethod;
  }

  /**
   * Sets the <code>digestMethod</code> property.
   */
  public SamlConfigurationProperties digestMethod(SamlConfigurationPropertyItemsString digestMethod) {
    this.digestMethod = digestMethod;
    return this;
  }

 /**
  * Get signatureMethod
  * @return signatureMethod
  */
  @JsonProperty("signatureMethod")
  public SamlConfigurationPropertyItemsString getSignatureMethod() {
    return signatureMethod;
  }

  /**
   * Sets the <code>signatureMethod</code> property.
   */
 public void setSignatureMethod(SamlConfigurationPropertyItemsString signatureMethod) {
    this.signatureMethod = signatureMethod;
  }

  /**
   * Sets the <code>signatureMethod</code> property.
   */
  public SamlConfigurationProperties signatureMethod(SamlConfigurationPropertyItemsString signatureMethod) {
    this.signatureMethod = signatureMethod;
    return this;
  }

 /**
  * Get userIntermediatePath
  * @return userIntermediatePath
  */
  @JsonProperty("userIntermediatePath")
  public SamlConfigurationPropertyItemsString getUserIntermediatePath() {
    return userIntermediatePath;
  }

  /**
   * Sets the <code>userIntermediatePath</code> property.
   */
 public void setUserIntermediatePath(SamlConfigurationPropertyItemsString userIntermediatePath) {
    this.userIntermediatePath = userIntermediatePath;
  }

  /**
   * Sets the <code>userIntermediatePath</code> property.
   */
  public SamlConfigurationProperties userIntermediatePath(SamlConfigurationPropertyItemsString userIntermediatePath) {
    this.userIntermediatePath = userIntermediatePath;
    return this;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SamlConfigurationProperties samlConfigurationProperties = (SamlConfigurationProperties) o;
    return Objects.equals(this.path, samlConfigurationProperties.path) &&
        Objects.equals(this.serviceRanking, samlConfigurationProperties.serviceRanking) &&
        Objects.equals(this.idpUrl, samlConfigurationProperties.idpUrl) &&
        Objects.equals(this.idpCertAlias, samlConfigurationProperties.idpCertAlias) &&
        Objects.equals(this.idpHttpRedirect, samlConfigurationProperties.idpHttpRedirect) &&
        Objects.equals(this.serviceProviderEntityId, samlConfigurationProperties.serviceProviderEntityId) &&
        Objects.equals(this.assertionConsumerServiceURL, samlConfigurationProperties.assertionConsumerServiceURL) &&
        Objects.equals(this.spPrivateKeyAlias, samlConfigurationProperties.spPrivateKeyAlias) &&
        Objects.equals(this.keyStorePassword, samlConfigurationProperties.keyStorePassword) &&
        Objects.equals(this.defaultRedirectUrl, samlConfigurationProperties.defaultRedirectUrl) &&
        Objects.equals(this.userIDAttribute, samlConfigurationProperties.userIDAttribute) &&
        Objects.equals(this.useEncryption, samlConfigurationProperties.useEncryption) &&
        Objects.equals(this.createUser, samlConfigurationProperties.createUser) &&
        Objects.equals(this.addGroupMemberships, samlConfigurationProperties.addGroupMemberships) &&
        Objects.equals(this.groupMembershipAttribute, samlConfigurationProperties.groupMembershipAttribute) &&
        Objects.equals(this.defaultGroups, samlConfigurationProperties.defaultGroups) &&
        Objects.equals(this.nameIdFormat, samlConfigurationProperties.nameIdFormat) &&
        Objects.equals(this.synchronizeAttributes, samlConfigurationProperties.synchronizeAttributes) &&
        Objects.equals(this.handleLogout, samlConfigurationProperties.handleLogout) &&
        Objects.equals(this.logoutUrl, samlConfigurationProperties.logoutUrl) &&
        Objects.equals(this.clockTolerance, samlConfigurationProperties.clockTolerance) &&
        Objects.equals(this.digestMethod, samlConfigurationProperties.digestMethod) &&
        Objects.equals(this.signatureMethod, samlConfigurationProperties.signatureMethod) &&
        Objects.equals(this.userIntermediatePath, samlConfigurationProperties.userIntermediatePath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, serviceRanking, idpUrl, idpCertAlias, idpHttpRedirect, serviceProviderEntityId, assertionConsumerServiceURL, spPrivateKeyAlias, keyStorePassword, defaultRedirectUrl, userIDAttribute, useEncryption, createUser, addGroupMemberships, groupMembershipAttribute, defaultGroups, nameIdFormat, synchronizeAttributes, handleLogout, logoutUrl, clockTolerance, digestMethod, signatureMethod, userIntermediatePath);
  }

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

