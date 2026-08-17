# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from pydantic import StrictStr
from typing import Any
from openapi_server.security_api import get_token_aemAuth

class BaseCqApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseCqApi.subclasses = BaseCqApi.subclasses + (cls,)
    async def get_login_page(
        self,
    ) -> str:
        ...


    async def post_cq_actions(
        self,
        authorizable_id: StrictStr,
        changelog: StrictStr,
    ) -> None:
        ...
