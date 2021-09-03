goog.provide('API.Client.BundleInfo');

/**
 * @record
 */
API.Client.BundleInfo = function() {}

/**
 * Status description of all bundles
 * @type {!string}
 * @export
 */
API.Client.BundleInfo.prototype.status;

/**
 * @type {!Array<!number>}
 * @export
 */
API.Client.BundleInfo.prototype.s;

/**
 * @type {!Array<!API.Client.BundleData>}
 * @export
 */
API.Client.BundleInfo.prototype.data;

