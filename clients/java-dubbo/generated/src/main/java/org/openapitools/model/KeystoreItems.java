package org.openapitools.model;

import org.openapitools.model.KeystoreChainItems;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class KeystoreItems implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Keystore alias name
   */
  @JsonProperty("alias")
  private String alias;

  /**
   * e.g. \&quot;privateKey\&quot;
   */
  @JsonProperty("entryType")
  private String entryType;

  /**
   * e.g. \&quot;RSA\&quot;
   */
  @JsonProperty("algorithm")
  private String algorithm;

  /**
   * e.g. \&quot;PKCS#8\&quot;
   */
  @JsonProperty("format")
  private String format;

  @JsonProperty("chain")
  private List<KeystoreChainItems> chain = new ArrayList<>();

  /**
   * Keystore alias name
   * @return alias
   */
  public String getAlias() {
    return alias;
  }

  public void setAlias(String alias) {
    this.alias = alias;
  }

  /**
   * e.g. \&quot;privateKey\&quot;
   * @return entryType
   */
  public String getEntryType() {
    return entryType;
  }

  public void setEntryType(String entryType) {
    this.entryType = entryType;
  }

  /**
   * e.g. \&quot;RSA\&quot;
   * @return algorithm
   */
  public String getAlgorithm() {
    return algorithm;
  }

  public void setAlgorithm(String algorithm) {
    this.algorithm = algorithm;
  }

  /**
   * e.g. \&quot;PKCS#8\&quot;
   * @return format
   */
  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }

  /**
   * 
   * @return chain
   */
  public List<KeystoreChainItems> getChain() {
    return chain;
  }

  public void setChain(List<KeystoreChainItems> chain) {
    this.chain = chain;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
