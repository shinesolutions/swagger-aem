package apimodels;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * SamlConfigurationPropertyItemsArray
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2021-09-03T15:25:32.040+10:00[Australia/Melbourne]")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class SamlConfigurationPropertyItemsArray   {
  @JsonProperty("name")
  
  private String name;

  @JsonProperty("optional")
  
  private Boolean optional;

  @JsonProperty("is_set")
  
  private Boolean isSet;

  @JsonProperty("type")
  
  private Integer type;

  @JsonProperty("values")
  
  private List<String> values = null;

  @JsonProperty("description")
  
  private String description;

  public SamlConfigurationPropertyItemsArray name(String name) {
    this.name = name;
    return this;
  }

   /**
   * property name
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SamlConfigurationPropertyItemsArray optional(Boolean optional) {
    this.optional = optional;
    return this;
  }

   /**
   * True if optional
   * @return optional
  **/
  public Boolean getOptional() {
    return optional;
  }

  public void setOptional(Boolean optional) {
    this.optional = optional;
  }

  public SamlConfigurationPropertyItemsArray isSet(Boolean isSet) {
    this.isSet = isSet;
    return this;
  }

   /**
   * True if property is set
   * @return isSet
  **/
  public Boolean getIsSet() {
    return isSet;
  }

  public void setIsSet(Boolean isSet) {
    this.isSet = isSet;
  }

  public SamlConfigurationPropertyItemsArray type(Integer type) {
    this.type = type;
    return this;
  }

   /**
   * Property type, 1=String, 3=long, 11=boolean, 12=Password
   * @return type
  **/
  public Integer getType() {
    return type;
  }

  public void setType(Integer type) {
    this.type = type;
  }

  public SamlConfigurationPropertyItemsArray values(List<String> values) {
    this.values = values;
    return this;
  }

  public SamlConfigurationPropertyItemsArray addValuesItem(String valuesItem) {
    if (values == null) {
      values = new ArrayList<>();
    }
    values.add(valuesItem);
    return this;
  }

   /**
   * Property value
   * @return values
  **/
  public List<String> getValues() {
    return values;
  }

  public void setValues(List<String> values) {
    this.values = values;
  }

  public SamlConfigurationPropertyItemsArray description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Property description
   * @return description
  **/
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
    SamlConfigurationPropertyItemsArray samlConfigurationPropertyItemsArray = (SamlConfigurationPropertyItemsArray) o;
    return Objects.equals(name, samlConfigurationPropertyItemsArray.name) &&
        Objects.equals(optional, samlConfigurationPropertyItemsArray.optional) &&
        Objects.equals(isSet, samlConfigurationPropertyItemsArray.isSet) &&
        Objects.equals(type, samlConfigurationPropertyItemsArray.type) &&
        Objects.equals(values, samlConfigurationPropertyItemsArray.values) &&
        Objects.equals(description, samlConfigurationPropertyItemsArray.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, optional, isSet, type, values, description);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SamlConfigurationPropertyItemsArray {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    optional: ").append(toIndentedString(optional)).append("\n");
    sb.append("    isSet: ").append(toIndentedString(isSet)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

