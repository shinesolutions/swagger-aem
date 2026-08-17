<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Parameters for postConfigAemPasswordReset
 */
class PostConfigAemPasswordResetParameterData
{
    /**
     * @DTA\Data(subset="query", field="pwdreset.authorizables", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalarArray", options={"type":"string", "format":"multi"})
     * @DTA\Validator(subset="query", name="QueryStringScalarArray", options={"type":"string", "format":"multi"})
     */
    public ?array $pwdreset_authorizables = null;

    /**
     * @DTA\Data(subset="query", field="pwdreset.authorizables@TypeHint", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $pwdreset_authorizables_type_hint = null;

}
