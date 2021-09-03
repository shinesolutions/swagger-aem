package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2021-09-03T15:25:18.608+10:00[Australia/Melbourne]")
public class SamlConfigurationPropertyItemsLong   {
  @JsonProperty("name")
  private String name;

  @JsonProperty("optional")
  private Boolean optional;

  @JsonProperty("is_set")
  private Boolean isSet;

  @JsonProperty("type")
  private Integer type;

  @JsonProperty("value")
  private Integer value;

  @JsonProperty("description")
  private String description;

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
   * Property type, 1=String, 3=long, 11=boolean, 12=Password
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
    return Objects.equals(name, samlConfigurationPropertyItemsLong.name) &&
        Objects.equals(optional, samlConfigurationPropertyItemsLong.optional) &&
        Objects.equals(isSet, samlConfigurationPropertyItemsLong.isSet) &&
        Objects.equals(type, samlConfigurationPropertyItemsLong.type) &&
        Objects.equals(value, samlConfigurationPropertyItemsLong.value) &&
        Objects.equals(description, samlConfigurationPropertyItemsLong.description);
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

