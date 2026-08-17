package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.KeystoreItems;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class KeystoreInfo   {
  
  private List<@Valid KeystoreItems> aliases = new ArrayList<>();

  private Boolean exists;

  /**
   **/
  public KeystoreInfo aliases(List<@Valid KeystoreItems> aliases) {
    this.aliases = aliases;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("aliases")
  public List<@Valid KeystoreItems> getAliases() {
    return aliases;
  }
  public void setAliases(List<@Valid KeystoreItems> aliases) {
    this.aliases = aliases;
  }

  public KeystoreInfo addAliasesItem(KeystoreItems aliasesItem) {
    if (this.aliases == null) {
      this.aliases = new ArrayList<>();
    }
    this.aliases.add(aliasesItem);
    return this;
  }


  /**
   * False if truststore don&#39;t exist
   **/
  public KeystoreInfo exists(Boolean exists) {
    this.exists = exists;
    return this;
  }

  
  @ApiModelProperty(value = "False if truststore don't exist")
  @JsonProperty("exists")
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

