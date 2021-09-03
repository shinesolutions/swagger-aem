package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.BundleDataProp;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;



@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2021-09-03T15:26:06.461+10:00[Australia/Melbourne]")public class BundleData   {
  
  private @Valid Integer id;
  private @Valid String name;
  private @Valid Boolean fragment;
  private @Valid Integer stateRaw;
  private @Valid String state;
  private @Valid String version;
  private @Valid String symbolicName;
  private @Valid String category;
  private @Valid List<BundleDataProp> props = new ArrayList<BundleDataProp>();

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

