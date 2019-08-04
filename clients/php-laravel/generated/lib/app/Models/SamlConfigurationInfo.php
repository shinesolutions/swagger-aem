<?php
/**
 * SamlConfigurationInfo
 */
namespace app\Models;

/**
 * SamlConfigurationInfo
 */
class SamlConfigurationInfo {

    /** @var string $pid Persistent Identity (PID)*/
    private $pid;

    /** @var string $title Title*/
    private $title;

    /** @var string $description Title*/
    private $description;

    /** @var string $bundle_location needed for configuration binding*/
    private $bundle_location;

    /** @var string $service_location needed for configuraiton binding*/
    private $service_location;

    /** @var \app\Models\SamlConfigurationProperties $properties */
    private $properties;

}
