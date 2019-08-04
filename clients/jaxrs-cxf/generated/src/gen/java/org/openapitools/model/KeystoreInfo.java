package org.openapitools.model;

import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.KeystoreItems;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class KeystoreInfo  {
  
  @ApiModelProperty(value = "")
  @Valid
  private List<KeystoreItems> aliases = null;

  @ApiModelProperty(value = "False if truststore don't exist")
 /**
   * False if truststore don't exist
  **/
  private Boolean exists = null;
 /**
   * Get aliases
   * @return aliases
  **/
  @JsonProperty("aliases")
  public List<KeystoreItems> getAliases() {
    return aliases;
  }

  public void setAliases(List<KeystoreItems> aliases) {
    this.aliases = aliases;
  }

  public KeystoreInfo aliases(List<KeystoreItems> aliases) {
    this.aliases = aliases;
    return this;
  }

  public KeystoreInfo addAliasesItem(KeystoreItems aliasesItem) {
    this.aliases.add(aliasesItem);
    return this;
  }

 /**
   * False if truststore don&#39;t exist
   * @return exists
  **/
  @JsonProperty("exists")
  public Boolean getExists() {
    return exists;
  }

  public void setExists(Boolean exists) {
    this.exists = exists;
  }

  public KeystoreInfo exists(Boolean exists) {
    this.exists = exists;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

