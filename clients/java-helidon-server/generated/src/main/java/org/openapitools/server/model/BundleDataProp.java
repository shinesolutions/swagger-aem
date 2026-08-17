package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class BundleDataProp   {

    private String key;
    private String value;

    /**
     * Default constructor.
     */
    public BundleDataProp() {
    // JSON-B / Jackson
    }

    /**
     * Create BundleDataProp.
     *
     * @param key Bundle data key
     * @param value Bundle data value
     */
    public BundleDataProp(
        String key, 
        String value
    ) {
        this.key = key;
        this.value = value;
    }



    /**
     * Bundle data key
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * Bundle data value
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BundleDataProp {\n");
        
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

