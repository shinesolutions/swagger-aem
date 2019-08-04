<?php
/**
 * KeystoreChainItems
 */
namespace OpenAPIServer\Model;

/**
 * KeystoreChainItems
 */
class KeystoreChainItems {

    /** @var string $subject e.g. \&quot;CN&#x3D;localhost\&quot;*/
    private $subject;

    /** @var string $issuer e.g. \&quot;CN&#x3D;Admin\&quot;*/
    private $issuer;

    /** @var string $notBefore e.g. \&quot;Sun Jul 01 12:00:00 AEST 2018\&quot;*/
    private $notBefore;

    /** @var string $notAfter e.g. \&quot;Sun Jun 30 23:59:50 AEST 2019\&quot;*/
    private $notAfter;

    /** @var int $serialNumber 18165099476682912368*/
    private $serialNumber;

}
