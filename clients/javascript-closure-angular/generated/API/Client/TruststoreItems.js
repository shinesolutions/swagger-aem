goog.provide('API.Client.TruststoreItems');

/**
 * @record
 */
API.Client.TruststoreItems = function() {}

/**
 * Truststore alias name
 * @type {!string}
 * @export
 */
API.Client.TruststoreItems.prototype.alias;

/**
 * @type {!string}
 * @export
 */
API.Client.TruststoreItems.prototype.entryType;

/**
 * e.g. \"CN=localhost\"
 * @type {!string}
 * @export
 */
API.Client.TruststoreItems.prototype.subject;

/**
 * e.g. \"CN=Admin\"
 * @type {!string}
 * @export
 */
API.Client.TruststoreItems.prototype.issuer;

/**
 * e.g. \"Sun Jul 01 12:00:00 AEST 2018\"
 * @type {!string}
 * @export
 */
API.Client.TruststoreItems.prototype.notBefore;

/**
 * e.g. \"Sun Jun 30 23:59:50 AEST 2019\"
 * @type {!string}
 * @export
 */
API.Client.TruststoreItems.prototype.notAfter;

/**
 * 18165099476682912368
 * @type {!number}
 * @export
 */
API.Client.TruststoreItems.prototype.serialNumber;

