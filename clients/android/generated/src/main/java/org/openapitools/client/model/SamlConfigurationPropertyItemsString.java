/**
 * Adobe Experience Manager (AEM) API
 * Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API
 *
 * The version of the OpenAPI document: 3.5.0-pre.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class SamlConfigurationPropertyItemsString {
  
  @SerializedName("name")
  private String name = null;
  @SerializedName("optional")
  private Boolean optional = null;
  @SerializedName("is_set")
  private Boolean isSet = null;
  @SerializedName("type")
  private Integer type = null;
  @SerializedName("value")
  private String value = null;
  @SerializedName("description")
  private String description = null;

  /**
   * property name
   **/
  @ApiModelProperty(value = "property name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * True if optional
   **/
  @ApiModelProperty(value = "True if optional")
  public Boolean getOptional() {
    return optional;
  }
  public void setOptional(Boolean optional) {
    this.optional = optional;
  }

  /**
   * True if property is set
   **/
  @ApiModelProperty(value = "True if property is set")
  public Boolean getIsSet() {
    return isSet;
  }
  public void setIsSet(Boolean isSet) {
    this.isSet = isSet;
  }

  /**
   * Property type, 1=String, 3=long, 11=boolean, 12=Password
   **/
  @ApiModelProperty(value = "Property type, 1=String, 3=long, 11=boolean, 12=Password")
  public Integer getType() {
    return type;
  }
  public void setType(Integer type) {
    this.type = type;
  }

  /**
   * Property value
   **/
  @ApiModelProperty(value = "Property value")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }

  /**
   * Property description
   **/
  @ApiModelProperty(value = "Property description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SamlConfigurationPropertyItemsString samlConfigurationPropertyItemsString = (SamlConfigurationPropertyItemsString) o;
    return (this.name == null ? samlConfigurationPropertyItemsString.name == null : this.name.equals(samlConfigurationPropertyItemsString.name)) &&
        (this.optional == null ? samlConfigurationPropertyItemsString.optional == null : this.optional.equals(samlConfigurationPropertyItemsString.optional)) &&
        (this.isSet == null ? samlConfigurationPropertyItemsString.isSet == null : this.isSet.equals(samlConfigurationPropertyItemsString.isSet)) &&
        (this.type == null ? samlConfigurationPropertyItemsString.type == null : this.type.equals(samlConfigurationPropertyItemsString.type)) &&
        (this.value == null ? samlConfigurationPropertyItemsString.value == null : this.value.equals(samlConfigurationPropertyItemsString.value)) &&
        (this.description == null ? samlConfigurationPropertyItemsString.description == null : this.description.equals(samlConfigurationPropertyItemsString.description));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.optional == null ? 0: this.optional.hashCode());
    result = 31 * result + (this.isSet == null ? 0: this.isSet.hashCode());
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    result = 31 * result + (this.value == null ? 0: this.value.hashCode());
    result = 31 * result + (this.description == null ? 0: this.description.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SamlConfigurationPropertyItemsString {\n");
    
    sb.append("  name: ").append(name).append("\n");
    sb.append("  optional: ").append(optional).append("\n");
    sb.append("  isSet: ").append(isSet).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  value: ").append(value).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
