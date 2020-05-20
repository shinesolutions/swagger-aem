# Changelog
All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [3.3.0] - 2020-05-20
### Added
- Add new API resource granite
- Add granite#sslSetup operation

## [3.2.0] - 2020-04-16
### Added
- Add new operation postConfigProperty to sling api

## [3.1.0] - 2019-06-04

### Added
- Add new operation getConfigMgr to console api

### Fixed
- Fix SAML response #41

## [3.0.0] - 2019-05-14

### Changed
- Replace Swaggy-C with OpenAPI Generator for generating client code #31

### Removed
- Client generation support using Swagger-CodeGen jar

## [2.5.0] - 2019-02-01

### Added
- Add crx#getPackageManagerServlet shinesolutions/aem-aws-stack-builder#214

## [2.4.0] - 2019-01-07

### Added
- Add support for bundle Apache HTTP Components Proxy Configuration shinesolutions/aem-aws-stack-builder#235

## [2.3.0] - 2018-12-13

### Added
- Add console#get_aem_product_info #36

## [2.2.0] - 2018-11-10

### Changed
- Update client with API 2.1.0 for SAML support

### Removed
- Remove runmode param on OSGI config operations

## [2.1.0] - 2018-07-26

### Changed
- Update client with postNode operation

## [2.0.0] - 2018-06-23

### Changed
- Update client with API 2.0.0 for AEM 6.4 support

## [1.2.1] - 2018-03-19

### Added
- Add crx#getCrxdeStatus operation

## [1.2.0] - 2017-10-05

### Added
- Add crx#getInstallStatus operation

### Changed
- Upgrade Swagger Codegen to 2.3.1

## [1.1.1] - 2017-06-01

### Changed
- Switch chunked file download support to be generated from Swagger Codegen CLI jar 20170530

## [1.1.0] - 2017-05-26

### Added
- Add chunked file download support #24

### Changed
- Drop Ruby 1.9 support

## [1.0.0] - 2017-05-12

### Added
- Add sling#get_query support
- Add jcrcontentcqdistribute parameter to sling#postAgent

## [0.9.9] - 2017-03-24

### Added
- Add jcrcontenttrigger_distribute, jcrcontenttrigger_modified, and jcrcontentuser_id parameters support to sling#post_agent_with_http_info #18

## [0.9.8] - 2017-03-14

### Added
- Add optional recursive param to package installation

## [0.9.7] - 2017-03-14

### Added
- Add sling get agents support #16

## [0.9.6] - 2017-03-10

### Added
- Add Apache Sling DavEx Servlet OSGI config support #11
- Add Apache Sling Referrer Filter OSGI config support

## [0.9.5] - 2017-03-09

### Added
- Add Apache Sling GET Servlet OSGI config support
- Add jcrcontentreverse_replication parameter support to sling#post_agent_with_http_info #14
- Add operation parameter to postAgent operation #15

### Changed
- Fix org_apache_felix_https_enable parameter type to be boolean

## [0.9.4] - 2017-01-10

### Added
- Add cq get login page support

## [0.9.2] - 2016-11-07

### Added
- Add transport user and transport password optional params to postAgent operation #1

## [0.9.13] - 2017-04-21

### Added
- Add response body to crx#post_set_password_with_http_info data

## [0.9.12] - 2017-04-11

### Added
- Add 22 optional parameters to sling post agents support #22
- Add AEM Health Check Servlet config support

### Changed
- Fix pwdreset_authorizables and bundles_ignored array value passing

## [0.9.11] - 2017-04-04

### Changed
- Rename AEM Password Reset config property to pwdreset_authorizables

## [0.9.10] - 2017-04-03

### Added
- Add custom API with aem-healthcheck and aem-password-reset support #20 #21
- Add jcrcontentrelaxedssl parameter support to sling#post_agent_with_http_info #19

## [0.9.1] - 2016-09-03

### Added
- Initial version
