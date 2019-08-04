goog.provide('API.Client.SamlConfigurationInfo');

/**
 * @record
 */
API.Client.SamlConfigurationInfo = function() {}

/**
 * Persistent Identity (PID)
 * @type {!string}
 * @export
 */
API.Client.SamlConfigurationInfo.prototype.pid;

/**
 * Title
 * @type {!string}
 * @export
 */
API.Client.SamlConfigurationInfo.prototype.title;

/**
 * Title
 * @type {!string}
 * @export
 */
API.Client.SamlConfigurationInfo.prototype.description;

/**
 * needed for configuration binding
 * @type {!string}
 * @export
 */
API.Client.SamlConfigurationInfo.prototype.bundleLocation;

/**
 * needed for configuraiton binding
 * @type {!string}
 * @export
 */
API.Client.SamlConfigurationInfo.prototype.serviceLocation;

/**
 * @type {!API.Client.SamlConfigurationProperties}
 * @export
 */
API.Client.SamlConfigurationInfo.prototype.properties;

