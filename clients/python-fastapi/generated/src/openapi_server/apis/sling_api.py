# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from openapi_server.apis.sling_api_base import BaseSlingApi
import openapi_server.impl

from fastapi import (  # noqa: F401
    APIRouter,
    Body,
    Cookie,
    Depends,
    Form,
    Header,
    HTTPException,
    Path,
    Query,
    Response,
    Security,
    status,
)

from openapi_server.models.extra_models import TokenModel  # noqa: F401
from pydantic import StrictBool, StrictBytes, StrictFloat, StrictInt, StrictStr
from typing import Any, List, Optional, Tuple, Union
from openapi_server.models.keystore_info import KeystoreInfo
from openapi_server.models.truststore_info import TruststoreInfo
from fastapi import File, UploadFile
from openapi_server.security_api import get_token_aemAuth

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.post(
    "/{path}/",
    responses={
        "default": {"description": "Default response"},
    },
    tags=["sling"],
    response_model_by_alias=True,
)
async def post_path(
    path: StrictStr = Path(..., description=""),
    jcr_primary_type: StrictStr = Query(None, description="", alias="jcr:primaryType"),
    name: StrictStr = Query(None, description="", alias=":name"),
    token_aemAuth: TokenModel = Security(
        get_token_aemAuth
    ),
) -> None:
    if not BaseSlingApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseSlingApi.subclasses[0]().post_path(path, jcr_primary_type, name)


@router.get(
    "/{path}/{name}",
    responses={
        "default": {"description": "Default response"},
    },
    tags=["sling"],
    response_model_by_alias=True,
)
async def get_node(
    path: StrictStr = Path(..., description=""),
    name: StrictStr = Path(..., description=""),
    token_aemAuth: TokenModel = Security(
        get_token_aemAuth
    ),
) -> None:
    if not BaseSlingApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseSlingApi.subclasses[0]().get_node(path, name)


@router.post(
    "/{path}/{name}",
    responses={
        "default": {"description": "Default response"},
    },
    tags=["sling"],
    response_model_by_alias=True,
)
async def post_node(
    path: StrictStr = Path(..., description=""),
    name: StrictStr = Path(..., description=""),
    operation: Optional[StrictStr] = Query(None, description="", alias=":operation"),
    delete_authorizable: Optional[StrictStr] = Query(None, description="", alias="deleteAuthorizable"),
    file: Optional[UploadFile] = File(None, description=""),
    token_aemAuth: TokenModel = Security(
        get_token_aemAuth
    ),
) -> None:
    if not BaseSlingApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseSlingApi.subclasses[0]().post_node(path, name, operation, delete_authorizable, file)


@router.delete(
    "/{path}/{name}",
    responses={
        "default": {"description": "Default response"},
    },
    tags=["sling"],
    response_model_by_alias=True,
)
async def delete_node(
    path: StrictStr = Path(..., description=""),
    name: StrictStr = Path(..., description=""),
    token_aemAuth: TokenModel = Security(
        get_token_aemAuth
    ),
) -> None:
    if not BaseSlingApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseSlingApi.subclasses[0]().delete_node(path, name)


@router.post(
    "/{path}/{name}.rw.html",
    responses={
        "default": {"description": "Default response"},
    },
    tags=["sling"],
    response_model_by_alias=True,
)
async def post_node_rw(
    path: StrictStr = Path(..., description=""),
    name: StrictStr = Path(..., description=""),
    add_members: Optional[StrictStr] = Query(None, description="", alias="addMembers"),
    token_aemAuth: TokenModel = Security(
        get_token_aemAuth
    ),
) -> None:
    if not BaseSlingApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseSlingApi.subclasses[0]().post_node_rw(path, name, add_members)


@router.post(
    "/apps/system/config/{configNodeName}",
    responses={
        "default": {"description": "Default response"},
    },
    tags=["sling"],
    response_model_by_alias=True,
)
async def post_config_property(
    configNodeName: StrictStr = Path(..., description=""),
    token_aemAuth: TokenModel = Security(
        get_token_aemAuth
    ),
) -> None:
    if not BaseSlingApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseSlingApi.subclasses[0]().post_config_property(configNodeName)


