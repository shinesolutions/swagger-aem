<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class KeystoreItems
{
    /**
     * Keystore alias name
     * @DTA\Data(field="alias", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $alias;

    /**
     * e.g. \&quot;privateKey\&quot;
     * @DTA\Data(field="entryType", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $entry_type;

    /**
     * e.g. \&quot;RSA\&quot;
     * @DTA\Data(field="algorithm", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $algorithm;

    /**
     * e.g. \&quot;PKCS#8\&quot;
     * @DTA\Data(field="format", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $format;

    /**
     * @DTA\Data(field="chain", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection17::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection17::class})
     * @var \App\DTO\Collection17|null
     */
    public $chain;

}
