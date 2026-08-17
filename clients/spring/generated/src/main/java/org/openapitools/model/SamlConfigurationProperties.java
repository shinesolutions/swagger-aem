package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.SamlConfigurationPropertyItemsArray;
import org.openapitools.model.SamlConfigurationPropertyItemsBoolean;
import org.openapitools.model.SamlConfigurationPropertyItemsLong;
import org.openapitools.model.SamlConfigurationPropertyItemsString;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * SamlConfigurationProperties
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-17T07:15:54.600438135Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class SamlConfigurationProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable SamlConfigurationPropertyItemsArray path;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable SamlConfigurationPropertyItemsLong serviceRanking;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable SamlConfigurationPropertyItemsString idpUrl;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable SamlConfigurationPropertyItemsString idpCertAlias;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable SamlConfigurationPropertyItemsBoolean idpHttpRedirect;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable SamlConfigurationPropertyItemsString serviceProviderEntityId;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable SamlConfigurationPropertyItemsString assertionConsumerServiceURL;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable SamlConfigurationPropertyItemsString spPrivateKeyAlias;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable SamlConfigurationPropertyItemsString keyStorePassword;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable SamlConfigurationPropertyItemsString defaultRedirectUrl;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable SamlConfigurationPropertyItemsString userIDAttribute;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable SamlConfigurationPropertyItemsBoolean useEncryption;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable SamlConfigurationPropertyItemsBoolean createUser;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable SamlConfigurationPropertyItemsBoolean addGroupMemberships;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable SamlConfigurationPropertyItemsString groupMembershipAttribute;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable SamlConfigurationPropertyItemsArray defaultGroups;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable SamlConfigurationPropertyItemsString nameIdFormat;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable SamlConfigurationPropertyItemsArray synchronizeAttributes;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable SamlConfigurationPropertyItemsBoolean handleLogout;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable SamlConfigurationPropertyItemsString logoutUrl;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable SamlConfigurationPropertyItemsLong clockTolerance;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable SamlConfigurationPropertyItemsString digestMethod;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable SamlConfigurationPropertyItemsString signatureMethod;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable SamlConfigurationPropertyItemsString userIntermediatePath;

  public SamlConfigurationProperties path(@Nullable SamlConfigurationPropertyItemsArray path) {
    this.path = path;
    return this;
  }

  /**
   * Get path
   * @return path
   */
  @Valid 
  @Schema(name = "path", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("path")
  public @Nullable SamlConfigurationPropertyItemsArray getPath() {
    return path;
  }

  @JsonProperty("path")
  public void setPath(@Nullable SamlConfigurationPropertyItemsArray path) {
    this.path = path;
  }

  public SamlConfigurationProperties serviceRanking(@Nullable SamlConfigurationPropertyItemsLong serviceRanking) {
    this.serviceRanking = serviceRanking;
    return this;
  }

  /**
   * Get serviceRanking
   * @return serviceRanking
   */
  @Valid 
  @Schema(name = "service.ranking", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("service.ranking")
  public @Nullable SamlConfigurationPropertyItemsLong getServiceRanking() {
    return serviceRanking;
  }

  @JsonProperty("service.ranking")
  public void setServiceRanking(@Nullable SamlConfigurationPropertyItemsLong serviceRanking) {
    this.serviceRanking = serviceRanking;
  }

  public SamlConfigurationProperties idpUrl(@Nullable SamlConfigurationPropertyItemsString idpUrl) {
    this.idpUrl = idpUrl;
    return this;
  }

  /**
   * Get idpUrl
   * @return idpUrl
   */
  @Valid 
  @Schema(name = "idpUrl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("idpUrl")
  public @Nullable SamlConfigurationPropertyItemsString getIdpUrl() {
    return idpUrl;
  }

  @JsonProperty("idpUrl")
  public void setIdpUrl(@Nullable SamlConfigurationPropertyItemsString idpUrl) {
    this.idpUrl = idpUrl;
  }

  public SamlConfigurationProperties idpCertAlias(@Nullable SamlConfigurationPropertyItemsString idpCertAlias) {
    this.idpCertAlias = idpCertAlias;
    return this;
  }

  /**
   * Get idpCertAlias
   * @return idpCertAlias
   */
  @Valid 
  @Schema(name = "idpCertAlias", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("idpCertAlias")
  public @Nullable SamlConfigurationPropertyItemsString getIdpCertAlias() {
    return idpCertAlias;
  }

  @JsonProperty("idpCertAlias")
  public void setIdpCertAlias(@Nullable SamlConfigurationPropertyItemsString idpCertAlias) {
    this.idpCertAlias = idpCertAlias;
  }

  public SamlConfigurationProperties idpHttpRedirect(@Nullable SamlConfigurationPropertyItemsBoolean idpHttpRedirect) {
    this.idpHttpRedirect = idpHttpRedirect;
    return this;
  }

  /**
   * Get idpHttpRedirect
   * @return idpHttpRedirect
   */
  @Valid 
  @Schema(name = "idpHttpRedirect", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("idpHttpRedirect")
  public @Nullable SamlConfigurationPropertyItemsBoolean getIdpHttpRedirect() {
    return idpHttpRedirect;
  }

  @JsonProperty("idpHttpRedirect")
  public void setIdpHttpRedirect(@Nullable SamlConfigurationPropertyItemsBoolean idpHttpRedirect) {
    this.idpHttpRedirect = idpHttpRedirect;
  }

  public SamlConfigurationProperties serviceProviderEntityId(@Nullable SamlConfigurationPropertyItemsString serviceProviderEntityId) {
    this.serviceProviderEntityId = serviceProviderEntityId;
    return this;
  }

  /**
   * Get serviceProviderEntityId
   * @return serviceProviderEntityId
   */
  @Valid 
  @Schema(name = "serviceProviderEntityId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serviceProviderEntityId")
  public @Nullable SamlConfigurationPropertyItemsString getServiceProviderEntityId() {
    return serviceProviderEntityId;
  }

  @JsonProperty("serviceProviderEntityId")
  public void setServiceProviderEntityId(@Nullable SamlConfigurationPropertyItemsString serviceProviderEntityId) {
    this.serviceProviderEntityId = serviceProviderEntityId;
  }

  public SamlConfigurationProperties assertionConsumerServiceURL(@Nullable SamlConfigurationPropertyItemsString assertionConsumerServiceURL) {
    this.assertionConsumerServiceURL = assertionConsumerServiceURL;
    return this;
  }

  /**
   * Get assertionConsumerServiceURL
   * @return assertionConsumerServiceURL
   */
  @Valid 
  @Schema(name = "assertionConsumerServiceURL", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("assertionConsumerServiceURL")
  public @Nullable SamlConfigurationPropertyItemsString getAssertionConsumerServiceURL() {
    return assertionConsumerServiceURL;
  }

  @JsonProperty("assertionConsumerServiceURL")
  public void setAssertionConsumerServiceURL(@Nullable SamlConfigurationPropertyItemsString assertionConsumerServiceURL) {
    this.assertionConsumerServiceURL = assertionConsumerServiceURL;
  }

  public SamlConfigurationProperties spPrivateKeyAlias(@Nullable SamlConfigurationPropertyItemsString spPrivateKeyAlias) {
    this.spPrivateKeyAlias = spPrivateKeyAlias;
    return this;
  }

  /**
   * Get spPrivateKeyAlias
   * @return spPrivateKeyAlias
   */
  @Valid 
  @Schema(name = "spPrivateKeyAlias", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("spPrivateKeyAlias")
  public @Nullable SamlConfigurationPropertyItemsString getSpPrivateKeyAlias() {
    return spPrivateKeyAlias;
  }

  @JsonProperty("spPrivateKeyAlias")
  public void setSpPrivateKeyAlias(@Nullable SamlConfigurationPropertyItemsString spPrivateKeyAlias) {
    this.spPrivateKeyAlias = spPrivateKeyAlias;
  }

  public SamlConfigurationProperties keyStorePassword(@Nullable SamlConfigurationPropertyItemsString keyStorePassword) {
    this.keyStorePassword = keyStorePassword;
    return this;
  }

  /**
   * Get keyStorePassword
   * @return keyStorePassword
   */
  @Valid 
  @Schema(name = "keyStorePassword", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("keyStorePassword")
  public @Nullable SamlConfigurationPropertyItemsString getKeyStorePassword() {
    return keyStorePassword;
  }

  @JsonProperty("keyStorePassword")
  public void setKeyStorePassword(@Nullable SamlConfigurationPropertyItemsString keyStorePassword) {
    this.keyStorePassword = keyStorePassword;
  }

  public SamlConfigurationProperties defaultRedirectUrl(@Nullable SamlConfigurationPropertyItemsString defaultRedirectUrl) {
    this.defaultRedirectUrl = defaultRedirectUrl;
    return this;
  }

  /**
   * Get defaultRedirectUrl
   * @return defaultRedirectUrl
   */
  @Valid 
  @Schema(name = "defaultRedirectUrl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("defaultRedirectUrl")
  public @Nullable SamlConfigurationPropertyItemsString getDefaultRedirectUrl() {
    return defaultRedirectUrl;
  }

  @JsonProperty("defaultRedirectUrl")
  public void setDefaultRedirectUrl(@Nullable SamlConfigurationPropertyItemsString defaultRedirectUrl) {
    this.defaultRedirectUrl = defaultRedirectUrl;
  }

  public SamlConfigurationProperties userIDAttribute(@Nullable SamlConfigurationPropertyItemsString userIDAttribute) {
    this.userIDAttribute = userIDAttribute;
    return this;
  }

  /**
   * Get userIDAttribute
   * @return userIDAttribute
   */
  @Valid 
  @Schema(name = "userIDAttribute", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("userIDAttribute")
  public @Nullable SamlConfigurationPropertyItemsString getUserIDAttribute() {
    return userIDAttribute;
  }

  @JsonProperty("userIDAttribute")
  public void setUserIDAttribute(@Nullable SamlConfigurationPropertyItemsString userIDAttribute) {
    this.userIDAttribute = userIDAttribute;
  }

  public SamlConfigurationProperties useEncryption(@Nullable SamlConfigurationPropertyItemsBoolean useEncryption) {
    this.useEncryption = useEncryption;
    return this;
  }

  /**
   * Get useEncryption
   * @return useEncryption
   */
  @Valid 
  @Schema(name = "useEncryption", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("useEncryption")
  public @Nullable SamlConfigurationPropertyItemsBoolean getUseEncryption() {
    return useEncryption;
  }

  @JsonProperty("useEncryption")
  public void setUseEncryption(@Nullable SamlConfigurationPropertyItemsBoolean useEncryption) {
    this.useEncryption = useEncryption;
  }

  public SamlConfigurationProperties createUser(@Nullable SamlConfigurationPropertyItemsBoolean createUser) {
    this.createUser = createUser;
    return this;
  }

  /**
   * Get createUser
   * @return createUser
   */
  @Valid 
  @Schema(name = "createUser", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("createUser")
  public @Nullable SamlConfigurationPropertyItemsBoolean getCreateUser() {
    return createUser;
  }

  @JsonProperty("createUser")
  public void setCreateUser(@Nullable SamlConfigurationPropertyItemsBoolean createUser) {
    this.createUser = createUser;
  }

  public SamlConfigurationProperties addGroupMemberships(@Nullable SamlConfigurationPropertyItemsBoolean addGroupMemberships) {
    this.addGroupMemberships = addGroupMemberships;
    return this;
  }

  /**
   * Get addGroupMemberships
   * @return addGroupMemberships
   */
  @Valid 
  @Schema(name = "addGroupMemberships", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("addGroupMemberships")
  public @Nullable SamlConfigurationPropertyItemsBoolean getAddGroupMemberships() {
    return addGroupMemberships;
  }

  @JsonProperty("addGroupMemberships")
  public void setAddGroupMemberships(@Nullable SamlConfigurationPropertyItemsBoolean addGroupMemberships) {
    this.addGroupMemberships = addGroupMemberships;
  }

  public SamlConfigurationProperties groupMembershipAttribute(@Nullable SamlConfigurationPropertyItemsString groupMembershipAttribute) {
    this.groupMembershipAttribute = groupMembershipAttribute;
    return this;
  }

  /**
   * Get groupMembershipAttribute
   * @return groupMembershipAttribute
   */
  @Valid 
  @Schema(name = "groupMembershipAttribute", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("groupMembershipAttribute")
  public @Nullable SamlConfigurationPropertyItemsString getGroupMembershipAttribute() {
    return groupMembershipAttribute;
  }

  @JsonProperty("groupMembershipAttribute")
  public void setGroupMembershipAttribute(@Nullable SamlConfigurationPropertyItemsString groupMembershipAttribute) {
    this.groupMembershipAttribute = groupMembershipAttribute;
  }

  public SamlConfigurationProperties defaultGroups(@Nullable SamlConfigurationPropertyItemsArray defaultGroups) {
    this.defaultGroups = defaultGroups;
    return this;
  }

  /**
   * Get defaultGroups
   * @return defaultGroups
   */
  @Valid 
  @Schema(name = "defaultGroups", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("defaultGroups")
  public @Nullable SamlConfigurationPropertyItemsArray getDefaultGroups() {
    return defaultGroups;
  }

  @JsonProperty("defaultGroups")
  public void setDefaultGroups(@Nullable SamlConfigurationPropertyItemsArray defaultGroups) {
    this.defaultGroups = defaultGroups;
  }

  public SamlConfigurationProperties nameIdFormat(@Nullable SamlConfigurationPropertyItemsString nameIdFormat) {
    this.nameIdFormat = nameIdFormat;
    return this;
  }

  /**
   * Get nameIdFormat
   * @return nameIdFormat
   */
  @Valid 
  @Schema(name = "nameIdFormat", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("nameIdFormat")
  public @Nullable SamlConfigurationPropertyItemsString getNameIdFormat() {
    return nameIdFormat;
  }

  @JsonProperty("nameIdFormat")
  public void setNameIdFormat(@Nullable SamlConfigurationPropertyItemsString nameIdFormat) {
    this.nameIdFormat = nameIdFormat;
  }

  public SamlConfigurationProperties synchronizeAttributes(@Nullable SamlConfigurationPropertyItemsArray synchronizeAttributes) {
    this.synchronizeAttributes = synchronizeAttributes;
    return this;
  }

  /**
   * Get synchronizeAttributes
   * @return synchronizeAttributes
   */
  @Valid 
  @Schema(name = "synchronizeAttributes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("synchronizeAttributes")
  public @Nullable SamlConfigurationPropertyItemsArray getSynchronizeAttributes() {
    return synchronizeAttributes;
  }

  @JsonProperty("synchronizeAttributes")
  public void setSynchronizeAttributes(@Nullable SamlConfigurationPropertyItemsArray synchronizeAttributes) {
    this.synchronizeAttributes = synchronizeAttributes;
  }

  public SamlConfigurationProperties handleLogout(@Nullable SamlConfigurationPropertyItemsBoolean handleLogout) {
    this.handleLogout = handleLogout;
    return this;
  }

  /**
   * Get handleLogout
   * @return handleLogout
   */
  @Valid 
  @Schema(name = "handleLogout", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("handleLogout")
  public @Nullable SamlConfigurationPropertyItemsBoolean getHandleLogout() {
    return handleLogout;
  }

  @JsonProperty("handleLogout")
  public void setHandleLogout(@Nullable SamlConfigurationPropertyItemsBoolean handleLogout) {
    this.handleLogout = handleLogout;
  }

  public SamlConfigurationProperties logoutUrl(@Nullable SamlConfigurationPropertyItemsString logoutUrl) {
    this.logoutUrl = logoutUrl;
    return this;
  }

  /**
   * Get logoutUrl
   * @return logoutUrl
   */
  @Valid 
  @Schema(name = "logoutUrl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("logoutUrl")
  public @Nullable SamlConfigurationPropertyItemsString getLogoutUrl() {
    return logoutUrl;
  }

  @JsonProperty("logoutUrl")
  public void setLogoutUrl(@Nullable SamlConfigurationPropertyItemsString logoutUrl) {
    this.logoutUrl = logoutUrl;
  }

  public SamlConfigurationProperties clockTolerance(@Nullable SamlConfigurationPropertyItemsLong clockTolerance) {
    this.clockTolerance = clockTolerance;
    return this;
  }

  /**
   * Get clockTolerance
   * @return clockTolerance
   */
  @Valid 
  @Schema(name = "clockTolerance", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("clockTolerance")
  public @Nullable SamlConfigurationPropertyItemsLong getClockTolerance() {
    return clockTolerance;
  }

  @JsonProperty("clockTolerance")
  public void setClockTolerance(@Nullable SamlConfigurationPropertyItemsLong clockTolerance) {
    this.clockTolerance = clockTolerance;
  }

  public SamlConfigurationProperties digestMethod(@Nullable SamlConfigurationPropertyItemsString digestMethod) {
    this.digestMethod = digestMethod;
    return this;
  }

  /**
   * Get digestMethod
   * @return digestMethod
   */
  @Valid 
  @Schema(name = "digestMethod", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("digestMethod")
  public @Nullable SamlConfigurationPropertyItemsString getDigestMethod() {
    return digestMethod;
  }

  @JsonProperty("digestMethod")
  public void setDigestMethod(@Nullable SamlConfigurationPropertyItemsString digestMethod) {
    this.digestMethod = digestMethod;
  }

  public SamlConfigurationProperties signatureMethod(@Nullable SamlConfigurationPropertyItemsString signatureMethod) {
    this.signatureMethod = signatureMethod;
    return this;
  }

  /**
   * Get signatureMethod
   * @return signatureMethod
   */
  @Valid 
  @Schema(name = "signatureMethod", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("signatureMethod")
  public @Nullable SamlConfigurationPropertyItemsString getSignatureMethod() {
    return signatureMethod;
  }

  @JsonProperty("signatureMethod")
  public void setSignatureMethod(@Nullable SamlConfigurationPropertyItemsString signatureMethod) {
    this.signatureMethod = signatureMethod;
  }

  public SamlConfigurationProperties userIntermediatePath(@Nullable SamlConfigurationPropertyItemsString userIntermediatePath) {
    this.userIntermediatePath = userIntermediatePath;
    return this;
  }

  /**
   * Get userIntermediatePath
   * @return userIntermediatePath
   */
  @Valid 
  @Schema(name = "userIntermediatePath", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("userIntermediatePath")
  public @Nullable SamlConfigurationPropertyItemsString getUserIntermediatePath() {
    return userIntermediatePath;
  }

  @JsonProperty("userIntermediatePath")
  public void setUserIntermediatePath(@Nullable SamlConfigurationPropertyItemsString userIntermediatePath) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

