package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.SamlConfigurationPropertyItemsArray;
import org.openapitools.model.SamlConfigurationPropertyItemsBoolean;
import org.openapitools.model.SamlConfigurationPropertyItemsLong;
import org.openapitools.model.SamlConfigurationPropertyItemsString;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2021-09-03T15:25:18.608+10:00[Australia/Melbourne]")
public class SamlConfigurationProperties   {
  @JsonProperty("path")
  private SamlConfigurationPropertyItemsArray path;

  @JsonProperty("service.ranking")
  private SamlConfigurationPropertyItemsLong serviceRanking;

  @JsonProperty("idpUrl")
  private SamlConfigurationPropertyItemsString idpUrl;

  @JsonProperty("idpCertAlias")
  private SamlConfigurationPropertyItemsString idpCertAlias;

  @JsonProperty("idpHttpRedirect")
  private SamlConfigurationPropertyItemsBoolean idpHttpRedirect;

  @JsonProperty("serviceProviderEntityId")
  private SamlConfigurationPropertyItemsString serviceProviderEntityId;

  @JsonProperty("assertionConsumerServiceURL")
  private SamlConfigurationPropertyItemsString assertionConsumerServiceURL;

  @JsonProperty("spPrivateKeyAlias")
  private SamlConfigurationPropertyItemsString spPrivateKeyAlias;

  @JsonProperty("keyStorePassword")
  private SamlConfigurationPropertyItemsString keyStorePassword;

  @JsonProperty("defaultRedirectUrl")
  private SamlConfigurationPropertyItemsString defaultRedirectUrl;

  @JsonProperty("userIDAttribute")
  private SamlConfigurationPropertyItemsString userIDAttribute;

  @JsonProperty("useEncryption")
  private SamlConfigurationPropertyItemsBoolean useEncryption;

  @JsonProperty("createUser")
  private SamlConfigurationPropertyItemsBoolean createUser;

  @JsonProperty("addGroupMemberships")
  private SamlConfigurationPropertyItemsBoolean addGroupMemberships;

  @JsonProperty("groupMembershipAttribute")
  private SamlConfigurationPropertyItemsString groupMembershipAttribute;

  @JsonProperty("defaultGroups")
  private SamlConfigurationPropertyItemsArray defaultGroups;

  @JsonProperty("nameIdFormat")
  private SamlConfigurationPropertyItemsString nameIdFormat;

  @JsonProperty("synchronizeAttributes")
  private SamlConfigurationPropertyItemsArray synchronizeAttributes;

  @JsonProperty("handleLogout")
  private SamlConfigurationPropertyItemsBoolean handleLogout;

  @JsonProperty("logoutUrl")
  private SamlConfigurationPropertyItemsString logoutUrl;

  @JsonProperty("clockTolerance")
  private SamlConfigurationPropertyItemsLong clockTolerance;

  @JsonProperty("digestMethod")
  private SamlConfigurationPropertyItemsString digestMethod;

  @JsonProperty("signatureMethod")
  private SamlConfigurationPropertyItemsString signatureMethod;

  @JsonProperty("userIntermediatePath")
  private SamlConfigurationPropertyItemsString userIntermediatePath;