@router.post(
    "/apps/system/config/org.apache.felix.http",
    responses={
        "default": {"description": "Default response"},
    },
    tags=["sling"],
    response_model_by_alias=True,
)
async def post_config_apache_felix_jetty_based_http_service(
    org_apache_felix_https_nio: Optional[StrictBool] = Query(None, description="", alias="org.apache.felix.https.nio"),
    org_apache_felix_https_nio_type_hint: Optional[StrictStr] = Query(None, description="", alias="org.apache.felix.https.nio@TypeHint"),
    org_apache_felix_https_keystore: Optional[StrictStr] = Query(None, description="", alias="org.apache.felix.https.keystore"),
    org_apache_felix_https_keystore_type_hint: Optional[StrictStr] = Query(None, description="", alias="org.apache.felix.https.keystore@TypeHint"),
    org_apache_felix_https_keystore_password: Optional[StrictStr] = Query(None, description="", alias="org.apache.felix.https.keystore.password"),
    org_apache_felix_https_keystore_password_type_hint: Optional[StrictStr] = Query(None, description="", alias="org.apache.felix.https.keystore.password@TypeHint"),
    org_apache_felix_https_keystore_key: Optional[StrictStr] = Query(None, description="", alias="org.apache.felix.https.keystore.key"),
    org_apache_felix_https_keystore_key_type_hint: Optional[StrictStr] = Query(None, description="", alias="org.apache.felix.https.keystore.key@TypeHint"),
    org_apache_felix_https_keystore_key_password: Optional[StrictStr] = Query(None, description="", alias="org.apache.felix.https.keystore.key.password"),
    org_apache_felix_https_keystore_key_password_type_hint: Optional[StrictStr] = Query(None, description="", alias="org.apache.felix.https.keystore.key.password@TypeHint"),
    org_apache_felix_https_truststore: Optional[StrictStr] = Query(None, description="", alias="org.apache.felix.https.truststore"),
    org_apache_felix_https_truststore_type_hint: Optional[StrictStr] = Query(None, description="", alias="org.apache.felix.https.truststore@TypeHint"),
    org_apache_felix_https_truststore_password: Optional[StrictStr] = Query(None, description="", alias="org.apache.felix.https.truststore.password"),
    org_apache_felix_https_truststore_password_type_hint: Optional[StrictStr] = Query(None, description="", alias="org.apache.felix.https.truststore.password@TypeHint"),
    org_apache_felix_https_clientcertificate: Optional[StrictStr] = Query(None, description="", alias="org.apache.felix.https.clientcertificate"),
    org_apache_felix_https_clientcertificate_type_hint: Optional[StrictStr] = Query(None, description="", alias="org.apache.felix.https.clientcertificate@TypeHint"),
    org_apache_felix_https_enable: Optional[StrictBool] = Query(None, description="", alias="org.apache.felix.https.enable"),
    org_apache_felix_https_enable_type_hint: Optional[StrictStr] = Query(None, description="", alias="org.apache.felix.https.enable@TypeHint"),
    org_osgi_service_http_port_secure: Optional[StrictStr] = Query(None, description="", alias="org.osgi.service.http.port.secure"),
    org_osgi_service_http_port_secure_type_hint: Optional[StrictStr] = Query(None, description="", alias="org.osgi.service.http.port.secure@TypeHint"),
    token_aemAuth: TokenModel = Security(
        get_token_aemAuth
    ),
) -> None:
    if not BaseSlingApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseSlingApi.subclasses[0]().post_config_apache_felix_jetty_based_http_service(org_apache_felix_https_nio, org_apache_felix_https_nio_type_hint, org_apache_felix_https_keystore, org_apache_felix_https_keystore_type_hint, org_apache_felix_https_keystore_password, org_apache_felix_https_keystore_password_type_hint, org_apache_felix_https_keystore_key, org_apache_felix_https_keystore_key_type_hint, org_apache_felix_https_keystore_key_password, org_apache_felix_https_keystore_key_password_type_hint, org_apache_felix_https_truststore, org_apache_felix_https_truststore_type_hint, org_apache_felix_https_truststore_password, org_apache_felix_https_truststore_password_type_hint, org_apache_felix_https_clientcertificate, org_apache_felix_https_clientcertificate_type_hint, org_apache_felix_https_enable, org_apache_felix_https_enable_type_hint, org_osgi_service_http_port_secure, org_osgi_service_http_port_secure_type_hint)


@router.post(
    "/apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet",
    responses={
        "default": {"description": "Default response"},
    },
    tags=["sling"],
    response_model_by_alias=True,
)
async def post_config_apache_sling_get_servlet(
    json_maximumresults: Optional[StrictStr] = Query(None, description="", alias="json.maximumresults"),
    json_maximumresults_type_hint: Optional[StrictStr] = Query(None, description="", alias="json.maximumresults@TypeHint"),
    enable_html: Optional[StrictBool] = Query(None, description="", alias="enable.html"),
    enable_html_type_hint: Optional[StrictStr] = Query(None, description="", alias="enable.html@TypeHint"),
    enable_txt: Optional[StrictBool] = Query(None, description="", alias="enable.txt"),
    enable_txt_type_hint: Optional[StrictStr] = Query(None, description="", alias="enable.txt@TypeHint"),
    enable_xml: Optional[StrictBool] = Query(None, description="", alias="enable.xml"),
    enable_xml_type_hint: Optional[StrictStr] = Query(None, description="", alias="enable.xml@TypeHint"),
    token_aemAuth: TokenModel = Security(
        get_token_aemAuth
    ),
) -> None:
    if not BaseSlingApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseSlingApi.subclasses[0]().post_config_apache_sling_get_servlet(json_maximumresults, json_maximumresults_type_hint, enable_html, enable_html_type_hint, enable_txt, enable_txt_type_hint, enable_xml, enable_xml_type_hint)


