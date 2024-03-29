<?php
/**
 * KeystoreChainItems
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
 * Class representing the KeystoreChainItems model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */
class KeystoreChainItems 
{
        /**
     * e.g. \&quot;CN&#x3D;localhost\&quot;
     *
     * @var string|null
     * @SerializedName("subject")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $subject;

    /**
     * e.g. \&quot;CN&#x3D;Admin\&quot;
     *
     * @var string|null
     * @SerializedName("issuer")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $issuer;

    /**
     * e.g. \&quot;Sun Jul 01 12:00:00 AEST 2018\&quot;
     *
     * @var string|null
     * @SerializedName("notBefore")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $notBefore;

    /**
     * e.g. \&quot;Sun Jun 30 23:59:50 AEST 2019\&quot;
     *
     * @var string|null
     * @SerializedName("notAfter")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $notAfter;

    /**
     * 18165099476682912368
     *
     * @var int|null
     * @SerializedName("serialNumber")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected $serialNumber;

    /**
     * Constructor
     * @param mixed[] $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->subject = isset($data['subject']) ? $data['subject'] : null;
        $this->issuer = isset($data['issuer']) ? $data['issuer'] : null;
        $this->notBefore = isset($data['notBefore']) ? $data['notBefore'] : null;
        $this->notAfter = isset($data['notAfter']) ? $data['notAfter'] : null;
        $this->serialNumber = isset($data['serialNumber']) ? $data['serialNumber'] : null;
    }

    /**
     * Gets subject.
     *
     * @return string|null
     */
    public function getSubject()
    {
        return $this->subject;
    }

    /**
     * Sets subject.
     *
     * @param string|null $subject  e.g. \"CN=localhost\"
     *
     * @return $this
     */
    public function setSubject($subject = null)
    {
        $this->subject = $subject;

        return $this;
    }

    /**
     * Gets issuer.
     *
     * @return string|null
     */
    public function getIssuer()
    {
        return $this->issuer;
    }

    /**
     * Sets issuer.
     *
     * @param string|null $issuer  e.g. \"CN=Admin\"
     *
     * @return $this
     */
    public function setIssuer($issuer = null)
    {
        $this->issuer = $issuer;

        return $this;
    }

    /**
     * Gets notBefore.
     *
     * @return string|null
     */
    public function getNotBefore()
    {
        return $this->notBefore;
    }

    /**
     * Sets notBefore.
     *
     * @param string|null $notBefore  e.g. \"Sun Jul 01 12:00:00 AEST 2018\"
     *
     * @return $this
     */
    public function setNotBefore($notBefore = null)
    {
        $this->notBefore = $notBefore;

        return $this;
    }

    /**
     * Gets notAfter.
     *
     * @return string|null
     */
    public function getNotAfter()
    {
        return $this->notAfter;
    }

    /**
     * Sets notAfter.
     *
     * @param string|null $notAfter  e.g. \"Sun Jun 30 23:59:50 AEST 2019\"
     *
     * @return $this
     */
    public function setNotAfter($notAfter = null)
    {
        $this->notAfter = $notAfter;

        return $this;
    }

    /**
     * Gets serialNumber.
     *
     * @return int|null
     */
    public function getSerialNumber()
    {
        return $this->serialNumber;
    }

    /**
     * Sets serialNumber.
     *
     * @param int|null $serialNumber  18165099476682912368
     *
     * @return $this
     */
    public function setSerialNumber($serialNumber = null)
    {
        $this->serialNumber = $serialNumber;

        return $this;
    }
}


