<?php

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Query parameters for getQuery
 */
class GetQueryQueryData
{
    /**
     * @DTA\Data(field="1_property.value")
     * @DTA\Strategy(name="QueryParameter", options={"type":"string"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"string"})
     * @var string
     */
    public $_1_property_value;
    /**
     * @DTA\Data(field="path")
     * @DTA\Strategy(name="QueryParameter", options={"type":"string"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"string"})
     * @var string
     */
    public $path;
    /**
     * @DTA\Data(field="p.limit")
     * @DTA\Strategy(name="QueryParameter", options={"type":"float"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"float"})
     * @var float
     */
    public $p_limit;
    /**
     * @DTA\Data(field="1_property")
     * @DTA\Strategy(name="QueryParameter", options={"type":"string"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"string"})
     * @var string
     */
    public $_1_property;
}
