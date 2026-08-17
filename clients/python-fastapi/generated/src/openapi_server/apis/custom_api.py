# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from openapi_server.apis.custom_api_base import BaseCustomApi
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
from pydantic import StrictBool, StrictStr
from typing import Any, List, Optional
from openapi_server.security_api import get_token_aemAuth

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.post(
    "/apps/system/config/com.shinesolutions.aem.passwordreset.Activator",
    responses={
        "default": {"description": "Default response"},
    },
    tags=["custom"],
    response_model_by_alias=True,
)
async def post_config_aem_password_reset(
    pwdreset_authorizables: Optional[List[StrictStr]] = Query(None, description="", alias="pwdreset.authorizables"),
    pwdreset_authorizables_type_hint: Optional[StrictStr] = Query(None, description="", alias="pwdreset.authorizables@TypeHint"),
    token_aemAuth: TokenModel = Security(
        get_token_aemAuth
    ),
) -> None:
    if not BaseCustomApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseCustomApi.subclasses[0]().post_config_aem_password_reset(pwdreset_authorizables, pwdreset_authorizables_type_hint)


@router.post(
    "/apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck",
    responses={
        "default": {"description": "Default response"},
    },
    tags=["custom"],
    response_model_by_alias=True,
)
async def post_config_aem_health_check_servlet(
    bundles_ignored: Optional[List[StrictStr]] = Query(None, description="", alias="bundles.ignored"),
    bundles_ignored_type_hint: Optional[StrictStr] = Query(None, description="", alias="bundles.ignored@TypeHint"),
    token_aemAuth: TokenModel = Security(
        get_token_aemAuth
    ),
) -> None:
    if not BaseCustomApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseCustomApi.subclasses[0]().post_config_aem_health_check_servlet(bundles_ignored, bundles_ignored_type_hint)


@router.get(
    "/system/health",
    responses={
        "default": {"model": str, "description": "Default response"},
    },
    tags=["custom"],
    response_model_by_alias=True,
)
async def get_aem_health_check(
    tags: Optional[StrictStr] = Query(None, description="", alias="tags"),
    combine_tags_or: Optional[StrictBool] = Query(None, description="", alias="combineTagsOr"),
    token_aemAuth: TokenModel = Security(
        get_token_aemAuth
    ),
) -> str:
    if not BaseCustomApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseCustomApi.subclasses[0]().get_aem_health_check(tags, combine_tags_or)