@router.post(
    "/apps/system/config/org.apache.sling.security.impl.ReferrerFilter",
    responses={
        "default": {"description": "Default response"},
    },
    tags=["sling"],
    response_model_by_alias=True,
)
async def post_config_apache_sling_referrer_filter(
    allow_empty: Optional[StrictBool] = Query(None, description="", alias="allow.empty"),
    allow_empty_type_hint: Optional[StrictStr] = Query(None, description="", alias="allow.empty@TypeHint"),
    allow_hosts: Optional[StrictStr] = Query(None, description="", alias="allow.hosts"),
    allow_hosts_type_hint: Optional[StrictStr] = Query(None, description="", alias="allow.hosts@TypeHint"),
    allow_hosts_regexp: Optional[StrictStr] = Query(None, description="", alias="allow.hosts.regexp"),
    allow_hosts_regexp_type_hint: Optional[StrictStr] = Query(None, description="", alias="allow.hosts.regexp@TypeHint"),
    filter_methods: Optional[StrictStr] = Query(None, description="", alias="filter.methods"),
    filter_methods_type_hint: Optional[StrictStr] = Query(None, description="", alias="filter.methods@TypeHint"),
    token_aemAuth: TokenModel = Security(
        get_token_aemAuth
    ),
) -> None:
    if not BaseSlingApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseSlingApi.subclasses[0]().post_config_apache_sling_referrer_filter(allow_empty, allow_empty_type_hint, allow_hosts, allow_hosts_type_hint, allow_hosts_regexp, allow_hosts_regexp_type_hint, filter_methods, filter_methods_type_hint)


@router.post(
    "/apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet",
    responses={
        "default": {"description": "Default response"},
    },
    tags=["sling"],
    response_model_by_alias=True,
)
async def post_config_apache_sling_dav_ex_servlet(
    alias: Optional[StrictStr] = Query(None, description="", alias="alias"),
    alias_type_hint: Optional[StrictStr] = Query(None, description="", alias="alias@TypeHint"),
    dav_create_absolute_uri: Optional[StrictBool] = Query(None, description="", alias="dav.create-absolute-uri"),
    dav_create_absolute_uri_type_hint: Optional[StrictStr] = Query(None, description="", alias="dav.create-absolute-uri@TypeHint"),
    token_aemAuth: TokenModel = Security(
        get_token_aemAuth
    ),
) -> None:
    if not BaseSlingApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseSlingApi.subclasses[0]().post_config_apache_sling_dav_ex_servlet(alias, alias_type_hint, dav_create_absolute_uri, dav_create_absolute_uri_type_hint)


@router.get(
    "/bin/querybuilder.json",
    responses={
        "default": {"model": str, "description": "Default response"},
    },
    tags=["sling"],
    response_model_by_alias=True,
)
async def get_query(
    path: StrictStr = Query(None, description="", alias="path"),
    p_limit: Union[StrictFloat, StrictInt] = Query(None, description="", alias="p.limit"),
    var_1_property: StrictStr = Query(None, description="", alias="1_property"),
    var_1_property_value: StrictStr = Query(None, description="", alias="1_property.value"),
    token_aemAuth: TokenModel = Security(
        get_token_aemAuth
    ),
) -> str:
    if not BaseSlingApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseSlingApi.subclasses[0]().get_query(path, p_limit, var_1_property, var_1_property_value)


@router.post(
    "/bin/querybuilder.json",
    responses={
        "default": {"model": str, "description": "Default response"},
    },
    tags=["sling"],
    response_model_by_alias=True,
)
async def post_query(
    path: StrictStr = Query(None, description="", alias="path"),
    p_limit: Union[StrictFloat, StrictInt] = Query(None, description="", alias="p.limit"),
    var_1_property: StrictStr = Query(None, description="", alias="1_property"),
    var_1_property_value: StrictStr = Query(None, description="", alias="1_property.value"),
    token_aemAuth: TokenModel = Security(
        get_token_aemAuth
    ),
) -> str:
    if not BaseSlingApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseSlingApi.subclasses[0]().post_query(path, p_limit, var_1_property, var_1_property_value)


@router.get(
    "/etc/packages/{group}/{name}-{version}.zip",
    responses={
        "default": {"model": bytes, "description": "Default response"},
    },
    tags=["sling"],
    response_model_by_alias=True,
)
async def get_package(
    group: StrictStr = Path(..., description=""),
    name: StrictStr = Path(..., description=""),
    version: StrictStr = Path(..., description=""),
    token_aemAuth: TokenModel = Security(
        get_token_aemAuth
    ),
) -> bytes:
    if not BaseSlingApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseSlingApi.subclasses[0]().get_package(group, name, version)


@router.get(
    "/etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json",
    responses={
        "default": {"model": str, "description": "Default response"},
    },
    tags=["sling"],
    response_model_by_alias=True,
)
async def get_package_filter(
    group: StrictStr = Path(..., description=""),
    name: StrictStr = Path(..., description=""),
    version: StrictStr = Path(..., description=""),
    token_aemAuth: TokenModel = Security(
        get_token_aemAuth
    ),
) -> str:
    if not BaseSlingApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseSlingApi.subclasses[0]().get_package_filter(group, name, version)


@router.get(
    "/etc/replication/agents.{runmode}.-1.json",
    responses={
        "default": {"model": str, "description": "Default response"},
    },
    tags=["sling"],
    response_model_by_alias=True,
)
async def get_agents(
    runmode: StrictStr = Path(..., description=""),
    token_aemAuth: TokenModel = Security(
        get_token_aemAuth
    ),
) -> str:
    if not BaseSlingApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseSlingApi.subclasses[0]().get_agents(runmode)


