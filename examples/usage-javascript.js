var NodeSwaggerAem = require('node-swagger-aem');

var defaultClient = NodeSwaggerAem.ApiClient.instance;
var aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'admin';
aemAuth.password = 'admin';

var api = new NodeSwaggerAem.CustomApi();
var callback = function(error, data, response) {
  if (error) {
    console.error(error);
    process.exitCode = 1;
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
api.getAemHealthCheck({}, callback);
