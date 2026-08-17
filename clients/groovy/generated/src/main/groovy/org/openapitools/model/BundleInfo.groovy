package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.BundleData;

@Canonical
class BundleInfo {
    /* Status description of all bundles */
    String status
    
    List<Integer> s = new ArrayList<>()
    
    List<BundleData> data = new ArrayList<>()
}
