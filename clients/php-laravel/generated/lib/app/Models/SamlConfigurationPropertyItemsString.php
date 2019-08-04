<?php
/**
 * SamlConfigurationPropertyItemsString
 */
namespace app\Models;

/**
 * SamlConfigurationPropertyItemsString
 */
class SamlConfigurationPropertyItemsString {

    /** @var string $name property name*/
    private $name;

    /** @var bool $optional True if optional*/
    private $optional;

    /** @var bool $is_set True if property is set*/
    private $is_set;

    /** @var int $type Property type, 1&#x3D;String, 3&#x3D;long, 11&#x3D;boolean, 12&#x3D;Password*/
    private $type;

    /** @var string $value Property value*/
    private $value;

    /** @var string $description Property description*/
    private $description;

}
