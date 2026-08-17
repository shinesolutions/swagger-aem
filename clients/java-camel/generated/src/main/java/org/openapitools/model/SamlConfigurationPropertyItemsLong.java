package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * SamlConfigurationPropertyItemsLong
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-17T07:12:57.134939377Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class SamlConfigurationPropertyItemsLong {

  private String name;

  private Boolean optional;

  private Boolean isSet;

  private Integer type;

  private Integer value;

  private String description;

  public SamlConfigurationPropertyItemsLong name(String name) {
    this.name = name;
    return this;
  }

  /**
   * property name
   * @return name
   */
  
  @Schema(name = "name", description = "property name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SamlConfigurationPropertyItemsLong optional(Boolean optional) {
    this.optional = optional;
    return this;
  }

  /**
   * True if optional
   * @return optional
   */
  
  @Schema(name = "optional", description = "True if optional", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("optional")
  public Boolean getOptional() {
    return optional;
  }

  public void setOptional(Boolean optional) {
    this.optional = optional;
  }

  public SamlConfigurationPropertyItemsLong isSet(Boolean isSet) {
    this.isSet = isSet;
    return this;
  }

  /**
   * True if property is set
   * @return isSet
   */
  
  @Schema(name = "is_set", description = "True if property is set", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_set")
  public Boolean getIsSet() {
    return isSet;
  }

  public void setIsSet(Boolean isSet) {
    this.isSet = isSet;
  }

  public SamlConfigurationPropertyItemsLong type(Integer type) {
    this.type = type;
    return this;
  }

  /**
   * Property type, 1=String, 3=long, 11=boolean, 12=Password
   * @return type
   */
  
  @Schema(name = "type", description = "Property type, 1=String, 3=long, 11=boolean, 12=Password", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public Integer getType() {
    return type;
  }

  public void setType(Integer type) {
    this.type = type;
  }

  public SamlConfigurationPropertyItemsLong value(Integer value) {
    this.value = value;
    return this;
  }

  /**
   * Property value
   * @return value
   */
  
  @Schema(name = "value", description = "Property value", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("value")
  public Integer getValue() {
    return value;
  }

  public void setValue(Integer value) {
    this.value = value;
  }

  public SamlConfigurationPropertyItemsLong description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Property description
   * @return description
   */
  
  @Schema(name = "description", description = "Property description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

