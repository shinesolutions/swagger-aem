<?php
/**
 * Adobe Experience Manager (AEM) API
 * @version 3.2.0-pre.0
 */

require_once __DIR__ . '/vendor/autoload.php';

use OpenAPIServer\SlimRouter;

$router = new SlimRouter();
$app = $router->getSlimApp();
$app->run();
