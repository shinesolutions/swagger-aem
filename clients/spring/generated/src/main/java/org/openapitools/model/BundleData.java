package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.BundleDataProp;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * BundleData
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-17T02:18:23.350215970Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class BundleData {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer id;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String name;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Boolean fragment;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer stateRaw;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String state;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String version;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String symbolicName;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String category;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<@Valid BundleDataProp> props = new ArrayList<>();

  public BundleData id(@Nullable Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Bundle ID
   * @return id
   */
  
  @Schema(name = "id", description = "Bundle ID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable Integer getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(@Nullable Integer id) {
    this.id = id;
  }

  public BundleData name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Bundle name
   * @return name
   */
  
  @Schema(name = "name", description = "Bundle name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(@Nullable String name) {
    this.name = name;
  }

  public BundleData fragment(@Nullable Boolean fragment) {
    this.fragment = fragment;
    return this;
  }

  /**
   * Is bundle a fragment
   * @return fragment
   */
  
  @Schema(name = "fragment", description = "Is bundle a fragment", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fragment")
  public @Nullable Boolean getFragment() {
    return fragment;
  }

  @JsonProperty("fragment")
  public void setFragment(@Nullable Boolean fragment) {
    this.fragment = fragment;
  }

  public BundleData stateRaw(@Nullable Integer stateRaw) {
    this.stateRaw = stateRaw;
    return this;
  }

  /**
   * Numeric raw bundle state value
   * @return stateRaw
   */
  
  @Schema(name = "stateRaw", description = "Numeric raw bundle state value", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("stateRaw")
  public @Nullable Integer getStateRaw() {
    return stateRaw;
  }

  @JsonProperty("stateRaw")
  public void setStateRaw(@Nullable Integer stateRaw) {
    this.stateRaw = stateRaw;
  }

  public BundleData state(@Nullable String state) {
    this.state = state;
    return this;
  }

  /**
   * Bundle state value
   * @return state
   */
  
  @Schema(name = "state", description = "Bundle state value", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("state")
  public @Nullable String getState() {
    return state;
  }

  @JsonProperty("state")
  public void setState(@Nullable String state) {
    this.state = state;
  }

  public BundleData version(@Nullable String version) {
    this.version = version;
    return this;
  }

  /**
   * Bundle version
   * @return version
   */
  
  @Schema(name = "version", description = "Bundle version", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("version")
  public @Nullable String getVersion() {
    return version;
  }

  @JsonProperty("version")
  public void setVersion(@Nullable String version) {
    this.version = version;
  }

  public BundleData symbolicName(@Nullable String symbolicName) {
    this.symbolicName = symbolicName;
    return this;
  }

  /**
   * Bundle symbolic name
   * @return symbolicName
   */
  
  @Schema(name = "symbolicName", description = "Bundle symbolic name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("symbolicName")
  public @Nullable String getSymbolicName() {
    return symbolicName;
  }

  @JsonProperty("symbolicName")
  public void setSymbolicName(@Nullable String symbolicName) {
    this.symbolicName = symbolicName;
  }

  public BundleData category(@Nullable String category) {
    this.category = category;
    return this;
  }

  /**
   * Bundle category
   * @return category
   */
  
  @Schema(name = "category", description = "Bundle category", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("category")
  public @Nullable String getCategory() {
    return category;
  }

  @JsonProperty("category")
  public void setCategory(@Nullable String category) {
    this.category = category;
  }

  public BundleData props(List<@Valid BundleDataProp> props) {
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
  @Valid 
  @Schema(name = "props", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("props")
  public List<@Valid BundleDataProp> getProps() {
    return props;
  }

  @JsonProperty("props")
  public void setProps(List<@Valid BundleDataProp> props) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

