# cpp-httplib-server - C++ Server

## Overview

This server was generated using the [OpenAPI Generator](https://openapi-generator.tech) project.
It uses the [cpp-httplib](https://github.com/yhirose/cpp-httplib) library to implement a lightweight HTTP server
with JSON request/response handling via [nlohmann/json](https://github.com/nlohmann/json).

## Requirements

- C++17 compatible compiler
- CMake (3.14 or higher)
- OpenSSL (for HTTPS support)
- ZLIB (for compression support)

**Note:** The following libraries are automatically downloaded via CMake FetchContent:
- [cpp-httplib](https://github.com/yhirose/cpp-httplib) v0.15.3
- [nlohmann/json](https://github.com/nlohmann/json) v3.11.3

### Platform-Specific Installation

**Linux (Ubuntu/Debian):**
```bash
sudo apt-get update
sudo apt-get install -y libssl-dev zlib1g-dev cmake build-essential
```

**macOS:**
```bash
brew install openssl zlib cmake
```

**Windows:**
```powershell
# Using vcpkg
vcpkg install openssl:x64-windows zlib:x64-windows

# Then configure CMake with vcpkg toolchain:
cmake -B build -DCMAKE_TOOLCHAIN_FILE=[vcpkg_root]/scripts/buildsystems/vcpkg.cmake
```

## Project Structure

```
├── CMakeLists.txt          # Project build configuration
├── README.md               # This file
├── models/                  # Generated model classes
└── api/                    # Generated API handler classes
```

## Building the Project

```bash
mkdir build
cd build
cmake ..
make
```

## Working with Models

### Model Classes

#### models::BundleData

```cpp
// Create a model
auto model = models::BundleData();
model.setId(/* value */);  // Set id
model.setName(/* value */);  // Set name
model.setFragment(/* value */);  // Set fragment
model.setStateRaw(/* value */);  // Set stateRaw
model.setState(/* value */);  // Set state
model.setVersion(/* value */);  // Set version
model.setSymbolicName(/* value */);  // Set symbolicName
model.setCategory(/* value */);  // Set category
model.setProps(/* value */);  // Set props

// Serialize to JSON
nlohmann::json json = models::BundleData::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BundleData::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BundleDataProp

```cpp
// Create a model
auto model = models::BundleDataProp();
model.setKey(/* value */);  // Set key
model.setValue(/* value */);  // Set value

// Serialize to JSON
nlohmann::json json = models::BundleDataProp::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BundleDataProp::fromJson(nlohmann::json::parse(jsonString));
```
#### models::BundleInfo

```cpp
// Create a model
auto model = models::BundleInfo();
model.setStatus(/* value */);  // Set status
model.setS(/* value */);  // Set s
model.setData(/* value */);  // Set data

// Serialize to JSON
nlohmann::json json = models::BundleInfo::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::BundleInfo::fromJson(nlohmann::json::parse(jsonString));
```
#### models::InstallStatus

```cpp
// Create a model
auto model = models::InstallStatus();
model.setStatus(/* value */);  // Set status

// Serialize to JSON
nlohmann::json json = models::InstallStatus::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::InstallStatus::fromJson(nlohmann::json::parse(jsonString));
```
#### models::InstallStatusStatus

```cpp
// Create a model
auto model = models::InstallStatusStatus();
model.setFinished(/* value */);  // Set finished
model.setItemCount(/* value */);  // Set itemCount

// Serialize to JSON
nlohmann::json json = models::InstallStatusStatus::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::InstallStatusStatus::fromJson(nlohmann::json::parse(jsonString));
```
#### models::KeystoreChainItems

```cpp
// Create a model
auto model = models::KeystoreChainItems();
model.setSubject(/* value */);  // Set subject
model.setIssuer(/* value */);  // Set issuer
model.setNotBefore(/* value */);  // Set notBefore
model.setNotAfter(/* value */);  // Set notAfter
model.setSerialNumber(/* value */);  // Set serialNumber

// Serialize to JSON
nlohmann::json json = models::KeystoreChainItems::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::KeystoreChainItems::fromJson(nlohmann::json::parse(jsonString));
```
#### models::KeystoreInfo

```cpp
// Create a model
auto model = models::KeystoreInfo();
model.setAliases(/* value */);  // Set aliases
model.setExists(/* value */);  // Set exists

// Serialize to JSON
nlohmann::json json = models::KeystoreInfo::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::KeystoreInfo::fromJson(nlohmann::json::parse(jsonString));
```
#### models::KeystoreItems

```cpp
// Create a model
auto model = models::KeystoreItems();
model.setAlias(/* value */);  // Set alias
model.setEntryType(/* value */);  // Set entryType
model.setAlgorithm(/* value */);  // Set algorithm
model.setFormat(/* value */);  // Set format
model.setChain(/* value */);  // Set chain

// Serialize to JSON
nlohmann::json json = models::KeystoreItems::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::KeystoreItems::fromJson(nlohmann::json::parse(jsonString));
```
#### models::SamlConfigurationInfo

```cpp
// Create a model
auto model = models::SamlConfigurationInfo();
model.setPid(/* value */);  // Set pid
model.setTitle(/* value */);  // Set title
model.setDescription(/* value */);  // Set description
model.setBundleLocation(/* value */);  // Set bundle_location
model.setServiceLocation(/* value */);  // Set service_location
model.setProperties(/* value */);  // Set properties

// Serialize to JSON
nlohmann::json json = models::SamlConfigurationInfo::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::SamlConfigurationInfo::fromJson(nlohmann::json::parse(jsonString));
```
#### models::SamlConfigurationProperties

```cpp
// Create a model
auto model = models::SamlConfigurationProperties();
model.setPath(/* value */);  // Set path
model.setServiceRanking(/* value */);  // Set service.ranking
model.setIdpUrl(/* value */);  // Set idpUrl
model.setIdpCertAlias(/* value */);  // Set idpCertAlias
model.setIdpHttpRedirect(/* value */);  // Set idpHttpRedirect
model.setServiceProviderEntityId(/* value */);  // Set serviceProviderEntityId
model.setAssertionConsumerServiceURL(/* value */);  // Set assertionConsumerServiceURL
model.setSpPrivateKeyAlias(/* value */);  // Set spPrivateKeyAlias
model.setKeyStorePassword(/* value */);  // Set keyStorePassword
model.setDefaultRedirectUrl(/* value */);  // Set defaultRedirectUrl
model.setUserIDAttribute(/* value */);  // Set userIDAttribute
model.setUseEncryption(/* value */);  // Set useEncryption
model.setCreateUser(/* value */);  // Set createUser
model.setAddGroupMemberships(/* value */);  // Set addGroupMemberships
model.setGroupMembershipAttribute(/* value */);  // Set groupMembershipAttribute
model.setDefaultGroups(/* value */);  // Set defaultGroups
model.setNameIdFormat(/* value */);  // Set nameIdFormat
model.setSynchronizeAttributes(/* value */);  // Set synchronizeAttributes
model.setHandleLogout(/* value */);  // Set handleLogout
model.setLogoutUrl(/* value */);  // Set logoutUrl
model.setClockTolerance(/* value */);  // Set clockTolerance
model.setDigestMethod(/* value */);  // Set digestMethod
model.setSignatureMethod(/* value */);  // Set signatureMethod
model.setUserIntermediatePath(/* value */);  // Set userIntermediatePath

// Serialize to JSON
nlohmann::json json = models::SamlConfigurationProperties::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::SamlConfigurationProperties::fromJson(nlohmann::json::parse(jsonString));
```
#### models::SamlConfigurationPropertyItemsArray

```cpp
// Create a model
auto model = models::SamlConfigurationPropertyItemsArray();
model.setName(/* value */);  // Set name
model.setOptional(/* value */);  // Set optional
model.setIsSet(/* value */);  // Set is_set
model.setType(/* value */);  // Set type
model.setValues(/* value */);  // Set values
model.setDescription(/* value */);  // Set description

// Serialize to JSON
nlohmann::json json = models::SamlConfigurationPropertyItemsArray::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::SamlConfigurationPropertyItemsArray::fromJson(nlohmann::json::parse(jsonString));
```
#### models::SamlConfigurationPropertyItemsBoolean

```cpp
// Create a model
auto model = models::SamlConfigurationPropertyItemsBoolean();
model.setName(/* value */);  // Set name
model.setOptional(/* value */);  // Set optional
model.setIsSet(/* value */);  // Set is_set
model.setType(/* value */);  // Set type
model.setValue(/* value */);  // Set value
model.setDescription(/* value */);  // Set description

// Serialize to JSON
nlohmann::json json = models::SamlConfigurationPropertyItemsBoolean::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::SamlConfigurationPropertyItemsBoolean::fromJson(nlohmann::json::parse(jsonString));
```
#### models::SamlConfigurationPropertyItemsLong

```cpp
// Create a model
auto model = models::SamlConfigurationPropertyItemsLong();
model.setName(/* value */);  // Set name
model.setOptional(/* value */);  // Set optional
model.setIsSet(/* value */);  // Set is_set
model.setType(/* value */);  // Set type
model.setValue(/* value */);  // Set value
model.setDescription(/* value */);  // Set description

// Serialize to JSON
nlohmann::json json = models::SamlConfigurationPropertyItemsLong::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::SamlConfigurationPropertyItemsLong::fromJson(nlohmann::json::parse(jsonString));
```
#### models::SamlConfigurationPropertyItemsString

```cpp
// Create a model
auto model = models::SamlConfigurationPropertyItemsString();
model.setName(/* value */);  // Set name
model.setOptional(/* value */);  // Set optional
model.setIsSet(/* value */);  // Set is_set
model.setType(/* value */);  // Set type
model.setValue(/* value */);  // Set value
model.setDescription(/* value */);  // Set description

// Serialize to JSON
nlohmann::json json = models::SamlConfigurationPropertyItemsString::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::SamlConfigurationPropertyItemsString::fromJson(nlohmann::json::parse(jsonString));
```
#### models::TruststoreInfo

```cpp
// Create a model
auto model = models::TruststoreInfo();
model.setAliases(/* value */);  // Set aliases
model.setExists(/* value */);  // Set exists

// Serialize to JSON
nlohmann::json json = models::TruststoreInfo::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::TruststoreInfo::fromJson(nlohmann::json::parse(jsonString));
```
#### models::TruststoreItems

```cpp
// Create a model
auto model = models::TruststoreItems();
model.setAlias(/* value */);  // Set alias
model.setEntryType(/* value */);  // Set entryType
model.setSubject(/* value */);  // Set subject
model.setIssuer(/* value */);  // Set issuer
model.setNotBefore(/* value */);  // Set notBefore
model.setNotAfter(/* value */);  // Set notAfter
model.setSerialNumber(/* value */);  // Set serialNumber

// Serialize to JSON
nlohmann::json json = models::TruststoreItems::toJson(model);
std::string jsonString = json.dump();

// Deserialize from JSON
auto parsedModel = models::TruststoreItems::fromJson(nlohmann::json::parse(jsonString));
```

## Implementing API Handlers

### API Classes

Each API is generated as an abstract base class with pure virtual methods that you must implement.

#### Console

Create a class that inherits from the generated base class:

```cpp
#include "api/ConsoleApi.h"

class ConsoleImpl : public Api::Console {
public:
    SystemconsolestatusProductinfojsonGetResponse handleGetForSystemconsolestatusProductinfojson() override {

        // Implement your business logic here


        // Or return error response (HTTP HTTP_RESPONSE_CODE_PRIMITIVE_STRING):
        // std::string errorResponse;
        // return errorResponse;
    }

    SystemconsolebundlesnamejsonGetResponse handleGetForSystemconsolebundlesnamejson(const SystemconsolebundlesnamejsonGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_name

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_BUNDLE_INFO):
        models::BundleInfo successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PRIMITIVE_STRING):
        // std::string errorResponse;
        // return errorResponse;
    }

    SystemconsoleconfigMgrGetResponse handleGetForSystemconsoleconfigMgr() override {

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_PRIMITIVE_STRING):
        std::string successResponse;
        // ... populate response ...
        return successResponse;
    }

    void handlePostForSystemconsolebundlesname(const SystemconsolebundlesnamePostRequest& params) override {
        // Access request parameters from params struct
        // Implement your logic here
    }

    void handlePostForSystemconsolejmxcomadobegranitetyperepositoryopaction(const SystemconsolejmxcomadobegranitetyperepositoryopactionPostRequest& params) override {
        // Access request parameters from params struct
        // Implement your logic here
    }

    SystemconsoleconfigMgrcomadobegraniteauthsamlSamlAuthenticationHandlerPostResponse handlePostForSystemconsoleconfigMgrcomadobegraniteauthsamlSamlAuthenticationHandler(const SystemconsoleconfigMgrcomadobegraniteauthsamlSamlAuthenticationHandlerPostRequest& params) override {
        // Access request parameters:
        // Query: params.m_post (optional)
        // Query: params.m_apply (optional)
        // Query: params.m_r_delete (optional)
        // Query: params.m_action (optional)
        // Query: params.m_Dollarlocation (optional)
        // Query: params.m_path (optional)
        // Query: params.m_servicePeriodranking (optional)
        // Query: params.m_idpUrl (optional)
        // Query: params.m_idpCertAlias (optional)
        // Query: params.m_idpHttpRedirect (optional)
        // Query: params.m_serviceProviderEntityId (optional)
        // Query: params.m_assertionConsumerServiceURL (optional)
        // Query: params.m_spPrivateKeyAlias (optional)
        // Query: params.m_keyStorePassword (optional)
        // Query: params.m_defaultRedirectUrl (optional)
        // Query: params.m_userIDAttribute (optional)
        // Query: params.m_useEncryption (optional)
        // Query: params.m_createUser (optional)
        // Query: params.m_addGroupMemberships (optional)
        // Query: params.m_groupMembershipAttribute (optional)
        // Query: params.m_defaultGroups (optional)
        // Query: params.m_nameIdFormat (optional)
        // Query: params.m_synchronizeAttributes (optional)
        // Query: params.m_handleLogout (optional)
        // Query: params.m_logoutUrl (optional)
        // Query: params.m_clockTolerance (optional)
        // Query: params.m_digestMethod (optional)
        // Query: params.m_signatureMethod (optional)
        // Query: params.m_userIntermediatePath (optional)
        // Query: params.m_propertylist (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_SAML_CONFIGURATION_INFO):
        models::SamlConfigurationInfo successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PRIMITIVE_STRING):
        // std::string errorResponse;
        // return errorResponse;
    }

};
```
#### Cq

Create a class that inherits from the generated base class:

```cpp
#include "api/CqApi.h"

class CqImpl : public Api::Cq {
public:
    LibsgranitecorecontentloginhtmlGetResponse handleGetForLibsgranitecorecontentloginhtml() override {

        // Implement your business logic here


        // Or return error response (HTTP HTTP_RESPONSE_CODE_PRIMITIVE_STRING):
        // std::string errorResponse;
        // return errorResponse;
    }

    void handlePostForCqactionshtml(const CqactionshtmlPostRequest& params) override {
        // Access request parameters from params struct
        // Implement your logic here
    }

};
```
#### Crx

Create a class that inherits from the generated base class:

```cpp
#include "api/CrxApi.h"

class CrxImpl : public Api::Crx {
public:
    Crxservercrxdefaultjcrroot1jsonGetResponse handleGetForCrxservercrxdefaultjcrroot1json() override {

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_PRIMITIVE_STRING):
        std::string successResponse;
        // ... populate response ...
        return successResponse;
    }

    CrxpackmgrinstallstatusjspGetResponse handleGetForCrxpackmgrinstallstatusjsp() override {

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_INSTALL_STATUS):
        models::InstallStatus successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PRIMITIVE_STRING):
        // std::string errorResponse;
        // return errorResponse;
    }

    CrxpackmgrservicescripthtmlGetResponse handleGetForCrxpackmgrservicescripthtml() override {

        // Implement your business logic here


        // Or return error response (HTTP HTTP_RESPONSE_CODE_PRIMITIVE_STRING):
        // std::string errorResponse;
        // return errorResponse;
    }

    CrxpackmgrservicejspPostResponse handlePostForCrxpackmgrservicejsp(const CrxpackmgrservicejspPostRequest& params) override {
        // Access request parameters:
        // Query: params.m_cmd

        // Implement your business logic here


        // Or return error response (HTTP HTTP_RESPONSE_CODE_PRIMITIVE_STRING):
        // std::string errorResponse;
        // return errorResponse;
    }

    CrxpackmgrservicejsonpathPostResponse handlePostForCrxpackmgrservicejsonpath(const CrxpackmgrservicejsonpathPostRequest& params) override {
        // Access request parameters:
        // Path: params.m_path
        // Query: params.m_cmd
        // Query: params.m_groupName (optional)
        // Query: params.m_packageName (optional)
        // Query: params.m_packageVersion (optional)
        // Query: params.m_charset (optional)
        // Query: params.m_force (optional)
        // Query: params.m_recursive (optional)

        // Implement your business logic here


        // Or return error response (HTTP HTTP_RESPONSE_CODE_PRIMITIVE_STRING):
        // std::string errorResponse;
        // return errorResponse;
    }

    CrxpackmgrupdatejspPostResponse handlePostForCrxpackmgrupdatejsp(const CrxpackmgrupdatejspPostRequest& params) override {
        // Access request parameters:
        // Query: params.m_groupName
        // Query: params.m_packageName
        // Query: params.m_version
        // Query: params.m_path
        // Query: params.m_filter (optional)
        // Query: params.m_charset (optional)

        // Implement your business logic here


        // Or return error response (HTTP HTTP_RESPONSE_CODE_PRIMITIVE_STRING):
        // std::string errorResponse;
        // return errorResponse;
    }

    CrxexploreruisetpasswordjspPostResponse handlePostForCrxexploreruisetpasswordjsp(const CrxexploreruisetpasswordjspPostRequest& params) override {
        // Access request parameters:
        // Query: params.m_old
        // Query: params.m_plain
        // Query: params.m_verify

        // Implement your business logic here


        // Or return error response (HTTP HTTP_RESPONSE_CODE_PRIMITIVE_STRING):
        // std::string errorResponse;
        // return errorResponse;
    }

};
```
#### Custom

Create a class that inherits from the generated base class:

```cpp
#include "api/CustomApi.h"

