# coding: utf-8

from typing import List

from fastapi import Depends, Security  # noqa: F401
from fastapi.openapi.models import OAuthFlowImplicit, OAuthFlows  # noqa: F401
from fastapi.security import (  # noqa: F401
    HTTPAuthorizationCredentials,
    HTTPBasic,
    HTTPBasicCredentials,
    HTTPBearer,
    OAuth2,
    OAuth2AuthorizationCodeBearer,
    OAuth2PasswordBearer,
    SecurityScopes,
)
from fastapi.security.api_key import APIKeyCookie, APIKeyHeader, APIKeyQuery  # noqa: F401

from openapi_server.models.extra_models import TokenModel


basic_auth = HTTPBasic()


def get_token_aemAuth(
    credentials: HTTPBasicCredentials = Depends(basic_auth)
) -> TokenModel:
    """
    Check and retrieve authentication information from basic auth.

    :param credentials Credentials provided by Authorization header
    :type credentials: HTTPBasicCredentials
    :rtype: TokenModel | None
    """

    ...

