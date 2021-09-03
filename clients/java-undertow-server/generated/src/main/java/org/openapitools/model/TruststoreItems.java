/*
 * Adobe Experience Manager (AEM) API
 *
 * Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API
 *
 * OpenAPI document version: 3.5.0-pre.0
 * Maintained by: opensource@shinesolutions.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2021-09-03T15:25:36.220+10:00[Australia/Melbourne]")
public class TruststoreItems   {
  
  private String alias;
  private String entryType;
  private String subject;
  private String issuer;
  private String notBefore;
  private String notAfter;
  private Integer serialNumber;

  /**
   * Truststore alias name
   */
  public TruststoreItems alias(String alias) {
    this.alias = alias;
    return this;
  }

  
  @ApiModelProperty(value = "Truststore alias name")
  @JsonProperty("alias")
  public String getAlias() {
    return alias;
  }
  public void setAlias(String alias) {
    this.alias = alias;
  }

  /**
   */
  public TruststoreItems entryType(String entryType) {
    this.entryType = entryType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("entryType")
  public String getEntryType() {
    return entryType;
  }
  public void setEntryType(String entryType) {
    this.entryType = entryType;
  }

  /**
   * e.g. \"CN=localhost\"
   */
  public TruststoreItems subject(String subject) {
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
   * e.g. \"CN=Admin\"
   */
  public TruststoreItems issuer(String issuer) {
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
   * e.g. \"Sun Jul 01 12:00:00 AEST 2018\"
   */
  public TruststoreItems notBefore(String notBefore) {
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
   * e.g. \"Sun Jun 30 23:59:50 AEST 2019\"
   */
  public TruststoreItems notAfter(String notAfter) {
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
   */
  public TruststoreItems serialNumber(Integer serialNumber) {
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
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TruststoreItems truststoreItems = (TruststoreItems) o;
    return Objects.equals(alias, truststoreItems.alias) &&
        Objects.equals(entryType, truststoreItems.entryType) &&
        Objects.equals(subject, truststoreItems.subject) &&
        Objects.equals(issuer, truststoreItems.issuer) &&
        Objects.equals(notBefore, truststoreItems.notBefore) &&
        Objects.equals(notAfter, truststoreItems.notAfter) &&
        Objects.equals(serialNumber, truststoreItems.serialNumber);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

