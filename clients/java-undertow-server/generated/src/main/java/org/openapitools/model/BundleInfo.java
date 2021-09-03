/*
 * Adobe Experience Manager (AEM) API
 *
 * Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API
 *
 * OpenAPI document version: 3.5.0-pre.0
 * Maintained by: opensource@shinesolutions.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.BundleData;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2021-09-03T15:25:36.220+10:00[Australia/Melbourne]")
public class BundleInfo   {
  
  private String status;
  private List<Integer> s = new ArrayList<Integer>();
  private List<BundleData> data = new ArrayList<BundleData>();

  /**
   * Status description of all bundles
   */
  public BundleInfo status(String status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(value = "Status description of all bundles")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   */
  public BundleInfo s(List<Integer> s) {
    this.s = s;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("s")
  public List<Integer> getS() {
    return s;
  }
  public void setS(List<Integer> s) {
    this.s = s;
  }

  /**
   */
  public BundleInfo data(List<BundleData> data) {
    this.data = data;
    return this;
  }

  
  @ApiModelProperty(value = "")
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

