package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BundleDataProp
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-03T15:28:35.636+10:00[Australia/Melbourne]")
public class BundleDataProp   {
  @JsonProperty("key")
  private String key;

  @JsonProperty("value")
  private String value;

  public BundleDataProp key(String key) {
    this.key = key;
    return this;
  }

  /**
   * Bundle data key
   * @return key
  */
  @ApiModelProperty(value = "Bundle data key")


  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public BundleDataProp value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Bundle data value
   * @return value
  */
  @ApiModelProperty(value = "Bundle data value")


  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BundleDataProp bundleDataProp = (BundleDataProp) o;
    return Objects.equals(this.key, bundleDataProp.key) &&
        Objects.equals(this.value, bundleDataProp.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BundleDataProp {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

