<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class SamlConfigurationProperties
{
    /**
     * @DTA\Data(field="path", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\SamlConfigurationPropertyItemsArray::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\SamlConfigurationPropertyItemsArray::class})
     */
    public ?\App\DTO\SamlConfigurationPropertyItemsArray $path = null;

    /**
     * @DTA\Data(field="service.ranking", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\SamlConfigurationPropertyItemsLong::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\SamlConfigurationPropertyItemsLong::class})
     */
    public ?\App\DTO\SamlConfigurationPropertyItemsLong $service_ranking = null;

    /**
     * @DTA\Data(field="idpUrl", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\SamlConfigurationPropertyItemsString::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\SamlConfigurationPropertyItemsString::class})
     */
    public ?\App\DTO\SamlConfigurationPropertyItemsString $idp_url = null;

    /**
     * @DTA\Data(field="idpCertAlias", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\SamlConfigurationPropertyItemsString::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\SamlConfigurationPropertyItemsString::class})
     */
    public ?\App\DTO\SamlConfigurationPropertyItemsString $idp_cert_alias = null;

    /**
     * @DTA\Data(field="idpHttpRedirect", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\SamlConfigurationPropertyItemsBoolean::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\SamlConfigurationPropertyItemsBoolean::class})
     */
    public ?\App\DTO\SamlConfigurationPropertyItemsBoolean $idp_http_redirect = null;

    /**
     * @DTA\Data(field="serviceProviderEntityId", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\SamlConfigurationPropertyItemsString::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\SamlConfigurationPropertyItemsString::class})
     */
    public ?\App\DTO\SamlConfigurationPropertyItemsString $service_provider_entity_id = null;

    /**
     * @DTA\Data(field="assertionConsumerServiceURL", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\SamlConfigurationPropertyItemsString::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\SamlConfigurationPropertyItemsString::class})
     */
    public ?\App\DTO\SamlConfigurationPropertyItemsString $assertion_consumer_service_url = null;

    /**
     * @DTA\Data(field="spPrivateKeyAlias", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\SamlConfigurationPropertyItemsString::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\SamlConfigurationPropertyItemsString::class})
     */
    public ?\App\DTO\SamlConfigurationPropertyItemsString $sp_private_key_alias = null;

    /**
     * @DTA\Data(field="keyStorePassword", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\SamlConfigurationPropertyItemsString::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\SamlConfigurationPropertyItemsString::class})
     */
    public ?\App\DTO\SamlConfigurationPropertyItemsString $key_store_password = null;

    /**
     * @DTA\Data(field="defaultRedirectUrl", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\SamlConfigurationPropertyItemsString::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\SamlConfigurationPropertyItemsString::class})
     */
    public ?\App\DTO\SamlConfigurationPropertyItemsString $default_redirect_url = null;

    /**
     * @DTA\Data(field="userIDAttribute", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\SamlConfigurationPropertyItemsString::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\SamlConfigurationPropertyItemsString::class})
     */
    public ?\App\DTO\SamlConfigurationPropertyItemsString $user_id_attribute = null;

    /**
     * @DTA\Data(field="useEncryption", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\SamlConfigurationPropertyItemsBoolean::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\SamlConfigurationPropertyItemsBoolean::class})
     */
    public ?\App\DTO\SamlConfigurationPropertyItemsBoolean $use_encryption = null;

    /**
     * @DTA\Data(field="createUser", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\SamlConfigurationPropertyItemsBoolean::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\SamlConfigurationPropertyItemsBoolean::class})
     */
    public ?\App\DTO\SamlConfigurationPropertyItemsBoolean $create_user = null;

    /**
     * @DTA\Data(field="addGroupMemberships", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\SamlConfigurationPropertyItemsBoolean::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\SamlConfigurationPropertyItemsBoolean::class})
     */
    public ?\App\DTO\SamlConfigurationPropertyItemsBoolean $add_group_memberships = null;

    /**
     * @DTA\Data(field="groupMembershipAttribute", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\SamlConfigurationPropertyItemsString::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\SamlConfigurationPropertyItemsString::class})
     */
    public ?\App\DTO\SamlConfigurationPropertyItemsString $group_membership_attribute = null;

    /**
     * @DTA\Data(field="defaultGroups", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\SamlConfigurationPropertyItemsArray::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\SamlConfigurationPropertyItemsArray::class})
     */
    public ?\App\DTO\SamlConfigurationPropertyItemsArray $default_groups = null;

    /**
     * @DTA\Data(field="nameIdFormat", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\SamlConfigurationPropertyItemsString::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\SamlConfigurationPropertyItemsString::class})
     */
    public ?\App\DTO\SamlConfigurationPropertyItemsString $name_id_format = null;

    /**
     * @DTA\Data(field="synchronizeAttributes", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\SamlConfigurationPropertyItemsArray::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\SamlConfigurationPropertyItemsArray::class})
     */
    public ?\App\DTO\SamlConfigurationPropertyItemsArray $synchronize_attributes = null;

    /**
     * @DTA\Data(field="handleLogout", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\SamlConfigurationPropertyItemsBoolean::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\SamlConfigurationPropertyItemsBoolean::class})
     */
    public ?\App\DTO\SamlConfigurationPropertyItemsBoolean $handle_logout = null;

    /**
     * @DTA\Data(field="logoutUrl", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\SamlConfigurationPropertyItemsString::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\SamlConfigurationPropertyItemsString::class})
     */
    public ?\App\DTO\SamlConfigurationPropertyItemsString $logout_url = null;

    /**
     * @DTA\Data(field="clockTolerance", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\SamlConfigurationPropertyItemsLong::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\SamlConfigurationPropertyItemsLong::class})
     */
    public ?\App\DTO\SamlConfigurationPropertyItemsLong $clock_tolerance = null;

    /**
     * @DTA\Data(field="digestMethod", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\SamlConfigurationPropertyItemsString::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\SamlConfigurationPropertyItemsString::class})
     */
    public ?\App\DTO\SamlConfigurationPropertyItemsString $digest_method = null;

    /**
     * @DTA\Data(field="signatureMethod", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\SamlConfigurationPropertyItemsString::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\SamlConfigurationPropertyItemsString::class})
     */
    public ?\App\DTO\SamlConfigurationPropertyItemsString $signature_method = null;

    /**
     * @DTA\Data(field="userIntermediatePath", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\SamlConfigurationPropertyItemsString::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\SamlConfigurationPropertyItemsString::class})
     */
    public ?\App\DTO\SamlConfigurationPropertyItemsString $user_intermediate_path = null;

}
