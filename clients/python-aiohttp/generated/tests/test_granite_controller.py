# coding: utf-8

import pytest
import json
from aiohttp import web
from aiohttp import FormData



pytestmark = pytest.mark.asyncio

@pytest.mark.skip("multipart/form-data not supported by Connexion")
async def test_ssl_setup(client):
    """Test case for ssl_setup

    
    """
    params = [('keystorePassword', 'keystore_password_example'),
                    ('keystorePasswordConfirm', 'keystore_password_confirm_example'),
                    ('truststorePassword', 'truststore_password_example'),
                    ('truststorePasswordConfirm', 'truststore_password_confirm_example'),
                    ('httpsHostname', 'https_hostname_example'),
                    ('httpsPort', 'https_port_example')]
    headers = { 
        'Accept': 'text/plain',
        'Content-Type': 'multipart/form-data',
        'Authorization': 'BasicZm9vOmJhcg==',
    }
    data = FormData()
    data.add_field('privatekey_file', '/path/to/file')
    data.add_field('certificate_file', '/path/to/file')
    response = await client.request(
        method='POST',
        path='/libs/granite/security/post/sslSetup.html',
        headers=headers,
        data=data,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')

