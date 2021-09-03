package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.BundleDataProp;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BundleData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-03T15:28:35.636+10:00[Australia/Melbourne]")
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
  @Valid
  private List<BundleDataProp> props = null;

  public BundleData id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Bundle ID
   * @return id
  */
  @ApiModelProperty(value = "Bundle ID")


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public BundleData name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Bundle name
   * @return name
  */
  @ApiModelProperty(value = "Bundle name")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BundleData fragment(Boolean fragment) {
    this.fragment = fragment;
    return this;
  }

  /**
   * Is bundle a fragment
   * @return fragment
  */
  @ApiModelProperty(value = "Is bundle a fragment")


  public Boolean getFragment() {
    return fragment;
  }

  public void setFragment(Boolean fragment) {
    this.fragment = fragment;
  }

  public BundleData stateRaw(Integer stateRaw) {
    this.stateRaw = stateRaw;
    return this;
  }

  /**
   * Numeric raw bundle state value
   * @return stateRaw
  */
  @ApiModelProperty(value = "Numeric raw bundle state value")


  public Integer getStateRaw() {
    return stateRaw;
  }

  public void setStateRaw(Integer stateRaw) {
    this.stateRaw = stateRaw;
  }

  public BundleData state(String state) {
    this.state = state;
    return this;
  }

  /**
   * Bundle state value
   * @return state
  */
  @ApiModelProperty(value = "Bundle state value")


  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public BundleData version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Bundle version
   * @return version
  */
  @ApiModelProperty(value = "Bundle version")


  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public BundleData symbolicName(String symbolicName) {
    this.symbolicName = symbolicName;
    return this;
  }

  /**
   * Bundle symbolic name
   * @return symbolicName
  */
  @ApiModelProperty(value = "Bundle symbolic name")


  public String getSymbolicName() {
    return symbolicName;
  }

  public void setSymbolicName(String symbolicName) {
    this.symbolicName = symbolicName;
  }

  public BundleData category(String category) {
    this.category = category;
    return this;
  }

  /**
   * Bundle category
   * @return category
  */
  @ApiModelProperty(value = "Bundle category")


  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public BundleData props(List<BundleDataProp> props) {
    this.props = props;
    return this;
  }

  public BundleData addPropsItem(BundleDataProp propsItem) {
    if (this.props == null) {
      this.props = new ArrayList<>();
    }
    this.props.add(propsItem);
    return this;
  }

  /**
   * Get props
   * @return props
  */
  @ApiModelProperty(value = "")

  @Valid

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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

