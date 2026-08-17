<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class PostTruststorePKCS12Request
{
    /**
     * @DTA\Data(field="truststore.p12", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $truststore_p12 = null;

}
