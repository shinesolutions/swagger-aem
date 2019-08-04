import connexion
import six

from openapi_server.models.saml_configuration_info import SamlConfigurationInfo  # noqa: E501
from openapi_server import util


def get_aem_product_info():  # noqa: E501
    """get_aem_product_info

     # noqa: E501


    :rtype: List[str]
    """
    return 'do some magic!'


def get_config_mgr():  # noqa: E501
    """get_config_mgr

     # noqa: E501


    :rtype: str
    """
    return 'do some magic!'


def post_bundle(name, action):  # noqa: E501
    """post_bundle

     # noqa: E501

    :param name: 
    :type name: str
    :param action: 
    :type action: str

    :rtype: None
    """
    return 'do some magic!'


def post_jmx_repository(action):  # noqa: E501
    """post_jmx_repository

     # noqa: E501

    :param action: 
    :type action: str

    :rtype: None
    """
    return 'do some magic!'


def post_saml_configuration(post=None, apply=None, delete=None, action=None, location=None, path=None, service_ranking=None, idp_url=None, idp_cert_alias=None, idp_http_redirect=None, service_provider_entity_id=None, assertion_consumer_service_url=None, sp_private_key_alias=None, key_store_password=None, default_redirect_url=None, user_id_attribute=None, use_encryption=None, create_user=None, add_group_memberships=None, group_membership_attribute=None, default_groups=None, name_id_format=None, synchronize_attributes=None, handle_logout=None, logout_url=None, clock_tolerance=None, digest_method=None, signature_method=None, user_intermediate_path=None, propertylist=None):  # noqa: E501
    """post_saml_configuration

     # noqa: E501

    :param post: 
    :type post: bool
    :param apply: 
    :type apply: bool
    :param delete: 
    :type delete: bool
    :param action: 
    :type action: str
    :param location: 
    :type location: str
    :param path: 
    :type path: List[str]
    :param service_ranking: 
    :type service_ranking: int
    :param idp_url: 
    :type idp_url: str
    :param idp_cert_alias: 
    :type idp_cert_alias: str
    :param idp_http_redirect: 
    :type idp_http_redirect: bool
    :param service_provider_entity_id: 
    :type service_provider_entity_id: str
    :param assertion_consumer_service_url: 
    :type assertion_consumer_service_url: str
    :param sp_private_key_alias: 
    :type sp_private_key_alias: str
    :param key_store_password: 
    :type key_store_password: str
    :param default_redirect_url: 
    :type default_redirect_url: str
    :param user_id_attribute: 
    :type user_id_attribute: str
    :param use_encryption: 
    :type use_encryption: bool
    :param create_user: 
    :type create_user: bool
    :param add_group_memberships: 
    :type add_group_memberships: bool
    :param group_membership_attribute: 
    :type group_membership_attribute: str
    :param default_groups: 
    :type default_groups: List[str]
    :param name_id_format: 
    :type name_id_format: str
    :param synchronize_attributes: 
    :type synchronize_attributes: List[str]
    :param handle_logout: 
    :type handle_logout: bool
    :param logout_url: 
    :type logout_url: str
    :param clock_tolerance: 
    :type clock_tolerance: int
    :param digest_method: 
    :type digest_method: str
    :param signature_method: 
    :type signature_method: str
    :param user_intermediate_path: 
    :type user_intermediate_path: str
    :param propertylist: 
    :type propertylist: List[str]

    :rtype: SamlConfigurationInfo
    """
    return 'do some magic!'
