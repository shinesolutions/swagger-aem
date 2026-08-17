<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Parameters for postConfigApacheSlingDavExServlet
 */
class PostConfigApacheSlingDavExServletParameterData
{
    /**
     * @DTA\Data(subset="query", field="alias@TypeHint", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $alias_type_hint = null;

    /**
     * @DTA\Data(subset="query", field="alias", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $alias = null;

    /**
     * @DTA\Data(subset="query", field="dav.create-absolute-uri@TypeHint", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $dav_create_absolute_uri_type_hint = null;

    /**
     * @DTA\Data(subset="query", field="dav.create-absolute-uri", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"bool"})
     */
    public ?bool $dav_create_absolute_uri = null;

}
