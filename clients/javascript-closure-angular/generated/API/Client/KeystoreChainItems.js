goog.provide('API.Client.KeystoreChainItems');

/**
 * @record
 */
API.Client.KeystoreChainItems = function() {}

/**
 * e.g. \"CN=localhost\"
 * @type {!string}
 * @export
 */
API.Client.KeystoreChainItems.prototype.subject;

/**
 * e.g. \"CN=Admin\"
 * @type {!string}
 * @export
 */
API.Client.KeystoreChainItems.prototype.issuer;

/**
 * e.g. \"Sun Jul 01 12:00:00 AEST 2018\"
 * @type {!string}
 * @export
 */
API.Client.KeystoreChainItems.prototype.notBefore;

/**
 * e.g. \"Sun Jun 30 23:59:50 AEST 2019\"
 * @type {!string}
 * @export
 */
API.Client.KeystoreChainItems.prototype.notAfter;

/**
 * 18165099476682912368
 * @type {!number}
 * @export
 */
API.Client.KeystoreChainItems.prototype.serialNumber;

