package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class InstallStatusStatus   {

    private Boolean finished;
    private Integer itemCount;

    /**
     * Default constructor.
     */
    public InstallStatusStatus() {
    // JSON-B / Jackson
    }

    /**
     * Create InstallStatusStatus.
     *
     * @param finished finished
     * @param itemCount itemCount
     */
    public InstallStatusStatus(
        Boolean finished, 
        Integer itemCount
    ) {
        this.finished = finished;
        this.itemCount = itemCount;
    }



    /**
     * Get finished
     * @return finished
     */
    public Boolean getFinished() {
        return finished;
    }

    public void setFinished(Boolean finished) {
        this.finished = finished;
    }

    /**
     * Get itemCount
     * @return itemCount
     */
    public Integer getItemCount() {
        return itemCount;
    }

    public void setItemCount(Integer itemCount) {
        this.itemCount = itemCount;
    }

    /**
      * Create a string representation of this pojo.
    **/
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

