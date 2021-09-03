package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.BundleData;

@Canonical
class BundleInfo {
    /* Status description of all bundles */
    String status
    
    List<Integer> s = new ArrayList<Integer>()
    
    List<BundleData> data = new ArrayList<BundleData>()
}
