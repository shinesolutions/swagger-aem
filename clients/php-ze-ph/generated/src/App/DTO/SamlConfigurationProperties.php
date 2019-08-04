<?php

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class SamlConfigurationProperties
{
    /**
     * @DTA\Data(field="path", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\SamlConfigurationPropertyItemsArray::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\SamlConfigurationPropertyItemsArray::class})
     * @var \App\DTO\SamlConfigurationPropertyItemsArray
     */
    public $path;
    /**
     * @DTA\Data(field="service.ranking", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\SamlConfigurationPropertyItemsLong::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\SamlConfigurationPropertyItemsLong::class})
     * @var \App\DTO\SamlConfigurationPropertyItemsLong
     */
    public $service_ranking;
    /**
     * @DTA\Data(field="idpUrl", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\SamlConfigurationPropertyItemsString::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\SamlConfigurationPropertyItemsString::class})
     * @var \App\DTO\SamlConfigurationPropertyItemsString
     */
    public $idp_url;
    /**
     * @DTA\Data(field="idpCertAlias", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\SamlConfigurationPropertyItemsString::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\SamlConfigurationPropertyItemsString::class})
     * @var \App\DTO\SamlConfigurationPropertyItemsString
     */
    public $idp_cert_alias;
    /**
     * @DTA\Data(field="idpHttpRedirect", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\SamlConfigurationPropertyItemsBoolean::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\SamlConfigurationPropertyItemsBoolean::class})
     * @var \App\DTO\SamlConfigurationPropertyItemsBoolean
     */
    public $idp_http_redirect;
    /**
     * @DTA\Data(field="serviceProviderEntityId", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\SamlConfigurationPropertyItemsString::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\SamlConfigurationPropertyItemsString::class})
     * @var \App\DTO\SamlConfigurationPropertyItemsString
     */
    public $service_provider_entity_id;
    /**
     * @DTA\Data(field="assertionConsumerServiceURL", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\SamlConfigurationPropertyItemsString::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\SamlConfigurationPropertyItemsString::class})
     * @var \App\DTO\SamlConfigurationPropertyItemsString
     */
    public $assertion_consumer_service_url;
    /**
     * @DTA\Data(field="spPrivateKeyAlias", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\SamlConfigurationPropertyItemsString::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\SamlConfigurationPropertyItemsString::class})
     * @var \App\DTO\SamlConfigurationPropertyItemsString
     */
    public $sp_private_key_alias;
    /**
     * @DTA\Data(field="keyStorePassword", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\SamlConfigurationPropertyItemsString::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\SamlConfigurationPropertyItemsString::class})
     * @var \App\DTO\SamlConfigurationPropertyItemsString
     */
    public $key_store_password;
    /**
     * @DTA\Data(field="defaultRedirectUrl", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\SamlConfigurationPropertyItemsString::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\SamlConfigurationPropertyItemsString::class})
     * @var \App\DTO\SamlConfigurationPropertyItemsString
     */
    public $default_redirect_url;
    /**
     * @DTA\Data(field="userIDAttribute", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\SamlConfigurationPropertyItemsString::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\SamlConfigurationPropertyItemsString::class})
     * @var \App\DTO\SamlConfigurationPropertyItemsString
     */
    public $user_id_attribute;
    /**
     * @DTA\Data(field="useEncryption", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\SamlConfigurationPropertyItemsBoolean::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\SamlConfigurationPropertyItemsBoolean::class})
     * @var \App\DTO\SamlConfigurationPropertyItemsBoolean
     */
    public $use_encryption;
    /**
     * @DTA\Data(field="createUser", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\SamlConfigurationPropertyItemsBoolean::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\SamlConfigurationPropertyItemsBoolean::class})
     * @var \App\DTO\SamlConfigurationPropertyItemsBoolean
     */
    public $create_user;
    /**
     * @DTA\Data(field="addGroupMemberships", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\SamlConfigurationPropertyItemsBoolean::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\SamlConfigurationPropertyItemsBoolean::class})
     * @var \App\DTO\SamlConfigurationPropertyItemsBoolean
     */
    public $add_group_memberships;
    /**
     * @DTA\Data(field="groupMembershipAttribute", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\SamlConfigurationPropertyItemsString::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\SamlConfigurationPropertyItemsString::class})
     * @var \App\DTO\SamlConfigurationPropertyItemsString
     */
    public $group_membership_attribute;
    /**
     * @DTA\Data(field="defaultGroups", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\SamlConfigurationPropertyItemsArray::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\SamlConfigurationPropertyItemsArray::class})
     * @var \App\DTO\SamlConfigurationPropertyItemsArray
     */
    public $default_groups;
    /**
     * @DTA\Data(field="nameIdFormat", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\SamlConfigurationPropertyItemsString::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\SamlConfigurationPropertyItemsString::class})
     * @var \App\DTO\SamlConfigurationPropertyItemsString
     */
    public $name_id_format;
    /**
     * @DTA\Data(field="synchronizeAttributes", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\SamlConfigurationPropertyItemsArray::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\SamlConfigurationPropertyItemsArray::class})
     * @var \App\DTO\SamlConfigurationPropertyItemsArray
     */
    public $synchronize_attributes;
    /**
     * @DTA\Data(field="handleLogout", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\SamlConfigurationPropertyItemsBoolean::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\SamlConfigurationPropertyItemsBoolean::class})
     * @var \App\DTO\SamlConfigurationPropertyItemsBoolean
     */
    public $handle_logout;
    /**
     * @DTA\Data(field="logoutUrl", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\SamlConfigurationPropertyItemsString::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\SamlConfigurationPropertyItemsString::class})
     * @var \App\DTO\SamlConfigurationPropertyItemsString
     */
    public $logout_url;
    /**
     * @DTA\Data(field="clockTolerance", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\SamlConfigurationPropertyItemsLong::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\SamlConfigurationPropertyItemsLong::class})
     * @var \App\DTO\SamlConfigurationPropertyItemsLong
     */
    public $clock_tolerance;
    /**
     * @DTA\Data(field="digestMethod", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\SamlConfigurationPropertyItemsString::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\SamlConfigurationPropertyItemsString::class})
     * @var \App\DTO\SamlConfigurationPropertyItemsString
     */
    public $digest_method;
    /**
     * @DTA\Data(field="signatureMethod", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\SamlConfigurationPropertyItemsString::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\SamlConfigurationPropertyItemsString::class})
     * @var \App\DTO\SamlConfigurationPropertyItemsString
     */
    public $signature_method;
    /**
     * @DTA\Data(field="userIntermediatePath", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\SamlConfigurationPropertyItemsString::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\SamlConfigurationPropertyItemsString::class})
     * @var \App\DTO\SamlConfigurationPropertyItemsString
     */
    public $user_intermediate_path;
}
