<?php

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class InstallStatus
{
    /**
     * @DTA\Data(field="status", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\InstallStatusStatus::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\InstallStatusStatus::class})
     * @var \App\DTO\InstallStatusStatus
     */
    public $status;
}
