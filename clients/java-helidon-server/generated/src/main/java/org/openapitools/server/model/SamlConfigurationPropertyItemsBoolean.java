package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class SamlConfigurationPropertyItemsBoolean   {

    private String name;
    private Boolean optional;
    private Boolean isSet;
    private Integer type;
    private Boolean value;
    private String description;

    /**
     * Default constructor.
     */
    public SamlConfigurationPropertyItemsBoolean() {
    // JSON-B / Jackson
    }

    /**
     * Create SamlConfigurationPropertyItemsBoolean.
     *
     * @param name property name
     * @param optional True if optional
     * @param isSet True if property is set
     * @param type Property type, 1&#x3D;String, 3&#x3D;long, 11&#x3D;boolean, 12&#x3D;Password
     * @param value Property value
     * @param description Property description
     */
    public SamlConfigurationPropertyItemsBoolean(
        String name, 
        Boolean optional, 
        Boolean isSet, 
        Integer type, 
        Boolean value, 
        String description
    ) {
        this.name = name;
        this.optional = optional;
        this.isSet = isSet;
        this.type = type;
        this.value = value;
        this.description = description;
    }



    /**
     * property name
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * True if optional
     * @return optional
     */
    public Boolean getOptional() {
        return optional;
    }

    public void setOptional(Boolean optional) {
        this.optional = optional;
    }

    /**
     * True if property is set
     * @return isSet
     */
    public Boolean getIsSet() {
        return isSet;
    }

    public void setIsSet(Boolean isSet) {
        this.isSet = isSet;
    }

    /**
     * Property type, 1=String, 3=long, 11=boolean, 12=Password
     * @return type
     */
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * Property value
     * @return value
     */
    public Boolean getValue() {
        return value;
    }

    public void setValue(Boolean value) {
        this.value = value;
    }

    /**
     * Property description
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SamlConfigurationPropertyItemsBoolean {\n");
        
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    optional: ").append(toIndentedString(optional)).append("\n");
        sb.append("    isSet: ").append(toIndentedString(isSet)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

