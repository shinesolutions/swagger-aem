# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from pydantic import StrictBool, StrictBytes, StrictStr
from typing import Optional, Tuple, Union
from openapi_server.models.install_status import InstallStatus
from fastapi import File, UploadFile
from openapi_server.security_api import get_token_aemAuth

class BaseCrxApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseCrxApi.subclasses = BaseCrxApi.subclasses + (cls,)
    async def post_set_password(
        self,
        old: StrictStr,
        plain: StrictStr,
        verify: StrictStr,
    ) -> str:
        ...


    async def get_install_status(
        self,
    ) -> InstallStatus:
        ...


    async def post_package_service(
        self,
        cmd: StrictStr,
    ) -> str:
        ...


    async def post_package_update(
        self,
        group_name: StrictStr,
        package_name: StrictStr,
        version: StrictStr,
        path: StrictStr,
        filter: Optional[StrictStr],
        charset_: Optional[StrictStr],
    ) -> str:
        ...


    async def post_package_service_json(
        self,
        path: StrictStr,
        cmd: StrictStr,
        group_name: Optional[StrictStr],
        package_name: Optional[StrictStr],
        package_version: Optional[StrictStr],
        charset_: Optional[StrictStr],
        force: Optional[StrictBool],
        recursive: Optional[StrictBool],
        package: Optional[UploadFile],
    ) -> str:
        ...


    async def get_package_manager_servlet(
        self,
    ) -> None:
        ...


    async def get_crxde_status(
        self,
    ) -> str:
        ...