@router.get(
    "/etc/replication/agents.{runmode}/{name}",
    responses={
        "default": {"description": "Default response"},
    },
    tags=["sling"],
    response_model_by_alias=True,
)
async def get_agent(
    runmode: StrictStr = Path(..., description=""),
    name: StrictStr = Path(..., description=""),
    token_aemAuth: TokenModel = Security(
        get_token_aemAuth
    ),
) -> None:
    if not BaseSlingApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseSlingApi.subclasses[0]().get_agent(runmode, name)


@router.post(
    "/etc/replication/agents.{runmode}/{name}",
    responses={
        "default": {"description": "Default response"},
    },
    tags=["sling"],
    response_model_by_alias=True,
)
async def post_agent(
    runmode: StrictStr = Path(..., description=""),
    name: StrictStr = Path(..., description=""),
    jcr_content_cq_distribute: Optional[StrictBool] = Query(None, description="", alias="jcr:content/cq:distribute"),
    jcr_content_cq_distribute_type_hint: Optional[StrictStr] = Query(None, description="", alias="jcr:content/cq:distribute@TypeHint"),
    jcr_content_cq_name: Optional[StrictStr] = Query(None, description="", alias="jcr:content/cq:name"),
    jcr_content_cq_template: Optional[StrictStr] = Query(None, description="", alias="jcr:content/cq:template"),
    jcr_content_alias_update: Optional[StrictBool] = Query(None, description="", alias="jcr:content/aliasUpdate"),
    jcr_content_enabled: Optional[StrictBool] = Query(None, description="", alias="jcr:content/enabled"),
    jcr_content_jcr_description: Optional[StrictStr] = Query(None, description="", alias="jcr:content/jcr:description"),
    jcr_content_jcr_last_modified: Optional[StrictStr] = Query(None, description="", alias="jcr:content/jcr:lastModified"),
    jcr_content_jcr_last_modified_by: Optional[StrictStr] = Query(None, description="", alias="jcr:content/jcr:lastModifiedBy"),
    jcr_content_jcr_mixin_types: Optional[StrictStr] = Query(None, description="", alias="jcr:content/jcr:mixinTypes"),
    jcr_content_jcr_title: Optional[StrictStr] = Query(None, description="", alias="jcr:content/jcr:title"),
    jcr_content_log_level: Optional[StrictStr] = Query(None, description="", alias="jcr:content/logLevel"),
    jcr_content_no_status_update: Optional[StrictBool] = Query(None, description="", alias="jcr:content/noStatusUpdate"),
    jcr_content_no_versioning: Optional[StrictBool] = Query(None, description="", alias="jcr:content/noVersioning"),
    jcr_content_protocol_connect_timeout: Optional[Union[StrictFloat, StrictInt]] = Query(None, description="", alias="jcr:content/protocolConnectTimeout"),
    jcr_content_protocol_http_connection_closed: Optional[StrictBool] = Query(None, description="", alias="jcr:content/protocolHTTPConnectionClosed"),
    jcr_content_protocol_http_expired: Optional[StrictStr] = Query(None, description="", alias="jcr:content/protocolHTTPExpired"),
    jcr_content_protocol_http_headers: Optional[List[StrictStr]] = Query(None, description="", alias="jcr:content/protocolHTTPHeaders"),
    jcr_content_protocol_http_headers_type_hint: Optional[StrictStr] = Query(None, description="", alias="jcr:content/protocolHTTPHeaders@TypeHint"),
    jcr_content_protocol_http_method: Optional[StrictStr] = Query(None, description="", alias="jcr:content/protocolHTTPMethod"),
    jcr_content_protocol_https_relaxed: Optional[StrictBool] = Query(None, description="", alias="jcr:content/protocolHTTPSRelaxed"),
    jcr_content_protocol_interface: Optional[StrictStr] = Query(None, description="", alias="jcr:content/protocolInterface"),
    jcr_content_protocol_socket_timeout: Optional[Union[StrictFloat, StrictInt]] = Query(None, description="", alias="jcr:content/protocolSocketTimeout"),
    jcr_content_protocol_version: Optional[StrictStr] = Query(None, description="", alias="jcr:content/protocolVersion"),
    jcr_content_proxy_ntlm_domain: Optional[StrictStr] = Query(None, description="", alias="jcr:content/proxyNTLMDomain"),
    jcr_content_proxy_ntlm_host: Optional[StrictStr] = Query(None, description="", alias="jcr:content/proxyNTLMHost"),
    jcr_content_proxy_host: Optional[StrictStr] = Query(None, description="", alias="jcr:content/proxyHost"),
    jcr_content_proxy_password: Optional[StrictStr] = Query(None, description="", alias="jcr:content/proxyPassword"),
    jcr_content_proxy_port: Optional[Union[StrictFloat, StrictInt]] = Query(None, description="", alias="jcr:content/proxyPort"),
    jcr_content_proxy_user: Optional[StrictStr] = Query(None, description="", alias="jcr:content/proxyUser"),
    jcr_content_queue_batch_max_size: Optional[Union[StrictFloat, StrictInt]] = Query(None, description="", alias="jcr:content/queueBatchMaxSize"),
    jcr_content_queue_batch_mode: Optional[StrictStr] = Query(None, description="", alias="jcr:content/queueBatchMode"),
    jcr_content_queue_batch_wait_time: Optional[Union[StrictFloat, StrictInt]] = Query(None, description="", alias="jcr:content/queueBatchWaitTime"),
    jcr_content_retry_delay: Optional[StrictStr] = Query(None, description="", alias="jcr:content/retryDelay"),
    jcr_content_reverse_replication: Optional[StrictBool] = Query(None, description="", alias="jcr:content/reverseReplication"),
    jcr_content_serialization_type: Optional[StrictStr] = Query(None, description="", alias="jcr:content/serializationType"),
    jcr_content_sling_resource_type: Optional[StrictStr] = Query(None, description="", alias="jcr:content/sling:resourceType"),
    jcr_content_ssl: Optional[StrictStr] = Query(None, description="", alias="jcr:content/ssl"),
    jcr_content_transport_ntlm_domain: Optional[StrictStr] = Query(None, description="", alias="jcr:content/transportNTLMDomain"),
    jcr_content_transport_ntlm_host: Optional[StrictStr] = Query(None, description="", alias="jcr:content/transportNTLMHost"),
    jcr_content_transport_password: Optional[StrictStr] = Query(None, description="", alias="jcr:content/transportPassword"),
    jcr_content_transport_uri: Optional[StrictStr] = Query(None, description="", alias="jcr:content/transportUri"),
    jcr_content_transport_user: Optional[StrictStr] = Query(None, description="", alias="jcr:content/transportUser"),
    jcr_content_trigger_distribute: Optional[StrictBool] = Query(None, description="", alias="jcr:content/triggerDistribute"),
    jcr_content_trigger_modified: Optional[StrictBool] = Query(None, description="", alias="jcr:content/triggerModified"),
    jcr_content_trigger_on_off_time: Optional[StrictBool] = Query(None, description="", alias="jcr:content/triggerOnOffTime"),
    jcr_content_trigger_receive: Optional[StrictBool] = Query(None, description="", alias="jcr:content/triggerReceive"),
    jcr_content_trigger_specific: Optional[StrictBool] = Query(None, description="", alias="jcr:content/triggerSpecific"),
    jcr_content_user_id: Optional[StrictStr] = Query(None, description="", alias="jcr:content/userId"),
    jcr_primary_type: Optional[StrictStr] = Query(None, description="", alias="jcr:primaryType"),
    operation: Optional[StrictStr] = Query(None, description="", alias=":operation"),
    token_aemAuth: TokenModel = Security(
        get_token_aemAuth
    ),
) -> None:
    if not BaseSlingApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseSlingApi.subclasses[0]().post_agent(runmode, name, jcr_content_cq_distribute, jcr_content_cq_distribute_type_hint, jcr_content_cq_name, jcr_content_cq_template, jcr_content_alias_update, jcr_content_enabled, jcr_content_jcr_description, jcr_content_jcr_last_modified, jcr_content_jcr_last_modified_by, jcr_content_jcr_mixin_types, jcr_content_jcr_title, jcr_content_log_level, jcr_content_no_status_update, jcr_content_no_versioning, jcr_content_protocol_connect_timeout, jcr_content_protocol_http_connection_closed, jcr_content_protocol_http_expired, jcr_content_protocol_http_headers, jcr_content_protocol_http_headers_type_hint, jcr_content_protocol_http_method, jcr_content_protocol_https_relaxed, jcr_content_protocol_interface, jcr_content_protocol_socket_timeout, jcr_content_protocol_version, jcr_content_proxy_ntlm_domain, jcr_content_proxy_ntlm_host, jcr_content_proxy_host, jcr_content_proxy_password, jcr_content_proxy_port, jcr_content_proxy_user, jcr_content_queue_batch_max_size, jcr_content_queue_batch_mode, jcr_content_queue_batch_wait_time, jcr_content_retry_delay, jcr_content_reverse_replication, jcr_content_serialization_type, jcr_content_sling_resource_type, jcr_content_ssl, jcr_content_transport_ntlm_domain, jcr_content_transport_ntlm_host, jcr_content_transport_password, jcr_content_transport_uri, jcr_content_transport_user, jcr_content_trigger_distribute, jcr_content_trigger_modified, jcr_content_trigger_on_off_time, jcr_content_trigger_receive, jcr_content_trigger_specific, jcr_content_user_id, jcr_primary_type, operation)


