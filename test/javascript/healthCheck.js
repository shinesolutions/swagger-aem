var assert = require('assert');
var NodeSwaggerAem = require('node-swagger-aem');

describe('healthCheck', function() {

  describe('getAemHealthCheck', function() {
    it('should respond without error', function(done) {
      var defaultClient = NodeSwaggerAem.ApiClient.instance;
      var aemAuth = defaultClient.authentications['aemAuth'];
      aemAuth.username = 'admin';
      aemAuth.password = 'admin';

      var api = new NodeSwaggerAem.CustomApi();

      // Stub the underlying HTTP call so no real AEM server is needed
      var calledWith = null;
      api.apiClient.callApi = function() {
        calledWith = { path: arguments[0], httpMethod: arguments[1] };
        var callback = arguments[arguments.length - 1];
        callback(null, 'OK', { status: 200 });
      };

      var callback = function(error, data, response) {
        if (error) {
          console.error(error);
        } else {
          console.log('API called successfully. Returned data: ' + data);
          assert.equal(data, 'OK');
          assert.equal(calledWith.path, '/system/health');
          assert.equal(calledWith.httpMethod, 'GET');
        }
        done(error);
      };
      api.getAemHealthCheck({}, callback);
    });
  });

});
