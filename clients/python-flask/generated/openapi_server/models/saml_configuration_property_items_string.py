# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server import util


class SamlConfigurationPropertyItemsString(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, name=None, optional=None, is_set=None, type=None, value=None, description=None):  # noqa: E501
        """SamlConfigurationPropertyItemsString - a model defined in OpenAPI

        :param name: The name of this SamlConfigurationPropertyItemsString.  # noqa: E501
        :type name: str
        :param optional: The optional of this SamlConfigurationPropertyItemsString.  # noqa: E501
        :type optional: bool
        :param is_set: The is_set of this SamlConfigurationPropertyItemsString.  # noqa: E501
        :type is_set: bool
        :param type: The type of this SamlConfigurationPropertyItemsString.  # noqa: E501
        :type type: int
        :param value: The value of this SamlConfigurationPropertyItemsString.  # noqa: E501
        :type value: str
        :param description: The description of this SamlConfigurationPropertyItemsString.  # noqa: E501
        :type description: str
        """
        self.openapi_types = {
            'name': str,
            'optional': bool,
            'is_set': bool,
            'type': int,
            'value': str,
            'description': str
        }

        self.attribute_map = {
            'name': 'name',
            'optional': 'optional',
            'is_set': 'is_set',
            'type': 'type',
            'value': 'value',
            'description': 'description'
        }

        self._name = name
        self._optional = optional
        self._is_set = is_set
        self._type = type
        self._value = value
        self._description = description

    @classmethod
    def from_dict(cls, dikt) -> 'SamlConfigurationPropertyItemsString':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The SamlConfigurationPropertyItemsString of this SamlConfigurationPropertyItemsString.  # noqa: E501
        :rtype: SamlConfigurationPropertyItemsString
        """
        return util.deserialize_model(dikt, cls)

    @property
    def name(self):
        """Gets the name of this SamlConfigurationPropertyItemsString.

        property name  # noqa: E501

        :return: The name of this SamlConfigurationPropertyItemsString.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this SamlConfigurationPropertyItemsString.

        property name  # noqa: E501

        :param name: The name of this SamlConfigurationPropertyItemsString.
        :type name: str
        """

        self._name = name

    @property
    def optional(self):
        """Gets the optional of this SamlConfigurationPropertyItemsString.

        True if optional  # noqa: E501

        :return: The optional of this SamlConfigurationPropertyItemsString.
        :rtype: bool
        """
        return self._optional

    @optional.setter
    def optional(self, optional):
        """Sets the optional of this SamlConfigurationPropertyItemsString.

        True if optional  # noqa: E501

        :param optional: The optional of this SamlConfigurationPropertyItemsString.
        :type optional: bool
        """

        self._optional = optional

    @property
    def is_set(self):
        """Gets the is_set of this SamlConfigurationPropertyItemsString.

        True if property is set  # noqa: E501

        :return: The is_set of this SamlConfigurationPropertyItemsString.
        :rtype: bool
        """
        return self._is_set

    @is_set.setter
    def is_set(self, is_set):
        """Sets the is_set of this SamlConfigurationPropertyItemsString.

        True if property is set  # noqa: E501

        :param is_set: The is_set of this SamlConfigurationPropertyItemsString.
        :type is_set: bool
        """

        self._is_set = is_set

    @property
    def type(self):
        """Gets the type of this SamlConfigurationPropertyItemsString.

        Property type, 1=String, 3=long, 11=boolean, 12=Password  # noqa: E501

        :return: The type of this SamlConfigurationPropertyItemsString.
        :rtype: int
        """
        return self._type

    @type.setter
    def type(self, type):
        """Sets the type of this SamlConfigurationPropertyItemsString.

        Property type, 1=String, 3=long, 11=boolean, 12=Password  # noqa: E501

        :param type: The type of this SamlConfigurationPropertyItemsString.
        :type type: int
        """

        self._type = type

    @property
    def value(self):
        """Gets the value of this SamlConfigurationPropertyItemsString.

        Property value  # noqa: E501

        :return: The value of this SamlConfigurationPropertyItemsString.
        :rtype: str
        """
        return self._value

    @value.setter
    def value(self, value):
        """Sets the value of this SamlConfigurationPropertyItemsString.

        Property value  # noqa: E501

        :param value: The value of this SamlConfigurationPropertyItemsString.
        :type value: str
        """

        self._value = value

    @property
    def description(self):
        """Gets the description of this SamlConfigurationPropertyItemsString.

        Property description  # noqa: E501

        :return: The description of this SamlConfigurationPropertyItemsString.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """Sets the description of this SamlConfigurationPropertyItemsString.

        Property description  # noqa: E501

        :param description: The description of this SamlConfigurationPropertyItemsString.
        :type description: str
        """

        self._description = description
