<?php

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class SamlConfigurationInfo
{
    /**
     * Persistent Identity (PID)
     * @DTA\Data(field="pid", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $pid;
    /**
     * Title
     * @DTA\Data(field="title", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $title;
    /**
     * Title
     * @DTA\Data(field="description", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $description;
    /**
     * needed for configuration binding
     * @DTA\Data(field="bundle_location", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $bundle_location;
    /**
     * needed for configuraiton binding
     * @DTA\Data(field="service_location", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $service_location;
    /**
     * @DTA\Data(field="properties", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\SamlConfigurationProperties::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\SamlConfigurationProperties::class})
     * @var \App\DTO\SamlConfigurationProperties
     */
    public $properties;
}