class CustomImpl : public Api::Custom {
public:
    SystemhealthGetResponse handleGetForSystemhealth(const SystemhealthGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_tags (optional)
        // Query: params.m_combineTagsOr (optional)

        // Implement your business logic here


        // Or return error response (HTTP HTTP_RESPONSE_CODE_PRIMITIVE_STRING):
        // std::string errorResponse;
        // return errorResponse;
    }

    void handlePostForAppssystemconfigcomshinesolutionshealthcheckhcimplactiveBundleHealthCheck(const AppssystemconfigcomshinesolutionshealthcheckhcimplactiveBundleHealthCheckPostRequest& params) override {
        // Access request parameters from params struct
        // Implement your logic here
    }

    void handlePostForAppssystemconfigcomshinesolutionsaempasswordresetactivator(const AppssystemconfigcomshinesolutionsaempasswordresetactivatorPostRequest& params) override {
        // Access request parameters from params struct
        // Implement your logic here
    }

};
```
#### Granite

Create a class that inherits from the generated base class:

```cpp
#include "api/GraniteApi.h"

class GraniteImpl : public Api::Granite {
public:
    LibsgranitesecuritypostsslSetuphtmlPostResponse handlePostForLibsgranitesecuritypostsslSetuphtml(const LibsgranitesecuritypostsslSetuphtmlPostRequest& params) override {
        // Access request parameters:
        // Query: params.m_keystorePassword
        // Query: params.m_keystorePasswordConfirm
        // Query: params.m_truststorePassword
        // Query: params.m_truststorePasswordConfirm
        // Query: params.m_httpsHostname
        // Query: params.m_httpsPort

        // Implement your business logic here


        // Or return error response (HTTP HTTP_RESPONSE_CODE_PRIMITIVE_STRING):
        // std::string errorResponse;
        // return errorResponse;
    }

};
```
#### Sling

Create a class that inherits from the generated base class:

```cpp
#include "api/SlingApi.h"

