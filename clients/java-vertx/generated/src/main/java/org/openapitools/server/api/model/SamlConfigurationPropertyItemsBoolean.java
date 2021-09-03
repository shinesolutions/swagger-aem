package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SamlConfigurationPropertyItemsBoolean   {
  
  private String name;
  private Boolean optional;
  private Boolean isSet;
  private Integer type;
  private Boolean value;
  private String description;

  public SamlConfigurationPropertyItemsBoolean () {

  }

  public SamlConfigurationPropertyItemsBoolean (String name, Boolean optional, Boolean isSet, Integer type, Boolean value, String description) {
    this.name = name;
    this.optional = optional;
    this.isSet = isSet;
    this.type = type;
    this.value = value;
    this.description = description;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("optional")
  public Boolean getOptional() {
    return optional;
  }
  public void setOptional(Boolean optional) {
    this.optional = optional;
  }

    
  @JsonProperty("is_set")
  public Boolean getIsSet() {
    return isSet;
  }
  public void setIsSet(Boolean isSet) {
    this.isSet = isSet;
  }

    
  @JsonProperty("type")
  public Integer getType() {
    return type;
  }
  public void setType(Integer type) {
    this.type = type;
  }

    
  @JsonProperty("value")
  public Boolean getValue() {
    return value;
  }
  public void setValue(Boolean value) {
    this.value = value;
  }

    
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
    SamlConfigurationPropertyItemsBoolean samlConfigurationPropertyItemsBoolean = (SamlConfigurationPropertyItemsBoolean) o;
    return Objects.equals(name, samlConfigurationPropertyItemsBoolean.name) &&
        Objects.equals(optional, samlConfigurationPropertyItemsBoolean.optional) &&
        Objects.equals(isSet, samlConfigurationPropertyItemsBoolean.isSet) &&
        Objects.equals(type, samlConfigurationPropertyItemsBoolean.type) &&
        Objects.equals(value, samlConfigurationPropertyItemsBoolean.value) &&
        Objects.equals(description, samlConfigurationPropertyItemsBoolean.description);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
