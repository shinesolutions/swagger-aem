<?php

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class InstallStatusStatus
{
    /**
     * @DTA\Data(field="finished", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"bool"})
     * @var bool
     */
    public $finished;
    /**
     * @DTA\Data(field="itemCount", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $item_count;
}
