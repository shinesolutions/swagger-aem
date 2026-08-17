from typing import List, Dict
from aiohttp import web

from openapi_server import util


async def get_login_page(request: web.Request, ) -> web.Response:
    """get_login_page

    


    """
    return web.Response(status=200)


async def post_cq_actions(request: web.Request, authorizable_id, changelog) -> web.Response:
    """post_cq_actions

    

    :param authorizable_id: 
    :type authorizable_id: str
    :param changelog: 
    :type changelog: str

    """
    return web.Response(status=200)
