<?php
/**
 * SamlConfigurationInfo
 */
namespace OpenAPIServer\Model;

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

    /** @var \OpenAPIServer\Model\SamlConfigurationProperties $properties */
    private $properties;

}
