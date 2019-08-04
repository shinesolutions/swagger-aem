<?php
/**
 * SamlConfigurationProperties
 */
namespace app\Models;

/**
 * SamlConfigurationProperties
 */
class SamlConfigurationProperties {

    /** @var \app\Models\SamlConfigurationPropertyItemsArray $path */
    private $path;

    /** @var \app\Models\SamlConfigurationPropertyItemsLong $service_ranking */
    private $service_ranking;

    /** @var \app\Models\SamlConfigurationPropertyItemsString $idp_url */
    private $idp_url;

    /** @var \app\Models\SamlConfigurationPropertyItemsString $idp_cert_alias */
    private $idp_cert_alias;

    /** @var \app\Models\SamlConfigurationPropertyItemsBoolean $idp_http_redirect */
    private $idp_http_redirect;

    /** @var \app\Models\SamlConfigurationPropertyItemsString $service_provider_entity_id */
    private $service_provider_entity_id;

    /** @var \app\Models\SamlConfigurationPropertyItemsString $assertion_consumer_service_url */
    private $assertion_consumer_service_url;

    /** @var \app\Models\SamlConfigurationPropertyItemsString $sp_private_key_alias */
    private $sp_private_key_alias;

    /** @var \app\Models\SamlConfigurationPropertyItemsString $key_store_password */
    private $key_store_password;

    /** @var \app\Models\SamlConfigurationPropertyItemsString $default_redirect_url */
    private $default_redirect_url;

    /** @var \app\Models\SamlConfigurationPropertyItemsString $user_id_attribute */
    private $user_id_attribute;

    /** @var \app\Models\SamlConfigurationPropertyItemsBoolean $use_encryption */
    private $use_encryption;

    /** @var \app\Models\SamlConfigurationPropertyItemsBoolean $create_user */
    private $create_user;

    /** @var \app\Models\SamlConfigurationPropertyItemsBoolean $add_group_memberships */
    private $add_group_memberships;

    /** @var \app\Models\SamlConfigurationPropertyItemsString $group_membership_attribute */
    private $group_membership_attribute;

    /** @var \app\Models\SamlConfigurationPropertyItemsArray $default_groups */
    private $default_groups;

    /** @var \app\Models\SamlConfigurationPropertyItemsString $name_id_format */
    private $name_id_format;

    /** @var \app\Models\SamlConfigurationPropertyItemsArray $synchronize_attributes */
    private $synchronize_attributes;

    /** @var \app\Models\SamlConfigurationPropertyItemsBoolean $handle_logout */
    private $handle_logout;

    /** @var \app\Models\SamlConfigurationPropertyItemsString $logout_url */
    private $logout_url;

    /** @var \app\Models\SamlConfigurationPropertyItemsLong $clock_tolerance */
    private $clock_tolerance;

    /** @var \app\Models\SamlConfigurationPropertyItemsString $digest_method */
    private $digest_method;

    /** @var \app\Models\SamlConfigurationPropertyItemsString $signature_method */
    private $signature_method;

    /** @var \app\Models\SamlConfigurationPropertyItemsString $user_intermediate_path */
    private $user_intermediate_path;

}
