goog.provide('API.Client.KeystoreInfo');

/**
 * @record
 */
API.Client.KeystoreInfo = function() {}

/**
 * @type {!Array<!API.Client.KeystoreItems>}
 * @export
 */
API.Client.KeystoreInfo.prototype.aliases;

/**
 * False if truststore don't exist
 * @type {!boolean}
 * @export
 */
API.Client.KeystoreInfo.prototype.exists;

