(function(factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['./ApiClient', './api/ConsoleApi', './api/CqApi', './api/CrxApi', './api/SlingApi'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('./ApiClient'), require('./api/ConsoleApi'), require('./api/CqApi'), require('./api/CrxApi'), require('./api/SlingApi'));
  }
}(function(ApiClient, ConsoleApi, CqApi, CrxApi, SlingApi) {
  'use strict';

  /**
   * An Adobe Experience Manager (AEM) API specification.<br>
   * The <code>index</code> module provides access to constructors for all the classes which comprise the public API.
   * <p>
   * An AMD (recommended!) or CommonJS application will generally do something equivalent to the following:
   * <pre>
   * var NodeSwaggerAem = require('./index'); // See note below*.
   * var xxxSvc = new NodeSwaggerAem.XxxApi(); // Allocate the API class we're going to use.
   * var yyyModel = new NodeSwaggerAem.Yyy(); // Construct a model instance.
   * yyyModel.someProperty = 'someValue';
   * ...
   * var zzz = xxxSvc.doSomething(yyyModel); // Invoke the service.
   * ...
   * </pre>
   * <em>*NOTE: For a top-level AMD script, use require(['./index'], function(){...}) and put the application logic within the
   * callback function.</em>
   * </p>
   * <p>
   * A non-AMD browser application (discouraged) might do something like this:
   * <pre>
   * var xxxSvc = new NodeSwaggerAem.XxxApi(); // Allocate the API class we're going to use.
   * var yyy = new NodeSwaggerAem.Yyy(); // Construct a model instance.
   * yyyModel.someProperty = 'someValue';
   * ...
   * var zzz = xxxSvc.doSomething(yyyModel); // Invoke the service.
   * ...
   * </pre>
   * </p>
   * @module index
   * @version 0.0.1
   */
  var exports = {
    /**
     * The ApiClient constructor.
     * @property {module:ApiClient}
     */
    ApiClient: ApiClient,
    /**
     * The ConsoleApi service constructor.
     * @property {module:api/ConsoleApi}
     */
    ConsoleApi: ConsoleApi,
    /**
     * The CqApi service constructor.
     * @property {module:api/CqApi}
     */
    CqApi: CqApi,
    /**
     * The CrxApi service constructor.
     * @property {module:api/CrxApi}
     */
    CrxApi: CrxApi,
    /**
     * The SlingApi service constructor.
     * @property {module:api/SlingApi}
     */
    SlingApi: SlingApi
  };

  return exports;
}));
