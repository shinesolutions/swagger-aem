package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * TruststoreItems
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-04T23:41:35.248Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class TruststoreItems   {
  @JsonProperty("alias")
  private String alias = null;

  @JsonProperty("entryType")
  private String entryType = null;

  @JsonProperty("subject")
  private String subject = null;

  @JsonProperty("issuer")
  private String issuer = null;

  @JsonProperty("notBefore")
  private String notBefore = null;

  @JsonProperty("notAfter")
  private String notAfter = null;

  @JsonProperty("serialNumber")
  private Integer serialNumber = null;

  public TruststoreItems alias(String alias) {
    this.alias = alias;
    return this;
  }

   /**
   * Truststore alias name
   * @return alias
  **/
    public String getAlias() {
    return alias;
  }

  public void setAlias(String alias) {
    this.alias = alias;
  }

  public TruststoreItems entryType(String entryType) {
    this.entryType = entryType;
    return this;
  }

   /**
   * Get entryType
   * @return entryType
  **/
    public String getEntryType() {
    return entryType;
  }

  public void setEntryType(String entryType) {
    this.entryType = entryType;
  }

  public TruststoreItems subject(String subject) {
    this.subject = subject;
    return this;
  }

   /**
   * e.g. \"CN=localhost\"
   * @return subject
  **/
    public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public TruststoreItems issuer(String issuer) {
    this.issuer = issuer;
    return this;
  }

   /**
   * e.g. \"CN=Admin\"
   * @return issuer
  **/
    public String getIssuer() {
    return issuer;
  }

  public void setIssuer(String issuer) {
    this.issuer = issuer;
  }

  public TruststoreItems notBefore(String notBefore) {
    this.notBefore = notBefore;
    return this;
  }

   /**
   * e.g. \"Sun Jul 01 12:00:00 AEST 2018\"
   * @return notBefore
  **/
    public String getNotBefore() {
    return notBefore;
  }

  public void setNotBefore(String notBefore) {
    this.notBefore = notBefore;
  }

  public TruststoreItems notAfter(String notAfter) {
    this.notAfter = notAfter;
    return this;
  }

   /**
   * e.g. \"Sun Jun 30 23:59:50 AEST 2019\"
   * @return notAfter
  **/
    public String getNotAfter() {
    return notAfter;
  }

  public void setNotAfter(String notAfter) {
    this.notAfter = notAfter;
  }

  public TruststoreItems serialNumber(Integer serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }

   /**
   * 18165099476682912368
   * @return serialNumber
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

