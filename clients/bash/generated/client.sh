#!/usr/bin/env bash

# !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
# !
# ! Note:
# !
# ! THIS SCRIPT HAS BEEN AUTOMATICALLY GENERATED USING
# ! openapi-generator (https://openapi-generator.tech)
# ! FROM OPENAPI SPECIFICATION IN JSON.
# !
# !
# !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

#
# This is a Bash client for Adobe Experience Manager (AEM) API.
#
# LICENSE:
# 
#
# CONTACT:
# opensource@shinesolutions.com
#
# MORE INFORMATION:
# 
#

# For improved pattern matching in case statemets
shopt -s extglob

###############################################################################
#
# Make sure Bash is at least in version 4.3
#
###############################################################################
if ! ( (("${BASH_VERSION:0:1}" == "4")) && (("${BASH_VERSION:2:1}" >= "3")) ) \
  && ! (("${BASH_VERSION:0:1}" >= "5")); then
    echo ""
    echo "Sorry - your Bash version is ${BASH_VERSION}"
    echo ""
    echo "You need at least Bash 4.3 to run this script."
    echo ""
    exit 1
fi

###############################################################################
#
# Global variables
#
###############################################################################

##
# The filename of this script for help messages
script_name=$(basename "$0")

##
# Map for headers passed after operation as KEY:VALUE
declare -A header_arguments


##
# Map for operation parameters passed after operation as PARAMETER=VALUE
# These will be mapped to appropriate path or query parameters
# The values in operation_parameters are arrays, so that multiple values
# can be provided for the same parameter if allowed by API specification
declare -A operation_parameters

##
# Declare colors with autodection if output is terminal
if [ -t 1 ]; then
    RED="$(tput setaf 1)"
    GREEN="$(tput setaf 2)"
    YELLOW="$(tput setaf 3)"
    BLUE="$(tput setaf 4)"
    MAGENTA="$(tput setaf 5)"
    CYAN="$(tput setaf 6)"
    WHITE="$(tput setaf 7)"
    BOLD="$(tput bold)"
    OFF="$(tput sgr0)"
else
    RED=""
    GREEN=""
    YELLOW=""
    BLUE=""
    MAGENTA=""
    CYAN=""
    WHITE=""
    BOLD=""
    OFF=""
fi

declare -a result_color_table=( "$WHITE" "$WHITE" "$GREEN" "$YELLOW" "$WHITE" "$MAGENTA" "$WHITE" )

##
# This array stores the minimum number of required occurrences for parameter
# 0 - optional
# 1 - required
declare -A operation_parameters_minimum_occurrences
operation_parameters_minimum_occurrences["postBundle:::name"]=1
operation_parameters_minimum_occurrences["postBundle:::action"]=1
operation_parameters_minimum_occurrences["postJmxRepository:::action"]=1
operation_parameters_minimum_occurrences["postSamlConfiguration:::post"]=0
operation_parameters_minimum_occurrences["postSamlConfiguration:::apply"]=0
operation_parameters_minimum_occurrences["postSamlConfiguration:::delete"]=0
operation_parameters_minimum_occurrences["postSamlConfiguration:::action"]=0
operation_parameters_minimum_occurrences["postSamlConfiguration:::$location"]=0
operation_parameters_minimum_occurrences["postSamlConfiguration:::path"]=0
operation_parameters_minimum_occurrences["postSamlConfiguration:::service.ranking"]=0
operation_parameters_minimum_occurrences["postSamlConfiguration:::idpUrl"]=0
operation_parameters_minimum_occurrences["postSamlConfiguration:::idpCertAlias"]=0
operation_parameters_minimum_occurrences["postSamlConfiguration:::idpHttpRedirect"]=0
operation_parameters_minimum_occurrences["postSamlConfiguration:::serviceProviderEntityId"]=0
operation_parameters_minimum_occurrences["postSamlConfiguration:::assertionConsumerServiceURL"]=0
operation_parameters_minimum_occurrences["postSamlConfiguration:::spPrivateKeyAlias"]=0
operation_parameters_minimum_occurrences["postSamlConfiguration:::keyStorePassword"]=0
operation_parameters_minimum_occurrences["postSamlConfiguration:::defaultRedirectUrl"]=0
operation_parameters_minimum_occurrences["postSamlConfiguration:::userIDAttribute"]=0
operation_parameters_minimum_occurrences["postSamlConfiguration:::useEncryption"]=0
operation_parameters_minimum_occurrences["postSamlConfiguration:::createUser"]=0
operation_parameters_minimum_occurrences["postSamlConfiguration:::addGroupMemberships"]=0
operation_parameters_minimum_occurrences["postSamlConfiguration:::groupMembershipAttribute"]=0
operation_parameters_minimum_occurrences["postSamlConfiguration:::defaultGroups"]=0
operation_parameters_minimum_occurrences["postSamlConfiguration:::nameIdFormat"]=0
operation_parameters_minimum_occurrences["postSamlConfiguration:::synchronizeAttributes"]=0
operation_parameters_minimum_occurrences["postSamlConfiguration:::handleLogout"]=0
operation_parameters_minimum_occurrences["postSamlConfiguration:::logoutUrl"]=0
operation_parameters_minimum_occurrences["postSamlConfiguration:::clockTolerance"]=0
operation_parameters_minimum_occurrences["postSamlConfiguration:::digestMethod"]=0
operation_parameters_minimum_occurrences["postSamlConfiguration:::signatureMethod"]=0
operation_parameters_minimum_occurrences["postSamlConfiguration:::userIntermediatePath"]=0
operation_parameters_minimum_occurrences["postSamlConfiguration:::propertylist"]=0
operation_parameters_minimum_occurrences["postCqActions:::authorizableId"]=1
operation_parameters_minimum_occurrences["postCqActions:::changelog"]=1
operation_parameters_minimum_occurrences["postPackageService:::cmd"]=1
operation_parameters_minimum_occurrences["postPackageServiceJson:::path"]=1
operation_parameters_minimum_occurrences["postPackageServiceJson:::cmd"]=1
operation_parameters_minimum_occurrences["postPackageServiceJson:::groupName"]=0
operation_parameters_minimum_occurrences["postPackageServiceJson:::packageName"]=0
operation_parameters_minimum_occurrences["postPackageServiceJson:::packageVersion"]=0
operation_parameters_minimum_occurrences["postPackageServiceJson:::_charset_"]=0
operation_parameters_minimum_occurrences["postPackageServiceJson:::force"]=0
operation_parameters_minimum_occurrences["postPackageServiceJson:::recursive"]=0
operation_parameters_minimum_occurrences["postPackageServiceJson:::package"]=0
operation_parameters_minimum_occurrences["postPackageUpdate:::groupName"]=1
operation_parameters_minimum_occurrences["postPackageUpdate:::packageName"]=1
operation_parameters_minimum_occurrences["postPackageUpdate:::version"]=1
operation_parameters_minimum_occurrences["postPackageUpdate:::path"]=1
operation_parameters_minimum_occurrences["postPackageUpdate:::filter"]=0
operation_parameters_minimum_occurrences["postPackageUpdate:::_charset_"]=0
operation_parameters_minimum_occurrences["postSetPassword:::old"]=1
operation_parameters_minimum_occurrences["postSetPassword:::plain"]=1
operation_parameters_minimum_occurrences["postSetPassword:::verify"]=1
operation_parameters_minimum_occurrences["getAemHealthCheck:::tags"]=0
operation_parameters_minimum_occurrences["getAemHealthCheck:::combineTagsOr"]=0
operation_parameters_minimum_occurrences["postConfigAemHealthCheckServlet:::bundles.ignored"]=0
operation_parameters_minimum_occurrences["postConfigAemHealthCheckServlet:::bundles.ignored@TypeHint"]=0
operation_parameters_minimum_occurrences["postConfigAemPasswordReset:::pwdreset.authorizables"]=0
operation_parameters_minimum_occurrences["postConfigAemPasswordReset:::pwdreset.authorizables@TypeHint"]=0
operation_parameters_minimum_occurrences["deleteAgent:::runmode"]=1
operation_parameters_minimum_occurrences["deleteAgent:::name"]=1
operation_parameters_minimum_occurrences["deleteNode:::path"]=1
operation_parameters_minimum_occurrences["deleteNode:::name"]=1
operation_parameters_minimum_occurrences["getAgent:::runmode"]=1
operation_parameters_minimum_occurrences["getAgent:::name"]=1
operation_parameters_minimum_occurrences["getAgents:::runmode"]=1
operation_parameters_minimum_occurrences["getAuthorizableKeystore:::intermediatePath"]=1
operation_parameters_minimum_occurrences["getAuthorizableKeystore:::authorizableId"]=1
operation_parameters_minimum_occurrences["getKeystore:::intermediatePath"]=1
operation_parameters_minimum_occurrences["getKeystore:::authorizableId"]=1
operation_parameters_minimum_occurrences["getNode:::path"]=1
operation_parameters_minimum_occurrences["getNode:::name"]=1
operation_parameters_minimum_occurrences["getPackage:::group"]=1
operation_parameters_minimum_occurrences["getPackage:::name"]=1
operation_parameters_minimum_occurrences["getPackage:::version"]=1
operation_parameters_minimum_occurrences["getPackageFilter:::group"]=1
operation_parameters_minimum_occurrences["getPackageFilter:::name"]=1
operation_parameters_minimum_occurrences["getPackageFilter:::version"]=1
operation_parameters_minimum_occurrences["getQuery:::path"]=1
operation_parameters_minimum_occurrences["getQuery:::p.limit"]=1
operation_parameters_minimum_occurrences["getQuery:::1_property"]=1
operation_parameters_minimum_occurrences["getQuery:::1_property.value"]=1
operation_parameters_minimum_occurrences["postAgent:::runmode"]=1
operation_parameters_minimum_occurrences["postAgent:::name"]=1
operation_parameters_minimum_occurrences["postAgent:::jcr:content/cq:distribute"]=0
operation_parameters_minimum_occurrences["postAgent:::jcr:content/cq:distribute@TypeHint"]=0
operation_parameters_minimum_occurrences["postAgent:::jcr:content/cq:name"]=0
operation_parameters_minimum_occurrences["postAgent:::jcr:content/cq:template"]=0
operation_parameters_minimum_occurrences["postAgent:::jcr:content/enabled"]=0
operation_parameters_minimum_occurrences["postAgent:::jcr:content/jcr:description"]=0
operation_parameters_minimum_occurrences["postAgent:::jcr:content/jcr:lastModified"]=0
operation_parameters_minimum_occurrences["postAgent:::jcr:content/jcr:lastModifiedBy"]=0
operation_parameters_minimum_occurrences["postAgent:::jcr:content/jcr:mixinTypes"]=0
operation_parameters_minimum_occurrences["postAgent:::jcr:content/jcr:title"]=0
operation_parameters_minimum_occurrences["postAgent:::jcr:content/logLevel"]=0
operation_parameters_minimum_occurrences["postAgent:::jcr:content/noStatusUpdate"]=0
operation_parameters_minimum_occurrences["postAgent:::jcr:content/noVersioning"]=0
operation_parameters_minimum_occurrences["postAgent:::jcr:content/protocolConnectTimeout"]=0
operation_parameters_minimum_occurrences["postAgent:::jcr:content/protocolHTTPConnectionClosed"]=0
operation_parameters_minimum_occurrences["postAgent:::jcr:content/protocolHTTPExpired"]=0
operation_parameters_minimum_occurrences["postAgent:::jcr:content/protocolHTTPHeaders"]=0
operation_parameters_minimum_occurrences["postAgent:::jcr:content/protocolHTTPHeaders@TypeHint"]=0
operation_parameters_minimum_occurrences["postAgent:::jcr:content/protocolHTTPMethod"]=0
operation_parameters_minimum_occurrences["postAgent:::jcr:content/protocolHTTPSRelaxed"]=0
operation_parameters_minimum_occurrences["postAgent:::jcr:content/protocolInterface"]=0
operation_parameters_minimum_occurrences["postAgent:::jcr:content/protocolSocketTimeout"]=0
operation_parameters_minimum_occurrences["postAgent:::jcr:content/protocolVersion"]=0
operation_parameters_minimum_occurrences["postAgent:::jcr:content/proxyNTLMDomain"]=0
operation_parameters_minimum_occurrences["postAgent:::jcr:content/proxyNTLMHost"]=0
operation_parameters_minimum_occurrences["postAgent:::jcr:content/proxyHost"]=0
operation_parameters_minimum_occurrences["postAgent:::jcr:content/proxyPassword"]=0
operation_parameters_minimum_occurrences["postAgent:::jcr:content/proxyPort"]=0
operation_parameters_minimum_occurrences["postAgent:::jcr:content/proxyUser"]=0
operation_parameters_minimum_occurrences["postAgent:::jcr:content/queueBatchMaxSize"]=0
operation_parameters_minimum_occurrences["postAgent:::jcr:content/queueBatchMode"]=0
operation_parameters_minimum_occurrences["postAgent:::jcr:content/queueBatchWaitTime"]=0
operation_parameters_minimum_occurrences["postAgent:::jcr:content/retryDelay"]=0
operation_parameters_minimum_occurrences["postAgent:::jcr:content/reverseReplication"]=0
operation_parameters_minimum_occurrences["postAgent:::jcr:content/serializationType"]=0
operation_parameters_minimum_occurrences["postAgent:::jcr:content/sling:resourceType"]=0
operation_parameters_minimum_occurrences["postAgent:::jcr:content/ssl"]=0
operation_parameters_minimum_occurrences["postAgent:::jcr:content/transportNTLMDomain"]=0
operation_parameters_minimum_occurrences["postAgent:::jcr:content/transportNTLMHost"]=0
operation_parameters_minimum_occurrences["postAgent:::jcr:content/transportPassword"]=0
operation_parameters_minimum_occurrences["postAgent:::jcr:content/transportUri"]=0
operation_parameters_minimum_occurrences["postAgent:::jcr:content/transportUser"]=0
operation_parameters_minimum_occurrences["postAgent:::jcr:content/triggerDistribute"]=0
operation_parameters_minimum_occurrences["postAgent:::jcr:content/triggerModified"]=0
operation_parameters_minimum_occurrences["postAgent:::jcr:content/triggerOnOffTime"]=0
operation_parameters_minimum_occurrences["postAgent:::jcr:content/triggerReceive"]=0
operation_parameters_minimum_occurrences["postAgent:::jcr:content/triggerSpecific"]=0
operation_parameters_minimum_occurrences["postAgent:::jcr:content/userId"]=0
operation_parameters_minimum_occurrences["postAgent:::jcr:primaryType"]=0
operation_parameters_minimum_occurrences["postAgent::::operation"]=0
operation_parameters_minimum_occurrences["postAuthorizableKeystore:::intermediatePath"]=1
operation_parameters_minimum_occurrences["postAuthorizableKeystore:::authorizableId"]=1
operation_parameters_minimum_occurrences["postAuthorizableKeystore::::operation"]=0
operation_parameters_minimum_occurrences["postAuthorizableKeystore:::currentPassword"]=0
operation_parameters_minimum_occurrences["postAuthorizableKeystore:::newPassword"]=0
operation_parameters_minimum_occurrences["postAuthorizableKeystore:::rePassword"]=0
operation_parameters_minimum_occurrences["postAuthorizableKeystore:::keyPassword"]=0
operation_parameters_minimum_occurrences["postAuthorizableKeystore:::keyStorePass"]=0
operation_parameters_minimum_occurrences["postAuthorizableKeystore:::alias"]=0
operation_parameters_minimum_occurrences["postAuthorizableKeystore:::newAlias"]=0
operation_parameters_minimum_occurrences["postAuthorizableKeystore:::removeAlias"]=0
operation_parameters_minimum_occurrences["postAuthorizableKeystore:::cert-chain"]=0
operation_parameters_minimum_occurrences["postAuthorizableKeystore:::pk"]=0
operation_parameters_minimum_occurrences["postAuthorizableKeystore:::keyStore"]=0
operation_parameters_minimum_occurrences["postAuthorizables:::authorizableId"]=1
operation_parameters_minimum_occurrences["postAuthorizables:::intermediatePath"]=1
operation_parameters_minimum_occurrences["postAuthorizables:::createUser"]=0
operation_parameters_minimum_occurrences["postAuthorizables:::createGroup"]=0
operation_parameters_minimum_occurrences["postAuthorizables:::rep:password"]=0
operation_parameters_minimum_occurrences["postAuthorizables:::profile/givenName"]=0
operation_parameters_minimum_occurrences["postConfigAdobeGraniteSamlAuthenticationHandler:::keyStorePassword"]=0
operation_parameters_minimum_occurrences["postConfigAdobeGraniteSamlAuthenticationHandler:::keyStorePassword@TypeHint"]=0
operation_parameters_minimum_occurrences["postConfigAdobeGraniteSamlAuthenticationHandler:::service.ranking"]=0
operation_parameters_minimum_occurrences["postConfigAdobeGraniteSamlAuthenticationHandler:::service.ranking@TypeHint"]=0
operation_parameters_minimum_occurrences["postConfigAdobeGraniteSamlAuthenticationHandler:::idpHttpRedirect"]=0
operation_parameters_minimum_occurrences["postConfigAdobeGraniteSamlAuthenticationHandler:::idpHttpRedirect@TypeHint"]=0
operation_parameters_minimum_occurrences["postConfigAdobeGraniteSamlAuthenticationHandler:::createUser"]=0
operation_parameters_minimum_occurrences["postConfigAdobeGraniteSamlAuthenticationHandler:::createUser@TypeHint"]=0
operation_parameters_minimum_occurrences["postConfigAdobeGraniteSamlAuthenticationHandler:::defaultRedirectUrl"]=0
operation_parameters_minimum_occurrences["postConfigAdobeGraniteSamlAuthenticationHandler:::defaultRedirectUrl@TypeHint"]=0
operation_parameters_minimum_occurrences["postConfigAdobeGraniteSamlAuthenticationHandler:::userIDAttribute"]=0
operation_parameters_minimum_occurrences["postConfigAdobeGraniteSamlAuthenticationHandler:::userIDAttribute@TypeHint"]=0
operation_parameters_minimum_occurrences["postConfigAdobeGraniteSamlAuthenticationHandler:::defaultGroups"]=0
operation_parameters_minimum_occurrences["postConfigAdobeGraniteSamlAuthenticationHandler:::defaultGroups@TypeHint"]=0
operation_parameters_minimum_occurrences["postConfigAdobeGraniteSamlAuthenticationHandler:::idpCertAlias"]=0
operation_parameters_minimum_occurrences["postConfigAdobeGraniteSamlAuthenticationHandler:::idpCertAlias@TypeHint"]=0
operation_parameters_minimum_occurrences["postConfigAdobeGraniteSamlAuthenticationHandler:::addGroupMemberships"]=0
operation_parameters_minimum_occurrences["postConfigAdobeGraniteSamlAuthenticationHandler:::addGroupMemberships@TypeHint"]=0
operation_parameters_minimum_occurrences["postConfigAdobeGraniteSamlAuthenticationHandler:::path"]=0
operation_parameters_minimum_occurrences["postConfigAdobeGraniteSamlAuthenticationHandler:::path@TypeHint"]=0
operation_parameters_minimum_occurrences["postConfigAdobeGraniteSamlAuthenticationHandler:::synchronizeAttributes"]=0
operation_parameters_minimum_occurrences["postConfigAdobeGraniteSamlAuthenticationHandler:::synchronizeAttributes@TypeHint"]=0
operation_parameters_minimum_occurrences["postConfigAdobeGraniteSamlAuthenticationHandler:::clockTolerance"]=0
operation_parameters_minimum_occurrences["postConfigAdobeGraniteSamlAuthenticationHandler:::clockTolerance@TypeHint"]=0
operation_parameters_minimum_occurrences["postConfigAdobeGraniteSamlAuthenticationHandler:::groupMembershipAttribute"]=0
operation_parameters_minimum_occurrences["postConfigAdobeGraniteSamlAuthenticationHandler:::groupMembershipAttribute@TypeHint"]=0
operation_parameters_minimum_occurrences["postConfigAdobeGraniteSamlAuthenticationHandler:::idpUrl"]=0
operation_parameters_minimum_occurrences["postConfigAdobeGraniteSamlAuthenticationHandler:::idpUrl@TypeHint"]=0
operation_parameters_minimum_occurrences["postConfigAdobeGraniteSamlAuthenticationHandler:::logoutUrl"]=0
operation_parameters_minimum_occurrences["postConfigAdobeGraniteSamlAuthenticationHandler:::logoutUrl@TypeHint"]=0
operation_parameters_minimum_occurrences["postConfigAdobeGraniteSamlAuthenticationHandler:::serviceProviderEntityId"]=0
operation_parameters_minimum_occurrences["postConfigAdobeGraniteSamlAuthenticationHandler:::serviceProviderEntityId@TypeHint"]=0
operation_parameters_minimum_occurrences["postConfigAdobeGraniteSamlAuthenticationHandler:::assertionConsumerServiceURL"]=0
operation_parameters_minimum_occurrences["postConfigAdobeGraniteSamlAuthenticationHandler:::assertionConsumerServiceURL@TypeHint"]=0
operation_parameters_minimum_occurrences["postConfigAdobeGraniteSamlAuthenticationHandler:::handleLogout"]=0
operation_parameters_minimum_occurrences["postConfigAdobeGraniteSamlAuthenticationHandler:::handleLogout@TypeHint"]=0
operation_parameters_minimum_occurrences["postConfigAdobeGraniteSamlAuthenticationHandler:::spPrivateKeyAlias"]=0
operation_parameters_minimum_occurrences["postConfigAdobeGraniteSamlAuthenticationHandler:::spPrivateKeyAlias@TypeHint"]=0
operation_parameters_minimum_occurrences["postConfigAdobeGraniteSamlAuthenticationHandler:::useEncryption"]=0
operation_parameters_minimum_occurrences["postConfigAdobeGraniteSamlAuthenticationHandler:::useEncryption@TypeHint"]=0
operation_parameters_minimum_occurrences["postConfigAdobeGraniteSamlAuthenticationHandler:::nameIdFormat"]=0
operation_parameters_minimum_occurrences["postConfigAdobeGraniteSamlAuthenticationHandler:::nameIdFormat@TypeHint"]=0
operation_parameters_minimum_occurrences["postConfigAdobeGraniteSamlAuthenticationHandler:::digestMethod"]=0
operation_parameters_minimum_occurrences["postConfigAdobeGraniteSamlAuthenticationHandler:::digestMethod@TypeHint"]=0
operation_parameters_minimum_occurrences["postConfigAdobeGraniteSamlAuthenticationHandler:::signatureMethod"]=0
operation_parameters_minimum_occurrences["postConfigAdobeGraniteSamlAuthenticationHandler:::signatureMethod@TypeHint"]=0
operation_parameters_minimum_occurrences["postConfigAdobeGraniteSamlAuthenticationHandler:::userIntermediatePath"]=0
operation_parameters_minimum_occurrences["postConfigAdobeGraniteSamlAuthenticationHandler:::userIntermediatePath@TypeHint"]=0
operation_parameters_minimum_occurrences["postConfigApacheFelixJettyBasedHttpService:::org.apache.felix.https.nio"]=0
operation_parameters_minimum_occurrences["postConfigApacheFelixJettyBasedHttpService:::org.apache.felix.https.nio@TypeHint"]=0
operation_parameters_minimum_occurrences["postConfigApacheFelixJettyBasedHttpService:::org.apache.felix.https.keystore"]=0
operation_parameters_minimum_occurrences["postConfigApacheFelixJettyBasedHttpService:::org.apache.felix.https.keystore@TypeHint"]=0
operation_parameters_minimum_occurrences["postConfigApacheFelixJettyBasedHttpService:::org.apache.felix.https.keystore.password"]=0
operation_parameters_minimum_occurrences["postConfigApacheFelixJettyBasedHttpService:::org.apache.felix.https.keystore.password@TypeHint"]=0
operation_parameters_minimum_occurrences["postConfigApacheFelixJettyBasedHttpService:::org.apache.felix.https.keystore.key"]=0
operation_parameters_minimum_occurrences["postConfigApacheFelixJettyBasedHttpService:::org.apache.felix.https.keystore.key@TypeHint"]=0
operation_parameters_minimum_occurrences["postConfigApacheFelixJettyBasedHttpService:::org.apache.felix.https.keystore.key.password"]=0
operation_parameters_minimum_occurrences["postConfigApacheFelixJettyBasedHttpService:::org.apache.felix.https.keystore.key.password@TypeHint"]=0
operation_parameters_minimum_occurrences["postConfigApacheFelixJettyBasedHttpService:::org.apache.felix.https.truststore"]=0
operation_parameters_minimum_occurrences["postConfigApacheFelixJettyBasedHttpService:::org.apache.felix.https.truststore@TypeHint"]=0
operation_parameters_minimum_occurrences["postConfigApacheFelixJettyBasedHttpService:::org.apache.felix.https.truststore.password"]=0
operation_parameters_minimum_occurrences["postConfigApacheFelixJettyBasedHttpService:::org.apache.felix.https.truststore.password@TypeHint"]=0
operation_parameters_minimum_occurrences["postConfigApacheFelixJettyBasedHttpService:::org.apache.felix.https.clientcertificate"]=0
operation_parameters_minimum_occurrences["postConfigApacheFelixJettyBasedHttpService:::org.apache.felix.https.clientcertificate@TypeHint"]=0
operation_parameters_minimum_occurrences["postConfigApacheFelixJettyBasedHttpService:::org.apache.felix.https.enable"]=0
operation_parameters_minimum_occurrences["postConfigApacheFelixJettyBasedHttpService:::org.apache.felix.https.enable@TypeHint"]=0
operation_parameters_minimum_occurrences["postConfigApacheFelixJettyBasedHttpService:::org.osgi.service.http.port.secure"]=0
operation_parameters_minimum_occurrences["postConfigApacheFelixJettyBasedHttpService:::org.osgi.service.http.port.secure@TypeHint"]=0
operation_parameters_minimum_occurrences["postConfigApacheHttpComponentsProxyConfiguration:::proxy.host"]=0
operation_parameters_minimum_occurrences["postConfigApacheHttpComponentsProxyConfiguration:::proxy.host@TypeHint"]=0
operation_parameters_minimum_occurrences["postConfigApacheHttpComponentsProxyConfiguration:::proxy.port"]=0
operation_parameters_minimum_occurrences["postConfigApacheHttpComponentsProxyConfiguration:::proxy.port@TypeHint"]=0
operation_parameters_minimum_occurrences["postConfigApacheHttpComponentsProxyConfiguration:::proxy.exceptions"]=0
operation_parameters_minimum_occurrences["postConfigApacheHttpComponentsProxyConfiguration:::proxy.exceptions@TypeHint"]=0
operation_parameters_minimum_occurrences["postConfigApacheHttpComponentsProxyConfiguration:::proxy.enabled"]=0
operation_parameters_minimum_occurrences["postConfigApacheHttpComponentsProxyConfiguration:::proxy.enabled@TypeHint"]=0
operation_parameters_minimum_occurrences["postConfigApacheHttpComponentsProxyConfiguration:::proxy.user"]=0
operation_parameters_minimum_occurrences["postConfigApacheHttpComponentsProxyConfiguration:::proxy.user@TypeHint"]=0
operation_parameters_minimum_occurrences["postConfigApacheHttpComponentsProxyConfiguration:::proxy.password"]=0
operation_parameters_minimum_occurrences["postConfigApacheHttpComponentsProxyConfiguration:::proxy.password@TypeHint"]=0
operation_parameters_minimum_occurrences["postConfigApacheSlingDavExServlet:::alias"]=0
operation_parameters_minimum_occurrences["postConfigApacheSlingDavExServlet:::alias@TypeHint"]=0
operation_parameters_minimum_occurrences["postConfigApacheSlingDavExServlet:::dav.create-absolute-uri"]=0
operation_parameters_minimum_occurrences["postConfigApacheSlingDavExServlet:::dav.create-absolute-uri@TypeHint"]=0
operation_parameters_minimum_occurrences["postConfigApacheSlingGetServlet:::json.maximumresults"]=0
operation_parameters_minimum_occurrences["postConfigApacheSlingGetServlet:::json.maximumresults@TypeHint"]=0
operation_parameters_minimum_occurrences["postConfigApacheSlingGetServlet:::enable.html"]=0
operation_parameters_minimum_occurrences["postConfigApacheSlingGetServlet:::enable.html@TypeHint"]=0
operation_parameters_minimum_occurrences["postConfigApacheSlingGetServlet:::enable.txt"]=0
operation_parameters_minimum_occurrences["postConfigApacheSlingGetServlet:::enable.txt@TypeHint"]=0
operation_parameters_minimum_occurrences["postConfigApacheSlingGetServlet:::enable.xml"]=0
operation_parameters_minimum_occurrences["postConfigApacheSlingGetServlet:::enable.xml@TypeHint"]=0
operation_parameters_minimum_occurrences["postConfigApacheSlingReferrerFilter:::allow.empty"]=0
operation_parameters_minimum_occurrences["postConfigApacheSlingReferrerFilter:::allow.empty@TypeHint"]=0
operation_parameters_minimum_occurrences["postConfigApacheSlingReferrerFilter:::allow.hosts"]=0
operation_parameters_minimum_occurrences["postConfigApacheSlingReferrerFilter:::allow.hosts@TypeHint"]=0
operation_parameters_minimum_occurrences["postConfigApacheSlingReferrerFilter:::allow.hosts.regexp"]=0
operation_parameters_minimum_occurrences["postConfigApacheSlingReferrerFilter:::allow.hosts.regexp@TypeHint"]=0
operation_parameters_minimum_occurrences["postConfigApacheSlingReferrerFilter:::filter.methods"]=0
operation_parameters_minimum_occurrences["postConfigApacheSlingReferrerFilter:::filter.methods@TypeHint"]=0
operation_parameters_minimum_occurrences["postNode:::path"]=1
operation_parameters_minimum_occurrences["postNode:::name"]=1
operation_parameters_minimum_occurrences["postNode::::operation"]=0
operation_parameters_minimum_occurrences["postNode:::deleteAuthorizable"]=0
operation_parameters_minimum_occurrences["postNode:::file"]=0
operation_parameters_minimum_occurrences["postNodeRw:::path"]=1
operation_parameters_minimum_occurrences["postNodeRw:::name"]=1
operation_parameters_minimum_occurrences["postNodeRw:::addMembers"]=0
operation_parameters_minimum_occurrences["postPath:::path"]=1
operation_parameters_minimum_occurrences["postPath:::jcr:primaryType"]=1
operation_parameters_minimum_occurrences["postPath::::name"]=1
operation_parameters_minimum_occurrences["postQuery:::path"]=1
operation_parameters_minimum_occurrences["postQuery:::p.limit"]=1
operation_parameters_minimum_occurrences["postQuery:::1_property"]=1
operation_parameters_minimum_occurrences["postQuery:::1_property.value"]=1
operation_parameters_minimum_occurrences["postTreeActivation:::ignoredeactivated"]=1
operation_parameters_minimum_occurrences["postTreeActivation:::onlymodified"]=1
operation_parameters_minimum_occurrences["postTreeActivation:::path"]=1
operation_parameters_minimum_occurrences["postTruststore::::operation"]=0
operation_parameters_minimum_occurrences["postTruststore:::newPassword"]=0
operation_parameters_minimum_occurrences["postTruststore:::rePassword"]=0
operation_parameters_minimum_occurrences["postTruststore:::keyStoreType"]=0
operation_parameters_minimum_occurrences["postTruststore:::removeAlias"]=0
operation_parameters_minimum_occurrences["postTruststore:::certificate"]=0
operation_parameters_minimum_occurrences["postTruststorePKCS12:::truststore.p12"]=0

