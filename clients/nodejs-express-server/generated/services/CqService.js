/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
*
* returns String
* */
const getLoginPage = () => new Promise(
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
* authorizableId String 
* changelog String 
* no response value expected for this operation
* */
const postCqActions = ({ authorizableId, changelog }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        authorizableId,
        changelog,
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
  getLoginPage,
  postCqActions,
};
