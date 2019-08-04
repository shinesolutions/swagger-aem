'use strict';


/**
 *
 * tags String  (optional)
 * combineTagsOr Boolean  (optional)
 * returns String
 **/
exports.getAemHealthCheck = function(tags,combineTagsOr) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 *
 * bundlesPeriodignored List  (optional)
 * bundlesPeriodignoredAtTypeHint String  (optional)
 * no response value expected for this operation
 **/
exports.postConfigAemHealthCheckServlet = function(bundlesPeriodignored,bundlesPeriodignoredAtTypeHint) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}


/**
 *
 * pwdresetPeriodauthorizables List  (optional)
 * pwdresetPeriodauthorizablesAtTypeHint String  (optional)
 * no response value expected for this operation
 **/
exports.postConfigAemPasswordReset = function(pwdresetPeriodauthorizables,pwdresetPeriodauthorizablesAtTypeHint) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}