##
# This array stores the maximum number of allowed occurrences for parameter
# 1 - single value
# 2 - 2 values
# N - N values
# 0 - unlimited
declare -A operation_parameters_maximum_occurrences
operation_parameters_maximum_occurrences["postBundle:::name"]=0
operation_parameters_maximum_occurrences["postBundle:::action"]=0
operation_parameters_maximum_occurrences["postJmxRepository:::action"]=0
operation_parameters_maximum_occurrences["postSamlConfiguration:::post"]=0
operation_parameters_maximum_occurrences["postSamlConfiguration:::apply"]=0
operation_parameters_maximum_occurrences["postSamlConfiguration:::delete"]=0
operation_parameters_maximum_occurrences["postSamlConfiguration:::action"]=0
operation_parameters_maximum_occurrences["postSamlConfiguration:::$location"]=0
operation_parameters_maximum_occurrences["postSamlConfiguration:::path"]=0
operation_parameters_maximum_occurrences["postSamlConfiguration:::service.ranking"]=0
operation_parameters_maximum_occurrences["postSamlConfiguration:::idpUrl"]=0
operation_parameters_maximum_occurrences["postSamlConfiguration:::idpCertAlias"]=0
operation_parameters_maximum_occurrences["postSamlConfiguration:::idpHttpRedirect"]=0
operation_parameters_maximum_occurrences["postSamlConfiguration:::serviceProviderEntityId"]=0
operation_parameters_maximum_occurrences["postSamlConfiguration:::assertionConsumerServiceURL"]=0
operation_parameters_maximum_occurrences["postSamlConfiguration:::spPrivateKeyAlias"]=0
operation_parameters_maximum_occurrences["postSamlConfiguration:::keyStorePassword"]=0
operation_parameters_maximum_occurrences["postSamlConfiguration:::defaultRedirectUrl"]=0
operation_parameters_maximum_occurrences["postSamlConfiguration:::userIDAttribute"]=0
operation_parameters_maximum_occurrences["postSamlConfiguration:::useEncryption"]=0
operation_parameters_maximum_occurrences["postSamlConfiguration:::createUser"]=0
operation_parameters_maximum_occurrences["postSamlConfiguration:::addGroupMemberships"]=0
operation_parameters_maximum_occurrences["postSamlConfiguration:::groupMembershipAttribute"]=0
operation_parameters_maximum_occurrences["postSamlConfiguration:::defaultGroups"]=0
operation_parameters_maximum_occurrences["postSamlConfiguration:::nameIdFormat"]=0
operation_parameters_maximum_occurrences["postSamlConfiguration:::synchronizeAttributes"]=0
operation_parameters_maximum_occurrences["postSamlConfiguration:::handleLogout"]=0
operation_parameters_maximum_occurrences["postSamlConfiguration:::logoutUrl"]=0
operation_parameters_maximum_occurrences["postSamlConfiguration:::clockTolerance"]=0
operation_parameters_maximum_occurrences["postSamlConfiguration:::digestMethod"]=0
operation_parameters_maximum_occurrences["postSamlConfiguration:::signatureMethod"]=0
operation_parameters_maximum_occurrences["postSamlConfiguration:::userIntermediatePath"]=0
operation_parameters_maximum_occurrences["postSamlConfiguration:::propertylist"]=0
operation_parameters_maximum_occurrences["postCqActions:::authorizableId"]=0
operation_parameters_maximum_occurrences["postCqActions:::changelog"]=0
operation_parameters_maximum_occurrences["postPackageService:::cmd"]=0
operation_parameters_maximum_occurrences["postPackageServiceJson:::path"]=0
operation_parameters_maximum_occurrences["postPackageServiceJson:::cmd"]=0
operation_parameters_maximum_occurrences["postPackageServiceJson:::groupName"]=0
operation_parameters_maximum_occurrences["postPackageServiceJson:::packageName"]=0
operation_parameters_maximum_occurrences["postPackageServiceJson:::packageVersion"]=0
operation_parameters_maximum_occurrences["postPackageServiceJson:::_charset_"]=0
operation_parameters_maximum_occurrences["postPackageServiceJson:::force"]=0
operation_parameters_maximum_occurrences["postPackageServiceJson:::recursive"]=0
operation_parameters_maximum_occurrences["postPackageServiceJson:::package"]=0
operation_parameters_maximum_occurrences["postPackageUpdate:::groupName"]=0
operation_parameters_maximum_occurrences["postPackageUpdate:::packageName"]=0
operation_parameters_maximum_occurrences["postPackageUpdate:::version"]=0
operation_parameters_maximum_occurrences["postPackageUpdate:::path"]=0
operation_parameters_maximum_occurrences["postPackageUpdate:::filter"]=0
operation_parameters_maximum_occurrences["postPackageUpdate:::_charset_"]=0
operation_parameters_maximum_occurrences["postSetPassword:::old"]=0
operation_parameters_maximum_occurrences["postSetPassword:::plain"]=0
operation_parameters_maximum_occurrences["postSetPassword:::verify"]=0
operation_parameters_maximum_occurrences["getAemHealthCheck:::tags"]=0
operation_parameters_maximum_occurrences["getAemHealthCheck:::combineTagsOr"]=0
operation_parameters_maximum_occurrences["postConfigAemHealthCheckServlet:::bundles.ignored"]=0
operation_parameters_maximum_occurrences["postConfigAemHealthCheckServlet:::bundles.ignored@TypeHint"]=0
operation_parameters_maximum_occurrences["postConfigAemPasswordReset:::pwdreset.authorizables"]=0
operation_parameters_maximum_occurrences["postConfigAemPasswordReset:::pwdreset.authorizables@TypeHint"]=0
operation_parameters_maximum_occurrences["deleteAgent:::runmode"]=0
operation_parameters_maximum_occurrences["deleteAgent:::name"]=0
operation_parameters_maximum_occurrences["deleteNode:::path"]=0
operation_parameters_maximum_occurrences["deleteNode:::name"]=0
operation_parameters_maximum_occurrences["getAgent:::runmode"]=0
operation_parameters_maximum_occurrences["getAgent:::name"]=0
operation_parameters_maximum_occurrences["getAgents:::runmode"]=0
operation_parameters_maximum_occurrences["getAuthorizableKeystore:::intermediatePath"]=0
operation_parameters_maximum_occurrences["getAuthorizableKeystore:::authorizableId"]=0
operation_parameters_maximum_occurrences["getKeystore:::intermediatePath"]=0
operation_parameters_maximum_occurrences["getKeystore:::authorizableId"]=0
operation_parameters_maximum_occurrences["getNode:::path"]=0
operation_parameters_maximum_occurrences["getNode:::name"]=0
operation_parameters_maximum_occurrences["getPackage:::group"]=0
operation_parameters_maximum_occurrences["getPackage:::name"]=0
operation_parameters_maximum_occurrences["getPackage:::version"]=0
operation_parameters_maximum_occurrences["getPackageFilter:::group"]=0
operation_parameters_maximum_occurrences["getPackageFilter:::name"]=0
operation_parameters_maximum_occurrences["getPackageFilter:::version"]=0
operation_parameters_maximum_occurrences["getQuery:::path"]=0
operation_parameters_maximum_occurrences["getQuery:::p.limit"]=0
operation_parameters_maximum_occurrences["getQuery:::1_property"]=0
operation_parameters_maximum_occurrences["getQuery:::1_property.value"]=0
operation_parameters_maximum_occurrences["postAgent:::runmode"]=0
operation_parameters_maximum_occurrences["postAgent:::name"]=0
operation_parameters_maximum_occurrences["postAgent:::jcr:content/cq:distribute"]=0
operation_parameters_maximum_occurrences["postAgent:::jcr:content/cq:distribute@TypeHint"]=0
operation_parameters_maximum_occurrences["postAgent:::jcr:content/cq:name"]=0
operation_parameters_maximum_occurrences["postAgent:::jcr:content/cq:template"]=0
operation_parameters_maximum_occurrences["postAgent:::jcr:content/enabled"]=0
operation_parameters_maximum_occurrences["postAgent:::jcr:content/jcr:description"]=0
operation_parameters_maximum_occurrences["postAgent:::jcr:content/jcr:lastModified"]=0
operation_parameters_maximum_occurrences["postAgent:::jcr:content/jcr:lastModifiedBy"]=0
operation_parameters_maximum_occurrences["postAgent:::jcr:content/jcr:mixinTypes"]=0
operation_parameters_maximum_occurrences["postAgent:::jcr:content/jcr:title"]=0
operation_parameters_maximum_occurrences["postAgent:::jcr:content/logLevel"]=0
operation_parameters_maximum_occurrences["postAgent:::jcr:content/noStatusUpdate"]=0
operation_parameters_maximum_occurrences["postAgent:::jcr:content/noVersioning"]=0
operation_parameters_maximum_occurrences["postAgent:::jcr:content/protocolConnectTimeout"]=0
operation_parameters_maximum_occurrences["postAgent:::jcr:content/protocolHTTPConnectionClosed"]=0
operation_parameters_maximum_occurrences["postAgent:::jcr:content/protocolHTTPExpired"]=0
operation_parameters_maximum_occurrences["postAgent:::jcr:content/protocolHTTPHeaders"]=0
operation_parameters_maximum_occurrences["postAgent:::jcr:content/protocolHTTPHeaders@TypeHint"]=0
operation_parameters_maximum_occurrences["postAgent:::jcr:content/protocolHTTPMethod"]=0
operation_parameters_maximum_occurrences["postAgent:::jcr:content/protocolHTTPSRelaxed"]=0
operation_parameters_maximum_occurrences["postAgent:::jcr:content/protocolInterface"]=0
operation_parameters_maximum_occurrences["postAgent:::jcr:content/protocolSocketTimeout"]=0
operation_parameters_maximum_occurrences["postAgent:::jcr:content/protocolVersion"]=0
operation_parameters_maximum_occurrences["postAgent:::jcr:content/proxyNTLMDomain"]=0
operation_parameters_maximum_occurrences["postAgent:::jcr:content/proxyNTLMHost"]=0
operation_parameters_maximum_occurrences["postAgent:::jcr:content/proxyHost"]=0
operation_parameters_maximum_occurrences["postAgent:::jcr:content/proxyPassword"]=0
operation_parameters_maximum_occurrences["postAgent:::jcr:content/proxyPort"]=0
operation_parameters_maximum_occurrences["postAgent:::jcr:content/proxyUser"]=0
operation_parameters_maximum_occurrences["postAgent:::jcr:content/queueBatchMaxSize"]=0
operation_parameters_maximum_occurrences["postAgent:::jcr:content/queueBatchMode"]=0
operation_parameters_maximum_occurrences["postAgent:::jcr:content/queueBatchWaitTime"]=0
operation_parameters_maximum_occurrences["postAgent:::jcr:content/retryDelay"]=0
operation_parameters_maximum_occurrences["postAgent:::jcr:content/reverseReplication"]=0
operation_parameters_maximum_occurrences["postAgent:::jcr:content/serializationType"]=0
operation_parameters_maximum_occurrences["postAgent:::jcr:content/sling:resourceType"]=0
operation_parameters_maximum_occurrences["postAgent:::jcr:content/ssl"]=0
operation_parameters_maximum_occurrences["postAgent:::jcr:content/transportNTLMDomain"]=0
operation_parameters_maximum_occurrences["postAgent:::jcr:content/transportNTLMHost"]=0
operation_parameters_maximum_occurrences["postAgent:::jcr:content/transportPassword"]=0
operation_parameters_maximum_occurrences["postAgent:::jcr:content/transportUri"]=0
operation_parameters_maximum_occurrences["postAgent:::jcr:content/transportUser"]=0
operation_parameters_maximum_occurrences["postAgent:::jcr:content/triggerDistribute"]=0
operation_parameters_maximum_occurrences["postAgent:::jcr:content/triggerModified"]=0
operation_parameters_maximum_occurrences["postAgent:::jcr:content/triggerOnOffTime"]=0
operation_parameters_maximum_occurrences["postAgent:::jcr:content/triggerReceive"]=0
operation_parameters_maximum_occurrences["postAgent:::jcr:content/triggerSpecific"]=0
operation_parameters_maximum_occurrences["postAgent:::jcr:content/userId"]=0
operation_parameters_maximum_occurrences["postAgent:::jcr:primaryType"]=0
operation_parameters_maximum_occurrences["postAgent::::operation"]=0
operation_parameters_maximum_occurrences["postAuthorizableKeystore:::intermediatePath"]=0
operation_parameters_maximum_occurrences["postAuthorizableKeystore:::authorizableId"]=0
operation_parameters_maximum_occurrences["postAuthorizableKeystore::::operation"]=0
operation_parameters_maximum_occurrences["postAuthorizableKeystore:::currentPassword"]=0
operation_parameters_maximum_occurrences["postAuthorizableKeystore:::newPassword"]=0
operation_parameters_maximum_occurrences["postAuthorizableKeystore:::rePassword"]=0
operation_parameters_maximum_occurrences["postAuthorizableKeystore:::keyPassword"]=0
operation_parameters_maximum_occurrences["postAuthorizableKeystore:::keyStorePass"]=0
operation_parameters_maximum_occurrences["postAuthorizableKeystore:::alias"]=0
operation_parameters_maximum_occurrences["postAuthorizableKeystore:::newAlias"]=0
operation_parameters_maximum_occurrences["postAuthorizableKeystore:::removeAlias"]=0
operation_parameters_maximum_occurrences["postAuthorizableKeystore:::cert-chain"]=0
operation_parameters_maximum_occurrences["postAuthorizableKeystore:::pk"]=0
operation_parameters_maximum_occurrences["postAuthorizableKeystore:::keyStore"]=0
operation_parameters_maximum_occurrences["postAuthorizables:::authorizableId"]=0
operation_parameters_maximum_occurrences["postAuthorizables:::intermediatePath"]=0
operation_parameters_maximum_occurrences["postAuthorizables:::createUser"]=0
operation_parameters_maximum_occurrences["postAuthorizables:::createGroup"]=0
operation_parameters_maximum_occurrences["postAuthorizables:::rep:password"]=0
operation_parameters_maximum_occurrences["postAuthorizables:::profile/givenName"]=0
operation_parameters_maximum_occurrences["postConfigAdobeGraniteSamlAuthenticationHandler:::keyStorePassword"]=0
operation_parameters_maximum_occurrences["postConfigAdobeGraniteSamlAuthenticationHandler:::keyStorePassword@TypeHint"]=0
operation_parameters_maximum_occurrences["postConfigAdobeGraniteSamlAuthenticationHandler:::service.ranking"]=0
operation_parameters_maximum_occurrences["postConfigAdobeGraniteSamlAuthenticationHandler:::service.ranking@TypeHint"]=0
operation_parameters_maximum_occurrences["postConfigAdobeGraniteSamlAuthenticationHandler:::idpHttpRedirect"]=0
operation_parameters_maximum_occurrences["postConfigAdobeGraniteSamlAuthenticationHandler:::idpHttpRedirect@TypeHint"]=0
operation_parameters_maximum_occurrences["postConfigAdobeGraniteSamlAuthenticationHandler:::createUser"]=0
operation_parameters_maximum_occurrences["postConfigAdobeGraniteSamlAuthenticationHandler:::createUser@TypeHint"]=0
operation_parameters_maximum_occurrences["postConfigAdobeGraniteSamlAuthenticationHandler:::defaultRedirectUrl"]=0
operation_parameters_maximum_occurrences["postConfigAdobeGraniteSamlAuthenticationHandler:::defaultRedirectUrl@TypeHint"]=0
operation_parameters_maximum_occurrences["postConfigAdobeGraniteSamlAuthenticationHandler:::userIDAttribute"]=0
operation_parameters_maximum_occurrences["postConfigAdobeGraniteSamlAuthenticationHandler:::userIDAttribute@TypeHint"]=0
operation_parameters_maximum_occurrences["postConfigAdobeGraniteSamlAuthenticationHandler:::defaultGroups"]=0
operation_parameters_maximum_occurrences["postConfigAdobeGraniteSamlAuthenticationHandler:::defaultGroups@TypeHint"]=0
operation_parameters_maximum_occurrences["postConfigAdobeGraniteSamlAuthenticationHandler:::idpCertAlias"]=0
operation_parameters_maximum_occurrences["postConfigAdobeGraniteSamlAuthenticationHandler:::idpCertAlias@TypeHint"]=0
operation_parameters_maximum_occurrences["postConfigAdobeGraniteSamlAuthenticationHandler:::addGroupMemberships"]=0
operation_parameters_maximum_occurrences["postConfigAdobeGraniteSamlAuthenticationHandler:::addGroupMemberships@TypeHint"]=0
operation_parameters_maximum_occurrences["postConfigAdobeGraniteSamlAuthenticationHandler:::path"]=0
operation_parameters_maximum_occurrences["postConfigAdobeGraniteSamlAuthenticationHandler:::path@TypeHint"]=0
operation_parameters_maximum_occurrences["postConfigAdobeGraniteSamlAuthenticationHandler:::synchronizeAttributes"]=0
operation_parameters_maximum_occurrences["postConfigAdobeGraniteSamlAuthenticationHandler:::synchronizeAttributes@TypeHint"]=0
operation_parameters_maximum_occurrences["postConfigAdobeGraniteSamlAuthenticationHandler:::clockTolerance"]=0
operation_parameters_maximum_occurrences["postConfigAdobeGraniteSamlAuthenticationHandler:::clockTolerance@TypeHint"]=0
operation_parameters_maximum_occurrences["postConfigAdobeGraniteSamlAuthenticationHandler:::groupMembershipAttribute"]=0
operation_parameters_maximum_occurrences["postConfigAdobeGraniteSamlAuthenticationHandler:::groupMembershipAttribute@TypeHint"]=0
operation_parameters_maximum_occurrences["postConfigAdobeGraniteSamlAuthenticationHandler:::idpUrl"]=0
operation_parameters_maximum_occurrences["postConfigAdobeGraniteSamlAuthenticationHandler:::idpUrl@TypeHint"]=0
operation_parameters_maximum_occurrences["postConfigAdobeGraniteSamlAuthenticationHandler:::logoutUrl"]=0
operation_parameters_maximum_occurrences["postConfigAdobeGraniteSamlAuthenticationHandler:::logoutUrl@TypeHint"]=0
operation_parameters_maximum_occurrences["postConfigAdobeGraniteSamlAuthenticationHandler:::serviceProviderEntityId"]=0
operation_parameters_maximum_occurrences["postConfigAdobeGraniteSamlAuthenticationHandler:::serviceProviderEntityId@TypeHint"]=0
operation_parameters_maximum_occurrences["postConfigAdobeGraniteSamlAuthenticationHandler:::assertionConsumerServiceURL"]=0
operation_parameters_maximum_occurrences["postConfigAdobeGraniteSamlAuthenticationHandler:::assertionConsumerServiceURL@TypeHint"]=0
operation_parameters_maximum_occurrences["postConfigAdobeGraniteSamlAuthenticationHandler:::handleLogout"]=0
operation_parameters_maximum_occurrences["postConfigAdobeGraniteSamlAuthenticationHandler:::handleLogout@TypeHint"]=0
operation_parameters_maximum_occurrences["postConfigAdobeGraniteSamlAuthenticationHandler:::spPrivateKeyAlias"]=0
operation_parameters_maximum_occurrences["postConfigAdobeGraniteSamlAuthenticationHandler:::spPrivateKeyAlias@TypeHint"]=0
operation_parameters_maximum_occurrences["postConfigAdobeGraniteSamlAuthenticationHandler:::useEncryption"]=0
operation_parameters_maximum_occurrences["postConfigAdobeGraniteSamlAuthenticationHandler:::useEncryption@TypeHint"]=0
operation_parameters_maximum_occurrences["postConfigAdobeGraniteSamlAuthenticationHandler:::nameIdFormat"]=0
operation_parameters_maximum_occurrences["postConfigAdobeGraniteSamlAuthenticationHandler:::nameIdFormat@TypeHint"]=0
operation_parameters_maximum_occurrences["postConfigAdobeGraniteSamlAuthenticationHandler:::digestMethod"]=0
operation_parameters_maximum_occurrences["postConfigAdobeGraniteSamlAuthenticationHandler:::digestMethod@TypeHint"]=0
operation_parameters_maximum_occurrences["postConfigAdobeGraniteSamlAuthenticationHandler:::signatureMethod"]=0
operation_parameters_maximum_occurrences["postConfigAdobeGraniteSamlAuthenticationHandler:::signatureMethod@TypeHint"]=0
operation_parameters_maximum_occurrences["postConfigAdobeGraniteSamlAuthenticationHandler:::userIntermediatePath"]=0
operation_parameters_maximum_occurrences["postConfigAdobeGraniteSamlAuthenticationHandler:::userIntermediatePath@TypeHint"]=0
operation_parameters_maximum_occurrences["postConfigApacheFelixJettyBasedHttpService:::org.apache.felix.https.nio"]=0
operation_parameters_maximum_occurrences["postConfigApacheFelixJettyBasedHttpService:::org.apache.felix.https.nio@TypeHint"]=0
operation_parameters_maximum_occurrences["postConfigApacheFelixJettyBasedHttpService:::org.apache.felix.https.keystore"]=0
operation_parameters_maximum_occurrences["postConfigApacheFelixJettyBasedHttpService:::org.apache.felix.https.keystore@TypeHint"]=0
operation_parameters_maximum_occurrences["postConfigApacheFelixJettyBasedHttpService:::org.apache.felix.https.keystore.password"]=0
operation_parameters_maximum_occurrences["postConfigApacheFelixJettyBasedHttpService:::org.apache.felix.https.keystore.password@TypeHint"]=0
operation_parameters_maximum_occurrences["postConfigApacheFelixJettyBasedHttpService:::org.apache.felix.https.keystore.key"]=0
operation_parameters_maximum_occurrences["postConfigApacheFelixJettyBasedHttpService:::org.apache.felix.https.keystore.key@TypeHint"]=0
operation_parameters_maximum_occurrences["postConfigApacheFelixJettyBasedHttpService:::org.apache.felix.https.keystore.key.password"]=0
operation_parameters_maximum_occurrences["postConfigApacheFelixJettyBasedHttpService:::org.apache.felix.https.keystore.key.password@TypeHint"]=0
operation_parameters_maximum_occurrences["postConfigApacheFelixJettyBasedHttpService:::org.apache.felix.https.truststore"]=0
operation_parameters_maximum_occurrences["postConfigApacheFelixJettyBasedHttpService:::org.apache.felix.https.truststore@TypeHint"]=0
operation_parameters_maximum_occurrences["postConfigApacheFelixJettyBasedHttpService:::org.apache.felix.https.truststore.password"]=0
operation_parameters_maximum_occurrences["postConfigApacheFelixJettyBasedHttpService:::org.apache.felix.https.truststore.password@TypeHint"]=0
operation_parameters_maximum_occurrences["postConfigApacheFelixJettyBasedHttpService:::org.apache.felix.https.clientcertificate"]=0
operation_parameters_maximum_occurrences["postConfigApacheFelixJettyBasedHttpService:::org.apache.felix.https.clientcertificate@TypeHint"]=0
operation_parameters_maximum_occurrences["postConfigApacheFelixJettyBasedHttpService:::org.apache.felix.https.enable"]=0
operation_parameters_maximum_occurrences["postConfigApacheFelixJettyBasedHttpService:::org.apache.felix.https.enable@TypeHint"]=0
operation_parameters_maximum_occurrences["postConfigApacheFelixJettyBasedHttpService:::org.osgi.service.http.port.secure"]=0
operation_parameters_maximum_occurrences["postConfigApacheFelixJettyBasedHttpService:::org.osgi.service.http.port.secure@TypeHint"]=0
operation_parameters_maximum_occurrences["postConfigApacheHttpComponentsProxyConfiguration:::proxy.host"]=0
operation_parameters_maximum_occurrences["postConfigApacheHttpComponentsProxyConfiguration:::proxy.host@TypeHint"]=0
operation_parameters_maximum_occurrences["postConfigApacheHttpComponentsProxyConfiguration:::proxy.port"]=0
operation_parameters_maximum_occurrences["postConfigApacheHttpComponentsProxyConfiguration:::proxy.port@TypeHint"]=0
operation_parameters_maximum_occurrences["postConfigApacheHttpComponentsProxyConfiguration:::proxy.exceptions"]=0
operation_parameters_maximum_occurrences["postConfigApacheHttpComponentsProxyConfiguration:::proxy.exceptions@TypeHint"]=0
operation_parameters_maximum_occurrences["postConfigApacheHttpComponentsProxyConfiguration:::proxy.enabled"]=0
operation_parameters_maximum_occurrences["postConfigApacheHttpComponentsProxyConfiguration:::proxy.enabled@TypeHint"]=0
operation_parameters_maximum_occurrences["postConfigApacheHttpComponentsProxyConfiguration:::proxy.user"]=0
operation_parameters_maximum_occurrences["postConfigApacheHttpComponentsProxyConfiguration:::proxy.user@TypeHint"]=0
operation_parameters_maximum_occurrences["postConfigApacheHttpComponentsProxyConfiguration:::proxy.password"]=0
operation_parameters_maximum_occurrences["postConfigApacheHttpComponentsProxyConfiguration:::proxy.password@TypeHint"]=0
operation_parameters_maximum_occurrences["postConfigApacheSlingDavExServlet:::alias"]=0
operation_parameters_maximum_occurrences["postConfigApacheSlingDavExServlet:::alias@TypeHint"]=0
operation_parameters_maximum_occurrences["postConfigApacheSlingDavExServlet:::dav.create-absolute-uri"]=0
operation_parameters_maximum_occurrences["postConfigApacheSlingDavExServlet:::dav.create-absolute-uri@TypeHint"]=0
operation_parameters_maximum_occurrences["postConfigApacheSlingGetServlet:::json.maximumresults"]=0
operation_parameters_maximum_occurrences["postConfigApacheSlingGetServlet:::json.maximumresults@TypeHint"]=0
operation_parameters_maximum_occurrences["postConfigApacheSlingGetServlet:::enable.html"]=0
operation_parameters_maximum_occurrences["postConfigApacheSlingGetServlet:::enable.html@TypeHint"]=0
operation_parameters_maximum_occurrences["postConfigApacheSlingGetServlet:::enable.txt"]=0
operation_parameters_maximum_occurrences["postConfigApacheSlingGetServlet:::enable.txt@TypeHint"]=0
operation_parameters_maximum_occurrences["postConfigApacheSlingGetServlet:::enable.xml"]=0
operation_parameters_maximum_occurrences["postConfigApacheSlingGetServlet:::enable.xml@TypeHint"]=0
operation_parameters_maximum_occurrences["postConfigApacheSlingReferrerFilter:::allow.empty"]=0
operation_parameters_maximum_occurrences["postConfigApacheSlingReferrerFilter:::allow.empty@TypeHint"]=0
operation_parameters_maximum_occurrences["postConfigApacheSlingReferrerFilter:::allow.hosts"]=0
operation_parameters_maximum_occurrences["postConfigApacheSlingReferrerFilter:::allow.hosts@TypeHint"]=0
operation_parameters_maximum_occurrences["postConfigApacheSlingReferrerFilter:::allow.hosts.regexp"]=0
operation_parameters_maximum_occurrences["postConfigApacheSlingReferrerFilter:::allow.hosts.regexp@TypeHint"]=0
operation_parameters_maximum_occurrences["postConfigApacheSlingReferrerFilter:::filter.methods"]=0
operation_parameters_maximum_occurrences["postConfigApacheSlingReferrerFilter:::filter.methods@TypeHint"]=0
operation_parameters_maximum_occurrences["postNode:::path"]=0
operation_parameters_maximum_occurrences["postNode:::name"]=0
operation_parameters_maximum_occurrences["postNode::::operation"]=0
operation_parameters_maximum_occurrences["postNode:::deleteAuthorizable"]=0
operation_parameters_maximum_occurrences["postNode:::file"]=0
operation_parameters_maximum_occurrences["postNodeRw:::path"]=0
operation_parameters_maximum_occurrences["postNodeRw:::name"]=0
operation_parameters_maximum_occurrences["postNodeRw:::addMembers"]=0
operation_parameters_maximum_occurrences["postPath:::path"]=0
operation_parameters_maximum_occurrences["postPath:::jcr:primaryType"]=0
operation_parameters_maximum_occurrences["postPath::::name"]=0
operation_parameters_maximum_occurrences["postQuery:::path"]=0
operation_parameters_maximum_occurrences["postQuery:::p.limit"]=0
operation_parameters_maximum_occurrences["postQuery:::1_property"]=0
operation_parameters_maximum_occurrences["postQuery:::1_property.value"]=0
operation_parameters_maximum_occurrences["postTreeActivation:::ignoredeactivated"]=0
operation_parameters_maximum_occurrences["postTreeActivation:::onlymodified"]=0
operation_parameters_maximum_occurrences["postTreeActivation:::path"]=0
operation_parameters_maximum_occurrences["postTruststore::::operation"]=0
operation_parameters_maximum_occurrences["postTruststore:::newPassword"]=0
operation_parameters_maximum_occurrences["postTruststore:::rePassword"]=0
operation_parameters_maximum_occurrences["postTruststore:::keyStoreType"]=0
operation_parameters_maximum_occurrences["postTruststore:::removeAlias"]=0
operation_parameters_maximum_occurrences["postTruststore:::certificate"]=0
operation_parameters_maximum_occurrences["postTruststorePKCS12:::truststore.p12"]=0

