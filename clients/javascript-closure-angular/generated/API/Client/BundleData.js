goog.provide('API.Client.BundleData');

/**
 * @record
 */
API.Client.BundleData = function() {}

/**
 * Bundle ID
 * @type {!number}
 * @export
 */
API.Client.BundleData.prototype.id;

/**
 * Bundle name
 * @type {!string}
 * @export
 */
API.Client.BundleData.prototype.name;

/**
 * Is bundle a fragment
 * @type {!boolean}
 * @export
 */
API.Client.BundleData.prototype.fragment;

/**
 * Numeric raw bundle state value
 * @type {!number}
 * @export
 */
API.Client.BundleData.prototype.stateRaw;

/**
 * Bundle state value
 * @type {!string}
 * @export
 */
API.Client.BundleData.prototype.state;

/**
 * Bundle version
 * @type {!string}
 * @export
 */
API.Client.BundleData.prototype.version;

/**
 * Bundle symbolic name
 * @type {!string}
 * @export
 */
API.Client.BundleData.prototype.symbolicName;

/**
 * Bundle category
 * @type {!string}
 * @export
 */
API.Client.BundleData.prototype.category;

/**
 * @type {!Array<!API.Client.BundleDataProp>}
 * @export
 */
API.Client.BundleData.prototype.props;

