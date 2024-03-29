/**
 * Adobe Experience Manager (AEM) API
 * Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API
 *
 * The version of the OpenAPI document: 3.5.0-pre.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class KeystoreChainItems {
  
  @SerializedName("subject")
  private String subject = null;
  @SerializedName("issuer")
  private String issuer = null;
  @SerializedName("notBefore")
  private String notBefore = null;
  @SerializedName("notAfter")
  private String notAfter = null;
  @SerializedName("serialNumber")
  private Integer serialNumber = null;

  /**
   * e.g. \"CN=localhost\"
   **/
  @ApiModelProperty(value = "e.g. \"CN=localhost\"")
  public String getSubject() {
    return subject;
  }
  public void setSubject(String subject) {
    this.subject = subject;
  }

  /**
   * e.g. \"CN=Admin\"
   **/
  @ApiModelProperty(value = "e.g. \"CN=Admin\"")
  public String getIssuer() {
    return issuer;
  }
  public void setIssuer(String issuer) {
    this.issuer = issuer;
  }

  /**
   * e.g. \"Sun Jul 01 12:00:00 AEST 2018\"
   **/
  @ApiModelProperty(value = "e.g. \"Sun Jul 01 12:00:00 AEST 2018\"")
  public String getNotBefore() {
    return notBefore;
  }
  public void setNotBefore(String notBefore) {
    this.notBefore = notBefore;
  }

  /**
   * e.g. \"Sun Jun 30 23:59:50 AEST 2019\"
   **/
  @ApiModelProperty(value = "e.g. \"Sun Jun 30 23:59:50 AEST 2019\"")
  public String getNotAfter() {
    return notAfter;
  }
  public void setNotAfter(String notAfter) {
    this.notAfter = notAfter;
  }

  /**
   * 18165099476682912368
   **/
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
    return (this.subject == null ? keystoreChainItems.subject == null : this.subject.equals(keystoreChainItems.subject)) &&
        (this.issuer == null ? keystoreChainItems.issuer == null : this.issuer.equals(keystoreChainItems.issuer)) &&
        (this.notBefore == null ? keystoreChainItems.notBefore == null : this.notBefore.equals(keystoreChainItems.notBefore)) &&
        (this.notAfter == null ? keystoreChainItems.notAfter == null : this.notAfter.equals(keystoreChainItems.notAfter)) &&
        (this.serialNumber == null ? keystoreChainItems.serialNumber == null : this.serialNumber.equals(keystoreChainItems.serialNumber));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.subject == null ? 0: this.subject.hashCode());
    result = 31 * result + (this.issuer == null ? 0: this.issuer.hashCode());
    result = 31 * result + (this.notBefore == null ? 0: this.notBefore.hashCode());
    result = 31 * result + (this.notAfter == null ? 0: this.notAfter.hashCode());
    result = 31 * result + (this.serialNumber == null ? 0: this.serialNumber.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeystoreChainItems {\n");
    
    sb.append("  subject: ").append(subject).append("\n");
    sb.append("  issuer: ").append(issuer).append("\n");
    sb.append("  notBefore: ").append(notBefore).append("\n");
    sb.append("  notAfter: ").append(notAfter).append("\n");
    sb.append("  serialNumber: ").append(serialNumber).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
