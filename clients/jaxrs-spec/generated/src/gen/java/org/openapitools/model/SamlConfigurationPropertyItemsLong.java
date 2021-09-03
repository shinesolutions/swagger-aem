package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;



@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2021-09-03T15:26:06.461+10:00[Australia/Melbourne]")public class SamlConfigurationPropertyItemsLong   {
  
  private @Valid String name;
  private @Valid Boolean optional;
  private @Valid Boolean isSet;
  private @Valid Integer type;
  private @Valid Integer value;
  private @Valid String description;

  /**
   * property name
   **/
  public SamlConfigurationPropertyItemsLong name(String name) {
    this.name = name;
    return this;
  }

  

  
  @ApiModelProperty(value = "property name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

/**
   * True if optional
   **/
  public SamlConfigurationPropertyItemsLong optional(Boolean optional) {
    this.optional = optional;
    return this;
  }

  

  
  @ApiModelProperty(value = "True if optional")
  @JsonProperty("optional")
  public Boolean getOptional() {
    return optional;
  }

  public void setOptional(Boolean optional) {
    this.optional = optional;
  }

/**
   * True if property is set
   **/
  public SamlConfigurationPropertyItemsLong isSet(Boolean isSet) {
    this.isSet = isSet;
    return this;
  }

  

  
  @ApiModelProperty(value = "True if property is set")
  @JsonProperty("is_set")
  public Boolean getIsSet() {
    return isSet;
  }

  public void setIsSet(Boolean isSet) {
    this.isSet = isSet;
  }

/**
   * Property type, 1&#x3D;String, 3&#x3D;long, 11&#x3D;boolean, 12&#x3D;Password
   **/
  public SamlConfigurationPropertyItemsLong type(Integer type) {
    this.type = type;
    return this;
  }

  

  
  @ApiModelProperty(value = "Property type, 1=String, 3=long, 11=boolean, 12=Password")
  @JsonProperty("type")
  public Integer getType() {
    return type;
  }

  public void setType(Integer type) {
    this.type = type;
  }

/**
   * Property value
   **/
  public SamlConfigurationPropertyItemsLong value(Integer value) {
    this.value = value;
    return this;
  }

  

  
  @ApiModelProperty(value = "Property value")
  @JsonProperty("value")
  public Integer getValue() {
    return value;
  }

  public void setValue(Integer value) {
    this.value = value;
  }

/**
   * Property description
   **/
  public SamlConfigurationPropertyItemsLong description(String description) {
    this.description = description;
    return this;
  }

  

  
  @ApiModelProperty(value = "Property description")
  @JsonProperty("description")
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
    SamlConfigurationPropertyItemsLong samlConfigurationPropertyItemsLong = (SamlConfigurationPropertyItemsLong) o;
    return Objects.equals(this.name, samlConfigurationPropertyItemsLong.name) &&
        Objects.equals(this.optional, samlConfigurationPropertyItemsLong.optional) &&
        Objects.equals(this.isSet, samlConfigurationPropertyItemsLong.isSet) &&
        Objects.equals(this.type, samlConfigurationPropertyItemsLong.type) &&
        Objects.equals(this.value, samlConfigurationPropertyItemsLong.value) &&
        Objects.equals(this.description, samlConfigurationPropertyItemsLong.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, optional, isSet, type, value, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SamlConfigurationPropertyItemsLong {\n");
    
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

