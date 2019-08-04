package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.KeystoreChainItems;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class KeystoreItems   {
  
  private String alias = null;

  private String entryType = null;

  private String algorithm = null;

  private String format = null;

  private List<KeystoreChainItems> chain = null;


  /**
   * Keystore alias name
   **/
  public KeystoreItems alias(String alias) {
    this.alias = alias;
    return this;
  }

  
  @ApiModelProperty(value = "Keystore alias name")
  @JsonProperty("alias")
  public String getAlias() {
    return alias;
  }
  public void setAlias(String alias) {
    this.alias = alias;
  }


  /**
   * e.g. \&quot;privateKey\&quot;
   **/
  public KeystoreItems entryType(String entryType) {
    this.entryType = entryType;
    return this;
  }

  
  @ApiModelProperty(value = "e.g. \"privateKey\"")
  @JsonProperty("entryType")
  public String getEntryType() {
    return entryType;
  }
  public void setEntryType(String entryType) {
    this.entryType = entryType;
  }


  /**
   * e.g. \&quot;RSA\&quot;
   **/
  public KeystoreItems algorithm(String algorithm) {
    this.algorithm = algorithm;
    return this;
  }

  
  @ApiModelProperty(value = "e.g. \"RSA\"")
  @JsonProperty("algorithm")
  public String getAlgorithm() {
    return algorithm;
  }
  public void setAlgorithm(String algorithm) {
    this.algorithm = algorithm;
  }


  /**
   * e.g. \&quot;PKCS#8\&quot;
   **/
  public KeystoreItems format(String format) {
    this.format = format;
    return this;
  }

  
  @ApiModelProperty(value = "e.g. \"PKCS#8\"")
  @JsonProperty("format")
  public String getFormat() {
    return format;
  }
  public void setFormat(String format) {
    this.format = format;
  }


  /**
   **/
  public KeystoreItems chain(List<KeystoreChainItems> chain) {
    this.chain = chain;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("chain")
  public List<KeystoreChainItems> getChain() {
    return chain;
  }
  public void setChain(List<KeystoreChainItems> chain) {
    this.chain = chain;
  }

  public KeystoreItems addChainItem(KeystoreChainItems chainItem) {
    if (this.chain == null) {
      this.chain = new ArrayList<KeystoreChainItems>();
    }
    this.chain.add(chainItem);
    return this;
  }



  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

