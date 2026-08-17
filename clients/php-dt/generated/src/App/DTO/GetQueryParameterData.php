<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Parameters for getQuery
 */
class GetQueryParameterData
{
    /**
     * @DTA\Data(subset="query", field="1_property.value")
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $_1_property_value = null;

    /**
     * @DTA\Data(subset="query", field="path")
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $path = null;

    /**
     * @DTA\Data(subset="query", field="p.limit")
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"float"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"float"})
     */
    public ?float $p_limit = null;

    /**
     * @DTA\Data(subset="query", field="1_property")
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $_1_property = null;

}
