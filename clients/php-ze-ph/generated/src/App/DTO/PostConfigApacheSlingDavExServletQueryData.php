<?php

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Query parameters for postConfigApacheSlingDavExServlet
 */
class PostConfigApacheSlingDavExServletQueryData
{
    /**
     * @DTA\Data(field="alias@TypeHint", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"string"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"string"})
     * @var string
     */
    public $alias_type_hint;
    /**
     * @DTA\Data(field="alias", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"string"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"string"})
     * @var string
     */
    public $alias;
    /**
     * @DTA\Data(field="dav.create-absolute-uri@TypeHint", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"string"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"string"})
     * @var string
     */
    public $dav_create_absolute_uri_type_hint;
    /**
     * @DTA\Data(field="dav.create-absolute-uri", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"bool"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"bool"})
     * @var bool
     */
    public $dav_create_absolute_uri;
}
