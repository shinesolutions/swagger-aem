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
      var callback = function(error, data, response) {
        if (error) {
          console.error(error);
        } else {
          console.log('API called successfully. Returned data: ' + data);
          assert.notEqual(data, undefined);
        }
        done(error);
      };
      api.getAemHealthCheck({}, callback);
    });
  });

});
