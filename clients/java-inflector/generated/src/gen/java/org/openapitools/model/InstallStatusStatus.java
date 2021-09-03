package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2021-09-03T15:25:18.608+10:00[Australia/Melbourne]")
public class InstallStatusStatus   {
  @JsonProperty("finished")
  private Boolean finished;

  @JsonProperty("itemCount")
  private Integer itemCount;

  /**
   **/
  public InstallStatusStatus finished(Boolean finished) {
    this.finished = finished;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("finished")
  public Boolean getFinished() {
    return finished;
  }
  public void setFinished(Boolean finished) {
    this.finished = finished;
  }

  /**
   **/
  public InstallStatusStatus itemCount(Integer itemCount) {
    this.itemCount = itemCount;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("itemCount")
  public Integer getItemCount() {
    return itemCount;
  }
  public void setItemCount(Integer itemCount) {
    this.itemCount = itemCount;
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
    return Objects.equals(finished, installStatusStatus.finished) &&
        Objects.equals(itemCount, installStatusStatus.itemCount);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