##
# The type of collection for specifying multiple values for parameter:
# - multi, csv, ssv, tsv
declare -A operation_parameters_collection_type
operation_parameters_collection_type["postBundle:::name"]=""
operation_parameters_collection_type["postBundle:::action"]=""
operation_parameters_collection_type["postJmxRepository:::action"]=""
operation_parameters_collection_type["postSamlConfiguration:::post"]=""
operation_parameters_collection_type["postSamlConfiguration:::apply"]=""
operation_parameters_collection_type["postSamlConfiguration:::delete"]=""
operation_parameters_collection_type["postSamlConfiguration:::action"]=""
operation_parameters_collection_type["postSamlConfiguration:::$location"]=""
operation_parameters_collection_type["postSamlConfiguration:::path"]="multi"
operation_parameters_collection_type["postSamlConfiguration:::service.ranking"]=""
operation_parameters_collection_type["postSamlConfiguration:::idpUrl"]=""
operation_parameters_collection_type["postSamlConfiguration:::idpCertAlias"]=""
operation_parameters_collection_type["postSamlConfiguration:::idpHttpRedirect"]=""
operation_parameters_collection_type["postSamlConfiguration:::serviceProviderEntityId"]=""
operation_parameters_collection_type["postSamlConfiguration:::assertionConsumerServiceURL"]=""
operation_parameters_collection_type["postSamlConfiguration:::spPrivateKeyAlias"]=""
operation_parameters_collection_type["postSamlConfiguration:::keyStorePassword"]=""
operation_parameters_collection_type["postSamlConfiguration:::defaultRedirectUrl"]=""
operation_parameters_collection_type["postSamlConfiguration:::userIDAttribute"]=""
operation_parameters_collection_type["postSamlConfiguration:::useEncryption"]=""
operation_parameters_collection_type["postSamlConfiguration:::createUser"]=""
operation_parameters_collection_type["postSamlConfiguration:::addGroupMemberships"]=""
operation_parameters_collection_type["postSamlConfiguration:::groupMembershipAttribute"]=""
operation_parameters_collection_type["postSamlConfiguration:::defaultGroups"]="multi"
operation_parameters_collection_type["postSamlConfiguration:::nameIdFormat"]=""
operation_parameters_collection_type["postSamlConfiguration:::synchronizeAttributes"]="multi"
operation_parameters_collection_type["postSamlConfiguration:::handleLogout"]=""
operation_parameters_collection_type["postSamlConfiguration:::logoutUrl"]=""
operation_parameters_collection_type["postSamlConfiguration:::clockTolerance"]=""
operation_parameters_collection_type["postSamlConfiguration:::digestMethod"]=""
operation_parameters_collection_type["postSamlConfiguration:::signatureMethod"]=""
operation_parameters_collection_type["postSamlConfiguration:::userIntermediatePath"]=""
operation_parameters_collection_type["postSamlConfiguration:::propertylist"]="csv"
operation_parameters_collection_type["postCqActions:::authorizableId"]=""
operation_parameters_collection_type["postCqActions:::changelog"]=""
operation_parameters_collection_type["postPackageService:::cmd"]=""
operation_parameters_collection_type["postPackageServiceJson:::path"]=""
operation_parameters_collection_type["postPackageServiceJson:::cmd"]=""
operation_parameters_collection_type["postPackageServiceJson:::groupName"]=""
operation_parameters_collection_type["postPackageServiceJson:::packageName"]=""
operation_parameters_collection_type["postPackageServiceJson:::packageVersion"]=""
operation_parameters_collection_type["postPackageServiceJson:::_charset_"]=""
operation_parameters_collection_type["postPackageServiceJson:::force"]=""
operation_parameters_collection_type["postPackageServiceJson:::recursive"]=""
operation_parameters_collection_type["postPackageServiceJson:::package"]=""
operation_parameters_collection_type["postPackageUpdate:::groupName"]=""
operation_parameters_collection_type["postPackageUpdate:::packageName"]=""
operation_parameters_collection_type["postPackageUpdate:::version"]=""
operation_parameters_collection_type["postPackageUpdate:::path"]=""
operation_parameters_collection_type["postPackageUpdate:::filter"]=""
operation_parameters_collection_type["postPackageUpdate:::_charset_"]=""
operation_parameters_collection_type["postSetPassword:::old"]=""
operation_parameters_collection_type["postSetPassword:::plain"]=""
operation_parameters_collection_type["postSetPassword:::verify"]=""
operation_parameters_collection_type["getAemHealthCheck:::tags"]=""
operation_parameters_collection_type["getAemHealthCheck:::combineTagsOr"]=""
operation_parameters_collection_type["postConfigAemHealthCheckServlet:::bundles.ignored"]="multi"
operation_parameters_collection_type["postConfigAemHealthCheckServlet:::bundles.ignored@TypeHint"]=""
operation_parameters_collection_type["postConfigAemPasswordReset:::pwdreset.authorizables"]="multi"
operation_parameters_collection_type["postConfigAemPasswordReset:::pwdreset.authorizables@TypeHint"]=""
operation_parameters_collection_type["deleteAgent:::runmode"]=""
operation_parameters_collection_type["deleteAgent:::name"]=""
operation_parameters_collection_type["deleteNode:::path"]=""
operation_parameters_collection_type["deleteNode:::name"]=""
operation_parameters_collection_type["getAgent:::runmode"]=""
operation_parameters_collection_type["getAgent:::name"]=""
operation_parameters_collection_type["getAgents:::runmode"]=""
operation_parameters_collection_type["getAuthorizableKeystore:::intermediatePath"]=""
operation_parameters_collection_type["getAuthorizableKeystore:::authorizableId"]=""
operation_parameters_collection_type["getKeystore:::intermediatePath"]=""
operation_parameters_collection_type["getKeystore:::authorizableId"]=""
operation_parameters_collection_type["getNode:::path"]=""
operation_parameters_collection_type["getNode:::name"]=""
operation_parameters_collection_type["getPackage:::group"]=""
operation_parameters_collection_type["getPackage:::name"]=""
operation_parameters_collection_type["getPackage:::version"]=""
operation_parameters_collection_type["getPackageFilter:::group"]=""
operation_parameters_collection_type["getPackageFilter:::name"]=""
operation_parameters_collection_type["getPackageFilter:::version"]=""
operation_parameters_collection_type["getQuery:::path"]=""
operation_parameters_collection_type["getQuery:::p.limit"]=""
operation_parameters_collection_type["getQuery:::1_property"]=""
operation_parameters_collection_type["getQuery:::1_property.value"]=""
operation_parameters_collection_type["postAgent:::runmode"]=""
operation_parameters_collection_type["postAgent:::name"]=""
operation_parameters_collection_type["postAgent:::jcr:content/cq:distribute"]=""
operation_parameters_collection_type["postAgent:::jcr:content/cq:distribute@TypeHint"]=""
operation_parameters_collection_type["postAgent:::jcr:content/cq:name"]=""
operation_parameters_collection_type["postAgent:::jcr:content/cq:template"]=""
operation_parameters_collection_type["postAgent:::jcr:content/enabled"]=""
operation_parameters_collection_type["postAgent:::jcr:content/jcr:description"]=""
operation_parameters_collection_type["postAgent:::jcr:content/jcr:lastModified"]=""
operation_parameters_collection_type["postAgent:::jcr:content/jcr:lastModifiedBy"]=""
operation_parameters_collection_type["postAgent:::jcr:content/jcr:mixinTypes"]=""
operation_parameters_collection_type["postAgent:::jcr:content/jcr:title"]=""
operation_parameters_collection_type["postAgent:::jcr:content/logLevel"]=""
operation_parameters_collection_type["postAgent:::jcr:content/noStatusUpdate"]=""
operation_parameters_collection_type["postAgent:::jcr:content/noVersioning"]=""
operation_parameters_collection_type["postAgent:::jcr:content/protocolConnectTimeout"]=""
operation_parameters_collection_type["postAgent:::jcr:content/protocolHTTPConnectionClosed"]=""
operation_parameters_collection_type["postAgent:::jcr:content/protocolHTTPExpired"]=""
operation_parameters_collection_type["postAgent:::jcr:content/protocolHTTPHeaders"]="multi"
operation_parameters_collection_type["postAgent:::jcr:content/protocolHTTPHeaders@TypeHint"]=""
operation_parameters_collection_type["postAgent:::jcr:content/protocolHTTPMethod"]=""
operation_parameters_collection_type["postAgent:::jcr:content/protocolHTTPSRelaxed"]=""
operation_parameters_collection_type["postAgent:::jcr:content/protocolInterface"]=""
operation_parameters_collection_type["postAgent:::jcr:content/protocolSocketTimeout"]=""
operation_parameters_collection_type["postAgent:::jcr:content/protocolVersion"]=""
operation_parameters_collection_type["postAgent:::jcr:content/proxyNTLMDomain"]=""
operation_parameters_collection_type["postAgent:::jcr:content/proxyNTLMHost"]=""
operation_parameters_collection_type["postAgent:::jcr:content/proxyHost"]=""
operation_parameters_collection_type["postAgent:::jcr:content/proxyPassword"]=""
operation_parameters_collection_type["postAgent:::jcr:content/proxyPort"]=""
operation_parameters_collection_type["postAgent:::jcr:content/proxyUser"]=""
operation_parameters_collection_type["postAgent:::jcr:content/queueBatchMaxSize"]=""
operation_parameters_collection_type["postAgent:::jcr:content/queueBatchMode"]=""
operation_parameters_collection_type["postAgent:::jcr:content/queueBatchWaitTime"]=""
operation_parameters_collection_type["postAgent:::jcr:content/retryDelay"]=""
operation_parameters_collection_type["postAgent:::jcr:content/reverseReplication"]=""
operation_parameters_collection_type["postAgent:::jcr:content/serializationType"]=""
operation_parameters_collection_type["postAgent:::jcr:content/sling:resourceType"]=""
operation_parameters_collection_type["postAgent:::jcr:content/ssl"]=""
operation_parameters_collection_type["postAgent:::jcr:content/transportNTLMDomain"]=""
operation_parameters_collection_type["postAgent:::jcr:content/transportNTLMHost"]=""
operation_parameters_collection_type["postAgent:::jcr:content/transportPassword"]=""
operation_parameters_collection_type["postAgent:::jcr:content/transportUri"]=""
operation_parameters_collection_type["postAgent:::jcr:content/transportUser"]=""
operation_parameters_collection_type["postAgent:::jcr:content/triggerDistribute"]=""
operation_parameters_collection_type["postAgent:::jcr:content/triggerModified"]=""
operation_parameters_collection_type["postAgent:::jcr:content/triggerOnOffTime"]=""
operation_parameters_collection_type["postAgent:::jcr:content/triggerReceive"]=""
operation_parameters_collection_type["postAgent:::jcr:content/triggerSpecific"]=""
operation_parameters_collection_type["postAgent:::jcr:content/userId"]=""
operation_parameters_collection_type["postAgent:::jcr:primaryType"]=""
operation_parameters_collection_type["postAgent::::operation"]=""
operation_parameters_collection_type["postAuthorizableKeystore:::intermediatePath"]=""
operation_parameters_collection_type["postAuthorizableKeystore:::authorizableId"]=""
operation_parameters_collection_type["postAuthorizableKeystore::::operation"]=""
operation_parameters_collection_type["postAuthorizableKeystore:::currentPassword"]=""
operation_parameters_collection_type["postAuthorizableKeystore:::newPassword"]=""
operation_parameters_collection_type["postAuthorizableKeystore:::rePassword"]=""
operation_parameters_collection_type["postAuthorizableKeystore:::keyPassword"]=""
operation_parameters_collection_type["postAuthorizableKeystore:::keyStorePass"]=""
operation_parameters_collection_type["postAuthorizableKeystore:::alias"]=""
operation_parameters_collection_type["postAuthorizableKeystore:::newAlias"]=""
operation_parameters_collection_type["postAuthorizableKeystore:::removeAlias"]=""
operation_parameters_collection_type["postAuthorizableKeystore:::cert-chain"]=""
operation_parameters_collection_type["postAuthorizableKeystore:::pk"]=""
operation_parameters_collection_type["postAuthorizableKeystore:::keyStore"]=""
operation_parameters_collection_type["postAuthorizables:::authorizableId"]=""
operation_parameters_collection_type["postAuthorizables:::intermediatePath"]=""
operation_parameters_collection_type["postAuthorizables:::createUser"]=""
operation_parameters_collection_type["postAuthorizables:::createGroup"]=""
operation_parameters_collection_type["postAuthorizables:::rep:password"]=""
operation_parameters_collection_type["postAuthorizables:::profile/givenName"]=""
operation_parameters_collection_type["postConfigAdobeGraniteSamlAuthenticationHandler:::keyStorePassword"]=""
operation_parameters_collection_type["postConfigAdobeGraniteSamlAuthenticationHandler:::keyStorePassword@TypeHint"]=""
operation_parameters_collection_type["postConfigAdobeGraniteSamlAuthenticationHandler:::service.ranking"]=""
operation_parameters_collection_type["postConfigAdobeGraniteSamlAuthenticationHandler:::service.ranking@TypeHint"]=""
operation_parameters_collection_type["postConfigAdobeGraniteSamlAuthenticationHandler:::idpHttpRedirect"]=""
operation_parameters_collection_type["postConfigAdobeGraniteSamlAuthenticationHandler:::idpHttpRedirect@TypeHint"]=""
operation_parameters_collection_type["postConfigAdobeGraniteSamlAuthenticationHandler:::createUser"]=""
operation_parameters_collection_type["postConfigAdobeGraniteSamlAuthenticationHandler:::createUser@TypeHint"]=""
operation_parameters_collection_type["postConfigAdobeGraniteSamlAuthenticationHandler:::defaultRedirectUrl"]=""
operation_parameters_collection_type["postConfigAdobeGraniteSamlAuthenticationHandler:::defaultRedirectUrl@TypeHint"]=""
operation_parameters_collection_type["postConfigAdobeGraniteSamlAuthenticationHandler:::userIDAttribute"]=""
operation_parameters_collection_type["postConfigAdobeGraniteSamlAuthenticationHandler:::userIDAttribute@TypeHint"]=""
operation_parameters_collection_type["postConfigAdobeGraniteSamlAuthenticationHandler:::defaultGroups"]="multi"
operation_parameters_collection_type["postConfigAdobeGraniteSamlAuthenticationHandler:::defaultGroups@TypeHint"]=""
operation_parameters_collection_type["postConfigAdobeGraniteSamlAuthenticationHandler:::idpCertAlias"]=""
operation_parameters_collection_type["postConfigAdobeGraniteSamlAuthenticationHandler:::idpCertAlias@TypeHint"]=""
operation_parameters_collection_type["postConfigAdobeGraniteSamlAuthenticationHandler:::addGroupMemberships"]=""
operation_parameters_collection_type["postConfigAdobeGraniteSamlAuthenticationHandler:::addGroupMemberships@TypeHint"]=""
operation_parameters_collection_type["postConfigAdobeGraniteSamlAuthenticationHandler:::path"]="multi"
operation_parameters_collection_type["postConfigAdobeGraniteSamlAuthenticationHandler:::path@TypeHint"]=""
operation_parameters_collection_type["postConfigAdobeGraniteSamlAuthenticationHandler:::synchronizeAttributes"]="multi"
operation_parameters_collection_type["postConfigAdobeGraniteSamlAuthenticationHandler:::synchronizeAttributes@TypeHint"]=""
operation_parameters_collection_type["postConfigAdobeGraniteSamlAuthenticationHandler:::clockTolerance"]=""
operation_parameters_collection_type["postConfigAdobeGraniteSamlAuthenticationHandler:::clockTolerance@TypeHint"]=""
operation_parameters_collection_type["postConfigAdobeGraniteSamlAuthenticationHandler:::groupMembershipAttribute"]=""
operation_parameters_collection_type["postConfigAdobeGraniteSamlAuthenticationHandler:::groupMembershipAttribute@TypeHint"]=""
operation_parameters_collection_type["postConfigAdobeGraniteSamlAuthenticationHandler:::idpUrl"]=""
operation_parameters_collection_type["postConfigAdobeGraniteSamlAuthenticationHandler:::idpUrl@TypeHint"]=""
operation_parameters_collection_type["postConfigAdobeGraniteSamlAuthenticationHandler:::logoutUrl"]=""
operation_parameters_collection_type["postConfigAdobeGraniteSamlAuthenticationHandler:::logoutUrl@TypeHint"]=""
operation_parameters_collection_type["postConfigAdobeGraniteSamlAuthenticationHandler:::serviceProviderEntityId"]=""
operation_parameters_collection_type["postConfigAdobeGraniteSamlAuthenticationHandler:::serviceProviderEntityId@TypeHint"]=""
operation_parameters_collection_type["postConfigAdobeGraniteSamlAuthenticationHandler:::assertionConsumerServiceURL"]=""
operation_parameters_collection_type["postConfigAdobeGraniteSamlAuthenticationHandler:::assertionConsumerServiceURL@TypeHint"]=""
operation_parameters_collection_type["postConfigAdobeGraniteSamlAuthenticationHandler:::handleLogout"]=""
operation_parameters_collection_type["postConfigAdobeGraniteSamlAuthenticationHandler:::handleLogout@TypeHint"]=""
operation_parameters_collection_type["postConfigAdobeGraniteSamlAuthenticationHandler:::spPrivateKeyAlias"]=""
operation_parameters_collection_type["postConfigAdobeGraniteSamlAuthenticationHandler:::spPrivateKeyAlias@TypeHint"]=""
operation_parameters_collection_type["postConfigAdobeGraniteSamlAuthenticationHandler:::useEncryption"]=""
operation_parameters_collection_type["postConfigAdobeGraniteSamlAuthenticationHandler:::useEncryption@TypeHint"]=""
operation_parameters_collection_type["postConfigAdobeGraniteSamlAuthenticationHandler:::nameIdFormat"]=""
operation_parameters_collection_type["postConfigAdobeGraniteSamlAuthenticationHandler:::nameIdFormat@TypeHint"]=""
operation_parameters_collection_type["postConfigAdobeGraniteSamlAuthenticationHandler:::digestMethod"]=""
operation_parameters_collection_type["postConfigAdobeGraniteSamlAuthenticationHandler:::digestMethod@TypeHint"]=""
operation_parameters_collection_type["postConfigAdobeGraniteSamlAuthenticationHandler:::signatureMethod"]=""
operation_parameters_collection_type["postConfigAdobeGraniteSamlAuthenticationHandler:::signatureMethod@TypeHint"]=""
operation_parameters_collection_type["postConfigAdobeGraniteSamlAuthenticationHandler:::userIntermediatePath"]=""
operation_parameters_collection_type["postConfigAdobeGraniteSamlAuthenticationHandler:::userIntermediatePath@TypeHint"]=""
operation_parameters_collection_type["postConfigApacheFelixJettyBasedHttpService:::org.apache.felix.https.nio"]=""
operation_parameters_collection_type["postConfigApacheFelixJettyBasedHttpService:::org.apache.felix.https.nio@TypeHint"]=""
operation_parameters_collection_type["postConfigApacheFelixJettyBasedHttpService:::org.apache.felix.https.keystore"]=""
operation_parameters_collection_type["postConfigApacheFelixJettyBasedHttpService:::org.apache.felix.https.keystore@TypeHint"]=""
operation_parameters_collection_type["postConfigApacheFelixJettyBasedHttpService:::org.apache.felix.https.keystore.password"]=""
operation_parameters_collection_type["postConfigApacheFelixJettyBasedHttpService:::org.apache.felix.https.keystore.password@TypeHint"]=""
operation_parameters_collection_type["postConfigApacheFelixJettyBasedHttpService:::org.apache.felix.https.keystore.key"]=""
operation_parameters_collection_type["postConfigApacheFelixJettyBasedHttpService:::org.apache.felix.https.keystore.key@TypeHint"]=""
operation_parameters_collection_type["postConfigApacheFelixJettyBasedHttpService:::org.apache.felix.https.keystore.key.password"]=""
operation_parameters_collection_type["postConfigApacheFelixJettyBasedHttpService:::org.apache.felix.https.keystore.key.password@TypeHint"]=""
operation_parameters_collection_type["postConfigApacheFelixJettyBasedHttpService:::org.apache.felix.https.truststore"]=""
operation_parameters_collection_type["postConfigApacheFelixJettyBasedHttpService:::org.apache.felix.https.truststore@TypeHint"]=""
operation_parameters_collection_type["postConfigApacheFelixJettyBasedHttpService:::org.apache.felix.https.truststore.password"]=""
operation_parameters_collection_type["postConfigApacheFelixJettyBasedHttpService:::org.apache.felix.https.truststore.password@TypeHint"]=""
operation_parameters_collection_type["postConfigApacheFelixJettyBasedHttpService:::org.apache.felix.https.clientcertificate"]=""
operation_parameters_collection_type["postConfigApacheFelixJettyBasedHttpService:::org.apache.felix.https.clientcertificate@TypeHint"]=""
operation_parameters_collection_type["postConfigApacheFelixJettyBasedHttpService:::org.apache.felix.https.enable"]=""
operation_parameters_collection_type["postConfigApacheFelixJettyBasedHttpService:::org.apache.felix.https.enable@TypeHint"]=""
operation_parameters_collection_type["postConfigApacheFelixJettyBasedHttpService:::org.osgi.service.http.port.secure"]=""
operation_parameters_collection_type["postConfigApacheFelixJettyBasedHttpService:::org.osgi.service.http.port.secure@TypeHint"]=""
operation_parameters_collection_type["postConfigApacheHttpComponentsProxyConfiguration:::proxy.host"]=""
operation_parameters_collection_type["postConfigApacheHttpComponentsProxyConfiguration:::proxy.host@TypeHint"]=""
operation_parameters_collection_type["postConfigApacheHttpComponentsProxyConfiguration:::proxy.port"]=""
operation_parameters_collection_type["postConfigApacheHttpComponentsProxyConfiguration:::proxy.port@TypeHint"]=""
operation_parameters_collection_type["postConfigApacheHttpComponentsProxyConfiguration:::proxy.exceptions"]="multi"
operation_parameters_collection_type["postConfigApacheHttpComponentsProxyConfiguration:::proxy.exceptions@TypeHint"]=""
operation_parameters_collection_type["postConfigApacheHttpComponentsProxyConfiguration:::proxy.enabled"]=""
operation_parameters_collection_type["postConfigApacheHttpComponentsProxyConfiguration:::proxy.enabled@TypeHint"]=""
operation_parameters_collection_type["postConfigApacheHttpComponentsProxyConfiguration:::proxy.user"]=""
operation_parameters_collection_type["postConfigApacheHttpComponentsProxyConfiguration:::proxy.user@TypeHint"]=""
operation_parameters_collection_type["postConfigApacheHttpComponentsProxyConfiguration:::proxy.password"]=""
operation_parameters_collection_type["postConfigApacheHttpComponentsProxyConfiguration:::proxy.password@TypeHint"]=""
operation_parameters_collection_type["postConfigApacheSlingDavExServlet:::alias"]=""
operation_parameters_collection_type["postConfigApacheSlingDavExServlet:::alias@TypeHint"]=""
operation_parameters_collection_type["postConfigApacheSlingDavExServlet:::dav.create-absolute-uri"]=""
operation_parameters_collection_type["postConfigApacheSlingDavExServlet:::dav.create-absolute-uri@TypeHint"]=""
operation_parameters_collection_type["postConfigApacheSlingGetServlet:::json.maximumresults"]=""
operation_parameters_collection_type["postConfigApacheSlingGetServlet:::json.maximumresults@TypeHint"]=""
operation_parameters_collection_type["postConfigApacheSlingGetServlet:::enable.html"]=""
operation_parameters_collection_type["postConfigApacheSlingGetServlet:::enable.html@TypeHint"]=""
operation_parameters_collection_type["postConfigApacheSlingGetServlet:::enable.txt"]=""
operation_parameters_collection_type["postConfigApacheSlingGetServlet:::enable.txt@TypeHint"]=""
operation_parameters_collection_type["postConfigApacheSlingGetServlet:::enable.xml"]=""
operation_parameters_collection_type["postConfigApacheSlingGetServlet:::enable.xml@TypeHint"]=""
operation_parameters_collection_type["postConfigApacheSlingReferrerFilter:::allow.empty"]=""
operation_parameters_collection_type["postConfigApacheSlingReferrerFilter:::allow.empty@TypeHint"]=""
operation_parameters_collection_type["postConfigApacheSlingReferrerFilter:::allow.hosts"]=""
operation_parameters_collection_type["postConfigApacheSlingReferrerFilter:::allow.hosts@TypeHint"]=""
operation_parameters_collection_type["postConfigApacheSlingReferrerFilter:::allow.hosts.regexp"]=""
operation_parameters_collection_type["postConfigApacheSlingReferrerFilter:::allow.hosts.regexp@TypeHint"]=""
operation_parameters_collection_type["postConfigApacheSlingReferrerFilter:::filter.methods"]=""
operation_parameters_collection_type["postConfigApacheSlingReferrerFilter:::filter.methods@TypeHint"]=""
operation_parameters_collection_type["postNode:::path"]=""
operation_parameters_collection_type["postNode:::name"]=""
operation_parameters_collection_type["postNode::::operation"]=""
operation_parameters_collection_type["postNode:::deleteAuthorizable"]=""
operation_parameters_collection_type["postNode:::file"]=""
operation_parameters_collection_type["postNodeRw:::path"]=""
operation_parameters_collection_type["postNodeRw:::name"]=""
operation_parameters_collection_type["postNodeRw:::addMembers"]=""
operation_parameters_collection_type["postPath:::path"]=""
operation_parameters_collection_type["postPath:::jcr:primaryType"]=""
operation_parameters_collection_type["postPath::::name"]=""
operation_parameters_collection_type["postQuery:::path"]=""
operation_parameters_collection_type["postQuery:::p.limit"]=""
operation_parameters_collection_type["postQuery:::1_property"]=""
operation_parameters_collection_type["postQuery:::1_property.value"]=""
operation_parameters_collection_type["postTreeActivation:::ignoredeactivated"]=""
operation_parameters_collection_type["postTreeActivation:::onlymodified"]=""
operation_parameters_collection_type["postTreeActivation:::path"]=""
operation_parameters_collection_type["postTruststore::::operation"]=""
operation_parameters_collection_type["postTruststore:::newPassword"]=""
operation_parameters_collection_type["postTruststore:::rePassword"]=""
operation_parameters_collection_type["postTruststore:::keyStoreType"]=""
operation_parameters_collection_type["postTruststore:::removeAlias"]=""
operation_parameters_collection_type["postTruststore:::certificate"]=""
operation_parameters_collection_type["postTruststorePKCS12:::truststore.p12"]=""


