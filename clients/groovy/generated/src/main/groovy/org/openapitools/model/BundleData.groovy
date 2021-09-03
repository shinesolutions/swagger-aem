package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.BundleDataProp;

@Canonical
class BundleData {
    /* Bundle ID */
    Integer id
    /* Bundle name */
    String name
    /* Is bundle a fragment */
    Boolean fragment
    /* Numeric raw bundle state value */
    Integer stateRaw
    /* Bundle state value */
    String state
    /* Bundle version */
    String version
    /* Bundle symbolic name */
    String symbolicName
    /* Bundle category */
    String category
    
    List<BundleDataProp> props = new ArrayList<BundleDataProp>()
}
