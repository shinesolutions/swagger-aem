package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class KeystoreChainItems {
    /* e.g. \"CN=localhost\" */
    String subject = null

    /* e.g. \"CN=Admin\" */
    String issuer = null

    /* e.g. \"Sun Jul 01 12:00:00 AEST 2018\" */
    String notBefore = null

    /* e.g. \"Sun Jun 30 23:59:50 AEST 2019\" */
    String notAfter = null

    /* 18165099476682912368 */
    Integer serialNumber = null

}
