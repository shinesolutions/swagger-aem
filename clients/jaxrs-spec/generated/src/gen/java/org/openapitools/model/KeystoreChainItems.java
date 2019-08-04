package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class KeystoreChainItems   {
  
  private @Valid String subject = null;
  private @Valid String issuer = null;
  private @Valid String notBefore = null;
  private @Valid String notAfter = null;
  private @Valid Integer serialNumber = null;

  /**
   * e.g. \&quot;CN&#x3D;localhost\&quot;
   **/
  public KeystoreChainItems subject(String subject) {
    this.subject = subject;
    return this;
  }

  
  @ApiModelProperty(value = "e.g. \"CN=localhost\"")
  @JsonProperty("subject")
  public String getSubject() {
    return subject;
  }
  public void setSubject(String subject) {
    this.subject = subject;
  }

  /**
   * e.g. \&quot;CN&#x3D;Admin\&quot;
   **/
  public KeystoreChainItems issuer(String issuer) {
    this.issuer = issuer;
    return this;
  }

  
  @ApiModelProperty(value = "e.g. \"CN=Admin\"")
  @JsonProperty("issuer")
  public String getIssuer() {
    return issuer;
  }
  public void setIssuer(String issuer) {
    this.issuer = issuer;
  }

  /**
   * e.g. \&quot;Sun Jul 01 12:00:00 AEST 2018\&quot;
   **/
  public KeystoreChainItems notBefore(String notBefore) {
    this.notBefore = notBefore;
    return this;
  }

  
  @ApiModelProperty(value = "e.g. \"Sun Jul 01 12:00:00 AEST 2018\"")
  @JsonProperty("notBefore")
  public String getNotBefore() {
    return notBefore;
  }
  public void setNotBefore(String notBefore) {
    this.notBefore = notBefore;
  }

  /**
   * e.g. \&quot;Sun Jun 30 23:59:50 AEST 2019\&quot;
   **/
  public KeystoreChainItems notAfter(String notAfter) {
    this.notAfter = notAfter;
    return this;
  }

  
  @ApiModelProperty(value = "e.g. \"Sun Jun 30 23:59:50 AEST 2019\"")
  @JsonProperty("notAfter")
  public String getNotAfter() {
    return notAfter;
  }
  public void setNotAfter(String notAfter) {
    this.notAfter = notAfter;
  }

  /**
   * 18165099476682912368
   **/
  public KeystoreChainItems serialNumber(Integer serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }

  
  @ApiModelProperty(value = "18165099476682912368")
  @JsonProperty("serialNumber")
  public Integer getSerialNumber() {
    return serialNumber;
  }
  public void setSerialNumber(Integer serialNumber) {
    this.serialNumber = serialNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeystoreChainItems keystoreChainItems = (KeystoreChainItems) o;
    return Objects.equals(subject, keystoreChainItems.subject) &&
        Objects.equals(issuer, keystoreChainItems.issuer) &&
        Objects.equals(notBefore, keystoreChainItems.notBefore) &&
        Objects.equals(notAfter, keystoreChainItems.notAfter) &&
        Objects.equals(serialNumber, keystoreChainItems.serialNumber);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

