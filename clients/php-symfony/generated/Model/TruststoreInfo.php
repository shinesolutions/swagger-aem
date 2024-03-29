<?php
/**
 * TruststoreInfo
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
 * Class representing the TruststoreInfo model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */
class TruststoreInfo 
{
        /**
     * @var OpenAPI\Server\Model\TruststoreItems[]|null
     * @SerializedName("aliases")
     * @Assert\All({
     *   @Assert\Type("OpenAPI\Server\Model\TruststoreItems")
     * })
     * @Type("array<OpenAPI\Server\Model\TruststoreItems>")
     */
    protected $aliases;

    /**
     * False if truststore don&#39;t exist
     *
     * @var bool|null
     * @SerializedName("exists")
     * @Assert\Type("bool")
     * @Type("bool")
     */
    protected $exists;

    /**
     * Constructor
     * @param mixed[] $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->aliases = isset($data['aliases']) ? $data['aliases'] : null;
        $this->exists = isset($data['exists']) ? $data['exists'] : null;
    }

    /**
     * Gets aliases.
     *
     * @return OpenAPI\Server\Model\TruststoreItems[]|null
     */
    public function getAliases(): ?array
    {
        return $this->aliases;
    }

    /**
     * Sets aliases.
     *
     * @param OpenAPI\Server\Model\TruststoreItems[]|null $aliases
     *
     * @return $this
     */
    public function setAliases(array $aliases = null)
    {
        $this->aliases = $aliases;

        return $this;
    }

    /**
     * Gets exists.
     *
     * @return bool|null
     */
    public function isExists()
    {
        return $this->exists;
    }

    /**
     * Sets exists.
     *
     * @param bool|null $exists  False if truststore don't exist
     *
     * @return $this
     */
    public function setExists($exists = null)
    {
        $this->exists = $exists;

        return $this;
    }
}


