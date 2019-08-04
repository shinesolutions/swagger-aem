package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class SamlConfigurationPropertyItemsString {
    /* property name */
    String name = null

    /* True if optional */
    Boolean optional = null

    /* True if property is set */
    Boolean isSet = null

    /* Property type, 1=String, 3=long, 11=boolean, 12=Password */
    Integer type = null

    /* Property value */
    String value = null

    /* Property description */
    String description = null

}
