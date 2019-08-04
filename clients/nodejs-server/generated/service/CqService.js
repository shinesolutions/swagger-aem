'use strict';


/**
 *
 * returns String
 **/
exports.getLoginPage = function() {
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
 * authorizableId String 
 * changelog String 
 * no response value expected for this operation
 **/
exports.postCqActions = function(authorizableId,changelog) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}

