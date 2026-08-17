<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Query parameters for postConfigAemHealthCheckServlet
 */
class PostConfigAemHealthCheckServletQueryData
{
    /**
     * @DTA\Data(field="bundles.ignored@TypeHint", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $bundles_ignored_type_hint;

    /**
     * @DTA\Data(field="bundles.ignored", nullable=true)
     * @DTA\Strategy(name="QueryStringScalarArray", options={"type":"string", "format":"multi"})
     * @DTA\Validator(name="QueryStringScalarArray", options={"type":"string", "format":"multi"})
     * @var string[]|null
     */
    public $bundles_ignored;

}
