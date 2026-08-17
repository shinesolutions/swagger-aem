package org.openapitools.model;

import org.openapitools.model.BundleDataProp;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class BundleData implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Bundle ID
   */
  @JsonProperty("id")
  private Integer id;

  /**
   * Bundle name
   */
  @JsonProperty("name")
  private String name;

  /**
   * Is bundle a fragment
   */
  @JsonProperty("fragment")
  private Boolean fragment;

  /**
   * Numeric raw bundle state value
   */
  @JsonProperty("stateRaw")
  private Integer stateRaw;

  /**
   * Bundle state value
   */
  @JsonProperty("state")
  private String state;

  /**
   * Bundle version
   */
  @JsonProperty("version")
  private String version;

  /**
   * Bundle symbolic name
   */
  @JsonProperty("symbolicName")
  private String symbolicName;

  /**
   * Bundle category
   */
  @JsonProperty("category")
  private String category;

  @JsonProperty("props")
  private List<BundleDataProp> props = new ArrayList<>();

  /**
   * Bundle ID
   * @return id
   */
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * Bundle name
   * @return name
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * Is bundle a fragment
   * @return fragment
   */
  public Boolean getFragment() {
    return fragment;
  }

  public void setFragment(Boolean fragment) {
    this.fragment = fragment;
  }

  /**
   * Numeric raw bundle state value
   * @return stateRaw
   */
  public Integer getStateRaw() {
    return stateRaw;
  }

  public void setStateRaw(Integer stateRaw) {
    this.stateRaw = stateRaw;
  }

  /**
   * Bundle state value
   * @return state
   */
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  /**
   * Bundle version
   * @return version
   */
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  /**
   * Bundle symbolic name
   * @return symbolicName
   */
  public String getSymbolicName() {
    return symbolicName;
  }

  public void setSymbolicName(String symbolicName) {
    this.symbolicName = symbolicName;
  }

  /**
   * Bundle category
   * @return category
   */
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  /**
   * 
   * @return props
   */
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