##
# Map for body parameters passed after operation as
# PARAMETER==STRING_VALUE or PARAMETER:=NUMERIC_VALUE
# These will be mapped to top level json keys ( { "PARAMETER": "VALUE" })
declare -A body_parameters

##
# These arguments will be directly passed to cURL
curl_arguments=""

##
# The host for making the request
host=""

##
# The user credentials for basic authentication
basic_auth_credential=""


##
# If true, the script will only output the actual cURL command that would be
# used
print_curl=false

##
# The operation ID passed on the command line
operation=""

##
# The provided Accept header value
header_accept=""

##
# The provided Content-type header value
header_content_type=""

##
# If there is any body content on the stdin pass it to the body of the request
body_content_temp_file=""

##
# If this variable is set to true, the request will be performed even
# if parameters for required query, header or body values are not provided
# (path parameters are still required).
force=false

##
# Declare some mime types abbreviations for easier content-type and accepts
# headers specification
declare -A mime_type_abbreviations
# text/*
mime_type_abbreviations["text"]="text/plain"
mime_type_abbreviations["html"]="text/html"
mime_type_abbreviations["md"]="text/x-markdown"
mime_type_abbreviations["csv"]="text/csv"
mime_type_abbreviations["css"]="text/css"
mime_type_abbreviations["rtf"]="text/rtf"
# application/*
mime_type_abbreviations["json"]="application/json"
mime_type_abbreviations["xml"]="application/xml"
mime_type_abbreviations["yaml"]="application/yaml"
mime_type_abbreviations["js"]="application/javascript"
mime_type_abbreviations["bin"]="application/octet-stream"
mime_type_abbreviations["rdf"]="application/rdf+xml"
# image/*
mime_type_abbreviations["jpg"]="image/jpeg"
mime_type_abbreviations["png"]="image/png"
mime_type_abbreviations["gif"]="image/gif"
mime_type_abbreviations["bmp"]="image/bmp"
mime_type_abbreviations["tiff"]="image/tiff"


