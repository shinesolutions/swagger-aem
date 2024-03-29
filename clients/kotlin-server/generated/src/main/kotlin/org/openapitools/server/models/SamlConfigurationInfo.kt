/**
* Adobe Experience Manager (AEM) API
* Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API
*
* The version of the OpenAPI document: 3.5.0-pre.0
* Contact: opensource@shinesolutions.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.server.models

import org.openapitools.server.models.SamlConfigurationProperties

/**
 * 
 * @param pid Persistent Identity (PID)
 * @param title Title
 * @param description Title
 * @param bundleLocation needed for configuration binding
 * @param serviceLocation needed for configuraiton binding
 * @param properties 
 */
data class SamlConfigurationInfo(
    /* Persistent Identity (PID) */
    val pid: kotlin.String? = null,
    /* Title */
    val title: kotlin.String? = null,
    /* Title */
    val description: kotlin.String? = null,
    /* needed for configuration binding */
    val bundleLocation: kotlin.String? = null,
    /* needed for configuraiton binding */
    val serviceLocation: kotlin.String? = null,
    val properties: SamlConfigurationProperties? = null
) 

