<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class TruststoreItems
{
    /**
     * Truststore alias name
     * @DTA\Data(field="alias", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $alias = null;

    /**
     * @DTA\Data(field="entryType", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $entry_type = null;

    /**
     * e.g. \&quot;CN&#x3D;localhost\&quot;
     * @DTA\Data(field="subject", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $subject = null;

    /**
     * e.g. \&quot;CN&#x3D;Admin\&quot;
     * @DTA\Data(field="issuer", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $issuer = null;

    /**
     * e.g. \&quot;Sun Jul 01 12:00:00 AEST 2018\&quot;
     * @DTA\Data(field="notBefore", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $not_before = null;

    /**
     * e.g. \&quot;Sun Jun 30 23:59:50 AEST 2019\&quot;
     * @DTA\Data(field="notAfter", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $not_after = null;

    /**
     * 18165099476682912368
     * @DTA\Data(field="serialNumber", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $serial_number = null;

}
