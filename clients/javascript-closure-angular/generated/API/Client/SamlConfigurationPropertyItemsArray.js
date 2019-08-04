goog.provide('API.Client.SamlConfigurationPropertyItemsArray');

/**
 * @record
 */
API.Client.SamlConfigurationPropertyItemsArray = function() {}

/**
 * property name
 * @type {!string}
 * @export
 */
API.Client.SamlConfigurationPropertyItemsArray.prototype.name;

/**
 * True if optional
 * @type {!boolean}
 * @export
 */
API.Client.SamlConfigurationPropertyItemsArray.prototype.optional;

/**
 * True if property is set
 * @type {!boolean}
 * @export
 */
API.Client.SamlConfigurationPropertyItemsArray.prototype.isSet;

/**
 * Property type, 1=String, 3=long, 11=boolean, 12=Password
 * @type {!number}
 * @export
 */
API.Client.SamlConfigurationPropertyItemsArray.prototype.type;

/**
 * Property value
 * @type {!Array<!string>}
 * @export
 */
API.Client.SamlConfigurationPropertyItemsArray.prototype.values;

/**
 * Property description
 * @type {!string}
 * @export
 */
API.Client.SamlConfigurationPropertyItemsArray.prototype.description;

