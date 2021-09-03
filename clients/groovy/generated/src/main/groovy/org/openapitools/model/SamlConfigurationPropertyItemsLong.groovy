package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class SamlConfigurationPropertyItemsLong {
    /* property name */
    String name
    /* True if optional */
    Boolean optional
    /* True if property is set */
    Boolean isSet
    /* Property type, 1=String, 3=long, 11=boolean, 12=Password */
    Integer type
    /* Property value */
    Integer value
    /* Property description */
    String description
}
