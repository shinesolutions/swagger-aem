# coding: utf-8

import pytest
import json
from aiohttp import web
from aiohttp import FormData
from aiohttp import FormData
from aiohttp import FormData
from aiohttp import FormData

from openapi_server.models.keystore_info import KeystoreInfo
from openapi_server.models.truststore_info import TruststoreInfo


pytestmark = pytest.mark.asyncio

async def test_delete_agent(client):
    """Test case for delete_agent

    
    """
    headers = { 
        'Authorization': 'BasicZm9vOmJhcg==',
    }
    response = await client.request(
        method='DELETE',
        path='/etc/replication/agents.{runmode}/{name}'.format(runmode='runmode_example', name='name_example'),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_delete_node(client):
    """Test case for delete_node

    
    """
    headers = { 
        'Authorization': 'BasicZm9vOmJhcg==',
    }
    response = await client.request(
        method='DELETE',
        path='/{path}/{name}'.format(path='path_example', name='name_example'),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_agent(client):
    """Test case for get_agent

    
    """
    headers = { 
        'Authorization': 'BasicZm9vOmJhcg==',
    }
    response = await client.request(
        method='GET',
        path='/etc/replication/agents.{runmode}/{name}'.format(runmode='runmode_example', name='name_example'),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_agents(client):
    """Test case for get_agents

    
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'BasicZm9vOmJhcg==',
    }
    response = await client.request(
        method='GET',
        path='/etc/replication/agents.{runmode}.-1.json'.format(runmode='runmode_example'),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_authorizable_keystore(client):
    """Test case for get_authorizable_keystore

    
    """
    headers = { 
        'Accept': 'text/plain',
        'Authorization': 'BasicZm9vOmJhcg==',
    }
    response = await client.request(
        method='GET',
        path='/{intermediate_path}/{authorizable_id_ks_jso}'.format(intermediate_path='intermediate_path_example', authorizable_id='authorizable_id_example'),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_keystore(client):
    """Test case for get_keystore

    
    """
    headers = { 
        'Accept': 'application/octet-stream',
        'Authorization': 'BasicZm9vOmJhcg==',
    }
    response = await client.request(
        method='GET',
        path='/{intermediate_path}/{authorizable_id}/keystore/store.p12'.format(intermediate_path='intermediate_path_example', authorizable_id='authorizable_id_example'),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_node(client):
    """Test case for get_node

    
    """
    headers = { 
        'Authorization': 'BasicZm9vOmJhcg==',
    }
    response = await client.request(
        method='GET',
        path='/{path}/{name}'.format(path='path_example', name='name_example'),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_package(client):
    """Test case for get_package

    
    """
    headers = { 
        'Accept': 'application/octet-stream',
        'Authorization': 'BasicZm9vOmJhcg==',
    }
    response = await client.request(
        method='GET',
        path='/etc/packages/{group}/{name_version_zi}'.format(group='group_example', name='name_example', version='version_example'),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_package_filter(client):
    """Test case for get_package_filter

    
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'BasicZm9vOmJhcg==',
    }
    response = await client.request(
        method='GET',
        path='/etc/packages/{group}/{name_version_zi}/jcr:content/vlt:definition/filter.tidy.2.json'.format(group='group_example', name='name_example', version='version_example'),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_query(client):
    """Test case for get_query

    
    """
    params = [('path', 'path_example'),
                    ('p.limit', 3.4),
                    ('1_property', '_1_property_example'),
                    ('1_property.value', '_1_property_value_example')]
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'BasicZm9vOmJhcg==',
    }
    response = await client.request(
        method='GET',
        path='/bin/querybuilder.json',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_truststore(client):
    """Test case for get_truststore

    
    """
    headers = { 
        'Accept': 'application/octet-stream',
        'Authorization': 'BasicZm9vOmJhcg==',
    }
    response = await client.request(
        method='GET',
        path='/etc/truststore/truststore.p12',
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_truststore_info(client):
    """Test case for get_truststore_info

    
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'BasicZm9vOmJhcg==',
    }
    response = await client.request(
        method='GET',
        path='/libs/granite/security/truststore.json',
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_post_agent(client):
    """Test case for post_agent

    
    """
    params = [('jcr:content/cq:distribute', True),
                    ('jcr:content/cq:distribute@TypeHint', 'jcr_content_cq_distribute_type_hint_example'),
                    ('jcr:content/cq:name', 'jcr_content_cq_name_example'),
                    ('jcr:content/cq:template', 'jcr_content_cq_template_example'),
                    ('jcr:content/aliasUpdate', True),
                    ('jcr:content/enabled', True),
                    ('jcr:content/jcr:description', 'jcr_content_jcr_description_example'),
                    ('jcr:content/jcr:lastModified', 'jcr_content_jcr_last_modified_example'),
                    ('jcr:content/jcr:lastModifiedBy', 'jcr_content_jcr_last_modified_by_example'),
                    ('jcr:content/jcr:mixinTypes', 'jcr_content_jcr_mixin_types_example'),
                    ('jcr:content/jcr:title', 'jcr_content_jcr_title_example'),
                    ('jcr:content/logLevel', 'jcr_content_log_level_example'),
                    ('jcr:content/noStatusUpdate', True),
                    ('jcr:content/noVersioning', True),
                    ('jcr:content/protocolConnectTimeout', 3.4),
                    ('jcr:content/protocolHTTPConnectionClosed', True),
                    ('jcr:content/protocolHTTPExpired', 'jcr_content_protocol_http_expired_example'),
                    ('jcr:content/protocolHTTPHeaders', ['jcr_content_protocol_http_headers_example']),
                    ('jcr:content/protocolHTTPHeaders@TypeHint', 'jcr_content_protocol_http_headers_type_hint_example'),
                    ('jcr:content/protocolHTTPMethod', 'jcr_content_protocol_http_method_example'),
                    ('jcr:content/protocolHTTPSRelaxed', True),
                    ('jcr:content/protocolInterface', 'jcr_content_protocol_interface_example'),
                    ('jcr:content/protocolSocketTimeout', 3.4),
                    ('jcr:content/protocolVersion', 'jcr_content_protocol_version_example'),
                    ('jcr:content/proxyNTLMDomain', 'jcr_content_proxy_ntlm_domain_example'),
                    ('jcr:content/proxyNTLMHost', 'jcr_content_proxy_ntlm_host_example'),
                    ('jcr:content/proxyHost', 'jcr_content_proxy_host_example'),
                    ('jcr:content/proxyPassword', 'jcr_content_proxy_password_example'),
                    ('jcr:content/proxyPort', 3.4),
                    ('jcr:content/proxyUser', 'jcr_content_proxy_user_example'),
                    ('jcr:content/queueBatchMaxSize', 3.4),
                    ('jcr:content/queueBatchMode', 'jcr_content_queue_batch_mode_example'),
                    ('jcr:content/queueBatchWaitTime', 3.4),
                    ('jcr:content/retryDelay', 'jcr_content_retry_delay_example'),
                    ('jcr:content/reverseReplication', True),
                    ('jcr:content/serializationType', 'jcr_content_serialization_type_example'),
                    ('jcr:content/sling:resourceType', 'jcr_content_sling_resource_type_example'),
                    ('jcr:content/ssl', 'jcr_content_ssl_example'),
                    ('jcr:content/transportNTLMDomain', 'jcr_content_transport_ntlm_domain_example'),
                    ('jcr:content/transportNTLMHost', 'jcr_content_transport_ntlm_host_example'),
                    ('jcr:content/transportPassword', 'jcr_content_transport_password_example'),
                    ('jcr:content/transportUri', 'jcr_content_transport_uri_example'),
                    ('jcr:content/transportUser', 'jcr_content_transport_user_example'),
                    ('jcr:content/triggerDistribute', True),
                    ('jcr:content/triggerModified', True),
                    ('jcr:content/triggerOnOffTime', True),
                    ('jcr:content/triggerReceive', True),
                    ('jcr:content/triggerSpecific', True),
                    ('jcr:content/userId', 'jcr_content_user_id_example'),
                    ('jcr:primaryType', 'jcr_primary_type_example'),
                    (':operation', 'operation_example')]
    headers = { 
        'Authorization': 'BasicZm9vOmJhcg==',
    }
    response = await client.request(
        method='POST',
        path='/etc/replication/agents.{runmode}/{name}'.format(runmode='runmode_example', name='name_example'),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

@pytest.mark.skip("multipart/form-data not supported by Connexion")
async def test_post_authorizable_keystore(client):
    """Test case for post_authorizable_keystore

    
    """
    params = [(':operation', 'operation_example'),
                    ('currentPassword', 'current_password_example'),
                    ('newPassword', 'new_password_example'),
                    ('rePassword', 're_password_example'),
                    ('keyPassword', 'key_password_example'),
                    ('keyStorePass', 'key_store_pass_example'),
                    ('alias', 'alias_example'),
                    ('newAlias', 'new_alias_example'),
                    ('removeAlias', 'remove_alias_example')]
    headers = { 
        'Accept': 'text/plain',
        'Content-Type': 'multipart/form-data',
        'Authorization': 'BasicZm9vOmJhcg==',
    }
    data = FormData()
    data.add_field('cert_chain', '/path/to/file')
    data.add_field('pk', '/path/to/file')
    data.add_field('key_store', '/path/to/file')
    response = await client.request(
        method='POST',
        path='/{intermediate_path}/{authorizable_id_ks_htm}'.format(intermediate_path='intermediate_path_example', authorizable_id='authorizable_id_example'),
        headers=headers,
        data=data,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_post_authorizables(client):
    """Test case for post_authorizables

    
    """
    params = [('authorizableId', 'authorizable_id_example'),
                    ('intermediatePath', 'intermediate_path_example'),
                    ('createUser', 'create_user_example'),
                    ('createGroup', 'create_group_example'),
                    ('rep:password', 'rep_password_example'),
                    ('profile/givenName', 'profile_given_name_example')]
    headers = { 
        'Accept': 'text/html',
        'Authorization': 'BasicZm9vOmJhcg==',
    }
    response = await client.request(
        method='POST',
        path='/libs/granite/security/post/authorizables',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_post_config_adobe_granite_saml_authentication_handler(client):
    """Test case for post_config_adobe_granite_saml_authentication_handler

    
    """
    params = [('keyStorePassword', 'key_store_password_example'),
                    ('keyStorePassword@TypeHint', 'key_store_password_type_hint_example'),
                    ('service.ranking', 56),
                    ('service.ranking@TypeHint', 'service_ranking_type_hint_example'),
                    ('idpHttpRedirect', True),
                    ('idpHttpRedirect@TypeHint', 'idp_http_redirect_type_hint_example'),
                    ('createUser', True),
                    ('createUser@TypeHint', 'create_user_type_hint_example'),
                    ('defaultRedirectUrl', 'default_redirect_url_example'),
                    ('defaultRedirectUrl@TypeHint', 'default_redirect_url_type_hint_example'),
                    ('userIDAttribute', 'user_id_attribute_example'),
                    ('userIDAttribute@TypeHint', 'user_id_attribute_type_hint_example'),
                    ('defaultGroups', ['default_groups_example']),
                    ('defaultGroups@TypeHint', 'default_groups_type_hint_example'),
                    ('idpCertAlias', 'idp_cert_alias_example'),
                    ('idpCertAlias@TypeHint', 'idp_cert_alias_type_hint_example'),
                    ('addGroupMemberships', True),
                    ('addGroupMemberships@TypeHint', 'add_group_memberships_type_hint_example'),
                    ('path', ['path_example']),
                    ('path@TypeHint', 'path_type_hint_example'),
                    ('synchronizeAttributes', ['synchronize_attributes_example']),
                    ('synchronizeAttributes@TypeHint', 'synchronize_attributes_type_hint_example'),
                    ('clockTolerance', 56),
                    ('clockTolerance@TypeHint', 'clock_tolerance_type_hint_example'),
                    ('groupMembershipAttribute', 'group_membership_attribute_example'),
                    ('groupMembershipAttribute@TypeHint', 'group_membership_attribute_type_hint_example'),
                    ('idpUrl', 'idp_url_example'),
                    ('idpUrl@TypeHint', 'idp_url_type_hint_example'),
                    ('logoutUrl', 'logout_url_example'),
                    ('logoutUrl@TypeHint', 'logout_url_type_hint_example'),
                    ('serviceProviderEntityId', 'service_provider_entity_id_example'),
                    ('serviceProviderEntityId@TypeHint', 'service_provider_entity_id_type_hint_example'),
                    ('assertionConsumerServiceURL', 'assertion_consumer_service_url_example'),
                    ('assertionConsumerServiceURL@TypeHint', 'assertion_consumer_service_url_type_hint_example'),
                    ('handleLogout', True),
                    ('handleLogout@TypeHint', 'handle_logout_type_hint_example'),
                    ('spPrivateKeyAlias', 'sp_private_key_alias_example'),
                    ('spPrivateKeyAlias@TypeHint', 'sp_private_key_alias_type_hint_example'),
                    ('useEncryption', True),
                    ('useEncryption@TypeHint', 'use_encryption_type_hint_example'),
                    ('nameIdFormat', 'name_id_format_example'),
                    ('nameIdFormat@TypeHint', 'name_id_format_type_hint_example'),
                    ('digestMethod', 'digest_method_example'),
                    ('digestMethod@TypeHint', 'digest_method_type_hint_example'),
                    ('signatureMethod', 'signature_method_example'),
                    ('signatureMethod@TypeHint', 'signature_method_type_hint_example'),
                    ('userIntermediatePath', 'user_intermediate_path_example'),
                    ('userIntermediatePath@TypeHint', 'user_intermediate_path_type_hint_example')]
    headers = { 
        'Authorization': 'BasicZm9vOmJhcg==',
    }
    response = await client.request(
        method='POST',
        path='/apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_post_config_apache_felix_jetty_based_http_service(client):
    """Test case for post_config_apache_felix_jetty_based_http_service

    
    """
    params = [('org.apache.felix.https.nio', True),
                    ('org.apache.felix.https.nio@TypeHint', 'org_apache_felix_https_nio_type_hint_example'),
                    ('org.apache.felix.https.keystore', 'org_apache_felix_https_keystore_example'),
                    ('org.apache.felix.https.keystore@TypeHint', 'org_apache_felix_https_keystore_type_hint_example'),
                    ('org.apache.felix.https.keystore.password', 'org_apache_felix_https_keystore_password_example'),
                    ('org.apache.felix.https.keystore.password@TypeHint', 'org_apache_felix_https_keystore_password_type_hint_example'),
                    ('org.apache.felix.https.keystore.key', 'org_apache_felix_https_keystore_key_example'),
                    ('org.apache.felix.https.keystore.key@TypeHint', 'org_apache_felix_https_keystore_key_type_hint_example'),
                    ('org.apache.felix.https.keystore.key.password', 'org_apache_felix_https_keystore_key_password_example'),
                    ('org.apache.felix.https.keystore.key.password@TypeHint', 'org_apache_felix_https_keystore_key_password_type_hint_example'),
                    ('org.apache.felix.https.truststore', 'org_apache_felix_https_truststore_example'),
                    ('org.apache.felix.https.truststore@TypeHint', 'org_apache_felix_https_truststore_type_hint_example'),
                    ('org.apache.felix.https.truststore.password', 'org_apache_felix_https_truststore_password_example'),
                    ('org.apache.felix.https.truststore.password@TypeHint', 'org_apache_felix_https_truststore_password_type_hint_example'),
                    ('org.apache.felix.https.clientcertificate', 'org_apache_felix_https_clientcertificate_example'),
                    ('org.apache.felix.https.clientcertificate@TypeHint', 'org_apache_felix_https_clientcertificate_type_hint_example'),
                    ('org.apache.felix.https.enable', True),
                    ('org.apache.felix.https.enable@TypeHint', 'org_apache_felix_https_enable_type_hint_example'),
                    ('org.osgi.service.http.port.secure', 'org_osgi_service_http_port_secure_example'),
                    ('org.osgi.service.http.port.secure@TypeHint', 'org_osgi_service_http_port_secure_type_hint_example')]
    headers = { 
        'Authorization': 'BasicZm9vOmJhcg==',
    }
    response = await client.request(
        method='POST',
        path='/apps/system/config/org.apache.felix.http',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_post_config_apache_http_components_proxy_configuration(client):
    """Test case for post_config_apache_http_components_proxy_configuration

    
    """
    params = [('proxy.host', 'proxy_host_example'),
                    ('proxy.host@TypeHint', 'proxy_host_type_hint_example'),
                    ('proxy.port', 56),
                    ('proxy.port@TypeHint', 'proxy_port_type_hint_example'),
                    ('proxy.exceptions', ['proxy_exceptions_example']),
                    ('proxy.exceptions@TypeHint', 'proxy_exceptions_type_hint_example'),
                    ('proxy.enabled', True),
                    ('proxy.enabled@TypeHint', 'proxy_enabled_type_hint_example'),
                    ('proxy.user', 'proxy_user_example'),
                    ('proxy.user@TypeHint', 'proxy_user_type_hint_example'),
                    ('proxy.password', 'proxy_password_example'),
                    ('proxy.password@TypeHint', 'proxy_password_type_hint_example')]
    headers = { 
        'Authorization': 'BasicZm9vOmJhcg==',
    }
    response = await client.request(
        method='POST',
        path='/apps/system/config/org.apache.http.proxyconfigurator.config',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_post_config_apache_sling_dav_ex_servlet(client):
    """Test case for post_config_apache_sling_dav_ex_servlet

    
    """
    params = [('alias', 'alias_example'),
                    ('alias@TypeHint', 'alias_type_hint_example'),
                    ('dav.create-absolute-uri', True),
                    ('dav.create-absolute-uri@TypeHint', 'dav_create_absolute_uri_type_hint_example')]
    headers = { 
        'Authorization': 'BasicZm9vOmJhcg==',
    }
    response = await client.request(
        method='POST',
        path='/apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_post_config_apache_sling_get_servlet(client):
    """Test case for post_config_apache_sling_get_servlet

    
    """
    params = [('json.maximumresults', 'json_maximumresults_example'),
                    ('json.maximumresults@TypeHint', 'json_maximumresults_type_hint_example'),
                    ('enable.html', True),
                    ('enable.html@TypeHint', 'enable_html_type_hint_example'),
                    ('enable.txt', True),
                    ('enable.txt@TypeHint', 'enable_txt_type_hint_example'),
                    ('enable.xml', True),
                    ('enable.xml@TypeHint', 'enable_xml_type_hint_example')]
    headers = { 
        'Authorization': 'BasicZm9vOmJhcg==',
    }
    response = await client.request(
        method='POST',
        path='/apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_post_config_apache_sling_referrer_filter(client):
    """Test case for post_config_apache_sling_referrer_filter

    
    """
    params = [('allow.empty', True),
                    ('allow.empty@TypeHint', 'allow_empty_type_hint_example'),
                    ('allow.hosts', 'allow_hosts_example'),
                    ('allow.hosts@TypeHint', 'allow_hosts_type_hint_example'),
                    ('allow.hosts.regexp', 'allow_hosts_regexp_example'),
                    ('allow.hosts.regexp@TypeHint', 'allow_hosts_regexp_type_hint_example'),
                    ('filter.methods', 'filter_methods_example'),
                    ('filter.methods@TypeHint', 'filter_methods_type_hint_example')]
    headers = { 
        'Authorization': 'BasicZm9vOmJhcg==',
    }
    response = await client.request(
        method='POST',
        path='/apps/system/config/org.apache.sling.security.impl.ReferrerFilter',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_post_config_property(client):
    """Test case for post_config_property

    
    """
    headers = { 
        'Authorization': 'BasicZm9vOmJhcg==',
    }
    response = await client.request(
        method='POST',
        path='/apps/system/config/{config_node_name}'.format(config_node_name='config_node_name_example'),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

@pytest.mark.skip("multipart/form-data not supported by Connexion")
async def test_post_node(client):
    """Test case for post_node

    
    """
    params = [(':operation', 'operation_example'),
                    ('deleteAuthorizable', 'delete_authorizable_example')]
    headers = { 
        'Content-Type': 'multipart/form-data',
        'Authorization': 'BasicZm9vOmJhcg==',
    }
    data = FormData()
    data.add_field('file', '/path/to/file')
    response = await client.request(
        method='POST',
        path='/{path}/{name}'.format(path='path_example', name='name_example'),
        headers=headers,
        data=data,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_post_node_rw(client):
    """Test case for post_node_rw

    
    """
    params = [('addMembers', 'add_members_example')]
    headers = { 
        'Authorization': 'BasicZm9vOmJhcg==',
    }
    response = await client.request(
        method='POST',
        path='/{path}/{name_rw_htm}'.format(path='path_example', name='name_example'),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_post_path(client):
    """Test case for post_path

    
    """
    params = [('jcr:primaryType', 'jcr_primary_type_example'),
                    (':name', 'name_example')]
    headers = { 
        'Authorization': 'BasicZm9vOmJhcg==',
    }
    response = await client.request(
        method='POST',
        path='/{path}'.format(path='path_example'),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_post_query(client):
    """Test case for post_query

    
    """
    params = [('path', 'path_example'),
                    ('p.limit', 3.4),
                    ('1_property', '_1_property_example'),
                    ('1_property.value', '_1_property_value_example')]
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'BasicZm9vOmJhcg==',
    }
    response = await client.request(
        method='POST',
        path='/bin/querybuilder.json',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_post_tree_activation(client):
    """Test case for post_tree_activation

    
    """
    params = [('ignoredeactivated', True),
                    ('onlymodified', True),
                    ('path', 'path_example'),
                    ('cmd', 'activate')]
    headers = { 
        'Authorization': 'BasicZm9vOmJhcg==',
    }
    response = await client.request(
        method='POST',
        path='/libs/replication/treeactivation.html',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

@pytest.mark.skip("multipart/form-data not supported by Connexion")
async def test_post_truststore(client):
    """Test case for post_truststore

    
    """
    params = [(':operation', 'operation_example'),
                    ('newPassword', 'new_password_example'),
                    ('rePassword', 're_password_example'),
                    ('keyStoreType', 'key_store_type_example'),
                    ('removeAlias', 'remove_alias_example')]
    headers = { 
        'Accept': 'text/plain',
        'Content-Type': 'multipart/form-data',
        'Authorization': 'BasicZm9vOmJhcg==',
    }
    data = FormData()
    data.add_field('certificate', '/path/to/file')
    response = await client.request(
        method='POST',
        path='/libs/granite/security/post/truststore',
        headers=headers,
        data=data,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

@pytest.mark.skip("multipart/form-data not supported by Connexion")
async def test_post_truststore_pkcs12(client):
    """Test case for post_truststore_pkcs12

    
    """
    headers = { 
        'Accept': 'text/plain',
        'Content-Type': 'multipart/form-data',
        'Authorization': 'BasicZm9vOmJhcg==',
    }
    data = FormData()
    data.add_field('truststore_p12', '/path/to/file')
    response = await client.request(
        method='POST',
        path='/etc/truststore',
        headers=headers,
        data=data,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')

