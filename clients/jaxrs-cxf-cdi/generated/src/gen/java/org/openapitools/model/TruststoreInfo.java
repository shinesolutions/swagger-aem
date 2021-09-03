package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.TruststoreItems;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;


public class TruststoreInfo   {
  
  private List<TruststoreItems> aliases = null;

  private Boolean exists;


  /**
   **/
  public TruststoreInfo aliases(List<TruststoreItems> aliases) {
    this.aliases = aliases;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("aliases")
  public List<TruststoreItems> getAliases() {
    return aliases;
  }
  public void setAliases(List<TruststoreItems> aliases) {
    this.aliases = aliases;
  }

  public TruststoreInfo addAliasesItem(TruststoreItems aliasesItem) {
    if (this.aliases == null) {
      this.aliases = new ArrayList<TruststoreItems>();
    }
    this.aliases.add(aliasesItem);
    return this;
  }


  /**
   * False if truststore don&#39;t exist
   **/
  public TruststoreInfo exists(Boolean exists) {
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
    TruststoreInfo truststoreInfo = (TruststoreInfo) o;
    return Objects.equals(aliases, truststoreInfo.aliases) &&
        Objects.equals(exists, truststoreInfo.exists);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aliases, exists);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TruststoreInfo {\n");
    
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

