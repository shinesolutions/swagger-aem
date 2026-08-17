<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Query parameters for postQuery
 */
class PostQueryQueryData
{
    /**
     * @DTA\Data(field="1_property.value")
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $_1_property_value;

    /**
     * @DTA\Data(field="path")
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $path;

    /**
     * @DTA\Data(field="p.limit")
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"float"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"float"})
     * @var float|null
     */
    public $p_limit;

    /**
     * @DTA\Data(field="1_property")
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $_1_property;

}
