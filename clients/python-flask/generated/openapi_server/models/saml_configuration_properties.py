# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server.models.saml_configuration_property_items_array import SamlConfigurationPropertyItemsArray
from openapi_server.models.saml_configuration_property_items_boolean import SamlConfigurationPropertyItemsBoolean
from openapi_server.models.saml_configuration_property_items_long import SamlConfigurationPropertyItemsLong
from openapi_server.models.saml_configuration_property_items_string import SamlConfigurationPropertyItemsString
from openapi_server import util

from openapi_server.models.saml_configuration_property_items_array import SamlConfigurationPropertyItemsArray  # noqa: E501
from openapi_server.models.saml_configuration_property_items_boolean import SamlConfigurationPropertyItemsBoolean  # noqa: E501
from openapi_server.models.saml_configuration_property_items_long import SamlConfigurationPropertyItemsLong  # noqa: E501
from openapi_server.models.saml_configuration_property_items_string import SamlConfigurationPropertyItemsString  # noqa: E501

class SamlConfigurationProperties(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, path=None, service_ranking=None, idp_url=None, idp_cert_alias=None, idp_http_redirect=None, service_provider_entity_id=None, assertion_consumer_service_url=None, sp_private_key_alias=None, key_store_password=None, default_redirect_url=None, user_id_attribute=None, use_encryption=None, create_user=None, add_group_memberships=None, group_membership_attribute=None, default_groups=None, name_id_format=None, synchronize_attributes=None, handle_logout=None, logout_url=None, clock_tolerance=None, digest_method=None, signature_method=None, user_intermediate_path=None):  # noqa: E501
        """SamlConfigurationProperties - a model defined in OpenAPI

        :param path: The path of this SamlConfigurationProperties.  # noqa: E501
        :type path: SamlConfigurationPropertyItemsArray
        :param service_ranking: The service_ranking of this SamlConfigurationProperties.  # noqa: E501
        :type service_ranking: SamlConfigurationPropertyItemsLong
        :param idp_url: The idp_url of this SamlConfigurationProperties.  # noqa: E501
        :type idp_url: SamlConfigurationPropertyItemsString
        :param idp_cert_alias: The idp_cert_alias of this SamlConfigurationProperties.  # noqa: E501
        :type idp_cert_alias: SamlConfigurationPropertyItemsString
        :param idp_http_redirect: The idp_http_redirect of this SamlConfigurationProperties.  # noqa: E501
        :type idp_http_redirect: SamlConfigurationPropertyItemsBoolean
        :param service_provider_entity_id: The service_provider_entity_id of this SamlConfigurationProperties.  # noqa: E501
        :type service_provider_entity_id: SamlConfigurationPropertyItemsString
        :param assertion_consumer_service_url: The assertion_consumer_service_url of this SamlConfigurationProperties.  # noqa: E501
        :type assertion_consumer_service_url: SamlConfigurationPropertyItemsString
        :param sp_private_key_alias: The sp_private_key_alias of this SamlConfigurationProperties.  # noqa: E501
        :type sp_private_key_alias: SamlConfigurationPropertyItemsString
        :param key_store_password: The key_store_password of this SamlConfigurationProperties.  # noqa: E501
        :type key_store_password: SamlConfigurationPropertyItemsString
        :param default_redirect_url: The default_redirect_url of this SamlConfigurationProperties.  # noqa: E501
        :type default_redirect_url: SamlConfigurationPropertyItemsString
        :param user_id_attribute: The user_id_attribute of this SamlConfigurationProperties.  # noqa: E501
        :type user_id_attribute: SamlConfigurationPropertyItemsString
        :param use_encryption: The use_encryption of this SamlConfigurationProperties.  # noqa: E501
        :type use_encryption: SamlConfigurationPropertyItemsBoolean
        :param create_user: The create_user of this SamlConfigurationProperties.  # noqa: E501
        :type create_user: SamlConfigurationPropertyItemsBoolean
        :param add_group_memberships: The add_group_memberships of this SamlConfigurationProperties.  # noqa: E501
        :type add_group_memberships: SamlConfigurationPropertyItemsBoolean
        :param group_membership_attribute: The group_membership_attribute of this SamlConfigurationProperties.  # noqa: E501
        :type group_membership_attribute: SamlConfigurationPropertyItemsString
        :param default_groups: The default_groups of this SamlConfigurationProperties.  # noqa: E501
        :type default_groups: SamlConfigurationPropertyItemsArray
        :param name_id_format: The name_id_format of this SamlConfigurationProperties.  # noqa: E501
        :type name_id_format: SamlConfigurationPropertyItemsString
        :param synchronize_attributes: The synchronize_attributes of this SamlConfigurationProperties.  # noqa: E501
        :type synchronize_attributes: SamlConfigurationPropertyItemsArray
        :param handle_logout: The handle_logout of this SamlConfigurationProperties.  # noqa: E501
        :type handle_logout: SamlConfigurationPropertyItemsBoolean
        :param logout_url: The logout_url of this SamlConfigurationProperties.  # noqa: E501
        :type logout_url: SamlConfigurationPropertyItemsString
        :param clock_tolerance: The clock_tolerance of this SamlConfigurationProperties.  # noqa: E501
        :type clock_tolerance: SamlConfigurationPropertyItemsLong
        :param digest_method: The digest_method of this SamlConfigurationProperties.  # noqa: E501
        :type digest_method: SamlConfigurationPropertyItemsString
        :param signature_method: The signature_method of this SamlConfigurationProperties.  # noqa: E501
        :type signature_method: SamlConfigurationPropertyItemsString
        :param user_intermediate_path: The user_intermediate_path of this SamlConfigurationProperties.  # noqa: E501
        :type user_intermediate_path: SamlConfigurationPropertyItemsString
        """
        self.openapi_types = {
            'path': SamlConfigurationPropertyItemsArray,
            'service_ranking': SamlConfigurationPropertyItemsLong,
            'idp_url': SamlConfigurationPropertyItemsString,
            'idp_cert_alias': SamlConfigurationPropertyItemsString,
            'idp_http_redirect': SamlConfigurationPropertyItemsBoolean,
            'service_provider_entity_id': SamlConfigurationPropertyItemsString,
            'assertion_consumer_service_url': SamlConfigurationPropertyItemsString,
            'sp_private_key_alias': SamlConfigurationPropertyItemsString,
            'key_store_password': SamlConfigurationPropertyItemsString,
            'default_redirect_url': SamlConfigurationPropertyItemsString,
            'user_id_attribute': SamlConfigurationPropertyItemsString,
            'use_encryption': SamlConfigurationPropertyItemsBoolean,
            'create_user': SamlConfigurationPropertyItemsBoolean,
            'add_group_memberships': SamlConfigurationPropertyItemsBoolean,
            'group_membership_attribute': SamlConfigurationPropertyItemsString,
            'default_groups': SamlConfigurationPropertyItemsArray,
            'name_id_format': SamlConfigurationPropertyItemsString,
            'synchronize_attributes': SamlConfigurationPropertyItemsArray,
            'handle_logout': SamlConfigurationPropertyItemsBoolean,
            'logout_url': SamlConfigurationPropertyItemsString,
            'clock_tolerance': SamlConfigurationPropertyItemsLong,
            'digest_method': SamlConfigurationPropertyItemsString,
            'signature_method': SamlConfigurationPropertyItemsString,
            'user_intermediate_path': SamlConfigurationPropertyItemsString
        }

        self.attribute_map = {
            'path': 'path',
            'service_ranking': 'service.ranking',
            'idp_url': 'idpUrl',
            'idp_cert_alias': 'idpCertAlias',
            'idp_http_redirect': 'idpHttpRedirect',
            'service_provider_entity_id': 'serviceProviderEntityId',
            'assertion_consumer_service_url': 'assertionConsumerServiceURL',
            'sp_private_key_alias': 'spPrivateKeyAlias',
            'key_store_password': 'keyStorePassword',
            'default_redirect_url': 'defaultRedirectUrl',
            'user_id_attribute': 'userIDAttribute',
            'use_encryption': 'useEncryption',
            'create_user': 'createUser',
            'add_group_memberships': 'addGroupMemberships',
            'group_membership_attribute': 'groupMembershipAttribute',
            'default_groups': 'defaultGroups',
            'name_id_format': 'nameIdFormat',
            'synchronize_attributes': 'synchronizeAttributes',
            'handle_logout': 'handleLogout',
            'logout_url': 'logoutUrl',
            'clock_tolerance': 'clockTolerance',
            'digest_method': 'digestMethod',
            'signature_method': 'signatureMethod',
            'user_intermediate_path': 'userIntermediatePath'
        }

        self._path = path
        self._service_ranking = service_ranking
        self._idp_url = idp_url
        self._idp_cert_alias = idp_cert_alias
        self._idp_http_redirect = idp_http_redirect
        self._service_provider_entity_id = service_provider_entity_id
        self._assertion_consumer_service_url = assertion_consumer_service_url
        self._sp_private_key_alias = sp_private_key_alias
        self._key_store_password = key_store_password
        self._default_redirect_url = default_redirect_url
        self._user_id_attribute = user_id_attribute
        self._use_encryption = use_encryption
        self._create_user = create_user
        self._add_group_memberships = add_group_memberships
        self._group_membership_attribute = group_membership_attribute
        self._default_groups = default_groups
        self._name_id_format = name_id_format
        self._synchronize_attributes = synchronize_attributes
        self._handle_logout = handle_logout
        self._logout_url = logout_url
        self._clock_tolerance = clock_tolerance
        self._digest_method = digest_method
        self._signature_method = signature_method
        self._user_intermediate_path = user_intermediate_path

    @classmethod
    def from_dict(cls, dikt) -> 'SamlConfigurationProperties':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The SamlConfigurationProperties of this SamlConfigurationProperties.  # noqa: E501
        :rtype: SamlConfigurationProperties
        """
        return util.deserialize_model(dikt, cls)

    @property
    def path(self):
        """Gets the path of this SamlConfigurationProperties.


        :return: The path of this SamlConfigurationProperties.
        :rtype: SamlConfigurationPropertyItemsArray
        """
        return self._path

    @path.setter
    def path(self, path):
        """Sets the path of this SamlConfigurationProperties.


        :param path: The path of this SamlConfigurationProperties.
        :type path: SamlConfigurationPropertyItemsArray
        """

        self._path = path

    @property
    def service_ranking(self):
        """Gets the service_ranking of this SamlConfigurationProperties.


        :return: The service_ranking of this SamlConfigurationProperties.
        :rtype: SamlConfigurationPropertyItemsLong
        """
        return self._service_ranking

    @service_ranking.setter
    def service_ranking(self, service_ranking):
        """Sets the service_ranking of this SamlConfigurationProperties.


        :param service_ranking: The service_ranking of this SamlConfigurationProperties.
        :type service_ranking: SamlConfigurationPropertyItemsLong
        """

        self._service_ranking = service_ranking

    @property
    def idp_url(self):
        """Gets the idp_url of this SamlConfigurationProperties.


        :return: The idp_url of this SamlConfigurationProperties.
        :rtype: SamlConfigurationPropertyItemsString
        """
        return self._idp_url

    @idp_url.setter
    def idp_url(self, idp_url):
        """Sets the idp_url of this SamlConfigurationProperties.


        :param idp_url: The idp_url of this SamlConfigurationProperties.
        :type idp_url: SamlConfigurationPropertyItemsString
        """

        self._idp_url = idp_url

    @property
    def idp_cert_alias(self):
        """Gets the idp_cert_alias of this SamlConfigurationProperties.


        :return: The idp_cert_alias of this SamlConfigurationProperties.
        :rtype: SamlConfigurationPropertyItemsString
        """
        return self._idp_cert_alias

    @idp_cert_alias.setter
    def idp_cert_alias(self, idp_cert_alias):
        """Sets the idp_cert_alias of this SamlConfigurationProperties.


        :param idp_cert_alias: The idp_cert_alias of this SamlConfigurationProperties.
        :type idp_cert_alias: SamlConfigurationPropertyItemsString
        """

        self._idp_cert_alias = idp_cert_alias

    @property
    def idp_http_redirect(self):
        """Gets the idp_http_redirect of this SamlConfigurationProperties.


        :return: The idp_http_redirect of this SamlConfigurationProperties.
        :rtype: SamlConfigurationPropertyItemsBoolean
        """
        return self._idp_http_redirect

    @idp_http_redirect.setter
    def idp_http_redirect(self, idp_http_redirect):
        """Sets the idp_http_redirect of this SamlConfigurationProperties.


        :param idp_http_redirect: The idp_http_redirect of this SamlConfigurationProperties.
        :type idp_http_redirect: SamlConfigurationPropertyItemsBoolean
        """

        self._idp_http_redirect = idp_http_redirect

    @property
    def service_provider_entity_id(self):
        """Gets the service_provider_entity_id of this SamlConfigurationProperties.


        :return: The service_provider_entity_id of this SamlConfigurationProperties.
        :rtype: SamlConfigurationPropertyItemsString
        """
        return self._service_provider_entity_id

    @service_provider_entity_id.setter
    def service_provider_entity_id(self, service_provider_entity_id):
        """Sets the service_provider_entity_id of this SamlConfigurationProperties.


        :param service_provider_entity_id: The service_provider_entity_id of this SamlConfigurationProperties.
        :type service_provider_entity_id: SamlConfigurationPropertyItemsString
        """

        self._service_provider_entity_id = service_provider_entity_id

    @property
    def assertion_consumer_service_url(self):
        """Gets the assertion_consumer_service_url of this SamlConfigurationProperties.


        :return: The assertion_consumer_service_url of this SamlConfigurationProperties.
        :rtype: SamlConfigurationPropertyItemsString
        """
        return self._assertion_consumer_service_url

    @assertion_consumer_service_url.setter
    def assertion_consumer_service_url(self, assertion_consumer_service_url):
        """Sets the assertion_consumer_service_url of this SamlConfigurationProperties.


        :param assertion_consumer_service_url: The assertion_consumer_service_url of this SamlConfigurationProperties.
        :type assertion_consumer_service_url: SamlConfigurationPropertyItemsString
        """

        self._assertion_consumer_service_url = assertion_consumer_service_url

    @property
    def sp_private_key_alias(self):
        """Gets the sp_private_key_alias of this SamlConfigurationProperties.


        :return: The sp_private_key_alias of this SamlConfigurationProperties.
        :rtype: SamlConfigurationPropertyItemsString
        """
        return self._sp_private_key_alias

    @sp_private_key_alias.setter
    def sp_private_key_alias(self, sp_private_key_alias):
        """Sets the sp_private_key_alias of this SamlConfigurationProperties.


        :param sp_private_key_alias: The sp_private_key_alias of this SamlConfigurationProperties.
        :type sp_private_key_alias: SamlConfigurationPropertyItemsString
        """

        self._sp_private_key_alias = sp_private_key_alias

    @property
    def key_store_password(self):
        """Gets the key_store_password of this SamlConfigurationProperties.


        :return: The key_store_password of this SamlConfigurationProperties.
        :rtype: SamlConfigurationPropertyItemsString
        """
        return self._key_store_password

    @key_store_password.setter
    def key_store_password(self, key_store_password):
        """Sets the key_store_password of this SamlConfigurationProperties.


        :param key_store_password: The key_store_password of this SamlConfigurationProperties.
        :type key_store_password: SamlConfigurationPropertyItemsString
        """

        self._key_store_password = key_store_password

    @property
    def default_redirect_url(self):
        """Gets the default_redirect_url of this SamlConfigurationProperties.


        :return: The default_redirect_url of this SamlConfigurationProperties.
        :rtype: SamlConfigurationPropertyItemsString
        """
        return self._default_redirect_url

    @default_redirect_url.setter
    def default_redirect_url(self, default_redirect_url):
        """Sets the default_redirect_url of this SamlConfigurationProperties.


        :param default_redirect_url: The default_redirect_url of this SamlConfigurationProperties.
        :type default_redirect_url: SamlConfigurationPropertyItemsString
        """

        self._default_redirect_url = default_redirect_url

    @property
    def user_id_attribute(self):
        """Gets the user_id_attribute of this SamlConfigurationProperties.


        :return: The user_id_attribute of this SamlConfigurationProperties.
        :rtype: SamlConfigurationPropertyItemsString
        """
        return self._user_id_attribute

    @user_id_attribute.setter
    def user_id_attribute(self, user_id_attribute):
        """Sets the user_id_attribute of this SamlConfigurationProperties.


        :param user_id_attribute: The user_id_attribute of this SamlConfigurationProperties.
        :type user_id_attribute: SamlConfigurationPropertyItemsString
        """

        self._user_id_attribute = user_id_attribute

    @property
    def use_encryption(self):
        """Gets the use_encryption of this SamlConfigurationProperties.


        :return: The use_encryption of this SamlConfigurationProperties.
        :rtype: SamlConfigurationPropertyItemsBoolean
        """
        return self._use_encryption

    @use_encryption.setter
    def use_encryption(self, use_encryption):
        """Sets the use_encryption of this SamlConfigurationProperties.


        :param use_encryption: The use_encryption of this SamlConfigurationProperties.
        :type use_encryption: SamlConfigurationPropertyItemsBoolean
        """

        self._use_encryption = use_encryption

    @property
    def create_user(self):
        """Gets the create_user of this SamlConfigurationProperties.


        :return: The create_user of this SamlConfigurationProperties.
        :rtype: SamlConfigurationPropertyItemsBoolean
        """
        return self._create_user

    @create_user.setter
    def create_user(self, create_user):
        """Sets the create_user of this SamlConfigurationProperties.


        :param create_user: The create_user of this SamlConfigurationProperties.
        :type create_user: SamlConfigurationPropertyItemsBoolean
        """

        self._create_user = create_user

    @property
    def add_group_memberships(self):
        """Gets the add_group_memberships of this SamlConfigurationProperties.


        :return: The add_group_memberships of this SamlConfigurationProperties.
        :rtype: SamlConfigurationPropertyItemsBoolean
        """
        return self._add_group_memberships

    @add_group_memberships.setter
    def add_group_memberships(self, add_group_memberships):
        """Sets the add_group_memberships of this SamlConfigurationProperties.


        :param add_group_memberships: The add_group_memberships of this SamlConfigurationProperties.
        :type add_group_memberships: SamlConfigurationPropertyItemsBoolean
        """

        self._add_group_memberships = add_group_memberships

    @property
    def group_membership_attribute(self):
        """Gets the group_membership_attribute of this SamlConfigurationProperties.


        :return: The group_membership_attribute of this SamlConfigurationProperties.
        :rtype: SamlConfigurationPropertyItemsString
        """
        return self._group_membership_attribute

    @group_membership_attribute.setter
    def group_membership_attribute(self, group_membership_attribute):
        """Sets the group_membership_attribute of this SamlConfigurationProperties.


        :param group_membership_attribute: The group_membership_attribute of this SamlConfigurationProperties.
        :type group_membership_attribute: SamlConfigurationPropertyItemsString
        """

        self._group_membership_attribute = group_membership_attribute

    @property
    def default_groups(self):
        """Gets the default_groups of this SamlConfigurationProperties.


        :return: The default_groups of this SamlConfigurationProperties.
        :rtype: SamlConfigurationPropertyItemsArray
        """
        return self._default_groups

    @default_groups.setter
    def default_groups(self, default_groups):
        """Sets the default_groups of this SamlConfigurationProperties.


        :param default_groups: The default_groups of this SamlConfigurationProperties.
        :type default_groups: SamlConfigurationPropertyItemsArray
        """

        self._default_groups = default_groups

    @property
    def name_id_format(self):
        """Gets the name_id_format of this SamlConfigurationProperties.


        :return: The name_id_format of this SamlConfigurationProperties.
        :rtype: SamlConfigurationPropertyItemsString
        """
        return self._name_id_format

    @name_id_format.setter
    def name_id_format(self, name_id_format):
        """Sets the name_id_format of this SamlConfigurationProperties.


        :param name_id_format: The name_id_format of this SamlConfigurationProperties.
        :type name_id_format: SamlConfigurationPropertyItemsString
        """

        self._name_id_format = name_id_format

    @property
    def synchronize_attributes(self):
        """Gets the synchronize_attributes of this SamlConfigurationProperties.


        :return: The synchronize_attributes of this SamlConfigurationProperties.
        :rtype: SamlConfigurationPropertyItemsArray
        """
        return self._synchronize_attributes

    @synchronize_attributes.setter
    def synchronize_attributes(self, synchronize_attributes):
        """Sets the synchronize_attributes of this SamlConfigurationProperties.


        :param synchronize_attributes: The synchronize_attributes of this SamlConfigurationProperties.
        :type synchronize_attributes: SamlConfigurationPropertyItemsArray
        """

        self._synchronize_attributes = synchronize_attributes

    @property
    def handle_logout(self):
        """Gets the handle_logout of this SamlConfigurationProperties.


        :return: The handle_logout of this SamlConfigurationProperties.
        :rtype: SamlConfigurationPropertyItemsBoolean
        """
        return self._handle_logout

    @handle_logout.setter
    def handle_logout(self, handle_logout):
        """Sets the handle_logout of this SamlConfigurationProperties.


        :param handle_logout: The handle_logout of this SamlConfigurationProperties.
        :type handle_logout: SamlConfigurationPropertyItemsBoolean
        """

        self._handle_logout = handle_logout

    @property
    def logout_url(self):
        """Gets the logout_url of this SamlConfigurationProperties.


        :return: The logout_url of this SamlConfigurationProperties.
        :rtype: SamlConfigurationPropertyItemsString
        """
        return self._logout_url

    @logout_url.setter
    def logout_url(self, logout_url):
        """Sets the logout_url of this SamlConfigurationProperties.


        :param logout_url: The logout_url of this SamlConfigurationProperties.
        :type logout_url: SamlConfigurationPropertyItemsString
        """

        self._logout_url = logout_url

    @property
    def clock_tolerance(self):
        """Gets the clock_tolerance of this SamlConfigurationProperties.


        :return: The clock_tolerance of this SamlConfigurationProperties.
        :rtype: SamlConfigurationPropertyItemsLong
        """
        return self._clock_tolerance

    @clock_tolerance.setter
    def clock_tolerance(self, clock_tolerance):
        """Sets the clock_tolerance of this SamlConfigurationProperties.


        :param clock_tolerance: The clock_tolerance of this SamlConfigurationProperties.
        :type clock_tolerance: SamlConfigurationPropertyItemsLong
        """

        self._clock_tolerance = clock_tolerance

    @property
    def digest_method(self):
        """Gets the digest_method of this SamlConfigurationProperties.


        :return: The digest_method of this SamlConfigurationProperties.
        :rtype: SamlConfigurationPropertyItemsString
        """
        return self._digest_method

    @digest_method.setter
    def digest_method(self, digest_method):
        """Sets the digest_method of this SamlConfigurationProperties.


        :param digest_method: The digest_method of this SamlConfigurationProperties.
        :type digest_method: SamlConfigurationPropertyItemsString
        """

        self._digest_method = digest_method

    @property
    def signature_method(self):
        """Gets the signature_method of this SamlConfigurationProperties.


        :return: The signature_method of this SamlConfigurationProperties.
        :rtype: SamlConfigurationPropertyItemsString
        """
        return self._signature_method

    @signature_method.setter
    def signature_method(self, signature_method):
        """Sets the signature_method of this SamlConfigurationProperties.


        :param signature_method: The signature_method of this SamlConfigurationProperties.
        :type signature_method: SamlConfigurationPropertyItemsString
        """

        self._signature_method = signature_method

    @property
    def user_intermediate_path(self):
        """Gets the user_intermediate_path of this SamlConfigurationProperties.


        :return: The user_intermediate_path of this SamlConfigurationProperties.
        :rtype: SamlConfigurationPropertyItemsString
        """
        return self._user_intermediate_path

    @user_intermediate_path.setter
    def user_intermediate_path(self, user_intermediate_path):
        """Sets the user_intermediate_path of this SamlConfigurationProperties.


        :param user_intermediate_path: The user_intermediate_path of this SamlConfigurationProperties.
        :type user_intermediate_path: SamlConfigurationPropertyItemsString
        """

        self._user_intermediate_path = user_intermediate_path
