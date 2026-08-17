import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for SlingApi
void main() {
  final instance = Openapi().getSlingApi();

  group(SlingApi, () {
    //Future deleteAgent(String runmode, String name) async
    test('test deleteAgent', () async {
      // TODO
    });

    //Future deleteNode(String path, String name) async
    test('test deleteNode', () async {
      // TODO
    });

    //Future getAgent(String runmode, String name) async
    test('test getAgent', () async {
      // TODO
    });

    //Future<String> getAgents(String runmode) async
    test('test getAgents', () async {
      // TODO
    });

    //Future<KeystoreInfo> getAuthorizableKeystore(String intermediatePath, String authorizableId) async
    test('test getAuthorizableKeystore', () async {
      // TODO
    });

    //Future<Uint8List> getKeystore(String intermediatePath, String authorizableId) async
    test('test getKeystore', () async {
      // TODO
    });

    //Future getNode(String path, String name) async
    test('test getNode', () async {
      // TODO
    });

    //Future<Uint8List> getPackage(String group, String name, String version) async
    test('test getPackage', () async {
      // TODO
    });

    //Future<String> getPackageFilter(String group, String name, String version) async
    test('test getPackageFilter', () async {
      // TODO
    });

    //Future<String> getQuery(String path, num pPeriodLimit, String n1property, String n1propertyPeriodValue) async
    test('test getQuery', () async {
      // TODO
    });

    //Future<Uint8List> getTruststore() async
    test('test getTruststore', () async {
      // TODO
    });

    //Future<TruststoreInfo> getTruststoreInfo() async
    test('test getTruststoreInfo', () async {
      // TODO
    });

    //Future postAgent(String runmode, String name, { bool jcrColonContentSlashCqColonDistribute, String jcrColonContentSlashCqColonDistributeAtTypeHint, String jcrColonContentSlashCqColonName, String jcrColonContentSlashCqColonTemplate, bool jcrColonContentSlashAliasUpdate, bool jcrColonContentSlashEnabled, String jcrColonContentSlashJcrColonDescription, String jcrColonContentSlashJcrColonLastModified, String jcrColonContentSlashJcrColonLastModifiedBy, String jcrColonContentSlashJcrColonMixinTypes, String jcrColonContentSlashJcrColonTitle, String jcrColonContentSlashLogLevel, bool jcrColonContentSlashNoStatusUpdate, bool jcrColonContentSlashNoVersioning, num jcrColonContentSlashProtocolConnectTimeout, bool jcrColonContentSlashProtocolHTTPConnectionClosed, String jcrColonContentSlashProtocolHTTPExpired, BuiltList<String> jcrColonContentSlashProtocolHTTPHeaders, String jcrColonContentSlashProtocolHTTPHeadersAtTypeHint, String jcrColonContentSlashProtocolHTTPMethod, bool jcrColonContentSlashProtocolHTTPSRelaxed, String jcrColonContentSlashProtocolInterface, num jcrColonContentSlashProtocolSocketTimeout, String jcrColonContentSlashProtocolVersion, String jcrColonContentSlashProxyNTLMDomain, String jcrColonContentSlashProxyNTLMHost, String jcrColonContentSlashProxyHost, String jcrColonContentSlashProxyPassword, num jcrColonContentSlashProxyPort, String jcrColonContentSlashProxyUser, num jcrColonContentSlashQueueBatchMaxSize, String jcrColonContentSlashQueueBatchMode, num jcrColonContentSlashQueueBatchWaitTime, String jcrColonContentSlashRetryDelay, bool jcrColonContentSlashReverseReplication, String jcrColonContentSlashSerializationType, String jcrColonContentSlashSlingColonResourceType, String jcrColonContentSlashSsl, String jcrColonContentSlashTransportNTLMDomain, String jcrColonContentSlashTransportNTLMHost, String jcrColonContentSlashTransportPassword, String jcrColonContentSlashTransportUri, String jcrColonContentSlashTransportUser, bool jcrColonContentSlashTriggerDistribute, bool jcrColonContentSlashTriggerModified, bool jcrColonContentSlashTriggerOnOffTime, bool jcrColonContentSlashTriggerReceive, bool jcrColonContentSlashTriggerSpecific, String jcrColonContentSlashUserId, String jcrColonPrimaryType, String colonOperation }) async
    test('test postAgent', () async {
      // TODO
    });

    //Future<KeystoreInfo> postAuthorizableKeystore(String intermediatePath, String authorizableId, { String colonOperation, String currentPassword, String newPassword, String rePassword, String keyPassword, String keyStorePass, String alias, String newAlias, String removeAlias, MultipartFile certChain, MultipartFile pk, MultipartFile keyStore }) async
    test('test postAuthorizableKeystore', () async {
      // TODO
    });

    //Future<String> postAuthorizables(String authorizableId, String intermediatePath, { String createUser, String createGroup, String repColonPassword, String profileSlashGivenName }) async
    test('test postAuthorizables', () async {
      // TODO
    });

    //Future postConfigAdobeGraniteSamlAuthenticationHandler({ String keyStorePassword, String keyStorePasswordAtTypeHint, int servicePeriodRanking, String servicePeriodRankingAtTypeHint, bool idpHttpRedirect, String idpHttpRedirectAtTypeHint, bool createUser, String createUserAtTypeHint, String defaultRedirectUrl, String defaultRedirectUrlAtTypeHint, String userIDAttribute, String userIDAttributeAtTypeHint, BuiltList<String> defaultGroups, String defaultGroupsAtTypeHint, String idpCertAlias, String idpCertAliasAtTypeHint, bool addGroupMemberships, String addGroupMembershipsAtTypeHint, BuiltList<String> path, String pathAtTypeHint, BuiltList<String> synchronizeAttributes, String synchronizeAttributesAtTypeHint, int clockTolerance, String clockToleranceAtTypeHint, String groupMembershipAttribute, String groupMembershipAttributeAtTypeHint, String idpUrl, String idpUrlAtTypeHint, String logoutUrl, String logoutUrlAtTypeHint, String serviceProviderEntityId, String serviceProviderEntityIdAtTypeHint, String assertionConsumerServiceURL, String assertionConsumerServiceURLAtTypeHint, bool handleLogout, String handleLogoutAtTypeHint, String spPrivateKeyAlias, String spPrivateKeyAliasAtTypeHint, bool useEncryption, String useEncryptionAtTypeHint, String nameIdFormat, String nameIdFormatAtTypeHint, String digestMethod, String digestMethodAtTypeHint, String signatureMethod, String signatureMethodAtTypeHint, String userIntermediatePath, String userIntermediatePathAtTypeHint }) async
    test('test postConfigAdobeGraniteSamlAuthenticationHandler', () async {
      // TODO
    });

    //Future postConfigApacheFelixJettyBasedHttpService({ bool orgPeriodApachePeriodFelixPeriodHttpsPeriodNio, String orgPeriodApachePeriodFelixPeriodHttpsPeriodNioAtTypeHint, String orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystore, String orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystoreAtTypeHint, String orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodPassword, String orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodPasswordAtTypeHint, String orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodKey, String orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodKeyAtTypeHint, String orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodKeyPeriodPassword, String orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodKeyPeriodPasswordAtTypeHint, String orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststore, String orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststoreAtTypeHint, String orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststorePeriodPassword, String orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststorePeriodPasswordAtTypeHint, String orgPeriodApachePeriodFelixPeriodHttpsPeriodClientcertificate, String orgPeriodApachePeriodFelixPeriodHttpsPeriodClientcertificateAtTypeHint, bool orgPeriodApachePeriodFelixPeriodHttpsPeriodEnable, String orgPeriodApachePeriodFelixPeriodHttpsPeriodEnableAtTypeHint, String orgPeriodOsgiPeriodServicePeriodHttpPeriodPortPeriodSecure, String orgPeriodOsgiPeriodServicePeriodHttpPeriodPortPeriodSecureAtTypeHint }) async
    test('test postConfigApacheFelixJettyBasedHttpService', () async {
      // TODO
    });

    //Future postConfigApacheHttpComponentsProxyConfiguration({ String proxyPeriodHost, String proxyPeriodHostAtTypeHint, int proxyPeriodPort, String proxyPeriodPortAtTypeHint, BuiltList<String> proxyPeriodExceptions, String proxyPeriodExceptionsAtTypeHint, bool proxyPeriodEnabled, String proxyPeriodEnabledAtTypeHint, String proxyPeriodUser, String proxyPeriodUserAtTypeHint, String proxyPeriodPassword, String proxyPeriodPasswordAtTypeHint }) async
    test('test postConfigApacheHttpComponentsProxyConfiguration', () async {
      // TODO
    });

    //Future postConfigApacheSlingDavExServlet({ String alias, String aliasAtTypeHint, bool davPeriodCreateAbsoluteUri, String davPeriodCreateAbsoluteUriAtTypeHint }) async
    test('test postConfigApacheSlingDavExServlet', () async {
      // TODO
    });

    //Future postConfigApacheSlingGetServlet({ String jsonPeriodMaximumresults, String jsonPeriodMaximumresultsAtTypeHint, bool enablePeriodHtml, String enablePeriodHtmlAtTypeHint, bool enablePeriodTxt, String enablePeriodTxtAtTypeHint, bool enablePeriodXml, String enablePeriodXmlAtTypeHint }) async
    test('test postConfigApacheSlingGetServlet', () async {
      // TODO
    });

    //Future postConfigApacheSlingReferrerFilter({ bool allowPeriodEmpty, String allowPeriodEmptyAtTypeHint, String allowPeriodHosts, String allowPeriodHostsAtTypeHint, String allowPeriodHostsPeriodRegexp, String allowPeriodHostsPeriodRegexpAtTypeHint, String filterPeriodMethods, String filterPeriodMethodsAtTypeHint }) async
    test('test postConfigApacheSlingReferrerFilter', () async {
      // TODO
    });

    //Future postConfigProperty(String configNodeName) async
    test('test postConfigProperty', () async {
      // TODO
    });

    //Future postNode(String path, String name, { String colonOperation, String deleteAuthorizable, MultipartFile file }) async
    test('test postNode', () async {
      // TODO
    });

    //Future postNodeRw(String path, String name, { String addMembers }) async
    test('test postNodeRw', () async {
      // TODO
    });

    //Future postPath(String path, String jcrColonPrimaryType, String colonName) async
    test('test postPath', () async {
      // TODO
    });

    //Future<String> postQuery(String path, num pPeriodLimit, String n1property, String n1propertyPeriodValue) async
    test('test postQuery', () async {
      // TODO
    });

    //Future postTreeActivation(bool ignoredeactivated, bool onlymodified, String path, String cmd) async
    test('test postTreeActivation', () async {
      // TODO
    });

    //Future<String> postTruststore({ String colonOperation, String newPassword, String rePassword, String keyStoreType, String removeAlias, MultipartFile certificate }) async
    test('test postTruststore', () async {
      // TODO
    });

    //Future<String> postTruststorePKCS12({ MultipartFile truststorePeriodP12 }) async
    test('test postTruststorePKCS12', () async {
      // TODO
    });

  });
}
