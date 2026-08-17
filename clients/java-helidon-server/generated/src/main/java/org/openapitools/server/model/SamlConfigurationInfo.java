package org.openapitools.server.model;

import org.openapitools.server.model.SamlConfigurationProperties;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class SamlConfigurationInfo   {

    private String pid;
    private String title;
    private String description;
    private String bundleLocation;
    private String serviceLocation;
    private SamlConfigurationProperties properties;

    /**
     * Default constructor.
     */
    public SamlConfigurationInfo() {
    // JSON-B / Jackson
    }

    /**
     * Create SamlConfigurationInfo.
     *
     * @param pid Persistent Identity (PID)
     * @param title Title
     * @param description Title
     * @param bundleLocation needed for configuration binding
     * @param serviceLocation needed for configuraiton binding
     * @param properties properties
     */
    public SamlConfigurationInfo(
        String pid, 
        String title, 
        String description, 
        String bundleLocation, 
        String serviceLocation, 
        SamlConfigurationProperties properties
    ) {
        this.pid = pid;
        this.title = title;
        this.description = description;
        this.bundleLocation = bundleLocation;
        this.serviceLocation = serviceLocation;
        this.properties = properties;
    }



    /**
     * Persistent Identity (PID)
     * @return pid
     */
    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    /**
     * Title
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Title
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * needed for configuration binding
     * @return bundleLocation
     */
    public String getBundleLocation() {
        return bundleLocation;
    }

    public void setBundleLocation(String bundleLocation) {
        this.bundleLocation = bundleLocation;
    }

    /**
     * needed for configuraiton binding
     * @return serviceLocation
     */
    public String getServiceLocation() {
        return serviceLocation;
    }

    public void setServiceLocation(String serviceLocation) {
        this.serviceLocation = serviceLocation;
    }

    /**
     * Get properties
     * @return properties
     */
    public SamlConfigurationProperties getProperties() {
        return properties;
    }

    public void setProperties(SamlConfigurationProperties properties) {
        this.properties = properties;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SamlConfigurationInfo {\n");
        
        sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    bundleLocation: ").append(toIndentedString(bundleLocation)).append("\n");
        sb.append("    serviceLocation: ").append(toIndentedString(serviceLocation)).append("\n");
        sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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

