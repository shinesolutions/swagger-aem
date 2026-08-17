# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from pydantic import StrictBool, StrictBytes, StrictFloat, StrictInt, StrictStr
from typing import Any, List, Optional, Tuple, Union
from openapi_server.models.keystore_info import KeystoreInfo
from openapi_server.models.truststore_info import TruststoreInfo
from fastapi import File, UploadFile
from openapi_server.security_api import get_token_aemAuth

class BaseSlingApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseSlingApi.subclasses = BaseSlingApi.subclasses + (cls,)
    async def post_path(
        self,
        path: StrictStr,
        jcr_primary_type: StrictStr,
        name: StrictStr,
    ) -> None:
        ...


    async def get_node(
        self,
        path: StrictStr,
        name: StrictStr,
    ) -> None:
        ...


    async def post_node(
        self,
        path: StrictStr,
        name: StrictStr,
        operation: Optional[StrictStr],
        delete_authorizable: Optional[StrictStr],
        file: Optional[UploadFile],
    ) -> None:
        ...


    async def delete_node(
        self,
        path: StrictStr,
        name: StrictStr,
    ) -> None:
        ...


    async def post_node_rw(
        self,
        path: StrictStr,
        name: StrictStr,
        add_members: Optional[StrictStr],
    ) -> None:
        ...


    async def post_config_property(
        self,
        configNodeName: StrictStr,
    ) -> None:
        ...


    async def post_config_apache_felix_jetty_based_http_service(
        self,
        org_apache_felix_https_nio: Optional[StrictBool],
        org_apache_felix_https_nio_type_hint: Optional[StrictStr],
        org_apache_felix_https_keystore: Optional[StrictStr],
        org_apache_felix_https_keystore_type_hint: Optional[StrictStr],
        org_apache_felix_https_keystore_password: Optional[StrictStr],
        org_apache_felix_https_keystore_password_type_hint: Optional[StrictStr],
        org_apache_felix_https_keystore_key: Optional[StrictStr],
        org_apache_felix_https_keystore_key_type_hint: Optional[StrictStr],
        org_apache_felix_https_keystore_key_password: Optional[StrictStr],
        org_apache_felix_https_keystore_key_password_type_hint: Optional[StrictStr],
        org_apache_felix_https_truststore: Optional[StrictStr],
        org_apache_felix_https_truststore_type_hint: Optional[StrictStr],
        org_apache_felix_https_truststore_password: Optional[StrictStr],
        org_apache_felix_https_truststore_password_type_hint: Optional[StrictStr],
        org_apache_felix_https_clientcertificate: Optional[StrictStr],
        org_apache_felix_https_clientcertificate_type_hint: Optional[StrictStr],
        org_apache_felix_https_enable: Optional[StrictBool],
        org_apache_felix_https_enable_type_hint: Optional[StrictStr],
        org_osgi_service_http_port_secure: Optional[StrictStr],
        org_osgi_service_http_port_secure_type_hint: Optional[StrictStr],
    ) -> None:
        ...


    async def post_config_apache_sling_get_servlet(
        self,
        json_maximumresults: Optional[StrictStr],
        json_maximumresults_type_hint: Optional[StrictStr],
        enable_html: Optional[StrictBool],
        enable_html_type_hint: Optional[StrictStr],
        enable_txt: Optional[StrictBool],
        enable_txt_type_hint: Optional[StrictStr],
        enable_xml: Optional[StrictBool],
        enable_xml_type_hint: Optional[StrictStr],
    ) -> None:
        ...


    async def post_config_apache_sling_referrer_filter(
        self,
        allow_empty: Optional[StrictBool],
        allow_empty_type_hint: Optional[StrictStr],
        allow_hosts: Optional[StrictStr],
        allow_hosts_type_hint: Optional[StrictStr],
        allow_hosts_regexp: Optional[StrictStr],
        allow_hosts_regexp_type_hint: Optional[StrictStr],
        filter_methods: Optional[StrictStr],
        filter_methods_type_hint: Optional[StrictStr],
    ) -> None:
        ...


    async def post_config_apache_sling_dav_ex_servlet(
        self,
        alias: Optional[StrictStr],
        alias_type_hint: Optional[StrictStr],
        dav_create_absolute_uri: Optional[StrictBool],
        dav_create_absolute_uri_type_hint: Optional[StrictStr],
    ) -> None:
        ...


    async def get_query(
        self,
        path: StrictStr,
        p_limit: Union[StrictFloat, StrictInt],
        var_1_property: StrictStr,
        var_1_property_value: StrictStr,
    ) -> str:
        ...


    async def post_query(
        self,
        path: StrictStr,
        p_limit: Union[StrictFloat, StrictInt],
        var_1_property: StrictStr,
        var_1_property_value: StrictStr,
    ) -> str:
        ...


    async def get_package(
        self,
        group: StrictStr,
        name: StrictStr,
        version: StrictStr,
    ) -> bytes:
        ...


    async def get_package_filter(
        self,
        group: StrictStr,
        name: StrictStr,
        version: StrictStr,
    ) -> str:
        ...


    async def get_agents(
        self,
        runmode: StrictStr,
    ) -> str:
        ...


    async def get_agent(
        self,
        runmode: StrictStr,
        name: StrictStr,
    ) -> None:
        ...


    async def post_agent(
        self,
        runmode: StrictStr,
        name: StrictStr,
        jcr_content_cq_distribute: Optional[StrictBool],
        jcr_content_cq_distribute_type_hint: Optional[StrictStr],
        jcr_content_cq_name: Optional[StrictStr],
        jcr_content_cq_template: Optional[StrictStr],
        jcr_content_alias_update: Optional[StrictBool],
        jcr_content_enabled: Optional[StrictBool],
        jcr_content_jcr_description: Optional[StrictStr],
        jcr_content_jcr_last_modified: Optional[StrictStr],
        jcr_content_jcr_last_modified_by: Optional[StrictStr],
        jcr_content_jcr_mixin_types: Optional[StrictStr],
        jcr_content_jcr_title: Optional[StrictStr],
        jcr_content_log_level: Optional[StrictStr],
        jcr_content_no_status_update: Optional[StrictBool],
        jcr_content_no_versioning: Optional[StrictBool],
        jcr_content_protocol_connect_timeout: Optional[Union[StrictFloat, StrictInt]],
        jcr_content_protocol_http_connection_closed: Optional[StrictBool],
        jcr_content_protocol_http_expired: Optional[StrictStr],
        jcr_content_protocol_http_headers: Optional[List[StrictStr]],
        jcr_content_protocol_http_headers_type_hint: Optional[StrictStr],
        jcr_content_protocol_http_method: Optional[StrictStr],
        jcr_content_protocol_https_relaxed: Optional[StrictBool],
        jcr_content_protocol_interface: Optional[StrictStr],
        jcr_content_protocol_socket_timeout: Optional[Union[StrictFloat, StrictInt]],
        jcr_content_protocol_version: Optional[StrictStr],
        jcr_content_proxy_ntlm_domain: Optional[StrictStr],
        jcr_content_proxy_ntlm_host: Optional[StrictStr],
        jcr_content_proxy_host: Optional[StrictStr],
        jcr_content_proxy_password: Optional[StrictStr],
        jcr_content_proxy_port: Optional[Union[StrictFloat, StrictInt]],
        jcr_content_proxy_user: Optional[StrictStr],
        jcr_content_queue_batch_max_size: Optional[Union[StrictFloat, StrictInt]],
        jcr_content_queue_batch_mode: Optional[StrictStr],
        jcr_content_queue_batch_wait_time: Optional[Union[StrictFloat, StrictInt]],
        jcr_content_retry_delay: Optional[StrictStr],
        jcr_content_reverse_replication: Optional[StrictBool],
        jcr_content_serialization_type: Optional[StrictStr],
        jcr_content_sling_resource_type: Optional[StrictStr],
        jcr_content_ssl: Optional[StrictStr],
        jcr_content_transport_ntlm_domain: Optional[StrictStr],
        jcr_content_transport_ntlm_host: Optional[StrictStr],
        jcr_content_transport_password: Optional[StrictStr],
        jcr_content_transport_uri: Optional[StrictStr],
        jcr_content_transport_user: Optional[StrictStr],
        jcr_content_trigger_distribute: Optional[StrictBool],
        jcr_content_trigger_modified: Optional[StrictBool],
        jcr_content_trigger_on_off_time: Optional[StrictBool],
        jcr_content_trigger_receive: Optional[StrictBool],
        jcr_content_trigger_specific: Optional[StrictBool],
        jcr_content_user_id: Optional[StrictStr],
        jcr_primary_type: Optional[StrictStr],
        operation: Optional[StrictStr],
    ) -> None:
        ...


    async def delete_agent(
        self,
        runmode: StrictStr,
        name: StrictStr,
    ) -> None:
        ...


    async def post_tree_activation(
        self,
        ignoredeactivated: StrictBool,
        onlymodified: StrictBool,
        path: StrictStr,
        cmd: StrictStr,
    ) -> None:
        ...


    async def post_authorizables(
        self,
        authorizable_id: StrictStr,
        intermediate_path: StrictStr,
        create_user: Optional[StrictStr],
        create_group: Optional[StrictStr],
        rep_password: Optional[StrictStr],
        profile_given_name: Optional[StrictStr],
    ) -> str:
        ...


    async def post_config_adobe_granite_saml_authentication_handler(
        self,
        key_store_password: Optional[StrictStr],
        key_store_password_type_hint: Optional[StrictStr],
        service_ranking: Optional[StrictInt],
        service_ranking_type_hint: Optional[StrictStr],
        idp_http_redirect: Optional[StrictBool],
        idp_http_redirect_type_hint: Optional[StrictStr],
        create_user: Optional[StrictBool],
        create_user_type_hint: Optional[StrictStr],
        default_redirect_url: Optional[StrictStr],
        default_redirect_url_type_hint: Optional[StrictStr],
        user_id_attribute: Optional[StrictStr],
        user_id_attribute_type_hint: Optional[StrictStr],
        default_groups: Optional[List[StrictStr]],
        default_groups_type_hint: Optional[StrictStr],
        idp_cert_alias: Optional[StrictStr],
        idp_cert_alias_type_hint: Optional[StrictStr],
        add_group_memberships: Optional[StrictBool],
        add_group_memberships_type_hint: Optional[StrictStr],
        path: Optional[List[StrictStr]],
        path_type_hint: Optional[StrictStr],
        synchronize_attributes: Optional[List[StrictStr]],
        synchronize_attributes_type_hint: Optional[StrictStr],
        clock_tolerance: Optional[StrictInt],
        clock_tolerance_type_hint: Optional[StrictStr],
        group_membership_attribute: Optional[StrictStr],
        group_membership_attribute_type_hint: Optional[StrictStr],
        idp_url: Optional[StrictStr],
        idp_url_type_hint: Optional[StrictStr],
        logout_url: Optional[StrictStr],
        logout_url_type_hint: Optional[StrictStr],
        service_provider_entity_id: Optional[StrictStr],
        service_provider_entity_id_type_hint: Optional[StrictStr],
        assertion_consumer_service_url: Optional[StrictStr],
        assertion_consumer_service_url_type_hint: Optional[StrictStr],
        handle_logout: Optional[StrictBool],
        handle_logout_type_hint: Optional[StrictStr],
        sp_private_key_alias: Optional[StrictStr],
        sp_private_key_alias_type_hint: Optional[StrictStr],
        use_encryption: Optional[StrictBool],
        use_encryption_type_hint: Optional[StrictStr],
        name_id_format: Optional[StrictStr],
        name_id_format_type_hint: Optional[StrictStr],
        digest_method: Optional[StrictStr],
        digest_method_type_hint: Optional[StrictStr],
        signature_method: Optional[StrictStr],
        signature_method_type_hint: Optional[StrictStr],
        user_intermediate_path: Optional[StrictStr],
        user_intermediate_path_type_hint: Optional[StrictStr],
    ) -> None:
        ...


    async def post_config_apache_http_components_proxy_configuration(
        self,
        proxy_host: Optional[StrictStr],
        proxy_host_type_hint: Optional[StrictStr],
        proxy_port: Optional[StrictInt],
        proxy_port_type_hint: Optional[StrictStr],
        proxy_exceptions: Optional[List[StrictStr]],
        proxy_exceptions_type_hint: Optional[StrictStr],
        proxy_enabled: Optional[StrictBool],
        proxy_enabled_type_hint: Optional[StrictStr],
        proxy_user: Optional[StrictStr],
        proxy_user_type_hint: Optional[StrictStr],
        proxy_password: Optional[StrictStr],
        proxy_password_type_hint: Optional[StrictStr],
    ) -> None:
        ...


    async def post_truststore(
        self,
        operation: Optional[StrictStr],
        new_password: Optional[StrictStr],
        re_password: Optional[StrictStr],
        key_store_type: Optional[StrictStr],
        remove_alias: Optional[StrictStr],
        certificate: Optional[UploadFile],
    ) -> str:
        ...


    async def get_truststore_info(
        self,
    ) -> TruststoreInfo:
        ...


    async def get_truststore(
        self,
    ) -> bytes:
        ...


    async def post_truststore_pkcs12(
        self,
        truststore_p12: Optional[UploadFile],
    ) -> str:
        ...


    async def post_authorizable_keystore(
        self,
        intermediatePath: StrictStr,
        authorizableId: StrictStr,
        operation: Optional[StrictStr],
        current_password: Optional[StrictStr],
        new_password: Optional[StrictStr],
        re_password: Optional[StrictStr],
        key_password: Optional[StrictStr],
        key_store_pass: Optional[StrictStr],
        alias: Optional[StrictStr],
        new_alias: Optional[StrictStr],
        remove_alias: Optional[StrictStr],
        cert_chain: Optional[UploadFile],
        pk: Optional[UploadFile],
        key_store: Optional[UploadFile],
    ) -> KeystoreInfo:
        ...


    async def get_authorizable_keystore(
        self,
        intermediatePath: StrictStr,
        authorizableId: StrictStr,
    ) -> KeystoreInfo:
        ...


    async def get_keystore(
        self,
        intermediatePath: StrictStr,
        authorizableId: StrictStr,
    ) -> bytes:
        ...