@router.delete(
    "/etc/replication/agents.{runmode}/{name}",
    responses={
        "default": {"description": "Default response"},
    },
    tags=["sling"],
    response_model_by_alias=True,
)
async def delete_agent(
    runmode: StrictStr = Path(..., description=""),
    name: StrictStr = Path(..., description=""),
    token_aemAuth: TokenModel = Security(
        get_token_aemAuth
    ),
) -> None:
    if not BaseSlingApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseSlingApi.subclasses[0]().delete_agent(runmode, name)


@router.post(
    "/libs/replication/treeactivation.html",
    responses={
        "default": {"description": "Default response"},
    },
    tags=["sling"],
    response_model_by_alias=True,
)
async def post_tree_activation(
    ignoredeactivated: StrictBool = Query(None, description="", alias="ignoredeactivated"),
    onlymodified: StrictBool = Query(None, description="", alias="onlymodified"),
    path: StrictStr = Query(None, description="", alias="path"),
    cmd: StrictStr = Query('activate', description="", alias="cmd"),
    token_aemAuth: TokenModel = Security(
        get_token_aemAuth
    ),
) -> None:
    if not BaseSlingApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseSlingApi.subclasses[0]().post_tree_activation(ignoredeactivated, onlymodified, path, cmd)


@router.post(
    "/libs/granite/security/post/authorizables",
    responses={
        "default": {"model": str, "description": "Default response"},
    },
    tags=["sling"],
    response_model_by_alias=True,
)
async def post_authorizables(
    authorizable_id: StrictStr = Query(None, description="", alias="authorizableId"),
    intermediate_path: StrictStr = Query(None, description="", alias="intermediatePath"),
    create_user: Optional[StrictStr] = Query(None, description="", alias="createUser"),
    create_group: Optional[StrictStr] = Query(None, description="", alias="createGroup"),
    rep_password: Optional[StrictStr] = Query(None, description="", alias="rep:password"),
    profile_given_name: Optional[StrictStr] = Query(None, description="", alias="profile/givenName"),
    token_aemAuth: TokenModel = Security(
        get_token_aemAuth
    ),
) -> str:
    if not BaseSlingApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseSlingApi.subclasses[0]().post_authorizables(authorizable_id, intermediate_path, create_user, create_group, rep_password, profile_given_name)


