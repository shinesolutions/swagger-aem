# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## Unreleased
### Added
- Added the possibility to configure the aliasUpdate for a replication flush agent.

## 3.7.0 - 2022-09-07
### Added
- Added tree activation capability for AEM 6.4 & AEM 6.5

### Removed
- Removed tree activation capability for AEM 6.2 & AEM 6.3

## 3.6.0 - 2021-09-03
### Added
- Add deps-python and deps-ruby targets for language specific openapi-generator dependency version
- Add openapi-generator-version target
- Add getBundleInfo operation
- Add ci-python, ci-ruby, generate-python, generate-ruby targets for language specific CI builds
- Add api-release-* GitHub Actions

### Changed
- Upgrade OpenAPI Generator to v5.1.0
- Modify client generation to use openapi-generator-cli jar
- Move node.js build dependencies from Makefile target to package.json
- Set default deps target to download latest openapi-generator

## 3.5.1 - 2021-09-27
### Changed
- Switch api-release-* GH Actions to use ghcr.io GitHub Registry

## 3.4.0 - 2020-09-26
### Changed
- Upgrade OpenAPI Generator to v4.3.1

## 3.3.0 - 2020-05-20
### Added
- Add new API call to configure SSL via Granite

## 3.2.0 - 2020-04-16
### Added
- Add client generation for all languages supported by OpenAPI Generator
- Add new API to configure any configuration node [shinesolutions/ruby_aem#31]

## 3.1.0 - 2019-06-04
### Added
- Added new API Call to retrieve Adobe Experience Manager Web Console
  Configuration

### Changed
- Fix error in SAML property value response [#41]

## 3.0.0 - 2019-05-14
### Changed
- Upgrade spec to use OpenAPI v3 [#31]
- SamlConfigurationProperties schema properties are now Hashes instead of Arrays [#31]

### Removed
- Clients generation using local Swagger CodeGen CLI jar

## 2.4.0 - 2019-02-01
### Added
- Add feature to retrieve CRX Package Manager Servlet service state [shinesolutions/aem-aws-stack-builder#214]

## 2.3.0 - 2019-01-10
### Added
- Add Swagger CodeGen JSON style check to lint target

### Removed
- Remove empty parameters from getAemProductInfo operation

## 2.2.0 - 2018-12-13
### Added
- Add new API Call for getting AEM product informations [#36]

## 2.1.0 - 2018-11-10
### Added
- Add feature to manage AEM Truststore
- Add feature to manage AEM Authorizable Keystore
- Add feature to manage Certificates in AEM Truststore
- Add feature to configure SAML Authentication
- Add AEM client parameter override support to integration tests
- Add postNode operation

### Removed
- Remove runmode parameter on operations which require config path [#32]

## 1.3.0 - 2018-03-19
### Added
- Add getCrxdeStatus operation

## 1.2.1 - 2017-10-05
### Added
- Add string response schema to operations which response body is ignored
- Add string type item to parameters with multi collectionFormat
- Add getInstallStatus operation

## 1.2.0 - 2017-05-12
### Added
- Add getQuery operation
- Add jcr:content/cq:distribute parameter to postAgent operation

## 1.1.14 - 2017-04-21
### Changed
- Set postSetPassword operation's return type to string

## 1.1.13 - 2017-04-11
### Added
- Add postConfigAemHealthCheckServlet operation
- Add missing collectionFormat: multi to pwdreset.authorizables and bundles.ignored parameters
- Add 22 optional parameters to postAgent operation [#22]

### Changed
- Rearrange postAgent parameters in alphabetical order

## 1.1.11 - 2017-04-04
### Changed
- Rename postConfigAemPasswordReset operation's property to pwdreset.authorizables

## 1.1.10 - 2017-04-03
### Added
- Add jcr:content/protocolHTTPSRelaxed parameter to postAgent operation [#19]
- Add postConfigAemPasswordReset operation [#20]
- Add getAemHealthCheck operation [#21]

## 1.1.9 - 2017-03-24
### Added
- Add jcr:content/triggerDistribute, jcr:content/triggerModified, and jcr:content/userId parameters to postAgent operation [#18]

## 1.1.8 - 2017-03-14
### Added
- Add recursive param to postPackageServiceJson operation

## 1.1.7 - 2017-03-14
### Added
- Add getAgents operation [#16]

### Changed
- Set getLoginPage operation's return type to string [#9]

## 1.1.6 - 2017-03-10
### Added
- Add allow.empty, allow.hosts, and allow.hosts.regexp parameters to postConfig operation
- Add alias and dav.create-absolute-uri parameters to postConfig operation [#11]

### Changed
- Split postConfig operation into postConfig<service> operations

## 1.1.5 - 2017-03-09
### Added
- Add json.maximumresults, enable.html, enable.txt, enable.xml parameters to postConfig operation

### Changed
- Fix org.apache.felix.https.enable parameter type to be boolean

## 1.1.4 - 2017-03-07
### Added
- Add :operation query parameter to postAgent operation [#15]

## 1.1.3 - 2017-02-28
### Added
- Add jcr:content/reverseReplication query parameter to postAgent operation [#12]

## 1.1.2 - 2017-01-09
### Added
- Add cq getLoginPage operation

## 1.1.1 - 2017-01-07
### Changed
- Fix missing leading slash on postCqActions

## 1.1.0 - 2016-11-05
### Added
- Add transport user and transport password to /etc/replication/agents.{runmode}/{name} postAgent [#1]

## 1.0.0 - 2016-09-03
### Added
- Initial version
