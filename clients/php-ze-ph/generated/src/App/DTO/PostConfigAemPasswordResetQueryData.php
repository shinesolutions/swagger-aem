<?php

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Query parameters for postConfigAemPasswordReset
 */
class PostConfigAemPasswordResetQueryData
{
    /**
     * @DTA\Data(field="pwdreset.authorizables", nullable=true)
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Strategy(name="QueryParameterArray", options={"type":"string", "format":"multi"})
     * @DTA\Validator(name="QueryParameterArrayType", options={"type":"string", "format":"multi"})
     * @var string[]
     */
    public $pwdreset_authorizables;
    /**
     * @DTA\Data(field="pwdreset.authorizables@TypeHint", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"string"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"string"})
     * @var string
     */
    public $pwdreset_authorizables_type_hint;
}
