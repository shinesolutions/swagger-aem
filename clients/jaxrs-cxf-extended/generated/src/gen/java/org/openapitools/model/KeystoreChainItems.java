package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class KeystoreChainItems  {
  
 /**
  * e.g. \"CN=localhost\"
  */
  @ApiModelProperty(value = "e.g. \"CN=localhost\"")
  private String subject;

 /**
  * e.g. \"CN=Admin\"
  */
  @ApiModelProperty(value = "e.g. \"CN=Admin\"")
  private String issuer;

 /**
  * e.g. \"Sun Jul 01 12:00:00 AEST 2018\"
  */
  @ApiModelProperty(value = "e.g. \"Sun Jul 01 12:00:00 AEST 2018\"")
  private String notBefore;

 /**
  * e.g. \"Sun Jun 30 23:59:50 AEST 2019\"
  */
  @ApiModelProperty(value = "e.g. \"Sun Jun 30 23:59:50 AEST 2019\"")
  private String notAfter;

 /**
  * 18165099476682912368
  */
  @ApiModelProperty(value = "18165099476682912368")
  private Integer serialNumber;
 /**
  * e.g. \&quot;CN&#x3D;localhost\&quot;
  * @return subject
  */
  @JsonProperty("subject")
  public String getSubject() {
    return subject;
  }

  /**
   * Sets the <code>subject</code> property.
   */
 public void setSubject(String subject) {
    this.subject = subject;
  }

  /**
   * Sets the <code>subject</code> property.
   */
  public KeystoreChainItems subject(String subject) {
    this.subject = subject;
    return this;
  }

 /**
  * e.g. \&quot;CN&#x3D;Admin\&quot;
  * @return issuer
  */
  @JsonProperty("issuer")
  public String getIssuer() {
    return issuer;
  }

  /**
   * Sets the <code>issuer</code> property.
   */
 public void setIssuer(String issuer) {
    this.issuer = issuer;
  }

  /**
   * Sets the <code>issuer</code> property.
   */
  public KeystoreChainItems issuer(String issuer) {
    this.issuer = issuer;
    return this;
  }

 /**
  * e.g. \&quot;Sun Jul 01 12:00:00 AEST 2018\&quot;
  * @return notBefore
  */
  @JsonProperty("notBefore")
  public String getNotBefore() {
    return notBefore;
  }

  /**
   * Sets the <code>notBefore</code> property.
   */
 public void setNotBefore(String notBefore) {
    this.notBefore = notBefore;
  }

  /**
   * Sets the <code>notBefore</code> property.
   */
  public KeystoreChainItems notBefore(String notBefore) {
    this.notBefore = notBefore;
    return this;
  }

 /**
  * e.g. \&quot;Sun Jun 30 23:59:50 AEST 2019\&quot;
  * @return notAfter
  */
  @JsonProperty("notAfter")
  public String getNotAfter() {
    return notAfter;
  }

  /**
   * Sets the <code>notAfter</code> property.
   */
 public void setNotAfter(String notAfter) {
    this.notAfter = notAfter;
  }

  /**
   * Sets the <code>notAfter</code> property.
   */
  public KeystoreChainItems notAfter(String notAfter) {
    this.notAfter = notAfter;
    return this;
  }

 /**
  * 18165099476682912368
  * @return serialNumber
  */
  @JsonProperty("serialNumber")
  public Integer getSerialNumber() {
    return serialNumber;
  }

  /**
   * Sets the <code>serialNumber</code> property.
   */
 public void setSerialNumber(Integer serialNumber) {
    this.serialNumber = serialNumber;
  }

  /**
   * Sets the <code>serialNumber</code> property.
   */
  public KeystoreChainItems serialNumber(Integer serialNumber) {
    this.serialNumber = serialNumber;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

