package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.BundleData;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class BundleInfo   {

    private String status;
    private List<Integer> s = new ArrayList<>();
    private List<@Valid BundleData> data = new ArrayList<>();

    /**
     * Default constructor.
     */
    public BundleInfo() {
    // JSON-B / Jackson
    }

    /**
     * Create BundleInfo.
     *
     * @param status Status description of all bundles
     * @param s s
     * @param data data
     */
    public BundleInfo(
        String status, 
        List<Integer> s, 
        List<@Valid BundleData> data
    ) {
        this.status = status;
        this.s = s;
        this.data = data;
    }



    /**
     * Status description of all bundles
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Get s
     * @return s
     */
    public List<Integer> getS() {
        return s;
    }

    public void setS(List<Integer> s) {
        this.s = s;
    }

    /**
     * Get data
     * @return data
     */
    public List<@Valid BundleData> getData() {
        return data;
    }

    public void setData(List<@Valid BundleData> data) {
        this.data = data;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BundleInfo {\n");
        
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    s: ").append(toIndentedString(s)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

