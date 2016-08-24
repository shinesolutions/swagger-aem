(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['../ApiClient'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'));
  } else {
    // Browser globals (root is window)
    if (!root.NodeSwaggerAem) {
      root.NodeSwaggerAem = {};
    }
    root.NodeSwaggerAem.CqApi = factory(root.NodeSwaggerAem.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';

  /**
   * Cq service.
   * @module api/CqApi
   * @version 0.0.1
   */

  /**
   * Constructs a new CqApi. 
   * @alias module:api/CqApi
   * @class
   * @param {module:ApiClient} apiClient Optional API client implementation to use, default to {@link module:ApiClient#instance}
   * if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;


    /**
     * Callback function to receive the result of the postCqActions operation.
     * @callback module:api/CqApi~postCqActionsCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * @param {String} authorizableId 
     * @param {String} changelog 
     * @param {module:api/CqApi~postCqActionsCallback} callback The callback function, accepting three arguments: error, data, response
     */
    this.postCqActions = function(authorizableId, changelog, callback) {
      var postBody = null;

      // verify the required parameter 'authorizableId' is set
      if (authorizableId == undefined || authorizableId == null) {
        throw "Missing the required parameter 'authorizableId' when calling postCqActions";
      }

      // verify the required parameter 'changelog' is set
      if (changelog == undefined || changelog == null) {
        throw "Missing the required parameter 'changelog' when calling postCqActions";
      }


      var pathParams = {
      };
      var queryParams = {
        'authorizableId': authorizableId,
        'changelog': changelog
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['aemAuth'];
      var contentTypes = [];
      var accepts = ['text/plain'];
      var returnType = null;

      return this.apiClient.callApi(
        '.cqactions.html', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
  };

  return exports;
}));
