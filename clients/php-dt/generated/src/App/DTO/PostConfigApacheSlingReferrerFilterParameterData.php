<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Parameters for postConfigApacheSlingReferrerFilter
 */
class PostConfigApacheSlingReferrerFilterParameterData
{
    /**
     * @DTA\Data(subset="query", field="allow.hosts", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $allow_hosts = null;

    /**
     * @DTA\Data(subset="query", field="filter.methods", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $filter_methods = null;

    /**
     * @DTA\Data(subset="query", field="allow.hosts.regexp", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $allow_hosts_regexp = null;

    /**
     * @DTA\Data(subset="query", field="allow.empty", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"bool"})
     */
    public ?bool $allow_empty = null;

    /**
     * @DTA\Data(subset="query", field="allow.hosts@TypeHint", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $allow_hosts_type_hint = null;

    /**
     * @DTA\Data(subset="query", field="allow.empty@TypeHint", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $allow_empty_type_hint = null;

    /**
     * @DTA\Data(subset="query", field="filter.methods@TypeHint", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $filter_methods_type_hint = null;

    /**
     * @DTA\Data(subset="query", field="allow.hosts.regexp@TypeHint", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $allow_hosts_regexp_type_hint = null;

}
