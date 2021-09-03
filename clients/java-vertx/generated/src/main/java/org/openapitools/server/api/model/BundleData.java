package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.server.api.model.BundleDataProp;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BundleData   {
  
  private Integer id;
  private String name;
  private Boolean fragment;
  private Integer stateRaw;
  private String state;
  private String version;
  private String symbolicName;
  private String category;
  private List<BundleDataProp> props = new ArrayList<>();

  public BundleData () {

  }

  public BundleData (Integer id, String name, Boolean fragment, Integer stateRaw, String state, String version, String symbolicName, String category, List<BundleDataProp> props) {
    this.id = id;
    this.name = name;
    this.fragment = fragment;
    this.stateRaw = stateRaw;
    this.state = state;
    this.version = version;
    this.symbolicName = symbolicName;
    this.category = category;
    this.props = props;
  }

    
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("fragment")
  public Boolean getFragment() {
    return fragment;
  }
  public void setFragment(Boolean fragment) {
    this.fragment = fragment;
  }

    
  @JsonProperty("stateRaw")
  public Integer getStateRaw() {
    return stateRaw;
  }
  public void setStateRaw(Integer stateRaw) {
    this.stateRaw = stateRaw;
  }

    
  @JsonProperty("state")
  public String getState() {
    return state;
  }
  public void setState(String state) {
    this.state = state;
  }

    
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }
  public void setVersion(String version) {
    this.version = version;
  }

    
  @JsonProperty("symbolicName")
  public String getSymbolicName() {
    return symbolicName;
  }
  public void setSymbolicName(String symbolicName) {
    this.symbolicName = symbolicName;
  }

    
  @JsonProperty("category")
  public String getCategory() {
    return category;
  }
  public void setCategory(String category) {
    this.category = category;
  }

    
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
