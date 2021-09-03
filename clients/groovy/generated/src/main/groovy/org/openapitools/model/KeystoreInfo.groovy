package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.KeystoreItems;

@Canonical
class KeystoreInfo {
    
    List<KeystoreItems> aliases = new ArrayList<KeystoreItems>()
    /* False if truststore don't exist */
    Boolean exists
}
