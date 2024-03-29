# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server.models.install_status_status import InstallStatusStatus
from openapi_server import util

from openapi_server.models.install_status_status import InstallStatusStatus  # noqa: E501

class InstallStatus(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, status=None):  # noqa: E501
        """InstallStatus - a model defined in OpenAPI

        :param status: The status of this InstallStatus.  # noqa: E501
        :type status: InstallStatusStatus
        """
        self.openapi_types = {
            'status': InstallStatusStatus
        }

        self.attribute_map = {
            'status': 'status'
        }

        self._status = status

    @classmethod
    def from_dict(cls, dikt) -> 'InstallStatus':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The InstallStatus of this InstallStatus.  # noqa: E501
        :rtype: InstallStatus
        """
        return util.deserialize_model(dikt, cls)

    @property
    def status(self):
        """Gets the status of this InstallStatus.


        :return: The status of this InstallStatus.
        :rtype: InstallStatusStatus
        """
        return self._status

    @status.setter
    def status(self, status):
        """Sets the status of this InstallStatus.


        :param status: The status of this InstallStatus.
        :type status: InstallStatusStatus
        """

        self._status = status
