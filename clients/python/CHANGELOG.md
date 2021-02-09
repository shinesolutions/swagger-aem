# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## 1.2.0 - 2021-02-09
### Changed
- Change get_aem_health_check_with_http_info api call response type param from 'str' string to (str,) tuple
- Change response type deserialization to not enforce json.loads which will result in dict but GET method needs str

## 1.1.0 - 2021-02-08
### Changed
- Replace async with async_req as api_client.call_api keyword argument
- Disable redirect on all urllib3 pool manager's request calls

## 1.0.0 - 2021-02-08
### Changed
- Upgrade to Python 3
- Generate client with OpenAPI Generator 5.0.0

## 0.9.1 - 2020-01-19
### Changed
- Generate client with openapi generator 4.3.1.

## 0.9.0 - 2018-02-23
### Added
- Initial version
