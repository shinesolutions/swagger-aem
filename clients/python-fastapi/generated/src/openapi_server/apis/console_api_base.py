# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from pydantic import StrictBool, StrictInt, StrictStr
from typing import Any, List, Optional
from openapi_server.models.bundle_info import BundleInfo
from openapi_server.models.saml_configuration_info import SamlConfigurationInfo
from openapi_server.security_api import get_token_aemAuth

class BaseConsoleApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseConsoleApi.subclasses = BaseConsoleApi.subclasses + (cls,)
    async def get_config_mgr(
        self,
    ) -> str:
        ...


    async def get_bundle_info(
        self,
        name: StrictStr,
    ) -> BundleInfo:
        ...


    async def post_bundle(
        self,
        name: StrictStr,
        action: StrictStr,
    ) -> None:
        ...


    async def post_jmx_repository(
        self,
        action: StrictStr,
    ) -> None:
        ...


    async def post_saml_configuration(
        self,
        post: Optional[StrictBool],
        apply: Optional[StrictBool],
        delete: Optional[StrictBool],
        action: Optional[StrictStr],
        location: Optional[StrictStr],
        path: Optional[List[StrictStr]],
        service_ranking: Optional[StrictInt],
        idp_url: Optional[StrictStr],
        idp_cert_alias: Optional[StrictStr],
        idp_http_redirect: Optional[StrictBool],
        service_provider_entity_id: Optional[StrictStr],
        assertion_consumer_service_url: Optional[StrictStr],
        sp_private_key_alias: Optional[StrictStr],
        key_store_password: Optional[StrictStr],
        default_redirect_url: Optional[StrictStr],
        user_id_attribute: Optional[StrictStr],
        use_encryption: Optional[StrictBool],
        create_user: Optional[StrictBool],
        add_group_memberships: Optional[StrictBool],
        group_membership_attribute: Optional[StrictStr],
        default_groups: Optional[List[StrictStr]],
        name_id_format: Optional[StrictStr],
        synchronize_attributes: Optional[List[StrictStr]],
        handle_logout: Optional[StrictBool],
        logout_url: Optional[StrictStr],
        clock_tolerance: Optional[StrictInt],
        digest_method: Optional[StrictStr],
        signature_method: Optional[StrictStr],
        user_intermediate_path: Optional[StrictStr],
        propertylist: Optional[List[StrictStr]],
    ) -> SamlConfigurationInfo:
        ...


    async def get_aem_product_info(
        self,
    ) -> List[str]:
        ...
