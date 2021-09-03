package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.BundleDataProp;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2021-09-03T15:25:18.608+10:00[Australia/Melbourne]")
public class BundleData   {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("fragment")
  private Boolean fragment;

  @JsonProperty("stateRaw")
  private Integer stateRaw;

  @JsonProperty("state")
  private String state;

  @JsonProperty("version")
  private String version;

  @JsonProperty("symbolicName")
  private String symbolicName;

  @JsonProperty("category")
  private String category;

  @JsonProperty("props")
  private List<BundleDataProp> props = null;

  /**
   * Bundle ID
   **/
  public BundleData id(Integer id) {
    this.id = id;
    return this;
  }

  
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
  public BundleData name(String name) {
    this.name = name;
    return this;
  }

  
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
  public BundleData fragment(Boolean fragment) {
    this.fragment = fragment;
    return this;
  }

  
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
  public BundleData stateRaw(Integer stateRaw) {
    this.stateRaw = stateRaw;
    return this;
  }

  
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
  public BundleData state(String state) {
    this.state = state;
    return this;
  }

  
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
  public BundleData version(String version) {
    this.version = version;
    return this;
  }

  
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
  public BundleData symbolicName(String symbolicName) {
    this.symbolicName = symbolicName;
    return this;
  }

  
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
  public BundleData category(String category) {
    this.category = category;
    return this;
  }

  
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
  public BundleData props(List<BundleDataProp> props) {
    this.props = props;
    return this;
  }

  
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

