<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Parameters for postConfigAemHealthCheckServlet
 */
class PostConfigAemHealthCheckServletParameterData
{
    /**
     * @DTA\Data(subset="query", field="bundles.ignored@TypeHint", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $bundles_ignored_type_hint = null;

    /**
     * @DTA\Data(subset="query", field="bundles.ignored", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalarArray", options={"type":"string", "format":"multi"})
     * @DTA\Validator(subset="query", name="QueryStringScalarArray", options={"type":"string", "format":"multi"})
     */
    public ?array $bundles_ignored = null;

}
