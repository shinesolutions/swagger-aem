package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-17T07:15:54.600438135Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class SamlConfigurationPropertyItemsLong {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String name;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Boolean optional;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Boolean isSet;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer type;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer value;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String description;

  public SamlConfigurationPropertyItemsLong name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * property name
   * @return name
   */
  
  @Schema(name = "name", description = "property name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(@Nullable String name) {
    this.name = name;
  }

  public SamlConfigurationPropertyItemsLong optional(@Nullable Boolean optional) {
    this.optional = optional;
    return this;
  }

  /**
   * True if optional
   * @return optional
   */
  
  @Schema(name = "optional", description = "True if optional", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("optional")
  public @Nullable Boolean getOptional() {
    return optional;
  }

  @JsonProperty("optional")
  public void setOptional(@Nullable Boolean optional) {
    this.optional = optional;
  }

  public SamlConfigurationPropertyItemsLong isSet(@Nullable Boolean isSet) {
    this.isSet = isSet;
    return this;
  }

  /**
   * True if property is set
   * @return isSet
   */
  
  @Schema(name = "is_set", description = "True if property is set", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_set")
  public @Nullable Boolean getIsSet() {
    return isSet;
  }

  @JsonProperty("is_set")
  public void setIsSet(@Nullable Boolean isSet) {
    this.isSet = isSet;
  }

  public SamlConfigurationPropertyItemsLong type(@Nullable Integer type) {
    this.type = type;
    return this;
  }

  /**
   * Property type, 1=String, 3=long, 11=boolean, 12=Password
   * @return type
   */
  
  @Schema(name = "type", description = "Property type, 1=String, 3=long, 11=boolean, 12=Password", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public @Nullable Integer getType() {
    return type;
  }

  @JsonProperty("type")
  public void setType(@Nullable Integer type) {
    this.type = type;
  }

  public SamlConfigurationPropertyItemsLong value(@Nullable Integer value) {
    this.value = value;
    return this;
  }

  /**
   * Property value
   * @return value
   */
  
  @Schema(name = "value", description = "Property value", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("value")
  public @Nullable Integer getValue() {
    return value;
  }

  @JsonProperty("value")
  public void setValue(@Nullable Integer value) {
    this.value = value;
  }

  public SamlConfigurationPropertyItemsLong description(@Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Property description
   * @return description
   */
  
  @Schema(name = "description", description = "Property description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public @Nullable String getDescription() {
    return description;
  }

  @JsonProperty("description")
  public void setDescription(@Nullable String description) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

