
#include "SamlConfigurationPropertyItemsBoolean.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_SamlConfigurationPropertyItemsBoolean_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "name", "hello"
    };

    SamlConfigurationPropertyItemsBoolean obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}


void test_SamlConfigurationPropertyItemsBoolean_optional_is_assigned_from_json()
{




    bourne::json input =
    {
        "optional", true
    };

    SamlConfigurationPropertyItemsBoolean obj(input.dump());

    TEST_ASSERT(true == obj.isOptional());




}


void test_SamlConfigurationPropertyItemsBoolean_is_set_is_assigned_from_json()
{




    bourne::json input =
    {
        "is_set", true
    };

    SamlConfigurationPropertyItemsBoolean obj(input.dump());

    TEST_ASSERT(true == obj.isIsSet());




}


void test_SamlConfigurationPropertyItemsBoolean_type_is_assigned_from_json()
{
    bourne::json input =
    {
        "type", 1
    };

    SamlConfigurationPropertyItemsBoolean obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getType());








}


void test_SamlConfigurationPropertyItemsBoolean_value_is_assigned_from_json()
{




    bourne::json input =
    {
        "value", true
    };

    SamlConfigurationPropertyItemsBoolean obj(input.dump());

    TEST_ASSERT(true == obj.isValue());




}


void test_SamlConfigurationPropertyItemsBoolean_description_is_assigned_from_json()
{


    bourne::json input =
    {
        "description", "hello"
    };

    SamlConfigurationPropertyItemsBoolean obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getDescription().c_str());






}



void test_SamlConfigurationPropertyItemsBoolean_name_is_converted_to_json()
{

    bourne::json input =
    {
        "name", "hello"
    };

    SamlConfigurationPropertyItemsBoolean obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}


void test_SamlConfigurationPropertyItemsBoolean_optional_is_converted_to_json()
{


    bourne::json input =
    {
        "optional", true
    };

    SamlConfigurationPropertyItemsBoolean obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["optional"] == output["optional"]);


}


void test_SamlConfigurationPropertyItemsBoolean_is_set_is_converted_to_json()
{


    bourne::json input =
    {
        "is_set", true
    };

    SamlConfigurationPropertyItemsBoolean obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["is_set"] == output["is_set"]);


}


void test_SamlConfigurationPropertyItemsBoolean_type_is_converted_to_json()
{
    bourne::json input =
    {
        "type", 1
    };

    SamlConfigurationPropertyItemsBoolean obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["type"] == output["type"]);




}


void test_SamlConfigurationPropertyItemsBoolean_value_is_converted_to_json()
{


    bourne::json input =
    {
        "value", true
    };

    SamlConfigurationPropertyItemsBoolean obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["value"] == output["value"]);


}


void test_SamlConfigurationPropertyItemsBoolean_description_is_converted_to_json()
{

    bourne::json input =
    {
        "description", "hello"
    };

    SamlConfigurationPropertyItemsBoolean obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["description"] == output["description"]);



}


