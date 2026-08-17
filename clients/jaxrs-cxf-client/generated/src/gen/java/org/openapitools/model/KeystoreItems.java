package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.KeystoreChainItems;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class KeystoreItems  {
  
 /**
  * Keystore alias name
  */
  @ApiModelProperty(value = "Keystore alias name")

  private String alias;

 /**
  * e.g. \"privateKey\"
  */
  @ApiModelProperty(value = "e.g. \"privateKey\"")

  private String entryType;

 /**
  * e.g. \"RSA\"
  */
  @ApiModelProperty(value = "e.g. \"RSA\"")

  private String algorithm;

 /**
  * e.g. \"PKCS#8\"
  */
  @ApiModelProperty(value = "e.g. \"PKCS#8\"")

  private String format;

  @ApiModelProperty(value = "")

  private List<KeystoreChainItems> chain = new ArrayList<>();
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
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeystoreItems keystoreItems = (KeystoreItems) o;
    return Objects.equals(this.alias, keystoreItems.alias) &&
        Objects.equals(this.entryType, keystoreItems.entryType) &&
        Objects.equals(this.algorithm, keystoreItems.algorithm) &&
        Objects.equals(this.format, keystoreItems.format) &&
        Objects.equals(this.chain, keystoreItems.chain);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alias, entryType, algorithm, format, chain);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

