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

#ifndef OAI_OAICqApiRequest_H
#define OAI_OAICqApiRequest_H

#include <QObject>
#include <QStringList>
#include <QMultiMap>
#include <QNetworkReply>
#include <QSharedPointer>

#include <qhttpengine/socket.h>
#include <QString>
#include "OAICqApiHandler.h"

namespace OpenAPI {

class OAICqApiRequest : public QObject
{
    Q_OBJECT
    
public:
    OAICqApiRequest(QHttpEngine::Socket *s, OAICqApiHandler* handler);
    virtual ~OAICqApiRequest();

    void getLoginPageRequest();
    void postCqActionsRequest();
    

    void getLoginPageResponse(const QString& res);
    void postCqActionsResponse();
    

    void getLoginPageError(const QString& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void postCqActionsError(QNetworkReply::NetworkError error_type, QString& error_str);
    

    void sendCustomResponse(QByteArray & res, QNetworkReply::NetworkError error_type);

    void sendCustomResponse(QIODevice *res, QNetworkReply::NetworkError error_type);

    QMap<QString, QString> getRequestHeaders() const;

    QHttpEngine::Socket* getRawSocket();

    void setResponseHeaders(const QMultiMap<QString,QString>& headers);

signals:
    void getLoginPage();
    void postCqActions(QString authorizable_id, QString changelog);
    

private:
    QMap<QString, QString> requestHeaders;
    QMap<QString, QString> responseHeaders;
    QHttpEngine::Socket  *socket;
    OAICqApiHandler *handler;

    inline void writeResponseHeaders(){
        QHttpEngine::Socket::HeaderMap resHeaders;
        for(auto itr = responseHeaders.begin(); itr != responseHeaders.end(); ++itr) {
            resHeaders.insert(itr.key().toUtf8(), itr.value().toUtf8());
        }
        socket->setHeaders(resHeaders);
        socket->writeHeaders();        
    }
};

}

#endif // OAI_OAICqApiRequest_H