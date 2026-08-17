# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from openapi_server.apis.granite_api_base import BaseGraniteApi
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
from pydantic import StrictBytes, StrictStr
from typing import Optional, Tuple, Union
from fastapi import File, UploadFile
from openapi_server.security_api import get_token_aemAuth

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.post(
    "/libs/granite/security/post/sslSetup.html",
    responses={
        "default": {"model": str, "description": "Default response"},
    },
    tags=["granite"],
    response_model_by_alias=True,
)
async def ssl_setup(
    keystore_password: StrictStr = Query(None, description="", alias="keystorePassword"),
    keystore_password_confirm: StrictStr = Query(None, description="", alias="keystorePasswordConfirm"),
    truststore_password: StrictStr = Query(None, description="", alias="truststorePassword"),
    truststore_password_confirm: StrictStr = Query(None, description="", alias="truststorePasswordConfirm"),
    https_hostname: StrictStr = Query(None, description="", alias="httpsHostname"),
    https_port: StrictStr = Query(None, description="", alias="httpsPort"),
    privatekey_file: Optional[UploadFile] = File(None, description=""),
    certificate_file: Optional[UploadFile] = File(None, description=""),
    token_aemAuth: TokenModel = Security(
        get_token_aemAuth
    ),
) -> str:
    if not BaseGraniteApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseGraniteApi.subclasses[0]().ssl_setup(keystore_password, keystore_password_confirm, truststore_password, truststore_password_confirm, https_hostname, https_port, privatekey_file, certificate_file)