class SlingImpl : public Api::Sling {
public:
    void handleDeleteForEtcreplicationagentsrunmodename(const EtcreplicationagentsrunmodenameDeleteRequest& params) override {
        // Access request parameters from params struct
        // Implement your logic here
    }

    void handleDeleteForPathname(const PathnameDeleteRequest& params) override {
        // Access request parameters from params struct
        // Implement your logic here
    }

    void handleGetForEtcreplicationagentsrunmodename(const EtcreplicationagentsrunmodenameGetRequest& params) override {
        // Access request parameters from params struct
        // Implement your logic here
    }

    Etcreplicationagentsrunmode1jsonGetResponse handleGetForEtcreplicationagentsrunmode1json(const Etcreplicationagentsrunmode1jsonGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_runmode

        // Implement your business logic here


        // Or return error response (HTTP HTTP_RESPONSE_CODE_PRIMITIVE_STRING):
        // std::string errorResponse;
        // return errorResponse;
    }

    IntermediatePathauthorizableIdksjsonGetResponse handleGetForIntermediatePathauthorizableIdksjson(const IntermediatePathauthorizableIdksjsonGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_intermediatePath
        // Path: params.m_authorizableId

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_KEYSTORE_INFO):
        models::KeystoreInfo successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PRIMITIVE_STRING):
        // std::string errorResponse;
        // return errorResponse;
    }

    IntermediatePathauthorizableIdkeystorestorep12GetResponse handleGetForIntermediatePathauthorizableIdkeystorestorep12(const IntermediatePathauthorizableIdkeystorestorep12GetRequest& params) override {
        // Access request parameters:
        // Path: params.m_intermediatePath
        // Path: params.m_authorizableId

        // Implement your business logic here


        // Or return error response (HTTP HTTP_RESPONSE_CODE_PRIMITIVE_FILE):
        // std::string errorResponse;
        // return errorResponse;
    }

    void handleGetForPathname(const PathnameGetRequest& params) override {
        // Access request parameters from params struct
        // Implement your logic here
    }

    EtcpackagesgroupnameversionzipGetResponse handleGetForEtcpackagesgroupnameversionzip(const EtcpackagesgroupnameversionzipGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_group
        // Path: params.m_name
        // Path: params.m_version

        // Implement your business logic here


        // Or return error response (HTTP HTTP_RESPONSE_CODE_PRIMITIVE_FILE):
        // std::string errorResponse;
        // return errorResponse;
    }

    Etcpackagesgroupnameversionzipjcrcontentvltdefinitionfiltertidy2jsonGetResponse handleGetForEtcpackagesgroupnameversionzipjcrcontentvltdefinitionfiltertidy2json(const Etcpackagesgroupnameversionzipjcrcontentvltdefinitionfiltertidy2jsonGetRequest& params) override {
        // Access request parameters:
        // Path: params.m_group
        // Path: params.m_name
        // Path: params.m_version

        // Implement your business logic here


        // Or return error response (HTTP HTTP_RESPONSE_CODE_PRIMITIVE_STRING):
        // std::string errorResponse;
        // return errorResponse;
    }

    BinquerybuilderjsonGetResponse handleGetForBinquerybuilderjson(const BinquerybuilderjsonGetRequest& params) override {
        // Access request parameters:
        // Query: params.m_path
        // Query: params.m_pPeriodlimit
        // Query: params.m_r_1_property
        // Query: params.m_r_1_property_value

        // Implement your business logic here


        // Or return error response (HTTP HTTP_RESPONSE_CODE_PRIMITIVE_STRING):
        // std::string errorResponse;
        // return errorResponse;
    }

    Etctruststoretruststorep12getResponse handleGetForEtctruststoretruststorep12() override {

        // Implement your business logic here


        // Or return error response (HTTP HTTP_RESPONSE_CODE_PRIMITIVE_FILE):
        // std::string errorResponse;
        // return errorResponse;
    }

    LibsgranitesecuritytruststorejsonGetResponse handleGetForLibsgranitesecuritytruststorejson() override {

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_TRUSTSTORE_INFO):
        models::TruststoreInfo successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PRIMITIVE_STRING):
        // std::string errorResponse;
        // return errorResponse;
    }

    void handlePostForEtcreplicationagentsrunmodename(const EtcreplicationagentsrunmodenamePostRequest& params) override {
        // Access request parameters from params struct
        // Implement your logic here
    }

    IntermediatePathauthorizableIdkshtmlPostResponse handlePostForIntermediatePathauthorizableIdkshtml(const IntermediatePathauthorizableIdkshtmlPostRequest& params) override {
        // Access request parameters:
        // Path: params.m_intermediatePath
        // Path: params.m_authorizableId
        // Query: params.m_operation (optional)
        // Query: params.m_currentPassword (optional)
        // Query: params.m_newPassword (optional)
        // Query: params.m_rePassword (optional)
        // Query: params.m_keyPassword (optional)
        // Query: params.m_keyStorePass (optional)
        // Query: params.m_alias (optional)
        // Query: params.m_newAlias (optional)
        // Query: params.m_removeAlias (optional)

        // Implement your business logic here

        // Return success response (HTTP HTTP_RESPONSE_CODE_KEYSTORE_INFO):
        models::KeystoreInfo successResponse;
        // ... populate response ...
        return successResponse;

        // Or return error response (HTTP HTTP_RESPONSE_CODE_PRIMITIVE_STRING):
        // std::string errorResponse;
        // return errorResponse;
    }

    LibsgranitesecuritypostauthorizablesPostResponse handlePostForLibsgranitesecuritypostauthorizables(const LibsgranitesecuritypostauthorizablesPostRequest& params) override {
        // Access request parameters:
        // Query: params.m_authorizableId
        // Query: params.m_intermediatePath
        // Query: params.m_createUser (optional)
        // Query: params.m_createGroup (optional)
        // Query: params.m_repPassword (optional)
        // Query: params.m_profileSlashgivenName (optional)

        // Implement your business logic here


        // Or return error response (HTTP HTTP_RESPONSE_CODE_PRIMITIVE_STRING):
        // std::string errorResponse;
        // return errorResponse;
    }

    void handlePostForAppssystemconfigcomadobegraniteauthsamlsamlAuthenticationHandlerconfig(const AppssystemconfigcomadobegraniteauthsamlsamlAuthenticationHandlerconfigPostRequest& params) override {
        // Access request parameters from params struct
        // Implement your logic here
    }

    void handlePostForAppssystemconfigorgapachefelixhttp(const AppssystemconfigorgapachefelixhttpPostRequest& params) override {
        // Access request parameters from params struct
        // Implement your logic here
    }

    void handlePostForAppssystemconfigorgapachehttpproxyconfiguratorconfig(const AppssystemconfigorgapachehttpproxyconfiguratorconfigPostRequest& params) override {
        // Access request parameters from params struct
        // Implement your logic here
    }

    void handlePostForAppssystemconfigorgapacheslingjcrdaveximplservletsslingDavExServlet(const AppssystemconfigorgapacheslingjcrdaveximplservletsslingDavExServletPostRequest& params) override {
        // Access request parameters from params struct
        // Implement your logic here
    }

    void handlePostForAppssystemconfigorgapacheslingservletsgetdefaultGetServlet(const AppssystemconfigorgapacheslingservletsgetdefaultGetServletPostRequest& params) override {
        // Access request parameters from params struct
        // Implement your logic here
    }

    void handlePostForAppssystemconfigorgapacheslingsecurityimplreferrerFilter(const AppssystemconfigorgapacheslingsecurityimplreferrerFilterPostRequest& params) override {
        // Access request parameters from params struct
        // Implement your logic here
    }

    void handlePostForAppssystemconfigconfigNodeName(const AppssystemconfigconfigNodeNamePostRequest& params) override {
        // Access request parameters from params struct
        // Implement your logic here
    }

    void handlePostForPathname(const PathnamePostRequest& params) override {
        // Access request parameters from params struct
        // Implement your logic here
    }

    void handlePostForPathnamerwhtml(const PathnamerwhtmlPostRequest& params) override {
        // Access request parameters from params struct
        // Implement your logic here
    }

    void handlePostForPath(const PathPostRequest& params) override {
        // Access request parameters from params struct
        // Implement your logic here
    }

    BinquerybuilderjsonPostResponse handlePostForBinquerybuilderjson(const BinquerybuilderjsonPostRequest& params) override {
        // Access request parameters:
        // Query: params.m_path
        // Query: params.m_pPeriodlimit
        // Query: params.m_r_1_property
        // Query: params.m_r_1_property_value

        // Implement your business logic here


        // Or return error response (HTTP HTTP_RESPONSE_CODE_PRIMITIVE_STRING):
        // std::string errorResponse;
        // return errorResponse;
    }

    void handlePostForLibsreplicationtreeactivationhtml(const LibsreplicationtreeactivationhtmlPostRequest& params) override {
        // Access request parameters from params struct
        // Implement your logic here
    }

    LibsgranitesecurityposttruststorePostResponse handlePostForLibsgranitesecurityposttruststore(const LibsgranitesecurityposttruststorePostRequest& params) override {
        // Access request parameters:
        // Query: params.m_operation (optional)
        // Query: params.m_newPassword (optional)
        // Query: params.m_rePassword (optional)
        // Query: params.m_keyStoreType (optional)
        // Query: params.m_removeAlias (optional)

        // Implement your business logic here


        // Or return error response (HTTP HTTP_RESPONSE_CODE_PRIMITIVE_STRING):
        // std::string errorResponse;
        // return errorResponse;
    }

    EtctruststorePostResponse handlePostForEtctruststore() override {

        // Implement your business logic here


        // Or return error response (HTTP HTTP_RESPONSE_CODE_PRIMITIVE_STRING):
        // std::string errorResponse;
        // return errorResponse;
    }

};
```

## Running the Server

Here's a complete example of setting up and running the server:

```cpp
#include <httplib.h>
#include <memory>

