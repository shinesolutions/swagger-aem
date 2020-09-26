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


class InlineObject4(object):
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
        'cert_chain': 'file',
        'pk': 'file',
        'key_store': 'file'
    }

    attribute_map = {
        'cert_chain': 'cert-chain',
        'pk': 'pk',
        'key_store': 'keyStore'
    }

    def __init__(self, cert_chain=None, pk=None, key_store=None, local_vars_configuration=None):  # noqa: E501
        """InlineObject4 - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration()
        self.local_vars_configuration = local_vars_configuration

        self._cert_chain = None
        self._pk = None
        self._key_store = None
        self.discriminator = None

        if cert_chain is not None:
            self.cert_chain = cert_chain
        if pk is not None:
            self.pk = pk
        if key_store is not None:
            self.key_store = key_store

    @property
    def cert_chain(self):
        """Gets the cert_chain of this InlineObject4.  # noqa: E501


        :return: The cert_chain of this InlineObject4.  # noqa: E501
        :rtype: file
        """
        return self._cert_chain

    @cert_chain.setter
    def cert_chain(self, cert_chain):
        """Sets the cert_chain of this InlineObject4.


        :param cert_chain: The cert_chain of this InlineObject4.  # noqa: E501
        :type: file
        """

        self._cert_chain = cert_chain

    @property
    def pk(self):
        """Gets the pk of this InlineObject4.  # noqa: E501


        :return: The pk of this InlineObject4.  # noqa: E501
        :rtype: file
        """
        return self._pk

    @pk.setter
    def pk(self, pk):
        """Sets the pk of this InlineObject4.


        :param pk: The pk of this InlineObject4.  # noqa: E501
        :type: file
        """

        self._pk = pk

    @property
    def key_store(self):
        """Gets the key_store of this InlineObject4.  # noqa: E501


        :return: The key_store of this InlineObject4.  # noqa: E501
        :rtype: file
        """
        return self._key_store

    @key_store.setter
    def key_store(self, key_store):
        """Sets the key_store of this InlineObject4.


        :param key_store: The key_store of this InlineObject4.  # noqa: E501
        :type: file
        """

        self._key_store = key_store

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
        if not isinstance(other, InlineObject4):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, InlineObject4):
            return True

        return self.to_dict() != other.to_dict()
