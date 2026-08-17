# coding: utf-8

from fastapi.testclient import TestClient


from pydantic import StrictStr  # noqa: F401
from typing import Any  # noqa: F401


def test_get_login_page(client: TestClient):
    """Test case for get_login_page

    
    """

    headers = {
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/libs/granite/core/content/login.html",
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_post_cq_actions(client: TestClient):
    """Test case for post_cq_actions

    
    """
    params = [("authorizable_id", 'authorizable_id_example'),     ("changelog", 'changelog_example')]
    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/.cqactions.html",
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

