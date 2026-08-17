<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Parameters for postConfigProperty
 */
class PostConfigPropertyParameterData
{
    /**
     * @DTA\Data(subset="path", field="configNodeName")
     * @DTA\Strategy(subset="path", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="path", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $config_node_name = null;

}
