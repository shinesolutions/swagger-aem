# coding: utf-8

import pytest
import json
from aiohttp import web



pytestmark = pytest.mark.asyncio

async def test_get_login_page(client):
    """Test case for get_login_page

    
    """
    headers = { 
        'Accept': 'text/html',
    }
    response = await client.request(
        method='GET',
        path='/libs/granite/core/content/login.html',
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_post_cq_actions(client):
    """Test case for post_cq_actions

    
    """
    params = [('authorizableId', 'authorizable_id_example'),
                    ('changelog', 'changelog_example')]
    headers = { 
        'Authorization': 'BasicZm9vOmJhcg==',
    }
    response = await client.request(
        method='POST',
        path='/.cqactions.html',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')

