package org.openapitools.model;

import org.openapitools.model.SamlConfigurationPropertyItemsArray;
import org.openapitools.model.SamlConfigurationPropertyItemsBoolean;
import org.openapitools.model.SamlConfigurationPropertyItemsLong;
import org.openapitools.model.SamlConfigurationPropertyItemsString;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SamlConfigurationProperties  {
  
  @ApiModelProperty(value = "")
  private SamlConfigurationPropertyItemsArray path = null;

  @ApiModelProperty(value = "")
  private SamlConfigurationPropertyItemsLong serviceRanking = null;

  @ApiModelProperty(value = "")
  private SamlConfigurationPropertyItemsString idpUrl = null;

  @ApiModelProperty(value = "")
  private SamlConfigurationPropertyItemsString idpCertAlias = null;

  @ApiModelProperty(value = "")
  private SamlConfigurationPropertyItemsBoolean idpHttpRedirect = null;

  @ApiModelProperty(value = "")
  private SamlConfigurationPropertyItemsString serviceProviderEntityId = null;

  @ApiModelProperty(value = "")
  private SamlConfigurationPropertyItemsString assertionConsumerServiceURL = null;

  @ApiModelProperty(value = "")
  private SamlConfigurationPropertyItemsString spPrivateKeyAlias = null;

  @ApiModelProperty(value = "")
  private SamlConfigurationPropertyItemsString keyStorePassword = null;

  @ApiModelProperty(value = "")
  private SamlConfigurationPropertyItemsString defaultRedirectUrl = null;

  @ApiModelProperty(value = "")
  private SamlConfigurationPropertyItemsString userIDAttribute = null;

  @ApiModelProperty(value = "")
  private SamlConfigurationPropertyItemsBoolean useEncryption = null;

  @ApiModelProperty(value = "")
  private SamlConfigurationPropertyItemsBoolean createUser = null;

  @ApiModelProperty(value = "")
  private SamlConfigurationPropertyItemsBoolean addGroupMemberships = null;

  @ApiModelProperty(value = "")
  private SamlConfigurationPropertyItemsString groupMembershipAttribute = null;

  @ApiModelProperty(value = "")
  private SamlConfigurationPropertyItemsArray defaultGroups = null;

  @ApiModelProperty(value = "")
  private SamlConfigurationPropertyItemsString nameIdFormat = null;

  @ApiModelProperty(value = "")
  private SamlConfigurationPropertyItemsArray synchronizeAttributes = null;

  @ApiModelProperty(value = "")
  private SamlConfigurationPropertyItemsBoolean handleLogout = null;

  @ApiModelProperty(value = "")
  private SamlConfigurationPropertyItemsString logoutUrl = null;

  @ApiModelProperty(value = "")
  private SamlConfigurationPropertyItemsLong clockTolerance = null;

  @ApiModelProperty(value = "")
  private SamlConfigurationPropertyItemsString digestMethod = null;

  @ApiModelProperty(value = "")
  private SamlConfigurationPropertyItemsString signatureMethod = null;

  @ApiModelProperty(value = "")
  private SamlConfigurationPropertyItemsString userIntermediatePath = null;
 /**
   * Get path
   * @return path
  **/
  @JsonProperty("path")
  public SamlConfigurationPropertyItemsArray getPath() {
    return path;
  }

  public void setPath(SamlConfigurationPropertyItemsArray path) {
    this.path = path;
  }

  public SamlConfigurationProperties path(SamlConfigurationPropertyItemsArray path) {
    this.path = path;
    return this;
  }

 /**
   * Get serviceRanking
   * @return serviceRanking
  **/
  @JsonProperty("service.ranking")
  public SamlConfigurationPropertyItemsLong getServiceRanking() {
    return serviceRanking;
  }

  public void setServiceRanking(SamlConfigurationPropertyItemsLong serviceRanking) {
    this.serviceRanking = serviceRanking;
  }

  public SamlConfigurationProperties serviceRanking(SamlConfigurationPropertyItemsLong serviceRanking) {
    this.serviceRanking = serviceRanking;
    return this;
  }

 /**
   * Get idpUrl
   * @return idpUrl
  **/
  @JsonProperty("idpUrl")
  public SamlConfigurationPropertyItemsString getIdpUrl() {
    return idpUrl;
  }

  public void setIdpUrl(SamlConfigurationPropertyItemsString idpUrl) {
    this.idpUrl = idpUrl;
  }

  public SamlConfigurationProperties idpUrl(SamlConfigurationPropertyItemsString idpUrl) {
    this.idpUrl = idpUrl;
    return this;
  }

 /**
   * Get idpCertAlias
   * @return idpCertAlias
  **/
  @JsonProperty("idpCertAlias")
  public SamlConfigurationPropertyItemsString getIdpCertAlias() {
    return idpCertAlias;
  }

  public void setIdpCertAlias(SamlConfigurationPropertyItemsString idpCertAlias) {
    this.idpCertAlias = idpCertAlias;
  }

  public SamlConfigurationProperties idpCertAlias(SamlConfigurationPropertyItemsString idpCertAlias) {
    this.idpCertAlias = idpCertAlias;
    return this;
  }

 /**
   * Get idpHttpRedirect
   * @return idpHttpRedirect
  **/
  @JsonProperty("idpHttpRedirect")
  public SamlConfigurationPropertyItemsBoolean getIdpHttpRedirect() {
    return idpHttpRedirect;
  }

  public void setIdpHttpRedirect(SamlConfigurationPropertyItemsBoolean idpHttpRedirect) {
    this.idpHttpRedirect = idpHttpRedirect;
  }

  public SamlConfigurationProperties idpHttpRedirect(SamlConfigurationPropertyItemsBoolean idpHttpRedirect) {
    this.idpHttpRedirect = idpHttpRedirect;
    return this;
  }

 /**
   * Get serviceProviderEntityId
   * @return serviceProviderEntityId
  **/
  @JsonProperty("serviceProviderEntityId")
  public SamlConfigurationPropertyItemsString getServiceProviderEntityId() {
    return serviceProviderEntityId;
  }

  public void setServiceProviderEntityId(SamlConfigurationPropertyItemsString serviceProviderEntityId) {
    this.serviceProviderEntityId = serviceProviderEntityId;
  }

  public SamlConfigurationProperties serviceProviderEntityId(SamlConfigurationPropertyItemsString serviceProviderEntityId) {
    this.serviceProviderEntityId = serviceProviderEntityId;
    return this;
  }

 /**
   * Get assertionConsumerServiceURL
   * @return assertionConsumerServiceURL
  **/
  @JsonProperty("assertionConsumerServiceURL")
  public SamlConfigurationPropertyItemsString getAssertionConsumerServiceURL() {
    return assertionConsumerServiceURL;
  }

  public void setAssertionConsumerServiceURL(SamlConfigurationPropertyItemsString assertionConsumerServiceURL) {
    this.assertionConsumerServiceURL = assertionConsumerServiceURL;
  }

  public SamlConfigurationProperties assertionConsumerServiceURL(SamlConfigurationPropertyItemsString assertionConsumerServiceURL) {
    this.assertionConsumerServiceURL = assertionConsumerServiceURL;
    return this;
  }

 /**
   * Get spPrivateKeyAlias
   * @return spPrivateKeyAlias
  **/
  @JsonProperty("spPrivateKeyAlias")
  public SamlConfigurationPropertyItemsString getSpPrivateKeyAlias() {
    return spPrivateKeyAlias;
  }

  public void setSpPrivateKeyAlias(SamlConfigurationPropertyItemsString spPrivateKeyAlias) {
    this.spPrivateKeyAlias = spPrivateKeyAlias;
  }

  public SamlConfigurationProperties spPrivateKeyAlias(SamlConfigurationPropertyItemsString spPrivateKeyAlias) {
    this.spPrivateKeyAlias = spPrivateKeyAlias;
    return this;
  }

 /**
   * Get keyStorePassword
   * @return keyStorePassword
  **/
  @JsonProperty("keyStorePassword")
  public SamlConfigurationPropertyItemsString getKeyStorePassword() {
    return keyStorePassword;
  }

  public void setKeyStorePassword(SamlConfigurationPropertyItemsString keyStorePassword) {
    this.keyStorePassword = keyStorePassword;
  }

  public SamlConfigurationProperties keyStorePassword(SamlConfigurationPropertyItemsString keyStorePassword) {
    this.keyStorePassword = keyStorePassword;
    return this;
  }

 /**
   * Get defaultRedirectUrl
   * @return defaultRedirectUrl
  **/
  @JsonProperty("defaultRedirectUrl")
  public SamlConfigurationPropertyItemsString getDefaultRedirectUrl() {
    return defaultRedirectUrl;
  }

  public void setDefaultRedirectUrl(SamlConfigurationPropertyItemsString defaultRedirectUrl) {
    this.defaultRedirectUrl = defaultRedirectUrl;
  }

  public SamlConfigurationProperties defaultRedirectUrl(SamlConfigurationPropertyItemsString defaultRedirectUrl) {
    this.defaultRedirectUrl = defaultRedirectUrl;
    return this;
  }

 /**
   * Get userIDAttribute
   * @return userIDAttribute
  **/
  @JsonProperty("userIDAttribute")
  public SamlConfigurationPropertyItemsString getUserIDAttribute() {
    return userIDAttribute;
  }

  public void setUserIDAttribute(SamlConfigurationPropertyItemsString userIDAttribute) {
    this.userIDAttribute = userIDAttribute;
  }

  public SamlConfigurationProperties userIDAttribute(SamlConfigurationPropertyItemsString userIDAttribute) {
    this.userIDAttribute = userIDAttribute;
    return this;
  }

 /**
   * Get useEncryption
   * @return useEncryption
  **/
  @JsonProperty("useEncryption")
  public SamlConfigurationPropertyItemsBoolean getUseEncryption() {
    return useEncryption;
  }

  public void setUseEncryption(SamlConfigurationPropertyItemsBoolean useEncryption) {
    this.useEncryption = useEncryption;
  }

  public SamlConfigurationProperties useEncryption(SamlConfigurationPropertyItemsBoolean useEncryption) {
    this.useEncryption = useEncryption;
    return this;
  }

 /**
   * Get createUser
   * @return createUser
  **/
  @JsonProperty("createUser")
  public SamlConfigurationPropertyItemsBoolean getCreateUser() {
    return createUser;
  }

  public void setCreateUser(SamlConfigurationPropertyItemsBoolean createUser) {
    this.createUser = createUser;
  }

  public SamlConfigurationProperties createUser(SamlConfigurationPropertyItemsBoolean createUser) {
    this.createUser = createUser;
    return this;
  }

 /**
   * Get addGroupMemberships
   * @return addGroupMemberships
  **/
  @JsonProperty("addGroupMemberships")
  public SamlConfigurationPropertyItemsBoolean getAddGroupMemberships() {
    return addGroupMemberships;
  }

  public void setAddGroupMemberships(SamlConfigurationPropertyItemsBoolean addGroupMemberships) {
    this.addGroupMemberships = addGroupMemberships;
  }

  public SamlConfigurationProperties addGroupMemberships(SamlConfigurationPropertyItemsBoolean addGroupMemberships) {
    this.addGroupMemberships = addGroupMemberships;
    return this;
  }

 /**
   * Get groupMembershipAttribute
   * @return groupMembershipAttribute
  **/
  @JsonProperty("groupMembershipAttribute")
  public SamlConfigurationPropertyItemsString getGroupMembershipAttribute() {
    return groupMembershipAttribute;
  }

  public void setGroupMembershipAttribute(SamlConfigurationPropertyItemsString groupMembershipAttribute) {
    this.groupMembershipAttribute = groupMembershipAttribute;
  }

  public SamlConfigurationProperties groupMembershipAttribute(SamlConfigurationPropertyItemsString groupMembershipAttribute) {
    this.groupMembershipAttribute = groupMembershipAttribute;
    return this;
  }

 /**
   * Get defaultGroups
   * @return defaultGroups
  **/
  @JsonProperty("defaultGroups")
  public SamlConfigurationPropertyItemsArray getDefaultGroups() {
    return defaultGroups;
  }

  public void setDefaultGroups(SamlConfigurationPropertyItemsArray defaultGroups) {
    this.defaultGroups = defaultGroups;
  }

  public SamlConfigurationProperties defaultGroups(SamlConfigurationPropertyItemsArray defaultGroups) {
    this.defaultGroups = defaultGroups;
    return this;
  }

 /**
   * Get nameIdFormat
   * @return nameIdFormat
  **/
  @JsonProperty("nameIdFormat")
  public SamlConfigurationPropertyItemsString getNameIdFormat() {
    return nameIdFormat;
  }

  public void setNameIdFormat(SamlConfigurationPropertyItemsString nameIdFormat) {
    this.nameIdFormat = nameIdFormat;
  }

  public SamlConfigurationProperties nameIdFormat(SamlConfigurationPropertyItemsString nameIdFormat) {
    this.nameIdFormat = nameIdFormat;
    return this;
  }

 /**
   * Get synchronizeAttributes
   * @return synchronizeAttributes
  **/
  @JsonProperty("synchronizeAttributes")
  public SamlConfigurationPropertyItemsArray getSynchronizeAttributes() {
    return synchronizeAttributes;
  }

  public void setSynchronizeAttributes(SamlConfigurationPropertyItemsArray synchronizeAttributes) {
    this.synchronizeAttributes = synchronizeAttributes;
  }

  public SamlConfigurationProperties synchronizeAttributes(SamlConfigurationPropertyItemsArray synchronizeAttributes) {
    this.synchronizeAttributes = synchronizeAttributes;
    return this;
  }

 /**
   * Get handleLogout
   * @return handleLogout
  **/
  @JsonProperty("handleLogout")
  public SamlConfigurationPropertyItemsBoolean getHandleLogout() {
    return handleLogout;
  }

  public void setHandleLogout(SamlConfigurationPropertyItemsBoolean handleLogout) {
    this.handleLogout = handleLogout;
  }

  public SamlConfigurationProperties handleLogout(SamlConfigurationPropertyItemsBoolean handleLogout) {
    this.handleLogout = handleLogout;
    return this;
  }

 /**
   * Get logoutUrl
   * @return logoutUrl
  **/
  @JsonProperty("logoutUrl")
  public SamlConfigurationPropertyItemsString getLogoutUrl() {
    return logoutUrl;
  }

  public void setLogoutUrl(SamlConfigurationPropertyItemsString logoutUrl) {
    this.logoutUrl = logoutUrl;
  }

  public SamlConfigurationProperties logoutUrl(SamlConfigurationPropertyItemsString logoutUrl) {
    this.logoutUrl = logoutUrl;
    return this;
  }

 /**
   * Get clockTolerance
   * @return clockTolerance
  **/
  @JsonProperty("clockTolerance")
  public SamlConfigurationPropertyItemsLong getClockTolerance() {
    return clockTolerance;
  }

  public void setClockTolerance(SamlConfigurationPropertyItemsLong clockTolerance) {
    this.clockTolerance = clockTolerance;
  }

  public SamlConfigurationProperties clockTolerance(SamlConfigurationPropertyItemsLong clockTolerance) {
    this.clockTolerance = clockTolerance;
    return this;
  }

 /**
   * Get digestMethod
   * @return digestMethod
  **/
  @JsonProperty("digestMethod")
  public SamlConfigurationPropertyItemsString getDigestMethod() {
    return digestMethod;
  }

  public void setDigestMethod(SamlConfigurationPropertyItemsString digestMethod) {
    this.digestMethod = digestMethod;
  }

  public SamlConfigurationProperties digestMethod(SamlConfigurationPropertyItemsString digestMethod) {
    this.digestMethod = digestMethod;
    return this;
  }

 /**
   * Get signatureMethod
   * @return signatureMethod
  **/
  @JsonProperty("signatureMethod")
  public SamlConfigurationPropertyItemsString getSignatureMethod() {
    return signatureMethod;
  }

  public void setSignatureMethod(SamlConfigurationPropertyItemsString signatureMethod) {
    this.signatureMethod = signatureMethod;
  }

  public SamlConfigurationProperties signatureMethod(SamlConfigurationPropertyItemsString signatureMethod) {
    this.signatureMethod = signatureMethod;
    return this;
  }

 /**
   * Get userIntermediatePath
   * @return userIntermediatePath
  **/
  @JsonProperty("userIntermediatePath")
  public SamlConfigurationPropertyItemsString getUserIntermediatePath() {
    return userIntermediatePath;
  }

  public void setUserIntermediatePath(SamlConfigurationPropertyItemsString userIntermediatePath) {
    this.userIntermediatePath = userIntermediatePath;
  }

  public SamlConfigurationProperties userIntermediatePath(SamlConfigurationPropertyItemsString userIntermediatePath) {
    this.userIntermediatePath = userIntermediatePath;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

