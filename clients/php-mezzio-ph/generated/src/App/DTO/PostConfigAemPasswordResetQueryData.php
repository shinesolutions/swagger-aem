<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Query parameters for postConfigAemPasswordReset
 */
class PostConfigAemPasswordResetQueryData
{
    /**
     * @DTA\Data(field="pwdreset.authorizables", nullable=true)
     * @DTA\Strategy(name="QueryStringScalarArray", options={"type":"string", "format":"multi"})
     * @DTA\Validator(name="QueryStringScalarArray", options={"type":"string", "format":"multi"})
     * @var string[]|null
     */
    public $pwdreset_authorizables;

    /**
     * @DTA\Data(field="pwdreset.authorizables@TypeHint", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $pwdreset_authorizables_type_hint;

}
