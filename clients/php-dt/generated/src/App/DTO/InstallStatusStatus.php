<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class InstallStatusStatus
{
    /**
     * @DTA\Data(field="finished", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $finished = null;

    /**
     * @DTA\Data(field="itemCount", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $item_count = null;

}
