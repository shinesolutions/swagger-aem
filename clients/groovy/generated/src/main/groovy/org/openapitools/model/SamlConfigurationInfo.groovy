package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.SamlConfigurationProperties;

@Canonical
class SamlConfigurationInfo {
    /* Persistent Identity (PID) */
    String pid
    /* Title */
    String title
    /* Title */
    String description
    /* needed for configuration binding */
    String bundleLocation
    /* needed for configuraiton binding */
    String serviceLocation
    
    SamlConfigurationProperties properties
}
