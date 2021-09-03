package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.server.api.model.BundleData;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BundleInfo   {
  
  private String status;
  private List<Integer> s = new ArrayList<>();
  private List<BundleData> data = new ArrayList<>();

  public BundleInfo () {

  }

  public BundleInfo (String status, List<Integer> s, List<BundleData> data) {
    this.status = status;
    this.s = s;
    this.data = data;
  }

    
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

    
  @JsonProperty("s")
  public List<Integer> getS() {
    return s;
  }
  public void setS(List<Integer> s) {
    this.s = s;
  }

    
  @JsonProperty("data")
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
    return Objects.equals(status, bundleInfo.status) &&
        Objects.equals(s, bundleInfo.s) &&
        Objects.equals(data, bundleInfo.data);
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
