package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.KeystoreChainItems;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-08-17T02:15:38.090574223Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class KeystoreItems   {
  
  private String alias;
  private String entryType;
  private String algorithm;
  private String format;
  private List<@Valid KeystoreChainItems> chain = new ArrayList<>();

  /**
   * Keystore alias name
   **/
  
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
  
  @ApiModelProperty(value = "")
  @JsonProperty("chain")
  @Valid
  public List<@Valid KeystoreChainItems> getChain() {
    return chain;
  }
  public void setChain(List<@Valid KeystoreChainItems> chain) {
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

