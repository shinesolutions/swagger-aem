<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Parameters for sslSetup
 */
class SslSetupParameterData
{
    /**
     * @DTA\Data(subset="query", field="truststorePassword")
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $truststore_password = null;

    /**
     * @DTA\Data(subset="query", field="truststorePasswordConfirm")
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $truststore_password_confirm = null;

    /**
     * @DTA\Data(subset="query", field="keystorePassword")
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $keystore_password = null;

    /**
     * @DTA\Data(subset="query", field="keystorePasswordConfirm")
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $keystore_password_confirm = null;

    /**
     * @DTA\Data(subset="query", field="httpsHostname")
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $https_hostname = null;

    /**
     * @DTA\Data(subset="query", field="httpsPort")
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $https_port = null;

}
