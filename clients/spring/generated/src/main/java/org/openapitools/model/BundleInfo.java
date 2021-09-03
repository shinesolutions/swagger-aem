package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.BundleData;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BundleInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-03T15:28:35.636+10:00[Australia/Melbourne]")
public class BundleInfo   {
  @JsonProperty("status")
  private String status;

  @JsonProperty("s")
  @Valid
  private List<Integer> s = null;

  @JsonProperty("data")
  @Valid
  private List<BundleData> data = null;

  public BundleInfo status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Status description of all bundles
   * @return status
  */
  @ApiModelProperty(value = "Status description of all bundles")


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
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
  @ApiModelProperty(value = "")


  public List<Integer> getS() {
    return s;
  }

  public void setS(List<Integer> s) {
    this.s = s;
  }

  public BundleInfo data(List<BundleData> data) {
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
  @ApiModelProperty(value = "")

  @Valid

  public List<BundleData> getData() {
    return data;
  }

  public void setData(List<BundleData> data) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

