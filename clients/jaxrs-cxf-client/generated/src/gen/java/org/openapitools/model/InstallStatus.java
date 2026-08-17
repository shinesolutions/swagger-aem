package org.openapitools.model;

import org.openapitools.model.InstallStatusStatus;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class InstallStatus  {
  
  @ApiModelProperty(value = "")

  private InstallStatusStatus status;
 /**
   * Get status
   * @return status
  **/
  @JsonProperty("status")
  public InstallStatusStatus getStatus() {
    return status;
  }

  public void setStatus(InstallStatusStatus status) {
    this.status = status;
  }

  public InstallStatus status(InstallStatusStatus status) {
    this.status = status;
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
    InstallStatus installStatus = (InstallStatus) o;
    return Objects.equals(this.status, installStatus.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstallStatus {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

