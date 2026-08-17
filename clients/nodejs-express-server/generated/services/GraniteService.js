/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
*
* keystorePassword String 
* keystorePasswordConfirm String 
* truststorePassword String 
* truststorePasswordConfirm String 
* httpsHostname String 
* httpsPort String 
* privatekeyFile File  (optional)
* certificateFile File  (optional)
* returns String
* */
const sslSetup = ({ keystorePassword, keystorePasswordConfirm, truststorePassword, truststorePasswordConfirm, httpsHostname, httpsPort, privatekeyFile, certificateFile }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        keystorePassword,
        keystorePasswordConfirm,
        truststorePassword,
        truststorePasswordConfirm,
        httpsHostname,
        httpsPort,
        privatekeyFile,
        certificateFile,
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
  sslSetup,
};
