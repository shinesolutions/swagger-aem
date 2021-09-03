package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * KeystoreChainItems
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-03T15:28:35.636+10:00[Australia/Melbourne]")
public class KeystoreChainItems   {
  @JsonProperty("subject")
  private String subject;

  @JsonProperty("issuer")
  private String issuer;

  @JsonProperty("notBefore")
  private String notBefore;

  @JsonProperty("notAfter")
  private String notAfter;

  @JsonProperty("serialNumber")
  private Integer serialNumber;

  public KeystoreChainItems subject(String subject) {
    this.subject = subject;
    return this;
  }

  /**
   * e.g. \"CN=localhost\"
   * @return subject
  */
  @ApiModelProperty(value = "e.g. \"CN=localhost\"")


  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public KeystoreChainItems issuer(String issuer) {
    this.issuer = issuer;
    return this;
  }

  /**
   * e.g. \"CN=Admin\"
   * @return issuer
  */
  @ApiModelProperty(value = "e.g. \"CN=Admin\"")


  public String getIssuer() {
    return issuer;
  }

  public void setIssuer(String issuer) {
    this.issuer = issuer;
  }

  public KeystoreChainItems notBefore(String notBefore) {
    this.notBefore = notBefore;
    return this;
  }

  /**
   * e.g. \"Sun Jul 01 12:00:00 AEST 2018\"
   * @return notBefore
  */
  @ApiModelProperty(value = "e.g. \"Sun Jul 01 12:00:00 AEST 2018\"")


  public String getNotBefore() {
    return notBefore;
  }

  public void setNotBefore(String notBefore) {
    this.notBefore = notBefore;
  }

  public KeystoreChainItems notAfter(String notAfter) {
    this.notAfter = notAfter;
    return this;
  }

  /**
   * e.g. \"Sun Jun 30 23:59:50 AEST 2019\"
   * @return notAfter
  */
  @ApiModelProperty(value = "e.g. \"Sun Jun 30 23:59:50 AEST 2019\"")


  public String getNotAfter() {
    return notAfter;
  }

  public void setNotAfter(String notAfter) {
    this.notAfter = notAfter;
  }

  public KeystoreChainItems serialNumber(Integer serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }

  /**
   * 18165099476682912368
   * @return serialNumber
  */
  @ApiModelProperty(value = "18165099476682912368")


  public Integer getSerialNumber() {
    return serialNumber;
  }

  public void setSerialNumber(Integer serialNumber) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

