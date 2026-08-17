#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/keystore_info.h"
#include "../model/truststore_info.h"


void
SlingAPI_deleteAgent(apiClient_t *apiClient, char *runmode, char *name);


void
SlingAPI_deleteNode(apiClient_t *apiClient, char *path, char *name);


void
SlingAPI_getAgent(apiClient_t *apiClient, char *runmode, char *name);


char*
SlingAPI_getAgents(apiClient_t *apiClient, char *runmode);


keystore_info_t*
SlingAPI_getAuthorizableKeystore(apiClient_t *apiClient, char *intermediatePath, char *authorizableId);


binary_t*
SlingAPI_getKeystore(apiClient_t *apiClient, char *intermediatePath, char *authorizableId);


void
SlingAPI_getNode(apiClient_t *apiClient, char *path, char *name);


binary_t*
SlingAPI_getPackage(apiClient_t *apiClient, char *group, char *name, char *version);


char*
SlingAPI_getPackageFilter(apiClient_t *apiClient, char *group, char *name, char *version);


char*
SlingAPI_getQuery(apiClient_t *apiClient, char *path, double p.limit, char *_1_property, char *_1_property.value);


binary_t*
SlingAPI_getTruststore(apiClient_t *apiClient);


truststore_info_t*
SlingAPI_getTruststoreInfo(apiClient_t *apiClient);


void
SlingAPI_postAgent(apiClient_t *apiClient, char *runmode, char *name, int *jcr:content/cq:distribute, char *jcr:content/cq:distribute@TypeHint, char *jcr:content/cq:name, char *jcr:content/cq:template, int *jcr:content/aliasUpdate, int *jcr:content/enabled, char *jcr:content/jcr:description, char *jcr:content/jcr:lastModified, char *jcr:content/jcr:lastModifiedBy, char *jcr:content/jcr:mixinTypes, char *jcr:content/jcr:title, char *jcr:content/logLevel, int *jcr:content/noStatusUpdate, int *jcr:content/noVersioning, double jcr:content/protocolConnectTimeout, int *jcr:content/protocolHTTPConnectionClosed, char *jcr:content/protocolHTTPExpired, list_t *jcr:content/protocolHTTPHeaders, char *jcr:content/protocolHTTPHeaders@TypeHint, char *jcr:content/protocolHTTPMethod, int *jcr:content/protocolHTTPSRelaxed, char *jcr:content/protocolInterface, double jcr:content/protocolSocketTimeout, char *jcr:content/protocolVersion, char *jcr:content/proxyNTLMDomain, char *jcr:content/proxyNTLMHost, char *jcr:content/proxyHost, char *jcr:content/proxyPassword, double jcr:content/proxyPort, char *jcr:content/proxyUser, double jcr:content/queueBatchMaxSize, char *jcr:content/queueBatchMode, double jcr:content/queueBatchWaitTime, char *jcr:content/retryDelay, int *jcr:content/reverseReplication, char *jcr:content/serializationType, char *jcr:content/sling:resourceType, char *jcr:content/ssl, char *jcr:content/transportNTLMDomain, char *jcr:content/transportNTLMHost, char *jcr:content/transportPassword, char *jcr:content/transportUri, char *jcr:content/transportUser, int *jcr:content/triggerDistribute, int *jcr:content/triggerModified, int *jcr:content/triggerOnOffTime, int *jcr:content/triggerReceive, int *jcr:content/triggerSpecific, char *jcr:content/userId, char *jcr:primaryType, char *:operation);


keystore_info_t*
SlingAPI_postAuthorizableKeystore(apiClient_t *apiClient, char *intermediatePath, char *authorizableId, char *:operation, char *currentPassword, char *newPassword, char *rePassword, char *keyPassword, char *keyStorePass, char *alias, char *newAlias, char *removeAlias, binary_t* cert_chain, binary_t* pk, binary_t* keyStore);


char*
SlingAPI_postAuthorizables(apiClient_t *apiClient, char *authorizableId, char *intermediatePath, char *createUser, char *createGroup, char *rep:password, char *profile/givenName);


