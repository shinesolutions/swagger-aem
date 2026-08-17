package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * InstallStatusStatus
 */

@JsonTypeName("InstallStatus_status")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-17T07:15:54.600438135Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class InstallStatusStatus {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Boolean finished;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer itemCount;

  public InstallStatusStatus finished(@Nullable Boolean finished) {
    this.finished = finished;
    return this;
  }

  /**
   * Get finished
   * @return finished
   */
  
  @Schema(name = "finished", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("finished")
  public @Nullable Boolean getFinished() {
    return finished;
  }

  @JsonProperty("finished")
  public void setFinished(@Nullable Boolean finished) {
    this.finished = finished;
  }

  public InstallStatusStatus itemCount(@Nullable Integer itemCount) {
    this.itemCount = itemCount;
    return this;
  }

  /**
   * Get itemCount
   * @return itemCount
   */
  
  @Schema(name = "itemCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("itemCount")
  public @Nullable Integer getItemCount() {
    return itemCount;
  }

  @JsonProperty("itemCount")
  public void setItemCount(@Nullable Integer itemCount) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

