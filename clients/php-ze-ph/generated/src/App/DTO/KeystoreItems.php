<?php

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class KeystoreItems
{
    /**
     * Keystore alias name
     * @DTA\Data(field="alias", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $alias;
    /**
     * e.g. \&quot;privateKey\&quot;
     * @DTA\Data(field="entryType", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $entry_type;
    /**
     * e.g. \&quot;RSA\&quot;
     * @DTA\Data(field="algorithm", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $algorithm;
    /**
     * e.g. \&quot;PKCS#8\&quot;
     * @DTA\Data(field="format", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $format;
    /**
     * @DTA\Data(field="chain", nullable=true)
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Strategy(name="ObjectArray", options={"type":\App\DTO\KeystoreChainItems::class})
     * @DTA\Validator(name="Collection", options={"validators":{
     *     {"name":"Dictionary", "options":{"type":\App\DTO\KeystoreChainItems::class}}
     * }})
     * @var \App\DTO\KeystoreChainItems[]
     */
    public $chain;
}
