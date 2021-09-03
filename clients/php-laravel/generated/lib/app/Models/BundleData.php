<?php
/**
 * BundleData
 */
namespace app\Models;

/**
 * BundleData
 */
class BundleData {

    /** @var int $id Bundle ID*/
    private $id;

    /** @var string $name Bundle name*/
    private $name;

    /** @var bool $fragment Is bundle a fragment*/
    private $fragment;

    /** @var int $stateRaw Numeric raw bundle state value*/
    private $stateRaw;

    /** @var string $state Bundle state value*/
    private $state;

    /** @var string $version Bundle version*/
    private $version;

    /** @var string $symbolicName Bundle symbolic name*/
    private $symbolicName;

    /** @var string $category Bundle category*/
    private $category;

    /** @var \app\Models\BundleDataProp[] $props */
    private $props;

}
