# coding: utf-8

from fastapi.testclient import TestClient


from pydantic import StrictBool, StrictBytes, StrictStr  # noqa: F401
from typing import Optional, Tuple, Union  # noqa: F401
from openapi_server.models.install_status import InstallStatus  # noqa: F401
from fastapi import File, UploadFile  # noqa: F401


def test_post_set_password(client: TestClient):
    """Test case for post_set_password

    
    """
    params = [("old", 'old_example'),     ("plain", 'plain_example'),     ("verify", 'verify_example')]
    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/crx/explorer/ui/setpassword.jsp",
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_install_status(client: TestClient):
    """Test case for get_install_status

    
    """

    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/crx/packmgr/installstatus.jsp",
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_post_package_service(client: TestClient):
    """Test case for post_package_service

    
    """
    params = [("cmd", 'cmd_example')]
    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/crx/packmgr/service.jsp",
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_post_package_update(client: TestClient):
    """Test case for post_package_update

    
    """
    params = [("group_name", 'group_name_example'),     ("package_name", 'package_name_example'),     ("version", 'version_example'),     ("path", 'path_example'),     ("filter", 'filter_example'),     ("charset_", 'charset__example')]
    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/crx/packmgr/update.jsp",
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_post_package_service_json(client: TestClient):
    """Test case for post_package_service_json

    
    """
    params = [("cmd", 'cmd_example'),     ("group_name", 'group_name_example'),     ("package_name", 'package_name_example'),     ("package_version", 'package_version_example'),     ("charset_", 'charset__example'),     ("force", True),     ("recursive", True)]
    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
    }
    data = {
        "package": None
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/crx/packmgr/service/.json/{path}".format(path='path_example'),
    #    headers=headers,
    #    data=data,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_package_manager_servlet(client: TestClient):
    """Test case for get_package_manager_servlet

    
    """

    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/crx/packmgr/service/script.html",
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_crxde_status(client: TestClient):
    """Test case for get_crxde_status

    
    """

    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/crx/server/crx.default/jcr:root/.1.json",
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

