package apimodels;

import apimodels.BundleData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * BundleInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-17T02:15:17.717598878Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class BundleInfo   {
  @JsonProperty("status")
  
  private String status;

  @JsonProperty("s")
  
  private List<Integer> s = null;

  @JsonProperty("data")
  @Valid

  private List<@Valid BundleData> data = null;

  public BundleInfo status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Status description of all bundles
   * @return status
  **/
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
  **/
  public List<Integer> getS() {
    return s;
  }

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
  **/
  public List<@Valid BundleData> getData() {
    return data;
  }

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
    return Objects.equals(status, bundleInfo.status) &&
        Objects.equals(s, bundleInfo.s) &&
        Objects.equals(data, bundleInfo.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, s, data);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

