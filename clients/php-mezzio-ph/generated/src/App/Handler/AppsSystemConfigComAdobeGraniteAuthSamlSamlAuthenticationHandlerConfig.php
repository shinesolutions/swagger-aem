<?php
declare(strict_types=1);

namespace App\Handler;

use Articus\PathHandler\Annotation as PHA;
use Articus\PathHandler\Consumer as PHConsumer;
use Articus\PathHandler\Producer as PHProducer;
use Articus\PathHandler\Attribute as PHAttribute;
use Articus\PathHandler\Exception as PHException;
use Psr\Http\Message\ServerRequestInterface;

/**
 * @PHA\Route(pattern="/apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config")
 */
class AppsSystemConfigComAdobeGraniteAuthSamlSamlAuthenticationHandlerConfig
{
    /**
     * @PHA\Post()
     * @PHA\Attribute(name=PHAttribute\Transfer::class, options={
     *     "type":\App\DTO\PostConfigAdobeGraniteSamlAuthenticationHandlerQueryData::class,
     *     "objectAttr":"queryData",
     *     "source": PHAttribute\Transfer::SOURCE_GET
     * })
     * @param ServerRequestInterface $request
     *
     * @throws PHException\HttpCode 501 if the method is not implemented
     */
    public function postConfigAdobeGraniteSamlAuthenticationHandler(ServerRequestInterface $request)
    {
        //TODO implement method
        /** @var \App\DTO\PostConfigAdobeGraniteSamlAuthenticationHandlerQueryData $queryData */
        $queryData = $request->getAttribute("queryData");
        throw new PHException\HttpCode(501, "Not implemented");
    }
}
