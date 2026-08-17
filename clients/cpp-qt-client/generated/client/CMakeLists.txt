cmake_minimum_required(VERSION 3.5)

project(QtOpenAPIClient)

set(CMAKE_AUTOMOC ON)

find_package(QT NAMES Qt6 Qt5 REQUIRED COMPONENTS Core Network Gui)
find_package(Qt${QT_VERSION_MAJOR} REQUIRED COMPONENTS Core Network Gui)

include(GNUInstallDirs)
include(CMakePackageConfigHelpers)

add_library(${PROJECT_NAME}
  OAIBundleData.h
  OAIBundleDataProp.h
  OAIBundleInfo.h
  OAIInstallStatus.h
  OAIInstallStatus_status.h
  OAIKeystoreChainItems.h
  OAIKeystoreInfo.h
  OAIKeystoreItems.h
  OAISamlConfigurationInfo.h
  OAISamlConfigurationProperties.h
  OAISamlConfigurationPropertyItemsArray.h
  OAISamlConfigurationPropertyItemsBoolean.h
  OAISamlConfigurationPropertyItemsLong.h
  OAISamlConfigurationPropertyItemsString.h
  OAITruststoreInfo.h
  OAITruststoreItems.h
  OAIConsoleApi.h
  OAICqApi.h
  OAICrxApi.h
  OAICustomApi.h
  OAIGraniteApi.h
  OAISlingApi.h
  OAIHelpers.h
  OAIHttpRequest.h
  OAIObject.h
  OAIEnum.h
  OAIHttpFileElement.h
  OAIServerConfiguration.h
  OAIServerVariable.h
  OAIOauth.h
  OAIBundleData.cpp
  OAIBundleDataProp.cpp
  OAIBundleInfo.cpp
  OAIInstallStatus.cpp
  OAIInstallStatus_status.cpp
  OAIKeystoreChainItems.cpp
  OAIKeystoreInfo.cpp
  OAIKeystoreItems.cpp
  OAISamlConfigurationInfo.cpp
  OAISamlConfigurationProperties.cpp
  OAISamlConfigurationPropertyItemsArray.cpp
  OAISamlConfigurationPropertyItemsBoolean.cpp
  OAISamlConfigurationPropertyItemsLong.cpp
  OAISamlConfigurationPropertyItemsString.cpp
  OAITruststoreInfo.cpp
  OAITruststoreItems.cpp
  OAIConsoleApi.cpp
  OAICqApi.cpp
  OAICrxApi.cpp
  OAICustomApi.cpp
  OAIGraniteApi.cpp
  OAISlingApi.cpp
  OAIHelpers.cpp
  OAIHttpRequest.cpp
  OAIHttpFileElement.cpp
  OAIOauth.cpp
  )

target_include_directories(${PROJECT_NAME}
    PUBLIC
        $<BUILD_INTERFACE:${CMAKE_CURRENT_SOURCE_DIR}>
        $<INSTALL_INTERFACE:${CMAKE_INSTALL_INCLUDEDIR}>
)

target_link_libraries(${PROJECT_NAME}
    PUBLIC
        Qt${QT_VERSION_MAJOR}::Core
        Qt${QT_VERSION_MAJOR}::Network
        Qt${QT_VERSION_MAJOR}::Gui

)

configure_package_config_file(${CMAKE_CURRENT_SOURCE_DIR}/Config.cmake.in
    "${CMAKE_CURRENT_BINARY_DIR}/${PROJECT_NAME}Config.cmake"
    INSTALL_DESTINATION "${CMAKE_INSTALL_LIBDIR}/cmake/${PROJECT_NAME}"
)

install(
    TARGETS ${PROJECT_NAME}
    EXPORT ${PROJECT_NAME}Targets
    LIBRARY DESTINATION "${CMAKE_INSTALL_LIBDIR}"
    ARCHIVE DESTINATION "${CMAKE_INSTALL_LIBDIR}"
    RUNTIME DESTINATION "${CMAKE_INSTALL_BINDIR}"
    INCLUDES DESTINATION "${CMAKE_INSTALL_INCLUDEDIR}/${PROJECT_NAME}"
)

install(
    FILES ${HEADER_FILES}
    DESTINATION ${CMAKE_INSTALL_INCLUDEDIR}/${PROJECT_NAME}
)

install(
    FILES "${CMAKE_CURRENT_BINARY_DIR}/${PROJECT_NAME}Config.cmake"
    DESTINATION ${CMAKE_INSTALL_LIBDIR}/cmake/${PROJECT_NAME}
)

install(
    EXPORT ${PROJECT_NAME}Targets
    DESTINATION ${CMAKE_INSTALL_LIBDIR}/cmake/${PROJECT_NAME}
)
