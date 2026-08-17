package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.SamlConfigurationPropertyItemsArray;
import org.openapitools.model.SamlConfigurationPropertyItemsBoolean;
import org.openapitools.model.SamlConfigurationPropertyItemsLong;
import org.openapitools.model.SamlConfigurationPropertyItemsString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("SamlConfigurationProperties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-17T02:15:42.417242947Z[Etc/UTC]", comments = "Generator version: 7.24.0")
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

  public SamlConfigurationProperties() {
  }

  /**
   **/
  public SamlConfigurationProperties path(SamlConfigurationPropertyItemsArray path) {
    this.path = path;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("path")
  @Valid public SamlConfigurationPropertyItemsArray getPath() {
    return path;
  }

  @JsonProperty("path")
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
  @Valid public SamlConfigurationPropertyItemsLong getServiceRanking() {
    return serviceRanking;
  }

  @JsonProperty("service.ranking")
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
  @Valid public SamlConfigurationPropertyItemsString getIdpUrl() {
    return idpUrl;
  }

  @JsonProperty("idpUrl")
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
  @Valid public SamlConfigurationPropertyItemsString getIdpCertAlias() {
    return idpCertAlias;
  }

  @JsonProperty("idpCertAlias")
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
  @Valid public SamlConfigurationPropertyItemsBoolean getIdpHttpRedirect() {
    return idpHttpRedirect;
  }

  @JsonProperty("idpHttpRedirect")
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
  @Valid public SamlConfigurationPropertyItemsString getServiceProviderEntityId() {
    return serviceProviderEntityId;
  }

  @JsonProperty("serviceProviderEntityId")
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
  @Valid public SamlConfigurationPropertyItemsString getAssertionConsumerServiceURL() {
    return assertionConsumerServiceURL;
  }

  @JsonProperty("assertionConsumerServiceURL")
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
  @Valid public SamlConfigurationPropertyItemsString getSpPrivateKeyAlias() {
    return spPrivateKeyAlias;
  }

  @JsonProperty("spPrivateKeyAlias")
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
  @Valid public SamlConfigurationPropertyItemsString getKeyStorePassword() {
    return keyStorePassword;
  }

  @JsonProperty("keyStorePassword")
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
  @Valid public SamlConfigurationPropertyItemsString getDefaultRedirectUrl() {
    return defaultRedirectUrl;
  }

  @JsonProperty("defaultRedirectUrl")
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
  @Valid public SamlConfigurationPropertyItemsString getUserIDAttribute() {
    return userIDAttribute;
  }

  @JsonProperty("userIDAttribute")
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
  @Valid public SamlConfigurationPropertyItemsBoolean getUseEncryption() {
    return useEncryption;
  }

  @JsonProperty("useEncryption")
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
  @Valid public SamlConfigurationPropertyItemsBoolean getCreateUser() {
    return createUser;
  }

  @JsonProperty("createUser")
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
  @Valid public SamlConfigurationPropertyItemsBoolean getAddGroupMemberships() {
    return addGroupMemberships;
  }

  @JsonProperty("addGroupMemberships")
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
  @Valid public SamlConfigurationPropertyItemsString getGroupMembershipAttribute() {
    return groupMembershipAttribute;
  }

  @JsonProperty("groupMembershipAttribute")
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
  @Valid public SamlConfigurationPropertyItemsArray getDefaultGroups() {
    return defaultGroups;
  }

  @JsonProperty("defaultGroups")
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
  @Valid public SamlConfigurationPropertyItemsString getNameIdFormat() {
    return nameIdFormat;
  }

  @JsonProperty("nameIdFormat")
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
  @Valid public SamlConfigurationPropertyItemsArray getSynchronizeAttributes() {
    return synchronizeAttributes;
  }

  @JsonProperty("synchronizeAttributes")
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
  @Valid public SamlConfigurationPropertyItemsBoolean getHandleLogout() {
    return handleLogout;
  }

  @JsonProperty("handleLogout")
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
  @Valid public SamlConfigurationPropertyItemsString getLogoutUrl() {
    return logoutUrl;
  }

  @JsonProperty("logoutUrl")
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
  @Valid public SamlConfigurationPropertyItemsLong getClockTolerance() {
    return clockTolerance;
  }

  @JsonProperty("clockTolerance")
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
  @Valid public SamlConfigurationPropertyItemsString getDigestMethod() {
    return digestMethod;
  }

  @JsonProperty("digestMethod")
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
  @Valid public SamlConfigurationPropertyItemsString getSignatureMethod() {
    return signatureMethod;
  }

  @JsonProperty("signatureMethod")
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
  @Valid public SamlConfigurationPropertyItemsString getUserIntermediatePath() {
    return userIntermediatePath;
  }

  @JsonProperty("userIntermediatePath")
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
