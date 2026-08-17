<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Query parameters for postConfigApacheSlingDavExServlet
 */
class PostConfigApacheSlingDavExServletQueryData
{
    /**
     * @DTA\Data(field="alias@TypeHint", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $alias_type_hint;

    /**
     * @DTA\Data(field="alias", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $alias;

    /**
     * @DTA\Data(field="dav.create-absolute-uri@TypeHint", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $dav_create_absolute_uri_type_hint;

    /**
     * @DTA\Data(field="dav.create-absolute-uri", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"bool"})
     * @var bool|null
     */
    public $dav_create_absolute_uri;

}
