<?php
/**
 * SamlConfigurationInfo
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
 * Class representing the SamlConfigurationInfo model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */
class SamlConfigurationInfo 
{
        /**
     * Persistent Identity (PID)
     *
     * @var string|null
     * @SerializedName("pid")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $pid;

    /**
     * Title
     *
     * @var string|null
     * @SerializedName("title")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $title;

    /**
     * Title
     *
     * @var string|null
     * @SerializedName("description")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $description;

    /**
     * needed for configuration binding
     *
     * @var string|null
     * @SerializedName("bundle_location")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $bundleLocation;

    /**
     * needed for configuraiton binding
     *
     * @var string|null
     * @SerializedName("service_location")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $serviceLocation;

    /**
     * @var OpenAPI\Server\Model\SamlConfigurationProperties|null
     * @SerializedName("properties")
     * @Assert\Type("OpenAPI\Server\Model\SamlConfigurationProperties")
     * @Type("OpenAPI\Server\Model\SamlConfigurationProperties")
     */
    protected $properties;

    /**
     * Constructor
     * @param mixed[] $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->pid = isset($data['pid']) ? $data['pid'] : null;
        $this->title = isset($data['title']) ? $data['title'] : null;
        $this->description = isset($data['description']) ? $data['description'] : null;
        $this->bundleLocation = isset($data['bundleLocation']) ? $data['bundleLocation'] : null;
        $this->serviceLocation = isset($data['serviceLocation']) ? $data['serviceLocation'] : null;
        $this->properties = isset($data['properties']) ? $data['properties'] : null;
    }

    /**
     * Gets pid.
     *
     * @return string|null
     */
    public function getPid()
    {
        return $this->pid;
    }

    /**
     * Sets pid.
     *
     * @param string|null $pid  Persistent Identity (PID)
     *
     * @return $this
     */
    public function setPid($pid = null)
    {
        $this->pid = $pid;

        return $this;
    }

    /**
     * Gets title.
     *
     * @return string|null
     */
    public function getTitle()
    {
        return $this->title;
    }

    /**
     * Sets title.
     *
     * @param string|null $title  Title
     *
     * @return $this
     */
    public function setTitle($title = null)
    {
        $this->title = $title;

        return $this;
    }

    /**
     * Gets description.
     *
     * @return string|null
     */
    public function getDescription()
    {
        return $this->description;
    }

    /**
     * Sets description.
     *
     * @param string|null $description  Title
     *
     * @return $this
     */
    public function setDescription($description = null)
    {
        $this->description = $description;

        return $this;
    }

    /**
     * Gets bundleLocation.
     *
     * @return string|null
     */
    public function getBundleLocation()
    {
        return $this->bundleLocation;
    }

    /**
     * Sets bundleLocation.
     *
     * @param string|null $bundleLocation  needed for configuration binding
     *
     * @return $this
     */
    public function setBundleLocation($bundleLocation = null)
    {
        $this->bundleLocation = $bundleLocation;

        return $this;
    }

    /**
     * Gets serviceLocation.
     *
     * @return string|null
     */
    public function getServiceLocation()
    {
        return $this->serviceLocation;
    }

    /**
     * Sets serviceLocation.
     *
     * @param string|null $serviceLocation  needed for configuraiton binding
     *
     * @return $this
     */
    public function setServiceLocation($serviceLocation = null)
    {
        $this->serviceLocation = $serviceLocation;

        return $this;
    }

    /**
     * Gets properties.
     *
     * @return OpenAPI\Server\Model\SamlConfigurationProperties|null
     */
    public function getProperties(): ?SamlConfigurationProperties
    {
        return $this->properties;
    }

    /**
     * Sets properties.
     *
     * @param OpenAPI\Server\Model\SamlConfigurationProperties|null $properties
     *
     * @return $this
     */
    public function setProperties(SamlConfigurationProperties $properties = null)
    {
        $this->properties = $properties;

        return $this;
    }
}


