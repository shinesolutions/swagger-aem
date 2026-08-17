<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class PostAuthorizableKeystoreRequest
{
    /**
     * @DTA\Data(field="cert-chain", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $cert_chain = null;

    /**
     * @DTA\Data(field="pk", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $pk = null;

    /**
     * @DTA\Data(field="keyStore", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $key_store = null;

}
