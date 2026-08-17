package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SamlConfigurationPropertyItemsString  {
  
 /**
  * property name
  */
  @ApiModelProperty(value = "property name")
  private String name;

 /**
  * True if optional
  */
  @ApiModelProperty(value = "True if optional")
  private Boolean optional;

 /**
  * True if property is set
  */
  @ApiModelProperty(value = "True if property is set")
  private Boolean isSet;

 /**
  * Property type, 1=String, 3=long, 11=boolean, 12=Password
  */
  @ApiModelProperty(value = "Property type, 1=String, 3=long, 11=boolean, 12=Password")
  private Integer type;

 /**
  * Property value
  */
  @ApiModelProperty(value = "Property value")
  private String value;

 /**
  * Property description
  */
  @ApiModelProperty(value = "Property description")
  private String description;
 /**
  * property name
  * @return name
  */
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Sets the <code>name</code> property.
   */
 public void setName(String name) {
    this.name = name;
  }

  /**
   * Sets the <code>name</code> property.
   */
  public SamlConfigurationPropertyItemsString name(String name) {
    this.name = name;
    return this;
  }

 /**
  * True if optional
  * @return optional
  */
  @JsonProperty("optional")
  public Boolean getOptional() {
    return optional;
  }

  /**
   * Sets the <code>optional</code> property.
   */
 public void setOptional(Boolean optional) {
    this.optional = optional;
  }

  /**
   * Sets the <code>optional</code> property.
   */
  public SamlConfigurationPropertyItemsString optional(Boolean optional) {
    this.optional = optional;
    return this;
  }

 /**
  * True if property is set
  * @return isSet
  */
  @JsonProperty("is_set")
  public Boolean getIsSet() {
    return isSet;
  }

  /**
   * Sets the <code>isSet</code> property.
   */
 public void setIsSet(Boolean isSet) {
    this.isSet = isSet;
  }

  /**
   * Sets the <code>isSet</code> property.
   */
  public SamlConfigurationPropertyItemsString isSet(Boolean isSet) {
    this.isSet = isSet;
    return this;
  }

 /**
  * Property type, 1&#x3D;String, 3&#x3D;long, 11&#x3D;boolean, 12&#x3D;Password
  * @return type
  */
  @JsonProperty("type")
  public Integer getType() {
    return type;
  }

  /**
   * Sets the <code>type</code> property.
   */
 public void setType(Integer type) {
    this.type = type;
  }

  /**
   * Sets the <code>type</code> property.
   */
  public SamlConfigurationPropertyItemsString type(Integer type) {
    this.type = type;
    return this;
  }

 /**
  * Property value
  * @return value
  */
  @JsonProperty("value")
  public String getValue() {
    return value;
  }

  /**
   * Sets the <code>value</code> property.
   */
 public void setValue(String value) {
    this.value = value;
  }

  /**
   * Sets the <code>value</code> property.
   */
  public SamlConfigurationPropertyItemsString value(String value) {
    this.value = value;
    return this;
  }

 /**
  * Property description
  * @return description
  */
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  /**
   * Sets the <code>description</code> property.
   */
 public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Sets the <code>description</code> property.
   */
  public SamlConfigurationPropertyItemsString description(String description) {
    this.description = description;
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
    SamlConfigurationPropertyItemsString samlConfigurationPropertyItemsString = (SamlConfigurationPropertyItemsString) o;
    return Objects.equals(this.name, samlConfigurationPropertyItemsString.name) &&
        Objects.equals(this.optional, samlConfigurationPropertyItemsString.optional) &&
        Objects.equals(this.isSet, samlConfigurationPropertyItemsString.isSet) &&
        Objects.equals(this.type, samlConfigurationPropertyItemsString.type) &&
        Objects.equals(this.value, samlConfigurationPropertyItemsString.value) &&
        Objects.equals(this.description, samlConfigurationPropertyItemsString.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, optional, isSet, type, value, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SamlConfigurationPropertyItemsString {\n");
    
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

