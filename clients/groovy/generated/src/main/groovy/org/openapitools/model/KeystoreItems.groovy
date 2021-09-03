package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.KeystoreChainItems;

@Canonical
class KeystoreItems {
    /* Keystore alias name */
    String alias
    /* e.g. \"privateKey\" */
    String entryType
    /* e.g. \"RSA\" */
    String algorithm
    /* e.g. \"PKCS#8\" */
    String format
    
    List<KeystoreChainItems> chain = new ArrayList<KeystoreChainItems>()
}
