goog.provide('API.Client.TruststoreInfo');

/**
 * @record
 */
API.Client.TruststoreInfo = function() {}

/**
 * @type {!Array<!API.Client.TruststoreItems>}
 * @export
 */
API.Client.TruststoreInfo.prototype.aliases;

/**
 * False if truststore don't exist
 * @type {!boolean}
 * @export
 */
API.Client.TruststoreInfo.prototype.exists;

