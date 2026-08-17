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
 * KeystoreChainItems
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-17T02:18:23.350215970Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class KeystoreChainItems {

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

  public KeystoreChainItems subject(@Nullable String subject) {
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

  public KeystoreChainItems issuer(@Nullable String issuer) {
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

  public KeystoreChainItems notBefore(@Nullable String notBefore) {
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

  public KeystoreChainItems notAfter(@Nullable String notAfter) {
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

  public KeystoreChainItems serialNumber(@Nullable Integer serialNumber) {
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
    KeystoreChainItems keystoreChainItems = (KeystoreChainItems) o;
    return Objects.equals(this.subject, keystoreChainItems.subject) &&
        Objects.equals(this.issuer, keystoreChainItems.issuer) &&
        Objects.equals(this.notBefore, keystoreChainItems.notBefore) &&
        Objects.equals(this.notAfter, keystoreChainItems.notAfter) &&
        Objects.equals(this.serialNumber, keystoreChainItems.serialNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subject, issuer, notBefore, notAfter, serialNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeystoreChainItems {\n");
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

