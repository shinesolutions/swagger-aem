package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.SamlConfigurationProperties;

@Canonical
class SamlConfigurationInfo {
    /* Persistent Identity (PID) */
    String pid = null

    /* Title */
    String title = null

    /* Title */
    String description = null

    /* needed for configuration binding */
    String bundleLocation = null

    /* needed for configuraiton binding */
    String serviceLocation = null

    SamlConfigurationProperties properties = null

}
