QT += network

HEADERS += \
# Models
    $${PWD}/OAIBundleData.h \
    $${PWD}/OAIBundleDataProp.h \
    $${PWD}/OAIBundleInfo.h \
    $${PWD}/OAIInstallStatus.h \
    $${PWD}/OAIInstallStatus_status.h \
    $${PWD}/OAIKeystoreChainItems.h \
    $${PWD}/OAIKeystoreInfo.h \
    $${PWD}/OAIKeystoreItems.h \
    $${PWD}/OAISamlConfigurationInfo.h \
    $${PWD}/OAISamlConfigurationProperties.h \
    $${PWD}/OAISamlConfigurationPropertyItemsArray.h \
    $${PWD}/OAISamlConfigurationPropertyItemsBoolean.h \
    $${PWD}/OAISamlConfigurationPropertyItemsLong.h \
    $${PWD}/OAISamlConfigurationPropertyItemsString.h \
    $${PWD}/OAITruststoreInfo.h \
    $${PWD}/OAITruststoreItems.h \
# APIs
    $${PWD}/OAIConsoleApi.h \
    $${PWD}/OAICqApi.h \
    $${PWD}/OAICrxApi.h \
    $${PWD}/OAICustomApi.h \
    $${PWD}/OAIGraniteApi.h \
    $${PWD}/OAISlingApi.h \
# Others
    $${PWD}/OAIHelpers.h \
    $${PWD}/OAIHttpRequest.h \
    $${PWD}/OAIObject.h \
    $${PWD}/OAIEnum.h \
    $${PWD}/OAIHttpFileElement.h \
    $${PWD}/OAIServerConfiguration.h \
    $${PWD}/OAIServerVariable.h \
    $${PWD}/OAIOauth.h

SOURCES += \
# Models
    $${PWD}/OAIBundleData.cpp \
    $${PWD}/OAIBundleDataProp.cpp \
    $${PWD}/OAIBundleInfo.cpp \
    $${PWD}/OAIInstallStatus.cpp \
    $${PWD}/OAIInstallStatus_status.cpp \
    $${PWD}/OAIKeystoreChainItems.cpp \
    $${PWD}/OAIKeystoreInfo.cpp \
    $${PWD}/OAIKeystoreItems.cpp \
    $${PWD}/OAISamlConfigurationInfo.cpp \
    $${PWD}/OAISamlConfigurationProperties.cpp \
    $${PWD}/OAISamlConfigurationPropertyItemsArray.cpp \
    $${PWD}/OAISamlConfigurationPropertyItemsBoolean.cpp \
    $${PWD}/OAISamlConfigurationPropertyItemsLong.cpp \
    $${PWD}/OAISamlConfigurationPropertyItemsString.cpp \
    $${PWD}/OAITruststoreInfo.cpp \
    $${PWD}/OAITruststoreItems.cpp \
# APIs
    $${PWD}/OAIConsoleApi.cpp \
    $${PWD}/OAICqApi.cpp \
    $${PWD}/OAICrxApi.cpp \
    $${PWD}/OAICustomApi.cpp \
    $${PWD}/OAIGraniteApi.cpp \
    $${PWD}/OAISlingApi.cpp \
# Others
    $${PWD}/OAIHelpers.cpp \
    $${PWD}/OAIHttpRequest.cpp \
    $${PWD}/OAIHttpFileElement.cpp \
    $${PWD}/OAIOauth.cpp
