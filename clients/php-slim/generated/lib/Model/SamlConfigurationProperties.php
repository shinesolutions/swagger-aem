<?php
/**
 * SamlConfigurationProperties
 */
namespace OpenAPIServer\Model;

/**
 * SamlConfigurationProperties
 */
class SamlConfigurationProperties {

    /** @var \OpenAPIServer\Model\SamlConfigurationPropertyItemsArray $path */
    private $path;

    /** @var \OpenAPIServer\Model\SamlConfigurationPropertyItemsLong $serviceRanking */
    private $serviceRanking;

    /** @var \OpenAPIServer\Model\SamlConfigurationPropertyItemsString $idpUrl */
    private $idpUrl;

    /** @var \OpenAPIServer\Model\SamlConfigurationPropertyItemsString $idpCertAlias */
    private $idpCertAlias;

    /** @var \OpenAPIServer\Model\SamlConfigurationPropertyItemsBoolean $idpHttpRedirect */
    private $idpHttpRedirect;

    /** @var \OpenAPIServer\Model\SamlConfigurationPropertyItemsString $serviceProviderEntityId */
    private $serviceProviderEntityId;

    /** @var \OpenAPIServer\Model\SamlConfigurationPropertyItemsString $assertionConsumerServiceURL */
    private $assertionConsumerServiceURL;

    /** @var \OpenAPIServer\Model\SamlConfigurationPropertyItemsString $spPrivateKeyAlias */
    private $spPrivateKeyAlias;

    /** @var \OpenAPIServer\Model\SamlConfigurationPropertyItemsString $keyStorePassword */
    private $keyStorePassword;

    /** @var \OpenAPIServer\Model\SamlConfigurationPropertyItemsString $defaultRedirectUrl */
    private $defaultRedirectUrl;

    /** @var \OpenAPIServer\Model\SamlConfigurationPropertyItemsString $userIDAttribute */
    private $userIDAttribute;

    /** @var \OpenAPIServer\Model\SamlConfigurationPropertyItemsBoolean $useEncryption */
    private $useEncryption;

    /** @var \OpenAPIServer\Model\SamlConfigurationPropertyItemsBoolean $createUser */
    private $createUser;

    /** @var \OpenAPIServer\Model\SamlConfigurationPropertyItemsBoolean $addGroupMemberships */
    private $addGroupMemberships;

    /** @var \OpenAPIServer\Model\SamlConfigurationPropertyItemsString $groupMembershipAttribute */
    private $groupMembershipAttribute;

    /** @var \OpenAPIServer\Model\SamlConfigurationPropertyItemsArray $defaultGroups */
    private $defaultGroups;

    /** @var \OpenAPIServer\Model\SamlConfigurationPropertyItemsString $nameIdFormat */
    private $nameIdFormat;

    /** @var \OpenAPIServer\Model\SamlConfigurationPropertyItemsArray $synchronizeAttributes */
    private $synchronizeAttributes;

    /** @var \OpenAPIServer\Model\SamlConfigurationPropertyItemsBoolean $handleLogout */
    private $handleLogout;

    /** @var \OpenAPIServer\Model\SamlConfigurationPropertyItemsString $logoutUrl */
    private $logoutUrl;

    /** @var \OpenAPIServer\Model\SamlConfigurationPropertyItemsLong $clockTolerance */
    private $clockTolerance;

    /** @var \OpenAPIServer\Model\SamlConfigurationPropertyItemsString $digestMethod */
    private $digestMethod;

    /** @var \OpenAPIServer\Model\SamlConfigurationPropertyItemsString $signatureMethod */
    private $signatureMethod;

    /** @var \OpenAPIServer\Model\SamlConfigurationPropertyItemsString $userIntermediatePath */
    private $userIntermediatePath;

}