  /**
   **/
  public SamlConfigurationProperties path(SamlConfigurationPropertyItemsArray path) {
    this.path = path;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("path")
  public SamlConfigurationPropertyItemsArray getPath() {
    return path;
  }
  public void setPath(SamlConfigurationPropertyItemsArray path) {
    this.path = path;
  }

  /**
   **/
  public SamlConfigurationProperties serviceRanking(SamlConfigurationPropertyItemsLong serviceRanking) {
    this.serviceRanking = serviceRanking;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("service.ranking")
  public SamlConfigurationPropertyItemsLong getServiceRanking() {
    return serviceRanking;
  }
  public void setServiceRanking(SamlConfigurationPropertyItemsLong serviceRanking) {
    this.serviceRanking = serviceRanking;
  }

  /**
   **/
  public SamlConfigurationProperties idpUrl(SamlConfigurationPropertyItemsString idpUrl) {
    this.idpUrl = idpUrl;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("idpUrl")
  public SamlConfigurationPropertyItemsString getIdpUrl() {
    return idpUrl;
  }
  public void setIdpUrl(SamlConfigurationPropertyItemsString idpUrl) {
    this.idpUrl = idpUrl;
  }

  /**
   **/
  public SamlConfigurationProperties idpCertAlias(SamlConfigurationPropertyItemsString idpCertAlias) {
    this.idpCertAlias = idpCertAlias;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("idpCertAlias")
  public SamlConfigurationPropertyItemsString getIdpCertAlias() {
    return idpCertAlias;
  }
  public void setIdpCertAlias(SamlConfigurationPropertyItemsString idpCertAlias) {
    this.idpCertAlias = idpCertAlias;
  }

  /**
   **/
  public SamlConfigurationProperties idpHttpRedirect(SamlConfigurationPropertyItemsBoolean idpHttpRedirect) {
    this.idpHttpRedirect = idpHttpRedirect;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("idpHttpRedirect")
  public SamlConfigurationPropertyItemsBoolean getIdpHttpRedirect() {
    return idpHttpRedirect;
  }
  public void setIdpHttpRedirect(SamlConfigurationPropertyItemsBoolean idpHttpRedirect) {
    this.idpHttpRedirect = idpHttpRedirect;
  }

  /**
   **/
  public SamlConfigurationProperties serviceProviderEntityId(SamlConfigurationPropertyItemsString serviceProviderEntityId) {
    this.serviceProviderEntityId = serviceProviderEntityId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("serviceProviderEntityId")
  public SamlConfigurationPropertyItemsString getServiceProviderEntityId() {
    return serviceProviderEntityId;
  }
  public void setServiceProviderEntityId(SamlConfigurationPropertyItemsString serviceProviderEntityId) {
    this.serviceProviderEntityId = serviceProviderEntityId;
  }

  /**
   **/
  public SamlConfigurationProperties assertionConsumerServiceURL(SamlConfigurationPropertyItemsString assertionConsumerServiceURL) {
    this.assertionConsumerServiceURL = assertionConsumerServiceURL;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("assertionConsumerServiceURL")
  public SamlConfigurationPropertyItemsString getAssertionConsumerServiceURL() {
    return assertionConsumerServiceURL;
  }
  public void setAssertionConsumerServiceURL(SamlConfigurationPropertyItemsString assertionConsumerServiceURL) {
    this.assertionConsumerServiceURL = assertionConsumerServiceURL;
  }

  /**
   **/
  public SamlConfigurationProperties spPrivateKeyAlias(SamlConfigurationPropertyItemsString spPrivateKeyAlias) {
    this.spPrivateKeyAlias = spPrivateKeyAlias;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("spPrivateKeyAlias")
  public SamlConfigurationPropertyItemsString getSpPrivateKeyAlias() {
    return spPrivateKeyAlias;
  }
  public void setSpPrivateKeyAlias(SamlConfigurationPropertyItemsString spPrivateKeyAlias) {
    this.spPrivateKeyAlias = spPrivateKeyAlias;
  }

  /**
   **/
  public SamlConfigurationProperties keyStorePassword(SamlConfigurationPropertyItemsString keyStorePassword) {
    this.keyStorePassword = keyStorePassword;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("keyStorePassword")
  public SamlConfigurationPropertyItemsString getKeyStorePassword() {
    return keyStorePassword;
  }
  public void setKeyStorePassword(SamlConfigurationPropertyItemsString keyStorePassword) {
    this.keyStorePassword = keyStorePassword;
  }

  /**
   **/
  public SamlConfigurationProperties defaultRedirectUrl(SamlConfigurationPropertyItemsString defaultRedirectUrl) {
    this.defaultRedirectUrl = defaultRedirectUrl;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("defaultRedirectUrl")
  public SamlConfigurationPropertyItemsString getDefaultRedirectUrl() {
    return defaultRedirectUrl;
  }
  public void setDefaultRedirectUrl(SamlConfigurationPropertyItemsString defaultRedirectUrl) {
    this.defaultRedirectUrl = defaultRedirectUrl;
  }

  /**
   **/
  public SamlConfigurationProperties userIDAttribute(SamlConfigurationPropertyItemsString userIDAttribute) {
    this.userIDAttribute = userIDAttribute;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("userIDAttribute")
  public SamlConfigurationPropertyItemsString getUserIDAttribute() {
    return userIDAttribute;
  }
  public void setUserIDAttribute(SamlConfigurationPropertyItemsString userIDAttribute) {
    this.userIDAttribute = userIDAttribute;
  }

  /**
   **/
  public SamlConfigurationProperties useEncryption(SamlConfigurationPropertyItemsBoolean useEncryption) {
    this.useEncryption = useEncryption;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("useEncryption")
  public SamlConfigurationPropertyItemsBoolean getUseEncryption() {
    return useEncryption;
  }
  public void setUseEncryption(SamlConfigurationPropertyItemsBoolean useEncryption) {
    this.useEncryption = useEncryption;
  }

  /**
   **/
  public SamlConfigurationProperties createUser(SamlConfigurationPropertyItemsBoolean createUser) {
    this.createUser = createUser;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("createUser")
  public SamlConfigurationPropertyItemsBoolean getCreateUser() {
    return createUser;
  }
  public void setCreateUser(SamlConfigurationPropertyItemsBoolean createUser) {
    this.createUser = createUser;
  }

  /**
   **/
  public SamlConfigurationProperties addGroupMemberships(SamlConfigurationPropertyItemsBoolean addGroupMemberships) {
    this.addGroupMemberships = addGroupMemberships;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("addGroupMemberships")
  public SamlConfigurationPropertyItemsBoolean getAddGroupMemberships() {
    return addGroupMemberships;
  }
  public void setAddGroupMemberships(SamlConfigurationPropertyItemsBoolean addGroupMemberships) {
    this.addGroupMemberships = addGroupMemberships;
  }

  /**
   **/
  public SamlConfigurationProperties groupMembershipAttribute(SamlConfigurationPropertyItemsString groupMembershipAttribute) {
    this.groupMembershipAttribute = groupMembershipAttribute;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("groupMembershipAttribute")
  public SamlConfigurationPropertyItemsString getGroupMembershipAttribute() {
    return groupMembershipAttribute;
  }
  public void setGroupMembershipAttribute(SamlConfigurationPropertyItemsString groupMembershipAttribute) {
    this.groupMembershipAttribute = groupMembershipAttribute;
  }

  /**
   **/
  public SamlConfigurationProperties defaultGroups(SamlConfigurationPropertyItemsArray defaultGroups) {
    this.defaultGroups = defaultGroups;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("defaultGroups")
  public SamlConfigurationPropertyItemsArray getDefaultGroups() {
    return defaultGroups;
  }
  public void setDefaultGroups(SamlConfigurationPropertyItemsArray defaultGroups) {
    this.defaultGroups = defaultGroups;
  }

  /**
   **/
  public SamlConfigurationProperties nameIdFormat(SamlConfigurationPropertyItemsString nameIdFormat) {
    this.nameIdFormat = nameIdFormat;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("nameIdFormat")
  public SamlConfigurationPropertyItemsString getNameIdFormat() {
    return nameIdFormat;
  }
  public void setNameIdFormat(SamlConfigurationPropertyItemsString nameIdFormat) {
    this.nameIdFormat = nameIdFormat;
  }

  /**
   **/
  public SamlConfigurationProperties synchronizeAttributes(SamlConfigurationPropertyItemsArray synchronizeAttributes) {
    this.synchronizeAttributes = synchronizeAttributes;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("synchronizeAttributes")
  public SamlConfigurationPropertyItemsArray getSynchronizeAttributes() {
    return synchronizeAttributes;
  }
  public void setSynchronizeAttributes(SamlConfigurationPropertyItemsArray synchronizeAttributes) {
    this.synchronizeAttributes = synchronizeAttributes;
  }

  /**
   **/
  public SamlConfigurationProperties handleLogout(SamlConfigurationPropertyItemsBoolean handleLogout) {
    this.handleLogout = handleLogout;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("handleLogout")
  public SamlConfigurationPropertyItemsBoolean getHandleLogout() {
    return handleLogout;
  }
  public void setHandleLogout(SamlConfigurationPropertyItemsBoolean handleLogout) {
    this.handleLogout = handleLogout;
  }

  /**
   **/
  public SamlConfigurationProperties logoutUrl(SamlConfigurationPropertyItemsString logoutUrl) {
    this.logoutUrl = logoutUrl;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("logoutUrl")
  public SamlConfigurationPropertyItemsString getLogoutUrl() {
    return logoutUrl;
  }
  public void setLogoutUrl(SamlConfigurationPropertyItemsString logoutUrl) {
    this.logoutUrl = logoutUrl;
  }

  /**
   **/
  public SamlConfigurationProperties clockTolerance(SamlConfigurationPropertyItemsLong clockTolerance) {
    this.clockTolerance = clockTolerance;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("clockTolerance")
  public SamlConfigurationPropertyItemsLong getClockTolerance() {
    return clockTolerance;
  }
  public void setClockTolerance(SamlConfigurationPropertyItemsLong clockTolerance) {
    this.clockTolerance = clockTolerance;
  }

  /**
   **/
  public SamlConfigurationProperties digestMethod(SamlConfigurationPropertyItemsString digestMethod) {
    this.digestMethod = digestMethod;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("digestMethod")
  public SamlConfigurationPropertyItemsString getDigestMethod() {
    return digestMethod;
  }
  public void setDigestMethod(SamlConfigurationPropertyItemsString digestMethod) {
    this.digestMethod = digestMethod;
  }

  /**
   **/
  public SamlConfigurationProperties signatureMethod(SamlConfigurationPropertyItemsString signatureMethod) {
    this.signatureMethod = signatureMethod;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("signatureMethod")
  public SamlConfigurationPropertyItemsString getSignatureMethod() {
    return signatureMethod;
  }
  public void setSignatureMethod(SamlConfigurationPropertyItemsString signatureMethod) {
    this.signatureMethod = signatureMethod;
  }

  /**
   **/
  public SamlConfigurationProperties userIntermediatePath(SamlConfigurationPropertyItemsString userIntermediatePath) {
    this.userIntermediatePath = userIntermediatePath;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("userIntermediatePath")
  public SamlConfigurationPropertyItemsString getUserIntermediatePath() {
    return userIntermediatePath;
  }
  public void setUserIntermediatePath(SamlConfigurationPropertyItemsString userIntermediatePath) {
    this.userIntermediatePath = userIntermediatePath;
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
    return Objects.equals(path, samlConfigurationProperties.path) &&
        Objects.equals(serviceRanking, samlConfigurationProperties.serviceRanking) &&
        Objects.equals(idpUrl, samlConfigurationProperties.idpUrl) &&
        Objects.equals(idpCertAlias, samlConfigurationProperties.idpCertAlias) &&
        Objects.equals(idpHttpRedirect, samlConfigurationProperties.idpHttpRedirect) &&
        Objects.equals(serviceProviderEntityId, samlConfigurationProperties.serviceProviderEntityId) &&
        Objects.equals(assertionConsumerServiceURL, samlConfigurationProperties.assertionConsumerServiceURL) &&
        Objects.equals(spPrivateKeyAlias, samlConfigurationProperties.spPrivateKeyAlias) &&
        Objects.equals(keyStorePassword, samlConfigurationProperties.keyStorePassword) &&
        Objects.equals(defaultRedirectUrl, samlConfigurationProperties.defaultRedirectUrl) &&
        Objects.equals(userIDAttribute, samlConfigurationProperties.userIDAttribute) &&
        Objects.equals(useEncryption, samlConfigurationProperties.useEncryption) &&
        Objects.equals(createUser, samlConfigurationProperties.createUser) &&
        Objects.equals(addGroupMemberships, samlConfigurationProperties.addGroupMemberships) &&
        Objects.equals(groupMembershipAttribute, samlConfigurationProperties.groupMembershipAttribute) &&
        Objects.equals(defaultGroups, samlConfigurationProperties.defaultGroups) &&
        Objects.equals(nameIdFormat, samlConfigurationProperties.nameIdFormat) &&
        Objects.equals(synchronizeAttributes, samlConfigurationProperties.synchronizeAttributes) &&
        Objects.equals(handleLogout, samlConfigurationProperties.handleLogout) &&
        Objects.equals(logoutUrl, samlConfigurationProperties.logoutUrl) &&
        Objects.equals(clockTolerance, samlConfigurationProperties.clockTolerance) &&
        Objects.equals(digestMethod, samlConfigurationProperties.digestMethod) &&
        Objects.equals(signatureMethod, samlConfigurationProperties.signatureMethod) &&
        Objects.equals(userIntermediatePath, samlConfigurationProperties.userIntermediatePath);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

