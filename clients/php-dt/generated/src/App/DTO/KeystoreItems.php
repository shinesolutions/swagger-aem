<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class KeystoreItems
{
    /**
     * Keystore alias name
     * @DTA\Data(field="alias", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $alias = null;

    /**
     * e.g. \&quot;privateKey\&quot;
     * @DTA\Data(field="entryType", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $entry_type = null;

    /**
     * e.g. \&quot;RSA\&quot;
     * @DTA\Data(field="algorithm", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $algorithm = null;

    /**
     * e.g. \&quot;PKCS#8\&quot;
     * @DTA\Data(field="format", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $format = null;

    /**
     * @DTA\Data(field="chain", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection17::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection17::class})
     */
    public ?\App\DTO\Collection17 $chain = null;

}
