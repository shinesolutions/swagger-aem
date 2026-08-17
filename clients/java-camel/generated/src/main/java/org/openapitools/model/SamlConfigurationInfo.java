package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.SamlConfigurationProperties;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * SamlConfigurationInfo
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-17T02:15:24.608132956Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class SamlConfigurationInfo {

  private String pid;

  private String title;

  private String description;

  private String bundleLocation;

  private String serviceLocation;

  private SamlConfigurationProperties properties;

  public SamlConfigurationInfo pid(String pid) {
    this.pid = pid;
    return this;
  }

  /**
   * Persistent Identity (PID)
   * @return pid
   */
  
  @Schema(name = "pid", description = "Persistent Identity (PID)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pid")
  public String getPid() {
    return pid;
  }

  public void setPid(String pid) {
    this.pid = pid;
  }

  public SamlConfigurationInfo title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Title
   * @return title
   */
  
  @Schema(name = "title", description = "Title", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public SamlConfigurationInfo description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Title
   * @return description
   */
  
  @Schema(name = "description", description = "Title", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public SamlConfigurationInfo bundleLocation(String bundleLocation) {
    this.bundleLocation = bundleLocation;
    return this;
  }

  /**
   * needed for configuration binding
   * @return bundleLocation
   */
  
  @Schema(name = "bundle_location", description = "needed for configuration binding", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bundle_location")
  public String getBundleLocation() {
    return bundleLocation;
  }

  public void setBundleLocation(String bundleLocation) {
    this.bundleLocation = bundleLocation;
  }

  public SamlConfigurationInfo serviceLocation(String serviceLocation) {
    this.serviceLocation = serviceLocation;
    return this;
  }

  /**
   * needed for configuraiton binding
   * @return serviceLocation
   */
  
  @Schema(name = "service_location", description = "needed for configuraiton binding", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("service_location")
  public String getServiceLocation() {
    return serviceLocation;
  }

  public void setServiceLocation(String serviceLocation) {
    this.serviceLocation = serviceLocation;
  }

  public SamlConfigurationInfo properties(SamlConfigurationProperties properties) {
    this.properties = properties;
    return this;
  }

  /**
   * Get properties
   * @return properties
   */
  @Valid 
  @Schema(name = "properties", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("properties")
  public SamlConfigurationProperties getProperties() {
    return properties;
  }

  public void setProperties(SamlConfigurationProperties properties) {
    this.properties = properties;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