void
SlingAPI_postConfigAdobeGraniteSamlAuthenticationHandler(apiClient_t *apiClient, char *keyStorePassword, char *keyStorePassword@TypeHint, int *service.ranking, char *service.ranking@TypeHint, int *idpHttpRedirect, char *idpHttpRedirect@TypeHint, int *createUser, char *createUser@TypeHint, char *defaultRedirectUrl, char *defaultRedirectUrl@TypeHint, char *userIDAttribute, char *userIDAttribute@TypeHint, list_t *defaultGroups, char *defaultGroups@TypeHint, char *idpCertAlias, char *idpCertAlias@TypeHint, int *addGroupMemberships, char *addGroupMemberships@TypeHint, list_t *path, char *path@TypeHint, list_t *synchronizeAttributes, char *synchronizeAttributes@TypeHint, int *clockTolerance, char *clockTolerance@TypeHint, char *groupMembershipAttribute, char *groupMembershipAttribute@TypeHint, char *idpUrl, char *idpUrl@TypeHint, char *logoutUrl, char *logoutUrl@TypeHint, char *serviceProviderEntityId, char *serviceProviderEntityId@TypeHint, char *assertionConsumerServiceURL, char *assertionConsumerServiceURL@TypeHint, int *handleLogout, char *handleLogout@TypeHint, char *spPrivateKeyAlias, char *spPrivateKeyAlias@TypeHint, int *useEncryption, char *useEncryption@TypeHint, char *nameIdFormat, char *nameIdFormat@TypeHint, char *digestMethod, char *digestMethod@TypeHint, char *signatureMethod, char *signatureMethod@TypeHint, char *userIntermediatePath, char *userIntermediatePath@TypeHint);


void
SlingAPI_postConfigApacheFelixJettyBasedHttpService(apiClient_t *apiClient, int *org.apache.felix.https.nio, char *org.apache.felix.https.nio@TypeHint, char *org.apache.felix.https.keystore, char *org.apache.felix.https.keystore@TypeHint, char *org.apache.felix.https.keystore.password, char *org.apache.felix.https.keystore.password@TypeHint, char *org.apache.felix.https.keystore.key, char *org.apache.felix.https.keystore.key@TypeHint, char *org.apache.felix.https.keystore.key.password, char *org.apache.felix.https.keystore.key.password@TypeHint, char *org.apache.felix.https.truststore, char *org.apache.felix.https.truststore@TypeHint, char *org.apache.felix.https.truststore.password, char *org.apache.felix.https.truststore.password@TypeHint, char *org.apache.felix.https.clientcertificate, char *org.apache.felix.https.clientcertificate@TypeHint, int *org.apache.felix.https.enable, char *org.apache.felix.https.enable@TypeHint, char *org.osgi.service.http.port.secure, char *org.osgi.service.http.port.secure@TypeHint);


void
SlingAPI_postConfigApacheHttpComponentsProxyConfiguration(apiClient_t *apiClient, char *proxy.host, char *proxy.host@TypeHint, int *proxy.port, char *proxy.port@TypeHint, list_t *proxy.exceptions, char *proxy.exceptions@TypeHint, int *proxy.enabled, char *proxy.enabled@TypeHint, char *proxy.user, char *proxy.user@TypeHint, char *proxy.password, char *proxy.password@TypeHint);


void
SlingAPI_postConfigApacheSlingDavExServlet(apiClient_t *apiClient, char *alias, char *alias@TypeHint, int *dav.create_absolute_uri, char *dav.create_absolute_uri@TypeHint);


void
SlingAPI_postConfigApacheSlingGetServlet(apiClient_t *apiClient, char *json.maximumresults, char *json.maximumresults@TypeHint, int *enable.html, char *enable.html@TypeHint, int *enable.txt, char *enable.txt@TypeHint, int *enable.xml, char *enable.xml@TypeHint);


void
SlingAPI_postConfigApacheSlingReferrerFilter(apiClient_t *apiClient, int *allow.empty, char *allow.empty@TypeHint, char *allow.hosts, char *allow.hosts@TypeHint, char *allow.hosts.regexp, char *allow.hosts.regexp@TypeHint, char *filter.methods, char *filter.methods@TypeHint);


void
SlingAPI_postConfigProperty(apiClient_t *apiClient, char *configNodeName);


void
SlingAPI_postNode(apiClient_t *apiClient, char *path, char *name, char *:operation, char *deleteAuthorizable, binary_t* file);


void
SlingAPI_postNodeRw(apiClient_t *apiClient, char *path, char *name, char *addMembers);


void
SlingAPI_postPath(apiClient_t *apiClient, char *path, char *jcr:primaryType, char *:name);


char*
SlingAPI_postQuery(apiClient_t *apiClient, char *path, double p.limit, char *_1_property, char *_1_property.value);


void
SlingAPI_postTreeActivation(apiClient_t *apiClient, int *ignoredeactivated, int *onlymodified, char *path, char *cmd);


char*
SlingAPI_postTruststore(apiClient_t *apiClient, char *:operation, char *newPassword, char *rePassword, char *keyStoreType, char *removeAlias, binary_t* certificate);


char*
SlingAPI_postTruststorePKCS12(apiClient_t *apiClient, binary_t* truststore.p12);