#include "api/ConsoleApi.h"

#include "api/CqApi.h"

#include "api/CrxApi.h"

#include "api/CustomApi.h"

#include "api/GraniteApi.h"

#include "api/SlingApi.h"

#include "api/AuthenticationManager.h"

int main() {
    httplib::Server server;

    // Create authentication manager (required for this API)
    auto authMgr = std::make_shared<MyAuthManager>();

    // Create API implementations

    ConsoleImpl console;

    CqImpl cq;

    CrxImpl crx;

    CustomImpl custom;

    GraniteImpl granite;

    SlingImpl sling;


    // Register routes

    console.registerRoutes(server, authMgr);

    cq.registerRoutes(server, authMgr);

    crx.registerRoutes(server, authMgr);

    custom.registerRoutes(server, authMgr);

    granite.registerRoutes(server, authMgr);

    sling.registerRoutes(server, authMgr);


    // Start server
    std::cout << "Server starting on http://localhost:8080" << std::endl;
    server.listen("localhost", 8080);

    return 0;
}
```

### With Authentication

When authentication is required, you must:
1. Implement the `AuthenticationManager` interface (see Authentication section below)
2. Pass the authentication manager to `registerRoutes()`


## Authentication

This API requires authentication. Implement the `AuthenticationManager` interface to provide your authentication logic:

```cpp
#include "api/AuthenticationManager.h"