##############################################################################
#
# Escape special URL characters
# Based on table at http://www.w3schools.com/tags/ref_urlencode.asp
#
##############################################################################
url_escape() {
    local raw_url="$1"

    value=$(sed -e 's/ /%20/g' \
       -e 's/!/%21/g' \
       -e 's/"/%22/g' \
       -e 's/#/%23/g' \
       -e 's/\&/%26/g' \
       -e 's/'\''/%28/g' \
       -e 's/(/%28/g' \
       -e 's/)/%29/g' \
       -e 's/:/%3A/g' \
       -e 's/\t/%09/g' \
       -e 's/?/%3F/g' <<<"$raw_url");

    echo "$value"
}

##############################################################################
#
# Lookup the mime type abbreviation in the mime_type_abbreviations array.
# If not present assume the user provided a valid mime type
#
##############################################################################
lookup_mime_type() {
    local mime_type="$1"

    if [[ ${mime_type_abbreviations[$mime_type]} ]]; then
        echo "${mime_type_abbreviations[$mime_type]}"
    else
        echo "$mime_type"
    fi
}

##############################################################################
#
# Converts an associative array into a list of cURL header
# arguments (-H "KEY: VALUE")
#
##############################################################################
header_arguments_to_curl() {
    local headers_curl=""

    for key in "${!header_arguments[@]}"; do
        headers_curl+="-H \"${key}: ${header_arguments[${key}]}\" "
    done
    headers_curl+=" "

    echo "${headers_curl}"
}

##############################################################################
#
# Converts an associative array into a simple JSON with keys as top
# level object attributes
#
# \todo Add conversion of more complex attributes using paths
#
##############################################################################
body_parameters_to_json() {
    local body_json="-d '{"
    local count=0
    for key in "${!body_parameters[@]}"; do
        if [[ $((count++)) -gt 0 ]]; then
            body_json+=", "
        fi
        body_json+="\"${key}\": ${body_parameters[${key}]}"
    done
    body_json+="}'"

    if [[ "${#body_parameters[@]}" -eq 0 ]]; then
        echo ""
    else
        echo "${body_json}"
    fi
}

##############################################################################
#
# Helper method for showing error because for example echo in
# build_request_path() is evaluated as part of command line not printed on
# output. Anyway better idea for resource clean up ;-).
#
##############################################################################
ERROR_MSG=""
function finish {
    if [[ -n "$ERROR_MSG" ]]; then
        echo >&2 "${OFF}${RED}$ERROR_MSG"
        echo >&2 "${OFF}Check usage: '${script_name} --help'"
    fi
}
trap finish EXIT


##############################################################################
#
# Validate and build request path including query parameters
#
##############################################################################
build_request_path() {
    local path_template=$1
    local -n path_params=$2
    local -n query_params=$3


    #
    # Check input parameters count against minimum and maximum required
    #
    if [[ "$force" = false ]]; then
        local was_error=""
        for qparam in "${query_params[@]}" "${path_params[@]}"; do
            local parameter_values
            mapfile -t parameter_values < <(sed -e 's/'":::"'/\n/g' <<<"${operation_parameters[$qparam]}")

            #
            # Check if the number of provided values is not less than minimum required
            #
            if [[ ${#parameter_values[@]} -lt ${operation_parameters_minimum_occurrences["${operation}:::${qparam}"]} ]]; then
                echo "ERROR: Too few values provided for '${qparam}' parameter."
                was_error=true
            fi

            #
            # Check if the number of provided values is not more than maximum
            #
            if [[ ${operation_parameters_maximum_occurrences["${operation}:::${qparam}"]} -gt 0 \
                  && ${#parameter_values[@]} -gt ${operation_parameters_maximum_occurrences["${operation}:::${qparam}"]} ]]; then
                echo "ERROR: Too many values provided for '${qparam}' parameter"
                was_error=true
            fi
        done
        if [[ -n "$was_error" ]]; then
            exit 1
        fi
    fi

    # First replace all path parameters in the path
    for pparam in "${path_params[@]}"; do
        local path_regex="(.*)(\\{$pparam\\})(.*)"
        if [[ $path_template =~ $path_regex ]]; then
            path_template=${BASH_REMATCH[1]}${operation_parameters[$pparam]}${BASH_REMATCH[3]}
        fi
    done

    local query_request_part=""

    local count=0
    for qparam in "${query_params[@]}"; do
        # Get the array of parameter values
        local parameter_value=""
        local parameter_values
        mapfile -t parameter_values < <(sed -e 's/'":::"'/\n/g' <<<"${operation_parameters[$qparam]}")

        if [[ -n "${parameter_values[*]}" ]]; then
            if [[ $((count++)) -gt 0 ]]; then
                query_request_part+="&"
            fi
        fi


        #
        # Append parameters without specific cardinality
        #
        local collection_type="${operation_parameters_collection_type["${operation}:::${qparam}"]}"
        if [[ "${collection_type}" == "" ]]; then
            local vcount=0
            for qvalue in "${parameter_values[@]}"; do
                if [[ $((vcount++)) -gt 0 ]]; then
                    parameter_value+="&"
                fi
                parameter_value+="${qparam}=${qvalue}"
            done
        #
        # Append parameters specified as 'mutli' collections i.e. param=value1&param=value2&...
        #
        elif [[ "${collection_type}" == "multi" ]]; then
            local vcount=0
            for qvalue in "${parameter_values[@]}"; do
                if [[ $((vcount++)) -gt 0 ]]; then
                    parameter_value+="&"
                fi
                parameter_value+="${qparam}=${qvalue}"
            done
        #
        # Append parameters specified as 'csv' collections i.e. param=value1,value2,...
        #
        elif [[ "${collection_type}" == "csv" ]]; then
            parameter_value+="${qparam}="
            local vcount=0
            for qvalue in "${parameter_values[@]}"; do
                if [[ $((vcount++)) -gt 0 ]]; then
                    parameter_value+=","
                fi
                parameter_value+="${qvalue}"
            done
        #
        # Append parameters specified as 'ssv' collections i.e. param="value1 value2 ..."
        #
        elif [[ "${collection_type}" == "ssv" ]]; then
            parameter_value+="${qparam}="
            local vcount=0
            for qvalue in "${parameter_values[@]}"; do
                if [[ $((vcount++)) -gt 0 ]]; then
                    parameter_value+=" "
                fi
                parameter_value+="${qvalue}"
            done
        #
        # Append parameters specified as 'tsv' collections i.e. param="value1\tvalue2\t..."
        #
        elif [[ "${collection_type}" == "tsv" ]]; then
            parameter_value+="${qparam}="
            local vcount=0
            for qvalue in "${parameter_values[@]}"; do
                if [[ $((vcount++)) -gt 0 ]]; then
                    parameter_value+="\\t"
                fi
                parameter_value+="${qvalue}"
            done
        else
            echo "Unsupported collection format \"${collection_type}\""
            exit 1
        fi

        if [[ -n "${parameter_value}" ]]; then
            query_request_part+="${parameter_value}"
        fi

    done


    # Now append query parameters - if any
    if [[ -n "${query_request_part}" ]]; then
        path_template+="?${query_request_part}"
    fi

    echo "$path_template"
}



###############################################################################
#
# Print main help message
#
###############################################################################
print_help() {
cat <<EOF

${BOLD}${WHITE}Adobe Experience Manager (AEM) API command line client (API version 3.2.0-pre.0)${OFF}

${BOLD}${WHITE}Usage${OFF}

  ${GREEN}${script_name}${OFF} [-h|--help] [-V|--version] [--about] [${RED}<curl-options>${OFF}]
           [-ac|--accept ${GREEN}<mime-type>${OFF}] [-ct,--content-type ${GREEN}<mime-type>${OFF}]
           [--host ${CYAN}<url>${OFF}] [--dry-run] [-nc|--no-colors] ${YELLOW}<operation>${OFF} [-h|--help]
           [${BLUE}<headers>${OFF}] [${MAGENTA}<parameters>${OFF}] [${MAGENTA}<body-parameters>${OFF}]

  - ${CYAN}<url>${OFF} - endpoint of the REST service without basepath

  - ${RED}<curl-options>${OFF} - any valid cURL options can be passed before ${YELLOW}<operation>${OFF}
  - ${GREEN}<mime-type>${OFF} - either full mime-type or one of supported abbreviations:
                   (text, html, md, csv, css, rtf, json, xml, yaml, js, bin,
                    rdf, jpg, png, gif, bmp, tiff)
  - ${BLUE}<headers>${OFF} - HTTP headers can be passed in the form ${YELLOW}HEADER${OFF}:${BLUE}VALUE${OFF}
  - ${MAGENTA}<parameters>${OFF} - REST operation parameters can be passed in the following
                   forms:
                   * ${YELLOW}KEY${OFF}=${BLUE}VALUE${OFF} - path or query parameters
  - ${MAGENTA}<body-parameters>${OFF} - simple JSON body content (first level only) can be build
                        using the following arguments:
                        * ${YELLOW}KEY${OFF}==${BLUE}VALUE${OFF} - body parameters which will be added to body
                                      JSON as '{ ..., "${YELLOW}KEY${OFF}": "${BLUE}VALUE${OFF}", ... }'
                        * ${YELLOW}KEY${OFF}:=${BLUE}VALUE${OFF} - body parameters which will be added to body
                                      JSON as '{ ..., "${YELLOW}KEY${OFF}": ${BLUE}VALUE${OFF}, ... }'

EOF
    echo -e "${BOLD}${WHITE}Authentication methods${OFF}"
    echo -e ""
    echo -e "  - ${BLUE}Basic AUTH${OFF} - add '-u <username>:<password>' before ${YELLOW}<operation>${OFF}"
    
    echo ""
    echo -e "${BOLD}${WHITE}Operations (grouped by tags)${OFF}"
    echo ""
    echo -e "${BOLD}${WHITE}[console]${OFF}"
read -r -d '' ops <<EOF
  ${CYAN}getAemProductInfo${OFF}; (AUTH)
  ${CYAN}getConfigMgr${OFF}; (AUTH)
  ${CYAN}postBundle${OFF}; (AUTH)
  ${CYAN}postJmxRepository${OFF}; (AUTH)
  ${CYAN}postSamlConfiguration${OFF}; (AUTH)
EOF
echo "  $ops" | column -t -s ';'
    echo ""
    echo -e "${BOLD}${WHITE}[cq]${OFF}"
read -r -d '' ops <<EOF
  ${CYAN}getLoginPage${OFF};
  ${CYAN}postCqActions${OFF}; (AUTH)
EOF
echo "  $ops" | column -t -s ';'
    echo ""
    echo -e "${BOLD}${WHITE}[crx]${OFF}"
read -r -d '' ops <<EOF
  ${CYAN}getCrxdeStatus${OFF}; (AUTH)
  ${CYAN}getInstallStatus${OFF}; (AUTH)
  ${CYAN}getPackageManagerServlet${OFF}; (AUTH)
  ${CYAN}postPackageService${OFF}; (AUTH)
  ${CYAN}postPackageServiceJson${OFF}; (AUTH)
  ${CYAN}postPackageUpdate${OFF}; (AUTH)
  ${CYAN}postSetPassword${OFF}; (AUTH)
EOF
echo "  $ops" | column -t -s ';'
    echo ""
    echo -e "${BOLD}${WHITE}[custom]${OFF}"
read -r -d '' ops <<EOF
  ${CYAN}getAemHealthCheck${OFF}; (AUTH)
  ${CYAN}postConfigAemHealthCheckServlet${OFF}; (AUTH)
  ${CYAN}postConfigAemPasswordReset${OFF}; (AUTH)
EOF
echo "  $ops" | column -t -s ';'
    echo ""
    echo -e "${BOLD}${WHITE}[sling]${OFF}"
read -r -d '' ops <<EOF
  ${CYAN}deleteAgent${OFF}; (AUTH)
  ${CYAN}deleteNode${OFF}; (AUTH)
  ${CYAN}getAgent${OFF}; (AUTH)
  ${CYAN}getAgents${OFF}; (AUTH)
  ${CYAN}getAuthorizableKeystore${OFF}; (AUTH)
  ${CYAN}getKeystore${OFF}; (AUTH)
  ${CYAN}getNode${OFF}; (AUTH)
  ${CYAN}getPackage${OFF}; (AUTH)
  ${CYAN}getPackageFilter${OFF}; (AUTH)
  ${CYAN}getQuery${OFF}; (AUTH)
  ${CYAN}getTruststore${OFF}; (AUTH)
  ${CYAN}getTruststoreInfo${OFF}; (AUTH)
  ${CYAN}postAgent${OFF}; (AUTH)
  ${CYAN}postAuthorizableKeystore${OFF}; (AUTH)
  ${CYAN}postAuthorizables${OFF}; (AUTH)
  ${CYAN}postConfigAdobeGraniteSamlAuthenticationHandler${OFF}; (AUTH)
  ${CYAN}postConfigApacheFelixJettyBasedHttpService${OFF}; (AUTH)
  ${CYAN}postConfigApacheHttpComponentsProxyConfiguration${OFF}; (AUTH)
  ${CYAN}postConfigApacheSlingDavExServlet${OFF}; (AUTH)
  ${CYAN}postConfigApacheSlingGetServlet${OFF}; (AUTH)
  ${CYAN}postConfigApacheSlingReferrerFilter${OFF}; (AUTH)
  ${CYAN}postNode${OFF}; (AUTH)
  ${CYAN}postNodeRw${OFF}; (AUTH)
  ${CYAN}postPath${OFF}; (AUTH)
  ${CYAN}postQuery${OFF}; (AUTH)
  ${CYAN}postTreeActivation${OFF}; (AUTH)
  ${CYAN}postTruststore${OFF}; (AUTH)
  ${CYAN}postTruststorePKCS12${OFF}; (AUTH)
EOF
echo "  $ops" | column -t -s ';'
    echo ""
    echo -e "${BOLD}${WHITE}Options${OFF}"
    echo -e "  -h,--help\\t\\t\\t\\tPrint this help"
    echo -e "  -V,--version\\t\\t\\t\\tPrint API version"
    echo -e "  --about\\t\\t\\t\\tPrint the information about service"
    echo -e "  --host ${CYAN}<url>${OFF}\\t\\t\\t\\tSpecify the host URL "
echo -e "              \\t\\t\\t\\t(e.g. 'https://localhost')"

    echo -e "  --force\\t\\t\\t\\tForce command invocation in spite of missing"
    echo -e "         \\t\\t\\t\\trequired parameters or wrong content type"
    echo -e "  --dry-run\\t\\t\\t\\tPrint out the cURL command without"
    echo -e "           \\t\\t\\t\\texecuting it"
    echo -e "  -nc,--no-colors\\t\\t\\tEnforce print without colors, otherwise autodected"
    echo -e "  -ac,--accept ${YELLOW}<mime-type>${OFF}\\t\\tSet the 'Accept' header in the request"
    echo -e "  -ct,--content-type ${YELLOW}<mime-type>${OFF}\\tSet the 'Content-type' header in "
    echo -e "                                \\tthe request"
    echo ""
}


##############################################################################
#
# Print REST service description
#
##############################################################################
print_about() {
    echo ""
    echo -e "${BOLD}${WHITE}Adobe Experience Manager (AEM) API command line client (API version 3.2.0-pre.0)${OFF}"
    echo ""
    echo -e "License: "
    echo -e "Contact: opensource@shinesolutions.com"
    echo ""
read -r -d '' appdescription <<EOF

Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API
EOF
echo "$appdescription" | paste -sd' ' | fold -sw 80
}


##############################################################################
#
# Print REST api version
#
##############################################################################
print_version() {
    echo ""
    echo -e "${BOLD}Adobe Experience Manager (AEM) API command line client (API version 3.2.0-pre.0)${OFF}"
    echo ""
}

##############################################################################
#
# Print help for getAemProductInfo operation
#
##############################################################################
print_getAemProductInfo_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getAemProductInfo - ${OFF}${BLUE}(AUTH - BASIC)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Default response${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getConfigMgr operation
#
##############################################################################
print_getConfigMgr_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getConfigMgr - ${OFF}${BLUE}(AUTH - BASIC)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;OK${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=5XX
    echo -e "${result_color_table[${code:0:1}]}  5XX;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for postBundle operation
#
##############################################################################
print_postBundle_help() {
    echo ""
    echo -e "${BOLD}${WHITE}postBundle - ${OFF}${BLUE}(AUTH - BASIC)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}name${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF}${OFF} -  ${YELLOW}Specify as: name=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}action${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF}${OFF} - ${YELLOW} Specify as: action=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Default response${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for postJmxRepository operation
#
##############################################################################
print_postJmxRepository_help() {
    echo ""
    echo -e "${BOLD}${WHITE}postJmxRepository - ${OFF}${BLUE}(AUTH - BASIC)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}action${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF}${OFF} -  ${YELLOW}Specify as: action=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Default response${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for postSamlConfiguration operation
#
##############################################################################
print_postSamlConfiguration_help() {
    echo ""
    echo -e "${BOLD}${WHITE}postSamlConfiguration - ${OFF}${BLUE}(AUTH - BASIC)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}post${OFF} ${BLUE}[boolean]${OFF}${OFF} - ${YELLOW} Specify as: post=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}apply${OFF} ${BLUE}[boolean]${OFF}${OFF} - ${YELLOW} Specify as: apply=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}delete${OFF} ${BLUE}[boolean]${OFF}${OFF} - ${YELLOW} Specify as: delete=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}action${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: action=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}$location${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: $location=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}path${OFF} ${BLUE}[array[string]]${OFF}${OFF} - ${YELLOW} Specify as: path=value1 path=value2 path=...${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}service.ranking${OFF} ${BLUE}[integer]${OFF}${OFF} - ${YELLOW} Specify as: service.ranking=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}idpUrl${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: idpUrl=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}idpCertAlias${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: idpCertAlias=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}idpHttpRedirect${OFF} ${BLUE}[boolean]${OFF}${OFF} - ${YELLOW} Specify as: idpHttpRedirect=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}serviceProviderEntityId${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: serviceProviderEntityId=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}assertionConsumerServiceURL${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: assertionConsumerServiceURL=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}spPrivateKeyAlias${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: spPrivateKeyAlias=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}keyStorePassword${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: keyStorePassword=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}defaultRedirectUrl${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: defaultRedirectUrl=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}userIDAttribute${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: userIDAttribute=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}useEncryption${OFF} ${BLUE}[boolean]${OFF}${OFF} - ${YELLOW} Specify as: useEncryption=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}createUser${OFF} ${BLUE}[boolean]${OFF}${OFF} - ${YELLOW} Specify as: createUser=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}addGroupMemberships${OFF} ${BLUE}[boolean]${OFF}${OFF} - ${YELLOW} Specify as: addGroupMemberships=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}groupMembershipAttribute${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: groupMembershipAttribute=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}defaultGroups${OFF} ${BLUE}[array[string]]${OFF}${OFF} - ${YELLOW} Specify as: defaultGroups=value1 defaultGroups=value2 defaultGroups=...${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}nameIdFormat${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: nameIdFormat=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}synchronizeAttributes${OFF} ${BLUE}[array[string]]${OFF}${OFF} - ${YELLOW} Specify as: synchronizeAttributes=value1 synchronizeAttributes=value2 synchronizeAttributes=...${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}handleLogout${OFF} ${BLUE}[boolean]${OFF}${OFF} - ${YELLOW} Specify as: handleLogout=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}logoutUrl${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: logoutUrl=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}clockTolerance${OFF} ${BLUE}[integer]${OFF}${OFF} - ${YELLOW} Specify as: clockTolerance=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}digestMethod${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: digestMethod=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}signatureMethod${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: signatureMethod=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}userIntermediatePath${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: userIntermediatePath=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}propertylist${OFF} ${BLUE}[array[string]]${OFF}${OFF} - ${YELLOW} Specify as: propertylist="value1,value2,..."${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Retrieved AEM SAML Configuration${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=302
    echo -e "${result_color_table[${code:0:1}]}  302;Default response${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Default response${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getLoginPage operation
#
##############################################################################
print_getLoginPage_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getLoginPage - ${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Default response${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for postCqActions operation
#
##############################################################################
print_postCqActions_help() {
    echo ""
    echo -e "${BOLD}${WHITE}postCqActions - ${OFF}${BLUE}(AUTH - BASIC)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}authorizableId${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF}${OFF} - ${YELLOW} Specify as: authorizableId=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}changelog${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF}${OFF} - ${YELLOW} Specify as: changelog=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Default response${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getCrxdeStatus operation
#
##############################################################################
print_getCrxdeStatus_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getCrxdeStatus - ${OFF}${BLUE}(AUTH - BASIC)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;CRXDE is enabled${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=404
    echo -e "${result_color_table[${code:0:1}]}  404;CRXDE is disabled${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getInstallStatus operation
#
##############################################################################
print_getInstallStatus_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getInstallStatus - ${OFF}${BLUE}(AUTH - BASIC)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Retrieved CRX package manager install status${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Default response${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getPackageManagerServlet operation
#
##############################################################################
print_getPackageManagerServlet_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getPackageManagerServlet - ${OFF}${BLUE}(AUTH - BASIC)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=404
    echo -e "${result_color_table[${code:0:1}]}  404;Package Manager Servlet is disabled${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=405
    echo -e "${result_color_table[${code:0:1}]}  405;Package Manager Servlet is active${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for postPackageService operation
#
##############################################################################
print_postPackageService_help() {
    echo ""
    echo -e "${BOLD}${WHITE}postPackageService - ${OFF}${BLUE}(AUTH - BASIC)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}cmd${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF}${OFF} - ${YELLOW} Specify as: cmd=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Default response${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for postPackageServiceJson operation
#
##############################################################################
print_postPackageServiceJson_help() {
    echo ""
    echo -e "${BOLD}${WHITE}postPackageServiceJson - ${OFF}${BLUE}(AUTH - BASIC)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}path${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF}${OFF} -  ${YELLOW}Specify as: path=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}cmd${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF}${OFF} - ${YELLOW} Specify as: cmd=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}groupName${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: groupName=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}packageName${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: packageName=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}packageVersion${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: packageVersion=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}_charset_${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: _charset_=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}force${OFF} ${BLUE}[boolean]${OFF}${OFF} - ${YELLOW} Specify as: force=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}recursive${OFF} ${BLUE}[boolean]${OFF}${OFF} - ${YELLOW} Specify as: recursive=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Default response${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for postPackageUpdate operation
#
##############################################################################
print_postPackageUpdate_help() {
    echo ""
    echo -e "${BOLD}${WHITE}postPackageUpdate - ${OFF}${BLUE}(AUTH - BASIC)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}groupName${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF}${OFF} - ${YELLOW} Specify as: groupName=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}packageName${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF}${OFF} - ${YELLOW} Specify as: packageName=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}version${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF}${OFF} - ${YELLOW} Specify as: version=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}path${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF}${OFF} - ${YELLOW} Specify as: path=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}filter${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: filter=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}_charset_${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: _charset_=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Default response${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for postSetPassword operation
#
##############################################################################
print_postSetPassword_help() {
    echo ""
    echo -e "${BOLD}${WHITE}postSetPassword - ${OFF}${BLUE}(AUTH - BASIC)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}old${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF}${OFF} - ${YELLOW} Specify as: old=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}plain${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF}${OFF} - ${YELLOW} Specify as: plain=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}verify${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF}${OFF} - ${YELLOW} Specify as: verify=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Default response${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getAemHealthCheck operation
#
##############################################################################
print_getAemHealthCheck_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getAemHealthCheck - ${OFF}${BLUE}(AUTH - BASIC)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}tags${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: tags=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}combineTagsOr${OFF} ${BLUE}[boolean]${OFF}${OFF} - ${YELLOW} Specify as: combineTagsOr=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Default response${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for postConfigAemHealthCheckServlet operation
#
##############################################################################
print_postConfigAemHealthCheckServlet_help() {
    echo ""
    echo -e "${BOLD}${WHITE}postConfigAemHealthCheckServlet - ${OFF}${BLUE}(AUTH - BASIC)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}bundles.ignored${OFF} ${BLUE}[array[string]]${OFF}${OFF} - ${YELLOW} Specify as: bundles.ignored=value1 bundles.ignored=value2 bundles.ignored=...${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}bundles.ignored@TypeHint${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: bundles.ignored@TypeHint=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Default response${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for postConfigAemPasswordReset operation
#
##############################################################################
print_postConfigAemPasswordReset_help() {
    echo ""
    echo -e "${BOLD}${WHITE}postConfigAemPasswordReset - ${OFF}${BLUE}(AUTH - BASIC)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}pwdreset.authorizables${OFF} ${BLUE}[array[string]]${OFF}${OFF} - ${YELLOW} Specify as: pwdreset.authorizables=value1 pwdreset.authorizables=value2 pwdreset.authorizables=...${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}pwdreset.authorizables@TypeHint${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: pwdreset.authorizables@TypeHint=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Default response${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for deleteAgent operation
#
##############################################################################
print_deleteAgent_help() {
    echo ""
    echo -e "${BOLD}${WHITE}deleteAgent - ${OFF}${BLUE}(AUTH - BASIC)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}runmode${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF}${OFF} -  ${YELLOW}Specify as: runmode=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}name${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF}${OFF} -  ${YELLOW}Specify as: name=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Default response${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for deleteNode operation
#
##############################################################################
print_deleteNode_help() {
    echo ""
    echo -e "${BOLD}${WHITE}deleteNode - ${OFF}${BLUE}(AUTH - BASIC)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}path${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF}${OFF} -  ${YELLOW}Specify as: path=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}name${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF}${OFF} -  ${YELLOW}Specify as: name=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Default response${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getAgent operation
#
##############################################################################
print_getAgent_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getAgent - ${OFF}${BLUE}(AUTH - BASIC)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}runmode${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF}${OFF} -  ${YELLOW}Specify as: runmode=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}name${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF}${OFF} -  ${YELLOW}Specify as: name=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Default response${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getAgents operation
#
##############################################################################
print_getAgents_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getAgents - ${OFF}${BLUE}(AUTH - BASIC)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}runmode${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF}${OFF} -  ${YELLOW}Specify as: runmode=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Default response${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getAuthorizableKeystore operation
#
##############################################################################
print_getAuthorizableKeystore_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getAuthorizableKeystore - ${OFF}${BLUE}(AUTH - BASIC)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}intermediatePath${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF}${OFF} -  ${YELLOW}Specify as: intermediatePath=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}authorizableId${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF}${OFF} -  ${YELLOW}Specify as: authorizableId=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Retrieved Authorizable Keystore info${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Default response${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getKeystore operation
#
##############################################################################
print_getKeystore_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getKeystore - ${OFF}${BLUE}(AUTH - BASIC)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}intermediatePath${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF}${OFF} -  ${YELLOW}Specify as: intermediatePath=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}authorizableId${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF}${OFF} -  ${YELLOW}Specify as: authorizableId=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Default response${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getNode operation
#
##############################################################################
print_getNode_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getNode - ${OFF}${BLUE}(AUTH - BASIC)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}path${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF}${OFF} -  ${YELLOW}Specify as: path=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}name${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF}${OFF} -  ${YELLOW}Specify as: name=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Default response${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getPackage operation
#
##############################################################################
print_getPackage_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getPackage - ${OFF}${BLUE}(AUTH - BASIC)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}group${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF}${OFF} -  ${YELLOW}Specify as: group=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}name${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF}${OFF} -  ${YELLOW}Specify as: name=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}version${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF}${OFF} -  ${YELLOW}Specify as: version=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Default response${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getPackageFilter operation
#
##############################################################################
print_getPackageFilter_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getPackageFilter - ${OFF}${BLUE}(AUTH - BASIC)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}group${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF}${OFF} -  ${YELLOW}Specify as: group=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}name${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF}${OFF} -  ${YELLOW}Specify as: name=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}version${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF}${OFF} -  ${YELLOW}Specify as: version=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Default response${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getQuery operation
#
##############################################################################
print_getQuery_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getQuery - ${OFF}${BLUE}(AUTH - BASIC)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}path${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF}${OFF} - ${YELLOW} Specify as: path=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}p.limit${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF}${OFF} - ${YELLOW} Specify as: p.limit=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}1_property${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF}${OFF} - ${YELLOW} Specify as: 1_property=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}1_property.value${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF}${OFF} - ${YELLOW} Specify as: 1_property.value=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Default response${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getTruststore operation
#
##############################################################################
print_getTruststore_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getTruststore - ${OFF}${BLUE}(AUTH - BASIC)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Default response${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getTruststoreInfo operation
#
##############################################################################
print_getTruststoreInfo_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getTruststoreInfo - ${OFF}${BLUE}(AUTH - BASIC)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Retrieved AEM Truststore info${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Default response${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for postAgent operation
#
##############################################################################
print_postAgent_help() {
    echo ""
    echo -e "${BOLD}${WHITE}postAgent - ${OFF}${BLUE}(AUTH - BASIC)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}runmode${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF}${OFF} -  ${YELLOW}Specify as: runmode=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}name${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF}${OFF} -  ${YELLOW}Specify as: name=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}jcr:content/cq:distribute${OFF} ${BLUE}[boolean]${OFF}${OFF} - ${YELLOW} Specify as: jcr:content/cq:distribute=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}jcr:content/cq:distribute@TypeHint${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: jcr:content/cq:distribute@TypeHint=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}jcr:content/cq:name${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: jcr:content/cq:name=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}jcr:content/cq:template${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: jcr:content/cq:template=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}jcr:content/enabled${OFF} ${BLUE}[boolean]${OFF}${OFF} - ${YELLOW} Specify as: jcr:content/enabled=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}jcr:content/jcr:description${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: jcr:content/jcr:description=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}jcr:content/jcr:lastModified${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: jcr:content/jcr:lastModified=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}jcr:content/jcr:lastModifiedBy${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: jcr:content/jcr:lastModifiedBy=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}jcr:content/jcr:mixinTypes${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: jcr:content/jcr:mixinTypes=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}jcr:content/jcr:title${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: jcr:content/jcr:title=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}jcr:content/logLevel${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: jcr:content/logLevel=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}jcr:content/noStatusUpdate${OFF} ${BLUE}[boolean]${OFF}${OFF} - ${YELLOW} Specify as: jcr:content/noStatusUpdate=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}jcr:content/noVersioning${OFF} ${BLUE}[boolean]${OFF}${OFF} - ${YELLOW} Specify as: jcr:content/noVersioning=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}jcr:content/protocolConnectTimeout${OFF} ${BLUE}[integer]${OFF}${OFF} - ${YELLOW} Specify as: jcr:content/protocolConnectTimeout=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}jcr:content/protocolHTTPConnectionClosed${OFF} ${BLUE}[boolean]${OFF}${OFF} - ${YELLOW} Specify as: jcr:content/protocolHTTPConnectionClosed=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}jcr:content/protocolHTTPExpired${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: jcr:content/protocolHTTPExpired=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}jcr:content/protocolHTTPHeaders${OFF} ${BLUE}[array[string]]${OFF}${OFF} - ${YELLOW} Specify as: jcr:content/protocolHTTPHeaders=value1 jcr:content/protocolHTTPHeaders=value2 jcr:content/protocolHTTPHeaders=...${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}jcr:content/protocolHTTPHeaders@TypeHint${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: jcr:content/protocolHTTPHeaders@TypeHint=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}jcr:content/protocolHTTPMethod${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: jcr:content/protocolHTTPMethod=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}jcr:content/protocolHTTPSRelaxed${OFF} ${BLUE}[boolean]${OFF}${OFF} - ${YELLOW} Specify as: jcr:content/protocolHTTPSRelaxed=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}jcr:content/protocolInterface${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: jcr:content/protocolInterface=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}jcr:content/protocolSocketTimeout${OFF} ${BLUE}[integer]${OFF}${OFF} - ${YELLOW} Specify as: jcr:content/protocolSocketTimeout=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}jcr:content/protocolVersion${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: jcr:content/protocolVersion=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}jcr:content/proxyNTLMDomain${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: jcr:content/proxyNTLMDomain=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}jcr:content/proxyNTLMHost${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: jcr:content/proxyNTLMHost=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}jcr:content/proxyHost${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: jcr:content/proxyHost=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}jcr:content/proxyPassword${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: jcr:content/proxyPassword=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}jcr:content/proxyPort${OFF} ${BLUE}[integer]${OFF}${OFF} - ${YELLOW} Specify as: jcr:content/proxyPort=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}jcr:content/proxyUser${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: jcr:content/proxyUser=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}jcr:content/queueBatchMaxSize${OFF} ${BLUE}[integer]${OFF}${OFF} - ${YELLOW} Specify as: jcr:content/queueBatchMaxSize=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}jcr:content/queueBatchMode${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: jcr:content/queueBatchMode=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}jcr:content/queueBatchWaitTime${OFF} ${BLUE}[integer]${OFF}${OFF} - ${YELLOW} Specify as: jcr:content/queueBatchWaitTime=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}jcr:content/retryDelay${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: jcr:content/retryDelay=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}jcr:content/reverseReplication${OFF} ${BLUE}[boolean]${OFF}${OFF} - ${YELLOW} Specify as: jcr:content/reverseReplication=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}jcr:content/serializationType${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: jcr:content/serializationType=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}jcr:content/sling:resourceType${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: jcr:content/sling:resourceType=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}jcr:content/ssl${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: jcr:content/ssl=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}jcr:content/transportNTLMDomain${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: jcr:content/transportNTLMDomain=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}jcr:content/transportNTLMHost${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: jcr:content/transportNTLMHost=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}jcr:content/transportPassword${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: jcr:content/transportPassword=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}jcr:content/transportUri${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: jcr:content/transportUri=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}jcr:content/transportUser${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: jcr:content/transportUser=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}jcr:content/triggerDistribute${OFF} ${BLUE}[boolean]${OFF}${OFF} - ${YELLOW} Specify as: jcr:content/triggerDistribute=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}jcr:content/triggerModified${OFF} ${BLUE}[boolean]${OFF}${OFF} - ${YELLOW} Specify as: jcr:content/triggerModified=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}jcr:content/triggerOnOffTime${OFF} ${BLUE}[boolean]${OFF}${OFF} - ${YELLOW} Specify as: jcr:content/triggerOnOffTime=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}jcr:content/triggerReceive${OFF} ${BLUE}[boolean]${OFF}${OFF} - ${YELLOW} Specify as: jcr:content/triggerReceive=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}jcr:content/triggerSpecific${OFF} ${BLUE}[boolean]${OFF}${OFF} - ${YELLOW} Specify as: jcr:content/triggerSpecific=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}jcr:content/userId${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: jcr:content/userId=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}jcr:primaryType${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: jcr:primaryType=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}:operation${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: :operation=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Default response${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for postAuthorizableKeystore operation
#
##############################################################################
print_postAuthorizableKeystore_help() {
    echo ""
    echo -e "${BOLD}${WHITE}postAuthorizableKeystore - ${OFF}${BLUE}(AUTH - BASIC)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}intermediatePath${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF}${OFF} -  ${YELLOW}Specify as: intermediatePath=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}authorizableId${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF}${OFF} -  ${YELLOW}Specify as: authorizableId=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}:operation${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: :operation=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}currentPassword${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: currentPassword=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}newPassword${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: newPassword=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}rePassword${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: rePassword=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}keyPassword${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: keyPassword=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}keyStorePass${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: keyStorePass=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}alias${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: alias=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}newAlias${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: newAlias=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}removeAlias${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: removeAlias=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Retrieved Authorizable Keystore info${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Default response${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for postAuthorizables operation
#
##############################################################################
print_postAuthorizables_help() {
    echo ""
    echo -e "${BOLD}${WHITE}postAuthorizables - ${OFF}${BLUE}(AUTH - BASIC)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}authorizableId${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF}${OFF} - ${YELLOW} Specify as: authorizableId=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}intermediatePath${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF}${OFF} - ${YELLOW} Specify as: intermediatePath=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}createUser${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: createUser=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}createGroup${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: createGroup=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}rep:password${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: rep:password=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}profile/givenName${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: profile/givenName=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Default response${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for postConfigAdobeGraniteSamlAuthenticationHandler operation
#
##############################################################################
print_postConfigAdobeGraniteSamlAuthenticationHandler_help() {
    echo ""
    echo -e "${BOLD}${WHITE}postConfigAdobeGraniteSamlAuthenticationHandler - ${OFF}${BLUE}(AUTH - BASIC)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}keyStorePassword${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: keyStorePassword=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}keyStorePassword@TypeHint${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: keyStorePassword@TypeHint=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}service.ranking${OFF} ${BLUE}[integer]${OFF}${OFF} - ${YELLOW} Specify as: service.ranking=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}service.ranking@TypeHint${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: service.ranking@TypeHint=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}idpHttpRedirect${OFF} ${BLUE}[boolean]${OFF}${OFF} - ${YELLOW} Specify as: idpHttpRedirect=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}idpHttpRedirect@TypeHint${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: idpHttpRedirect@TypeHint=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}createUser${OFF} ${BLUE}[boolean]${OFF}${OFF} - ${YELLOW} Specify as: createUser=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}createUser@TypeHint${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: createUser@TypeHint=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}defaultRedirectUrl${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: defaultRedirectUrl=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}defaultRedirectUrl@TypeHint${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: defaultRedirectUrl@TypeHint=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}userIDAttribute${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: userIDAttribute=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}userIDAttribute@TypeHint${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: userIDAttribute@TypeHint=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}defaultGroups${OFF} ${BLUE}[array[string]]${OFF}${OFF} - ${YELLOW} Specify as: defaultGroups=value1 defaultGroups=value2 defaultGroups=...${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}defaultGroups@TypeHint${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: defaultGroups@TypeHint=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}idpCertAlias${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: idpCertAlias=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}idpCertAlias@TypeHint${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: idpCertAlias@TypeHint=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}addGroupMemberships${OFF} ${BLUE}[boolean]${OFF}${OFF} - ${YELLOW} Specify as: addGroupMemberships=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}addGroupMemberships@TypeHint${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: addGroupMemberships@TypeHint=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}path${OFF} ${BLUE}[array[string]]${OFF}${OFF} - ${YELLOW} Specify as: path=value1 path=value2 path=...${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}path@TypeHint${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: path@TypeHint=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}synchronizeAttributes${OFF} ${BLUE}[array[string]]${OFF}${OFF} - ${YELLOW} Specify as: synchronizeAttributes=value1 synchronizeAttributes=value2 synchronizeAttributes=...${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}synchronizeAttributes@TypeHint${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: synchronizeAttributes@TypeHint=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}clockTolerance${OFF} ${BLUE}[integer]${OFF}${OFF} - ${YELLOW} Specify as: clockTolerance=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}clockTolerance@TypeHint${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: clockTolerance@TypeHint=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}groupMembershipAttribute${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: groupMembershipAttribute=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}groupMembershipAttribute@TypeHint${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: groupMembershipAttribute@TypeHint=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}idpUrl${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: idpUrl=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}idpUrl@TypeHint${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: idpUrl@TypeHint=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}logoutUrl${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: logoutUrl=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}logoutUrl@TypeHint${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: logoutUrl@TypeHint=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}serviceProviderEntityId${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: serviceProviderEntityId=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}serviceProviderEntityId@TypeHint${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: serviceProviderEntityId@TypeHint=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}assertionConsumerServiceURL${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: assertionConsumerServiceURL=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}assertionConsumerServiceURL@TypeHint${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: assertionConsumerServiceURL@TypeHint=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}handleLogout${OFF} ${BLUE}[boolean]${OFF}${OFF} - ${YELLOW} Specify as: handleLogout=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}handleLogout@TypeHint${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: handleLogout@TypeHint=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}spPrivateKeyAlias${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: spPrivateKeyAlias=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}spPrivateKeyAlias@TypeHint${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: spPrivateKeyAlias@TypeHint=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}useEncryption${OFF} ${BLUE}[boolean]${OFF}${OFF} - ${YELLOW} Specify as: useEncryption=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}useEncryption@TypeHint${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: useEncryption@TypeHint=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}nameIdFormat${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: nameIdFormat=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}nameIdFormat@TypeHint${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: nameIdFormat@TypeHint=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}digestMethod${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: digestMethod=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}digestMethod@TypeHint${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: digestMethod@TypeHint=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}signatureMethod${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: signatureMethod=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}signatureMethod@TypeHint${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: signatureMethod@TypeHint=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}userIntermediatePath${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: userIntermediatePath=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}userIntermediatePath@TypeHint${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: userIntermediatePath@TypeHint=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Default response${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for postConfigApacheFelixJettyBasedHttpService operation
#
##############################################################################
print_postConfigApacheFelixJettyBasedHttpService_help() {
    echo ""
    echo -e "${BOLD}${WHITE}postConfigApacheFelixJettyBasedHttpService - ${OFF}${BLUE}(AUTH - BASIC)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}org.apache.felix.https.nio${OFF} ${BLUE}[boolean]${OFF}${OFF} - ${YELLOW} Specify as: org.apache.felix.https.nio=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}org.apache.felix.https.nio@TypeHint${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: org.apache.felix.https.nio@TypeHint=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}org.apache.felix.https.keystore${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: org.apache.felix.https.keystore=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}org.apache.felix.https.keystore@TypeHint${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: org.apache.felix.https.keystore@TypeHint=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}org.apache.felix.https.keystore.password${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: org.apache.felix.https.keystore.password=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}org.apache.felix.https.keystore.password@TypeHint${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: org.apache.felix.https.keystore.password@TypeHint=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}org.apache.felix.https.keystore.key${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: org.apache.felix.https.keystore.key=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}org.apache.felix.https.keystore.key@TypeHint${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: org.apache.felix.https.keystore.key@TypeHint=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}org.apache.felix.https.keystore.key.password${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: org.apache.felix.https.keystore.key.password=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}org.apache.felix.https.keystore.key.password@TypeHint${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: org.apache.felix.https.keystore.key.password@TypeHint=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}org.apache.felix.https.truststore${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: org.apache.felix.https.truststore=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}org.apache.felix.https.truststore@TypeHint${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: org.apache.felix.https.truststore@TypeHint=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}org.apache.felix.https.truststore.password${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: org.apache.felix.https.truststore.password=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}org.apache.felix.https.truststore.password@TypeHint${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: org.apache.felix.https.truststore.password@TypeHint=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}org.apache.felix.https.clientcertificate${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: org.apache.felix.https.clientcertificate=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}org.apache.felix.https.clientcertificate@TypeHint${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: org.apache.felix.https.clientcertificate@TypeHint=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}org.apache.felix.https.enable${OFF} ${BLUE}[boolean]${OFF}${OFF} - ${YELLOW} Specify as: org.apache.felix.https.enable=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}org.apache.felix.https.enable@TypeHint${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: org.apache.felix.https.enable@TypeHint=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}org.osgi.service.http.port.secure${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: org.osgi.service.http.port.secure=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}org.osgi.service.http.port.secure@TypeHint${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: org.osgi.service.http.port.secure@TypeHint=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Default response${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for postConfigApacheHttpComponentsProxyConfiguration operation
#
##############################################################################
print_postConfigApacheHttpComponentsProxyConfiguration_help() {
    echo ""
    echo -e "${BOLD}${WHITE}postConfigApacheHttpComponentsProxyConfiguration - ${OFF}${BLUE}(AUTH - BASIC)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}proxy.host${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: proxy.host=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}proxy.host@TypeHint${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: proxy.host@TypeHint=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}proxy.port${OFF} ${BLUE}[integer]${OFF}${OFF} - ${YELLOW} Specify as: proxy.port=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}proxy.port@TypeHint${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: proxy.port@TypeHint=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}proxy.exceptions${OFF} ${BLUE}[array[string]]${OFF}${OFF} - ${YELLOW} Specify as: proxy.exceptions=value1 proxy.exceptions=value2 proxy.exceptions=...${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}proxy.exceptions@TypeHint${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: proxy.exceptions@TypeHint=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}proxy.enabled${OFF} ${BLUE}[boolean]${OFF}${OFF} - ${YELLOW} Specify as: proxy.enabled=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}proxy.enabled@TypeHint${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: proxy.enabled@TypeHint=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}proxy.user${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: proxy.user=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}proxy.user@TypeHint${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: proxy.user@TypeHint=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}proxy.password${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: proxy.password=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}proxy.password@TypeHint${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: proxy.password@TypeHint=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Default response${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for postConfigApacheSlingDavExServlet operation
#
##############################################################################
print_postConfigApacheSlingDavExServlet_help() {
    echo ""
    echo -e "${BOLD}${WHITE}postConfigApacheSlingDavExServlet - ${OFF}${BLUE}(AUTH - BASIC)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}alias${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: alias=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}alias@TypeHint${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: alias@TypeHint=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}dav.create-absolute-uri${OFF} ${BLUE}[boolean]${OFF}${OFF} - ${YELLOW} Specify as: dav.create-absolute-uri=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}dav.create-absolute-uri@TypeHint${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: dav.create-absolute-uri@TypeHint=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Default response${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for postConfigApacheSlingGetServlet operation
#
##############################################################################
print_postConfigApacheSlingGetServlet_help() {
    echo ""
    echo -e "${BOLD}${WHITE}postConfigApacheSlingGetServlet - ${OFF}${BLUE}(AUTH - BASIC)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}json.maximumresults${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: json.maximumresults=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}json.maximumresults@TypeHint${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: json.maximumresults@TypeHint=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}enable.html${OFF} ${BLUE}[boolean]${OFF}${OFF} - ${YELLOW} Specify as: enable.html=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}enable.html@TypeHint${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: enable.html@TypeHint=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}enable.txt${OFF} ${BLUE}[boolean]${OFF}${OFF} - ${YELLOW} Specify as: enable.txt=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}enable.txt@TypeHint${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: enable.txt@TypeHint=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}enable.xml${OFF} ${BLUE}[boolean]${OFF}${OFF} - ${YELLOW} Specify as: enable.xml=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}enable.xml@TypeHint${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: enable.xml@TypeHint=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Default response${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for postConfigApacheSlingReferrerFilter operation
#
##############################################################################
print_postConfigApacheSlingReferrerFilter_help() {
    echo ""
    echo -e "${BOLD}${WHITE}postConfigApacheSlingReferrerFilter - ${OFF}${BLUE}(AUTH - BASIC)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}allow.empty${OFF} ${BLUE}[boolean]${OFF}${OFF} - ${YELLOW} Specify as: allow.empty=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}allow.empty@TypeHint${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: allow.empty@TypeHint=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}allow.hosts${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: allow.hosts=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}allow.hosts@TypeHint${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: allow.hosts@TypeHint=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}allow.hosts.regexp${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: allow.hosts.regexp=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}allow.hosts.regexp@TypeHint${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: allow.hosts.regexp@TypeHint=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}filter.methods${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: filter.methods=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}filter.methods@TypeHint${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: filter.methods@TypeHint=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Default response${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for postNode operation
#
##############################################################################
print_postNode_help() {
    echo ""
    echo -e "${BOLD}${WHITE}postNode - ${OFF}${BLUE}(AUTH - BASIC)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}path${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF}${OFF} -  ${YELLOW}Specify as: path=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}name${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF}${OFF} -  ${YELLOW}Specify as: name=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}:operation${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: :operation=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}deleteAuthorizable${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: deleteAuthorizable=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Default response${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for postNodeRw operation
#
##############################################################################
print_postNodeRw_help() {
    echo ""
    echo -e "${BOLD}${WHITE}postNodeRw - ${OFF}${BLUE}(AUTH - BASIC)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}path${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF}${OFF} -  ${YELLOW}Specify as: path=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}name${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF}${OFF} -  ${YELLOW}Specify as: name=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}addMembers${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: addMembers=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Default response${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for postPath operation
#
##############################################################################
print_postPath_help() {
    echo ""
    echo -e "${BOLD}${WHITE}postPath - ${OFF}${BLUE}(AUTH - BASIC)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}path${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF}${OFF} -  ${YELLOW}Specify as: path=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}jcr:primaryType${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF}${OFF} - ${YELLOW} Specify as: jcr:primaryType=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}:name${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF}${OFF} - ${YELLOW} Specify as: :name=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Default response${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for postQuery operation
#
##############################################################################
print_postQuery_help() {
    echo ""
    echo -e "${BOLD}${WHITE}postQuery - ${OFF}${BLUE}(AUTH - BASIC)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}path${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF}${OFF} - ${YELLOW} Specify as: path=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}p.limit${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF}${OFF} - ${YELLOW} Specify as: p.limit=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}1_property${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF}${OFF} - ${YELLOW} Specify as: 1_property=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}1_property.value${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF}${OFF} - ${YELLOW} Specify as: 1_property.value=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Default response${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for postTreeActivation operation
#
##############################################################################
print_postTreeActivation_help() {
    echo ""
    echo -e "${BOLD}${WHITE}postTreeActivation - ${OFF}${BLUE}(AUTH - BASIC)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}ignoredeactivated${OFF} ${BLUE}[boolean]${OFF} ${RED}(required)${OFF}${OFF} - ${YELLOW} Specify as: ignoredeactivated=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}onlymodified${OFF} ${BLUE}[boolean]${OFF} ${RED}(required)${OFF}${OFF} - ${YELLOW} Specify as: onlymodified=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}path${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF}${OFF} - ${YELLOW} Specify as: path=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Default response${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for postTruststore operation
#
##############################################################################
print_postTruststore_help() {
    echo ""
    echo -e "${BOLD}${WHITE}postTruststore - ${OFF}${BLUE}(AUTH - BASIC)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}:operation${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: :operation=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}newPassword${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: newPassword=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}rePassword${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: rePassword=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}keyStoreType${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: keyStoreType=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}removeAlias${OFF} ${BLUE}[string]${OFF}${OFF} - ${YELLOW} Specify as: removeAlias=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Default response${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for postTruststorePKCS12 operation
#
##############################################################################
print_postTruststorePKCS12_help() {
    echo ""
    echo -e "${BOLD}${WHITE}postTruststorePKCS12 - ${OFF}${BLUE}(AUTH - BASIC)${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Default response${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}


##############################################################################
#
# Call getAemProductInfo operation
#
##############################################################################
call_getAemProductInfo() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "//system/console/status-productinfo.json" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call getConfigMgr operation
#
##############################################################################
call_getConfigMgr() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "//system/console/configMgr" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call postBundle operation
#
##############################################################################
call_postBundle() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(name)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(action  )
    local path

    if ! path=$(build_request_path "//system/console/bundles/{name}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call postJmxRepository operation
#
##############################################################################
call_postJmxRepository() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(action)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "//system/console/jmx/com.adobe.granite:type=Repository/op/{action}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call postSamlConfiguration operation
#
##############################################################################
call_postSamlConfiguration() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(post apply delete action $location path service.ranking idpUrl idpCertAlias idpHttpRedirect serviceProviderEntityId assertionConsumerServiceURL spPrivateKeyAlias keyStorePassword defaultRedirectUrl userIDAttribute useEncryption createUser addGroupMemberships groupMembershipAttribute defaultGroups nameIdFormat synchronizeAttributes handleLogout logoutUrl clockTolerance digestMethod signatureMethod userIntermediatePath propertylist  )
    local path

    if ! path=$(build_request_path "//system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call getLoginPage operation
#
##############################################################################
call_getLoginPage() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=()
    local path

    if ! path=$(build_request_path "//libs/granite/core/content/login.html" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call postCqActions operation
#
##############################################################################
call_postCqActions() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(authorizableId changelog  )
    local path

    if ! path=$(build_request_path "//.cqactions.html" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call getCrxdeStatus operation
#
##############################################################################
call_getCrxdeStatus() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "//crx/server/crx.default/jcr:root/.1.json" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call getInstallStatus operation
#
##############################################################################
call_getInstallStatus() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "//crx/packmgr/installstatus.jsp" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call getPackageManagerServlet operation
#
##############################################################################
call_getPackageManagerServlet() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "//crx/packmgr/service/script.html" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call postPackageService operation
#
##############################################################################
call_postPackageService() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(cmd  )
    local path

    if ! path=$(build_request_path "//crx/packmgr/service.jsp" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call postPackageServiceJson operation
#
##############################################################################
call_postPackageServiceJson() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(path)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(cmd groupName packageName packageVersion _charset_ force recursive  )
    local path

    if ! path=$(build_request_path "//crx/packmgr/service/.json/{path}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call postPackageUpdate operation
#
##############################################################################
call_postPackageUpdate() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(groupName packageName version path filter _charset_  )
    local path

    if ! path=$(build_request_path "//crx/packmgr/update.jsp" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call postSetPassword operation
#
##############################################################################
call_postSetPassword() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(old plain verify  )
    local path

    if ! path=$(build_request_path "//crx/explorer/ui/setpassword.jsp" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call getAemHealthCheck operation
#
##############################################################################
call_getAemHealthCheck() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(tags combineTagsOr  )
    local path

    if ! path=$(build_request_path "//system/health" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call postConfigAemHealthCheckServlet operation
#
##############################################################################
call_postConfigAemHealthCheckServlet() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(bundles.ignored bundles.ignored@TypeHint  )
    local path

    if ! path=$(build_request_path "//apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call postConfigAemPasswordReset operation
#
##############################################################################
call_postConfigAemPasswordReset() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(pwdreset.authorizables pwdreset.authorizables@TypeHint  )
    local path

    if ! path=$(build_request_path "//apps/system/config/com.shinesolutions.aem.passwordreset.Activator" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call deleteAgent operation
#
##############################################################################
call_deleteAgent() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(runmode name)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "//etc/replication/agents.{runmode}/{name}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="DELETE"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call deleteNode operation
#
##############################################################################
call_deleteNode() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(path name)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "//{path}/{name}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="DELETE"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call getAgent operation
#
##############################################################################
call_getAgent() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(runmode name)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "//etc/replication/agents.{runmode}/{name}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call getAgents operation
#
##############################################################################
call_getAgents() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(runmode)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "//etc/replication/agents.{runmode}.-1.json" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call getAuthorizableKeystore operation
#
##############################################################################
call_getAuthorizableKeystore() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(intermediatePath authorizableId)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "//{intermediatePath}/{authorizableId}.ks.json" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call getKeystore operation
#
##############################################################################
call_getKeystore() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(intermediatePath authorizableId)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "//{intermediatePath}/{authorizableId}/keystore/store.p12" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call getNode operation
#
##############################################################################
call_getNode() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(path name)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "//{path}/{name}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call getPackage operation
#
##############################################################################
call_getPackage() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(group name version)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "//etc/packages/{group}/{name}-{version}.zip" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call getPackageFilter operation
#
##############################################################################
call_getPackageFilter() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(group name version)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "//etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call getQuery operation
#
##############################################################################
call_getQuery() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(path p.limit 1_property 1_property.value  )
    local path

    if ! path=$(build_request_path "//bin/querybuilder.json" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call getTruststore operation
#
##############################################################################
call_getTruststore() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "//etc/truststore/truststore.p12" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call getTruststoreInfo operation
#
##############################################################################
call_getTruststoreInfo() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "//libs/granite/security/truststore.json" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call postAgent operation
#
##############################################################################
call_postAgent() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(runmode name)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(jcr:content/cq:distribute jcr:content/cq:distribute@TypeHint jcr:content/cq:name jcr:content/cq:template jcr:content/enabled jcr:content/jcr:description jcr:content/jcr:lastModified jcr:content/jcr:lastModifiedBy jcr:content/jcr:mixinTypes jcr:content/jcr:title jcr:content/logLevel jcr:content/noStatusUpdate jcr:content/noVersioning jcr:content/protocolConnectTimeout jcr:content/protocolHTTPConnectionClosed jcr:content/protocolHTTPExpired jcr:content/protocolHTTPHeaders jcr:content/protocolHTTPHeaders@TypeHint jcr:content/protocolHTTPMethod jcr:content/protocolHTTPSRelaxed jcr:content/protocolInterface jcr:content/protocolSocketTimeout jcr:content/protocolVersion jcr:content/proxyNTLMDomain jcr:content/proxyNTLMHost jcr:content/proxyHost jcr:content/proxyPassword jcr:content/proxyPort jcr:content/proxyUser jcr:content/queueBatchMaxSize jcr:content/queueBatchMode jcr:content/queueBatchWaitTime jcr:content/retryDelay jcr:content/reverseReplication jcr:content/serializationType jcr:content/sling:resourceType jcr:content/ssl jcr:content/transportNTLMDomain jcr:content/transportNTLMHost jcr:content/transportPassword jcr:content/transportUri jcr:content/transportUser jcr:content/triggerDistribute jcr:content/triggerModified jcr:content/triggerOnOffTime jcr:content/triggerReceive jcr:content/triggerSpecific jcr:content/userId jcr:primaryType :operation  )
    local path

    if ! path=$(build_request_path "//etc/replication/agents.{runmode}/{name}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call postAuthorizableKeystore operation
#
##############################################################################
call_postAuthorizableKeystore() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(intermediatePath authorizableId)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(:operation currentPassword newPassword rePassword keyPassword keyStorePass alias newAlias removeAlias  )
    local path

    if ! path=$(build_request_path "//{intermediatePath}/{authorizableId}.ks.html" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call postAuthorizables operation
#
##############################################################################
call_postAuthorizables() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(authorizableId intermediatePath createUser createGroup rep:password profile/givenName  )
    local path

    if ! path=$(build_request_path "//libs/granite/security/post/authorizables" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call postConfigAdobeGraniteSamlAuthenticationHandler operation
#
##############################################################################
call_postConfigAdobeGraniteSamlAuthenticationHandler() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(keyStorePassword keyStorePassword@TypeHint service.ranking service.ranking@TypeHint idpHttpRedirect idpHttpRedirect@TypeHint createUser createUser@TypeHint defaultRedirectUrl defaultRedirectUrl@TypeHint userIDAttribute userIDAttribute@TypeHint defaultGroups defaultGroups@TypeHint idpCertAlias idpCertAlias@TypeHint addGroupMemberships addGroupMemberships@TypeHint path path@TypeHint synchronizeAttributes synchronizeAttributes@TypeHint clockTolerance clockTolerance@TypeHint groupMembershipAttribute groupMembershipAttribute@TypeHint idpUrl idpUrl@TypeHint logoutUrl logoutUrl@TypeHint serviceProviderEntityId serviceProviderEntityId@TypeHint assertionConsumerServiceURL assertionConsumerServiceURL@TypeHint handleLogout handleLogout@TypeHint spPrivateKeyAlias spPrivateKeyAlias@TypeHint useEncryption useEncryption@TypeHint nameIdFormat nameIdFormat@TypeHint digestMethod digestMethod@TypeHint signatureMethod signatureMethod@TypeHint userIntermediatePath userIntermediatePath@TypeHint  )
    local path

    if ! path=$(build_request_path "//apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call postConfigApacheFelixJettyBasedHttpService operation
#
##############################################################################
call_postConfigApacheFelixJettyBasedHttpService() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(org.apache.felix.https.nio org.apache.felix.https.nio@TypeHint org.apache.felix.https.keystore org.apache.felix.https.keystore@TypeHint org.apache.felix.https.keystore.password org.apache.felix.https.keystore.password@TypeHint org.apache.felix.https.keystore.key org.apache.felix.https.keystore.key@TypeHint org.apache.felix.https.keystore.key.password org.apache.felix.https.keystore.key.password@TypeHint org.apache.felix.https.truststore org.apache.felix.https.truststore@TypeHint org.apache.felix.https.truststore.password org.apache.felix.https.truststore.password@TypeHint org.apache.felix.https.clientcertificate org.apache.felix.https.clientcertificate@TypeHint org.apache.felix.https.enable org.apache.felix.https.enable@TypeHint org.osgi.service.http.port.secure org.osgi.service.http.port.secure@TypeHint  )
    local path

    if ! path=$(build_request_path "//apps/system/config/org.apache.felix.http" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call postConfigApacheHttpComponentsProxyConfiguration operation
#
##############################################################################
call_postConfigApacheHttpComponentsProxyConfiguration() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(proxy.host proxy.host@TypeHint proxy.port proxy.port@TypeHint proxy.exceptions proxy.exceptions@TypeHint proxy.enabled proxy.enabled@TypeHint proxy.user proxy.user@TypeHint proxy.password proxy.password@TypeHint  )
    local path

    if ! path=$(build_request_path "//apps/system/config/org.apache.http.proxyconfigurator.config" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call postConfigApacheSlingDavExServlet operation
#
##############################################################################
call_postConfigApacheSlingDavExServlet() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(alias alias@TypeHint dav.create-absolute-uri dav.create-absolute-uri@TypeHint  )
    local path

    if ! path=$(build_request_path "//apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call postConfigApacheSlingGetServlet operation
#
##############################################################################
call_postConfigApacheSlingGetServlet() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(json.maximumresults json.maximumresults@TypeHint enable.html enable.html@TypeHint enable.txt enable.txt@TypeHint enable.xml enable.xml@TypeHint  )
    local path

    if ! path=$(build_request_path "//apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call postConfigApacheSlingReferrerFilter operation
#
##############################################################################
call_postConfigApacheSlingReferrerFilter() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(allow.empty allow.empty@TypeHint allow.hosts allow.hosts@TypeHint allow.hosts.regexp allow.hosts.regexp@TypeHint filter.methods filter.methods@TypeHint  )
    local path

    if ! path=$(build_request_path "//apps/system/config/org.apache.sling.security.impl.ReferrerFilter" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call postNode operation
#
##############################################################################
call_postNode() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(path name)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(:operation deleteAuthorizable  )
    local path

    if ! path=$(build_request_path "//{path}/{name}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call postNodeRw operation
#
##############################################################################
call_postNodeRw() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(path name)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(addMembers  )
    local path

    if ! path=$(build_request_path "//{path}/{name}.rw.html" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call postPath operation
#
##############################################################################
call_postPath() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(path)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(jcr:primaryType :name  )
    local path

    if ! path=$(build_request_path "//{path}/" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call postQuery operation
#
##############################################################################
call_postQuery() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(path p.limit 1_property 1_property.value  )
    local path

    if ! path=$(build_request_path "//bin/querybuilder.json" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call postTreeActivation operation
#
##############################################################################
call_postTreeActivation() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(ignoredeactivated onlymodified path  )
    local path

    if ! path=$(build_request_path "//etc/replication/treeactivation.html" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call postTruststore operation
#
##############################################################################
call_postTruststore() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(:operation newPassword rePassword keyStoreType removeAlias  )
    local path

    if ! path=$(build_request_path "//libs/granite/security/post/truststore" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call postTruststorePKCS12 operation
#
##############################################################################
call_postTruststorePKCS12() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "//etc/truststore" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}



##############################################################################
#
# Main
#
##############################################################################


# Check dependencies
type curl >/dev/null 2>&1 || { echo >&2 "ERROR: You do not have 'cURL' installed."; exit 1; }
type sed >/dev/null 2>&1 || { echo >&2 "ERROR: You do not have 'sed' installed."; exit 1; }
type column >/dev/null 2>&1 || { echo >&2 "ERROR: You do not have 'bsdmainutils' installed."; exit 1; }

#
# Process command line
#
# Pass all arguments before 'operation' to cURL except the ones we override
#
take_user=false
take_host=false
take_accept_header=false
take_contenttype_header=false

for key in "$@"; do
# Take the value of -u|--user argument
if [[ "$take_user" = true ]]; then
    basic_auth_credential="$key"
    take_user=false
    continue
fi
# Take the value of --host argument
if [[ "$take_host" = true ]]; then
    host="$key"
    take_host=false
    continue
fi
# Take the value of --accept argument
if [[ "$take_accept_header" = true ]]; then
    header_accept=$(lookup_mime_type "$key")
    take_accept_header=false
    continue
fi
# Take the value of --content-type argument
if [[ "$take_contenttype_header" = true ]]; then
    header_content_type=$(lookup_mime_type "$key")
    take_contenttype_header=false
    continue
fi
case $key in
    -h|--help)
    if [[ "x$operation" == "x" ]]; then
        print_help
        exit 0
    else
        eval "print_${operation}_help"
        exit 0
    fi
    ;;
    -V|--version)
    print_version
    exit 0
    ;;
    --about)
    print_about
    exit 0
    ;;
    -u|--user)
    take_user=true
    ;;
    --host)
    take_host=true
    ;;
    --force)
    force=true
    ;;
    -ac|--accept)
    take_accept_header=true
    ;;
    -ct|--content-type)
    take_contenttype_header=true
    ;;
    --dry-run)
    print_curl=true
    ;;
    -nc|--no-colors)
        RED=""
        GREEN=""
        YELLOW=""
        BLUE=""
        MAGENTA=""
        CYAN=""
        WHITE=""
        BOLD=""
        OFF=""
        result_color_table=( "" "" "" "" "" "" "" )
    ;;
    getAemProductInfo)
    operation="getAemProductInfo"
    ;;
    getConfigMgr)
    operation="getConfigMgr"
    ;;
    postBundle)
    operation="postBundle"
    ;;
    postJmxRepository)
    operation="postJmxRepository"
    ;;
    postSamlConfiguration)
    operation="postSamlConfiguration"
    ;;
    getLoginPage)
    operation="getLoginPage"
    ;;
    postCqActions)
    operation="postCqActions"
    ;;
    getCrxdeStatus)
    operation="getCrxdeStatus"
    ;;
    getInstallStatus)
    operation="getInstallStatus"
    ;;
    getPackageManagerServlet)
    operation="getPackageManagerServlet"
    ;;
    postPackageService)
    operation="postPackageService"
    ;;
    postPackageServiceJson)
    operation="postPackageServiceJson"
    ;;
    postPackageUpdate)
    operation="postPackageUpdate"
    ;;
    postSetPassword)
    operation="postSetPassword"
    ;;
    getAemHealthCheck)
    operation="getAemHealthCheck"
    ;;
    postConfigAemHealthCheckServlet)
    operation="postConfigAemHealthCheckServlet"
    ;;
    postConfigAemPasswordReset)
    operation="postConfigAemPasswordReset"
    ;;
    deleteAgent)
    operation="deleteAgent"
    ;;
    deleteNode)
    operation="deleteNode"
    ;;
    getAgent)
    operation="getAgent"
    ;;
    getAgents)
    operation="getAgents"
    ;;
    getAuthorizableKeystore)
    operation="getAuthorizableKeystore"
    ;;
    getKeystore)
    operation="getKeystore"
    ;;
    getNode)
    operation="getNode"
    ;;
    getPackage)
    operation="getPackage"
    ;;
    getPackageFilter)
    operation="getPackageFilter"
    ;;
    getQuery)
    operation="getQuery"
    ;;
    getTruststore)
    operation="getTruststore"
    ;;
    getTruststoreInfo)
    operation="getTruststoreInfo"
    ;;
    postAgent)
    operation="postAgent"
    ;;
    postAuthorizableKeystore)
    operation="postAuthorizableKeystore"
    ;;
    postAuthorizables)
    operation="postAuthorizables"
    ;;
    postConfigAdobeGraniteSamlAuthenticationHandler)
    operation="postConfigAdobeGraniteSamlAuthenticationHandler"
    ;;
    postConfigApacheFelixJettyBasedHttpService)
    operation="postConfigApacheFelixJettyBasedHttpService"
    ;;
    postConfigApacheHttpComponentsProxyConfiguration)
    operation="postConfigApacheHttpComponentsProxyConfiguration"
    ;;
    postConfigApacheSlingDavExServlet)
    operation="postConfigApacheSlingDavExServlet"
    ;;
    postConfigApacheSlingGetServlet)
    operation="postConfigApacheSlingGetServlet"
    ;;
    postConfigApacheSlingReferrerFilter)
    operation="postConfigApacheSlingReferrerFilter"
    ;;
    postNode)
    operation="postNode"
    ;;
    postNodeRw)
    operation="postNodeRw"
    ;;
    postPath)
    operation="postPath"
    ;;
    postQuery)
    operation="postQuery"
    ;;
    postTreeActivation)
    operation="postTreeActivation"
    ;;
    postTruststore)
    operation="postTruststore"
    ;;
    postTruststorePKCS12)
    operation="postTruststorePKCS12"
    ;;
    *==*)
    # Parse body arguments and convert them into top level
    # JSON properties passed in the body content as strings
    if [[ "$operation" ]]; then
        IFS='==' read -r body_key sep body_value <<< "$key"
        body_parameters[${body_key}]="\"${body_value}\""
    fi
    ;;
    *:=*)
    # Parse body arguments and convert them into top level
    # JSON properties passed in the body content without qoutes
    if [[ "$operation" ]]; then
        # ignore error about 'sep' being unused
        # shellcheck disable=SC2034
        IFS=':=' read -r body_key sep body_value <<< "$key"
        body_parameters[${body_key}]=${body_value}
    fi
    ;;
    +\([^=]\):*)
    # Parse header arguments and convert them into curl
    # only after the operation argument
    if [[ "$operation" ]]; then
        IFS=':' read -r header_name header_value <<< "$key"
        header_arguments[$header_name]=$header_value
    else
        curl_arguments+=" $key"
    fi
    ;;
    -)
    body_content_temp_file=$(mktemp)
    cat - > "$body_content_temp_file"
    ;;
    *=*)
    # Parse operation arguments and convert them into curl
    # only after the operation argument
    if [[ "$operation" ]]; then
        IFS='=' read -r parameter_name parameter_value <<< "$key"
        if [[ -z "${operation_parameters[$parameter_name]+foo}" ]]; then
            operation_parameters[$parameter_name]=$(url_escape "${parameter_value}")
        else
            operation_parameters[$parameter_name]+=":::"$(url_escape "${parameter_value}")
        fi
    else
        curl_arguments+=" $key"
    fi
    ;;
    *)
    # If we are before the operation, treat the arguments as cURL arguments
    if [[ "x$operation" == "x" ]]; then
        # Maintain quotes around cURL arguments if necessary
        space_regexp="[[:space:]]"
        if [[ $key =~ $space_regexp ]]; then
            curl_arguments+=" \"$key\""
        else
            curl_arguments+=" $key"
        fi
    fi
    ;;
