# coding: utf-8

"""
    Adobe Experience Manager (AEM) API

    Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API  # noqa: E501

    The version of the OpenAPI document: 3.5.0-pre.0
    Contact: opensource@shinesolutions.com
    Generated by: https://openapi-generator.tech
"""


import pprint
import re  # noqa: F401

import six

from swaggeraem.configuration import Configuration


class SamlConfigurationPropertyItemsBoolean(object):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    """
    Attributes:
      openapi_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    openapi_types = {
        'name': 'str',
        'optional': 'bool',
        'is_set': 'bool',
        'type': 'int',
        'value': 'bool',
        'description': 'str'
    }

    attribute_map = {
        'name': 'name',
        'optional': 'optional',
        'is_set': 'is_set',
        'type': 'type',
        'value': 'value',
        'description': 'description'
    }

    def __init__(self, name=None, optional=None, is_set=None, type=None, value=None, description=None, local_vars_configuration=None):  # noqa: E501
        """SamlConfigurationPropertyItemsBoolean - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration()
        self.local_vars_configuration = local_vars_configuration

        self._name = None
        self._optional = None
        self._is_set = None
        self._type = None
        self._value = None
        self._description = None
        self.discriminator = None

        if name is not None:
            self.name = name
        if optional is not None:
            self.optional = optional
        if is_set is not None:
            self.is_set = is_set
        if type is not None:
            self.type = type
        if value is not None:
            self.value = value
        if description is not None:
            self.description = description

    @property
    def name(self):
        """Gets the name of this SamlConfigurationPropertyItemsBoolean.  # noqa: E501

        property name  # noqa: E501

        :return: The name of this SamlConfigurationPropertyItemsBoolean.  # noqa: E501
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this SamlConfigurationPropertyItemsBoolean.

        property name  # noqa: E501

        :param name: The name of this SamlConfigurationPropertyItemsBoolean.  # noqa: E501
        :type: str
        """

        self._name = name

    @property
    def optional(self):
        """Gets the optional of this SamlConfigurationPropertyItemsBoolean.  # noqa: E501

        True if optional  # noqa: E501

        :return: The optional of this SamlConfigurationPropertyItemsBoolean.  # noqa: E501
        :rtype: bool
        """
        return self._optional

    @optional.setter
    def optional(self, optional):
        """Sets the optional of this SamlConfigurationPropertyItemsBoolean.

        True if optional  # noqa: E501

        :param optional: The optional of this SamlConfigurationPropertyItemsBoolean.  # noqa: E501
        :type: bool
        """

        self._optional = optional

    @property
    def is_set(self):
        """Gets the is_set of this SamlConfigurationPropertyItemsBoolean.  # noqa: E501

        True if property is set  # noqa: E501

        :return: The is_set of this SamlConfigurationPropertyItemsBoolean.  # noqa: E501
        :rtype: bool
        """
        return self._is_set

    @is_set.setter
    def is_set(self, is_set):
        """Sets the is_set of this SamlConfigurationPropertyItemsBoolean.

        True if property is set  # noqa: E501

        :param is_set: The is_set of this SamlConfigurationPropertyItemsBoolean.  # noqa: E501
        :type: bool
        """

        self._is_set = is_set

    @property
    def type(self):
        """Gets the type of this SamlConfigurationPropertyItemsBoolean.  # noqa: E501

        Property type, 1=String, 3=long, 11=boolean, 12=Password  # noqa: E501

        :return: The type of this SamlConfigurationPropertyItemsBoolean.  # noqa: E501
        :rtype: int
        """
        return self._type

    @type.setter
    def type(self, type):
        """Sets the type of this SamlConfigurationPropertyItemsBoolean.

        Property type, 1=String, 3=long, 11=boolean, 12=Password  # noqa: E501

        :param type: The type of this SamlConfigurationPropertyItemsBoolean.  # noqa: E501
        :type: int
        """

        self._type = type

    @property
    def value(self):
        """Gets the value of this SamlConfigurationPropertyItemsBoolean.  # noqa: E501

        Property value  # noqa: E501

        :return: The value of this SamlConfigurationPropertyItemsBoolean.  # noqa: E501
        :rtype: bool
        """
        return self._value

    @value.setter
    def value(self, value):
        """Sets the value of this SamlConfigurationPropertyItemsBoolean.

        Property value  # noqa: E501

        :param value: The value of this SamlConfigurationPropertyItemsBoolean.  # noqa: E501
        :type: bool
        """

        self._value = value

    @property
    def description(self):
        """Gets the description of this SamlConfigurationPropertyItemsBoolean.  # noqa: E501

        Property description  # noqa: E501

        :return: The description of this SamlConfigurationPropertyItemsBoolean.  # noqa: E501
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """Sets the description of this SamlConfigurationPropertyItemsBoolean.

        Property description  # noqa: E501

        :param description: The description of this SamlConfigurationPropertyItemsBoolean.  # noqa: E501
        :type: str
        """

        self._description = description

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.openapi_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, SamlConfigurationPropertyItemsBoolean):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, SamlConfigurationPropertyItemsBoolean):
            return True

        return self.to_dict() != other.to_dict()
