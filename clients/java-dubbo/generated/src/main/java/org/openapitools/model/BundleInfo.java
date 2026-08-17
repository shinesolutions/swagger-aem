package org.openapitools.model;

import org.openapitools.model.BundleData;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class BundleInfo implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Status description of all bundles
   */
  @JsonProperty("status")
  private String status;

  @JsonProperty("s")
  private List<Integer> s = new ArrayList<>();

  @JsonProperty("data")
  private List<BundleData> data = new ArrayList<>();

  /**
   * Status description of all bundles
   * @return status
   */
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * 
   * @return s
   */
  public List<Integer> getS() {
    return s;
  }

  public void setS(List<Integer> s) {
    this.s = s;
  }

  /**
   * 
   * @return data
   */
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
