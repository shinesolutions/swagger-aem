import connexion
import six

from openapi_server.models.install_status import InstallStatus  # noqa: E501
from openapi_server import util


def get_crxde_status():  # noqa: E501
    """get_crxde_status

     # noqa: E501


    :rtype: str
    """
    return 'do some magic!'


def get_install_status():  # noqa: E501
    """get_install_status

     # noqa: E501


    :rtype: InstallStatus
    """
    return 'do some magic!'


def get_package_manager_servlet():  # noqa: E501
    """get_package_manager_servlet

     # noqa: E501


    :rtype: None
    """
    return 'do some magic!'


def post_package_service(cmd):  # noqa: E501
    """post_package_service

     # noqa: E501

    :param cmd: 
    :type cmd: str

    :rtype: str
    """
    return 'do some magic!'


def post_package_service_json(path, cmd, group_name=None, package_name=None, package_version=None, charset_=None, force=None, recursive=None, package=None):  # noqa: E501
    """post_package_service_json

     # noqa: E501

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

    :rtype: str
    """
    return 'do some magic!'


def post_package_update(group_name, package_name, version, path, filter=None, charset_=None):  # noqa: E501
    """post_package_update

     # noqa: E501

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

    :rtype: str
    """
    return 'do some magic!'


def post_set_password(old, plain, verify):  # noqa: E501
    """post_set_password

     # noqa: E501

    :param old: 
    :type old: str
    :param plain: 
    :type plain: str
    :param verify: 
    :type verify: str

    :rtype: str
    """
    return 'do some magic!'
