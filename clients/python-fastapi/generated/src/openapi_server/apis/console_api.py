# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from openapi_server.apis.console_api_base import BaseConsoleApi
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
from pydantic import StrictBool, StrictInt, StrictStr
from typing import Any, List, Optional
from openapi_server.models.bundle_info import BundleInfo
from openapi_server.models.saml_configuration_info import SamlConfigurationInfo
from openapi_server.security_api import get_token_aemAuth

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.get(
    "/system/console/configMgr",
    responses={
        200: {"model": str, "description": "OK"},
        5XX: {"description": "Unexpected error."},
    },
    tags=["console"],
    response_model_by_alias=True,
)
async def get_config_mgr(
    token_aemAuth: TokenModel = Security(
        get_token_aemAuth
    ),
) -> str:
    if not BaseConsoleApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseConsoleApi.subclasses[0]().get_config_mgr()


@router.get(
    "/system/console/bundles/{name}.json",
    responses={
        200: {"model": BundleInfo, "description": "Retrieved bundle info"},
        "default": {"model": str, "description": "Default response"},
    },
    tags=["console"],
    response_model_by_alias=True,
)
async def get_bundle_info(
    name: StrictStr = Path(..., description=""),
    token_aemAuth: TokenModel = Security(
        get_token_aemAuth
    ),
) -> BundleInfo:
    if not BaseConsoleApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseConsoleApi.subclasses[0]().get_bundle_info(name)


@router.post(
    "/system/console/bundles/{name}",
    responses={
        "default": {"description": "Default response"},
    },
    tags=["console"],
    response_model_by_alias=True,
)
async def post_bundle(
    name: StrictStr = Path(..., description=""),
    action: StrictStr = Query(None, description="", alias="action"),
    token_aemAuth: TokenModel = Security(
        get_token_aemAuth
    ),
) -> None:
    if not BaseConsoleApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseConsoleApi.subclasses[0]().post_bundle(name, action)


@router.post(
    "/system/console/jmx/com.adobe.granite:type=Repository/op/{action}",
    responses={
        "default": {"description": "Default response"},
    },
    tags=["console"],
    response_model_by_alias=True,
)
async def post_jmx_repository(
    action: StrictStr = Path(..., description=""),
    token_aemAuth: TokenModel = Security(
        get_token_aemAuth
    ),
) -> None:
    if not BaseConsoleApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseConsoleApi.subclasses[0]().post_jmx_repository(action)


@router.post(
    "/system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler",
    responses={
        200: {"model": SamlConfigurationInfo, "description": "Retrieved AEM SAML Configuration"},
        302: {"model": str, "description": "Default response"},
        "default": {"model": str, "description": "Default response"},
    },
    tags=["console"],
    response_model_by_alias=True,
)
async def post_saml_configuration(
    post: Optional[StrictBool] = Query(None, description="", alias="post"),
    apply: Optional[StrictBool] = Query(None, description="", alias="apply"),
    delete: Optional[StrictBool] = Query(None, description="", alias="delete"),
    action: Optional[StrictStr] = Query(None, description="", alias="action"),
    location: Optional[StrictStr] = Query(None, description="", alias="$location"),
    path: Optional[List[StrictStr]] = Query(None, description="", alias="path"),
    service_ranking: Optional[StrictInt] = Query(None, description="", alias="service.ranking"),
    idp_url: Optional[StrictStr] = Query(None, description="", alias="idpUrl"),
    idp_cert_alias: Optional[StrictStr] = Query(None, description="", alias="idpCertAlias"),
    idp_http_redirect: Optional[StrictBool] = Query(None, description="", alias="idpHttpRedirect"),
    service_provider_entity_id: Optional[StrictStr] = Query(None, description="", alias="serviceProviderEntityId"),
    assertion_consumer_service_url: Optional[StrictStr] = Query(None, description="", alias="assertionConsumerServiceURL"),
    sp_private_key_alias: Optional[StrictStr] = Query(None, description="", alias="spPrivateKeyAlias"),
    key_store_password: Optional[StrictStr] = Query(None, description="", alias="keyStorePassword"),
    default_redirect_url: Optional[StrictStr] = Query(None, description="", alias="defaultRedirectUrl"),
    user_id_attribute: Optional[StrictStr] = Query(None, description="", alias="userIDAttribute"),
    use_encryption: Optional[StrictBool] = Query(None, description="", alias="useEncryption"),
    create_user: Optional[StrictBool] = Query(None, description="", alias="createUser"),
    add_group_memberships: Optional[StrictBool] = Query(None, description="", alias="addGroupMemberships"),
    group_membership_attribute: Optional[StrictStr] = Query(None, description="", alias="groupMembershipAttribute"),
    default_groups: Optional[List[StrictStr]] = Query(None, description="", alias="defaultGroups"),
    name_id_format: Optional[StrictStr] = Query(None, description="", alias="nameIdFormat"),
    synchronize_attributes: Optional[List[StrictStr]] = Query(None, description="", alias="synchronizeAttributes"),
    handle_logout: Optional[StrictBool] = Query(None, description="", alias="handleLogout"),
    logout_url: Optional[StrictStr] = Query(None, description="", alias="logoutUrl"),
    clock_tolerance: Optional[StrictInt] = Query(None, description="", alias="clockTolerance"),
    digest_method: Optional[StrictStr] = Query(None, description="", alias="digestMethod"),
    signature_method: Optional[StrictStr] = Query(None, description="", alias="signatureMethod"),
    user_intermediate_path: Optional[StrictStr] = Query(None, description="", alias="userIntermediatePath"),
    propertylist: Optional[List[StrictStr]] = Query(None, description="", alias="propertylist"),
    token_aemAuth: TokenModel = Security(
        get_token_aemAuth
    ),
) -> SamlConfigurationInfo:
    if not BaseConsoleApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseConsoleApi.subclasses[0]().post_saml_configuration(post, apply, delete, action, location, path, service_ranking, idp_url, idp_cert_alias, idp_http_redirect, service_provider_entity_id, assertion_consumer_service_url, sp_private_key_alias, key_store_password, default_redirect_url, user_id_attribute, use_encryption, create_user, add_group_memberships, group_membership_attribute, default_groups, name_id_format, synchronize_attributes, handle_logout, logout_url, clock_tolerance, digest_method, signature_method, user_intermediate_path, propertylist)


@router.get(
    "/system/console/status-productinfo.json",
    responses={
        "default": {"model": List[str], "description": "Default response"},
    },
    tags=["console"],
    response_model_by_alias=True,
)
async def get_aem_product_info(
    token_aemAuth: TokenModel = Security(
        get_token_aemAuth
    ),
) -> List[str]:
    if not BaseConsoleApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseConsoleApi.subclasses[0]().get_aem_product_info()
