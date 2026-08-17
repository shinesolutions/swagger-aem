package org.openapitools.model;

import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class SamlConfigurationPropertyItemsString implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * property name
   */
  @JsonProperty("name")
  private String name;

  /**
   * True if optional
   */
  @JsonProperty("optional")
  private Boolean optional;

  /**
   * True if property is set
   */
  @JsonProperty("is_set")
  private Boolean isSet;

  /**
   * Property type, 1&#x3D;String, 3&#x3D;long, 11&#x3D;boolean, 12&#x3D;Password
   */
  @JsonProperty("type")
  private Integer type;

  /**
   * Property value
   */
  @JsonProperty("value")
  private String value;

  /**
   * Property description
   */
  @JsonProperty("description")
  private String description;

  /**
   * property name
   * @return name
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * True if optional
   * @return optional
   */
  public Boolean getOptional() {
    return optional;
  }

  public void setOptional(Boolean optional) {
    this.optional = optional;
  }

  /**
   * True if property is set
   * @return isSet
   */
  public Boolean getIsSet() {
    return isSet;
  }

  public void setIsSet(Boolean isSet) {
    this.isSet = isSet;
  }

  /**
   * Property type, 1&#x3D;String, 3&#x3D;long, 11&#x3D;boolean, 12&#x3D;Password
   * @return type
   */
  public Integer getType() {
    return type;
  }

  public void setType(Integer type) {
    this.type = type;
  }

  /**
   * Property value
   * @return value
   */
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  /**
   * Property description
   * @return description
   */
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
