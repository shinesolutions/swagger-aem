
#include "KeystoreItems.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_KeystoreItems_alias_is_assigned_from_json()
{


    bourne::json input =
    {
        "alias", "hello"
    };

    KeystoreItems obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAlias().c_str());






}


void test_KeystoreItems_entryType_is_assigned_from_json()
{


    bourne::json input =
    {
        "entryType", "hello"
    };

    KeystoreItems obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getEntryType().c_str());






}


void test_KeystoreItems_algorithm_is_assigned_from_json()
{


    bourne::json input =
    {
        "algorithm", "hello"
    };

    KeystoreItems obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAlgorithm().c_str());






}


void test_KeystoreItems_format_is_assigned_from_json()
{


    bourne::json input =
    {
        "format", "hello"
    };

    KeystoreItems obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getFormat().c_str());






}




void test_KeystoreItems_alias_is_converted_to_json()
{

    bourne::json input =
    {
        "alias", "hello"
    };

    KeystoreItems obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["alias"] == output["alias"]);



}


void test_KeystoreItems_entryType_is_converted_to_json()
{

    bourne::json input =
    {
        "entryType", "hello"
    };

    KeystoreItems obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["entryType"] == output["entryType"]);



}


void test_KeystoreItems_algorithm_is_converted_to_json()
{

    bourne::json input =
    {
        "algorithm", "hello"
    };

    KeystoreItems obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["algorithm"] == output["algorithm"]);



}


void test_KeystoreItems_format_is_converted_to_json()
{

    bourne::json input =
    {
        "format", "hello"
    };

    KeystoreItems obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["format"] == output["format"]);



}



