# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from openapi_server.apis.cq_api_base import BaseCqApi
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
from pydantic import StrictStr
from typing import Any
from openapi_server.security_api import get_token_aemAuth

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.get(
    "/libs/granite/core/content/login.html",
    responses={
        "default": {"model": str, "description": "Default response"},
    },
    tags=["cq"],
    response_model_by_alias=True,
)
async def get_login_page(
) -> str:
    if not BaseCqApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseCqApi.subclasses[0]().get_login_page()


@router.post(
    "/.cqactions.html",
    responses={
        "default": {"description": "Default response"},
    },
    tags=["cq"],
    response_model_by_alias=True,
)
async def post_cq_actions(
    authorizable_id: StrictStr = Query(None, description="", alias="authorizableId"),
    changelog: StrictStr = Query(None, description="", alias="changelog"),
    token_aemAuth: TokenModel = Security(
        get_token_aemAuth
    ),
) -> None:
    if not BaseCqApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseCqApi.subclasses[0]().post_cq_actions(authorizable_id, changelog)
