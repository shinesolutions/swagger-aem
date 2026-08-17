# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from pydantic import StrictBool, StrictStr
from typing import Any, List, Optional
from openapi_server.security_api import get_token_aemAuth

class BaseCustomApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseCustomApi.subclasses = BaseCustomApi.subclasses + (cls,)
    async def post_config_aem_password_reset(
        self,
        pwdreset_authorizables: Optional[List[StrictStr]],
        pwdreset_authorizables_type_hint: Optional[StrictStr],
    ) -> None:
        ...


    async def post_config_aem_health_check_servlet(
        self,
        bundles_ignored: Optional[List[StrictStr]],
        bundles_ignored_type_hint: Optional[StrictStr],
    ) -> None:
        ...


    async def get_aem_health_check(
        self,
        tags: Optional[StrictStr],
        combine_tags_or: Optional[StrictBool],
    ) -> str:
        ...
