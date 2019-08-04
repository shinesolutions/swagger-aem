'use strict';


/**
 *
 * returns String
 **/
exports.getCrxdeStatus = function() {
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
 * returns InstallStatus
 **/
exports.getInstallStatus = function() {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "status" : {
    "finished" : true,
    "itemCount" : 0
  }
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 *
 * no response value expected for this operation
 **/
exports.getPackageManagerServlet = function() {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}


/**
 *
 * cmd String 
 * returns String
 **/
exports.postPackageService = function(cmd) {
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
 * path String 
 * cmd String 
 * groupName String  (optional)
 * packageName String  (optional)
 * packageVersion String  (optional)
 * UnderscorecharsetUnderscore String  (optional)
 * force Boolean  (optional)
 * recursive Boolean  (optional)
 * package File  (optional)
 * returns String
 **/
exports.postPackageServiceJson = function(path,cmd,groupName,packageName,packageVersion,UnderscorecharsetUnderscore,force,recursive,package) {
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
 * groupName String 
 * packageName String 
 * version String 
 * path String 
 * filter String  (optional)
 * UnderscorecharsetUnderscore String  (optional)
 * returns String
 **/
exports.postPackageUpdate = function(groupName,packageName,version,path,filter,UnderscorecharsetUnderscore) {
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
 * old String 
 * plain String 
 * verify String 
 * returns String
 **/
exports.postSetPassword = function(old,plain,verify) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}

