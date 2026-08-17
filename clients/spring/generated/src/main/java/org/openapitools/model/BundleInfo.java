package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.BundleData;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * BundleInfo
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-17T02:18:23.350215970Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class BundleInfo {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String status;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<Integer> s = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<@Valid BundleData> data = new ArrayList<>();

  public BundleInfo status(@Nullable String status) {
    this.status = status;
    return this;
  }

  /**
   * Status description of all bundles
   * @return status
   */
  
  @Schema(name = "status", description = "Status description of all bundles", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public @Nullable String getStatus() {
    return status;
  }

  @JsonProperty("status")
  public void setStatus(@Nullable String status) {
    this.status = status;
  }

  public BundleInfo s(List<Integer> s) {
    this.s = s;
    return this;
  }

  public BundleInfo addSItem(Integer sItem) {
    if (this.s == null) {
      this.s = new ArrayList<>();
    }
    this.s.add(sItem);
    return this;
  }

  /**
   * Get s
   * @return s
   */
  
  @Schema(name = "s", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("s")
  public List<Integer> getS() {
    return s;
  }

  @JsonProperty("s")
  public void setS(List<Integer> s) {
    this.s = s;
  }

  public BundleInfo data(List<@Valid BundleData> data) {
    this.data = data;
    return this;
  }

  public BundleInfo addDataItem(BundleData dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

  /**
   * Get data
   * @return data
   */
  @Valid 
  @Schema(name = "data", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("data")
  public List<@Valid BundleData> getData() {
    return data;
  }

  @JsonProperty("data")
  public void setData(List<@Valid BundleData> data) {
    this.data = data;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BundleInfo bundleInfo = (BundleInfo) o;
    return Objects.equals(this.status, bundleInfo.status) &&
        Objects.equals(this.s, bundleInfo.s) &&
        Objects.equals(this.data, bundleInfo.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, s, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BundleInfo {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    s: ").append(toIndentedString(s)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

