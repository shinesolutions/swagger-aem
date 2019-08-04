package apimodels;

import apimodels.InstallStatusStatus;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * InstallStatus
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-04T23:41:35.248Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class InstallStatus   {
  @JsonProperty("status")
  private InstallStatusStatus status = null;

  public InstallStatus status(InstallStatusStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Valid
  public InstallStatusStatus getStatus() {
    return status;
  }

  public void setStatus(InstallStatusStatus status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstallStatus installStatus = (InstallStatus) o;
    return Objects.equals(status, installStatus.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

