<?php
declare(strict_types=1);

namespace App;

use Articus\DataTransfer as DT;
use OpenAPIGenerator\APIClient as OAGAC;
use Psr\Http\Client\ClientExceptionInterface;
use Psr\Http\Message\ResponseInterface;

/**
 * Adobe Experience Manager (AEM) API
 * Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API
 * The version of the OpenAPI document: 3.7.1-pre.0
 */
class ApiClient extends OAGAC\AbstractApiClient
{
    //region deleteAgent
    /**
     * @param \App\DTO\DeleteAgentParameterData $parameters
     * @param iterable<string, string[]> $security
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function deleteAgentRaw(
        \App\DTO\DeleteAgentParameterData $parameters,
        iterable $security = ['aemAuth' => []]
    ): ResponseInterface
    {
        $request = $this->createRequest('DELETE', '/etc/replication/agents.{runmode}/{name}', $this->getPathParameters($parameters), []);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * @param \App\DTO\DeleteAgentParameterData $parameters
     * @param iterable<string, string[]> $security
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function deleteAgent(
        \App\DTO\DeleteAgentParameterData $parameters,
        iterable $security = ['aemAuth' => []]
    ): array
    {
        $response = $this->deleteAgentRaw($parameters, $security);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            default:
                /* Default response */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * @param \App\DTO\DeleteAgentParameterData $parameters
     * @param iterable<string, string[]> $security
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function deleteAgentResult(
        \App\DTO\DeleteAgentParameterData $parameters,
        iterable $security = ['aemAuth' => []]
    )
    {
        return $this->getSuccessfulContent(...$this->deleteAgent($parameters, $security));
    }
    //endregion

    //region deleteNode
    /**
     * @param \App\DTO\DeleteNodeParameterData $parameters
     * @param iterable<string, string[]> $security
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function deleteNodeRaw(
        \App\DTO\DeleteNodeParameterData $parameters,
        iterable $security = ['aemAuth' => []]
    ): ResponseInterface
    {
        $request = $this->createRequest('DELETE', '/{path}/{name}', $this->getPathParameters($parameters), []);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * @param \App\DTO\DeleteNodeParameterData $parameters
     * @param iterable<string, string[]> $security
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function deleteNode(
        \App\DTO\DeleteNodeParameterData $parameters,
        iterable $security = ['aemAuth' => []]
    ): array
    {
        $response = $this->deleteNodeRaw($parameters, $security);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            default:
                /* Default response */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * @param \App\DTO\DeleteNodeParameterData $parameters
     * @param iterable<string, string[]> $security
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function deleteNodeResult(
        \App\DTO\DeleteNodeParameterData $parameters,
        iterable $security = ['aemAuth' => []]
    )
    {
        return $this->getSuccessfulContent(...$this->deleteNode($parameters, $security));
    }
    //endregion

    //region getAemHealthCheck
    /**
     * @param \App\DTO\GetAemHealthCheckParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function getAemHealthCheckRaw(
        \App\DTO\GetAemHealthCheckParameterData $parameters,
        iterable $security = ['aemAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/system/health', [], $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * @param \App\DTO\GetAemHealthCheckParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function getAemHealthCheck(
        \App\DTO\GetAemHealthCheckParameterData $parameters,
        iterable $security = ['aemAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->getAemHealthCheckRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            default:
                /* Default response */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * @param \App\DTO\GetAemHealthCheckParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return string
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function getAemHealthCheckResult(
        \App\DTO\GetAemHealthCheckParameterData $parameters,
        iterable $security = ['aemAuth' => []],
        string $responseMediaType = 'application/json'
    ): string
    {
        return $this->getSuccessfulContent(...$this->getAemHealthCheck($parameters, $security, $responseMediaType));
    }
    //endregion

