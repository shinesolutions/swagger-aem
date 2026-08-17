package org.openapitools.server.model;

import org.openapitools.server.model.InstallStatusStatus;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class InstallStatus   {

    private InstallStatusStatus status;

    /**
     * Default constructor.
     */
    public InstallStatus() {
    // JSON-B / Jackson
    }

    /**
     * Create InstallStatus.
     *
     * @param status status
     */
    public InstallStatus(
        InstallStatusStatus status
    ) {
        this.status = status;
    }



    /**
     * Get status
     * @return status
     */
    public InstallStatusStatus getStatus() {
        return status;
    }

    public void setStatus(InstallStatusStatus status) {
        this.status = status;
    }

    /**
      * Create a string representation of this pojo.
    **/
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

