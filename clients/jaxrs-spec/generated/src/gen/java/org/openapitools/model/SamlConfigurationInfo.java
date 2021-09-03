package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.SamlConfigurationProperties;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;



@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2021-09-03T15:26:06.461+10:00[Australia/Melbourne]")public class SamlConfigurationInfo   {
  
  private @Valid String pid;
  private @Valid String title;
  private @Valid String description;
  private @Valid String bundleLocation;
  private @Valid String serviceLocation;
  private @Valid SamlConfigurationProperties properties;

  /**
   * Persistent Identity (PID)
   **/
  public SamlConfigurationInfo pid(String pid) {
    this.pid = pid;
    return this;
  }

  

  
  @ApiModelProperty(value = "Persistent Identity (PID)")
  @JsonProperty("pid")
  public String getPid() {
    return pid;
  }

  public void setPid(String pid) {
    this.pid = pid;
  }

/**
   * Title
   **/
  public SamlConfigurationInfo title(String title) {
    this.title = title;
    return this;
  }

  

  
  @ApiModelProperty(value = "Title")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

/**
   * Title
   **/
  public SamlConfigurationInfo description(String description) {
    this.description = description;
    return this;
  }

  

  
  @ApiModelProperty(value = "Title")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

/**
   * needed for configuration binding
   **/
  public SamlConfigurationInfo bundleLocation(String bundleLocation) {
    this.bundleLocation = bundleLocation;
    return this;
  }

  

  
  @ApiModelProperty(value = "needed for configuration binding")
  @JsonProperty("bundle_location")
  public String getBundleLocation() {
    return bundleLocation;
  }

  public void setBundleLocation(String bundleLocation) {
    this.bundleLocation = bundleLocation;
  }

/**
   * needed for configuraiton binding
   **/
  public SamlConfigurationInfo serviceLocation(String serviceLocation) {
    this.serviceLocation = serviceLocation;
    return this;
  }

  

  
  @ApiModelProperty(value = "needed for configuraiton binding")
  @JsonProperty("service_location")
  public String getServiceLocation() {
    return serviceLocation;
  }

  public void setServiceLocation(String serviceLocation) {
    this.serviceLocation = serviceLocation;
  }

/**
   **/
  public SamlConfigurationInfo properties(SamlConfigurationProperties properties) {
    this.properties = properties;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

