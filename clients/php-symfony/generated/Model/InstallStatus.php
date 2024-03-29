<?php
/**
 * InstallStatus
 *
 * PHP version 7.1.3
 *
 * @category Class
 * @package  OpenAPI\Server\Model
 * @author   OpenAPI Generator team
 * @link     https://github.com/openapitools/openapi-generator
 */

/**
 * Adobe Experience Manager (AEM) API
 *
 * Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API
 *
 * The version of the OpenAPI document: 3.5.0-pre.0
 * Contact: opensource@shinesolutions.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 *
 */

/**
 * NOTE: This class is auto generated by the openapi generator program.
 * https://github.com/openapitools/openapi-generator
 * Do not edit the class manually.
 */

namespace OpenAPI\Server\Model;

use Symfony\Component\Validator\Constraints as Assert;
use JMS\Serializer\Annotation\Type;
use JMS\Serializer\Annotation\SerializedName;

/**
 * Class representing the InstallStatus model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */
class InstallStatus 
{
        /**
     * @var OpenAPI\Server\Model\InstallStatusStatus|null
     * @SerializedName("status")
     * @Assert\Type("OpenAPI\Server\Model\InstallStatusStatus")
     * @Type("OpenAPI\Server\Model\InstallStatusStatus")
     */
    protected $status;

    /**
     * Constructor
     * @param mixed[] $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->status = isset($data['status']) ? $data['status'] : null;
    }

    /**
     * Gets status.
     *
     * @return OpenAPI\Server\Model\InstallStatusStatus|null
     */
    public function getStatus(): ?InstallStatusStatus
    {
        return $this->status;
    }

    /**
     * Sets status.
     *
     * @param OpenAPI\Server\Model\InstallStatusStatus|null $status
     *
     * @return $this
     */
    public function setStatus(InstallStatusStatus $status = null)
    {
        $this->status = $status;

        return $this;
    }
}


