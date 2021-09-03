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

    /** @var string $bundleLocation needed for configuration binding*/
    private $bundleLocation;

    /** @var string $serviceLocation needed for configuraiton binding*/
    private $serviceLocation;

    /** @var \app\Models\SamlConfigurationProperties $properties */
    private $properties;

}
