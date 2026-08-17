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
 * SamlConfigurationPropertyItemsBoolean
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-17T07:15:54.600438135Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class SamlConfigurationPropertyItemsBoolean {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String name;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Boolean optional;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Boolean isSet;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer type;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Boolean value;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String description;

  public SamlConfigurationPropertyItemsBoolean name(@Nullable String name) {
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

  public SamlConfigurationPropertyItemsBoolean optional(@Nullable Boolean optional) {
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

  public SamlConfigurationPropertyItemsBoolean isSet(@Nullable Boolean isSet) {
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

  public SamlConfigurationPropertyItemsBoolean type(@Nullable Integer type) {
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

  public SamlConfigurationPropertyItemsBoolean value(@Nullable Boolean value) {
    this.value = value;
    return this;
  }

  /**
   * Property value
   * @return value
   */
  
  @Schema(name = "value", description = "Property value", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("value")
  public @Nullable Boolean getValue() {
    return value;
  }

  @JsonProperty("value")
  public void setValue(@Nullable Boolean value) {
    this.value = value;
  }

  public SamlConfigurationPropertyItemsBoolean description(@Nullable String description) {
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
    SamlConfigurationPropertyItemsBoolean samlConfigurationPropertyItemsBoolean = (SamlConfigurationPropertyItemsBoolean) o;
    return Objects.equals(this.name, samlConfigurationPropertyItemsBoolean.name) &&
        Objects.equals(this.optional, samlConfigurationPropertyItemsBoolean.optional) &&
        Objects.equals(this.isSet, samlConfigurationPropertyItemsBoolean.isSet) &&
        Objects.equals(this.type, samlConfigurationPropertyItemsBoolean.type) &&
        Objects.equals(this.value, samlConfigurationPropertyItemsBoolean.value) &&
        Objects.equals(this.description, samlConfigurationPropertyItemsBoolean.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, optional, isSet, type, value, description);
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

