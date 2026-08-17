package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.TruststoreItems;

@Canonical
class TruststoreInfo {
    
    List<TruststoreItems> aliases = new ArrayList<>()
    /* False if truststore don't exist */
    Boolean exists
}
