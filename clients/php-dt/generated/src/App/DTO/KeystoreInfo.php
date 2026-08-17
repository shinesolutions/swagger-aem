<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class KeystoreInfo
{
    /**
     * @DTA\Data(field="aliases", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection18::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection18::class})
     */
    public ?\App\DTO\Collection18 $aliases = null;

    /**
     * False if truststore don&#39;t exist
     * @DTA\Data(field="exists", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $exists = null;

}
