<?php

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Query parameters for postConfigApacheSlingReferrerFilter
 */
class PostConfigApacheSlingReferrerFilterQueryData
{
    /**
     * @DTA\Data(field="allow.hosts", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"string"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"string"})
     * @var string
     */
    public $allow_hosts;
    /**
     * @DTA\Data(field="filter.methods", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"string"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"string"})
     * @var string
     */
    public $filter_methods;
    /**
     * @DTA\Data(field="allow.hosts.regexp", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"string"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"string"})
     * @var string
     */
    public $allow_hosts_regexp;
    /**
     * @DTA\Data(field="allow.empty", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"bool"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"bool"})
     * @var bool
     */
    public $allow_empty;
    /**
     * @DTA\Data(field="allow.hosts@TypeHint", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"string"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"string"})
     * @var string
     */
    public $allow_hosts_type_hint;
    /**
     * @DTA\Data(field="allow.empty@TypeHint", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"string"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"string"})
     * @var string
     */
    public $allow_empty_type_hint;
    /**
     * @DTA\Data(field="filter.methods@TypeHint", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"string"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"string"})
     * @var string
     */
    public $filter_methods_type_hint;
    /**
     * @DTA\Data(field="allow.hosts.regexp@TypeHint", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"string"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"string"})
     * @var string
     */
    public $allow_hosts_regexp_type_hint;
}
