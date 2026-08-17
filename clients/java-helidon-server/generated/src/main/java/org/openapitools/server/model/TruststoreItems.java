package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class TruststoreItems   {

    private String alias;
    private String entryType;
    private String subject;
    private String issuer;
    private String notBefore;
    private String notAfter;
    private Integer serialNumber;

    /**
     * Default constructor.
     */
    public TruststoreItems() {
    // JSON-B / Jackson
    }

    /**
     * Create TruststoreItems.
     *
     * @param alias Truststore alias name
     * @param entryType entryType
     * @param subject e.g. \&quot;CN&#x3D;localhost\&quot;
     * @param issuer e.g. \&quot;CN&#x3D;Admin\&quot;
     * @param notBefore e.g. \&quot;Sun Jul 01 12:00:00 AEST 2018\&quot;
     * @param notAfter e.g. \&quot;Sun Jun 30 23:59:50 AEST 2019\&quot;
     * @param serialNumber 18165099476682912368
     */
    public TruststoreItems(
        String alias, 
        String entryType, 
        String subject, 
        String issuer, 
        String notBefore, 
        String notAfter, 
        Integer serialNumber
    ) {
        this.alias = alias;
        this.entryType = entryType;
        this.subject = subject;
        this.issuer = issuer;
        this.notBefore = notBefore;
        this.notAfter = notAfter;
        this.serialNumber = serialNumber;
    }



    /**
     * Truststore alias name
     * @return alias
     */
    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * Get entryType
     * @return entryType
     */
    public String getEntryType() {
        return entryType;
    }

    public void setEntryType(String entryType) {
        this.entryType = entryType;
    }

    /**
     * e.g. \"CN=localhost\"
     * @return subject
     */
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * e.g. \"CN=Admin\"
     * @return issuer
     */
    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    /**
     * e.g. \"Sun Jul 01 12:00:00 AEST 2018\"
     * @return notBefore
     */
    public String getNotBefore() {
        return notBefore;
    }

    public void setNotBefore(String notBefore) {
        this.notBefore = notBefore;
    }

    /**
     * e.g. \"Sun Jun 30 23:59:50 AEST 2019\"
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

    /**
      * Create a string representation of this pojo.
    **/
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
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

