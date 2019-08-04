package org.openapitools.model;

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

public class SamlConfigurationPropertyItemsBoolean  {
  
  @ApiModelProperty(value = "property name")
 /**
   * property name
  **/
  private String name = null;

  @ApiModelProperty(value = "True if optional")
 /**
   * True if optional
  **/
  private Boolean optional = null;

  @ApiModelProperty(value = "True if property is set")
 /**
   * True if property is set
  **/
  private Boolean isSet = null;

  @ApiModelProperty(value = "Property type, 1=String, 3=long, 11=boolean, 12=Password")
 /**
   * Property type, 1=String, 3=long, 11=boolean, 12=Password
  **/
  private Integer type = null;

  @ApiModelProperty(value = "Property value")
 /**
   * Property value
  **/
  private Boolean value = null;

  @ApiModelProperty(value = "Property description")
 /**
   * Property description
  **/
  private String description = null;
 /**
   * property name
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SamlConfigurationPropertyItemsBoolean name(String name) {
    this.name = name;
    return this;
  }

 /**
   * True if optional
   * @return optional
  **/
  @JsonProperty("optional")
  public Boolean getOptional() {
    return optional;
  }

  public void setOptional(Boolean optional) {
    this.optional = optional;
  }

  public SamlConfigurationPropertyItemsBoolean optional(Boolean optional) {
    this.optional = optional;
    return this;
  }

 /**
   * True if property is set
   * @return isSet
  **/
  @JsonProperty("is_set")
  public Boolean getIsSet() {
    return isSet;
  }

  public void setIsSet(Boolean isSet) {
    this.isSet = isSet;
  }

  public SamlConfigurationPropertyItemsBoolean isSet(Boolean isSet) {
    this.isSet = isSet;
    return this;
  }

 /**
   * Property type, 1&#x3D;String, 3&#x3D;long, 11&#x3D;boolean, 12&#x3D;Password
   * @return type
  **/
  @JsonProperty("type")
  public Integer getType() {
    return type;
  }

  public void setType(Integer type) {
    this.type = type;
  }

  public SamlConfigurationPropertyItemsBoolean type(Integer type) {
    this.type = type;
    return this;
  }

 /**
   * Property value
   * @return value
  **/
  @JsonProperty("value")
  public Boolean getValue() {
    return value;
  }

  public void setValue(Boolean value) {
    this.value = value;
  }

  public SamlConfigurationPropertyItemsBoolean value(Boolean value) {
    this.value = value;
    return this;
  }

 /**
   * Property description
   * @return description
  **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public SamlConfigurationPropertyItemsBoolean description(String description) {
    this.description = description;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SamlConfigurationPropertyItemsBoolean {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    optional: ").append(toIndentedString(optional)).append("\n");
    sb.append("    isSet: ").append(toIndentedString(isSet)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

