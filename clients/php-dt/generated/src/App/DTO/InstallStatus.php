<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class InstallStatus
{
    /**
     * @DTA\Data(field="status", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\InstallStatusStatus::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\InstallStatusStatus::class})
     */
    public ?\App\DTO\InstallStatusStatus $status = null;

}
