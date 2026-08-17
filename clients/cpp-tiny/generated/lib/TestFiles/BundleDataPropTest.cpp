
#include "BundleDataProp.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_BundleDataProp_key_is_assigned_from_json()
{


    bourne::json input =
    {
        "key", "hello"
    };

    BundleDataProp obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getKey().c_str());






}


void test_BundleDataProp_value_is_assigned_from_json()
{


    bourne::json input =
    {
        "value", "hello"
    };

    BundleDataProp obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getValue().c_str());






}



void test_BundleDataProp_key_is_converted_to_json()
{

    bourne::json input =
    {
        "key", "hello"
    };

    BundleDataProp obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["key"] == output["key"]);



}


void test_BundleDataProp_value_is_converted_to_json()
{

    bourne::json input =
    {
        "value", "hello"
    };

    BundleDataProp obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["value"] == output["value"]);



}


