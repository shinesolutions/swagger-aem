from typing import List, Dict
from aiohttp import web

from openapi_server import util


async def ssl_setup(request: web.Request, keystore_password, keystore_password_confirm, truststore_password, truststore_password_confirm, https_hostname, https_port, privatekey_file=None, certificate_file=None) -> web.Response:
    """ssl_setup

    

    :param keystore_password: 
    :type keystore_password: str
    :param keystore_password_confirm: 
    :type keystore_password_confirm: str
    :param truststore_password: 
    :type truststore_password: str
    :param truststore_password_confirm: 
    :type truststore_password_confirm: str
    :param https_hostname: 
    :type https_hostname: str
    :param https_port: 
    :type https_port: str
    :param privatekey_file: 
    :type privatekey_file: str
    :param certificate_file: 
    :type certificate_file: str

    """
    return web.Response(status=200)
