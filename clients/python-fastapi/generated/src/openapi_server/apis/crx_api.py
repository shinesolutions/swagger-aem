# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from openapi_server.apis.crx_api_base import BaseCrxApi
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
from pydantic import StrictBool, StrictBytes, StrictStr
from typing import Optional, Tuple, Union
from openapi_server.models.install_status import InstallStatus
from fastapi import File, UploadFile
from openapi_server.security_api import get_token_aemAuth

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.post(
    "/crx/explorer/ui/setpassword.jsp",
    responses={
        "default": {"model": str, "description": "Default response"},
    },
    tags=["crx"],
    response_model_by_alias=True,
)
async def post_set_password(
    old: StrictStr = Query(None, description="", alias="old"),
    plain: StrictStr = Query(None, description="", alias="plain"),
    verify: StrictStr = Query(None, description="", alias="verify"),
    token_aemAuth: TokenModel = Security(
        get_token_aemAuth
    ),
) -> str:
    if not BaseCrxApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseCrxApi.subclasses[0]().post_set_password(old, plain, verify)


@router.get(
    "/crx/packmgr/installstatus.jsp",
    responses={
        200: {"model": InstallStatus, "description": "Retrieved CRX package manager install status"},
        "default": {"model": str, "description": "Default response"},
    },
    tags=["crx"],
    response_model_by_alias=True,
)
async def get_install_status(
    token_aemAuth: TokenModel = Security(
        get_token_aemAuth
    ),
) -> InstallStatus:
    if not BaseCrxApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseCrxApi.subclasses[0]().get_install_status()


@router.post(
    "/crx/packmgr/service.jsp",
    responses={
        "default": {"model": str, "description": "Default response"},
    },
    tags=["crx"],
    response_model_by_alias=True,
)
async def post_package_service(
    cmd: StrictStr = Query(None, description="", alias="cmd"),
    token_aemAuth: TokenModel = Security(
        get_token_aemAuth
    ),
) -> str:
    if not BaseCrxApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseCrxApi.subclasses[0]().post_package_service(cmd)


@router.post(
    "/crx/packmgr/update.jsp",
    responses={
        "default": {"model": str, "description": "Default response"},
    },
    tags=["crx"],
    response_model_by_alias=True,
)
async def post_package_update(
    group_name: StrictStr = Query(None, description="", alias="groupName"),
    package_name: StrictStr = Query(None, description="", alias="packageName"),
    version: StrictStr = Query(None, description="", alias="version"),
    path: StrictStr = Query(None, description="", alias="path"),
    filter: Optional[StrictStr] = Query(None, description="", alias="filter"),
    charset_: Optional[StrictStr] = Query(None, description="", alias="_charset_"),
    token_aemAuth: TokenModel = Security(
        get_token_aemAuth
    ),
) -> str:
    if not BaseCrxApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseCrxApi.subclasses[0]().post_package_update(group_name, package_name, version, path, filter, charset_)


@router.post(
    "/crx/packmgr/service/.json/{path}",
    responses={
        "default": {"model": str, "description": "Default response"},
    },
    tags=["crx"],
    response_model_by_alias=True,
)
async def post_package_service_json(
    path: StrictStr = Path(..., description=""),
    cmd: StrictStr = Query(None, description="", alias="cmd"),
    group_name: Optional[StrictStr] = Query(None, description="", alias="groupName"),
    package_name: Optional[StrictStr] = Query(None, description="", alias="packageName"),
    package_version: Optional[StrictStr] = Query(None, description="", alias="packageVersion"),
    charset_: Optional[StrictStr] = Query(None, description="", alias="_charset_"),
    force: Optional[StrictBool] = Query(None, description="", alias="force"),
    recursive: Optional[StrictBool] = Query(None, description="", alias="recursive"),
    package: Optional[UploadFile] = File(None, description=""),
    token_aemAuth: TokenModel = Security(
        get_token_aemAuth
    ),
) -> str:
    if not BaseCrxApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseCrxApi.subclasses[0]().post_package_service_json(path, cmd, group_name, package_name, package_version, charset_, force, recursive, package)


@router.get(
    "/crx/packmgr/service/script.html",
    responses={
        404: {"model": str, "description": "Package Manager Servlet is disabled"},
        405: {"model": str, "description": "Package Manager Servlet is active"},
    },
    tags=["crx"],
    response_model_by_alias=True,
)
async def get_package_manager_servlet(
    token_aemAuth: TokenModel = Security(
        get_token_aemAuth
    ),
) -> None:
    if not BaseCrxApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseCrxApi.subclasses[0]().get_package_manager_servlet()


@router.get(
    "/crx/server/crx.default/jcr:root/.1.json",
    responses={
        200: {"model": str, "description": "CRXDE is enabled"},
        404: {"model": str, "description": "CRXDE is disabled"},
    },
    tags=["crx"],
    response_model_by_alias=True,
)
async def get_crxde_status(
    token_aemAuth: TokenModel = Security(
        get_token_aemAuth
    ),
) -> str:
    if not BaseCrxApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseCrxApi.subclasses[0]().get_crxde_status()