@router.post(
    "/apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config",
    responses={
        "default": {"description": "Default response"},
    },
    tags=["sling"],
    response_model_by_alias=True,
)
async def post_config_adobe_granite_saml_authentication_handler(
    key_store_password: Optional[StrictStr] = Query(None, description="", alias="keyStorePassword"),
    key_store_password_type_hint: Optional[StrictStr] = Query(None, description="", alias="keyStorePassword@TypeHint"),
    service_ranking: Optional[StrictInt] = Query(None, description="", alias="service.ranking"),
    service_ranking_type_hint: Optional[StrictStr] = Query(None, description="", alias="service.ranking@TypeHint"),
    idp_http_redirect: Optional[StrictBool] = Query(None, description="", alias="idpHttpRedirect"),
    idp_http_redirect_type_hint: Optional[StrictStr] = Query(None, description="", alias="idpHttpRedirect@TypeHint"),
    create_user: Optional[StrictBool] = Query(None, description="", alias="createUser"),
    create_user_type_hint: Optional[StrictStr] = Query(None, description="", alias="createUser@TypeHint"),
    default_redirect_url: Optional[StrictStr] = Query(None, description="", alias="defaultRedirectUrl"),
    default_redirect_url_type_hint: Optional[StrictStr] = Query(None, description="", alias="defaultRedirectUrl@TypeHint"),
    user_id_attribute: Optional[StrictStr] = Query(None, description="", alias="userIDAttribute"),
    user_id_attribute_type_hint: Optional[StrictStr] = Query(None, description="", alias="userIDAttribute@TypeHint"),
    default_groups: Optional[List[StrictStr]] = Query(None, description="", alias="defaultGroups"),
    default_groups_type_hint: Optional[StrictStr] = Query(None, description="", alias="defaultGroups@TypeHint"),
    idp_cert_alias: Optional[StrictStr] = Query(None, description="", alias="idpCertAlias"),
    idp_cert_alias_type_hint: Optional[StrictStr] = Query(None, description="", alias="idpCertAlias@TypeHint"),
    add_group_memberships: Optional[StrictBool] = Query(None, description="", alias="addGroupMemberships"),
    add_group_memberships_type_hint: Optional[StrictStr] = Query(None, description="", alias="addGroupMemberships@TypeHint"),
    path: Optional[List[StrictStr]] = Query(None, description="", alias="path"),
    path_type_hint: Optional[StrictStr] = Query(None, description="", alias="path@TypeHint"),
    synchronize_attributes: Optional[List[StrictStr]] = Query(None, description="", alias="synchronizeAttributes"),
    synchronize_attributes_type_hint: Optional[StrictStr] = Query(None, description="", alias="synchronizeAttributes@TypeHint"),
    clock_tolerance: Optional[StrictInt] = Query(None, description="", alias="clockTolerance"),
    clock_tolerance_type_hint: Optional[StrictStr] = Query(None, description="", alias="clockTolerance@TypeHint"),
    group_membership_attribute: Optional[StrictStr] = Query(None, description="", alias="groupMembershipAttribute"),
    group_membership_attribute_type_hint: Optional[StrictStr] = Query(None, description="", alias="groupMembershipAttribute@TypeHint"),
    idp_url: Optional[StrictStr] = Query(None, description="", alias="idpUrl"),
    idp_url_type_hint: Optional[StrictStr] = Query(None, description="", alias="idpUrl@TypeHint"),
    logout_url: Optional[StrictStr] = Query(None, description="", alias="logoutUrl"),
    logout_url_type_hint: Optional[StrictStr] = Query(None, description="", alias="logoutUrl@TypeHint"),
    service_provider_entity_id: Optional[StrictStr] = Query(None, description="", alias="serviceProviderEntityId"),
    service_provider_entity_id_type_hint: Optional[StrictStr] = Query(None, description="", alias="serviceProviderEntityId@TypeHint"),
    assertion_consumer_service_url: Optional[StrictStr] = Query(None, description="", alias="assertionConsumerServiceURL"),
    assertion_consumer_service_url_type_hint: Optional[StrictStr] = Query(None, description="", alias="assertionConsumerServiceURL@TypeHint"),
    handle_logout: Optional[StrictBool] = Query(None, description="", alias="handleLogout"),
    handle_logout_type_hint: Optional[StrictStr] = Query(None, description="", alias="handleLogout@TypeHint"),
    sp_private_key_alias: Optional[StrictStr] = Query(None, description="", alias="spPrivateKeyAlias"),
    sp_private_key_alias_type_hint: Optional[StrictStr] = Query(None, description="", alias="spPrivateKeyAlias@TypeHint"),
    use_encryption: Optional[StrictBool] = Query(None, description="", alias="useEncryption"),
    use_encryption_type_hint: Optional[StrictStr] = Query(None, description="", alias="useEncryption@TypeHint"),
    name_id_format: Optional[StrictStr] = Query(None, description="", alias="nameIdFormat"),
    name_id_format_type_hint: Optional[StrictStr] = Query(None, description="", alias="nameIdFormat@TypeHint"),
    digest_method: Optional[StrictStr] = Query(None, description="", alias="digestMethod"),
    digest_method_type_hint: Optional[StrictStr] = Query(None, description="", alias="digestMethod@TypeHint"),
    signature_method: Optional[StrictStr] = Query(None, description="", alias="signatureMethod"),
    signature_method_type_hint: Optional[StrictStr] = Query(None, description="", alias="signatureMethod@TypeHint"),
    user_intermediate_path: Optional[StrictStr] = Query(None, description="", alias="userIntermediatePath"),
    user_intermediate_path_type_hint: Optional[StrictStr] = Query(None, description="", alias="userIntermediatePath@TypeHint"),
    token_aemAuth: TokenModel = Security(
        get_token_aemAuth
    ),
) -> None:
    if not BaseSlingApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseSlingApi.subclasses[0]().post_config_adobe_granite_saml_authentication_handler(key_store_password, key_store_password_type_hint, service_ranking, service_ranking_type_hint, idp_http_redirect, idp_http_redirect_type_hint, create_user, create_user_type_hint, default_redirect_url, default_redirect_url_type_hint, user_id_attribute, user_id_attribute_type_hint, default_groups, default_groups_type_hint, idp_cert_alias, idp_cert_alias_type_hint, add_group_memberships, add_group_memberships_type_hint, path, path_type_hint, synchronize_attributes, synchronize_attributes_type_hint, clock_tolerance, clock_tolerance_type_hint, group_membership_attribute, group_membership_attribute_type_hint, idp_url, idp_url_type_hint, logout_url, logout_url_type_hint, service_provider_entity_id, service_provider_entity_id_type_hint, assertion_consumer_service_url, assertion_consumer_service_url_type_hint, handle_logout, handle_logout_type_hint, sp_private_key_alias, sp_private_key_alias_type_hint, use_encryption, use_encryption_type_hint, name_id_format, name_id_format_type_hint, digest_method, digest_method_type_hint, signature_method, signature_method_type_hint, user_intermediate_path, user_intermediate_path_type_hint)


