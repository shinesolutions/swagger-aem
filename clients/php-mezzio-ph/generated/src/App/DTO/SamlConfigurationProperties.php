<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class SamlConfigurationProperties
{
    /**
     * @DTA\Data(field="path", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\SamlConfigurationPropertyItemsArray::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\SamlConfigurationPropertyItemsArray::class})
     * @var \App\DTO\SamlConfigurationPropertyItemsArray|null
     */
    public $path;

    /**
     * @DTA\Data(field="service.ranking", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\SamlConfigurationPropertyItemsLong::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\SamlConfigurationPropertyItemsLong::class})
     * @var \App\DTO\SamlConfigurationPropertyItemsLong|null
     */
    public $service_ranking;

    /**
     * @DTA\Data(field="idpUrl", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\SamlConfigurationPropertyItemsString::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\SamlConfigurationPropertyItemsString::class})
     * @var \App\DTO\SamlConfigurationPropertyItemsString|null
     */
    public $idp_url;

    /**
     * @DTA\Data(field="idpCertAlias", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\SamlConfigurationPropertyItemsString::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\SamlConfigurationPropertyItemsString::class})
     * @var \App\DTO\SamlConfigurationPropertyItemsString|null
     */
    public $idp_cert_alias;

    /**
     * @DTA\Data(field="idpHttpRedirect", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\SamlConfigurationPropertyItemsBoolean::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\SamlConfigurationPropertyItemsBoolean::class})
     * @var \App\DTO\SamlConfigurationPropertyItemsBoolean|null
     */
    public $idp_http_redirect;

    /**
     * @DTA\Data(field="serviceProviderEntityId", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\SamlConfigurationPropertyItemsString::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\SamlConfigurationPropertyItemsString::class})
     * @var \App\DTO\SamlConfigurationPropertyItemsString|null
     */
    public $service_provider_entity_id;

    /**
     * @DTA\Data(field="assertionConsumerServiceURL", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\SamlConfigurationPropertyItemsString::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\SamlConfigurationPropertyItemsString::class})
     * @var \App\DTO\SamlConfigurationPropertyItemsString|null
     */
    public $assertion_consumer_service_url;

    /**
     * @DTA\Data(field="spPrivateKeyAlias", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\SamlConfigurationPropertyItemsString::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\SamlConfigurationPropertyItemsString::class})
     * @var \App\DTO\SamlConfigurationPropertyItemsString|null
     */
    public $sp_private_key_alias;

    /**
     * @DTA\Data(field="keyStorePassword", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\SamlConfigurationPropertyItemsString::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\SamlConfigurationPropertyItemsString::class})
     * @var \App\DTO\SamlConfigurationPropertyItemsString|null
     */
    public $key_store_password;

    /**
     * @DTA\Data(field="defaultRedirectUrl", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\SamlConfigurationPropertyItemsString::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\SamlConfigurationPropertyItemsString::class})
     * @var \App\DTO\SamlConfigurationPropertyItemsString|null
     */
    public $default_redirect_url;

    /**
     * @DTA\Data(field="userIDAttribute", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\SamlConfigurationPropertyItemsString::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\SamlConfigurationPropertyItemsString::class})
     * @var \App\DTO\SamlConfigurationPropertyItemsString|null
     */
    public $user_id_attribute;

    /**
     * @DTA\Data(field="useEncryption", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\SamlConfigurationPropertyItemsBoolean::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\SamlConfigurationPropertyItemsBoolean::class})
     * @var \App\DTO\SamlConfigurationPropertyItemsBoolean|null
     */
    public $use_encryption;

    /**
     * @DTA\Data(field="createUser", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\SamlConfigurationPropertyItemsBoolean::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\SamlConfigurationPropertyItemsBoolean::class})
     * @var \App\DTO\SamlConfigurationPropertyItemsBoolean|null
     */
    public $create_user;

    /**
     * @DTA\Data(field="addGroupMemberships", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\SamlConfigurationPropertyItemsBoolean::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\SamlConfigurationPropertyItemsBoolean::class})
     * @var \App\DTO\SamlConfigurationPropertyItemsBoolean|null
     */
    public $add_group_memberships;

    /**
     * @DTA\Data(field="groupMembershipAttribute", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\SamlConfigurationPropertyItemsString::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\SamlConfigurationPropertyItemsString::class})
     * @var \App\DTO\SamlConfigurationPropertyItemsString|null
     */
    public $group_membership_attribute;

    /**
     * @DTA\Data(field="defaultGroups", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\SamlConfigurationPropertyItemsArray::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\SamlConfigurationPropertyItemsArray::class})
     * @var \App\DTO\SamlConfigurationPropertyItemsArray|null
     */
    public $default_groups;

    /**
     * @DTA\Data(field="nameIdFormat", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\SamlConfigurationPropertyItemsString::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\SamlConfigurationPropertyItemsString::class})
     * @var \App\DTO\SamlConfigurationPropertyItemsString|null
     */
    public $name_id_format;

    /**
     * @DTA\Data(field="synchronizeAttributes", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\SamlConfigurationPropertyItemsArray::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\SamlConfigurationPropertyItemsArray::class})
     * @var \App\DTO\SamlConfigurationPropertyItemsArray|null
     */
    public $synchronize_attributes;

    /**
     * @DTA\Data(field="handleLogout", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\SamlConfigurationPropertyItemsBoolean::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\SamlConfigurationPropertyItemsBoolean::class})
     * @var \App\DTO\SamlConfigurationPropertyItemsBoolean|null
     */
    public $handle_logout;

    /**
     * @DTA\Data(field="logoutUrl", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\SamlConfigurationPropertyItemsString::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\SamlConfigurationPropertyItemsString::class})
     * @var \App\DTO\SamlConfigurationPropertyItemsString|null
     */
    public $logout_url;

    /**
     * @DTA\Data(field="clockTolerance", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\SamlConfigurationPropertyItemsLong::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\SamlConfigurationPropertyItemsLong::class})
     * @var \App\DTO\SamlConfigurationPropertyItemsLong|null
     */
    public $clock_tolerance;

    /**
     * @DTA\Data(field="digestMethod", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\SamlConfigurationPropertyItemsString::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\SamlConfigurationPropertyItemsString::class})
     * @var \App\DTO\SamlConfigurationPropertyItemsString|null
     */
    public $digest_method;

    /**
     * @DTA\Data(field="signatureMethod", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\SamlConfigurationPropertyItemsString::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\SamlConfigurationPropertyItemsString::class})
     * @var \App\DTO\SamlConfigurationPropertyItemsString|null
     */
    public $signature_method;

    /**
     * @DTA\Data(field="userIntermediatePath", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\SamlConfigurationPropertyItemsString::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\SamlConfigurationPropertyItemsString::class})
     * @var \App\DTO\SamlConfigurationPropertyItemsString|null
     */
    public $user_intermediate_path;

}
