/*
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


package com.shinesolutions.swaggeraem4j.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * SamlConfigurationPropertyItemsString
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-26T04:43:48.113Z[GMT]")
public class SamlConfigurationPropertyItemsString {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_OPTIONAL = "optional";
  @SerializedName(SERIALIZED_NAME_OPTIONAL)
  private Boolean optional;

  public static final String SERIALIZED_NAME_IS_SET = "is_set";
  @SerializedName(SERIALIZED_NAME_IS_SET)
  private Boolean isSet;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private Integer type;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;


  public SamlConfigurationPropertyItemsString name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * property name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "property name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public SamlConfigurationPropertyItemsString optional(Boolean optional) {
    
    this.optional = optional;
    return this;
  }

   /**
   * True if optional
   * @return optional
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if optional")

  public Boolean getOptional() {
    return optional;
  }


  public void setOptional(Boolean optional) {
    this.optional = optional;
  }


  public SamlConfigurationPropertyItemsString isSet(Boolean isSet) {
    
    this.isSet = isSet;
    return this;
  }

   /**
   * True if property is set
   * @return isSet
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if property is set")

  public Boolean getIsSet() {
    return isSet;
  }


  public void setIsSet(Boolean isSet) {
    this.isSet = isSet;
  }


  public SamlConfigurationPropertyItemsString type(Integer type) {
    
    this.type = type;
    return this;
  }

   /**
   * Property type, 1&#x3D;String, 3&#x3D;long, 11&#x3D;boolean, 12&#x3D;Password
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Property type, 1=String, 3=long, 11=boolean, 12=Password")

  public Integer getType() {
    return type;
  }


  public void setType(Integer type) {
    this.type = type;
  }


  public SamlConfigurationPropertyItemsString value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * Property value
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Property value")

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }


  public SamlConfigurationPropertyItemsString description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Property description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Property description")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

