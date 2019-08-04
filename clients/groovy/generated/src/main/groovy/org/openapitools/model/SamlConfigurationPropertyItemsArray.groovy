package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

@Canonical
class SamlConfigurationPropertyItemsArray {
    /* property name */
    String name = null

    /* True if optional */
    Boolean optional = null

    /* True if property is set */
    Boolean isSet = null

    /* Property type, 1=String, 3=long, 11=boolean, 12=Password */
    Integer type = null

    /* Property value */
    List<String> values = new ArrayList<String>()

    /* Property description */
    String description = null

}
