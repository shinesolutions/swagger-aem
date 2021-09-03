package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.KeystoreItems;

/**
 * KeystoreInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-09-03T15:25:23.467+10:00[Australia/Melbourne]")
public class KeystoreInfo   {
  @JsonProperty("aliases")
  private List<KeystoreItems> aliases = null;

  @JsonProperty("exists")
  private Boolean exists;

  public KeystoreInfo aliases(List<KeystoreItems> aliases) {
    this.aliases = aliases;
    return this;
  }

  public KeystoreInfo addAliasesItem(KeystoreItems aliasesItem) {
    if (this.aliases == null) {
      this.aliases = new ArrayList<KeystoreItems>();
    }
    this.aliases.add(aliasesItem);
    return this;
  }

   /**
   * Get aliases
   * @return aliases
  **/
  @ApiModelProperty(value = "")
  public List<KeystoreItems> getAliases() {
    return aliases;
  }

  public void setAliases(List<KeystoreItems> aliases) {
    this.aliases = aliases;
  }

  public KeystoreInfo exists(Boolean exists) {
    this.exists = exists;
    return this;
  }

   /**
   * False if truststore don't exist
   * @return exists
  **/
  @ApiModelProperty(value = "False if truststore don't exist")
  public Boolean getExists() {
    return exists;
  }

  public void setExists(Boolean exists) {
    this.exists = exists;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeystoreInfo keystoreInfo = (KeystoreInfo) o;
    return Objects.equals(this.aliases, keystoreInfo.aliases) &&
        Objects.equals(this.exists, keystoreInfo.exists);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aliases, exists);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeystoreInfo {\n");
    
    sb.append("    aliases: ").append(toIndentedString(aliases)).append("\n");
    sb.append("    exists: ").append(toIndentedString(exists)).append("\n");
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

