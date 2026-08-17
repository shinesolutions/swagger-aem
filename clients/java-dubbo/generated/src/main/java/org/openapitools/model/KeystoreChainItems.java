package org.openapitools.model;

import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class KeystoreChainItems implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * e.g. \&quot;CN&#x3D;localhost\&quot;
   */
  @JsonProperty("subject")
  private String subject;

  /**
   * e.g. \&quot;CN&#x3D;Admin\&quot;
   */
  @JsonProperty("issuer")
  private String issuer;

  /**
   * e.g. \&quot;Sun Jul 01 12:00:00 AEST 2018\&quot;
   */
  @JsonProperty("notBefore")
  private String notBefore;

  /**
   * e.g. \&quot;Sun Jun 30 23:59:50 AEST 2019\&quot;
   */
  @JsonProperty("notAfter")
  private String notAfter;

  /**
   * 18165099476682912368
   */
  @JsonProperty("serialNumber")
  private Integer serialNumber;

  /**
   * e.g. \&quot;CN&#x3D;localhost\&quot;
   * @return subject
   */
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  /**
   * e.g. \&quot;CN&#x3D;Admin\&quot;
   * @return issuer
   */
  public String getIssuer() {
    return issuer;
  }

  public void setIssuer(String issuer) {
    this.issuer = issuer;
  }

  /**
   * e.g. \&quot;Sun Jul 01 12:00:00 AEST 2018\&quot;
   * @return notBefore
   */
  public String getNotBefore() {
    return notBefore;
  }

  public void setNotBefore(String notBefore) {
    this.notBefore = notBefore;
  }

  /**
   * e.g. \&quot;Sun Jun 30 23:59:50 AEST 2019\&quot;
   * @return notAfter
   */
  public String getNotAfter() {
    return notAfter;
  }

  public void setNotAfter(String notAfter) {
    this.notAfter = notAfter;
  }

  /**
   * 18165099476682912368
   * @return serialNumber
   */
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
