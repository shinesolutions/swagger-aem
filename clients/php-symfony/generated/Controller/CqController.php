<?php

/**
 * CqController
 * PHP version 7.1.3
 *
 * @category Class
 * @package  OpenAPI\Server\Controller
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

namespace OpenAPI\Server\Controller;

use \Exception;
use JMS\Serializer\Exception\RuntimeException as SerializerRuntimeException;
use Symfony\Component\HttpFoundation\Request;
use Symfony\Component\HttpFoundation\Response;
use Symfony\Component\HttpKernel\Exception\HttpException;
use Symfony\Component\Validator\Constraints as Assert;
use OpenAPI\Server\Api\CqApiInterface;

/**
 * CqController Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Server\Controller
 * @author   OpenAPI Generator team
 * @link     https://github.com/openapitools/openapi-generator
 */
class CqController extends Controller
{

    /**
     * Operation getLoginPage
     *
     * @param Request $request The Symfony request to handle.
     * @return Response The Symfony response.
     */
    public function getLoginPageAction(Request $request)
    {
        // Figure out what data format to return to the client
        $produces = ['text/html'];
        // Figure out what the client accepts
        $clientAccepts = $request->headers->has('Accept')?$request->headers->get('Accept'):'*/*';
        $responseFormat = $this->getOutputFormat($clientAccepts, $produces);
        if ($responseFormat === null) {
            return new Response('', 406);
        }

        // Handle authentication

        // Read out all input parameter values into variables

        // Use the default value if no value was provided

        // Validate the input values


        try {
            $handler = $this->getApiHandler();

            
            // Make the call to the business logic
            $responseCode = 200;
            $responseHeaders = [];
            $result = $handler->getLoginPage($responseCode, $responseHeaders);

            // Find default response message
            $message = 'Default response';

            // Find a more specific message, if available
            switch ($responseCode) {
                case 0:
                    $message = 'Default response';
                    break;
            }

            return new Response(
                $result !== null ?$this->serialize($result, $responseFormat):'',
                $responseCode,
                array_merge(
                    $responseHeaders,
                    [
                        'Content-Type' => $responseFormat,
                        'X-OpenAPI-Message' => $message
                    ]
                )
            );
        } catch (Exception $fallthrough) {
            return $this->createErrorResponse(new HttpException(500, 'An unsuspected error occurred.', $fallthrough));
        }
    }

    /**
     * Operation postCqActions
     *
     * @param Request $request The Symfony request to handle.
     * @return Response The Symfony response.
     */
    public function postCqActionsAction(Request $request)
    {
        // Handle authentication
        // Authentication 'aemAuth' required
        // HTTP basic authentication required
        $securityaemAuth = $request->headers->get('authorization');

        // Read out all input parameter values into variables
        $authorizableId = $request->query->get('authorizableId');
        $changelog = $request->query->get('changelog');

        // Use the default value if no value was provided

        // Deserialize the input values that needs it
        try {
            $authorizableId = $this->deserialize($authorizableId, 'string', 'string');
            $changelog = $this->deserialize($changelog, 'string', 'string');
        } catch (SerializerRuntimeException $exception) {
            return $this->createBadRequestResponse($exception->getMessage());
        }

        // Validate the input values
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("string");
        $response = $this->validate($authorizableId, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("string");
        $response = $this->validate($changelog, $asserts);
        if ($response instanceof Response) {
            return $response;
        }


        try {
            $handler = $this->getApiHandler();

            // Set authentication method 'aemAuth'
            $handler->setaemAuth($securityaemAuth);
            
            // Make the call to the business logic
            $responseCode = 204;
            $responseHeaders = [];
            $result = $handler->postCqActions($authorizableId, $changelog, $responseCode, $responseHeaders);

            // Find default response message
            $message = 'Default response';

            // Find a more specific message, if available
            switch ($responseCode) {
                case 0:
                    $message = 'Default response';
                    break;
            }

            return new Response(
                '',
                $responseCode,
                array_merge(
                    $responseHeaders,
                    [
                        'X-OpenAPI-Message' => $message
                    ]
                )
            );
        } catch (Exception $fallthrough) {
            return $this->createErrorResponse(new HttpException(500, 'An unsuspected error occurred.', $fallthrough));
        }
    }

    /**
     * Returns the handler for this API controller.
     * @return CqApiInterface
     */
    public function getApiHandler()
    {
        return $this->apiServer->getApiHandler('cq');
    }
}
