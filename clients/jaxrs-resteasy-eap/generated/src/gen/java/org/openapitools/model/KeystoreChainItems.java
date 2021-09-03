package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2021-09-03T15:26:02.321+10:00[Australia/Melbourne]")
public class KeystoreChainItems   {
  

  private String subject;

  private String issuer;

  private String notBefore;

  private String notAfter;

  private Integer serialNumber;

  /**
   * e.g. \&quot;CN&#x3D;localhost\&quot;
   **/
  
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
  
  @ApiModelProperty(value = "18165099476682912368")
  @JsonProperty("serialNumber")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

