package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.BundleDataProp;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2021-09-03T15:25:57.989+10:00[Australia/Melbourne]")
public class BundleData   {
  
  private Integer id;
  private String name;
  private Boolean fragment;
  private Integer stateRaw;
  private String state;
  private String version;
  private String symbolicName;
  private String category;
  private List<BundleDataProp> props = new ArrayList<BundleDataProp>();

  /**
   * Bundle ID
   **/
  
  @ApiModelProperty(value = "Bundle ID")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * Bundle name
   **/
  
  @ApiModelProperty(value = "Bundle name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Is bundle a fragment
   **/
  
  @ApiModelProperty(value = "Is bundle a fragment")
  @JsonProperty("fragment")
  public Boolean getFragment() {
    return fragment;
  }
  public void setFragment(Boolean fragment) {
    this.fragment = fragment;
  }

  /**
   * Numeric raw bundle state value
   **/
  
  @ApiModelProperty(value = "Numeric raw bundle state value")
  @JsonProperty("stateRaw")
  public Integer getStateRaw() {
    return stateRaw;
  }
  public void setStateRaw(Integer stateRaw) {
    this.stateRaw = stateRaw;
  }

  /**
   * Bundle state value
   **/
  
  @ApiModelProperty(value = "Bundle state value")
  @JsonProperty("state")
  public String getState() {
    return state;
  }
  public void setState(String state) {
    this.state = state;
  }

  /**
   * Bundle version
   **/
  
  @ApiModelProperty(value = "Bundle version")
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }
  public void setVersion(String version) {
    this.version = version;
  }

  /**
   * Bundle symbolic name
   **/
  
  @ApiModelProperty(value = "Bundle symbolic name")
  @JsonProperty("symbolicName")
  public String getSymbolicName() {
    return symbolicName;
  }
  public void setSymbolicName(String symbolicName) {
    this.symbolicName = symbolicName;
  }

  /**
   * Bundle category
   **/
  
  @ApiModelProperty(value = "Bundle category")
  @JsonProperty("category")
  public String getCategory() {
    return category;
  }
  public void setCategory(String category) {
    this.category = category;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("props")
  public List<BundleDataProp> getProps() {
    return props;
  }
  public void setProps(List<BundleDataProp> props) {
    this.props = props;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BundleData bundleData = (BundleData) o;
    return Objects.equals(id, bundleData.id) &&
        Objects.equals(name, bundleData.name) &&
        Objects.equals(fragment, bundleData.fragment) &&
        Objects.equals(stateRaw, bundleData.stateRaw) &&
        Objects.equals(state, bundleData.state) &&
        Objects.equals(version, bundleData.version) &&
        Objects.equals(symbolicName, bundleData.symbolicName) &&
        Objects.equals(category, bundleData.category) &&
        Objects.equals(props, bundleData.props);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, fragment, stateRaw, state, version, symbolicName, category, props);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BundleData {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    fragment: ").append(toIndentedString(fragment)).append("\n");
    sb.append("    stateRaw: ").append(toIndentedString(stateRaw)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    symbolicName: ").append(toIndentedString(symbolicName)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    props: ").append(toIndentedString(props)).append("\n");
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

