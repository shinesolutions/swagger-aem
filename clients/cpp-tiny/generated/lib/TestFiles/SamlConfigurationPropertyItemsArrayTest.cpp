
#include "SamlConfigurationPropertyItemsArray.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_SamlConfigurationPropertyItemsArray_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "name", "hello"
    };

    SamlConfigurationPropertyItemsArray obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}


void test_SamlConfigurationPropertyItemsArray_optional_is_assigned_from_json()
{




    bourne::json input =
    {
        "optional", true
    };

    SamlConfigurationPropertyItemsArray obj(input.dump());

    TEST_ASSERT(true == obj.isOptional());




}


void test_SamlConfigurationPropertyItemsArray_is_set_is_assigned_from_json()
{




    bourne::json input =
    {
        "is_set", true
    };

    SamlConfigurationPropertyItemsArray obj(input.dump());

    TEST_ASSERT(true == obj.isIsSet());




}


void test_SamlConfigurationPropertyItemsArray_type_is_assigned_from_json()
{
    bourne::json input =
    {
        "type", 1
    };

    SamlConfigurationPropertyItemsArray obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getType());








}



void test_SamlConfigurationPropertyItemsArray_description_is_assigned_from_json()
{


    bourne::json input =
    {
        "description", "hello"
    };

    SamlConfigurationPropertyItemsArray obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getDescription().c_str());






}



void test_SamlConfigurationPropertyItemsArray_name_is_converted_to_json()
{

    bourne::json input =
    {
        "name", "hello"
    };

    SamlConfigurationPropertyItemsArray obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}


void test_SamlConfigurationPropertyItemsArray_optional_is_converted_to_json()
{


    bourne::json input =
    {
        "optional", true
    };

    SamlConfigurationPropertyItemsArray obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["optional"] == output["optional"]);


}


void test_SamlConfigurationPropertyItemsArray_is_set_is_converted_to_json()
{


    bourne::json input =
    {
        "is_set", true
    };

    SamlConfigurationPropertyItemsArray obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["is_set"] == output["is_set"]);


}


void test_SamlConfigurationPropertyItemsArray_type_is_converted_to_json()
{
    bourne::json input =
    {
        "type", 1
    };

    SamlConfigurationPropertyItemsArray obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["type"] == output["type"]);




}



void test_SamlConfigurationPropertyItemsArray_description_is_converted_to_json()
{

    bourne::json input =
    {
        "description", "hello"
    };

    SamlConfigurationPropertyItemsArray obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["description"] == output["description"]);



}


