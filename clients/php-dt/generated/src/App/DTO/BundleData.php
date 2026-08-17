<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class BundleData
{
    /**
     * Bundle ID
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $id = null;

    /**
     * Bundle name
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $name = null;

    /**
     * Is bundle a fragment
     * @DTA\Data(field="fragment", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $fragment = null;

    /**
     * Numeric raw bundle state value
     * @DTA\Data(field="stateRaw", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $state_raw = null;

    /**
     * Bundle state value
     * @DTA\Data(field="state", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $state = null;

    /**
     * Bundle version
     * @DTA\Data(field="version", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $version = null;

    /**
     * Bundle symbolic name
     * @DTA\Data(field="symbolicName", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $symbolic_name = null;

    /**
     * Bundle category
     * @DTA\Data(field="category", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $category = null;

    /**
     * @DTA\Data(field="props", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection4::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection4::class})
     */
    public ?\App\DTO\Collection4 $props = null;

}
