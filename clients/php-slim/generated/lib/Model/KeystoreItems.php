<?php
/**
 * KeystoreItems
 */
namespace OpenAPIServer\Model;

/**
 * KeystoreItems
 */
class KeystoreItems {

    /** @var string $alias Keystore alias name*/
    private $alias;

    /** @var string $entryType e.g. \&quot;privateKey\&quot;*/
    private $entryType;

    /** @var string $algorithm e.g. \&quot;RSA\&quot;*/
    private $algorithm;

    /** @var string $format e.g. \&quot;PKCS#8\&quot;*/
    private $format;

    /** @var \OpenAPIServer\Model\KeystoreChainItems[] $chain */
    private $chain;

}
