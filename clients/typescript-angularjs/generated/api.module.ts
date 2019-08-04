import * as api from './api/api';
import * as angular from 'angular';

const apiModule = angular.module('api', [])
.service('ConsoleApi', api.ConsoleApi)
.service('CqApi', api.CqApi)
.service('CrxApi', api.CrxApi)
.service('CustomApi', api.CustomApi)
.service('SlingApi', api.SlingApi)

export default apiModule;
