function initClient() {
  var client = NodeSwaggerAem.ApiClient.instance;
  var auth = client.authentications['aemAuth'];
  auth.username = 'admin';
  auth.password = 'admin';
}

exports.initClient = initClient;
