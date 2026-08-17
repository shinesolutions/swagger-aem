package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.KeystoreChainItems;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class KeystoreItems   {

    private String alias;
    private String entryType;
    private String algorithm;
    private String format;
    private List<@Valid KeystoreChainItems> chain = new ArrayList<>();

    /**
     * Default constructor.
     */
    public KeystoreItems() {
    // JSON-B / Jackson
    }

    /**
     * Create KeystoreItems.
     *
     * @param alias Keystore alias name
     * @param entryType e.g. \&quot;privateKey\&quot;
     * @param algorithm e.g. \&quot;RSA\&quot;
     * @param format e.g. \&quot;PKCS#8\&quot;
     * @param chain chain
     */
    public KeystoreItems(
        String alias, 
        String entryType, 
        String algorithm, 
        String format, 
        List<@Valid KeystoreChainItems> chain
    ) {
        this.alias = alias;
        this.entryType = entryType;
        this.algorithm = algorithm;
        this.format = format;
        this.chain = chain;
    }



    /**
     * Keystore alias name
     * @return alias
     */
    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * e.g. \"privateKey\"
     * @return entryType
     */
    public String getEntryType() {
        return entryType;
    }

    public void setEntryType(String entryType) {
        this.entryType = entryType;
    }

    /**
     * e.g. \"RSA\"
     * @return algorithm
     */
    public String getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    /**
     * e.g. \"PKCS#8\"
     * @return format
     */
    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * Get chain
     * @return chain
     */
    public List<@Valid KeystoreChainItems> getChain() {
        return chain;
    }

    public void setChain(List<@Valid KeystoreChainItems> chain) {
        this.chain = chain;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeystoreItems {\n");
        
        sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
        sb.append("    entryType: ").append(toIndentedString(entryType)).append("\n");
        sb.append("    algorithm: ").append(toIndentedString(algorithm)).append("\n");
        sb.append("    format: ").append(toIndentedString(format)).append("\n");
        sb.append("    chain: ").append(toIndentedString(chain)).append("\n");
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

