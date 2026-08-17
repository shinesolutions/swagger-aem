
#include "BundleData.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_BundleData_id_is_assigned_from_json()
{
    bourne::json input =
    {
        "id", 1
    };

    BundleData obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getId());








}


void test_BundleData_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "name", "hello"
    };

    BundleData obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}


void test_BundleData_fragment_is_assigned_from_json()
{




    bourne::json input =
    {
        "fragment", true
    };

    BundleData obj(input.dump());

    TEST_ASSERT(true == obj.isFragment());




}


void test_BundleData_stateRaw_is_assigned_from_json()
{
    bourne::json input =
    {
        "stateRaw", 1
    };

    BundleData obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getStateRaw());








}


void test_BundleData_state_is_assigned_from_json()
{


    bourne::json input =
    {
        "state", "hello"
    };

    BundleData obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getState().c_str());






}


void test_BundleData_version_is_assigned_from_json()
{


    bourne::json input =
    {
        "version", "hello"
    };

    BundleData obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getVersion().c_str());






}


void test_BundleData_symbolicName_is_assigned_from_json()
{


    bourne::json input =
    {
        "symbolicName", "hello"
    };

    BundleData obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getSymbolicName().c_str());






}


void test_BundleData_category_is_assigned_from_json()
{


    bourne::json input =
    {
        "category", "hello"
    };

    BundleData obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCategory().c_str());






}




void test_BundleData_id_is_converted_to_json()
{
    bourne::json input =
    {
        "id", 1
    };

    BundleData obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);




}


void test_BundleData_name_is_converted_to_json()
{

    bourne::json input =
    {
        "name", "hello"
    };

    BundleData obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}


void test_BundleData_fragment_is_converted_to_json()
{


    bourne::json input =
    {
        "fragment", true
    };

    BundleData obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["fragment"] == output["fragment"]);


}


void test_BundleData_stateRaw_is_converted_to_json()
{
    bourne::json input =
    {
        "stateRaw", 1
    };

    BundleData obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["stateRaw"] == output["stateRaw"]);




}


void test_BundleData_state_is_converted_to_json()
{

    bourne::json input =
    {
        "state", "hello"
    };

    BundleData obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["state"] == output["state"]);



}


void test_BundleData_version_is_converted_to_json()
{

    bourne::json input =
    {
        "version", "hello"
    };

    BundleData obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["version"] == output["version"]);



}


void test_BundleData_symbolicName_is_converted_to_json()
{

    bourne::json input =
    {
        "symbolicName", "hello"
    };

    BundleData obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["symbolicName"] == output["symbolicName"]);



}


void test_BundleData_category_is_converted_to_json()
{

    bourne::json input =
    {
        "category", "hello"
    };

    BundleData obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["category"] == output["category"]);



}



