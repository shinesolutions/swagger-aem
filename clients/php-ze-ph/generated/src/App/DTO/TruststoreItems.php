<?php

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class TruststoreItems
{
    /**
     * Truststore alias name
     * @DTA\Data(field="alias", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $alias;
    /**
     * @DTA\Data(field="entryType", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $entry_type;
    /**
     * e.g. \&quot;CN&#x3D;localhost\&quot;
     * @DTA\Data(field="subject", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $subject;
    /**
     * e.g. \&quot;CN&#x3D;Admin\&quot;
     * @DTA\Data(field="issuer", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $issuer;
    /**
     * e.g. \&quot;Sun Jul 01 12:00:00 AEST 2018\&quot;
     * @DTA\Data(field="notBefore", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $not_before;
    /**
     * e.g. \&quot;Sun Jun 30 23:59:50 AEST 2019\&quot;
     * @DTA\Data(field="notAfter", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $not_after;
    /**
     * 18165099476682912368
     * @DTA\Data(field="serialNumber", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $serial_number;
}
