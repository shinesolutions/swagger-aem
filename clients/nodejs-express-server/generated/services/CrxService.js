/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
*
* returns String
* */
const getCrxdeStatus = () => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
*
* returns InstallStatus
* */
const getInstallStatus = () => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
*
* no response value expected for this operation
* */
const getPackageManagerServlet = () => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
*
* cmd String 
* returns String
* */
const postPackageService = ({ cmd }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        cmd,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
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
* */
const postPackageServiceJson = ({ path, cmd, groupName, packageName, packageVersion, UnderscorecharsetUnderscore, force, recursive, package }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        path,
        cmd,
        groupName,
        packageName,
        packageVersion,
        UnderscorecharsetUnderscore,
        force,
        recursive,
        package,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
*
* groupName String 
* packageName String 
* version String 
* path String 
* filter String  (optional)
* UnderscorecharsetUnderscore String  (optional)
* returns String
* */
const postPackageUpdate = ({ groupName, packageName, version, path, filter, UnderscorecharsetUnderscore }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        groupName,
        packageName,
        version,
        path,
        filter,
        UnderscorecharsetUnderscore,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
*
* old String 
* plain String 
* verify String 
* returns String
* */
const postSetPassword = ({ old, plain, verify }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        old,
        plain,
        verify,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);

module.exports = {
  getCrxdeStatus,
  getInstallStatus,
  getPackageManagerServlet,
  postPackageService,
  postPackageServiceJson,
  postPackageUpdate,
  postSetPassword,
};
