<?php

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class TruststoreInfo
{
    /**
     * @DTA\Data(field="aliases", nullable=true)
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Strategy(name="ObjectArray", options={"type":\App\DTO\TruststoreItems::class})
     * @DTA\Validator(name="Collection", options={"validators":{
     *     {"name":"Dictionary", "options":{"type":\App\DTO\TruststoreItems::class}}
     * }})
     * @var \App\DTO\TruststoreItems[]
     */
    public $aliases;
    /**
     * False if truststore don&#39;t exist
     * @DTA\Data(field="exists", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"bool"})
     * @var bool
     */
    public $exists;
}
