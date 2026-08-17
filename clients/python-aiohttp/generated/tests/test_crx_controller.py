# coding: utf-8

import pytest
import json
from aiohttp import web
from aiohttp import FormData

from openapi_server.models.install_status import InstallStatus


pytestmark = pytest.mark.asyncio

async def test_get_crxde_status(client):
    """Test case for get_crxde_status

    
    """
    headers = { 
        'Accept': 'plain/text',
        'Authorization': 'BasicZm9vOmJhcg==',
    }
    response = await client.request(
        method='GET',
        path='/crx/server/crx.default/jcr:root/.1.json',
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_install_status(client):
    """Test case for get_install_status

    
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'BasicZm9vOmJhcg==',
    }
    response = await client.request(
        method='GET',
        path='/crx/packmgr/installstatus.jsp',
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_package_manager_servlet(client):
    """Test case for get_package_manager_servlet

    
    """
    headers = { 
        'Accept': 'text/html',
        'Authorization': 'BasicZm9vOmJhcg==',
    }
    response = await client.request(
        method='GET',
        path='/crx/packmgr/service/script.html',
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_post_package_service(client):
    """Test case for post_package_service

    
    """
    params = [('cmd', 'cmd_example')]
    headers = { 
        'Accept': 'text/xml',
        'Authorization': 'BasicZm9vOmJhcg==',
    }
    response = await client.request(
        method='POST',
        path='/crx/packmgr/service.jsp',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

@pytest.mark.skip("multipart/form-data not supported by Connexion")
async def test_post_package_service_json(client):
    """Test case for post_package_service_json

    
    """
    params = [('cmd', 'cmd_example'),
                    ('groupName', 'group_name_example'),
                    ('packageName', 'package_name_example'),
                    ('packageVersion', 'package_version_example'),
                    ('_charset_', 'charset__example'),
                    ('force', True),
                    ('recursive', True)]
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'multipart/form-data',
        'Authorization': 'BasicZm9vOmJhcg==',
    }
    data = FormData()
    data.add_field('package', '/path/to/file')
    response = await client.request(
        method='POST',
        path='/crx/packmgr/service/.json/{path}'.format(path='path_example'),
        headers=headers,
        data=data,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_post_package_update(client):
    """Test case for post_package_update

    
    """
    params = [('groupName', 'group_name_example'),
                    ('packageName', 'package_name_example'),
                    ('version', 'version_example'),
                    ('path', 'path_example'),
                    ('filter', 'filter_example'),
                    ('_charset_', 'charset__example')]
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'BasicZm9vOmJhcg==',
    }
    response = await client.request(
        method='POST',
        path='/crx/packmgr/update.jsp',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_post_set_password(client):
    """Test case for post_set_password

    
    """
    params = [('old', 'old_example'),
                    ('plain', 'plain_example'),
                    ('verify', 'verify_example')]
    headers = { 
        'Accept': 'text/plain',
        'Authorization': 'BasicZm9vOmJhcg==',
    }
    response = await client.request(
        method='POST',
        path='/crx/explorer/ui/setpassword.jsp',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')