esac
done


# Check if user provided host name
if [[ -z "$host" ]]; then
    ERROR_MSG="ERROR: No hostname provided!!! You have to  provide on command line option '--host ...'"
    exit 1
fi

# Check if user specified operation ID
if [[ -z "$operation" ]]; then
    ERROR_MSG="ERROR: No operation specified!!!"
    exit 1
fi


# Run cURL command based on the operation ID
case $operation in
    getAemProductInfo)
    call_getAemProductInfo
    ;;
    getConfigMgr)
    call_getConfigMgr
    ;;
    postBundle)
    call_postBundle
    ;;
    postJmxRepository)
    call_postJmxRepository
    ;;
    postSamlConfiguration)
    call_postSamlConfiguration
    ;;
    getLoginPage)
    call_getLoginPage
    ;;
    postCqActions)
    call_postCqActions
    ;;
    getCrxdeStatus)
    call_getCrxdeStatus
    ;;
    getInstallStatus)
    call_getInstallStatus
    ;;
    getPackageManagerServlet)
    call_getPackageManagerServlet
    ;;
    postPackageService)
    call_postPackageService
    ;;
    postPackageServiceJson)
    call_postPackageServiceJson
    ;;
    postPackageUpdate)
    call_postPackageUpdate
    ;;
    postSetPassword)
    call_postSetPassword
    ;;
    getAemHealthCheck)
    call_getAemHealthCheck
    ;;
    postConfigAemHealthCheckServlet)
    call_postConfigAemHealthCheckServlet
    ;;
    postConfigAemPasswordReset)
    call_postConfigAemPasswordReset
    ;;
    deleteAgent)
    call_deleteAgent
    ;;
    deleteNode)
    call_deleteNode
    ;;
    getAgent)
    call_getAgent
    ;;
    getAgents)
    call_getAgents
    ;;
    getAuthorizableKeystore)
    call_getAuthorizableKeystore
    ;;
    getKeystore)
    call_getKeystore
    ;;
    getNode)
    call_getNode
    ;;
    getPackage)
    call_getPackage
    ;;
    getPackageFilter)
    call_getPackageFilter
    ;;
    getQuery)
    call_getQuery
    ;;
    getTruststore)
    call_getTruststore
    ;;
    getTruststoreInfo)
    call_getTruststoreInfo
    ;;
    postAgent)
    call_postAgent
    ;;
    postAuthorizableKeystore)
    call_postAuthorizableKeystore
    ;;
    postAuthorizables)
    call_postAuthorizables
    ;;
    postConfigAdobeGraniteSamlAuthenticationHandler)
    call_postConfigAdobeGraniteSamlAuthenticationHandler
    ;;
    postConfigApacheFelixJettyBasedHttpService)
    call_postConfigApacheFelixJettyBasedHttpService
    ;;
    postConfigApacheHttpComponentsProxyConfiguration)
    call_postConfigApacheHttpComponentsProxyConfiguration
    ;;
    postConfigApacheSlingDavExServlet)
    call_postConfigApacheSlingDavExServlet
    ;;
    postConfigApacheSlingGetServlet)
    call_postConfigApacheSlingGetServlet
    ;;
    postConfigApacheSlingReferrerFilter)
    call_postConfigApacheSlingReferrerFilter
    ;;
    postNode)
    call_postNode
    ;;
    postNodeRw)
    call_postNodeRw
    ;;
    postPath)
    call_postPath
    ;;
    postQuery)
    call_postQuery
    ;;
    postTreeActivation)
    call_postTreeActivation
    ;;
    postTruststore)
    call_postTruststore
    ;;
    postTruststorePKCS12)
    call_postTruststorePKCS12
    ;;
    *)
    ERROR_MSG="ERROR: Unknown operation: $operation"
    exit 1
esac
