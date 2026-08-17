package org.openapitools.model;

import org.openapitools.model.SamlConfigurationPropertyItemsArray;
import org.openapitools.model.SamlConfigurationPropertyItemsBoolean;
import org.openapitools.model.SamlConfigurationPropertyItemsLong;
import org.openapitools.model.SamlConfigurationPropertyItemsString;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class SamlConfigurationProperties implements Serializable {
  private static final long serialVersionUID = 1L;

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
   * 
   * @return path
   */
  public SamlConfigurationPropertyItemsArray getPath() {
    return path;
  }

  public void setPath(SamlConfigurationPropertyItemsArray path) {
    this.path = path;
  }

  /**
   * 
   * @return serviceRanking
   */
  public SamlConfigurationPropertyItemsLong getServiceRanking() {
    return serviceRanking;
  }

  public void setServiceRanking(SamlConfigurationPropertyItemsLong serviceRanking) {
    this.serviceRanking = serviceRanking;
  }

  /**
   * 
   * @return idpUrl
   */
  public SamlConfigurationPropertyItemsString getIdpUrl() {
    return idpUrl;
  }

  public void setIdpUrl(SamlConfigurationPropertyItemsString idpUrl) {
    this.idpUrl = idpUrl;
  }

  /**
   * 
   * @return idpCertAlias
   */
  public SamlConfigurationPropertyItemsString getIdpCertAlias() {
    return idpCertAlias;
  }

  public void setIdpCertAlias(SamlConfigurationPropertyItemsString idpCertAlias) {
    this.idpCertAlias = idpCertAlias;
  }

  /**
   * 
   * @return idpHttpRedirect
   */
  public SamlConfigurationPropertyItemsBoolean getIdpHttpRedirect() {
    return idpHttpRedirect;
  }

  public void setIdpHttpRedirect(SamlConfigurationPropertyItemsBoolean idpHttpRedirect) {
    this.idpHttpRedirect = idpHttpRedirect;
  }

  /**
   * 
   * @return serviceProviderEntityId
   */
  public SamlConfigurationPropertyItemsString getServiceProviderEntityId() {
    return serviceProviderEntityId;
  }

  public void setServiceProviderEntityId(SamlConfigurationPropertyItemsString serviceProviderEntityId) {
    this.serviceProviderEntityId = serviceProviderEntityId;
  }

  /**
   * 
   * @return assertionConsumerServiceURL
   */
  public SamlConfigurationPropertyItemsString getAssertionConsumerServiceURL() {
    return assertionConsumerServiceURL;
  }

  public void setAssertionConsumerServiceURL(SamlConfigurationPropertyItemsString assertionConsumerServiceURL) {
    this.assertionConsumerServiceURL = assertionConsumerServiceURL;
  }

  /**
   * 
   * @return spPrivateKeyAlias
   */
  public SamlConfigurationPropertyItemsString getSpPrivateKeyAlias() {
    return spPrivateKeyAlias;
  }

  public void setSpPrivateKeyAlias(SamlConfigurationPropertyItemsString spPrivateKeyAlias) {
    this.spPrivateKeyAlias = spPrivateKeyAlias;
  }

  /**
   * 
   * @return keyStorePassword
   */
  public SamlConfigurationPropertyItemsString getKeyStorePassword() {
    return keyStorePassword;
  }

  public void setKeyStorePassword(SamlConfigurationPropertyItemsString keyStorePassword) {
    this.keyStorePassword = keyStorePassword;
  }

  /**
   * 
   * @return defaultRedirectUrl
   */
  public SamlConfigurationPropertyItemsString getDefaultRedirectUrl() {
    return defaultRedirectUrl;
  }

  public void setDefaultRedirectUrl(SamlConfigurationPropertyItemsString defaultRedirectUrl) {
    this.defaultRedirectUrl = defaultRedirectUrl;
  }

  /**
   * 
   * @return userIDAttribute
   */
  public SamlConfigurationPropertyItemsString getUserIDAttribute() {
    return userIDAttribute;
  }

  public void setUserIDAttribute(SamlConfigurationPropertyItemsString userIDAttribute) {
    this.userIDAttribute = userIDAttribute;
  }

  /**
   * 
   * @return useEncryption
   */
  public SamlConfigurationPropertyItemsBoolean getUseEncryption() {
    return useEncryption;
  }

  public void setUseEncryption(SamlConfigurationPropertyItemsBoolean useEncryption) {
    this.useEncryption = useEncryption;
  }

  /**
   * 
   * @return createUser
   */
  public SamlConfigurationPropertyItemsBoolean getCreateUser() {
    return createUser;
  }

  public void setCreateUser(SamlConfigurationPropertyItemsBoolean createUser) {
    this.createUser = createUser;
  }

  /**
   * 
   * @return addGroupMemberships
   */
  public SamlConfigurationPropertyItemsBoolean getAddGroupMemberships() {
    return addGroupMemberships;
  }

  public void setAddGroupMemberships(SamlConfigurationPropertyItemsBoolean addGroupMemberships) {
    this.addGroupMemberships = addGroupMemberships;
  }

  /**
   * 
   * @return groupMembershipAttribute
   */
  public SamlConfigurationPropertyItemsString getGroupMembershipAttribute() {
    return groupMembershipAttribute;
  }

  public void setGroupMembershipAttribute(SamlConfigurationPropertyItemsString groupMembershipAttribute) {
    this.groupMembershipAttribute = groupMembershipAttribute;
  }

  /**
   * 
   * @return defaultGroups
   */
  public SamlConfigurationPropertyItemsArray getDefaultGroups() {
    return defaultGroups;
  }

  public void setDefaultGroups(SamlConfigurationPropertyItemsArray defaultGroups) {
    this.defaultGroups = defaultGroups;
  }

  /**
   * 
   * @return nameIdFormat
   */
  public SamlConfigurationPropertyItemsString getNameIdFormat() {
    return nameIdFormat;
  }

  public void setNameIdFormat(SamlConfigurationPropertyItemsString nameIdFormat) {
    this.nameIdFormat = nameIdFormat;
  }

  /**
   * 
   * @return synchronizeAttributes
   */
  public SamlConfigurationPropertyItemsArray getSynchronizeAttributes() {
    return synchronizeAttributes;
  }

  public void setSynchronizeAttributes(SamlConfigurationPropertyItemsArray synchronizeAttributes) {
    this.synchronizeAttributes = synchronizeAttributes;
  }

  /**
   * 
   * @return handleLogout
   */
  public SamlConfigurationPropertyItemsBoolean getHandleLogout() {
    return handleLogout;
  }

  public void setHandleLogout(SamlConfigurationPropertyItemsBoolean handleLogout) {
    this.handleLogout = handleLogout;
  }

  /**
   * 
   * @return logoutUrl
   */
  public SamlConfigurationPropertyItemsString getLogoutUrl() {
    return logoutUrl;
  }

  public void setLogoutUrl(SamlConfigurationPropertyItemsString logoutUrl) {
    this.logoutUrl = logoutUrl;
  }

  /**
   * 
   * @return clockTolerance
   */
  public SamlConfigurationPropertyItemsLong getClockTolerance() {
    return clockTolerance;
  }

  public void setClockTolerance(SamlConfigurationPropertyItemsLong clockTolerance) {
    this.clockTolerance = clockTolerance;
  }

  /**
   * 
   * @return digestMethod
   */
  public SamlConfigurationPropertyItemsString getDigestMethod() {
    return digestMethod;
  }

  public void setDigestMethod(SamlConfigurationPropertyItemsString digestMethod) {
    this.digestMethod = digestMethod;
  }

  /**
   * 
   * @return signatureMethod
   */
  public SamlConfigurationPropertyItemsString getSignatureMethod() {
    return signatureMethod;
  }

  public void setSignatureMethod(SamlConfigurationPropertyItemsString signatureMethod) {
    this.signatureMethod = signatureMethod;
  }

  /**
   * 
   * @return userIntermediatePath
   */
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
