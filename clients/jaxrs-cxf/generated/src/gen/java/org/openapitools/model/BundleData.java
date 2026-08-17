package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.BundleDataProp;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class BundleData  {
  
 /**
  * Bundle ID
  */
  @ApiModelProperty(value = "Bundle ID")

  private Integer id;

 /**
  * Bundle name
  */
  @ApiModelProperty(value = "Bundle name")

  private String name;

 /**
  * Is bundle a fragment
  */
  @ApiModelProperty(value = "Is bundle a fragment")

  private Boolean fragment;

 /**
  * Numeric raw bundle state value
  */
  @ApiModelProperty(value = "Numeric raw bundle state value")

  private Integer stateRaw;

 /**
  * Bundle state value
  */
  @ApiModelProperty(value = "Bundle state value")

  private String state;

 /**
  * Bundle version
  */
  @ApiModelProperty(value = "Bundle version")

  private String version;

 /**
  * Bundle symbolic name
  */
  @ApiModelProperty(value = "Bundle symbolic name")

  private String symbolicName;

 /**
  * Bundle category
  */
  @ApiModelProperty(value = "Bundle category")

  private String category;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid BundleDataProp> props = new ArrayList<>();
 /**
   * Bundle ID
   * @return id
  **/
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public BundleData id(Integer id) {
    this.id = id;
    return this;
  }

 /**
   * Bundle name
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BundleData name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Is bundle a fragment
   * @return fragment
  **/
  @JsonProperty("fragment")
  public Boolean getFragment() {
    return fragment;
  }

  public void setFragment(Boolean fragment) {
    this.fragment = fragment;
  }

  public BundleData fragment(Boolean fragment) {
    this.fragment = fragment;
    return this;
  }

 /**
   * Numeric raw bundle state value
   * @return stateRaw
  **/
  @JsonProperty("stateRaw")
  public Integer getStateRaw() {
    return stateRaw;
  }

  public void setStateRaw(Integer stateRaw) {
    this.stateRaw = stateRaw;
  }

  public BundleData stateRaw(Integer stateRaw) {
    this.stateRaw = stateRaw;
    return this;
  }

 /**
   * Bundle state value
   * @return state
  **/
  @JsonProperty("state")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public BundleData state(String state) {
    this.state = state;
    return this;
  }

 /**
   * Bundle version
   * @return version
  **/
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public BundleData version(String version) {
    this.version = version;
    return this;
  }

 /**
   * Bundle symbolic name
   * @return symbolicName
  **/
  @JsonProperty("symbolicName")
  public String getSymbolicName() {
    return symbolicName;
  }

  public void setSymbolicName(String symbolicName) {
    this.symbolicName = symbolicName;
  }

  public BundleData symbolicName(String symbolicName) {
    this.symbolicName = symbolicName;
    return this;
  }

 /**
   * Bundle category
   * @return category
  **/
  @JsonProperty("category")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public BundleData category(String category) {
    this.category = category;
    return this;
  }

 /**
   * Get props
   * @return props
  **/
  @JsonProperty("props")
  public List<@Valid BundleDataProp> getProps() {
    return props;
  }

  public void setProps(List<@Valid BundleDataProp> props) {
    this.props = props;
  }

  public BundleData props(List<@Valid BundleDataProp> props) {
    this.props = props;
    return this;
  }

  public BundleData addPropsItem(BundleDataProp propsItem) {
    this.props.add(propsItem);
    return this;
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
    return Objects.equals(this.id, bundleData.id) &&
        Objects.equals(this.name, bundleData.name) &&
        Objects.equals(this.fragment, bundleData.fragment) &&
        Objects.equals(this.stateRaw, bundleData.stateRaw) &&
        Objects.equals(this.state, bundleData.state) &&
        Objects.equals(this.version, bundleData.version) &&
        Objects.equals(this.symbolicName, bundleData.symbolicName) &&
        Objects.equals(this.category, bundleData.category) &&
        Objects.equals(this.props, bundleData.props);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

