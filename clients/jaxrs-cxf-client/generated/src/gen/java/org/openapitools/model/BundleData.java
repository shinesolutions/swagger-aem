package org.openapitools.model;

import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.BundleDataProp;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class BundleData  {
  
  @ApiModelProperty(value = "Bundle ID")
 /**
   * Bundle ID
  **/
  private Integer id;

  @ApiModelProperty(value = "Bundle name")
 /**
   * Bundle name
  **/
  private String name;

  @ApiModelProperty(value = "Is bundle a fragment")
 /**
   * Is bundle a fragment
  **/
  private Boolean fragment;

  @ApiModelProperty(value = "Numeric raw bundle state value")
 /**
   * Numeric raw bundle state value
  **/
  private Integer stateRaw;

  @ApiModelProperty(value = "Bundle state value")
 /**
   * Bundle state value
  **/
  private String state;

  @ApiModelProperty(value = "Bundle version")
 /**
   * Bundle version
  **/
  private String version;

  @ApiModelProperty(value = "Bundle symbolic name")
 /**
   * Bundle symbolic name
  **/
  private String symbolicName;

  @ApiModelProperty(value = "Bundle category")
 /**
   * Bundle category
  **/
  private String category;

  @ApiModelProperty(value = "")
  private List<BundleDataProp> props = null;
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
  public List<BundleDataProp> getProps() {
    return props;
  }

  public void setProps(List<BundleDataProp> props) {
    this.props = props;
  }

  public BundleData props(List<BundleDataProp> props) {
    this.props = props;
    return this;
  }

  public BundleData addPropsItem(BundleDataProp propsItem) {
    this.props.add(propsItem);
    return this;
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