class MyAuthManager : public Api::AuthenticationManager {
public:
    bool validateApiKey(const std::string& key) override {
        // Validate API key from header, query, or cookie
        // Example: check against database or cache
        return checkApiKeyInDatabase(key);
    }

    bool validateBearerToken(const std::string& token) override {
        // Validate JWT or other bearer tokens
        // Example: verify signature and expiration
        return jwt::verify(token, secret_key);
    }

    bool validateBasicAuth(const std::string& username, const std::string& password) override {
        // Validate username/password credentials
        // Example: check against user database with hashed passwords
        auto user = findUser(username);
        return user && bcrypt::verify(password, user->passwordHash);
    }

    bool validateOAuth2(const std::string& token, const std::vector<std::string>& scopes) override {
        // Validate OAuth2 token and check required scopes
        // Example: introspect token and verify scopes
        auto introspection = oauthProvider.introspect(token);
        return introspection.active && hasAllScopes(introspection.scopes, scopes);
    }
};
```

### Authentication Flow

1. The server automatically extracts credentials from requests (headers, query params, cookies)
2. Before calling your handler, it validates credentials using your `AuthenticationManager`
3. If validation fails, the server returns HTTP 401 Unauthorized automatically
4. If validation succeeds, your handler is called

### Security Schemes

The generated code supports:
- **API Key**: Header, query parameter, or cookie-based authentication
- **Bearer Token**: Authorization header with "Bearer" scheme (e.g., JWT)
- **Basic Auth**: HTTP Basic authentication (username:password)
- **OAuth2**: OAuth 2.0 token-based authentication with scope validation


## Error Handling

### Response Variants

Each API endpoint that returns data uses `std::variant` to represent multiple possible response types (success and errors):

```cpp
// Example: endpoint returns success (User) or errors (NotFound, ServerError)
using GetUserResponse = std::variant<User, NotFound, ServerError>;

