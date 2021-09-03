/* tslint:disable */
/* eslint-disable */
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

import { exists, mapValues } from '../runtime';
/**
 * 
 * @export
 * @interface KeystoreChainItems
 */
export interface KeystoreChainItems {
    /**
     * e.g. "CN=localhost"
     * @type {string}
     * @memberof KeystoreChainItems
     */
    subject?: string;
    /**
     * e.g. "CN=Admin"
     * @type {string}
     * @memberof KeystoreChainItems
     */
    issuer?: string;
    /**
     * e.g. "Sun Jul 01 12:00:00 AEST 2018"
     * @type {string}
     * @memberof KeystoreChainItems
     */
    notBefore?: string;
    /**
     * e.g. "Sun Jun 30 23:59:50 AEST 2019"
     * @type {string}
     * @memberof KeystoreChainItems
     */
    notAfter?: string;
    /**
     * 18165099476682912368
     * @type {number}
     * @memberof KeystoreChainItems
     */
    serialNumber?: number;
}

export function KeystoreChainItemsFromJSON(json: any): KeystoreChainItems {
    return KeystoreChainItemsFromJSONTyped(json, false);
}

export function KeystoreChainItemsFromJSONTyped(json: any, ignoreDiscriminator: boolean): KeystoreChainItems {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'subject': !exists(json, 'subject') ? undefined : json['subject'],
        'issuer': !exists(json, 'issuer') ? undefined : json['issuer'],
        'notBefore': !exists(json, 'notBefore') ? undefined : json['notBefore'],
        'notAfter': !exists(json, 'notAfter') ? undefined : json['notAfter'],
        'serialNumber': !exists(json, 'serialNumber') ? undefined : json['serialNumber'],
    };
}

export function KeystoreChainItemsToJSON(value?: KeystoreChainItems | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'subject': value.subject,
        'issuer': value.issuer,
        'notBefore': value.notBefore,
        'notAfter': value.notAfter,
        'serialNumber': value.serialNumber,
    };
}

