package org.openapitools.model;

import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.KeystoreChainItems;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class KeystoreItems  {
  
  @ApiModelProperty(value = "Keystore alias name")
 /**
   * Keystore alias name
  **/
  private String alias = null;

  @ApiModelProperty(value = "e.g. \"privateKey\"")
 /**
   * e.g. \"privateKey\"
  **/
  private String entryType = null;

  @ApiModelProperty(value = "e.g. \"RSA\"")
 /**
   * e.g. \"RSA\"
  **/
  private String algorithm = null;

  @ApiModelProperty(value = "e.g. \"PKCS#8\"")
 /**
   * e.g. \"PKCS#8\"
  **/
  private String format = null;

  @ApiModelProperty(value = "")
  private List<KeystoreChainItems> chain = null;
 /**
   * Keystore alias name
   * @return alias
  **/
  @JsonProperty("alias")
  public String getAlias() {
    return alias;
  }

  public void setAlias(String alias) {
    this.alias = alias;
  }

  public KeystoreItems alias(String alias) {
    this.alias = alias;
    return this;
  }

 /**
   * e.g. \&quot;privateKey\&quot;
   * @return entryType
  **/
  @JsonProperty("entryType")
  public String getEntryType() {
    return entryType;
  }

  public void setEntryType(String entryType) {
    this.entryType = entryType;
  }

  public KeystoreItems entryType(String entryType) {
    this.entryType = entryType;
    return this;
  }

 /**
   * e.g. \&quot;RSA\&quot;
   * @return algorithm
  **/
  @JsonProperty("algorithm")
  public String getAlgorithm() {
    return algorithm;
  }

  public void setAlgorithm(String algorithm) {
    this.algorithm = algorithm;
  }

  public KeystoreItems algorithm(String algorithm) {
    this.algorithm = algorithm;
    return this;
  }

 /**
   * e.g. \&quot;PKCS#8\&quot;
   * @return format
  **/
  @JsonProperty("format")
  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }

  public KeystoreItems format(String format) {
    this.format = format;
    return this;
  }

 /**
   * Get chain
   * @return chain
  **/
  @JsonProperty("chain")
  public List<KeystoreChainItems> getChain() {
    return chain;
  }

  public void setChain(List<KeystoreChainItems> chain) {
    this.chain = chain;
  }

  public KeystoreItems chain(List<KeystoreChainItems> chain) {
    this.chain = chain;
    return this;
  }

  public KeystoreItems addChainItem(KeystoreChainItems chainItem) {
    this.chain.add(chainItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeystoreItems {\n");
    
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    entryType: ").append(toIndentedString(entryType)).append("\n");
    sb.append("    algorithm: ").append(toIndentedString(algorithm)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    chain: ").append(toIndentedString(chain)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

