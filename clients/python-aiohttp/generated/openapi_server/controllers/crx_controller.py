from typing import List, Dict
from aiohttp import web

from openapi_server.models.install_status import InstallStatus
from openapi_server import util


async def get_crxde_status(request: web.Request, ) -> web.Response:
    """get_crxde_status

    


    """
    return web.Response(status=200)


async def get_install_status(request: web.Request, ) -> web.Response:
    """get_install_status

    


    """
    return web.Response(status=200)


async def get_package_manager_servlet(request: web.Request, ) -> web.Response:
    """get_package_manager_servlet

    


    """
    return web.Response(status=200)


async def post_package_service(request: web.Request, cmd) -> web.Response:
    """post_package_service

    

    :param cmd: 
    :type cmd: str

    """
    return web.Response(status=200)


async def post_package_service_json(request: web.Request, path, cmd, group_name=None, package_name=None, package_version=None, charset_=None, force=None, recursive=None, package=None) -> web.Response:
    """post_package_service_json

    

    :param path: 
    :type path: str
    :param cmd: 
    :type cmd: str
    :param group_name: 
    :type group_name: str
    :param package_name: 
    :type package_name: str
    :param package_version: 
    :type package_version: str
    :param charset_: 
    :type charset_: str
    :param force: 
    :type force: bool
    :param recursive: 
    :type recursive: bool
    :param package: 
    :type package: str

    """
    return web.Response(status=200)


async def post_package_update(request: web.Request, group_name, package_name, version, path, filter=None, charset_=None) -> web.Response:
    """post_package_update

    

    :param group_name: 
    :type group_name: str
    :param package_name: 
    :type package_name: str
    :param version: 
    :type version: str
    :param path: 
    :type path: str
    :param filter: 
    :type filter: str
    :param charset_: 
    :type charset_: str

    """
    return web.Response(status=200)


async def post_set_password(request: web.Request, old, plain, verify) -> web.Response:
    """post_set_password

    

    :param old: 
    :type old: str
    :param plain: 
    :type plain: str
    :param verify: 
    :type verify: str

    """
    return web.Response(status=200)
