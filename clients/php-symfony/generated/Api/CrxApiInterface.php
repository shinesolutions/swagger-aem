<?php
/**
 * CrxApiInterface
 * PHP version 7.1.3
 *
 * @category Class
 * @package  OpenAPI\Server
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

namespace OpenAPI\Server\Api;

use Symfony\Component\HttpFoundation\File\UploadedFile;
use OpenAPI\Server\Model\InstallStatus;

/**
 * CrxApiInterface Interface Doc Comment
 *
 * @category Interface
 * @package  OpenAPI\Server\Api
 * @author   OpenAPI Generator team
 * @link     https://github.com/openapitools/openapi-generator
 */
interface CrxApiInterface
{

    /**
     * Sets authentication method aemAuth
     *
     * @param string $value Value of the aemAuth authentication method.
     *
     * @return void
     */
    public function setaemAuth($value);

    /**
     * Operation getCrxdeStatus
     *
     * @param  \int $responseCode     The HTTP response code to return
     * @param  \array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return \string
     */
    public function getCrxdeStatus(&$responseCode, array &$responseHeaders);

    /**
     * Operation getInstallStatus
     *
     * @param  \int $responseCode     The HTTP response code to return
     * @param  \array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return \OpenAPI\Server\Model\InstallStatus
     */
    public function getInstallStatus(&$responseCode, array &$responseHeaders);

    /**
     * Operation getPackageManagerServlet
     *
     * @param  \int $responseCode     The HTTP response code to return
     * @param  \array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return void
     */
    public function getPackageManagerServlet(&$responseCode, array &$responseHeaders);

    /**
     * Operation postPackageService
     *
     * @param  \string $cmd   (required)
     * @param  \int $responseCode     The HTTP response code to return
     * @param  \array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return \string
     */
    public function postPackageService($cmd, &$responseCode, array &$responseHeaders);

    /**
     * Operation postPackageServiceJson
     *
     * @param  \string $path   (required)
     * @param  \string $cmd   (required)
     * @param  \string $groupName   (optional)
     * @param  \string $packageName   (optional)
     * @param  \string $packageVersion   (optional)
     * @param  \string $charset   (optional)
     * @param  \bool $force   (optional)
     * @param  \bool $recursive   (optional)
     * @param  \UploadedFile $package   (optional)
     * @param  \int $responseCode     The HTTP response code to return
     * @param  \array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return \string
     */
    public function postPackageServiceJson($path, $cmd, $groupName = null, $packageName = null, $packageVersion = null, $charset = null, $force = null, $recursive = null, UploadedFile $package = null, &$responseCode, array &$responseHeaders);

    /**
     * Operation postPackageUpdate
     *
     * @param  \string $groupName   (required)
     * @param  \string $packageName   (required)
     * @param  \string $version   (required)
     * @param  \string $path   (required)
     * @param  \string $filter   (optional)
     * @param  \string $charset   (optional)
     * @param  \int $responseCode     The HTTP response code to return
     * @param  \array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return \string
     */
    public function postPackageUpdate($groupName, $packageName, $version, $path, $filter = null, $charset = null, &$responseCode, array &$responseHeaders);

    /**
     * Operation postSetPassword
     *
     * @param  \string $old   (required)
     * @param  \string $plain   (required)
     * @param  \string $verify   (required)
     * @param  \int $responseCode     The HTTP response code to return
     * @param  \array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return \string
     */
    public function postSetPassword($old, $plain, $verify, &$responseCode, array &$responseHeaders);
}
