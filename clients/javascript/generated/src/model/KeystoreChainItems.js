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
 *
 */

import ApiClient from '../ApiClient';

/**
 * The KeystoreChainItems model module.
 * @module model/KeystoreChainItems
 * @version 0.9.0
 */
class KeystoreChainItems {
    /**
     * Constructs a new <code>KeystoreChainItems</code>.
     * @alias module:model/KeystoreChainItems
     */
    constructor() { 
        
        KeystoreChainItems.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>KeystoreChainItems</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/KeystoreChainItems} obj Optional instance to populate.
     * @return {module:model/KeystoreChainItems} The populated <code>KeystoreChainItems</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new KeystoreChainItems();

            if (data.hasOwnProperty('subject')) {
                obj['subject'] = ApiClient.convertToType(data['subject'], 'String');
            }
            if (data.hasOwnProperty('issuer')) {
                obj['issuer'] = ApiClient.convertToType(data['issuer'], 'String');
            }
            if (data.hasOwnProperty('notBefore')) {
                obj['notBefore'] = ApiClient.convertToType(data['notBefore'], 'String');
            }
            if (data.hasOwnProperty('notAfter')) {
                obj['notAfter'] = ApiClient.convertToType(data['notAfter'], 'String');
            }
            if (data.hasOwnProperty('serialNumber')) {
                obj['serialNumber'] = ApiClient.convertToType(data['serialNumber'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * e.g. \"CN=localhost\"
 * @member {String} subject
 */
KeystoreChainItems.prototype['subject'] = undefined;

/**
 * e.g. \"CN=Admin\"
 * @member {String} issuer
 */
KeystoreChainItems.prototype['issuer'] = undefined;

/**
 * e.g. \"Sun Jul 01 12:00:00 AEST 2018\"
 * @member {String} notBefore
 */
KeystoreChainItems.prototype['notBefore'] = undefined;

/**
 * e.g. \"Sun Jun 30 23:59:50 AEST 2019\"
 * @member {String} notAfter
 */
KeystoreChainItems.prototype['notAfter'] = undefined;

/**
 * 18165099476682912368
 * @member {Number} serialNumber
 */
KeystoreChainItems.prototype['serialNumber'] = undefined;






export default KeystoreChainItems;

