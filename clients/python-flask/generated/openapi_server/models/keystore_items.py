# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server.models.keystore_chain_items import KeystoreChainItems
from openapi_server import util

from openapi_server.models.keystore_chain_items import KeystoreChainItems  # noqa: E501

class KeystoreItems(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, alias=None, entry_type=None, algorithm=None, format=None, chain=None):  # noqa: E501
        """KeystoreItems - a model defined in OpenAPI

        :param alias: The alias of this KeystoreItems.  # noqa: E501
        :type alias: str
        :param entry_type: The entry_type of this KeystoreItems.  # noqa: E501
        :type entry_type: str
        :param algorithm: The algorithm of this KeystoreItems.  # noqa: E501
        :type algorithm: str
        :param format: The format of this KeystoreItems.  # noqa: E501
        :type format: str
        :param chain: The chain of this KeystoreItems.  # noqa: E501
        :type chain: List[KeystoreChainItems]
        """
        self.openapi_types = {
            'alias': str,
            'entry_type': str,
            'algorithm': str,
            'format': str,
            'chain': List[KeystoreChainItems]
        }

        self.attribute_map = {
            'alias': 'alias',
            'entry_type': 'entryType',
            'algorithm': 'algorithm',
            'format': 'format',
            'chain': 'chain'
        }

        self._alias = alias
        self._entry_type = entry_type
        self._algorithm = algorithm
        self._format = format
        self._chain = chain

    @classmethod
    def from_dict(cls, dikt) -> 'KeystoreItems':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The KeystoreItems of this KeystoreItems.  # noqa: E501
        :rtype: KeystoreItems
        """
        return util.deserialize_model(dikt, cls)

    @property
    def alias(self):
        """Gets the alias of this KeystoreItems.

        Keystore alias name  # noqa: E501

        :return: The alias of this KeystoreItems.
        :rtype: str
        """
        return self._alias

    @alias.setter
    def alias(self, alias):
        """Sets the alias of this KeystoreItems.

        Keystore alias name  # noqa: E501

        :param alias: The alias of this KeystoreItems.
        :type alias: str
        """

        self._alias = alias

    @property
    def entry_type(self):
        """Gets the entry_type of this KeystoreItems.

        e.g. \"privateKey\"  # noqa: E501

        :return: The entry_type of this KeystoreItems.
        :rtype: str
        """
        return self._entry_type

    @entry_type.setter
    def entry_type(self, entry_type):
        """Sets the entry_type of this KeystoreItems.

        e.g. \"privateKey\"  # noqa: E501

        :param entry_type: The entry_type of this KeystoreItems.
        :type entry_type: str
        """

        self._entry_type = entry_type

    @property
    def algorithm(self):
        """Gets the algorithm of this KeystoreItems.

        e.g. \"RSA\"  # noqa: E501

        :return: The algorithm of this KeystoreItems.
        :rtype: str
        """
        return self._algorithm

    @algorithm.setter
    def algorithm(self, algorithm):
        """Sets the algorithm of this KeystoreItems.

        e.g. \"RSA\"  # noqa: E501

        :param algorithm: The algorithm of this KeystoreItems.
        :type algorithm: str
        """

        self._algorithm = algorithm

    @property
    def format(self):
        """Gets the format of this KeystoreItems.

        e.g. \"PKCS#8\"  # noqa: E501

        :return: The format of this KeystoreItems.
        :rtype: str
        """
        return self._format

    @format.setter
    def format(self, format):
        """Sets the format of this KeystoreItems.

        e.g. \"PKCS#8\"  # noqa: E501

        :param format: The format of this KeystoreItems.
        :type format: str
        """

        self._format = format

    @property
    def chain(self):
        """Gets the chain of this KeystoreItems.


        :return: The chain of this KeystoreItems.
        :rtype: List[KeystoreChainItems]
        """
        return self._chain

    @chain.setter
    def chain(self, chain):
        """Sets the chain of this KeystoreItems.


        :param chain: The chain of this KeystoreItems.
        :type chain: List[KeystoreChainItems]
        """

        self._chain = chain