@router.post(
    "/apps/system/config/org.apache.http.proxyconfigurator.config",
    responses={
        "default": {"description": "Default response"},
    },
    tags=["sling"],
    response_model_by_alias=True,
)
async def post_config_apache_http_components_proxy_configuration(
    proxy_host: Optional[StrictStr] = Query(None, description="", alias="proxy.host"),
    proxy_host_type_hint: Optional[StrictStr] = Query(None, description="", alias="proxy.host@TypeHint"),
    proxy_port: Optional[StrictInt] = Query(None, description="", alias="proxy.port"),
    proxy_port_type_hint: Optional[StrictStr] = Query(None, description="", alias="proxy.port@TypeHint"),
    proxy_exceptions: Optional[List[StrictStr]] = Query(None, description="", alias="proxy.exceptions"),
    proxy_exceptions_type_hint: Optional[StrictStr] = Query(None, description="", alias="proxy.exceptions@TypeHint"),
    proxy_enabled: Optional[StrictBool] = Query(None, description="", alias="proxy.enabled"),
    proxy_enabled_type_hint: Optional[StrictStr] = Query(None, description="", alias="proxy.enabled@TypeHint"),
    proxy_user: Optional[StrictStr] = Query(None, description="", alias="proxy.user"),
    proxy_user_type_hint: Optional[StrictStr] = Query(None, description="", alias="proxy.user@TypeHint"),
    proxy_password: Optional[StrictStr] = Query(None, description="", alias="proxy.password"),
    proxy_password_type_hint: Optional[StrictStr] = Query(None, description="", alias="proxy.password@TypeHint"),
    token_aemAuth: TokenModel = Security(
        get_token_aemAuth
    ),
) -> None:
    if not BaseSlingApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseSlingApi.subclasses[0]().post_config_apache_http_components_proxy_configuration(proxy_host, proxy_host_type_hint, proxy_port, proxy_port_type_hint, proxy_exceptions, proxy_exceptions_type_hint, proxy_enabled, proxy_enabled_type_hint, proxy_user, proxy_user_type_hint, proxy_password, proxy_password_type_hint)


