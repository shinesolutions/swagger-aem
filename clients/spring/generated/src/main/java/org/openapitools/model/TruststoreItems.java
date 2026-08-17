package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * TruststoreItems
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-17T07:15:54.600438135Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class TruststoreItems {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String alias;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String entryType;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String subject;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String issuer;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String notBefore;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String notAfter;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer serialNumber;

  public TruststoreItems alias(@Nullable String alias) {
    this.alias = alias;
    return this;
  }

  /**
   * Truststore alias name
   * @return alias
   */
  
  @Schema(name = "alias", description = "Truststore alias name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("alias")
  public @Nullable String getAlias() {
    return alias;
  }

  @JsonProperty("alias")
  public void setAlias(@Nullable String alias) {
    this.alias = alias;
  }

  public TruststoreItems entryType(@Nullable String entryType) {
    this.entryType = entryType;
    return this;
  }

  /**
   * Get entryType
   * @return entryType
   */
  
  @Schema(name = "entryType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("entryType")
  public @Nullable String getEntryType() {
    return entryType;
  }

  @JsonProperty("entryType")
  public void setEntryType(@Nullable String entryType) {
    this.entryType = entryType;
  }

  public TruststoreItems subject(@Nullable String subject) {
    this.subject = subject;
    return this;
  }

  /**
   * e.g. \"CN=localhost\"
   * @return subject
   */
  
  @Schema(name = "subject", description = "e.g. \"CN=localhost\"", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subject")
  public @Nullable String getSubject() {
    return subject;
  }

  @JsonProperty("subject")
  public void setSubject(@Nullable String subject) {
    this.subject = subject;
  }

  public TruststoreItems issuer(@Nullable String issuer) {
    this.issuer = issuer;
    return this;
  }

  /**
   * e.g. \"CN=Admin\"
   * @return issuer
   */
  
  @Schema(name = "issuer", description = "e.g. \"CN=Admin\"", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("issuer")
  public @Nullable String getIssuer() {
    return issuer;
  }

  @JsonProperty("issuer")
  public void setIssuer(@Nullable String issuer) {
    this.issuer = issuer;
  }

  public TruststoreItems notBefore(@Nullable String notBefore) {
    this.notBefore = notBefore;
    return this;
  }

  /**
   * e.g. \"Sun Jul 01 12:00:00 AEST 2018\"
   * @return notBefore
   */
  
  @Schema(name = "notBefore", description = "e.g. \"Sun Jul 01 12:00:00 AEST 2018\"", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("notBefore")
  public @Nullable String getNotBefore() {
    return notBefore;
  }

  @JsonProperty("notBefore")
  public void setNotBefore(@Nullable String notBefore) {
    this.notBefore = notBefore;
  }

  public TruststoreItems notAfter(@Nullable String notAfter) {
    this.notAfter = notAfter;
    return this;
  }

  /**
   * e.g. \"Sun Jun 30 23:59:50 AEST 2019\"
   * @return notAfter
   */
  
  @Schema(name = "notAfter", description = "e.g. \"Sun Jun 30 23:59:50 AEST 2019\"", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("notAfter")
  public @Nullable String getNotAfter() {
    return notAfter;
  }

  @JsonProperty("notAfter")
  public void setNotAfter(@Nullable String notAfter) {
    this.notAfter = notAfter;
  }

  public TruststoreItems serialNumber(@Nullable Integer serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }

  /**
   * 18165099476682912368
   * @return serialNumber
   */
  
  @Schema(name = "serialNumber", description = "18165099476682912368", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serialNumber")
  public @Nullable Integer getSerialNumber() {
    return serialNumber;
  }

  @JsonProperty("serialNumber")
  public void setSerialNumber(@Nullable Integer serialNumber) {
    this.serialNumber = serialNumber;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TruststoreItems truststoreItems = (TruststoreItems) o;
    return Objects.equals(this.alias, truststoreItems.alias) &&
        Objects.equals(this.entryType, truststoreItems.entryType) &&
        Objects.equals(this.subject, truststoreItems.subject) &&
        Objects.equals(this.issuer, truststoreItems.issuer) &&
        Objects.equals(this.notBefore, truststoreItems.notBefore) &&
        Objects.equals(this.notAfter, truststoreItems.notAfter) &&
        Objects.equals(this.serialNumber, truststoreItems.serialNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alias, entryType, subject, issuer, notBefore, notAfter, serialNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TruststoreItems {\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    entryType: ").append(toIndentedString(entryType)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    notBefore: ").append(toIndentedString(notBefore)).append("\n");
    sb.append("    notAfter: ").append(toIndentedString(notAfter)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
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