GetUserResponse handleGetUser(const GetUserRequest& params) override {
    if (userExists(params.m_userId)) {
        User user = fetchUser(params.m_userId);
        return user;  // Automatically sets HTTP 200
    } else {
        NotFound error;
        error.setMessage("User not found");
        return error;  // Automatically sets HTTP 404
    }
}
```

The server automatically:
- Detects which type is returned from the variant
- Sets the appropriate HTTP status code
- Serializes the response to JSON

### HTTP Status Codes

Status codes are automatically set based on the response type you return. Each model type is associated with a specific HTTP status code defined in your OpenAPI specification.

**Optimized Status Code Constants:**
The generator only creates HTTP status code constants (e.g., `HTTP_RESPONSE_CODE_200`, `HTTP_RESPONSE_CODE_404`) for codes actually used by your API operations. This reduces code bloat and compilation time compared to generating all possible HTTP status codes.

### Parameter Validation

The generated code automatically validates:
- **Required parameters**: Returns HTTP 400 if missing
- **Type conversion**: Returns HTTP 400 if parameter cannot be converted to expected type
- **JSON parsing**: Returns HTTP 400 if request body is invalid JSON

Custom validation logic should be implemented in your handler methods.

### Working with Optional Parameters

Optional parameters and model fields use `std::optional`:

```cpp
void handleRequest(const RequestParams& params) override {
    // Check if optional query parameter is present
    if (params.m_optionalParam) {
        auto value = *params.m_optionalParam;  // Dereference to get value
        // Use value...
    }

    // Check if optional request body is present
    if (params.m_request) {
        auto body = *params.m_request;  // Dereference to get body
        // Use body...
    }
}
```

## Advanced Features

### Parameter Serialization Styles

The generator supports various parameter serialization styles as defined in OpenAPI:

- **simple**: Comma-separated values (default for path/header)
- **form**: Ampersand-separated values (default for query)
- **spaceDelimited**: Space-separated values
- **pipeDelimited**: Pipe-separated values
- **deepObject**: Nested object notation for query parameters

These are automatically handled during parameter parsing.

### Enum Handling

All generated enums automatically include an `UNSPECIFIED` value as the first enum entry for safe initialization:

```cpp
enum class Status {
    UNSPECIFIED = 0,  // Added automatically for safety
    PENDING,
    APPROVED,
    REJECTED
};

