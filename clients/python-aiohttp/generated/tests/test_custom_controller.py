# coding: utf-8

import pytest
import json
from aiohttp import web



pytestmark = pytest.mark.asyncio

async def test_get_aem_health_check(client):
    """Test case for get_aem_health_check

    
    """
    params = [('tags', 'tags_example'),
                    ('combineTagsOr', True)]
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'BasicZm9vOmJhcg==',
    }
    response = await client.request(
        method='GET',
        path='/system/health',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_post_config_aem_health_check_servlet(client):
    """Test case for post_config_aem_health_check_servlet

    
    """
    params = [('bundles.ignored', ['bundles_ignored_example']),
                    ('bundles.ignored@TypeHint', 'bundles_ignored_type_hint_example')]
    headers = { 
        'Authorization': 'BasicZm9vOmJhcg==',
    }
    response = await client.request(
        method='POST',
        path='/apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_post_config_aem_password_reset(client):
    """Test case for post_config_aem_password_reset

    
    """
    params = [('pwdreset.authorizables', ['pwdreset_authorizables_example']),
                    ('pwdreset.authorizables@TypeHint', 'pwdreset_authorizables_type_hint_example')]
    headers = { 
        'Authorization': 'BasicZm9vOmJhcg==',
    }
    response = await client.request(
        method='POST',
        path='/apps/system/config/com.shinesolutions.aem.passwordreset.Activator',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')

