goog.provide('API.Client.KeystoreItems');

/**
 * @record
 */
API.Client.KeystoreItems = function() {}

/**
 * Keystore alias name
 * @type {!string}
 * @export
 */
API.Client.KeystoreItems.prototype.alias;

/**
 * e.g. \"privateKey\"
 * @type {!string}
 * @export
 */
API.Client.KeystoreItems.prototype.entryType;

/**
 * e.g. \"RSA\"
 * @type {!string}
 * @export
 */
API.Client.KeystoreItems.prototype.algorithm;

/**
 * e.g. \"PKCS#8\"
 * @type {!string}
 * @export
 */
API.Client.KeystoreItems.prototype.format;

/**
 * @type {!Array<!API.Client.KeystoreChainItems>}
 * @export
 */
API.Client.KeystoreItems.prototype.chain;

