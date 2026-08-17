/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
*
* tags String  (optional)
* combineTagsOr Boolean  (optional)
* returns String
* */
const getAemHealthCheck = ({ tags, combineTagsOr }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        tags,
        combineTagsOr,
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
* bundlesPeriodignored List  (optional)
* bundlesPeriodignoredAtTypeHint String  (optional)
* no response value expected for this operation
* */
const postConfigAemHealthCheckServlet = ({ bundlesPeriodignored, bundlesPeriodignoredAtTypeHint }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        bundlesPeriodignored,
        bundlesPeriodignoredAtTypeHint,
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
* pwdresetPeriodauthorizables List  (optional)
* pwdresetPeriodauthorizablesAtTypeHint String  (optional)
* no response value expected for this operation
* */
const postConfigAemPasswordReset = ({ pwdresetPeriodauthorizables, pwdresetPeriodauthorizablesAtTypeHint }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        pwdresetPeriodauthorizables,
        pwdresetPeriodauthorizablesAtTypeHint,
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
  getAemHealthCheck,
  postConfigAemHealthCheckServlet,
  postConfigAemPasswordReset,
};
