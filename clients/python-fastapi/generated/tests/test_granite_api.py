# coding: utf-8

from fastapi.testclient import TestClient


from pydantic import StrictBytes, StrictStr  # noqa: F401
from typing import Optional, Tuple, Union  # noqa: F401
from fastapi import File, UploadFile  # noqa: F401


def test_ssl_setup(client: TestClient):
    """Test case for ssl_setup

    
    """
    params = [("keystore_password", 'keystore_password_example'),     ("keystore_password_confirm", 'keystore_password_confirm_example'),     ("truststore_password", 'truststore_password_example'),     ("truststore_password_confirm", 'truststore_password_confirm_example'),     ("https_hostname", 'https_hostname_example'),     ("https_port", 'https_port_example')]
    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
    }
    data = {
        "privatekey_file": None,
        "certificate_file": None
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/libs/granite/security/post/sslSetup.html",
    #    headers=headers,
    #    data=data,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

