package org.openapitools.model;

import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.BundleData;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class BundleInfo  {
  
  @ApiModelProperty(value = "Status description of all bundles")
 /**
   * Status description of all bundles
  **/
  private String status;

  @ApiModelProperty(value = "")
  private List<Integer> s = null;

  @ApiModelProperty(value = "")
  private List<BundleData> data = null;
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

