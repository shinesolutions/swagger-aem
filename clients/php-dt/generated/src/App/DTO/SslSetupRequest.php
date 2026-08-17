<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class SslSetupRequest
{
    /**
     * @DTA\Data(field="privatekeyFile", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $privatekey_file = null;

    /**
     * @DTA\Data(field="certificateFile", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $certificate_file = null;

}
