
#include "TruststoreItems.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_TruststoreItems_alias_is_assigned_from_json()
{


    bourne::json input =
    {
        "alias", "hello"
    };

    TruststoreItems obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAlias().c_str());






}


void test_TruststoreItems_entryType_is_assigned_from_json()
{


    bourne::json input =
    {
        "entryType", "hello"
    };

    TruststoreItems obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getEntryType().c_str());






}


void test_TruststoreItems_subject_is_assigned_from_json()
{


    bourne::json input =
    {
        "subject", "hello"
    };

    TruststoreItems obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getSubject().c_str());






}


void test_TruststoreItems_issuer_is_assigned_from_json()
{


    bourne::json input =
    {
        "issuer", "hello"
    };

    TruststoreItems obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getIssuer().c_str());






}


void test_TruststoreItems_notBefore_is_assigned_from_json()
{


    bourne::json input =
    {
        "notBefore", "hello"
    };

    TruststoreItems obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getNotBefore().c_str());






}


void test_TruststoreItems_notAfter_is_assigned_from_json()
{


    bourne::json input =
    {
        "notAfter", "hello"
    };

    TruststoreItems obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getNotAfter().c_str());






}


void test_TruststoreItems_serialNumber_is_assigned_from_json()
{
    bourne::json input =
    {
        "serialNumber", 1
    };

    TruststoreItems obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getSerialNumber());








}



void test_TruststoreItems_alias_is_converted_to_json()
{

    bourne::json input =
    {
        "alias", "hello"
    };

    TruststoreItems obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["alias"] == output["alias"]);



}


void test_TruststoreItems_entryType_is_converted_to_json()
{

    bourne::json input =
    {
        "entryType", "hello"
    };

    TruststoreItems obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["entryType"] == output["entryType"]);



}


void test_TruststoreItems_subject_is_converted_to_json()
{

    bourne::json input =
    {
        "subject", "hello"
    };

    TruststoreItems obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["subject"] == output["subject"]);



}


void test_TruststoreItems_issuer_is_converted_to_json()
{

    bourne::json input =
    {
        "issuer", "hello"
    };

    TruststoreItems obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["issuer"] == output["issuer"]);



}


void test_TruststoreItems_notBefore_is_converted_to_json()
{

    bourne::json input =
    {
        "notBefore", "hello"
    };

    TruststoreItems obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["notBefore"] == output["notBefore"]);



}


void test_TruststoreItems_notAfter_is_converted_to_json()
{

    bourne::json input =
    {
        "notAfter", "hello"
    };

    TruststoreItems obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["notAfter"] == output["notAfter"]);



}


void test_TruststoreItems_serialNumber_is_converted_to_json()
{
    bourne::json input =
    {
        "serialNumber", 1
    };

    TruststoreItems obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["serialNumber"] == output["serialNumber"]);




}


