# coding: utf-8

import pytest
import json
from aiohttp import web

from openapi_server.models.bundle_info import BundleInfo
from openapi_server.models.saml_configuration_info import SamlConfigurationInfo


pytestmark = pytest.mark.asyncio

async def test_get_aem_product_info(client):
    """Test case for get_aem_product_info

    
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'BasicZm9vOmJhcg==',
    }
    response = await client.request(
        method='GET',
        path='/system/console/status-productinfo.json',
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_bundle_info(client):
    """Test case for get_bundle_info

    
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'BasicZm9vOmJhcg==',
    }
    response = await client.request(
        method='GET',
        path='/system/console/bundles/{name_jso}'.format(name='name_example'),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_config_mgr(client):
    """Test case for get_config_mgr

    
    """
    headers = { 
        'Accept': 'text/xml',
        'Authorization': 'BasicZm9vOmJhcg==',
    }
    response = await client.request(
        method='GET',
        path='/system/console/configMgr',
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_post_bundle(client):
    """Test case for post_bundle

    
    """
    params = [('action', 'action_example')]
    headers = { 
        'Authorization': 'BasicZm9vOmJhcg==',
    }
    response = await client.request(
        method='POST',
        path='/system/console/bundles/{name}'.format(name='name_example'),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_post_jmx_repository(client):
    """Test case for post_jmx_repository

    
    """
    headers = { 
        'Authorization': 'BasicZm9vOmJhcg==',
    }
    response = await client.request(
        method='POST',
        path='/system/console/jmx/com.adobe.granite:type=Repository/op/{action}'.format(action='action_example'),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_post_saml_configuration(client):
    """Test case for post_saml_configuration

    
    """
    params = [('post', True),
                    ('apply', True),
                    ('delete', True),
                    ('action', 'action_example'),
                    ('$location', 'location_example'),
                    ('path', ['path_example']),
                    ('service.ranking', 56),
                    ('idpUrl', 'idp_url_example'),
                    ('idpCertAlias', 'idp_cert_alias_example'),
                    ('idpHttpRedirect', True),
                    ('serviceProviderEntityId', 'service_provider_entity_id_example'),
                    ('assertionConsumerServiceURL', 'assertion_consumer_service_url_example'),
                    ('spPrivateKeyAlias', 'sp_private_key_alias_example'),
                    ('keyStorePassword', 'key_store_password_example'),
                    ('defaultRedirectUrl', 'default_redirect_url_example'),
                    ('userIDAttribute', 'user_id_attribute_example'),
                    ('useEncryption', True),
                    ('createUser', True),
                    ('addGroupMemberships', True),
                    ('groupMembershipAttribute', 'group_membership_attribute_example'),
                    ('defaultGroups', ['default_groups_example']),
                    ('nameIdFormat', 'name_id_format_example'),
                    ('synchronizeAttributes', ['synchronize_attributes_example']),
                    ('handleLogout', True),
                    ('logoutUrl', 'logout_url_example'),
                    ('clockTolerance', 56),
                    ('digestMethod', 'digest_method_example'),
                    ('signatureMethod', 'signature_method_example'),
                    ('userIntermediatePath', 'user_intermediate_path_example'),
                    ('propertylist', ['propertylist_example'])]
    headers = { 
        'Accept': 'text/plain',
        'Authorization': 'BasicZm9vOmJhcg==',
    }
    response = await client.request(
        method='POST',
        path='/system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')

