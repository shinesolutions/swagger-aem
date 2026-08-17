package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.KeystoreItems;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class KeystoreInfo   {

    private List<@Valid KeystoreItems> aliases = new ArrayList<>();
    private Boolean exists;

    /**
     * Default constructor.
     */
    public KeystoreInfo() {
    // JSON-B / Jackson
    }

    /**
     * Create KeystoreInfo.
     *
     * @param aliases aliases
     * @param exists False if truststore don&#39;t exist
     */
    public KeystoreInfo(
        List<@Valid KeystoreItems> aliases, 
        Boolean exists
    ) {
        this.aliases = aliases;
        this.exists = exists;
    }



    /**
     * Get aliases
     * @return aliases
     */
    public List<@Valid KeystoreItems> getAliases() {
        return aliases;
    }

    public void setAliases(List<@Valid KeystoreItems> aliases) {
        this.aliases = aliases;
    }

    /**
     * False if truststore don't exist
     * @return exists
     */
    public Boolean getExists() {
        return exists;
    }

    public void setExists(Boolean exists) {
        this.exists = exists;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeystoreInfo {\n");
        
        sb.append("    aliases: ").append(toIndentedString(aliases)).append("\n");
        sb.append("    exists: ").append(toIndentedString(exists)).append("\n");
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

