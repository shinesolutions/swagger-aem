package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.BundleData;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class BundleInfo  {
  
 /**
  * Status description of all bundles
  */
  @ApiModelProperty(value = "Status description of all bundles")

  private String status;

  @ApiModelProperty(value = "")

  private List<Integer> s = new ArrayList<>();

  @ApiModelProperty(value = "")

  private List<BundleData> data = new ArrayList<>();
 /**
   * Status description of all bundles
   * @return status
  **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public BundleInfo status(String status) {
    this.status = status;
    return this;
  }

 /**
   * Get s
   * @return s
  **/
  @JsonProperty("s")
  public List<Integer> getS() {
    return s;
  }

  public void setS(List<Integer> s) {
    this.s = s;
  }

  public BundleInfo s(List<Integer> s) {
    this.s = s;
    return this;
  }

  public BundleInfo addSItem(Integer sItem) {
    this.s.add(sItem);
    return this;
  }

 /**
   * Get data
   * @return data
  **/
  @JsonProperty("data")
  public List<BundleData> getData() {
    return data;
  }

  public void setData(List<BundleData> data) {
    this.data = data;
  }

  public BundleInfo data(List<BundleData> data) {
    this.data = data;
    return this;
  }

  public BundleInfo addDataItem(BundleData dataItem) {
    this.data.add(dataItem);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

