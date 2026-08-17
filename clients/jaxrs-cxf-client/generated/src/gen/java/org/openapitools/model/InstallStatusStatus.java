package org.openapitools.model;


import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class InstallStatusStatus  {
  
  @ApiModelProperty(value = "")

  private Boolean finished;

  @ApiModelProperty(value = "")

  private Integer itemCount;
 /**
   * Get finished
   * @return finished
  **/
  @JsonProperty("finished")
  public Boolean getFinished() {
    return finished;
  }

  public void setFinished(Boolean finished) {
    this.finished = finished;
  }

  public InstallStatusStatus finished(Boolean finished) {
    this.finished = finished;
    return this;
  }

 /**
   * Get itemCount
   * @return itemCount
  **/
  @JsonProperty("itemCount")
  public Integer getItemCount() {
    return itemCount;
  }

  public void setItemCount(Integer itemCount) {
    this.itemCount = itemCount;
  }

  public InstallStatusStatus itemCount(Integer itemCount) {
    this.itemCount = itemCount;
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
    InstallStatusStatus installStatusStatus = (InstallStatusStatus) o;
    return Objects.equals(this.finished, installStatusStatus.finished) &&
        Objects.equals(this.itemCount, installStatusStatus.itemCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(finished, itemCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstallStatusStatus {\n");
    
    sb.append("    finished: ").append(toIndentedString(finished)).append("\n");
    sb.append("    itemCount: ").append(toIndentedString(itemCount)).append("\n");
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

