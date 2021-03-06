/**
 * Adobe Experience Manager (AEM) API
 * Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API
 *
 * OpenAPI spec version: 3.2.0-pre.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

#include <QJsonArray>
#include <QJsonDocument>
#include <QJsonObject>
#include <QVariantMap>
#include <QDebug>

#include "OAICustomApiHandler.h"
#include "OAICustomApiRequest.h"

namespace OpenAPI {

OAICustomApiHandler::OAICustomApiHandler(){

}

OAICustomApiHandler::~OAICustomApiHandler(){

}

void OAICustomApiHandler::getAemHealthCheck(QString tags, bool combine_tags_or) {
    Q_UNUSED(tags);
    Q_UNUSED(combine_tags_or);
    auto reqObj = qobject_cast<OAICustomApiRequest*>(sender());
    if( reqObj != nullptr ) 
    { 
        QString res;
        reqObj->getAemHealthCheckResponse(res);
    }    
}
void OAICustomApiHandler::postConfigAemHealthCheckServlet(QList<QString> bundles_ignored, QString bundles_ignored_type_hint) {
    Q_UNUSED(bundles_ignored);
    Q_UNUSED(bundles_ignored_type_hint);
    auto reqObj = qobject_cast<OAICustomApiRequest*>(sender());
    if( reqObj != nullptr ) 
    { 
        
        reqObj->postConfigAemHealthCheckServletResponse();
    }    
}
void OAICustomApiHandler::postConfigAemPasswordReset(QList<QString> pwdreset_authorizables, QString pwdreset_authorizables_type_hint) {
    Q_UNUSED(pwdreset_authorizables);
    Q_UNUSED(pwdreset_authorizables_type_hint);
    auto reqObj = qobject_cast<OAICustomApiRequest*>(sender());
    if( reqObj != nullptr ) 
    { 
        
        reqObj->postConfigAemPasswordResetResponse();
    }    
}


}
