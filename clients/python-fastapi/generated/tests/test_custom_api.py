# coding: utf-8

from fastapi.testclient import TestClient


from pydantic import StrictBool, StrictStr  # noqa: F401
from typing import Any, List, Optional  # noqa: F401


def test_post_config_aem_password_reset(client: TestClient):
    """Test case for post_config_aem_password_reset

    
    """
    params = [("pwdreset_authorizables", ['pwdreset_authorizables_example']),     ("pwdreset_authorizables_type_hint", 'pwdreset_authorizables_type_hint_example')]
    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/apps/system/config/com.shinesolutions.aem.passwordreset.Activator",
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_post_config_aem_health_check_servlet(client: TestClient):
    """Test case for post_config_aem_health_check_servlet

    
    """
    params = [("bundles_ignored", ['bundles_ignored_example']),     ("bundles_ignored_type_hint", 'bundles_ignored_type_hint_example')]
    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck",
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_aem_health_check(client: TestClient):
    """Test case for get_aem_health_check

    
    """
    params = [("tags", 'tags_example'),     ("combine_tags_or", True)]
    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/system/health",
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

