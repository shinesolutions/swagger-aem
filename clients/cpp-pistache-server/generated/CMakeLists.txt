cmake_minimum_required (VERSION 3.2)

project(server)

set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -std=c++11 -pg -g3" )

include(ExternalProject)

set(EXTERNAL_INSTALL_LOCATION ${CMAKE_CURRENT_SOURCE_DIR}/external)

ExternalProject_Add(PISTACHE
    GIT_REPOSITORY https://github.com/oktal/pistache.git
    CMAKE_ARGS -DCMAKE_INSTALL_PREFIX=${EXTERNAL_INSTALL_LOCATION}
)

ExternalProject_Add(NLOHMANN
    GIT_REPOSITORY https://github.com/nlohmann/json.git
    CMAKE_ARGS -DCMAKE_INSTALL_PREFIX=${EXTERNAL_INSTALL_LOCATION}

)
include_directories(${EXTERNAL_INSTALL_LOCATION}/include)
include_directories(${EXTERNAL_INSTALL_LOCATION}/include/nlohmann)
link_directories(${EXTERNAL_INSTALL_LOCATION}/lib)

link_directories(/usr/local/lib/)

aux_source_directory(model MODEL_SOURCES)
file(GLOB CONSOLE_API_SOURCES
"api/ConsoleApi.h"
"api/ConsoleApi.cpp"
"impl/ConsoleApiImpl.h"
"impl/ConsoleApiImpl.cpp"
)
file(GLOB CQ_API_SOURCES
"api/CqApi.h"
"api/CqApi.cpp"
"impl/CqApiImpl.h"
"impl/CqApiImpl.cpp"
)
file(GLOB CRX_API_SOURCES
"api/CrxApi.h"
"api/CrxApi.cpp"
"impl/CrxApiImpl.h"
"impl/CrxApiImpl.cpp"
)
file(GLOB CUSTOM_API_SOURCES
"api/CustomApi.h"
"api/CustomApi.cpp"
"impl/CustomApiImpl.h"
"impl/CustomApiImpl.cpp"
)
file(GLOB SLING_API_SOURCES
"api/SlingApi.h"
"api/SlingApi.cpp"
"impl/SlingApiImpl.h"
"impl/SlingApiImpl.cpp"
)

include_directories(model)
include_directories(api)
include_directories(impl)

set(CONSOLE_API_SERVER_SOURCES
ConsoleApiMainServer.cpp
    ${MODEL_SOURCES}
    ${CONSOLE_API_SOURCES})
set(CQ_API_SERVER_SOURCES
CqApiMainServer.cpp
    ${MODEL_SOURCES}
    ${CQ_API_SOURCES})
set(CRX_API_SERVER_SOURCES
CrxApiMainServer.cpp
    ${MODEL_SOURCES}
    ${CRX_API_SOURCES})
set(CUSTOM_API_SERVER_SOURCES
CustomApiMainServer.cpp
    ${MODEL_SOURCES}
    ${CUSTOM_API_SOURCES})
set(SLING_API_SERVER_SOURCES
SlingApiMainServer.cpp
    ${MODEL_SOURCES}
    ${SLING_API_SOURCES})

add_executable(console_api_server
${CONSOLE_API_SERVER_SOURCES})
add_executable(cq_api_server
${CQ_API_SERVER_SOURCES})
add_executable(crx_api_server
${CRX_API_SERVER_SOURCES})
add_executable(custom_api_server
${CUSTOM_API_SERVER_SOURCES})
add_executable(sling_api_server
${SLING_API_SERVER_SOURCES})

target_link_libraries(console_api_server pistache pthread)
target_link_libraries(cq_api_server pistache pthread)
target_link_libraries(crx_api_server pistache pthread)
target_link_libraries(custom_api_server pistache pthread)
target_link_libraries(sling_api_server pistache pthread)