// Safe default initialization
Status status;  // Defaults to UNSPECIFIED (0)

// Explicit initialization
Status activeStatus = Status::APPROVED;

// Enum serialization/deserialization
// UNSPECIFIED is not a valid API value and indicates uninitialized state
```

**Why UNSPECIFIED?**
- Provides a safe default value for uninitialized enums
- Prevents undefined behavior from using uninitialized enum values
- Makes it clear when an enum hasn't been set vs. having a valid API value
- Does not appear in OpenAPI spec - internal C++ implementation detail

### Union Types (anyOf/oneOf)

When your OpenAPI spec uses `anyOf` or `oneOf`, the generated code uses `std::variant`:

```cpp
// OpenAPI: { "anyOf": [{"type": "string"}, {"type": "number"}] }
using MyUnionType = std::variant<std::string, double>;

// In your model:
MyUnionType value;

// Use std::visit to handle different types:
std::visit([](const auto& v) {
    using T = std::decay_t<decltype(v)>;
    if constexpr (std::is_same_v<T, std::string>) {
        std::cout << "String: " << v << std::endl;
    } else if constexpr (std::is_same_v<T, double>) {
        std::cout << "Number: " << v << std::endl;
    }
}, value);
```

## Additional Resources

- [cpp-httplib Documentation](https://github.com/yhirose/cpp-httplib)
- [nlohmann/json Documentation](https://github.com/nlohmann/json)
- [OpenAPI Generator Documentation](https://openapi-generator.tech/docs/generators/cpp-httplib-server)
- [OpenAPI Specification](https://swagger.io/specification/)

- [cpp-httplib Documentation](https://github.com/yhirose/cpp-httplib)
- [nlohmann/json Documentation](https://github.com/nlohmann/json)
- [OpenAPI Generator Documentation](https://openapi-generator.tech/docs/generators/)
