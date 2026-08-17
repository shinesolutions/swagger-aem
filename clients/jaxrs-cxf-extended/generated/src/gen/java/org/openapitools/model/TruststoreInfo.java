package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.TruststoreItems;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class TruststoreInfo  {
  
  @ApiModelProperty(value = "")
  @Valid
  private List<@Valid TruststoreItems> aliases = new ArrayList<>();

 /**
  * False if truststore don't exist
  */
  @ApiModelProperty(value = "False if truststore don't exist")
  private Boolean exists;
 /**
  * Get aliases
  * @return aliases
  */
  @JsonProperty("aliases")
  public List<@Valid TruststoreItems> getAliases() {
    return aliases;
  }

  /**
   * Sets the <code>aliases</code> property.
   */
 public void setAliases(List<@Valid TruststoreItems> aliases) {
    this.aliases = aliases;
  }

  /**
   * Sets the <code>aliases</code> property.
   */
  public TruststoreInfo aliases(List<@Valid TruststoreItems> aliases) {
    this.aliases = aliases;
    return this;
  }

  /**
   * Adds a new item to the <code>aliases</code> list.
   */
  public TruststoreInfo addAliasesItem(TruststoreItems aliasesItem) {
    this.aliases.add(aliasesItem);
    return this;
  }

 /**
  * False if truststore don&#39;t exist
  * @return exists
  */
  @JsonProperty("exists")
  public Boolean getExists() {
    return exists;
  }

  /**
   * Sets the <code>exists</code> property.
   */
 public void setExists(Boolean exists) {
    this.exists = exists;
  }

  /**
   * Sets the <code>exists</code> property.
   */
  public TruststoreInfo exists(Boolean exists) {
    this.exists = exists;
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
    TruststoreInfo truststoreInfo = (TruststoreInfo) o;
    return Objects.equals(this.aliases, truststoreInfo.aliases) &&
        Objects.equals(this.exists, truststoreInfo.exists);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

