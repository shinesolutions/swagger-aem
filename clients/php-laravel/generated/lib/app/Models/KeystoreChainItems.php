<?php
/**
 * KeystoreChainItems
 */
namespace app\Models;

/**
 * KeystoreChainItems
 */
class KeystoreChainItems {

    /** @var string $subject e.g. \&quot;CN&#x3D;localhost\&quot;*/
    private $subject;

    /** @var string $issuer e.g. \&quot;CN&#x3D;Admin\&quot;*/
    private $issuer;

    /** @var string $not_before e.g. \&quot;Sun Jul 01 12:00:00 AEST 2018\&quot;*/
    private $not_before;

    /** @var string $not_after e.g. \&quot;Sun Jun 30 23:59:50 AEST 2019\&quot;*/
    private $not_after;

    /** @var int $serial_number 18165099476682912368*/
    private $serial_number;

}