@router.post(
    "/libs/granite/security/post/truststore",
    responses={
        "default": {"model": str, "description": "Default response"},
    },
    tags=["sling"],
    response_model_by_alias=True,
)
async def post_truststore(
    operation: Optional[StrictStr] = Query(None, description="", alias=":operation"),
    new_password: Optional[StrictStr] = Query(None, description="", alias="newPassword"),
    re_password: Optional[StrictStr] = Query(None, description="", alias="rePassword"),
    key_store_type: Optional[StrictStr] = Query(None, description="", alias="keyStoreType"),
    remove_alias: Optional[StrictStr] = Query(None, description="", alias="removeAlias"),
    certificate: Optional[UploadFile] = File(None, description=""),
    token_aemAuth: TokenModel = Security(
        get_token_aemAuth
    ),
) -> str:
    if not BaseSlingApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseSlingApi.subclasses[0]().post_truststore(operation, new_password, re_password, key_store_type, remove_alias, certificate)


@router.get(
    "/libs/granite/security/truststore.json",
    responses={
        200: {"model": TruststoreInfo, "description": "Retrieved AEM Truststore info"},
        "default": {"model": str, "description": "Default response"},
    },
    tags=["sling"],
    response_model_by_alias=True,
)
async def get_truststore_info(
    token_aemAuth: TokenModel = Security(
        get_token_aemAuth
    ),
) -> TruststoreInfo:
    if not BaseSlingApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseSlingApi.subclasses[0]().get_truststore_info()


@router.get(
    "/etc/truststore/truststore.p12",
    responses={
        "default": {"model": bytes, "description": "Default response"},
    },
    tags=["sling"],
    response_model_by_alias=True,
)
async def get_truststore(
    token_aemAuth: TokenModel = Security(
        get_token_aemAuth
    ),
) -> bytes:
    if not BaseSlingApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseSlingApi.subclasses[0]().get_truststore()


@router.post(
    "/etc/truststore",
    responses={
        "default": {"model": str, "description": "Default response"},
    },
    tags=["sling"],
    response_model_by_alias=True,
)
async def post_truststore_pkcs12(
    truststore_p12: Optional[UploadFile] = File(None, description=""),
    token_aemAuth: TokenModel = Security(
        get_token_aemAuth
    ),
) -> str:
    if not BaseSlingApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseSlingApi.subclasses[0]().post_truststore_pkcs12(truststore_p12)


@router.post(
    "/{intermediatePath}/{authorizableId}.ks.html",
    responses={
        200: {"model": KeystoreInfo, "description": "Retrieved Authorizable Keystore info"},
        "default": {"model": str, "description": "Default response"},
    },
    tags=["sling"],
    response_model_by_alias=True,
)
async def post_authorizable_keystore(
    intermediatePath: StrictStr = Path(..., description=""),
    authorizableId: StrictStr = Path(..., description=""),
    operation: Optional[StrictStr] = Query(None, description="", alias=":operation"),
    current_password: Optional[StrictStr] = Query(None, description="", alias="currentPassword"),
    new_password: Optional[StrictStr] = Query(None, description="", alias="newPassword"),
    re_password: Optional[StrictStr] = Query(None, description="", alias="rePassword"),
    key_password: Optional[StrictStr] = Query(None, description="", alias="keyPassword"),
    key_store_pass: Optional[StrictStr] = Query(None, description="", alias="keyStorePass"),
    alias: Optional[StrictStr] = Query(None, description="", alias="alias"),
    new_alias: Optional[StrictStr] = Query(None, description="", alias="newAlias"),
    remove_alias: Optional[StrictStr] = Query(None, description="", alias="removeAlias"),
    cert_chain: Optional[UploadFile] = File(None, description=""),
    pk: Optional[UploadFile] = File(None, description=""),
    key_store: Optional[UploadFile] = File(None, description=""),
    token_aemAuth: TokenModel = Security(
        get_token_aemAuth
    ),
) -> KeystoreInfo:
    if not BaseSlingApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseSlingApi.subclasses[0]().post_authorizable_keystore(intermediatePath, authorizableId, operation, current_password, new_password, re_password, key_password, key_store_pass, alias, new_alias, remove_alias, cert_chain, pk, key_store)


@router.get(
    "/{intermediatePath}/{authorizableId}.ks.json",
    responses={
        200: {"model": KeystoreInfo, "description": "Retrieved Authorizable Keystore info"},
        "default": {"model": str, "description": "Default response"},
    },
    tags=["sling"],
    response_model_by_alias=True,
)
async def get_authorizable_keystore(
    intermediatePath: StrictStr = Path(..., description=""),
    authorizableId: StrictStr = Path(..., description=""),
    token_aemAuth: TokenModel = Security(
        get_token_aemAuth
    ),
) -> KeystoreInfo:
    if not BaseSlingApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseSlingApi.subclasses[0]().get_authorizable_keystore(intermediatePath, authorizableId)


@router.get(
    "/{intermediatePath}/{authorizableId}/keystore/store.p12",
    responses={
        "default": {"model": bytes, "description": "Default response"},
    },
    tags=["sling"],
    response_model_by_alias=True,
)
async def get_keystore(
    intermediatePath: StrictStr = Path(..., description=""),
    authorizableId: StrictStr = Path(..., description=""),
    token_aemAuth: TokenModel = Security(
        get_token_aemAuth
    ),
) -> bytes:
    if not BaseSlingApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseSlingApi.subclasses[0]().get_keystore(intermediatePath, authorizableId)
