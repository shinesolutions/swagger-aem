<?php
/**
 * KeystoreItems
 */
namespace app\Models;

/**
 * KeystoreItems
 */
class KeystoreItems {

    /** @var string $alias Keystore alias name*/
    private $alias;

    /** @var string $entry_type e.g. \&quot;privateKey\&quot;*/
    private $entry_type;

    /** @var string $algorithm e.g. \&quot;RSA\&quot;*/
    private $algorithm;

    /** @var string $format e.g. \&quot;PKCS#8\&quot;*/
    private $format;

    /** @var \app\Models\KeystoreChainItems[] $chain */
    private $chain;

}
