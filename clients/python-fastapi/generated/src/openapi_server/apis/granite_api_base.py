# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from pydantic import StrictBytes, StrictStr
from typing import Optional, Tuple, Union
from fastapi import File, UploadFile
from openapi_server.security_api import get_token_aemAuth

class BaseGraniteApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseGraniteApi.subclasses = BaseGraniteApi.subclasses + (cls,)
    async def ssl_setup(
        self,
        keystore_password: StrictStr,
        keystore_password_confirm: StrictStr,
        truststore_password: StrictStr,
        truststore_password_confirm: StrictStr,
        https_hostname: StrictStr,
        https_port: StrictStr,
        privatekey_file: Optional[UploadFile],
        certificate_file: Optional[UploadFile],
    ) -> str:
        ...
