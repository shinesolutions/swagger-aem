package org.openapitools.model;

import org.openapitools.model.SamlConfigurationProperties;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SamlConfigurationInfo  {
  
 /**
  * Persistent Identity (PID)
  */
  @ApiModelProperty(value = "Persistent Identity (PID)")

  private String pid;

 /**
  * Title
  */
  @ApiModelProperty(value = "Title")

  private String title;

 /**
  * Title
  */
  @ApiModelProperty(value = "Title")

  private String description;

 /**
  * needed for configuration binding
  */
  @ApiModelProperty(value = "needed for configuration binding")

  private String bundleLocation;

 /**
  * needed for configuraiton binding
  */
  @ApiModelProperty(value = "needed for configuraiton binding")

  private String serviceLocation;

  @ApiModelProperty(value = "")

  private SamlConfigurationProperties properties;
 /**
   * Persistent Identity (PID)
   * @return pid
  **/
  @JsonProperty("pid")
  public String getPid() {
    return pid;
  }

  public void setPid(String pid) {
    this.pid = pid;
  }

  public SamlConfigurationInfo pid(String pid) {
    this.pid = pid;
    return this;
  }

 /**
   * Title
   * @return title
  **/
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public SamlConfigurationInfo title(String title) {
    this.title = title;
    return this;
  }

 /**
   * Title
   * @return description
  **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public SamlConfigurationInfo description(String description) {
    this.description = description;
    return this;
  }

 /**
   * needed for configuration binding
   * @return bundleLocation
  **/
  @JsonProperty("bundle_location")
  public String getBundleLocation() {
    return bundleLocation;
  }

  public void setBundleLocation(String bundleLocation) {
    this.bundleLocation = bundleLocation;
  }

  public SamlConfigurationInfo bundleLocation(String bundleLocation) {
    this.bundleLocation = bundleLocation;
    return this;
  }

 /**
   * needed for configuraiton binding
   * @return serviceLocation
  **/
  @JsonProperty("service_location")
  public String getServiceLocation() {
    return serviceLocation;
  }

  public void setServiceLocation(String serviceLocation) {
    this.serviceLocation = serviceLocation;
  }

  public SamlConfigurationInfo serviceLocation(String serviceLocation) {
    this.serviceLocation = serviceLocation;
    return this;
  }

 /**
   * Get properties
   * @return properties
  **/
  @JsonProperty("properties")
  public SamlConfigurationProperties getProperties() {
    return properties;
  }

  public void setProperties(SamlConfigurationProperties properties) {
    this.properties = properties;
  }

  public SamlConfigurationInfo properties(SamlConfigurationProperties properties) {
    this.properties = properties;
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
    SamlConfigurationInfo samlConfigurationInfo = (SamlConfigurationInfo) o;
    return Objects.equals(this.pid, samlConfigurationInfo.pid) &&
        Objects.equals(this.title, samlConfigurationInfo.title) &&
        Objects.equals(this.description, samlConfigurationInfo.description) &&
        Objects.equals(this.bundleLocation, samlConfigurationInfo.bundleLocation) &&
        Objects.equals(this.serviceLocation, samlConfigurationInfo.serviceLocation) &&
        Objects.equals(this.properties, samlConfigurationInfo.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pid, title, description, bundleLocation, serviceLocation, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SamlConfigurationInfo {\n");
    
    sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    bundleLocation: ").append(toIndentedString(bundleLocation)).append("\n");
    sb.append("    serviceLocation: ").append(toIndentedString(serviceLocation)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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