    //region getAemProductInfo
    /**
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function getAemProductInfoRaw(
        iterable $security = ['aemAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/system/console/status-productinfo.json', [], []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function getAemProductInfo(
        iterable $security = ['aemAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->getAemProductInfoRaw($security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            default:
                /* Default response */
                $responseContent = new \App\DTO\Collection16();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\Collection16
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function getAemProductInfoResult(
        iterable $security = ['aemAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\Collection16
    {
        return $this->getSuccessfulContent(...$this->getAemProductInfo($security, $responseMediaType));
    }
    //endregion

    //region getAgent
    /**
     * @param \App\DTO\GetAgentParameterData $parameters
     * @param iterable<string, string[]> $security
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function getAgentRaw(
        \App\DTO\GetAgentParameterData $parameters,
        iterable $security = ['aemAuth' => []]
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/etc/replication/agents.{runmode}/{name}', $this->getPathParameters($parameters), []);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * @param \App\DTO\GetAgentParameterData $parameters
     * @param iterable<string, string[]> $security
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function getAgent(
        \App\DTO\GetAgentParameterData $parameters,
        iterable $security = ['aemAuth' => []]
    ): array
    {
        $response = $this->getAgentRaw($parameters, $security);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            default:
                /* Default response */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * @param \App\DTO\GetAgentParameterData $parameters
     * @param iterable<string, string[]> $security
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function getAgentResult(
        \App\DTO\GetAgentParameterData $parameters,
        iterable $security = ['aemAuth' => []]
    )
    {
        return $this->getSuccessfulContent(...$this->getAgent($parameters, $security));
    }
    //endregion

    //region getAgents
    /**
     * @param \App\DTO\GetAgentsParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function getAgentsRaw(
        \App\DTO\GetAgentsParameterData $parameters,
        iterable $security = ['aemAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/etc/replication/agents.{runmode}.-1.json', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * @param \App\DTO\GetAgentsParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function getAgents(
        \App\DTO\GetAgentsParameterData $parameters,
        iterable $security = ['aemAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->getAgentsRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            default:
                /* Default response */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * @param \App\DTO\GetAgentsParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return string
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function getAgentsResult(
        \App\DTO\GetAgentsParameterData $parameters,
        iterable $security = ['aemAuth' => []],
        string $responseMediaType = 'application/json'
    ): string
    {
        return $this->getSuccessfulContent(...$this->getAgents($parameters, $security, $responseMediaType));
    }
    //endregion

    //region getAuthorizableKeystore
    /**
     * @param \App\DTO\GetAuthorizableKeystoreParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function getAuthorizableKeystoreRaw(
        \App\DTO\GetAuthorizableKeystoreParameterData $parameters,
        iterable $security = ['aemAuth' => []],
        string $responseMediaType = 'text/plain'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/{intermediatePath}/{authorizableId}.ks.json', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * @param \App\DTO\GetAuthorizableKeystoreParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function getAuthorizableKeystore(
        \App\DTO\GetAuthorizableKeystoreParameterData $parameters,
        iterable $security = ['aemAuth' => []],
        string $responseMediaType = 'text/plain'
    ): array
    {
        $response = $this->getAuthorizableKeystoreRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Retrieved Authorizable Keystore info */
                $responseContent = new \App\DTO\KeystoreInfo();
                break;
            default:
                /* Default response */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * @param \App\DTO\GetAuthorizableKeystoreParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\KeystoreInfo
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function getAuthorizableKeystoreResult(
        \App\DTO\GetAuthorizableKeystoreParameterData $parameters,
        iterable $security = ['aemAuth' => []],
        string $responseMediaType = 'text/plain'
    ): \App\DTO\KeystoreInfo
    {
        return $this->getSuccessfulContent(...$this->getAuthorizableKeystore($parameters, $security, $responseMediaType));
    }
    //endregion

    //region getBundleInfo
    /**
     * @param \App\DTO\GetBundleInfoParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function getBundleInfoRaw(
        \App\DTO\GetBundleInfoParameterData $parameters,
        iterable $security = ['aemAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/system/console/bundles/{name}.json', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * @param \App\DTO\GetBundleInfoParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function getBundleInfo(
        \App\DTO\GetBundleInfoParameterData $parameters,
        iterable $security = ['aemAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->getBundleInfoRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Retrieved bundle info */
                $responseContent = new \App\DTO\BundleInfo();
                break;
            default:
                /* Default response */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * @param \App\DTO\GetBundleInfoParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\BundleInfo
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function getBundleInfoResult(
        \App\DTO\GetBundleInfoParameterData $parameters,
        iterable $security = ['aemAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\BundleInfo
    {
        return $this->getSuccessfulContent(...$this->getBundleInfo($parameters, $security, $responseMediaType));
    }
    //endregion

    //region getConfigMgr
    /**
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function getConfigMgrRaw(
        iterable $security = ['aemAuth' => []],
        string $responseMediaType = 'text/xml'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/system/console/configMgr', [], []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function getConfigMgr(
        iterable $security = ['aemAuth' => []],
        string $responseMediaType = 'text/xml'
    ): array
    {
        $response = $this->getConfigMgrRaw($security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* OK */
                break;
            case 5XX:
                /* Unexpected error. */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return string
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function getConfigMgrResult(
        iterable $security = ['aemAuth' => []],
        string $responseMediaType = 'text/xml'
    ): string
    {
        return $this->getSuccessfulContent(...$this->getConfigMgr($security, $responseMediaType));
    }
    //endregion

    //region getCrxdeStatus
    /**
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function getCrxdeStatusRaw(
        iterable $security = ['aemAuth' => []],
        string $responseMediaType = 'plain/text'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/crx/server/crx.default/jcr:root/.1.json', [], []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function getCrxdeStatus(
        iterable $security = ['aemAuth' => []],
        string $responseMediaType = 'plain/text'
    ): array
    {
        $response = $this->getCrxdeStatusRaw($security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* CRXDE is enabled */
                break;
            case 404:
                /* CRXDE is disabled */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return string
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function getCrxdeStatusResult(
        iterable $security = ['aemAuth' => []],
        string $responseMediaType = 'plain/text'
    ): string
    {
        return $this->getSuccessfulContent(...$this->getCrxdeStatus($security, $responseMediaType));
    }
    //endregion

    //region getInstallStatus
    /**
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function getInstallStatusRaw(
        iterable $security = ['aemAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/crx/packmgr/installstatus.jsp', [], []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function getInstallStatus(
        iterable $security = ['aemAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->getInstallStatusRaw($security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Retrieved CRX package manager install status */
                $responseContent = new \App\DTO\InstallStatus();
                break;
            default:
                /* Default response */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\InstallStatus
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function getInstallStatusResult(
        iterable $security = ['aemAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\InstallStatus
    {
        return $this->getSuccessfulContent(...$this->getInstallStatus($security, $responseMediaType));
    }
    //endregion

    //region getKeystore
    /**
     * @param \App\DTO\GetKeystoreParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function getKeystoreRaw(
        \App\DTO\GetKeystoreParameterData $parameters,
        iterable $security = ['aemAuth' => []],
        string $responseMediaType = 'application/octet-stream'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/{intermediatePath}/{authorizableId}/keystore/store.p12', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * @param \App\DTO\GetKeystoreParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function getKeystore(
        \App\DTO\GetKeystoreParameterData $parameters,
        iterable $security = ['aemAuth' => []],
        string $responseMediaType = 'application/octet-stream'
    ): array
    {
        $response = $this->getKeystoreRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            default:
                /* Default response */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * @param \App\DTO\GetKeystoreParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return string
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function getKeystoreResult(
        \App\DTO\GetKeystoreParameterData $parameters,
        iterable $security = ['aemAuth' => []],
        string $responseMediaType = 'application/octet-stream'
    ): string
    {
        return $this->getSuccessfulContent(...$this->getKeystore($parameters, $security, $responseMediaType));
    }
    //endregion

    //region getLoginPage
    /**
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function getLoginPageRaw(
        string $responseMediaType = 'text/html'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/libs/granite/core/content/login.html', [], []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function getLoginPage(
        string $responseMediaType = 'text/html'
    ): array
    {
        $response = $this->getLoginPageRaw($responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            default:
                /* Default response */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * @param string $responseMediaType
     * @return string
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function getLoginPageResult(
        string $responseMediaType = 'text/html'
    ): string
    {
        return $this->getSuccessfulContent(...$this->getLoginPage($responseMediaType));
    }
    //endregion

    //region getNode
    /**
     * @param \App\DTO\GetNodeParameterData $parameters
     * @param iterable<string, string[]> $security
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function getNodeRaw(
        \App\DTO\GetNodeParameterData $parameters,
        iterable $security = ['aemAuth' => []]
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/{path}/{name}', $this->getPathParameters($parameters), []);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * @param \App\DTO\GetNodeParameterData $parameters
     * @param iterable<string, string[]> $security
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function getNode(
        \App\DTO\GetNodeParameterData $parameters,
        iterable $security = ['aemAuth' => []]
    ): array
    {
        $response = $this->getNodeRaw($parameters, $security);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            default:
                /* Default response */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * @param \App\DTO\GetNodeParameterData $parameters
     * @param iterable<string, string[]> $security
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function getNodeResult(
        \App\DTO\GetNodeParameterData $parameters,
        iterable $security = ['aemAuth' => []]
    )
    {
        return $this->getSuccessfulContent(...$this->getNode($parameters, $security));
    }
    //endregion

    //region getPackage
    /**
     * @param \App\DTO\GetPackageParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function getPackageRaw(
        \App\DTO\GetPackageParameterData $parameters,
        iterable $security = ['aemAuth' => []],
        string $responseMediaType = 'application/octet-stream'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/etc/packages/{group}/{name}-{version}.zip', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * @param \App\DTO\GetPackageParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function getPackage(
        \App\DTO\GetPackageParameterData $parameters,
        iterable $security = ['aemAuth' => []],
        string $responseMediaType = 'application/octet-stream'
    ): array
    {
        $response = $this->getPackageRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            default:
                /* Default response */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * @param \App\DTO\GetPackageParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return string
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function getPackageResult(
        \App\DTO\GetPackageParameterData $parameters,
        iterable $security = ['aemAuth' => []],
        string $responseMediaType = 'application/octet-stream'
    ): string
    {
        return $this->getSuccessfulContent(...$this->getPackage($parameters, $security, $responseMediaType));
    }
    //endregion

    //region getPackageFilter
    /**
     * @param \App\DTO\GetPackageFilterParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function getPackageFilterRaw(
        \App\DTO\GetPackageFilterParameterData $parameters,
        iterable $security = ['aemAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * @param \App\DTO\GetPackageFilterParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function getPackageFilter(
        \App\DTO\GetPackageFilterParameterData $parameters,
        iterable $security = ['aemAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->getPackageFilterRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            default:
                /* Default response */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * @param \App\DTO\GetPackageFilterParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return string
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function getPackageFilterResult(
        \App\DTO\GetPackageFilterParameterData $parameters,
        iterable $security = ['aemAuth' => []],
        string $responseMediaType = 'application/json'
    ): string
    {
        return $this->getSuccessfulContent(...$this->getPackageFilter($parameters, $security, $responseMediaType));
    }
    //endregion

    //region getPackageManagerServlet
    /**
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function getPackageManagerServletRaw(
        iterable $security = ['aemAuth' => []],
        string $responseMediaType = 'text/html'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/crx/packmgr/service/script.html', [], []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function getPackageManagerServlet(
        iterable $security = ['aemAuth' => []],
        string $responseMediaType = 'text/html'
    ): array
    {
        $response = $this->getPackageManagerServletRaw($security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 404:
                /* Package Manager Servlet is disabled */
                break;
            case 405:
                /* Package Manager Servlet is active */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function getPackageManagerServletResult(
        iterable $security = ['aemAuth' => []],
        string $responseMediaType = 'text/html'
    )
    {
        return $this->getSuccessfulContent(...$this->getPackageManagerServlet($security, $responseMediaType));
    }
    //endregion

    //region getQuery
    /**
     * @param \App\DTO\GetQueryParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function getQueryRaw(
        \App\DTO\GetQueryParameterData $parameters,
        iterable $security = ['aemAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/bin/querybuilder.json', [], $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * @param \App\DTO\GetQueryParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function getQuery(
        \App\DTO\GetQueryParameterData $parameters,
        iterable $security = ['aemAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->getQueryRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            default:
                /* Default response */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * @param \App\DTO\GetQueryParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return string
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function getQueryResult(
        \App\DTO\GetQueryParameterData $parameters,
        iterable $security = ['aemAuth' => []],
        string $responseMediaType = 'application/json'
    ): string
    {
        return $this->getSuccessfulContent(...$this->getQuery($parameters, $security, $responseMediaType));
    }
    //endregion

    //region getTruststore
    /**
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function getTruststoreRaw(
        iterable $security = ['aemAuth' => []],
        string $responseMediaType = 'application/octet-stream'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/etc/truststore/truststore.p12', [], []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function getTruststore(
        iterable $security = ['aemAuth' => []],
        string $responseMediaType = 'application/octet-stream'
    ): array
    {
        $response = $this->getTruststoreRaw($security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            default:
                /* Default response */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return string
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function getTruststoreResult(
        iterable $security = ['aemAuth' => []],
        string $responseMediaType = 'application/octet-stream'
    ): string
    {
        return $this->getSuccessfulContent(...$this->getTruststore($security, $responseMediaType));
    }
    //endregion

    //region getTruststoreInfo
    /**
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function getTruststoreInfoRaw(
        iterable $security = ['aemAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/libs/granite/security/truststore.json', [], []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function getTruststoreInfo(
        iterable $security = ['aemAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->getTruststoreInfoRaw($security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Retrieved AEM Truststore info */
                $responseContent = new \App\DTO\TruststoreInfo();
                break;
            default:
                /* Default response */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\TruststoreInfo
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function getTruststoreInfoResult(
        iterable $security = ['aemAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\TruststoreInfo
    {
        return $this->getSuccessfulContent(...$this->getTruststoreInfo($security, $responseMediaType));
    }
    //endregion

    //region postAgent
    /**
     * @param \App\DTO\PostAgentParameterData $parameters
     * @param iterable<string, string[]> $security
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function postAgentRaw(
        \App\DTO\PostAgentParameterData $parameters,
        iterable $security = ['aemAuth' => []]
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/etc/replication/agents.{runmode}/{name}', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * @param \App\DTO\PostAgentParameterData $parameters
     * @param iterable<string, string[]> $security
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function postAgent(
        \App\DTO\PostAgentParameterData $parameters,
        iterable $security = ['aemAuth' => []]
    ): array
    {
        $response = $this->postAgentRaw($parameters, $security);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            default:
                /* Default response */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * @param \App\DTO\PostAgentParameterData $parameters
     * @param iterable<string, string[]> $security
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function postAgentResult(
        \App\DTO\PostAgentParameterData $parameters,
        iterable $security = ['aemAuth' => []]
    )
    {
        return $this->getSuccessfulContent(...$this->postAgent($parameters, $security));
    }
    //endregion

    //region postAuthorizableKeystore
    /**
     * @param \App\DTO\PostAuthorizableKeystoreParameterData $parameters
     * @param \App\DTO\PostAuthorizableKeystoreRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function postAuthorizableKeystoreRaw(
        \App\DTO\PostAuthorizableKeystoreParameterData $parameters,
        \App\DTO\PostAuthorizableKeystoreRequest $requestContent,
        iterable $security = ['aemAuth' => []],
        string $requestMediaType = 'multipart/form-data',
        string $responseMediaType = 'text/plain'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/{intermediatePath}/{authorizableId}.ks.html', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * @param \App\DTO\PostAuthorizableKeystoreParameterData $parameters
     * @param \App\DTO\PostAuthorizableKeystoreRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function postAuthorizableKeystore(
        \App\DTO\PostAuthorizableKeystoreParameterData $parameters,
        \App\DTO\PostAuthorizableKeystoreRequest $requestContent,
        iterable $security = ['aemAuth' => []],
        string $requestMediaType = 'multipart/form-data',
        string $responseMediaType = 'text/plain'
    ): array
    {
        $response = $this->postAuthorizableKeystoreRaw($parameters, $requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Retrieved Authorizable Keystore info */
                $responseContent = new \App\DTO\KeystoreInfo();
                break;
            default:
                /* Default response */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * @param \App\DTO\PostAuthorizableKeystoreParameterData $parameters
     * @param \App\DTO\PostAuthorizableKeystoreRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return \App\DTO\KeystoreInfo
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function postAuthorizableKeystoreResult(
        \App\DTO\PostAuthorizableKeystoreParameterData $parameters,
        \App\DTO\PostAuthorizableKeystoreRequest $requestContent,
        iterable $security = ['aemAuth' => []],
        string $requestMediaType = 'multipart/form-data',
        string $responseMediaType = 'text/plain'
    ): \App\DTO\KeystoreInfo
    {
        return $this->getSuccessfulContent(...$this->postAuthorizableKeystore($parameters, $requestContent, $security, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region postAuthorizables
    /**
     * @param \App\DTO\PostAuthorizablesParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function postAuthorizablesRaw(
        \App\DTO\PostAuthorizablesParameterData $parameters,
        iterable $security = ['aemAuth' => []],
        string $responseMediaType = 'text/html'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/libs/granite/security/post/authorizables', [], $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * @param \App\DTO\PostAuthorizablesParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function postAuthorizables(
        \App\DTO\PostAuthorizablesParameterData $parameters,
        iterable $security = ['aemAuth' => []],
        string $responseMediaType = 'text/html'
    ): array
    {
        $response = $this->postAuthorizablesRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            default:
                /* Default response */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * @param \App\DTO\PostAuthorizablesParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return string
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function postAuthorizablesResult(
        \App\DTO\PostAuthorizablesParameterData $parameters,
        iterable $security = ['aemAuth' => []],
        string $responseMediaType = 'text/html'
    ): string
    {
        return $this->getSuccessfulContent(...$this->postAuthorizables($parameters, $security, $responseMediaType));
    }
    //endregion

    //region postBundle
    /**
     * @param \App\DTO\PostBundleParameterData $parameters
     * @param iterable<string, string[]> $security
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function postBundleRaw(
        \App\DTO\PostBundleParameterData $parameters,
        iterable $security = ['aemAuth' => []]
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/system/console/bundles/{name}', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * @param \App\DTO\PostBundleParameterData $parameters
     * @param iterable<string, string[]> $security
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function postBundle(
        \App\DTO\PostBundleParameterData $parameters,
        iterable $security = ['aemAuth' => []]
    ): array
    {
        $response = $this->postBundleRaw($parameters, $security);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            default:
                /* Default response */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * @param \App\DTO\PostBundleParameterData $parameters
     * @param iterable<string, string[]> $security
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function postBundleResult(
        \App\DTO\PostBundleParameterData $parameters,
        iterable $security = ['aemAuth' => []]
    )
    {
        return $this->getSuccessfulContent(...$this->postBundle($parameters, $security));
    }
    //endregion

    //region postConfigAdobeGraniteSamlAuthenticationHandler
    /**
     * @param \App\DTO\PostConfigAdobeGraniteSamlAuthenticationHandlerParameterData $parameters
     * @param iterable<string, string[]> $security
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function postConfigAdobeGraniteSamlAuthenticationHandlerRaw(
        \App\DTO\PostConfigAdobeGraniteSamlAuthenticationHandlerParameterData $parameters,
        iterable $security = ['aemAuth' => []]
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config', [], $this->getQueryParameters($parameters));
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * @param \App\DTO\PostConfigAdobeGraniteSamlAuthenticationHandlerParameterData $parameters
     * @param iterable<string, string[]> $security
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function postConfigAdobeGraniteSamlAuthenticationHandler(
        \App\DTO\PostConfigAdobeGraniteSamlAuthenticationHandlerParameterData $parameters,
        iterable $security = ['aemAuth' => []]
    ): array
    {
        $response = $this->postConfigAdobeGraniteSamlAuthenticationHandlerRaw($parameters, $security);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            default:
                /* Default response */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * @param \App\DTO\PostConfigAdobeGraniteSamlAuthenticationHandlerParameterData $parameters
     * @param iterable<string, string[]> $security
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function postConfigAdobeGraniteSamlAuthenticationHandlerResult(
        \App\DTO\PostConfigAdobeGraniteSamlAuthenticationHandlerParameterData $parameters,
        iterable $security = ['aemAuth' => []]
    )
    {
        return $this->getSuccessfulContent(...$this->postConfigAdobeGraniteSamlAuthenticationHandler($parameters, $security));
    }
    //endregion

    //region postConfigAemHealthCheckServlet
    /**
     * @param \App\DTO\PostConfigAemHealthCheckServletParameterData $parameters
     * @param iterable<string, string[]> $security
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function postConfigAemHealthCheckServletRaw(
        \App\DTO\PostConfigAemHealthCheckServletParameterData $parameters,
        iterable $security = ['aemAuth' => []]
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck', [], $this->getQueryParameters($parameters));
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * @param \App\DTO\PostConfigAemHealthCheckServletParameterData $parameters
     * @param iterable<string, string[]> $security
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function postConfigAemHealthCheckServlet(
        \App\DTO\PostConfigAemHealthCheckServletParameterData $parameters,
        iterable $security = ['aemAuth' => []]
    ): array
    {
        $response = $this->postConfigAemHealthCheckServletRaw($parameters, $security);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            default:
                /* Default response */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * @param \App\DTO\PostConfigAemHealthCheckServletParameterData $parameters
     * @param iterable<string, string[]> $security
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function postConfigAemHealthCheckServletResult(
        \App\DTO\PostConfigAemHealthCheckServletParameterData $parameters,
        iterable $security = ['aemAuth' => []]
    )
    {
        return $this->getSuccessfulContent(...$this->postConfigAemHealthCheckServlet($parameters, $security));
    }
    //endregion

    //region postConfigAemPasswordReset
    /**
     * @param \App\DTO\PostConfigAemPasswordResetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function postConfigAemPasswordResetRaw(
        \App\DTO\PostConfigAemPasswordResetParameterData $parameters,
        iterable $security = ['aemAuth' => []]
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/apps/system/config/com.shinesolutions.aem.passwordreset.Activator', [], $this->getQueryParameters($parameters));
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * @param \App\DTO\PostConfigAemPasswordResetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function postConfigAemPasswordReset(
        \App\DTO\PostConfigAemPasswordResetParameterData $parameters,
        iterable $security = ['aemAuth' => []]
    ): array
    {
        $response = $this->postConfigAemPasswordResetRaw($parameters, $security);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            default:
                /* Default response */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * @param \App\DTO\PostConfigAemPasswordResetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function postConfigAemPasswordResetResult(
        \App\DTO\PostConfigAemPasswordResetParameterData $parameters,
        iterable $security = ['aemAuth' => []]
    )
    {
        return $this->getSuccessfulContent(...$this->postConfigAemPasswordReset($parameters, $security));
    }
    //endregion

    //region postConfigApacheFelixJettyBasedHttpService
    /**
     * @param \App\DTO\PostConfigApacheFelixJettyBasedHttpServiceParameterData $parameters
     * @param iterable<string, string[]> $security
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function postConfigApacheFelixJettyBasedHttpServiceRaw(
        \App\DTO\PostConfigApacheFelixJettyBasedHttpServiceParameterData $parameters,
        iterable $security = ['aemAuth' => []]
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/apps/system/config/org.apache.felix.http', [], $this->getQueryParameters($parameters));
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * @param \App\DTO\PostConfigApacheFelixJettyBasedHttpServiceParameterData $parameters
     * @param iterable<string, string[]> $security
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function postConfigApacheFelixJettyBasedHttpService(
        \App\DTO\PostConfigApacheFelixJettyBasedHttpServiceParameterData $parameters,
        iterable $security = ['aemAuth' => []]
    ): array
    {
        $response = $this->postConfigApacheFelixJettyBasedHttpServiceRaw($parameters, $security);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            default:
                /* Default response */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * @param \App\DTO\PostConfigApacheFelixJettyBasedHttpServiceParameterData $parameters
     * @param iterable<string, string[]> $security
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function postConfigApacheFelixJettyBasedHttpServiceResult(
        \App\DTO\PostConfigApacheFelixJettyBasedHttpServiceParameterData $parameters,
        iterable $security = ['aemAuth' => []]
    )
    {
        return $this->getSuccessfulContent(...$this->postConfigApacheFelixJettyBasedHttpService($parameters, $security));
    }
    //endregion

    //region postConfigApacheHttpComponentsProxyConfiguration
    /**
     * @param \App\DTO\PostConfigApacheHttpComponentsProxyConfigurationParameterData $parameters
     * @param iterable<string, string[]> $security
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function postConfigApacheHttpComponentsProxyConfigurationRaw(
        \App\DTO\PostConfigApacheHttpComponentsProxyConfigurationParameterData $parameters,
        iterable $security = ['aemAuth' => []]
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/apps/system/config/org.apache.http.proxyconfigurator.config', [], $this->getQueryParameters($parameters));
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * @param \App\DTO\PostConfigApacheHttpComponentsProxyConfigurationParameterData $parameters
     * @param iterable<string, string[]> $security
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function postConfigApacheHttpComponentsProxyConfiguration(
        \App\DTO\PostConfigApacheHttpComponentsProxyConfigurationParameterData $parameters,
        iterable $security = ['aemAuth' => []]
    ): array
    {
        $response = $this->postConfigApacheHttpComponentsProxyConfigurationRaw($parameters, $security);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            default:
                /* Default response */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * @param \App\DTO\PostConfigApacheHttpComponentsProxyConfigurationParameterData $parameters
     * @param iterable<string, string[]> $security
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function postConfigApacheHttpComponentsProxyConfigurationResult(
        \App\DTO\PostConfigApacheHttpComponentsProxyConfigurationParameterData $parameters,
        iterable $security = ['aemAuth' => []]
    )
    {
        return $this->getSuccessfulContent(...$this->postConfigApacheHttpComponentsProxyConfiguration($parameters, $security));
    }
    //endregion

    //region postConfigApacheSlingDavExServlet
    /**
     * @param \App\DTO\PostConfigApacheSlingDavExServletParameterData $parameters
     * @param iterable<string, string[]> $security
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function postConfigApacheSlingDavExServletRaw(
        \App\DTO\PostConfigApacheSlingDavExServletParameterData $parameters,
        iterable $security = ['aemAuth' => []]
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet', [], $this->getQueryParameters($parameters));
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * @param \App\DTO\PostConfigApacheSlingDavExServletParameterData $parameters
     * @param iterable<string, string[]> $security
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function postConfigApacheSlingDavExServlet(
        \App\DTO\PostConfigApacheSlingDavExServletParameterData $parameters,
        iterable $security = ['aemAuth' => []]
    ): array
    {
        $response = $this->postConfigApacheSlingDavExServletRaw($parameters, $security);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            default:
                /* Default response */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * @param \App\DTO\PostConfigApacheSlingDavExServletParameterData $parameters
     * @param iterable<string, string[]> $security
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function postConfigApacheSlingDavExServletResult(
        \App\DTO\PostConfigApacheSlingDavExServletParameterData $parameters,
        iterable $security = ['aemAuth' => []]
    )
    {
        return $this->getSuccessfulContent(...$this->postConfigApacheSlingDavExServlet($parameters, $security));
    }
    //endregion

    //region postConfigApacheSlingGetServlet
    /**
     * @param \App\DTO\PostConfigApacheSlingGetServletParameterData $parameters
     * @param iterable<string, string[]> $security
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function postConfigApacheSlingGetServletRaw(
        \App\DTO\PostConfigApacheSlingGetServletParameterData $parameters,
        iterable $security = ['aemAuth' => []]
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet', [], $this->getQueryParameters($parameters));
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * @param \App\DTO\PostConfigApacheSlingGetServletParameterData $parameters
     * @param iterable<string, string[]> $security
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function postConfigApacheSlingGetServlet(
        \App\DTO\PostConfigApacheSlingGetServletParameterData $parameters,
        iterable $security = ['aemAuth' => []]
    ): array
    {
        $response = $this->postConfigApacheSlingGetServletRaw($parameters, $security);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            default:
                /* Default response */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * @param \App\DTO\PostConfigApacheSlingGetServletParameterData $parameters
     * @param iterable<string, string[]> $security
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function postConfigApacheSlingGetServletResult(
        \App\DTO\PostConfigApacheSlingGetServletParameterData $parameters,
        iterable $security = ['aemAuth' => []]
    )
    {
        return $this->getSuccessfulContent(...$this->postConfigApacheSlingGetServlet($parameters, $security));
    }
    //endregion

    //region postConfigApacheSlingReferrerFilter
    /**
     * @param \App\DTO\PostConfigApacheSlingReferrerFilterParameterData $parameters
     * @param iterable<string, string[]> $security
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function postConfigApacheSlingReferrerFilterRaw(
        \App\DTO\PostConfigApacheSlingReferrerFilterParameterData $parameters,
        iterable $security = ['aemAuth' => []]
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/apps/system/config/org.apache.sling.security.impl.ReferrerFilter', [], $this->getQueryParameters($parameters));
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * @param \App\DTO\PostConfigApacheSlingReferrerFilterParameterData $parameters
     * @param iterable<string, string[]> $security
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function postConfigApacheSlingReferrerFilter(
        \App\DTO\PostConfigApacheSlingReferrerFilterParameterData $parameters,
        iterable $security = ['aemAuth' => []]
    ): array
    {
        $response = $this->postConfigApacheSlingReferrerFilterRaw($parameters, $security);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            default:
                /* Default response */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * @param \App\DTO\PostConfigApacheSlingReferrerFilterParameterData $parameters
     * @param iterable<string, string[]> $security
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function postConfigApacheSlingReferrerFilterResult(
        \App\DTO\PostConfigApacheSlingReferrerFilterParameterData $parameters,
        iterable $security = ['aemAuth' => []]
    )
    {
        return $this->getSuccessfulContent(...$this->postConfigApacheSlingReferrerFilter($parameters, $security));
    }
    //endregion

    //region postConfigProperty
    /**
     * @param \App\DTO\PostConfigPropertyParameterData $parameters
     * @param iterable<string, string[]> $security
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function postConfigPropertyRaw(
        \App\DTO\PostConfigPropertyParameterData $parameters,
        iterable $security = ['aemAuth' => []]
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/apps/system/config/{configNodeName}', $this->getPathParameters($parameters), []);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * @param \App\DTO\PostConfigPropertyParameterData $parameters
     * @param iterable<string, string[]> $security
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function postConfigProperty(
        \App\DTO\PostConfigPropertyParameterData $parameters,
        iterable $security = ['aemAuth' => []]
    ): array
    {
        $response = $this->postConfigPropertyRaw($parameters, $security);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            default:
                /* Default response */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * @param \App\DTO\PostConfigPropertyParameterData $parameters
     * @param iterable<string, string[]> $security
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function postConfigPropertyResult(
        \App\DTO\PostConfigPropertyParameterData $parameters,
        iterable $security = ['aemAuth' => []]
    )
    {
        return $this->getSuccessfulContent(...$this->postConfigProperty($parameters, $security));
    }
    //endregion

    //region postCqActions
    /**
     * @param \App\DTO\PostCqActionsParameterData $parameters
     * @param iterable<string, string[]> $security
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function postCqActionsRaw(
        \App\DTO\PostCqActionsParameterData $parameters,
        iterable $security = ['aemAuth' => []]
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/.cqactions.html', [], $this->getQueryParameters($parameters));
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * @param \App\DTO\PostCqActionsParameterData $parameters
     * @param iterable<string, string[]> $security
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function postCqActions(
        \App\DTO\PostCqActionsParameterData $parameters,
        iterable $security = ['aemAuth' => []]
    ): array
    {
        $response = $this->postCqActionsRaw($parameters, $security);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            default:
                /* Default response */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * @param \App\DTO\PostCqActionsParameterData $parameters
     * @param iterable<string, string[]> $security
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function postCqActionsResult(
        \App\DTO\PostCqActionsParameterData $parameters,
        iterable $security = ['aemAuth' => []]
    )
    {
        return $this->getSuccessfulContent(...$this->postCqActions($parameters, $security));
    }
    //endregion

    //region postJmxRepository
    /**
     * @param \App\DTO\PostJmxRepositoryParameterData $parameters
     * @param iterable<string, string[]> $security
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function postJmxRepositoryRaw(
        \App\DTO\PostJmxRepositoryParameterData $parameters,
        iterable $security = ['aemAuth' => []]
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/system/console/jmx/com.adobe.granite:type=Repository/op/{action}', $this->getPathParameters($parameters), []);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * @param \App\DTO\PostJmxRepositoryParameterData $parameters
     * @param iterable<string, string[]> $security
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function postJmxRepository(
        \App\DTO\PostJmxRepositoryParameterData $parameters,
        iterable $security = ['aemAuth' => []]
    ): array
    {
        $response = $this->postJmxRepositoryRaw($parameters, $security);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            default:
                /* Default response */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * @param \App\DTO\PostJmxRepositoryParameterData $parameters
     * @param iterable<string, string[]> $security
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function postJmxRepositoryResult(
        \App\DTO\PostJmxRepositoryParameterData $parameters,
        iterable $security = ['aemAuth' => []]
    )
    {
        return $this->getSuccessfulContent(...$this->postJmxRepository($parameters, $security));
    }
    //endregion

    //region postNode
    /**
     * @param \App\DTO\PostNodeParameterData $parameters
     * @param \App\DTO\PostNodeRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function postNodeRaw(
        \App\DTO\PostNodeParameterData $parameters,
        \App\DTO\PostNodeRequest $requestContent,
        iterable $security = ['aemAuth' => []],
        string $requestMediaType = 'multipart/form-data'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/{path}/{name}', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * @param \App\DTO\PostNodeParameterData $parameters
     * @param \App\DTO\PostNodeRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function postNode(
        \App\DTO\PostNodeParameterData $parameters,
        \App\DTO\PostNodeRequest $requestContent,
        iterable $security = ['aemAuth' => []],
        string $requestMediaType = 'multipart/form-data'
    ): array
    {
        $response = $this->postNodeRaw($parameters, $requestContent, $security, $requestMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            default:
                /* Default response */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * @param \App\DTO\PostNodeParameterData $parameters
     * @param \App\DTO\PostNodeRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function postNodeResult(
        \App\DTO\PostNodeParameterData $parameters,
        \App\DTO\PostNodeRequest $requestContent,
        iterable $security = ['aemAuth' => []],
        string $requestMediaType = 'multipart/form-data'
    )
    {
        return $this->getSuccessfulContent(...$this->postNode($parameters, $requestContent, $security, $requestMediaType));
    }
    //endregion

    //region postNodeRw
    /**
     * @param \App\DTO\PostNodeRwParameterData $parameters
     * @param iterable<string, string[]> $security
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function postNodeRwRaw(
        \App\DTO\PostNodeRwParameterData $parameters,
        iterable $security = ['aemAuth' => []]
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/{path}/{name}.rw.html', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * @param \App\DTO\PostNodeRwParameterData $parameters
     * @param iterable<string, string[]> $security
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function postNodeRw(
        \App\DTO\PostNodeRwParameterData $parameters,
        iterable $security = ['aemAuth' => []]
    ): array
    {
        $response = $this->postNodeRwRaw($parameters, $security);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            default:
                /* Default response */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * @param \App\DTO\PostNodeRwParameterData $parameters
     * @param iterable<string, string[]> $security
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function postNodeRwResult(
        \App\DTO\PostNodeRwParameterData $parameters,
        iterable $security = ['aemAuth' => []]
    )
    {
        return $this->getSuccessfulContent(...$this->postNodeRw($parameters, $security));
    }
    //endregion

    //region postPackageService
    /**
     * @param \App\DTO\PostPackageServiceParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function postPackageServiceRaw(
        \App\DTO\PostPackageServiceParameterData $parameters,
        iterable $security = ['aemAuth' => []],
        string $responseMediaType = 'text/xml'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/crx/packmgr/service.jsp', [], $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * @param \App\DTO\PostPackageServiceParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function postPackageService(
        \App\DTO\PostPackageServiceParameterData $parameters,
        iterable $security = ['aemAuth' => []],
        string $responseMediaType = 'text/xml'
    ): array
    {
        $response = $this->postPackageServiceRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            default:
                /* Default response */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * @param \App\DTO\PostPackageServiceParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return string
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function postPackageServiceResult(
        \App\DTO\PostPackageServiceParameterData $parameters,
        iterable $security = ['aemAuth' => []],
        string $responseMediaType = 'text/xml'
    ): string
    {
        return $this->getSuccessfulContent(...$this->postPackageService($parameters, $security, $responseMediaType));
    }
    //endregion

    //region postPackageServiceJson
    /**
     * @param \App\DTO\PostPackageServiceJsonParameterData $parameters
     * @param \App\DTO\PostPackageServiceJsonRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function postPackageServiceJsonRaw(
        \App\DTO\PostPackageServiceJsonParameterData $parameters,
        \App\DTO\PostPackageServiceJsonRequest $requestContent,
        iterable $security = ['aemAuth' => []],
        string $requestMediaType = 'multipart/form-data',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/crx/packmgr/service/.json/{path}', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * @param \App\DTO\PostPackageServiceJsonParameterData $parameters
     * @param \App\DTO\PostPackageServiceJsonRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function postPackageServiceJson(
        \App\DTO\PostPackageServiceJsonParameterData $parameters,
        \App\DTO\PostPackageServiceJsonRequest $requestContent,
        iterable $security = ['aemAuth' => []],
        string $requestMediaType = 'multipart/form-data',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->postPackageServiceJsonRaw($parameters, $requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            default:
                /* Default response */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * @param \App\DTO\PostPackageServiceJsonParameterData $parameters
     * @param \App\DTO\PostPackageServiceJsonRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return string
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function postPackageServiceJsonResult(
        \App\DTO\PostPackageServiceJsonParameterData $parameters,
        \App\DTO\PostPackageServiceJsonRequest $requestContent,
        iterable $security = ['aemAuth' => []],
        string $requestMediaType = 'multipart/form-data',
        string $responseMediaType = 'application/json'
    ): string
    {
        return $this->getSuccessfulContent(...$this->postPackageServiceJson($parameters, $requestContent, $security, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region postPackageUpdate
    /**
     * @param \App\DTO\PostPackageUpdateParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function postPackageUpdateRaw(
        \App\DTO\PostPackageUpdateParameterData $parameters,
        iterable $security = ['aemAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/crx/packmgr/update.jsp', [], $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * @param \App\DTO\PostPackageUpdateParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function postPackageUpdate(
        \App\DTO\PostPackageUpdateParameterData $parameters,
        iterable $security = ['aemAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->postPackageUpdateRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            default:
                /* Default response */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * @param \App\DTO\PostPackageUpdateParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return string
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function postPackageUpdateResult(
        \App\DTO\PostPackageUpdateParameterData $parameters,
        iterable $security = ['aemAuth' => []],
        string $responseMediaType = 'application/json'
    ): string
    {
        return $this->getSuccessfulContent(...$this->postPackageUpdate($parameters, $security, $responseMediaType));
    }
    //endregion

    //region postPath
    /**
     * @param \App\DTO\PostPathParameterData $parameters
     * @param iterable<string, string[]> $security
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function postPathRaw(
        \App\DTO\PostPathParameterData $parameters,
        iterable $security = ['aemAuth' => []]
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/{path}/', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * @param \App\DTO\PostPathParameterData $parameters
     * @param iterable<string, string[]> $security
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function postPath(
        \App\DTO\PostPathParameterData $parameters,
        iterable $security = ['aemAuth' => []]
    ): array
    {
        $response = $this->postPathRaw($parameters, $security);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            default:
                /* Default response */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * @param \App\DTO\PostPathParameterData $parameters
     * @param iterable<string, string[]> $security
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function postPathResult(
        \App\DTO\PostPathParameterData $parameters,
        iterable $security = ['aemAuth' => []]
    )
    {
        return $this->getSuccessfulContent(...$this->postPath($parameters, $security));
    }
    //endregion

    //region postQuery
    /**
     * @param \App\DTO\PostQueryParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function postQueryRaw(
        \App\DTO\PostQueryParameterData $parameters,
        iterable $security = ['aemAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/bin/querybuilder.json', [], $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * @param \App\DTO\PostQueryParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function postQuery(
        \App\DTO\PostQueryParameterData $parameters,
        iterable $security = ['aemAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->postQueryRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            default:
                /* Default response */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * @param \App\DTO\PostQueryParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return string
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function postQueryResult(
        \App\DTO\PostQueryParameterData $parameters,
        iterable $security = ['aemAuth' => []],
        string $responseMediaType = 'application/json'
    ): string
    {
        return $this->getSuccessfulContent(...$this->postQuery($parameters, $security, $responseMediaType));
    }
    //endregion

    //region postSamlConfiguration
    /**
     * @param \App\DTO\PostSamlConfigurationParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function postSamlConfigurationRaw(
        \App\DTO\PostSamlConfigurationParameterData $parameters,
        iterable $security = ['aemAuth' => []],
        string $responseMediaType = 'text/plain'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler', [], $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * @param \App\DTO\PostSamlConfigurationParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function postSamlConfiguration(
        \App\DTO\PostSamlConfigurationParameterData $parameters,
        iterable $security = ['aemAuth' => []],
        string $responseMediaType = 'text/plain'
    ): array
    {
        $response = $this->postSamlConfigurationRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Retrieved AEM SAML Configuration */
                $responseContent = new \App\DTO\SamlConfigurationInfo();
                break;
            case 302:
                /* Default response */
                break;
            default:
                /* Default response */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * @param \App\DTO\PostSamlConfigurationParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\SamlConfigurationInfo
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function postSamlConfigurationResult(
        \App\DTO\PostSamlConfigurationParameterData $parameters,
        iterable $security = ['aemAuth' => []],
        string $responseMediaType = 'text/plain'
    ): \App\DTO\SamlConfigurationInfo
    {
        return $this->getSuccessfulContent(...$this->postSamlConfiguration($parameters, $security, $responseMediaType));
    }
    //endregion

    //region postSetPassword
    /**
     * @param \App\DTO\PostSetPasswordParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function postSetPasswordRaw(
        \App\DTO\PostSetPasswordParameterData $parameters,
        iterable $security = ['aemAuth' => []],
        string $responseMediaType = 'text/plain'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/crx/explorer/ui/setpassword.jsp', [], $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * @param \App\DTO\PostSetPasswordParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function postSetPassword(
        \App\DTO\PostSetPasswordParameterData $parameters,
        iterable $security = ['aemAuth' => []],
        string $responseMediaType = 'text/plain'
    ): array
    {
        $response = $this->postSetPasswordRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            default:
                /* Default response */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * @param \App\DTO\PostSetPasswordParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return string
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function postSetPasswordResult(
        \App\DTO\PostSetPasswordParameterData $parameters,
        iterable $security = ['aemAuth' => []],
        string $responseMediaType = 'text/plain'
    ): string
    {
        return $this->getSuccessfulContent(...$this->postSetPassword($parameters, $security, $responseMediaType));
    }
    //endregion

    //region postTreeActivation
    /**
     * @param \App\DTO\PostTreeActivationParameterData $parameters
     * @param iterable<string, string[]> $security
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function postTreeActivationRaw(
        \App\DTO\PostTreeActivationParameterData $parameters,
        iterable $security = ['aemAuth' => []]
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/libs/replication/treeactivation.html', [], $this->getQueryParameters($parameters));
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * @param \App\DTO\PostTreeActivationParameterData $parameters
     * @param iterable<string, string[]> $security
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function postTreeActivation(
        \App\DTO\PostTreeActivationParameterData $parameters,
        iterable $security = ['aemAuth' => []]
    ): array
    {
        $response = $this->postTreeActivationRaw($parameters, $security);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            default:
                /* Default response */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * @param \App\DTO\PostTreeActivationParameterData $parameters
     * @param iterable<string, string[]> $security
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function postTreeActivationResult(
        \App\DTO\PostTreeActivationParameterData $parameters,
        iterable $security = ['aemAuth' => []]
    )
    {
        return $this->getSuccessfulContent(...$this->postTreeActivation($parameters, $security));
    }
    //endregion

    //region postTruststore
    /**
     * @param \App\DTO\PostTruststoreParameterData $parameters
     * @param \App\DTO\PostTruststoreRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function postTruststoreRaw(
        \App\DTO\PostTruststoreParameterData $parameters,
        \App\DTO\PostTruststoreRequest $requestContent,
        iterable $security = ['aemAuth' => []],
        string $requestMediaType = 'multipart/form-data',
        string $responseMediaType = 'text/plain'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/libs/granite/security/post/truststore', [], $this->getQueryParameters($parameters));
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * @param \App\DTO\PostTruststoreParameterData $parameters
     * @param \App\DTO\PostTruststoreRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function postTruststore(
        \App\DTO\PostTruststoreParameterData $parameters,
        \App\DTO\PostTruststoreRequest $requestContent,
        iterable $security = ['aemAuth' => []],
        string $requestMediaType = 'multipart/form-data',
        string $responseMediaType = 'text/plain'
    ): array
    {
        $response = $this->postTruststoreRaw($parameters, $requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            default:
                /* Default response */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * @param \App\DTO\PostTruststoreParameterData $parameters
     * @param \App\DTO\PostTruststoreRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return string
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function postTruststoreResult(
        \App\DTO\PostTruststoreParameterData $parameters,
        \App\DTO\PostTruststoreRequest $requestContent,
        iterable $security = ['aemAuth' => []],
        string $requestMediaType = 'multipart/form-data',
        string $responseMediaType = 'text/plain'
    ): string
    {
        return $this->getSuccessfulContent(...$this->postTruststore($parameters, $requestContent, $security, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region postTruststorePKCS12
    /**
     * @param \App\DTO\PostTruststorePKCS12Request $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function postTruststorePKCS12Raw(
        \App\DTO\PostTruststorePKCS12Request $requestContent,
        iterable $security = ['aemAuth' => []],
        string $requestMediaType = 'multipart/form-data',
        string $responseMediaType = 'text/plain'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/etc/truststore', [], []);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * @param \App\DTO\PostTruststorePKCS12Request $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function postTruststorePKCS12(
        \App\DTO\PostTruststorePKCS12Request $requestContent,
        iterable $security = ['aemAuth' => []],
        string $requestMediaType = 'multipart/form-data',
        string $responseMediaType = 'text/plain'
    ): array
    {
        $response = $this->postTruststorePKCS12Raw($requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            default:
                /* Default response */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * @param \App\DTO\PostTruststorePKCS12Request $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return string
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function postTruststorePKCS12Result(
        \App\DTO\PostTruststorePKCS12Request $requestContent,
        iterable $security = ['aemAuth' => []],
        string $requestMediaType = 'multipart/form-data',
        string $responseMediaType = 'text/plain'
    ): string
    {
        return $this->getSuccessfulContent(...$this->postTruststorePKCS12($requestContent, $security, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region sslSetup
    /**
     * @param \App\DTO\SslSetupParameterData $parameters
     * @param \App\DTO\SslSetupRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function sslSetupRaw(
        \App\DTO\SslSetupParameterData $parameters,
        \App\DTO\SslSetupRequest $requestContent,
        iterable $security = ['aemAuth' => []],
        string $requestMediaType = 'multipart/form-data',
        string $responseMediaType = 'text/plain'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/libs/granite/security/post/sslSetup.html', [], $this->getQueryParameters($parameters));
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * @param \App\DTO\SslSetupParameterData $parameters
     * @param \App\DTO\SslSetupRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function sslSetup(
        \App\DTO\SslSetupParameterData $parameters,
        \App\DTO\SslSetupRequest $requestContent,
        iterable $security = ['aemAuth' => []],
        string $requestMediaType = 'multipart/form-data',
        string $responseMediaType = 'text/plain'
    ): array
    {
        $response = $this->sslSetupRaw($parameters, $requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            default:
                /* Default response */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * @param \App\DTO\SslSetupParameterData $parameters
     * @param \App\DTO\SslSetupRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return string
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function sslSetupResult(
        \App\DTO\SslSetupParameterData $parameters,
        \App\DTO\SslSetupRequest $requestContent,
        iterable $security = ['aemAuth' => []],
        string $requestMediaType = 'multipart/form-data',
        string $responseMediaType = 'text/plain'
    ): string
    {
        return $this->getSuccessfulContent(...$this->sslSetup($parameters, $requestContent, $security, $requestMediaType, $responseMediaType));
    }
    //endregion
}

