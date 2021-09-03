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

    /** @var \app\Models\SamlConfigurationPropertyItemsLong $serviceRanking */
    private $serviceRanking;

    /** @var \app\Models\SamlConfigurationPropertyItemsString $idpUrl */
    private $idpUrl;

    /** @var \app\Models\SamlConfigurationPropertyItemsString $idpCertAlias */
    private $idpCertAlias;

    /** @var \app\Models\SamlConfigurationPropertyItemsBoolean $idpHttpRedirect */
    private $idpHttpRedirect;

    /** @var \app\Models\SamlConfigurationPropertyItemsString $serviceProviderEntityId */
    private $serviceProviderEntityId;

    /** @var \app\Models\SamlConfigurationPropertyItemsString $assertionConsumerServiceURL */
    private $assertionConsumerServiceURL;

    /** @var \app\Models\SamlConfigurationPropertyItemsString $spPrivateKeyAlias */
    private $spPrivateKeyAlias;

    /** @var \app\Models\SamlConfigurationPropertyItemsString $keyStorePassword */
    private $keyStorePassword;

    /** @var \app\Models\SamlConfigurationPropertyItemsString $defaultRedirectUrl */
    private $defaultRedirectUrl;

    /** @var \app\Models\SamlConfigurationPropertyItemsString $userIDAttribute */
    private $userIDAttribute;

    /** @var \app\Models\SamlConfigurationPropertyItemsBoolean $useEncryption */
    private $useEncryption;

    /** @var \app\Models\SamlConfigurationPropertyItemsBoolean $createUser */
    private $createUser;

    /** @var \app\Models\SamlConfigurationPropertyItemsBoolean $addGroupMemberships */
    private $addGroupMemberships;

    /** @var \app\Models\SamlConfigurationPropertyItemsString $groupMembershipAttribute */
    private $groupMembershipAttribute;

    /** @var \app\Models\SamlConfigurationPropertyItemsArray $defaultGroups */
    private $defaultGroups;

    /** @var \app\Models\SamlConfigurationPropertyItemsString $nameIdFormat */
    private $nameIdFormat;

    /** @var \app\Models\SamlConfigurationPropertyItemsArray $synchronizeAttributes */
    private $synchronizeAttributes;

    /** @var \app\Models\SamlConfigurationPropertyItemsBoolean $handleLogout */
    private $handleLogout;

    /** @var \app\Models\SamlConfigurationPropertyItemsString $logoutUrl */
    private $logoutUrl;

    /** @var \app\Models\SamlConfigurationPropertyItemsLong $clockTolerance */
    private $clockTolerance;

    /** @var \app\Models\SamlConfigurationPropertyItemsString $digestMethod */
    private $digestMethod;

    /** @var \app\Models\SamlConfigurationPropertyItemsString $signatureMethod */
    private $signatureMethod;

    /** @var \app\Models\SamlConfigurationPropertyItemsString $userIntermediatePath */
    private $userIntermediatePath;

}
