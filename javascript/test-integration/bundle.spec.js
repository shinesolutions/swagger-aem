'use strict';

var NodeSwaggerAem = require('../generated/src/index');
var helper = require('./helper');

var _console;

beforeEach(function() {
  _console = new NodeSwaggerAem.ConsoleApi();
});

describe('Bundle', function() {
  describe('test bundle stop', function() {
    it('should succeed when bundle exists', function(done) {
      _console.postBundle('com.adobe.cq.social.cq-social-forum', 'stop', function (err, result) {
        if (err) {
          throw err;
        } else {
          // console.dir(result);
          // done();
        }
      });
    });
  });
});
