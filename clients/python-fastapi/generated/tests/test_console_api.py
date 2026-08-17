# coding: utf-8

from fastapi.testclient import TestClient


from pydantic import StrictBool, StrictInt, StrictStr  # noqa: F401
from typing import Any, List, Optional  # noqa: F401
from openapi_server.models.bundle_info import BundleInfo  # noqa: F401
from openapi_server.models.saml_configuration_info import SamlConfigurationInfo  # noqa: F401


def test_get_config_mgr(client: TestClient):
    """Test case for get_config_mgr

    
    """

    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/system/console/configMgr",
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_bundle_info(client: TestClient):
    """Test case for get_bundle_info

    
    """

    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/system/console/bundles/{name}.json".format(name='name_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_post_bundle(client: TestClient):
    """Test case for post_bundle

    
    """
    params = [("action", 'action_example')]
    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/system/console/bundles/{name}".format(name='name_example'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_post_jmx_repository(client: TestClient):
    """Test case for post_jmx_repository

    
    """

    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/system/console/jmx/com.adobe.granite:type=Repository/op/{action}".format(action='action_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_post_saml_configuration(client: TestClient):
    """Test case for post_saml_configuration

    
    """
    params = [("post", True),     ("apply", True),     ("delete", True),     ("action", 'action_example'),     ("location", 'location_example'),     ("path", ['path_example']),     ("service_ranking", 56),     ("idp_url", 'idp_url_example'),     ("idp_cert_alias", 'idp_cert_alias_example'),     ("idp_http_redirect", True),     ("service_provider_entity_id", 'service_provider_entity_id_example'),     ("assertion_consumer_service_url", 'assertion_consumer_service_url_example'),     ("sp_private_key_alias", 'sp_private_key_alias_example'),     ("key_store_password", 'key_store_password_example'),     ("default_redirect_url", 'default_redirect_url_example'),     ("user_id_attribute", 'user_id_attribute_example'),     ("use_encryption", True),     ("create_user", True),     ("add_group_memberships", True),     ("group_membership_attribute", 'group_membership_attribute_example'),     ("default_groups", ['default_groups_example']),     ("name_id_format", 'name_id_format_example'),     ("synchronize_attributes", ['synchronize_attributes_example']),     ("handle_logout", True),     ("logout_url", 'logout_url_example'),     ("clock_tolerance", 56),     ("digest_method", 'digest_method_example'),     ("signature_method", 'signature_method_example'),     ("user_intermediate_path", 'user_intermediate_path_example'),     ("propertylist", ['propertylist_example'])]
    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler",
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_aem_product_info(client: TestClient):
    """Test case for get_aem_product_info

    
    """

    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/system/console/status-productinfo.json",
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

