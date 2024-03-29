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

export class KeystoreChainItems {
    /**
    * e.g. \"CN=localhost\"
    */
    'subject'?: string;
    /**
    * e.g. \"CN=Admin\"
    */
    'issuer'?: string;
    /**
    * e.g. \"Sun Jul 01 12:00:00 AEST 2018\"
    */
    'notBefore'?: string;
    /**
    * e.g. \"Sun Jun 30 23:59:50 AEST 2019\"
    */
    'notAfter'?: string;
    /**
    * 18165099476682912368
    */
    'serialNumber'?: number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "subject",
            "baseName": "subject",
            "type": "string"
        },
        {
            "name": "issuer",
            "baseName": "issuer",
            "type": "string"
        },
        {
            "name": "notBefore",
            "baseName": "notBefore",
            "type": "string"
        },
        {
            "name": "notAfter",
            "baseName": "notAfter",
            "type": "string"
        },
        {
            "name": "serialNumber",
            "baseName": "serialNumber",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return KeystoreChainItems.attributeTypeMap;
    }
}

