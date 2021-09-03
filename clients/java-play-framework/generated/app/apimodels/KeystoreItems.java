package apimodels;

import apimodels.KeystoreChainItems;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * KeystoreItems
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2021-09-03T15:25:32.040+10:00[Australia/Melbourne]")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class KeystoreItems   {
  @JsonProperty("alias")
  
  private String alias;

  @JsonProperty("entryType")
  
  private String entryType;

  @JsonProperty("algorithm")
  
  private String algorithm;

  @JsonProperty("format")
  
  private String format;

  @JsonProperty("chain")
  @Valid

  private List<KeystoreChainItems> chain = null;

  public KeystoreItems alias(String alias) {
    this.alias = alias;
    return this;
  }

   /**
   * Keystore alias name
   * @return alias
  **/
  public String getAlias() {
    return alias;
  }

  public void setAlias(String alias) {
    this.alias = alias;
  }

  public KeystoreItems entryType(String entryType) {
    this.entryType = entryType;
    return this;
  }

   /**
   * e.g. \"privateKey\"
   * @return entryType
  **/
  public String getEntryType() {
    return entryType;
  }

  public void setEntryType(String entryType) {
    this.entryType = entryType;
  }

  public KeystoreItems algorithm(String algorithm) {
    this.algorithm = algorithm;
    return this;
  }

   /**
   * e.g. \"RSA\"
   * @return algorithm
  **/
  public String getAlgorithm() {
    return algorithm;
  }

  public void setAlgorithm(String algorithm) {
    this.algorithm = algorithm;
  }

  public KeystoreItems format(String format) {
    this.format = format;
    return this;
  }

   /**
   * e.g. \"PKCS#8\"
   * @return format
  **/
  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }

  public KeystoreItems chain(List<KeystoreChainItems> chain) {
    this.chain = chain;
    return this;
  }

  public KeystoreItems addChainItem(KeystoreChainItems chainItem) {
    if (chain == null) {
      chain = new ArrayList<>();
    }
    chain.add(chainItem);
    return this;
  }

   /**
   * Get chain
   * @return chain
  **/
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
    return Objects.equals(alias, keystoreItems.alias) &&
        Objects.equals(entryType, keystoreItems.entryType) &&
        Objects.equals(algorithm, keystoreItems.algorithm) &&
        Objects.equals(format, keystoreItems.format) &&
        Objects.equals(chain, keystoreItems.chain);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alias, entryType, algorithm, format, chain);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

