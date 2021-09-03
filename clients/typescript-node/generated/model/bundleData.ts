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

import { RequestFile } from './models';
import { BundleDataProp } from './bundleDataProp';

export class BundleData {
    /**
    * Bundle ID
    */
    'id'?: number;
    /**
    * Bundle name
    */
    'name'?: string;
    /**
    * Is bundle a fragment
    */
    'fragment'?: boolean;
    /**
    * Numeric raw bundle state value
    */
    'stateRaw'?: number;
    /**
    * Bundle state value
    */
    'state'?: string;
    /**
    * Bundle version
    */
    'version'?: string;
    /**
    * Bundle symbolic name
    */
    'symbolicName'?: string;
    /**
    * Bundle category
    */
    'category'?: string;
    'props'?: Array<BundleDataProp>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "id",
            "baseName": "id",
            "type": "number"
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string"
        },
        {
            "name": "fragment",
            "baseName": "fragment",
            "type": "boolean"
        },
        {
            "name": "stateRaw",
            "baseName": "stateRaw",
            "type": "number"
        },
        {
            "name": "state",
            "baseName": "state",
            "type": "string"
        },
        {
            "name": "version",
            "baseName": "version",
            "type": "string"
        },
        {
            "name": "symbolicName",
            "baseName": "symbolicName",
            "type": "string"
        },
        {
            "name": "category",
            "baseName": "category",
            "type": "string"
        },
        {
            "name": "props",
            "baseName": "props",
            "type": "Array<BundleDataProp>"
        }    ];

    static getAttributeTypeMap() {
        return BundleData.attributeTypeMap;
    }
}
