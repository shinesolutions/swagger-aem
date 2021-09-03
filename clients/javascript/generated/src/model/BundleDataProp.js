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
 * The BundleDataProp model module.
 * @module model/BundleDataProp
 * @version 0.9.0
 */
class BundleDataProp {
    /**
     * Constructs a new <code>BundleDataProp</code>.
     * @alias module:model/BundleDataProp
     */
    constructor() { 
        
        BundleDataProp.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>BundleDataProp</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/BundleDataProp} obj Optional instance to populate.
     * @return {module:model/BundleDataProp} The populated <code>BundleDataProp</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new BundleDataProp();

            if (data.hasOwnProperty('key')) {
                obj['key'] = ApiClient.convertToType(data['key'], 'String');
            }
            if (data.hasOwnProperty('value')) {
                obj['value'] = ApiClient.convertToType(data['value'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Bundle data key
 * @member {String} key
 */
BundleDataProp.prototype['key'] = undefined;

/**
 * Bundle data value
 * @member {String} value
 */
BundleDataProp.prototype['value'] = undefined;






export default BundleDataProp;
