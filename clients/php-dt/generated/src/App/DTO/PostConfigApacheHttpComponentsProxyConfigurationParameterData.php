<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Parameters for postConfigApacheHttpComponentsProxyConfiguration
 */
class PostConfigApacheHttpComponentsProxyConfigurationParameterData
{
    /**
     * @DTA\Data(subset="query", field="proxy.port", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"int"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"int"})
     */
    public ?int $proxy_port = null;

    /**
     * @DTA\Data(subset="query", field="proxy.port@TypeHint", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $proxy_port_type_hint = null;

    /**
     * @DTA\Data(subset="query", field="proxy.exceptions", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalarArray", options={"type":"string", "format":"multi"})
     * @DTA\Validator(subset="query", name="QueryStringScalarArray", options={"type":"string", "format":"multi"})
     */
    public ?array $proxy_exceptions = null;

    /**
     * @DTA\Data(subset="query", field="proxy.user@TypeHint", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $proxy_user_type_hint = null;

    /**
     * @DTA\Data(subset="query", field="proxy.enabled", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"bool"})
     */
    public ?bool $proxy_enabled = null;

    /**
     * @DTA\Data(subset="query", field="proxy.host", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $proxy_host = null;

    /**
     * @DTA\Data(subset="query", field="proxy.host@TypeHint", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $proxy_host_type_hint = null;

    /**
     * @DTA\Data(subset="query", field="proxy.enabled@TypeHint", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $proxy_enabled_type_hint = null;

    /**
     * @DTA\Data(subset="query", field="proxy.user", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $proxy_user = null;

    /**
     * @DTA\Data(subset="query", field="proxy.password@TypeHint", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $proxy_password_type_hint = null;

    /**
     * @DTA\Data(subset="query", field="proxy.password", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $proxy_password = null;

    /**
     * @DTA\Data(subset="query", field="proxy.exceptions@TypeHint", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $proxy_exceptions_type_hint = null;

}
