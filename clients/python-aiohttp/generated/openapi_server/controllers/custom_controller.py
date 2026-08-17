from typing import List, Dict
from aiohttp import web

from openapi_server import util


async def get_aem_health_check(request: web.Request, tags=None, combine_tags_or=None) -> web.Response:
    """get_aem_health_check

    

    :param tags: 
    :type tags: str
    :param combine_tags_or: 
    :type combine_tags_or: bool

    """
    return web.Response(status=200)


async def post_config_aem_health_check_servlet(request: web.Request, bundles_ignored=None, bundles_ignored_type_hint=None) -> web.Response:
    """post_config_aem_health_check_servlet

    

    :param bundles_ignored: 
    :type bundles_ignored: List[str]
    :param bundles_ignored_type_hint: 
    :type bundles_ignored_type_hint: str

    """
    return web.Response(status=200)


async def post_config_aem_password_reset(request: web.Request, pwdreset_authorizables=None, pwdreset_authorizables_type_hint=None) -> web.Response:
    """post_config_aem_password_reset

    

    :param pwdreset_authorizables: 
    :type pwdreset_authorizables: List[str]
    :param pwdreset_authorizables_type_hint: 
    :type pwdreset_authorizables_type_hint: str

    """
    return web.Response(status=200)
